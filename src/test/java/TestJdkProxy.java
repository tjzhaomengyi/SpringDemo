import jdkproxy.UserDao;
import jdkproxy.impl.UserDaoImpl;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: zhaomengyi
 * @Date: 19-8-23 14:53
 * @Description:
 */

public class TestJdkProxy {
    @Test
    public void test(){
        final UserDao userdao = new UserDaoImpl();

        UserDao proxy = (UserDao) Proxy.newProxyInstance(userdao.getClass().getClassLoader(),
                userdao.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始");
                        Object obj = method.invoke(userdao,args);
                        System.out.println("结束");
                        return obj;
                    }
                });
        proxy.addUser();
        proxy.deleteUser();
    }

}
