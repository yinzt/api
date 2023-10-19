package cn.com.xcsa.api.util;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 分页对象.
 * @param <T>
 * @author wuhui
 */
@Data
public class Page<T> implements Serializable {

    private Integer pageNo;

    private long totalPage;

    private List<T> content;

    private long total;

    private Integer pageSize;

    /**
     * 构造方法.
     */
    public Page() {

    }
    /**
     * 构造方法.
     * @param t 总页数
     * @param pn 当前页号
     * @param ps 每页大小
     * @param data 数据
     */
    public Page(long t, Integer pn, Integer ps, List<T> data) {
        this.content = data;
        this.pageNo = pn;
        this.pageSize = ps;
        this.total = t;
        totalPage = total / pageSize;
        if (total % pageSize > 0) {
            totalPage++;
        }
    }
}
