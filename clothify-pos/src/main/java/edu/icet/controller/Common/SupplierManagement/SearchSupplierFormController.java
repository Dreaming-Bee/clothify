package edu.icet.controller.Common.SupplierManagement;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SearchSupplierFormController {

    @FXML
    private JFXButton btnSupplierSearch;

    @FXML
    private JFXComboBox<?> cmbSearchSupplierTitle;

    @FXML
    private JFXTextField txtSearchSupplier;

    @FXML
    private JFXTextField txtSearchSupplierCompany;

    @FXML
    private JFXTextField txtSearchSupplierContact;

    @FXML
    private JFXTextField txtSearchSupplierEmail;

    @FXML
    private JFXTextArea txtSearchSupplierItemList;

    @FXML
    private JFXTextField txtSearchSupplierName;

    @FXML
    void btnSupplierSearchOnAction(ActionEvent event) {

    }

}
