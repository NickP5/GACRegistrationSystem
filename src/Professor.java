import java.util.List;

// Alexander Jahnsen coded this class
public class Professor {

    public int professorID;
	private String username;
	private String password;
	public String department;
	// CHANGE STRING TO CLASS TYPE
	private List<Class> classes;
	public Boolean departmentChair;
    public String name;
    private int rank;

    public Professor( 
    		int professorID,
    		String username, 
    		String password, 
    		String department, 
    		List<Class> classes,
    		Boolean departmentChair, 
    		String name, 
    		int rank) {
        this.professorID = professorID;
    	this.username = username;
        this.password = password;
        this.department = department;
        this.classes = classes;
        this.departmentChair = false;
        this.name = name;
        this.rank = rank;
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
    
    public String changePassword(String newPassword){
    	this.password = newPassword;
	    return "Password updated"; 
	    	
	}

    public static void main (String[] args) {
    	// CHANGE STRING TO CLASS TYPE
    	List<String> softwarePreReqs = List.of("Systems 1", "Systems 2");
    	Class softwareEngineering = new Class("Software Engineering", "teaching how to engineer software", "MCS", 300, "12:00-1:35", softwarePreReqs, "Spring 2026", "Louis Yu", true, 4);
    	Class gameDev = new Class("Software Engineering", "teaching how to engineer software", "MCS", 300, "12:00-1:35", softwarePreReqs, "Spring 2026", "Louis Yu", true, 4);
    	List<Class> louisClasses = List.of(softwareEngineering, gameDev);
    	Professor Louis = new Professor(123, "Louis", "badproject","MCS",louisClasses,false,"Louis Yu",1);
    	Louis.changePassword("greatproject");
    	System.out.println(Louis.password);
    
    }
}
