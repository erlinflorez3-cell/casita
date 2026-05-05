package com.davivienda.daviviendaapp;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.webkit.WebView;
import com.airbnb.android.react.lottie.LottiePackage;
import com.braze.BrazeActivityLifecycleCallbackListener;
import com.braze.support.BrazeLogger;
import com.dynatrace.android.callback.Callback;
import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.defaults.DefaultReactHost;
import com.facebook.react.defaults.DefaultReactNativeHost;
import com.facebook.react.soloader.OpenSourceMergedSoMapping;
import com.facebook.soloader.SoLoader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.GF;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012}\bnjO0LeN/ZS8\u000fsڔ<$q$yّCU0}*ޛWN}gvϺpŏs\u000f4\u0015)jZI\u0016{ٕ\u0016\u000f@C8EAW\b=gk;JM:@.P{\u001b\u007fH7x\u0016\u0005\t[M\"\u0011^O!>`\u001de\u0005H#LRp\u0013,^\u007fNdK#2\u0011Ǚ%ɨmFf)e4\u000bR]Xb-%v\u0010%\u0002¿9߱\u0019+[Έ\u001fTaG\u0011HѥA\u0017"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n\u001dU\u0002)\u0013x!5QA7z8(\u001e>", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VK\u0019G})3U\r$Avk", "u(E", "@dP0g\u000fHa(", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VR\u0018J\u0006z", "5dc\u001fX(<b{\t\tm", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0004\u0017Cm\u001d\u001f\u00013D/", "@dP0g\u0015:b\u001d\u0010zA6\u000b\u0018", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VX\nKz65<\b.FC", "5dc\u001fX(<b\u0002z\nb=|k9s\u000f", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0004\u0017Cm\u001d%r49j}\u0003A{%\u0004", "=m2?X(MS", "", "@dV6f;>`\u0006~x^0\u000e\t<", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "@dR2\\=>`", "\u001a`]1e6BRb|\u0005g;|\u0012>/\\5\u0006<\u007f\u0015\u0013U~z<t%9j}-\r", "4h[AX9", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&wKv\u001d<\u0004z", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class MainApplication extends Application implements ReactApplication {
    private final ReactNativeHost reactNativeHost = new DefaultReactNativeHost(this) { // from class: com.davivienda.daviviendaapp.MainApplication$reactNativeHost$1
        private final boolean isHermesEnabled;
        private final boolean isNewArchEnabled;

        {
            super(this);
            this.isHermesEnabled = true;
        }

        @Override // com.facebook.react.ReactNativeHost
        protected String getJSMainModuleName() {
            return Qg.kd("-1&&8", (short) (ZN.Xd() ^ ((817001415 ^ 1995310347) ^ 1180448646)), (short) (ZN.Xd() ^ (167656688 ^ 167641726)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.ReactNativeHost
        protected List<ReactPackage> getPackages() throws Throwable {
            ArrayList<ReactPackage> packages = new PackageList(this).getPackages();
            packages.add(new LottiePackage());
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(hg.Vd("mxu5jfzlxjemb^*_[oam_ZbWSR`_\u001c?QLM]8HIPEJGT", (short) (C1499aX.Xd() ^ (1825504614 ^ (-1825485532))), (short) (C1499aX.Xd() ^ ((1546086107 ^ 1204338772) ^ (-468710802))))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                packages.add(constructor.newInstance(objArr));
                Object[] objArr2 = new Object[0];
                Constructor<?> constructor2 = Class.forName(C1561oA.ud("*52q'#7)5'\"*\u001f\u001bf\u001c\u0018,\u001e*\u001c\u0017\u001f\u0014\u0010\u000f\u001d\u001cX\f\u001b\u0011\u000b\r\n\u0017P\u0016\n\u0003\r\r\u0014Ic]f\u0007\u000ehyv\b\u0004y\u0004\b`\u0002t~nXhipejg", (short) (C1607wl.Xd() ^ ((1330454731 ^ 434269020) ^ 1454341927)))).getConstructor(new Class[0]);
                try {
                    constructor2.setAccessible(true);
                    packages.add(constructor2.newInstance(objArr2));
                    short sXd = (short) (C1499aX.Xd() ^ ((979234894 ^ 263098737) ^ (-905139465)));
                    int[] iArr = new int["/<;|,*@4J>;E42\u007f7=SGUA>H?EFVW\u000eCTL\u0010\u0014\u0013\"U\f\u0016\u0010\u0015\u001b/d\u0002~t\u001f!\u001e$8\b\u001a\u001d&%,+".length()];
                    QB qb = new QB("/<;|,*@4J>;E42\u007f7=SGUA>H?EFVW\u000eCTL\u0010\u0014\u0013\"U\f\u0016\u0010\u0015\u001b/d\u0002~t\u001f!\u001e$8\b\u001a\u001d&%,+");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                        i2++;
                    }
                    Object[] objArr3 = new Object[0];
                    Constructor<?> constructor3 = Class.forName(new String(iArr, 0, i2)).getConstructor(new Class[0]);
                    try {
                        constructor3.setAccessible(true);
                        packages.add(constructor3.newInstance(objArr3));
                        Intrinsics.checkNotNullExpressionValue(packages, C1561oA.Yd(":JKHV\u0006\r\u000e\u000f\u000b", (short) (Od.Xd() ^ ((245976944 ^ 1422009989) ^ (-1516971638)))));
                        return packages;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }

        @Override // com.facebook.react.ReactNativeHost
        public boolean getUseDeveloperSupport() {
            return false;
        }

        @Override // com.facebook.react.defaults.DefaultReactNativeHost
        protected Boolean isHermesEnabled() {
            return Boolean.valueOf(this.isHermesEnabled);
        }

        @Override // com.facebook.react.defaults.DefaultReactNativeHost
        protected boolean isNewArchEnabled() {
            return this.isNewArchEnabled;
        }
    };

    @Override // com.facebook.react.ReactApplication
    public ReactHost getReactHost() throws Throwable {
        Context applicationContext = getApplicationContext();
        short sXd = (short) (C1633zX.Xd() ^ ((473770837 ^ 1853740477) ^ (-1916841032)));
        short sXd2 = (short) (C1633zX.Xd() ^ (905142992 ^ (-905132184)));
        int[] iArr = new int["\u007f~\u000f\\\r\u000e\u000b\t\u0004\u0003\u0017\r\u0014\u0014i\u0017\u0017\u001e\u0010$!U\\]^Z".length()];
        QB qb = new QB("\u007f~\u000f\\\r\u000e\u000b\t\u0004\u0003\u0017\r\u0014\u0014i\u0017\u0017\u001e\u0010$!U\\]^Z");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Intrinsics.checkNotNullExpressionValue(applicationContext, new String(iArr, 0, i2));
        int iXd = FB.Xd() ^ 1609528322;
        int iXd2 = FB.Xd();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("f\fF\"D]0?8F~!\u0003\u001c$v R\u0002*\t!cu^yEb\fG\u0017;kWC^F_\u001710@\u0003\u001b", (short) (iXd2 ^ (2130748293 ^ 2130745583)), (short) (FB.Xd() ^ iXd))).getMethod(ZO.xd("fK/\u0002j\u0015\u0005^F8X\u0004TM\u0010#XR", (short) (C1633zX.Xd() ^ ((773511694 ^ 1916143300) ^ (-1546439400))), (short) (C1633zX.Xd() ^ (289092828 ^ (-289092131)))), new Class[0]);
        try {
            method.setAccessible(true);
            return DefaultReactHost.getDefaultReactHost(applicationContext, (ReactNativeHost) method.invoke(this, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.react.ReactApplication
    public ReactNativeHost getReactNativeHost() {
        return this.reactNativeHost;
    }

    @Override // android.app.Application
    public void onCreate() throws Throwable {
        GF.Yd(this);
        Callback.onCreate(this);
        super.onCreate();
        BrazeLogger.setLogLevel((1977020032 ^ 1065058186) ^ 1252888841);
        registerActivityLifecycleCallbacks(new BrazeActivityLifecycleCallbackListener(false, false, null, null, (44378346 ^ 486880382) ^ 530586779, null));
        SoLoader.init(this, OpenSourceMergedSoMapping.INSTANCE);
        WebView.setWebContentsDebuggingEnabled(false);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Object obj;
        Intrinsics.checkNotNullParameter(intentFilter, C1626yg.Ud("s^>\u000ect", (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (1977993075 ^ (-914280777)))), (short) (C1607wl.Xd() ^ (ZN.Xd() ^ (54558773 ^ 818588118)))));
        int i2 = Build.VERSION.SDK_INT;
        int iXd = Od.Xd() ^ 1207800951;
        if (i2 >= iXd) {
            ApplicationInfo applicationInfo = getApplicationInfo();
            String strWd = Ig.wd("K\t-b?d\u0004tc_XHjqo\u000bt\f\u0004~g?)\u001ee/$`@1ovJ-", (short) (ZN.Xd() ^ ((2023273565 ^ 1499278413) ^ 566616893)));
            String strOd = EO.Od("\f'hz\nv'\u0012hdo\u001dio_\u0002", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (685555664 ^ (-1552790661)))));
            try {
                Class<?> cls = Class.forName(strWd);
                Field field = 1 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            if (((Integer) obj).intValue() >= iXd) {
                return super.registerReceiver(broadcastReceiver, intentFilter, 771581700 ^ 771581702);
            }
        }
        return super.registerReceiver(broadcastReceiver, intentFilter);
    }
}
