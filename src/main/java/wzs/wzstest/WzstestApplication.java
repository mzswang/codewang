package wzs.wzstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class WzstestApplication {
	public static void main(String[] args) {
		SpringApplication.run(WzstestApplication.class, args);
		System.out.println("恭喜，HELLO！");
	}

}

