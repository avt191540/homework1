package pro.sky.java.course2.lesson1;

public class ServiceStation {

    public void check(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println();
            vehicles[i].service();
        }
    }
}
