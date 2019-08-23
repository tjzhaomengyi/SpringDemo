package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhaomengyi
 * @Date: 19-8-23 17:32
 * @Description:
 */
@Component
@Aspect
public class MyAspect {

    @Pointcut("execution(* service4aop..*(..))")
    public void pointCut(){}

    @Before("pointCut()")
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
