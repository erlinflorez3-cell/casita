package com.statsig.androidsdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Od;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r.4\u0012}\nnjO0LeN.X\u07b8*%ӆ,4RZdvI;ڈ\u001e}0\t\u0018Zul\u0007J\t\u000es\u0013\u0014\u001c\u0011jZL\u001e\u000fk\u0019'2pro7[uU9\u000fwf\u000b.:::\u0010\u0004/#rV\u001e\u0001\u0013Cy\u000fB4NvRR;PK\u001ab\u001eL!\u0019*li^6vom<?#1lpP}ۂ2ƊQ\rNÖw%\u0005e67P9E\u0015SV\u0013\tb[m\u0006ms\u0014ݞjҊ++Q֕ɷ:c"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`*k\u001c?z.7/", "", "u(E", "2iQ~6(<V\u0019", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`$y\u001eEu%4A}(AC", "", "AgP~(|\u001cO\u0017\u0002z", "5dc\u0011=\t\u000b6\u0015\r}L;\n\r8g", "7m_Bg", "5dc\u0015T:AS\u0018l\nk0\u0006\u000b", "/kV<e0MV!", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`*k\u001c?R,7c\u000b$Fp\u001e\u0004", "5dc ;\b\u000b#iavl/j\u0018<i\t*", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class Hashing {
    public static final Hashing INSTANCE = new Hashing();
    private static final BoundedMemo<String, String> sha256Cache = new BoundedMemo<>();
    private static final BoundedMemo<String, String> djb2Cache = new BoundedMemo<>();

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HashAlgorithm.valuesCustom().length];
            iArr[HashAlgorithm.DJB2.ordinal()] = 1;
            iArr[HashAlgorithm.SHA256.ordinal()] = 2;
            iArr[HashAlgorithm.NONE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.Hashing$getHashedString$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005`\u000f<B\u0017\"Z\u0011>\u000f"}, d2 = {"\n`]<a@F])\rS", "", "7s"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<String, String> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Hashing.INSTANCE.getDJB2HashString(it);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.Hashing$getHashedString$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005`\u000f<B\u0017\"Z\u0011>\u000f"}, d2 = {"\n`]<a@F])\rS", "", "7s"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function1<String, String> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Hashing.INSTANCE.getSHA256HashString(it);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.Hashing$getHashedString$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005`\u000f<B\u0017\"Z\u0011>\u000f"}, d2 = {"\n`]<a@F])\rS", "", "7s"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function1<String, String> {
        public static final AnonymousClass3 INSTANCE = ;

        AnonymousClass3() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Hashing.INSTANCE.getSHA256HashString(it);
        }
    }

    private Hashing() {
    }

    public final String getSHA256HashString(String str) throws Throwable {
        MessageDigest messageDigest = MessageDigest.getInstance(ZO.xd("\u0005=\u0011GX.`", (short) (Od.Xd() ^ (-3276)), (short) (Od.Xd() ^ (-29039))));
        Charset charset = Charsets.UTF_8;
        if (str == null) {
            throw new NullPointerException(C1593ug.zd("hphi\u001ebaoprx%hl(lk~\u0001-\u0003~0\u007f\u0002\u0002A\u0004\f\u0004\u00059\u000f\u0015\r\u0003>\n\u0002\u0018\u0004Q\u0011\u0007\u0015\u000fV|\u001f\u001e\u0016\u001c\u0016", (short) (ZN.Xd() ^ 8172), (short) (ZN.Xd() ^ 21685)));
        }
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, C1626yg.Ud("qB\u001c1.PH\u0018dz\u0018~c\u0011l$\u0012!`;D\u0019u:a\r\u0006Aab8\u0002S\u007f\u001fa\u0018\u0004MCm\u0007\u0001[", (short) (C1499aX.Xd() ^ (-8861)), (short) (C1499aX.Xd() ^ (-7115))));
        Object[] objArr = {messageDigest.digest(bytes), 2};
        Method declaredMethod = Class.forName(Ig.wd("U*}p6z\u001eo\u0014SR+=O^K\b: ", (short) (C1633zX.Xd() ^ (-18075)))).getDeclaredMethod(EO.Od("I#iU:hcN}2.C\u0018\u000b", (short) (C1499aX.Xd() ^ (-14559))), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            String str2 = (String) declaredMethod.invoke(null, objArr);
            Intrinsics.checkNotNullExpressionValue(str2, C1561oA.Qd("owkvjjXrUurhld$]sm]j\"\u0015UaVc_XR\u001ba_SU\u0016)GXI\u0019\u0016\u000f..=4.\u001c*\u0002", (short) (C1633zX.Xd() ^ (-9362))));
            return str2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final String getDJB2HashString(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        char[] charArray = input.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        int length = charArray.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c2 = charArray[i2];
            i2++;
            i3 = ((i3 << 5) - i3) + c2;
        }
        return Integer.toUnsignedString(UInt.m9075constructorimpl(i3));
    }

    public final String getHashedString(String input, HashAlgorithm hashAlgorithm) {
        Intrinsics.checkNotNullParameter(input, "input");
        int i2 = hashAlgorithm == null ? -1 : WhenMappings.$EnumSwitchMapping$0[hashAlgorithm.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? sha256Cache.computeIfAbsent(input, AnonymousClass3.INSTANCE) : input : sha256Cache.computeIfAbsent(input, AnonymousClass2.INSTANCE) : djb2Cache.computeIfAbsent(input, AnonymousClass1.INSTANCE);
    }
}
