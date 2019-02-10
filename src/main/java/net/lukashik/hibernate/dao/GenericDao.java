package net.lukashik.hibernate.dao;

import java.util.Collection;

public interface GenericDao <T, ID>{
    Collection<T>getAll();

    void save(T t);
    void update(T t);
    void delete(T t);
    T getByID(ID id);


}
