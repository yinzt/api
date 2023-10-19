package cn.com.xcsa.api.license;

import java.util.ArrayList;
import java.util.List;

/**
 * license 类型.
 *
 * @author wuhui
 */
public enum LicenseType {

    /**
     * 限制用户数.
     */
    user(1),
    /**
     * 限制用户激活数.
     */
    active(2),
    /**
     * 用在线数.
     */
    online(4);

    private int value;

    LicenseType(int v) {
        this.value = v;
    }

    /**
     * 根据v判断支持的类型.
     *
     * @param v 值
     * @return 支持的类型
     */
    public static List<LicenseType> supports(int v) {
        List<LicenseType> licenseTypes = new ArrayList<>();
        for (LicenseType lt : values()) {
            if ((lt.value & v) == v) {
                licenseTypes.add(lt);
            }
        }
        return licenseTypes;
    }

    /**
     * 根据v判断支持的类型.
     *
     * @param v 值
     * @return 支持的类型
     */
    public static LicenseType support(int v) {
        for (LicenseType lt : values()) {
            if (lt.value  == v) {
                return lt;
            }
        }
        return null;
    }
}
