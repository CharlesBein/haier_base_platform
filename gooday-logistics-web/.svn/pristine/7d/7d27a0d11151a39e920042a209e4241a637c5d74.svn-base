package cn.gooday.logistics.web.common.vo;

import com.fasterxml.jackson.annotation.JsonView;

import java.io.Serializable;

/**
 * @author zhangsg
 */
public class JsonResult<T> implements Serializable {
    public static interface ErrorView {}
    public static interface NormalView extends ErrorView {}
    /**
     *
     */
    private static final long serialVersionUID = 3863559687276427577L;

    @JsonView(ErrorView.class)
    private boolean success = true;

    @JsonView(NormalView.class)
    private T data;//数据

    @JsonView(NormalView.class)
    private String secure;//安全数据

    @JsonView(ErrorView.class)
    public String message;

    public JsonResult() {
    }

    public JsonResult(T data, Boolean success, String message) {
        // TODO Auto-generated constructor stub
        this.data = data;
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static <T> JsonResult<T> newResult() {

        return new JsonResult<T>();
    }

    public String getSecure() {
        return secure;
    }

    public void setSecure(String secure) {
        this.secure = secure;
    }
}
