package cn.itcast.service;

import cn.itcast.domain.Department;
import cn.itcast.pagination.Page;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 17-1-27.
 */
public interface DepartmentService {
    public List<Department> findPage(Page page);                //分页查询

    public List<Department> find(Map paraMap);                //带条件查询，条件可以为null，既没有条件；返回list对象集合

    public Department get(Serializable id);                    //只查询一个，常用于修改

    public void insert(Department entity);                    //插入，用实体作为参数

    public void update(Department entity);                    //修改，用实体作为参数

    public void deleteById(Serializable id);        //按id删除，删除一条；支持整数型和字符串类型ID

    public void delete(Serializable[] ids);            //批量删除；支持整数型和字符串类型ID
}
