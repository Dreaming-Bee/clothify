package edu.icet.controller.Common.CustomerManagement;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SearchCustomerFormController {

    @FXML
    private JFXButton btnCustomerSearch;

    @FXML
    private JFXComboBox<?> cmbSearchCustomerTitle;

    @FXML
    private JFXTextField txtSearchCust;

    @FXML
    private JFXTextField txtSearchCustomerContact;

    @FXML
    private JFXTextField txtSearchCustomerEmail;

    @FXML
    private JFXTextField txtSearchCustomerNIC;

    @FXML
    private JFXTextField txtSearchCustomerName;

    @FXML
    void btnCustomerSearchOnAction(ActionEvent event) {

    }

}
