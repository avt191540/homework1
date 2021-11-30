package pro.sky.java.course2.lesson1;

public class ServiceStation {

    public void check(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println();
            Vehicle vehicle = vehicles[i];
            service(vehicle);
        }
    }

    public void service(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.modelName);
        for (int i = 0; i < vehicle.wheelsCount; i++) {
            vehicle.updateTyre();
        }
        vehicle.checkEngine();
        vehicle.checkTrailer();
    }
}
