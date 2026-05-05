package androidx.room;

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
/* JADX INFO: compiled from: Database.kt */
/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE})
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000e]Lш|\u0004O\u00158\u000bDB\u0007\"2\u0012\u007f\u0007tpAӄLeV7Zݷ2\u000f\u0002{<$a'wٙ;kڼ.\"7N\u000f0w~PZ\u0019C'\u0010&~z0YU~^@\u0011`C\u007fO9M}@Qj\u0005<\u0015$B\">z3\u0003H+X\u0014\u0005~[K:\u0017@Fv:`\u0013e\u0005H\u0019\u0016J&\u0001,d\u007fTFJ|]h8Q\u0004:U\\/w6\rO\u001dF\u00030;wҐ\"/X9;\u001d3]S\u001e`[W\rOwM\tx'-,wu\u00067ݼ\u0004\u0018--U\rk}vi\u0013Wx\fU2յgOh\u0010.}\t\b]I\u0012\u0012\u001e'v3ǉ\u001ej \u00109x\u0001`\u0011g\u0010aZ\n\u000bgF\u001b5\u007f9,g\u001d\u0015Rň?\u001df9\u0002\b\u001b)ũ\u0005|"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u000ea\u000f$x<\u000f\u0017l", "", "3mc6g0>a", "", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "DhTDf", "Dda@\\6G", "", "3w_<e;,Q\u001c~\u0003Z", "", "/tc<@0@`\u0015\u000e~h5\u000b", "\u001a`]1e6BR,H\bh6\u0005R\u000bu\u000f2cD\u0003$\u0013Vs\u0018EL", "u(J\u0019T5=`#\u0003yqu\n\u00139mI\u0004\fO\u000b~\u001bI|\nKz/>/", "u(J\u0019](OOb\u0006vg.Ff6a\u000e6Q", "u(I", "u(8", "@n^: *H[!\t\u0004"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
public @interface Database {
    AutoMigration[] autoMigrations() default {};

    Class<?>[] entities() default {};

    boolean exportSchema() default true;

    int version();

    Class<?>[] views() default {};
}
