package com.incode.welcome_sdk.commons.httpinterceptors;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import dagger.internal.Factory;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements Factory<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5231a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5232e = 0;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f5232e + 31;
        f5231a = i3 % 128;
        int i4 = i3 % 2;
        g gVarB = b();
        int i5 = f5232e + 27;
        f5231a = i5 % 128;
        if (i5 % 2 != 0) {
            return gVarB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static g b() {
        int i2 = 2 % 2;
        int i3 = f5232e + 93;
        f5231a = i3 % 128;
        int i4 = i3 % 2;
        g gVarE = e();
        int i5 = f5232e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f5231a = i5 % 128;
        if (i5 % 2 != 0) {
            return gVarE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static i d() {
        int i2 = 2 % 2;
        int i3 = f5232e + 3;
        f5231a = i3 % 128;
        if (i3 % 2 == 0) {
            i iVar = b.f5234c;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        i iVar2 = b.f5234c;
        int i4 = f5232e + 65;
        f5231a = i4 % 128;
        int i5 = i4 % 2;
        return iVar2;
    }

    private static g e() {
        int i2 = 2 % 2;
        g gVar = new g();
        int i3 = f5231a + 3;
        f5232e = i3 % 128;
        int i4 = i3 % 2;
        return gVar;
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5233a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final i f5234c = new i();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5235e = 1;

        static {
            int i2 = f5233a + 39;
            f5235e = i2 % 128;
            int i3 = i2 % 2;
        }
    }
}
