package cn.com.xcsa.api.util;

public enum InfoCode {

    SUCCESS(0, "成功"),
    FAIL(1000, "失败"),

    NOT_LOGIN(1001, "没有登录或登录已失效！"),
    CAPTCHA_VERIFICATION_FAILED(1003, "图形验证码校验失败！"),
    GOOGLE_VERIFICATION_FAILED(1004, "谷歌验证码校验失败！"),
    FREEZE(1006, "该账户已被冻结！如有问题请联系客服"),
    VERIFICATION_FAILED(1007, "验证码校验失败！"),
    CAPTCHA_VERIFICATION_EXPIRE(1009, "验证码失效！请重新获取"),
    CAPTCHA_VERIFICATION_MAX(1010, "验证失效！请重新获取"),
    CAPTCHA_GET_CODE_MAX(1011, "获取验证码太频繁啦！请稍后重试"),
    CAPTCHA_VERIFY_QUICK(1012, "验证太频繁啦！请稍后重试"),
    PHONE_VERIFICATION_FAILED(1016, "手机验证码校验失败！"),
    EMAIL_VERIFICATION_FAILED(1017, "邮箱验证码校验失败！"),
    SEND_TOO_MANY(1018, "短信发送次数过多，请明日再试，谢谢！"),

    PARAMS_NOT_EXIST(2000, "数据缺失！请检查请求数据"),
    PARAMS_EXIST(2004, "数据已存在！请检查请求数据"),
    FILE_NOT_EXIST(2001, "未找到图片！请检查图片信息"),
    PARAMS_ERROR(2002, "数据有误！请检查请求数据"),
    RESULT_NULL(2003, "没有查询到结果"),
    USER_ERROR(2008, "当前账号用户数据异常!"),
    LOGIN_TYPE_ERROR(2009, "账号或手机号输入不正确!"),
    LOGIN_NAME_NULL(2010, "登陆账号或手机号不存在!"),
    PASSWORD_ERROR(2016, "账号或密码输入不正确!"),
    USER_NOT_EQUALS(2012, "当前验证信息与操作用户信息不相符!"),
    USER_IS_NULL(2013, "当前操作用户不存在!"),
    USER_IS_DISABLE(2014, "当前操作用户被禁用!"),
    LOGIN_USER_REGISTERED(2015, "当前用户已经注册!"),
    OLD_PASSWORD_ERROR(2017, "原密码输入不正确!"),
    ACCESS_TOKEN_EXPIRE(2018, "登陆凭证已失效!"),
    GOOGLE_TOKEN_EXPIRE(2019, "谷歌验证器已失效!"),
    GOOGLE_VERIFIER_NOT_BOUND(2020, "未绑定谷歌验证器！请先绑定谷歌验证器!"),
    DISABLED_USER(2021, "您的用户已经被锁定！锁定时间为%s分钟,请稍后再试！"),
    USER_LEVEL_TOO_LOW(2030, "用户安全等级过低！请先完善安全设置!"),
    MAX_UPLOAD_SIZE_EXCEEDED_EXCEPTION(2031, "上传文件超出最大限制!"),
    PHONE_TYPE_ERROR(2034, "手机号格式不正确!"),
    UPLOAD_FILE_BIG(2035, "文件太大，上传失败!"),
    UPLOAD_FILE_ERROR(2036, "文件上传失败!"),

    REQUEST_FREQUENT(3000, "您的请求太频繁啦！请稍后再试"),
    REQUEST_TOO_MANY_PEOPLE(3001, "前方拥堵！请稍后再试"),
    INVALID_LICENSE(3002, "License不存在或已过期"),

    URL_NOT_EXIST(4001, "大师兄,页面被妖怪偷走了!"),
    NOT_SUPPORTED(4002, "不支持的请求方式!"),
    SIGN_ERROR(4003, "验签失败"),
    NOT_METHOD(4004, "不支持的方法"),
    SERVICE_UNAVAILABLE(5000, "抱歉，服务器开小差了请稍后重试~");


    private int status;

    private String msg;

    /**
     * 构造器.
     * @param s
     * @param m
     */
    InfoCode(int s, String m) {
        this.status = s;
        this.msg = m;
    }

    /**
     * 返回status.
     * @return status
     */
    public int getStatus() {
        return status;
    }

    /**
     * 返回msg.
     * @return msg
     */
    public String getMsg() {
        return msg;
    }
}
