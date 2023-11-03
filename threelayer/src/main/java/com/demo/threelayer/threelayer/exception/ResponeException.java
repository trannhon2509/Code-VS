package com.demo.threelayer.threelayer.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class ResponeException {
    private Date dateTime;
    private Object object;
    private String message;
    
}
