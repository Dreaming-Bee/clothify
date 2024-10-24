package edu.icet.controller.Admin.EmployeeManagement;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

public class AddEmployeeFormController {

    @FXML
    private JFXButton btnEmployeeRegister;

    @FXML
    private JFXComboBox<?> cmbAddEmployeeGender;

    @FXML
    private DatePicker dateAddEmployeeDOB;

    @FXML
    private JFXTextField txtAddEmployeeAddress;

    @FXML
    private JFXTextField txtAddEmployeeContact;

    @FXML
    private JFXTextField txtAddEmployeeEmail;

    @FXML
    private JFXTextField txtAddEmployeeNIC;

    @FXML
    private JFXTextField txtAddEmployeeName;

    @FXML
    private JFXTextField txtAddEmployeePassword;

    @FXML
    private JFXTextField txtEmployeeID;

    @FXML
    void btnEmployeeRegisterOnAction(ActionEvent event) {

    }

}
