package cn.itcast.service.impl;

import cn.itcast.dao.UserRoleKeyDao;
import cn.itcast.domain.Role;
import cn.itcast.pagination.Page;
import cn.itcast.service.UserRoleKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 17-2-7.
 */
@Service("userRoleKeyService")
public class UserRoleKeyServiceImpl implements UserRoleKeyService {
    @Autowired
    private UserRoleKeyDao userRoleKeyDao;
    public List<Role> findPage(Page page) {
        return null;
    }

    public List<Role> find(Map paraMap) {
        return null;
    }

    public Role get(Serializable id) {
        return null;
    }

    public void insert(Role entity) {

    }

    public void update(Role entity) {

    }

    public void deleteById(Serializable id) {

    }

    public void delete(Serializable[] ids) {

    }
}
