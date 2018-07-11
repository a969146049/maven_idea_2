package org.java.dao;

import java.util.List;
import java.util.Map;

/**
 * Created by 马果 on 2018/7/8.
 */
public interface InfMapper {

    public void add(Map<String, Object> m);
    public List<Map<String,Object>> getList();
}
