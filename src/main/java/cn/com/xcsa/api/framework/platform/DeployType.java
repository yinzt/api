package cn.com.xcsa.api.framework.platform;

/**
 * 部署方式.支持SAAS部署方式，和本地私有化部署.
 */
public enum DeployType {

    /**
     * SAAS部署方式.
     */
    SAAS("saas"),

    /**
     * PaaS模式.
     */
    PASS("pass"),

    /**
     * 私有化部署.
     */
    LOCAL("local");

    private String value;

    DeployType(String v) {
        this.value = v;
    }

    /**
     * 获取对应的值.
     * @return 部署类型值
     */
    public String getValue() {
        return value;
    }
}
