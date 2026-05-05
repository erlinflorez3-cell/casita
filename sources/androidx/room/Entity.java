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
/* JADX INFO: compiled from: Entity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE})
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000e]Lш|\u0004O\u00128é6B\r14\u0012\u000e\u0007nʑA0RnP.XS2\u000f\u0002{<$a)wٙ;kڼ.\"7N\u000f:wtPZ\u0019C'\u0006Dyz8OU\u0007_*\u0015BD\u007f?aQ\u001e@Ifz6\u0013%J\"f\u007f\u0015\r *V\u0017\u000f\u0001SM\u001c\u0012^A\u001f=b\u0019S\u0005(\u001a\u001eD0\u0003.\\\u0016WdK|i@/1\r\u0002H^)o0+N;I%:\u001b~y$;BG5C.\u0002\u0006\u07baV_W\u0005EyK\u00109:55ayg8h\u007fB\u0016YRոav>^\u000b[n\u0018w>]ecV\u001e*\bz*\u0011j\u0007؝\n+`03\u001ct\u0015^@\u0003wk@~\bެF\u0004\u0013c<\u001c3\u000e\u0004>G\"~Wq=)Ne|3\u0010̷'\u0005\u0007#a[\u001cle(bwi1\u007fAףLR\"[Cm\u0012\u007fĐ\u0006:"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u000fn\u000f,\u000bTV", "", "B`Q9X\u0015:[\u0019", "", "7mS6V,L", "", "\u001a`]1e6BR,H\bh6\u0005R\u0013n~(\u000f\u0016", "7mW2e0MA)\nzk\u0010\u0006\b3c\u007f6", "", ">qX:T9R9\u0019\u0013\t", "4na2\\.G9\u0019\u0013\t", "\u001a`]1e6BR,H\bh6\u0005R\u0010o\r(\u007fB\n|\u0017[E", "7f]<e,=1#\u0006\u000bf5\u000b", "u(J\u0019T5=`#\u0003yqu\n\u00139mI\t\u0006M\u0001\u001b\u0019PU\u000ePL", "u(J\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "u(J\u0019T5=`#\u0003yqu\n\u00139mI\f\u0005?\u0001*l", "u(I", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "@n^: *H[!\t\u0004"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
public @interface Entity {
    ForeignKey[] foreignKeys() default {};

    String[] ignoredColumns() default {};

    Index[] indices() default {};

    boolean inheritSuperIndices() default false;

    String[] primaryKeys() default {};

    String tableName() default "";
}
