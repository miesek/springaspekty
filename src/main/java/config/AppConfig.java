package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import instruments.AnnouncerAspect;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan({"instruments", "aspects"})
public class AppConfig {

//    @Bean
//    AnnouncerAspect announcerAspect() {
//        return new AnnouncerAspect();
//    }

}
