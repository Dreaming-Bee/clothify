package edu.icet.controller.Admin.EmployeeManagement;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

public class SearchEmployeeFormController {

    @FXML
    private JFXButton btnEmployeeSearch;

    @FXML
    private JFXComboBox<?> cmbSearchEmployeeGender;

    @FXML
    private DatePicker dateSearchEmployeeDOB;

    @FXML
    private JFXTextField txtSearchEmp;

    @FXML
    private JFXTextField txtSearchEmployeeAddress;

    @FXML
    private JFXTextField txtSearchEmployeeContact;

    @FXML
    private JFXTextField txtSearchEmployeeEmail;

    @FXML
    private JFXTextField txtSearchEmployeeNIC;

    @FXML
    private JFXTextField txtSearchEmployeeName;

    @FXML
    void btnEmployeeSearchOnAction(ActionEvent event) {

    }

}
