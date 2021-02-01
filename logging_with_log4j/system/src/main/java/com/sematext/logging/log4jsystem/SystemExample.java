package com.sematext.logging.log4jsystem;

public class SystemExample {
  public static void main(String[] args) {
    System.out.println("Starting my awesome application");

    // some work to be done

    System.out.println(
        String.format("My application %s started successfully", SystemExample.class)
    );
  }
}
