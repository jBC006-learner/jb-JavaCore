package springIOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// Testing the Singleton Bean Scope
		System.out.println("BeanScopeDemoAPp: Testing Singleton Bean Scope");
//		Load the Spring 'Bean' Config file;
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
//		Retrieve all the beans necessary;
		Course theCourse  = context.getBean("myCourse", Course.class);
		Course beanCourse  = context.getBean("myCourse", Course.class);
//		Check whether the above two objects are Same;
		boolean checkEquality = (theCourse == beanCourse);
//		print the output
		System.out.println("Whether the objects 'theCourse' and 'beanCourse' Equal: " +checkEquality);
		System.out.println("Memory Location:> theCourse: " +theCourse);
		System.out.println("Memory Location:> beanCourse: "  +beanCourse);
//		close context
		context.close();
		
		
				

	}

}
