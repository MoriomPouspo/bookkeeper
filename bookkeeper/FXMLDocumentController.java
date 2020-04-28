/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookkeeper;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 *
 * @author Asus
 */
public class FXMLDocumentController implements Initializable {

    public Pane signUpPane;
    public Pane loginPane;
    public Button noAccountButton;
    public ImageView goBackButton;
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void handleNoAccountButtonPressed(ActionEvent actionEvent) {
        signUpPane.toFront();
    }

    public void handleMouseClickEvent(MouseEvent mouseEvent) {
        if(mouseEvent.getSource().equals(goBackButton)){
            loginPane.toFront();
        }
    }
}
