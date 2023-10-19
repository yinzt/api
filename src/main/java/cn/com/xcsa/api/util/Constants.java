package cn.com.xcsa.api.util;

/**
 * 配置相关常量的KEY值.
 *
 * @author wuhui
 */
public final class Constants {

    private Constants() {

    }


    /**
     * 客户端相关配置分组名称.
     */
    public static final String GROUP_CLIENT = "client";

    public static final String TOKEN_SECRET = "token.secret";
    public static final String TOKEN_EXPIRE = "token.expire";


    /**
     * 默认块大小.
     */
    public static final String DEFAULT_FILE_BLOCK_SIZE = "20MB";

    public static final String DEFAULT_FILE_MAX_FILE_SIZE = "1GB";

    public static final String DEFAULT_FILE_MAX_REQUEST_SIZE = "10GB";

    /**
     * file.block.size.
     */
    public static final String FILE_BLOCK_SIZE = "file.block.size";
    public static final String FILE_ENCRYPT_ALGORITHM = "file.encrypt.algorithm";
    public static final String FILE_MAX_FILE_SIZE = "file.maxFileSize";
    public static final String FILE_MAX_REQUEST_SIZE = "file.maxRequestSize";



    public static final String AUTH_QRCODE_WIDTH = "auth.qrcode.width";

    public static final String AUTH_QRCODE_HEIGHT = "auth.qrcode.height";

    /**
     * 服务相关配置分组名称.
     */
    public static final String GROUP_SERVER = "server";
    /**
     * 服务相关配置分组名称.
     */
    public static final String SERVER_NAME = "server.name";
    /**
     * 服务相关配置分组名称.
     */
    public static final String GROUP_STORAGE = "storage";

    /**
     * 部署方式key.
     */
    public static final String DEPLOY_MODEL = "deploy.model";


    /**
     * redis 地址.
     */
    public static final String REDIS_HOST = "redis.host";

    /**
     * 端口，默认为6379.
     */
    public static final String REDIS_PORT = "redis.port";

    /**
     * 端口，默认为6379.
     */
    public static final Integer DEFAULT_REDIS_PORT = 6379;

    /**
     * 密码.
     */
    public static final String REDIS_PASSWORD = "redis.password";
    /**
     * 数据库索引.
     */
    public static final String REDIS_DATABASE = "redis.database";
    /**
     * 连接超时时间.
     */
    public static final String REDIS_TIMEOUT = "redis.timeout";

    /**
     * 连接池中的最小空闲连接.
     */
    public static final String REDIS_LETTUCE_POOL_MIN_IDLE = "redis.lettuce.pool.min-idle";
    /**
     * 连接池的最大数据库连接数.
     */
    public static final String REDIS_LETTUCE_POOL_MAX_ACTIVE = "redis.lettuce.pool.max-active";
    /**
     * 连接池最大阻塞等待时间（使用负值表示没有限制）.
     */
    public static final String REDIS_LETTUCE_POOL_MAX_WAIT = "redis.lettuce.pool.max-wait";

    /**
     * 连接池中的最大空闲连接.
     */
    public static final String REDIS_LETTUCE_POOL_MAX_IDLE = "redis.lettuce.pool.max-idle";


    public static final String UTF8 = "utf-8";


    public static final String UID = "uid";
    public static final String USERNAME = "username";
    public static final String SOURCE = "src";
    public static final String TENANT_ID = "tenantId";


    ///
    public static final String SMTP_HOST = "mail.smtp.host";
    public static final String SMTP_PORT = "mail.smtp.port";
    public static final String SMTP_AUTH = "mail.smtp.auth";
    public static final String SMTP_USER = "mail.smtp.user";
    public static final String SMTP_PASSWORD = "mail.smtp.password";
    public static final String SMTP_FROM = "mail.smtp.from";
    public static final String SMTP_TIMEOUT = "mail.smtp.timeout";
    public static final String SMTP_CONNECTION_TIMEOUT = "mail.smtp.connectiontimeout";
    public static final String SMTP_WRITE_TIMEOUT = "mail.smtp.writetimeout";

    // SSL
    public static final String STARTTLS_ENABLE = "mail.smtp.starttls.enable";
    public static final String SSL_ENABLE = "mail.smtp.ssl.enable";
    public static final String SSL_PROTOCOLS = "mail.smtp.ssl.protocols";
    public static final String SOCKET_FACTORY = "mail.smtp.socketFactory.class";
    public static final String SOCKET_FACTORY_FALLBACK = "mail.smtp.socketFactory.fallback";
    public static final String SOCKET_FACTORY_PORT = "smtp.socketFactory.port";

    // System Properties
    public static final String SPLIT_LONG_PARAMS = "mail.mime.splitlongparameters";


    public static final String AUTHORIZATION = "Authorization";

}
