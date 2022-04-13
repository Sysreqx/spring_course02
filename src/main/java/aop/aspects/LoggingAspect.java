package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();

        System.out.println("methodSignature = " + methodSignature);

        System.out.println("beforeGetLoggingAdvice: writing Log #1");
        System.out.println("------------------------------");
    }

//    @Before("aop.aspects.MyPointcuts.allReturnMethods()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturLoggingAdvice: writing Log #2");
//    }
//
//    @Before("aop.aspects.MyPointcuts.allGetAndReturnMethods()")
//    public void beforeGetAndReturnLogginAdvice() {
//        System.out.println("allGetAndReturnMethodsFromLibrary: writing Log #3");
//    }
}
