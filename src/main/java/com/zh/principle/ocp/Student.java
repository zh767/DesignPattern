package com.zh.principle.ocp;

/**
 * @author zh
 * @Created By IntelliJ IDEA.
 * @ClassName Student
 * @Date 2020/4/26 21:04
 * @Description:
 */
public class Student {
    private int id;
    private String name;
    private String email;
    private String address;

    public Student() {
    }

    public Student(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {

        Student student = new Student();
        student.setId(0);
        student.setName("");
        student.setEmail("");
        student.setAddress("");


    }
}
