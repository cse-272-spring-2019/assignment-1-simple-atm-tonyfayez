/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import entering.Test;
import javafx.scene.control.Button;
import static java.awt.SystemColor.text;
import java.security.PrivateKey;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author abaskhayron
 */
public class Input {
    Scene scene;
    Depositescene deposite;
    Withdrawal withdrawal;
    public Input(Test test,Stage stage){
                GridPane grid= new GridPane();

        scene= new Scene(grid,500,300);
        deposite = new Depositescene (test, stage,scene);
        withdrawal=new Withdrawal(test, stage,scene);
        Button Withdrawal= new Button("Withdrawal");
        Button Deposit= new Button("Deposit");
        Button Balance= new Button("Balance");
        Button next= new Button("next");
        Button previuos= new Button ("previuos");
        Label balance=new Label();
        Label history=new Label();
       
        
       
        grid.add(Withdrawal,0,0);
        grid.add(Deposit,1,0);
        grid.add(Balance, 2, 0);
        grid.add(next, 2, 1);
        grid.add(previuos , 0, 1);   
        grid.add(balance ,2, 2);
         grid.add(history ,2, 3);
        /*---------------------------------------------*/
        Balance.setOnAction(e->{
         int y=test.getBalance();
        String value;
        value=Integer.toString(y);
        balance.setText(value);
        });
        Deposit.setOnAction(e->{
            stage.setScene(deposite.getScene());
        
        });
        
      Withdrawal.setOnAction(e->{
      stage.setScene(withdrawal.getScene());
      });
      next.setOnAction(e->{
      history.setText(test.nexthistory());
      });
      previuos.setOnAction(e->{
     history.setText(test.previoushistory());
      });
        
} 

    public Scene getScene() {
        return scene;
    }    
}