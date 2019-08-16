package com.tedu.advicor;

import com.tedu.advice.LogAdvice;
import com.tedu.annotation.RequestLog;
import org.aopalliance.aop.Advice;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
@Component
public class MethodMatchs extends StaticMethodMatcherPointcutAdvisor {

    public MethodMatchs(){
        setAdvice(new LogAdvice());
    }
    @Override
    public boolean matches(Method method, Class<?> aClass) {
        try {
            System.out.println("csdxxxbsxxsde");
            Method targerMethod = aClass.getMethod(method.getName(), method.getParameterTypes());
            return targerMethod.isAnnotationPresent(RequestLog.class);
        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
            return false;
        }

    }
}
