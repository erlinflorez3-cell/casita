package com.braze.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import bo.app.v30;
import bo.app.w30;
import com.braze.support.BrazeLogger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u000e\u0007nj?3LeV.Zݷ2\u000f\u0002{<řc$\bCCU \u007f(ߣOdʴ\u0018nxYKH\u0015\u0006Ȁ|j:I\u001e\u000fk\u001c'2pzo7[{U9\u000f\u0002f\t.@:8(\u0014G\u001frN\u001e\u0007\u0013Cy\u000eX5\tvHc%M3\u001cX\u000b\u0007&\u000f0tg|8\u000fq.F=$\u001bipP}ۂ\u0003ƊQ\rNÖw\u0019\u0005d6+n9\fՙw٨\u0007\u0007Z¹\u0010\u001cMuU\u0005\u0017,]k ֘ɓ6ݼ\u0004\u001e\u001d-U\u0015k{>^\u000bWn\u0013˕/b"}, d2 = {"\u001ab^:\")KO.~Dl<\b\u00149r\u000fq_I\u0010\u0017 V_\u001d@}3\u000b", "", "u(E", " D@\"8\u001a-MvhY>&dd\"", "", " D@\"8\u001a-MvhY>&dl\u0018", "@`]1b4", "\u001aiPCTuNb\u001d\u0006DK(\u0006\b9mU", "5dc\u001fT5=]!", "u(;7T=:\u001d)\u000e~eui\u00058d\n0Q", "@`]1b4|R\u0019\u0006z`(\f\t", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "/cS\u0010b4I]\"~\u0004m\b\u0006\b\u001de\t'XM\u000b\u0013\u0016Ek\u001cK", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7mc2a;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "5dc\u0016`4Nb\u0015{\u0002^\u0017|\u0012.i\t*_I\u0010\u0017 VP\u00158x3", "5dc\u001ah;:P ~e^5{\r8gc1\u000b@\n&wNk\u0010J", "5dc\u001fX8NS'\u000eXh+|", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class IntentUtils {
    private static final int REQUEST_CODE_MAX = 1073741823;
    private static final int REQUEST_CODE_MIN = 100000;
    public static final IntentUtils INSTANCE = new IntentUtils();
    private static final Lazy random$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) w30.f2101a);

    private IntentUtils() {
    }

    @JvmStatic
    public static final void addComponentAndSendBroadcast(Context context, Intent intent) throws Throwable {
        List<ResolveInfo> list;
        Intrinsics.checkNotNullParameter(context, C1561oA.Xd("S``gYmj", (short) (OY.Xd() ^ 20948)));
        Intrinsics.checkNotNullParameter(intent, Wg.vd("'-4&(/", (short) (C1580rY.Xd() ^ (-23358))));
        if (Build.VERSION.SDK_INT >= 33) {
            Class<?> cls = Class.forName(Qg.kd("6B7D@93{0;9>.6;s\b316&83", (short) (C1499aX.Xd() ^ (-1173)), (short) (C1499aX.Xd() ^ (-24353))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (ZN.Xd() ^ 31481);
            short sXd2 = (short) (ZN.Xd() ^ 9526);
            int[] iArr = new int["WTb=MNUJOL3FRDIFR".length()];
            QB qb = new QB("WTb=MNUJOL3FRDIFR");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Object[] objArr2 = {intent, PackageManager.ResolveInfoFlags.of(0L)};
                Method method2 = Class.forName(C1561oA.ud("XdYfb[U\u001eR][`PX]\u0016WS\u00134DELAFC*=I;@=I", (short) (OY.Xd() ^ 12415))).getMethod(Xg.qd("8=.<D\u000e?=0443FH';:=BP@NP", (short) (ZN.Xd() ^ 16627), (short) (ZN.Xd() ^ 30550)), Class.forName(C1561oA.yd("<HANNGE\u000eFQSXLT]\u0016\u00148A1=B", (short) (C1499aX.Xd() ^ (-21347)))), Class.forName(C1561oA.Yd("7E<KID@\u000bANNUGQX\u0013VT\u00169KNWNUT=R`T[Zh\u001bJ^mjhscHngqIpfmz", (short) (C1499aX.Xd() ^ (-28531)))));
                try {
                    method2.setAccessible(true);
                    list = (List) method2.invoke(packageManager, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } else {
            Object[] objArr3 = new Object[0];
            Method method3 = Class.forName(Jg.Wd("ihK\u0013L1g&\u000eU?y.\"\u001cOYwreX F", (short) (C1607wl.Xd() ^ 8697), (short) (C1607wl.Xd() ^ 30387))).getMethod(ZO.xd("qrn;}lB\u0017\u0017,[\u0001%I_d\b", (short) (C1607wl.Xd() ^ 16697), (short) (C1607wl.Xd() ^ 18895)), new Class[0]);
            try {
                method3.setAccessible(true);
                PackageManager packageManager2 = (PackageManager) method3.invoke(context, objArr3);
                Object[] objArr4 = {intent, 0};
                Method method4 = Class.forName(C1626yg.Ud("\u001bK#\u0003#t(\u0006*\u000f\u001d\u0011bva)$rG?\u001a)_+j{m\u001cF4^j\u0005", (short) (C1633zX.Xd() ^ (-22813)), (short) (C1633zX.Xd() ^ (-17164)))).getMethod(EO.Od("N%'OVLLY\u0016yvV72\byLL\u0019a\u000bpC", (short) (OY.Xd() ^ 29109)), Class.forName(Ig.wd("%\u000bN9m\n%'\u0001}~b\u0004\u0003\u0001\u001d\u0013\"p\u0006S\"", (short) (C1499aX.Xd() ^ (-30642)))), Integer.TYPE);
                try {
                    method4.setAccessible(true);
                    list = (List) method4.invoke(packageManager2, objArr4);
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        Intrinsics.checkNotNullExpressionValue(list, C1561oA.Qd("<8pw\u0011C68/w\u001f\r\u0019\u0019\u000e\u0013\u0011o\u0014\u0004\n\u001d\u0006\n䘈0\u001e**]\u001e\"'\u0017\u001f$ZM\\T4IHGFEDCB\u001f", (short) (C1499aX.Xd() ^ (-8466))));
        for (ResolveInfo resolveInfo : list) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setComponent(componentName);
            Class<?> cls2 = Class.forName(C1593ug.zd("z\t\u007f\u000f\r\b\u0004N\u0005\u0012\u0012\u0019\u000b\u0015\u001cVl\u001a\u001a!\u0013'$", (short) (C1499aX.Xd() ^ (-30228)), (short) (C1499aX.Xd() ^ (-25337))));
            Class<?>[] clsArr2 = {Class.forName(C1561oA.od("\u0003\u000f\u0004\u0011\r\u0006\u007fH|\b\u0006\u000bz\u0003\b@Z~\u0004s{\u0001", (short) (C1633zX.Xd() ^ (-15950))))};
            Object[] objArr5 = {intent2};
            short sXd3 = (short) (C1580rY.Xd() ^ (-11458));
            int[] iArr2 = new int["\u0017\n\u0014\u000bi\u001b\u0019\f\u0010\u0010\u000f\"$".length()];
            QB qb2 = new QB("\u0017\n\u0014\u000bi\u001b\u0019\f\u0010\u0010\u000f\"$");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i3));
                i3++;
            }
            Method method5 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
            try {
                method5.setAccessible(true);
                method5.invoke(context, objArr5);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new v30(componentName, intent2), 6, (Object) null);
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        }
    }

    @JvmStatic
    public static final int getImmutablePendingIntentFlags() {
        return AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    }

    @JvmStatic
    public static final int getMutablePendingIntentFlags() {
        return Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    private final Random getRandom() {
        return (Random) random$delegate.getValue();
    }

    @JvmStatic
    public static final int getRequestCode() {
        return INSTANCE.getRandom().nextInt(1073741823) + 100000;
    }
}
