package com.davivienda.daviviendaapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176B\u0005\"4\u0012\u0006\u0007nj?1Le^.ZS0\u0011s{B-cҕ\bّkUH|b\fҊRgun\u0013`\u0019G'\u0006D}1,\u0012[\u0007c*\u000f`D6Q{]}DQ`#;5&@*P{\u001b\u007fH3\u000f\"?\u0001QU$\u0012^E7L\u001b#[\u00102\u00124CP\u0005,h\u007fNdJ\u001daH<;\u0003\u0018P\u0015'0<\u000bN%F\u0003)cǻ$ӿ/@?ߎe1a\u0006\u001fR\nAYӍ4ݘ\th/ݐȋM\u0003"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n\u0011d\t\u000fAI!9)AJoE\"$|7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VK\fKz69h\u0012u", "u(E", "3uT;g", "", "BnZ2a\u0017:`\u0015\u0007", "3mP/_,\u001a^$m\u0005:7\bj9o\u0002/{2|\u001e\u001eG~", "", "5dc\u001aT0G1#\u0007\u0006h5|\u0012>N{0{", "=m2?X(MS", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=mA2f<FS", "Ad]18=>\\(", "3uT;g\u0015:[\u0019", "BnZ2a", "", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AppToAppActivity extends ReactActivity {
    private final String tokenParam = Qg.kd("\b\t\u0019\r\u0019\u0003\u0015\u0005\u001e\u0012\f\u0007\u007f\b", (short) (Od.Xd() ^ (C1633zX.Xd() ^ (2012928106 ^ 61580353))), (short) (Od.Xd() ^ (C1580rY.Xd() ^ 831069353)));
    private final String event = hg.Vd("\u000f=<\u001f9\n87\u000b;)16", (short) (C1607wl.Xd() ^ (1635016176 ^ 1635005329)), (short) (C1607wl.Xd() ^ (1274722284 ^ 1274727569)));

    private final void enableAppToAppGoogleWallet() throws Throwable {
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, C1561oA.ud("daoCgl\\di\u001c! \u001f\u0019", (short) (C1499aX.Xd() ^ ((1818234863 ^ 918364882) ^ (-1524459926)))));
        try {
            String action = intent.getAction();
            if (!Intrinsics.areEqual(action, C1561oA.yd("ALI\tFBVHL>9A>:\u0006;/C5A;6>3'&43w*+;glj)CDTHL6H8YMGB3;", (short) (C1633zX.Xd() ^ ((456605318 ^ 1067624677) ^ (-613790349)))))) {
                if (!Intrinsics.areEqual(action, C1561oA.Yd("\b\u0015\u0014U\r\u000b!\u0015#\u0017\u0014\u001e\u0015\u0013`\u0018\u0016, .\"\u001f) \u001e\u001f/0n#t%", (short) (FB.Xd() ^ (1052557038 ^ 1052551881))))) {
                    return;
                }
            }
            String str = this.event;
            Class<?> cls = Class.forName(Xg.qd(" -,m%#9-;/,6-+x0.D8F:7A867GH\u0007\u001bKL1M PQ#FXN\\P\\b", (short) (C1580rY.Xd() ^ ((1437861326 ^ 1924984248) ^ (-654882703))), (short) (C1580rY.Xd() ^ (2068673616 ^ (-2068658498)))));
            Class<?>[] clsArr = new Class[(519238871 ^ 1894178423) ^ 1846815394];
            clsArr[0] = Class.forName(Jg.Wd("\u0014eX%Kk>-\u001047:\u0012jM(", (short) (C1499aX.Xd() ^ ((2110315483 ^ 1960408054) ^ (-152154073))), (short) (C1499aX.Xd() ^ (1259437147 ^ (-1259423146)))));
            clsArr[1] = Boolean.TYPE;
            Object[] objArr = new Object[(366837899 ^ 1860468040) ^ 2067398081];
            objArr[0] = str;
            objArr[1] = true;
            short sXd = (short) (ZN.Xd() ^ ((620622494 ^ 1063351018) ^ 463273730));
            short sXd2 = (short) (ZN.Xd() ^ (36341860 ^ 36361673));
            int[] iArr = new int["}k0WoKF*H".length()];
            QB qb = new QB("}k0WoKF*H");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            C1626yg.Ud("yeD4+\u0019:&k2\u0001\u0013\u007f#)\u0014-\tzr\">\u0015ZH)!", (short) (C1633zX.Xd() ^ (376396292 ^ (-376377406))), (short) (C1633zX.Xd() ^ ((1789515844 ^ 448955014) ^ (-1886081899))));
            e3.toString();
        }
    }

    private final void sendEvent(final String str, boolean z2) {
        try {
            ReactContext currentReactContext = getReactInstanceManager().getCurrentReactContext();
            final WritableMap writableMapCreateMap = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, Ig.wd("\u001e\u0004\t!{\u001f^c3jv\u0011eb", (short) (C1607wl.Xd() ^ (1996902341 ^ 1996883095))));
            writableMapCreateMap.putBoolean(this.tokenParam, z2);
            if (currentReactContext != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) currentReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMapCreateMap);
            } else {
                getReactInstanceManager().addReactInstanceEventListener(new ReactInstanceManager.ReactInstanceEventListener() { // from class: com.davivienda.daviviendaapp.AppToAppActivity.sendEvent.1
                    @Override // com.facebook.react.ReactInstanceEventListener
                    public void onReactContextInitialized(ReactContext reactContext) {
                        Intrinsics.checkNotNullParameter(reactContext, Wg.vd("FQOTDVQ", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (-1134235172)))));
                        if (writableMapCreateMap.getBoolean(this.tokenParam)) {
                            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMapCreateMap);
                        }
                    }
                });
            }
        } catch (Exception e2) {
            EO.Od("K0Fr\u0005{)6\nanMKw}aD\u000b\u0005kK\n\u00140T8\u0014G", (short) (C1499aX.Xd() ^ (859621899 ^ (-859635143))));
            e2.toString();
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
            String strQd = C1561oA.Qd("9&k)\r", (short) (FB.Xd() ^ (1665433414 ^ 1665419969)));
            String strZd = C1593ug.zd("~m", (short) (Od.Xd() ^ (984505307 ^ (-984509347))), (short) (Od.Xd() ^ (1698688675 ^ (-1698682321))));
            try {
                Class<?> cls = Class.forName(strQd);
                Field field = 0 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                short sXd = (short) (FB.Xd() ^ ((425543214 ^ 1383647624) ^ 1260763352));
                int[] iArr = new int["{h.kO".length()];
                QB qb = new QB("{h.kO");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                String strKd = C1561oA.Kd("~l", (short) (C1499aX.Xd() ^ (2123297103 ^ (-2123274141))));
                try {
                    Class<?> cls2 = Class.forName(str);
                    Field field2 = 0 != 0 ? cls2.getField(strKd) : cls2.getDeclaredField(strKd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strZd2 = Wg.Zd("k=-5}", (short) (C1580rY.Xd() ^ ((2128449095 ^ 793440351) ^ (-1368863831))), (short) (C1580rY.Xd() ^ (327546066 ^ (-327544732))));
                    short sXd2 = (short) (OY.Xd() ^ ((463433762 ^ 1078454330) ^ 1540924457));
                    int[] iArr2 = new int["3)".length()];
                    QB qb2 = new QB("3)");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    try {
                        Class<?> cls3 = Class.forName(strZd2);
                        Field field3 = 0 != 0 ? cls3.getField(str2) : cls3.getDeclaredField(str2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Wg.vd("gV\u001eiC", (short) (C1499aX.Xd() ^ ((333564883 ^ 158432078) ^ (-445687078))))).getDeclaredMethod(Qg.kd("gr", (short) (C1633zX.Xd() ^ ((347663831 ^ 1275535264) ^ (-1488966071))), (short) (C1633zX.Xd() ^ (2029998745 ^ (-2029981803)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strVd = hg.Vd(">/3(29", (short) (C1580rY.Xd() ^ ((1410076421 ^ 940089619) ^ (-1812254565))), (short) (C1580rY.Xd() ^ ((1170594146 ^ 69480750) ^ (-1105297719))));
                                short sXd3 = (short) (FB.Xd() ^ (1151681468 ^ 1151667682));
                                int[] iArr3 = new int["1=2?;4.v+649)16n\u0003.,1!3.".length()];
                                QB qb3 = new QB("1=2?;4.v+649)16n\u0003.,1!3.");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK(sXd3 + i4 + xuXd3.CK(iKK3));
                                    i4++;
                                }
                                Object[] objArr2 = {strVd};
                                Method method = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.Yd("&%5\u0015<79+4\u001b.<A503", (short) (OY.Xd() ^ (2083826684 ^ 2083846815))), Class.forName(C1561oA.yd("B:P<\nI?MG\u000f5WVNTN", (short) (C1580rY.Xd() ^ ((249963574 ^ 345745603) ^ (-444455868))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strQd2 = Xg.qd(";*q1\u0017", (short) (C1607wl.Xd() ^ ((918394674 ^ 1726058539) ^ 1348232179)), (short) (C1607wl.Xd() ^ ((1462800367 ^ 1611624262) ^ 926914535)));
                                    String strWd = Jg.Wd(">#", (short) (C1499aX.Xd() ^ (1035457048 ^ (-1035467071))), (short) (C1499aX.Xd() ^ (1634704767 ^ (-1634710882))));
                                    try {
                                        Class<?> cls4 = Class.forName(strQd2);
                                        Field field4 = 0 != 0 ? cls4.getField(strWd) : cls4.getDeclaredField(strWd);
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
                    String strXd = ZO.xd("VR.\u0005O", (short) (FB.Xd() ^ (659969183 ^ 659947850)), (short) (FB.Xd() ^ (1462572454 ^ 1462571123)));
                    String strUd = C1626yg.Ud("\u001fF", (short) (OY.Xd() ^ (1816172689 ^ 1816175815)), (short) (OY.Xd() ^ ((792892555 ^ 1267298040) ^ 1691058581)));
                    try {
                        Class<?> cls5 = Class.forName(strXd);
                        Field field5 = 0 != 0 ? cls5.getField(strUd) : cls5.getDeclaredField(strUd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strWd2 = Ig.wd("\r(\\{\u0001", (short) (C1607wl.Xd() ^ (1991803783 ^ 1991834599)));
                        String strOd = EO.Od("\fG", (short) (OY.Xd() ^ ((121824801 ^ 829222527) ^ 909008014)));
                        try {
                            Class<?> cls6 = Class.forName(strWd2);
                            Field field6 = 0 != 0 ? cls6.getField(strOd) : cls6.getDeclaredField(strOd);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i5 = (508673340 ^ 45008183) ^ 486504512;
                        if (x2 > i5 && x2 < displayMetrics.widthPixels - i5 && y2 > i5 && y2 < displayMetrics.heightPixels - i5) {
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
        return C1561oA.Qd("&GA5A\u000f=<", (short) (C1607wl.Xd() ^ ((2073230253 ^ 1953319686) ^ 268414852)));
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) throws Throwable {
        AppToAppActivity appToAppActivity = this;
        SplashScreen.show(appToAppActivity);
        setTheme(R.style.BackgroundTheme);
        super.onCreate(bundle);
        Object[] objArr = {appToAppActivity};
        Method declaredMethod = Class.forName(C1593ug.zd("!.-n&$:.<0-7.,y1/E9G;8B978HI\bONFEFES#U\\FT\u0015/^K]P?SPSe[bb", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849969358))), (short) (Od.Xd() ^ (C1499aX.Xd() ^ (1678477095 ^ 663811079))))).getDeclaredMethod(C1561oA.Kd("\\O_5[acQ_UX", (short) (OY.Xd() ^ (OY.Xd() ^ (1640437741 ^ 1709997618)))), Class.forName(C1561oA.od("0<1>:3-u(65q\u0004%5)5'15", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (821100416 ^ (-1864346658)))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
            short sXd = (short) (OY.Xd() ^ (851661022 ^ 851650591));
            short sXd2 = (short) (OY.Xd() ^ (2102563759 ^ 2102572989));
            int[] iArr = new int["Xa<u\u0019r\u007fOI5\u000e\u0014rL\u0016%N kuQ*0~heMIs_\fhtM{$\u0011:XF$.}\u0002s".length()];
            QB qb = new QB("Xa<u\u0019r\u007fOI5\u000e\u0014rL\u0016%N kuQ*0~heMIs_\fhtM{$\u0011:XF$.}\u0002s");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Xd("\f\u0016\n\f\u0017\u0011m\u001e\u001f\u0004 r#${%&\u001f%\u001f\u0012\u001d)*$4", (short) (C1580rY.Xd() ^ (2054639828 ^ (-2054650596)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(this, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() throws Throwable {
        super.onResume();
        int iXd = C1499aX.Xd();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Wg.vd("\u000b\u0016\u0013R\b\u0004\u0018\n&\u0018\u0013\u001b\u0010\fW\r\u0019-\u001f+\u001d\u0018 \u0015! .-i{*)[uFtsCdtx\u0005v\u0001\u0005", (short) (iXd ^ (1562967295 ^ (-1562944565))))).getDeclaredMethod(Qg.kd("W_QQZR-[Z=W(VU+RQHLD5>HG?M", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864704120))), (short) (C1633zX.Xd() ^ ((543133345 ^ 1059831654) ^ (-527705385)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
