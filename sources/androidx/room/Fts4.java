package androidx.room;

import androidx.room.FtsOptions;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
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
/* JADX INFO: compiled from: Fts4.kt */
/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE})
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000e]Lш|\u0004O\u00128é6B\r14ߚ\u007f\u0007|jA0JeP.hS2\u000fq{<$i7yّCU0}*\tUSm˯n`ҙ;C=\u0005VWz2OU\u0007]*\u000f`C\u007fK9M}?Qf\u00058\u0015 `#f|\u0015\u000b *V\u0014\u000f~SK\u0012\u0013^E\u0001@X\r[\u000b2\u00124?0\u0007$\\uUNH\u001beJ;)\u0003wKf-o2\rM;G\u0003*\u001d|g\u001e9JO5C0c\t\rRiK\u001b? JUy5+CM\u0004W<Y.\u0019Ʀ/S%_x*j\u0013\"m\u001a-CO\u0012Lח\u0012,\u0010|\u0002\u0013J\u0013^\u00135OF-Hnڿ\u00127\rtYG^\u0012/U\u000e\u0004y<''\u00103Y:IiЂe?1P=\u0005\u0013\u001en0\u000fz9[\u0003\u001b\u05ce\u0019\u001flyW=_R\u000eU\\\u0014q=\u001c\u000fͲf\u0006B\u00066Q\u000eBL\u001e<\u0017=7\n:؝%o\u001aJJg\u0005\u00141{akjNP$~\u0016e+7\u000fʑHh\u001dmVVf=ҳQ0"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u0010t\u000evQ", "", "BnZ2a0SS&", "", "BnZ2a0SS&Z\b`:", "", "1n]AX5M3\"\u000e~m@", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", ":`]4h(@S|}", ";`c0[\u0010GT#", "\u001a`]1e6BR,H\bh6\u0005R\u0010t\u000e\u0012\u0007O\u0005! U.u8\u0006#8=\u0007!AC", "<nc\u0016a+>f\u0019}", ">qT3\\?", "", "=qS2e", "\u001a`]1e6BR,H\bh6\u0005R\u0010t\u000e\u0012\u0007O\u0005! U.wIu%B/", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "u(;.a+K]\u001d}\u000e(9\u0007\u00137/`7\n*\f&\u001bQx\u001cz^!DW\u0001\u0004@n \u0004", "u(J\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "u(;.a+K]\u001d}\u000e(9\u0007\u00137/`7\n*\f&\u001bQx\u001cz`24Y\u000bu", "u(J\u0016", "@n^: *H[!\t\u0004"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
public @interface Fts4 {
    Class<?> contentEntity() default Object.class;

    String languageId() default "";

    FtsOptions.MatchInfo matchInfo() default FtsOptions.MatchInfo.FTS4;

    String[] notIndexed() default {};

    FtsOptions.Order order() default FtsOptions.Order.ASC;

    int[] prefix() default {};

    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}
