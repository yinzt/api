package cn.com.xcsa.api.framework.redis;

import java.util.List;
import java.util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public interface RedisCache {

    /**
     * 缓存基本的对象，Integer、String、实体类等.
     *
     * @param key   缓存的键值
     * @param value 缓存的值
     * @param <T> 存放对象的类型
     */
    <T> void setCacheObject(final String key, final T value);

    /**
     * 缓存基本的对象，Integer、String、实体类等.
     *
     * @param key      缓存的键值
     * @param value    缓存的值
     * @param timeout  时间
     * @param timeUnit 时间颗粒度
     * @param <T> 存放对象的类型
     */
    <T> void setCacheObject(final String key, final T value,
                                   final Integer timeout, final TimeUnit timeUnit);

    /**
     * 设置有效时间.
     *
     * @param key     Redis键
     * @param timeout 超时时间
     * @return true=设置成功；false=设置失败
     */
    boolean expire(final String key, final long timeout);

    /**
     * Increment an integer value stored as string value under key by one.
     * @param  key – must not be null.
     * @return  null when used in pipeline / transaction.
     * Redis Documentation: INCR
     *
     */
    Long increment(final String key);

    /**
     * Increment an integer value stored as string value under
     * {@code key} by {@code delta}.
     * @param key must not be {@literal null}.
     * @param delta
     * @return {@literal null} when used in pipeline / transaction.
     * @see <a href="https://redis.io/commands/incrby">
     *     Redis Documentation: INCRBY</a>
     */
    Long increment(String key, long delta);
    /**
     * Increment a floating point number value stored as
     * string value under {@code key} by {@code delta}.
     * @param key must not be {@literal null}.
     * @param delta
     * @return {@literal null} when used in pipeline / transaction.
     * @see <a href="https://redis.io/commands/incrbyfloat">Redis
     * Documentation: INCRBYFLOAT</a>
     */
    Double increment(String key, double delta);

    /**
     * Decrement an integer value stored as string value under {@code key} by one.
     *
     * @param key must not be {@literal null}.
     * @return {@literal null} when used in pipeline / transaction.
     * @since 2.1
     * @see <a href="https://redis.io/commands/decr">Redis Documentation: DECR</a>
     */
    Long decrement(String key);

    /**
     * Decrement an integer value stored as string value under {@code key} by {@code delta}.
     *
     * @param key must not be {@literal null}.
     * @param delta
     * @return {@literal null} when used in pipeline / transaction.
     * @since 2.1
     * @see <a href="https://redis.io/commands/decrby">Redis Documentation: DECRBY</a>
     */
    Long decrement(String key, long delta);

    /**
     * 设置有效时间.
     *
     * @param key     Redis键
     * @param timeout 超时时间
     * @param unit    时间单位
     * @return true=设置成功；false=设置失败
     */
    boolean expire(final String key, final long timeout, final TimeUnit unit);

    /**
     * 获取有效时间.
     *
     * @param key Redis键
     * @return 有效时间
     */
    long getExpire(final String key);

    /**
     * 判断 key是否存在.
     *
     * @param key 键
     * @return true 存在 false不存在
     */
    Boolean hasKey(String key);

    /**
     * 获得缓存的基本对象.
     *
     * @param key 缓存键值
     * @param <T> 存放对象的类型
     * @return 缓存键值对应的数据
     */
    <T> T getCacheObject(final String key);

    /**
     * 删除单个对象.
     *
     * @param key
     * @return 是否成功
     */
    boolean deleteObject(final String key);

    /**
     * 删除集合对象.
     *
     * @param collection 多个对象
     * @return 是否成功
     */
    boolean deleteObject(final Collection collection);

    /**
     * 缓存List数据.
     *
     * @param key      缓存的键值
     * @param dataList 待缓存的List数据
     * @param <T> 存放对象的类型
     * @return 缓存的对象
     */
    <T> long setCacheList(final String key, final List<T> dataList);

    /**
     * 获得缓存的list对象.
     *
     * @param key 缓存的键值
     * @param <T> 存放对象的类型
     * @return 缓存键值对应的数据
     */
    <T> List<T> getCacheList(final String key);

    /**
     * 获得缓存的set.
     *
     * @param key
     * @param <T> 存放对象的类型
     * @return 缓存中的Set对象
     */
    <T> Set<T> getCacheSet(final String key);

    /**
     * 缓存Map.
     *
     * @param key
     * @param <T> 存放对象的类型
     * @param dataMap
     */
    <T> void setCacheMap(final String key, final Map<String, T> dataMap);

    /**
     * 获得缓存的Map.
     *
     * @param key
     * @param <T> 存放对象的类型
     * @return 缓存中的map对象
     */
    <T> Map<String, T> getCacheMap(final String key);

    /**
     * 往Hash中存入数据.
     *
     * @param key   Redis键
     * @param hKey  Hash键
     * @param <T> 存放对象的类型
     * @param value 值
     */
    <T> void setCacheMapValue(final String key, final String hKey, final T value);

    /**
     * 获取Hash中的数据.
     *
     * @param key  Redis键
     * @param hKey Hash键
     * @param <T> 存放对象的类型
     * @return Hash中的对象
     */
    <T> T getCacheMapValue(final String key, final String hKey);

    /**
     * 获取多个Hash中的数据.
     *
     * @param key   Redis键
     * @param <T> 存放对象的类型
     * @param hKeys Hash键集合
     * @return Hash对象集合
     */
    <T> List<T> getMultiCacheMapValue(final String key, final Collection<Object> hKeys);

    /**
     * 删除Hash中的某条数据.
     *
     * @param key  Redis键
     * @param hKey Hash键
     * @return 是否成功
     */
    boolean deleteCacheMapValue(final String key, final String hKey);

    /**
     * 获得缓存的基本对象列表.
     *
     * @param pattern 字符串前缀
     * @return 对象列表
     */
    Collection<String> keys(final String pattern);
}
