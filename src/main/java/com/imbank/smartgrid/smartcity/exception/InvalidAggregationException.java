package com.imbank.smartgrid.smartcity.exception;

import lombok.Getter;

@Getter
public class InvalidAggregationException extends RuntimeException{
    private final String fieldName;
    private final Object rejectedValue;
    private final String reason;

    public InvalidAggregationException(String fieldName, Object rejectedValue,String reason){
        super(String.format("%s Invalid %s: '%s'", fieldName, rejectedValue, reason));
        this.fieldName = fieldName;
        this.rejectedValue = rejectedValue;
        this.reason = reason;
    }
}
