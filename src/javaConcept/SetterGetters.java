package javaConcept;

public class SetterGetters {
	
	
	
	public static void main(String[] args) {
		
		setergeter sg = new setergeter();
		sg.setName("Deeptha");
		String n = sg.getName();
		System.out.println(n);
		
	}
}

class setergeter{
	private String Name;
	private int RoolNo;
	private String College;
	
	
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setRoolNo(int RoolNo) {
		this.RoolNo = RoolNo;
	}
	
	public int getRoolNo() {
		return RoolNo;
	}
	
	public void setCollege(String College) {
		this.College = College;
	}
	
	public String getCollege() {
		return College;
	}

}