package com.imagepicker;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
public class ImageMetadata extends Metadata {
    public ImageMetadata(Uri uri, Context context) throws Throwable {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("\u000f\u001b\u0010\u001d\u0019\u0012\fT\t\u0014\u0012\u0017\u0007\u000f\u0014L`\f\n\u000f~\u0011\f", (short) (OY.Xd() ^ 4083))).getMethod(C1561oA.Kd("SRb2__fXbiH\\khfqao", (short) (C1580rY.Xd() ^ (-19678))), new Class[0]);
            try {
                method.setAccessible(true);
                InputStream inputStreamOpenInputStream = ((ContentResolver) method.invoke(context, objArr)).openInputStream(uri);
                try {
                    String attribute = new ExifInterface(inputStreamOpenInputStream).getAttribute(Wg.Zd("CD\u0012\u000b4P\u0010\u000b", (short) (C1580rY.Xd() ^ (-29488)), (short) (C1580rY.Xd() ^ (-20602))));
                    if (attribute != null) {
                        this.datetime = getDateTimeInUTC(attribute, C1561oA.Xd("\u0012\u0013\u0014\u0015VjkY\u0005\u0006Bkl_\u0014\u0015b\u001d\u001e", (short) (C1580rY.Xd() ^ (-7707))));
                    }
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                } finally {
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            short sXd = (short) (C1499aX.Xd() ^ (-8264));
            int[] iArr = new int["_\u000b\u0010\u0006\u0005?\r\r\t3~\u0001y{6~\u001a\r\u0012\u000fP\u001d\u0014\"\u0006\b\u0004\u0016\naF".length()];
            QB qb = new QB("_\u000b\u0010\u0006\u0005?\r\r\t3~\u0001y{6~\u001a\r\u0012\u000fP\u001d\u0014\"\u0006\b\u0004\u0016\naF");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2) + e3.getMessage();
            Qg.kd("72,2", (short) (C1580rY.Xd() ^ (-29092)), (short) (C1580rY.Xd() ^ (-7749)));
        }
    }

    @Override // com.imagepicker.Metadata
    public String getDateTime() {
        return this.datetime;
    }

    @Override // com.imagepicker.Metadata
    public int getHeight() {
        return 0;
    }

    @Override // com.imagepicker.Metadata
    public int getWidth() {
        return 0;
    }
}
