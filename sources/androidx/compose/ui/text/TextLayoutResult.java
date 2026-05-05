package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: TextLayoutResult.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.`\\2\u000fq~<$i)yCA\\\"}0\u000fWNmjvJh)K\u000f\u001c\u0016\u0001j2R]xs\u0012\u00172H\u0001G3coE9fv>\u000562*8\u007f\u0006\t\u001a@H\u0018v\u0001FS\f <H\u0081@W#˟5\u001a@\u0005~;\u0011\"jgf6vmm>=%\u001bipQ7c>\u0001e\rtYܮ\u0011vo$sbEZ-%\u0002Έ7Xa?\u0011?\n=3iW-1I\u0002[NX.\u0019Ǽ*˽ոat,\u0003\u0013x)\u001d5SgcyX>.\u0006$\u0014\u000fR\u0003<\u0005mε.u&t2&3#\u001e\u0004D^.vB.\u0013*B%R\u00183YXKj_\u000eS\u0019|OD\u0011\u001bL;\u0001\u001d@\fX\u001c\r-\u001b\u0003\u0010\u001aE_oUH|\u0018\nA{0\tb0B44U0G{?6_1E\rQ#Oy2LR\u001a\u000f\u0005\u000f\u0001\u001cu`{X\"\u001d$g.\u0017>rD\u0013\u001d4fb\rD\u0011{4\u0005\u000b\f:+ \u000b\u0010l'+\u0010\\\u0005\u0001i\u0019U&\u00163e~7\b\u0007\u001c\u0012eev3ci,\u001co\n\u000f\u0014mT\u0013\tf\u001fZS:h%40k`j>\u0006,H\\>+2m\nd@:k1\\CV3\"Ps\u0015\t\u000er1\u001c\r\u0010K$1\u0002Tx\u00173h\\\u001f\b0\u0005Wh\u0015`P;qUCK>UP\u0001|\u00131D\u0017s._\u0018PU\u000b\u0005\u0016$\u0015ߡ\u001fچ׀=S5}!PG5@DEEz\u001e\u0016U[>?z+\u0012WOvq\u007f\b\u00195\\dx\u0010gTE:'b\u0001i d.\u0012*_\t\u000f{T9$nM\u0001/q<|Pہ\u0004\u001eɀ$˚Ȟ&~;vQqe\u001c\u0006_G\u0015\u0010u0\u0004v\u0006p[>t\u0014\f\\g$\"zQ\fJ\u0004>W'\u0017>Pr3\u0017\u0013Wx~ B7<CwȈEh\tX>V\u00199Nu\u00157%p\u0005cpW̭\u00028Fa0\u007fQ\bdmQ2)M\u0002uƽqQd֥b\u0011\u0010\u001a\nA?!*N8V\u0006j?tӒw\u001cNCAt\u0013FY3B?T\b9QҰm\f\u0018ÿ\u0018He#%B\u0013\u0003IV&T']ƪL\u000bhѤx#0\u0016\r%\u0004-\u0007LI\u0005\u001c^\u000bsҕ6\u0005k\u001f\u000f4xiOu3-\\Tg\u001eϜ\\\u0007\u0013ԵuEO\u001dD \u0018@{\t\b\u0014H\u001c\r\u001fX\u0017IX\u007f/چz6fΗmfT\u0005\u000537i\\&A~)\u0002˓;߽݀\n\u0018۽vwj-Zr\u00109I<\u000f:װ)\u0010\u0014\u007fǐ7[\u0005=-Chކ\u0018v"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "", ":`h<h;\"\\$\u000f\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|y7XSJA", ";t[A\\\u0017:`\u0015\u0001\bZ7\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9uL}49Dy-3o#*XF\u0011", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8D@y4A}%\u0012VNKz\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VliH3r/3,\u0004.V}FkVp|\u0014?ywF_YL\u000b\u001d?E2wFfhuN\u000b$b+`\u001cf,:DC2#~)\u0019wZ;qw`\u0017r_O+X", "2hS\u001ci,KT \t\rA,\u0001\u000b2t", "", "5dc\u0011\\+(d\u0019\f{e6\u000fk/i\u0002+\u000b", "u(I", "2hS\u001ci,KT \t\rP0{\u00182", "5dc\u0011\\+(d\u0019\f{e6\u000fz3d\u000f+", "4ha@g\t:a\u0019\u0006~g,", "", "5dc\u0013\\9Lbuz\t^3\u0001\u0012/", "u(5", "6`b#\\:NO h\f^9}\u00109w", "5dc\u0015T:/W'\u000fve\u0016\u000e\t<f\u00072\u000e", ":`bA5(LS \u0003\u0004^", "5dc\u0019T:M0\u0015\rze0\u0006\t", "5dc\u0019T@Hc(b\u0004i<\f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhd\u001cKw&=1LF{Cs", ":h]266N\\(", "", "5dc\u0019\\5>1#\u000f\u0004m", "u(8", "5dc\u001ah3MW\u0004z\bZ.\n\u0005:h", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006^5<h\u0002\u000b3z\u00120Z?Fn\n", ">kP0X/HZ\u0018~\bK,z\u0018=", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "5dc\u001d_(<S\u001c\t\u0002],\nu/c\u000f6", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc \\A>\u001b\r{\u000ff\u0013I\u000b", "u(9", "\u0018", "1n_F", "1n_F \u0016\tY\u0001\ft\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8D@y4A}%\u0012VNKz\n\u0003XO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#0$\u0002S\u001e\u001b\u001c6Y\u0011(h\u000f\u001c\u001d\u001d\u000b", "3pd._:", "=sW2e", "5dc\u000f\\+B@)\bYb9|\u0007>i\n1", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#j Ew\u001d?MB*kG-sln9\u0005r0X\u007f|", "=eU@X;", "5dc\u000fb<GR\u001d\b|;6\u0010", "5dc\u0010h9L]&kz\\;", "5dc\u0015b9Bh#\b\nZ3g\u0013=i\u000f,\u0006I", "CrT\u001de0FO&\u0013Yb9|\u0007>i\n1", "5dc\u0019\\5>0\u0015\rze0\u0006\t", ":h]2<5=S,", "5dc\u0019\\5>0#\u000e\nh4", "5dc\u0019\\5>3\"}", "Dhb6U3>3\"}", "5dc\u0019\\5>4#\fd_-\u000b\t>", "5dc\u0019\\5>4#\fk^9\f\r-a\u0007\u0013\u0006N\u0005&\u001bQx", "DdaA\\*:Z", "5dc\u0019\\5>:\u0019\u007f\n", "5dc\u0019\\5>@\u001d\u0001}m", "5dc\u0019\\5>A(z\bm", "5dc\u0019\\5>B#\n", "5dc\u001cY-LS(_\u0005k\u0017\u0007\u00173t\u00042\u0005", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5dc\u001cY-LS(_\u0005k\u0017\u0007\u00173t\u00042\u0005\b\u0007^eN[X$", "uI\u0018\u0016", "5dc\u001dT9:U&z\u0006a\u000b\u0001\u0016/c\u000f,\u0006I", "5dc\u001dT;A4#\fgZ5~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "AsP?g", "3mS", "5dc$b9=0#\u000f\u0004](\n\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "5dc$b9=0#\u000f\u0004](\n\u001dv-\u0005;M%a%", "uH\u0018\u0017", "6`b566=S", "7r;6a,\u001eZ \u0003\u0006l0\u0012\t.", "BnBAe0GU", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextLayoutResult {
    public static final int $stable = 8;
    private final float firstBaseline;
    private final float lastBaseline;
    private final TextLayoutInput layoutInput;
    private final MultiParagraph multiParagraph;
    private final List<Rect> placeholderRects;
    private final long size;

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutInput, multiParagraph, j2);
    }

    private TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j2) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = multiParagraph;
        this.size = j2;
        this.firstBaseline = multiParagraph.getFirstBaseline();
        this.lastBaseline = multiParagraph.getLastBaseline();
        this.placeholderRects = multiParagraph.getPlaceholderRects();
    }

    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final MultiParagraph getMultiParagraph() {
        return this.multiParagraph;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g */
    public final long m6096getSizeYbymL2g() {
        return this.size;
    }

    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    public final boolean getDidOverflowHeight() {
        return this.multiParagraph.getDidExceedMaxLines() || ((float) IntSize.m6807getHeightimpl(this.size)) < this.multiParagraph.getHeight();
    }

    public final boolean getDidOverflowWidth() {
        return ((float) IntSize.m6808getWidthimpl(this.size)) < this.multiParagraph.getWidth();
    }

    public final boolean getHasVisualOverflow() {
        return getDidOverflowWidth() || getDidOverflowHeight();
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final int getLineCount() {
        return this.multiParagraph.getLineCount();
    }

    public final int getLineStart(int i2) {
        return this.multiParagraph.getLineStart(i2);
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResult textLayoutResult, int i2, boolean z2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        return textLayoutResult.getLineEnd(i2, z2);
    }

    public final int getLineEnd(int i2, boolean z2) {
        return this.multiParagraph.getLineEnd(i2, z2);
    }

    public final boolean isLineEllipsized(int i2) {
        return this.multiParagraph.isLineEllipsized(i2);
    }

    public final float getLineTop(int i2) {
        return this.multiParagraph.getLineTop(i2);
    }

    public final float getLineBaseline(int i2) {
        return this.multiParagraph.getLineBaseline(i2);
    }

    public final float getLineBottom(int i2) {
        return this.multiParagraph.getLineBottom(i2);
    }

    public final float getLineLeft(int i2) {
        return this.multiParagraph.getLineLeft(i2);
    }

    public final float getLineRight(int i2) {
        return this.multiParagraph.getLineRight(i2);
    }

    public final int getLineForOffset(int i2) {
        return this.multiParagraph.getLineForOffset(i2);
    }

    public final int getLineForVerticalPosition(float f2) {
        return this.multiParagraph.getLineForVerticalPosition(f2);
    }

    public final float getHorizontalPosition(int i2, boolean z2) {
        return this.multiParagraph.getHorizontalPosition(i2, z2);
    }

    public final ResolvedTextDirection getParagraphDirection(int i2) {
        return this.multiParagraph.getParagraphDirection(i2);
    }

    public final ResolvedTextDirection getBidiRunDirection(int i2) {
        return this.multiParagraph.getBidiRunDirection(i2);
    }

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M */
    public final int m6095getOffsetForPositionk4lQ0M(long j2) {
        return this.multiParagraph.m5989getOffsetForPositionk4lQ0M(j2);
    }

    public final Rect getBoundingBox(int i2) {
        return this.multiParagraph.getBoundingBox(i2);
    }

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs */
    public final long m6097getWordBoundaryjx7JFs(int i2) {
        return this.multiParagraph.m5991getWordBoundaryjx7JFs(i2);
    }

    public final Rect getCursorRect(int i2) {
        return this.multiParagraph.getCursorRect(i2);
    }

    public final Path getPathForRange(int i2, int i3) {
        return this.multiParagraph.getPathForRange(i2, i3);
    }

    /* JADX INFO: renamed from: copy-O0kMr_c$default */
    public static /* synthetic */ TextLayoutResult m6093copyO0kMr_c$default(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j2, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j2 = textLayoutResult.size;
        }
        return textLayoutResult.m6094copyO0kMr_c(textLayoutInput, j2);
    }

    /* JADX INFO: renamed from: copy-O0kMr_c */
    public final TextLayoutResult m6094copyO0kMr_c(TextLayoutInput textLayoutInput, long j2) {
        return new TextLayoutResult(textLayoutInput, this.multiParagraph, j2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
        return Intrinsics.areEqual(this.layoutInput, textLayoutResult.layoutInput) && Intrinsics.areEqual(this.multiParagraph, textLayoutResult.multiParagraph) && IntSize.m6806equalsimpl0(this.size, textLayoutResult.size) && this.firstBaseline == textLayoutResult.firstBaseline && this.lastBaseline == textLayoutResult.lastBaseline && Intrinsics.areEqual(this.placeholderRects, textLayoutResult.placeholderRects);
    }

    public int hashCode() {
        return (((((((((this.layoutInput.hashCode() * 31) + this.multiParagraph.hashCode()) * 31) + IntSize.m6809hashCodeimpl(this.size)) * 31) + Float.hashCode(this.firstBaseline)) * 31) + Float.hashCode(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) IntSize.m6811toStringimpl(this.size)) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }
}
