package cn.com.xcsa.api.framework.security;

/**
 * @author wuhui
 */
public interface TenantApi {


    /**
     * 查询租户License.
     * @param tenantId
     * @return license
     */
    String findLicenseByTenantId(Long tenantId);

}
