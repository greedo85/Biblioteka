import java.util.List;

public interface RepositoryInterface<T> {

    void add(T t);
    T getById( int id);
    T getByString(String text);
    void remove(int id);
    List getAll();
    void update(T t);

}
