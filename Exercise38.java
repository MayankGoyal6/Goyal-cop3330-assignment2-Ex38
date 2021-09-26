/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution Exercise 38
 *  Copyright 2021 Mayank Goyal
 */

import java.util.*;

public class Main
{
  
  public static void main(String[] args) 
  {
            
    Scanner scanner = new Scanner(System.in);   
            
    System.out.print("Enter a list of numbers, separated by spaces: ");
    String data = scanner.nextLine();
            
    String list[] = data.split(" ");
            
    Integer evenList[] = filterEvenNumbers(list);
          
    System.out.print("The even numbers are ");
            
    for(int a = 0 ; a < evenList.length ; a++)
    {
                
      if(a < evenList.length-1)
      {

        System.out.print(evenList[a] + " ");

      }
      else
      {

        System.out.print(evenList[a] + ".");

      }
    }
  }
        
  public static Integer[] filterEvenNumbers(String list[]) 
  {
          
    ArrayList<Integer> newList = new ArrayList<>();
            
    for(int a = 0 ; a < list.length; a++)
    {
                
      int inputNumber = Integer.parseInt(list[a]);
              
        if(inputNumber % 2 == 0)
        {
              
          newList.add(inputNumber);

        }
    }
            
    Integer[] arr = new Integer[newList.size()];
    arr = newList.toArray(arr);
        
    return arr;
  }
}