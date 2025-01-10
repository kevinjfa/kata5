package es.software.ulpgc.kata5;

import java.util.Date;

public class User {
    private String name;
    private String surname;
    private Date date;
    private String email;

    public User(String name, String surname, Date date, String email) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.email = email;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                ", email='" + email + '\'' +
                '}';
    }
}
