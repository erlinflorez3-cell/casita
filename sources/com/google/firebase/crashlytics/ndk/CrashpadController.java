package com.google.firebase.crashlytics.ndk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.ndk.SessionFiles;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
public class CrashpadController {
    private static final String APP_METADATA_FILE = "app.json";
    private static final String DEVICE_METADATA_FILE = "device.json";
    private static final String OS_METADATA_FILE = "os.json";
    private static final String SESSION_METADATA_FILE = "session.json";
    private static final String SESSION_START_TIMESTAMP_FILE_NAME = "start-time";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final Context context;
    private final FileStore fileStore;
    private final NativeApi nativeApi;

    CrashpadController(Context context, NativeApi nativeApi, FileStore fileStore) {
        this.context = context;
        this.nativeApi = nativeApi;
        this.fileStore = fileStore;
    }

    private static CrashlyticsReport.ApplicationExitInfo convertApplicationExitInfoToModel(ApplicationExitInfo applicationExitInfo) {
        return CrashlyticsReport.ApplicationExitInfo.builder().setImportance(applicationExitInfo.getImportance()).setProcessName(applicationExitInfo.getProcessName()).setReasonCode(applicationExitInfo.getReason()).setTimestamp(applicationExitInfo.getTimestamp()).setPid(applicationExitInfo.getPid()).setPss(applicationExitInfo.getPss()).setRss(applicationExitInfo.getRss()).setTraceFile(getTraceFileFromApplicationExitInfo(applicationExitInfo)).build();
    }

    public static String convertInputStreamToString(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return zipAndEncode(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    private CrashlyticsReport.ApplicationExitInfo getApplicationExitInfo(String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return getNativeCrashApplicationExitInfo(str);
        }
        return null;
    }

    private SessionFiles.NativeCore getNativeCore(String str, File file) {
        return new SessionFiles.NativeCore(getSingleFileWithExtension(file, ".dmp"), getApplicationExitInfo(str));
    }

    private CrashlyticsReport.ApplicationExitInfo getNativeCrashApplicationExitInfo(String str) throws Throwable {
        Context context = this.context;
        short sXd = (short) (C1607wl.Xd() ^ 29687);
        short sXd2 = (short) (C1607wl.Xd() ^ 12326);
        int[] iArr = new int["\f\u000f!\u0017%\u0019%+".length()];
        QB qb = new QB("\f\u000f!\u0017%\u0019%+");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        short sXd3 = (short) (C1580rY.Xd() ^ (-6584));
        short sXd4 = (short) (C1580rY.Xd() ^ (-11661));
        int[] iArr2 = new int["&\u0013pV,\u0006XJ&\u001axW`\u0001'\u0007\u0004Xo\u0016\u001eI,".length()];
        QB qb2 = new QB("&\u0013pV,\u0006XJ&\u001axW`\u0001'\u0007\u0004Xo\u0016\u001eI,");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i3));
        Class<?>[] clsArr = new Class[1];
        short sXd5 = (short) (C1607wl.Xd() ^ 22750);
        short sXd6 = (short) (C1607wl.Xd() ^ 1458);
        int[] iArr3 = new int["\u0006b\u0016@\tc\u0003\u0014\u001cK\u00019\\<\u001dV".length()];
        QB qb3 = new QB("\u0006b\u0016@\tc\u0003\u0014\u001cK\u00019\\<\u001dV");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd6) + sXd5)));
            i4++;
        }
        clsArr[0] = Class.forName(new String(iArr3, 0, i4));
        Object[] objArr = {str2};
        Method method = cls.getMethod(C1626yg.Ud("kI@v_w^,%\u0002JnY5J~", (short) (OY.Xd() ^ 12517), (short) (OY.Xd() ^ 2080)), clsArr);
        try {
            method.setAccessible(true);
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) method.invoke(context, objArr)).getHistoricalProcessExitReasons(null, 0, 0);
            File sessionFile = this.fileStore.getSessionFile(str, Ig.wd("K\teUTgIL\u001d\u000b", (short) (C1499aX.Xd() ^ (-30501))));
            return getRelevantApplicationExitInfo(sessionFile == null ? System.currentTimeMillis() : sessionFile.lastModified(), historicalProcessExitReasons);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private CrashlyticsReport.ApplicationExitInfo getRelevantApplicationExitInfo(long j2, List<ApplicationExitInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getReason() == 5 && applicationExitInfo.getTimestamp() >= j2) {
                arrayList.add(applicationExitInfo);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return convertApplicationExitInfoToModel((ApplicationExitInfo) arrayList.get(0));
    }

    private static File getSingleFileWithExtension(File file, String str) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    private static String getTraceFileFromApplicationExitInfo(ApplicationExitInfo applicationExitInfo) {
        try {
            return convertInputStreamToString(applicationExitInfo.getTraceInputStream());
        } catch (IOException unused) {
            Logger.getLogger().w("Failed to get input stream from ApplicationExitInfo");
            return null;
        }
    }

    private static void writeSessionJsonFile(FileStore fileStore, String str, String str2, String str3) throws Throwable {
        writeTextFile(new File(fileStore.getNativeSessionDir(str), str3), str2);
    }

    private static void writeTextFile(File file, String str) throws Throwable {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), UTF_8));
            try {
                bufferedWriter2.write(str);
                CommonUtils.closeOrLog(bufferedWriter2, "Failed to close " + file);
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                CommonUtils.closeOrLog(bufferedWriter, "Failed to close " + file);
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                CommonUtils.closeOrLog(bufferedWriter, "Failed to close " + file);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String zipAndEncode(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                String strEncodeToString = Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return strEncodeToString;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public SessionFiles getFilesForSession(String str) {
        File nativeSessionDir = this.fileStore.getNativeSessionDir(str);
        File file = new File(nativeSessionDir, "pending");
        Logger.getLogger().v("Minidump directory: " + file.getAbsolutePath());
        File singleFileWithExtension = getSingleFileWithExtension(file, ".dmp");
        Logger.getLogger().v("Minidump file ".concat((singleFileWithExtension == null || !singleFileWithExtension.exists()) ? "does not exist" : "exists"));
        SessionFiles.Builder builder = new SessionFiles.Builder();
        if (nativeSessionDir != null && nativeSessionDir.exists() && file.exists()) {
            builder.nativeCore(getNativeCore(str, file)).metadataFile(getSingleFileWithExtension(nativeSessionDir, ".device_info")).sessionFile(new File(nativeSessionDir, SESSION_METADATA_FILE)).appFile(new File(nativeSessionDir, APP_METADATA_FILE)).deviceFile(new File(nativeSessionDir, DEVICE_METADATA_FILE)).osFile(new File(nativeSessionDir, OS_METADATA_FILE));
        }
        return builder.build();
    }

    public boolean hasCrashDataForSession(String str) {
        SessionFiles filesForSession = getFilesForSession(str);
        return filesForSession.nativeCore != null && filesForSession.nativeCore.hasCore();
    }

    public boolean initialize(String str, String str2, long j2, StaticSessionData staticSessionData) throws Throwable {
        File nativeSessionDir = this.fileStore.getNativeSessionDir(str);
        if (nativeSessionDir == null) {
            return false;
        }
        try {
            String canonicalPath = nativeSessionDir.getCanonicalPath();
            NativeApi nativeApi = this.nativeApi;
            Context context = this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("\"^v(u5\u00181:EZ\u000b+&<\u001bU\b.\u00015o\u0016", (short) (C1607wl.Xd() ^ 5513))).getMethod(C1561oA.Qd("\u0016\u0013!l\u001e\u001d\u000e\u001c\u001a", (short) (C1633zX.Xd() ^ (-7198))), new Class[0]);
            try {
                method.setAccessible(true);
                if (!nativeApi.initialize(canonicalPath, (AssetManager) method.invoke(context, objArr))) {
                    return false;
                }
                writeBeginSession(str, str2, j2);
                writeSessionApp(str, staticSessionData.appData());
                writeSessionOs(str, staticSessionData.osData());
                writeSessionDevice(str, staticSessionData.deviceData());
                return true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException e3) {
            Logger logger = Logger.getLogger();
            short sXd = (short) (FB.Xd() ^ 30014);
            short sXd2 = (short) (FB.Xd() ^ 2607);
            int[] iArr = new int["n\u001d\u001e\u001c N\u0019\u001f\u001b'\u001d\u0016\" 2\"(\"[\u007f0 3).<8.):g\u0017\u000e\u0016".length()];
            QB qb = new QB("n\u001d\u001e\u001c N\u0019\u001f\u001b'\u001d\u0016\" 2\"(\"[\u007f0 3).<8.):g\u0017\u000e\u0016");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            logger.e(new String(iArr, 0, i2), e3);
            return false;
        }
    }

    public void writeBeginSession(String str, String str2, long j2) throws Throwable {
        writeSessionJsonFile(this.fileStore, str, SessionMetadataJsonSerializer.serializeBeginSession(str, str2, j2), SESSION_METADATA_FILE);
    }

    public void writeSessionApp(String str, StaticSessionData.AppData appData) throws Throwable {
        writeSessionJsonFile(this.fileStore, str, SessionMetadataJsonSerializer.serializeSessionApp(appData.appIdentifier(), appData.versionCode(), appData.versionName(), appData.installUuid(), appData.deliveryMechanism(), appData.developmentPlatformProvider().getDevelopmentPlatform(), appData.developmentPlatformProvider().getDevelopmentPlatformVersion()), APP_METADATA_FILE);
    }

    public void writeSessionDevice(String str, StaticSessionData.DeviceData deviceData) throws Throwable {
        writeSessionJsonFile(this.fileStore, str, SessionMetadataJsonSerializer.serializeSessionDevice(deviceData.arch(), deviceData.model(), deviceData.availableProcessors(), deviceData.totalRam(), deviceData.diskSpace(), deviceData.isEmulator(), deviceData.state(), deviceData.manufacturer(), deviceData.modelClass()), DEVICE_METADATA_FILE);
    }

    public void writeSessionOs(String str, StaticSessionData.OsData osData) throws Throwable {
        writeSessionJsonFile(this.fileStore, str, SessionMetadataJsonSerializer.serializeSessionOs(osData.osRelease(), osData.osCodeName(), osData.isRooted()), OS_METADATA_FILE);
    }
}
