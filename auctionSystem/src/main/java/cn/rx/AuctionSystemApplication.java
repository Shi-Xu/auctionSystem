package cn.rx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author ranxu
 */
@SpringBootApplication
@EnableCaching
@MapperScan("cn.rx.dao.*")
public class AuctionSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuctionSystemApplication.class, args);
	}

}
