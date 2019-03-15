/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entering;

/**
 *
 * @author abaskhayron
 */
public class Test {
    String card="1234";
    String[] arr = new String[5];
    int i=0;
    int j=0;
  private int balance=0;
    
    public boolean valid (String card){
        if(this.card.equals(card))
            return true;
    
    else return false;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public void history(String amount , String word)
    {
        if (i<4){
        arr[i]=(amount+" "+word);
        i++;
    }
        else{
        for(int k=0;k<3;k++){
            arr[k]=arr[k+1];
        }
        
        arr[i]=arr[i]=(amount+" "+word);
    }
    }
    public String nexthistory()
    {
        if(j<4){
        return arr[j++];
    }
        return arr[j];
    }
    public String previoushistory()
    {
        if(j>0){
        return arr[j--];
        }
        else return arr[j];
    }
    
    
}
    

