package mysoft.test.first;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages = {"mysoft.test.first"})
@EnableAsync
@EnableAspectJAutoProxy(exposeProxy = true)
public class FirstApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FirstApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

}
