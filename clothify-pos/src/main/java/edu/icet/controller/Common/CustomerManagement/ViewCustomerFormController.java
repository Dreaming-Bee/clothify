package edu.icet.controller.Common.CustomerManagement;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewCustomerFormController {

    @FXML
    private TableColumn<?, ?> colCustContact;

    @FXML
    private TableColumn<?, ?> colCustEmail;

    @FXML
    private TableColumn<?, ?> colCustID;

    @FXML
    private TableColumn<?, ?> colCustNIC;

    @FXML
    private TableColumn<?, ?> colCustName;

    @FXML
    private TableColumn<?, ?> colCustTitle;

    @FXML
    private TableView<?> tblCustomer;

}
