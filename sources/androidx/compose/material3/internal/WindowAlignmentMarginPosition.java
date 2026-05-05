package androidx.compose.material3.internal;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: MenuPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0006Gڌ0!Ǟr~P+Jw\bh+>6DͿL.`S֜\u0013n"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_ QL:uFy\u001clcB\u000fc5]^#TNR5G\\\u0001A#\u0016d\u0017$", "", "u(E", "\u0016na6m6Gb\u0015\u0006", "$daA\\*:Z", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WindowAlignmentMarginPosition {
    public static final int $stable = 0;
    public static final WindowAlignmentMarginPosition INSTANCE = new WindowAlignmentMarginPosition();

    private WindowAlignmentMarginPosition() {
    }

    /* JADX INFO: compiled from: MenuPosition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r(4\u0012}\nnjG9L͜P.`ݷ2\u000fq|<$q$yّCU0}*\tUNog\u0005Jb\u000bI\u0010\u000e\u0016\u0007v4կ[ޔc(ƁbB\u001e>s`\u007fAG`\r63!B&F{\u001d\u0001H-Н\u0014v\tG\u0014\u0013 5XphSS̢\u0006b\u0019\u0014D8\u0001L_.߱7\u0011\bkAG#1݃rT-_>|e\rtUW\u0013|a,-X7c\u0018kڌ\u0002OciG\u001b? F5n51CK\nVdcFу\u0016sV\u001bi\u000b&\u000b\b\u0018Է\u000bo[]pcP<+(~\n\u001bT\u0004<\u0015WL<=2f6\u001fcx\u0001eXP0ar\u0004\ttN\u0017S\u0014y?߆\u001aƘЂe=\u001fcE\u0012M\u0014,:\u0019nOs\u001bج_e'bwi1\u007fA\u0014ʳP̆]=uՎAn\u0010,\u001c0u\u0003\u0006Ɉ\u0013ѧ\u001b%?كހ#&s\u0005Nו\u0004%\u0004Äll"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_ QL:uFy\u001clcB\u000fc5]^#TNR5G\\\u0001A#\u0016d\u0017\r\u000e\u0017\u0012]V.wS3&]", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0016MLKV>,\u0019weC\u0010\"\u000fX\u0004+\\VW;XYH", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", ";`a4\\5", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJr\u001eKq\u0017Dv.D\u0018`*Dq+8VR7r\n\u0002XY", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", ">nb6g0H\\", "/mR5b9\u001b])\byl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00125W\ru", "Eh]1b>,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", ";d]BJ0=b\u001c", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ">nb6g0H\\`RJD;gu\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W \u007f4\"Y{/\rRy\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011\\Rul[vL]xV\"X;\u001cc]N$lS;)\u0011\u0002\re", "BnBAe0GU", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Horizontal implements MenuPosition.Horizontal {
        public static final int $stable = 0;
        private final Alignment.Horizontal alignment;
        private final int margin;

        private final Alignment.Horizontal component1() {
            return this.alignment;
        }

        private final int component2() {
            return this.margin;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, Alignment.Horizontal horizontal2, int i2, int i3, Object obj) {
            if ((1 & i3) != 0) {
                horizontal2 = horizontal.alignment;
            }
            if ((i3 + 2) - (i3 | 2) != 0) {
                i2 = horizontal.margin;
            }
            return horizontal.copy(horizontal2, i2);
        }

        public final Horizontal copy(Alignment.Horizontal horizontal, int i2) {
            return new Horizontal(horizontal, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Horizontal)) {
                return false;
            }
            Horizontal horizontal = (Horizontal) obj;
            return Intrinsics.areEqual(this.alignment, horizontal.alignment) && this.margin == horizontal.margin;
        }

        public int hashCode() {
            return (this.alignment.hashCode() * 31) + Integer.hashCode(this.margin);
        }

        public String toString() {
            return "Horizontal(alignment=" + this.alignment + ", margin=" + this.margin + ')';
        }

        public Horizontal(Alignment.Horizontal horizontal, int i2) {
            this.alignment = horizontal;
            this.margin = i2;
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Horizontal
        /* JADX INFO: renamed from: position-95KtPRI */
        public int mo2909position95KtPRI(IntRect intRect, long j2, int i2, LayoutDirection layoutDirection) {
            if (i2 >= IntSize.m6808getWidthimpl(j2) - (this.margin * 2)) {
                return Alignment.Companion.getCenterHorizontally().align(i2, IntSize.m6808getWidthimpl(j2), layoutDirection);
            }
            return RangesKt.coerceIn(this.alignment.align(i2, IntSize.m6808getWidthimpl(j2), layoutDirection), this.margin, (IntSize.m6808getWidthimpl(j2) - this.margin) - i2);
        }
    }

    /* JADX INFO: compiled from: MenuPosition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r(4\u0012}\nnjG9L͜P.`ݷ2\u000fq|<$q$yّCU0}*\tUPog|VbŏIƬ\f,ю\u001b,wT9p\"\u0013@B\b?aN\u007fAGb\r63#ݨ&8\b\tI!8M(v)D\u0012ċ\u0013xG~@j\r{\b`Ɗ\u0007\u0007;\u000f%tg|Ȥxrc:=#\u001bipOWe6|[\u000f^TU\u0010=Ҵ\u001dsQE=-%\u0002\f7XiI\u001bA\b<3smާ,\u0012zeBp\u007fB\u0018q͔\f&\u001b4i\u001dQ\u000f\u000fW/]qcP<7(~\n\u001dT\u0004<\u0017WL<?2f6\u0011y\tʺRóг\u0006`H\u0013\tu~\u001e3\u0015K+g1-ж`\f%\\7\u0014\u0005;\u001fyЪpĲ_T\u0016֫e'byi1\u007fC\u0014ʳP̆]=uՎ͒b\u00072\u00076ϼ\u001c]z¦2."}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_ QL:uFy\u001clcB\u000fc5]^#TNR5G\\\u0001A#\u0016d\u0017\r\u001c\r\u0012hE\"jK\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0016MLKV>,\u0019weC\u0010\"\u001dN\u00046KJJ32", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", ";`a4\\5", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJr\u001eKq\u0017Dv.D\u0018n D|\u001a,IJ\u0011Ow\u000f", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", ">nb6g0H\\", "/mR5b9\u001b])\byl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00125W\ru", "Eh]1b>,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", ";d]B;,BU\u001c\u000e", ">nb6g0H\\`ckm\u0012Hv}", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W \u007f4\"Y{/\rRyq1", "BnBAe0GU", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Vertical implements MenuPosition.Vertical {
        public static final int $stable = 0;
        private final Alignment.Vertical alignment;
        private final int margin;

        private final Alignment.Vertical component1() {
            return this.alignment;
        }

        private final int component2() {
            return this.margin;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, Alignment.Vertical vertical2, int i2, int i3, Object obj) {
            if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
                vertical2 = vertical.alignment;
            }
            if ((i3 + 2) - (i3 | 2) != 0) {
                i2 = vertical.margin;
            }
            return vertical.copy(vertical2, i2);
        }

        public final Vertical copy(Alignment.Vertical vertical, int i2) {
            return new Vertical(vertical, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vertical)) {
                return false;
            }
            Vertical vertical = (Vertical) obj;
            return Intrinsics.areEqual(this.alignment, vertical.alignment) && this.margin == vertical.margin;
        }

        public int hashCode() {
            return (this.alignment.hashCode() * 31) + Integer.hashCode(this.margin);
        }

        public String toString() {
            return "Vertical(alignment=" + this.alignment + ", margin=" + this.margin + ')';
        }

        public Vertical(Alignment.Vertical vertical, int i2) {
            this.alignment = vertical;
            this.margin = i2;
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Vertical
        /* JADX INFO: renamed from: position-JVtK1S4 */
        public int mo2910positionJVtK1S4(IntRect intRect, long j2, int i2) {
            if (i2 >= IntSize.m6807getHeightimpl(j2) - (this.margin * 2)) {
                return Alignment.Companion.getCenterVertically().align(i2, IntSize.m6807getHeightimpl(j2));
            }
            return RangesKt.coerceIn(this.alignment.align(i2, IntSize.m6807getHeightimpl(j2)), this.margin, (IntSize.m6807getHeightimpl(j2) - this.margin) - i2);
        }
    }
}
