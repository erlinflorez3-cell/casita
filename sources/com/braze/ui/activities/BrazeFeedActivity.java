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
import yg.C1607wl;
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
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјl~Oӄtev-\u0013V֖\u0013k\n4lk2r[;\u0004\u001c.(\u0017Rfi}mx^QWǍ\n\u001b"}, d2 = {"\u001ab^:\")KO.~Dn0F\u0005-t\u00049\u007fO\u0005\u0017%\u0011L\u001b8\f%\u0016Y}\u001f\u0013k%2^GJ\u007f\n", "\u001ab^:\")KO.~Dn0F\u0005-t\u00049\u007fO\u0005\u0017%\u0011L\u001b8\f%\u0012U\f \u0018z\u00120UCDz\u0010\u001c$lr=\u0016w\u0002", "u(E", "=m2?X(MS", "", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class BrazeFeedActivity extends BrazeBaseFragmentActivity {
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strZd = Wg.Zd(" \u001aLk\u007f", (short) (C1633zX.Xd() ^ ((727772910 ^ 392366168) ^ (-1006883882))), (short) (C1633zX.Xd() ^ ((1278910476 ^ 1131381498) ^ (-257231997))));
            String strXd = C1561oA.Xd("tc", (short) (OY.Xd() ^ ((1473196486 ^ 103463307) ^ 1374024242)));
            try {
                Class<?> cls = Class.forName(strZd);
                Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strVd = Wg.vd(":)l,\u000e", (short) (C1633zX.Xd() ^ ((743288809 ^ 172081157) ^ (-638347682))));
                String strKd = Qg.kd("aM", (short) (C1607wl.Xd() ^ (897880282 ^ 897883686)), (short) (C1607wl.Xd() ^ ((1134136554 ^ 959664223) ^ 2058021138)));
                try {
                    Class<?> cls2 = Class.forName(strVd);
                    Field field2 = 0 != 0 ? cls2.getField(strKd) : cls2.getDeclaredField(strKd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    short sXd = (short) (Od.Xd() ^ ((875776396 ^ 353687549) ^ (-556251366)));
                    short sXd2 = (short) (Od.Xd() ^ (260212833 ^ (-260217629)));
                    int[] iArr = new int["UB\bE)".length()];
                    QB qb = new QB("UB\bE)");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                        i2++;
                    }
                    String str = new String(iArr, 0, i2);
                    short sXd3 = (short) (Od.Xd() ^ ((1476527099 ^ 1015840596) ^ (-1687037733)));
                    int[] iArr2 = new int["ma".length()];
                    QB qb2 = new QB("ma");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    try {
                        Class<?> cls3 = Class.forName(str);
                        Field field3 = 0 != 0 ? cls3.getField(str2) : cls3.getDeclaredField(str2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(C1561oA.yd("\u0002p8\u0004]", (short) (ZN.Xd() ^ ((627509718 ^ 1037405356) ^ 414362222)))).getDeclaredMethod(C1561oA.Yd(".;", (short) (ZN.Xd() ^ (668835313 ^ 668856653))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strQd = Xg.qd("+\u001e$\u001b'0", (short) (C1633zX.Xd() ^ (561604548 ^ (-561582549))), (short) (C1633zX.Xd() ^ ((1345670569 ^ 614527824) ^ (-1955973540))));
                                short sXd4 = (short) (C1499aX.Xd() ^ ((1454590616 ^ 1917250249) ^ (-620092460)));
                                short sXd5 = (short) (C1499aX.Xd() ^ (1226911988 ^ (-1226926954)));
                                int[] iArr3 = new int["\u0002& \u0016\u0017\t\b9\u0003\u0007jtMjX&\u0003CJ5*5E".length()];
                                QB qb3 = new QB("\u0002& \u0016\u0017\t\b9\u0003\u0007jtMjX&\u0003CJ5*5E");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd5) ^ sXd4));
                                    i4++;
                                }
                                Class<?> cls4 = Class.forName(new String(iArr3, 0, i4));
                                Class<?>[] clsArr = {Class.forName(ZO.xd(")a\u0003rqbj]\u0015NL\u001a\\n\u0005F", (short) (ZN.Xd() ^ ((679050082 ^ 1860193109) ^ 1184452219)), (short) (ZN.Xd() ^ (1897866866 ^ 1897859404))))};
                                Object[] objArr2 = {strQd};
                                short sXd6 = (short) (ZN.Xd() ^ (1719273728 ^ 1719273229));
                                short sXd7 = (short) (ZN.Xd() ^ (536051026 ^ 536031826));
                                int[] iArr4 = new int["(\u0001#\u0013AR0\u00141\u0012.c\u0003b\f2".length()];
                                QB qb4 = new QB("(\u0001#\u0013AR0\u00141\u0012.c\u0003b\f2");
                                int i5 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + (i5 * sXd7))) + xuXd4.CK(iKK4));
                                    i5++;
                                }
                                Method method = cls4.getMethod(new String(iArr4, 0, i5), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strWd = Ig.wd("{%\u0018t\u0010", (short) (C1633zX.Xd() ^ (1339523817 ^ (-1339547341))));
                                    String strOd = EO.Od("Gk", (short) (FB.Xd() ^ (1438321926 ^ 1438338050)));
                                    try {
                                        Class<?> cls5 = Class.forName(strWd);
                                        Field field4 = 0 != 0 ? cls5.getField(strOd) : cls5.getDeclaredField(strOd);
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
                    String strQd2 = C1561oA.Qd("\u0013\u007fE\u0003f", (short) (Od.Xd() ^ ((1409155784 ^ 166447371) ^ (-1511377192))));
                    short sXd8 = (short) (C1499aX.Xd() ^ ((8974228 ^ 479478968) ^ (-471645756)));
                    short sXd9 = (short) (C1499aX.Xd() ^ (334650161 ^ (-334649103)));
                    int[] iArr5 = new int["]S".length()];
                    QB qb5 = new QB("]S");
                    int i6 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i6] = xuXd5.fK((xuXd5.CK(iKK5) - (sXd8 + i6)) - sXd9);
                        i6++;
                    }
                    String str3 = new String(iArr5, 0, i6);
                    try {
                        Class<?> cls6 = Class.forName(strQd2);
                        Field field5 = 0 != 0 ? cls6.getField(str3) : cls6.getDeclaredField(str3);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strOd2 = C1561oA.od("\tu;x\\", (short) (C1607wl.Xd() ^ (202811827 ^ 202803641)));
                        String strKd2 = C1561oA.Kd("|r", (short) (C1499aX.Xd() ^ (1654328025 ^ (-1654341665))));
                        try {
                            Class<?> cls7 = Class.forName(strOd2);
                            Field field6 = 0 != 0 ? cls7.getField(strKd2) : cls7.getDeclaredField(strKd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i7 = (820086210 ^ 660106986) ^ 398060387;
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (BrazeInternal.INSTANCE.getConfigurationProvider(this).getShouldUseWindowFlagSecureInActivities()) {
            getWindow().setFlags(8192, 8192);
        }
        setContentView(R.layout.com_braze_feed_activity);
    }
}
