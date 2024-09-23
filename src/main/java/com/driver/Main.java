package com.driver;

public class Main {
  public static void main(String args[]){
  RWOnly rw = new RWOnly();
        rw.setName("srikanth");
        rw.setEmail("srikanthpandaraboina38@gmail.com");
        rw.setId(100);
        System.out.println(rw.getName());
        System.out.println(rw.getEmail());
        System.out.println(rw.getId());
  }
}
