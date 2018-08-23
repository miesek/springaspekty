package springaspect;

import java.beans.IntrospectionException;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import instruments.Guitar;
import instruments.Instrument;
import instruments.Piano;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Instrument instrument= context.getBean(Guitar.class);
//        instrument.play();

        Map<String, Instrument> beans = context.getBeansOfType(Instrument.class);

        beans.values().forEach(Instrument::play);
    }
}
