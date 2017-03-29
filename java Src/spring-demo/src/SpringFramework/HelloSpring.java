package SpringFramework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args){
		//steps
		//load the spring configuration file 
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from spring container
		
		Coach c = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		
		System.out.println(c.getRegularWork());
		
		//close the context
		
		context.close();
	}
}
