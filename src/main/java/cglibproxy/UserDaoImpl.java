package cglibproxy;

import dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Auther: zhaomengyi
 * @Date: 19-8-22 13:48
 * @Description:
 */

@Repository("userdao")
public class UserDaoImpl {

    public void addUser() {
        System.out.println("添加用户");
    }

    public void deleteUser() {
        System.out.println("删除用户");
    }
}
