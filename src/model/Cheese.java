package model;

public class Cheese {
	
    private String name = "cheese" ;
	private String cheeseType ;
    
    public Cheese(String name) {
    	this.cheeseType = name ;
    }

	

	public  String getCheeseName() {
		return cheeseType;
	}

	public void setCheeseName(String cheeseName) {
		this.cheeseType = cheeseName;
	}

	@Override
	public String toString() {
		return cheeseType + " " + name ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	public static int compare(Cheese c1, Cheese c2) {
		return c1.cheeseType.compareTo(c2.cheeseType);
		
	}
	
}
