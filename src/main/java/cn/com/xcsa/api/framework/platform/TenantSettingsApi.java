package cn.com.xcsa.api.framework.platform;

import cn.com.xcsa.api.dto.TenantSettingsDto;

import java.util.List;

/**
 * 租户相关配置接口.
 */
public interface TenantSettingsApi {

    /**
     * 添加配置.
     * @param tenantId 租户ID
     * @param paramName 配置名称
     * @param paramKey 配置KEY
     * @param paramValue 配置值
     * @param remark 备注
     * @return 是否跟新
     */
    Long addSettings(Long tenantId, String paramName, String paramKey,
                     String paramValue, String remark);

    /**
     * 根据配置ID，更新参数信息，参数为空时表示不更新.
     * @param configId 配置ID
     * @param paramName 配置名称
     * @param paramValue 配置值
     * @param remark 备注
     * @return 是否跟新
     */
    Boolean updateSettings(Long configId, String paramName, String paramValue, String remark);



    /**
     * 根据配置Key，更新参数信息，参数为空时表示不更新.
     * @param tenantId 租户ID
     * @param paramKey 配置Key
     * @param paramName 配置名称
     * @param paramValue 配置值
     * @param remark 备注
     * @return 是否跟新
     */
    Boolean updateSettings(Long tenantId, String paramKey, String paramName,
                           String paramValue, String remark);


    /**
     * 根据配置ID删除配置，系统配置不支持删除.
     * @param configId
     * @return 是否删除成功
     */
    Boolean deleteSettings(Long configId);


    /**
     * 根据配置Key删除配置，系统配置不支持删除.
     * @param tenantId
     * @param paramKey
     * @return 是否删除成功
     */
    Boolean deleteSettings(Long tenantId, String paramKey);

    /**
     * 跟进配置ID查询配置.
     * @param configId
     * @return 配置对象
     */
    TenantSettingsDto settingsInfo(Long configId);

    /**
     * 跟进配置Key查询配置.
     * @param tenantId
     * @param paramKey
     * @return 配置对象
     */
    TenantSettingsDto settingsInfo(Long tenantId, String paramKey);

    /**
     * 查询所有配置信息.
     * @param tenantId
     * @param paramKey
     * @param paramName
     * @return 配置列表
     */
    List<TenantSettingsDto> settingsList(Long tenantId, String paramKey, String paramName);


    /**
     * 检测 paramKey是否存在.
     * @param id
     * @param tenantId
     * @param paramKey
     * @return true：存在，false：不存在
     */
    boolean checkParamKey(Long id, Long tenantId, String paramKey);
}
