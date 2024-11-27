package com.yrgo.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class PerformanceTimingAdvice  {

    public Object performTimingMeasurement(ProceedingJoinPoint method) throws Throwable {

        long startTime = System.nanoTime();

        try {
            return method.proceed();
        } finally {
            long endTime = System.nanoTime();
            long timeTaken = endTime - startTime;
            System.out.println("Time taken for the method " +
                    method.getSignature().getName() + " from the class\n" +  method.getTarget().getClass() + " took " +
                    (timeTaken / 1_000_000.0) + "ms");
        }
    }

}
