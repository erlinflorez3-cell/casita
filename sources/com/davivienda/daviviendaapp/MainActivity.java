package com.davivienda.daviviendaapp;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.davivienda.daviviendaapp.bridges.gpay.AntelopWalletModule;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.defaults.DefaultReactActivityDelegate;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.npmdavi.davinotification.NotificationReceiver;
import fr.antelop.sdk.util.AndroidActivityResultCallback;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.devio.rn.splashscreen.SplashScreen;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.Kp;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјnjG0L͜P.hS2\u000fq{<$i*yCAW\"}8\tWNmjvJp\u000bKƤ\u000e\u0016\u000fj4կkތ\u000e\u0012=1\u0003rУ7M}=\u0002f\u00037\u001d `$~\fM\u0007(-`\u0010%~\n]T >E\t:\u0001\u0013}\t(\u0019\u001e>N\td\\0nDQ\u0005]h5S\u0007wLf'\u000e;-Q\u001bRl';\u0002\u0012$9MO7+$\u0002\u000bMf$O\u0011M\n=3nW-9X\fYLW.$[=\u0018\u001bk\u0004>\\3W\u0011\u001052gcyXT<@\u0001\n\u001fT\u0004<\fmZvM(y \u000eaz#WNd\u001a^p\u0004+gD,=\u0002I*g1\u0017UoR1Ne\u0014K\r̽'\u001a"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n\u001dU\u0002)\u0013k%2^GJ\u007f\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VK\fKz69h\u0012u", "u(E", "1qT.g,+S\u0015|\n:*\f\r@i\u000f<Z@\b\u0017\u0019C~\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VK\fKz69h\u0012~7t\u00160IR;A", "5dc\u001aT0G1#\u0007\u0006h5|\u0012>N{0{", "", "6`]1_,\"\\(~\u0004m", "", "7mc2a;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "=m00g0OW(\u0013g^:\r\u0010>", "@d`BX:M1#}z", "", "@dbB_;\u001c]\u0018~", "2`c.", "=m2?X(MS", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=m=2j\u0010Gb\u0019\b\n", "=mA2f<FS", "Ad]18=>\\(", "3uT;g\u0015:[\u0019", ">`a.`:", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class MainActivity extends ReactActivity {
    private final void handleIntent(Intent intent) {
        C1561oA.Yd("I^gmAdvlznz\u00015qkypysX~\u0006w\u0002\t", (short) (ZN.Xd() ^ (2036889593 ^ 2036890187)));
        intent.toString();
        if (intent.getBooleanExtra(Xg.qd("ANLK-OUKIMHG[QXX", (short) (Od.Xd() ^ (ZN.Xd() ^ (-864707055))), (short) (Od.Xd() ^ (ZN.Xd() ^ (1103096498 ^ (-1916133355))))), false)) {
            Serializable serializableExtra = intent.getSerializableExtra(Jg.Wd("\n{0R\u0003v$S\u001ay1c^\u000b/k", (short) (Od.Xd() ^ ((541222860 ^ 297567611) ^ (-838781966))), (short) (Od.Xd() ^ (1895336254 ^ (-1895352013)))));
            HashMap map = serializableExtra instanceof HashMap ? (HashMap) serializableExtra : null;
            if (map != null) {
                Intent intent2 = new Intent(this, (Class<?>) NotificationReceiver.class);
                intent2.setFlags(734867767 ^ 466432311);
                intent2.setAction(ZO.xd("\u007f\u0011\bTY}\u000fOh[9Q.\bb0\\\u0010>A;>b@&9\u0012\u0018\f\u0004\\$'D{\u0007hu\u001d\t\u0001GZ-Ped\\", (short) (C1633zX.Xd() ^ ((830543907 ^ 614397092) ^ (-354386112))), (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134251954))));
                String strUd = C1626yg.Ud("$\u0004;g\\", (short) (FB.Xd() ^ (1678890516 ^ 1678875206)), (short) (FB.Xd() ^ ((1619782196 ^ 170929025) ^ 1790689369)));
                Object obj = map.get(strUd);
                intent2.putExtra(strUd, obj instanceof String ? (String) obj : null);
                String strWd = Ig.wd("C`!@F(y", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (261442309 ^ 1042040796))));
                Object obj2 = map.get(strWd);
                intent2.putExtra(strWd, obj2 instanceof String ? (String) obj2 : null);
                short sXd = (short) (FB.Xd() ^ ((1138045444 ^ 1034952426) ^ 2120555952));
                int[] iArr = new int["\fk".length()];
                QB qb = new QB("\fk");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                Object obj3 = map.get(str);
                intent2.putExtra(str, obj3 instanceof String ? (String) obj3 : null);
                short sXd2 = (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951486756)));
                int[] iArr2 = new int["hbKkoc_aZWi]b`".length()];
                QB qb2 = new QB("hbKkoc_aZWi]b`");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                String str2 = new String(iArr2, 0, i3);
                Object obj4 = map.get(str2);
                intent2.putExtra(str2, obj4 instanceof String ? (String) obj4 : null);
                String strZd = C1593ug.zd("/-A/", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (968063777 ^ (-2119089286)))), (short) (C1580rY.Xd() ^ (398125698 ^ (-398119533))));
                Object objRequireNonNull = Objects.requireNonNull(map.get(strZd));
                short sXd3 = (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ 1951485882));
                int[] iArr3 = new int["9?54f)&2115_!#\\\u001f\u001c--W+%T\"\" ]\u001e$\u001a\u0019K\u001f#\u0019\rF\u0010\u0006\u001a\u0004O\u0016\u0014\b\nJc{\r\u0001dw\u0006P~\u0002\u0006|x|;_\u007f|rvn2%orvmim,Ppmcg_5".length()];
                QB qb3 = new QB("9?54f)&2115_!#\\\u001f\u001c--W+%T\"\" ]\u001e$\u001a\u0019K\u001f#\u0019\rF\u0010\u0006\u001a\u0004O\u0016\u0014\b\nJc{\r\u0001dw\u0006P~\u0002\u0006|x|;_\u007f|rvn2%orvmim,Ppmcg_5");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd3 + sXd3 + i4 + xuXd3.CK(iKK3));
                    i4++;
                }
                Intrinsics.checkNotNull(objRequireNonNull, new String(iArr3, 0, i4));
                intent2.putExtra(strZd, new HashMap((HashMap) objRequireNonNull));
                sendBroadcast(intent2);
            }
        }
    }

    private final void sendEvent(String str, WritableMap writableMap, ReactContext reactContext) {
        try {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        } catch (Exception e2) {
            C1561oA.Kd("RgpvJm\u007fu\u0004w\u0004\n>ex\u0003\n[\u000e}\b\u000fHa\u0010\u0011\u000f\u0013", (short) (FB.Xd() ^ (504156835 ^ 504153689)));
            e2.toString();
        }
    }

    @Override // com.facebook.react.ReactActivity
    protected ReactActivityDelegate createReactActivityDelegate() throws Throwable {
        MainActivity mainActivity = this;
        short sXd = (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134261053));
        int iXd = C1633zX.Xd();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Wg.Zd("g-`\u0017F9\u0004lr[\r\u0010zmo \u0012\u001dIL4&hTF@\u0005z-F\u0010\u000e\fT,3!$LMK", sXd, (short) (iXd ^ ((900950321 ^ 1566473126) ^ (-1760374100))))).getDeclaredMethod(C1561oA.Xd("\n\t\u0019r\b\u0011\u0017l\u001a\u0019\u001d\u001d\u001d\u0015\u001f&\u0001\u0015\"\u001b", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (-831076976)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return new DefaultReactActivityDelegate(mainActivity, (String) declaredMethod.invoke(this, objArr), DefaultNewArchitectureEntryPoint.getFabricEnabled());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strVd = Wg.vd("<)n,\u0018", (short) (OY.Xd() ^ (846194229 ^ 846171433)));
            String strKd = Qg.kd("p]", (short) (Od.Xd() ^ ((1454192885 ^ 1548751123) ^ (-184382244))), (short) (Od.Xd() ^ ((1282761693 ^ 1720761027) ^ (-719685731))));
            try {
                Class<?> cls = Class.forName(strVd);
                Field field = 0 != 0 ? cls.getField(strKd) : cls.getDeclaredField(strKd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strVd2 = hg.Vd("F3x6\u001a", (short) (C1633zX.Xd() ^ (989738779 ^ (-989756926))), (short) (C1633zX.Xd() ^ ((698078659 ^ 1172984535) ^ (-1819377692))));
                String strUd = C1561oA.ud("&\u0012", (short) (C1499aX.Xd() ^ (670105283 ^ (-670098824))));
                try {
                    Class<?> cls2 = Class.forName(strVd2);
                    Field field2 = 0 != 0 ? cls2.getField(strUd) : cls2.getDeclaredField(strUd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd = C1561oA.yd(")\u0018[\u001b\u0005", (short) (FB.Xd() ^ ((1322683134 ^ 950685702) ^ 1987898417)));
                    String strYd2 = C1561oA.Yd("\u0015\u000b", (short) (ZN.Xd() ^ ((1787718237 ^ 878554361) ^ 1590924880)));
                    try {
                        Class<?> cls3 = Class.forName(strYd);
                        Field field3 = 0 != 0 ? cls3.getField(strYd2) : cls3.getDeclaredField(strYd2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Xg.qd("\"\u0011X$\u0006", (short) (C1607wl.Xd() ^ ((894836733 ^ 261644882) ^ 986598899)), (short) (C1607wl.Xd() ^ (1186152325 ^ 1186143081)))).getDeclaredMethod(Jg.Wd("R\u0005", (short) (C1607wl.Xd() ^ ((1143338458 ^ 406701190) ^ 1545101307)), (short) (C1607wl.Xd() ^ (855742609 ^ 855753999))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd = (short) (C1499aX.Xd() ^ (1355849453 ^ (-1355848254)));
                                short sXd2 = (short) (C1499aX.Xd() ^ ((1800924424 ^ 722057007) ^ (-1079920668)));
                                int[] iArr = new int["\u0004HQGKq".length()];
                                QB qb = new QB("\u0004HQGKq");
                                int i2 = 0;
                                while (qb.YK()) {
                                    int iKK = qb.KK();
                                    Xu xuXd = Xu.Xd(iKK);
                                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                                    i2++;
                                }
                                String str = new String(iArr, 0, i2);
                                short sXd3 = (short) (C1499aX.Xd() ^ (1906175828 ^ (-1906168053)));
                                short sXd4 = (short) (C1499aX.Xd() ^ ((2096265342 ^ 530291428) ^ (-1667865410)));
                                int[] iArr2 = new int["\u0016Kw\u001b\u0005SYTUj\u000e&\u0002\u0010\u001d\u00049T#\u0017\u0012d4".length()];
                                QB qb2 = new QB("\u0016Kw\u001b\u0005SYTUj\u000e&\u0002\u0010\u001d\u00049T#\u0017\u0012d4");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                                    i3++;
                                }
                                Object[] objArr2 = {str};
                                Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(EO.Od("9\u0005c\u001cd\u001c3]\u0015XfW\u0007\n}c", (short) (FB.Xd() ^ ((1558191791 ^ 1058500092) ^ 1677155176))), Class.forName(Ig.wd("Q\u001a?D\bxCGd]~Hry\\y", (short) (C1607wl.Xd() ^ (1209684948 ^ 1209676045)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd5 = (short) (C1607wl.Xd() ^ (1978418702 ^ 1978413957));
                                    int[] iArr3 = new int["\u001c\tN\fo".length()];
                                    QB qb3 = new QB("\u001c\tN\fo");
                                    int i4 = 0;
                                    while (qb3.YK()) {
                                        int iKK3 = qb3.KK();
                                        Xu xuXd3 = Xu.Xd(iKK3);
                                        iArr3[i4] = xuXd3.fK(sXd5 + sXd5 + sXd5 + i4 + xuXd3.CK(iKK3));
                                        i4++;
                                    }
                                    String str2 = new String(iArr3, 0, i4);
                                    short sXd6 = (short) (C1499aX.Xd() ^ (2133601016 ^ (-2133607389)));
                                    short sXd7 = (short) (C1499aX.Xd() ^ (1357011862 ^ (-1357013800)));
                                    int[] iArr4 = new int["&\u001c".length()];
                                    QB qb4 = new QB("&\u001c");
                                    int i5 = 0;
                                    while (qb4.YK()) {
                                        int iKK4 = qb4.KK();
                                        Xu xuXd4 = Xu.Xd(iKK4);
                                        iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd6 + i5)) - sXd7);
                                        i5++;
                                    }
                                    String str3 = new String(iArr4, 0, i5);
                                    try {
                                        Class<?> cls4 = Class.forName(str2);
                                        Field field4 = 0 != 0 ? cls4.getField(str3) : cls4.getDeclaredField(str3);
                                        field4.setAccessible(true);
                                        field4.set(null, windowManager);
                                    } catch (Throwable th4) {
                                    }
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    String strOd = C1561oA.od("TA\u0007D(", (short) (Od.Xd() ^ ((660077978 ^ 536316660) ^ (-950010833))));
                    String strKd2 = C1561oA.Kd("1'", (short) (ZN.Xd() ^ (594803985 ^ 594800101)));
                    try {
                        Class<?> cls5 = Class.forName(strOd);
                        Field field5 = 0 != 0 ? cls5.getField(strKd2) : cls5.getDeclaredField(strKd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        short sXd8 = (short) (C1580rY.Xd() ^ (2078485501 ^ (-2078483472)));
                        short sXd9 = (short) (C1580rY.Xd() ^ ((1078803978 ^ 725192557) ^ (-1802812512)));
                        int[] iArr5 = new int["U\u0018:,\\".length()];
                        QB qb5 = new QB("U\u0018:,\\");
                        int i6 = 0;
                        while (qb5.YK()) {
                            int iKK5 = qb5.KK();
                            Xu xuXd5 = Xu.Xd(iKK5);
                            iArr5[i6] = xuXd5.fK(((i6 * sXd9) ^ sXd8) + xuXd5.CK(iKK5));
                            i6++;
                        }
                        String str4 = new String(iArr5, 0, i6);
                        String strXd = C1561oA.Xd("OE", (short) (OY.Xd() ^ (1536675488 ^ 1536685360)));
                        try {
                            Class<?> cls6 = Class.forName(str4);
                            Field field6 = 0 != 0 ? cls6.getField(strXd) : cls6.getDeclaredField(strXd);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i7 = (409879666 ^ 616708059) ^ 1017934818;
                        if (x2 > i7 && x2 < displayMetrics.widthPixels - i7 && y2 > i7 && y2 < displayMetrics.heightPixels - i7) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.facebook.react.ReactActivity
    protected String getMainComponentName() {
        return Wg.vd(">aYOY)UV", (short) (FB.Xd() ^ (1699506908 ^ 1699481598)));
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        AntelopWalletModule antelopWalletModule;
        try {
            ComponentCallbacks2 application = getApplication();
            short sXd = (short) (C1499aX.Xd() ^ (1721211270 ^ (-1721215392)));
            short sXd2 = (short) (C1499aX.Xd() ^ ((1726437048 ^ 1582204054) ^ (-950643400)));
            int[] iArr = new int["oukj\u001d_\\hggk\u0016WY\u0013URcc\u000ea[\u000bXXV\u0014TZPO\u0002UYOC|?JG\u0007>89:6BA<}A3./?w\u001b-()9\u000532-)\"\u001f1%*(".length()];
            QB qb = new QB("oukj\u001d_\\hggk\u0016WY\u0013URcc\u000ea[\u000bXXV\u0014TZPO\u0002UYOC|?JG\u0007>89:6BA<}A3./?w\u001b-()9\u000532-)\"\u001f1%*(");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(((sXd + i4) + xuXd.CK(iKK)) - sXd2);
                i4++;
            }
            Intrinsics.checkNotNull(application, new String(iArr, 0, i4));
            ReactInstanceManager reactInstanceManager = ((ReactApplication) application).getReactNativeHost().getReactInstanceManager();
            Intrinsics.checkNotNullExpressionValue(reactInstanceManager, hg.Vd("hesPb]^nBfjjVbVW>Q]OTQ]\u0012\u0017\u0016\u0015\u000f", (short) (ZN.Xd() ^ ((302480713 ^ 1865220709) ^ 2099913457)), (short) (ZN.Xd() ^ ((861557144 ^ 1984427815) ^ 1159572719))));
            ReactContext currentReactContext = reactInstanceManager.getCurrentReactContext();
            if (currentReactContext != null && (antelopWalletModule = (AntelopWalletModule) currentReactContext.getNativeModule(AntelopWalletModule.class)) != null && antelopWalletModule.gpayActivityResultCallback != null) {
                AndroidActivityResultCallback androidActivityResultCallback = antelopWalletModule.gpayActivityResultCallback;
                if (!(androidActivityResultCallback instanceof AndroidActivityResultCallback)) {
                    androidActivityResultCallback = null;
                }
                if (androidActivityResultCallback != null) {
                    if (androidActivityResultCallback.onActivityResult(i2, i3, intent)) {
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) throws Exception {
        int i2 = 22093507 ^ 22093513;
        short sXd = (short) (C1499aX.Xd() ^ ((1275436243 ^ 1243582907) ^ (-102383601)));
        int[] iArr = new int["B/t-\u0010".length()];
        QB qb = new QB("B/t-\u0010");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        short sXd2 = (short) (C1633zX.Xd() ^ ((658726765 ^ 1241597998) ^ (-1833068919)));
        int[] iArr2 = new int[",\u0019".length()];
        QB qb2 = new QB(",\u0019");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i4));
            i4++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i4), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
            short sXd3 = (short) (OY.Xd() ^ (158423681 ^ 158422088));
            int[] iArr3 = new int["\u0002p8`M".length()];
            QB qb3 = new QB("\u0002p8`M");
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd3 + sXd3) + sXd3) + i5));
                i5++;
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(new String(iArr3, 0, i5)).getDeclaredMethod(Xg.qd("4H", (short) (C1580rY.Xd() ^ (1700445789 ^ (-1700434358))), (short) (C1580rY.Xd() ^ ((105009276 ^ 405170492) ^ (-509880106)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(null, objArr2);
                Class<?> cls2 = Class.forName(Jg.Wd(",aW\t\u0018", (short) (C1580rY.Xd() ^ (321860828 ^ (-321849887))), (short) (C1580rY.Xd() ^ (146376421 ^ (-146396603)))));
                Class<?>[] clsArr2 = {Integer.TYPE};
                Object[] objArr3 = {Integer.valueOf(309917147 ^ 309917137)};
                Method declaredMethod3 = cls2.getDeclaredMethod(ZO.xd("tw", (short) (Od.Xd() ^ ((2140918265 ^ 1632803797) ^ (-516517593))), (short) (Od.Xd() ^ ((2037259069 ^ 1541832396) ^ (-579348548)))), clsArr2);
                try {
                    declaredMethod3.setAccessible(true);
                    declaredMethod3.invoke(null, objArr3);
                    CX.ud();
                    Object[] objArr4 = new Object[0];
                    Method declaredMethod4 = Class.forName(C1626yg.Ud("w\u001d\u001edV", (short) (FB.Xd() ^ (1067038008 ^ 1067049999)), (short) (FB.Xd() ^ (2106709894 ^ 2106693548)))).getDeclaredMethod(Ig.wd("\u0006D", (short) (C1499aX.Xd() ^ ((1112219467 ^ 1088563125) ^ (-44647322)))), new Class[0]);
                    try {
                        declaredMethod4.setAccessible(true);
                        String str = (String) declaredMethod4.invoke(null, objArr4);
                        Object[] objArr5 = new Object[0];
                        Method declaredMethod5 = Class.forName(EO.Od("W\u001ds/,", (short) (OY.Xd() ^ (602744950 ^ 602737572)))).getDeclaredMethod(C1561oA.Qd("\u007f\u0018", (short) (FB.Xd() ^ ((1710606221 ^ 1685015012) ^ 26908021))), new Class[0]);
                        try {
                            declaredMethod5.setAccessible(true);
                            String str2 = (String) declaredMethod5.invoke(null, objArr5);
                            short sXd4 = (short) (FB.Xd() ^ ((1004908862 ^ 1026186433) ^ 114265903));
                            short sXd5 = (short) (FB.Xd() ^ (1118158408 ^ 1118167034));
                            int[] iArr4 = new int["\b\u007f\u0016\u0002O\u0016\t\b\u001b\u0019\u0011\u001d#X~\u0012\u0011$\"\u0016\u0004\u0014\"\u0019%$".length()];
                            QB qb4 = new QB("\b\u007f\u0016\u0002O\u0016\t\b\u001b\u0019\u0011\u001d#X~\u0012\u0011$\"\u0016\u0004\u0014\"\u0019%$");
                            int i6 = 0;
                            while (qb4.YK()) {
                                int iKK4 = qb4.KK();
                                Xu xuXd4 = Xu.Xd(iKK4);
                                iArr4[i6] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd4 + i6)) - sXd5);
                                i6++;
                            }
                            Object[] objArr6 = new Object[0];
                            Constructor<?> constructor = Class.forName(new String(iArr4, 0, i6)).getConstructor(new Class[0]);
                            try {
                                constructor.setAccessible(true);
                                int iNextInt = ((SecureRandom) constructor.newInstance(objArr6)).nextInt(839716051 ^ 1307767596);
                                Kp kp = new Kp(iNextInt, str, str2);
                                int i7 = ((iNextInt ^ ((390670391 ^ 1559700925) ^ 1247322816)) << 7) ^ 65;
                                int i8 = (402446434 ^ 2044975643) ^ 1847525993;
                                int i9 = Integer.parseInt(C1561oA.od("huqdc", (short) (ZN.Xd() ^ ((1354175684 ^ 1853879638) ^ 1053360068))), i8) ^ ((int) (((6459603038949207834L ^ 4452155646567862038L) ^ 7236199682126684403L) & kp.getId()));
                                Class<?> cls3 = Class.forName(Wg.Zd("Q\u007fvj0", (short) (OY.Xd() ^ ((1440984344 ^ 412317683) ^ 1299246507)), (short) (OY.Xd() ^ ((1612792519 ^ 510028478) ^ 2118614557))));
                                Class<?>[] clsArr3 = {Integer.TYPE};
                                Object[] objArr7 = {Integer.valueOf(i9 + (((i9 << (Integer.parseInt(C1561oA.Kd("SZf", (short) (Od.Xd() ^ ((1680679437 ^ 1608595611) ^ (-1003247167)))), i8) - 650)) + i9) * ((i9 << 2) + i9)))};
                                Method declaredMethod6 = cls3.getDeclaredMethod(C1561oA.Xd("\u000f\u001c", (short) (Od.Xd() ^ (487016355 ^ (-487023790)))), clsArr3);
                                try {
                                    declaredMethod6.setAccessible(true);
                                    int iIntValue = (i7 ^ ((Integer) declaredMethod6.invoke(null, objArr7)).intValue()) ^ ((Integer.parseInt(Wg.vd("SR", (short) (C1607wl.Xd() ^ ((571057287 ^ 1884693688) ^ 1381996715))), i8) + 20) << ((byte) ((6743717828397400218L ^ 6743717828397400213L) & r12)));
                                    Class<?> cls4 = Class.forName(Qg.kd("\u0006r8L`", (short) (C1633zX.Xd() ^ ((656869186 ^ 560383614) ^ (-104961177))), (short) (C1633zX.Xd() ^ ((1910546391 ^ 283640565) ^ (-1627953826)))));
                                    Class<?>[] clsArr4 = {Integer.TYPE};
                                    Object[] objArr8 = {Integer.valueOf(iIntValue)};
                                    Method declaredMethod7 = cls4.getDeclaredMethod(hg.Vd("\"-", (short) (Od.Xd() ^ ((753973281 ^ 1791380628) ^ (-1178002110))), (short) (Od.Xd() ^ (624081780 ^ (-624084919)))), clsArr4);
                                    try {
                                        declaredMethod7.setAccessible(true);
                                        int iIntValue2 = ((Integer) declaredMethod7.invoke(null, objArr8)).intValue();
                                        synchronized (CX.Xd) {
                                            long id = kp.getId();
                                            StringBuilder sbAppend = new StringBuilder().append("").append(iIntValue2);
                                            String strUd = C1561oA.ud("Y", (short) (ZN.Xd() ^ ((1638988414 ^ 1985711661) ^ 401304241)));
                                            StringBuilder sbAppend2 = new StringBuilder().append(sbAppend.append(strUd).toString());
                                            Class<?> cls5 = Class.forName(C1561oA.yd("ZG\r!5", (short) (C1580rY.Xd() ^ ((708375854 ^ 2028071384) ^ (-1389957192)))));
                                            Class<?>[] clsArr5 = {Integer.TYPE};
                                            Object[] objArr9 = {Integer.valueOf((int) id)};
                                            short sXd6 = (short) (C1499aX.Xd() ^ ((816850984 ^ 765507290) ^ (-487641055)));
                                            int[] iArr5 = new int["]j".length()];
                                            QB qb5 = new QB("]j");
                                            int i10 = 0;
                                            while (qb5.YK()) {
                                                int iKK5 = qb5.KK();
                                                Xu xuXd5 = Xu.Xd(iKK5);
                                                iArr5[i10] = xuXd5.fK(xuXd5.CK(iKK5) - (((sXd6 + sXd6) + sXd6) + i10));
                                                i10++;
                                            }
                                            Method declaredMethod8 = cls5.getDeclaredMethod(new String(iArr5, 0, i10), clsArr5);
                                            try {
                                                declaredMethod8.setAccessible(true);
                                                StringBuilder sbAppend3 = new StringBuilder().append((sbAppend2.append(((Integer) declaredMethod8.invoke(null, objArr9)).intValue()).append(strUd).toString() + str + strUd) + str2 + strUd);
                                                long jLongValue = 0;
                                                try {
                                                    jLongValue = ((Long) Class.forName(Xg.qd("sk\u0002m;zp~x@f\u000e\t\u000b|\u0006", (short) (C1499aX.Xd() ^ (428642780 ^ (-428657899))), (short) (C1499aX.Xd() ^ (268201896 ^ (-268178275))))).getMethod(Jg.Wd("Asa\u007fR\u0002p*eRh0z^@cV", (short) (OY.Xd() ^ (1802599358 ^ 1802591956)), (short) (OY.Xd() ^ ((1464549721 ^ 31883515) ^ 1454227580))), new Class[0]).invoke(null, new Object[0])).longValue();
                                                } catch (Exception e2) {
                                                }
                                                CX.Xd.add(CX.qd(sbAppend3.append(jLongValue).toString()));
                                                kp.start();
                                            } catch (InvocationTargetException e3) {
                                                throw e3.getCause();
                                            }
                                        }
                                        MainActivity mainActivity = this;
                                        SplashScreen.show(mainActivity);
                                        setTheme(R.style.BackgroundTheme);
                                        super.onCreate(null);
                                        Object[] objArr10 = {mainActivity};
                                        Method declaredMethod9 = Class.forName(ZO.xd("I\u0010\nZ Xl`ht_X'3nf\u0011h\n\u0017WOYu?\u0014\u007f(p\\Tg\\m\\DL-*\\\u0007fF\u0006\u00015+6\u001fiM3X\u001ea", (short) (C1633zX.Xd() ^ ((1414761908 ^ 971234221) ^ (-1840281827))), (short) (C1633zX.Xd() ^ ((1324747369 ^ 1355648769) ^ (-507217731))))).getDeclaredMethod(Ig.wd("=h*\u001a_0\u0019E08@", (short) (C1580rY.Xd() ^ (440967094 ^ (-440973160)))), Class.forName(C1626yg.Ud("?\n>p\u0004\u001bH\u001ehF3Z+\u001d3_\n3c ", (short) (C1633zX.Xd() ^ (881174906 ^ (-881180518))), (short) (C1633zX.Xd() ^ ((1082590942 ^ 1245258192) ^ (-180235695))))));
                                        try {
                                            declaredMethod9.setAccessible(true);
                                            declaredMethod9.invoke(null, objArr10);
                                            Intent intent = getIntent();
                                            Intrinsics.checkNotNullExpressionValue(intent, EO.Od("\u000b.1l\f^Y\u001dM\u0004\ne\u0014\u000b", (short) (ZN.Xd() ^ ((447028928 ^ 1928988327) ^ 1751065138))));
                                            Object[] objArr11 = {intent};
                                            Method declaredMethod10 = Class.forName(C1561oA.Qd("P[X\u0018MI]O[MHPEA\rB>RDPB=E:65CB~\u001d07;\r.>2>0:>", (short) (Od.Xd() ^ ((87689093 ^ 902337972) ^ (-821227318))))).getDeclaredMethod(C1561oA.od("\u0001x\u0005y\u0001x[\u007f\u0005t|\u0002", (short) (C1580rY.Xd() ^ (1139694015 ^ (-1139702834)))), Class.forName(C1593ug.zd("\u001e,#20+'q(55<.8?y\u0016<C5?F", (short) (FB.Xd() ^ ((496872835 ^ 755106851) ^ 815768941)), (short) (FB.Xd() ^ ((2113309712 ^ 1303990280) ^ 810539062)))));
                                            try {
                                                declaredMethod10.setAccessible(true);
                                                declaredMethod10.invoke(this, objArr11);
                                            } catch (InvocationTargetException e4) {
                                                throw e4.getCause();
                                            }
                                        } catch (InvocationTargetException e5) {
                                            throw e5.getCause();
                                        }
                                    } catch (InvocationTargetException e6) {
                                        throw e6.getCause();
                                    }
                                } catch (InvocationTargetException e7) {
                                    throw e7.getCause();
                                }
                            } catch (InvocationTargetException e8) {
                                throw e8.getCause();
                            }
                        } catch (InvocationTargetException e9) {
                            throw e9.getCause();
                        }
                    } catch (InvocationTargetException e10) {
                        throw e10.getCause();
                    }
                } catch (InvocationTargetException e11) {
                    throw e11.getCause();
                }
            } catch (InvocationTargetException e12) {
                throw e12.getCause();
            }
        } catch (InvocationTargetException e13) {
            throw e13.getCause();
        }
    }

    @Override // com.facebook.react.ReactActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) throws Throwable {
        Intrinsics.checkNotNullParameter(intent, C1561oA.Kd("}\u0004\u000b|\u0007\u000e", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69934023)))));
        super.onNewIntent(intent);
        setIntent(intent);
        Class<?> cls = Class.forName(Wg.Zd("\u001b\n[7??(6\u0019\u0017~\u0019*rJVfOQH\u000e\u001e<E\u000e\u0019\u0002\u0015>(R5\u000e\"WDH#\u0001 \u007f", (short) (Od.Xd() ^ ((235893116 ^ 511096614) ^ (-276420781))), (short) (Od.Xd() ^ ((1269050469 ^ 235220982) ^ (-1168207643)))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Xd("q\u007fv\u0006\u0004~zE{\t\t\u0010\u0002\f\u0013Mi\u0010\u0017\t\u0013\u001a", (short) (FB.Xd() ^ (1596608261 ^ 1596620793))))};
        Object[] objArr = {intent};
        short sXd = (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (502349399 ^ 1772116397)));
        int[] iArr = new int["@:D;HB#ITFLS".length()];
        QB qb = new QB("@:D;HB#ITFLS");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
    }
}
