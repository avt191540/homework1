package pro.sky.java.course2.lesson1;

public class Bicycle {
    public String modelName;
    public int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
