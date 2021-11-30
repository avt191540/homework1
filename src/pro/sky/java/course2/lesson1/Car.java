package pro.sky.java.course2.lesson1;

public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель Car");
    }

}
