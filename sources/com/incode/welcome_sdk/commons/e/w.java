package com.incode.welcome_sdk.commons.e;

import android.app.Application;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class w implements Factory<BarcodeDetector> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4989a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4990d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<Application> f4991b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x f4992e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4990d + 55;
        f4989a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            d();
            obj.hashCode();
            throw null;
        }
        BarcodeDetector barcodeDetectorD = d();
        int i4 = f4990d + 67;
        f4989a = i4 % 128;
        if (i4 % 2 != 0) {
            return barcodeDetectorD;
        }
        throw null;
    }

    private w(x xVar, Provider<Application> provider) {
        this.f4992e = xVar;
        this.f4991b = provider;
    }

    private BarcodeDetector d() {
        int i2 = 2 % 2;
        int i3 = f4989a + 77;
        f4990d = i3 % 128;
        int i4 = i3 % 2;
        BarcodeDetector barcodeDetectorB = b(this.f4992e, this.f4991b.get());
        int i5 = f4989a + 9;
        f4990d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return barcodeDetectorB;
    }

    public static w d(x xVar, Provider<Application> provider) {
        int i2 = 2 % 2;
        w wVar = new w(xVar, provider);
        int i3 = f4989a + 49;
        f4990d = i3 % 128;
        if (i3 % 2 == 0) {
            return wVar;
        }
        throw null;
    }

    private static BarcodeDetector b(x xVar, Application application) {
        int i2 = 2 % 2;
        int i3 = f4990d + 59;
        f4989a = i3 % 128;
        int i4 = i3 % 2;
        BarcodeDetector barcodeDetector = (BarcodeDetector) Preconditions.checkNotNullFromProvides(xVar.a(application));
        if (i4 != 0) {
            return barcodeDetector;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
