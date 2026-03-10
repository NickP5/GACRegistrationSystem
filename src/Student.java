
import java.util.List;

public class Student {
	int studentID;
	String username;
	String password;
	int grade_level;
	double gpa;
	public Degree degree; 
	private List<Class> classes;
	int credits;
	boolean graduated;
	String status;

	//Major major in Student
    public Student(int studentID, String username, String password, int grade_level, double gpa, int credits, Degree degree, List<Class> classes, boolean graduated, String status) {
        this.studentID = studentID;
        this.username = username;
        this.password = password;
        this.grade_level = grade_level;
        this.gpa = gpa;
        this.degree = degree;
        this.classes = classes;
        this.credits = credits;
        this.graduated = graduated;
        this.status = status;
    }

    public int getstudentID() { return studentID; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public int getGradeLevel() { return grade_level; }
    public double getGpa() { return gpa; }
    public Degree getDegree() { return degree; } 
    public List<Class> getClasses(){ return this.classes; }
    public int getCredits() { return credits; }
    public boolean getGraduated() { return graduated; }
    public String getStatus() { return status; }
    
    //Functions
    private void addClass(Class newClass) {
    	this.classes.add(newClass);
    }
    
    private void dropClass(String delClass) {
    	for (Class c : classes) {
    		if (c.getClassName() == delClass) {
    			this.classes.remove(c);
    		}
    	}
    	
    }
    
    private void changeDegree(String newMajor, String newMinor) {
    	//Changes minor and major
    	degree.major.majorName = newMajor;
    	degree.minor.minorName = newMinor;
    }
    
    private String changePassword(String newPassword){
    	this.password = newPassword;
	    return "Password updated"; 
	    	
	}
    //Testing
    public static void main (String[] args) {
    	// CHANGE STRING TO CLASS TYPE
    	List<String> softwarePreReqs = List.of("Systems 1", "Systems 2");
    	Class softwareEngineering = new Class("Software Engineering", "teaching how to engineer software", "MCS", 300, "12:00-1:35", softwarePreReqs, "Spring 2026", "Louis Yu", true, 4);
    	Class gameDev = new Class("Software Engineering", "teaching how to engineer software", "MCS", 300, "12:00-1:35", softwarePreReqs, "Spring 2026", "Louis Yu", true, 4);
    	List<Class> louisClasses = List.of(softwareEngineering, gameDev);
    	List<String> majorReqs = List.of("MCS101", "MCS102");
    	List<String> minorReqs = List.of("MCS212", "MCS201");
    	Degree.Major ComputerScience = new Degree.Major("ComputerScience", 123, majorReqs, false);
    	Degree.Minor Stats = new Degree.Minor("Stats", 321, minorReqs, false);
    	Degree CS = new Degree(ComputerScience, Stats, 123, 321, false);
    	Student Alexander = new Student(123, "Lex", "stuff",4, 4.0, louisClasses, 42, CS, true, "Evil");
    	Alexander.changePassword("greatproject");
    	
    }

}