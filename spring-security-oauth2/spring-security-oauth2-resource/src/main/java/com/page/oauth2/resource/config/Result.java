package com.page.oauth2.resource.config;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用的返回对象
 * <p>Title: Result</p>
 * 
 * @author penghe.yu
 * @date 2019-07-05 15:14
 * @package com.page.oauth2.resource.config
 */
@Data
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 8486468806063544444L;
    /**
     * 状态码
     */
    private Integer state;

    /**
     * 消息
     */
    private String message;

    /**
     * 返回对象
     */
    private T data;

    public Result() {
        super();
    }

    public Result(Integer state) {
        super();
        this.state = state;
    }

    public Result(Integer state, String message) {
        super();
        this.state = state;
        this.message = message;
    }

    public Result(Integer state, Throwable throwable) {
        super();
        this.state = state;
        this.message = throwable.getMessage();
    }

    public Result(Integer state, T data) {
        super();
        this.state = state;
        this.data = data;
    }

    public Result(Integer state, String message, T data) {
        super();
        this.state = state;
        this.message = message;
        this.data = data;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((message == null) ? 0 : message.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Result<?> other = (Result<?>) obj;
        if (data == null) {
            if (other.data != null) {
                return false;
            }
        } else if (!data.equals(other.data)) {
            return false;
        }
        if (message == null) {
            if (other.message != null) {
                return false;
            }
        } else if (!message.equals(other.message)) {
            return false;
        }
        if (state == null) {
            if (other.state != null) {
                return false;
            }
        } else if (!state.equals(other.state)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Result [state=" + state + ", message=" + message + ", data=" + data + "]";
    }
}
