package com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0004Wي`\u000b\\A?%݈\u0016w\u0015fʺ=1"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wWL8u0+\u0014lj;\u0015r,Y\u0005pHHL,&NpL\u0018#^\u001dbtp\u0004A=3lG\u0017(\u00156P\t\u001cd~\fq\fDn\u0002Fe$\u001d", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0002)Fm#/IA;y}\r\u0019fjC\u0019?*]z8K[b\u0002", "u(E", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IdMatchEnrollFaceActivity extends TicnowActivity {
    private HashMap _$_findViewCache;

    @Override // com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity
    public void _$_clearFindViewByIdCache() {
        HashMap map = this._$_findViewCache;
        if (map != null) {
            map.clear();
        }
    }

    @Override // com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity
    public View _$_findCachedViewById(int i2) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i2);
        this._$_findViewCache.put(Integer.valueOf(i2), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strXd = ZO.xd("\u0004,Y\u0003{", (short) (C1499aX.Xd() ^ (651964348 ^ (-651982983))), (short) (C1499aX.Xd() ^ ((1531308138 ^ 1074889169) ^ (-458510832))));
            short sXd = (short) (Od.Xd() ^ ((214011119 ^ 2105265389) ^ (-1908041032)));
            short sXd2 = (short) (Od.Xd() ^ (289786821 ^ (-289788411)));
            int[] iArr = new int["Z\u001d".length()];
            QB qb = new QB("Z\u001d");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls = Class.forName(strXd);
                Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strWd = Ig.wd("{:Nl\u0011", (short) (C1580rY.Xd() ^ (1007366209 ^ (-1007365054))));
                String strOd = EO.Od("_{", (short) (C1633zX.Xd() ^ (1135877504 ^ (-1135875463))));
                try {
                    Class<?> cls2 = Class.forName(strWd);
                    Field field2 = 0 != 0 ? cls2.getField(strOd) : cls2.getDeclaredField(strOd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strQd = C1561oA.Qd("\u001b\bM\u000bn", (short) (FB.Xd() ^ (1556621147 ^ 1556638296)));
                    String strZd = C1593ug.zd("* ", (short) (OY.Xd() ^ (726057045 ^ 726051995)), (short) (OY.Xd() ^ (1835143574 ^ 1835161427)));
                    try {
                        Class<?> cls3 = Class.forName(strQd);
                        Field field3 = 0 != 0 ? cls3.getField(strZd) : cls3.getDeclaredField(strZd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(C1561oA.od("N;\u0001J*", (short) (FB.Xd() ^ (1539513897 ^ 1539531055)))).getDeclaredMethod(C1561oA.Kd("cp", (short) (FB.Xd() ^ ((2027883261 ^ 1823120846) ^ 343272985))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd3 = (short) (C1607wl.Xd() ^ (928982393 ^ 928980205));
                                short sXd4 = (short) (C1607wl.Xd() ^ ((195871465 ^ 574201125) ^ 697636550));
                                int[] iArr2 = new int["Th>-Z9".length()];
                                QB qb2 = new QB("Th>-Z9");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK(((i3 * sXd4) ^ sXd3) + xuXd2.CK(iKK2));
                                    i3++;
                                }
                                String str2 = new String(iArr2, 0, i3);
                                Class<?> cls4 = Class.forName(C1561oA.Xd("KYP_]XT\u001fUbbi[el'=jjqcwt", (short) (Od.Xd() ^ ((137822774 ^ 1011485960) ^ (-880626201)))));
                                Class<?>[] clsArr = {Class.forName(Wg.vd("J@T>\nG;GO\u00159YVLPH", (short) (FB.Xd() ^ (953609829 ^ 953582926))))};
                                Object[] objArr2 = {str2};
                                short sXd5 = (short) (C1580rY.Xd() ^ (1772055847 ^ (-1772055955)));
                                short sXd6 = (short) (C1580rY.Xd() ^ (1998937412 ^ (-1998928768)));
                                int[] iArr3 = new int["\u001e\u001b)\u0007,%%\u0015\u001c\u0001\u0012\u001e!\u0013\f\r".length()];
                                QB qb3 = new QB("\u001e\u001b)\u0007,%%\u0015\u001c\u0001\u0012\u001e!\u0013\f\r");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK(((sXd5 + i4) + xuXd3.CK(iKK3)) - sXd6);
                                    i4++;
                                }
                                Method method = cls4.getMethod(new String(iArr3, 0, i4), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strVd = hg.Vd("\u007fl2oS", (short) (C1633zX.Xd() ^ (1632333189 ^ (-1632317662))), (short) (C1633zX.Xd() ^ (1920306502 ^ (-1920312718))));
                                    String strUd = C1561oA.ud("OC", (short) (ZN.Xd() ^ ((542990307 ^ 928185970) ^ 386922287)));
                                    try {
                                        Class<?> cls5 = Class.forName(strVd);
                                        Field field4 = 0 != 0 ? cls5.getField(strUd) : cls5.getDeclaredField(strUd);
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
                    String strYd = C1561oA.yd("/\u001ea!\u0003", (short) (C1580rY.Xd() ^ ((1387925101 ^ 1132741953) ^ (-289295549))));
                    short sXd7 = (short) (C1607wl.Xd() ^ (1376298641 ^ 1376311066));
                    int[] iArr4 = new int["5+".length()];
                    QB qb4 = new QB("5+");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (((sXd7 + sXd7) + sXd7) + i5));
                        i5++;
                    }
                    String str3 = new String(iArr4, 0, i5);
                    try {
                        Class<?> cls6 = Class.forName(strYd);
                        Field field5 = 0 != 0 ? cls6.getField(str3) : cls6.getDeclaredField(str3);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strQd2 = Xg.qd("hW\u001f^D", (short) (FB.Xd() ^ (90271764 ^ 90248693)), (short) (FB.Xd() ^ (1411054527 ^ 1411048196)));
                        String strWd2 = Jg.Wd("JV", (short) (C1633zX.Xd() ^ (1502487604 ^ (-1502493666))), (short) (C1633zX.Xd() ^ (405720298 ^ (-405702791))));
                        try {
                            Class<?> cls7 = Class.forName(strQd2);
                            Field field6 = 0 != 0 ? cls7.getField(strWd2) : cls7.getDeclaredField(strWd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i6 = (1339933029 ^ 1511225972) ^ 365869914;
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
}
