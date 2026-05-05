package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLc\u000b\u0004I\u00066\f6B\r.4\u0012}\u0007njO0LeN.ZS@\u000fs{B-c$wECU0}*\tUNog\u0005Jb\u000bI\u0010\f:\u000f̓J_\u0006x\f\u0011G1X0LCQ}>Q`#6ӯ$4(:\b\bI'8M(v)G\u0012/ܘ4Bv?`\u0013\u0016\u0012(\u001a\u001e>N\bdaʄR8NtkCw:\u0011uZNUj`\u0003[\u000e^V=\f%kd-Ë;7\u001b1a\u0010O_iM\u001b? HK\rҊ+-O\u0002eE)\u0016\"\u001aCQ#\\!6\u0013\b\u0010bbʲ5յgOX\u0010.\t\t\u000e]P\u0012\u001c\u001e)^-[-\u001d\bdޛvɤWDX\u0004dV\u000e\u0010"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0012\b\u0003\u0013\u0014?S", "", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "", "\u000fE01E,OS\"\u000fz=(\f\u0005", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0012\b\u0004\u0013\u0014?S", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "u(;0b4\bO$\n\t_3\u0011\t</\u00041\u000b@\u000e \u0013N9i\u001dzpBG\\\u0006\r", "\u001a`]1e6BRb\bzmue\t>w\n5\u0002$\n\u0018!\u001d", "", "D^", "uKP;W9HW\u0018H\u0004^;Fq/t\u00122\tFd \u0018QEQ1", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "u(I", "\u001a`]1e6BRb\bzmuZ\u00138n\u007f&\u000bD\u0012\u001b&[W\nEr'5fS", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "\u001a`]1e6BRb\bzmuZ\u00138n\u007f&\u000bD\u0012\u001b&[W\nEr'5fS", "\u001a`]1e6BRb\u000eze,\b\f9n\u0014qj@\b\u0017\"Jy\u0017P^!>U\u007f DC", "5dc\u001fX=>\\)~", "\u001a`]1e6BRb\u000eze,\b\f9n\u0014qj@\b\u0017\"Jy\u0017P^!>U\u007f DC", "\u000fEP}i\u001a\u001d9"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class AFi1qSDK {
    public static final AFa1vSDK AFa1vSDK = new AFa1vSDK(null);
    ConnectivityManager getCurrencyIso4217Code;
    private final TelephonyManager getRevenue;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0004Gّ1!Ǟr~P+R~\rfʴ=2JeV/"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0012\b\u0003\u0013\u0014?<{\u0018ia?;\"!A", "", "\nh]6g\u0005", "u(E"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AFa1vSDK {
        private AFa1vSDK() {
        }

        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFi1qSDK(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        Object[] objArr = {Ig.wd("pEb\u0003\u0012J7%^}r\u0012", (short) (C1607wl.Xd() ^ 4188))};
        Method method = Class.forName(EO.Od("\u0017J4$yAJM.87\u001d=B^wB\u0003+KwDP", (short) (C1580rY.Xd() ^ (-1052)))).getMethod(C1593ug.zd("dcsSzuwirYlz\u007fsnq", (short) (ZN.Xd() ^ 10740), (short) (ZN.Xd() ^ 23922)), Class.forName(C1561oA.Qd("3)='r0$0(m\u00122/%)!", (short) (C1499aX.Xd() ^ (-25550)))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            this.getCurrencyIso4217Code = objInvoke instanceof ConnectivityManager ? (ConnectivityManager) objInvoke : null;
            String strOd = C1561oA.od("5,20&", (short) (C1633zX.Xd() ^ (-17339)));
            Class<?> cls = Class.forName(C1561oA.Kd("\u001c*!0.)%o&33:,6=w\u000e;;B4HE", (short) (C1580rY.Xd() ^ (-623))));
            Class<?>[] clsArr = {Class.forName(Wg.Zd("\u0001OZ;}r]`_\u001cw\u000f\u0003o+\u001a", (short) (C1499aX.Xd() ^ (-139)), (short) (C1499aX.Xd() ^ (-22763))))};
            Object[] objArr2 = {strOd};
            short sXd = (short) (C1580rY.Xd() ^ (-27910));
            int[] iArr = new int["vu\u0006e\r\b\n{\u0005k~\r\u0012\u0006\u0001\u0004".length()];
            QB qb = new QB("vu\u0006e\r\b\n{\u0005k~\r\u0012\u0006\u0001\u0004");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method2.setAccessible(true);
                Object objInvoke2 = method2.invoke(context, objArr2);
                this.getRevenue = objInvoke2 instanceof TelephonyManager ? (TelephonyManager) objInvoke2 : null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    protected static boolean v_(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            return networkInfo.isConnectedOrConnecting();
        }
        return false;
    }

    protected abstract String AFAdRevenueData();

    public abstract boolean getMediationNetwork();

    public final AFi1rSDK getMonetizationNetwork() {
        String str;
        String simOperatorName;
        String networkOperatorName = null;
        try {
            TelephonyManager telephonyManager = this.getRevenue;
            if (telephonyManager != null) {
                simOperatorName = telephonyManager.getSimOperatorName();
                try {
                    networkOperatorName = telephonyManager.getNetworkOperatorName();
                    String str2 = networkOperatorName;
                    if (str2 == null || str2.length() == 0) {
                        if (telephonyManager.getPhoneType() == 2) {
                            networkOperatorName = "CDMA";
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    str = networkOperatorName;
                    networkOperatorName = simOperatorName;
                    AFLogger.afErrorLog("Exception while collecting network info. ", th);
                    simOperatorName = networkOperatorName;
                    networkOperatorName = str;
                }
            } else {
                simOperatorName = null;
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
        return new AFi1rSDK(AFAdRevenueData(), networkOperatorName, simOperatorName, getMediationNetwork());
    }
}
