package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d̉=!4i\bDZc|\u0004G\u00078\u000bDB\u0007\"2\u0013\u007f\u0007tsA0ZeP\u008cj[8\u0016\u0004{b,\u0004$ L[h(Ԃ:\t}M\u0010g\u001dJ\u0011Oß\u0013\n.zp-WW\u0019p \u0012JB\u001eC[M\u001e=o%ҽ:\t84(=\b\u000bи\u001e4"}, d2 = {"#H<.a(@S&", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n%=e\u001c@i\u0018.Z+EjD%\u0015>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "5dc\"<\u0014:\\\u0015\u0001zk", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r}Av%.`R\u0011/\u001b\u001c\u001fp+:\u0003a,K\u00011M\u0016[,XP\u0002\u0007$\u0016b\nW'\u000f\u0005f\u000b\u0014R,3(\u0004.I\u000f#r\u007f\u001c\u001d\u000e\u000b", "2de6V,\u001ed\u0019\b\n>4\u0001\u0018>e\r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG~7~\u001a,M#Lk=-|dj5\tc96\u0001&WSNjI0a\u001c\u0014#^\fN\u000b\u001e\u0005bP\u0004vHF.\b9\u001f", "5dc\u0011X=BQ\u0019^\f^5\fh7i\u000f7{M", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r}Av%.`R\u0011/\u001b\u001c\u001fp+:\u0003a,K\u00011M\u0016[,XP\u0002\u0007\u001c\u001cY\u001eU+\u001bNWK1n\u000e\u0016\u001f\u00190G\u0002\u001by\u0001\u0015%u1slDV\u001d/\u0004\u0014\u0006H)'37NXGRI`*D\u001d_&k\u001aB(#\u0001\u0019(>", "7rB0e,>\\\u0006~v],\nr8", "", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ExtensionsKt {
    public static final DeviceEventManagerModule.RCTDeviceEventEmitter getDeviceEventEmitter(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        JavaScriptModule jSModule = reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        Intrinsics.checkNotNullExpressionValue(jSModule, "getJSModule(...)");
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) jSModule;
    }

    public static final UIManagerModule getUIManager(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        NativeModule nativeModule = reactContext.getNativeModule((Class<NativeModule>) UIManagerModule.class);
        Intrinsics.checkNotNull(nativeModule);
        return (UIManagerModule) nativeModule;
    }

    public static final boolean isScreenReaderOn(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Qd("U\r\u007f\u007f\tR", (short) (FB.Xd() ^ 24631)));
        short sXd = (short) (OY.Xd() ^ 23824);
        short sXd2 = (short) (OY.Xd() ^ 17782);
        int[] iArr = new int["ADEHWXOIQUS_e".length()];
        QB qb = new QB("ADEHWXOIQUS_e");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        Class<?> cls = Class.forName(C1561oA.od("S_Ta]VP\u0019MXV[KSX\u0011%PNSCUP", (short) (OY.Xd() ^ 4286)));
        Class<?>[] clsArr = new Class[1];
        short sXd3 = (short) (Od.Xd() ^ (-28044));
        int[] iArr2 = new int["E=S?\rLBPJ\u00128ZYQWQ".length()];
        QB qb2 = new QB("E=S?\rLBPJ\u00128ZYQWQ");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i3));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {str};
        Method method = cls.getMethod(Wg.Zd("}Rf*U4:\u0010-w\u000f\u0001\na`G", (short) (C1607wl.Xd() ^ 10283), (short) (C1607wl.Xd() ^ 27810)), clsArr);
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            Intrinsics.checkNotNull(objInvoke, C1561oA.Xd("HPHI}BAOPRX\u0005HL\bLK^`\rb^\u0010_aa!ckcd\u0019ntlb\u001e`netrmi4}qn\u00029mpqt\u0004\u0005{u}\u0002\u007f\f\u0012G[~\u007f\u0003\u0012\u0013\n\u0004\f\u0010\u000e\u001a t\n\u0018\f\u0013\u0012 ", (short) (C1580rY.Xd() ^ (-7514))));
            AccessibilityManager accessibilityManager = (AccessibilityManager) objInvoke;
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Wg.vd("VbWd`YS\u001ccUPa\u0017IJIjwvkcikgqu);\\[\\i\t}u{}y\u0004\bZmykpmy", (short) (C1580rY.Xd() ^ (-30895)))).getMethod(Qg.kd("V_?Y^KO+]TOQSASGLJ H::C;9", (short) (C1499aX.Xd() ^ (-16302)), (short) (C1499aX.Xd() ^ (-28640))), new Class[0]);
            try {
                method2.setAccessible(true);
                return ((Boolean) method2.invoke(accessibilityManager, objArr2)).booleanValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
