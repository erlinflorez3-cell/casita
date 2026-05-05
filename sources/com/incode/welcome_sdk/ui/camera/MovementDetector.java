package com.incode.welcome_sdk.ui.camera;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.incode.welcome_sdk.results.Status;
import com.incode.welcome_sdk.ui.combined_consent.view.components.MarkdownCheckBoxKt;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class MovementDetector implements SensorEventListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f11512j = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f11513n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Sensor> f11514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Sensor f11515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SensorManager f11516c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<Sensor> f11518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Params f11519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f11520g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Params f11522i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Status f11521h = Status.UNCLEAR;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LimitedQueue<Float> f11517d = new LimitedQueue<>(4);

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        List<Sensor> listA;
        int i8 = ~((~i4) | i2);
        int i9 = (~((~i2) | (~i7))) | i8;
        int i10 = i2 | i7;
        int i11 = i2 + i7 + i6 + ((-39394691) * i3) + ((-2104995841) * i5);
        int i12 = i11 * i11;
        int i13 = (i2 * (-1880913482)) + 198443008 + ((-1880913482) * i7) + ((-1126725195) * i8) + (i9 * 1126725195) + (1126725195 * i10) + ((-754188288) * i6) + ((-1529085952) * i3) + ((-319553536) * i5) + ((-289079296) * i12);
        int i14 = ((i2 * 1773844906) - 1404835566) + (i7 * 1773844906) + (i8 * (-613)) + (i9 * IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME) + (i10 * IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME) + (i6 * 1773845519) + (i3 * 1055723859) + (i5 * 1996616689) + (i12 * (-1450508288));
        if (i13 + (i14 * i14 * (-778371072)) == 1) {
            MovementDetector movementDetector = (MovementDetector) objArr[0];
            int i15 = 2 % 2;
            int i16 = f11512j + 39;
            f11513n = i16 % 128;
            int i17 = i16 % 2;
            if (movementDetector.f11522i.f11537i < 3.0f || movementDetector.f11519f.f11537i < 3.0f) {
                return true;
            }
            int i18 = f11512j + 5;
            f11513n = i18 % 128;
            int i19 = i18 % 2;
            return false;
        }
        MovementDetector movementDetector2 = (MovementDetector) objArr[0];
        int i20 = 2 % 2;
        int i21 = f11512j + 49;
        f11513n = i21 % 128;
        int i22 = i21 % 2;
        if (Build.VERSION.SDK_INT < 33) {
            return movementDetector2.a(35, 1);
        }
        int i23 = f11512j + 9;
        f11513n = i23 % 128;
        if (i23 % 2 != 0 ? (listA = movementDetector2.a(35, 1)) != null : (listA = movementDetector2.a(78, 1)) != null) {
            if (!listA.isEmpty()) {
                return listA;
            }
        }
        return movementDetector2.a(40, 38);
    }

    public MovementDetector(Context context) {
        this.f11520g = context;
    }

    private void b() {
        int i2 = 2 % 2;
        int i3 = f11513n + 39;
        int i4 = i3 % 128;
        f11512j = i4;
        int i5 = i3 % 2;
        if (this.f11516c == null) {
            int i6 = i4 + 27;
            f11513n = i6 % 128;
            int i7 = i6 % 2;
            this.f11516c = (SensorManager) this.f11520g.getSystemService("sensor");
        }
    }

    private List<Sensor> c() {
        int i2 = 2 % 2;
        int i3 = f11512j + 75;
        f11513n = i3 % 128;
        int i4 = i3 % 2;
        if (Build.VERSION.SDK_INT >= 33) {
            List<Sensor> listA = a(16, 4);
            if (listA == null || listA.isEmpty()) {
                return a(41, 39);
            }
            return listA;
        }
        List<Sensor> listA2 = a(16, 4);
        int i5 = f11513n + 29;
        f11512j = i5 % 128;
        int i6 = i5 % 2;
        return listA2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<android.hardware.Sensor> a(int r5, int r6) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            java.util.List r2 = r4.a(r5)
            if (r2 == 0) goto L23
            int r0 = com.incode.welcome_sdk.ui.camera.MovementDetector.f11512j
            int r1 = r0 + 47
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.MovementDetector.f11513n = r0
            int r1 = r1 % r3
            boolean r1 = r2.isEmpty()
            r0 = 1
            if (r1 == r0) goto L23
        L19:
            int r0 = com.incode.welcome_sdk.ui.camera.MovementDetector.f11513n
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.MovementDetector.f11512j = r0
            int r1 = r1 % r3
            return r2
        L23:
            java.util.List r2 = r4.a(r6)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.MovementDetector.a(int, int):java.util.List");
    }

    private List<Sensor> a(int i2) {
        List<Sensor> sensorList;
        int i3 = 2 % 2;
        int i4 = f11512j + 121;
        f11513n = i4 % 128;
        if (i4 % 2 == 0) {
            b();
            sensorList = this.f11516c.getSensorList(i2);
            int i5 = 25 / 0;
        } else {
            b();
            sensorList = this.f11516c.getSensorList(i2);
        }
        int i6 = f11513n + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f11512j = i6 % 128;
        if (i6 % 2 == 0) {
            return sensorList;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[Catch: NameNotFoundException -> 0x00a6, TRY_ENTER, TryCatch #0 {NameNotFoundException -> 0x00a6, blocks: (B:12:0x0030, B:21:0x0060, B:28:0x006e, B:32:0x007f, B:38:0x0096, B:39:0x009b, B:40:0x009e, B:22:0x0063, B:23:0x0067, B:14:0x0043), top: B:50:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[Catch: NameNotFoundException -> 0x00a6, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x00a6, blocks: (B:12:0x0030, B:21:0x0060, B:28:0x006e, B:32:0x007f, B:38:0x0096, B:39:0x009b, B:40:0x009e, B:22:0x0063, B:23:0x0067, B:14:0x0043), top: B:50:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int e() {
        /*
            r10 = this;
            r9 = 2
            int r0 = r9 % r9
            int r0 = com.incode.welcome_sdk.ui.camera.MovementDetector.f11513n
            int r1 = r0 + 115
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.MovementDetector.f11512j = r0
            int r1 = r1 % r9
            r8 = 0
            if (r1 == 0) goto L29
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 39
            if (r1 < r0) goto Lab
        L15:
            int r0 = com.incode.welcome_sdk.ui.camera.MovementDetector.f11512j
            int r1 = r0 + 23
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.MovementDetector.f11513n = r0
            int r1 = r1 % r9
            r7 = 1
            r6 = 0
            if (r1 != 0) goto L3d
            android.content.Context r0 = r10.f11520g
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            goto L30
        L29:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto Lab
            goto L15
        L30:
            android.content.Context r0 = r10.f11520g     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La6
            java.lang.String r1 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La6
            r0 = 29941(0x74f5, float:4.1956E-41)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La6
            goto L52
        L3d:
            android.content.Context r0 = r10.f11520g
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            android.content.Context r0 = r10.f11520g     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La6
            java.lang.String r1 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La6
            r0 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La6
            if (r2 == 0) goto L6b
            goto L54
        L52:
            if (r2 == 0) goto L6b
        L54:
            int r0 = com.incode.welcome_sdk.ui.camera.MovementDetector.f11512j
            int r1 = r0 + 33
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.MovementDetector.f11513n = r0
            int r1 = r1 % r9
            if (r1 != 0) goto L60
            goto L63
        L60:
            java.lang.String[] r5 = r2.requestedPermissions     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La6
            goto L6c
        L63:
            java.lang.String[] r5 = r2.requestedPermissions     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La6
            r0 = 22
            int r0 = r0 / r8
            goto L6c
        L69:
            r0 = move-exception
            throw r0
        L6b:
            r5 = r6
        L6c:
            if (r5 == 0) goto La5
            int r4 = r5.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La6
            r3 = r8
        L70:
            if (r3 >= r4) goto La5
            int r0 = com.incode.welcome_sdk.ui.camera.MovementDetector.f11512j
            int r2 = r0 + 7
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.camera.MovementDetector.f11513n = r0
            int r2 = r2 % r9
            java.lang.String r1 = "android.permission.HIGH_SAMPLING_RATE_SENSORS"
            if (r2 == 0) goto L96
            r0 = r5[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La6
            boolean r0 = r0.contentEquals(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La6
            if (r0 == 0) goto L93
            int r0 = com.incode.welcome_sdk.ui.camera.MovementDetector.f11512j
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.MovementDetector.f11513n = r0
            int r1 = r1 % r9
            if (r1 == 0) goto La1
            return r8
        L93:
            int r3 = r3 + 1
            goto L70
        L96:
            r0 = r5[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La6
            r0.contentEquals(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La6
            r6.hashCode()     // Catch: java.lang.Throwable -> L9f android.content.pm.PackageManager.NameNotFoundException -> La6
            throw r6     // Catch: java.lang.Throwable -> L9f android.content.pm.PackageManager.NameNotFoundException -> La6
        L9f:
            r0 = move-exception
            throw r0
        La1:
            r6.hashCode()
            throw r6
        La5:
            return r7
        La6:
            r0 = move-exception
            timber.log.Timber.e(r0)
            return r7
        Lab:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.MovementDetector.e():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean hasAccelerometers() {
        /*
            r10 = this;
            r2 = 2
            int r0 = r2 % r2
            java.util.List<android.hardware.Sensor> r0 = r10.f11514a
            if (r0 != 0) goto L34
            int r0 = com.incode.welcome_sdk.ui.camera.MovementDetector.f11512j
            int r1 = r0 + 83
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.MovementDetector.f11513n = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L52
            java.lang.Object[] r8 = new java.lang.Object[]{r10}
            int r5 = com.incode.welcome_sdk.ui.combined_consent.view.components.MarkdownCheckBoxKt.c()
            int r7 = com.incode.welcome_sdk.ui.combined_consent.view.components.MarkdownCheckBoxKt.c()
            int r4 = com.incode.welcome_sdk.ui.combined_consent.view.components.MarkdownCheckBoxKt.c()
            int r6 = com.incode.welcome_sdk.ui.combined_consent.view.components.MarkdownCheckBoxKt.c()
            r3 = -658972945(0xffffffffd8b8deef, float:-1.626141E15)
            r9 = 658972945(0x27472111, float:2.7634723E-15)
            java.lang.Object r0 = c(r3, r4, r5, r6, r7, r8, r9)
            java.util.List r0 = (java.util.List) r0
            r10.f11514a = r0
        L34:
            java.util.List<android.hardware.Sensor> r1 = r10.f11514a
            r4 = 0
            if (r1 == 0) goto L4e
            int r0 = com.incode.welcome_sdk.ui.camera.MovementDetector.f11512j
            int r3 = r0 + 15
            int r0 = r3 % 128
            com.incode.welcome_sdk.ui.camera.MovementDetector.f11513n = r0
            int r3 = r3 % r2
            r2 = 1
            boolean r1 = r1.isEmpty()
            if (r3 != 0) goto L4f
            r0 = 6
            int r0 = r0 / r4
            r1 = r1 ^ r2
            if (r1 == r2) goto L51
        L4e:
            return r4
        L4f:
            if (r1 != 0) goto L4e
        L51:
            return r2
        L52:
            java.lang.Object[] r5 = new java.lang.Object[]{r10}
            int r2 = com.incode.welcome_sdk.ui.combined_consent.view.components.MarkdownCheckBoxKt.c()
            int r4 = com.incode.welcome_sdk.ui.combined_consent.view.components.MarkdownCheckBoxKt.c()
            int r1 = com.incode.welcome_sdk.ui.combined_consent.view.components.MarkdownCheckBoxKt.c()
            int r3 = com.incode.welcome_sdk.ui.combined_consent.view.components.MarkdownCheckBoxKt.c()
            r0 = -658972945(0xffffffffd8b8deef, float:-1.626141E15)
            r6 = 658972945(0x27472111, float:2.7634723E-15)
            java.lang.Object r0 = c(r0, r1, r2, r3, r4, r5, r6)
            java.util.List r0 = (java.util.List) r0
            r10.f11514a = r0
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.MovementDetector.hasAccelerometers():boolean");
    }

    public boolean hasGyroscopes() {
        int i2 = 2 % 2;
        int i3 = f11512j + 23;
        f11513n = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.f11518e == null) {
            this.f11518e = c();
        }
        List<Sensor> list = this.f11518e;
        if (list == null) {
            return false;
        }
        int i4 = f11512j + 69;
        f11513n = i4 % 128;
        if (i4 % 2 == 0) {
            list.isEmpty();
            obj.hashCode();
            throw null;
        }
        if (list.isEmpty()) {
            return false;
        }
        int i5 = f11512j + 51;
        f11513n = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public void start() {
        int i2 = 2 % 2;
        int i3 = f11512j + 69;
        f11513n = i3 % 128;
        int i4 = i3 % 2;
        b();
        SensorManager sensorManager = this.f11516c;
        if (sensorManager == null) {
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.f11515b = defaultSensor;
        if (defaultSensor != null) {
            int i5 = f11512j + 107;
            f11513n = i5 % 128;
            int i6 = i5 % 2;
            this.f11516c.registerListener(this, defaultSensor, 3);
            int i7 = f11512j + 69;
            f11513n = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 / 2;
            }
        }
    }

    public void stop() {
        int i2 = 2 % 2;
        SensorManager sensorManager = this.f11516c;
        if (sensorManager != null) {
            int i3 = f11512j + 79;
            int i4 = i3 % 128;
            f11513n = i4;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            Sensor sensor = this.f11515b;
            if (sensor != null) {
                int i5 = i4 + 31;
                f11512j = i5 % 128;
                int i6 = i5 % 2;
                sensorManager.unregisterListener(this, sensor);
                this.f11515b = null;
            }
        }
    }

    public void startMotionDataTracking() {
        int i2 = 2 % 2;
        int i3 = f11513n + 17;
        f11512j = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            b();
            throw null;
        }
        b();
        if (this.f11516c == null) {
            return;
        }
        this.f11522i = new Params();
        this.f11519f = new Params();
        int iC = MarkdownCheckBoxKt.c();
        int iC2 = MarkdownCheckBoxKt.c();
        this.f11514a = (List) c(-658972945, MarkdownCheckBoxKt.c(), iC, MarkdownCheckBoxKt.c(), iC2, new Object[]{this}, 658972945);
        this.f11518e = c();
        if (hasAccelerometers()) {
            Iterator<Sensor> it = this.f11514a.iterator();
            while (it.hasNext()) {
                int i4 = f11513n + 83;
                f11512j = i4 % 128;
                int i5 = i4 % 2;
                this.f11516c.registerListener(this, it.next(), e());
            }
        } else {
            Timber.w("acno", new Object[0]);
        }
        if (!hasGyroscopes()) {
            Timber.w("gyno", new Object[0]);
            int i6 = f11512j + 95;
            f11513n = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = f11513n + 25;
        f11512j = i8 % 128;
        if (i8 % 2 != 0) {
            this.f11518e.iterator();
            obj.hashCode();
            throw null;
        }
        Iterator<Sensor> it2 = this.f11518e.iterator();
        while (it2.hasNext()) {
            int i9 = f11512j + 111;
            f11513n = i9 % 128;
            int i10 = i9 % 2;
            this.f11516c.registerListener(this, it2.next(), e());
        }
    }

    public void stopMotionDataTracking() {
        int i2 = 2 % 2;
        int i3 = f11513n + 77;
        f11512j = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.f11516c == null) {
            return;
        }
        this.f11522i = null;
        this.f11519f = null;
        this.f11521h = Status.UNCLEAR;
        if (hasAccelerometers()) {
            int i4 = f11512j + 105;
            f11513n = i4 % 128;
            int i5 = i4 % 2;
            Iterator<Sensor> it = this.f11514a.iterator();
            while (it.hasNext()) {
                this.f11516c.unregisterListener(this, it.next());
            }
            this.f11514a = null;
            int i6 = f11512j + 39;
            f11513n = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 % 5;
            }
        }
        if (hasGyroscopes()) {
            Iterator<Sensor> it2 = this.f11518e.iterator();
            while (it2.hasNext()) {
                this.f11516c.unregisterListener(this, it2.next());
                int i8 = f11513n + 79;
                f11512j = i8 % 128;
                int i9 = i8 % 2;
            }
            this.f11518e = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f2 = sensorEvent.values[0];
        float f3 = sensorEvent.values[1];
        float f4 = sensorEvent.values[2];
        int type = sensorEvent.sensor.getType();
        if (type != 1) {
            if (type != 4) {
                if (type == 10) {
                    float fSqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4));
                    synchronized (this.f11517d) {
                        this.f11517d.add(Float.valueOf(fSqrt));
                    }
                    return;
                }
                if (type != 16) {
                    if (type != 35) {
                        switch (type) {
                            case 38:
                            case 40:
                                break;
                            case 39:
                            case 41:
                                break;
                            default:
                                return;
                        }
                    }
                }
            }
            if (sensorEvent.accuracy == 0) {
                return;
            }
            b(this.f11519f, f2, f3, f4);
            return;
        }
        if (sensorEvent.accuracy != 0) {
            b(this.f11522i, f2, f3, f4);
        }
    }

    private static void b(Params params, float f2, float f3, float f4) {
        int i2 = 2 % 2;
        int i3 = f11512j + 75;
        int i4 = i3 % 128;
        f11513n = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (params != null) {
            int i5 = i4 + 111;
            f11512j = i5 % 128;
            if (i5 % 2 == 0) {
                params.update(f2, f3, f4);
            } else {
                params.update(f2, f3, f4);
                throw null;
            }
        }
    }

    public boolean isDeviceStable() {
        Float[] fArr;
        synchronized (this.f11517d) {
            fArr = (Float[]) this.f11517d.toArray(new Float[0]);
        }
        int length = fArr.length;
        Float f2 = null;
        int i2 = 0;
        while (i2 < length) {
            Float f3 = fArr[i2];
            if (f2 != null && f3.floatValue() > f2.floatValue() && f3.floatValue() - f2.floatValue() > 0.1d) {
                return false;
            }
            i2++;
            f2 = f3;
        }
        return true;
    }

    public Status check() {
        Status status;
        int i2 = 2 % 2;
        int i3 = f11512j + 73;
        f11513n = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Status status2 = Status.FAIL;
            obj.hashCode();
            throw null;
        }
        if (this.f11521h == Status.FAIL) {
            return this.f11521h;
        }
        Boolean boolA = a();
        if (boolA == null) {
            int i4 = f11512j + 115;
            f11513n = i4 % 128;
            if (i4 % 2 == 0) {
                Status status3 = Status.UNCLEAR;
                throw null;
            }
            status = Status.UNCLEAR;
        } else if (boolA.booleanValue()) {
            int i5 = f11512j + 13;
            f11513n = i5 % 128;
            if (i5 % 2 == 0) {
                Status status4 = Status.FAIL;
                obj.hashCode();
                throw null;
            }
            status = Status.FAIL;
        } else {
            status = Status.PASS;
        }
        this.f11521h = status;
        i();
        return this.f11521h;
    }

    private Boolean a() {
        int i2 = 2 % 2;
        boolean z2 = false;
        if (g()) {
            int i3 = f11512j + 27;
            f11513n = i3 % 128;
            if (i3 % 2 == 0) {
                ((Boolean) c(-1181948165, MarkdownCheckBoxKt.c(), MarkdownCheckBoxKt.c(), MarkdownCheckBoxKt.c(), MarkdownCheckBoxKt.c(), new Object[]{this}, 1181948166)).booleanValue();
                throw null;
            }
            if (!((Boolean) c(-1181948165, MarkdownCheckBoxKt.c(), MarkdownCheckBoxKt.c(), MarkdownCheckBoxKt.c(), MarkdownCheckBoxKt.c(), new Object[]{this}, 1181948166)).booleanValue()) {
                boolean zA = a(this.f11519f, false);
                boolean zA2 = a(this.f11522i, false);
                boolean zA3 = a(this.f11519f, true);
                boolean zA4 = a(this.f11522i, true);
                if (zA && zA3 && !(!zA2) && zA4) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }
        int i4 = f11513n + 45;
        f11512j = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return null;
    }

    private boolean g() {
        int i2 = 2 % 2;
        if (this.f11522i != null && this.f11519f != null) {
            int i3 = f11512j + 5;
            f11513n = i3 % 128;
            return i3 % 2 != 0;
        }
        int i4 = f11512j + 83;
        f11513n = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private void i() {
        int i2 = 2 % 2;
        Params params = this.f11522i;
        if (params != null) {
            int i3 = f11512j + 89;
            f11513n = i3 % 128;
            if (i3 % 2 == 0) {
                params.reset();
                int i4 = 52 / 0;
            } else {
                params.reset();
            }
        }
        Params params2 = this.f11519f;
        if (params2 != null) {
            params2.reset();
            int i5 = f11513n + 63;
            f11512j = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static Point3d d(Params params) {
        int i2 = 2 % 2;
        Point3d point3d = new Point3d((float) Math.sqrt(params.f11529a / params.f11537i), (float) Math.sqrt(params.f11532d / params.f11537i), (float) Math.sqrt(params.f11530b / params.f11537i));
        int i3 = f11512j + 7;
        f11513n = i3 % 128;
        if (i3 % 2 != 0) {
            return point3d;
        }
        throw null;
    }

    private static Point3d c(Params params) {
        int i2 = 2 % 2;
        Point3d point3d = new Point3d(params.f11531c / params.f11537i, params.f11533e / params.f11537i, params.f11534f / params.f11537i);
        int i3 = f11512j + 41;
        f11513n = i3 % 128;
        int i4 = i3 % 2;
        return point3d;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(com.incode.welcome_sdk.ui.camera.MovementDetector.Params r6, boolean r7) {
        /*
            r5 = 2
            int r0 = r5 % r5
            int r2 = com.incode.welcome_sdk.ui.camera.MovementDetector.f11512j
            int r1 = r2 + 123
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.MovementDetector.f11513n = r0
            int r1 = r1 % r5
            if (r7 == 0) goto L4f
            int r1 = r2 + 65
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.MovementDetector.f11513n = r0
            int r1 = r1 % r5
            com.incode.welcome_sdk.ui.camera.MovementDetector$Point3d r4 = c(r6)
        L19:
            float r0 = r4.f11540b
            r3 = 1050253722(0x3e99999a, float:0.3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r2 = 0
            if (r0 >= 0) goto L54
            int r0 = com.incode.welcome_sdk.ui.camera.MovementDetector.f11512j
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.MovementDetector.f11513n = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L48
            float r0 = r4.f11539a
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r0 = 35
            int r0 = r0 / r2
            if (r1 >= 0) goto L54
        L37:
            float r0 = r4.f11541e
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L54
            int r0 = com.incode.welcome_sdk.ui.camera.MovementDetector.f11513n
            int r1 = r0 + 105
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.MovementDetector.f11512j = r0
            int r1 = r1 % r5
            r0 = 1
            return r0
        L48:
            float r0 = r4.f11539a
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L54
            goto L37
        L4f:
            com.incode.welcome_sdk.ui.camera.MovementDetector$Point3d r4 = d(r6)
            goto L19
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.MovementDetector.a(com.incode.welcome_sdk.ui.camera.MovementDetector$Params, boolean):boolean");
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
        int i3 = 2 % 2;
        int i4 = f11513n + 59;
        f11512j = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
    }

    public class LimitedQueue<E> extends LinkedList<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11523c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11524d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f11526e;

        public LimitedQueue(int i2) {
            this.f11526e = i2;
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
        public boolean add(E e2) {
            int i2 = 2 % 2;
            boolean zAdd = super.add(e2);
            int i3 = f11524d + 29;
            f11523c = i3 % 128;
            int i4 = i3 % 2;
            while (zAdd && size() > this.f11526e) {
                int i5 = f11524d + 37;
                f11523c = i5 % 128;
                if (i5 % 2 != 0) {
                    super.remove();
                    throw null;
                }
                super.remove();
            }
            return zAdd;
        }

        public int getLimit() {
            int i2 = 2 % 2;
            int i3 = f11523c;
            int i4 = i3 + 71;
            f11524d = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = this.f11526e;
            int i6 = i3 + 117;
            f11524d = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 23 / 0;
            }
            return i5;
        }

        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public synchronized <T> T[] toArray(T[] tArr) {
            int i2 = 2 % 2;
            int i3 = f11524d + 59;
            f11523c = i3 % 128;
            int i4 = i3 % 2;
            T[] tArr2 = (T[]) super.toArray(tArr);
            int i5 = f11523c + 91;
            f11524d = i5 % 128;
            if (i5 % 2 != 0) {
                return tArr2;
            }
            int i6 = 93 / 0;
            return tArr2;
        }
    }

    public static class Params {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static int f11527k = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static int f11528n = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f11536h = 0.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f11535g = 0.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f11538j = 0.0f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f11529a = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f11532d = 0.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f11530b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f11531c = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f11533e = 0.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f11534f = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f11537i = 0;

        public void update(float f2, float f3, float f4) {
            int i2 = 2 % 2;
            int i3 = f11528n + 85;
            f11527k = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.f11537i + 1;
            this.f11537i = i5;
            float f5 = this.f11536h;
            float f6 = f2 - f5;
            float f7 = this.f11535g;
            float f8 = f3 - f7;
            float f9 = this.f11538j;
            float f10 = f4 - f9;
            float f11 = f5 + (f6 / i5);
            this.f11536h = f11;
            float f12 = f7 + (f8 / i5);
            this.f11535g = f12;
            float f13 = f9 + (f10 / i5);
            this.f11538j = f13;
            this.f11529a += f6 * (f2 - f11);
            this.f11532d += f8 * (f3 - f12);
            this.f11530b += f10 * (f4 - f13);
            this.f11531c += Math.abs(f2 - f11);
            this.f11533e += Math.abs(f3 - this.f11535g);
            this.f11534f += Math.abs(f4 - this.f11538j);
            int i6 = f11527k + 3;
            f11528n = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void reset() {
            int i2 = 2 % 2;
            int i3 = f11528n;
            int i4 = i3 + 17;
            f11527k = i4 % 128;
            int i5 = i4 % 2;
            this.f11536h = 0.0f;
            this.f11535g = 0.0f;
            this.f11538j = 0.0f;
            this.f11529a = 0.0f;
            this.f11532d = 0.0f;
            this.f11530b = 0.0f;
            this.f11531c = 0.0f;
            this.f11533e = 0.0f;
            this.f11534f = 0.0f;
            this.f11537i = 0;
            int i6 = i3 + 125;
            f11527k = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static class Point3d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f11539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f11540b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f11541e;

        public Point3d(float f2, float f3, float f4) {
            this.f11540b = f2;
            this.f11539a = f3;
            this.f11541e = f4;
        }
    }

    private boolean j() {
        int iC = MarkdownCheckBoxKt.c();
        int iC2 = MarkdownCheckBoxKt.c();
        return ((Boolean) c(-1181948165, MarkdownCheckBoxKt.c(), iC, MarkdownCheckBoxKt.c(), iC2, new Object[]{this}, 1181948166)).booleanValue();
    }

    private List<Sensor> d() {
        int iC = MarkdownCheckBoxKt.c();
        int iC2 = MarkdownCheckBoxKt.c();
        return (List) c(-658972945, MarkdownCheckBoxKt.c(), iC, MarkdownCheckBoxKt.c(), iC2, new Object[]{this}, 658972945);
    }
}
