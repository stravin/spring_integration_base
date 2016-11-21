package lab.spring.si.lab000;

public class MyHelloService implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
