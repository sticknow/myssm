package cn.itcast.dao.impl;

import cn.itcast.dao.DepartmentDao;
import cn.itcast.domain.Department;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 17-1-26.
 */
@Repository("departmentDao")
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao {
    public DepartmentDaoImpl(){
        super.setNs("cn.itcast.mapper.DepartmentMapper");
    }
}
