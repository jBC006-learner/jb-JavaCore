package springIOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionAppDemo {

	public static void main(String[] args) {

		System.out.println("Achiveing DI_Setter Injection: Main Class SetterInjectionAppDemo:");
//		Load Spring configuration File;
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
//		Retrieve Bean from Spring Container;
		
//		OracleCourse theCourse = context.getBean("myCourseService", OracleCourse.class); 
//		above Bean gives following error: Exception in thread "main" org.springframework.beans.factory.BeanNotOfRequiredTypeException
		
		OracleCourse theOracleCourse = context.getBean("myOracleCourse", OracleCourse.class); 
		
//		Call Methods on the Bean;
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Calling Overrided External Method getDailyCourse(): " +theOracleCourse.getDailyCourse());
		System.out.println("Calling Overrided External Method getDailyService(): " +theOracleCourse.getDailyService());
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Literal Injection -Call new methods for emailAddress and devTeam:");
		System.out.println("eamiAddress:" +theOracleCourse.getEmailAddress());
		System.out.println("devTeam:" +theOracleCourse.getDevTeam());
//		Close the Context;
		context.close();

	}

}
