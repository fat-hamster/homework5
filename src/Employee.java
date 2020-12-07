public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private long salary; // :)
    private int age;

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public long getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Employee(String fullName, String position, String email, String phoneNumber, long salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getInfo() {
        return String.format("Имя: %s%nДолжность: %s%nE-mail: %s%nНомер телефона: %s%nЗарплата: %d%nВозраст: %d%n",
                getFullName(), getPosition(), getEmail(), getPhoneNumber(), getSalary(), getAge());
    }
}
