import java.util.List;

//This class was coded by Tanner Hadler
public class Class {
	private String className;
	private String classDescription;
	private String department;
	private int level;
	private String time;
	private List<String> classPreReqs;
	private String semester;
	private String professor;
	private boolean dayOrNight; //true if day, false if night
	private int credits; //number of credits each class is
	
	// to initialize Class
	public Class(
			String className,
			String classDescription,
			String department,
			int level,
			String time,
			List<String> classPreReqs,
			String semester,
			String professor,
			boolean dayOrNight,
			int credits) {
		this.className = className;
		this.classDescription = classDescription;
		this.department = department;
		this.level = level;
		this.time = time;
		this.classPreReqs = classPreReqs;
		this.semester = semester;
		this.professor = professor;
		this.dayOrNight = dayOrNight;
		this.credits = credits;
	}
	
	public String getClassName() {
		//this returns the name of the class
		return this.className;
	}
	
	
	
	public static void main(String[] args) {
		List<String> softwarePreReqs = List.of("Systems 1", "Systems 2");
		Class softwareEngineering = new Class("Software Engineering", "teaching how to engineer software", "MCS", 300, "12:00-1:35", softwarePreReqs, "Spring 2026", "Louis Yu", true, 4);
		softwareEngineering.getClassName();
	}
}