package cn.itcast.dao.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 17-1-26.
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
    public UserDaoImpl() {
        super.setNs("cn.itcast.mapper.UserMapper");
    }
}
