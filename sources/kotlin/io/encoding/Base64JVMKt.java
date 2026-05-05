package kotlin.io.encoding;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d̉=!,y\bDZc|İI\u0006>\u00166Ȑ\u0007\":\u0018\u007f\u0007lnA0RqP\u008cjv8ş\u0004{b#\u0004$ CkY(~:\t}P\u0018k|Mr\u000bq\u00136\u001a\u0007oDI\u0004|$܊\u0015Ju}EKM\u001eAa`#65$@#Py3\u007fJ.V\u0017\u000fzqJ<\u0016>H\t:\u0001\u0011}\t(\u0015\u001e>N\u0005N`uSNH\u001ba\u0001Ǆ)\u001b\rPW?_^{u\rtTW\u0011\u0005b6+n6e\u00193V\u001b\u0007\u0001_o\u0007MvU\u0005\u0017+mǤO\fzDb\u0018\u0014C6w\r\frV`\u0013Rx\fU*\u007fgYS&(&~,\u0011J\t&\u0006ULtƨ Ǻ\f\u001a"}, d2 = {">kPAY6K[v\u0002vk:k\u0013\fy\u000f(\n", "", "\u001aj^A_0G\u001d\u001d\tD^5z\u0013.i\t*E\u001d|%\u0017\u0018>c", "And?V,", "", "AsP?g\u0010GR\u0019\u0012", "", "3mS\u0016a+>f", ">kPAY6K[x\bxh+|l8t\n\u0005\u0010O\u0001r$Tk\"", "2dbA\\5:b\u001d\t\u0004", "2dbA\\5:b\u001d\t\u0004H-}\u0017/t", ">kPAY6K[x\bxh+|w9B\u00147{\u001c\u000e$\u0013[", ">kPAY6K[x\bxh+|w9S\u000f5\u007fI\u0003", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Base64JVMKt {
    private static final byte[] platformCharsToBytes(Base64 base64, CharSequence source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(base64, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(source instanceof String)) {
            return base64.charsToBytesImpl$kotlin_stdlib(source, i2, i3);
        }
        base64.checkSourceBounds$kotlin_stdlib(source.length(), i2, i3);
        String strSubstring = ((String) source).substring(i2, i3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Charset charset = Charsets.ISO_8859_1;
        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    private static final int platformEncodeIntoByteArray(Base64 base64, byte[] source, byte[] destination, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(base64, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return base64.encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, i2, i3, i4);
    }

    private static final byte[] platformEncodeToByteArray(Base64 base64, byte[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(base64, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return base64.encodeToByteArrayImpl$kotlin_stdlib(source, i2, i3);
    }

    private static final String platformEncodeToString(Base64 base64, byte[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(base64, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return new String(base64.encodeToByteArrayImpl$kotlin_stdlib(source, i2, i3), Charsets.ISO_8859_1);
    }
}
