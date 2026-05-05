package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.dynatrace.android.agent.Global;
import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.Jg;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public class DataFetchProducer extends LocalFetchProducer {
    public static final String PRODUCER_NAME = "DataFetchProducer";

    public DataFetchProducer(PooledByteBufferFactory pooledByteBufferFactory) {
        super(CallerThreadExecutor.getInstance(), pooledByteBufferFactory);
    }

    static byte[] getData(String str) throws Throwable {
        String strSubstring = str.substring(0, 5);
        short sXd = (short) (C1499aX.Xd() ^ (-13543));
        int[] iArr = new int["\u0003~\u0015\u0001T".length()];
        QB qb = new QB("\u0003~\u0015\u0001T");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Preconditions.checkArgument(Boolean.valueOf(strSubstring.equals(new String(iArr, 0, i2))));
        int iIndexOf = str.indexOf(44);
        String strSubstring2 = str.substring(iIndexOf + 1, str.length());
        if (!isBase64(str.substring(0, iIndexOf))) {
            String strDecode = Uri.decode(strSubstring2);
            Preconditions.checkNotNull(strDecode);
            return strDecode.getBytes();
        }
        Class<?> cls = Class.forName(C1561oA.Yd("ESJYWRN\u0019aaW[\u001e3SfY+*", (short) (C1499aX.Xd() ^ (-20897))));
        Class<?>[] clsArr = new Class[2];
        short sXd2 = (short) (C1633zX.Xd() ^ (-20627));
        short sXd3 = (short) (C1633zX.Xd() ^ (-31242));
        int[] iArr2 = new int["\u0001x\u000fzH\b}\f\u0006Ms\u0016\u0015\r\u0013\r".length()];
        QB qb2 = new QB("\u0001x\u000fzH\b}\f\u0006Ms\u0016\u0015\r\u0013\r");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {strSubstring2, 0};
        Method declaredMethod = cls.getDeclaredMethod(Jg.Wd("t3\u000fX+\n", (short) (C1499aX.Xd() ^ (-26525)), (short) (C1499aX.Xd() ^ (-1050))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return (byte[]) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static boolean isBase64(String str) {
        if (!str.contains(Global.SEMICOLON)) {
            return false;
        }
        return str.split(Global.SEMICOLON)[r1.length - 1].equals("base64");
    }

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    protected EncodedImage getEncodedImage(ImageRequest imageRequest) throws Throwable {
        byte[] data = getData(imageRequest.getSourceUri().toString());
        return getByteBufferBackedEncodedImage(new ByteArrayInputStream(data), data.length);
    }

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    protected String getProducerName() {
        return PRODUCER_NAME;
    }
}
