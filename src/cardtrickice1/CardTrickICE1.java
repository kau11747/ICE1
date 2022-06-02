/*AMANJEET KAUR BOLA    STUDENT ID:991660553
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

import java.util.Random;
import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Card[] magicHand = new Card[7]; //Array of object
        
System.out.println("Please choose any card");
//Random number=new Random();

        for (int i=0; i<magicHand.length;i++) {
            Card c1 = new Card();
            
            //c1.setValue(int)(Math.random()*13+1); //use a method to generate random *13
            c1.setSuits("hearts");//random method suit 
        
        

//step 2:take input 
    magicHand[i] = c1;
    System.out.println(c1);
        
        //step 3: match with array 
        Scanner input=new Scanner(System.in);
    System.out.println("Enter suit: ");
    String suit=input.nextLine();
    
    System.out.println("Enter any number: ");
    int value=input.nextInt();
  /*String suit=input.next();
    Card key=new Card();
    key.setValue(value);
    key.getSuits();*/
        }
    
    
    
    }}
    

