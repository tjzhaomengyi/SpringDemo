import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

/**
 * @Auther: zhaomengyi
 * @Date: 19-8-23 11:31
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class TestJunit4 {
    @Autowired
    UserService userService;

    @Test
    public void test(){
        userService.addUser();
        userService.deleteUser();
    }
}
