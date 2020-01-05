package springIOC;

import java.util.Random;

public class RandomCourseService implements CourseService {
	
//	Creating Array of Strings;
	private String[] arrayData= {"AWS", "Azure", "Google Cloud", "PCF"};
//	Creating a Random number(to iterate Array) generator from Random Class; java.util.Random;
	
	private Random myRandomNumber = new Random();

	@Override
	public String getService() {
	
//	pick Random Number form given array;
	int arrayIndex = myRandomNumber.nextInt(arrayData.length);
	
	String theCourseArrayData = arrayData[arrayIndex];
	return theCourseArrayData;

 }
}