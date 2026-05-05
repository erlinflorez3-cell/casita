package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import javax.annotation.Nullable;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class ApplicationSoSource extends SoSource implements RecoverableSoSource {
    private final int flags;
    private DirectorySoSource soSource;

    public ApplicationSoSource(Context context, int i2) {
        this.flags = i2;
        this.soSource = new DirectorySoSource(getNativeLibDirFromContext(context), i2);
    }

    private static File getNativeLibDirFromContext(Context context) throws Throwable {
        Object obj;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("R`Wfd_[&\\iipbls.Dqqxj~{", (short) (C1633zX.Xd() ^ (-10670)), (short) (C1633zX.Xd() ^ (-2793)))).getMethod(C1561oA.od("}z\tT\u0003\u0002|xqn\u0001tywQult", (short) (ZN.Xd() ^ 4844)), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strKd = C1561oA.Kd(":H?NLGC\u000eDQQXJT[\u0016YW\u0019-]^[YTSg]dd@f_i", (short) (FB.Xd() ^ 10286));
            short sXd = (short) (ZN.Xd() ^ 15615);
            short sXd2 = (short) (ZN.Xd() ^ 3900);
            int[] iArr = new int["[6\u0019M*x/\fTDz[\"\\A\u001a".length()];
            QB qb = new QB("[6\u0019M*x/\fTDz[\"\\A\u001a");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 1 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            return new File((String) obj);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.soloader.SoSource
    public void addToLdLibraryPath(Collection<String> collection) {
        this.soSource.addToLdLibraryPath(collection);
    }

    @Override // com.facebook.soloader.SoSource
    @Nullable
    public String[] getLibraryDependencies(String str) throws IOException {
        return this.soSource.getLibraryDependencies(str);
    }

    @Override // com.facebook.soloader.SoSource
    @Nullable
    public String getLibraryPath(String str) throws IOException {
        return this.soSource.getLibraryPath(str);
    }

    @Override // com.facebook.soloader.SoSource
    public String getName() {
        return "ApplicationSoSource";
    }

    @Override // com.facebook.soloader.SoSource
    @Nullable
    public File getSoFileByName(String str) throws IOException {
        return this.soSource.getSoFileByName(str);
    }

    @Override // com.facebook.soloader.SoSource
    public int loadLibrary(String str, int i2, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return this.soSource.loadLibrary(str, i2, threadPolicy);
    }

    @Override // com.facebook.soloader.SoSource
    protected void prepare(int i2) throws IOException {
        this.soSource.prepare(i2);
    }

    @Override // com.facebook.soloader.RecoverableSoSource
    public SoSource recover(Context context) {
        this.soSource = new DirectorySoSource(getNativeLibDirFromContext(context), this.flags | 1);
        return this;
    }

    @Override // com.facebook.soloader.SoSource
    public String toString() {
        return getName() + "[" + this.soSource.toString() + "]";
    }

    @Override // com.facebook.soloader.SoSource
    @Nullable
    public File unpackLibrary(String str) throws IOException {
        return this.soSource.unpackLibrary(str);
    }
}
