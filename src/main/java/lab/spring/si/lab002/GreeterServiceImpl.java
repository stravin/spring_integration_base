package lab.spring.si.lab002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class GreeterServiceImpl implements GreeterService {

    private final MessageChannel helloWorldChannel;

    @Autowired
    public GreeterServiceImpl(MessageChannel helloWorldChannel) {
        this.helloWorldChannel = helloWorldChannel;
    }

    @Override
    public void greet(String name) {
        helloWorldChannel.send(MessageBuilder.withPayload(name).build());
    }

}
