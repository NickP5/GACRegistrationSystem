import java.util.List;

// Alexander Jahnsen coded this class
public class Professor {

    public int professorID;
	private String username;
	private String password;
	public String department;
	// CHANGE STRING TO CLASS TYPE
	private List<String> classes;
	public Boolean departmentChair;
    public String name;
    private int rank;

    public Professor( 
    		int professorID,
    		String username, 
    		String password, 
    		String department, 
    		List classes,
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

    public String editClass() {
    	// This is to change the description of a class, cannot be implemented yet
    	return name;
    	
    }
    
    public String changePassword(String newPassword){
    	this.password = newPassword;
	    return "Password updated"; 
	    	
	}

    public static void main (String[] args) {
    	// CHANGE STRING TO CLASS TYPE
    	List<String> louisClasses = List.of("MCS101","MCS374");
    	Professor Louis = new Professor(123, "Louis", "badproject","MCS",louisClasses,false,"Louis Yu",1);
    	Louis.changePassword("greatproject");
    
    }
}
