package fr.edouardg.designpatterns.creational.builder;

import fr.edouardg.designpatterns.creational.model.User;

import java.time.LocalDate;

public class RealUserBuilder {


    private String name;
    private String surname;
    private LocalDate birthday;
    private String mail;
    private boolean isActivated;

    public RealUserBuilder() {
    }

    public RealUserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public RealUserBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public RealUserBuilder birthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public RealUserBuilder mail(String mail) {
        this.mail = mail;
        return this;
    }

    public RealUserBuilder isActivated(boolean isActivated) {
        this.isActivated = isActivated;
        return this;
    }

    public User build() {
        return new User(name, surname, birthday, mail, isActivated);
    }

    public static void main(String[] args) {
        User user = new RealUserBuilder()
                .name("name")
                .surname("surname")
                .birthday(LocalDate.now())
                .mail("mail@contact.fr")
                .isActivated(true)
                .build();
        System.out.println(user);
    }
}


