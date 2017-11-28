package ru.epam.spring.hometask.common;

public class SpringException extends RuntimeException {

    private String errorCode;
    private String exceptionMsg;

    public SpringException(String errorCode, String exceptionMsg) {
        this.errorCode = errorCode;
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg() {
        return this.exceptionMsg;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
