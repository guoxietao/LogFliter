package com.bt.tool.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by xinyu.he on 2016/1/14.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface TextFieldSaveState {
    String getter() default "getText";
    String setter() default "setText";
    SaveState.Type type() default SaveState.Type.STRING;
}
