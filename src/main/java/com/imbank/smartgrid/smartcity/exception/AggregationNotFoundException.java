package com.imbank.smartgrid.smartcity.exception;

import lombok.Getter;

@Getter
public class AggregationNotFoundException extends RuntimeException{
    private final  String resourceName;
    private final  String fieldName;
    private  final Object fieldValue;

    public AggregationNotFoundException(String resourceName,String fieldName,Object fieldValue){
        super(String.format("%s not found with %s: '%s'", resourceName, fieldName, fieldValue));
        this.fieldValue = fieldValue;
        this.fieldName = fieldName;
        this.resourceName = resourceName;
    }
}
