package cn.edu.sziit.aop.annotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//使用@Aspect定义切面bean
@Aspect
//由于该类在Spring中是作为组件使用的，所以还需要添加@Component才能生效
@Component
public class MyAspect {
    //定义切入点表达式
    @Pointcut("execution(* cn.edu.sziit.service.*.*(..))")
    private void pt1(){};
    //前置通知
    @Before("pt1()")
    public void manageAuthority(JoinPoint joinPoint){
        System.out.println("前置通知：模拟进行权限检查......");
        System.out.println("目标类是："+joinPoint.getTarget());
        System.out.println("被织入增强处理的方法是："+joinPoint.getSignature().getName());
        System.out.println();
    }

    //环绕通知
    @Around("pt1()")
    public Object processTransaction(ProceedingJoinPoint joinPoint)throws Throwable{
        System.out.println("环绕开始：执行目标方法之前，模拟开始事务......");
        Object obj=joinPoint.proceed();
        System.out.println("环绕结束：执行目标方法之后，模拟关闭事务......");
        System.out.println();
        return obj;
    }

    //最终通知
    @After("pt1()")
    public void releaseResource(){
        System.out.println("最终通知：模拟释放资源......");
        System.out.println();
    }
}
