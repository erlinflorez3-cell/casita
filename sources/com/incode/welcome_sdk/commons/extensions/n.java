package com.incode.welcome_sdk.commons.extensions;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5138a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5139b = 1;

    public static final void b(CompositeDisposable compositeDisposable, Disposable disposable) {
        int i2 = 2 % 2;
        int i3 = f5138a + 87;
        f5139b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(compositeDisposable, "");
            Intrinsics.checkNotNullParameter(disposable, "");
            compositeDisposable.add(disposable);
        } else {
            Intrinsics.checkNotNullParameter(compositeDisposable, "");
            Intrinsics.checkNotNullParameter(disposable, "");
            compositeDisposable.add(disposable);
            int i4 = 58 / 0;
        }
    }
}
