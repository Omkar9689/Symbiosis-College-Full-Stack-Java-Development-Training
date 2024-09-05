package Employee;

class employee {
	private int empId;
	private String empName;
	
	private departments dp = new departments();
	
	public void setDept(int id,String name) {
		dp.setDepId(id);
		dp.setDepName(name);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return dp+" employee [empId=" + empId + ", empName=" + empName + "]";
	}	
}
