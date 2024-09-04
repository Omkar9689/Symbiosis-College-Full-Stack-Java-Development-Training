package VehicleInfo;

public class TwoWheeler extends Vehicle {
	
	private String vehicleCompany,vehicleModelName;

	public TwoWheeler() {
		System.out.println("Default Constructor (Two Wheeler)");
		vehicleCompany = "Bajaj";
		vehicleModelName = "Pulsar 150";
	}

	public TwoWheeler(String vehicleCompany, String vehicleName) {
		this.vehicleCompany = vehicleCompany;
		this.vehicleModelName = vehicleName;
	}

	public String getVehicleCompany() {
		return vehicleCompany;
	}

	public void setVehicleCompany(String vehicleCompany) {
		this.vehicleCompany = vehicleCompany;
	}

	public String getVehicleName() {
		return vehicleModelName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleModelName = vehicleName;
	}

	@Override
	public String toString() {
		return "TwoWheeler Vehicle Company : " + this.vehicleCompany + ", Vehicle Model : " + vehicleModelName;
	}
}
