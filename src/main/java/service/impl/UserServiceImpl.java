package service.impl;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

import javax.annotation.Resource;

/**
 * @Auther: zhaomengyi
 * @Date: 19-8-22 15:03
 * @Description:
 */

@Service("userservice")
public class UserServiceImpl implements UserService {
//    @Autowired
    @Resource(name="userdao")
    UserDao userDao;//这里自动找到Dao对应装配的UserDao的实现类UserDaoImpl

    /**使用xml注入的时候需要set方法
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
     ***/
    public void addUser() {
        userDao.addUser();
    }

    public void deleteUser() {
        userDao.deleteUser();
    }
}
