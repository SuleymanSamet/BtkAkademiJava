package BtkAkademi.repositoryDemo;

public interface IEntityRepository<T extends IEntity >{
    void add(T entity);
    void delete(T entity);
    void uptade(T entity);
}
