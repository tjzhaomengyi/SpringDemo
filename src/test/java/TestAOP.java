import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service4aop.UserService;

/**
 * @Auther: zhaomengyi
 * @Date: 19-8-23 16:41
 * @Description:
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext-AOP2.xml")
public class TestAOP {
    @Autowired
    UserService userService;

    @Test
    public void testAOP(){
        userService.addUser();
        userService.deleteUser();
    }
}
