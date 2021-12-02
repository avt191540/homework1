package pro.sky.java.course2.lesson1;

public abstract class Vehicle {
    protected final String modelName;
    protected final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public abstract void updateTyre();

    public abstract void service();
}
