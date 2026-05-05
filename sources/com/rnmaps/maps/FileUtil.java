package com.rnmaps.maps;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import com.facebook.common.logging.FLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class FileUtil extends AsyncTask<String, Void, InputStream> {
    private Context context;

    public FileUtil(Context context) {
        this.context = context;
    }

    private InputStream getDownloadFileInputStream(Context context, Uri uri) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("\u001e,#20+'q(55<.8?y\u0010==D6JG", (short) (C1580rY.Xd() ^ (-19396)))).getMethod(Wg.Zd("]t:(ZM&*\u001bqLwZ\u001d$qw0:XI", (short) (C1607wl.Xd() ^ 26183), (short) (C1607wl.Xd() ^ 13961)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            short sXd = (short) (Od.Xd() ^ (-23014));
            int[] iArr = new int["\u0016$\u001b*(#\u001fi --4&07q\b55<.B?".length()];
            QB qb = new QB("\u0016$\u001b*(#\u001fi --4&07q\b55<.B?");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.vd("32>\u000e1464\u0018>D", (short) (FB.Xd() ^ 7678)), new Class[0]);
            try {
                method2.setAccessible(true);
                File file = (File) method2.invoke(context2, objArr2);
                short sXd2 = (short) (Od.Xd() ^ (-10875));
                short sXd3 = (short) (Od.Xd() ^ (-78));
                int[] iArr2 = new int["2TVN=[OQ".length()];
                QB qb2 = new QB("2TVN=[OQ");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                    i3++;
                }
                File fileCreateTempFile = File.createTempFile(new String(iArr2, 0, i3), hg.Vd("\f{\u0003\u0005", (short) (ZN.Xd() ^ 9707), (short) (ZN.Xd() ^ 25386)), file);
                fileCreateTempFile.deleteOnExit();
                InputStream inputStreamOpenStream = new URL(uri.toString()).openStream();
                try {
                    ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStreamOpenStream);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        try {
                            fileOutputStream.getChannel().transferFrom(readableByteChannelNewChannel, 0L, Long.MAX_VALUE);
                            return new FileInputStream(fileCreateTempFile);
                        } finally {
                            fileOutputStream.close();
                        }
                    } finally {
                        readableByteChannelNewChannel.close();
                    }
                } finally {
                    inputStreamOpenStream.close();
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public InputStream doInBackground(String... strArr) throws Throwable {
        try {
            Uri uri = Uri.parse(strArr[0]);
            if (uri.getScheme().startsWith(C1561oA.ud("|\b\u0007\u0002", (short) (OY.Xd() ^ 22561)))) {
                return getDownloadFileInputStream(this.context, uri);
            }
            Context context = this.context;
            short sXd = (short) (ZN.Xd() ^ 26695);
            int[] iArr = new int["GSHUQJD\rQ\\Z_OW\\\u0015\u0019DBG7ID".length()];
            QB qb = new QB("GSHUQJD\rQ\\Z_OW\\\u0015\u0019DBG7ID");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = new Object[0];
            Method method = cls.getMethod(C1561oA.Yd("{z\u000bZ\b\b\u000f\u0001\u000b\u0012p\u0005\u0014\u0011\u000f\u001a\n\u0018", (short) (Od.Xd() ^ (-19786))), new Class[0]);
            try {
                method.setAccessible(true);
                return ((ContentResolver) method.invoke(context, objArr)).openInputStream(uri);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            FLog.e(Jg.Wd("\\9B\u0011/VvV)C\u007f", (short) (C1607wl.Xd() ^ 31714), (short) (C1607wl.Xd() ^ 27347)), Xg.qd("\u0001.5-&b24:f:.>=52D4o7;?9t<FJx=JJQCMT6TL\u0004", (short) (OY.Xd() ^ 25753), (short) (OY.Xd() ^ 1798)) + strArr[0], e3);
            return null;
        }
    }
}
