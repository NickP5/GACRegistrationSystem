
import java.util.List;

public class Student {
	int studentID;
	String username;
	String password;
	int grade_level;
	double gpa;
	//Major major; 
	private List<String> classes;
	int credits;
	boolean graduated;
	String status;

	//Major major in Student
    public Student(int studentID, String username, String password, int grade_level, double gpa, List<String> classes, int credits, boolean graduated, String status) {
        this.studentID = studentID;
        this.username = username;
        this.password = password;
        this.grade_level = grade_level;
        this.gpa = gpa;
        //this.major = major;
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
    //public Major getMajor() { return major;} 
    public List<String> getClasses(){ return this.classes; }
    public int getCredits() { return credits; }
    public boolean getGraduated() { return graduated; }
    public String getStatus() { return status; }
    
    //Functions
    public void addClass(String newClass) {
    	this.classes.add(newClass);
    }
    
    public void dropClass(String delClass) {
    	this.classes.remove(delClass);
    	
    }
    
    public void changeMajor(String newMajor) {
    	//this.major = newMajor(object??)
    }
    
    public String changePassword(String newPassword){
    	this.password = newPassword;
	    return "Password updated"; 
	    	
	}
    //Testing
    public static void main (String[] args) {
    	// CHANGE STRING TO CLASS TYPE
    	List<String> louisClasses = List.of("MCS101","MCS374");
    	Student Alexander = new Student(123, "Lex", "stuff",4, 4.0, louisClasses, 42, true, "Evil");
    	Alexander.changePassword("greatproject");
    	
    }

}