package kotlin;

import kotlin.jvm.functions.Function0;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!,i\bӵLc\u0003\rIي8\u000bDB\u0007\":ߚ\u007f\u0007lmA0RdP.XUB)yڔL$\n#\"GIU2}P\n\u0016Ȧm˪nPb\u000fIƤ\u001e\u0016\u0007iDtcތu\u0012=1rsM3eok:\u0011~D\u0007882:\n\u0005/\u001eXKV͔\u0001ǈJÈ۸0Fx>X҈e\u0005(\u0011\u001ek.\u00066\\.TVNrҗH5K\u0003\u0018F~-m0\u0015O#E\u001b-SȀgӟ+H?;\u001bǬk\u0005\rSi>ƄCqK\f\u0001e50as\u001e<x\u0006\u001aƃ9U5]!*\r\u000b_`$)AN*Q\u0001\u00186y\u0013\u0002\u001d>\u0014\u000e4+v1sՇlܕ\rޗςr[HV\bމZ\u0002\u0001bD\u0016Ӿ\u000439A3u_jS\u0019|A,\t\u001b);\u0001\u001d%\"ٲ\u0014x/)`\u0010Q_PpAVN\"YknJ͗h̦*\n8K\u0006\u07fc\u0014\u0011<\u0016=biE;!\u001a\u0001xHuv\u001d`\u0017T\u001a\\VB:t&9:\t:^rgKߠVղW\u008cҍM\"\\\u000b\u0004ܱ+ jvTN3\u001dfO/o\u000bSc܃35\u000f7\br\u001c\u0014e9v5KP*\u0016(״|ܠ?Dj\u000b^٨ZU\u0012[j'ϒ6Hx\u0017\u0010:R[$\u0013xE\u0012\":ι?\u001f\u0005\u0015v\u0007NHO|!apgV\u0005\u0005=2\u0005\u0002*\u0005\u000b\u0011P\u000bt\u001ej?̪2̂_õ\u038dAY=\u001f,Ş:j:}1\u0006ҋw\u007fUoչGQt\u0019{ɷ,N\u0015׆=_"}, d2 = {"1gT0^", "", "D`[BX", "", ":`iF@,La\u0015\u0001z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "1gT0^\u0015Hb\u0002\u000f\u0002e", "\"", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010.\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "3qa<e", "", ";db@T.>", "@d`B\\9>", "@d`B\\9><#\u000ecn3\u0004", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{\u001c=/,75*.8,1/3\n2")
class PreconditionsKt__PreconditionsKt extends PreconditionsKt__AssertionsJVMKt {
    private static final void check(boolean z2) {
        if (!z2) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    private static final void check(boolean z2, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (!z2) {
            throw new IllegalStateException(lazyMessage.invoke().toString());
        }
    }

    private static final <T> T checkNotNull(T t2) {
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private static final <T> T checkNotNull(T t2, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException(lazyMessage.invoke().toString());
    }

    private static final Void error(Object message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalStateException(message.toString());
    }

    private static final void require(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final void require(boolean z2, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (!z2) {
            throw new IllegalArgumentException(lazyMessage.invoke().toString());
        }
    }

    private static final <T> T requireNotNull(T t2) {
        if (t2 != null) {
            return t2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private static final <T> T requireNotNull(T t2, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (t2 != null) {
            return t2;
        }
        throw new IllegalArgumentException(lazyMessage.invoke().toString());
    }
}
