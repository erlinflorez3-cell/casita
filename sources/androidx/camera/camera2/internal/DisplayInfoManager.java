package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.workaround.DisplaySizeCorrector;
import androidx.camera.camera2.internal.compat.workaround.MaxPreviewSize;
import androidx.camera.core.internal.utils.SizeUtil;
import com.drew.metadata.avi.AviDirectory;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes.dex */
public class DisplayInfoManager {
    private static volatile DisplayInfoManager sInstance = null;
    private final DisplayManager mDisplayManager;
    private static final Size MAX_PREVIEW_SIZE = new Size(1920, PhotoshopDirectory.TAG_COUNT_INFORMATION);
    private static final Size ABNORMAL_DISPLAY_SIZE_THRESHOLD = new Size(AviDirectory.TAG_DATETIME_ORIGINAL, 240);
    private static final Size FALLBACK_DISPLAY_SIZE = new Size(OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE, 480);
    private static final Object INSTANCE_LOCK = new Object();
    private volatile Size mPreviewSize = null;
    private final MaxPreviewSize mMaxPreviewSize = new MaxPreviewSize();
    private final DisplaySizeCorrector mDisplaySizeCorrector = new DisplaySizeCorrector();

    private DisplayInfoManager(Context context) throws Throwable {
        String strQd = Xg.qd("\u001f%0.+!:", (short) (OY.Xd() ^ 3942), (short) (OY.Xd() ^ 678));
        Class<?> cls = Class.forName(Jg.Wd("A<a=ENv\fPj\u0015jh|29Y\u0014@\u0012\u00122Y", (short) (C1607wl.Xd() ^ 21642), (short) (C1607wl.Xd() ^ 17954)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1580rY.Xd() ^ (-14584));
        short sXd2 = (short) (C1580rY.Xd() ^ (-23585));
        int[] iArr = new int[".Cz\u0014q>?ZF],\"#\u001ahP".length()];
        QB qb = new QB(".Cz\u0014q>?ZF],\"#\u001ahP");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strQd};
        short sXd3 = (short) (ZN.Xd() ^ 7203);
        short sXd4 = (short) (ZN.Xd() ^ 26370);
        int[] iArr2 = new int["5Z\u000e.xr\u0013X/_ik@\\4\u0010".length()];
        QB qb2 = new QB("5Z\u000e.xr\u0013X/_ik@\\4\u0010");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            this.mDisplayManager = (DisplayManager) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static DisplayInfoManager getInstance(Context context) {
        if (sInstance == null) {
            synchronized (INSTANCE_LOCK) {
                if (sInstance == null) {
                    sInstance = new DisplayInfoManager(context);
                }
            }
        }
        return sInstance;
    }

    static void releaseInstance() {
        sInstance = null;
    }

    void refresh() {
        this.mPreviewSize = calculatePreviewSize();
    }

    public Display getMaxSizeDisplay(boolean z2) {
        Display[] displays = this.mDisplayManager.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display maxSizeDisplayInternal = getMaxSizeDisplayInternal(displays, z2);
        if (maxSizeDisplayInternal == null && z2) {
            maxSizeDisplayInternal = getMaxSizeDisplayInternal(displays, false);
        }
        if (maxSizeDisplayInternal != null) {
            return maxSizeDisplayInternal;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    private Display getMaxSizeDisplayInternal(Display[] displayArr, boolean z2) {
        Display display = null;
        int i2 = -1;
        for (Display display2 : displayArr) {
            if (!z2 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                if (point.x * point.y > i2) {
                    i2 = point.x * point.y;
                    display = display2;
                }
            }
        }
        return display;
    }

    Size getPreviewSize() {
        if (this.mPreviewSize != null) {
            return this.mPreviewSize;
        }
        this.mPreviewSize = calculatePreviewSize();
        return this.mPreviewSize;
    }

    private Size calculatePreviewSize() {
        Size correctedDisplaySize = getCorrectedDisplaySize();
        int width = correctedDisplaySize.getWidth() * correctedDisplaySize.getHeight();
        Size size = MAX_PREVIEW_SIZE;
        if (width > size.getWidth() * size.getHeight()) {
            correctedDisplaySize = size;
        }
        return this.mMaxPreviewSize.getMaxPreviewResolution(correctedDisplaySize);
    }

    private Size getCorrectedDisplaySize() {
        Point point = new Point();
        getMaxSizeDisplay(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (SizeUtil.isSmallerByArea(size, ABNORMAL_DISPLAY_SIZE_THRESHOLD) && (size = this.mDisplaySizeCorrector.getDisplaySize()) == null) {
            size = FALLBACK_DISPLAY_SIZE;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }
}
