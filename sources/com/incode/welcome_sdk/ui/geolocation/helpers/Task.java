package com.incode.welcome_sdk.ui.geolocation.helpers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Task<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f14349c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14350d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<OnSuccessListener<T>> f14351a = new ArrayList();

    public interface OnSuccessListener<T> {
        void onSuccess(T t2);
    }

    public final void addOnSuccessListener(OnSuccessListener<T> onSuccessListener) {
        int i2 = 2 % 2;
        int i3 = f14350d + 65;
        f14349c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onSuccessListener, "");
        this.f14351a.add(onSuccessListener);
        int i5 = f14349c + 13;
        f14350d = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onSuccess(T t2) {
        int i2 = 2 % 2;
        int i3 = f14350d + 45;
        f14349c = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            a(t2);
            int i4 = f14349c + 117;
            f14350d = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        a(t2);
        throw null;
    }

    private final void a(T t2) {
        int i2 = 2 % 2;
        int i3 = f14349c + 11;
        f14350d = i3 % 128;
        int i4 = i3 % 2;
        Iterator<OnSuccessListener<T>> it = this.f14351a.iterator();
        while (it.hasNext()) {
            int i5 = f14350d + 17;
            f14349c = i5 % 128;
            if (i5 % 2 == 0) {
                it.next().onSuccess(t2);
                int i6 = 49 / 0;
            } else {
                it.next().onSuccess(t2);
            }
        }
    }
}
