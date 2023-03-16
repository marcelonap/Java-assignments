/* Marcelo Napoleao Sampaio - Lab1 CMPT 305
DATE: 09/02/2021
Lab2
*/
import java.lang.Object;
import java.util.Scanner;
import java.lang.*;

/**
* This class stores and handles a canadian address containing street, street number, city
* province and postal code.
*@author Marcelo Sampaio
*/
public class adress
{

  private String street;
  private String city;
  private String province;
  private String postal;
  private int number;
  /**
  * Default constructor initiates the object with an empty address.
  *
  */
      public adress(){
         street = " ";
         city =" ";
         province = " ";
         postal = " ";
         number = 0;
      }

      /**
      *Method used to set the value of the street attribute
      *This method will return true if a valid input is provided and false otherwise
      *@param input - A string containing the value for the street of this address
      */

      public boolean setStreet(String input){
          if(input.length() > 0){
              street = input;
              return true;
        }
        return false;
      }
      /**
      *Method used to set the value of the city attribute
      *This method will return true if a valid input is provided and false otherwise
      *@param input - A string containing the value for the city of this address
      */
      public boolean setCity(String input){
          if(input.length() > 0){
              city = input;
              return true;
        }
        return false;
      }
      /**
      *Method used to set the value of the province attribute
      *This method will return true if a valid input is provided and false otherwise
      *@param input - A string containing the value for the province of this address
      */
      public boolean setProvince(String input){
          if(input.length() != 0){
              province = input;
              return true;
        }
        return false;
      }
      /**
      *Method used to set the value of the postal attribute
      *This method will return true if a valid input is provided and false otherwise
      *@param input - A string containing the value for the postal code of this address
      */
      public boolean setPostal(String input){
        if(input.length() == 6 ){
          for(int i = 0; i <= 5; i++){
            char c = input.charAt(i);
            if(i%2 ==0){
              if(isNumber(c)){return false;}
            }else{
              if(isLetter(c)){return false;}
            }
          }
          char sp = ' ';
          StringBuffer str = new StringBuffer(input);
          str.insert(3,sp);
          postal = str.toString();
          postal = postal.toUpperCase();
          return true;

        }else if(input.length()==7){
          char check = input.charAt(3);
          if((int)check != 32){return false;}
          String strNew = input.replace(" ", "");
          for(int i = 0; i <= 5; i++){
            char c = strNew.charAt(i);
            if(i%2==0){
              if(isNumber(c)){return false;}
            }else{
              if(isLetter(c)){return false;}
            }
          }

          postal = input.toUpperCase();
          return true;
        }
        return false;
      }

      /**
      *This method is used to check if a character is a number and
      *returns true if it is and false if it isnot
      *@param current - a character which is the current character of a certain string we want to check each character of
      */
      private boolean isNumber(char current){
          if((int)current >= 48 && (int)current <= 57){
            return true;
          }
          return false;
    }

    /**
    *This method is used to check if a character is a letter and
    *returns true if it is and false if it isnot
    *@param current - a character which is the current character of a certain string we want to check each character of
    */
      private boolean isLetter(char current){
        if(((int)current >= 65 && (int)current <= 90) || ((int)current >=97 && (int)current <= 122)){
          return true;
        }
        return false;
      }

      /**
      *Method used to set the value of the number attribute
      *This method will return true if a valid input is provided and false otherwise
      *@param input - A string containing the value for the street number of this address
      */
      public boolean setNumber(String input){
        if(input.length()==0){return false;}
        int convert = 0;
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
          if(!isNumber(c)){return false;}
          }

        try{
          convert = Integer.parseInt(input);// converting input to integer (if possible)
        }
        catch(Exception e){
        }
        number = convert;
        return true;
      }
      /**
      *This method returns the value stored in the street attribute
      *
      */
      public String getStreet(){
        return street;
      }
      /**
      *This method returns the value stored in the city attribute
      *
      */
      public String getCity(){
        return city;
      }
      /**
      *This method returns the value stored in the province attribute
      *
      */
      public String getProvince(){
        return province;
      }
      /**
      *This method returns the value stored in the postal attribute
      *
      */
      public String getPostal(){
        return postal;
      }
      /**
      *This method returns the value stored in the number attribute
      *
      */
      public int getNumber(){
        return number;
      }
      /**
      *This method returns a properly formatted string containing the entire address
      *stored in the object.
      *
      */
      public String toString(){
        String result = number +" "+ street + "\n" + city +" "+ province + "\n" + postal;
        return result;
      }


}
