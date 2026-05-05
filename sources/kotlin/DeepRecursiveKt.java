package kotlin;

import com.dynatrace.android.agent.Global;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d̉=!4i\bDRш|\u0004G\b8\u000bDB\u0007\"2\u0013\u007f\u0007|jA0ZeP.hS2\u000f\u0002{<řsT\u007fESU`\u0001B\u000bUȞuk\u000fL`\nQ\u0012.\"\tl<I\u001c|m\u0014\u001f2\trm8}sK?xt|\tfݍ\"أ}\u0005\u000f!J\\\u001e͌\u0013I[\u000e\"0nphQcˢ\u0007ܨ\u0016\bF \u000f\u001f\u0005XT6Vt}m5\"\u0013sRV7_6}]\rLUU\u0017\u0007e.-V6c\u00155]\u0013\u000fb_O\u0005Upk\u0005\u001727/Yum5\u0007\u007fB\u001eۣS\rc~V\u0010\u000bPp\u001673_cQQ\u001e(}{*\u0017L\b\u001e\b=G\\-*p\u0018\u0016Cx\u0003UVO0^p\u000b\u000beF\u0019;~a+g$ƻUaA%״;\t"}, d2 = {"#M3\u00129\u0010'3wxg>\u001alo\u001e", "\u001aj^A_0G\u001d\u0006~\tn3\f^", "", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "7me<^,", Global.BLANK, "\"", "\u001aj^A_0G\u001dw~zi\u0019|\u0007?r\u000e,\r@a' E~\u0012F\u007fz", "D`[BX", "uKZ<g3B\\b]z^7i\t-u\r6\u007fQ\u0001w'Pm\u001d@\u0001.\u000b@\u0003\u001cHi_5IL=5\u001e\u001b\u001ah_H\\'\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001", "\u0012dT=E,<c&\r~o,]\u00198c\u000f,\u0006I]\u001e!Eu", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0G\u001dw~zi\u0019|\u0007?r\u000e,\r@n\u0015!Roc", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DeepRecursiveKt {
    private static final Object UNDEFINED_RESULT;

    static {
        Result.Companion companion = Result.Companion;
        UNDEFINED_RESULT = Result.m8980constructorimpl(IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    public static final <T, R> R invoke(DeepRecursiveFunction<T, R> deepRecursiveFunction, T t2) {
        Intrinsics.checkNotNullParameter(deepRecursiveFunction, "<this>");
        return (R) new DeepRecursiveScopeImpl(deepRecursiveFunction.getBlock$kotlin_stdlib(), t2).runCallLoop();
    }
}
