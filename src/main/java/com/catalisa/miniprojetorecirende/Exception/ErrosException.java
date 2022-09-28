package com.catalisa.miniprojetorecirende.Exception;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ErrosException {

    @Autowired
    private MessageSource messageSource;

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<CamposInvalidos> handle(MethodArgumentNotValidException exception){
        List<CamposInvalidos> erros = new ArrayList<>();
        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();

        fieldErrors.forEach(e ->{
            String msg = messageSource.getMessage(e, LocaleContextHolder.getLocale());
            CamposInvalidos erro = new CamposInvalidos(e.getField(), msg);
            erros.add(erro);
        });
        return erros;
    }
}

