package com.interview;

import java.util.HashMap;
import java.util.Scanner;

public class FindFirstNonRepeatChar {

  public static void main(String[] args) {
    System.out.println("Enter any string..!");
    Scanner sc = new Scanner(System.in);
    String inputString = sc.nextLine();
    System.out.println(inputString);
    findFirstNonRepCharactor(inputString);
  }

  public static void findFirstNonRepCharactor(String str)
  {
    HashMap<Character, Integer> hm = new HashMap<>();
    for (int i=0; i<str.length();i++){
      char c = str.charAt(i);
      if (hm.containsKey(c)){
        hm.put(c,hm.get(c)+1);
      }
      else{
        hm.put(c,1);
      }
    }
    for (Character ch:hm.keySet())
    {
      if (hm.get(ch)==1){
        System.out.println(ch);
        break;
      }
    }
  }
  //abgadcdafegb



}
