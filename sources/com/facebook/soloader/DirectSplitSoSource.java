package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.os.StrictMode;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
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

/* JADX INFO: loaded from: classes3.dex */
public class DirectSplitSoSource extends SoSource {
    protected final String mSplitName;

    @Nullable
    protected Manifest mManifest = null;

    @Nullable
    protected Set<String> mLibs = null;

    public DirectSplitSoSource(String str) {
        this.mSplitName = str;
    }

    static String getSplitPath(String str) throws Throwable {
        Object obj;
        Object obj2;
        if (C1593ug.zd("zz\u000e\u0001", (short) (ZN.Xd() ^ 23585), (short) (ZN.Xd() ^ 31237)).equals(str)) {
            Context context = SoLoader.sApplicationContext;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("\u001e*\u001f,(!\u001bc\u0018#!&\u0016\u001e#[o\u001b\u0019\u001e\u000e \u001b", (short) (FB.Xd() ^ 17077))).getMethod(C1561oA.Kd("LK[)YZWUPOcY``<b[e", (short) (OY.Xd() ^ 8172)), new Class[0]);
            try {
                method.setAccessible(true);
                ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
                String strZd = Wg.Zd("^~.}8o(/2\u007f8o\u001ed(\u001f/mg<)f0j2q>t8t\rot/", (short) (C1580rY.Xd() ^ (-8328)), (short) (C1580rY.Xd() ^ (-31680)));
                String strXd = C1561oA.Xd("3075'*\n0:", (short) (FB.Xd() ^ 12976));
                try {
                    Class<?> cls = Class.forName(strZd);
                    Field field = 1 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
                    field.setAccessible(true);
                    obj2 = field.get(applicationInfo);
                } catch (Throwable th) {
                    obj2 = null;
                }
                return (String) obj2;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Context context2 = SoLoader.sApplicationContext;
        Object[] objArr2 = new Object[0];
        Method method2 = Class.forName(Wg.vd("\t\u0015\n\u0017\u001b\u0014\u000eV\u0003\u000e\f\u0011\t\u0011\u0016NZ\u0006\u0004\t\u0001\u0013\u000e", (short) (C1580rY.Xd() ^ (-28027)))).getMethod(Qg.kd(")&4\u007f.-($\u001d\u001a, %#|!\u0018 ", (short) (Od.Xd() ^ (-13054)), (short) (Od.Xd() ^ (-19543))), new Class[0]);
        try {
            method2.setAccessible(true);
            ApplicationInfo applicationInfo2 = (ApplicationInfo) method2.invoke(context2, objArr2);
            short sXd = (short) (Od.Xd() ^ (-18336));
            short sXd2 = (short) (Od.Xd() ^ (-20314));
            int[] iArr = new int["\u0016\"\u0017$ \u0019\u0013[\u0010\u001b\u0019\u001e\u000e\u0016\u001bS\u0015\u0011Pb\u0011\u0010\u000b\u0007\u007f|\u000f\u0003\b\u0006_\u0004z\u0003".length()];
            QB qb = new QB("\u0016\"\u0017$ \u0019\u0013[\u0010\u001b\u0019\u001e\u000e\u0016\u001bS\u0015\u0011Pb\u0011\u0010\u000b\u0007\u007f|\u000f\u0003\b\u0006_\u0004z\u0003");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            String str2 = new String(iArr, 0, i2);
            String strUd = C1561oA.ud("\u001a\u0016\u0011\r\u0017t\u0010\u0015\u0011\u0001\u0002_\u0004\f\f", (short) (C1633zX.Xd() ^ (-17700)));
            try {
                Class<?> cls2 = Class.forName(str2);
                Field field2 = 1 != 0 ? cls2.getField(strUd) : cls2.getDeclaredField(strUd);
                field2.setAccessible(true);
                obj = field2.get(applicationInfo2);
            } catch (Throwable th2) {
                obj = null;
            }
            String[] strArr = (String[]) obj;
            if (strArr == null) {
                throw new IllegalStateException(ZO.xd("\rcB-zM_\u0005<5\\\f%)\u001b'\tu", (short) (C1633zX.Xd() ^ (-5987)), (short) (C1633zX.Xd() ^ (-26191))));
            }
            String str3 = C1561oA.yd("!\u001d\u0018\u0014\u001e\b", (short) (C1607wl.Xd() ^ 14605)) + str + C1561oA.Yd("`\u0015%!", (short) (C1499aX.Xd() ^ (-24639)));
            for (String str4 : strArr) {
                if (str4.endsWith(str3)) {
                    return str4;
                }
            }
            throw new IllegalStateException(Xg.qd("<ipha\u001emou\"imsj'", (short) (C1633zX.Xd() ^ (-21951)), (short) (C1633zX.Xd() ^ (-1945))) + str + Jg.Wd(":\u001bpy8\u007f", (short) (ZN.Xd() ^ 2394), (short) (ZN.Xd() ^ 15077)));
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.facebook.soloader.SoSource
    @Nullable
    public String[] getLibraryDependencies(String str) {
        Set<String> set = this.mLibs;
        if (set == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (set.contains(str)) {
            return new String[0];
        }
        return null;
    }

    @Override // com.facebook.soloader.SoSource
    @Nullable
    public String getLibraryPath(String str) {
        Set<String> set = this.mLibs;
        if (set == null || this.mManifest == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (set.contains(str)) {
            return getSplitPath(this.mSplitName) + "!/lib/" + this.mManifest.arch + RemoteSettings.FORWARD_SLASH_STRING + str;
        }
        return null;
    }

    Manifest getManifest() {
        Manifest manifest = this.mManifest;
        if (manifest != null) {
            return manifest;
        }
        throw new IllegalStateException("prepare not called");
    }

    @Override // com.facebook.soloader.SoSource
    public String getName() {
        return "DirectSplitSoSource";
    }

    @Override // com.facebook.soloader.SoSource
    @Nullable
    protected File getSoFileByName(String str) {
        String libraryPath = getLibraryPath(str);
        if (libraryPath == null) {
            return null;
        }
        return new File(libraryPath);
    }

    @Override // com.facebook.soloader.SoSource
    public String[] getSoSourceAbis() {
        Manifest manifest = this.mManifest;
        if (manifest != null) {
            return new String[]{manifest.arch};
        }
        throw new IllegalStateException("prepare not called");
    }

    @Override // com.facebook.soloader.SoSource
    public int loadLibrary(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        Set<String> set = this.mLibs;
        if (set == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (set.contains(str)) {
            return loadLibraryImpl(str, i2);
        }
        return 0;
    }

    protected int loadLibraryImpl(String str, int i2) {
        String libraryPath = getLibraryPath(str);
        libraryPath.getClass();
        System.load(libraryPath);
        return 1;
    }

    @Override // com.facebook.soloader.SoSource
    protected void prepare(int i2) throws Throwable {
        Context context = SoLoader.sApplicationContext;
        short sXd = (short) (OY.Xd() ^ 6252);
        short sXd2 = (short) (OY.Xd() ^ 15760);
        int[] iArr = new int["\u0017p.w\u00076\u000eiZ\u001e\u0018?ZW\n.XE@\u0010Z1D".length()];
        QB qb = new QB("\u0017p.w\u00076\u000eiZ\u001e\u0018?ZW\n.XE@\u0010Z1D");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd3 = (short) (Od.Xd() ^ (-28196));
        int[] iArr2 = new int["{TqV!S!\u0011`".length()];
        QB qb2 = new QB("{TqV!S!\u0011`");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd3 + i4)));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            InputStream inputStreamOpen = ((AssetManager) method.invoke(context, objArr)).open(this.mSplitName + EO.Od("cZ8\u0019|$?\u007f0Z\u0011n+(%\nMT", (short) (Od.Xd() ^ (-1518))));
            try {
                this.mManifest = Manifest.read(inputStreamOpen);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.mLibs = new HashSet(this.mManifest.libs);
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.soloader.SoSource
    @Nullable
    public File unpackLibrary(String str) {
        return getSoFileByName(str);
    }
}
