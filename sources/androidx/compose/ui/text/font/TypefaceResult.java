package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLc\u0003İIي8\u000b<K\u0007\"2\u0014\u007f\u0007|jA0ZeP\u008cXB@ş\u001c\u0002D&k$ CiTR}'\u000f ^uh\u0007J\t\r\u001aǋ\bȀ|nDK[{k\u0016Ƅ1BvG߅Lڎތ9d|8\u000b?`!ة}\u000eѐ\u001e)"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~H\u0012+7n\u0012,M0;yD%$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "", "1`R5X(;Z\u0019", "", "5dc\u0010T*AS\u0015{\u0002^", "u(I", "\u000frh;V", "\u0017l\\Bg(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~H\u0012+7n\u0012,M0;yD%$'=G\u001bl*$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~H\u0012+7n\u0012,M0;yD%$'EA\u000fs;Js.G\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface TypefaceResult extends State<Object> {
    boolean getCacheable();

    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLш|\u0004Oي8é6B\r+4\u0012}\u000bloOӄtev-\u0013h:\u0013y{L$\n%\u0002IAU(\u007f:\t}Q˗knX^[U\u001d\b.x\u0019/ ǘzٕ\u0016\u0015:ԏ\bA9R}C\nr\u00036\u001d `#\u000fѝ\u0007в\u001e0PƵ\u000f|IR\u001a\u001aؼDy"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~H\u0012+7n\u0012,M0;yD%$'EA\u000fs;Js.G\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~H\u0012+7n\u0012,M0;yD%$>", "D`[BX", "", "1`R5X(;Z\u0019", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}p\u0004q", "5dc\u0010T*AS\u0015{\u0002^", "u(I", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Immutable implements TypefaceResult {
        public static final int $stable = 0;
        private final boolean cacheable;
        private final Object value;

        public Immutable(Object obj, boolean z2) {
            this.value = obj;
            this.cacheable = z2;
        }

        public /* synthetic */ Immutable(Object obj, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i2 + 2) - (i2 | 2) != 0 ? true : z2);
        }

        @Override // androidx.compose.runtime.State
        public Object getValue() {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.cacheable;
        }
    }

    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>é6Ȑ\u0007\"B\u0012\u007f\u0007ljA0RnP.XY0\u0014\u0002ڔd$\n#\"IKW*}P\n}N(r~Nh\r[\u000f4\u0019ѱn,WYIo \u0014JB\u001eEi\"Fޠ;žx:\u001d\"8)F\u0002U\u0013(,`\u0010%}\u001aŸ\u000eܘ4Fxíj\u000fS\u000e(\u001cVN.\f6\\\u0016O\rԶoҺ>3;\u0005oN\\4ۨ4\u000b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~H\u0012+7n\u0012,M0;yD%$'=G\u001bl*$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~H\u0012+7n\u0012,M0;yD%$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "", "1ta?X5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\f4@kv8VR\"oB-{r]8\u0007p\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#Y.Kv\u0014\u000fWLJR8,$Ok5\u0006c9$:\u0018", "1`R5X(;Z\u0019", "", "5dc\u0010T*AS\u0015{\u0002^", "u(I", "5dc\u0010h9KS\"\u000e9n0v\u0018/x\u000f\"\t@\b\u0017\u0013Uo", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG{E\u0002\u001f,.MDz\u001b\"#wHC\u0003b,[L", "D`[BX", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Async implements TypefaceResult, State<Object> {
        public static final int $stable = 0;
        private final AsyncFontListLoader current;

        @Override // androidx.compose.runtime.State
        public Object getValue() {
            return this.current.getValue();
        }

        public Async(AsyncFontListLoader asyncFontListLoader) {
            this.current = asyncFontListLoader;
        }

        public final AsyncFontListLoader getCurrent$ui_text_release() {
            return this.current;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.current.getCacheable$ui_text_release();
        }
    }
}
