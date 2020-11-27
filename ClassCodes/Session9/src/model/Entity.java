package model;

public class Entity {
    String name,pass,user,email;

    public String getName() {
        return name;
    }

    public Entity setName(String name) {
        this.name = name;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public Entity setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public String getUser() {
        return user;
    }

    public Entity setUser(String user) {
        this.user = user;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Entity setEmail(String email) {
        this.email = email;
        return this;
    }
}

