package cn.com.xcsa.api.exception;


import cn.com.xcsa.api.util.InfoCode;

/**
 * 异常信息.
 */
public class ApiRuntimeException extends RuntimeException {

    private static final long serialVersionUID = -3197616652643414121L;

    private String msg;

    private InfoCode infoCode;

    /**
     * 构建异常.
     * @param ic
     */
    public ApiRuntimeException(InfoCode ic) {
        super(ic.getMsg());
        this.infoCode = ic;
    }
    /**
     * 构建异常.
     * @param ic
     * @param message
     */
    public ApiRuntimeException(InfoCode ic, String message) {
        super(message);
        this.infoCode = ic;
        this.msg = message;
    }
    /**
     * 获取异常.
     * @return  infoCode
     */
    public InfoCode getInfoCode() {
        return infoCode;
    }
    /**
     * 获取异常.
     * @return  infoCode
     */
    public String getMsg() {
        return msg;
    }
}
