package service4aop.impl;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service4aop.UserService;

import javax.annotation.Resource;

/**
 * @Auther: zhaomengyi
 * @Date: 19-8-22 15:03
 * @Description:
 */

@Service("userservice")
public class UserServiceImpl implements UserService {

    UserDao userDao;//这里自动找到Dao对应装配的UserDao的实现类UserDaoImpl

    /**使用xml注入的时候需要set方法
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
     ***/
    public void addUser() {
       System.out.println("添加用户");
    }

    public void deleteUser() {
        System.out.println("删除用户");
    }
}
