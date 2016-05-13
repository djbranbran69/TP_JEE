package beans;

import model.User;

import java.io.Serializable;

/**
 * Created by djbranbran on 13/05/16.
 */
public class UserBean implements Serializable{

    private String name;
    private String surname;
    private int age;

    public UserBean() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
