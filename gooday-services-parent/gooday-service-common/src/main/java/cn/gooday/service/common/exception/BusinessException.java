package cn.gooday.service.common.exception;

public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = -418389432305176131L;

    public BusinessException() {
        // TODO Auto-generated constructor stub
    }

    public BusinessException(String message) {//{errorCode:00001,message:"kdjaeie"}
        super(message);
        // TODO Auto-generated constructor stub
    }

    public BusinessException(String message, Throwable e) {
        super(message, e);
        // TODO Auto-generated constructor stub
    }

    public BusinessException(Throwable t) {
        super(t);
        // TODO Auto-generated constructor stub
    }

}
