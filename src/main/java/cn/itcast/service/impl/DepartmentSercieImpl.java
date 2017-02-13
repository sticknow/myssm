package cn.itcast.service.impl;

import cn.itcast.dao.DepartmentDao;
import cn.itcast.domain.Department;
import cn.itcast.pagination.Page;
import cn.itcast.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 17-1-27.
 */
@Service("departmentService")
public class DepartmentSercieImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

    public List<Department> findPage(Page page) {
        return this.departmentDao.findPage(page);
    }

    public List<Department> find(Map paraMap) {
        return this.departmentDao.find(paraMap);
    }

    public Department get(Serializable id) {
        return this.departmentDao.get(id);
    }

    public void insert(Department entity) {
        this.departmentDao.insert(entity);
    }

    public void update(Department entity) {
        this.departmentDao.update(entity);
    }

    public void deleteById(Serializable id) {
        this.departmentDao.deleteById(id);
    }

    public void delete(Serializable[] ids) {
        this.departmentDao.delete(ids);
    }
}
