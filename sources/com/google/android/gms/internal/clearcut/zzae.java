package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.UserManager;
import androidx.core.content.PermissionChecker;
import com.drew.metadata.iptc.IptcDirectory;
import cz.msebera.android.httpclient.HttpStatus;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzae<T> {
    private static final Object zzdn = new Object();
    private static boolean zzdo = false;
    private static volatile Boolean zzdp = null;
    private static volatile Boolean zzdq = null;
    private static Context zzh = null;
    private final zzao zzdr;
    final String zzds;
    private final String zzdt;
    private final T zzdu;
    private T zzdv;
    private volatile zzab zzdw;
    private volatile SharedPreferences zzdx;

    private zzae(zzao zzaoVar, String str, T t2) {
        this.zzdv = null;
        this.zzdw = null;
        this.zzdx = null;
        if (zzaoVar.zzef == null && zzaoVar.zzeg == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (zzaoVar.zzef != null && zzaoVar.zzeg != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzdr = zzaoVar;
        String strValueOf = String.valueOf(zzaoVar.zzeh);
        String strValueOf2 = String.valueOf(str);
        this.zzdt = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        String strValueOf3 = String.valueOf(zzaoVar.zzei);
        String strValueOf4 = String.valueOf(str);
        this.zzds = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
        this.zzdu = t2;
    }

    /* synthetic */ zzae(zzao zzaoVar, String str, Object obj, zzai zzaiVar) {
        this(zzaoVar, str, obj);
    }

    public static void maybeInit(Context context) {
        if (zzh == null) {
            synchronized (zzdn) {
                Class<?> cls = Class.forName(Wg.vd(",8-:>71y6A?D<DI\u0002})',$61", (short) (OY.Xd() ^ 3140)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (C1580rY.Xd() ^ (-25997));
                short sXd2 = (short) (C1580rY.Xd() ^ (-14222));
                int[] iArr = new int["MV&FVHAB,MIM=:J:8&F@B052".length()];
                QB qb = new QB("MV&FVHAB,MIM=:J:8&F@B052");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    if (!((Boolean) method.invoke(context, objArr)).booleanValue()) {
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(hg.Vd("^j_lha[$XcafV^c\u001c0[Y^N`[", (short) (FB.Xd() ^ 29518), (short) (FB.Xd() ^ 22122))).getMethod(C1561oA.ud("PM['UTOKDASGLJ\u001eIGL<NI", (short) (C1607wl.Xd() ^ 22564)), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            Context context2 = (Context) method2.invoke(context, objArr2);
                            if (context2 != null) {
                                context = context2;
                            }
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    if (zzh != context) {
                        zzdp = null;
                    }
                    zzh = context;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            zzdo = false;
        }
    }

    public static <T> zzae<T> zza(zzao zzaoVar, String str, T t2, zzan<T> zzanVar) {
        return new zzal(zzaoVar, str, t2, zzanVar);
    }

    public static zzae<String> zza(zzao zzaoVar, String str, String str2) {
        return new zzak(zzaoVar, str, str2);
    }

    public static zzae<Boolean> zza(zzao zzaoVar, String str, boolean z2) {
        return new zzaj(zzaoVar, str, Boolean.valueOf(z2));
    }

    private static <V> V zza(zzam<V> zzamVar) {
        try {
            return zzamVar.zzp();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzamVar.zzp();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    static boolean zza(final String str, boolean z2) {
        final boolean z3 = false;
        if (zzn()) {
            return ((Boolean) zza(new zzam(str, z3) { // from class: com.google.android.gms.internal.clearcut.zzah
                private final String zzea;
                private final boolean zzeb = false;

                {
                    this.zzea = str;
                }

                @Override // com.google.android.gms.internal.clearcut.zzam
                public final Object zzp() {
                    return zzae.zzb(this.zzea, this.zzeb);
                }
            })).booleanValue();
        }
        return false;
    }

    static final /* synthetic */ Boolean zzb(String str, boolean z2) throws Throwable {
        Context context = zzh;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("Wc\\iib`)Q\\^cW_h!)TV[Oa`", (short) (Od.Xd() ^ (-5844)))).getMethod(C1561oA.Yd("\u0015\u0014$s!!(\u001a$+\n\u001e-*(3#1", (short) (FB.Xd() ^ 5672)), new Class[0]);
        try {
            method.setAccessible(true);
            return Boolean.valueOf(zzy.zza((ContentResolver) method.invoke(context, objArr), str, z2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Nullable
    private final T zzl() throws Throwable {
        boolean zBooleanValue;
        short sXd = (short) (FB.Xd() ^ 28707);
        short sXd2 = (short) (FB.Xd() ^ 9425);
        int[] iArr = new int[";BI\u0011HA?IKQWOE\u001bRKISU[aYOJRYOV*UWUi\\UYqi[no\\ngeoqw}uk".length()];
        QB qb = new QB(";BI\u0011HA?IKQWOE\u001bRKISU[aYOJRYOV*UWUi\\UYqi[no\\ngeoqw}uk");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        if (zza(new String(iArr, 0, i2), false)) {
            String strValueOf = String.valueOf(this.zzds);
            int length = strValueOf.length();
            String strXd = C1561oA.Xd("\u0014LD6IJwK?<@FLF\u007f1JHRTZ`XN\naMYcTc\u0011Xbf\u0015\\cY`4\u001b", (short) (C1633zX.Xd() ^ (-3275)));
            if (length != 0) {
                strXd.concat(strValueOf);
            } else {
                new String(strXd);
            }
            short sXd3 = (short) (Od.Xd() ^ (-12952));
            int[] iArr2 = new int["_xr|\u0003\t\u000b\u0003|^\u0002w\u0003".length()];
            QB qb2 = new QB("_xr|\u0003\t\u000b\u0003|^\u0002w\u0003");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((sXd3 ^ i3) + xuXd2.CK(iKK2));
                i3++;
            }
            new String(iArr2, 0, i3);
        } else if (this.zzdr.zzeg != null) {
            if (this.zzdw == null) {
                Context context = zzh;
                Object[] objArr = new Object[0];
                Method method = Class.forName(Jg.Wd("<\u001c\u00157;I\u0007b\u001d<?\u001c\u0011-5\u0004\\\u001e\"<0\u0015\u0016", (short) (OY.Xd() ^ 18258), (short) (OY.Xd() ^ 25652))).getMethod(ZO.xd("'\u0006|;8~\u0010\u0005\"U+L}wc\t\u001d/", (short) (FB.Xd() ^ 9497), (short) (FB.Xd() ^ 2544)), new Class[0]);
                try {
                    method.setAccessible(true);
                    this.zzdw = zzab.zza((ContentResolver) method.invoke(context, objArr), this.zzdr.zzeg);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            final zzab zzabVar = this.zzdw;
            String str = (String) zza(new zzam(this, zzabVar) { // from class: com.google.android.gms.internal.clearcut.zzaf
                private final zzae zzdy;
                private final zzab zzdz;

                {
                    this.zzdy = this;
                    this.zzdz = zzabVar;
                }

                @Override // com.google.android.gms.internal.clearcut.zzam
                public final Object zzp() {
                    return this.zzdz.zzg().get(this.zzdy.zzds);
                }
            });
            if (str != null) {
                return zzb(str);
            }
        } else if (this.zzdr.zzef != null) {
            Context context2 = zzh;
            short sXd4 = (short) (OY.Xd() ^ 27118);
            short sXd5 = (short) (OY.Xd() ^ IptcDirectory.TAG_UNIQUE_DOCUMENT_ID);
            int[] iArr3 = new int["NDc-a\u0006*V@6k,B[?\\'\u0017sy\t6J".length()];
            QB qb3 = new QB("NDc-a\u0006*V@6k,B[?\\'\u0017sy\t6J");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + (i4 * sXd5))) + xuXd3.CK(iKK3));
                i4++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr3, 0, i4)).getMethod(Ig.wd("\u0014DG\r\u0006#=o\u0013&!\b-%2\n+0\nx$o_a", (short) (FB.Xd() ^ 10671)), new Class[0]);
            try {
                method2.setAccessible(true);
                if (((Boolean) method2.invoke(context2, objArr2)).booleanValue()) {
                    zBooleanValue = true;
                } else {
                    if (zzdq == null || !zzdq.booleanValue()) {
                        Context context3 = zzh;
                        Object[] objArr3 = {UserManager.class};
                        Method method3 = Class.forName(EO.Od("r.Hw&eFajs\u000b9YV\u000bk&V~/c D", (short) (Od.Xd() ^ (-31162)))).getMethod(C1593ug.zd("-,<\u001cC>@2;\"5CH<7:", (short) (Od.Xd() ^ (-9192)), (short) (Od.Xd() ^ (-8571))), Class.forName(C1561oA.Qd(".$8\"m+\u001f+#h|%\u0019*)", (short) (C1633zX.Xd() ^ (-30022)))));
                        try {
                            method3.setAccessible(true);
                            zzdq = Boolean.valueOf(((UserManager) method3.invoke(context3, objArr3)).isUserUnlocked());
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    zBooleanValue = zzdq.booleanValue();
                }
                if (!zBooleanValue) {
                    return null;
                }
                if (this.zzdx == null) {
                    Context context4 = zzh;
                    String str2 = this.zzdr.zzef;
                    short sXd6 = (short) (C1607wl.Xd() ^ 25822);
                    int[] iArr4 = new int["y\u0006z\b\u0004|v?s~|\u0002qy~7Kvtyi{v".length()];
                    QB qb4 = new QB("y\u0006z\b\u0004|v?s~|\u0002qy~7Kvtyi{v");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(sXd6 + sXd6 + i5 + xuXd4.CK(iKK4));
                        i5++;
                    }
                    Object[] objArr4 = {str2, 0};
                    Method method4 = Class.forName(new String(iArr4, 0, i5)).getMethod(Wg.Zd("l(p\u000biYdQ[\u0001\u001a\u0007\u0012L\u0012<O>{F", (short) (C1499aX.Xd() ^ (-14284)), (short) (C1499aX.Xd() ^ (-32482))), Class.forName(C1561oA.Kd("YQgS!`Vd^&Lnmeke", (short) (C1580rY.Xd() ^ (-16322)))), Integer.TYPE);
                    try {
                        method4.setAccessible(true);
                        this.zzdx = (SharedPreferences) method4.invoke(context4, objArr4);
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                }
                SharedPreferences sharedPreferences = this.zzdx;
                if (sharedPreferences.contains(this.zzds)) {
                    return zza(sharedPreferences);
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        return null;
    }

    @Nullable
    private final T zzm() {
        String str;
        if (this.zzdr.zzej || !zzn() || (str = (String) zza(new zzam(this) { // from class: com.google.android.gms.internal.clearcut.zzag
            private final zzae zzdy;

            {
                this.zzdy = this;
            }

            @Override // com.google.android.gms.internal.clearcut.zzam
            public final Object zzp() {
                return this.zzdy.zzo();
            }
        })) == null) {
            return null;
        }
        return zzb(str);
    }

    private static boolean zzn() {
        if (zzdp == null) {
            Context context = zzh;
            if (context == null) {
                return false;
            }
            zzdp = Boolean.valueOf(PermissionChecker.checkCallingOrSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return zzdp.booleanValue();
    }

    public final T get() throws Throwable {
        if (zzh == null) {
            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
        }
        if (this.zzdr.zzek) {
            T tZzm = zzm();
            if (tZzm != null) {
                return tZzm;
            }
            T tZzl = zzl();
            if (tZzl != null) {
                return tZzl;
            }
        } else {
            T tZzl2 = zzl();
            if (tZzl2 != null) {
                return tZzl2;
            }
            T tZzm2 = zzm();
            if (tZzm2 != null) {
                return tZzm2;
            }
        }
        return this.zzdu;
    }

    protected abstract T zza(SharedPreferences sharedPreferences);

    protected abstract T zzb(String str);

    final /* synthetic */ String zzo() throws Throwable {
        Context context = zzh;
        short sXd = (short) (Od.Xd() ^ (-24193));
        short sXd2 = (short) (Od.Xd() ^ (-20659));
        int[] iArr = new int["[g\\ie^X!U`^cS[`\u0019-XV[K]X".length()];
        QB qb = new QB("[g\\ie^X!U`^cS[`\u0019-XV[K]X");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(hg.Vd("=:H\u0016A?D4<A\u001e0=84=+7", (short) (C1607wl.Xd() ^ HttpStatus.SC_NOT_FOUND), (short) (C1607wl.Xd() ^ 30131)), new Class[0]);
        try {
            method.setAccessible(true);
            return zzy.zza((ContentResolver) method.invoke(context, objArr), this.zzdt, (String) null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
