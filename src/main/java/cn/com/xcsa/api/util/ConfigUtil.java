package cn.com.xcsa.api.util;

import cn.hutool.core.util.StrUtil;
import cn.hutool.setting.Setting;

import java.util.Properties;


/**
 * 初始化配置.
 *
 * @author wuhui
 */
public final class ConfigUtil {

    private static final String DEFAULT_CONFIG_NAME = "xcsa.conf";
    private static final String CONFIG_KEY = "conf";

    private static Setting setting;

    static {
        load();
    }

    private ConfigUtil() {

    }

    /**
     * 获取配置中的bool值.
     * @param group
     * @param key
     * @return key的值
     */
    public static Boolean getBoolean(String group, String key) {
        return setting.getBool(key, group);
    }

    /**
     * 获取配置中的bool值.
     * @param group
     * @param key
     * @param defaultValue
     * @return key的值
     */
    public static Boolean getBoolean(String group, String key, Boolean defaultValue) {
        return setting.getBool(key, group, defaultValue);
    }

    /**
     * 获取配置中的bool值.
     * @param key
     * @return key的值
     */
    public static Boolean getBoolean(String key) {
        return setting.getBool(key);
    }

    /**
     * 获取配置中的Int值.
     * @param group
     * @param key
     * @param defaultValue
     * @return key的值
     */
    public static Integer getInt(String group, String key, Integer defaultValue) {
        return setting.getInt(key, group, defaultValue);

    }

    /**
     * 获取配置中的Int值.
     * @param group
     * @param key
     * @return key的值
     */
    public static Integer getInt(String group, String key) {
        return setting.getInt(key, group);
    }
    /**
     * 获取配置中的Int值.
     * @param key
     * @return key的值
     */
    public static Integer getInt(String key) {
        return setting.getInt(key);
    }
    /**
     * 获取配置中的String值.
     * @param group
     * @param key
     * @param defaultValue
     * @return key的值
     */
    public static String getString(String group, String key, String defaultValue) {
        return setting.getStrNotEmpty(key, group, defaultValue);
    }

    /**
     * 获取配置中的String值.
     * @param group
     * @param key
     * @return key的值
     */
    public static String getString(String group, String key) {
        return getString(group, key, StrUtil.EMPTY);
    }

    /**
     * 获取配置中的String值.
     * @param key
     * @return key的值
     */
    public static String getString(String key) {
        return setting.getStr(key);
    }

    /**
     * 转成properties文件.
     * @return properties
     */
    public static Properties getProperties() {
        return setting.toProperties();
    }

    /**
     * 加载xsca.conf文件.
     */
    private synchronized static void load() {
        if (setting == null) {
            String configPath = System.getProperty(CONFIG_KEY);
            if (StrUtil.isBlank(configPath)) {
                configPath = DEFAULT_CONFIG_NAME;
            }
            setting = new Setting(configPath);
        }
    }

}
