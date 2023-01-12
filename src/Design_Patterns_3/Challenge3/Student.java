package Design_Patterns_3.Challenge3;

public class Student {
    public String name;
    private Integer money;

    public Student(String name, Integer money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
