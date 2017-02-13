package cn.itcast.dao.impl;

import cn.itcast.dao.RoleDao;
import cn.itcast.domain.Role;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 17-1-26.
 */
@Repository("roleDao")
public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao {
    public RoleDaoImpl() {
        super.setNs("cn.itcast.mapper.RoleMapper");
    }
}
