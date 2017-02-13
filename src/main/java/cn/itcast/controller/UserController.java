package cn.itcast.controller;

import cn.itcast.domain.Department;
import cn.itcast.domain.Role;
import cn.itcast.domain.User;
import cn.itcast.service.DepartmentService;
import cn.itcast.service.RoleService;
import cn.itcast.service.UserRoleKeyService;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 17-2-3.
 */
@Controller("userController")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private UserRoleKeyService userRoleKeyService;
    @RequestMapping("/list.action")
    public String list(String name,Model model){
        Map<String,Object> para=new HashMap<String, Object>();
        para.put("name",name);
        List<User> userlist=userService.find(para);
        model.addAttribute("userlist",userlist);
        return "/user/list.jsp";
    }
    @RequestMapping("/add.action")
    public String add(String name,Model model){
        Map<String,Object> para= new HashMap<String, Object>();
        para.put("name",name);
        List<Role>roleList=this.roleService.find(para);
        List<Department>departmentList=this.departmentService.find(para);
        model.addAttribute("roleList",roleList);
        model.addAttribute("departmentList",departmentList);
        return "/user/add.jsp";
    }
    @RequestMapping("/save.action")
    public String insert(User user,Long did,Long rids){
            this.userService.insert(user);
            return "redirect:/list.action";
    }

}
