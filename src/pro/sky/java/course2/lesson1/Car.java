package pro.sky.java.course2.lesson1;

public class Car extends Bicycle {
//    public String modelName;
//    public int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
//        this.modelName = modelName;
//        this.wheelsCount = wheelsCount;
    }

//    public void updateTyre() {
//        System.out.println("Меняем покрышку");
//    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
