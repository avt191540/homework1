package pro.sky.java.course2.lesson1;

public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            service(car);
//            System.out.println("Обслуживаем " + car.modelName);
//            for (int i = 0; i < car.wheelsCount; i++) {
//                car.updateTyre();
//            }
//            car.checkEngine();
        } else if (truck != null) {
            service(truck);
//            System.out.println("Обслуживаем " + truck.modelName);
//            for (int i = 0; i < truck.wheelsCount; i++) {
//                truck.updateTyre();
//            }
//            truck.checkEngine();
//            truck.checkTrailer();
        } else if (bicycle != null) {
            service(bicycle);
//            System.out.println("Обслуживаем " + bicycle.modelName);
//            for (int i = 0; i < bicycle.wheelsCount; i++) {
//                bicycle.updateTyre();
//            }
        }
    }

    public void service(Car car) {
//        Bicycle b = car;
        System.out.println("Обслуживаем " + car.modelName);
        for (int i = 0; i < car.wheelsCount; i++) {
            car.updateTyre();
        }
        car.checkEngine();
    }

    public void service(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.modelName);
        for (int i = 0; i < bicycle.wheelsCount; i++) {
            bicycle.updateTyre();
        }
    }

    public void service(Truck truck) {
//        Bicycle t = truck;
        System.out.println("Обслуживаем " + truck.modelName);
        for (int i = 0; i < truck.wheelsCount; i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }
}
