package com.pavlo.testPortal.validators;

import com.pavlo.testPortal.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {


    @Override
    public boolean supports(Class<?> aClass) {

        return aClass.equals(User.class);

    }

    @Override
    public void validate(Object target, Errors errors) {

        User user = (User) target;
            if(user.getName().equals("asd")) {
                errors.rejectValue("name", "name,","wrong name");
            }
    }
}
