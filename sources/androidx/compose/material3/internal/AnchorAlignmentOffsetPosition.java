package androidx.compose.material3.internal;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: MenuPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0006Gڌ0!Ǟr~P+Jw\bh+>6DͿL.`S֜\u0013n"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\nVA>uAy\u001clcB\u000fc5]`(HZN;G\\\u0001A#\u0016d\u0017$", "", "u(E", "\u0016na6m6Gb\u0015\u0006", "$daA\\*:Z", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnchorAlignmentOffsetPosition {
    public static final int $stable = 0;
    public static final AnchorAlignmentOffsetPosition INSTANCE = new AnchorAlignmentOffsetPosition();

    private AnchorAlignmentOffsetPosition() {
    }

    /* JADX INFO: compiled from: MenuPosition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0018\u007f\u0007lnA0RnP\u008cZS8şs{:%c$\bCC٥\"}8\tWNmgvJp\u000bK\u000f\f\u0017\u0001j:U]ތcܐ\u0015Hԏ ?aL0XId\u00036\u001d `#H}\u0013\u00032*v\u0011\u0007~QN$\u0012^D¤>R\u001bRM! \fV /\u001f#ʤO~OzdR/Q\u00040ŬOof>\u0005e\rtXm̜w*C9IO5CǬ\u0004\t\rRi?\u001b? >5n-'9K\fWdY0\u001a\u001b+]\u0010urT`KŰ_T89Y{K~\u0019X}\t\b%>\u001a\r44\u000fΪ.bm\u0016\u001cKt!W\u0007ѧ\u0001'r\u000e\ny6E)079I3f\u007frk\u001d\\I\u0014\u0005;1S\u0005|5sT<dE\u001fb\ri1\u007fV\u0004\\߉\tԯǀq\u0006vy\u0010BL7U\u0019G{?H]ý6,E1#\u0004\u0002vE>ϻ\u0007¾lSqɭ\u0019L0n.7X\nbɱF\u0081\tkXӹ)8\u001fP4T5\u0002^ʹ\"Ϣ{<)طĮNTplpܶy8$íjR"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\nVA>uAy\u001clcB\u000fc5]`(HZN;G\\\u0001A#\u0016d\u0017\r\u000e\u0017\u0012]V.wS3&]", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0016MLKV>,\u0019weC\u0010\"\u000fX\u0004+\\VW;XYH", ";d]B43BU\"\u0007zg;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "/mR5b9\u001aZ\u001d\u0001\u0004f,\u0006\u0018", "=eU@X;", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJr\u001eKq\u0017Dv.D\u0018`*Dq+8VR7r\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[6\u0015R-\u0016\rYJ3-'A,\fAS\u000bJd\bayQ&", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", ">nb6g0H\\", "/mR5b9\u001b])\byl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00125W\ru", "Eh]1b>,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", ";d]BJ0=b\u001c", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ">nb6g0H\\`RJD;gu\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W \u007f4\"Y{/\rRy\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011\\Rul[vL]xV\"X;\u001cc]N$lS;)\u0011\u0002\re", "BnBAe0GU", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Horizontal implements MenuPosition.Horizontal {
        public static final int $stable = 0;
        private final Alignment.Horizontal anchorAlignment;
        private final Alignment.Horizontal menuAlignment;
        private final int offset;

        private final Alignment.Horizontal component1() {
            return this.menuAlignment;
        }

        private final Alignment.Horizontal component2() {
            return this.anchorAlignment;
        }

        private final int component3() {
            return this.offset;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, Alignment.Horizontal horizontal2, Alignment.Horizontal horizontal3, int i2, int i3, Object obj) {
            if ((i3 + 1) - (1 | i3) != 0) {
                horizontal2 = horizontal.menuAlignment;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                horizontal3 = horizontal.anchorAlignment;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                i2 = horizontal.offset;
            }
            return horizontal.copy(horizontal2, horizontal3, i2);
        }

        public final Horizontal copy(Alignment.Horizontal horizontal, Alignment.Horizontal horizontal2, int i2) {
            return new Horizontal(horizontal, horizontal2, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Horizontal)) {
                return false;
            }
            Horizontal horizontal = (Horizontal) obj;
            return Intrinsics.areEqual(this.menuAlignment, horizontal.menuAlignment) && Intrinsics.areEqual(this.anchorAlignment, horizontal.anchorAlignment) && this.offset == horizontal.offset;
        }

        public int hashCode() {
            return (((this.menuAlignment.hashCode() * 31) + this.anchorAlignment.hashCode()) * 31) + Integer.hashCode(this.offset);
        }

        public String toString() {
            return "Horizontal(menuAlignment=" + this.menuAlignment + ", anchorAlignment=" + this.anchorAlignment + ", offset=" + this.offset + ')';
        }

        public Horizontal(Alignment.Horizontal horizontal, Alignment.Horizontal horizontal2, int i2) {
            this.menuAlignment = horizontal;
            this.anchorAlignment = horizontal2;
            this.offset = i2;
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Horizontal
        /* JADX INFO: renamed from: position-95KtPRI, reason: not valid java name */
        public int mo2909position95KtPRI(IntRect intRect, long j2, int i2, LayoutDirection layoutDirection) {
            int iAlign = this.anchorAlignment.align(0, intRect.getWidth(), layoutDirection);
            return intRect.getLeft() + iAlign + (-this.menuAlignment.align(0, i2, layoutDirection)) + (layoutDirection == LayoutDirection.Ltr ? this.offset : -this.offset);
        }
    }

    /* JADX INFO: compiled from: MenuPosition.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0018\u007f\u0007lnA0RnP\u008cZS8şs{:%c$\bCC٥\"}8\tWNmivJh\u0017KƤ\fǥ~\u0001ߚyU'\\R*BF}?KM\u001e>Id\u00038\u001d `#H}\u0013\u00042*v\u0014ͯ~CY\u0011Z7NvRR;NK݈\u0013NE.\b6\\\u0016O|բm&A=+\u001bipRm܂1Er\u001bOl';Ǹ\u0012$1@E5-%\u0002\u00047Xa?\u0011A\n=3iW-1I\u0002ZNX.\u0018[܇NUn\u00010t\u0005\u007fk<-9[{Mf\rV\u0005A՟\u000e\u0005\u000b\u001c\u0014?H\\1`Ȩ\u0007V[\u0003\u0002k@~\u0006\u000fF\u000e\u000by6E6079K3f\u007ftk\u001d\\K\u0014\u0005;\"i\u0015ϒ żڍ\u0012b\u001b0b\u000e\u001a8_WUH|\" ǴlT|p\u0004B\u0004^HV߿} 2\u0017-ڛ,E1!\u0004\u0002vE>ϻ\u0007¾lSqɭ\u0019L0q.7X\rbɱF\u0081\tkXӹГ,\u0016U\u001fZΗ\u001a6\u0012ا`\u0011"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\nVA>uAy\u001clcB\u000fc5]`(HZN;G\\\u0001A#\u0016d\u0017\r\u001c\r\u0012hE\"jK\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0016MLKV>,\u0019weC\u0010\"\u001dN\u00046KJJ32", ";d]B43BU\"\u0007zg;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", "/mR5b9\u001aZ\u001d\u0001\u0004f,\u0006\u0018", "=eU@X;", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJr\u001eKq\u0017Dv.D\u0018n D|\u001a,IJ\u0011R0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007o\u0019^\u0010W3\r\u000eh\u007f\u0015nQF#\u0006(PW\u001f,q", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", ">nb6g0H\\", "/mR5b9\u001b])\byl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00125W\ru", "Eh]1b>,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", ";d]B;,BU\u001c\u000e", ">nb6g0H\\`ckm\u0012Hv}", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W \u007f4\"Y{/\rRyq1", "BnBAe0GU", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Vertical implements MenuPosition.Vertical {
        public static final int $stable = 0;
        private final Alignment.Vertical anchorAlignment;
        private final Alignment.Vertical menuAlignment;
        private final int offset;

        private final Alignment.Vertical component1() {
            return this.menuAlignment;
        }

        private final Alignment.Vertical component2() {
            return this.anchorAlignment;
        }

        private final int component3() {
            return this.offset;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, Alignment.Vertical vertical2, Alignment.Vertical vertical3, int i2, int i3, Object obj) {
            if ((1 & i3) != 0) {
                vertical2 = vertical.menuAlignment;
            }
            if ((2 & i3) != 0) {
                vertical3 = vertical.anchorAlignment;
            }
            if ((i3 + 4) - (i3 | 4) != 0) {
                i2 = vertical.offset;
            }
            return vertical.copy(vertical2, vertical3, i2);
        }

        public final Vertical copy(Alignment.Vertical vertical, Alignment.Vertical vertical2, int i2) {
            return new Vertical(vertical, vertical2, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vertical)) {
                return false;
            }
            Vertical vertical = (Vertical) obj;
            return Intrinsics.areEqual(this.menuAlignment, vertical.menuAlignment) && Intrinsics.areEqual(this.anchorAlignment, vertical.anchorAlignment) && this.offset == vertical.offset;
        }

        public int hashCode() {
            return (((this.menuAlignment.hashCode() * 31) + this.anchorAlignment.hashCode()) * 31) + Integer.hashCode(this.offset);
        }

        public String toString() {
            return "Vertical(menuAlignment=" + this.menuAlignment + ", anchorAlignment=" + this.anchorAlignment + ", offset=" + this.offset + ')';
        }

        public Vertical(Alignment.Vertical vertical, Alignment.Vertical vertical2, int i2) {
            this.menuAlignment = vertical;
            this.anchorAlignment = vertical2;
            this.offset = i2;
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Vertical
        /* JADX INFO: renamed from: position-JVtK1S4, reason: not valid java name */
        public int mo2910positionJVtK1S4(IntRect intRect, long j2, int i2) {
            int iAlign = this.anchorAlignment.align(0, intRect.getHeight());
            return intRect.getTop() + iAlign + (-this.menuAlignment.align(0, i2)) + this.offset;
        }
    }
}
