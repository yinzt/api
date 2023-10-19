package cn.com.xcsa.api.framework.platform;

/**
 * 平台通用接口.
 *
 * @author wuhui
 */
public interface PlatformApi {

    /**
     * 获取平台部署方式.
     *
     * @return 部署类型
     */
    DeployType deployInfo();
}
