package com.facebook.imagepipeline.systrace;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007llA0ReP\u008cZS8\u001bs{:%c$\u007fLCU \u007f*\teNogtM`ƖC%إFx\u0019+\u0002V\u000ft*O7HoУ7M}=\u0002n\u0003>\u001d `+h}\u0013\u000b2*v\u001b=\u007f\fY\u001a\u001eH@\u001f<\u0003\u0011[\u000f2\u00124If\u0006fbu[NH\u001bf\u00014k\twPf'\u000e?CRUVb7%v\u0010'[FE:-'i\u00025V\"DKj\u007fN\u001dhm9KKyɎDj0\u0018#5g\r\f}Vf\u0013dx\u00127-_c\u0012b<<>߅\u0002ʗ;ǉ؝\n'VC}(t\t&3#t\nD'ؤ`۰\u0004ziاg3\u000e6C;1e\u007fe\u0012ύZѼ\u007f\u0005\u0015̔s\u0013|&sT<dK[+ȰSśUDUJT\u0010gDЪ\u0004uj\u00050ː`u~¤\u007f*"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00059Ch\u000b\u001c5m_\u000fZCIi>\f)vpF\u0003a,$", "", "u(E", "\u001cNN\u001cC&\u001a@zlt;\u001c`o\u000eEl", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00059Ch\u000b\u001c5m_\u000fZCIi>\f)vpF\u0003a,\rR4IZ+<`Yq=!g", "-h]@g(GQ\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00059Ch\u000b\u001c5m_\u000fZCIi>\f)vpF\u0003a,\rd;U[[(ZRH", "7mbAT5<S", "5dc\u0016a:MO\"|z", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012EvnCm\f/Di\u0014.\u0017$HkB\u001c\u001fVuG\u0016p(Lve5`\\;iNp=i", "0dV6a\u001a>Q(\u0003\u0005g", "", "<`\\2", "", "0dV6a\u001a>Q(\u0003\u0005g\u001e\u0001\u00182A\r*\n", "3mS X*MW#\b", "7rC?T*B\\\u001b", "", ">q^C\\+>", "BqP0X\u001a>Q(\u0003\u0005g", "\"", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010.\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "\u000fqV@5<BZ\u0018~\b", "\u001cn>=49@au\u000f~e+|\u0016", "!xbAe(<S", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FrescoSystrace {
    public static final FrescoSystrace INSTANCE = new FrescoSystrace();
    public static final ArgsBuilder NO_OP_ARGS_BUILDER = new NoOpArgsBuilder();
    private static Systrace _instance = null;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u0016\u007f\u0007tpA0RlP\u008cZS8\u000fsڔ:\tqҕ\"CiTb\u00140\tgN\u0016˧\u001fNh\f[\u000f4\u0018)n:Lmx\f\u0011UV\u000b\u0006M3eokʠ\u0011xD\u000682P:*\t\u000f\u001dBH>zAg\u0014\" 0Xphĥ=Q\u0013\u001b*\u0006l\"1\"jjf6vq$^w9\u0011iZNUڿ`\u0001[\u000e^TU\u000f'e,.X7c\u001bkwK\r`bW\u0003my\u0004)ػ+0"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00059Ch\u000b\u001c5m_\u000fZCIi>\f)vpF\u0003a,\rR4IZ+<`Yq=!g", "", "/qV", "9dh", "", "D`[BX", "", "", "", "4kd@[", "", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface ArgsBuilder {
        ArgsBuilder arg(String str, double d2);

        ArgsBuilder arg(String str, int i2);

        ArgsBuilder arg(String str, long j2);

        ArgsBuilder arg(String str, Object obj);

        void flush();
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLcz\u0005I\u0006>\u00176Ȑ\u0007\":ߚ\u007f\u0007tnA0RkP.`Z2şs{B$cҕwCQ٥J}P\b\u0010Q˗knXZSY\u001d\u0007.x\u0019+yY\u0007_*\u000f`E CAQ\b=ge;JM6@#Py3\u007fJ.V\u0012\u000fzqN<\u0016>D\t:\u0001\u0013\u0014\u0019b(\u0014?8\u0001L[\u0018RDJ\u0005]h2S\u0007wFf'\u000e7CaU\\b(%v\u0010\u001d[DE7-%\u0002\u00067ViC\u001b? EK|o-9R\fWdbF(Ƭ/Z"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00059Ch\u000b\u001c5m_\u000fZCIi>\f)vpF\u0003a,\r_11W*9^`OM\u0018\u0019Y\u000e[\u0001", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00059Ch\u000b\u001c5m_\u000fZCIi>\f)vpF\u0003a,\rR4IZ+<`Yq=!g", "u(E", "/qV", "9dh", "", "D`[BX", "", "", "", "", "4kd@[", "", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class NoOpArgsBuilder implements ArgsBuilder {
        @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.ArgsBuilder
        public ArgsBuilder arg(String key, double d2) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this;
        }

        @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.ArgsBuilder
        public ArgsBuilder arg(String key, int i2) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this;
        }

        @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.ArgsBuilder
        public ArgsBuilder arg(String key, long j2) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this;
        }

        @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.ArgsBuilder
        public ArgsBuilder arg(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return this;
        }

        @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.ArgsBuilder
        public void flush() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\r.4ߚ\u007f\u0007|jA0JeP.`\\2şq`Jř\f$ B\u0004c(}:\t}O\u0018k|Lr\u000bq\u0012L:Ax:Mmx\f\u0017?6PqW3{r\u0004])zD\u000b82P9@)I 8O(v)K\u00120ܞ4I"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00059Ch\u000b\u001c5m_\u000fZCIi>\f)vpF\u0003a,\rd;U[[(ZRH", "", "0dV6a\u001a>Q(\u0003\u0005g", "", "<`\\2", "", "0dV6a\u001a>Q(\u0003\u0005g\u001e\u0001\u00182A\r*\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00059Ch\u000b\u001c5m_\u000fZCIi>\f)vpF\u0003a,\rR4IZ+<`Yq=!g", "3mS X*MW#\b", "7rC?T*B\\\u001b", "", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Systrace {
        void beginSection(String str);

        ArgsBuilder beginSectionWithArgs(String str);

        void endSection();

        boolean isTracing();
    }

    private FrescoSystrace() {
    }

    @JvmStatic
    public static final void beginSection(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        INSTANCE.getInstance().beginSection(name);
    }

    @JvmStatic
    public static final ArgsBuilder beginSectionWithArgs(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return INSTANCE.getInstance().beginSectionWithArgs(name);
    }

    @JvmStatic
    public static final void endSection() {
        INSTANCE.getInstance().endSection();
    }

    private final Systrace getInstance() {
        DefaultFrescoSystrace defaultFrescoSystrace;
        Systrace systrace = _instance;
        if (systrace != null) {
            return systrace;
        }
        synchronized (FrescoSystrace.class) {
            defaultFrescoSystrace = new DefaultFrescoSystrace();
            _instance = defaultFrescoSystrace;
        }
        return defaultFrescoSystrace;
    }

    @JvmStatic
    public static final boolean isTracing() {
        return INSTANCE.getInstance().isTracing();
    }

    @JvmStatic
    public static final void provide(Systrace systrace) {
        _instance = systrace;
    }

    public final <T> T traceSection(String name, Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!isTracing()) {
            return block.invoke();
        }
        beginSection(name);
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            endSection();
            InlineMarker.finallyEnd(1);
        }
    }
}
