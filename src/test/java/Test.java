import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.User;
import entity.UserComplex;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * @Auther: zhaomengyi
 * @Date: 19-8-22 13:52
 * @Description:
 */
public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        /***这里是到使用xml配置注入的
//        UserDao userdao = ac.getBean("userdao",UserDao.class);
//        userdao.addUser();
//        userdao.deleteUser();
        UserService service = ac.getBean("userservice",UserService.class);
        System.out.println(service);
        service.addUser();
        service.deleteUser();
        UserComplex user = ac.getBean("usercomplex", UserComplex.class);
        System.out.println(user.getUname());
        System.out.println(user.getUid());
        System.out.println(user.toString());
         ***/

//        UserDao dao = ac.getBean("userDaoImpl",UserDao.class);

        UserService service = ac.getBean("userservice",UserService.class);
        service.addUser();
        service.deleteUser();


    }
}
