package com.davivienda.daviviendaapp.bridges.gpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007f\u0007loOӄbox.\u0001Rb\u000eu<7ż_$\u007fC\u0004e(~:\t}P\u0018m|Mr\rY\u000e4\u001a?|tOc}u\u0012=4\t\u0002\b9[uU9\u000fv|\u0017h80?\u0012\u0005/\u001cpZX|\tKc\f@2\u0007\u0003\u0003X\u001bV\u001d\u001a@\b\u00052Ӟ\"g"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wON7\u007f}\u000f\u0019v]'\u0016c7>\u0002\u0003E[R=`a\u0007\u0013", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "u(E", "=m2?X(MS", "", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=m32f;K]-", "=m?.h:>", "=mA2f<FS", "=mBAT9M", "=mBAb7", "\u0011n\\=T5B]\"", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class VisaStepUpActivity extends Activity {
    public static final String AUTHENTICATION_CODE_RESPONSE;
    public static final Companion Companion;
    public static final String STEPUP_RESULT_APPROVED;
    public static final String STEPUP_RESULT_DECLINED;
    public static final String STEPUP_RESULT_FAILED;
    public static final String VISA_STEPUP_RESULT_RESPONSE = Xg.qd("\u0003\u0005v\u0003\u0013\n\u0006\u0016\n}\r\u000b\u000b\u000b\u0011\u0004", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951465754))), (short) (ZN.Xd() ^ (OY.Xd() ^ (1198120242 ^ 1128435122))));

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005%2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͓MŲO\f\u001aؓ\u0011|HX%M3\u001chæ\u0011ŋ\u0005\u001edɡߗ:O"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wON7\u007f}\u000f\u0019v]'\u0016c7>\u0002\u0003E[R=`a\u0007{q\u001cb\u0019J4\u0011\u000fb\u0017", "", "u(E", "\u000fTC\u00158\u0015-7vZiB\u0016e\u0003\rO^\bu-`\u0005\u00021X{\u001c", "", "!S4\u001dH\u00178@xljE\u001bvd\u001aPl\u0012l _", "!S4\u001dH\u00178@xljE\u001bvg\u000fCf\fd _", "!S4\u001dH\u00178@xljE\u001bvi\u000bIf\bZ", "$HB\u000eR\u001a-3\u0004neX\u0019\\v\u001fLn\"h n\u0002\u00010]m", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        short sXd = (short) (C1580rY.Xd() ^ (OY.Xd() ^ (-69928498)));
        short sXd2 = (short) (C1580rY.Xd() ^ ((83794729 ^ 1591552671) ^ (-1512277895)));
        int[] iArr = new int["c=C4\u001cvk".length()];
        QB qb = new QB("c=C4\u001cvk");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        STEPUP_RESULT_FAILED = new String(iArr, 0, i2);
        STEPUP_RESULT_DECLINED = ZO.xd(":#\u0010\u001d]tFt", (short) (Od.Xd() ^ ((1104719742 ^ 2108171447) ^ (-1014011397))), (short) (Od.Xd() ^ (C1499aX.Xd() ^ (1059662555 ^ 2092042794))));
        STEPUP_RESULT_APPROVED = C1626yg.Ud("S>Z\u0007u6\u001f/", (short) (C1499aX.Xd() ^ (664910650 ^ (-664927723))), (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849963560))));
        AUTHENTICATION_CODE_RESPONSE = Ig.wd("V\u0001\"O\u00155V\u0014.!\u001cwC\u001f9\u00136", (short) (C1580rY.Xd() ^ (582457855 ^ (-582467326))));
        Companion = new Companion(null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strOd = EO.Od("\u000f3]u\u0004", (short) (C1580rY.Xd() ^ ((556635548 ^ 1044544232) ^ (-527428718))));
            String strQd = C1561oA.Qd("\u0003o", (short) (FB.Xd() ^ ((1630113687 ^ 1332207640) ^ 776884970)));
            try {
                Class<?> cls = Class.forName(strOd);
                Field field = 0 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strZd = C1593ug.zd("|k3rX", (short) (ZN.Xd() ^ (1904572229 ^ 1904571010)), (short) (ZN.Xd() ^ (248008391 ^ 247989712)));
                short sXd = (short) (C1607wl.Xd() ^ ((60928456 ^ 68839543) ^ 129741732));
                int[] iArr = new int["\u000bv".length()];
                QB qb = new QB("\u000bv");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                try {
                    Class<?> cls2 = Class.forName(strZd);
                    Field field2 = 0 != 0 ? cls2.getField(str) : cls2.getDeclaredField(str);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strKd = C1561oA.Kd("aP\u0018W=", (short) (C1580rY.Xd() ^ ((1653679395 ^ 1495775891) ^ (-1001824101))));
                    String strZd2 = Wg.Zd("C_", (short) (C1499aX.Xd() ^ ((401805092 ^ 519564156) ^ (-151321587))), (short) (C1499aX.Xd() ^ ((1028824485 ^ 199087063) ^ (-915371630))));
                    try {
                        Class<?> cls3 = Class.forName(strKd);
                        Field field3 = 0 != 0 ? cls3.getField(strZd2) : cls3.getDeclaredField(strZd2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Class<?> cls4 = Class.forName(C1561oA.Xd("E4{G)", (short) (C1499aX.Xd() ^ ((453625753 ^ 992131484) ^ (-539712984)))));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr = new Object[0];
                        short sXd2 = (short) (OY.Xd() ^ ((1035153991 ^ 2031203987) ^ 1151527739));
                        int[] iArr2 = new int["\u0002\u000f".length()];
                        QB qb2 = new QB("\u0002\u000f");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
                            i3++;
                        }
                        Method declaredMethod = cls4.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strKd2 = Qg.kd("*\u001b\u001f\u0014\u001e%", (short) (C1580rY.Xd() ^ (1549498435 ^ (-1549475778))), (short) (C1580rY.Xd() ^ ((434746066 ^ 782032199) ^ (-930426758))));
                                short sXd3 = (short) (ZN.Xd() ^ (1317698204 ^ 1317669732));
                                short sXd4 = (short) (ZN.Xd() ^ (724508219 ^ 724503854));
                                int[] iArr3 = new int["x\u0005y\u0007\u0003{u>r}{\u0001px}6Jusxhzu".length()];
                                QB qb3 = new QB("x\u0005y\u0007\u0003{u>r}{\u0001px}6Jusxhzu");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK(sXd3 + i4 + xuXd3.CK(iKK3) + sXd4);
                                    i4++;
                                }
                                Object[] objArr2 = {strKd2};
                                Method method = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.yd("SP^<aZZJQ6GSVHAB", (short) (OY.Xd() ^ (1755278927 ^ 1755269288))), Class.forName(C1561oA.ud("|r\u0007p<ymyq7[{xnrj", (short) (C1499aX.Xd() ^ (1435525373 ^ (-1435505834))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd5 = (short) (ZN.Xd() ^ (268294029 ^ 268300280));
                                    int[] iArr4 = new int["0\u001ff&\f".length()];
                                    QB qb4 = new QB("0\u001ff&\f");
                                    int i5 = 0;
                                    while (qb4.YK()) {
                                        int iKK4 = qb4.KK();
                                        Xu xuXd4 = Xu.Xd(iKK4);
                                        iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (((sXd5 + sXd5) + sXd5) + i5));
                                        i5++;
                                    }
                                    String str2 = new String(iArr4, 0, i5);
                                    short sXd6 = (short) (OY.Xd() ^ (988430354 ^ 988423794));
                                    short sXd7 = (short) (OY.Xd() ^ ((1315795615 ^ 2006428522) ^ 972734083));
                                    int[] iArr5 = new int["WM".length()];
                                    QB qb5 = new QB("WM");
                                    int i6 = 0;
                                    while (qb5.YK()) {
                                        int iKK5 = qb5.KK();
                                        Xu xuXd5 = Xu.Xd(iKK5);
                                        iArr5[i6] = xuXd5.fK((xuXd5.CK(iKK5) - (sXd6 + i6)) + sXd7);
                                        i6++;
                                    }
                                    String str3 = new String(iArr5, 0, i6);
                                    try {
                                        Class<?> cls5 = Class.forName(str2);
                                        Field field4 = 0 != 0 ? cls5.getField(str3) : cls5.getDeclaredField(str3);
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
                    String strWd = Jg.Wd("pi-hJ", (short) (Od.Xd() ^ ((930809209 ^ 2124708479) ^ (-1239360699))), (short) (Od.Xd() ^ ((252636808 ^ 1474053087) ^ (-1490205316))));
                    String strXd = ZO.xd("%H", (short) (C1580rY.Xd() ^ ((1701685863 ^ 832479719) ^ (-1425230868))), (short) (C1580rY.Xd() ^ ((1651704661 ^ 294567712) ^ (-1946007153))));
                    try {
                        Class<?> cls6 = Class.forName(strWd);
                        Field field5 = 0 != 0 ? cls6.getField(strXd) : cls6.getDeclaredField(strXd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strUd = C1626yg.Ud("v\f3L\u001e", (short) (C1580rY.Xd() ^ (1076532925 ^ (-1076552544))), (short) (C1580rY.Xd() ^ ((712632231 ^ 1907380463) ^ (-1539951999))));
                        String strWd2 = Ig.wd("\u0012a", (short) (ZN.Xd() ^ (1859503212 ^ 1859512990)));
                        try {
                            Class<?> cls7 = Class.forName(strUd);
                            Field field6 = 0 != 0 ? cls7.getField(strWd2) : cls7.getDeclaredField(strWd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i7 = (1198603141 ^ 1210004314) ^ 258869396;
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

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getIntent().getStringExtra(EO.Od("\rRl\u0015\f:\u000bO-pn\b?I\u0011p8Pg\u0012\" jyI", (short) (C1633zX.Xd() ^ (1052909814 ^ (-1052933622)))));
        Intent intent = new Intent();
        short sXd = (short) (C1607wl.Xd() ^ ((40272807 ^ 265449251) ^ 229959833));
        int[] iArr = new int["nn^hvkeseWd`^\\`Q".length()];
        QB qb = new QB("nn^hvkeseWd`^\\`Q");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        short sXd2 = (short) (C1607wl.Xd() ^ (Od.Xd() ^ (602647266 ^ 1679175260)));
        short sXd3 = (short) (C1607wl.Xd() ^ (2124919706 ^ 2124925471));
        int[] iArr2 = new int["N^_b`hXX".length()];
        QB qb2 = new QB("N^_b`hXX");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        intent.putExtra(str, new String(iArr2, 0, i3));
        intent.putExtra(C1561oA.od("}}mw\u0006zt\u0003cvtg}`k__", (short) (FB.Xd() ^ (ZN.Xd() ^ (1952100584 ^ 1204873077)))), C1561oA.Kd("Xe[a`iZofktlbfr", (short) (C1499aX.Xd() ^ (1541358282 ^ (-1541354575)))));
        setResult(C1580rY.Xd() ^ (1315240386 ^ 2146299356), intent);
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }
}
