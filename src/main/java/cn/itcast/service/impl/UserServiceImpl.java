package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import cn.itcast.pagination.Page;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 17-1-27.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<User> findPage(Page page) {
        return this.userDao.findPage(page);
    }

    public List<User> find(Map paraMap) {
        return this.userDao.find(paraMap);
    }

    public User get(Serializable id) {
        return this.userDao.get(id);
    }

    public void insert(User entity) {
        this.userDao.insert(entity);
    }

    public void update(User entity) {
        this.userDao.update(entity);

    }

    public void deleteById(Serializable id) {
        this.userDao.deleteById(id);
    }

    public void delete(Serializable[] ids) {
        this.userDao.delete(ids);
    }
}
