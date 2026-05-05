package com.incode.welcome_sdk.data.remote.e;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10133a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f10134b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10135c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10136d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10137e = 1;

    private d() {
    }

    public static b a() throws Throwable {
        b bVarC;
        int i2 = 2 % 2;
        int i3 = f10133a + 91;
        f10137e = i3 % 128;
        if (i3 % 2 == 0) {
            e eVar = e.f10141d;
            bVarC = e.c();
            int i4 = 27 / 0;
        } else {
            e eVar2 = e.f10141d;
            bVarC = e.c();
        }
        int i5 = f10133a + 105;
        f10137e = i5 % 128;
        int i6 = i5 % 2;
        return bVarC;
    }

    static {
        int i2 = f10135c + 7;
        f10136d = i2 % 128;
        int i3 = i2 % 2;
    }
}
