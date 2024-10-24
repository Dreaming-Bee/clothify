package edu.icet.controller.Common.ItemManagement;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewItemFormController {

    @FXML
    private TableColumn<?, ?> colItemCode;

    @FXML
    private TableColumn<?, ?> colItemName;

    @FXML
    private TableColumn<?, ?> colItemPrice;

    @FXML
    private TableColumn<?, ?> colItemQuantity;

    @FXML
    private TableColumn<?, ?> colItemSize;

    @FXML
    private TableColumn<?, ?> colItemSupplierID;

    @FXML
    private TableView<?> tblItem;

}
