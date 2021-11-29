package pro.sky.java.course2.lesson1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);
//        car.modelName = "car1";
//        car2.modelName = "car2";
//        car.wheelsCount = 4;
//        car2.wheelsCount = 4;

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);
//        truck.modelName = "truck1";
//        truck2.modelName = "truck2";
//        truck.wheelsCount = 6;
//        truck2.wheelsCount = 8;

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
//        bicycle.modelName = "bicycle1";
//        bicycle2.modelName = "bicycle2";
//        bicycle.wheelsCount = 2;
//        bicycle2.wheelsCount = 2;

        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}
