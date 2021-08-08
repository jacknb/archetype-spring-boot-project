package com.archetype.project.common;

import org.springframework.boot.logging.LogLevel;

/**
 * 返回码枚举
 *
 * @author: Think
 * @date: 2021/8/8
 */
public enum BizCode {

    SUCCESS("0000", "返回成功", LogLevel.INFO);

    private String code;

    private String message;

    private LogLevel logLevel;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    BizCode(String code, String message, LogLevel logLevel) {
        this.code = code;
        this.message = message;
        this.logLevel = logLevel;
    }
}
