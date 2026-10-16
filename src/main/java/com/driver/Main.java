package com.driver;

public class Main {
  public static void main(String[] args)
  {
    RWOnly obj = new RWOnly();
    obj.name = "raja";    //Error - java: name has private access in com.raja.practice.RWOnly
  }
}
