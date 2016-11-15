package lab.spring.si;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyHelloServiceTest {

    @Test
    public void testFileBasedCopy() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");

        HelloService helloService = context.getBean("helloService", HelloService.class);

        System.out.println(helloService.sayHello("Grey"));
    }

}
