package Model.Service;

import Controller.WorkerFormController;
import Model.Entity.PersonEntity;
import Model.Repository.WorkerRepository;

public class WorkerService {
    private WorkerService(){}
    private static final WorkerService workerService=new WorkerService();
    public static WorkerService getInstance(){
        return workerService;
    }
    public void save(PersonEntity personEntity)throws Exception{
        try(WorkerRepository workerRepository=new WorkerRepository()){
            workerRepository.insert(personEntity);
            workerRepository.commit();
        }
    }
}
