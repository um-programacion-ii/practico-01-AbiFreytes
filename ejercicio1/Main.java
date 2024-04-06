
public class Main {
    public static void main(String[] args) {
        Despensa despensa = new Despensa();

        Ingredient eggs = new Ingredient("Eggs", 3);
        Ingredient beefsteak = new Ingredient("Beefsteak", 10);
        Ingredient bread = new Ingredient("Bread", 4);

        despensa.addIngrediente(bread);
        despensa.getIngrediente("Bread", 3);

        System.out.println(eggs);
        System.out.println(beefsteak);
        System.out.println(bread);
    }
}
