package com.incode.welcome_sdk.ui.camera;

import android.hardware.Camera;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class CameraManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f11254a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11255b = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f11259f = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f11260i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CameraManager f11257d = new CameraManager();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, CameraWrapper> f11256c = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f11258e = new Object();

    private CameraManager() {
    }

    static {
        int i2 = f11259f + 57;
        f11260i = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0113 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.hardware.Camera a(int r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraManager.a(int):android.hardware.Camera");
    }

    public final Camera acquireCamera(int i2) {
        Camera cameraA;
        synchronized (f11258e) {
            Map<Integer, CameraWrapper> map = f11256c;
            CameraWrapper cameraWrapper = map.get(Integer.valueOf(i2));
            if (cameraWrapper != null) {
                cameraWrapper.incrementUsage();
                Timber.Forest.v("Camera ID " + i2 + " acquired. Usage count: " + cameraWrapper.getUsageCount(), new Object[0]);
                cameraA = cameraWrapper.getCamera();
            } else {
                cameraA = a(i2);
                CameraWrapper cameraWrapper2 = new CameraWrapper(cameraA);
                map.put(Integer.valueOf(i2), cameraWrapper2);
                Timber.Forest.v("Camera ID " + i2 + " opened and acquired. Usage count: " + cameraWrapper2.getUsageCount(), new Object[0]);
            }
        }
        return cameraA;
    }

    public final void releaseCamera(int i2) {
        synchronized (f11258e) {
            Map<Integer, CameraWrapper> map = f11256c;
            CameraWrapper cameraWrapper = map.get(Integer.valueOf(i2));
            if (cameraWrapper != null) {
                cameraWrapper.decrementUsage();
                Timber.Forest.v("Camera ID " + i2 + " released. Usage count: " + cameraWrapper.getUsageCount(), new Object[0]);
                if (cameraWrapper.getUsageCount() <= 0) {
                    cameraWrapper.getCamera().release();
                    map.remove(Integer.valueOf(i2));
                    Timber.Forest.v("Camera ID " + i2 + " fully released.", new Object[0]);
                }
            } else {
                Timber.Forest.v("Attempted to release camera ID " + i2 + " which is not acquired.", new Object[0]);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void releaseCamera(Camera camera) {
        Object next;
        if (camera == null) {
            Timber.Forest.w("Attempted to release a null camera instance.", new Object[0]);
            return;
        }
        synchronized (f11258e) {
            Iterator<T> it = f11256c.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((CameraWrapper) ((Map.Entry) next).getValue()).getCamera() == camera) {
                        break;
                    }
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                CameraWrapper cameraWrapper = (CameraWrapper) entry.getValue();
                cameraWrapper.decrementUsage();
                Timber.Forest.v("Camera ID " + iIntValue + " released. Usage count: " + cameraWrapper.getUsageCount(), new Object[0]);
                if (cameraWrapper.getUsageCount() <= 0) {
                    cameraWrapper.getCamera().release();
                    f11256c.remove(Integer.valueOf(iIntValue));
                    Timber.Forest.v("Camera ID " + iIntValue + " fully released.", new Object[0]);
                }
            } else {
                Timber.Forest.w("Attempted to release a camera that is not acquired.", new Object[0]);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private static void b() {
        synchronized (f11258e) {
            for (CameraWrapper cameraWrapper : f11256c.values()) {
                cameraWrapper.getCamera().stopPreview();
                cameraWrapper.getCamera().setPreviewCallback(null);
                cameraWrapper.getCamera().release();
            }
            f11256c.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final int getCameraUsageCount(Camera camera) {
        Object next;
        if (camera == null) {
            return 0;
        }
        synchronized (f11258e) {
            Iterator<T> it = f11256c.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((CameraWrapper) ((Map.Entry) next).getValue()).getCamera() == camera) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry == null) {
                return 0;
            }
            return ((CameraWrapper) entry.getValue()).getUsageCount();
        }
    }

    public final int getActiveCameraCount() {
        int size;
        synchronized (f11258e) {
            size = f11256c.size();
        }
        return size;
    }
}
