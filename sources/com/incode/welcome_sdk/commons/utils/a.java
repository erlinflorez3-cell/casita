package com.incode.welcome_sdk.commons.utils;

import io.reactivex.disposables.CompositeDisposable;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6346a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6347b = 1;

    public static void d(CompositeDisposable... compositeDisposableArr) {
        int i2 = 2 % 2;
        int i3 = f6346a;
        int i4 = i3 + 3;
        f6347b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (compositeDisposableArr == null) {
            return;
        }
        int i5 = i3 + 99;
        f6347b = i5 % 128;
        int i6 = i5 % 2;
        for (CompositeDisposable compositeDisposable : compositeDisposableArr) {
            int i7 = f6346a + 27;
            int i8 = i7 % 128;
            f6347b = i8;
            int i9 = i7 % 2;
            if (compositeDisposable != null) {
                int i10 = i8 + 37;
                f6346a = i10 % 128;
                if (i10 % 2 != 0) {
                    compositeDisposable.clear();
                    int i11 = 9 / 0;
                } else {
                    compositeDisposable.clear();
                }
            }
        }
    }
}
