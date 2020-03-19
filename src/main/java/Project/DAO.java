package Project;

import java.io.IOException;
import java.util.Collection;
import java.util.Optional;

public interface DAO<T> {

//    Optional<T>get(int ID);
    Collection getAll() throws IOException;
    boolean save(T obj);
    void cancel(int ID);
    void create(T obj);




}
