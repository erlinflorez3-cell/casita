package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
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
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class AsyncStorageExpoMigration {
    static final String LOG_TAG = "AsyncStorageExpoMigration";

    private static void copyFile(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws Throwable {
        FileChannel fileChannel;
        FileChannel channel = null;
        try {
            FileChannel channel2 = fileInputStream.getChannel();
            try {
                channel = fileOutputStream.getChannel();
                channel2.transferTo(0L, channel2.size(), channel);
                if (channel2 != null) {
                    try {
                        channel2.close();
                    } finally {
                        if (channel != null) {
                            channel.close();
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileChannel = channel;
                channel = channel2;
                if (channel != null) {
                    try {
                        channel.close();
                    } finally {
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannel = null;
        }
    }

    private static ArrayList<File> getExpoDatabases(Context context) throws Throwable {
        ArrayList<File> arrayList = new ArrayList<>();
        String strYd = C1561oA.yd("7766", (short) (C1499aX.Xd() ^ (-10553)));
        try {
            Class<?> cls = Class.forName(C1561oA.Yd("<JAPNIE\u0010FSSZLV]\u0018.[[bThe", (short) (C1580rY.Xd() ^ (-30668))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Xg.qd("\u0019\u0011'\u0013` \u0016$\u001ee\f.-%+%", (short) (ZN.Xd() ^ 22080), (short) (ZN.Xd() ^ 26093)));
            Object[] objArr = {strYd};
            Method method = cls.getMethod(Jg.Wd("fbm>WjQ\u0012L!Nx\u0004\u0017\u0007", (short) (C1607wl.Xd() ^ 23556), (short) (C1607wl.Xd() ^ 31403)), clsArr);
            try {
                method.setAccessible(true);
                File[] fileArrListFiles = ((File) method.invoke(context, objArr)).getParentFile().listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (file.getName().startsWith(ZO.xd("Nmbtc@\u0007]nhL\u000f~*Ix_9`\u007f.$f\nnT}\"", (short) (C1607wl.Xd() ^ 29293), (short) (C1607wl.Xd() ^ 22035))) && !file.getName().endsWith(C1626yg.Ud("\u00136r/X`9n", (short) (C1499aX.Xd() ^ (-30197)), (short) (C1499aX.Xd() ^ (-3460))))) {
                            arrayList.add(file);
                        }
                    }
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return arrayList;
    }

    private static File getLastModifiedFile(ArrayList<File> arrayList) {
        File file = null;
        if (arrayList.size() == 0) {
            return null;
        }
        long j2 = -1;
        for (File file2 : arrayList) {
            long lastModifiedTimeInMillis = getLastModifiedTimeInMillis(file2);
            if (lastModifiedTimeInMillis > j2) {
                file = file2;
                j2 = lastModifiedTimeInMillis;
            }
        }
        return file != null ? file : arrayList.get(0);
    }

    private static long getLastModifiedTimeFromBasicFileAttrs(File file) {
        try {
            return Files.readAttributes(file.toPath(), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis();
        } catch (Exception unused) {
            return -1L;
        }
    }

    private static long getLastModifiedTimeInMillis(File file) {
        try {
            return getLastModifiedTimeFromBasicFileAttrs(file);
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1L;
        }
    }

    private static boolean isAsyncStorageDatabaseCreated(Context context) throws Throwable {
        short sXd = (short) (C1499aX.Xd() ^ (-32414));
        int[] iArr = new int["\u0014]\u0004=g5\u0010V1".length()];
        QB qb = new QB("\u0014]\u0004=g5\u0010V1");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Object[] objArr = {new String(iArr, 0, i2)};
        Method method = Class.forName(EO.Od("\u0012N2)\u0006Dk=I\u001a\u001bz65o\u0004Ew/]\u0005@\u001e", (short) (ZN.Xd() ^ 15378))).getMethod(C1593ug.zd("ml|Mk\u007fmoo\u0003uas\b|", (short) (C1499aX.Xd() ^ (-31125)), (short) (C1499aX.Xd() ^ (-18413))), Class.forName(C1561oA.Qd("\n\u007f\u0014}I\u0007z\u0007~Dh\t\u0006{\u007fw", (short) (ZN.Xd() ^ 22460))));
        try {
            method.setAccessible(true);
            return ((File) method.invoke(context, objArr)).exists();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void migrate(Context context) throws Throwable {
        String strOd = C1561oA.od("\u0004\u001f\u001c&\u0014&\u0016\u0014N\u001b\u001c\u001f\u001fI\u001b\r\n\u000b\u0013\u0018\u000f\u001b@\r\u000e\u0002\u0006\u0002\u0004~|7zv\tttr\u0004t.", (short) (C1499aX.Xd() ^ (-26839)));
        if (isAsyncStorageDatabaseCreated(context)) {
            return;
        }
        ArrayList<File> expoDatabases = getExpoDatabases(context);
        File lastModifiedFile = getLastModifiedFile(expoDatabases);
        short sXd = (short) (OY.Xd() ^ 9983);
        int[] iArr = new int[")\\cYO@b^bRYX9mffEbam]qgnn".length()];
        QB qb = new QB(")\\cYO@b^bRYX9mffEbam]qgnn");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        new String(iArr, 0, i2);
        if (lastModifiedFile == null) {
            Wg.Zd("l+9j8\u001e|O,Ac>/uT1!l\u0005)\u0010oF\u001a", (short) (C1607wl.Xd() ^ 4922), (short) (C1607wl.Xd() ^ 25317));
            return;
        }
        try {
            ReactDatabaseSupplier.getInstance(context).get();
            FileInputStream fileInputStream = new FileInputStream(lastModifiedFile);
            String strXd = C1561oA.Xd(",&/QMQAHG", (short) (C1499aX.Xd() ^ (-27475)));
            Class<?> cls = Class.forName(Wg.vd("GSHUYRL\u0015ALJOGOT\r9dbg_ql", (short) (OY.Xd() ^ 31452)));
            Class<?>[] clsArr = new Class[1];
            short sXd2 = (short) (C1633zX.Xd() ^ (-21192));
            short sXd3 = (short) (C1633zX.Xd() ^ (-24678));
            int[] iArr2 = new int["bXlV\"_S_W\u001dAa^TXP".length()];
            QB qb2 = new QB("bXlV\"_S_W\u001dAa^TXP");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr = {strXd};
            Method method = cls.getMethod(hg.Vd("ebp?[mYYWhYCSeX", (short) (C1633zX.Xd() ^ (-19715)), (short) (C1633zX.Xd() ^ (-31376))), clsArr);
            try {
                method.setAccessible(true);
                copyFile(fileInputStream, new FileOutputStream((File) method.invoke(context, objArr)));
                String str = strOd + lastModifiedFile.getName() + C1561oA.ud("N\"\u001cK|t{\u001c\u0016\u0018\u0006\u000b\b", (short) (FB.Xd() ^ 9092));
                try {
                    for (File file : expoDatabases) {
                        if (file.delete()) {
                            String str2 = C1561oA.yd("\u00155;3A1/iL;FF:8r6\"4  \u001e/ Y", (short) (C1607wl.Xd() ^ 16301)) + file.getName();
                        } else {
                            String str3 = C1561oA.Yd("\u001c8AE??{QM~DFNHXJ\u0006ZKXZPP\rRPdRTTgZ\u0016", (short) (C1633zX.Xd() ^ (-15754))) + file.getName();
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                Xg.qd("Gtswtn~pp-\u0003wu1\u0006v\u0004\u0006{{8Z\u000e\u0015\u000b\u0001q\u0014\u0010\u0014\u0004\u000b\nE\u0014\u0011\u0010\u001c\f \u0016\u001d\u001d", (short) (C1633zX.Xd() ^ (-10276)), (short) (C1633zX.Xd() ^ (-16726)));
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Exception e4) {
            String str4 = Jg.Wd("\u001a)m^v\u0018OUl\u001f\u001c6 `;l\rI9Zb\u0006\u001a\u0007~hQ#\u007f\u0012=QnK", (short) (C1633zX.Xd() ^ (-3920)), (short) (C1633zX.Xd() ^ (-19980))) + lastModifiedFile.getName();
            e4.printStackTrace();
        }
    }
}
