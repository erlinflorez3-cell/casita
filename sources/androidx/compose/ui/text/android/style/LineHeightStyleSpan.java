package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: LineHeightStyleSpan.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004O\u000b8é6B\r(4\u0012}\u0007njG9LeN>ZS8\u000fsڔ<$q$yCAU\"}0\u0014WNmktϺpŏs\u000f4\u00159 <Mcxu\u0012=3RsM5eok<pxD\t82P;\n\t\u000f\u001fBH>|\u000bGY\u0013*0nvJX\u0013L\u0013\"*\u0006l!Ә\"\\uW~VzuR/Q\u001c\u001aF\\Aw0+hSF\u001d]\u001b\u0013y\u001eYYg9#Bk\u00035p\fC\u0011^\n=3kW+9i\fWd[0\u0018#Lg\r\fuV`\u0013Qx\fU.\u007fgYj&(&\u0016B!\u0005)\u001c(?H\\ƦJj\u0016\u0010Kt!VpT\u0010bZ\u007f)df\u001d+\u007fA0Q\u001b\u0015W(ݢϭR7\u0002(]*1\u000b\u0007!\nWd֮!ôXwYĸ\"LKSf\n\b@DՑ|Ċ\u0006*\f\u0382\u0018\f=\u007f).E(\u000eن;؝%k\n҆\u0015s\u0005\u0011xh\u0002l)̵Ḻr\u0016?ѧY(hR|\u0005\u001aS\u0005\\:\u001ee\u001c\u0003\n<Hi\u0605hʟ@'-īfQnxx].\u00163@~7\bqBސcߍb3=ȡ4,od\u000f\u0014m?\u0013\tfsZS:]\u001bhxüTн\u0014}\u0004ͩf\u000e\u0019EM\u0002lC:11\\CIҴ\"HIґ!a`|\u001e\u0014%?2\u0005\u0002$#\fWˉ^ʼsg\u0001̢|\tn*EA\u007f6oĢWɋl4\u0005ȽW\u000b\u0002\u0005_gzM#́\u0018\u0091Y{(چjH_6U\u0013=\u0005Ȟ6\b5զdtkg[)ئ~!"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|iE|*5M\r\"o=\u001ewhe;\nr\u001a]\u000b.G:Y(e(", "\u001a`]1e6BRb\u000ezq;F\u0017>y\u0007(E'\u0005 \u0017*o\u0012>y4#dy)\r", ":h]2;,BU\u001c\u000e", "", "AsP?g\u0010GR\u0019\u0012", "", "3mS\u0016a+>f", "BqX:90Ka(e~g,k\u0013:", "", "BqX:?(Lb\u007f\u0003\u0004^\t\u0007\u0018>o\b", "Bn_\u001fT;B]", "uE8\u0016M!\u001f\u0017\n", "/rR2a;", "2db0X5M", "4ha@g\bLQ\u0019\b\n", "\nrTA \u0006\u0017", "4ha@g\bLQ\u0019\b\n=0}\n", "5dc\u0013\\9Lbt\rx^5\fg3f\u0001", "u(8", ":`bA7,LQ\u0019\b\n", ":`bA7,LQ\u0019\b\n=0}\n", "5dc\u0019T:M2\u0019\rx^5\fg3f\u0001", "5dc\u0019\\5>6\u0019\u0003|a;", "u(5", "5dc!e0F:\u0015\r\nE0\u0006\t\fo\u000f7\u0006H", "u(I", "1`[0h3:b\u0019mvk.|\u0018\u0017e\u000f5\u007f>\u000f", "", "4n]A@,M`\u001d|\tB5\f", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&U(y\u0017K^%Df\u0002\u001eEQ\u001f=#", "1g^<f,!S\u001d\u0001}m", "BdgA", "", "AsP?g", "3mS", "AoP;F;:`(ozk;\u0001\u0007+l", "1n_F", "1n_F\u0017<BM(~\u000em&\n\t6e{6{", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {
    public static final int $stable = 8;
    private final int endIndex;
    private int firstAscentDiff;
    private int lastDescentDiff;
    private final float lineHeight;
    private final int startIndex;
    private final float topRatio;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;
    private int firstAscent = Integer.MIN_VALUE;
    private int ascent = Integer.MIN_VALUE;
    private int descent = Integer.MIN_VALUE;
    private int lastDescent = Integer.MIN_VALUE;

    public LineHeightStyleSpan(float f2, int i2, int i3, boolean z2, boolean z3, float f3) {
        this.lineHeight = f2;
        this.startIndex = i2;
        this.endIndex = i3;
        this.trimFirstLineTop = z2;
        this.trimLastLineBottom = z3;
        this.topRatio = f3;
        if ((0.0f > f3 || f3 > 1.0f) && f3 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i2, int i3, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        if (LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        boolean z2 = i2 == this.startIndex;
        boolean z3 = i3 == this.endIndex;
        if (z2 && z3 && this.trimFirstLineTop && this.trimLastLineBottom) {
            return;
        }
        if (this.firstAscent == Integer.MIN_VALUE) {
            calculateTargetMetrics(fontMetricsInt);
        }
        fontMetricsInt.ascent = z2 ? this.firstAscent : this.ascent;
        fontMetricsInt.descent = z3 ? this.lastDescent : this.descent;
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int iCeil = (int) Math.ceil(this.lineHeight);
        int iLineHeight = iCeil - LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt);
        float fAbs = this.topRatio;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt);
        }
        if (iLineHeight <= 0) {
            dCeil = Math.ceil(iLineHeight * fAbs);
        } else {
            dCeil = Math.ceil(iLineHeight * (1.0f - fAbs));
        }
        int i2 = fontMetricsInt.descent + ((int) dCeil);
        this.descent = i2;
        int i3 = i2 - iCeil;
        this.ascent = i3;
        if (this.trimFirstLineTop) {
            i3 = fontMetricsInt.ascent;
        }
        this.firstAscent = i3;
        this.lastDescent = this.trimLastLineBottom ? fontMetricsInt.descent : this.descent;
        this.firstAscentDiff = fontMetricsInt.ascent - this.firstAscent;
        this.lastDescentDiff = this.lastDescent - fontMetricsInt.descent;
    }

    public static /* synthetic */ LineHeightStyleSpan copy$ui_text_release$default(LineHeightStyleSpan lineHeightStyleSpan, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 + 4) - (i4 | 4) != 0) {
            z2 = lineHeightStyleSpan.trimFirstLineTop;
        }
        return lineHeightStyleSpan.copy$ui_text_release(i2, i3, z2);
    }

    public final LineHeightStyleSpan copy$ui_text_release(int i2, int i3, boolean z2) {
        return new LineHeightStyleSpan(this.lineHeight, i2, i3, z2, this.trimLastLineBottom, this.topRatio);
    }
}
