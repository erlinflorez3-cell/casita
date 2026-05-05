package kotlin.coroutines.jvm.internal;

import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.Global;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.TYPE})
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000e]Lш|\u0004O\f8é6B\r.4ߚ\u007f\u0007t}AӄLeV=ZS0\u001eqږ4:ӋTqq:\u0016t\u000e(\u000fO\\g\u007fnx[\u001bI\u0015\u0006$z\u0003,wX\tc\u0018\u000f@F\b?aR\u007fI?`\u0003<\u001d&B$Hy3\u0004H1X\u001c|zQS$\u0018@B\u0001:\u0001\u0010{\f*\u0018\f>.\n6\\\u0016SFNr]H9;\u0003\u0018E^-e0\u000bX%F\u0003*]\u0006o)C@e8K*٨\u0007\u000bj]E\u000fM~\u000e\u0014v0?+wx\u000e;ݼ\u0004\u0018--U\u001bk\u0002vk\u0013Ux\fU0\u0006hׂT\u0012@y\u0001\f\u001bKT#\u0014-`4=\u001cv\b<6#y\nEг\u0006bZ\u0002\u0001rD)u\u000fA5Q\u001b\u0015T\u0018@ϭR;\u0014\u0007\u001311\u000e?0iV&`C\u001e\u000b|Φ5UX?Nb\u0018f\u000e\u0003\u0012xz\b:\u0006@G.2*\u0018d\u001cÉ;_Q%'\u0001\u0010Z\u0015v\u0005\u0005xh\u0002j\tMغ&r.90\u001f\u001aq֎h\u001d"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eq\u0001Q\t`\u001bP~\u000eI\u007f!<#\\ 4}\u0018\u0016MR7j0-\u0011>", "", "Dda@\\6G", "", "And?V,\u001fW ~", "", ":h]2A<FP\u0019\f\t", "", ":nR._\u0015:[\u0019\r", "", "AoX9_,=", "7mS2k\u001bH:\u0015{ze", ";dc5b+'O!~", "1kP@f\u0015:[\u0019", "1", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "7", "u(J\u0016", Global.COLON, "<", "u(J\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", Global.SEMICOLON, "4", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "D", "u(8", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
public @interface DebugMetadata {
    String c() default "";

    String f() default "";

    int[] i() default {};

    int[] l() default {};

    String m() default "";

    String[] n() default {};

    String[] s() default {};

    int v() default 1;
}
