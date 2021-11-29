package pro.sky.java.course2.lesson1;

public class Truck extends Car {
//    public String modelName;
//    public int wheelsCount;

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
//        this.modelName = modelName;
//        this.wheelsCount = wheelsCount;
    }

//    public void updateTyre() {
//        System.out.println("Меняем покрышку");
//    }
//
//    public void checkEngine() {
//        System.out.println("Проверяем двигатель");
//    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
