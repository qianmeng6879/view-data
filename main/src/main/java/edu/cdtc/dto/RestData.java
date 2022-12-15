package edu.cdtc.dto;

/**
 * @author zero
 * @email qianmeng6879@163.com
 * @since 2022/12/14
 */
public class RestData {
    private Integer code;
    private Object data;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
