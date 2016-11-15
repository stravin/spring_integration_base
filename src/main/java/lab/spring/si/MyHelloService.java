package lab.spring.si;

public class MyHelloService implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
