import java.util.List;

// This code was written by Nick Peterson
public class Degree {

	//Will become a major object
	public Major major;
	// Will become a minor object
	public Minor minor;
	public int majorID;
	public int minorID;
	public boolean completed;
	
	
	
	//Initialize Degree
    public Degree(Major major, Minor minor, int majorID, int minorID, boolean completed) {
        this.major = major;
        this.minor = minor;
        this.majorID = majorID;
        this.minorID = minorID;
        this.completed = false;
    }

    public Boolean isCompleted() {
    	
    	//Function to check if degree is completed, just returning the completed bool
    	return completed;
    }
    
    static class Minor {
    	
    	public int minorID;
    	public List<String> minorRequirements;
    	public Boolean completed;
    	
    	public Minor(int minorID, List<String> minorRequirements, Boolean completed) {
    		this.minorID = minorID;
    		this.minorRequirements = minorRequirements;
    		this.completed = false;
    	}
    	
    	public List<String> getMinorRequirements(){
    		//function to get all requirements for a specific minor
    		return minorRequirements;
    	}
    	
    }
    
    static class Major {
    	
    	public int majorID;
    	public List<String> majorRequirements;
    	public Boolean completed;
    	
    	public Major(int majorID, List<String> majorRequirements, Boolean completed) {
    		this.majorID = majorID;
    		this.majorRequirements = majorRequirements;
    		this.completed = false;
    	}
    	
    	public List<String> getMajorRequirements(){
    		//function to get all requirements for a specific major
    		return majorRequirements;
    	}
    	
    }
    
    
    public static void main (String[] args) {
    	
    	List<String> majorReqs = List.of("MCS101", "MCS102");
    	List<String> minorReqs = List.of("MCS212", "MCS201");
    	Degree.Major ComputerScience = new Degree.Major(123, majorReqs, false);
    	Degree.Minor Stats = new Degree.Minor(321, minorReqs, false);
    	Degree CS = new Degree(ComputerScience, Stats, 123, 321, false);
    	System.out.println(CS.isCompleted());
    }
	
}
