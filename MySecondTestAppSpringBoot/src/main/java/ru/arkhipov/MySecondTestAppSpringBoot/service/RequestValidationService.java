package ru.arkhipov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.arkhipov.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.arkhipov.MySecondTestAppSpringBoot.exception.ValidationFailedException;

@Service
public class RequestValidationService implements ValidationService {

    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailedException {
        if (bindingResult.hasErrors()) {
            throw new ValidationFailedException(
                    bindingResult.getFieldError().getDefaultMessage()
            );
        }
    }

    @Override
    public void checkCode(String uid) throws UnsupportedCodeException {
        if ("123".equals(uid)) {
            throw new UnsupportedCodeException("Ошибка: uid не может быть равен 123");
        }
    }
}
