package Controller;

import Model.Entity.PersonEntity;
import Model.Service.WorkerService;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class WorkerFormController {
    public TextField a1;
    public TextField a2;
    public TextField a3;
    public TextField a4;
    public TextField a5;
    public TextField a6;
    public TextField a7;
    public TextField a8;
    public TextField a9;
    public CheckBox b1;
    public CheckBox b2;
    public CheckBox b3;
    public CheckBox b4;
    public CheckBox b5;
    public CheckBox b6;
    public CheckBox b7;
    public CheckBox b8;
    public CheckBox b9;
    public CheckBox b10;
    public CheckBox b11;
    public CheckBox b12;
    public CheckBox b13;
    public CheckBox b14;
    public CheckBox b15;
    public CheckBox b16;
    public CheckBox b17;
    public CheckBox b18;
    public CheckBox b19;
    public CheckBox b20;
    public CheckBox b21;
    public CheckBox b22;
    public CheckBox b23;
    public Button c1;

    public void c1Action(ActionEvent actionEvent)throws Exception{
        WorkerService.getInstance().save(new PersonEntity().setName(a1.getText()).setNationalID(a2.getText()).setBirthDate(a3.getText()).setMobileNumber(a4.getText()).setFatherName(a5.getText()).setVisaID(a6.getText()).setBirthPlace(a7.getText()).setPhoneNumber(a8.getText()).setDateEntry(a9.getText()));
        System.out.println("Database Updated!");
        System.exit(1);
    }
}
