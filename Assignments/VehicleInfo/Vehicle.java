package VehicleInfo;

public class Vehicle {
	private int vehicleId;
	private String vehicleType;
	
	public Vehicle() {
		System.out.println("Default Constructor of Vehicle");
		vehicleId= 123;
		vehicleType = "Four Wheeler";
	}

	public Vehicle(int vehicleId, String vehicleType) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "Vehicle Id : " + this.vehicleId + ", Type : " + vehicleType;
	}	
}
