package VehicleInfo;

public class VehicleData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Vehicle v = new Vehicle();
		System.out.println(v);
		
		System.out.println("---------------------------------------");
		
		TwoWheeler tv = new TwoWheeler();
		tv.setVehicleType("Two Wheeler");
		System.out.println("Vehicle Id :- "+tv.getVehicleId());
		System.out.println("Vehicle Type :- "+tv.getVehicleType());
		System.out.println(tv);
		
		System.out.println("----------------------------------------------");
		
		FourWheeler fv = new FourWheeler();
		System.out.println("Vehicle Id :- "+fv.getVehicleId());
		System.out.println("Vehicle Type :- "+fv.getVehicleType());
		System.out.println(fv);
	}

}
