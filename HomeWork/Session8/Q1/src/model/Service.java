package model;

public class Service {
    private Service(){}
    private static Service service=new Service();
    public static Service getInstance(){
        return service;
    }
    public void update(Entity entity,int num)throws Exception{
        try(Repository repository=new Repository()) {
            switch (num) {
                case 1:
                    entity.setCost( entity.getCost()+ 1000);
                    entity.setInternet(entity.internet + 2);
                    repository.commit();
                    break;
                case 2:
                    entity.setCost(entity.getCost() + 2000) ;
                    entity.setInternet(entity.getInternet()+ 4) ;
                    repository.commit();
                    break;
                case 3:
                    entity.setCost(entity.getCost() + 5000) ;
                    entity.setInternet(entity.getInternet() + 10) ;
                    repository.commit();
                    break;
                case 4:
                    entity.setCost(entity.getCost() + 10000) ;
                    entity.setInternet(entity.getInternet() + 25) ;
                    repository.commit();
                    break;
            }
            repository.update(entity);
            repository.commit();
        }

    }
}
