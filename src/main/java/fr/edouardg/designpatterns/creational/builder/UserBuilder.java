package fr.edouardg.designpatterns.creational.builder;

import fr.edouardg.designpatterns.creational.model.User;

import java.time.LocalDate;

public class UserBuilder {

    private User user;

    public UserBuilder() {
        user = new User();
    }

    public UserBuilder name(String name) {
        user.setName(name);
        return this;
    }

    public UserBuilder surname(String surname) {
        user.setSurname(surname);
        return this;
    }

    public UserBuilder birthday(LocalDate birthday) {
        user.setBirthday(birthday);
        return this;
    }

    public UserBuilder mail(String mail) {
        user.setMail(mail);
        return this;
    }

    public UserBuilder isActivated(boolean isActivated) {
        user.setActivated(isActivated);
        return this;
    }

    public User build() {
        return user;
    }

    public static void main(String[] args) {
        User user = new UserBuilder()
                .name("name")
                .surname("surname")
                .birthday(LocalDate.now())
                .mail("mail@contact.fr")
                .isActivated(true)
                .build();
        System.out.println(user);
    }
}
