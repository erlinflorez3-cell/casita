package com.facebook.react.modules.network;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.facebook.common.logging.FLog;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;
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
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
class RequestBodyUtil {
    private static final String CONTENT_ENCODING_GZIP = "gzip";
    private static final String NAME = "RequestBodyUtil";
    private static final String TEMP_FILE_SUFFIX = "temp";

    RequestBodyUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void closeQuietly(Source source) {
        try {
            source.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static RequestBody create(final MediaType mediaType, final InputStream inputStream) {
        return new RequestBody() { // from class: com.facebook.react.modules.network.RequestBodyUtil.1
            @Override // okhttp3.RequestBody
            public long contentLength() {
                try {
                    return inputStream.available();
                } catch (IOException unused) {
                    return 0L;
                }
            }

            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return mediaType;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(BufferedSink bufferedSink) throws IOException {
                Source source = null;
                try {
                    source = Okio.source(inputStream);
                    bufferedSink.writeAll(source);
                } finally {
                    RequestBodyUtil.closeQuietly(source);
                }
            }
        };
    }

    public static RequestBody createGzip(MediaType mediaType, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return RequestBody.create(mediaType, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    public static ProgressRequestBody createProgressRequest(RequestBody requestBody, ProgressListener progressListener) {
        return new ProgressRequestBody(requestBody, progressListener);
    }

    private static InputStream getDownloadFileInputStream(Context context, Uri uri) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("v\u0005{\u000b\t\u0004\u007fJ\u0001\u000e\u000e\u0015\u0007\u0011\u0018Rh\u0016\u0016\u001d\u000f# ", (short) (Od.Xd() ^ (-27566)))).getMethod(Xg.qd("edtBrspnih|ryyO||\u0004u\n\u0007", (short) (C1580rY.Xd() ^ (-19103)), (short) (C1580rY.Xd() ^ (-19474))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Jg.Wd("U3U4e0Wq\\\u0018c\u001ec\u001eoY$ L\"G,W", (short) (FB.Xd() ^ OlympusMakernoteDirectory.TAG_DATA_DUMP_2), (short) (FB.Xd() ^ 25834))).getMethod(ZO.xd("eN\frRS\u001450.n", (short) (C1633zX.Xd() ^ (-16243)), (short) (C1633zX.Xd() ^ (-4347))), new Class[0]);
            try {
                method2.setAccessible(true);
                File file = (File) method2.invoke(context2, objArr2);
                String strUd = C1626yg.Ud("NhM\u0011\u001e\u0007ZSg\u001f5k`c\u001e", (short) (C1633zX.Xd() ^ (-29544)), (short) (C1633zX.Xd() ^ (-9641)));
                short sXd = (short) (C1607wl.Xd() ^ 14218);
                int[] iArr = new int["\u000e8p\u0011".length()];
                QB qb = new QB("\u000e8p\u0011");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                    i2++;
                }
                File fileCreateTempFile = File.createTempFile(strUd, new String(iArr, 0, i2), file);
                fileCreateTempFile.deleteOnExit();
                URL url = new URL(uri.toString());
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    InputStream inputStreamOpenStream = url.openStream();
                    try {
                        ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStreamOpenStream);
                        try {
                            fileOutputStream.getChannel().transferFrom(readableByteChannelNewChannel, 0L, Long.MAX_VALUE);
                            FileInputStream fileInputStream = new FileInputStream(fileCreateTempFile);
                            if (readableByteChannelNewChannel != null) {
                                readableByteChannelNewChannel.close();
                            }
                            if (inputStreamOpenStream != null) {
                                inputStreamOpenStream.close();
                            }
                            fileOutputStream.close();
                            return fileInputStream;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static RequestBody getEmptyBody(String str) {
        if (str.equals(HttpPost.METHOD_NAME) || str.equals("PUT") || str.equals("PATCH")) {
            return RequestBody.create((MediaType) null, ByteString.EMPTY);
        }
        return null;
    }

    public static InputStream getFileInputStream(Context context, String str) {
        Uri uri;
        try {
            uri = Uri.parse(str);
        } catch (Exception e2) {
            FLog.e(hg.Vd("v\t\u0004\u0005\u0015m\u007f\u0012\u0006\u0012\u007f", (short) (Od.Xd() ^ (-4830)), (short) (Od.Xd() ^ (-13080))), Qg.kd("q\u001d\"\u0018\u000fI\u0017\u0017\u001bE\u0017\t\u0017\u0014\n\u0005\u0015\u0003<\u0002\u0004\u0006}7|\u0005\u00073u\u0001~\u0004s{\u0001`|r(", (short) (OY.Xd() ^ 32582), (short) (OY.Xd() ^ 7373)) + str, e2);
            return null;
        }
        if (uri.getScheme().startsWith(EO.Od("@|+F", (short) (Od.Xd() ^ (-29823))))) {
            return getDownloadFileInputStream(context, uri);
        }
        if (str.startsWith(C1561oA.Qd("\u0001|\u000fzR", (short) (C1580rY.Xd() ^ (-5311))))) {
            String str2 = str.split(C1593ug.zd("5", (short) (C1607wl.Xd() ^ 27275), (short) (C1607wl.Xd() ^ 28563)))[1];
            Class<?> cls = Class.forName(C1561oA.od("t\u0001u\u0003~wq:\u0001~rt5Hfwh85", (short) (FB.Xd() ^ 9260)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.Kd(":2H4\u0002A7E?\u0007-ONFLF", (short) (C1633zX.Xd() ^ (-25684))));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {str2, 0};
            Method declaredMethod = cls.getDeclaredMethod(Wg.Zd("1W\u0017G}$", (short) (Od.Xd() ^ (-27417)), (short) (Od.Xd() ^ (-6707))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                return new ByteArrayInputStream((byte[]) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        Class<?> cls2 = Class.forName(C1561oA.Xd("M[Ra_ZV!Wddk]gn)?llseyv", (short) (C1580rY.Xd() ^ (-19382))));
        Class<?>[] clsArr2 = new Class[0];
        Object[] objArr2 = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 18618);
        int[] iArr = new int["/,>\f31:*>C$6?::C\u001d)".length()];
        QB qb = new QB("/,>\f31:*>C$6?::C\u001d)");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls2.getMethod(new String(iArr, 0, i2), clsArr2);
        try {
            method.setAccessible(true);
            return ((ContentResolver) method.invoke(context, objArr2)).openInputStream(uri);
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
        FLog.e(hg.Vd("v\t\u0004\u0005\u0015m\u007f\u0012\u0006\u0012\u007f", (short) (Od.Xd() ^ (-4830)), (short) (Od.Xd() ^ (-13080))), Qg.kd("q\u001d\"\u0018\u000fI\u0017\u0017\u001bE\u0017\t\u0017\u0014\n\u0005\u0015\u0003<\u0002\u0004\u0006}7|\u0005\u00073u\u0001~\u0004s{\u0001`|r(", (short) (OY.Xd() ^ 32582), (short) (OY.Xd() ^ 7373)) + str, e2);
        return null;
    }

    public static boolean isGzipEncoding(String str) {
        return CONTENT_ENCODING_GZIP.equalsIgnoreCase(str);
    }
}
