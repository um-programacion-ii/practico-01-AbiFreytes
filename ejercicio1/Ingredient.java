public class Ingredient {
    private String name;
    private int quantity;

    //Constructor
    public Ingredient(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    //Getters
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //Overriding toString()
    @Override
    public String toString() {
        return "Ingredient: " +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '.';
    }
}
