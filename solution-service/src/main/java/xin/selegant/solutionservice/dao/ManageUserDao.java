package xin.selegant.solutionservice.dao;

import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import xin.selegant.solutioncore.orm.BaseDao;
import xin.selegant.solutionmodel.model.ManageUser;

/**
 * @author WT
 * @CreateTime 2018/5/13
 * @Package xin.selegant.solutionrepo.dao
 **/

@Repository
public interface ManageUserDao extends BaseDao<ManageUser> {

}
