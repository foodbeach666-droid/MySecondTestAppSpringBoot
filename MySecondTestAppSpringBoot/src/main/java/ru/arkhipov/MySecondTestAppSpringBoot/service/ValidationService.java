package ru.arkhipov.MySecondTestAppSpringBoot.service;

import org.springframework.validation.BindingResult;
import ru.arkhipov.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.arkhipov.MySecondTestAppSpringBoot.exception.ValidationFailedException;

public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException;
    void checkCode(String uid) throws UnsupportedCodeException;
}