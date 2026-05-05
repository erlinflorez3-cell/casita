package com.incode.welcome_sdk.commons.utils;

import android.content.res.Resources;
import android.hardware.Camera;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.camera.core.Preview;
import androidx.camera.view.PreviewView;
import androidx.core.util.Consumer;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.incode.camera.IncodeCamera;
import com.incode.camera.analysis.StubAnalysisEvent;
import com.incode.camera.commons.utils.CameraXUtils;
import com.incode.welcome_sdk.ui.camera.CameraPreview;
import com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: d */
    private static int f6469d = 1;

    /* JADX INFO: renamed from: e */
    private static int f6470e = 0;

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i6;
        int i9 = ~i5;
        int i10 = ~(i8 | i9);
        int i11 = (~(i8 | i2)) | i10 | (~(i9 | i2));
        int i12 = ~i2;
        int i13 = (~(i12 | i9 | i6)) | (~(i8 | i12 | i5));
        int i14 = i6 + i5 + i7 + ((-195996979) * i4) + ((-904719387) * i3);
        int i15 = i14 * i14;
        int i16 = (i6 * 1886715248) + 940376064 + (1886715248 * i5) + (i11 * (-42925423)) + (i10 * (-42925423)) + ((-42925423) * i13) + (1843789824 * i7) + ((-1389494272) * i4) + (1623064576 * i3) + (1510801408 * i15);
        int i17 = (i6 * 1590984816) + 1398186415 + (i5 * 1590984816) + (i11 * 737) + (i10 * 737) + (i13 * 737) + (i7 * 1590985553) + (i4 * (-1025631779)) + (i3 * 1121679989) + (i15 * 622657536);
        if (i16 + (i17 * i17 * (-1928134656)) == 1) {
            return a(objArr);
        }
        View view = (View) objArr[0];
        int i18 = 2 % 2;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.incode.welcome_sdk.commons.utils.e.5

            /* JADX INFO: renamed from: d */
            private static int f6476d = 0;

            /* JADX INFO: renamed from: e */
            private static int f6477e = 1;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ View f6478a;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ Consumer f6479b;

            /* JADX INFO: renamed from: c */
            private /* synthetic */ IncodeCamera f6480c;

            AnonymousClass5(View view2, IncodeCamera incodeCamera, Consumer consumer) {
                view = view2;
                incodeCamera = incodeCamera;
                consumer = consumer;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                float width;
                int i19 = 2 % 2;
                int i20 = f6476d + 1;
                f6477e = i20 % 128;
                int i21 = i20 % 2;
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                float measuredWidth = view.getMeasuredWidth() * (CameraXUtils.INSTANCE.isNarrow(view.getContext(), incodeCamera.config.getCameraSelector()) ? 0.5f : 0.7f) * 0.55f;
                Preview imagePreview = incodeCamera.getImagePreview();
                PreviewView previewView = incodeCamera.getPreviewView();
                if (e.a(imagePreview.getTargetRotation())) {
                    width = previewView.getHeight();
                } else {
                    width = previewView.getWidth();
                    int i22 = f6477e + 97;
                    f6476d = i22 % 128;
                    int i23 = i22 % 2;
                }
                consumer.accept(Float.valueOf(Math.min((measuredWidth * width) / previewView.getMeasuredWidth(), width * 0.9f)));
                int i24 = f6477e + 79;
                f6476d = i24 % 128;
                if (i24 % 2 != 0) {
                    int i25 = 13 / 0;
                }
            }
        });
        int i19 = f6470e + 125;
        f6469d = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    public static class c {

        /* JADX INFO: renamed from: a */
        private static int f6481a = 0;

        /* JADX INFO: renamed from: b */
        private static int f6482b = 1;

        /* JADX INFO: renamed from: c */
        private Camera.Size f6483c;

        /* JADX INFO: renamed from: d */
        Camera.Size f6484d;

        c(Camera.Size size, Camera.Size size2) {
            this.f6484d = size;
            this.f6483c = size2;
        }

        public final Camera.Size e() {
            int i2 = 2 % 2;
            int i3 = f6482b + 15;
            int i4 = i3 % 128;
            f6481a = i4;
            int i5 = i3 % 2;
            Camera.Size size = this.f6484d;
            int i6 = i4 + 29;
            f6482b = i6 % 128;
            int i7 = i6 % 2;
            return size;
        }

        public final Camera.Size b() {
            int i2 = 2 % 2;
            int i3 = f6482b + 57;
            int i4 = i3 % 128;
            f6481a = i4;
            int i5 = i3 % 2;
            Camera.Size size = this.f6483c;
            int i6 = i4 + 97;
            f6482b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 59 / 0;
            }
            return size;
        }
    }

    private static int d(int i2, int i3) {
        int i4 = 2 % 2;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i2, cameraInfo);
        if (cameraInfo.facing == 1) {
            int i5 = f6469d + 97;
            f6470e = i5 % 128;
            return i5 % 2 != 0 ? cameraInfo.orientation * 11602 : cameraInfo.orientation % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
        }
        return (cameraInfo.orientation + SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
    }

    public static boolean a(int i2) {
        int i3 = 2 % 2;
        int i4 = f6470e + 5;
        int i5 = i4 % 128;
        f6469d = i5;
        if (i4 % 2 == 0) {
            if (i2 == 117) {
                return true;
            }
        } else if (i2 == 90) {
            return true;
        }
        if (i2 == 270) {
            return true;
        }
        int i6 = i5 + 31;
        f6470e = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ int c(Camera.Size size, Camera.Size size2) {
        int i2 = 2 % 2;
        int i3 = f6470e + 93;
        f6469d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (size2.width * size2.height) - (size.width * size.height);
        int i6 = f6470e + 55;
        f6469d = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public static /* synthetic */ int b(Camera.Size size, Camera.Size size2) {
        int i2 = 2 % 2;
        int i3 = f6469d + 109;
        f6470e = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (size2.width * size2.height) - (size.width * size.height);
        int i6 = f6469d + 49;
        f6470e = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 51 / 0;
        }
        return i5;
    }

    private static List<c> d(Camera camera, Resources resources, boolean z2, boolean z3, int i2, int i3, boolean z4) {
        float f2;
        Camera.Size size;
        int i4 = 2;
        int i5 = 2 % 2;
        if (z3) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            f2 = displayMetrics.heightPixels / ((displayMetrics.widthPixels * 0.86f) / 0.6279f);
        } else {
            f2 = 1.0f;
        }
        Camera.Parameters parametersA = a(camera);
        int i6 = 0;
        if (parametersA == null) {
            Timber.w("Cannot generateValidPreviewSizeList() with null Camera parameters", new Object[0]);
            return null;
        }
        List<Camera.Size> supportedPreviewSizes = parametersA.getSupportedPreviewSizes();
        List<Camera.Size> supportedPictureSizes = parametersA.getSupportedPictureSizes();
        int size2 = supportedPictureSizes.size();
        Camera.Size[] sizeArr = new Camera.Size[size2];
        supportedPictureSizes.toArray(sizeArr);
        Arrays.sort(sizeArr, new Comparator() { // from class: com.incode.welcome_sdk.commons.utils.e$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.c((Camera.Size) obj, (Camera.Size) obj2);
            }
        });
        int size3 = supportedPreviewSizes.size();
        Camera.Size[] sizeArr2 = new Camera.Size[size3];
        supportedPreviewSizes.toArray(sizeArr2);
        Arrays.sort(sizeArr2, new Comparator() { // from class: com.incode.welcome_sdk.commons.utils.e$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.b((Camera.Size) obj, (Camera.Size) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        Camera.Size size4 = sizeArr2[0];
        Camera.Size size5 = sizeArr[0];
        float f3 = Float.MAX_VALUE;
        int i7 = 0;
        while (i7 < size3) {
            Camera.Size size6 = sizeArr2[i7];
            Timber.d("Camera: Supported preview size width: %s, height: %s", Integer.valueOf(size6.width), Integer.valueOf(size6.height));
            if (Math.min(size6.width, size6.height) >= 400) {
                int i8 = f6469d + 117;
                f6470e = i8 % 128;
                float f4 = i8 % i4 != 0 ? size6.width * size6.height : size6.width / size6.height;
                while (true) {
                    if (i6 >= size2) {
                        break;
                    }
                    size = sizeArr[i6];
                    if (z4) {
                        Timber.d("Camera: Ignoring picture size; Using largest available PictureSize:width: %s, height: %s", Integer.valueOf(size.width), Integer.valueOf(size.height));
                        arrayList.add(new c(size6, size));
                        break;
                    }
                    Timber.d("Camera: Checking supported picture width: %s, height: %s", Integer.valueOf(size.width), Integer.valueOf(size.height));
                    if (Math.abs(f4 - (size.width / size.height)) < 0.01f) {
                        Timber.d("Camera: PREVIEW_TO_PICTURE_ASPECT_RATIO_TOLERANCE OK", new Object[0]);
                        float f5 = z2 ? size.width : size.height;
                        float f6 = i3 * f2;
                        if (f5 < f6) {
                            Timber.d("Camera: Picture size height below %s", Float.valueOf(f6));
                            break;
                        }
                        float f7 = i2 * f2;
                        if (f5 < f7) {
                            int i9 = f6469d + 115;
                            f6470e = i9 % 128;
                            if (i9 % 2 != 0) {
                                Timber.d("Camera: Picture size height below %s", Float.valueOf(f7));
                            } else {
                                Timber.d("Camera: Picture size height below %s", Float.valueOf(f7));
                            }
                        } else if (f5 < f3) {
                            Timber.d("Camera: Picture size height over %s; Saving as backup...", Float.valueOf(f7));
                            f3 = f5;
                            size4 = size6;
                            size5 = size;
                        }
                    }
                    i6++;
                }
                size = null;
                if (size != null) {
                    arrayList.add(new c(size6, size));
                }
            }
            i7++;
            i4 = 2;
            i6 = 0;
        }
        if (arrayList.isEmpty()) {
            Timber.w("Camera: No preview sizes have a corresponding same-aspect-ratio picture size; Falling back to backup:", new Object[0]);
            arrayList.add(new c(size4, size5));
            int i10 = f6470e + 23;
            f6469d = i10 % 128;
            int i11 = i10 % 2;
        }
        Timber.d("Camera: Backup preview size: w:%s h:%s", Integer.valueOf(size4.width), Integer.valueOf(size4.height));
        Timber.d("Camera: Backup picture size: w:%s h:%s", Integer.valueOf(size5.width), Integer.valueOf(size5.height));
        return arrayList;
    }

    public static c e(Camera camera, Resources resources, int i2, int i3, int i4, boolean z2, int i5, int i6, boolean z3) {
        int i7;
        int i8 = 2 % 2;
        int i9 = f6470e + 79;
        f6469d = i9 % 128;
        int i10 = i9 % 2;
        boolean zA = a(d(i2, 0));
        Timber.d("Camera: shouldSwitchDimensions %s", Boolean.valueOf(zA));
        if (zA) {
            int i11 = f6469d + 17;
            f6470e = i11 % 128;
            int i12 = i11 % 2;
            i7 = i4;
        } else {
            i7 = i3;
            i3 = i4;
        }
        Object[] objArr = {d(camera, resources, zA, z2, i5, i6, z3), Integer.valueOf(i7), Integer.valueOf(i3), Float.valueOf(0.12f), Boolean.valueOf(z3)};
        int iC = BaseSignatureFormContract.c();
        int iC2 = BaseSignatureFormContract.c();
        c cVar = (c) c(iC, BaseSignatureFormContract.c(), BaseSignatureFormContract.c(), -1273325810, 1273325811, objArr, iC2);
        if (cVar == null) {
            Timber.e("Camera: Cannot find adequate camera preview/picture size pair", new Object[0]);
            int i13 = f6469d + 111;
            f6470e = i13 % 128;
            int i14 = i13 % 2;
        } else {
            Timber.d("Camera: Best preview size: w:%d h:%d", Integer.valueOf(cVar.e().width), Integer.valueOf(cVar.e().height));
            Timber.d("Camera: Best picture size: w:%d h:%d", Integer.valueOf(cVar.b().width), Integer.valueOf(cVar.b().height));
        }
        return cVar;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        List list = (List) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        ((Number) objArr[3]).floatValue();
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        int i2 = 2 % 2;
        Timber.d("Camera: Target preview w:%d h:%d", Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        if (zBooleanValue) {
            ArrayList arrayList = new ArrayList(list);
            int i3 = 0;
            while (i3 < arrayList.size()) {
                c cVar = (c) arrayList.get(i3);
                if (cVar.e().width != iIntValue || cVar.e().height != iIntValue2) {
                    arrayList.remove(i3);
                    i3--;
                }
                i3++;
            }
            if (!arrayList.isEmpty()) {
                Timber.d("Camera: Found exact match w:%s h:%s", Integer.valueOf(((c) arrayList.get(0)).f6484d.width), Integer.valueOf(((c) arrayList.get(0)).f6484d.height));
                return (c) arrayList.get(0);
            }
            ArrayList arrayList2 = new ArrayList(list);
            int i4 = 0;
            while (i4 < arrayList2.size()) {
                c cVar2 = (c) arrayList2.get(i4);
                if (cVar2.e().width > iIntValue || cVar2.e().height > iIntValue2) {
                    arrayList2.remove(i4);
                    i4--;
                }
                i4++;
            }
            if (!arrayList2.isEmpty()) {
                Timber.d("Camera: Found close match w:%s h:%s", Integer.valueOf(((c) arrayList2.get(0)).f6484d.width), Integer.valueOf(((c) arrayList2.get(0)).f6484d.height));
                return (c) arrayList2.get(0);
            }
        }
        float f2 = iIntValue / iIntValue2;
        Iterator it = list.iterator();
        float f3 = 0.0f;
        float f4 = 0.0f;
        c cVar3 = null;
        while (it.hasNext()) {
            int i5 = f6470e + 121;
            f6469d = i5 % 128;
            if (i5 % 2 != 0) {
                c cVar4 = (c) it.next();
                Camera.Size sizeE = cVar4.e();
                if (sizeE.width <= iIntValue || sizeE.height <= iIntValue2) {
                    if (zBooleanValue) {
                        Timber.d("Camera: Found fallback match w:%s h:%s", Integer.valueOf(cVar4.f6484d.width), Integer.valueOf(cVar4.f6484d.height));
                        return cVar4;
                    }
                    double d2 = ((double) sizeE.width) / ((double) sizeE.height);
                    Timber.d("Camera: Candidate preview w:%d h:%d", Integer.valueOf(sizeE.width), Integer.valueOf(sizeE.height));
                    if (Math.abs(d2 - ((double) f2)) <= 0.11999999731779099d) {
                        float fA = a(sizeE.width, sizeE.height, iIntValue, iIntValue2, 0.5f, 0.5f);
                        Timber.d("Camera: Candidate aspect ratio OK; total score:%f", Float.valueOf(fA));
                        if (fA > f4) {
                            int i6 = f6470e + 107;
                            f6469d = i6 % 128;
                            if (i6 % 2 == 0) {
                                throw null;
                            }
                            f4 = fA;
                            cVar3 = cVar4;
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                int i7 = ((c) it.next()).e().width;
                throw null;
            }
        }
        if (cVar3 == null) {
            Timber.w("Camera: No preview size matches the given aspect ratio", new Object[0]);
            Iterator it2 = list.iterator();
            while (!(!it2.hasNext())) {
                c cVar5 = (c) it2.next();
                Camera.Size sizeE2 = cVar5.e();
                float fA2 = a(sizeE2.width, sizeE2.height, iIntValue, iIntValue2, 0.3f, 0.7f);
                Timber.d("Camera: Candidate preview w:%d h:%d score:%f", Integer.valueOf(sizeE2.width), Integer.valueOf(sizeE2.height), Float.valueOf(fA2));
                if (fA2 > f3) {
                    int i8 = f6469d;
                    int i9 = i8 + 15;
                    f6470e = i9 % 128;
                    if (i9 % 2 != 0) {
                        throw null;
                    }
                    int i10 = i8 + 5;
                    f6470e = i10 % 128;
                    int i11 = i10 % 2;
                    cVar3 = cVar5;
                    f3 = fA2;
                }
            }
        }
        return cVar3;
    }

    private static float a(int i2, int i3, int i4, int i5, float f2, float f3) {
        float f4;
        float f5;
        int i6 = 2 % 2;
        float f6 = i4 / i5;
        float f7 = i2 * i3;
        float f8 = i2 / i3;
        float f9 = i4 * i5;
        if (f7 > f9) {
            f4 = f7 / f9;
        } else {
            f4 = f9 / f7;
            int i7 = f6470e + 33;
            f6469d = i7 % 128;
            int i8 = i7 % 2;
        }
        float f10 = (1.0f / f4) * f2;
        if (f8 > f6) {
            f5 = f8 / f6;
            int i9 = f6469d + 27;
            f6470e = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 5;
            }
        } else {
            f5 = f6 / f8;
            int i11 = f6470e + 23;
            f6469d = i11 % 128;
            int i12 = i11 % 2;
        }
        return f10 + ((1.0f / f5) * f3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0016, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0018, code lost:
    
        r1 = com.incode.welcome_sdk.commons.utils.e.f6470e + 35;
        com.incode.welcome_sdk.commons.utils.e.f6469d = r1 % 128;
        r1 = r1 % 2;
        timber.log.Timber.w("Cannot check isAutoFocusEnabled with null Camera.Parameters. Assuming it's disabled.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002d, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0030, code lost:
    
        r1 = r1.getSupportedFocusModes();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0034, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003c, code lost:
    
        if (r1.contains("auto") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0040, code lost:
    
        r1 = com.incode.welcome_sdk.commons.utils.e.f6470e + 15;
        com.incode.welcome_sdk.commons.utils.e.f6469d = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0049, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.hardware.Camera r4) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.commons.utils.e.f6470e
            int r1 = r0 + 81
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.e.f6469d = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 != 0) goto L29
            android.hardware.Camera$Parameters r1 = a(r4)
            r0 = 24
            int r0 = r0 / r2
            if (r1 != 0) goto L30
        L18:
            int r0 = com.incode.welcome_sdk.commons.utils.e.f6470e
            int r1 = r0 + 35
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.e.f6469d = r0
            int r1 = r1 % r3
            java.lang.String r1 = "Cannot check isAutoFocusEnabled with null Camera.Parameters. Assuming it's disabled."
            java.lang.Object[] r0 = new java.lang.Object[r2]
            timber.log.Timber.w(r1, r0)
            return r2
        L29:
            android.hardware.Camera$Parameters r1 = a(r4)
            if (r1 != 0) goto L30
            goto L18
        L30:
            java.util.List r1 = r1.getSupportedFocusModes()
            if (r1 == 0) goto L40
            java.lang.String r0 = "auto"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L40
            r0 = 1
            return r0
        L40:
            int r0 = com.incode.welcome_sdk.commons.utils.e.f6470e
            int r1 = r0 + 15
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.e.f6469d = r0
            int r1 = r1 % r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.e.c(android.hardware.Camera):boolean");
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.utils.e$2 */
    final class AnonymousClass2 implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: d */
        private static int f6471d = 0;

        /* JADX INFO: renamed from: e */
        private static int f6472e = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ CameraPreview f6473a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ View f6474b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Consumer f6475c;

        AnonymousClass2(View view, CameraPreview cameraPreview, Consumer consumer) {
            view = view;
            cameraPreview = cameraPreview;
            consumer = consumer;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            int i2;
            float f2;
            int i3 = 2 % 2;
            int i4 = f6472e + 47;
            f6471d = i4 % 128;
            int i5 = i4 % 2;
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            float measuredWidth = ((view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight()) * 0.55f;
            if (!e.a(cameraPreview.getCameraRotation())) {
                i2 = cameraPreview.getPreviewSize().width;
            } else {
                int i6 = f6472e + 41;
                f6471d = i6 % 128;
                if (i6 % 2 != 0) {
                    f2 = cameraPreview.getPreviewSize().height;
                    int i7 = 31 / 0;
                    consumer.accept(Float.valueOf(Math.min((measuredWidth * f2) / ((cameraPreview.getCameraPreviewScale() * f2) * cameraPreview.getCameraScale()), f2 * 0.9f)));
                }
                i2 = cameraPreview.getPreviewSize().height;
            }
            f2 = i2;
            consumer.accept(Float.valueOf(Math.min((measuredWidth * f2) / ((cameraPreview.getCameraPreviewScale() * f2) * cameraPreview.getCameraScale()), f2 * 0.9f)));
        }
    }

    public static void b(View view, CameraPreview cameraPreview, Consumer<Float> consumer) {
        int i2 = 2 % 2;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.incode.welcome_sdk.commons.utils.e.2

            /* JADX INFO: renamed from: d */
            private static int f6471d = 0;

            /* JADX INFO: renamed from: e */
            private static int f6472e = 1;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ CameraPreview f6473a;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ View f6474b;

            /* JADX INFO: renamed from: c */
            private /* synthetic */ Consumer f6475c;

            AnonymousClass2(View view2, CameraPreview cameraPreview2, Consumer consumer2) {
                view = view2;
                cameraPreview = cameraPreview2;
                consumer = consumer2;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i22;
                float f2;
                int i3 = 2 % 2;
                int i4 = f6472e + 47;
                f6471d = i4 % 128;
                int i5 = i4 % 2;
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                float measuredWidth = ((view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight()) * 0.55f;
                if (!e.a(cameraPreview.getCameraRotation())) {
                    i22 = cameraPreview.getPreviewSize().width;
                } else {
                    int i6 = f6472e + 41;
                    f6471d = i6 % 128;
                    if (i6 % 2 != 0) {
                        f2 = cameraPreview.getPreviewSize().height;
                        int i7 = 31 / 0;
                        consumer.accept(Float.valueOf(Math.min((measuredWidth * f2) / ((cameraPreview.getCameraPreviewScale() * f2) * cameraPreview.getCameraScale()), f2 * 0.9f)));
                    }
                    i22 = cameraPreview.getPreviewSize().height;
                }
                f2 = i22;
                consumer.accept(Float.valueOf(Math.min((measuredWidth * f2) / ((cameraPreview.getCameraPreviewScale() * f2) * cameraPreview.getCameraScale()), f2 * 0.9f)));
            }
        });
        int i3 = f6469d + 13;
        f6470e = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.utils.e$5 */
    public final class AnonymousClass5 implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: d */
        private static int f6476d = 0;

        /* JADX INFO: renamed from: e */
        private static int f6477e = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ View f6478a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Consumer f6479b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ IncodeCamera f6480c;

        AnonymousClass5(View view2, IncodeCamera incodeCamera, Consumer consumer) {
            view = view2;
            incodeCamera = incodeCamera;
            consumer = consumer;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            float width;
            int i19 = 2 % 2;
            int i20 = f6476d + 1;
            f6477e = i20 % 128;
            int i21 = i20 % 2;
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            float measuredWidth = view.getMeasuredWidth() * (CameraXUtils.INSTANCE.isNarrow(view.getContext(), incodeCamera.config.getCameraSelector()) ? 0.5f : 0.7f) * 0.55f;
            Preview imagePreview = incodeCamera.getImagePreview();
            PreviewView previewView = incodeCamera.getPreviewView();
            if (e.a(imagePreview.getTargetRotation())) {
                width = previewView.getHeight();
            } else {
                width = previewView.getWidth();
                int i22 = f6477e + 97;
                f6476d = i22 % 128;
                int i23 = i22 % 2;
            }
            consumer.accept(Float.valueOf(Math.min((measuredWidth * width) / previewView.getMeasuredWidth(), width * 0.9f)));
            int i24 = f6477e + 79;
            f6476d = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = 13 / 0;
            }
        }
    }

    public static Camera.Parameters a(Camera camera) {
        int i2 = 2 % 2;
        int i3 = f6470e + 111;
        f6469d = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 != 0) {
                return camera.getParameters();
            }
            camera.getParameters();
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean d(Camera camera, Camera.Parameters parameters) {
        int i2 = 2 % 2;
        int i3 = f6470e + 21;
        f6469d = i3 % 128;
        int i4 = i3 % 2;
        try {
            camera.setParameters(parameters);
            int i5 = f6469d + 83;
            f6470e = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void e(View view, IncodeCamera<StubAnalysisEvent> incodeCamera, Consumer<Float> consumer) {
        Object[] objArr = {view, incodeCamera, consumer};
        int iC = BaseSignatureFormContract.c();
        int iC2 = BaseSignatureFormContract.c();
        c(iC, BaseSignatureFormContract.c(), BaseSignatureFormContract.c(), 126172003, -126172003, objArr, iC2);
    }

    private static c c(List<c> list, int i2, int i3, float f2, boolean z2) {
        Object[] objArr = {list, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Boolean.valueOf(z2)};
        int iC = BaseSignatureFormContract.c();
        int iC2 = BaseSignatureFormContract.c();
        return (c) c(iC, BaseSignatureFormContract.c(), BaseSignatureFormContract.c(), -1273325810, 1273325811, objArr, iC2);
    }
}
