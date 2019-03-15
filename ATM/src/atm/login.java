/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import entering.Test;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import static java.awt.SystemColor.text;
import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author abaskhayron
 */
public class login{
    Scene scene;
    Test test;
    Input input;
    Alert alert= new Alert(Alert.AlertType.ERROR);
    Depositescene deposite;
            
    public login(Stage stage){
    test=new Test();
    input=new Input(test,stage);
    
    GridPane grid=new GridPane();
        Label pass= new Label("password");
    TextField password=new TextField();
    Button submit= new Button("submit");
    grid.add(pass, 0, 0);
    grid.add(password,1,0);
     grid.add(submit,1,1);
    scene= new Scene (grid,400,200);
    submit.setOnAction( event -> {
        if( test.valid(password.getText()))
        {
                stage.setScene(input.getScene());
        }
        else{
            alert.setContentText("insert the right card please");
           alert.show();
        }
    });
            }
    public Scene getScene() {
        return scene;
    }
    
    
}
