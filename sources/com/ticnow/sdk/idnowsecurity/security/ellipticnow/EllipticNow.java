package com.ticnow.sdk.idnowsecurity.security.ellipticnow;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
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
import yg.Qg;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0005WيN\f^B-!d\u0011xGiʴ=0Re߲2T"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bnCY{0Dq%B\u0017CBr8)$l_B\u0011uu.}.KW]0Z;|Oi", "", "u(E", "\u0011n\\=T5B]\"", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class EllipticNow {
    public static final Companion Companion = new Companion(null);

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{|(i%\nCiWb\n0\fgN\u0016i\u001fNh\u000f[\u000f4\u0018ѷn1"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bnCY{0Dq%B\u0017CBr8)$l_B\u0011uu.}.KW]0Z;|ORod\u0016Y'\u0016\tcJy", "", "u(E", "5d]2e(MS\u0007~xixLY<1j8xG\u0005\u0015|G\u0004", "", "5d]2e(MS\u0007\u0002vk,{v/c\r(\u000b", "AdaCX9)c\u0016\u0006~\\\u0012|\u001d", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String generateSecp256r1PublicKey() throws Throwable {
            byte[] bArrGenerateSecp256r1PublicKeyBytes = EllipticNowHub.generateSecp256r1PublicKeyBytes();
            Intrinsics.checkExpressionValueIsNotNull(bArrGenerateSecp256r1PublicKeyBytes, C1561oA.Xd("Ltus{\u0001vq]\u007f\tZ\tvC}|\u0007~\r|\u0011\u0003q\u0005\u0004\u0012TXZ\u0018Ww\u001e\f\u0017\u0015\u0010x\u0014)r+'\u0019(]_", (short) (C1607wl.Xd() ^ 14699)));
            Object[] objArr = {bArrGenerateSecp256r1PublicKeyBytes, 0};
            Method declaredMethod = Class.forName(Wg.vd("]k^mojb-ii[_&;WjqC>", (short) (FB.Xd() ^ 30822))).getDeclaredMethod(Qg.kd("+3'2&&\u0014.\u00111.$( ", (short) (C1633zX.Xd() ^ (-3549)), (short) (C1633zX.Xd() ^ (-27219))), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                String str = (String) declaredMethod.invoke(null, objArr);
                Intrinsics.checkExpressionValueIsNotNull(str, hg.Vd("b\u0001\u0012\u0003ROH~\u0007z\u0006yyg\u0002d\u0005\u0002w{s3m~z}k1$Ecte52+@@@:MCJ\u001e", (short) (C1607wl.Xd() ^ 7452), (short) (C1607wl.Xd() ^ 31357)));
                return str;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public final String generateSharedSecret(String str) throws Throwable {
            Intrinsics.checkParameterIsNotNull(str, C1561oA.ud(" \u0011\u001d \u000e\u001av\u001b\u0007\u0010\f\u0005k\u0005\u0018", (short) (C1607wl.Xd() ^ 1279)));
            String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, C1561oA.yd("\u0001", (short) (C1633zX.Xd() ^ (-30565))), "", false, 4, (Object) null), C1561oA.Yd("^", (short) (C1499aX.Xd() ^ (-17863))), "", false, 4, (Object) null), Xg.qd("\u0016", (short) (C1607wl.Xd() ^ 28479), (short) (C1607wl.Xd() ^ 31824)), "", false, 4, (Object) null);
            Class<?> cls = Class.forName(Jg.Wd("l\r\"Tlz$\u0001c\u000b\u00182\"I\u0004;L<X", (short) (ZN.Xd() ^ 23987), (short) (ZN.Xd() ^ 26522)));
            Class<?>[] clsArr = {Class.forName(ZO.xd("-\u000f\u0004:m1K\u0013\u000eJKw~CyA", (short) (C1633zX.Xd() ^ (-4705)), (short) (C1633zX.Xd() ^ (-7691)))), Integer.TYPE};
            Object[] objArr = {strReplace$default, 0};
            short sXd = (short) (C1633zX.Xd() ^ (-9182));
            short sXd2 = (short) (C1633zX.Xd() ^ (-21083));
            int[] iArr = new int["pD\u001bi\u0001}".length()];
            QB qb = new QB("pD\u001bi\u0001}");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
                Intrinsics.checkExpressionValueIsNotNull(bArr, Ig.wd("}J\u001b$5^DZ\u0019BXg\u001aZFQ\n$Z_zs\u000b\u0011嗫\u0006\u001df\u0007>`y!9|X]SH')zJIgn?\u0004]\n", (short) (C1499aX.Xd() ^ (-6830))));
                byte[] bArrShsGen = EllipticNowHub.shsGen(bArr);
                Intrinsics.checkExpressionValueIsNotNull(bArrShsGen, EO.Od("$#pIX\u0002'@bcm\u001c5\u0018wV\u0019\u000e9c$!\u0013\u0001\u0015amH8j\b-BUG+^G\u007f~~\u0015U\u001e", (short) (OY.Xd() ^ 2978)));
                Object[] objArr2 = {bArrShsGen, 0};
                Method declaredMethod2 = Class.forName(C1561oA.Qd("8D9FB;5}DB68x\f*;,{x", (short) (Od.Xd() ^ (-8973)))).getDeclaredMethod(C1593ug.zd("akandfVrWyxpvp", (short) (C1633zX.Xd() ^ (-23987)), (short) (C1633zX.Xd() ^ (-11333))), byte[].class, Integer.TYPE);
                try {
                    declaredMethod2.setAccessible(true);
                    String str2 = (String) declaredMethod2.invoke(null, objArr2);
                    Intrinsics.checkExpressionValueIsNotNull(str2, C1561oA.od("\u0016\n\u0014a\u007f\u0011\u0002QN", (short) (Od.Xd() ^ (-17595))));
                    return StringsKt.take(str2, 32);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }
}
