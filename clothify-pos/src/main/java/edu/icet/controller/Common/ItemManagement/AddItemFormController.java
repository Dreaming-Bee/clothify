package edu.icet.controller.Common.ItemManagement;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AddItemFormController {

    @FXML
    private JFXButton btnItemRegister;

    @FXML
    private JFXComboBox<?> cmbAddItemSize;

    @FXML
    private JFXComboBox<?> cmbAddItemSupplier;

    @FXML
    private JFXTextField txtAddItemName;

    @FXML
    private JFXTextField txtAddItemPrice;

    @FXML
    private JFXTextField txtAddItemQuantity;

    @FXML
    private JFXTextField txtItemCode;

    @FXML
    void btnItemRegisterOnAction(ActionEvent event) {

    }

}
