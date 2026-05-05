package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.Logger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZO;

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
/* JADX INFO: compiled from: WakeLocks.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d̉=!,u\bӵLc\u0003\u0004Iي8\u000bDB\u0007\"B\u0012\u007fјnjO0LeN.jW8\u000f\u0004{b%s>\u007fESYH\u0001r\t}R\u0018k|Or\u000bq\u00156\u001a\u0007qDI\u0004w$܈/>PģW3{n\u0014ʣbҽ:\u0005(݅ś<\u0002"}, d2 = {"\"@6", "", "1gT0^\u001e:Y\u0019e\u0005\\2\u000b", "", "<df$T2>:#|\u0001", "\u001a`]1e6BRb\t\t(\u0017\u0007\u001b/rg$\u0005<\u0003\u0017$\u0006a\nBv\f?W\u0004u", "\u001a`]1e6BRb\t\t(\u0017\u0007\u001b/rg$\u0005<\u0003\u0017$\u001d", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "B`V", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 2, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WakeLocks {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WakeLocks");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(\"WakeLocks\")");
        TAG = strTagWithPrefix;
    }

    public static final PowerManager.WakeLock newWakeLock(Context context, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(context, Xg.qd("\\iipbvs", (short) (C1580rY.Xd() ^ (-29889)), (short) (C1580rY.Xd() ^ (-28205))));
        Intrinsics.checkNotNullParameter(str, Jg.Wd("`b\u0004", (short) (C1607wl.Xd() ^ 11043), (short) (C1607wl.Xd() ^ 24904)));
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("F[\u001f\u0014R?yQ\u00143E65R91.pgg\u001bf\u0018", (short) (C1607wl.Xd() ^ 8484), (short) (C1607wl.Xd() ^ 5226))).getMethod(C1626yg.Ud("\nT0;\r\u0014716si6g.oiX2\u000b\u0006`", (short) (C1607wl.Xd() ^ 8656), (short) (C1607wl.Xd() ^ 13646)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            String strWd = Ig.wd("&vP\u001a\u007f", (short) (C1607wl.Xd() ^ 14129));
            short sXd = (short) (OY.Xd() ^ 9572);
            int[] iArr = new int["\u0012n4 \u007f'D7Lyt\u001bW`@\u001d\u007f(pL|i\u000e".length()];
            QB qb = new QB("\u0012n4 \u007f'D7Lyt\u001bW`@\u001d\u007f(pL|i\u000e");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = {Class.forName(C1561oA.Qd("]SgQ\u001dZNZR\u0018<\\YOSK", (short) (OY.Xd() ^ 24006)))};
            Object[] objArr2 = {strWd};
            short sXd2 = (short) (OY.Xd() ^ 6996);
            short sXd3 = (short) (OY.Xd() ^ 32139);
            int[] iArr2 = new int["\u001b\u001a*\n1,. )\u0010#16*%(".length()];
            QB qb2 = new QB("\u001b\u001a*\n1,. )\u0010#16*%(");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
                i3++;
            }
            Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method2.setAccessible(true);
                Object objInvoke = method2.invoke(context2, objArr2);
                Intrinsics.checkNotNull(objInvoke, C1561oA.od("LRHGy<9EDDHr46o2/@@j>8g553p17-,^26, Y\u001a&\u001b($\u001d\u0017_ #\\}\u001c#\u0010\u001cu\t\u0015\u0007\f\t\u0015", (short) (FB.Xd() ^ 19960)));
                String str2 = C1561oA.Kd("|\u0016\u001a\u0014v\f\u001a\u000e\u0015\u0014\"jQ", (short) (C1580rY.Xd() ^ (-30954))) + str;
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) objInvoke).newWakeLock(1, str2);
                synchronized (WakeLocksHolder.INSTANCE) {
                    WakeLocksHolder.INSTANCE.getWakeLocks().put(wakeLockNewWakeLock, str2);
                }
                Intrinsics.checkNotNullExpressionValue(wakeLockNewWakeLock, Wg.Zd("5\u000b\u0015\u0003jy]F", (short) (FB.Xd() ^ 2758), (short) (FB.Xd() ^ 9915)));
                return wakeLockNewWakeLock;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static final void checkWakeLocks() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (WakeLocksHolder.INSTANCE) {
            linkedHashMap.putAll(WakeLocksHolder.INSTANCE.getWakeLocks());
            Unit unit = Unit.INSTANCE;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                Logger.get().warning(TAG, "WakeLock held for " + str);
            }
        }
    }
}
