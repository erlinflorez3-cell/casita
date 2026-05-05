package androidx.compose.foundation.content;

import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
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
/* JADX INFO: compiled from: TransferableContent.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0019q\u0001Jř\f$ BsT,>K\u000fѧ^kunbZ9D\u001f\n$z\u0003,wX\ta \u0013JB\u001eDCUu=Gf\r8\u001b\u001f`)أ}\u0005\u000f\"zW\u001ev\u0013Cy\rܘ4Fxíj\u000fS\u000e(\u001cVM.\u00036\\\u0016QɇLreŽG%\ttPZwp>\u0003e\u000f\\SU\u0014țe$3¨O7\u001b2a\u0011WiiC\u001b? Bߔgѧ߉*Hָ[>`\u007f\"&CQ\u0013l\u00016؛\u0005Zh\u000f-˥k\u0012JX\u000e.\u0017ߧ\u007f "}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r @|_\u001dZ?Dy5\u001e\"d^@\u0007A6W\u0006'P[$", "", "1kX=85M`-", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013`\u0002+\u0017v%;a\u0019", "1kX=@,MO\u0018z\nZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013`\u0002+\u001fm%*L?Jg\n", "And?V,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r @|_\u001dZ?Dy5\u001e\"d^@\u0007A6W\u0006'P[\r\u001afb\u007f;\u0014g", ">kPAY6K[\b\fvg:}\t<a|/{\u001e\u000b &Gx\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r @|_\u0019T?Jl>+\u001dWn5\u0010q-N\u0004#DSN\nf[\u0002=\u001d!0", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~7\u0005$BM\u001f=ZW\u0011R0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007\u001f\u0019V\u001dO5\u001a\r#\u001f+rO\u001f\u001f\u0017(H}JdVo|\n>i}LZ\u000fZC\u0013\u007fI4rTY)zQQNa&s\u0010i&&8D-#q\"*2;5\u0006\u000bT\u001b\u007fZhtcP'{81:jbF#y^Kt0.!b}\u001cA_x4>2\u0015<s:m\u0014Kt!:eBs,]=7-E\u001a\u001dHYr\u0003|<\u001dr,I\u0004\u001bh5>n)V", "5dc\u0010_0I3\"\u000e\br", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#[';xu7\\POA", "5dc\u0010_0I;\u0019\u000ev](\f\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#[';x}.\\?:gC\u001aj", "5dc\u001d_(MT#\f\u0003M9x\u0012=f\u007f5w=\b\u0017tQx\u001d<\u007f4", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~W\b)Fm\u001f=\u0017.BgC\u001f\u001fui(\u0014_5\\w'THK3\\0|F#\u0012c\u001d$", "5dc b<KQ\u0019F\u0001;|m\\\u001e0", "u(8", "\u0017", "!nd?V,", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TransferableContent {
    public static final int $stable = 8;
    private final ClipEntry clipEntry;
    private final ClipMetadata clipMetadata;
    private final PlatformTransferableContent platformTransferableContent;
    private final int source;

    public /* synthetic */ TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i2, PlatformTransferableContent platformTransferableContent, DefaultConstructorMarker defaultConstructorMarker) {
        this(clipEntry, clipMetadata, i2, platformTransferableContent);
    }

    private TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i2, PlatformTransferableContent platformTransferableContent) {
        this.clipEntry = clipEntry;
        this.clipMetadata = clipMetadata;
        this.source = i2;
        this.platformTransferableContent = platformTransferableContent;
    }

    public /* synthetic */ TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i2, PlatformTransferableContent platformTransferableContent, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(clipEntry, clipMetadata, i2, (i3 & 8) != 0 ? null : platformTransferableContent, null);
    }

    public final ClipEntry getClipEntry() {
        return this.clipEntry;
    }

    public final ClipMetadata getClipMetadata() {
        return this.clipMetadata;
    }

    /* JADX INFO: renamed from: getSource-kB6V9T0, reason: not valid java name */
    public final int m665getSourcekB6V9T0() {
        return this.source;
    }

    public final PlatformTransferableContent getPlatformTransferableContent() {
        return this.platformTransferableContent;
    }

    /* JADX INFO: compiled from: TransferableContent.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007lnA0RqP.XU0ŧ*\u0012éBjTqq:\u000e\u0019\rb\u0018UȞwk|Jr\u000bq\u0010و\u001azp.WXAu \u0013JB\u001eDcS}CQb\u000b53\u001fxƉ9ѩ\t\u0003 1V\u0018?\tQT$\u0012^A7ńQҫQ\u0007 \u001c\u0014Ah\u000e,g\u007fNdT3qƠ3%\tvP\\wk>|e\rtU}˜xҐ\"+Hʺߗ\u0014%٘\u0002\u0007\u0001\\ϓ\u0007O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r @|_\u001dZ?Dy5\u001e\"d^@\u0007A6W\u0006'P[\r\u001afb\u007f;\u0014g", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @JvmInline
    public static final class Source {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Keyboard = m667constructorimpl(0);
        private static final int DragAndDrop = m667constructorimpl(1);
        private static final int Clipboard = m667constructorimpl(2);

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Source m666boximpl(int i2) {
            return new Source(i2);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m667constructorimpl(int i2) {
            return i2;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m668equalsimpl(int i2, Object obj) {
            return (obj instanceof Source) && i2 == ((Source) obj).m672unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m669equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m670hashCodeimpl(int i2) {
            return Integer.hashCode(i2);
        }

        public boolean equals(Object obj) {
            return m668equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m670hashCodeimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m672unboximpl() {
            return this.value;
        }

        private /* synthetic */ Source(int i2) {
            this.value = i2;
        }

        /* JADX INFO: compiled from: TransferableContent.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005(2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0\u001al\u0007c*\u000f`DƜ>\u074c߲n<˃d|>\u0005.7::\u007f\f\u000f\u001ez_\u001e~\u0013Cy\u000eݮ/ϋú9QҫQ\r\"\u0012\u0014C8\u0003$euRȧHue=5ݬ\u001f\u0018AV'eOƐQ\u0017"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r @|_\u001dZ?Dy5\u001e\"d^@\u0007A6W\u0006'P[\r\u001afb\u007f;\u0014P8\u0018V6\t\u000e]K-D", "", "u(E", "\u0011kX=U6:`\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r @|_\u001dZ?Dy5\u001e\"d^@\u0007A6W\u0006'P[\r\u001afb\u007f;\u0014g", "5dc\u0010_0IP#z\b]s\u0003e\u007fVS\u0017F", "u(8", "\u0017", "\u0012qP445=2&\t\u0006", "5dc\u0011e(@/\"}Yk6\bP5BP\u0019O/K", "\u0019dh/b(KR", "5dc\u0018X@;]\u0015\fy&2YY 9nr", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: renamed from: getKeyboard-kB6V9T0, reason: not valid java name */
            public final int m675getKeyboardkB6V9T0() {
                return Source.Keyboard;
            }

            /* JADX INFO: renamed from: getDragAndDrop-kB6V9T0, reason: not valid java name */
            public final int m674getDragAndDropkB6V9T0() {
                return Source.DragAndDrop;
            }

            /* JADX INFO: renamed from: getClipboard-kB6V9T0, reason: not valid java name */
            public final int m673getClipboardkB6V9T0() {
                return Source.Clipboard;
            }
        }

        public String toString() {
            return m671toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m671toStringimpl(int i2) {
            return m669equalsimpl0(i2, Keyboard) ? "Source.Keyboard" : m669equalsimpl0(i2, DragAndDrop) ? "Source.DragAndDrop" : m669equalsimpl0(i2, Clipboard) ? "Source.Clipboard" : "Invalid (" + i2 + ')';
        }
    }
}
