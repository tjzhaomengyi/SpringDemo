package aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Auther: zhaomengyi
 * @Date: 19-8-23 17:32
 * @Description:
 */
public class MyAspect {

    public void before(){
        System.out.println("before");
    }

    public void afterReturning(){
        System.out.println("afterReturning");
    }
    public void after(){
        System.out.println("after");
    }

    public void afterThrowing(){
        System.out.println("afterThrow");
    }

    public void around(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("前置");
            joinPoint.proceed();
            System.out.println("后置");
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println("异常");
        }finally {
            System.out.print("最终");
        }
    }
}
