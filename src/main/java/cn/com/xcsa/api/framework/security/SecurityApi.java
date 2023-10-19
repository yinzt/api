package cn.com.xcsa.api.framework.security;

/**
 * 权限相关接口封装.
 *
 * @author wuhui
 */
public interface SecurityApi {

    /**
     * 用户登陆验证成功以后调用此接口创建token.
     * 框架会自动缓存用户信息
     * @param tenantId 租户id
     * @param userId   用户ID
     * @param userName 用户名
     * @param source   来源
     * @return token
     */
    String login(Long tenantId, Long userId, String userName, String source);


    /**
     * 退出登陆.
     * @param token
     * @return 退出登陆状态
     */
    Boolean logout(String token);


    /**
     * 获取当前登陆用户信息，token为header Authorization 字段.
     *
     * @param token
     * @return 用户相关信息
     */
    ClaimInfo getClaimInfo(String token);

    /**
     * 创建一个二次认证的密钥及二维码.
     *
     * @param name    显示的名称
     * @param account 账户
     * @return 密钥及二维码
     */
    Credentials createCredentials(String name, String account);

    /**
     * 创建一个二次认证的密钥.
     *
     * @return 密钥
     */
    String createSecretKey();

    /**
     * 验证二次认证的验证码.
     *
     * @param secret 密钥
     * @param code   验证码
     * @return 验证结果
     */
    boolean validate(String secret, Integer code);

    /**
     * 根据密钥生成一个验证码.
     *
     * @param secret 密钥
     * @return 6位验证码
     */
    Integer generatePassword(String secret);
}
