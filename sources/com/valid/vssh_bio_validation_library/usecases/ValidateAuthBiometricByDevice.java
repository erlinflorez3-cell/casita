package com.valid.vssh_bio_validation_library.usecases;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r(4\u0012\u000e\u0007nʑA0ZeP\u008chݷZ\u000f\u001azt'Ӯ(qQ;\u001e6\f#!_^iwnx]9Ew\f&zz,wXWaB\u0013@G\b?aSڷA@"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SIk2\u001a#ho\u0003w_3Ru#VL*<kUOA\u001e\u001aZ\u001d[/\u000bam $\u007fH5\u001f]", "", "u(E", "5dc\u000f\\6FS(\f~\\\u000fx\u0016.w{5{/\u0015\"\u0017U", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class ValidateAuthBiometricByDevice {
    public final ArrayList<Integer> getBiometricHardwareTypes(Context context) throws Throwable {
        boolean zBooleanValue;
        Intrinsics.checkParameterIsNotNull(context, C1561oA.od("1<:?/A<", (short) (Od.Xd() ^ (OY.Xd() ^ (-69932783)))));
        ArrayList<Integer> arrayList = new ArrayList<>();
        Class<?> cls = Class.forName(C1561oA.Kd("z\t\u007f\u000f\r\b\u0004N\u0005\u0012\u0012\u0019\u000b\u0015\u001cVl\u001a\u001a!\u0013'$", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ 831091937))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        int iXd = ZN.Xd() ^ (1141732100 ^ (-2005337367));
        short sXd = (short) (C1499aX.Xd() ^ (880725948 ^ (-880710157)));
        short sXd2 = (short) (C1499aX.Xd() ^ iXd);
        int[] iArr = new int["Nhgrm \u0018=-Y1tk\u000f\u00052)".length()];
        QB qb = new QB("Nhgrm \u0018=-Y1tk\u000f\u00052)");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Intrinsics.checkExpressionValueIsNotNull(packageManager, C1561oA.Xd("\u0018%%,\u001e2/i-\u001f\"+\")(\u0011&4(/.<", (short) (C1633zX.Xd() ^ (618113243 ^ (-618132316)))));
            Object[] objArr2 = {Wg.vd("\u001e,#20+'q\u001d\u0017)\u001c0\u001b-!Z\u0014\u0018\u001e\u0018\u0017%$\u0017\u000f\u0015\u001c", (short) (C1499aX.Xd() ^ (1210074241 ^ (-1210072470))))};
            Method method2 = Class.forName(Qg.kd("P\\Q^ZSM\u0016JUSXHPU\u000eOK\u000b,<=D9>;\"5A385A", (short) (OY.Xd() ^ (819240458 ^ 819244379)), (short) (OY.Xd() ^ ((1116369436 ^ 80388217) ^ 1178646874)))).getMethod(C1561oA.ud("\u001f\u0017(\u0007,%%\u0015\u001cs\u0012\r\u001f\u001f\u001b\r", (short) (OY.Xd() ^ (621366861 ^ 621361088))), Class.forName(hg.Vd("%\u001b/\u0019d\"\u0016\"\u001a_\u0004$!\u0017\u001b\u0013", (short) (C1499aX.Xd() ^ ((1464221929 ^ 923892433) ^ (-1616334174))), (short) (C1499aX.Xd() ^ ((389011685 ^ 1603397896) ^ (-1220435939))))));
            try {
                method2.setAccessible(true);
                boolean zBooleanValue2 = ((Boolean) method2.invoke(packageManager, objArr2)).booleanValue();
                boolean zBooleanValue3 = false;
                int i3 = (225082597 ^ 484653499) ^ 294208835;
                if (Build.VERSION.SDK_INT >= i3) {
                    String strYd = C1561oA.yd("\u001b' -%\u001e\u001cd*\"6'5\u001e2$w+5:3*<9;4G\u00014.34", (short) (ZN.Xd() ^ ((1156729517 ^ 270221266) ^ 1424564970)));
                    Class<?> cls2 = Class.forName(C1561oA.Yd("m{r\u0002\u007fzvAw\u0005\u0005\f}\b\u000fI\r\u000bLo\u0002\u0005\u000e\u0005\f\u000bs\t\u0017\u000b\u0012\u0011\u001f", (short) (Od.Xd() ^ (1963329474 ^ (-1963356450)))));
                    Class<?>[] clsArr2 = new Class[1];
                    short sXd3 = (short) (C1499aX.Xd() ^ ((1251342662 ^ 1329526682) ^ (-95124686)));
                    short sXd4 = (short) (C1499aX.Xd() ^ ((248699194 ^ 1731074461) ^ (-1778166697)));
                    int[] iArr2 = new int["bZp\\*i_mg/Uwvntn".length()];
                    QB qb2 = new QB("bZp\\*i_mg/Uwvntn");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i4)) + sXd4);
                        i4++;
                    }
                    clsArr2[0] = Class.forName(new String(iArr2, 0, i4));
                    Object[] objArr3 = {strYd};
                    Method method3 = cls2.getMethod(Jg.Wd(";FhE\u0006\b}\u0011\tn(\u001c\u0005\u0018\u0005\u0015", (short) (Od.Xd() ^ (1653652438 ^ (-1653661386))), (short) (Od.Xd() ^ (259193368 ^ (-259186917)))), clsArr2);
                    try {
                        method3.setAccessible(true);
                        zBooleanValue = ((Boolean) method3.invoke(packageManager, objArr3)).booleanValue();
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } else {
                    zBooleanValue = false;
                }
                if (Build.VERSION.SDK_INT >= i3) {
                    String strXd = ZO.xd("1Ua\u00048\u0007H:^v-K<PQ\fG?\u0015JjGsM??F@]\u001e`*", (short) (C1580rY.Xd() ^ ((118478433 ^ 1378775057) ^ (-1428262715))), (short) (C1580rY.Xd() ^ ((1792084147 ^ 1407739792) ^ (-960055737))));
                    Class<?> cls3 = Class.forName(C1626yg.Ud("g^38DODN\u00014d%VA*t+BDy:}z1\u0006SD3\f\u0016\u0003pH", (short) (Od.Xd() ^ (1390497891 ^ (-1390487712))), (short) (Od.Xd() ^ (117413728 ^ (-117416801)))));
                    Class<?>[] clsArr3 = {Class.forName(Ig.wd("\"j\f$/)or\u0015\u0011.W'*)A", (short) (Od.Xd() ^ ((779699889 ^ 1978497444) ^ (-1536437499)))))};
                    Object[] objArr4 = {strXd};
                    short sXd5 = (short) (Od.Xd() ^ ((1831073507 ^ 1892947199) ^ (-502779869)));
                    int[] iArr3 = new int["xA!e,J{\u0015S\r.\b\u0006|mz".length()];
                    QB qb3 = new QB("xA!e,J{\u0015S\r.\b\u0006|mz");
                    int i5 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i5] = xuXd3.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + i5)) + xuXd3.CK(iKK3));
                        i5++;
                    }
                    Method method4 = cls3.getMethod(new String(iArr3, 0, i5), clsArr3);
                    try {
                        method4.setAccessible(true);
                        zBooleanValue3 = ((Boolean) method4.invoke(packageManager, objArr4)).booleanValue();
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                if (zBooleanValue2) {
                    arrayList.add(1);
                }
                if (zBooleanValue) {
                    arrayList.add(Integer.valueOf((1979549394 ^ 321765714) ^ 1724925826));
                }
                if (zBooleanValue3) {
                    arrayList.add(Integer.valueOf(1051356647 ^ 1051356644));
                }
                return arrayList;
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }
}
