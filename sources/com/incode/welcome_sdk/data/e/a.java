package com.incode.welcome_sdk.data.e;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Factory<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7639a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7640d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f7641e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f7640d + 17;
        f7639a = i3 % 128;
        int i4 = i3 % 2;
        b bVarE = e();
        int i5 = f7639a + 107;
        f7640d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return bVarE;
    }

    private a(e eVar) {
        this.f7641e = eVar;
    }

    private b e() {
        int i2 = 2 % 2;
        int i3 = f7640d + 63;
        f7639a = i3 % 128;
        int i4 = i3 % 2;
        b bVarA = a(this.f7641e);
        int i5 = f7640d + 101;
        f7639a = i5 % 128;
        int i6 = i5 % 2;
        return bVarA;
    }

    public static a b(e eVar) {
        int i2 = 2 % 2;
        a aVar = new a(eVar);
        int i3 = f7640d + 107;
        f7639a = i3 % 128;
        int i4 = i3 % 2;
        return aVar;
    }

    private static b a(e eVar) {
        int i2 = 2 % 2;
        int i3 = f7640d + 51;
        f7639a = i3 % 128;
        int i4 = i3 % 2;
        b bVar = (b) Preconditions.checkNotNullFromProvides(eVar.c());
        int i5 = f7639a + 101;
        f7640d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
        return bVar;
    }
}
