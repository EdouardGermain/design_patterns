package fr.edouardg.designpatterns.creational.stepbuilder;

import fr.edouardg.designpatterns.creational.model.User;

import java.time.LocalDate;

public class UserStepBuilder implements NameStepBuilder, SurnameStepBuilder {

    private User user;

    private UserStepBuilder() {
        user = new User();
    }

    public static NameStepBuilder builder() {
        return new UserStepBuilder();
    }

    @Override
    public SurnameStepBuilder name(String name) {
        user.setName(name);
        return this;
    }

    @Override
    public UserStepBuilder surname(String surname) {
        user.setSurname(surname);
        return this;
    }

    public UserStepBuilder birthday(LocalDate birthday) {
        user.setBirthday(birthday);
        return this;
    }

    public UserStepBuilder mail(String mail) {
        user.setMail(mail);
        return this;
    }

    public UserStepBuilder isActivated(boolean isActivated) {
        user.setActivated(isActivated);
        return this;
    }

    public User build() {
        return user;
    }

    public static void main(String[] args) {
        User user = UserStepBuilder.builder()
                .name("name")
                .surname("surname")
                .birthday(LocalDate.now())
                .mail("mail@contact.fr")
                .isActivated(true)
                .build();
        System.out.println(user);
    }

}
