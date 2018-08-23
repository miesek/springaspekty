package instruments;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnouncerAspect {

    @Pointcut("execution(* instruments.Instrument.play())")
    public void pointcutMethod() {
    }

    @Before("pointcutMethod()")
    public void beforePlay() {
        System.out.println("Announces concert ...");
    }

    @AfterReturning(pointcut = "pointcutMethod()", returning = "result")
    public void afterPlay(Object result) {
        System.out.println("After play: " + result);
        System.out.println("Concert is finished");
    }

    @Around("pointcutMethod()")
    public Object duringPlay(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around method: before playing");
        Object proceed = joinPoint.proceed();
        System.out.println("Returned: " + proceed);
        System.out.println("Around method: and playing...");
        return proceed;
    }

    @AfterThrowing("pointcutMethod()")
    public void afterThrowing() {
        System.out.println("Throwing exception: the concert is finishing, everyone is running to exit...");
    }
}
