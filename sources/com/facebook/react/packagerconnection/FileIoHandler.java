package com.facebook.react.packagerconnection;

import android.os.Handler;
import android.os.Looper;
import com.drew.metadata.exif.makernotes.CasioType2MakernoteDirectory;
import com.drew.metadata.exif.makernotes.NikonType2MakernoteDirectory;
import com.facebook.common.logging.FLog;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
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
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class FileIoHandler implements Runnable {
    private static final long FILE_TTL = 30000;
    private static final String TAG = "JSPackagerClient";
    private final Handler mHandler;
    private int mNextHandle = 1;
    private final Map<Integer, TtlFileInputStream> mOpenFiles;
    private final Map<String, RequestHandler> mRequestHandlers;

    private static class TtlFileInputStream {
        private final FileInputStream mStream;
        private long mTtl = System.currentTimeMillis() + 30000;

        public TtlFileInputStream(String str) throws FileNotFoundException {
            this.mStream = new FileInputStream(str);
        }

        private void extendTtl() {
            this.mTtl = System.currentTimeMillis() + 30000;
        }

        public void close() throws IOException {
            this.mStream.close();
        }

        public boolean expiredTtl() {
            return System.currentTimeMillis() >= this.mTtl;
        }

        public String read(int i2) throws Throwable {
            extendTtl();
            byte[] bArr = new byte[i2];
            int i3 = this.mStream.read(bArr);
            Class<?> cls = Class.forName(Wg.Zd("386<\u0019\u000b\u000e\u00107.+&G\u0014;E\u0018`f", (short) (ZN.Xd() ^ 23442), (short) (ZN.Xd() ^ 31989)));
            Class<?>[] clsArr = {byte[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE};
            Object[] objArr = {bArr, 0, Integer.valueOf(i3), 0};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.Xd("pzp}sue\u0002f\t\b\u007f\u0006\u007f", (short) (ZN.Xd() ^ 2770)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                return (String) declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public FileIoHandler() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Wg.vd("MYN[_XR\u001bcf =gffZN", (short) (C1607wl.Xd() ^ CasioType2MakernoteDirectory.TAG_ENHANCEMENT))).getDeclaredMethod(Qg.kd("\n\u0007\u0015l\u007f\u0007\u000bg\n\t\t|\t", (short) (OY.Xd() ^ 26428), (short) (OY.Xd() ^ NikonType2MakernoteDirectory.TAG_NEF_BIT_DEPTH)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.mHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.mOpenFiles = new HashMap();
            HashMap map = new HashMap();
            this.mRequestHandlers = map;
            map.put(hg.Vd("\u0010\u0018\u0018\f\u0014", (short) (Od.Xd() ^ (-22366)), (short) (Od.Xd() ^ (-23084))), new RequestOnlyHandler() { // from class: com.facebook.react.packagerconnection.FileIoHandler.1
                @Override // com.facebook.react.packagerconnection.RequestOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                public void onRequest(Object obj, Responder responder) {
                    JSONObject jSONObject;
                    synchronized (FileIoHandler.this.mOpenFiles) {
                        try {
                            jSONObject = (JSONObject) obj;
                        } catch (Exception e2) {
                            responder.error(e2.toString());
                        }
                        if (jSONObject == null) {
                            throw new Exception("params must be an object { mode: string, filename: string }");
                        }
                        String strOptString = jSONObject.optString("mode");
                        if (strOptString == null) {
                            throw new Exception("missing params.mode");
                        }
                        String strOptString2 = jSONObject.optString("filename");
                        if (strOptString2 == null) {
                            throw new Exception("missing params.filename");
                        }
                        if (!strOptString.equals("r")) {
                            throw new IllegalArgumentException("unsupported mode: " + strOptString);
                        }
                        responder.respond(Integer.valueOf(FileIoHandler.this.addOpenFile(strOptString2)));
                    }
                }
            });
            map.put(C1561oA.ud("YU]_bS", (short) (C1499aX.Xd() ^ (-849))), new RequestOnlyHandler() { // from class: com.facebook.react.packagerconnection.FileIoHandler.2
                @Override // com.facebook.react.packagerconnection.RequestOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                public void onRequest(Object obj, Responder responder) {
                    synchronized (FileIoHandler.this.mOpenFiles) {
                        try {
                        } catch (Exception e2) {
                            responder.error(e2.toString());
                        }
                        if (!(obj instanceof Number)) {
                            throw new Exception("params must be a file handle");
                        }
                        TtlFileInputStream ttlFileInputStream = (TtlFileInputStream) FileIoHandler.this.mOpenFiles.get(obj);
                        if (ttlFileInputStream == null) {
                            throw new Exception("invalid file handle, it might have timed out");
                        }
                        FileIoHandler.this.mOpenFiles.remove(obj);
                        ttlFileInputStream.close();
                        responder.respond("");
                    }
                }
            });
            map.put(C1561oA.yd("\n\u0017\u000b\b\u0004", (short) (C1607wl.Xd() ^ 23774)), new RequestOnlyHandler() { // from class: com.facebook.react.packagerconnection.FileIoHandler.3
                @Override // com.facebook.react.packagerconnection.RequestOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                public void onRequest(Object obj, Responder responder) {
                    JSONObject jSONObject;
                    synchronized (FileIoHandler.this.mOpenFiles) {
                        try {
                            jSONObject = (JSONObject) obj;
                        } catch (Exception e2) {
                            responder.error(e2.toString());
                        }
                        if (jSONObject == null) {
                            throw new Exception("params must be an object { file: handle, size: number }");
                        }
                        int iOptInt = jSONObject.optInt("file");
                        if (iOptInt == 0) {
                            throw new Exception("invalid or missing file handle");
                        }
                        int iOptInt2 = jSONObject.optInt(RRWebVideoEvent.JsonKeys.SIZE);
                        if (iOptInt2 == 0) {
                            throw new Exception("invalid or missing read size");
                        }
                        TtlFileInputStream ttlFileInputStream = (TtlFileInputStream) FileIoHandler.this.mOpenFiles.get(Integer.valueOf(iOptInt));
                        if (ttlFileInputStream == null) {
                            throw new Exception("invalid file handle, it might have timed out");
                        }
                        responder.respond(ttlFileInputStream.read(iOptInt2));
                    }
                }
            });
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int addOpenFile(String str) throws Throwable {
        int i2 = this.mNextHandle;
        this.mNextHandle = i2 + 1;
        this.mOpenFiles.put(Integer.valueOf(i2), new TtlFileInputStream(str));
        if (this.mOpenFiles.size() == 1) {
            Handler handler = this.mHandler;
            Class<?> cls = Class.forName(C1561oA.Yd("\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\u001c!\\w\u0012 \u0017 \u001a(", (short) (FB.Xd() ^ 2446)));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (ZN.Xd() ^ 11498);
            short sXd2 = (short) (ZN.Xd() ^ 23410);
            int[] iArr = new int["ZRhT\"aWe_'Lpjk_alf".length()];
            QB qb = new QB("ZRhT\"aWe_'Lpjk_alf");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i3));
            clsArr[1] = Long.TYPE;
            Object[] objArr = {this, 30000L};
            Method method = cls.getMethod(Jg.Wd("hkcJ\u000e1,\u0007\u0013\t{", (short) (C1607wl.Xd() ^ 4783), (short) (C1607wl.Xd() ^ 3046)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return i2;
    }

    public Map<String, RequestHandler> handlers() {
        return this.mRequestHandlers;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.mOpenFiles) {
            Iterator<TtlFileInputStream> it = this.mOpenFiles.values().iterator();
            while (it.hasNext()) {
                TtlFileInputStream next = it.next();
                if (next.expiredTtl()) {
                    it.remove();
                    try {
                        next.close();
                    } catch (IOException e2) {
                        FLog.e(TAG, ZO.xd("=i\u001a%\bGyi QBg21cz<tl\u001ctC\bq\u0012m;\tQ", (short) (ZN.Xd() ^ 19974), (short) (ZN.Xd() ^ 10937)) + e2.toString());
                    }
                }
            }
            if (!this.mOpenFiles.isEmpty()) {
                Handler handler = this.mHandler;
                Object[] objArr = {this, 30000L};
                Method method = Class.forName(C1626yg.Ud("\u0012t?5Y\u0013j\u000bf\u0013\u0016nA3\"3\u0003W", (short) (C1607wl.Xd() ^ 25439), (short) (C1607wl.Xd() ^ 31356))).getMethod(EO.Od("\u0003Y\u001f\u0001x>i\u0007Q2\u0007", (short) (OY.Xd() ^ 3331)), Class.forName(Ig.wd("^\u000e\u0015W{}\u001f+u\b23\u0002sZ9'(", (short) (C1633zX.Xd() ^ (-26053)))), Long.TYPE);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        }
    }
}
