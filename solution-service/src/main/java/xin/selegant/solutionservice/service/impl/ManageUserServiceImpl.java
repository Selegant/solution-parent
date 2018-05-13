package xin.selegant.solutionservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xin.selegant.solutionmodel.model.ManageUser;
import xin.selegant.solutionservice.dao.ManageUserDao;
import xin.selegant.solutionservice.service.ManageUserService;


/**
 * @author WT
 * @CreateTime 2018/5/13
 * @Package xin.selegant.solutionservice.service.impl
 **/

@Service
@Transactional
public class ManageUserServiceImpl implements ManageUserService {

    @Autowired
    ManageUserDao manageUserDao;

    @Override
    public Integer save(ManageUser manageUser) {
        System.out.println("111111");
        manageUserDao.insertTemplate(manageUser);
        return 1;
    }
}
