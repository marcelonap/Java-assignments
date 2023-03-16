/* Marcelo Napoleao Sampaio - Lab1 CMPT 305
DATE: 09/02/2021
Lab2
*/
import java.lang.Object;
import java.util.Scanner;
import java.lang.*;
import javax.swing.*;

/**
* This class runs our program for this lab
*@author Marcelo Sampaio
*/
public class lab2
{
  /**
  *Main method responsible only for running the program
  *
  */
    public static void main (String args[])
    {
        adress ad = new adress();

        String street = "";
        String city = "";
        String province = "";
        String postal = "";
        String number = "";
//number ================================================================
        number = JOptionPane.showInputDialog("Please tell me your street number: ");
        if(number == null){
          System.exit(1);
        }
        while(!ad.setNumber(number)){
          JOptionPane.showMessageDialog(null, "Please tell me your street number!", "Invalid street number", JOptionPane.INFORMATION_MESSAGE);

          number = JOptionPane.showInputDialog("Please tell me your street number: ");
          if(number == null){
            System.exit(1);
          }
        }

//street ================================================================

        street = JOptionPane.showInputDialog("Please tell me your street: ");
        if(street == null){
          System.exit(1);
          }

        while(!ad.setStreet(street)){
          JOptionPane.showMessageDialog(null, "Please tell me your street!", "Invalid street", JOptionPane.INFORMATION_MESSAGE);
          if(street == null){
            System.exit(1);
          }
          street = JOptionPane.showInputDialog("Please tell me your street: ");
        }

//city=================================================

        city = JOptionPane.showInputDialog("Please tell me your city: ");
          if(city == null){
              System.exit(1);
            }

        while(!ad.setCity(city)){
          JOptionPane.showMessageDialog(null, "Please tell me your city!", "Invalid city", JOptionPane.INFORMATION_MESSAGE);
          if(city == null){
            System.exit(1);
          }
          city = JOptionPane.showInputDialog("Please tell me your city: ");

        }
//province ======================================================

        province = JOptionPane.showInputDialog("Please tell me your province: ");
        if(province == null){
          System.exit(1);
        }

        while(!ad.setProvince(province)){
          JOptionPane.showMessageDialog(null, "Please tell me your province!", "Invalid province", JOptionPane.INFORMATION_MESSAGE);
          if(province == null){
            System.exit(1);
          }
          province = JOptionPane.showInputDialog("Please tell me your province: ");

        }

//postal=========================================================

        postal = JOptionPane.showInputDialog("Please tell me your Postal Code: ");
        if(postal == null){
          System.exit(1);
        }

        while(!ad.setPostal(postal)){
          JOptionPane.showMessageDialog(null, "Please tell me your Postal Code!", "Invalid Postal Code", JOptionPane.INFORMATION_MESSAGE);
          if(postal == null){
            System.exit(1);
          }
          postal = JOptionPane.showInputDialog("PLease tell me your Postal Code: ");
}


        JOptionPane.showMessageDialog(null, ad.toString(), "Your address is", JOptionPane.INFORMATION_MESSAGE);

}
}
