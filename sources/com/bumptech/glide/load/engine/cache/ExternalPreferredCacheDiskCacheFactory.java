package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskLruCacheFactory;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public final class ExternalPreferredCacheDiskCacheFactory extends DiskLruCacheFactory {
    public ExternalPreferredCacheDiskCacheFactory(Context context) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, 262144000L);
    }

    public ExternalPreferredCacheDiskCacheFactory(Context context, long j2) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, j2);
    }

    public ExternalPreferredCacheDiskCacheFactory(final Context context, final String str, long j2) {
        super(new DiskLruCacheFactory.CacheDirectoryGetter() { // from class: com.bumptech.glide.load.engine.cache.ExternalPreferredCacheDiskCacheFactory.1
            private File getInternalCacheDirectory() throws Throwable {
                Context context2 = context;
                short sXd = (short) (C1607wl.Xd() ^ 21912);
                int[] iArr = new int["1?2AC>6\u0001;HDKAKN\t#PLSI]V".length()];
                QB qb = new QB("1?2AC>6\u0001;HDKAKN\t#PLSI]V");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                    i2++;
                }
                Object[] objArr = new Object[0];
                Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Yd("\u0013\u0012\"q\u0011\u0014\u001a\u0018w\u001e(", (short) (Od.Xd() ^ (-17209))), new Class[0]);
                try {
                    method.setAccessible(true);
                    File file = (File) method.invoke(context2, objArr);
                    if (file == null) {
                        return null;
                    }
                    return str != null ? new File(file, str) : file;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }

            @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
            public File getCacheDirectory() throws Throwable {
                File internalCacheDirectory = getInternalCacheDirectory();
                if (internalCacheDirectory != null && internalCacheDirectory.exists()) {
                    return internalCacheDirectory;
                }
                Context context2 = context;
                short sXd = (short) (Od.Xd() ^ (-288));
                short sXd2 = (short) (Od.Xd() ^ (-27386));
                int[] iArr = new int["\u0018&\u001d,*%!k\"//6(29s\n77>0DA".length()];
                QB qb = new QB("\u0018&\u001d,*%!k\"//6(29s\n77>0DA");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd3 = (short) (ZN.Xd() ^ 8635);
                short sXd4 = (short) (ZN.Xd() ^ 15740);
                int[] iArr2 = new int["qfx`\u0017\n|! \n\u0019\u0004)\u001e*:\u001f7G".length()];
                QB qb2 = new QB("qfx`\u0017\n|! \n\u0019\u0004)\u001e*:\u001f7G");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                    i3++;
                }
                Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method.setAccessible(true);
                    File file = (File) method.invoke(context2, objArr);
                    return (file == null || !file.canWrite()) ? internalCacheDirectory : str != null ? new File(file, str) : file;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }, j2);
    }
}
