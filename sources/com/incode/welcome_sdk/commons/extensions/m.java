package com.incode.welcome_sdk.commons.extensions;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5136a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5137b = 1;

    public static final Modifier d(Modifier modifier, boolean z2, Function1<? super Modifier, ? extends Modifier> function1) {
        int i2 = 2 % 2;
        int i3 = f5136a + 33;
        f5137b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(modifier, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (!z2) {
            return modifier;
        }
        int i5 = f5137b + 45;
        f5136a = i5 % 128;
        if (i5 % 2 == 0) {
            return modifier.then(function1.invoke(Modifier.Companion));
        }
        modifier.then(function1.invoke(Modifier.Companion));
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
