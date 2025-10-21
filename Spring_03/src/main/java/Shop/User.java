package Shop;

import java.awt.Container;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import electronic.Mobile;
import electronic.Airtel;

public class User {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ApplicationContext a=new AnnotationConfigApplicationContext(MyConfig.class);
		
		Mobile m=a.getBean(Mobile.class);//"mobile"--->excpicite typecaste
		m.Calling();
		
		shop sh=a.getBean(shop.class);//bean method present in the container
		System.out.println("Enter the payment amt");
		sh.doPayment(sc.nextInt());
		
		
//		User itself is not a Spring-managed bean (it has no @Component or other stereotype annotations).
//
//		You're not asking Spring to inject shop into User.
//
//		Instead, you are manually fetching shop from the Spring container using getBean(...).
//
//		Object obj = a.getBean("shop");
//		shop sh = (shop) obj; // Now you must cast manually

//		Demo d=new Demo();
	
		
	}

}
