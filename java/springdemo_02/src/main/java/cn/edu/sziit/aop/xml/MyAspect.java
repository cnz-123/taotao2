package cn.edu.sziit.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void manageAuthority(JoinPoint joinPoint){
        System.out.println("前置通知：模拟进行权限检查......");
        System.out.println("目标类是："+joinPoint.getTarget());
        System.out.println("被织入增强处理的方法是："+joinPoint.getSignature().getName());
        System.out.println();
    }
    public Object processTransaction(ProceedingJoinPoint joinPoint)throws Throwable{
        System.out.println("环绕开始：执行目标方法之前，模拟开始事务......");
        Object obj=joinPoint.proceed();
        System.out.println("环绕结束：执行目标方法之后，模拟关闭事务......");
        System.out.println();
        return obj;
    }
    public void releaseResource(){
        System.out.println("最终通知：模拟释放资源......");
        System.out.println();
    }
}
