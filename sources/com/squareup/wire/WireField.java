package com.squareup.wire;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
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
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.FIELD})
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000e]Lш|\u0004O\f8é6B\r.4\u0012}\u0007njO0L͜P.`\\2\u000fq\u0004:š[:ڎs;\u0004\u00196!\u001a\u0010#wk|Jr\u000bq\u0010\u0016\u001c~j:Kmx\f\u0015\u001f6PsW3{rM?ftD\n82P>\n\u000b\u0007\u001a8O(v)K[\u0012\u00180NyRR;P\u0015 \u0018\u0006L*\u0019\u001e\u000bj^<NlkEG#1lRT-_>\te\rtUw\u001a\u0005a6+n8߱\u0019)k\u0005\rRiLSL\u007f?\u001dhU*ȅMwo8^\u0002\"#{\\\u001ba\u000b&\u000b\bŌd\u0010?-UgY^^5\u0006\u007f\u0014\rj\n؝\n+`03\u001ft\u0017^@\u0003yk@~\nެF\u0004\u0013c<\u001e3\u0010\u00048G$~Q\u0010>ϭR;\u0014\u0007\u0013'1\u000f?.i^&`C\u001eƻ{UISFGV\\ZfKx\u001cp\u0011\u0005ò\b4_\u00025\u0007\u001f<g2EgQ#OlɘLH\u007fx\u000blv`\u05c8VZ"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017wKo\u0015;L", "", "B`V", "", "9dh\u000eW(Ib\u0019\f", "", "/cP=g,K", ":`Q2_", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017wKo\u0015;5\f1V}'\r", "@dS.V;>R", "", "2dR9T9>R\u0002z\u0003^", "8r^;A(FS", "=mT<Y\u0015:[\u0019", "AbW2`(\"\\\u0018~\u000e", "u(8", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nr\u001b$GP\u0012<}$s@y\u001d7tk", "u(I", "\u001a`Q2_", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
public @interface WireField {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eRLcz\u000bI\u0006>\u00146B\u0005$2ߡՆ\u0007|ʑi6TgX.\u0001ݷX\u000e,\u0003:$Ӯ(sI;c\u001bN1\u0017Wfg\u0016w\u0001 ŲG\u0013\u001e\u0018~r:S&\bk\u001d'2pxuxޜsAQbzA\u0013*\u00031F\u0006\u001d\u0001H3~Uͯ~Gc\u000e\u0018<Nz#R\u0013Om\u001a\u0018\t' \u0007\"EgT;1lc@\u0018#\tpŒR4"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017wKo\u0015;5\f1V}'\r", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", " D@\"<\u0019\u001e2", "\u001dOC\u0016B\u0015\u001a:", " D?\u00124\u001b\u001e2", "\u001dM4,B\r", "\u001e@2\u00188\u000b", "\u001dL8!R\u0010\u001d3\u0002m^M ", "7rA2c,:b\u0019}", "", "u(I", "7r?.V2>R", "7r>;X\u0016?", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Label {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Label[] $VALUES;
        public static final Label REQUIRED = new Label("REQUIRED", 0);
        public static final Label OPTIONAL = new Label("OPTIONAL", 1);
        public static final Label REPEATED = new Label("REPEATED", 2);
        public static final Label ONE_OF = new Label("ONE_OF", 3);
        public static final Label PACKED = new Label("PACKED", 4);
        public static final Label OMIT_IDENTITY = new Label("OMIT_IDENTITY", 5);

        private static final /* synthetic */ Label[] $values() {
            return new Label[]{REQUIRED, OPTIONAL, REPEATED, ONE_OF, PACKED, OMIT_IDENTITY};
        }

        static {
            Label[] labelArr$values = $values();
            $VALUES = labelArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(labelArr$values);
        }

        private Label(String str, int i2) {
        }

        public static EnumEntries<Label> getEntries() {
            return $ENTRIES;
        }

        public static Label valueOf(String str) {
            return (Label) Enum.valueOf(Label.class, str);
        }

        public static Label[] values() {
            return (Label[]) $VALUES.clone();
        }

        public final boolean isOneOf() {
            return this == ONE_OF;
        }

        public final boolean isPacked() {
            return this == PACKED;
        }

        public final boolean isRepeated() {
            return this == REPEATED || this == PACKED;
        }
    }

    String adapter();

    String declaredName() default "";

    String jsonName() default "";

    String keyAdapter() default "";

    Label label() default Label.OPTIONAL;

    String oneofName() default "";

    boolean redacted() default false;

    int schemaIndex() default -1;

    int tag();
}
