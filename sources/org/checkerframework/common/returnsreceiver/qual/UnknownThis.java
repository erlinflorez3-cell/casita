package org.checkerframework.common.returnsreceiver.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.InvisibleQualifier;
import org.checkerframework.framework.qual.LiteralKind;
import org.checkerframework.framework.qual.QualifierForLiterals;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TypeUseLocation;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@QualifierForLiterals(stringPatterns = {}, value = {LiteralKind.NULL})
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({})
@InvisibleQualifier
@DefaultFor(names = {}, namesExceptions = {}, typeKinds = {}, types = {}, value = {TypeUseLocation.LOWER_BOUND})
@DefaultQualifierInHierarchy
public @interface UnknownThis {
}
