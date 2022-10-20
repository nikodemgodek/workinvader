package com.example.doupa.demo.validations;
import com.example.doupa.demo.model.User;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EqualPasswordValidation implements ConstraintValidator<EqualPasswords, User> {

    @Override
    public void initialize(EqualPasswords constraint) {
    }

    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        return user.getPassword().equals(user.getConfirmedPassword());
    }
}
