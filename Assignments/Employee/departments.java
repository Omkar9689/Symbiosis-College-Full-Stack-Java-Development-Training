package Employee;

class departments {
	private int depId;
	private String depName;
	public departments() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Department Constructor Created");
		this.depId = 121;
		this.depName = "Management";
	}
	
	
	
	public int getDepId() {
		return depId;
	}



	public void setDepId(int depId) {
		this.depId = depId;
	}



	public String getDepName() {
		return depName;
	}



	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Override
	public String toString() {
		return "departments [depId=" + depId + ", depName=" + depName + "] \n";
	}
	
	
}
