package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
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
/* JADX INFO: compiled from: InspectableProperty.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@InterfaceC1492Gx
@Deprecated(message = "\u0015K\fArw\u001a[\u0018IA:d\u001d1\u000e]Z\r9\u0014q\u0010jDXs}]\n6imUrR`akMO-Ay\"WO\u0005#_M\t")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000e]Lш|\u0004O\u00128é6B\r(4ߚ\u007f\u0007tsAӄLe^.Zݷ2\u000fy\u000b<$q$yّCU0}*\tUVm˯n`ҙ;C=\u0005Ny}@^\u0016?m\u0018\u00152PoW3{pM?ftD\u000782P;\n\u000b\u0007\u001a8L(v)H[\u0012\u00180NvRR;T\u0015&\u0018\u0006L(\u0019$li^6vv\fC?/\tiPY?e@~]\rt`U\u0016Gn,-X7c\u0018ȏW\u0007\u001fTaA\u0011LBP\u0013p?-;K\u0004Wdb.\u001dƦ/S%_x.j\u0013\"s\u001a2CUsM`\u000eV\u0004)\u0005Ɂ@\b&\b-S<<js\u0016\u0012Kt!XĖT\u0006vD\u0006~oFg2\u000e3C9IgЂe?1P={\u0013\u001en0\u000ft9[\u0003\u0015\u05ce\u0019\u001flyW7_RשLd"}, d2 = {"\u001a`]1e6BR,Hvg5\u0007\u0018+t\u00042\u0005\nd %Ro\fKr\"<Yh-Ax\u0016;\\W\u0011", "", "<`\\2", "", "/sc?\\)Nb\u0019by", "", "6`b\u000eg;KW\u0016\u000f\n^\u0010{", "", "D`[BX\u001bR^\u0019", "\u001a`]1e6BR,Hvg5\u0007\u0018+t\u00042\u0005\nd %Ro\fKr\"<Yh-Ax\u0016;\\Wy\\0%%hPM\u0012c\u0002", "3md:@(I^\u001d\b|", "", "\u001a`]1e6BR,Hvg5\u0007\u0018+t\u00042\u0005\nd %Ro\fKr\"<Yh-Ax\u0016;\\WyK=.\u001dHjH\u0014w\u0002", "4kP4@(I^\u001d\b|", "\u001a`]1e6BR,Hvg5\u0007\u0018+t\u00042\u0005\nd %Ro\fKr\"<Yh-Ax\u0016;\\WyL;\u001a\u0017HjH\u0014w\u0002", "u(8", "u(J\u0019T5=`#\u0003yqux\u00128o\u000f$\u000bD\u000b `+x\u001cGv#DUz'7X#8XCHzH\\tqqAfl;[\u000b|", "u(J\u0019T5=`#\u0003yqux\u00128o\u000f$\u000bD\u000b `+x\u001cGv#DUz'7X#8XCHzH\\uo];fl;[\u000b|", "u(I", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "u(;.a+K]\u001d}\u000e((\u0006\u00129t{7\u007fJ\n`zP}\u0019<t41V\u0005 \"z 9MPJ\u007fr\u000f\u0011oq9uw7NL", "\u0013md:85M`-", "\u0014kP485M`-", "$`[BX\u001bR^\u0019", "/m]<g(MW#\b"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public @interface InspectableProperty {

    /* JADX INFO: compiled from: InspectableProperty.jvm.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000e]Lш|\u0004O\u00128é6B\r(4\u0012}\blʙ9FǏ\u0016H\\Q\u00148\u001fo\n4<[RrS?c\u001c\u0016\"7R\u001ftunbZ9DǇ\n\u001a\u0011l2Ic|.\u001f\u001d4Zom6ޜsAQbz8\u0013%ݮ&>"}, d2 = {"\u001a`]1e6BR,Hvg5\u0007\u0018+t\u00042\u0005\nd %Ro\fKr\"<Yh-Ax\u0016;\\WyK=.\u001dHjH\u0014w\u0002", "", "<`\\2", "", "D`[BX", "", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "u(8", "/m]<g(MW#\b"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface EnumEntry {
        String name();

        int value();
    }

    /* JADX INFO: compiled from: InspectableProperty.jvm.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @InterfaceC1492Gx
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000e]Lш|\u0004O\u00128é6B\r(4\u0012}\tlʙ9FǏ\u0016H\\Q\u0014B\u001fo\n4<[RrS?c\u001c\u0016\"7R^mmnX^#C=\tf\u0006x0aU'`ܫ\u00136ZqE7[t\u000eFntN\u0005N3ŕ<}\u001d\u0003 *V\u0016G\bQM$\u0012^C¤>V%O\u000b\u001c \u000b̭$\b"}, d2 = {"\u001a`]1e6BR,Hvg5\u0007\u0018+t\u00042\u0005\nd %Ro\fKr\"<Yh-Ax\u0016;\\WyL;\u001a\u0017HjH\u0014w\u0002", "", "<`\\2", "", "B`a4X;", "", ";`b8", "u(8", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "/m]<g(MW#\b"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public @interface FlagEntry {
        int mask() default 0;

        String name();

        int target();
    }

    int attributeId() default 0;

    EnumEntry[] enumMapping() default {};

    FlagEntry[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    ValueType valueType() default ValueType.INFERRED;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: InspectableProperty.jvm.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u000bGָّ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005jN.ʂW*\u001dkd4*\\\rqI=>\u001a\u0004%qOTkPnP_sC\u0015\f~xp3֘Y\u0001"}, d2 = {"\u001a`]1e6BR,Hvg5\u0007\u0018+t\u00042\u0005\nd %Ro\fKr\"<Yh-Ax\u0016;\\Wy\\0%%hPM\u0012c\u0002", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001cN=\u0012", "\u0017M5\u0012E\u0019\u001e2", "\u0017MC,8\u0015.;", "\u0017MC,9\u0013\u001a5", "\u0011N;\u001cE", "\u0015Q0#<\u001b2", " DB\u001cH\u0019\u001c3\u0013bY", "/m]<g(MW#\b"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class ValueType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ValueType[] $VALUES;
        public static final ValueType NONE = new ValueType("NONE", 0);
        public static final ValueType INFERRED = new ValueType("INFERRED", 1);
        public static final ValueType INT_ENUM = new ValueType("INT_ENUM", 2);
        public static final ValueType INT_FLAG = new ValueType("INT_FLAG", 3);
        public static final ValueType COLOR = new ValueType("COLOR", 4);
        public static final ValueType GRAVITY = new ValueType("GRAVITY", 5);
        public static final ValueType RESOURCE_ID = new ValueType("RESOURCE_ID", 6);

        private static final /* synthetic */ ValueType[] $values() {
            return new ValueType[]{NONE, INFERRED, INT_ENUM, INT_FLAG, COLOR, GRAVITY, RESOURCE_ID};
        }

        public static EnumEntries<ValueType> getEntries() {
            return $ENTRIES;
        }

        public static ValueType valueOf(String str) {
            return (ValueType) Enum.valueOf(ValueType.class, str);
        }

        public static ValueType[] values() {
            return (ValueType[]) $VALUES.clone();
        }

        private ValueType(String str, int i2) {
        }

        static {
            ValueType[] valueTypeArr$values = $values();
            $VALUES = valueTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(valueTypeArr$values);
        }
    }
}
