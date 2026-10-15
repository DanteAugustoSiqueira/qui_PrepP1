import java.util.List;

public interface InterfaceDao<T> {
    void inserir(T obj);
    void alterar(T obj);
    void excluir(Long id);
    List<T> listar();
}