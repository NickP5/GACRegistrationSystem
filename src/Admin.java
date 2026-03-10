
// Pavla Yakimova coded this class
import java.util.ArrayList;
import java.util.List;


public class Admin {
	
	private int adminID;
	private String username;
	private String password;
	private List<Class> classes;
	private List<Student> students;
	
	// Initialize constructor
	public Admin(int adminID,String username, String password, List<Class> classes, List<Student> students) {
		this.adminID = adminID;
		this.username = username;
		this.password = password;
		this.classes = classes;
		this.students = students;
	}

		
	// Methods
	private void changePassword(String newPassword) {
		// set new password
		this.password = newPassword;
	}
	
	private Class createClass(String className, String classDescription, String department, int level, String time, List<String> classPreReqs, String semester, String professor, boolean dayOrNight, int credits) {
		
		// create a new class with the given values
		Class newClass = new Class(className, classDescription, department, level, time, classPreReqs, semester, professor, dayOrNight, credits);
		
		// add it to the class list
		classes.add(newClass); 
		
		return newClass;
		
	}
	
	protected void editClass(String className, String newDescription, String newDepartment, int newLevel, String newTime, List<String> newPreReqs, String newSemester, String newProfessor, boolean newDayorNight, int newCredits) {
		
		// loop through the list of classes to find the one needing editing
		for (Class c : classes) {
			
			if (c.getClassName() == className) {
				
				c.setClassDescription(newDescription);
				c.setDepartment(newDepartment);
				c.setLevel(newLevel);
				c.setTime(newTime);
				c.setClassPreReqs(newPreReqs);
				c.setSemester(newSemester);
				c.setProfessor(newProfessor);
				c.setDayorNight(newDayorNight);
				
				// print message that class has been updated.
				System.out.println("The class has successfuly been updated.");
				
			} else {
				// if no class was found print message
				System.out.println("The requested class could not be updated. Class did not exist.");
			}
		}
	}
	
	private Student addStudent(int studentID, String username, String password, int grade_level, double gpa, int credits, Degree degree, List<Class> classes, boolean graduated, String status) {
		
		// create new student
		Student newStudent = new Student(studentID, username, password, grade_level, gpa, credits, degree, classes, graduated, status);
		
		// add the new student to the array list
		students.add(newStudent);
		
		return newStudent;
		
	}
	
	private void removeStudent(Student student) {
		// remove student from the list
		students.remove(student);
	}
	
	private void editStudent(int studentID, String newUsername, String newPassword, int newGradeLevel, double newGpa, int newCredits, ArrayList<Class> newClasses, boolean graduated, String newStatus) {
		
		// loop through all students in array
		for (Student s : students) {
			
			// if the studentID finds a match update all fields and send message
			if (s.getStudentID() == studentID) {
				
				s.setUsername(newUsername);
				s.setPassword(newPassword);
				s.setGradeLevel(newGradeLevel);
				s.setGPA(newGpa);
				s.setCredits(newCredits);
				s.setGraduated(graduated);
				s.setClasses(newClasses);
				s.setStatus(newStatus);
				
				System.out.println("The student has successfully been updated.");
			}
			else {
				// if no match send corresponding message
				System.out.println("The student could not be updated.");
			}
		}
	}
	
	// updates the major of the student
	private void updateMajor(int studentID, String newMajor) {
		
		for (Student s : students) {
			if (s.getStudentID() == studentID) {
				Degree d = s.getDegree();
				d.major.majorName = newMajor;
				System.out.println("The student major has been updated.");
			}
			else {
				System.out.println("The student major could not be updated.");
			}
		}
	}
	
	// updates the minor of the student 
	private void updateMinor(int studentID, String newMinor) {
		
		for (Student s : students) {
			if (s.getStudentID() == studentID) {
				Degree d = s.getDegree();
				d.minor.minorName = newMinor;
				System.out.println("The student minor has been updated.");
			}
			else {
				System.out.println("The student minor could not be updated.");
			}
		}
	}
	
    public static void main (String[] args) {
    
    	List<String> softwarePreReqs = List.of("Systems 1", "Systems 2");
    	Class softwareEngineering = new Class("Software Engineering", "teaching how to engineer software", "MCS", 300, "12:00-1:35", softwarePreReqs, "Spring 2026", "Louis Yu", true, 4);
    	Class gameDev = new Class("Software Engineering", "teaching how to engineer software", "MCS", 300, "12:00-1:35", softwarePreReqs, "Spring 2026", "Louis Yu", true, 4);
    	List<Class> louisClasses = List.of(softwareEngineering, gameDev);
    	List<String> majorReqs = List.of("MCS101", "MCS102");
    	List<String> minorReqs = List.of("MCS212", "MCS201");
    	Degree.Major ComputerScience = new Degree.Major("ComputerScience", 123, majorReqs, false);
    	Degree.Minor Stats = new Degree.Minor("Stats", 321, minorReqs, false);
    	Degree CS = new Degree(ComputerScience, Stats, 123, 321, false);
    	Student Alexander = new Student(123, "Lex", "stuff",4, 4.0,42 , CS, louisClasses , true, "Evil");
    	Student Lex = new Student(123, "Lex", "stuff",4, 4.0,42 , CS, louisClasses , true, "Evil");
    	List<Student> students = List.of(Alexander, Lex);
    	
    	Admin MainA = new Admin(123, "Pavla", "hello123", louisClasses, students);
    	MainA.updateMinor(123, "Art");
    	System.out.println(Lex.getDegree().minor.minorName);
    	
    }
		
}
