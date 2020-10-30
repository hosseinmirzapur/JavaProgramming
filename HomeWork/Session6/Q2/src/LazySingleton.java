package com.company;

public class LazySingleton {
    private static LazySingleton lazySingleton;
    public String username;
    public String password;
    public String age;
    public String gender;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    private LazySingleton() {
        System.out.println("Lazy Singleton Instance Created!");
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
            System.out.println("Lazy Singleton instance created for the first time!");
        }
        return lazySingleton;
    }
}
