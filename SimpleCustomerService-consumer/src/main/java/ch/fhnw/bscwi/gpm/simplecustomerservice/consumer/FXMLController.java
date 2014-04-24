package ch.fhnw.bscwi.gpm.simplecustomerservice.consumer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    @FXML
    private Label resultLabel;
    
    @FXML
    private TextField lastNameTextField;
    
    @FXML
    private TextField firstNameTextField;
    
    //private final CustomerService customerService = new CustomerService_Service().getCustomerServicePort();
    //private final CustomerRESTServiceClient customerRESTServiceClient = new CustomerRESTServiceClient();
    
    @FXML
    private void handleSOAPButtonAction(ActionEvent event) {
        //resultLabel.setText("SOAP: " + String.valueOf(customerService.isAlreadyACustomer(firstNameTextField.getText(), lastNameTextField.getText())));
    }
    
    @FXML
    private void handleRESTButtonAction(ActionEvent event) {
        //resultLabel.setText("REST: " + String.valueOf(customerRESTServiceClient.isAlreadyACustomer(firstNameTextField.getText(), lastNameTextField.getText())));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
