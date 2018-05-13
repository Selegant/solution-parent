package xin.selegant.solutionweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xin.selegant.solutionmodel.model.ManageUser;
import xin.selegant.solutionservice.service.ManageUserService;

/**
 * @author WT
 * @CreateTime 2018/5/13
 * @Package xin.selegant.solutionweb.controller
 **/

@RestController
@RequestMapping("/user")
public class ManageUserController {

    @Autowired
    ManageUserService manageUserService;

    @PostMapping("/add")
    public String save(@RequestBody ManageUser user){
        manageUserService.save(user);
        return "success";
    }
}
