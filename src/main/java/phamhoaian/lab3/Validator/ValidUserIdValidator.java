package phamhoaian.lab3.Validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import phamhoaian.lab3.Validator.annotation.ValidUserId;
import phamhoaian.lab3.entity.User;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId,User> {
    @Override
    public boolean isValid (User user, ConstraintValidatorContext context){
    if(user== null)
        return true;
    return user.getId()!=null;

    }
}
