public class Builder {
    String userName;
    String userRealName;
    String password;
    int age;
    String homeAdress;
    String phoneNumber;
    String universityDegree;

    public Builder setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public Builder setUserRealName(String userRealName) {
        this.userRealName = userRealName;
        return this;
    }

    public Builder setPassword(String password) {
        this.password = password;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
        return this;
    }

    public Builder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Builder setUniversityDegree(String universityDegree) {
        this.universityDegree = universityDegree;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUniversityDegree() {
        return universityDegree;
    }
}
