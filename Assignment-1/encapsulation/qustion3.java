class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        setAge(age); 
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age value: " + age);
        }
    }
}

public class qustion3 {
    public static void main(String[] args) {
        Student student = new Student("Yuvraj", 20);
        student.setAge(-5); 
        System.out.println("Updated age: " + student.getAge());
    }
}
