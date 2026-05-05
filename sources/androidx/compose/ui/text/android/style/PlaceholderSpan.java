package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
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
/* JADX INFO: compiled from: PlaceholderSpan.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLш|\u0004O\u000b8é6B\r(4\u0012}\u000bnjO0LeN3ZS8\u0018s{:&c$\u007fCC٥\"}8\tWȞog|Ub\u000bI\u0014\u000e\u0016\u000fj4I[zc܈%˰`\u0016o3{nu8\u00075i\u0015$@\"Py3\u0002*.V\u0012\u000fzqN\u001c\u0016>D\t:\u0001\u000e]\t(\u0017\u001e>N\u0004.`uTNH\u001b^J31\n\u0002B|*ۢ4|[\u0015\u000f%5#\u000faLBp;C-=S1 \u0003aM\u001dWsS\u0004\u0017BW/W\u0010o6\u0007\u0003D\u00199l%]!)\r\t_~$'YP\u0014O^-@w)~=@\u0012.\u001e'v1]\u001et)&3#u\u0004D^$vB.\u001e(J_W\u000eWC9Ii\u0002eI;f7*(=$1\u001b\u0007#qS<{E\u001fb\u0014i1\u007fCmL\\'q=\u001c\u0007!h\u0010O\u001c2]~]\u0006WCgAEfQ#Ou2LRp\u000f\u0005\u000fr\u0012*)̹ḻr\u001c?ѧ!\u000e`Pr\u0012<\\b\\D\u0011{\u001d+\u0378\u007fݔ\u0017 dɼ\r?3\u001efO\u0017l\u001bQk\u0013=/\u0015:\u00103*N.ޱjۋ9Wk߄yT|#ML3\u0011fkZS:]3̨$ĘLj\u0018ǮLP\\\u001d+2m\u0004rؼ8֞\u001d\\\u001dǽS*PG\u0015\t\u000e[?ɰ\u0001Ձ7$\u000bǭt\u0004\u0017\bh\\\u001frς|O4ʉx$3T_Ei2c\"\u00014+$]ѫuõKgT܁\u001d\u000b$\nm{N\u0019J=_8U\u0013=\u0002_v@m\u001cɪ~ϯUS\u001a\u05fd\u0013~\u007f$Ix~s\u0016l\t,\u000fm!֥VЂ&vfаץ\f\f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|iE|*5M\r&r0\u001c\u0015kk@\u0006c9<\u0002#P\"", "\u001a`]1e6BRb\u000ezq;F\u0017>y\u0007(E-\u0001\"\u001eCm\u000eDv.DG\t\u001c@C", "EhSA[", "", "EhSA[\u001cGW(", "", "6dX4[;", "6dX4[;.\\\u001d\u000e", ">w?2e\u001aI", "DdaA\\*:Zt\u0006~`5", "uE8\u0013<\r\"\u0017\n", "\nrTA \u0006\u0017", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&U(y\u0017K^%Df\u0002\u001eEQ\u001f=#", "4n]A@,M`\u001d|\t", "5dc\u0013b5M;\u0019\u000e\bb*\u000b", "u(;.a+K]\u001d}D`9x\u00142i}6E+|\u001b V.nF\u007f4\u001dY\r-;k$\u0012VR\u0011", "6dX4[;)f", "5dc\u0015X0@V(i\u000e", "u(8", "7r;.\\+(c(", "", "5dc#X9MW\u0017z\u0002:3\u0001\u000b8", "EhSA[\u0017Q", "5dc$\\+MV\u0004\u0012", "2qPD", "", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "BdgA", "", "AsP?g", "3mS", "F", "Bn_", "G", "0ncAb4", ">`X;g", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", "5dc \\A>", "4l", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PlaceholderSpan extends ReplacementSpan {
    public static final int ALIGN_ABOVE_BASELINE = 0;
    public static final int ALIGN_BOTTOM = 2;
    public static final int ALIGN_CENTER = 3;
    public static final int ALIGN_TEXT_BOTTOM = 5;
    public static final int ALIGN_TEXT_CENTER = 6;
    public static final int ALIGN_TEXT_TOP = 4;
    public static final int ALIGN_TOP = 1;
    public static final int UNIT_EM = 1;
    public static final int UNIT_SP = 0;
    public static final int UNIT_UNSPECIFIED = 2;
    private Paint.FontMetricsInt fontMetrics;
    private final float height;
    private int heightPx;
    private final int heightUnit;
    private boolean isLaidOut;
    private final float pxPerSp;
    private final int verticalAlign;
    private final float width;
    private int widthPx;
    private final int widthUnit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
    }

    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    /* JADX INFO: compiled from: PlaceholderSpan.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005,2ߡx\u001d߿\u001b9^C\u001eH:_\u0014/\u0015kڷ8$i$BOIV2}P\u000b&ȥ:̊rJbŏ\u0014\u001b\u0014\u0019\u0011jZK,ޓ0ܫ\u00132Jģ\u0010?[sU9\u000fv\rӓrݨ&8\u0002ڎQ&8M(v)E\"ÏdضDpBĥ]Y\u0013 *\u0006l\"Wȭ/ʄR6PǍ.F=*\u001bipP}ۆ\u0003ƊQ\rNÖw\u0019\u0005i6+n9\f՝w٨\u0007\u0007Z¹\u0010\u000fMzU\u0005\u0017)}ǩ\u001cָ[6`Üd!9Y%]!(3ӫ$ԃ\u0010'3Ւ4W^\u0019@w)}cɤV؝\n'P͓Ǐ\u001et"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|iE|*5M\r&r0\u001c\u0015kk@\u0006c9<\u0002#P\u000b,6d]nF\u0018\u001ccc", "", "u(E", "\u000fK8\u0014A&\u001a0\u0003oZX\tXv\u000fLc\u0011[", "", "\u000fK8\u0014A&\u001b=\bmdF", "\u000fK8\u0014A&\u001c3\u0002mZK", "\u000fK8\u0014A&-3\fmt;\u0016kw\u0019M", "\u000fK8\u0014A&-3\fmt<\few\u000fR", "\u000fK8\u0014A&-3\fmtM\u0016g", "\u000fK8\u0014A&-=\u0004", "#M8!R\f&", "#M8!R\u001a)", "#M8!R\u001c'A\u0004^XB\r`h\u000e", "#mXA", "$daA\\*:Zt\u0006~`5", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {

        /* JADX INFO: compiled from: PlaceholderSpan.android.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĲA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|iE|*5M\r&r0\u001c\u0015kk@\u0006c9<\u0002#P\u000b,6d]nF\u0018\u001ccL>4\u0011\u0014/", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface Unit {
        }

        /* JADX INFO: compiled from: PlaceholderSpan.android.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĲA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|iE|*5M\r&r0\u001c\u0015kk@\u0006c9<\u0002#P\u000b,6d]nF\u0018\u001ccL?+\u001a\u0014]? u >#\n5\u001f", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface VerticalAlign {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PlaceholderSpan(float f2, int i2, float f3, int i3, float f4, int i4) {
        this.width = f2;
        this.widthUnit = i2;
        this.height = f3;
        this.heightUnit = i3;
        this.pxPerSp = f4;
        this.verticalAlign = i4;
    }

    public final Paint.FontMetricsInt getFontMetrics() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fontMetrics");
        return null;
    }

    public final int getWidthPx() {
        if (!this.isLaidOut) {
            throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
        }
        return this.widthPx;
    }

    public final int getHeightPx() {
        if (!this.isLaidOut) {
            throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
        }
        return this.heightPx;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        float f2;
        int iCeilToInt;
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        this.fontMetrics = paint.getFontMetricsInt();
        if (getFontMetrics().descent <= getFontMetrics().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
        }
        int i4 = this.widthUnit;
        if (i4 == 0) {
            f2 = this.width * this.pxPerSp;
        } else if (i4 == 1) {
            f2 = this.width * textSize;
        } else {
            throw new IllegalArgumentException("Unsupported unit.");
        }
        this.widthPx = PlaceholderSpan_androidKt.ceilToInt(f2);
        int i5 = this.heightUnit;
        if (i5 == 0) {
            iCeilToInt = PlaceholderSpan_androidKt.ceilToInt(this.height * this.pxPerSp);
        } else if (i5 == 1) {
            iCeilToInt = PlaceholderSpan_androidKt.ceilToInt(this.height * textSize);
        } else {
            throw new IllegalArgumentException("Unsupported unit.");
        }
        this.heightPx = iCeilToInt;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = getFontMetrics().ascent;
            fontMetricsInt.descent = getFontMetrics().descent;
            fontMetricsInt.leading = getFontMetrics().leading;
            switch (this.verticalAlign) {
                case 0:
                    if (fontMetricsInt.ascent > (-getHeightPx())) {
                        fontMetricsInt.ascent = -getHeightPx();
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + getHeightPx() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + getHeightPx();
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - getHeightPx()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - getHeightPx();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < getHeightPx()) {
                        fontMetricsInt.ascent -= (getHeightPx() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2;
                        fontMetricsInt.descent = fontMetricsInt.ascent + getHeightPx();
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown verticalAlign.");
            }
            fontMetricsInt.top = Math.min(getFontMetrics().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(getFontMetrics().bottom, fontMetricsInt.descent);
        }
        return getWidthPx();
    }
}
