package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
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
/* JADX INFO: compiled from: EditingBuffer.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\u0015\"4ߚ\u007f\u0007|jA0JhP.`Y2\u000fq\u0004<$q$yCA_\"}0\tWNmmvJh\u0015K\u000f\f\u0017\u0001j:R]xc\u001c\u00157Xģ]n}ok8\u0019sqE580H}\u0013\u00012*v\u0011\u0007~QM$\u0012^C¤>R\u001bQE-\"\nL \u0019\u001e\u000bl^:Vnu:]&ɨmB\\-(;\u000bo%F\u0003JSǸҐ\"+F[} 3x\u001b\u0007\u0001~\u0006šӭu=\u000b\u000foB9p\fWd{0\u0018#Sg\r\f}V`\u0013zx\fU6\u0016ҪׂT\u000e.\"C\u0010\u001bg\u001c\u000e4Sx2;G~\b<>;ɂSĖT\u0002dpH\u0006oe/%.cqݍӸjQglaqE.\u001d\rLF1r/\u0004l\u000e\u000f KX\u0006zIQnHxR\u0018YUm2u)̣ò\b0M3w\u001f\u001f`/%e~i'/\u0014\u001aHrr'\tn\u0012ki\u0001Sp&|\u0016O*7\r!ե\u0081\tkV\b!G\u001f\u00024T5!8\u0017.\u0005\u0010<O0@R]\u0012\u0002j{hPɘçj7_$4)eov3ct\u0014\u0014oz\u000f\u0014mG\u0013\tf\u0010ZS:e#̥ϒ6HpG@\u0007R\u0007$\u0013`D8ʉٜ01\u001f\u0016]N\u0011XZA+\n&n9*\r[K&\u0019hRw??'ʕrيfծΛ+{˃&1YS;!4^r\u0005B\t;\u0007-~0KuV_L\u001b!4\u0016R\u008e\"׀=W7ˋ+\u0011\u00056@\u0010}aZ\u0002}Q{\u001dW~\u000b\u0004';\u00179&HAѲ8߯nPWܷ/$|n\u00011X\u0007\u000e\u000byF)R\u0014X\u0019lVI!\u000e\u0010z\rvSÿ+Ǫ)\u000b\b$\u0003G;QG\u001f\u001c\u000b\"Cemk~\b.(xeձvФ\b,kܞ@t_tJ;fT\u0010=\u0015Ю&к\u0007F`l} P\u0017\u0005%AJYd\u001fYn\faɁ\u007f\u05fe\u0006ԭ߱oUݍ>\u0017\b\u007f:GmDDe\f0vCS\u001c}Wu\t\u0006K\u000b\u0016\tO`Λ\bϥr\u001e$ܻ8X]\u007f\u0017>&u\u001eTOO3'J(<4ZG8\u000fQo\u0002\u0006>\u0006>\u00076ʖ#ЋF\u007fCٙ&V~|dV%bK\u0002/>܃~\u0018;!~\u0097M3lNT5\u0003ҋ\u0005\u0010"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|\u001a7O Kl5\u001e\">", "", "BdgA", "", "Ad[2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}`'\u0007!&Ns\u0017\u0006{6=#\u0002)Fm#7IJ\u0005J4\u001f\u0011xhHdm5\\\u00064WJ]6i:nJ\u001a\u0012gc\u0012\u001c", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0003{nkH\u000eg5\u0018{8O\u0016R5kR\u007fF\u0010\u0019$lN,\t\u0015`P\u0002xME.\u0015<G\u0011Euh\b#\u00145wF\u0006G", "1n\\=b:Bb\u001d\t\u0004", "5dc\u0010b4I]'\u0003\nb6\u0006P\u0017z\u000e;\u007f-\\U'Ki\u001d<\n4/f}'7i$.", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhj\u001c@o\u0016\u0004", "\nrTA \u0006\u0017", "", "1n\\=b:Bb\u001d\t\u0004>5{", "5dc\u0010b4I]'\u0003\nb6\u0006h8d>8\u007f:\u0010\u0017*Vi\u001b<}%1g}", "u(8", "1n\\=b:Bb\u001d\t\u0004L;x\u0016>", "5dc\u0010b4I]'\u0003\nb6\u0006v>a\r7:P\u0005\u0011&G\u0003\u001d6\u0004%<Yy.7", "1ta@b9", "5dc\u0010h9L]&=\u000bb&\f\tBty5{G\u0001\u0013%G", "Adc\u0010h9L]&=\u000bb&\f\tBty5{G\u0001\u0013%G", "uH\u0018#", "5`_\u000fh-?S&", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#h\u001cD|\u001a*T%7v\u0011.\u0016iaF\\", ":d]4g/", "5dc\u0019X5@b\u001c=\u000bb&\f\tBty5{G\u0001\u0013%G", "5dc X3>Q(\u0003\u0005gs{\\\u00191\b\b[~\u0011\u001b\u0011Vo!Kp25`}\u001cEm", "u(9", "D`[BX", "Ad[2V;B]\"^\u0004]", "5dc X3>Q(\u0003\u0005g\f\u0006\bmu\u0004\"\u000b@\u0014&\u0011To\u0015<r35", "Adc X3>Q(\u0003\u0005g\f\u0006\b", "Ad[2V;B]\"l\nZ9\f", "5dc X3>Q(\u0003\u0005g\u001a\f\u0005<t>8\u007f:\u0010\u0017*Vi\u001b<}%1g}", "Adc X3>Q(\u0003\u0005g\u001a\f\u0005<t", "1`]0X3\u001c]!\n\u0005l0\f\r9n", "", "1`]0X3\u001c]!\n\u0005l0\f\r9n>8\u007f:\u0010\u0017*Vi\u001b<}%1g}", "1n\\:\\;\u001c]!\n\u0005l0\f\r9n", "1n\\:\\;\u001c]!\n\u0005l0\f\r9n>8\u007f:\u0010\u0017*Vi\u001b<}%1g}", "2d[2g,", "AsP?g", "3mS", "2d[2g,|c\u001dx\n^?\f\u0003<e\u0007(wN\u0001", "5dc", "", "7mS2k", "5dcph08b\u0019\u0012\nX9|\u0010/a\u000e(", "6`b\u0010b4I]'\u0003\nb6\u0006", "", "6`b\u0010b4I]'\u0003\nb6\u0006G?iy7{S\u0010\u0011$Gv\u000e8\u0005%", "@d_9T*>", "@d_9T*>\u0012)\u0003tm,\u0010\u0018)r\u007f/{<\u000f\u0017", "Adc\u0010b4I]'\u0003\nb6\u0006", "Adc\u0010b4I]'\u0003\nb6\u0006G?iy7{S\u0010\u0011$Gv\u000e8\u0005%", "Adc X3>Q(\u0003\u0005g", "Adc X3>Q(\u0003\u0005gj\r\r)t\u007f;\u000b:\u000e\u0017\u001eGk\u001c<", "Bn0;a6MO(~yL;\n\r8g", "Bn0;a6MO(~yL;\n\r8g>8\u007f:\u0010\u0017*Vi\u001b<}%1g}", "BnBAe0GU", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;
    private final PartialGapBuffer gapBuffer;
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
        this.selectionStart = TextRange.m6121getMinimpl(j2);
        this.selectionEnd = TextRange.m6120getMaximpl(j2);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int iM6121getMinimpl = TextRange.m6121getMinimpl(j2);
        int iM6120getMaximpl = TextRange.m6120getMaximpl(j2);
        if (iM6121getMinimpl < 0 || iM6121getMinimpl > annotatedString.length()) {
            throw new IndexOutOfBoundsException("start (" + iM6121getMinimpl + ") offset is outside of text region " + annotatedString.length());
        }
        if (iM6120getMaximpl < 0 || iM6120getMaximpl > annotatedString.length()) {
            throw new IndexOutOfBoundsException("end (" + iM6120getMaximpl + ") offset is outside of text region " + annotatedString.length());
        }
        if (iM6121getMinimpl > iM6120getMaximpl) {
            throw new IllegalArgumentException("Do not set reversed range: " + iM6121getMinimpl + " > " + iM6120getMaximpl);
        }
    }

    /* JADX INFO: compiled from: EditingBuffer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0005ӭ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٦lԥ&\tWȞ˝kq"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|\u001a7O Kl5\u001e\"'?C\u000fn(Wz1P\"", "", "u(E", "\u001cNF\u00158\u0019\u001e", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final int getSelectionStart$ui_text_release() {
        return this.selectionStart;
    }

    private final void setSelectionStart(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i2).toString());
        }
        this.selectionStart = i2;
    }

    public final int getSelectionEnd$ui_text_release() {
        return this.selectionEnd;
    }

    private final void setSelectionEnd(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i2).toString());
        }
        this.selectionEnd = i2;
    }

    public final int getCompositionStart$ui_text_release() {
        return this.compositionStart;
    }

    public final int getCompositionEnd$ui_text_release() {
        return this.compositionEnd;
    }

    public final boolean hasComposition$ui_text_release() {
        return this.compositionStart != -1;
    }

    /* JADX INFO: renamed from: getComposition-MzsxiRA$ui_text_release, reason: not valid java name */
    public final TextRange m6282getCompositionMzsxiRA$ui_text_release() {
        if (hasComposition$ui_text_release()) {
            return TextRange.m6111boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE$ui_text_release, reason: not valid java name */
    public final long m6283getSelectiond9O1mEE$ui_text_release() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getCursor$ui_text_release() {
        int i2 = this.selectionStart;
        int i3 = this.selectionEnd;
        if (i2 == i3) {
            return i3;
        }
        return -1;
    }

    public final void setCursor$ui_text_release(int i2) {
        setSelection$ui_text_release(i2, i2);
    }

    public final char get$ui_text_release(int i2) {
        return this.gapBuffer.get(i2);
    }

    public final int getLength$ui_text_release() {
        return this.gapBuffer.getLength();
    }

    private EditingBuffer(String str, long j2) {
        this(new AnnotatedString(str, null, null, 6, null), j2, (DefaultConstructorMarker) null);
    }

    public final void replace$ui_text_release(int i2, int i3, AnnotatedString annotatedString) {
        replace$ui_text_release(i2, i3, annotatedString.getText());
    }

    public final void replace$ui_text_release(int i2, int i3, String str) {
        if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i3 < 0 || i3 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i3 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException("Do not set reversed range: " + i2 + " > " + i3);
        }
        this.gapBuffer.replace(i2, i3, str);
        setSelectionStart(str.length() + i2);
        setSelectionEnd(i2 + str.length());
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text_release(int i2, int i3) {
        long jTextRange = TextRangeKt.TextRange(i2, i3);
        this.gapBuffer.replace(i2, i3, "");
        long jM6284updateRangeAfterDeletepWDy79M = EditingBufferKt.m6284updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), jTextRange);
        setSelectionStart(TextRange.m6121getMinimpl(jM6284updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m6120getMaximpl(jM6284updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text_release()) {
            long jM6284updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m6284updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), jTextRange);
            if (TextRange.m6117getCollapsedimpl(jM6284updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text_release();
            } else {
                this.compositionStart = TextRange.m6121getMinimpl(jM6284updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m6120getMaximpl(jM6284updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final void setSelection$ui_text_release(int i2, int i3) {
        if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i3 < 0 || i3 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i3 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException("Do not set reversed range: " + i2 + " > " + i3);
        }
        setSelectionStart(i2);
        setSelectionEnd(i3);
    }

    public final void setComposition$ui_text_release(int i2, int i3) {
        if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i3 < 0 || i3 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i3 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i2 >= i3) {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i2 + " > " + i3);
        }
        this.compositionStart = i2;
        this.compositionEnd = i3;
    }

    public final void cancelComposition$ui_text_release() {
        replace$ui_text_release(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public String toString() {
        return this.gapBuffer.toString();
    }

    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(toString(), null, null, 6, null);
    }
}
