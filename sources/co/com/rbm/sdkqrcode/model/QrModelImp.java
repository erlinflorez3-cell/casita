package co.com.rbm.sdkqrcode.model;

import android.app.Activity;
import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import co.com.rbm.sdkqrcode.R;
import com.valid.emvqr.entities.MerchantEmvQrEntity;
import com.valid.emvqr.manager.EmvQrManagerCallback;
import com.valid.emvqr.manager.EmvQrManagerImp;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.OY;
import yg.Qg;
import yg.Wg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class QrModelImp implements EmvQrManagerCallback, QrModelInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EmvqrCallback f2579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f2580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EmvQrManagerImp f2581c = new EmvQrManagerImp();

    public class ParseException extends RuntimeException {
    }

    public QrModelImp(Context context, EmvqrCallback emvqrCallback) {
        this.f2579a = emvqrCallback;
        this.f2580b = context;
    }

    public MerchantEmvQrEntity a(String str) throws Throwable {
        StringBuilder sb;
        int i2;
        String strXd;
        int i3;
        int i4;
        Context context;
        int i5;
        String strVd;
        try {
            return this.f2581c.processEmvQrData(str);
        } catch (Exception e2) {
            PrintStream printStream = System.out;
            String strZd = Wg.Zd(ExifInterface.GPS_DIRECTION_TRUE, (short) (C1499aX.Xd() ^ (-32315)), (short) (C1499aX.Xd() ^ (-29245)));
            if (Integer.parseInt(strZd) != 0) {
                i2 = 4;
                strXd = strZd;
                sb = null;
            } else {
                sb = new StringBuilder();
                i2 = 11;
                strXd = C1561oA.Xd("jr", (short) (C1580rY.Xd() ^ (-22448)));
            }
            if (i2 != 0) {
                context = this.f2580b;
                i4 = R.string.error_scan;
                i3 = 0;
            } else {
                i3 = i2 + 14;
                i4 = 1;
                context = null;
                strZd = strXd;
            }
            if (Integer.parseInt(strZd) != 0) {
                i5 = i3 + 10;
                strVd = null;
            } else {
                Class<?> cls = Class.forName(Wg.vd("JXKZ\\WO\u001aDQMTJTW\u0012<ielbvo", (short) (OY.Xd() ^ 26813)));
                Class<?>[] clsArr = {Integer.TYPE};
                Object[] objArr = {Integer.valueOf(i4)};
                Method method = cls.getMethod(Qg.kd("-*8\u001663)-%", (short) (C1633zX.Xd() ^ (-15476)), (short) (C1633zX.Xd() ^ (-10385))), clsArr);
                try {
                    method.setAccessible(true);
                    sb = sb.append((String) method.invoke(context, objArr));
                    i5 = i3 + 12;
                    strVd = hg.Vd("L", (short) (ZN.Xd() ^ 26799), (short) (ZN.Xd() ^ 10599));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            if (i5 != 0) {
                sb = sb.append(strVd).append(e2);
            }
            printStream.println(sb.toString());
            EmvqrCallback emvqrCallback = this.f2579a;
            if (emvqrCallback == null) {
                return null;
            }
            Context context2 = this.f2580b;
            int i6 = R.string.error_scan;
            Class<?> cls2 = Class.forName(C1561oA.ud("x\u0005y\u0007\u0003{u>r}{\u0001px}6Jusxhzu", (short) (OY.Xd() ^ 18700)));
            Class<?>[] clsArr2 = {Integer.TYPE};
            Object[] objArr2 = {Integer.valueOf(i6)};
            Method method2 = cls2.getMethod(C1561oA.yd("\u0002~\rj\u000b\b}\u0002y", (short) (OY.Xd() ^ 27687)), clsArr2);
            try {
                method2.setAccessible(true);
                emvqrCallback.onErrorCallback(900, (String) method2.invoke(context2, objArr2));
                return null;
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
    }

    @Override // co.com.rbm.sdkqrcode.model.QrModelInterface
    public void init(String str, String str2, String str3) {
        try {
            this.f2581c.init(this.f2580b, str, str2, str3, this);
        } catch (ParseException unused) {
        }
    }

    @Override // com.valid.emvqr.manager.EmvQrManagerCallback
    public void initiatedScanEmvQr() {
        try {
            this.f2579a.checkInitializeScan(true);
        } catch (ParseException unused) {
        }
    }

    @Override // com.valid.emvqr.manager.EmvQrManagerCallback
    public void onErrorEmvQr(Integer num, String str) {
        if (num == null) {
            num = 900;
        }
        this.f2579a.onErrorCallback(num.intValue(), str);
    }

    @Override // com.valid.emvqr.manager.EmvQrManagerCallback
    public void onScanResponse(String str) throws Throwable {
        try {
            transformData(str);
        } catch (ParseException unused) {
        }
    }

    @Override // co.com.rbm.sdkqrcode.model.QrModelInterface
    public void startScan(int i2, Activity activity) throws Exception {
        try {
            this.f2581c.startScan(activity, i2);
        } catch (ParseException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x013e  */
    @Override // co.com.rbm.sdkqrcode.model.QrModelInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void transformData(java.lang.String r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: co.com.rbm.sdkqrcode.model.QrModelImp.transformData(java.lang.String):void");
    }
}
