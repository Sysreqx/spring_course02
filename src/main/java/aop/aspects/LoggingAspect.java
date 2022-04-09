package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
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
