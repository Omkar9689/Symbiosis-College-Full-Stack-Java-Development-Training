package VehicleInfo;

public class FourWheeler extends Vehicle{
	
	private String vehicleCompany,vehicleModelName;
	private int vehicleCapacity;
	public FourWheeler() {
		System.out.println("Default Constructor (Four Wheeler)");
		vehicleCompany = "Mahindra";
		vehicleModelName = "THAR ROXX";
		vehicleCapacity = 6;
	}

	public FourWheeler(String vehicleCompany, String vehicleName) {
		this.vehicleCompany = vehicleCompany;
		this.vehicleModelName = vehicleName;
	}

	public String getVehicleCompany() {
		return vehicleCompany;
	}

	public void setVehicleCompany(String vehicleCompany) {
		this.vehicleCompany = vehicleCompany;
	}

	public String getVehicleModelName() {
		return vehicleModelName;
	}

	public void setVehicleModelName(String vehicleName) {
		this.vehicleModelName = vehicleName;
	}


	public int getVehicleCapacity() {
		return vehicleCapacity;
	}

	public void setVehicleCapacity(int vehicleCapacity) {
		this.vehicleCapacity = vehicleCapacity;
	}

	@Override
	public String toString() {
		return "TwoWheeler Vehicle Company : " + this.vehicleCompany + ", Vehicle Model : " + vehicleModelName;
	}

}
