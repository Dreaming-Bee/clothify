package edu.icet.controller.Common.ItemManagement;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SearchItemFormController {

    @FXML
    private JFXButton btnItemSearch;

    @FXML
    private JFXComboBox<?> cmbSearchItemSize;

    @FXML
    private JFXComboBox<?> cmbSearchItemSupplier;

    @FXML
    private JFXTextField txtSearchItem;

    @FXML
    private JFXTextField txtSearchItemName;

    @FXML
    private JFXTextField txtSearchItemPrice;

    @FXML
    private JFXTextField txtSearchItemQuantity;

    @FXML
    void btnItemSearchOnAction(ActionEvent event) {

    }

}
