package cm.suthan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suthan.bean.Customer;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer customer =(Customer)context.getBean("custom");
		System.out.println(customer.getCid());
		System.out.println(customer.getCname());
		System.out.println(customer.getCaddr());
		
	}

}
