package com.duman.customer.exception;

import com.duman.customer.exception.errors.ErrorCode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenericException extends RuntimeException {

    private final Object[] var1;

    private final ErrorCode errorCode;

    public GenericException(ErrorCode errorCode, Object... searchParams) {
        this.errorCode = errorCode;
        this.var1 = searchParams;
    }


    @JsonIgnore
    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }
}
