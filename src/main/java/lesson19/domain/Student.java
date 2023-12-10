package lesson19.domain;

import org.springframework.web.multipart.MultipartFile;

public class Student {
    private String name;
    private String surname;
    private String age;
    private MultipartFile photo;

    public Student(String name, String surname, String age, MultipartFile photo) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public MultipartFile getPhoto() {
        return photo;
    }

    public void setPhoto(MultipartFile photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                ", photo=" + photo +
                '}';
    }
}