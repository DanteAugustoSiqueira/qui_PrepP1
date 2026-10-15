import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PizzaDao dao = new PizzaDao();
        Scanner sc = new Scanner(System.in);

        // 1. INSERT (Inserir)
        Pizza p1 = new Pizza();
        p1.setId(1L);
        p1.setSabor("Calabresa");
        p1.setPreco(45.0);

        dao.inserir(p1);
        System.out.println("Pizza inserida com sucesso!");

        // 2. LIST (Listar)
        System.out.println("\n--- Lista de Pizzas ---");
        for (Pizza p : dao.listar()) {
            System.out.println("ID: " + p.getId() + " | Sabor: " + p.getSabor() + " | R$ " + p.getPreco());
        }

        // 3. UPDATE (Alterar)
        p1.setPreco(50.0); // Mudando o preço
        dao.alterar(p1);
        System.out.println("\nPreço alterado para R$ 50.0!");

        // 4. DELETE (Excluir)
        dao.excluir(1L);
        System.out.println("\nPizza excluída. Total na lista: " + dao.listar().size());

        sc.close();
    }
}