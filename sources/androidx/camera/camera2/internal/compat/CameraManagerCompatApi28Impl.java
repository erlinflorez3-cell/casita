package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import yg.C1561oA;
import yg.C1626yg;
import yg.C1633zX;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes.dex */
class CameraManagerCompatApi28Impl extends CameraManagerCompatBaseImpl {
    CameraManagerCompatApi28Impl(Context context) {
        super(context, null);
    }

    static CameraManagerCompatApi28Impl create(Context context) {
        return new CameraManagerCompatApi28Impl(context);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.mCameraManager.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        this.mCameraManager.unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.mCameraManager.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e2) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e2);
        } catch (IllegalArgumentException e3) {
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            if (isDndFailCase(e5)) {
                throwDndException(e5);
            }
            throw e5;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public CameraCharacteristics getCameraCharacteristics(String str) throws CameraAccessExceptionCompat {
        try {
            return super.getCameraCharacteristics(str);
        } catch (RuntimeException e2) {
            if (isDndFailCase(e2)) {
                throwDndException(e2);
            }
            throw e2;
        }
    }

    private void throwDndException(Throwable th) throws CameraAccessExceptionCompat {
        throw new CameraAccessExceptionCompat(CameraAccessExceptionCompat.CAMERA_UNAVAILABLE_DO_NOT_DISTURB, th);
    }

    private boolean isDndFailCase(Throwable th) {
        return Build.VERSION.SDK_INT == 28 && isDndRuntimeException(th);
    }

    private static boolean isDndRuntimeException(Throwable th) throws Throwable {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        StackTraceElement stackTraceElement = stackTrace[0];
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("\u001ar/\"qB\u000b\u001f(UPEXxqX\u0003X\"\u0015\b:\u00165^!1", (short) (Od.Xd() ^ (-23400)), (short) (Od.Xd() ^ (-30885)))).getMethod(C1626yg.Ud("\r\u001d\u0005\u001ebVG3}m'\u0010{", (short) (C1633zX.Xd() ^ (-13631)), (short) (C1633zX.Xd() ^ (-13773))), new Class[0]);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(stackTraceElement, objArr);
            short sXd = (short) (Od.Xd() ^ (-25770));
            int[] iArr = new int["\u0001Sl\u0002\u0001=\fx2\u0002|%B_.nK4p".length()];
            QB qb = new QB("\u0001Sl\u0002\u0001=\fx2\u0002|%B_.nK4p");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            return new String(iArr, 0, i2).equals(str);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
