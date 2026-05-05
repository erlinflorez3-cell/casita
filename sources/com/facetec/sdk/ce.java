package com.facetec.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
class ce {
    private static /* synthetic */ boolean B = true;

    static class I {
        private int B;
        private int Code;

        public I(int i2, int i3) {
            this.B = i2;
            this.Code = i3;
        }

        final int I() {
            return this.Code;
        }

        final int V() {
            return this.B;
        }
    }

    ce() {
    }

    static float B(int i2) {
        return i2 / (Resources.getSystem().getDisplayMetrics().densityDpi / 160.0f);
    }

    static float Code(int i2) {
        return TypedValue.applyDimension(2, i2, Resources.getSystem().getDisplayMetrics());
    }

    static WindowManager I(Context context) throws Throwable {
        if (context instanceof Activity) {
            return ((Activity) context).getWindowManager();
        }
        Object[] objArr = {C1561oA.Xd("\u007frxo{\u0005", (short) (C1607wl.Xd() ^ 9213))};
        Method method = Class.forName(Wg.vd(":F;HD=7\u007f4?=B2:?w\f75:*<7", (short) (OY.Xd() ^ 15272))).getMethod(yg.hg.Vd("QN\\:_XXHO4EQTF?@", (short) (C1607wl.Xd() ^ 4034), (short) (C1607wl.Xd() ^ 20305)), Class.forName(Qg.kd(":0D.y7+7/t\u001996,0(", (short) (FB.Xd() ^ 63), (short) (FB.Xd() ^ 32681))));
        try {
            method.setAccessible(true);
            WindowManager windowManager = (WindowManager) method.invoke(context, objArr);
            if (B || windowManager != null) {
                return windowManager;
            }
            throw new AssertionError();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static String I(String str) {
        return str == null ? "Unknown Error" : str;
    }

    static void I(Activity activity) {
        View viewFindViewById = activity.findViewById(R.id.backgroundColor);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(4);
        }
    }

    static float V(int i2) {
        return TypedValue.applyDimension(1, i2, Resources.getSystem().getDisplayMetrics());
    }

    static int V(Context context) {
        int rotation = I(context).getDefaultDisplay().getRotation();
        if (rotation != 1) {
            return rotation != 2 ? rotation != 3 ? 1 : 8 : (Build.MODEL.contains("Mi MIX 2") || Build.MODEL.contains("RCT6773W22BM")) ? 1 : 9;
        }
        return 0;
    }

    static I V(String str, int i2, Typeface typeface) {
        Paint paint = new Paint();
        paint.setTextSize(i2);
        paint.setTypeface(typeface);
        paint.setFlags(1);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setAntiAlias(true);
        int iRound = Math.round(paint.measureText(str));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return new I(iRound, Math.round(fontMetrics.descent - fontMetrics.ascent));
    }

    static String V(int i2, int i3) {
        return C1150r.B(Z(i2, i3));
    }

    static int Z(TextView textView, I i2, int i3, int i4) {
        int iCeil;
        Typeface typeface = textView.getTypeface();
        String string = textView.getText().toString();
        if (string.contains("\n")) {
            string = string.substring(0, string.indexOf("\n"));
        }
        int i5 = i4 - i3;
        do {
            i5--;
            iCeil = (int) Math.ceil(((double) (i4 + i3)) / 2.0d);
            I iV = V(string, iCeil, typeface);
            if (iV.V() > i2.V() || iV.I() > i2.I()) {
                i4 = iCeil - 1;
            } else {
                i3 = iCeil;
            }
            if (i3 == i4) {
                break;
            }
        } while (i5 > 0);
        return iCeil - 1;
    }

    static String Z(Context context) throws Throwable {
        ApplicationInfo applicationInfo;
        CharSequence charSequenceZd;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("\u0017#\u0018%!\u001a\u0014\\\u0011\u001c\u001a\u001f\u000f\u0017\u001cTh\u0014\u0012\u0017\u0007\u0019\u0014", (short) (Od.Xd() ^ (-26863)))).getMethod(C1561oA.yd("LKW4JMRIDC(=OCFEG", (short) (OY.Xd() ^ 31890)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            try {
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Yd("SaXge`\\']jjqcmt/Erryk\u007f|", (short) (C1499aX.Xd() ^ (-23881)))).getMethod(Xg.qd("A@P\u001eNOLJEDXNUU1WPZ", (short) (C1580rY.Xd() ^ (-23338)), (short) (C1580rY.Xd() ^ (-25864))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = ((PackageItemInfo) ((ApplicationInfo) method2.invoke(context, objArr2))).packageName;
                    Class<?> cls = Class.forName(Jg.Wd("q\u007f8Hd!\u001f\u0010\b\u0016T|n?g#%%\bp\u0005)og0T?\u0016A8\u0001%5", (short) (Od.Xd() ^ (-17048)), (short) (Od.Xd() ^ (-4607))));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(ZO.xd("\u001f=C =+\t\f*7\u0013~JJde", (short) (C1633zX.Xd() ^ (-3048)), (short) (C1633zX.Xd() ^ (-3871))));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 0};
                    Method method3 = cls.getMethod(C1626yg.Ud("+\u0017\u0017EaTJ\u000ex\u0019fy2*rG\u001e(", (short) (FB.Xd() ^ 5786), (short) (FB.Xd() ^ 6887)), clsArr);
                    try {
                        method3.setAccessible(true);
                        applicationInfo = (ApplicationInfo) method3.invoke(packageManager, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (PackageManager.NameNotFoundException unused) {
                applicationInfo = null;
            }
            if (applicationInfo != null) {
                short sXd = (short) (ZN.Xd() ^ 7236);
                int[] iArr = new int["[\u0010wj0\u0005\u0010ywTQ9?RT3),\u0014:\u0015Bd^\u001e$-t DZ}3".length()];
                QB qb = new QB("[\u0010wj0\u0005\u0010ywTQ9?RT3),\u0014:\u0015Bd^\u001e$-t DZ}3");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                    i2++;
                }
                Object[] objArr4 = {applicationInfo};
                Method method4 = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("?<J\u0016DC>:30B6;9\u0016**,2", (short) (C1633zX.Xd() ^ (-24687))), Class.forName(EO.Od("\u001eaG0v%>:\u0016!$\u0006!2*@?T?L\u0012hxs\u0004\b;|#RK\u000b-N", (short) (OY.Xd() ^ 21966))));
                try {
                    method4.setAccessible(true);
                    charSequenceZd = (CharSequence) method4.invoke(packageManager, objArr4);
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } else {
                charSequenceZd = C1593ug.zd("\u0004\u001e\u001c \"+#", (short) (FB.Xd() ^ 23455), (short) (FB.Xd() ^ 527));
            }
            return (String) charSequenceZd;
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    static byte[] Z(int i2, int i3) throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (-23997));
        int[] iArr = new int["}s\bq=\u0002ro\u0001|r|\u00014XifwseQ_k`jg".length()];
        QB qb = new QB("}s\bq=\u0002ro\u0001|r|\u00014XifwseQ_k`jg");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(sXd + sXd + i4 + xuXd.CK(iKK));
            i4++;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(new String(iArr, 0, i4)).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            SecureRandom secureRandom = (SecureRandom) constructor.newInstance(objArr);
            if (i3 != 0) {
                i2 += secureRandom.nextInt(i3 + 1);
            }
            Class<?> cls = Class.forName(C1561oA.Kd(" \u0018.\u001ag.! 31)5;p\u0017*)<:.\u001c,:1=<", (short) (OY.Xd() ^ 12941)));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr2 = {Integer.valueOf(i2)};
            Method method = cls.getMethod(Wg.Zd("\u0007\\~Lnf`f]V[\u0004", (short) (Od.Xd() ^ (-30478)), (short) (Od.Xd() ^ (-15872))), clsArr);
            try {
                method.setAccessible(true);
                return (byte[]) method.invoke(secureRandom, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
