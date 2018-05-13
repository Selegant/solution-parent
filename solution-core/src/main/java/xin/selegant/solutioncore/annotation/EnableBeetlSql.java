package xin.selegant.solutioncore.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import xin.selegant.solutioncore.beetlsql.config.BeetlSqlConfig;
import xin.selegant.solutioncore.beetlsql.config.DataSourceConfig;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author WT
 * @CreateTime 2018/5/13
 * @Package xin.selegant.solutioncore.annotation
 **/

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE})
@Documented
@Configuration
@Import({DataSourceConfig.class})
public @interface EnableBeetlSql {
}
