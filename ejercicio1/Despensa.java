import java.util.ArrayList;

public class Despensa {
    private ArrayList<Ingredient> ingredientes;

    public Despensa() {
        this.ingredientes = new ArrayList<>();
    }

    public void addIngrediente(Ingredient ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public Ingredient getIngrediente(String name, int amount) {
        for (Ingredient ingrediente : this.ingredientes) {
            if (ingrediente.getName().equals(name)) {
                if (ingrediente.getQuantity() >= amount) {
                    ingrediente.sacar(amount);
                    return ingrediente;
                } else {
                    System.out.println("No hay suficiente " + name + " en la despensa.");
                    return null;
                }
            }
        }
        System.out.println("El ingrediente " + name + " no se encuentra en la despensa.");
        return null;
    }
}
