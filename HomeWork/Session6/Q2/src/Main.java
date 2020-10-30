package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Starting of the Lazy Singleton...");
        LazySingleton lazySingleton=LazySingleton.getInstance();
        System.out.println("Enter Username:");
        lazySingleton.setUsername(scanner.nextLine());
        System.out.println("Enter Password:");
        lazySingleton.setPassword(scanner.nextLine());
        System.out.println("Enter Age:");
        lazySingleton.setAge(scanner.nextLine());
        System.out.println("Enter Your Gender:");
        lazySingleton.setGender(scanner.nextLine());
        displayMsg();
    }
    private static void displayMsg(){
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println("Username:"+lazySingleton.getUsername());
        System.out.println("Password:"+lazySingleton.getPassword());
        System.out.println("Age:"+lazySingleton.getAge());
        System.out.println("Gender:"+lazySingleton.getGender());
    }
}

