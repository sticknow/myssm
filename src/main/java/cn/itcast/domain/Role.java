package cn.itcast.domain;

/**
 * Created by Administrator on 17-1-26.
 */

import java.io.Serializable;
import java.util.Set;

public class Role implements Serializable {
    private Long rid;
    private String rname;
    private String rdescription;
    private Set<User> users;

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRdescription() {
        return rdescription;
    }

    public void setRdescription(String rdescription) {
        this.rdescription = rdescription;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Long getRid() {

        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }
}
