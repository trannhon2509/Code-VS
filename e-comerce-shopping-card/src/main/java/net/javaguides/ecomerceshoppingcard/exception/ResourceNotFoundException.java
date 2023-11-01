package net.javaguides.ecomerceshoppingcard.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private String resourceName;
    private String fieldName;
    private String fieldValue;
    
    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
    public ResourceNotFoundException(String arg0, String resourceName, String fieldName, String fieldValue) {
        super(arg0);
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
    public ResourceNotFoundException(Throwable arg0, String resourceName, String fieldName, String fieldValue) {
        super(arg0);
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
    public ResourceNotFoundException(String arg0, Throwable arg1, String resourceName, String fieldName,
            String fieldValue) {
        super(arg0, arg1);
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
    public ResourceNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3, String resourceName,
            String fieldName, String fieldValue) {
        super(arg0, arg1, arg2, arg3);
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
    public String getResourceName() {
        return resourceName;
    }
    
    public String getFieldName() {
        return fieldName;
    }
    
    public String getFieldValue() {
        return fieldValue;
    }
}
