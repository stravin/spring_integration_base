package lab.spring.si.lab001;

import org.springframework.stereotype.Service;

@Service
public class MyHelloService implements HelloService {

    @Override
    public void hello(String name) {
        System.out.println("Hello, " + name);
    }

}
