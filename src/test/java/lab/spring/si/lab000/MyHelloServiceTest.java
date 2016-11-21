package lab.spring.si.lab000;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyHelloServiceTest {

    @Test
    public void testFileBasedCopy() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:lab000/context.xml");

        HelloService helloService = context.getBean("helloService", HelloService.class);

        System.out.println(helloService.sayHello("Grey"));
    }

}
