package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
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

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG0LeN.ZS8\u001bs{:$aӜqYП\u0006\u001a,!IVTg̊rL`\u000bQ\u0010N3\u0007qDI\u0004~\u000e\u0016\u001d5Zom5}sK>xtd\tf7ŕ<{\u000b\b(2\u0011\u001f\u0005\u0002[M\"\u0011^I7?ň\u0011O\u000b! \u0010\u0007/\u000f)tid5vu$?ǥ'\u0005oM\\1"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\n\b\b\u0013\u0014?S", "", "\nh]6g\u0005", "u(E", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\by\u0013\u0014?S", ">/", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\b\u0001\u0013\u0014?S", ">0", "", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn:B(#8cu\u001ek 6\u0017?FvB\u001f\u001c|aFPg5]v4PHUu83p\t\u001e\u007f9s$n}", "", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFa1vSDK {
    public static final AFa1vSDK INSTANCE = new AFa1vSDK();

    private AFa1vSDK() {
    }

    public static String getCurrencyIso4217Code() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }

    public static String getMonetizationNetwork() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    @JvmStatic
    public static final void getMonetizationNetwork(AFc1hSDK aFc1hSDK, AFc1oSDK aFc1oSDK) {
        int i2;
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFj1kSDK.getRevenue()) {
            AFLogger.afRDLog(Xg.qd("\r\u000f\u0010\u0010a');/*-h0:A;2", (short) (C1580rY.Xd() ^ (-11690)), (short) (C1580rY.Xd() ^ (-19491))));
            i2 = 23;
        } else {
            i2 = 18;
        }
        if (Build.VERSION.SDK_INT < i2 || appsFlyerProperties.getBoolean(Jg.Wd(":1D(I33\u00148?\\Zsi46Jat\u001b\u001b'%\u0005", (short) (C1607wl.Xd() ^ 30892), (short) (C1607wl.Xd() ^ 29210)), true)) {
            AFLogger.afRDLog(Wg.vd("JM\u0019K;A\u0015]v?", (short) (C1633zX.Xd() ^ (-6589))) + Build.VERSION.SDK_INT + Qg.kd("\u0006i77f\u0011*=\u0016602$]2/\u001c!\u001e", (short) (FB.Xd() ^ 10797), (short) (FB.Xd() ^ 11226)));
            return;
        }
        AFLogger.afRDLog(ZO.xd("pP@,\u001f?-\be\u0005", (short) (OY.Xd() ^ 6167), (short) (OY.Xd() ^ 19951)) + Build.VERSION.SDK_INT + C1626yg.Ud("\u0006[X\byZN$}?[N\u00171", (short) (Od.Xd() ^ (-25751)), (short) (Od.Xd() ^ (-32661))));
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(aFc1hSDK.getMonetizationNetwork);
        if (aFKeystoreWrapper.AFAdRevenueData()) {
            String monetizationNetwork = aFKeystoreWrapper.getMonetizationNetwork();
            synchronized (aFKeystoreWrapper.getMediationNetwork) {
                aFKeystoreWrapper.AFAdRevenueData++;
                AFLogger.afInfoLog(Ig.wd(">,?m2b90\u0012\u0013\u0005!\u0019|h\u0013^}\u0005&\\\u001eL\u0011\u0014", (short) (ZN.Xd() ^ 9397)).concat(String.valueOf(monetizationNetwork)));
                try {
                    synchronized (aFKeystoreWrapper.getMediationNetwork) {
                        KeyStore keyStore = aFKeystoreWrapper.getMonetizationNetwork;
                        Object[] objArr = {monetizationNetwork};
                        Method method = Class.forName(EO.Od("+Y\u0013\u001b2=\u0011X>L[\u000b?g\u0003D}wBs:j", (short) (C1607wl.Xd() ^ 30281))).getMethod(C1593ug.zd("\u001d\u001f'!1#\u0004.54<", (short) (Od.Xd() ^ (-21788)), (short) (Od.Xd() ^ (-4409))), Class.forName(C1561oA.Qd("\u0012\b\u001c\u0006Q\u000f\u0003\u000f\u0007Lp\u0011\u000e\u0004\b\u007f", (short) (C1607wl.Xd() ^ 27429))));
                        try {
                            method.setAccessible(true);
                            method.invoke(keyStore, objArr);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                } catch (KeyStoreException e3) {
                    AFLogger.afErrorLog(new StringBuilder(C1561oA.od("\u0017I34>A5:8h", (short) (C1580rY.Xd() ^ (-24351)))).append(e3.getMessage()).append(C1561oA.Kd(":\u000b\u007f\u0001\u0014\u0012\u0013\u0007\u0007", (short) (ZN.Xd() ^ 21441))).toString(), e3);
                }
            }
            aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getMonetizationNetwork());
        } else {
            aFKeystoreWrapper.getCurrencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(aFc1oSDK.getMediationNetwork);
            aFKeystoreWrapper.AFAdRevenueData = 0;
            aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getMonetizationNetwork());
        }
        appsFlyerProperties.set(Wg.Zd("wJ\u0019\u0013\u0004Q\u0005us*\u0018AE", (short) (C1499aX.Xd() ^ (-19173)), (short) (C1499aX.Xd() ^ (-17932))), aFKeystoreWrapper.getCurrencyIso4217Code());
        short sXd = (short) (ZN.Xd() ^ 1777);
        int[] iArr = new int["=F5efj>es`nOGBovpwiw".length()];
        QB qb = new QB("=F5efj>es`nOGBovpwiw");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
            i3++;
        }
        appsFlyerProperties.set(new String(iArr, 0, i3), String.valueOf(aFKeystoreWrapper.getRevenue()));
    }
}
