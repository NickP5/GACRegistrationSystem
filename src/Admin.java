
// Pavla Yakimova coded this class
import java.util.ArrayList;
import java.util.List;


public class Admin {
	
	private int adminID;
	private String username;
	private String password;
	private ArrayList<Class> classes;
	private ArrayList<Student> students;
	
	// Initialize constructor
	public Admin(int adminID,String username, String password, ArrayList<Class> classes, ArrayList<Student> students) {
		this.adminID = adminID;
		this.username = username;
		this.password = password;
		this.classes = new ArrayList<>();
		this.students = new ArrayList<>();
	}

		
	// Methods
	private void changePassword(String newPassword) {
		// set new password
		this.password = newPassword;
	}
	
	private Class createClass(String classDescription, String department, int level, String time, ArrayList<String> preReqs, int semester, String professor, String name, boolean dayOrNight) {
		
		// create a new class with the given values
		Class newClass = new Class(classDescription, department, level, time, preReqs, semester, professor, name, dayOrNight);
		
		// add it to the class list
		this.classes.add(newClass);
		
		return newClass;
		
	}
	
	private void editClass(String className, String newDescription, String newDepartment, int newLevel, String newTime, ArrayList<String> newPreReqs, int newSemester, String newProfessor, boolean newDayorNight) {
		
		// loop through the list of classes to find the one needing editing
		for (Class c : this.classes) {
			
			if (c.getName() == className) {
				
				c.setClassDescription(newDescription);
				c.setDepartment(newDepartment);
				c.setLevel(newLevel);
				c.setTime(newTime);
				c.setClassPreReeqs(newPreReqs);
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
	
	private Student addStudent(int studentID, String username, String password, int grade_level, double gpa, int credits, Object major, ArrayList<Class> Classes, boolean graduated, String status) {
		
		// create new student
		Student newStudent = new Student(studentID, username, password, grade_level, gpa, major, Classes, graduated, status);
		
		// add the new student to the array list
		this.students.add(newStudent);
		
		return newStudent;
		
	}
	
	private void removeStudent(Student student) {
		// remove student from the list
		this.students.remove(student);
	}
	
	private void editStudent(int studentID, String newUsername, String newPassword, int newGradeLevel, double newGpa, int newCredits, ArrayList<Class> newClasses, boolean graduated, String newStatus) {
		
		// loop through all students in array
		for (Student s : this.students) {
			
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
	private void updateMajor(int studentID, Major newMajor) {
		
		for (Student s : this.students) {
			if (s.getStudentID() == studentID) {
				Degree d = s.getDegree();
				d.setMajor(newMajor);
				System.out.println("The student major has been updated.");
			}
			else {
				System.out.println("The student major could not be updated.");
			}
		}
	}
	
	// updates the minor of the student 
	private void updateMinor(int studentID, Minor newMinor) {
		
		for (Student s : this.students) {
			if (s.getStudentID() == studentID) {
				Degree d = s.getDegree();
				d.setMinor(newMinor);
				System.out.println("The student minor has been updated.");
			}
			else {
				System.out.println("The student minor could not be updated.");
			}
		}
	}
	
    public static void main (String[] args) {
    	
    	List<Class> classes = new ArrayList<>();
    	classes.add(new Class());
    	List<Student> students = new ArrayList<>();
    	students.add(new Student());
    	Admin Main = new Admin(123, "Pavla", "hello123", classes, students);
    	
    }
		
}
