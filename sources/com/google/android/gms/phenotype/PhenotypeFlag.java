package com.google.android.gms.phenotype;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import android.os.UserManager;
import androidx.core.content.PermissionChecker;
import com.google.android.gms.tapandpay.TapAndPayStatusCodes;
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
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public abstract class PhenotypeFlag<T> {
    private static final Object zzak = new Object();
    private static Context zzal = null;
    private static boolean zzam = false;
    private static Boolean zzan = null;
    private final Factory zzao;
    final String zzap;
    private final String zzaq;
    private final T zzar;
    private T zzas;

    public static class Factory {
        private final String zzax;
        private final Uri zzay;
        private final String zzaz;
        private final String zzba;
        private final boolean zzbb;
        private final boolean zzbc;

        public Factory(Uri uri) {
            this(null, uri, "", "", false, false);
        }

        private Factory(String str, Uri uri, String str2, String str3, boolean z2, boolean z3) {
            this.zzax = str;
            this.zzay = uri;
            this.zzaz = str2;
            this.zzba = str3;
            this.zzbb = z2;
            this.zzbc = z3;
        }

        public PhenotypeFlag<String> createFlag(String str, String str2) {
            return PhenotypeFlag.zza(this, str, str2);
        }

        public Factory withGservicePrefix(String str) {
            boolean z2 = this.zzbb;
            if (z2) {
                throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
            }
            return new Factory(this.zzax, this.zzay, str, this.zzba, z2, this.zzbc);
        }

        public Factory withPhenotypePrefix(String str) {
            return new Factory(this.zzax, this.zzay, this.zzaz, str, this.zzbb, this.zzbc);
        }
    }

    interface zza<V> {
        V zzh();
    }

    private PhenotypeFlag(Factory factory, String str, T t2) {
        this.zzas = null;
        if (factory.zzax == null && factory.zzay == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (factory.zzax != null && factory.zzay != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzao = factory;
        String strValueOf = String.valueOf(factory.zzaz);
        String strValueOf2 = String.valueOf(str);
        this.zzaq = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        String strValueOf3 = String.valueOf(factory.zzba);
        String strValueOf4 = String.valueOf(str);
        this.zzap = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
        this.zzar = t2;
    }

    /* synthetic */ PhenotypeFlag(Factory factory, String str, Object obj, zzr zzrVar) {
        this(factory, str, obj);
    }

    public static void maybeInit(Context context) {
        com.google.android.gms.internal.phenotype.zzh.maybeInit(context);
        if (zzal == null) {
            com.google.android.gms.internal.phenotype.zzh.init(context);
            synchronized (zzak) {
                Object[] objArr = new Object[0];
                Method method = Class.forName(EO.Od("\u0013i1'|4K<-\u001d\u001a}\u001e1O&\u0001\u0017m[\bf\u0001", (short) (C1580rY.Xd() ^ (-15064)))).getMethod(C1561oA.Qd("ktDdtf_`Jkgk[XhXVDd^`NSP", (short) (FB.Xd() ^ 2102)), new Class[0]);
                try {
                    method.setAccessible(true);
                    if (!((Boolean) method.invoke(context, objArr)).booleanValue()) {
                        Class<?> cls = Class.forName(C1593ug.zd("x\u0007}\r\u000b\u0006\u0002L\u0003\u0010\u0010\u0017\t\u0013\u001aTj\u0018\u0018\u001f\u0011%\"", (short) (C1580rY.Xd() ^ (-3204)), (short) (C1580rY.Xd() ^ (-22836))));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr2 = new Object[0];
                        short sXd = (short) (OY.Xd() ^ 424);
                        int[] iArr = new int["B?M\u0019GFA=63E9><\u0010;9>.@;".length()];
                        QB qb = new QB("B?M\u0019GFA=63E9><\u0010;9>.@;");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                            i2++;
                        }
                        Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
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
                    if (zzal != context) {
                        zzan = null;
                    }
                    zzal = context;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            zzam = false;
        }
    }

    public static PhenotypeFlag<String> zza(Factory factory, String str, String str2) {
        return new zzs(factory, str, str2);
    }

    private static <V> V zza(zza<V> zzaVar) {
        try {
            return zzaVar.zzh();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzaVar.zzh();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    static boolean zza(final String str, boolean z2) {
        final boolean z3 = false;
        if (zzf()) {
            return ((Boolean) zza(new zza(str, z3) { // from class: com.google.android.gms.phenotype.zzq
                private final String zzav;
                private final boolean zzaw = false;

                {
                    this.zzav = str;
                }

                @Override // com.google.android.gms.phenotype.PhenotypeFlag.zza
                public final Object zzh() {
                    return PhenotypeFlag.zzb(this.zzav, this.zzaw);
                }
            })).booleanValue();
        }
        return false;
    }

    static final /* synthetic */ Boolean zzb(String str, boolean z2) throws Throwable {
        Context context = zzal;
        Class<?> cls = Class.forName(C1561oA.Kd("(6-<:51{2??F8BI\u0004\u001aGGN@TQ", (short) (C1607wl.Xd() ^ 14083)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-23300));
        short sXd2 = (short) (C1499aX.Xd() ^ (-31135));
        int[] iArr = new int["^\u0003h;>Q}Cb-!h=M\u0011/t&".length()];
        QB qb = new QB("^\u0003h;>Q}Cb-!h=M\u0011/t&");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return Boolean.valueOf(com.google.android.gms.internal.phenotype.zzf.zza((ContentResolver) method.invoke(context, objArr), str, z2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Nullable
    private final T zzd() throws Throwable {
        if (zza(C1561oA.Xd("*18\u007f70.8:@F>4\nA:8BDJPH>9AH>E\u0019DFDXKDH`XJ]^K]VT^`fldZ", (short) (ZN.Xd() ^ 29917)), false)) {
            String strValueOf = String.valueOf(this.zzap);
            int length = strValueOf.length();
            String strWd = Ig.wd("]]fw\u0012LL ;cd\u0010IL\u0001WB!r;\tVkd72?!$fHY\bs|`\bq]uL\u001b", (short) (FB.Xd() ^ 25783));
            if (length != 0) {
                strWd.concat(strValueOf);
            } else {
                new String(strWd);
            }
            EO.Od("$dQA[=Tm1TvK\u001c", (short) (FB.Xd() ^ 21907));
        } else if (this.zzao.zzay != null) {
            Context context = zzal;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("eqjwwpn7oz|\u0002u}\u0007?7bdi]on", (short) (OY.Xd() ^ 24230))).getMethod(Qg.kd("OLZ(SQVFNS0BOJFO=I", (short) (C1607wl.Xd() ^ 24071), (short) (C1607wl.Xd() ^ 22547)), new Class[0]);
            try {
                method.setAccessible(true);
                final com.google.android.gms.phenotype.zza zzaVarZza = com.google.android.gms.phenotype.zza.zza((ContentResolver) method.invoke(context, objArr), this.zzao.zzay);
                String str = (String) zza(new zza(this, zzaVarZza) { // from class: com.google.android.gms.phenotype.zzo
                    private final PhenotypeFlag zzat;
                    private final zza zzau;

                    {
                        this.zzat = this;
                        this.zzau = zzaVarZza;
                    }

                    @Override // com.google.android.gms.phenotype.PhenotypeFlag.zza
                    public final Object zzh() {
                        return this.zzau.zza().get(this.zzat.zzap);
                    }
                });
                if (str != null) {
                    return zza(str);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else if (this.zzao.zzax != null) {
            Context context2 = zzal;
            Class<?> cls = Class.forName(hg.Vd("P\\Q^ZSM\u0016JUSXHPU\u000e\"MKP@RM", (short) (C1633zX.Xd() ^ (-7051)), (short) (C1633zX.Xd() ^ (-9595))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd = (short) (Od.Xd() ^ (-21532));
            int[] iArr = new int["8A\u00111A3,-\u0017848(%5%#\u00111+-\u001b \u001d".length()];
            QB qb = new QB("8A\u00111A3,-\u0017848(%5%#\u00111+-\u001b \u001d");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method2.setAccessible(true);
                if (!((Boolean) method2.invoke(context2, objArr2)).booleanValue()) {
                    Context context3 = zzal;
                    Class<?> cls2 = Class.forName(C1561oA.yd("\u0001\u000f\u0002\u0011\u0013\u000e\u0006P\u000b\u0018\u0014\u001b\u0011\u001b\u001eXR\u007f{\u0003x\r\u0006", (short) (OY.Xd() ^ 32090)));
                    Class<?>[] clsArr2 = new Class[1];
                    short sXd2 = (short) (C1580rY.Xd() ^ (-8178));
                    int[] iArr2 = new int["\u007fw\u000eyG\u0007|\u000b\u0005Lb\r\u0003\u0016\u0017".length()];
                    QB qb2 = new QB("\u007fw\u000eyG\u0007|\u000b\u0005Lb\r\u0003\u0016\u0017");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                        i3++;
                    }
                    clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
                    Object[] objArr3 = {UserManager.class};
                    Method method3 = cls2.getMethod(Xg.qd("YXhHojl^gNaothcf", (short) (FB.Xd() ^ 20604), (short) (FB.Xd() ^ 26362)), clsArr2);
                    try {
                        method3.setAccessible(true);
                        if (!((UserManager) method3.invoke(context3, objArr3)).isUserUnlocked()) {
                            return null;
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                Context context4 = zzal;
                String str2 = this.zzao.zzax;
                Class<?> cls3 = Class.forName(Jg.Wd("[tHvRyP8LhdIVMr\u000b>6S7(iD", (short) (OY.Xd() ^ 24353), (short) (OY.Xd() ^ 24614)));
                Class<?>[] clsArr3 = new Class[2];
                short sXd3 = (short) (OY.Xd() ^ 12495);
                short sXd4 = (short) (OY.Xd() ^ 18447);
                int[] iArr3 = new int["\u00034\u000455EIH.\u0004\t\u001d\f\u007f\u0018\u0002".length()];
                QB qb3 = new QB("\u00034\u000455EIH.\u0004\t\u001d\f\u007f\u0018\u0002");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd4) + sXd3)));
                    i4++;
                }
                clsArr3[0] = Class.forName(new String(iArr3, 0, i4));
                clsArr3[1] = Integer.TYPE;
                Object[] objArr4 = {str2, 0};
                short sXd5 = (short) (FB.Xd() ^ 21605);
                short sXd6 = (short) (FB.Xd() ^ 25156);
                int[] iArr4 = new int["L^L{\n8?8\u0018W#\u0004|J\u0001G%C\u001f(".length()];
                QB qb4 = new QB("L^L{\n8?8\u0018W#\u0004|J\u0001G%C\u001f(");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i5 * sXd6))) + xuXd4.CK(iKK4));
                    i5++;
                }
                Method method4 = cls3.getMethod(new String(iArr4, 0, i5), clsArr3);
                try {
                    method4.setAccessible(true);
                    SharedPreferences sharedPreferences = (SharedPreferences) method4.invoke(context4, objArr4);
                    if (sharedPreferences.contains(this.zzap)) {
                        return zza(sharedPreferences);
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        return null;
    }

    @Nullable
    private final T zze() {
        String str;
        if (this.zzao.zzbb || !zzf() || (str = (String) zza(new zza(this) { // from class: com.google.android.gms.phenotype.zzp
            private final PhenotypeFlag zzat;

            {
                this.zzat = this;
            }

            @Override // com.google.android.gms.phenotype.PhenotypeFlag.zza
            public final Object zzh() {
                return this.zzat.zzg();
            }
        })) == null) {
            return null;
        }
        return zza(str);
    }

    private static boolean zzf() {
        if (zzan == null) {
            Context context = zzal;
            if (context == null) {
                return false;
            }
            zzan = Boolean.valueOf(PermissionChecker.checkCallingOrSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return zzan.booleanValue();
    }

    public T get() throws Throwable {
        if (zzal == null) {
            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
        }
        if (this.zzao.zzbc) {
            T tZze = zze();
            if (tZze != null) {
                return tZze;
            }
            T tZzd = zzd();
            if (tZzd != null) {
                return tZzd;
            }
        } else {
            T tZzd2 = zzd();
            if (tZzd2 != null) {
                return tZzd2;
            }
            T tZze2 = zze();
            if (tZze2 != null) {
                return tZze2;
            }
        }
        return this.zzar;
    }

    public abstract T zza(SharedPreferences sharedPreferences);

    public abstract T zza(String str);

    final /* synthetic */ String zzg() throws Throwable {
        Context context = zzal;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("\u0015!\u0016#\u001f\u0018\u0012Z\u000f\u001a\u0018\u001d\r\u0015\u001aRf\u0012\u0010\u0015\u0005\u0017\u0012", (short) (C1580rY.Xd() ^ (-26005)))).getMethod(C1593ug.zd("#\"2\u0002//6(29\u0018,;86A1?", (short) (OY.Xd() ^ 23997), (short) (OY.Xd() ^ TapAndPayStatusCodes.TAP_AND_PAY_SUPERVISED_CHILD_ACCOUNT_WITH_NON_NFC_DEVICE)), new Class[0]);
        try {
            method.setAccessible(true);
            return com.google.android.gms.internal.phenotype.zzf.zza((ContentResolver) method.invoke(context, objArr), this.zzaq, (String) null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
