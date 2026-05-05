package com.facetec.sdk;

import android.app.Activity;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.core.AnimationKt;
import androidx.core.app.NotificationManagerCompat;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlinx.coroutines.DebugKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
class bm extends be implements Camera.AutoFocusCallback, Camera.ErrorCallback, Camera.PreviewCallback, SurfaceHolder.Callback {

    /* JADX INFO: renamed from: y */
    private static /* synthetic */ boolean f3018y = true;

    /* JADX INFO: renamed from: b */
    protected long f3019b;

    /* JADX INFO: renamed from: c */
    private Handler f3020c;

    /* JADX INFO: renamed from: f */
    private final WeakReference<g> f3022f;

    /* JADX INFO: renamed from: h */
    private int f3024h;

    /* JADX INFO: renamed from: i */
    private final I f3025i;

    /* JADX INFO: renamed from: j */
    private SurfaceHolder f3026j;

    /* JADX INFO: renamed from: k */
    private boolean f3027k;

    /* JADX INFO: renamed from: m */
    private final bu f3029m;

    /* JADX INFO: renamed from: p */
    private Handler f3032p;

    /* JADX INFO: renamed from: r */
    private final Camera.AutoFocusMoveCallback f3034r;

    /* JADX INFO: renamed from: s */
    private String f3035s;

    /* JADX INFO: renamed from: t */
    private final Camera.AutoFocusCallback f3036t;

    /* JADX INFO: renamed from: e */
    private boolean f3021e = false;

    /* JADX INFO: renamed from: g */
    private Camera f3023g = null;

    /* JADX INFO: renamed from: n */
    private boolean f3030n = false;

    /* JADX INFO: renamed from: l */
    private boolean f3028l = false;

    /* JADX INFO: renamed from: o */
    private boolean f3031o = false;

    /* JADX INFO: renamed from: q */
    private boolean f3033q = false;

    /* JADX INFO: renamed from: com.facetec.sdk.bm$1 */
    final class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                bm.this.e();
                bm.L();
            } catch (Exception e2) {
                L.V(e2);
                ce.I(e2.getMessage());
                bm.this.V(e2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bm$10 */
    final class AnonymousClass10 implements Comparator<Camera.Size> {
        AnonymousClass10() {
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
            Camera.Size size3 = size;
            Camera.Size size4 = size2;
            return (size4.width * size4.height) - (size3.width * size3.height);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bm$2 */
    final class AnonymousClass2 implements Runnable {
        private /* synthetic */ Runnable Code;

        AnonymousClass2(Runnable runnable) {
            runnable = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Runnable runnable = runnable;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bm$3 */
    final class AnonymousClass3 implements Runnable {
        AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (bm.this.c() > 0) {
                return;
            }
            bm.this.a();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bm$4 */
    final class AnonymousClass4 implements Runnable {
        AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            bm.B(bm.this);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bm$5 */
    final class AnonymousClass5 implements Camera.AutoFocusMoveCallback {
        AnonymousClass5() {
        }

        @Override // android.hardware.Camera.AutoFocusMoveCallback
        public final void onAutoFocusMoving(boolean z2, Camera camera) {
            bm.this.f3031o = !z2;
            bm.this.f3021e = z2;
            bm.this.f3019b = System.nanoTime() / AnimationKt.MillisToNanos;
            boolean unused = bm.this.f3031o;
            if (bm.this.f3030n && bm.this.f3031o) {
                ai.o(true);
                bm.L(bm.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bm$6 */
    final class AnonymousClass6 implements Comparator<Camera.Size> {
        AnonymousClass6() {
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
            Camera.Size size3 = size;
            Camera.Size size4 = size2;
            return (size4.width * size4.height) - (size3.width * size3.height);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bm$8 */
    final class AnonymousClass8 implements Runnable {
        AnonymousClass8() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (bm.this.f3033q) {
                return;
            }
            bm.this.d();
            bm.this.b();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bm$9 */
    final class AnonymousClass9 implements Camera.AutoFocusCallback {
        AnonymousClass9() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public final void onAutoFocus(boolean z2, Camera camera) {
            bm.this.f3031o = z2;
            bm.this.f3019b = System.nanoTime() / AnimationKt.MillisToNanos;
            bm.this.d();
            if (bm.this.f()) {
                bm.this.b();
            }
            if (bm.this.f3030n && z2) {
                ai.o(true);
                bm.L(bm.this);
            }
        }
    }

    bm(Activity activity) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Ig.wd("8\u0014[NZv\u001a\f}r3+\u0003t*}M", (short) (ZN.Xd() ^ 25680))).getDeclaredMethod(EO.Od("7\u0006\u0017\u0013W\u0005q?\u00165\rkG", (short) (Od.Xd() ^ (-30194))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.f3032p = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.f3035s = "";
            this.f3019b = -1L;
            this.f3034r = new Camera.AutoFocusMoveCallback() { // from class: com.facetec.sdk.bm.5
                AnonymousClass5() {
                }

                @Override // android.hardware.Camera.AutoFocusMoveCallback
                public final void onAutoFocusMoving(boolean z2, Camera camera) {
                    bm.this.f3031o = !z2;
                    bm.this.f3021e = z2;
                    bm.this.f3019b = System.nanoTime() / AnimationKt.MillisToNanos;
                    boolean unused = bm.this.f3031o;
                    if (bm.this.f3030n && bm.this.f3031o) {
                        ai.o(true);
                        bm.L(bm.this);
                    }
                }
            };
            this.f3036t = new Camera.AutoFocusCallback() { // from class: com.facetec.sdk.bm.9
                AnonymousClass9() {
                }

                @Override // android.hardware.Camera.AutoFocusCallback
                public final void onAutoFocus(boolean z2, Camera camera) {
                    bm.this.f3031o = z2;
                    bm.this.f3019b = System.nanoTime() / AnimationKt.MillisToNanos;
                    bm.this.d();
                    if (bm.this.f()) {
                        bm.this.b();
                    }
                    if (bm.this.f3030n && z2) {
                        ai.o(true);
                        bm.L(bm.this);
                    }
                }
            };
            this.f3022f = new WeakReference<>((g) activity);
            this.f3020c = new Handler();
            I i2 = new I(activity);
            this.f3025i = i2;
            i2.getHolder().addCallback(this);
            this.f3027k = true;
            bu buVarB = B();
            this.f3029m = buVarB;
            if (!f3018y && buVarB == null) {
                throw new AssertionError();
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static Rect B(float f2, float f3, ViewGroup viewGroup) {
        int width;
        int height;
        if (viewGroup != null) {
            width = viewGroup.getWidth();
            height = viewGroup.getHeight();
        } else {
            width = be.f2975a;
            height = be.f2977d;
        }
        int I = I(Float.valueOf(((f2 / width) * 2000.0f) - 1000.0f).intValue());
        int I2 = I(Float.valueOf(((f3 / height) * 2000.0f) - 1000.0f).intValue());
        return new Rect(I, I2, I + 300, I2 + 300);
    }

    static /* synthetic */ boolean B(bm bmVar) {
        bmVar.f3033q = false;
        return false;
    }

    public static synchronized bu C() throws Exception {
        ArrayList arrayList;
        float[] fArr = {1.7f, 1.6f, 1.5f, 1.4f, 1.3f};
        arrayList = new ArrayList();
        Camera cameraV = V(new Camera.CameraInfo());
        List<Camera.Size> supportedPreviewSizes = cameraV.getParameters().getSupportedPreviewSizes();
        Collections.sort(supportedPreviewSizes, new Comparator<Camera.Size>() { // from class: com.facetec.sdk.bm.6
            AnonymousClass6() {
            }

            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
                Camera.Size size3 = size;
                Camera.Size size4 = size2;
                return (size4.width * size4.height) - (size3.width * size3.height);
            }
        });
        be.I = new StringBuilder().append(supportedPreviewSizes.get(0).width).append("x").append(supportedPreviewSizes.get(0).height).toString();
        if (!Code) {
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                for (Camera.Size size : supportedPreviewSizes) {
                    float f3 = size.width;
                    float f4 = f3 / size.height;
                    if (f4 >= f2 && f4 <= 1.9f && f3 >= 640.0f && f3 <= 1920.0f) {
                        arrayList.add(size);
                    }
                }
                if (arrayList.size() > 0) {
                    break;
                }
            }
        } else {
            for (Camera.Size size2 : supportedPreviewSizes) {
                float f5 = size2.width;
                if (f5 / size2.height == D && f5 <= 1920.0f) {
                    arrayList.add(size2);
                }
            }
        }
        cameraV.stopPreview();
        cameraV.release();
        return new bu(((Camera.Size) arrayList.get(0)).width, ((Camera.Size) arrayList.get(0)).height);
    }

    static float D() {
        bu buVarB = be.B();
        return buVarB.B / buVarB.I;
    }

    private synchronized void F() {
        Camera camera = this.f3023g;
        try {
            if (camera != null) {
                try {
                    camera.cancelAutoFocus();
                    this.f3023g.stopPreview();
                    this.f3023g.setPreviewCallback(null);
                    this.f3023g.release();
                } catch (Exception e2) {
                    ce.I(e2.getMessage());
                }
            }
            Handler handler = this.f3020c;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f3020c = null;
            }
        } finally {
            this.f3023g = null;
        }
    }

    private static int I(int i2) {
        int iRound = Math.round(150.0f);
        return Math.abs(i2) + iRound > 1000 ? i2 > 0 ? 1000 - iRound : iRound + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED : i2 - iRound;
    }

    static /* synthetic */ boolean L() {
        return true;
    }

    static /* synthetic */ boolean L(bm bmVar) {
        bmVar.f3030n = false;
        return false;
    }

    private static Camera V(Camera.CameraInfo cameraInfo) throws Exception {
        int i2 = 0;
        if (be.Code) {
            try {
                Camera.getCameraInfo(0, cameraInfo);
            } catch (RuntimeException unused) {
                i2 = 1;
            }
            return Camera.open(i2);
        }
        try {
            Camera.getCameraInfo(1, cameraInfo);
            i2 = 1;
        } catch (RuntimeException unused2) {
            Camera.getCameraInfo(0, cameraInfo);
        }
        if (cameraInfo.facing == 1) {
            return Camera.open(i2);
        }
        throw new bx("Front facing camera not available");
    }

    private void V(Rect rect) {
        if (this.f3021e || this.f3023g == null || !this.f3028l) {
            return;
        }
        this.f3021e = true;
        this.f3019b = System.nanoTime() / AnimationKt.MillisToNanos;
        try {
            Camera.Parameters parameters = this.f3023g.getParameters();
            if (parameters.getSupportedFocusModes().contains("auto")) {
                parameters.setFocusMode("auto");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(rect, LeicaMakernoteDirectory.TAG_CAMERA_TEMPERATURE));
            if (parameters.getMaxNumFocusAreas() > 0) {
                parameters.setFocusAreas(arrayList);
            }
            this.f3023g.setParameters(parameters);
            Code(false);
            this.f3023g.autoFocus(this.f3036t);
        } catch (Exception e2) {
            e2.getMessage();
            d();
            b();
        }
    }

    public void V(String str) {
        g gVar = this.f3022f.get();
        if (gVar != null) {
            gVar.V(str);
        }
    }

    private static Camera.Size Z(Camera.Parameters parameters, float f2) {
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        Collections.sort(supportedPictureSizes, new Comparator<Camera.Size>() { // from class: com.facetec.sdk.bm.10
            AnonymousClass10() {
            }

            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
                Camera.Size size3 = size;
                Camera.Size size4 = size2;
                return (size4.width * size4.height) - (size3.width * size3.height);
            }
        });
        for (Camera.Size size : supportedPictureSizes) {
            if (size.width / size.height == f2) {
                return size;
            }
        }
        return supportedPictureSizes.get(0);
    }

    public void a() {
        if (this.f3023g == null || this.f3021e) {
            return;
        }
        V(B(be.F, be.L, null));
    }

    public void b() {
        if (this.f3023g == null || this.f3035s.isEmpty()) {
            return;
        }
        try {
            Camera.Parameters parameters = this.f3023g.getParameters();
            parameters.setFocusMode(this.f3035s);
            if (parameters.getMaxNumFocusAreas() > 0) {
                parameters.setFocusAreas(null);
            }
            if (parameters.getMaxNumMeteringAreas() > 0) {
                parameters.setMeteringAreas(null);
            }
            this.f3023g.setParameters(parameters);
            Code(false);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public long c() {
        if (this.f3019b != -1) {
            long jNanoTime = (System.nanoTime() / AnimationKt.MillisToNanos) - this.f3019b;
            if (jNanoTime < 8000) {
                return 8000 - jNanoTime;
            }
        }
        return 0L;
    }

    public void d() {
        this.f3021e = false;
        Camera camera = this.f3023g;
        if (camera == null) {
            return;
        }
        try {
            camera.cancelAutoFocus();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0056 A[Catch: all -> 0x0345, TryCatch #0 {, blocks: (B:105:0x0001, B:110:0x000e, B:112:0x0016, B:123:0x0047, B:125:0x0056, B:126:0x005d, B:130:0x007a, B:131:0x0087, B:133:0x008b, B:134:0x0098, B:136:0x00bd, B:138:0x00d2, B:154:0x0196, B:156:0x019f, B:158:0x01a5, B:159:0x01ac, B:161:0x01b2, B:162:0x01b5, B:164:0x01bb, B:165:0x01be, B:166:0x0204, B:168:0x020a, B:169:0x0223, B:171:0x022f, B:172:0x0234, B:173:0x024c, B:175:0x0252, B:176:0x026a, B:177:0x028e, B:178:0x0295, B:179:0x02b8, B:181:0x02be, B:182:0x02d8, B:183:0x032f, B:185:0x0338, B:186:0x033c, B:188:0x033e, B:189:0x0342, B:139:0x00ea, B:141:0x00ff, B:142:0x010f, B:144:0x012b, B:145:0x013b, B:146:0x0152, B:148:0x0158, B:149:0x0170, B:151:0x017c, B:129:0x006c), top: B:195:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x008b A[Catch: all -> 0x0345, TryCatch #0 {, blocks: (B:105:0x0001, B:110:0x000e, B:112:0x0016, B:123:0x0047, B:125:0x0056, B:126:0x005d, B:130:0x007a, B:131:0x0087, B:133:0x008b, B:134:0x0098, B:136:0x00bd, B:138:0x00d2, B:154:0x0196, B:156:0x019f, B:158:0x01a5, B:159:0x01ac, B:161:0x01b2, B:162:0x01b5, B:164:0x01bb, B:165:0x01be, B:166:0x0204, B:168:0x020a, B:169:0x0223, B:171:0x022f, B:172:0x0234, B:173:0x024c, B:175:0x0252, B:176:0x026a, B:177:0x028e, B:178:0x0295, B:179:0x02b8, B:181:0x02be, B:182:0x02d8, B:183:0x032f, B:185:0x0338, B:186:0x033c, B:188:0x033e, B:189:0x0342, B:139:0x00ea, B:141:0x00ff, B:142:0x010f, B:144:0x012b, B:145:0x013b, B:146:0x0152, B:148:0x0158, B:149:0x0170, B:151:0x017c, B:129:0x006c), top: B:195:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ff A[Catch: all -> 0x0345, TryCatch #0 {, blocks: (B:105:0x0001, B:110:0x000e, B:112:0x0016, B:123:0x0047, B:125:0x0056, B:126:0x005d, B:130:0x007a, B:131:0x0087, B:133:0x008b, B:134:0x0098, B:136:0x00bd, B:138:0x00d2, B:154:0x0196, B:156:0x019f, B:158:0x01a5, B:159:0x01ac, B:161:0x01b2, B:162:0x01b5, B:164:0x01bb, B:165:0x01be, B:166:0x0204, B:168:0x020a, B:169:0x0223, B:171:0x022f, B:172:0x0234, B:173:0x024c, B:175:0x0252, B:176:0x026a, B:177:0x028e, B:178:0x0295, B:179:0x02b8, B:181:0x02be, B:182:0x02d8, B:183:0x032f, B:185:0x0338, B:186:0x033c, B:188:0x033e, B:189:0x0342, B:139:0x00ea, B:141:0x00ff, B:142:0x010f, B:144:0x012b, B:145:0x013b, B:146:0x0152, B:148:0x0158, B:149:0x0170, B:151:0x017c, B:129:0x006c), top: B:195:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x010f A[Catch: all -> 0x0345, TryCatch #0 {, blocks: (B:105:0x0001, B:110:0x000e, B:112:0x0016, B:123:0x0047, B:125:0x0056, B:126:0x005d, B:130:0x007a, B:131:0x0087, B:133:0x008b, B:134:0x0098, B:136:0x00bd, B:138:0x00d2, B:154:0x0196, B:156:0x019f, B:158:0x01a5, B:159:0x01ac, B:161:0x01b2, B:162:0x01b5, B:164:0x01bb, B:165:0x01be, B:166:0x0204, B:168:0x020a, B:169:0x0223, B:171:0x022f, B:172:0x0234, B:173:0x024c, B:175:0x0252, B:176:0x026a, B:177:0x028e, B:178:0x0295, B:179:0x02b8, B:181:0x02be, B:182:0x02d8, B:183:0x032f, B:185:0x0338, B:186:0x033c, B:188:0x033e, B:189:0x0342, B:139:0x00ea, B:141:0x00ff, B:142:0x010f, B:144:0x012b, B:145:0x013b, B:146:0x0152, B:148:0x0158, B:149:0x0170, B:151:0x017c, B:129:0x006c), top: B:195:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0196 A[Catch: all -> 0x0345, TryCatch #0 {, blocks: (B:105:0x0001, B:110:0x000e, B:112:0x0016, B:123:0x0047, B:125:0x0056, B:126:0x005d, B:130:0x007a, B:131:0x0087, B:133:0x008b, B:134:0x0098, B:136:0x00bd, B:138:0x00d2, B:154:0x0196, B:156:0x019f, B:158:0x01a5, B:159:0x01ac, B:161:0x01b2, B:162:0x01b5, B:164:0x01bb, B:165:0x01be, B:166:0x0204, B:168:0x020a, B:169:0x0223, B:171:0x022f, B:172:0x0234, B:173:0x024c, B:175:0x0252, B:176:0x026a, B:177:0x028e, B:178:0x0295, B:179:0x02b8, B:181:0x02be, B:182:0x02d8, B:183:0x032f, B:185:0x0338, B:186:0x033c, B:188:0x033e, B:189:0x0342, B:139:0x00ea, B:141:0x00ff, B:142:0x010f, B:144:0x012b, B:145:0x013b, B:146:0x0152, B:148:0x0158, B:149:0x0170, B:151:0x017c, B:129:0x006c), top: B:195:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01b2 A[Catch: all -> 0x0345, TryCatch #0 {, blocks: (B:105:0x0001, B:110:0x000e, B:112:0x0016, B:123:0x0047, B:125:0x0056, B:126:0x005d, B:130:0x007a, B:131:0x0087, B:133:0x008b, B:134:0x0098, B:136:0x00bd, B:138:0x00d2, B:154:0x0196, B:156:0x019f, B:158:0x01a5, B:159:0x01ac, B:161:0x01b2, B:162:0x01b5, B:164:0x01bb, B:165:0x01be, B:166:0x0204, B:168:0x020a, B:169:0x0223, B:171:0x022f, B:172:0x0234, B:173:0x024c, B:175:0x0252, B:176:0x026a, B:177:0x028e, B:178:0x0295, B:179:0x02b8, B:181:0x02be, B:182:0x02d8, B:183:0x032f, B:185:0x0338, B:186:0x033c, B:188:0x033e, B:189:0x0342, B:139:0x00ea, B:141:0x00ff, B:142:0x010f, B:144:0x012b, B:145:0x013b, B:146:0x0152, B:148:0x0158, B:149:0x0170, B:151:0x017c, B:129:0x006c), top: B:195:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01bb A[Catch: all -> 0x0345, TryCatch #0 {, blocks: (B:105:0x0001, B:110:0x000e, B:112:0x0016, B:123:0x0047, B:125:0x0056, B:126:0x005d, B:130:0x007a, B:131:0x0087, B:133:0x008b, B:134:0x0098, B:136:0x00bd, B:138:0x00d2, B:154:0x0196, B:156:0x019f, B:158:0x01a5, B:159:0x01ac, B:161:0x01b2, B:162:0x01b5, B:164:0x01bb, B:165:0x01be, B:166:0x0204, B:168:0x020a, B:169:0x0223, B:171:0x022f, B:172:0x0234, B:173:0x024c, B:175:0x0252, B:176:0x026a, B:177:0x028e, B:178:0x0295, B:179:0x02b8, B:181:0x02be, B:182:0x02d8, B:183:0x032f, B:185:0x0338, B:186:0x033c, B:188:0x033e, B:189:0x0342, B:139:0x00ea, B:141:0x00ff, B:142:0x010f, B:144:0x012b, B:145:0x013b, B:146:0x0152, B:148:0x0158, B:149:0x0170, B:151:0x017c, B:129:0x006c), top: B:195:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x020a A[Catch: all -> 0x0345, LOOP:0: B:166:0x0204->B:168:0x020a, LOOP_END, TryCatch #0 {, blocks: (B:105:0x0001, B:110:0x000e, B:112:0x0016, B:123:0x0047, B:125:0x0056, B:126:0x005d, B:130:0x007a, B:131:0x0087, B:133:0x008b, B:134:0x0098, B:136:0x00bd, B:138:0x00d2, B:154:0x0196, B:156:0x019f, B:158:0x01a5, B:159:0x01ac, B:161:0x01b2, B:162:0x01b5, B:164:0x01bb, B:165:0x01be, B:166:0x0204, B:168:0x020a, B:169:0x0223, B:171:0x022f, B:172:0x0234, B:173:0x024c, B:175:0x0252, B:176:0x026a, B:177:0x028e, B:178:0x0295, B:179:0x02b8, B:181:0x02be, B:182:0x02d8, B:183:0x032f, B:185:0x0338, B:186:0x033c, B:188:0x033e, B:189:0x0342, B:139:0x00ea, B:141:0x00ff, B:142:0x010f, B:144:0x012b, B:145:0x013b, B:146:0x0152, B:148:0x0158, B:149:0x0170, B:151:0x017c, B:129:0x006c), top: B:195:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022f A[Catch: all -> 0x0345, TryCatch #0 {, blocks: (B:105:0x0001, B:110:0x000e, B:112:0x0016, B:123:0x0047, B:125:0x0056, B:126:0x005d, B:130:0x007a, B:131:0x0087, B:133:0x008b, B:134:0x0098, B:136:0x00bd, B:138:0x00d2, B:154:0x0196, B:156:0x019f, B:158:0x01a5, B:159:0x01ac, B:161:0x01b2, B:162:0x01b5, B:164:0x01bb, B:165:0x01be, B:166:0x0204, B:168:0x020a, B:169:0x0223, B:171:0x022f, B:172:0x0234, B:173:0x024c, B:175:0x0252, B:176:0x026a, B:177:0x028e, B:178:0x0295, B:179:0x02b8, B:181:0x02be, B:182:0x02d8, B:183:0x032f, B:185:0x0338, B:186:0x033c, B:188:0x033e, B:189:0x0342, B:139:0x00ea, B:141:0x00ff, B:142:0x010f, B:144:0x012b, B:145:0x013b, B:146:0x0152, B:148:0x0158, B:149:0x0170, B:151:0x017c, B:129:0x006c), top: B:195:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0252 A[Catch: all -> 0x0345, LOOP:1: B:173:0x024c->B:175:0x0252, LOOP_END, TryCatch #0 {, blocks: (B:105:0x0001, B:110:0x000e, B:112:0x0016, B:123:0x0047, B:125:0x0056, B:126:0x005d, B:130:0x007a, B:131:0x0087, B:133:0x008b, B:134:0x0098, B:136:0x00bd, B:138:0x00d2, B:154:0x0196, B:156:0x019f, B:158:0x01a5, B:159:0x01ac, B:161:0x01b2, B:162:0x01b5, B:164:0x01bb, B:165:0x01be, B:166:0x0204, B:168:0x020a, B:169:0x0223, B:171:0x022f, B:172:0x0234, B:173:0x024c, B:175:0x0252, B:176:0x026a, B:177:0x028e, B:178:0x0295, B:179:0x02b8, B:181:0x02be, B:182:0x02d8, B:183:0x032f, B:185:0x0338, B:186:0x033c, B:188:0x033e, B:189:0x0342, B:139:0x00ea, B:141:0x00ff, B:142:0x010f, B:144:0x012b, B:145:0x013b, B:146:0x0152, B:148:0x0158, B:149:0x0170, B:151:0x017c, B:129:0x006c), top: B:195:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02be A[Catch: all -> 0x0345, LOOP:2: B:179:0x02b8->B:181:0x02be, LOOP_END, TryCatch #0 {, blocks: (B:105:0x0001, B:110:0x000e, B:112:0x0016, B:123:0x0047, B:125:0x0056, B:126:0x005d, B:130:0x007a, B:131:0x0087, B:133:0x008b, B:134:0x0098, B:136:0x00bd, B:138:0x00d2, B:154:0x0196, B:156:0x019f, B:158:0x01a5, B:159:0x01ac, B:161:0x01b2, B:162:0x01b5, B:164:0x01bb, B:165:0x01be, B:166:0x0204, B:168:0x020a, B:169:0x0223, B:171:0x022f, B:172:0x0234, B:173:0x024c, B:175:0x0252, B:176:0x026a, B:177:0x028e, B:178:0x0295, B:179:0x02b8, B:181:0x02be, B:182:0x02d8, B:183:0x032f, B:185:0x0338, B:186:0x033c, B:188:0x033e, B:189:0x0342, B:139:0x00ea, B:141:0x00ff, B:142:0x010f, B:144:0x012b, B:145:0x013b, B:146:0x0152, B:148:0x0158, B:149:0x0170, B:151:0x017c, B:129:0x006c), top: B:195:0x0001, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void e() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bm.e():void");
    }

    public boolean f() {
        String str = this.f3035s;
        return str == "continuous-picture" || str == "continuous-video";
    }

    @Override // com.facetec.sdk.be
    public final View Code() {
        return this.f3025i;
    }

    @Override // com.facetec.sdk.be
    final void Code(MotionEvent motionEvent, ViewGroup viewGroup) throws Throwable {
        if (this.f3023g == null || !this.f3028l) {
            return;
        }
        this.f3033q = true;
        this.f3032p.removeCallbacksAndMessages(null);
        Handler handler = this.f3032p;
        Object[] objArr = {new Runnable() { // from class: com.facetec.sdk.bm.4
            AnonymousClass4() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                bm.B(bm.this);
            }
        }, 6000L};
        Method method = Class.forName(ZO.xd("\u0013![3G51yV(\u001bbb;\u001d[#I", (short) (C1633zX.Xd() ^ (-12349)), (short) (C1633zX.Xd() ^ (-466)))).getMethod(Ig.wd("M$uR*n\u001eB{kl", (short) (C1499aX.Xd() ^ (-7155))), Class.forName(C1626yg.Ud("\u0017\u0002\rr2\u00022\u0002.\u0019#\b1yAL?p", (short) (C1580rY.Xd() ^ (-21754)), (short) (C1580rY.Xd() ^ (-7898)))), Long.TYPE);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
            try {
                d();
                V(B(motionEvent.getX(), motionEvent.getY(), viewGroup));
            } catch (Exception unused) {
                d();
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facetec.sdk.be
    final void Code(boolean z2) {
        Camera camera = this.f3023g;
        if (camera == null || this.f3028l == (!z2)) {
            return;
        }
        if (z2) {
            camera.stopPreview();
            this.f3028l = false;
            return;
        }
        try {
            camera.setPreviewCallback(this);
            this.f3023g.startPreview();
            this.f3028l = true;
        } catch (Exception e2) {
            a.V(this.f3022f.get(), V.STARTPREVIEW_EXCEPTION, new StringBuilder().append(new StringBuilder("EXCEPTION: startPreview failed -- ").append(e2.getMessage()).toString()).append(Global.BLANK).append(a.I((Activity) this.f3022f.get())).toString());
        }
    }

    @Override // com.facetec.sdk.be
    public final void I() {
        this.V.clear();
        F();
    }

    @Override // com.facetec.sdk.be
    final void I(boolean z2) throws Throwable {
        if (z2) {
            this.f3030n = true;
        }
        if (this.f3033q) {
            return;
        }
        if (!this.f3031o) {
            a();
            return;
        }
        AnonymousClass3 anonymousClass3 = new Runnable() { // from class: com.facetec.sdk.bm.3
            AnonymousClass3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (bm.this.c() > 0) {
                    return;
                }
                bm.this.a();
            }
        };
        long jC = c();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(EO.Od("J.(SJiFyn\u0014')\u001b\u000f}[-", (short) (Od.Xd() ^ (-15410)))).getDeclaredMethod(C1561oA.Qd("RO]5HOS0RQQEQ", (short) (C1580rY.Xd() ^ (-17917))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            AnonymousClass2 anonymousClass2 = new Runnable() { // from class: com.facetec.sdk.bm.2
                private /* synthetic */ Runnable Code;

                AnonymousClass2(Runnable anonymousClass32) {
                    runnable = anonymousClass32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable = runnable;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            };
            Class<?> cls = Class.forName(C1593ug.zd("We\\kid`+mr.Icqhqky", (short) (C1580rY.Xd() ^ (-15000)), (short) (C1580rY.Xd() ^ (-29474))));
            Class<?>[] clsArr = {Class.forName(C1561oA.od("\u0014\n\u001e\bS\u0011\u0005\u0011\tNq\u0014\f\u000b||\u0006}", (short) (ZN.Xd() ^ 16345))), Long.TYPE};
            Object[] objArr2 = {anonymousClass2, Long.valueOf(jC)};
            short sXd = (short) (C1633zX.Xd() ^ (-5234));
            int[] iArr = new int["??DF\u00179A7P==".length()];
            QB qb = new QB("??DF\u00179A7P==");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    final void S() {
        if (this.f3027k) {
            return;
        }
        this.f3025i.getHolder().addCallback(this);
        this.f3027k = true;
    }

    @Override // com.facetec.sdk.be
    protected final void V() {
    }

    @Override // com.facetec.sdk.be
    final void Z() {
        if (be.Code) {
            Code(true);
            Code(false);
        }
    }

    @Override // com.facetec.sdk.be
    final void Z(boolean z2) {
        Camera camera = this.f3023g;
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes != null && supportedFlashModes.size() > 0) {
            if (z2 && supportedFlashModes.contains("torch")) {
                parameters.setFlashMode("torch");
            } else if (!z2 && supportedFlashModes.contains(DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                parameters.setFlashMode(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
            }
        }
        this.f3023g.setParameters(parameters);
        Code(false);
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z2, Camera camera) {
    }

    @Override // android.hardware.Camera.ErrorCallback
    public void onError(int i2, Camera camera) {
        if (i2 != 100) {
            try {
                throw new RuntimeException("Legacy camera error: ".concat(String.valueOf(i2)));
            } catch (Exception e2) {
                L.V(e2);
                V("Unknown camera error");
                return;
            }
        }
        try {
            F();
            e();
        } catch (Exception e3) {
            L.V(e3);
            V(e3.getMessage());
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        this.C = true;
        ad adVar = this.V.get();
        o oVar = (o) this.f3022f.get();
        if (oVar != null && Code && oVar.ab) {
            S.Z(bArr, this.f3029m.B, this.f3029m.I, this.f3024h, Boolean.FALSE);
        } else {
            if (adVar == null || !adVar.Z() || Code) {
                return;
            }
            adVar.Z(bArr, this.f3029m.B, this.f3029m.I, this.f3024h, Boolean.FALSE);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) throws Throwable {
        this.f3026j = surfaceHolder;
        if (this.f3020c == null) {
            this.f3020c = new Handler();
        }
        Handler handler = this.f3020c;
        Object[] objArr = {new Runnable() { // from class: com.facetec.sdk.bm.1
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    bm.this.e();
                    bm.L();
                } catch (Exception e2) {
                    L.V(e2);
                    ce.I(e2.getMessage());
                    bm.this.V(e2.getMessage());
                }
            }
        }};
        Method method = Class.forName(Wg.Zd("p06\u001aIW#~qJ\u0017\bQs8t~a", (short) (C1607wl.Xd() ^ 17563), (short) (C1607wl.Xd() ^ 5635))).getMethod(Wg.vd("ZZ[]", (short) (C1607wl.Xd() ^ 25727)), Class.forName(C1561oA.Xd("}u\fwE\u0005z\t\u0003Jo\u0014\u000e\u000f\u0003\u0005\u0010\n", (short) (C1633zX.Xd() ^ (-27704)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        F();
        if (surfaceHolder == null || surfaceHolder.getSurface() == null) {
            return;
        }
        surfaceHolder.removeCallback(this);
        surfaceHolder.getSurface().release();
        this.f3027k = false;
    }
}
