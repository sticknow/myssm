package cn.itcast.dao.impl;

import cn.itcast.dao.UserRoleKeyDao;
import cn.itcast.domain.UserRoleKey;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 17-2-4.
 */
@Repository("userRoleKeyDao")
public class UserRoleKeyDaoImpl extends BaseDaoImpl<UserRoleKey> implements UserRoleKeyDao {
    public UserRoleKeyDaoImpl(){
        super.setNs("cn.itcast.mapper.UserRoleMapper");
    }
}
