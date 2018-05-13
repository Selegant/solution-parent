package xin.selegant.solutionrepo.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author WT
 * @CreateTime 2018/5/13
 * @Package xin.selegant.solutionrepo.annotation
 **/

@Configuration
@ComponentScan(basePackages = "xin.selegant.solutionrepo.dao")
public @interface EnableRepo {
}
