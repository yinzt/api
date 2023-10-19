package cn.com.xcsa.api.license;

/**
 * 提供License查询，验证相关接口功能.
 *
 * @author
 */
public interface LicenseApi {

    /**
     * 查询对应的License信息，多租户模式下使用.
     *
     * @param lic License 信息
     * @return License 信息
     */
    License licenseInfo(String lic);

    /**
     * 查询租户对应的对应的License信息.
     *
     * @param tenantId 租户ID
     * @return License 信息
     */
    License licenseInfo(Long tenantId);


    /**
     * 私有化部署模式下查询用户的License信息.
     *
     * @return License 信息
     */
    License licenseInfo();

    /**
     * 查询License版本.
     *
     * @return 返回License 版本信息
     */
    String version();

    /**
     * 查询License版本.
     *
     * @return 返回License 版本信息
     */
    Integer versionCode();
}
