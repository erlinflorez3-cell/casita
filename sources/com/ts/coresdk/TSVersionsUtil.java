package com.ts.coresdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
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
@Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4D\u0007\":ߚ}Ҡf\u0001ˎ`D\u0014NnYY*Ƃo}:(i):XIW2}P\n\u007fRug\u0007J\t\n\n\u0014و\u001azp.WX"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0019{M\u000f\u001b!P}}Kz,\u000b", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", "", "5dc\u000ec7/S&\r~h5", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ#{!FUG'3v\u0018w;RHo= j", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TSVersionsUtil {
    public static final TSVersionsUtil INSTANCE = new TSVersionsUtil();

    private TSVersionsUtil() {
    }

    public final String getAppVersion(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("JVO\\TMK\u0014T_afRZc\u001c\u001cGIN:LK", (short) (C1499aX.Xd() ^ (-20103)))).getMethod(C1561oA.Yd(")(8\u0015'*3*10\u0019.<076D", (short) (C1580rY.Xd() ^ (-9040))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Class<?> cls = Class.forName(Xg.qd("3A8GE@<\u0007=JJQCMT\u000f%RRYK_\\", (short) (C1580rY.Xd() ^ (-2691)), (short) (C1580rY.Xd() ^ (-4127))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd = (short) (C1580rY.Xd() ^ (-6873));
                short sXd2 = (short) (C1580rY.Xd() ^ (-6583));
                int[] iArr = new int["KZ6[9\bac6}3\u0014p5".length()];
                QB qb = new QB("KZ6[9\bac6}3\u0014p5");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                    i2++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context, objArr2);
                    Class<?> cls2 = Class.forName(ZO.xd("R^Wt\tx\u000b7|H;O[9\u0014\u0011\u0002)\u0013~+b>/e\u0006CQ\u000fs<\u00123", (short) (Od.Xd() ^ (-30494)), (short) (Od.Xd() ^ (-18429))));
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Class.forName(C1626yg.Ud("(\b4XN2GUfQIz\u0019~`P", (short) (C1580rY.Xd() ^ (-17633)), (short) (C1580rY.Xd() ^ (-28135))));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 1};
                    Method method3 = cls2.getMethod(Ig.wd("\u0012J\b\u007fx=-s:\\B\u0006NM", (short) (FB.Xd() ^ 25506)), clsArr2);
                    try {
                        method3.setAccessible(true);
                        PackageInfo packageInfo = (PackageInfo) method3.invoke(packageManager, objArr3);
                        int i3 = Build.VERSION.SDK_INT;
                        String strOd = EO.Od("A\u001c\u001f", (short) (OY.Xd() ^ 16884));
                        if (i3 > 28) {
                            return packageInfo.versionName + strOd + packageInfo.getLongVersionCode();
                        }
                        return packageInfo.versionName + strOd + Build.VERSION.SDK_INT;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (Throwable unused) {
            return "";
        }
    }
}
