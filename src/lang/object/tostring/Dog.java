package lang.object.tostring;

public class Dog {

    private String dogName;
    private int age;


    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Dog && dogName.equals(((Dog) obj).dogName);
    }

    public void plusAge(int age) {
        this.age = this.age + age;
    }
}

