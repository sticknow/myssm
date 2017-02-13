package cn.itcast.service.impl;

import cn.itcast.dao.RoleDao;
import cn.itcast.domain.Role;
import cn.itcast.pagination.Page;
import cn.itcast.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 17-1-27.
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    public List<Role> findPage(Page page) {
        return this.roleDao.findPage(page);
    }

    public List<Role> find(Map paraMap) {
        return this.roleDao.find(paraMap);
    }

    public Role get(Serializable id) {
        return this.roleDao.get(id);
    }

    public void insert(Role entity) {
        this.roleDao.insert(entity);
    }

    public void update(Role entity) {
        this.roleDao.update(entity);
    }

    public void deleteById(Serializable id) {
        this.deleteById(id);
    }

    public void delete(Serializable[] ids) {
        this.roleDao.delete(ids);

    }
}
