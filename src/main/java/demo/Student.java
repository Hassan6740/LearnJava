package demo;

public class Student {
    private long id;
    private String name;
    private String phone;

    public Student() {}
    public Student(long id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}