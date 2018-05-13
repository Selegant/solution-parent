package xin.selegant.solutionservice.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author WT
 * @CreateTime 2018/5/13
 * @Package xin.selegant.solutionservice.annotation
 **/
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE})
@Documented
@Configuration
@ComponentScan(basePackages = "xin.selegant.solutionservice")
public @interface EnableService {
}
