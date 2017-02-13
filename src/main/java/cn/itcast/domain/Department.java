package cn.itcast.domain;

/**
 * Created by Administrator on 17-1-26.
 */

import java.io.Serializable;
import java.util.Set;

public class Department implements Serializable {
    private Long did;
    private String dname;
    private String ddescription;
    private Set<User> users;

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDdescription() {
        return ddescription;
    }

    public void setDdescription(String ddescription) {
        this.ddescription = ddescription;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
