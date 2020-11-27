package controller;

import model.Entity;
import model.Service;
import view.Controller;

public class UserController {
    public void entry(Entity entity)throws Exception{
        Controller controller=new Controller();
        entity.setName(controller.name1.getText());
        entity.setUser(controller.username1.getText());
        entity.setPass(controller.password1.getText());
        entity.setEmail(controller.email1.getText());
        Service.getInstance().signup(entity);
    }
}
