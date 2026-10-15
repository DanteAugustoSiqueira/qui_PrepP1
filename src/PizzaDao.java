import java.util.ArrayList;
import java.util.List;

public class PizzaDao implements InterfaceDao<Pizza> {
    private List<Pizza> banco = new ArrayList<>();

    @Override
    public void inserir(Pizza p) {
        banco.add(p);
    }

    @Override
    public void alterar(Pizza p) {
        for (int i = 0; i < banco.size(); i++) {
            if (banco.get(i).getId().equals(p.getId())) {
                banco.set(i, p);
                break;
            }
        }
    }

    // Usando funçao Lambda
    @Override
    public void excluir(Long id) {
        banco.removeIf(p -> p.getId().equals(id));
    }
    //Sem funçao Lambda
    /*
    * @Override
public void excluir(Long id) {
    Pizza pizzaParaRemover = null;

    // Procura a pizza na lista pelo ID
    for (Pizza p : banco) {
        if (p.getId().equals(id)) {
            pizzaParaRemover = p;
            break;
        }
    }

    // Se encontrou, remove da lista
    if (pizzaParaRemover != null) {
        banco.remove(pizzaParaRemover);
    }
}*/


    @Override
    public List<Pizza> listar() {
        return banco;
    }
}