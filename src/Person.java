
public class Person {
	
	
	public String name;
	private String jobTitle;
	int age;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String giveName() {
		return name.toString();
	}
	public String giveJobTitle() {
		return jobTitle.toString();
	}
	public int giveAge() {
		return age;
	}
	public void returnDetails() {
		System.out.println(giveName() + " " + giveJobTitle() + " " + giveAge());
	}
}
