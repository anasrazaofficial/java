package Generic;

import java.util.List;

public interface Persistance<T> {
    //Persistance = database operaions(crud)

    T post(T data);

    List<T> get();

    T put(T data);

    void delete(Integer id);
}
