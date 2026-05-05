package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
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
/* JADX INFO: compiled from: StaticLayoutFactory.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLш|\u0004O\u00118é6B\r(4\u0012}\u0007njO0LeN.ZS@\u000fsڔ<$q$yCAU\"}8\tWNmgvJh\u0010K\u000f\f\u0017\u0001j:R]xc\u0016\u00172P\u0003G3S\u000fC9vҚf\u0005N1bضx\u0015\u0005(*`\u0010%{SQ\u0012\u0012>B\t:\u0001\u0010]\t(\u0016\u001e>N\u0004.`uSNH\u001bcJ31\n\u0002B|*o4\u000bU%F\u00030\u001dzo(C@e@%)a\u000f\u001fR\nB\u0013E\u007fJ\u001dj=&YW\u0004[Dg\u0018\u0014C._\u0011k\u0003>\\3bp\u00105=gcya\u001e,\u0006\u000e\u0014\rj\u0007\u001e\n5\\F-H{\u0018\u0012A\u000b\u000bSne\u0012bP\u0017\u0013ad\u001a5\u0004ACQ\u001b\u0015Tq?'gO{3\u0010.'\u000f\t9[\u0003\u0011p\u001b)o\u0010SGPnYXT\u0018vUo\u001ao\u0011\u001eò\b0U\u001e\u007f\u000b\u001f8/%efޠ''sȵ`Fm\u0016\u0013\u00019bwi`@Pqގ;0\u0011ȱrFj&yr%i:\u001ee\u001ej\u0006,\u0016˙$b\u007f˓9'\u0016q]\r:y[l\"%]iƠ]tsލo;dXCs4\u001foV\u000f\u0014m?И\t^n̻k\u000e`\u00036D\u0003Wx*\u0010{rQܟ\u00178Gڤ462X'~eW\u00112ZA+\u001eރ^n\u0018зl5*+wME\u0018\u000fctp\u001ej֑M2\u0005ʠ:/G{C;vf0\u0004L~9\u0006-\u0010õKmT܁dn\u001c!c(p%(Qi/k\u0016ä\u0003/:ĈEGR ss\u001e!5\u0014\u0015y=>ÿ2m\u0010ξ\t.f\u0019Xq%&0\tvrQ\u0019ܐ\u0004\u007fi¿\u0013Ii\u0004\u0019\f\u000fX\u0001\u0013q<|I٫\t%&ݒ\u0019q(.C]\u00146+\"\u0010\u0014]\u0018˸aowЃ\u0012d\u0015X\u0003\bT;q\u001b\bb\u007fcщ?>Qʲ\u0017@(Wz7\u0013Yx\u0015 D\u001f3;OȈEjxމPO\u0011d\f\u0013W;\u001brn[h\u0016̭\u0002:6ɾBuI4\"\u0001\u00144\u001fMkg\u001cnљ`\u0011R\u05fa\"\r\u0002h|JlL.^ob79Ӓw\u001e>\u05cdSd\u000bu\u0017^\u0005;J\u001e#C\u0003~ѕ\u0014\u0001\bʋw\u0011\u001dmP\u001d\fe\u001c[\u0011\\\u0005KϖdKhԠB\u0003\u0005KA@ז9n"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i%|\u0012=QA\"gH(%wL5\u0014_4\\L", "", "BdgA", "", "AsP?g", "", "3mS", ">`X;g", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0013wD\n&l", "EhSA[", "BdgA70K", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0007\u007fM\u0001\u0015&Ky\u0017\u001fv5B]\f/;kk", "/kX4a4>\\(", "\u001a`]1e6BRb\u000ezq;Fo+y\n8\u000b~\\\u001e\u001bIx\u0016<\u007f4\u000b", ";`g\u0019\\5>a", "3k[6c:Bh\u0019", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0018\u000bD\b%U6|\u001eEt!DYY/\r", "3k[6c:Bh\u0019}lb+\f\f", ":h]2F7:Q\u001d\b|F<\u0004\u00183p\u0007,{M", "", ":h]2F7:Q\u001d\b|>?\f\u0016+", "8tbA\\-BQ\u0015\u000e~h5d\u0013.e", "7mR9h+>>\u0015}yb5~", "", "CrT\u0013T3EP\u0015|\u0001E0\u0006\t\u001dp{&\u007fI\u0003", "0qT.^\u001aM`\u0015\u000ez`@", ":h]259>O\u001fl\nr3|", ":h]259>O\u001fp\u0005k+j\u0018Cl\u007f", "6x_5X5:b\u001d\t\u0004?9|\u0015?e\t&\u0010", ":dUA<5=S\"\u000e\t", "", "@hV5g\u0010GR\u0019\b\nl", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dSq#r.4f\b$67%.`R\u0005Z41$S]=\u0010r\u00022]#PK[6`Q<L\u0014%iW=+ \u00148E1nBF#\u00125,\u0002Ku\u0005\u001a%\u00123@W>_\u000fT\u0004\u0019t\u000b8hYh)`CUOr9#gf!^CB$\u001d\u0001n~OL7\t\t]\u0015q\u001c\tgzVbi87M]jJL}\u0014+\u00027(Iw\u0007\u0012\u000egJ\u000fU\u000eg)\u001f\u001aHh/]{4B<\u0006", "5dc\u000e_0@\\!~\u0004m", "u(;.a+K]\u001d}Dm,\u0010\u0018xL{<\u0006P\u0010UrNs\u0010E~%>hS", "5dc\u000fe,:Y\u0007\u000e\bZ;|\u000bC", "u(8", "5dc\u0012_3B^'\u0003\u0010^", "u(;.a+K]\u001d}Dm,\u0010\u0018xT\u007f;\u000b0\u0010\u001b\u001eU.|I\u0007.3U\r \u0013|k", "5dc\u0012_3B^'\u0003\u0010^+n\r.t\u0003", "5dc\u0012a+", "5dc\u0015l7AS\"z\nb6\u0006i<e\f8{I~+", "5dc\u0016a*Ec\u0018~eZ+{\r8g", "u(I", "5dc\u0017h:MW\u001a\u0003xZ;\u0001\u00138M\n'{", "5dc\u0019X-M7\"}zg;\u000b", "u(J\u0016", "5dc\u0019\\5>0&~vd\u001a\f\u001d6e", "5dc\u0019\\5>0&~vd\u001e\u0007\u0016.S\u000f<\u0003@", "5dc\u0019\\5>A$zxb5~hBt\r$", "u(5", "5dc\u0019\\5>A$zxb5~p?l\u000f,\u0007G\u0005\u0017$", "5dc\u001aT?%W\"~\t", "5dc\u001dT0Gb", "u(;.a+K]\u001d}Dm,\u0010\u0018xT\u007f;\u000b+|\u001b VE", "5dc\u001f\\.Ab|\by^5\f\u0017", "5dc g(Kb", "5dc!X?M", "u(;7T=:\u001d z\u0004`uZ\f+rm(\bP\u0001 \u0015GE", "5dc!X?M2\u001d\f", "u(;.a+K]\u001d}Dm,\u0010\u0018xT\u007f;\u000b\u001f\u0005$\u0017E~\u0012F\u007f\b5i\u000b$E|\u001a,#", "5dc\"f,\u001fO \u0006wZ*\u0003o3n\u007f\u0016\u0007<~\u001b I", "5dc$\\+MV", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class StaticLayoutParams {
    private final Layout.Alignment alignment;
    private final int breakStrategy;
    private final TextUtils.TruncateAt ellipsize;
    private final int ellipsizedWidth;
    private final int end;
    private final int hyphenationFrequency;
    private final boolean includePadding;
    private final int justificationMode;
    private final int[] leftIndents;
    private final int lineBreakStyle;
    private final int lineBreakWordStyle;
    private final float lineSpacingExtra;
    private final float lineSpacingMultiplier;
    private final int maxLines;
    private final TextPaint paint;
    private final int[] rightIndents;
    private final int start;
    private final CharSequence text;
    private final TextDirectionHeuristic textDir;
    private final boolean useFallbackLineSpacing;
    private final int width;

    public StaticLayoutParams(CharSequence charSequence, int i2, int i3, TextPaint textPaint, int i4, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i5, TextUtils.TruncateAt truncateAt, int i6, float f2, float f3, int i7, boolean z2, boolean z3, int i8, int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        this.text = charSequence;
        this.start = i2;
        this.end = i3;
        this.paint = textPaint;
        this.width = i4;
        this.textDir = textDirectionHeuristic;
        this.alignment = alignment;
        this.maxLines = i5;
        this.ellipsize = truncateAt;
        this.ellipsizedWidth = i6;
        this.lineSpacingMultiplier = f2;
        this.lineSpacingExtra = f3;
        this.justificationMode = i7;
        this.includePadding = z2;
        this.useFallbackLineSpacing = z3;
        this.breakStrategy = i8;
        this.lineBreakStyle = i9;
        this.lineBreakWordStyle = i10;
        this.hyphenationFrequency = i11;
        this.leftIndents = iArr;
        this.rightIndents = iArr2;
        if (i2 < 0 || i2 > i3) {
            throw new IllegalArgumentException("invalid start value".toString());
        }
        int length = charSequence.length();
        if (i3 < 0 || i3 > length) {
            throw new IllegalArgumentException("invalid end value".toString());
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("invalid maxLines value".toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("invalid width value".toString());
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value".toString());
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value".toString());
        }
    }

    public /* synthetic */ StaticLayoutParams(CharSequence charSequence, int i2, int i3, TextPaint textPaint, int i4, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i5, TextUtils.TruncateAt truncateAt, int i6, float f2, float f3, int i7, boolean z2, boolean z3, int i8, int i9, int i10, int i11, int[] iArr, int[] iArr2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, (i12 + 2) - (i12 | 2) != 0 ? 0 : i2, i3, textPaint, i4, textDirectionHeuristic, alignment, i5, truncateAt, i6, f2, f3, i7, z2, z3, i8, i9, i10, i11, iArr, iArr2);
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final int getStart() {
        return this.start;
    }

    public final int getEnd() {
        return this.end;
    }

    public final TextPaint getPaint() {
        return this.paint;
    }

    public final int getWidth() {
        return this.width;
    }

    public final TextDirectionHeuristic getTextDir() {
        return this.textDir;
    }

    public final Layout.Alignment getAlignment() {
        return this.alignment;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    public final int getEllipsizedWidth() {
        return this.ellipsizedWidth;
    }

    public final float getLineSpacingMultiplier() {
        return this.lineSpacingMultiplier;
    }

    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    public final int getJustificationMode() {
        return this.justificationMode;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final boolean getUseFallbackLineSpacing() {
        return this.useFallbackLineSpacing;
    }

    public final int getBreakStrategy() {
        return this.breakStrategy;
    }

    public final int getLineBreakStyle() {
        return this.lineBreakStyle;
    }

    public final int getLineBreakWordStyle() {
        return this.lineBreakWordStyle;
    }

    public final int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    public final int[] getLeftIndents() {
        return this.leftIndents;
    }

    public final int[] getRightIndents() {
        return this.rightIndents;
    }
}
