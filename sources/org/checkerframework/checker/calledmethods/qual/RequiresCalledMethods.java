package org.checkerframework.checker.calledmethods.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.PreconditionAnnotation;
import org.checkerframework.framework.qual.QualifierArgument;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@PreconditionAnnotation(qualifier = CalledMethods.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresCalledMethods {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface List {
        RequiresCalledMethods[] value();
    }

    @QualifierArgument("0ae\u0019\t")
    @InterfaceC1492Gx
    String[] methods();

    String[] value();
}
