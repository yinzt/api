package cn.com.xcsa.api.storage;

import lombok.Data;

import java.io.Serializable;


@Data
public class PathInfo implements Serializable {

    private String id;

    private String dir;

    private Integer weight;


}
