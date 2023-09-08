package parkingsystem;

public class ParkingSystem {
	
	private int[] parkingSlots;

    public ParkingSystem(int big, int medium, int small) {
        parkingSlots = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        if (carType < 1 || carType > 3) {
          
            return false;
        }

        if (parkingSlots[carType - 1] > 0) {
           
            parkingSlots[carType - 1]--;
            return true;
        } else {
         
            return false;
        }
    }



    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 2, 3);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));

}
}