package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: EditingBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000fq\u007f<$i*yCA]\"}8\tWȞog\u0005Jb\u000bY\u000f\u000e\u0016~x4Icxe\u0012\u00156JoM=UoC9htD\u000e(݅*8\b\u0010\t\u001a0O\u0016͌\u0011ŏiNB0norQO\u000e\u001a &\u0016B.\u00016\\\u0016OFLz_R/Q\u0006ݦFN5cp\u0010]\u0011TT?\r%f./N9M\u0015SVΫ\u000bRiEKU\u007fj\u001dhUU[M\u0002\u0007NX.#E/]=urTkKQ)\u00105\\gcy~V,\u0006-\u0014\rj2V\u001a5{F-H\u00158\u0012A$\u000bSn_2bP0\u0013ad&m\u000fA_Q\u001b\u0015\u0007\u0012?'\u0005O{3\u001cdŇ\u00017%i\f&`CS\u001d\u0014_ji@kv~\u000egl\u0006\u0004\u001fq2.\u0012`_\u007f]\u000bA2%%O[g]i\u007f\u0010\u0004\\g%3\u0011la\u0019jHn1\u001f\u001aEZ!\f\tS-+yplXZ?} bC\u0016\bA=\r{JP=\u0010|^\u0019mx}u\nS>т6ժˇo\u0010]vlq}eqOyR%Bo@p4pfpb<^jX:2vyX{\n\u0005f\fA7\bw*uD1G][\\S-PH\u0015\t\u000ebӳ\u0014\u0005\\՜<\u0005o-\u0003\u0013Qgj{\bi\u000fHZ\u007f\u0017fЃ@ٛۺ\u0018%Ɓ&lL~)\u0013\r\u0001Pcu\\_L\u001b%&Y\n..\u001ag`m}iÈ\u000bȞ6\b5զdtkb[$w\u0017\u000b\r';\u0017=\u0018\fx~D`\u0019Y\u000e\u0015mǸ\u0003݈v)\u0010ۭ\u0018{gZ\tY4v\u0019pVI!\u0012\n@\\M\u0015\u0005M-[E.fSލ9ϡ+'.y\u001aE#s}kuE\bz_2\u0003~\u001c,\u00120F̨SЄ6;@Ծ*%L=<z\u0013DXj&%R\u000bD\raKWc\u001fr\u000fԎ\u0017ɣ\u0002r\u000fԭ%r\\yH2\u0010\u007f:NmKDR\f6vCS \u0004\u0018ܭqqc^\u0011m\u001d\u001c[\u0011?p*\u001ck#\r\u001cƻ\bݵԨr\u0017ݠE?z\u0007B-2Y|^\u00162[T\u0018\u0015@~\u000elw\u000fEA\u00014\u0012٠\u001a֭|h^ޠ\u001dbK\t/<!\u0001\u0015\\,\u0011\u0006S\u0013\u0018^T]rb\u0005aC!\u001b\u0019^='{ńPȗ='0߰\u0019\rK\tQ[\"8\ns7\u0006£o\u0015@\u001b\u0003ܪ^F\u001aAQ\u0017~ۤ4\""}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PC+R\u0006+PN+<]SrJi", "", "BdgA", "", "Ad[2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}`'\u0007!&Ns\u0017\u0006{6=#\u0002)Fm#7IJ\u0005J4\u001f\u0011xhHdm5\\\u00064WJ]6i:nJ\u001a\u0012gc\u0012\u001c", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0003{nkH\u000eg5\u0018{8O\u0016R5kR\u007fF\u0010\u0019$lN,\t\u0015`P\u0002xME.\u0015<G\u0011Euh\b#\u00145wF\u0006G", "1gP;Z,-`\u0015|\u0001^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PA/J\u007f)G;[(ZXrJi", "5dc\u0010[(GU\u0019m\bZ*\u0003\t<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju,y#PNN\u001biNpC\u0014\u001f0", "1n\\=b:Bb\u001d\t\u0004", "5dc\u0010b4I]'\u0003\nb6\u0006P\u0017z\u000e;\u007f-\\", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhj\u001c@o\u0016\u0004", "\nrTA \u0006\u0017", "", "1n\\=b:Bb\u001d\t\u0004>5{", "5dc\u0010b4I]'\u0003\nb6\u0006h8d", "u(8", "1n\\=b:Bb\u001d\t\u0004L;x\u0016>", "5dc\u0010b4I]'\u0003\nb6\u0006v>a\r7", "1ta@b9", "5dc\u0010h9L]&", "Adc\u0010h9L]&", "uH\u0018#", "5`_\u000fh-?S&", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PN([\u0006+CS0(g/\u0003>\u0015\u0012gc", "6hV5_0@V(", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-wlc<\u000eg.Q\u0006\u0016[WN\u0002", "5dc\u0015\\.AZ\u001d\u0001}m", "u(;8b;EW\"HeZ0\n^", "Adc\u0015\\.AZ\u001d\u0001}m", "uKZ<g3B\\bivb9RL ", ":d]4g/", "5dc\u0019X5@b\u001c", "5dc X3>Q(\u0003\u0005gs{\\\u00191\b\b[", "u(9", "D`[BX", "Ad[2V;B]\"^\u0004]", "5dc X3>Q(\u0003\u0005g\f\u0006\b", "Adc X3>Q(\u0003\u0005g\f\u0006\b", "Ad[2V;B]\"l\nZ9\f", "5dc X3>Q(\u0003\u0005g\u001a\f\u0005<t", "Adc X3>Q(\u0003\u0005g\u001a\f\u0005<t", "1gT0^\u0019:\\\u001b~", "", "AsP?g", "3mS", "1kT.e\u000fBU\u001c\u0006~`/\f", "1n\\:\\;\u001c]!\n\u0005l0\f\r9n", "2d[2g,", "5dc", "", "7mS2k", "6`b\u0010b4I]'\u0003\nb6\u0006", "", "@d_9T*>", "", "Adc\u0010b4I]'\u0003\nb6\u0006", "Bx_2", "Adc\u0015\\.AZ\u001d\u0001}msbZ02\u0014<\n", "uH8\u0016\u001c\u001d", "Adc X3>Q(\u0003\u0005g", "Bn0;a6MO(~yL;\n\r8g", "BnBAe0GU", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private final ChangeTracker changeTracker;
    private int compositionEnd;
    private int compositionStart;
    private final PartialGapBuffer gapBuffer;
    private Pair<TextHighlightType, TextRange> highlight;
    private int selectionEnd;
    private int selectionStart;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j2);
    }

    public /* synthetic */ EditingBuffer(String str, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2);
    }

    private EditingBuffer(AnnotatedString annotatedString, long j2) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.changeTracker = new ChangeTracker(null, 1, null);
        this.selectionStart = TextRange.m6123getStartimpl(j2);
        this.selectionEnd = TextRange.m6118getEndimpl(j2);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        checkRange(TextRange.m6123getStartimpl(j2), TextRange.m6118getEndimpl(j2));
    }

    /* JADX INFO: compiled from: EditingBuffer.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0005ӭ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PC+R\u0006+PN+<]SrJRod\u0016Y'\u0016\tcJy", "", "u(E", "\u001cNF\u00158\u0019\u001e", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final ChangeTracker getChangeTracker() {
        return this.changeTracker;
    }

    public final int getSelectionStart() {
        return this.selectionStart;
    }

    private final void setSelectionStart(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i2).toString());
        }
        this.selectionStart = i2;
        this.highlight = null;
    }

    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    private final void setSelectionEnd(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i2).toString());
        }
        this.selectionEnd = i2;
        this.highlight = null;
    }

    public final Pair<TextHighlightType, TextRange> getHighlight() {
        return this.highlight;
    }

    public final void setHighlight(Pair<TextHighlightType, TextRange> pair) {
        this.highlight = pair;
    }

    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    public final boolean hasComposition() {
        return this.compositionStart != -1;
    }

    /* JADX INFO: renamed from: getComposition-MzsxiRA */
    public final TextRange m1479getCompositionMzsxiRA() {
        if (hasComposition()) {
            return TextRange.m6111boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE */
    public final long m1480getSelectiond9O1mEE() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getCursor() {
        int i2 = this.selectionStart;
        int i3 = this.selectionEnd;
        if (i2 == i3) {
            return i3;
        }
        return -1;
    }

    public final void setCursor(int i2) {
        setSelection(i2, i2);
    }

    public final char get(int i2) {
        return this.gapBuffer.charAt(i2);
    }

    public final int getLength() {
        return this.gapBuffer.length();
    }

    private EditingBuffer(String str, long j2) {
        this(new AnnotatedString(str, null, null, 6, null), j2, (DefaultConstructorMarker) null);
    }

    public final void replace(int i2, int i3, CharSequence charSequence) {
        checkRange(i2, i3);
        int iMin = Math.min(i2, i3);
        int iMax = Math.max(i2, i3);
        int i4 = 0;
        int i5 = iMin;
        while (i5 < iMax && i4 < charSequence.length() && charSequence.charAt(i4) == this.gapBuffer.charAt(i5)) {
            i4++;
            i5++;
        }
        int length = charSequence.length();
        int i6 = iMax;
        while (i6 > iMin && length > i4 && charSequence.charAt(length - 1) == this.gapBuffer.charAt(i6 - 1)) {
            length--;
            i6--;
        }
        this.changeTracker.trackChange(i5, i6, length - i4);
        PartialGapBuffer.replace$default(this.gapBuffer, iMin, iMax, charSequence, 0, 0, 24, null);
        setSelectionStart(charSequence.length() + iMin);
        setSelectionEnd(iMin + charSequence.length());
        this.compositionStart = -1;
        this.compositionEnd = -1;
        this.highlight = null;
    }

    public final void delete(int i2, int i3) {
        checkRange(i2, i3);
        long jTextRange = TextRangeKt.TextRange(i2, i3);
        this.changeTracker.trackChange(i2, i3, 0);
        PartialGapBuffer.replace$default(this.gapBuffer, TextRange.m6121getMinimpl(jTextRange), TextRange.m6120getMaximpl(jTextRange), "", 0, 0, 24, null);
        long jM1482updateRangeAfterDeletepWDy79M = EditingBufferKt.m1482updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), jTextRange);
        setSelectionStart(TextRange.m6123getStartimpl(jM1482updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m6118getEndimpl(jM1482updateRangeAfterDeletepWDy79M));
        if (hasComposition()) {
            long jM1482updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m1482updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), jTextRange);
            if (TextRange.m6117getCollapsedimpl(jM1482updateRangeAfterDeletepWDy79M2)) {
                commitComposition();
            } else {
                this.compositionStart = TextRange.m6121getMinimpl(jM1482updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m6120getMaximpl(jM1482updateRangeAfterDeletepWDy79M2);
            }
        }
        this.highlight = null;
    }

    public final void setSelection(int i2, int i3) {
        int iCoerceIn = RangesKt.coerceIn(i2, 0, getLength());
        int iCoerceIn2 = RangesKt.coerceIn(i3, 0, getLength());
        setSelectionStart(iCoerceIn);
        setSelectionEnd(iCoerceIn2);
    }

    /* JADX INFO: renamed from: setHighlight-K7f2yys */
    public final void m1481setHighlightK7f2yys(int i2, int i3, int i4) {
        if (i3 >= i4) {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i3 + " > " + i4);
        }
        this.highlight = new Pair<>(TextHighlightType.m1451boximpl(i2), TextRange.m6111boximpl(TextRangeKt.TextRange(RangesKt.coerceIn(i3, 0, getLength()), RangesKt.coerceIn(i4, 0, getLength()))));
    }

    public final void clearHighlight() {
        this.highlight = null;
    }

    public final void setComposition(int i2, int i3) {
        if (i2 < 0 || i2 > this.gapBuffer.length()) {
            throw new IndexOutOfBoundsException("start (" + i2 + ") offset is outside of text region " + this.gapBuffer.length());
        }
        if (i3 < 0 || i3 > this.gapBuffer.length()) {
            throw new IndexOutOfBoundsException("end (" + i3 + ") offset is outside of text region " + this.gapBuffer.length());
        }
        if (i2 >= i3) {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i2 + " > " + i3);
        }
        this.compositionStart = i2;
        this.compositionEnd = i3;
    }

    public final void commitComposition() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public String toString() {
        return this.gapBuffer.toString();
    }

    public final AnnotatedString toAnnotatedString() {
        return new AnnotatedString(toString(), null, null, 6, null);
    }

    private final void checkRange(int i2, int i3) {
        if (i2 < 0 || i2 > this.gapBuffer.length()) {
            throw new IndexOutOfBoundsException("start (" + i2 + ") offset is outside of text region " + this.gapBuffer.length());
        }
        if (i3 < 0 || i3 > this.gapBuffer.length()) {
            throw new IndexOutOfBoundsException("end (" + i3 + ") offset is outside of text region " + this.gapBuffer.length());
        }
    }
}
