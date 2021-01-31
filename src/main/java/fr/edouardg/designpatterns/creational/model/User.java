package fr.edouardg.designpatterns.creational.model;

import java.time.LocalDate;

public class User {

    private String name;
    private String surname;
    private LocalDate birthday;
    private String mail;
    private boolean isActivated;

    public User() {
    }

    public User(String name, String surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
    }

    public User(String name, String surname, LocalDate birthday, String mail, boolean isActivated) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.mail = mail;
        this.isActivated = isActivated;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", mail='" + mail + '\'' +
                ", isActivated=" + isActivated +
                '}';
    }
}
