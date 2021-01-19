package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
		Hello hello = new Hello();
		hello.setData("hello");
		String data123123123 = hello.getData();

		System.out.println("data123123123 = " + data123123123);
		SpringApplication.run(JpashopApplication.class, args);
	}

}
