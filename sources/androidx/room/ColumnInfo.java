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
/* JADX INFO: compiled from: ColumnInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.FIELD, ElementType.METHOD})
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000e]Lш|\u0004O\u00128é6B\r(4ߚ\u007f\u0007tsA0JlN\u0094Riճ-w,4RZ\\rNGbZ.2\u000fUNug\u0007J\t\fS\u0015\f\u0016\u0007lDI\u0004{m\u0018\u00152PsW3{tM?ftD\u000b82P;\n\u000b\u0007\u001a8O(v)D\u001c\u001b 6XphUCRŋ\u001e\u0016\u001e@&\u0007,d8[DO\u0005]h0ݭ\u0007mZP-f>\u0006\u001e\u001aTX?\r%fӿ/DO7\u001b)a\rW_i?\u001b? >ݾl+?-Ose?)\u000f\"\u0017CO;`)+ػ\tUx\u000e--]k\u05c8T\u001c"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\ro\u00078\u0004Id \u0018QE", "", "<`\\2", "", "Bx_24-?W\"\u0003\nr", "", "7mS2k", "", "1n[9T;>", "2dU.h3MD\u0015\u0006\u000b^", "u(8", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "u(I", "\u0011n[9T;>", "\u0011n\\=T5B]\"", "!P;6g,-g$~V_-\u0001\u00123t\u0014", "@n^: *H[!\t\u0004"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
public @interface ColumnInfo {
    public static final int BINARY = 2;
    public static final int BLOB = 5;
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String INHERIT_FIELD_NAME = "[field-name]";
    public static final int INTEGER = 3;
    public static final int LOCALIZED = 5;
    public static final int NOCASE = 3;
    public static final int REAL = 4;
    public static final int RTRIM = 4;
    public static final int TEXT = 2;
    public static final int UNDEFINED = 1;
    public static final int UNICODE = 6;
    public static final int UNSPECIFIED = 1;
    public static final String VALUE_UNSPECIFIED = "[value-unspecified]";

    /* JADX INFO: compiled from: ColumnInfo.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĸA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\ro\u00078\u0004Id \u0018Q.kF},1h}u", "", "@n^: *H[!\t\u0004"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    public @interface Collate {
    }

    /* JADX INFO: compiled from: ColumnInfo.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĸA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\ro\u00078\u0004Id \u0018Q.{(])DYl4Bmq/NGDoC2j", "", "@n^: *H[!\t\u0004"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    public @interface SQLiteTypeAffinity {
    }

    int collate() default 1;

    String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    String name() default "[field-name]";

    int typeAffinity() default 1;

    /* JADX INFO: compiled from: ColumnInfo.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u0006\u0013nj?9JͣIDɟ\u0004*=j<9*[ҸuCIUj\n0\ngN\u0016iEЁ-ŲG\u000f\u000eǝIv:Lmx\f\u0014e˷\u0015ņC3Uڎ\u000eEnxN\u0005N7x؇Lڱ\u0005\u001a2Ϻ`\u0003\tIc\f@2\u0017\u0088\rň\u0011M\r܅b\u0014L'\u0019\u001e\u000bi\u0005:\u001fǕ0Ơ3#\u000b݃\u0013Z5gH|{\u000f\u001dÝy˼za&Ѩ\u0011CC\u001e=S1\t)À\u0012ƄCqEݛ9355as\u00068/ãfƦ/O\u0015ƞC2j\u0010i`:)\u0002ՙ6ׂT\u000e0»K\b\u001bH\u001c\u000e4)\u001f͚\u007fբj\b\u0016ޗE\u0001aMh\u0002\rD6~8دiӾ\u000433ݍkr_oS\u0019|9Rˣ_̷'\u0001vď,`\u001co-\u001b\u0003|(Ŀ$͘AHVˣ\u0558A}"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\ro\u00078\u0004Id \u0018Q.kF~01b\u0002*@C", "", "u(E", "\u0010H=\u000eE ", "", "\u0010K>\u000f", "\u0017M7\u0012E\u0010-MybZE\u000bvq\u000bM_", "", "\u0017MC\u0012:\f+", "\u001aN2\u000e?\u001033w", "\u001cN2\u000eF\f", " D0\u0019", " SA\u0016@", "\"DG!", "#M3\u00129\u0010'3w", "#M8\u0010B\u000b\u001e", "#MB\u001d8\n\"4|^Y", "$@;\"8&.<\u0007iZ<\u0010]l\u000fD", "@n^: *H[!\t\u0004"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int BINARY = 2;
        public static final int BLOB = 5;
        public static final String INHERIT_FIELD_NAME = "[field-name]";
        public static final int INTEGER = 3;
        public static final int LOCALIZED = 5;
        public static final int NOCASE = 3;
        public static final int REAL = 4;
        public static final int RTRIM = 4;
        public static final int TEXT = 2;
        public static final int UNDEFINED = 1;
        public static final int UNICODE = 6;
        public static final int UNSPECIFIED = 1;
        public static final String VALUE_UNSPECIFIED = "[value-unspecified]";

        private Companion() {
        }
    }
}
