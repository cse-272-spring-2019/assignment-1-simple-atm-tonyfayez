/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author abaskhayron
 */
public class atm extends Application{
    login login;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        login=new login(primaryStage);
        primaryStage.setScene(login.getScene());
        primaryStage.show();
    }
    
    
}
