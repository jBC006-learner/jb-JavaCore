package springIOC;

public class SpringCourse implements Course {

	@Override
	public String getDailyCourse() {
		return "SpringCourse is new Configured: Practice Spring More in a Day";
	}

	@Override
	public String getDailyService() {
		return null;
	}
	
	

}
