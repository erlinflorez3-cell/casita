package kotlin.annotation;

import kotlin.Metadata;
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
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0013Gָّ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005jN.ʂW*\u001dkd4*\\\rqI=>\u001a\u0004%qOTkPnP_sC\u0015\f~xp32U~ez\u000f8KX?9WX=?k]6\u000b,\u001b\">\u0007m\u0001 81\u0010|\nŸO\u001c"}, d2 = {"\u001aj^A_0G\u001d\u0015\b\u0004h;x\u00183o\tqWI\n!&C~\u0012F\u007f\u00141f\u007f FC", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0011K0 F", "\u000fM=\u001cG\b-7\u0003gt<\u0013Xv\u001d", "\"X?\u0012R\u0017\u001a@tfZM\fi", "\u001eQ>\u001d8\u0019-G", "\u0014H4\u00197", "\u001aN2\u000e?&//\u0006bV;\u0013\\", "$@;\"8&)/\u0006Zb>\u001b\\u", "\u0011N= G\u0019.1\bhg", "\u0014T=\u0010G\u0010(<", "\u001eQ>\u001d8\u0019-G\u0013`ZM\u001b\\u", "\u001eQ>\u001d8\u0019-G\u0013lZM\u001b\\u", "\"X?\u0012", "\u0013W?\u001f8\u001a,7\u0003g", "\u0014H;\u0012", "\"X?\u00124\u0013\"/\u0007", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AnnotationTarget extends Enum<AnnotationTarget> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnnotationTarget[] $VALUES;
    public static final AnnotationTarget CLASS = new AnnotationTarget("CLASS", 0);
    public static final AnnotationTarget ANNOTATION_CLASS = new AnnotationTarget("ANNOTATION_CLASS", 1);
    public static final AnnotationTarget TYPE_PARAMETER = new AnnotationTarget("TYPE_PARAMETER", 2);
    public static final AnnotationTarget PROPERTY = new AnnotationTarget("PROPERTY", 3);
    public static final AnnotationTarget FIELD = new AnnotationTarget("FIELD", 4);
    public static final AnnotationTarget LOCAL_VARIABLE = new AnnotationTarget("LOCAL_VARIABLE", 5);
    public static final AnnotationTarget VALUE_PARAMETER = new AnnotationTarget("VALUE_PARAMETER", 6);
    public static final AnnotationTarget CONSTRUCTOR = new AnnotationTarget("CONSTRUCTOR", 7);
    public static final AnnotationTarget FUNCTION = new AnnotationTarget("FUNCTION", 8);
    public static final AnnotationTarget PROPERTY_GETTER = new AnnotationTarget("PROPERTY_GETTER", 9);
    public static final AnnotationTarget PROPERTY_SETTER = new AnnotationTarget("PROPERTY_SETTER", 10);
    public static final AnnotationTarget TYPE = new AnnotationTarget("TYPE", 11);
    public static final AnnotationTarget EXPRESSION = new AnnotationTarget("EXPRESSION", 12);
    public static final AnnotationTarget FILE = new AnnotationTarget("FILE", 13);
    public static final AnnotationTarget TYPEALIAS = new AnnotationTarget("TYPEALIAS", 14);

    private static final /* synthetic */ AnnotationTarget[] $values() {
        return new AnnotationTarget[]{CLASS, ANNOTATION_CLASS, TYPE_PARAMETER, PROPERTY, FIELD, LOCAL_VARIABLE, VALUE_PARAMETER, CONSTRUCTOR, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER, TYPE, EXPRESSION, FILE, TYPEALIAS};
    }

    static {
        AnnotationTarget[] annotationTargetArr$values = $values();
        $VALUES = annotationTargetArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(annotationTargetArr$values);
    }

    private AnnotationTarget(String str, int i2) {
        super(str, i2);
    }

    public static EnumEntries<AnnotationTarget> getEntries() {
        return $ENTRIES;
    }

    public static AnnotationTarget valueOf(String str) {
        return (AnnotationTarget) Enum.valueOf(AnnotationTarget.class, str);
    }

    public static AnnotationTarget[] values() {
        return (AnnotationTarget[]) $VALUES.clone();
    }
}
