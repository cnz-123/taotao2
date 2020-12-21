package cn.edu.sziit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = {"classpath:account.properties"})
@ComponentScan(basePackages = "cn.edu.sziit")
public class SpringConfig {

}
