package com.squareup.wire.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yّCU(\u001c*ޛWNu\u0007vϺb\u000bQ1\u000e\u0016~j4Ic\u001ce܈\u00172P{G3SoE9n}>ӌ8O0D\u0012\u000b\u0011\u001c:HV\u0005)Pk\u000e\u0018ؓN~bX\u001dO\u0015\u001aX\u0014l/Gȭb\u007f}DX\u0005iJ13\u00030T^)o0C`;Wt)\u0013Ǹo0KB=4#8{\u000f\u0017Tk?IQ\u0002?\u0015hm:Y]:ɕ<p\u0016\"*CO;s#*j\u001ci`:=[UiK^&@w)\u00155D\u0012\u05fa&'v-]\u001a\u0015\u00076;\u0003rs@~\u0003\u000fB.{\n>%' 3Y<Kf\u007fdc!\\;\u001c\u0005;#S\u0001\u001d&\u0004\\\u001cf5\u001b\u0003~\u00021\u007fGeP\\\u0012y=\u001c\r!b03,8U\nO{?9G%efަ';"}, d2 = {"!da6T3Bh\u0015{\u0002^", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "\u0018u\\\u0011X-:c \u000elb;\u007ff9m\u000b$\u000bD}\u001b\u001eK~\"", "\u001aj^A_0G\u001d\u001e\u0010\u0003(\u0011\u000e\u0011\u000ee\u0001$\fG\u0010\t\u001bVrkF~01h\u0002\u001d;t\u001a=a\u0019", "\u0018u\\\u0013\\,ER", "\u001aj^A_0G\u001d\u001e\u0010\u0003(\u0011\u000e\u0011\u0010i\u007f/z\u0016", "\u0018u\\ l5MV\u0019\u000e~\\", "\u001aj^A_0G\u001d\u001e\u0010\u0003(\u0011\u000e\u0011\u001dy\t7~@\u0010\u001b\u0015\u001d", "\u0018u\\ g(MW\u0017", "\u001aj^A_0G\u001d\u001e\u0010\u0003(\u0011\u000e\u0011\u001dt{7\u007f>V", "\u001daY2V;,b&~vf\f\u0010\u0007/p\u000f,\u0006I", "\u001aiPCTuB]bhwc,z\u0018\u001dt\r(wH`*\u0015Gz\u001d@\u0001.\u000b", "\u001eq^Ab*HZx\u0012x^7\f\r9n", "\u001aiPCTuGS(Hek6\f\u0013-o\u0007\b\u000f>\u0001\"&Ky\u0017\u0012", "BnD;`6=W\u001a\u0003v[3|o3s\u000f", "", "\"", "", "BnD;`6=W\u001a\u0003v[3|p+p", "", "\u0019", "$", "", "1`\\2_\n:a\u0019", "", "Asa6a.", "Co_2e\n:[\u0019\u0006", "", "Eha2 9N\\(\u0003\u0003^"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class _PlatformKt {
    public static final String camelCase(String string, boolean z2) {
        Intrinsics.checkNotNullParameter(string, "string");
        StringBuilder sb = new StringBuilder(string.length());
        int iCharCount = 0;
        while (iCharCount < string.length()) {
            int iCodePointAt = string.codePointAt(iCharCount);
            iCharCount += Character.charCount(iCodePointAt);
            if (iCodePointAt == 95) {
                z2 = true;
            } else {
                if (z2 && 97 <= iCodePointAt && iCodePointAt < 123) {
                    iCodePointAt -= 32;
                }
                sb.appendCodePoint(iCodePointAt);
                z2 = false;
            }
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public static /* synthetic */ String camelCase$default(String str, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        return camelCase(str, z2);
    }

    public static final <T> List<T> toUnmodifiableList(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(list);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> toUnmodifiableMap(Map<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }
}
