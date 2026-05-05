package com.incode.welcome_sdk.data.e;

import android.os.Process;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements Factory<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7652a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f7653d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f7654e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f7655g = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f7656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<b> f7657c;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f7655g + 39;
        f7652a = i3 % 128;
        int i4 = i3 % 2;
        f fVarE = e();
        int i5 = f7652a + 9;
        f7655g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return fVarE;
    }

    private c(e eVar, Provider<b> provider) {
        this.f7656b = eVar;
        this.f7657c = provider;
    }

    private f e() {
        int i2 = 2 % 2;
        int i3 = f7655g + 123;
        f7652a = i3 % 128;
        int i4 = i3 % 2;
        e eVar = this.f7656b;
        if (i4 == 0) {
            return b(eVar, this.f7657c.get());
        }
        b(eVar, this.f7657c.get());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static c e(e eVar, Provider<b> provider) {
        int i2 = 2 % 2;
        c cVar = new c(eVar, provider);
        int i3 = f7652a + 71;
        f7655g = i3 % 128;
        int i4 = i3 % 2;
        return cVar;
    }

    private static f b(e eVar, b bVar) {
        int i2 = 2 % 2;
        int i3 = f7655g + 23;
        f7652a = i3 % 128;
        int i4 = i3 % 2;
        f fVar = (f) Preconditions.checkNotNullFromProvides(eVar.d(bVar));
        if (i4 == 0) {
            return fVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int c() {
        int i2 = f7653d;
        int i3 = i2 % 9342925;
        f7653d = i2 + 1;
        if (i3 != 0) {
            return f7654e;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        f7654e = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
