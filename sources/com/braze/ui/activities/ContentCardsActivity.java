package com.braze.ui.activities;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.braze.BrazeInternal;
import com.braze.ui.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
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
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
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
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјl~Oӄtev-\u0013V֖\u0013k\n4lk2r[;\u0004\u001c.(\u0017Rfi}mx^QWǍ\n\u001b"}, d2 = {"\u001ab^:\")KO.~Dn0F\u0005-t\u00049\u007fO\u0005\u0017%\u0011M\u0018E\u0006%>h[\u001cDl$\nKR?|8-)>", "\u001ab^:\")KO.~Dn0F\u0005-t\u00049\u007fO\u0005\u0017%\u0011L\u001b8\f%\u0012U\f \u0018z\u00120UCDz\u0010\u001c$lr=\u0016w\u0002", "u(E", "=m2?X(MS", "", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class ContentCardsActivity extends BrazeBaseFragmentActivity {
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            short sXd = (short) (FB.Xd() ^ ((1565657716 ^ 11192033) ^ 1576589176));
            short sXd2 = (short) (FB.Xd() ^ ((2110234685 ^ 1396992112) ^ 780389785));
            int[] iArr = new int["0qY\u0014I".length()];
            QB qb = new QB("0qY\u0014I");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strXd = C1561oA.Xd("\u001c\u000b", (short) (C1607wl.Xd() ^ (975800032 ^ 975827170)));
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strVd = Wg.vd("\u0018\u0005N\fs", (short) (C1633zX.Xd() ^ (449930395 ^ (-449926554))));
                String strKd = Qg.kd("C/", (short) (C1580rY.Xd() ^ ((313447535 ^ 124232353) ^ (-365518094))), (short) (C1580rY.Xd() ^ (881710381 ^ (-881695045))));
                try {
                    Class<?> cls2 = Class.forName(strVd);
                    Field field2 = 0 != 0 ? cls2.getField(strKd) : cls2.getDeclaredField(strKd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strVd2 = hg.Vd("\u000ez@}a", (short) (ZN.Xd() ^ (505331353 ^ 505328586)), (short) (ZN.Xd() ^ (150452389 ^ 150464727)));
                    String strUd = C1561oA.ud("cW", (short) (C1580rY.Xd() ^ (883440575 ^ (-883426842))));
                    try {
                        Class<?> cls3 = Class.forName(strVd2);
                        Field field3 = 0 != 0 ? cls3.getField(strUd) : cls3.getDeclaredField(strUd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        short sXd3 = (short) (Od.Xd() ^ (1752793985 ^ (-1752800562)));
                        int[] iArr2 = new int["\u007fn2}c".length()];
                        QB qb2 = new QB("\u007fn2}c");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
                            i3++;
                        }
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(new String(iArr2, 0, i3)).getDeclaredMethod(C1561oA.Yd("+8", (short) (Od.Xd() ^ (366910956 ^ (-366924514)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd4 = (short) (OY.Xd() ^ (1902533677 ^ 1902517249));
                                short sXd5 = (short) (OY.Xd() ^ (592274281 ^ 592254127));
                                int[] iArr3 = new int[" \u0013\u0019\u0010\u001c%".length()];
                                QB qb3 = new QB(" \u0013\u0019\u0010\u001c%");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i4)) + sXd5);
                                    i4++;
                                }
                                String str2 = new String(iArr3, 0, i4);
                                short sXd6 = (short) (C1499aX.Xd() ^ ((1613266716 ^ 1762680403) ^ (-154695258)));
                                short sXd7 = (short) (C1499aX.Xd() ^ ((860397425 ^ 235637789) ^ (-1027823370)));
                                int[] iArr4 = new int["G\t=\u0010K9r\u0001t52~,kmm?\"]i\u0019`\u001b".length()];
                                QB qb4 = new QB("G\t=\u0010K9r\u0001t52~,kmm?\"]i\u0019`\u001b");
                                int i5 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((i5 * sXd7) ^ sXd6));
                                    i5++;
                                }
                                Object[] objArr2 = {str2};
                                Method method = Class.forName(new String(iArr4, 0, i5)).getMethod(C1626yg.Ud("Z\u0017o}\u000b&YJ\b18\u0010L\u0015#!", (short) (ZN.Xd() ^ (833339641 ^ 833352231)), (short) (ZN.Xd() ^ (831813287 ^ 831805414))), Class.forName(ZO.xd("P9B7\u0007x(Xg13`\u0011e9w", (short) (C1499aX.Xd() ^ (1962637877 ^ (-1962632780))), (short) (C1499aX.Xd() ^ (42629112 ^ (-42607576))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strWd = Ig.wd("7y\f9K", (short) (C1607wl.Xd() ^ ((845952318 ^ 44586051) ^ 818183810)));
                                    String strOd = EO.Od("\u0012W", (short) (Od.Xd() ^ (224201325 ^ (-224220110))));
                                    try {
                                        Class<?> cls4 = Class.forName(strWd);
                                        Field field4 = 0 != 0 ? cls4.getField(strOd) : cls4.getDeclaredField(strOd);
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
                    String strQd = C1561oA.Qd("&\u0013X\u0016y", (short) (FB.Xd() ^ (690482534 ^ 690459852)));
                    String strZd = C1593ug.zd("\u000f\u0005", (short) (C1499aX.Xd() ^ ((809615822 ^ 2117221212) ^ (-1316219131))), (short) (C1499aX.Xd() ^ (806793126 ^ (-806789996))));
                    try {
                        Class<?> cls5 = Class.forName(strQd);
                        Field field5 = 0 != 0 ? cls5.getField(strZd) : cls5.getDeclaredField(strZd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strOd2 = C1561oA.od("\u0011}C\u0001d", (short) (C1580rY.Xd() ^ (108631912 ^ (-108652178))));
                        String strKd2 = C1561oA.Kd("mc", (short) (Od.Xd() ^ (247698442 ^ (-247725531))));
                        try {
                            Class<?> cls6 = Class.forName(strOd2);
                            Field field6 = 0 != 0 ? cls6.getField(strKd2) : cls6.getDeclaredField(strKd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i6 = (1700550568 ^ 1788400262) ^ 264537445;
                        if (x2 > i6 && x2 < displayMetrics.widthPixels - i6 && y2 > i6 && y2 < displayMetrics.heightPixels - i6) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (BrazeInternal.INSTANCE.getConfigurationProvider(this).getShouldUseWindowFlagSecureInActivities()) {
            getWindow().setFlags(8192, 8192);
        }
        setContentView(R.layout.com_braze_content_cards_activity);
    }
}
