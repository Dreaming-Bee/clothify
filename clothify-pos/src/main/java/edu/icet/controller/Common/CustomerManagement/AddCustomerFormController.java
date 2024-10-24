package edu.icet.controller.Common.CustomerManagement;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AddCustomerFormController {

    @FXML
    private JFXButton btnCustomerRegister;

    @FXML
    private JFXComboBox<?> cmbAddCustomerTitle;

    @FXML
    private JFXTextField txtAddCustomerContact;

    @FXML
    private JFXTextField txtAddCustomerEmail;

    @FXML
    private JFXTextField txtAddCustomerNIC;

    @FXML
    private JFXTextField txtAddCustomerName;

    @FXML
    private JFXTextField txtCustomerID;

    @FXML
    void btnCustomerRegisterOnAction(ActionEvent event) {

    }

}
