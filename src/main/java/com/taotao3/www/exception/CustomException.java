package com.taotao3.www.exception;

/**
 * Created by Administrator on 2019/2/11.
 */
public class CustomException extends Exception{

    private String message;

    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
