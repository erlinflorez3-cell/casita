package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: RestrictTo.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@InterfaceC1492Gx
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FIELD, AnnotationTarget.FILE})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000e]Lш|\u0004O\u00158\u000bDB\u0007\"2\u0013}Ѡf\u0001ˎ`D\u0014GfQWj!{\fB$s,\u0002GAT*}P\u000b}O\bg\u001dL+ Q\u000f\u001e\u001e\tn2Hex\f\u0014=3ԲsCKOu=GcӃ:\n"}, d2 = {"\u001a`]1e6BR,Hvg5\u0007\u0018+t\u00042\u0005\nm\u0017%V|\u0012:\u0006\u0014?/", "", "D`[BX", "", "\u001a`]1e6BR,Hvg5\u0007\u0018+t\u00042\u0005\nm\u0017%V|\u0012:\u0006\u0014?\u0018k\u001eAx\u0016\u0004", "u(J\u0019T5=`#\u0003yqux\u00128o\u000f$\u000bD\u000b `4o\u001cK\u0004)3hl*u[\u00148XC\u0011", "!b^=X", "/m]<g(MW#\b"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@Documented
public @interface RestrictTo {
    Scope[] value();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: RestrictTo.jvm.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\nGָّ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005jN.ʂW*\u001dkd4*\\\rqI=>\u001a\u0004%qOTkPnP_sC\u0015\fȆ|q"}, d2 = {"\u001a`]1e6BR,Hvg5\u0007\u0018+t\u00042\u0005\nm\u0017%V|\u0012:\u0006\u0014?\u0018k\u001eAx\u0016\u0004", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001aH1\u001f4\u00192", "\u001aH1\u001f4\u00192MzkdN\u0017", "\u001aH1\u001f4\u00192MzkdN\u0017vs\u001cE`\fn", "\u0015Q>\"C&\"2", "\"DB!F", "!T1\u0010?\b,Axl", "/m]<g(MW#\b"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Scope {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Scope[] $VALUES;
        public static final Scope LIBRARY = new Scope("LIBRARY", 0);
        public static final Scope LIBRARY_GROUP = new Scope("LIBRARY_GROUP", 1);
        public static final Scope LIBRARY_GROUP_PREFIX = new Scope("LIBRARY_GROUP_PREFIX", 2);

        @Deprecated(message = "\u0018Y\u0001t]]vI99!y7\u0007\u001bCLKx\u0019iNtJ6O|}by%j6")
        @InterfaceC1492Gx
        public static final Scope GROUP_ID = new Scope("GROUP_ID", 3);
        public static final Scope TESTS = new Scope("TESTS", 4);
        public static final Scope SUBCLASSES = new Scope("SUBCLASSES", 5);

        private static final /* synthetic */ Scope[] $values() {
            return new Scope[]{LIBRARY, LIBRARY_GROUP, LIBRARY_GROUP_PREFIX, GROUP_ID, TESTS, SUBCLASSES};
        }

        public static EnumEntries<Scope> getEntries() {
            return $ENTRIES;
        }

        public static Scope valueOf(String str) {
            return (Scope) Enum.valueOf(Scope.class, str);
        }

        public static Scope[] values() {
            return (Scope[]) $VALUES.clone();
        }

        private Scope(String str, int i2) {
        }

        static {
            Scope[] scopeArr$values = $values();
            $VALUES = scopeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(scopeArr$values);
        }
    }
}
