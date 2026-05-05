package co.com.rbm.sdkqrcode.manager;

import android.app.Activity;
import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import co.com.rbm.sdkqrcode.BuildConfig;
import co.com.rbm.sdkqrcode.R;
import co.com.rbm.sdkqrcode.data.DataAmount;
import co.com.rbm.sdkqrcode.data.MerchantAUnreservedC;
import co.com.rbm.sdkqrcode.data.QrEntity;
import co.com.rbm.sdkqrcode.model.EmvqrCallback;
import co.com.rbm.sdkqrcode.model.QrModelImp;
import co.com.rbm.sdkqrcode.model.QrModelInterface;
import co.com.rbm.sdkqrcode.result.QrErrorCallback;
import co.com.rbm.sdkqrcode.result.QrLicenseCallback;
import co.com.rbm.sdkqrcode.result.QrManagerCallback;
import co.com.rbm.sdkqrcode.utils.PrinterData;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.dynatrace.android.agent.AdkSettings;
import cz.msebera.android.httpclient.HttpStatus;
import cz.msebera.android.httpclient.message.TokenParser;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
public class QrManagerImp implements EmvqrCallback, QrManagerInterface {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Double f2571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static QrManagerImp f2572h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public QrModelInterface f2573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public QrManagerCallback f2574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public QrLicenseCallback f2575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public QrErrorCallback f2576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f2577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2578f;

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    static {
        try {
            f2571g = Double.valueOf(0.0d);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public QrManagerImp(Context context) {
        this.f2577e = context;
        this.f2573a = new QrModelImp(context, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0364  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static co.com.rbm.sdkqrcode.data.DataAmount a(co.com.rbm.sdkqrcode.data.QrEntity r26, co.com.rbm.sdkqrcode.data.MerchantAUnreservedC r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, double r31, java.lang.String r33) {
        /*
            Method dump skipped, instruction units count: 1598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: co.com.rbm.sdkqrcode.manager.QrManagerImp.a(co.com.rbm.sdkqrcode.data.QrEntity, co.com.rbm.sdkqrcode.data.MerchantAUnreservedC, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String):co.com.rbm.sdkqrcode.data.DataAmount");
    }

    public static Double a(double d2) {
        try {
            return Double.valueOf(d2 / 100.0d);
        } catch (ArrayOutOfBoundsException unused) {
            return null;
        }
    }

    public static Double a(double d2, double d3) {
        try {
            return Double.valueOf((d2 * d3) / 100.0d);
        } catch (ArrayOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Double a(java.lang.String r11) {
        /*
            java.lang.String r10 = "0"
            r9 = 4
            if (r11 == 0) goto L28
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L28
            int r1 = co.com.rbm.sdkqrcode.data.DataAmount.AnonymousClass1.endsWith()
            int r0 = r1 * 2
            int r0 = r0 % r1
            if (r0 == 0) goto La5
            java.lang.String r1 = "+t~:2&?5{-tl|2 o{w%<`#8|#)\"2*?b:*&9u"
            r0 = 93
            java.lang.String r0 = co.com.rbm.sdkqrcode.data.DataAmount.AnonymousClass1.endsWith(r0, r1)
        L1e:
            java.lang.String r0 = co.com.rbm.sdkqrcode.data.DataAmount.AnonymousClass1.endsWith(r9, r0)
            boolean r0 = r11.matches(r0)
            if (r0 == 0) goto L6f
        L28:
            int r0 = java.lang.Integer.parseInt(r10)
            r8 = 11
            java.lang.String r7 = "12"
            r6 = 6
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L9f
            r1 = 8
            r11 = r10
            r0 = r5
            r3 = r4
        L3a:
            if (r1 == 0) goto L9b
            int r2 = r0 << 2
            r11 = r10
            r1 = r5
        L40:
            int r0 = java.lang.Integer.parseInt(r11)
            if (r0 == 0) goto L96
            int r1 = r1 + 12
            r9 = r2
            r0 = r4
        L4a:
            if (r1 == 0) goto L93
            int r9 = r9 + r0
            int r9 = r9 + r0
            r11 = r10
            r1 = r5
        L50:
            int r0 = java.lang.Integer.parseInt(r11)
            if (r0 == 0) goto L8f
            int r1 = r1 + 5
            r8 = r5
            r7 = r11
        L5a:
            if (r1 == 0) goto L8c
            int r8 = r8 + r5
            int r8 = r8 + r5
        L5e:
            int r0 = java.lang.Integer.parseInt(r10)
            if (r0 == 0) goto L85
        L64:
            int r0 = r4 * 5
            int r0 = r0 % r8
            if (r0 != 0) goto L7c
            java.lang.String r0 = "cfm"
        L6b:
            java.lang.String r11 = co.com.rbm.sdkqrcode.data.DataAmount.AnonymousClass1.endsWith(r3, r0)
        L6f:
            java.lang.Double r0 = java.lang.Double.valueOf(r11)
            double r0 = r0.doubleValue()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L7c:
            java.lang.String r1 = "@b=`jK39&\u001f(7"
            r0 = 73
            java.lang.String r0 = co.com.rbm.sdkqrcode.data.DataAmount.AnonymousClass1.endsWith(r0, r1)
            goto L6b
        L85:
            int r3 = r3 / r8
            int r4 = co.com.rbm.sdkqrcode.data.DataAmount.AnonymousClass1.endsWith()
            r8 = r4
            goto L64
        L8c:
            r10 = r7
            r8 = r4
            goto L5e
        L8f:
            int r3 = r3 + r9
            int r1 = r1 + r6
            r5 = r8
            goto L5a
        L93:
            int r1 = r1 + 14
            goto L50
        L96:
            int r3 = r3 + r2
            int r1 = r1 + r6
            r0 = r9
            r11 = r7
            goto L4a
        L9b:
            int r1 = r1 + 5
            r2 = r4
            goto L40
        L9f:
            r3 = 22
            r0 = r8
            r11 = r7
            r1 = r6
            goto L3a
        La5:
            java.lang.String r0 = "\u000e+r.\b3IU6"
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: co.com.rbm.sdkqrcode.manager.QrManagerImp.a(java.lang.String):java.lang.Double");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashMap<java.lang.String, java.lang.Double> a(co.com.rbm.sdkqrcode.data.QrEntity r16, co.com.rbm.sdkqrcode.data.MerchantAUnreservedC r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: co.com.rbm.sdkqrcode.manager.QrManagerImp.a(co.com.rbm.sdkqrcode.data.QrEntity, co.com.rbm.sdkqrcode.data.MerchantAUnreservedC, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.util.HashMap");
    }

    public static boolean a(QrEntity qrEntity, boolean z2) {
        return qrEntity != null && z2;
    }

    public static boolean a(Double d2, Double d3) {
        try {
            return d2.compareTo(d3) == 0;
        } catch (ArrayOutOfBoundsException unused) {
            return false;
        }
    }

    public static void b(double d2) {
        try {
            if (d2 < f2571g.doubleValue()) {
                int iConcat = BuildConfig.AnonymousClass1.concat();
                throw new IllegalArgumentException(BuildConfig.AnonymousClass1.concat((iConcat * 5) % iConcat == 0 ? "+1%" : DataAmount.AnonymousClass1.endsWith(116, "#>{}#:f~:8oxwfq&!:{.1ogpgkw/)<xv1?u|:*p"), 4));
            }
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public static boolean b(String str) {
        int i2;
        int i3;
        char c2;
        String str2;
        int i4;
        int i5;
        char c3;
        int iConcat = BuildConfig.AnonymousClass1.concat();
        String strConcat = (iConcat * 5) % iConcat != 0 ? BuildConfig.AnonymousClass1.concat("7t58{udyw1z6 h`qec='>y-v(l>&>p\"c$42k", 116) : "#3";
        String str3 = AdkSettings.PLATFORM_TYPE_MOBILE;
        String str4 = "6";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            c2 = '\f';
            str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i2 = 1;
            i3 = 1;
        } else {
            i2 = 231;
            i3 = 4;
            c2 = 6;
            str2 = "6";
        }
        if (c2 != 0) {
            i2 += i3 + i3;
            str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str2) == 0) {
            i2 /= 44;
        }
        if (BuildConfig.AnonymousClass1.concat(strConcat, i2).equals(str)) {
            return true;
        }
        int iConcat2 = BuildConfig.AnonymousClass1.concat();
        String strConcat2 = (iConcat2 * 3) % iConcat2 != 0 ? BuildConfig.AnonymousClass1.concat("16,#-}bgj3&+%pa", 114) : "$0";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            c3 = 15;
            str4 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i4 = 1;
            i5 = 1;
        } else {
            i4 = 44;
            i5 = 2;
            c3 = 7;
        }
        if (c3 != 0) {
            i4 += i5 + i5;
        } else {
            str3 = str4;
        }
        if (Integer.parseInt(str3) == 0) {
            i4 /= 8;
        }
        return BuildConfig.AnonymousClass1.concat(strConcat2, i4).equals(str) || "N".equals(str) || ExifInterface.LATITUDE_SOUTH.equals(str);
    }

    public static Double c(double d2) {
        try {
            return Double.valueOf(Math.round(d2));
        } catch (ArrayOutOfBoundsException unused) {
            return null;
        }
    }

    public static boolean c(String str) {
        int i2;
        int i3;
        int i4;
        String str2;
        char c2;
        char c3;
        int i5;
        int iEndsWith;
        int i6;
        char c4;
        int i7;
        String str3 = AdkSettings.PLATFORM_TYPE_MOBILE;
        char c5 = 15;
        String str4 = "5";
        int i8 = 4;
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
            c2 = 15;
            i4 = 1;
            i2 = 4;
            i3 = 2;
        } else {
            i2 = 16;
            i3 = 3;
            i4 = 3;
            str2 = "5";
            c2 = 4;
        }
        if (c2 != 0) {
            i3 = i3 + i4 + i4;
            str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str2) != 0) {
            i5 = 1;
            c3 = 4;
        } else {
            i2 += i3;
            c3 = 15;
            str2 = "5";
            i3 = 4;
            i5 = 4;
        }
        if (c3 != 0) {
            i3 = i3 + i5 + i5;
            str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str2) != 0) {
            iEndsWith = 1;
        } else {
            i2 /= i3;
            iEndsWith = DataAmount.AnonymousClass1.endsWith();
            i3 = iEndsWith;
        }
        if (DataAmount.AnonymousClass1.endsWith(i2, (iEndsWith * 3) % i3 == 0 ? "cz" : BuildConfig.AnonymousClass1.concat("\u001adh)z\"70 z2myi+.l,cm`7-<*7lts|$", 110)).equals(str)) {
            return true;
        }
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            c4 = 11;
            str4 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i6 = 1;
            i8 = 1;
            i7 = 1;
        } else {
            i6 = HttpStatus.SC_REQUEST_URI_TOO_LONG;
            c4 = '\n';
            i7 = 2;
        }
        if (c4 != 0) {
            i6 += i8 << i7;
        } else {
            str3 = str4;
        }
        if (Integer.parseInt(str3) == 0) {
            i6 /= 72;
            c5 = 6;
        }
        int iEndsWith2 = c5 != 0 ? DataAmount.AnonymousClass1.endsWith() : 1;
        return DataAmount.AnonymousClass1.endsWith(i6, (iEndsWith2 * 2) % iEndsWith2 == 0 ? "fx" : DataAmount.AnonymousClass1.endsWith(124, "𬋍")).equals(str) || ExifInterface.LATITUDE_SOUTH.equals(str) || "N".equals(str);
    }

    public static Double d(String str) {
        if (str != null && !"".equals(str)) {
            int iConcat = BuildConfig.AnonymousClass1.concat();
            if (!str.matches(BuildConfig.AnonymousClass1.concat((iConcat * 2) % iConcat != 0 ? BuildConfig.AnonymousClass1.concat("q\u007fp?/84x`tx7'4", 82) : "K~#g\rv\u0010\u0004#", 2))) {
                return Double.valueOf(str);
            }
        }
        int iConcat2 = BuildConfig.AnonymousClass1.concat();
        throw new IllegalArgumentException(BuildConfig.AnonymousClass1.concat((iConcat2 * 2) % iConcat2 != 0 ? BuildConfig.AnonymousClass1.concat("'(k+/h|:%#4pp~v52<34}x<do?%d\"\"es2j?+", 2) : "+1#", 4));
    }

    public static QrManagerImp getInstance(Context context) {
        if (f2572h == null) {
            f2572h = new QrManagerImp(context);
        }
        return f2572h;
    }

    public final void a(QrErrorCallback qrErrorCallback) {
        try {
            this.f2576d = qrErrorCallback;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // co.com.rbm.sdkqrcode.manager.QrManagerInterface
    public DataAmount calculateTaxDynamic(QrEntity qrEntity, String str) {
        String strCheckNull;
        String str2;
        int i2;
        int i3;
        String strCheckNull2;
        String strCheckNull3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iEndsWith;
        int i11 = 5;
        if (!a(qrEntity, this.f2578f)) {
            int iEndsWith2 = DataAmount.AnonymousClass1.endsWith();
            throw new IllegalArgumentException(DataAmount.AnonymousClass1.endsWith(5, (iEndsWith2 * 2) % iEndsWith2 != 0 ? BuildConfig.AnonymousClass1.concat("#?sva{b9\"}:))w}:f/(,t3 }jo.m(+:\u007f15sb", 9) : "o{u"));
        }
        MerchantAUnreservedC merchantAUnreservedC = qrEntity.getMerchantAUnreservedC();
        String pointOfInitiationMethod = qrEntity.getPointOfInitiationMethod() == null ? "" : qrEntity.getPointOfInitiationMethod();
        String tipOrConvenienceIndicator = qrEntity.getTipOrConvenienceIndicator();
        String str3 = "30";
        int i12 = 2;
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            i2 = 13;
            str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
            strCheckNull = null;
        } else {
            strCheckNull = PrinterData.checkNull(tipOrConvenienceIndicator);
            tipOrConvenienceIndicator = merchantAUnreservedC.getConditionIVA();
            str2 = "30";
            i2 = 2;
        }
        int i13 = 0;
        if (i2 != 0) {
            strCheckNull2 = PrinterData.checkNull(tipOrConvenienceIndicator);
            tipOrConvenienceIndicator = merchantAUnreservedC.getConditionINC();
            str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i3 = 0;
        } else {
            i3 = i2 + 7;
            strCheckNull2 = null;
        }
        if (Integer.parseInt(str2) != 0) {
            i4 = i3 + 15;
            i5 = 1;
            strCheckNull3 = null;
        } else {
            strCheckNull3 = PrinterData.checkNull(tipOrConvenienceIndicator);
            i4 = i3 + 7;
            str2 = "30";
            i5 = 5;
        }
        if (i4 != 0) {
            i7 = i5 << 2;
            str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i6 = 0;
        } else {
            i6 = i4 + 6;
            i7 = 1;
        }
        if (Integer.parseInt(str2) != 0) {
            i8 = i6 + 14;
            i12 = i7;
            str3 = str2;
            i9 = 1;
        } else {
            i5 += i7;
            i8 = i6 + 8;
            i9 = 2;
        }
        if (i8 != 0) {
            i5 += i12 + i9;
            i12 = 5;
            str3 = AdkSettings.PLATFORM_TYPE_MOBILE;
        } else {
            i13 = i8 + 7;
        }
        if (Integer.parseInt(str3) != 0) {
            i10 = i13 + 14;
        } else {
            i5 /= i12 + i12;
            i10 = i13 + 4;
        }
        if (i10 != 0) {
            iEndsWith = DataAmount.AnonymousClass1.endsWith();
        } else {
            i11 = 1;
            iEndsWith = 1;
        }
        if (!DataAmount.AnonymousClass1.endsWith(i5, (iEndsWith * i11) % iEndsWith != 0 ? DataAmount.AnonymousClass1.endsWith(77, "/$:3#0rcuh~q") : "bz").equals(pointOfInitiationMethod) && !"D".equals(pointOfInitiationMethod)) {
            int iEndsWith3 = DataAmount.AnonymousClass1.endsWith();
            throw new IllegalArgumentException(DataAmount.AnonymousClass1.endsWith(4, (iEndsWith3 * 2) % iEndsWith3 != 0 ? DataAmount.AnonymousClass1.endsWith(43, "IYP+3v\u001c~\u001eJLrB^@e.r=,\u001aR\\eX^,\u0017/e\u0019 UYV_\u007fp\u0011\f6\u0016\u0005\u0006w`TbEF\u0000>\u001a82sw`\\gQ\u000e\u0010.\u0006\u0006\u0014sqR/cH\u0018s~") : "lzj"));
        }
        String baseIva = merchantAUnreservedC.getBaseIva();
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) == 0) {
            a(baseIva);
            baseIva = qrEntity.getTransactionAmount();
        }
        double dDoubleValue = a(baseIva).doubleValue();
        if (c(strCheckNull3) && c(strCheckNull2)) {
            return a(qrEntity, merchantAUnreservedC, strCheckNull2, strCheckNull3, strCheckNull, dDoubleValue, str);
        }
        int iEndsWith4 = DataAmount.AnonymousClass1.endsWith();
        throw new IllegalArgumentException(DataAmount.AnonymousClass1.endsWith(1, (iEndsWith4 * 5) % iEndsWith4 == 0 ? "kwh" : DataAmount.AnonymousClass1.endsWith(46, "!?\"vtv")));
    }

    @Override // co.com.rbm.sdkqrcode.manager.QrManagerInterface
    public DataAmount calculateTaxHybrid(QrEntity qrEntity, String str) {
        String transactionAmount;
        String strCheckNull;
        String str2;
        char c2;
        String strCheckNull2;
        double d2;
        int i2;
        char c3;
        String str3;
        int i3;
        char c4;
        if (!a(qrEntity, this.f2578f)) {
            int iConcat = BuildConfig.AnonymousClass1.concat();
            throw new IllegalArgumentException(BuildConfig.AnonymousClass1.concat((iConcat * 4) % iConcat != 0 ? BuildConfig.AnonymousClass1.concat("\u1b605", 2) : "+1%", 4));
        }
        MerchantAUnreservedC merchantAUnreservedC = qrEntity.getMerchantAUnreservedC();
        String str4 = AdkSettings.PLATFORM_TYPE_MOBILE;
        String strCheckNull3 = null;
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            merchantAUnreservedC = null;
            transactionAmount = null;
        } else {
            transactionAmount = qrEntity.getTransactionAmount();
        }
        double dDoubleValue = a(transactionAmount).doubleValue();
        String pointOfInitiationMethod = qrEntity.getPointOfInitiationMethod() == null ? "" : qrEntity.getPointOfInitiationMethod();
        String conditionIVA = merchantAUnreservedC.getConditionIVA();
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            c2 = 7;
            str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
            strCheckNull = null;
        } else {
            strCheckNull = PrinterData.checkNull(conditionIVA);
            conditionIVA = merchantAUnreservedC.getConditionINC();
            str2 = ExifInterface.GPS_MEASUREMENT_2D;
            c2 = '\t';
        }
        if (c2 != 0) {
            strCheckNull2 = PrinterData.checkNull(conditionIVA);
            conditionIVA = qrEntity.getTipOrConvenienceIndicator();
            str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
        } else {
            strCheckNull2 = null;
        }
        if (Integer.parseInt(str2) != 0) {
            d2 = 1.0d;
        } else {
            strCheckNull3 = PrinterData.checkNull(conditionIVA);
            d2 = dDoubleValue;
        }
        if (d2 > f2571g.doubleValue()) {
            int iConcat2 = BuildConfig.AnonymousClass1.concat();
            String strConcat = (iConcat2 * 3) % iConcat2 != 0 ? BuildConfig.AnonymousClass1.concat("𫜖", 66) : "#0";
            int i4 = 1;
            if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
                str3 = AdkSettings.PLATFORM_TYPE_MOBILE;
                c3 = '\t';
                i2 = 1;
            } else {
                i2 = 18;
                c3 = '\n';
                str3 = ExifInterface.GPS_MEASUREMENT_2D;
            }
            if (c3 != 0) {
                i2 += i2 + i2;
                str3 = AdkSettings.PLATFORM_TYPE_MOBILE;
            }
            if (Integer.parseInt(str3) != 0) {
                c4 = '\b';
                i3 = 1;
            } else {
                i3 = i2 + 9;
                c4 = TokenParser.CR;
                str3 = ExifInterface.GPS_MEASUREMENT_2D;
                i4 = 2;
            }
            if (c4 != 0) {
                i3 += i4 + i4;
            } else {
                str4 = str3;
            }
            if (Integer.parseInt(str4) == 0) {
                i3 /= 14;
            }
            if (BuildConfig.AnonymousClass1.concat(strConcat, i3).equals(pointOfInitiationMethod)) {
                a(merchantAUnreservedC.getBaseIva());
                if (c(strCheckNull2) && c(strCheckNull)) {
                    return a(qrEntity, merchantAUnreservedC, strCheckNull, strCheckNull2, strCheckNull3, dDoubleValue, str);
                }
                int iConcat3 = BuildConfig.AnonymousClass1.concat();
                throw new IllegalArgumentException(BuildConfig.AnonymousClass1.concat((iConcat3 * 3) % iConcat3 != 0 ? BuildConfig.AnonymousClass1.concat("\u1b61d", 34) : "*2%", 5));
            }
        }
        int iConcat4 = BuildConfig.AnonymousClass1.concat();
        throw new IllegalArgumentException(BuildConfig.AnonymousClass1.concat((iConcat4 * 3) % iConcat4 == 0 ? "*2$" : BuildConfig.AnonymousClass1.concat("Gs|7\"74 e{-j$#i<be(~\u0080òa#½₢ℿiuj<&1jpv3/0`-;i}bt,t", 9), 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:342:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    @Override // co.com.rbm.sdkqrcode.manager.QrManagerInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public co.com.rbm.sdkqrcode.data.DataAmount calculateTaxStatic(co.com.rbm.sdkqrcode.data.QrEntity r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35) {
        /*
            Method dump skipped, instruction units count: 1972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: co.com.rbm.sdkqrcode.manager.QrManagerImp.calculateTaxStatic(co.com.rbm.sdkqrcode.data.QrEntity, java.lang.String, java.lang.String, java.lang.String, java.lang.String):co.com.rbm.sdkqrcode.data.DataAmount");
    }

    @Override // co.com.rbm.sdkqrcode.model.EmvqrCallback
    public void checkInitializeScan(boolean z2) {
        try {
            this.f2578f = z2;
            this.f2575c.checkInitializeScan(z2);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // co.com.rbm.sdkqrcode.manager.QrManagerInterface
    public void initializeLibrary(String str, String str2, String str3, QrLicenseCallback qrLicenseCallback) {
        QrLicenseCallback qrLicenseCallback2;
        char c2;
        QrManagerImp qrManagerImp;
        this.f2575c = qrLicenseCallback;
        QrModelInterface qrModelInterface = null;
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            c2 = '\f';
            qrLicenseCallback2 = null;
            qrManagerImp = null;
        } else {
            qrLicenseCallback2 = this.f2575c;
            c2 = 6;
            qrManagerImp = this;
        }
        if (c2 != 0) {
            qrManagerImp.a(qrLicenseCallback2);
            qrModelInterface = this.f2573a;
        }
        qrModelInterface.init(str, str2, str3);
    }

    @Override // co.com.rbm.sdkqrcode.model.EmvqrCallback
    public void onErrorCallback(int i2, String str) {
        try {
            QrErrorCallback qrErrorCallback = this.f2576d instanceof QrLicenseCallback ? this.f2575c : this.f2574b;
            this.f2576d = qrErrorCallback;
            qrErrorCallback.onErrorShow(i2, str);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // co.com.rbm.sdkqrcode.model.EmvqrCallback
    public void onScanResponseCallback(String str, QrEntity qrEntity, Object obj) {
        try {
            this.f2574b.onScanResponse(str, qrEntity, obj);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // co.com.rbm.sdkqrcode.manager.QrManagerInterface
    public void startScan(int i2, Activity activity, QrManagerCallback qrManagerCallback) throws Throwable {
        try {
            this.f2574b = qrManagerCallback;
            a(qrManagerCallback);
            if (i2 != 0 && i2 != 1) {
                QrManagerCallback qrManagerCallback2 = this.f2574b;
                Context context = this.f2577e;
                int i3 = R.string.error_cameraid;
                short sXd = (short) (C1607wl.Xd() ^ 19163);
                int[] iArr = new int["x4\u001e\u0006\u0014k\u0005O`:9\u001f_t\u0001\u001aT\u001dU5a.\n".length()];
                QB qb = new QB("x4\u001e\u0006\u0014k\u0005O`:9\u001f_t\u0001\u001aT\u001dU5a.\n");
                int i4 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i4] = xuXd.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd + sXd) + i4)) + xuXd.CK(iKK));
                    i4++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i4));
                Class<?>[] clsArr = {Integer.TYPE};
                Object[] objArr = {Integer.valueOf(i3)};
                short sXd2 = (short) (C1607wl.Xd() ^ LeicaMakernoteDirectory.TAG_CCD_BOARD_VERSION);
                int[] iArr2 = new int["@=K)IF<@8".length()];
                QB qb2 = new QB("@=K)IF<@8");
                int i5 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i5] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i5 + xuXd2.CK(iKK2));
                    i5++;
                }
                Method method = cls.getMethod(new String(iArr2, 0, i5), clsArr);
                try {
                    method.setAccessible(true);
                    qrManagerCallback2.onErrorShow(901, (String) method.invoke(context, objArr));
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            this.f2573a.startScan(i2, activity);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // co.com.rbm.sdkqrcode.manager.QrManagerInterface
    public void transformData(String str, QrManagerCallback qrManagerCallback) throws Throwable {
        QrManagerCallback qrManagerCallback2;
        QrManagerImp qrManagerImp;
        try {
            this.f2574b = qrManagerCallback;
            short sXd = (short) (C1580rY.Xd() ^ (-3878));
            short sXd2 = (short) (C1580rY.Xd() ^ (-8514));
            int[] iArr = new int["l".length()];
            QB qb = new QB("l");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            if (Integer.parseInt(new String(iArr, 0, i2)) != 0) {
                qrManagerImp = null;
                qrManagerCallback2 = null;
            } else {
                qrManagerCallback2 = this.f2574b;
                qrManagerImp = this;
            }
            qrManagerImp.a(qrManagerCallback2);
            if (this.f2578f) {
                this.f2573a.transformData(str);
                return;
            }
            QrManagerCallback qrManagerCallback3 = this.f2574b;
            Context context = this.f2577e;
            int i3 = R.string.error_license;
            Class<?> cls = Class.forName(C1561oA.od("\u0005\u0011\u0006\u0013\u000f\b\u0002J~\n\b\r|\u0005\nBV\u0002\u007f\u0005t\u0007\u0002", (short) (C1499aX.Xd() ^ (-3787))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i3)};
            Method method = cls.getMethod(C1561oA.Kd("HGW7YXPVP", (short) (C1499aX.Xd() ^ (-6111))), clsArr);
            try {
                method.setAccessible(true);
                qrManagerCallback3.onErrorShow(2, (String) method.invoke(context, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (ArrayOutOfBoundsException unused) {
        }
    }
}
