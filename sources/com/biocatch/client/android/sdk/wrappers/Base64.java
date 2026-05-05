package com.biocatch.client.android.sdk.wrappers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001b6B\u0005\"4\u0012\u0006\rnj?0LeV:ZS0\u000fqڔJř\f$ B{X۟\u0002\"\u0017O\u0017}uobZ9E?\f${\u0003._T'_B\u0013@F\b?aR8SGf\r63\"b(F|\u001d\u00030)v\u0012'~QO$\u0012^E9P`\u0014e\u0005H\u001a6D.\n6^}MdJ\u001daH3;\u0003\u0018GĠ+i"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5\u0011\u001a#h2\b\\", "", "u(E", "2dR<W,", "", "2`c.", "4kP4f", "", "3mR<W,", "3mR<W,-]\u0007\u000e\bb5~", "", "7m_Bg", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class Base64 {
    public final byte[] decode(byte[] bArr, int i2) throws Throwable {
        Class<?> cls = Class.forName(Wg.vd("jvo|tmk4vtln+>`q^./", (short) (FB.Xd() ^ 17681)));
        Class<?>[] clsArr = {byte[].class, Integer.TYPE};
        Object[] objArr = {bArr, Integer.valueOf(i2)};
        short sXd = (short) (OY.Xd() ^ 13433);
        short sXd2 = (short) (OY.Xd() ^ 26501);
        int[] iArr = new int["''$/##".length()];
        QB qb = new QB("''$/##");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(((sXd + i3) + xuXd.CK(iKK)) - sXd2);
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            byte[] bArr2 = (byte[]) declaredMethod.invoke(null, objArr);
            Intrinsics.checkNotNullExpressionValue(bArr2, hg.Vd("\u0007\u0007\u0004\u000f\u0003\u0003D\u007f{\u000eyC6{\u0001ty\u00059", (short) (FB.Xd() ^ 19217), (short) (FB.Xd() ^ 13836)));
            return bArr2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final byte[] encode(byte[] bArr, int i2) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.ud("2>3@<5/w><02r\u0006$5&ur", (short) (C1580rY.Xd() ^ (-25811))));
        Class<?>[] clsArr = {byte[].class, Integer.TYPE};
        Object[] objArr = {bArr, Integer.valueOf(i2)};
        Method declaredMethod = cls.getDeclaredMethod(C1561oA.yd("\u0007\u0011\u0003\u0010\u0002\u0004", (short) (C1607wl.Xd() ^ 13964)), clsArr);
        try {
            declaredMethod.setAccessible(true);
            byte[] bArr2 = (byte[]) declaredMethod.invoke(null, objArr);
            Intrinsics.checkNotNullExpressionValue(bArr2, C1561oA.Yd("EOERHJ\u000eKI]K\u0017\fSZPWd\u001b", (short) (Od.Xd() ^ (-31794))));
            return bArr2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final String encodeToString(byte[] bArr, int i2) throws Throwable {
        short sXd = (short) (Od.Xd() ^ (-9236));
        short sXd2 = (short) (Od.Xd() ^ (-5475));
        int[] iArr = new int["s\u0002x\b\u0006\u0001|G\u0010\u0010\u0006\nLa\u0002\u0015\bYX".length()];
        QB qb = new QB("s\u0002x\b\u0006\u0001|G\u0010\u0010\u0006\nLa\u0002\u0015\bYX");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = {byte[].class, Integer.TYPE};
        Object[] objArr = {bArr, Integer.valueOf(i2)};
        short sXd3 = (short) (Od.Xd() ^ (-1330));
        short sXd4 = (short) (Od.Xd() ^ (-24695));
        int[] iArr2 = new int["_\u0002z\u001aTi[\u000b0$&6~\f".length()];
        QB qb2 = new QB("_\u0002z\u001aTi[\u000b0$&6~\f");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((i4 * sXd4) ^ sXd3));
            i4++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i4), clsArr);
        try {
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, objArr);
            Intrinsics.checkNotNullExpressionValue(str, ZO.xd("\u007f\u0015\u0003-GgD0!E\u0016d\u000bWCA)5\u001e\u000f[,!\u0017\u0004K*X", (short) (C1499aX.Xd() ^ (-16373)), (short) (C1499aX.Xd() ^ (-20696))));
            return str;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
