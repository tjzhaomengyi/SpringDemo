import cglibproxy.UserDaoImpl;
import org.junit.Test;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Auther: zhaomengyi
 * @Date: 19-8-23 15:32
 * @Description:
 */
public class TestCglib {
    @Test
    public void testCgilib(){
        final UserDaoImpl dao = new UserDaoImpl();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserDaoImpl.class);

        Callback callback = new MethodInterceptor() {
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("开启事务");
                Object obj = method.invoke(dao,args);
                System.out.println("提交事务");
                return obj;
            }
        };
        enhancer.setCallback(callback);
        UserDaoImpl proxy = (UserDaoImpl) enhancer.create();
        proxy.addUser();
        proxy.deleteUser();
    }
}
