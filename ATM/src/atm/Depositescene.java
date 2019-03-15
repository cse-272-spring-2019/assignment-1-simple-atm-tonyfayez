/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import entering.Test;
import javafx.scene.control.Button;
import static java.awt.SystemColor.text;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Alert;

public class Depositescene {

   
   Scene scene;
   Alert alert;
   Input input;
    public Depositescene(Test test,Stage stage,Scene dScene) {
        alert =new Alert(Alert.AlertType.CONFIRMATION);
        TextField money=new TextField("enter the money");
        Button one= new Button("1");
        Button two= new Button("2");
        Button three= new Button("3");
        Button four= new Button("4");
        Button five= new Button("5");
        Button six= new Button("6");
        Button seven= new Button("7");
        Button eight= new Button("8");
        Button nine= new Button("9");
        Button zero= new Button("0");
        Button submit= new Button("submit");
        Button back= new Button("Back");
        TextField bar=new TextField("");
        GridPane grid= new GridPane();
        grid.add(one,0,0);
         grid.add(two,1,0);
          grid.add(three,2,0);
           grid.add(four,0,1);
            grid.add(five,1,1);
             grid.add(six,2,1);
              grid.add(seven,0,2);
               grid.add(eight,1,2);
                grid.add(nine,2,2);
                 grid.add(zero,0,3);
                 grid.add(bar,3,1);
                  grid.add(submit,3,2);
                  grid.add(back,3,3);
                 scene= new Scene(grid,500,300);
                 one.setOnAction(e->{
                 bar.setText(bar.getText()+"1");});
    
    two.setOnAction(e->{
                 bar.setText(bar.getText()+"2");});
    
three.setOnAction(e->{
                 bar.setText(bar.getText()+"3");});
    
four.setOnAction(e->{
                 bar.setText(bar.getText()+"4");});
    
five.setOnAction(e->{
                 bar.setText(bar.getText()+"5");});
    
six.setOnAction(e->{
                 bar.setText(bar.getText()+"6");});
    
seven.setOnAction(e->{
                 bar.setText(bar.getText()+"7");});
    
eight.setOnAction(e->{
                 bar.setText(bar.getText()+"8");});
    
nine.setOnAction(e->{
                 bar.setText(bar.getText()+"9");});
    
zero.setOnAction(e->{
                 bar.setText(bar.getText()+"0");});
submit.setOnAction(e->{
       if (bar.getText().isEmpty()){
           alert.setAlertType(Alert.AlertType.ERROR);
 alert.setContentText("you didnt enter a value");
    alert.show();
       }
       else{
    int x=Integer.parseInt(bar.getText());
    test.history(bar.getText(),"Deposit");
 int y=test.getBalance();
 int z=x+y;
 test.setBalance(z);
 alert.setAlertType(Alert.AlertType.INFORMATION);
    alert.setContentText("done your balance now is "+test.getBalance());
    alert.show();
       }
 
});
back.setOnAction(e->{
stage.setScene(dScene);
});
    

    }

    public Scene getScene() {
        return scene;
    }
    
    
}
