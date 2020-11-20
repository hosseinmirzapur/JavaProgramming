package model;

public class Entity {
    private String user, pass;
    public long cost=0;
    public long internet=0;
    public long getCost() {
        return cost;
    }

    public Entity setCost(long cost) {
        this.cost = cost;
        return this;
    }

    public long getInternet() {
        return internet;
    }

    public Entity setInternet(long internet) {
        this.internet = internet;
        return this;
    }


    public String getUser() {
        return user;
    }

    public Entity setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public Entity setPass(String pass) {
        this.pass = pass;
        return this;
    }
}
