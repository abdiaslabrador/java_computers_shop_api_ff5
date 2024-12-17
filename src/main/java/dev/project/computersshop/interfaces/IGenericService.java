package dev.project.computersshop.interfaces;

import java.util.List;

public interface IGenericService<T, S> {

    public List<T> findAll();
    public T save(S dto);
    public T getById(int id);

}