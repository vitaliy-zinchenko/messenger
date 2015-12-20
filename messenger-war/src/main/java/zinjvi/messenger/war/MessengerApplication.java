package zinjvi.messenger.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({CxfConfiguration.class})
public class MessengerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessengerApplication.class, args);
    }
}
