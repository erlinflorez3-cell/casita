package androidx.compose.animation.core;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: Preconditions.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d̉=!,i\bӵLc\u0003\rIي8\u000bDB\u0007\":\u001e\u007f\u0007ljA0R͜P.XW2\u000fyz<řsL\u007fّSUH|R\r]N\u007fg\u001dK\u000b\u0015Q\u0011\u001e\u001c\tl<I\u0004|\f\u0015U˱HĦ?9UsCʠxtD\u00048m0=\u0012\u0005G JN\u0016͌\tIs\f@7pvHR%O\u001b\u0019X\fn*\u000f tm^8Xl\f>]&I݄Hú'g8\u0003Sε^V-\u000e\u0005`ӿ/@E=-Ma\f\u001fR\n>3C\u007f=\u001dhU([S\u0002YN^\u0010\u0016%+}\u0011\fulؙ\u000bĬ`\u0012//UҪcP\u001c'\u0010\t\n\u0017T\u0004<\u0005WL<82f6\u0012yο\u000baN\\\u001a^p~+eD\"=\u007fa/\u007fӕ~_oH1Ne\n5\u0011,.\u0019nO_\u001bוה\u0019*"}, d2 = {"1gT0^\u0017KS\u0017\t\u0004]0\f\r9n", "", "D`[BX", "", ":`iF@,La\u0015\u0001z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "1gT0^\u0017KS\u0017\t\u0004]0\f\r9nh2\u000b)\u0011\u001e\u001e", "\"", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010.\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "@d`B\\9>>&~xh5{\r>i\n1", "Bga<j\u0010EZ\u0019\u0001ve\b\n\u000b?m\u007f1\u000b \u0014\u0015\u0017R~\u0012F\u007f", ";db@T.>", "Bga<j\u0010EZ\u0019\u0001ve\u001a\f\u0005>e_;y@\f&\u001bQx", "Bga<j\u0010EZ\u0019\u0001ve\u001a\f\u0005>e_;y@\f&\u001bQxnF\u0004\u000eE`\u0005}:m\u00144", "", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PreconditionsKt {
    public static final void throwIllegalArgumentException(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void requirePrecondition(boolean z2, Function0<String> function0) {
        if (z2) {
            return;
        }
        throwIllegalArgumentException(function0.invoke());
    }

    public static final void throwIllegalStateException(String str) {
        throw new IllegalStateException(str);
    }

    public static final Void throwIllegalStateExceptionForNullCheck(String str) {
        throw new IllegalStateException(str);
    }

    public static final void checkPrecondition(boolean z2, Function0<String> function0) {
        if (z2) {
            return;
        }
        throwIllegalStateException(function0.invoke());
    }

    public static final <T> T checkPreconditionNotNull(T t2, Function0<String> function0) {
        if (t2 != null) {
            return t2;
        }
        throwIllegalStateExceptionForNullCheck(function0.invoke());
        throw new KotlinNothingValueException();
    }
}
