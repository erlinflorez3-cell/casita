package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import com.dynatrace.android.agent.Global;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
public class FileStore {
    private static final String CRASHLYTICS_PATH_V1 = ".com.google.firebase.crashlytics.files.v1";
    private static final String CRASHLYTICS_PATH_V2 = ".com.google.firebase.crashlytics.files.v2";
    private static final String CRASHLYTICS_PATH_V3 = ".crashlytics.v3";
    private static final String NATIVE_REPORTS_PATH = "native-reports";
    private static final String NATIVE_SESSION_SUBDIR = "native";
    private static final String PRIORITY_REPORTS_PATH = "priority-reports";
    private static final String REPORTS_PATH = "reports";
    private static final String SESSIONS_PATH = "open-sessions";
    private final File crashlyticsDir;
    private final File filesDir;
    private final File nativeReportsDir;
    private final File priorityReportsDir;
    final String processName;
    private final File reportsDir;
    private final File sessionsDir;

    public FileStore(Context context) throws Throwable {
        String processName = ProcessDetailsProvider.INSTANCE.getCurrentProcessDetails(context).getProcessName();
        this.processName = processName;
        short sXd = (short) (ZN.Xd() ^ 21964);
        short sXd2 = (short) (ZN.Xd() ^ 11452);
        int[] iArr = new int["ftkzxso:p}}\u0005v\u0001\bBX\u0006\u0006\r~\u0013\u0010".length()];
        QB qb = new QB("ftkzxso:p}}\u0005v\u0001\bBX\u0006\u0006\r~\u0013\u0010");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.od("@=K\u001c>@8E\u00159A", (short) (C1607wl.Xd() ^ 22291)), new Class[0]);
        try {
            method.setAccessible(true);
            File file = (File) method.invoke(context, objArr);
            this.filesDir = file;
            File filePrepareBaseDir = prepareBaseDir(new File(file, useV3FileSystem() ? C1561oA.Kd("Y\u0010 \u0010#\u0019\u001e,(\u001e\u0019*e/l", (short) (OY.Xd() ^ 30270)) + File.separator + sanitizeName(processName) : Wg.Zd(",wCT\\Um1p\u0015Mi(rC9}Tn4D\u0001W\n\"n2Z\u001dYc/1\u0001CX`6\u007f\f\u0006", (short) (ZN.Xd() ^ 21333), (short) (ZN.Xd() ^ 24197))));
            this.crashlyticsDir = filePrepareBaseDir;
            this.sessionsDir = prepareBaseDir(new File(filePrepareBaseDir, C1561oA.Xd("$&\u001c&e- /0'..4", (short) (C1499aX.Xd() ^ (-22696)))));
            this.reportsDir = prepareBaseDir(new File(filePrepareBaseDir, Wg.vd("G;GGKNN", (short) (ZN.Xd() ^ 30567))));
            this.priorityReportsDir = prepareBaseDir(new File(filePrepareBaseDir, Qg.kd("@A7<>4>Bt9+53564", (short) (FB.Xd() ^ 17847), (short) (FB.Xd() ^ 4251))));
            this.nativeReportsDir = prepareBaseDir(new File(filePrepareBaseDir, hg.Vd("XJ\\P\\J\u0011UGQOQRP", (short) (C1499aX.Xd() ^ (-3482)), (short) (C1499aX.Xd() ^ (-502)))));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void cleanupFileSystemDir(String str) {
        File file = new File(this.filesDir, str);
        if (file.exists() && recursiveDelete(file)) {
            Logger.getLogger().d("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void cleanupFileSystemDirs(final String str) {
        String[] list;
        if (!this.filesDir.exists() || (list = this.filesDir.list(new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.FileStore$$ExternalSyntheticLambda0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(str);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            cleanupFileSystemDir(str2);
        }
    }

    private File getSessionDir(String str) {
        return prepareDir(new File(this.sessionsDir, str));
    }

    private static synchronized File prepareBaseDir(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return file;
            }
            Logger.getLogger().d("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
            file.delete();
        }
        if (!file.mkdirs()) {
            Logger.getLogger().e("Could not create Crashlytics-specific directory: " + file);
        }
        return file;
    }

    private static File prepareDir(File file) {
        file.mkdirs();
        return file;
    }

    static boolean recursiveDelete(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                recursiveDelete(file2);
            }
        }
        return file.delete();
    }

    private static <T> List<T> safeArrayToList(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    static String sanitizeName(String str) {
        return str.length() > 40 ? CommonUtils.sha1(str) : str.replaceAll("[^a-zA-Z0-9.]", Global.UNDERSCORE);
    }

    private boolean useV3FileSystem() {
        return !this.processName.isEmpty();
    }

    public void cleanupPreviousFileSystems() {
        cleanupFileSystemDir(".com.google.firebase.crashlytics");
        cleanupFileSystemDir(".com.google.firebase.crashlytics-ndk");
        if (useV3FileSystem()) {
            cleanupFileSystemDir(CRASHLYTICS_PATH_V1);
            cleanupFileSystemDirs(CRASHLYTICS_PATH_V2 + File.pathSeparator);
        }
    }

    public void deleteAllCrashlyticsFiles() {
        recursiveDelete(this.crashlyticsDir);
    }

    public boolean deleteSessionFiles(String str) {
        return recursiveDelete(new File(this.sessionsDir, str));
    }

    public List<String> getAllOpenSessionIds() {
        return safeArrayToList(this.sessionsDir.list());
    }

    public File getCommonFile(String str) {
        return new File(this.crashlyticsDir, str);
    }

    public List<File> getCommonFiles(FilenameFilter filenameFilter) {
        return safeArrayToList(this.crashlyticsDir.listFiles(filenameFilter));
    }

    public File getNativeReport(String str) {
        return new File(this.nativeReportsDir, str);
    }

    public List<File> getNativeReports() {
        return safeArrayToList(this.nativeReportsDir.listFiles());
    }

    public File getNativeSessionDir(String str) {
        return prepareDir(new File(getSessionDir(str), "native"));
    }

    public File getPriorityReport(String str) {
        return new File(this.priorityReportsDir, str);
    }

    public List<File> getPriorityReports() {
        return safeArrayToList(this.priorityReportsDir.listFiles());
    }

    public File getReport(String str) {
        return new File(this.reportsDir, str);
    }

    public List<File> getReports() {
        return safeArrayToList(this.reportsDir.listFiles());
    }

    public File getSessionFile(String str, String str2) {
        return new File(getSessionDir(str), str2);
    }

    public List<File> getSessionFiles(String str, FilenameFilter filenameFilter) {
        return safeArrayToList(getSessionDir(str).listFiles(filenameFilter));
    }
}
