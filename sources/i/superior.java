package i;

import android.app.Application;

/* JADX INFO: loaded from: classes4.dex */
public final class superior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f19687a;

    public superior(Application application) {
        this.f19687a = application;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        return p0.pair.f28241d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r1.hasEnrolledFingerprints() != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p0.pair a() {
        /*
            r3 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r2 < r0) goto L2a
            android.app.Application r1 = r3.f19687a
            java.lang.Class<android.hardware.biometrics.BiometricManager> r0 = android.hardware.biometrics.BiometricManager.class
            java.lang.Object r1 = androidx.core.content.ContextCompat.getSystemService(r1, r0)
            android.hardware.biometrics.BiometricManager r1 = (android.hardware.biometrics.BiometricManager) r1
            r0 = 30
            if (r2 < r0) goto L21
            if (r1 == 0) goto L43
            r0 = 255(0xff, float:3.57E-43)
            int r0 = r1.canAuthenticate(r0)
            if (r0 != 0) goto L43
        L1e:
            p0.pair r0 = p0.pair.f28241d
            return r0
        L21:
            if (r1 == 0) goto L43
            int r0 = r1.canAuthenticate()
            if (r0 != 0) goto L43
            goto L1e
        L2a:
            android.app.Application r1 = r3.f19687a
            java.lang.Class<android.hardware.fingerprint.FingerprintManager> r0 = android.hardware.fingerprint.FingerprintManager.class
            java.lang.Object r1 = androidx.core.content.ContextCompat.getSystemService(r1, r0)
            android.hardware.fingerprint.FingerprintManager r1 = (android.hardware.fingerprint.FingerprintManager) r1
            if (r1 == 0) goto L43
            boolean r0 = r1.isHardwareDetected()
            if (r0 == 0) goto L43
            boolean r0 = r1.hasEnrolledFingerprints()
            if (r0 == 0) goto L43
            goto L1e
        L43:
            android.app.Application r1 = r3.f19687a
            java.lang.Class<android.app.KeyguardManager> r0 = android.app.KeyguardManager.class
            java.lang.Object r0 = androidx.core.content.ContextCompat.getSystemService(r1, r0)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            if (r0 != 0) goto L52
            p0.pair r0 = p0.pair.f28238a
            return r0
        L52:
            boolean r0 = r0.isDeviceSecure()
            if (r0 == 0) goto L5b
            p0.pair r0 = p0.pair.f28240c
            return r0
        L5b:
            p0.pair r0 = p0.pair.f28239b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.superior.a():p0.pair");
    }
}
