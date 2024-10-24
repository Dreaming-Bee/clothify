package edu.icet.controller.Common.SupplierManagement;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AddSupplierFormController {

    @FXML
    private JFXButton btnSupplierRegister;

    @FXML
    private JFXComboBox<?> cmbAddSupplierTitle;

    @FXML
    private JFXTextField txtAddSupplierCompany;

    @FXML
    private JFXTextField txtAddSupplierContact;

    @FXML
    private JFXTextField txtAddSupplierEmail;

    @FXML
    private JFXTextArea txtAddSupplierItemList;

    @FXML
    private JFXTextField txtAddSupplierName;

    @FXML
    private JFXTextField txtSupplierID;

    @FXML
    void btnSupplierRegisterOnAction(ActionEvent event) {

    }

}
