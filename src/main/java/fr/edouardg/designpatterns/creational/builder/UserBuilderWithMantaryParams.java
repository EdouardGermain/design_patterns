package fr.edouardg.designpatterns.creational.builder;

import fr.edouardg.designpatterns.creational.model.User;

import java.time.LocalDate;

public class UserBuilderWithMantaryParams {

    private User user;

    public UserBuilderWithMantaryParams(String name, String surname, LocalDate birthday) {
        user = new User();
    }


    public UserBuilderWithMantaryParams mail(String mail) {
        user.setMail(mail);
        return this;
    }

    public UserBuilderWithMantaryParams isActivated(boolean isActivated) {
        user.setActivated(isActivated);
        return this;
    }

    public User build() {
        return user;
    }

    public static void main(String[] args) {
        User user = new UserBuilderWithMantaryParams("name", "surname", LocalDate.of(2020, 12, 12))
                .mail("mail@contact.fr")
                .isActivated(true)
                .build();
        System.out.println(user);
    }
}
