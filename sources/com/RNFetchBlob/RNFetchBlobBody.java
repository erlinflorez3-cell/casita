package com.RNFetchBlob;

import android.net.Uri;
import com.RNFetchBlob.RNFetchBlobReq;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
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

/* JADX INFO: loaded from: classes4.dex */
class RNFetchBlobBody extends RequestBody {
    private File bodyCache;
    private ReadableArray form;
    private String mTaskId;
    private MediaType mime;
    private String rawBody;
    private InputStream requestStream;
    private RNFetchBlobReq.RequestType requestType;
    private long contentLength = 0;
    int reported = 0;
    private Boolean chunkedEncoding = false;

    /* JADX INFO: renamed from: com.RNFetchBlob.RNFetchBlobBody$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$RNFetchBlob$RNFetchBlobReq$RequestType;

        static {
            int[] iArr = new int[RNFetchBlobReq.RequestType.values().length];
            $SwitchMap$com$RNFetchBlob$RNFetchBlobReq$RequestType = iArr;
            try {
                iArr[RNFetchBlobReq.RequestType.SingleFile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$RNFetchBlob$RNFetchBlobReq$RequestType[RNFetchBlobReq.RequestType.AsIs.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$RNFetchBlob$RNFetchBlobReq$RequestType[RNFetchBlobReq.RequestType.Others.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private class FormField {
        public String data;
        String filename;
        String mime;
        public String name;

        FormField(ReadableMap readableMap) {
            if (readableMap.hasKey("name")) {
                this.name = readableMap.getString("name");
            }
            if (readableMap.hasKey("filename")) {
                this.filename = readableMap.getString("filename");
            }
            if (readableMap.hasKey("type")) {
                this.mime = readableMap.getString("type");
            } else {
                this.mime = this.filename == null ? "text/plain" : "application/octet-stream";
            }
            if (readableMap.hasKey("data")) {
                this.data = readableMap.getString("data");
            }
        }
    }

    RNFetchBlobBody(String str) {
        this.mTaskId = str;
    }

    private ArrayList<FormField> countFormDataLength() throws Throwable {
        int length;
        long length2;
        ArrayList<FormField> arrayList = new ArrayList<>();
        ReactApplicationContext reactApplicationContext = RNFetchBlob.RCTContext;
        long jAvailable = 0;
        for (int i2 = 0; i2 < this.form.size(); i2++) {
            FormField formField = new FormField(this.form.getMap(i2));
            arrayList.add(formField);
            if (formField.data == null) {
                RNFetchBlobUtils.emitWarningEvent(C1593ug.zd("VSLl|lrMx|p/}\u0007~\b}\u0006w\n\r9\r\u0001\u000e\u0013\u0004\u0013\u0015A\u0005\u0019\u000e\u0012\u000b\r\u001bI\u0013\r M\u0015\u001f& \u0017S\u0016U\u001d!\u001e&\u001f[4'3(077c%*(<**j<?=?5CFL\u007ftJ?=x@DAIB~@", (short) (Od.Xd() ^ (-3266)), (short) (Od.Xd() ^ (-11283))) + formField.name + C1561oA.od("d#yjlk\u001e_a\u001bl^eflZX\u0013[^`[WPU_Vb\u0016", (short) (C1499aX.Xd() ^ (-23448))));
            } else {
                if (formField.filename != null) {
                    String str = formField.data;
                    String strKd = C1561oA.Kd("eb[{\f{\u0002\\\b\f\u007fK\u0006\n\u000e\b]ST", (short) (ZN.Xd() ^ 313));
                    if (str.startsWith(strKd)) {
                        String strNormalizePath = RNFetchBlobFS.normalizePath(str.substring(strKd.length()));
                        if (RNFetchBlobFS.isAsset(strNormalizePath)) {
                            try {
                                length = reactApplicationContext.getAssets().open(strNormalizePath.replace(Wg.Zd("@*9\t'rP^\u0007YaJ_x\u0004Y", (short) (OY.Xd() ^ 6632), (short) (OY.Xd() ^ 28831)), "")).available();
                            } catch (IOException e2) {
                                RNFetchBlobUtils.emitWarningEvent(e2.getLocalizedMessage());
                            }
                        } else {
                            length2 = new File(RNFetchBlobFS.normalizePath(strNormalizePath)).length();
                        }
                    } else {
                        String strXd = C1561oA.Xd("]ZSs\u0004syT\u007f\u0004wCz\b\b\u000f\u0001\u000b\u0012XNO", (short) (Od.Xd() ^ (-23300)));
                        if (str.startsWith(strXd)) {
                            String strSubstring = str.substring(strXd.length());
                            InputStream inputStreamOpenInputStream = null;
                            try {
                                try {
                                    inputStreamOpenInputStream = reactApplicationContext.getContentResolver().openInputStream(Uri.parse(strSubstring));
                                    jAvailable += (long) inputStreamOpenInputStream.available();
                                } finally {
                                    if (inputStreamOpenInputStream != null) {
                                        inputStreamOpenInputStream.close();
                                    }
                                }
                            } catch (Exception e3) {
                                RNFetchBlobUtils.emitWarningEvent(Wg.vd("\u0010,1533kA1b%4:01&. W\u001f-1)\\\u0016\u0014$\u0012U#\u0019#Q_P\tTa[Z\u0002FOOZLRYy0*\"\u0018", (short) (C1607wl.Xd() ^ 23551)) + strSubstring + Qg.kd("E8", (short) (C1633zX.Xd() ^ (-13925)), (short) (C1633zX.Xd() ^ (-28882))) + e3.getLocalizedMessage());
                                if (inputStreamOpenInputStream != null) {
                                }
                            }
                        } else {
                            Object[] objArr = {str, 0};
                            Method declaredMethod = Class.forName(hg.Vd("v\u0003w\u0005\u0001ys<\u0003\u0001tv7Jhyj:7", (short) (C1633zX.Xd() ^ (-4002)), (short) (C1633zX.Xd() ^ (-23497)))).getDeclaredMethod(C1561oA.yd("+-,9')", (short) (C1580rY.Xd() ^ (-259))), Class.forName(C1561oA.ud("KAU?\u000bH<H@\u0006*JG=A9", (short) (ZN.Xd() ^ 13950))), Integer.TYPE);
                            try {
                                declaredMethod.setAccessible(true);
                                length = ((byte[]) declaredMethod.invoke(null, objArr)).length;
                            } catch (InvocationTargetException e4) {
                                throw e4.getCause();
                            }
                        }
                    }
                    jAvailable += length2;
                } else {
                    length = formField.data.getBytes().length;
                }
                length2 = length;
                jAvailable += length2;
            }
        }
        this.contentLength = jAvailable;
        return arrayList;
    }

    private File createMultipartBodyCache() throws Throwable {
        String str = C1561oA.Yd("VSLl|lrMx|p<", (short) (OY.Xd() ^ 3617)) + this.mTaskId;
        File cacheDir = RNFetchBlob.RCTContext.getCacheDir();
        short sXd = (short) (Od.Xd() ^ (-21397));
        short sXd2 = (short) (Od.Xd() ^ (-21797));
        int[] iArr = new int["\u0016\u0013\f\tT\u000f\u0019\u001d\u0019Y\"\u001c ".length()];
        QB qb = new QB("\u0016\u0013\f\tT\u000f\u0019\u001d\u0019Y\"\u001c ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        File fileCreateTempFile = File.createTempFile(new String(iArr, 0, i2), "", cacheDir);
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        ArrayList<FormField> arrayListCountFormDataLength = countFormDataLength();
        ReactApplicationContext reactApplicationContext = RNFetchBlob.RCTContext;
        Iterator<FormField> it = arrayListCountFormDataLength.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String strWd = Jg.Wd("/@", (short) (Od.Xd() ^ (-25564)), (short) (Od.Xd() ^ (-24514)));
            if (!zHasNext) {
                fileOutputStream.write((strWd + str + Jg.Wd("\u0006p1f", (short) (C1499aX.Xd() ^ (-21986)), (short) (C1499aX.Xd() ^ (-4572)))).getBytes());
                fileOutputStream.flush();
                fileOutputStream.close();
                return fileCreateTempFile;
            }
            FormField next = it.next();
            String str2 = next.data;
            String str3 = next.name;
            if (str3 != null && str2 != null) {
                StringBuilder sbAppend = new StringBuilder(strWd).append(str);
                String strXd = ZO.xd("\u000e>", (short) (C1580rY.Xd() ^ (-3667)), (short) (C1580rY.Xd() ^ (-31713)));
                String string = sbAppend.append(strXd).toString();
                String str4 = next.filename;
                String strUd = C1626yg.Ud("&m\u0003u", (short) (C1580rY.Xd() ^ (-28454)), (short) (C1580rY.Xd() ^ (-20015)));
                String strWd2 = Ig.wd("^du\u0013\u00059+C(|y\r\u000fn", (short) (C1580rY.Xd() ^ (-14754)));
                String strOd = EO.Od("\u0010S\u001e", (short) (C1580rY.Xd() ^ (-2901)));
                String strQd = C1561oA.Qd("p\u001c\u001a\u001f\u000f\u0017\u001cSi\u000e\u0017\u0013\u0011\u0014\t\u0013\u0007\f\nT9~\u0007\t\u0003Aws\u0006qJ.{mxoF*", (short) (C1607wl.Xd() ^ 10790));
                if (str4 != null) {
                    fileOutputStream.write(((string + strQd + str3 + C1593ug.zd("D^D\f\u0010\u0014\u000e\u0018\f\u0019\u0012jP", (short) (Od.Xd() ^ (-25140)), (short) (Od.Xd() ^ (-11469))) + next.filename + strOd) + strWd2 + next.mime + strUd).getBytes());
                    String strOd2 = C1561oA.od("/*!?M;?\u0018AC5~79;3\u0007zy", (short) (C1580rY.Xd() ^ (-8569)));
                    boolean zStartsWith = str2.startsWith(strOd2);
                    String strKd = C1561oA.Kd("\u0013\b", (short) (FB.Xd() ^ 15423));
                    if (zStartsWith) {
                        String strNormalizePath = RNFetchBlobFS.normalizePath(str2.substring(strOd2.length()));
                        if (RNFetchBlobFS.isAsset(strNormalizePath)) {
                            try {
                                pipeStreamToFileStream(reactApplicationContext.getAssets().open(strNormalizePath.replace(Wg.Zd("3Rv(Z~qa c\tJ|f\u000fC", (short) (C1580rY.Xd() ^ (-13814)), (short) (C1580rY.Xd() ^ (-8961))), "")), fileOutputStream);
                            } catch (IOException e2) {
                                RNFetchBlobUtils.emitWarningEvent(C1561oA.Xd("\u0005!*.((d:6g,<0-A3n6@D@s97K9x;NOBR~\u001a", (short) (C1580rY.Xd() ^ (-26056))) + strNormalizePath + strKd + e2.getLocalizedMessage());
                            }
                        } else {
                            File file = new File(RNFetchBlobFS.normalizePath(strNormalizePath));
                            if (file.exists()) {
                                pipeStreamToFileStream(new FileInputStream(file), fileOutputStream);
                            } else {
                                RNFetchBlobUtils.emitWarningEvent(Wg.vd("Kglpnn'|l\u001e^nfcse5|\u0003\u0007\u0007:{y\u0002o+r\u0004\u0002|0\u0016\b\u0018\rId", (short) (OY.Xd() ^ 19101)) + strNormalizePath + Qg.kd("D7|~\u0001x2\u007f\u007f\u0004.r\u0005t}}{5", (short) (OY.Xd() ^ 12745), (short) (OY.Xd() ^ 30168)));
                            }
                        }
                    } else {
                        String strVd = hg.Vd("\"\u001d\u00142@.2\u000b46(q'205%-2vji", (short) (C1633zX.Xd() ^ (-11676)), (short) (C1633zX.Xd() ^ (-4001)));
                        if (str2.startsWith(strVd)) {
                            String strSubstring = str2.substring(strVd.length());
                            InputStream inputStreamOpenInputStream = null;
                            try {
                                try {
                                    inputStreamOpenInputStream = reactApplicationContext.getContentResolver().openInputStream(Uri.parse(strSubstring));
                                    pipeStreamToFileStream(inputStreamOpenInputStream, fileOutputStream);
                                } catch (Exception e3) {
                                    RNFetchBlobUtils.emitWarningEvent(C1561oA.ud("1KRTLJ\u0005XR\u0002DRD?QAz@HJDu95G3p6A=:k.97<,49c\u0018\u0014\ny", (short) (ZN.Xd() ^ 25259)) + strSubstring + strKd + e3.getLocalizedMessage());
                                    if (inputStreamOpenInputStream != null) {
                                    }
                                }
                            } finally {
                                if (inputStreamOpenInputStream != null) {
                                    inputStreamOpenInputStream.close();
                                }
                            }
                        } else {
                            Object[] objArr = {str2, 0};
                            Method declaredMethod = Class.forName(C1561oA.yd("[i\\ke`X#wwim,A]poA<", (short) (C1633zX.Xd() ^ (-15731)))).getDeclaredMethod(Xg.qd("npo|rt", (short) (C1633zX.Xd() ^ (-3709)), (short) (C1633zX.Xd() ^ (-2690))), Class.forName(C1561oA.Yd(",$:&s3)71x\u001fA@8>8", (short) (FB.Xd() ^ 25492))), Integer.TYPE);
                            try {
                                declaredMethod.setAccessible(true);
                                fileOutputStream.write((byte[]) declaredMethod.invoke(null, objArr));
                            } catch (InvocationTargetException e4) {
                                throw e4.getCause();
                            }
                        }
                    }
                } else {
                    fileOutputStream.write(((string + strQd + str3 + strOd) + strWd2 + next.mime + strUd).getBytes());
                    fileOutputStream.write(next.data.getBytes());
                }
                fileOutputStream.write(strXd.getBytes());
            }
        }
    }

    private void emitUploadProgress(long j2) {
        RNFetchBlobProgressConfig reportUploadProgress = RNFetchBlobReq.getReportUploadProgress(this.mTaskId);
        if (reportUploadProgress != null) {
            long j3 = this.contentLength;
            if (j3 == 0 || !reportUploadProgress.shouldReport(j2 / j3)) {
                return;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("taskId", this.mTaskId);
            writableMapCreateMap.putString("written", String.valueOf(j2));
            writableMapCreateMap.putString("total", String.valueOf(this.contentLength));
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(RNFetchBlobConst.EVENT_UPLOAD_PROGRESS, writableMapCreateMap);
        }
    }

    private InputStream getRequestStream() throws Exception {
        String str = this.rawBody;
        String strXd = ZO.xd("\u0005\u007f]kpu\u000bp;u(?hZs0\u000f7\u001b", (short) (Od.Xd() ^ (-8886)), (short) (Od.Xd() ^ (-21370)));
        boolean zStartsWith = str.startsWith(strXd);
        String strUd = C1626yg.Ud("H\u0017\u0019 \u0002jB/f\u0002~y5qKp{\u0011@g)M\u001c<U#\u0002\u0011\u0017E\u0003QpV\u000b", (short) (OY.Xd() ^ 31501), (short) (OY.Xd() ^ 1945));
        if (zStartsWith) {
            String strNormalizePath = RNFetchBlobFS.normalizePath(this.rawBody.substring(strXd.length()));
            if (!RNFetchBlobFS.isAsset(strNormalizePath)) {
                File file = new File(RNFetchBlobFS.normalizePath(strNormalizePath));
                try {
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    return new FileInputStream(file);
                } catch (Exception e2) {
                    throw new Exception(strUd + e2.getLocalizedMessage());
                }
            }
            short sXd = (short) (C1633zX.Xd() ^ (-24147));
            int[] iArr = new int[">\u001boKI}_I\tzT;\f^U-".length()];
            QB qb = new QB(">\u001boKI}_I\tzT;\f^U-");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            try {
                return RNFetchBlob.RCTContext.getAssets().open(strNormalizePath.replace(new String(iArr, 0, i2), ""));
            } catch (Exception e3) {
                throw new Exception(EO.Od("\u0005br\n\u000fh&\u0002\\Ep\u001egtpG\u001a\r\r\u001bM-\u001f\u000bxYbkf2\rlXd$aF,[3Mt2+LV\u0011", (short) (C1499aX.Xd() ^ (-7728))) + e3.getLocalizedMessage());
            }
        }
        String str2 = this.rawBody;
        String strQd = C1561oA.Qd("-(\u001f=K9=\u0016?A3|2=;@08=\u0002ut", (short) (C1633zX.Xd() ^ (-24026)));
        if (str2.startsWith(strQd)) {
            String strSubstring = this.rawBody.substring(strQd.length());
            try {
                return RNFetchBlob.RCTContext.getContentResolver().openInputStream(Uri.parse(strSubstring));
            } catch (Exception e4) {
                throw new Exception(C1593ug.zd("`nomq xjhr%ml|}sys-\u0001t\u0002\u0007w\u0007\t5\n\f\u000b~{\t<\u0004\u000e\u0012@\u0005\u0012\u0012\u0019\u000b\u0015\u001cH~|tfM", (short) (ZN.Xd() ^ 23168), (short) (ZN.Xd() ^ 2336)) + strSubstring, e4);
            }
        }
        try {
            String str3 = this.rawBody;
            short sXd2 = (short) (Od.Xd() ^ (-24170));
            int[] iArr2 = new int["\u0003\u000f\u0004\u0011\r\u0006\u007fH\u000f\r\u0001\u0003CVt\u0006vFC".length()];
            QB qb2 = new QB("\u0003\u000f\u0004\u0011\r\u0006\u007fH\u000f\r\u0001\u0003CVt\u0006vFC");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr2, 0, i3));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.Kd("IAWC\u0011PFTN\u0016<^]U[U", (short) (C1580rY.Xd() ^ (-10928))));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {str3, 0};
            Method declaredMethod = cls.getDeclaredMethod(Wg.Zd("U_\bz\u001c\u0004", (short) (C1499aX.Xd() ^ (-4238)), (short) (C1499aX.Xd() ^ (-12489))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                return new ByteArrayInputStream((byte[]) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (Exception e6) {
            throw new Exception(strUd + e6.getLocalizedMessage());
        }
    }

    private void pipeStreamToFileStream(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[10240];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 <= 0) {
                inputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, i2);
        }
    }

    private void pipeStreamToSink(InputStream inputStream, BufferedSink bufferedSink) throws IOException {
        byte[] bArr = new byte[10240];
        long j2 = 0;
        while (true) {
            int i2 = inputStream.read(bArr, 0, 10240);
            if (i2 <= 0) {
                inputStream.close();
                return;
            } else {
                bufferedSink.write(bArr, 0, i2);
                j2 += (long) i2;
                emitUploadProgress(j2);
            }
        }
    }

    RNFetchBlobBody chunkedEncoding(boolean z2) {
        this.chunkedEncoding = Boolean.valueOf(z2);
        return this;
    }

    boolean clearRequestBody() {
        try {
            File file = this.bodyCache;
            if (file == null || !file.exists()) {
                return true;
            }
            this.bodyCache.delete();
            return true;
        } catch (Exception e2) {
            RNFetchBlobUtils.emitWarningEvent(e2.getLocalizedMessage());
            return false;
        }
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        if (this.chunkedEncoding.booleanValue()) {
            return -1L;
        }
        return this.contentLength;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.mime;
    }

    RNFetchBlobBody setBody(ReadableArray readableArray) {
        this.form = readableArray;
        try {
            this.bodyCache = createMultipartBodyCache();
            this.requestStream = new FileInputStream(this.bodyCache);
            this.contentLength = this.bodyCache.length();
        } catch (Exception e2) {
            e2.printStackTrace();
            RNFetchBlobUtils.emitWarningEvent("RNFetchBlob failed to create request multipart body :" + e2.getLocalizedMessage());
        }
        return this;
    }

    RNFetchBlobBody setBody(String str) {
        this.rawBody = str;
        if (str == null) {
            this.rawBody = "";
            this.requestType = RNFetchBlobReq.RequestType.AsIs;
        }
        try {
            int i2 = AnonymousClass1.$SwitchMap$com$RNFetchBlob$RNFetchBlobReq$RequestType[this.requestType.ordinal()];
            if (i2 == 1) {
                this.requestStream = getRequestStream();
                this.contentLength = r0.available();
            } else if (i2 == 2) {
                this.contentLength = this.rawBody.getBytes().length;
                this.requestStream = new ByteArrayInputStream(this.rawBody.getBytes());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            RNFetchBlobUtils.emitWarningEvent("RNFetchBlob failed to create single content request body :" + e2.getLocalizedMessage() + "\r\n");
        }
        return this;
    }

    RNFetchBlobBody setMIME(MediaType mediaType) {
        this.mime = mediaType;
        return this;
    }

    RNFetchBlobBody setRequestType(RNFetchBlobReq.RequestType requestType) {
        this.requestType = requestType;
        return this;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) {
        try {
            pipeStreamToSink(this.requestStream, bufferedSink);
        } catch (Exception e2) {
            RNFetchBlobUtils.emitWarningEvent(e2.getLocalizedMessage());
            e2.printStackTrace();
        }
    }
}
