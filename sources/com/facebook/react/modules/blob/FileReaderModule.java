package com.facebook.react.modules.blob;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.fbreact.specs.NativeFileReaderModuleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import io.sentry.rrweb.RRWebVideoEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u0006(*\"\u000e \u001b\u001d\u001d)\u0003$\u0018(\u001e\u0016")
public class FileReaderModule extends NativeFileReaderModuleSpec {
    private static final String ERROR_INVALID_BLOB = "ERROR_INVALID_BLOB";

    public FileReaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private BlobModule getBlobModule(String str) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (BlobModule) reactApplicationContextIfActiveOrWarn.getNativeModule(BlobModule.class);
        }
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeFileReaderModuleSpec
    public void readAsDataURL(ReadableMap readableMap, Promise promise) throws Throwable {
        String strQd = C1561oA.Qd("\u000e\u0012\b{", (short) (C1580rY.Xd() ^ (-9633)));
        String strZd = C1593ug.zd("97K9\u0013", (short) (OY.Xd() ^ 26973), (short) (OY.Xd() ^ 10482));
        BlobModule blobModule = getBlobModule(C1561oA.od("\u007fqlnJ{KgyeXTM", (short) (C1607wl.Xd() ^ 29875)));
        if (blobModule == null) {
            promise.reject(new IllegalStateException(C1561oA.Kd("\u0018ELD=yIKQ}FEU\u0002%PTH4WM_WQ\rTa_^\u0012EYVYk9ijge`_sippFsszl\u0001}", (short) (OY.Xd() ^ 15400))));
            return;
        }
        String strZd2 = Wg.Zd("rPHpk\u001d\u0010q\u0012\u007f#,<\u001c&,G_", (short) (OY.Xd() ^ 21491), (short) (OY.Xd() ^ 915));
        if (readableMap == null) {
            promise.reject(strZd2, C1561oA.Xd("\"75pEC98?=A>>z>IMA\u007fJU\u0003RZRS", (short) (FB.Xd() ^ 4605)));
            return;
        }
        String string = readableMap.getString(Wg.vd("-88,\u00184", (short) (Od.Xd() ^ (-9280))));
        short sXd = (short) (Od.Xd() ^ (-1668));
        short sXd2 = (short) (Od.Xd() ^ (-29917));
        int[] iArr = new int[" \u0016\u0015!\u0012 ".length()];
        QB qb = new QB(" \u0016\u0015!\u0012 ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        int i3 = readableMap.getInt(new String(iArr, 0, i2));
        short sXd3 = (short) (C1633zX.Xd() ^ (-22381));
        short sXd4 = (short) (C1633zX.Xd() ^ (-7634));
        int[] iArr2 = new int["YN^H".length()];
        QB qb2 = new QB("YN^H");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(sXd3 + i4 + xuXd2.CK(iKK2) + sXd4);
            i4++;
        }
        byte[] bArrResolve = blobModule.resolve(string, i3, readableMap.getInt(new String(iArr2, 0, i4)));
        if (bArrResolve == null) {
            promise.reject(strZd2, C1561oA.ud(":MI\u0003UQEBGCE@>x:CE7s<Ep9=D.84.", (short) (C1633zX.Xd() ^ (-27337))));
            return;
        }
        try {
            StringBuilder sb = new StringBuilder(strZd);
            if (!readableMap.hasKey(strQd) || readableMap.getString(strQd).isEmpty()) {
                sb.append(C1561oA.yd("\b\u0016\u0019\u0014\u0014\r\u000e \u0018\u001d\u001f^\"\u0015)\u0019\u000bB\f\f\r~}\t", (short) (ZN.Xd() ^ 13409)));
            } else {
                sb.append(readableMap.getString(strQd));
            }
            sb.append(C1561oA.Yd(":bbuh:92", (short) (Od.Xd() ^ (-27021))));
            short sXd5 = (short) (OY.Xd() ^ 1667);
            short sXd6 = (short) (OY.Xd() ^ 30741);
            int[] iArr3 = new int["\t\u0017\u000e\u001d\u001b\u0016\u0012\\%%\u001b\u001fav\u0017*\u001dnm".length()];
            QB qb3 = new QB("\t\u0017\u000e\u001d\u001b\u0016\u0012\\%%\u001b\u001fav\u0017*\u001dnm");
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd5 + i5)) + sXd6);
                i5++;
            }
            Object[] objArr = {bArrResolve, 2};
            Method declaredMethod = Class.forName(new String(iArr3, 0, i5)).getDeclaredMethod(Jg.Wd("\u001d\u001ba\u0003\u0011$\b|2(>\u0006@S", (short) (FB.Xd() ^ 9751), (short) (FB.Xd() ^ 27035)), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                sb.append((String) declaredMethod.invoke(null, objArr));
                promise.resolve(sb.toString());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            promise.reject(e3);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeFileReaderModuleSpec
    public void readAsText(ReadableMap readableMap, String str, Promise promise) {
        BlobModule blobModule = getBlobModule("readAsText");
        if (blobModule == null) {
            promise.reject(new IllegalStateException("Could not get BlobModule from ReactApplicationContext"));
            return;
        }
        if (readableMap == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is null");
            return;
        }
        byte[] bArrResolve = blobModule.resolve(readableMap.getString("blobId"), readableMap.getInt(TypedValues.CycleType.S_WAVE_OFFSET), readableMap.getInt(RRWebVideoEvent.JsonKeys.SIZE));
        if (bArrResolve == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is invalid");
            return;
        }
        try {
            promise.resolve(new String(bArrResolve, str));
        } catch (Exception e2) {
            promise.reject(e2);
        }
    }
}
