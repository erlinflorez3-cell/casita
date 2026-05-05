package com.facebook.fresco.ui.common;

import android.net.Uri;
import com.facebook.common.internal.Fn;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MultiUriHelper {
    @Nullable
    public static <T> Uri getMainUri(@Nullable T t2, @Nullable T t3, @Nullable T[] tArr, Fn<T, Uri> fn) {
        T t4;
        Uri uriApply;
        Uri uriApply2;
        if (t2 != null && (uriApply2 = fn.apply(t2)) != null) {
            return uriApply2;
        }
        if (tArr != null && tArr.length > 0 && (t4 = tArr[0]) != null && (uriApply = fn.apply(t4)) != null) {
            return uriApply;
        }
        if (t3 != null) {
            return fn.apply(t3);
        }
        return null;
    }
}
