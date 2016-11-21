package lab.spring.si.lab002;

import lab.spring.si.lab001.GreeterService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreeterServiceImplTest {

    @Test
    public void greet() throws Exception {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:lab001/context-001.xml");

        GreeterService greeterService = applicationContext.getBean("greeterServiceImpl", GreeterService.class);

        greeterService.greet("Hello, Spring Integration, again!");
    }

}