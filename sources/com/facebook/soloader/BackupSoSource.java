package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.StrictMode;
import com.facebook.soloader.ExtractFromZipSoSource;
import com.facebook.soloader.UnpackingSoSource;
import com.valid.communication.helpers.CommunicationConstants;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
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
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class BackupSoSource extends UnpackingSoSource implements RecoverableSoSource {
    private static final byte APK_SO_SOURCE_SIGNATURE_VERSION = 3;
    private static final byte LIBS_DIR_DOESNT_EXIST = 1;
    private static final byte LIBS_DIR_SNAPSHOT = 2;
    private static final String TAG = "BackupSoSource";
    private static final String ZIP_SEARCH_PATTERN = "^lib/([^/]+)/([^/]+\\.so)$";
    protected boolean mInitialized;
    private final ArrayList<ExtractFromZipSoSource> mZipSources;

    protected class ApkUnpacker extends UnpackingSoSource.Unpacker {
        protected ApkUnpacker() {
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public UnpackingSoSource.Dso[] getDsos() throws IOException {
            ArrayList arrayList = new ArrayList();
            Iterator it = BackupSoSource.this.mZipSources.iterator();
            while (it.hasNext()) {
                UnpackingSoSource.Unpacker unpackerMakeUnpacker = ((ExtractFromZipSoSource) it.next()).makeUnpacker();
                try {
                    arrayList.addAll(Arrays.asList(unpackerMakeUnpacker.getDsos()));
                    if (unpackerMakeUnpacker != null) {
                        unpackerMakeUnpacker.close();
                    }
                } catch (Throwable th) {
                    if (unpackerMakeUnpacker != null) {
                        try {
                            unpackerMakeUnpacker.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            return (UnpackingSoSource.Dso[]) arrayList.toArray(new UnpackingSoSource.Dso[arrayList.size()]);
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public void unpack(File file) throws Throwable {
            Iterator it = BackupSoSource.this.mZipSources.iterator();
            while (it.hasNext()) {
                ExtractFromZipSoSource.ZipUnpacker zipUnpacker = (ExtractFromZipSoSource.ZipUnpacker) ((ExtractFromZipSoSource) it.next()).makeUnpacker();
                try {
                    zipUnpacker.unpack(file);
                    if (zipUnpacker != null) {
                        zipUnpacker.close();
                    }
                } catch (Throwable th) {
                    if (zipUnpacker != null) {
                        try {
                            zipUnpacker.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }
    }

    public BackupSoSource(Context context, String str) {
        this(context, str, true);
    }

    public BackupSoSource(Context context, String str, boolean z2) throws Throwable {
        Object obj;
        super(context, str, z2);
        ArrayList<ExtractFromZipSoSource> arrayList = new ArrayList<>();
        this.mZipSources = arrayList;
        this.mInitialized = false;
        short sXd = (short) (C1499aX.Xd() ^ (-9098));
        int[] iArr = new int["\u0006\u0014\u0007\u0016\u0018\u0013\u000bU\u007f\r\t\u0010\u0006\u0010\u0013MW\u0005\u0001\b}\u0012\u000b".length()];
        QB qb = new QB("\u0006\u0014\u0007\u0016\u0018\u0013\u000bU\u007f\r\t\u0010\u0006\u0010\u0013MW\u0005\u0001\b}\u0012\u000b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1607wl.Xd() ^ 13298);
        int[] iArr2 = new int["\"!1~/0-+&%9/66\u001281;".length()];
        QB qb2 = new QB("\"!1~/0-+&%9/66\u001281;");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strQd = Xg.qd(".<3B@;7\u00028EEL>HO\nMK\r!QROMHG[QXX4ZS]", (short) (Od.Xd() ^ (-28099)), (short) (Od.Xd() ^ (-14277)));
            String strWd = Jg.Wd(".c]n0F\u001cY7", (short) (C1633zX.Xd() ^ (-21241)), (short) (C1633zX.Xd() ^ (-28545)));
            try {
                Class<?> cls2 = Class.forName(strQd);
                Field field = 1 != 0 ? cls2.getField(strWd) : cls2.getDeclaredField(strWd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            File file = new File((String) obj);
            short sXd3 = (short) (Od.Xd() ^ (-1128));
            short sXd4 = (short) (Od.Xd() ^ (-29895));
            int[] iArr3 = new int["\rw\b\u001b\u001c#%H&SkR\u00156Q\u0002\u001d{E\u0001:|I7\u0003".length()];
            QB qb3 = new QB("\rw\b\u001b\u001c#%H&SkR\u00156Q\u0002\u001d{E\u0001:|I7\u0003");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd4) + sXd3)));
                i4++;
            }
            arrayList.add(new ExtractFromZipSoSource(context, str, file, new String(iArr3, 0, i4)));
            addBackupsFromSplitApks(context, str);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void addBackupsFromSplitApks(Context context, String str) throws Throwable {
        Object obj;
        Object obj2;
        String strUd = C1626yg.Ud("2a9~5zI\u0004Y7\u001e\u0003#s", (short) (ZN.Xd() ^ 10411), (short) (ZN.Xd() ^ 14718));
        Class<?> cls = Class.forName(Ig.wd("\u001ccI2tAZ2\t25[\u0002\u000b\u0017k4l!1c\u001c0", (short) (FB.Xd() ^ 28171)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 21893);
        int[] iArr = new int["L{=&F\u0013^Lp\u001f0G{tw;g~".length()];
        QB qb = new QB("L{=&F\u0013^Lp\u001f0G{tw;g~");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strQd = C1561oA.Qd("S_Ta]VP\u0019MXV[KSX\u0011RN\u000e NMHD=:L@EC\u001dA8@", (short) (FB.Xd() ^ 6156));
            String strZd = C1593ug.zd("tromyYv}{mpPv\u0001\u0003", (short) (OY.Xd() ^ 5491), (short) (OY.Xd() ^ 30150));
            try {
                Class<?> cls2 = Class.forName(strQd);
                Field field = 1 != 0 ? cls2.getField(strZd) : cls2.getDeclaredField(strZd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            if (((String[]) obj) == null) {
                return;
            }
            short sXd2 = (short) (Od.Xd() ^ CommunicationConstants.UNKNOWN_HOST_EXCEPTION_CODE);
            int[] iArr2 = new int["\t\u0015\n\u0017\u0013\f\u0006N\u0003\u000e\f\u0011\u0001\t\u000eFZ\u0006\u0004\tx\u000b\u0006".length()];
            QB qb2 = new QB("\t\u0015\n\u0017\u0013\f\u0006N\u0003\u000e\f\u0011\u0001\t\u000eFZ\u0006\u0004\tx\u000b\u0006");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            try {
                Class<?> cls3 = Class.forName(new String(iArr2, 0, i3));
                Object[] objArr2 = new Object[0];
                Method method2 = cls3.getMethod(C1561oA.Kd("BAQ\u001fOPMKFEYOVV2XQ[", (short) (FB.Xd() ^ 16312)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ApplicationInfo applicationInfo2 = (ApplicationInfo) method2.invoke(context, objArr2);
                    short sXd3 = (short) (C1499aX.Xd() ^ (-921));
                    short sXd4 = (short) (C1499aX.Xd() ^ (-4346));
                    int[] iArr3 = new int["\ffl3Oa\u000blA\u0006\u0015Se\u0007=\u000ft*xD\u0013+Wl\b>a\u000f4KT\u0012-n".length()];
                    QB qb3 = new QB("\ffl3Oa\u000blA\u0006\u0015Se\u0007=\u000ft*xD\u0013+Wl\b>a\u000f4KT\u0012-n");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(((i4 * sXd4) ^ sXd3) + xuXd3.CK(iKK3));
                        i4++;
                    }
                    String str2 = new String(iArr3, 0, i4);
                    String strXd = C1561oA.Xd("\f\n\u0007\u0005\u0011p\u000e\u0015\u0013\u0005\bg\u000e\u0018\u001a", (short) (C1633zX.Xd() ^ (-28764)));
                    try {
                        Class<?> cls4 = Class.forName(str2);
                        Field field2 = 1 != 0 ? cls4.getField(strXd) : cls4.getDeclaredField(strXd);
                        field2.setAccessible(true);
                        obj2 = field2.get(applicationInfo2);
                    } catch (Throwable th2) {
                        obj2 = null;
                    }
                    for (String str3 : (String[]) obj2) {
                        ExtractFromZipSoSource extractFromZipSoSource = new ExtractFromZipSoSource(context, str, new File(str3), Wg.vd("\u0013\"\u001c\u0016ga\u0012\u0016k\u001bedoi\u001a\u001eS\u0003M\u007fV\u001d\u0016PP", (short) (FB.Xd() ^ 8606)));
                        if (extractFromZipSoSource.hasZippedLibs()) {
                            LogUtil.w(strUd, Qg.kd("WYX\\`X\u0010QOPW`Z\t[V[WGH\u0002GRNK|OKFBL\u0011u", (short) (Od.Xd() ^ (-115)), (short) (Od.Xd() ^ (-15453))) + extractFromZipSoSource.toString());
                            this.mZipSources.add(extractFromZipSoSource);
                        }
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IOException e3) {
                LogUtil.w(strUd, hg.Vd("c]df^\\\u0017jd\u0014eWRT\u000fa]XT^\tIWQX", (short) (FB.Xd() ^ 14389), (short) (FB.Xd() ^ 29607)), e3);
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    protected byte[] getDepsBlock() throws IOException {
        Object obj;
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 3);
            parcelObtain.writeInt(SysUtil.getAppVersionCode(this.mContext));
            parcelObtain.writeInt(this.mZipSources.size());
            Iterator<ExtractFromZipSoSource> it = this.mZipSources.iterator();
            while (it.hasNext()) {
                parcelObtain.writeByteArray(it.next().getDepsBlock());
            }
            Context context = this.mContext;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.ud("XdYfb[U\u001eR][`PX]\u0016*USXHZU", (short) (C1607wl.Xd() ^ 22953))).getMethod(C1561oA.yd(">;I\u0015KJEAB?QERP*N-5", (short) (FB.Xd() ^ 28384)), new Class[0]);
            try {
                method.setAccessible(true);
                ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
                String strYd = C1561oA.Yd("FTKZXSO\u001aP]]dV`g\"ec%9ijge`_sippLrku", (short) (C1633zX.Xd() ^ (-17538)));
                String strQd = Xg.qd("\u0018\u0015\u001c\u001a\f\u000fn\u0015\u001f", (short) (OY.Xd() ^ 20772), (short) (OY.Xd() ^ 14878));
                try {
                    Class<?> cls = Class.forName(strYd);
                    Field field = 1 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
                    field.setAccessible(true);
                    obj = field.get(applicationInfo);
                } catch (Throwable th) {
                    obj = null;
                }
                String str = (String) obj;
                if (str == null) {
                    parcelObtain.writeByte((byte) 1);
                    return parcelObtain.marshall();
                }
                File canonicalFile = new File(str).getCanonicalFile();
                if (!canonicalFile.exists()) {
                    parcelObtain.writeByte((byte) 1);
                    return parcelObtain.marshall();
                }
                parcelObtain.writeByte((byte) 2);
                parcelObtain.writeString(canonicalFile.getPath());
                parcelObtain.writeLong(canonicalFile.lastModified());
                return parcelObtain.marshall();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    public UnpackingSoSource.Dso[] getDsosBaseApk() throws IOException {
        UnpackingSoSource.Unpacker unpackerMakeUnpacker = this.mZipSources.get(0).makeUnpacker();
        try {
            UnpackingSoSource.Dso[] dsos = unpackerMakeUnpacker.getDsos();
            if (unpackerMakeUnpacker != null) {
                unpackerMakeUnpacker.close();
            }
            return dsos;
        } catch (Throwable th) {
            if (unpackerMakeUnpacker != null) {
                try {
                    unpackerMakeUnpacker.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.soloader.DirectorySoSource, com.facebook.soloader.SoSource
    public String getName() {
        return TAG;
    }

    @Override // com.facebook.soloader.DirectorySoSource, com.facebook.soloader.SoSource
    public int loadLibrary(String str, int i2, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (this.mInitialized) {
            return super.loadLibrary(str, i2, threadPolicy);
        }
        return 0;
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    protected UnpackingSoSource.Unpacker makeUnpacker() throws IOException {
        return new ApkUnpacker();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        com.facebook.soloader.LogUtil.e(com.facebook.soloader.SoLoader.TAG, "Found " + r9 + " in " + getName());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean peekAndPrepareSoSource(java.lang.String r9, int r10) throws java.io.IOException {
        /*
            r8 = this;
            com.facebook.soloader.UnpackingSoSource$Unpacker r7 = r8.makeUnpacker()
            com.facebook.soloader.UnpackingSoSource$Dso[] r6 = r7.getDsos()     // Catch: java.lang.Throwable -> L67
            int r5 = r6.length     // Catch: java.lang.Throwable -> L67
            r4 = 0
            r1 = r4
        Lb:
            java.lang.String r2 = "SoLoader"
            r3 = 1
            if (r1 >= r5) goto L42
            r0 = r6[r1]     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = r0.name     // Catch: java.lang.Throwable -> L67
            boolean r0 = r0.equals(r9)     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L3f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r1.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "Found "
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r1 = r0.append(r9)     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = " in "
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = r8.getName()     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L67
            com.facebook.soloader.LogUtil.e(r2, r0)     // Catch: java.lang.Throwable -> L67
            goto L44
        L3f:
            int r1 = r1 + 1
            goto Lb
        L42:
            r0 = r4
            goto L45
        L44:
            r0 = r3
        L45:
            if (r7 == 0) goto L4a
            r7.close()
        L4a:
            if (r0 != 0) goto L4d
            return r4
        L4d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Preparing "
            r1.<init>(r0)
            java.lang.String r0 = r8.getName()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            com.facebook.soloader.LogUtil.e(r2, r0)
            r8.prepare(r10)
            return r3
        L67:
            r1 = move-exception
            if (r7 == 0) goto L72
            r7.close()     // Catch: java.lang.Throwable -> L6e
            goto L72
        L6e:
            r0 = move-exception
            r1.addSuppressed(r0)
        L72:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.BackupSoSource.peekAndPrepareSoSource(java.lang.String, int):boolean");
    }

    @Override // com.facebook.soloader.UnpackingSoSource, com.facebook.soloader.SoSource
    public void prepare(int i2) throws IOException {
        if ((8 & i2) != 0) {
            return;
        }
        super.prepare(i2);
        this.mInitialized = true;
    }

    @Override // com.facebook.soloader.RecoverableSoSource
    public SoSource recover(Context context) {
        BackupSoSource backupSoSource = new BackupSoSource(context, this.soDirectory.getName());
        try {
            backupSoSource.prepare(0);
            return backupSoSource;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.facebook.soloader.DirectorySoSource, com.facebook.soloader.SoSource
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.soDirectory.getCanonicalPath());
        } catch (IOException unused) {
            name = this.soDirectory.getName();
        }
        return getName() + "[root = " + name + " flags = " + this.flags + " apks = " + this.mZipSources.toString() + "]";
    }
}
