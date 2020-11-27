package model;

public class Service {
    public Service(){

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
    public void update(Entity entity) throws Exception{
        try(Repository repository=new Repository()){
            repository.update(entity);
            repository.commit();
        }
    }

}