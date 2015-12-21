package zinjvi.messenger.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({JmsConfig.class})
public class MessengerSenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessengerSenderApplication.class, args);
    }
}
