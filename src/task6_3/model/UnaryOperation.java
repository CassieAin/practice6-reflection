package task6_3.model;

public class UnaryOperation {
    private double value;

    public UnaryOperation() { }

    public UnaryOperation(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double increment(){
        return value++;
    }

    public double decrement(){
        return value--;
    }

    @Override
    public String toString() {
        return "UnaryOperation{" +
                "value=" + value +
                '}';
    }
}
