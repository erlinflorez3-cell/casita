package androidx.compose.ui.text.android.selection;

import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: compiled from: WordIterator.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004O\u00118é6B\r(4\u0012}\u0007njO0LeN.ZS@\u000fsڔ<$i$yCAV\"}0\u0012WNmstϺpŏa+6\u0016'idHq9\u0003\"\u0013@B\b?aN\u007fAGb\r63#B&F}\u001d\u0001H-X\u0016\u0005\u007f[M\"\u0011^F¤>R\u001bTM( \u0010V /)\rk\\B`l\f=u#K\u007fP[?_^\u007f}\u0011T`?\r%dN/NEM\u0015SbI\u0007\u001bqM\u0013Wqk\b\u0019+57as\u00069\t\u0004\"&CO;l9&%\u0011_q$'YR\u0014O^\u001a@w)~UH\u0012\u001c\u001e'v1]\u001et\u0014&3#u\u001cL^\u0014vB.}\u0012:%1\u00183Y<cr_tS\u0019|:,\t\u001b*;\u0001\u001d$$b\u001ct-\u001b\u0003\u0007\u00025_LUH|\r =6\u0010~w\u001a*2?w\u0004=\b).E(\u007fiG99k0Wtk\u0005\u0011xh\u0002l\u0019H\t.|-O*7\u001b\u000bHr\u0011\u0004P\u0003[t\u001f[4l\u0007,\u0017C$j\u0004T!S\u0013\u0015O1wxfu\nS>\u0017;gz\u0004\u000e\u0006<%3}]q*yR%\u0017o@p\u0011pfpVTfjC:2vm@{\nPf\fA5\u0010}*4D1G]kȀ\u0005ٿFA\u0005ȁ0fv\u0014\u0017Ta'Yǰ&ڲ\r\u0001XʔA{u\u0001a,+ix\u038dCپ9\u0019.ŞrtB~;\u0007-vVûi֙KLtֵ\u0097Y\u0019"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|iEm\u001d.KR?u=g\u0007rn8jr,[r6QY$", "", "1gP?F,Jc\u0019\bx^", "", "AsP?g", "", "3mS", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dSq#{!FUG0Fq\u001dw4M9g;\u001ej,R", "7sT?T;H`", "\u001aiPCTuMS,\u000eD;9|\u00055I\u000f(\t<\u0010!$\u001d", "1gT0^\u0016?T'~\nB:m\u00056i~", "", "=eU@X;", "5dc\u000fX.B\\\"\u0003\u0004`", "5dc\u001de,OE#\fy;,~\r8n\u00041}*\n\u0006)Qa\u0018Iu3\u0012c\u000e)6i#B", "", "5dc\u0012a+", "5dc\u001bX?ME#\fy>5{r8T\u00122mJ\u000e\u0016sQ\u007f\u0017;r2I", "5dc\u001dh5<b)z\nb6\u0006e/g\u00041\u0005D\n\u0019", "5dc\u001dh5<b)z\nb6\u0006h8d", "7r03g,K:\u0019\u000e\n^9f\u0016\u000ei\u0002,\u000b", "7r03g,K>)\bxm<x\u00183o\t", "7r>;?,Mb\u0019\fdk\u000b\u0001\u000b3t", "7r>;C<GQ(\u000fvm0\u0007\u0012", "7r?Ba*Mc\u0015\u000e~h5\\\u0012.B\n8\u0005?|$+", "7r?Ba*Mc\u0015\u000e~h5j\u0018+r\u000f\u0005\u0006P\n\u0016\u0013T\u0004", "<dgA56N\\\u0018z\br", ">qTC56N\\\u0018z\br", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WordIterator {
    private static final int WINDOW_WIDTH = 50;
    private final CharSequence charSequence;
    private final int end;
    private final BreakIterator iterator;
    private final int start;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public WordIterator(CharSequence charSequence, int i2, int i3, Locale locale) {
        this.charSequence = charSequence;
        if (i2 < 0 || i2 > charSequence.length()) {
            throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
        }
        if (i3 < 0 || i3 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.iterator = wordInstance;
        this.start = Math.max(0, i2 - 50);
        this.end = Math.min(charSequence.length(), i3 + 50);
        wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i2, i3));
    }

    public final int nextBoundary(int i2) {
        checkOffsetIsValid(i2);
        return this.iterator.following(i2);
    }

    public final int prevBoundary(int i2) {
        checkOffsetIsValid(i2);
        return this.iterator.preceding(i2);
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int i2) {
        return getBeginning(i2, true);
    }

    public final int getNextWordEndOnTwoWordBoundary(int i2) {
        return getEnd(i2, true);
    }

    public final int getPunctuationBeginning(int i2) {
        checkOffsetIsValid(i2);
        while (i2 != -1 && !isPunctuationStartBoundary(i2)) {
            i2 = prevBoundary(i2);
        }
        return i2;
    }

    public final int getPunctuationEnd(int i2) {
        checkOffsetIsValid(i2);
        while (i2 != -1 && !isPunctuationEndBoundary(i2)) {
            i2 = nextBoundary(i2);
        }
        return i2;
    }

    public final boolean isAfterPunctuation(int i2) {
        int i3 = this.start + 1;
        if (i2 > this.end || i3 > i2) {
            return false;
        }
        return Companion.isPunctuation$ui_text_release(Character.codePointBefore(this.charSequence, i2));
    }

    public final boolean isOnPunctuation(int i2) {
        int i3 = this.start;
        if (i2 >= this.end || i3 > i2) {
            return false;
        }
        return Companion.isPunctuation$ui_text_release(Character.codePointAt(this.charSequence, i2));
    }

    private final int getBeginning(int i2, boolean z2) {
        checkOffsetIsValid(i2);
        if (isOnLetterOrDigit(i2)) {
            return (!this.iterator.isBoundary(i2) || (isAfterLetterOrDigit(i2) && z2)) ? this.iterator.preceding(i2) : i2;
        }
        if (isAfterLetterOrDigit(i2)) {
            return this.iterator.preceding(i2);
        }
        return -1;
    }

    private final int getEnd(int i2, boolean z2) {
        checkOffsetIsValid(i2);
        if (isAfterLetterOrDigit(i2)) {
            return (!this.iterator.isBoundary(i2) || (isOnLetterOrDigit(i2) && z2)) ? this.iterator.following(i2) : i2;
        }
        if (isOnLetterOrDigit(i2)) {
            return this.iterator.following(i2);
        }
        return -1;
    }

    private final boolean isPunctuationStartBoundary(int i2) {
        return isOnPunctuation(i2) && !isAfterPunctuation(i2);
    }

    private final boolean isPunctuationEndBoundary(int i2) {
        return !isOnPunctuation(i2) && isAfterPunctuation(i2);
    }

    private final boolean isAfterLetterOrDigit(int i2) {
        return i2 <= this.end && this.start + 1 <= i2 && Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, i2));
    }

    private final boolean isOnLetterOrDigit(int i2) {
        return i2 < this.end && this.start <= i2 && Character.isLetterOrDigit(Character.codePointAt(this.charSequence, i2));
    }

    private final void checkOffsetIsValid(int i2) {
        int i3 = this.start;
        if (i2 > this.end || i3 > i2) {
            throw new IllegalArgumentException(("Invalid offset: " + i2 + ". Valid range is [" + this.start + " , " + this.end + AbstractJsonLexerKt.END_LIST).toString());
        }
    }

    /* JADX INFO: compiled from: WordIterator.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":\u001b\u007f\u0007lk?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004h(\u0001:\t}R\u0018k|Or\u000bq\u0011Lǝѱn,O[Ii \u0010JB\u001eA\nݼBެ=`|Ȃӵ$9"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|iEm\u001d.KR?u=g\u0007rn8jr,[r6QY\r\nfZ}9\u001d\u0016d\u0017$", "", "u(E", "%H=\u0011B\u001e8E|]iA", "", "7r?Ba*Mc\u0015\u000e~h5", "", "1o", "7r?Ba*Mc\u0015\u000e~h5;\u00193_\u000f(\u000fOz$\u0017No\nJv", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isPunctuation$ui_text_release(int i2) {
            int type = Character.getType(i2);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }
}
