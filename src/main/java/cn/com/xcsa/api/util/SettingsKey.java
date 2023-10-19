package cn.com.xcsa.api.util;

/**
 * 配置信息KEY.
 * @author wuhui
 */
public final class SettingsKey {

    private SettingsKey() {

    }

    /**
     * 登录字段.
     */
    public static final String LOGIN_FIELD = "login.field";

    /**
     * 管理后台跳转地址.
     */
    public static final String ADMIN_URL = "admin.url";


    /**
     * 拖拽验证码配置.
     */
    public static final String CAPTCHA_CONFIG = "captcha.config";

    /**
     * 租户默认限速配置.
     */
    public static final String TENANT_DEFAULT_CONFIG = "tenant.default.config";

}
