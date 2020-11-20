package model;

import java.util.List;

public class Service {
    private Service(){

    }
    private static Service service=new Service();
    public static Service getInstance(){
        return service;
    }
    public void signup(Entity entity) throws Exception{
        try (Repository repository=new Repository()){
            repository.insert(entity);
            repository.commit();
        }
    }
    public void login(Entity entity) throws Exception{
        try(Repository repository=new Repository()){
            repository.update(entity);
            repository.commit();
        }
    }
    public List<Entity> report()throws Exception{
        List<Entity> entityList;
        try(Repository repository=new Repository()){
            entityList=repository.select();
        }
        return entityList;
    }
}
