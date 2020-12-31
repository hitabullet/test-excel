package com.glaway.excel.util;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ReturnT {

    private String msg;

    private boolean success;

    private Object result;

}
