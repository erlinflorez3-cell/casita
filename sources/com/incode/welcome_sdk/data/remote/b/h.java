package com.incode.welcome_sdk.data.remote.b;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends Throwable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9062c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9063e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9064a = -1;

    public final int b() {
        int i2 = 2 % 2;
        int i3 = f9062c;
        int i4 = i3 + 71;
        f9063e = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f9064a;
        int i7 = i3 + 69;
        f9063e = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final void c(int i2) {
        int i3 = 2 % 2;
        int i4 = f9062c + 25;
        int i5 = i4 % 128;
        f9063e = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            this.f9064a = i2;
            int i6 = i5 + 1;
            f9062c = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.f9064a = i2;
        obj.hashCode();
        throw null;
    }
}
