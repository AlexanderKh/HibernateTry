package entity;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private int mark;


    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName + " " + mark;
    }

}
