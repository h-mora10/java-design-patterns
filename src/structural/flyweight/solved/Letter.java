package structural.flyweight.solved;

public class Letter {

    private String value;

    public Letter(String value) {
        this.value = value;
        System.out.println("New letter created with value: " + value);
    }

    public String getValue() {
        return value;
    }
}
