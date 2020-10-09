package Q1;

public class PersonalInfo{
    public PersonalInfo(){
        System.out.println("::Program Started Successfully::");
    }
    public String name;
    public String family;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
