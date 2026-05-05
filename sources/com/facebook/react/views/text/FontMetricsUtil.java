package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import androidx.exifinterface.media.ExifInterface;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class FontMetricsUtil {
    private static final float AMPLIFICATION_FACTOR = 100.0f;
    private static final String CAP_HEIGHT_MEASUREMENT_TEXT = "T";
    private static final String X_HEIGHT_MEASUREMENT_TEXT = "x";

    public static WritableArray getFontMetrics(CharSequence charSequence, Layout layout, TextPaint textPaint, Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("JVKXTMG\u0010DOMRBJO\b\u001cGEJ:LG", (short) (C1607wl.Xd() ^ 20107), (short) (C1607wl.Xd() ^ 10703))).getMethod(C1561oA.ud("\n\u0007\u0015q\u0004\u0011\f\u0011\r|}\u000b", (short) (C1499aX.Xd() ^ (-12733))), new Class[0]);
        try {
            method.setAccessible(true);
            DisplayMetrics displayMetrics = ((Resources) method.invoke(context, objArr)).getDisplayMetrics();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            TextPaint textPaint2 = new TextPaint(textPaint);
            textPaint2.setTextSize(textPaint2.getTextSize() * AMPLIFICATION_FACTOR);
            Rect rect = new Rect();
            String strYd = C1561oA.yd(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, (short) (OY.Xd() ^ 8901));
            textPaint2.getTextBounds(strYd, 0, strYd.length(), rect);
            double dHeight = (rect.height() / AMPLIFICATION_FACTOR) / displayMetrics.density;
            Rect rect2 = new Rect();
            String strYd2 = C1561oA.Yd("`", (short) (ZN.Xd() ^ 32261));
            textPaint2.getTextBounds(strYd2, 0, strYd2.length(), rect2);
            double dHeight2 = (rect2.height() / AMPLIFICATION_FACTOR) / displayMetrics.density;
            for (int i2 = 0; i2 < layout.getLineCount(); i2++) {
                charSequence = charSequence;
                float lineWidth = (charSequence.length() <= 0 || charSequence.charAt(layout.getLineEnd(i2) + (-1)) != '\n') ? layout.getLineWidth(i2) : layout.getLineMax(i2);
                layout.getLineBounds(i2, new Rect());
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putDouble(strYd2, layout.getLineLeft(i2) / displayMetrics.density);
                double d2 = r9.top / displayMetrics.density;
                short sXd = (short) (Od.Xd() ^ (-8129));
                short sXd2 = (short) (Od.Xd() ^ (-29989));
                int[] iArr = new int["\u0003".length()];
                QB qb = new QB("\u0003");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
                    i3++;
                }
                writableMapCreateMap.putDouble(new String(iArr, 0, i3), d2);
                double d3 = lineWidth / displayMetrics.density;
                short sXd3 = (short) (C1607wl.Xd() ^ 26248);
                short sXd4 = (short) (C1607wl.Xd() ^ 26128);
                int[] iArr2 = new int["6\u0003j-.".length()];
                QB qb2 = new QB("6\u0003j-.");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((i4 * sXd4) ^ sXd3));
                    i4++;
                }
                writableMapCreateMap.putDouble(new String(iArr2, 0, i4), d3);
                double dHeight3 = r9.height() / displayMetrics.density;
                short sXd5 = (short) (OY.Xd() ^ 29965);
                short sXd6 = (short) (OY.Xd() ^ 21595);
                int[] iArr3 = new int["Ke\u0006\r\u0019d".length()];
                QB qb3 = new QB("Ke\u0006\r\u0019d");
                int i5 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd6) + sXd5)));
                    i5++;
                }
                writableMapCreateMap.putDouble(new String(iArr3, 0, i5), dHeight3);
                writableMapCreateMap.putDouble(C1626yg.Ud("U]*caxLY~", (short) (ZN.Xd() ^ 22790), (short) (ZN.Xd() ^ 27992)), layout.getLineDescent(i2) / displayMetrics.density);
                writableMapCreateMap.putDouble(Ig.wd("i/\u000bo'o\u000f\"", (short) (Od.Xd() ^ (-19604))), (-layout.getLineAscent(i2)) / displayMetrics.density);
                writableMapCreateMap.putDouble(EO.Od("s@bm\u0018R-\u001e", (short) (OY.Xd() ^ 18416)), layout.getLineBaseline(i2) / displayMetrics.density);
                writableMapCreateMap.putDouble(C1561oA.Qd("\u001a\u0017%{\u0018\u001b\u0018\u0018#", (short) (C1580rY.Xd() ^ (-22008))), dHeight);
                writableMapCreateMap.putDouble(C1593ug.zd("\u007fPnsrt\u0002", (short) (FB.Xd() ^ 11669), (short) (FB.Xd() ^ LeicaMakernoteDirectory.TAG_CONTROLLER_BOARD_VERSION)), dHeight2);
                writableMapCreateMap.putString(C1561oA.od("\u0016\u0006\u0018\u0013", (short) (C1607wl.Xd() ^ 5625)), charSequence.subSequence(layout.getLineStart(i2), layout.getLineEnd(i2)).toString());
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            }
            return writableArrayCreateArray;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
