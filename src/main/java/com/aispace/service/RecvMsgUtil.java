package com.aispace.service;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

/**
 * @author kangmoo Heo
 */
@Slf4j
public class RecvMsgUtil {
    private static final RecvMsgUtil INSTANCE = new RecvMsgUtil();

    String recentRecvMsg;
    @Getter
    String recentTid = "";

    private RecvMsgUtil() {
    }

    public static RecvMsgUtil getInstance() {
        return INSTANCE;
    }

    public void setRecentRecvMsg(String recentRecvMsg) {
        this.recentRecvMsg = recentRecvMsg;
        this.recentTid = findFieldRecursive(recentRecvMsg, "TransactionId").map(JsonElement::getAsString).orElse(recentTid);
    }

    public static Optional<JsonElement> findFieldRecursive(String json, String targetFieldName) {
        return findFieldRecursive(JsonParser.parseString(json), targetFieldName);

    }

    public static Optional<JsonElement> findFieldRecursive(JsonElement element, String targetFieldName) {
        if (element.isJsonObject()) {
            JsonObject jsonObject = element.getAsJsonObject();
            if (jsonObject.has(targetFieldName)) {
                return Optional.of(jsonObject.get(targetFieldName));
            }
            for (String key : jsonObject.keySet()) {
                JsonElement childElement = jsonObject.get(key);
                JsonElement result = findFieldRecursive(childElement, targetFieldName).orElse(null);
                if (result != null) {
                    return Optional.of(result);
                }
            }
        } else if (element.isJsonArray()) {
            for (JsonElement arrayElement : element.getAsJsonArray()) {
                JsonElement result = findFieldRecursive(arrayElement, targetFieldName).orElse(null);
                if (result != null) {
                    return Optional.of(result);
                }
            }
        }
        // 필드를 찾지 못한 경우 null 반환
        return Optional.empty();
    }
}
