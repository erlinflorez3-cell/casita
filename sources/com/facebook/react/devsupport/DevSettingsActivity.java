package com.facebook.react.devsupport;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.facebook.react.R;
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
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
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
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fј|ʑi0rd\t1ʂW*\u001dkDD2\\<qq=\u0006 \f%!Qdf\u0016r\u0011nŸG\u0014"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~8}1%m%=QL=y\u0010\u001c$lr=\u0016w\u0002", "\u001a`]1e6BRb\n\b^-|\u0016/n}(E+\u000e\u0017\u0018G|\u000eEt%\u0011W\r$Hq%B#", "u(E", "=m2?X(MS", "", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DevSettingsActivity extends PreferenceActivity {
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strZd = Wg.Zd("s\u0015\u0007e]", (short) (FB.Xd() ^ ((625397096 ^ 1665425870) ^ 1174576990)), (short) (FB.Xd() ^ (213613290 ^ 213604100)));
            short sXd = (short) (C1607wl.Xd() ^ ((102449160 ^ 409800562) ^ 511063228));
            int[] iArr = new int["dS".length()];
            QB qb = new QB("dS");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls = Class.forName(strZd);
                Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strVd = Wg.vd("\u0017\u0004I\u0007j", (short) (Od.Xd() ^ ((916260333 ^ 21603044) ^ (-936683580))));
                String strKd = Qg.kd("|h", (short) (C1607wl.Xd() ^ (291438065 ^ 291429209)), (short) (C1607wl.Xd() ^ (978815492 ^ 978822454)));
                try {
                    Class<?> cls2 = Class.forName(strVd);
                    Field field2 = 0 != 0 ? cls2.getField(strKd) : cls2.getDeclaredField(strKd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strVd2 = hg.Vd("0\u001db \u0004", (short) (Od.Xd() ^ ((425708817 ^ 284281462) ^ (-162419758))), (short) (Od.Xd() ^ ((1564767230 ^ 147230746) ^ (-1434626427))));
                    String strUd = C1561oA.ud("7+", (short) (C1499aX.Xd() ^ (220424853 ^ (-220398491))));
                    try {
                        Class<?> cls3 = Class.forName(strVd2);
                        Field field3 = 0 != 0 ? cls3.getField(strUd) : cls3.getDeclaredField(strUd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(C1561oA.yd("cP\u001ac?", (short) (C1580rY.Xd() ^ ((1146721897 ^ 1907531234) ^ (-904596945))))).getDeclaredMethod(C1561oA.Yd(",9", (short) (C1499aX.Xd() ^ (1302136661 ^ (-1302167248)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {Xg.qd("rekbnw", (short) (FB.Xd() ^ ((1943439460 ^ 2090540387) ^ 256756633)), (short) (FB.Xd() ^ ((1490703902 ^ 525755530) ^ 1200375885)))};
                                Method method = Class.forName(Jg.Wd("G'\b`\bH.B\"x^/J\u001e\u000b\u000fJA+\b#\u0001g", (short) (C1607wl.Xd() ^ ((1795195724 ^ 1422581245) ^ 1070215553)), (short) (C1607wl.Xd() ^ (1860760691 ^ 1860735073)))).getMethod(C1626yg.Ud("K{-LSE\u0006\u0018\u0017\u0015\u001f1\u007f\r.k", (short) (C1499aX.Xd() ^ ((1844225177 ^ 646284454) ^ (-1265197203))), (short) (C1499aX.Xd() ^ ((440963741 ^ 1772614578) ^ (-1945065951)))), Class.forName(ZO.xd("NQ0e\u001c3\u001f4\u0007!`^Hf\n\r", (short) (OY.Xd() ^ (565753919 ^ 565772052)), (short) (OY.Xd() ^ (1887026049 ^ 1887016828)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd2 = (short) (C1499aX.Xd() ^ ((779735494 ^ 693870388) ^ (-119670605)));
                                    int[] iArr2 = new int["\u0005<P\u0004\u0001".length()];
                                    QB qb2 = new QB("\u0005<P\u0004\u0001");
                                    int i3 = 0;
                                    while (qb2.YK()) {
                                        int iKK2 = qb2.KK();
                                        Xu xuXd2 = Xu.Xd(iKK2);
                                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd2 + i3)));
                                        i3++;
                                    }
                                    String str2 = new String(iArr2, 0, i3);
                                    String strOd = EO.Od("+x", (short) (Od.Xd() ^ (1913047493 ^ (-1913041681))));
                                    try {
                                        Class<?> cls4 = Class.forName(str2);
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
                    String strQd = C1561oA.Qd(",\u0019^\u001c\u007f", (short) (C1607wl.Xd() ^ (403399057 ^ 403374480)));
                    String strZd2 = C1593ug.zd("}s", (short) (Od.Xd() ^ (382765804 ^ (-382765735))), (short) (Od.Xd() ^ (1188470606 ^ (-1188475181))));
                    try {
                        Class<?> cls5 = Class.forName(strQd);
                        Field field5 = 0 != 0 ? cls5.getField(strZd2) : cls5.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strOd2 = C1561oA.od("fS\u0019V:", (short) (C1499aX.Xd() ^ (1838311194 ^ (-1838302282))));
                        String strKd2 = C1561oA.Kd("dZ", (short) (C1607wl.Xd() ^ (845747205 ^ 845751595)));
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
                        int i4 = 1147840550 ^ 1147840621;
                        if (x2 > i4 && x2 < displayMetrics.widthPixels - i4 && y2 > i4 && y2 < displayMetrics.heightPixels - i4) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getApplication().getResources().getString(R.string.catalyst_settings_title));
        addPreferencesFromResource(R.xml.rn_dev_preferences);
    }
}
