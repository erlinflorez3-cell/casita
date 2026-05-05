package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tsAӄLeV3Zݷ2\u000f\u0002{<$a$yCQU\"}(\nWN}gvJ`\u000fK\u000f\u0014\"\u0001j2J]xs\u0012\u00172PoG3coEʠhtD\u000b(2(;\u0002\u0005\u0017\u001a2H\u0016\u001f\u0001ŏaÈ0~pphQELSZ?\u0016B.\u00016\\\u0016OFNz_R19\u0002\u0018E^+m4\u0015M;Kd+\u001b|y\u001eYGG9#-k\u00035[ÜC\u0003M{\u0006/v??+w֕\b<^\u007f\".CO;b#;j\u001fiq\u001c);O\u0012֟`\u00108w)\u0018;WǬ\u0012\u0006-etƩ /\u0016\u001cQ\rr\u0002_\u0001\u0006lb\u0018z\u0010U]%HP9Z3f\u007fĥk.\\Y\u0014\u0016\u001d 3\u0001\u001dďkV\u001e`C7\u0003\u0013Φ5QFZ\u0011k\u0018|Um2͏\u0013\u00178&HX\u00101\f\u0011\\Ϗ59k9Q=\u001a\u001dҩHg|\")\u007fa\u000ejHn>\u001f\"ED!\u0014jHt\u0007\u0002O\u0003hZ6\u0014ɃZO\u0002\u001698\\&˓i)\u001eugh\u0018\n\u0016a\u0018MGfex7o\u001c\u0001Q^aT\u001ag\u001e\fjvB^\u0005f\u0013\u0004~B\u0002+#`6NJH\u0019/@\u0002R{$\u0013`D8\u001c|:?Gt\u0015v\"NFO,!_\t\bV~\u001d723\u0002$#էITj\"\bg'̢t\u0001nTEA\u007fځa*cU\u00014+ȽO\u0005\u00024_gz܁\u0013l^yc18\u0016Hߙ\u001a5KI'~WɅH-\u000eR\u0001\u001diM@\u05fdA|B\u0013I!Fg6ξ92n$bO\u0003ϟhv'v1B|\u007f(ӓ\u000f~U\u001fl\u000b\nŬ\u0012v\u0011\u0016TNfوM#,b\u0019oPĜ}1Qe5\u0016&ҡw\u0019o\u001d\u0002o\\Ӡ+\u001345}\u0004Zϣ^sp\u0013u2iͯ\u0012]\r\u0001:$\u001b×\u000bLx; B7ͩU7V\u0006|p\u0005Е\u0016\u000f=C~\u0007Zݸ9di\u0001+o,P^c8\u0014[}B}\n%Yaa/\u0006my{3J=\r;\u00027n dU \u0005v)\tx\u001a\u0002aNAi\u0002-<7'd2B\b\u0019\fli4/A\u007f\u000ft\u001daJB\"Z~\u000e\u0003{\r\\N\u0005n\u000ex!X E۳Af\u000eC|\u001dmtsWc`\u0004\u0004#\u000f\u001bx\u0018\u0017fSJ\u000bǷGc:fM#E\fbq\u0002d\u0007w-{9\b\ff7C\u001d\u0013')Di\u0011\u000e\u0003ҍb\u0011]̤ff|\u001ft`\u001f.7\u0003\u0013|<A`ۊ\rĢSrwۮ}l\\\u0007OCH\u0011m״5ކ\u000bűߦE\u001aұ\nC5=W\u007f,)\u0002haM\u001e\n&35\u0018E-jW&f8^qŰ\u0018ޭ\u001ab\nƁc\\.\u001aFJ#\n`ڗ\n˩S\u0002;øclgm\u0010#V&Yo\\ןMи|\nkؙ4zc\u0013\u001bf__PҪ/ȃ!\t/Ӎ~\u001ff`R\u0011\u0002'/Ҽ\u0002ȗ\u0019&'ߎʍb2\u0018Ri\u05ce\r\u001aNc\r1N֝.1"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*w\u0012YL {D6\r\b3I\u007fJl\u000b\u0015k", "", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "7r5?b4,]\u001a\u000e`^@y\u0013+r~", "", "Dhb6U3>B\u0019\u0012\nE(\u0011\u0013?tb(\u007fB\u0004&", "", "BdgAC9>^\u0015\fz]\u001a|\u0010/c\u000f,\u0006In&\u0013Vo", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*w\u0012YL {D6\r\b3I\u007fJl\u000b\u0015\u0004\u001d1yp\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001b[r0UMX9dRq,\u0014%inR+\u0014\u0004GP }D\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\n\u0019?P){U#NyZP,^>n\u001cn\n\\HJ+#G\u000e{OL7\t\t]\u0015qeCeqO$\u0005F$\bneVNnQKx1(\u0015\u000bw%A\"x4\u007f=\u0013}.?s\u0005Xp\u0014E(\u0007\u00153\\?6*@E\\.Kv\u0005MB\u000eo\u001eL\u0015\u000em1>\u0019dScO\u000f\u0005l\u001be>On|FR[\u0002:", "7mXA\\(ED\u0015\u0006\u000b^", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006A/J\u0004\u0015GX^,ePr\u0013", "5dc\u0016a0MW\u0015\u0006kZ3\r\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ5#\u001e(wB=\u0007j+,y#T:N8lR{;\u0014g", "Ad[2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "5dc X3>Q(\u0003\u0005gs{\\\u00191\b\b[", "u(9", "Adc X3>Q(\u0003\u0005gsL\u001e--\u000f\u000fN", "uI\u0018#", "\u0018", "BdgA", "", "/o_9l\u0010?<#\u000eZf7\f\u001d", "@db2g\n:Q\u001c~yQ", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1gP?B-?a\u0019\u000e", "", "=eU@X;", "1n[9T7LS\u007f~{m\u0016\n", "=q", "1n[9T7LS\u0006\u0003|a;f\u0016", "2d[2g,\"T\u0007~\u0002^*\f\t.O\r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "2db2_,<b", "5dc\u0019\\5>3\"}Wr\u0016}\n=e\u000f", "5dc\u0019\\5>A(z\bm\t\u0011r0f\u000e(\u000b", "5dc\u001bX?M1\u001cz\bZ*\f\t<I\t'{S", "5dc\u001bX?ME#\fyH-}\u0017/t", "5dc\u001de,<S\u0018\u0003\u0004`\n\u007f\u0005<a}7{Md \u0016G\u0003", "5dc\u001de,OW#\u000f\tP6\n\b\u0019f\u00016{O", "7r;Ae", "8t\\=5@)O\u001b~\tH-}\u0017/t", ">`V2f\bF])\b\n", ";ne26<Ka#\fYh>\u0006eCL\u00041{", ";ne26<Ka#\fYh>\u0006eCP{*{", ";ne26<Ka#\fa^-\f", ";ne26<Ka#\fa^-\feCW\n5z", ";ne26<Ka#\fc^?\f", ";ne26<Ka#\fc^?\feCP{5wB\u000e\u0013\"J", ";ne26<Ka#\fc^?\feCW\n5z", ";ne26<Ka#\fek,\u000e", ";ne26<Ka#\fek,\u000eeCP{5wB\u000e\u0013\"J", ";ne26<Ka#\fek,\u000eeCW\n5z", ";ne26<Ka#\fgb.\u007f\u0018", ";ne26<Ka#\fgb.\u007f\u0018\fyq2\t?", ";ne26<Ka#\fih\f\u0006\b", ";ne26<Ka#\fih\u000f\u0007\u0011/", ";ne26<Ka#\fih\u0013\u0001\u0012/E\t'", ";ne26<Ka#\fih\u0013\u0001\u0012/L\u007f)\u000b.\u0005\u0016\u0017", ";ne26<Ka#\fih\u0013\u0001\u0012/R\u0004*~On\u001b\u0016G", ";ne26<Ka#\fih\u0013\u0001\u0012/S\u000f$\tO", ";ne26<Ka#\fji\t\u0011o3n\u007f", ";ne26<Ka#\fji\t\u0011s+g\u007f", "Ad[2V;\u001aZ ", "Ad[2V;&]*~\u0003^5\f", "Adc\u0010h9L]&", "5dc\u0019\\5>3\"}Wr\u0016}\n=e\u000f\t\u0006Mg\u0013+Q\u007f\u001d", "1ta?X5M=\u001a\u007f\t^;", "5dc\u0019\\5>A(z\bm\t\u0011r0f\u000e(\u000b!\u000b$}C\u0004\u0018L\u0006", "5dc\u001bX?ME#\fyH-}\u0017/t`2\t'|+!W~", "5dc\u001de,OE#\fyH-}\u0017/t`2\t'|+!W~", "8t\\=5@%W\"~\tH-}\u0017/t", ":h]2f\bF])\b\n", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldPreparedSelection {
    public static final int NoCharacterFound = -1;
    private final TextFieldCharSequence initialValue;
    private final boolean isFromSoftKeyboard;
    private long selection;
    private final TransformedTextFieldState state;
    private final String text;
    private final TextLayoutResult textLayoutResult;
    private final TextFieldPreparedSelectionState textPreparedSelectionState;
    private final float visibleTextLayoutHeight;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public TextFieldPreparedSelection(TransformedTextFieldState transformedTextFieldState, TextLayoutResult textLayoutResult, boolean z2, float f2, TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        this.state = transformedTextFieldState;
        this.textLayoutResult = textLayoutResult;
        this.isFromSoftKeyboard = z2;
        this.visibleTextLayoutHeight = f2;
        this.textPreparedSelectionState = textFieldPreparedSelectionState;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextFieldCharSequence visualText = transformedTextFieldState.getVisualText();
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            this.initialValue = visualText;
            this.selection = visualText.m1446getSelectiond9O1mEE();
            this.text = visualText.toString();
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    public final TextFieldCharSequence getInitialValue() {
        return this.initialValue;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE */
    public final long m1592getSelectiond9O1mEE() {
        return this.selection;
    }

    /* JADX INFO: renamed from: setSelection-5zc-tL8 */
    public final void m1593setSelection5zctL8(long j2) {
        this.selection = j2;
    }

    public final void deleteIfSelectedOr(Function0<TextRange> function0) {
        if (!TextRange.m6117getCollapsedimpl(m1592getSelectiond9O1mEE())) {
            TransformedTextFieldState.m1564replaceTextM8tDOmk$default(this.state, "", m1592getSelectiond9O1mEE(), null, !this.isFromSoftKeyboard, 4, null);
            return;
        }
        TextRange textRangeInvoke = function0.invoke();
        if (textRangeInvoke != null) {
            TransformedTextFieldState.m1564replaceTextM8tDOmk$default(this.state, "", textRangeInvoke.m6127unboximpl(), null, !this.isFromSoftKeyboard, 4, null);
        }
    }

    private final int jumpByPagesOffset(int i2) {
        int iM6118getEndimpl = TextRange.m6118getEndimpl(this.initialValue.m1446getSelectiond9O1mEE());
        if (this.textLayoutResult != null && !Float.isNaN(this.visibleTextLayoutHeight)) {
            Rect rectTranslate = this.textLayoutResult.getCursorRect(iM6118getEndimpl).translate(0.0f, this.visibleTextLayoutHeight * i2);
            float lineBottom = this.textLayoutResult.getLineBottom(this.textLayoutResult.getLineForVerticalPosition(rectTranslate.getTop()));
            return Math.abs(rectTranslate.getTop() - lineBottom) > Math.abs(rectTranslate.getBottom() - lineBottom) ? this.textLayoutResult.m6095getOffsetForPositionk4lQ0M(rectTranslate.m3972getTopLeftF1C5BW0()) : this.textLayoutResult.m6095getOffsetForPositionk4lQ0M(rectTranslate.m3965getBottomLeftF1C5BW0());
        }
        return iM6118getEndimpl;
    }

    private final TextFieldPreparedSelection applyIfNotEmpty(boolean z2, Function1<? super TextFieldPreparedSelection, Unit> function1) {
        if (z2) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            function1.invoke(this);
        }
        return this;
    }

    static /* synthetic */ TextFieldPreparedSelection applyIfNotEmpty$default(TextFieldPreparedSelection textFieldPreparedSelection, boolean z2, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = true;
        }
        if (z2) {
            textFieldPreparedSelection.textPreparedSelectionState.resetCachedX();
        }
        if (textFieldPreparedSelection.text.length() > 0) {
            function1.invoke(textFieldPreparedSelection);
        }
        return textFieldPreparedSelection;
    }

    private final void setCursor(int i2) {
        this.selection = TextRangeKt.TextRange(i2, i2);
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m6118getEndimpl(this.selection));
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m6118getEndimpl(this.selection));
    }

    public final int getNextWordOffset() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return textLayoutResult != null ? getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length();
    }

    public final int getPreviousWordOffset() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null) {
            return getPrevWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null);
        }
        return 0;
    }

    public final TextFieldPreparedSelection moveCursorUpByLine() {
        if (this.textLayoutResult != null && this.text.length() > 0) {
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            Intrinsics.checkNotNull(textLayoutResult);
            setCursor(jumpByLinesOffset(textLayoutResult, -1));
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorDownByLine() {
        if (this.textLayoutResult != null && this.text.length() > 0) {
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            Intrinsics.checkNotNull(textLayoutResult);
            setCursor(jumpByLinesOffset(textLayoutResult, 1));
        }
        return this;
    }

    public final int getLineStartByOffset() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null) {
            return getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null);
        }
        return 0;
    }

    public final int getLineEndByOffset() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return textLayoutResult != null ? getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length();
    }

    private final boolean isLtr() {
        ResolvedTextDirection paragraphDirection;
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return textLayoutResult == null || (paragraphDirection = textLayoutResult.getParagraphDirection(TextRange.m6118getEndimpl(this.selection))) == null || paragraphDirection == ResolvedTextDirection.Ltr;
    }

    static /* synthetic */ int getNextWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if ((i3 + 1) - (i3 | 1) != 0) {
            i2 = TextRange.m6118getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i2);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i2) {
        while (i2 < this.initialValue.length()) {
            long jM6097getWordBoundaryjx7JFs = textLayoutResult.m6097getWordBoundaryjx7JFs(charOffset(i2));
            if (TextRange.m6118getEndimpl(jM6097getWordBoundaryjx7JFs) > i2) {
                return TextRange.m6118getEndimpl(jM6097getWordBoundaryjx7JFs);
            }
            i2++;
        }
        return this.initialValue.length();
    }

    static /* synthetic */ int getPrevWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = TextRange.m6118getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getPrevWordOffsetForLayout(textLayoutResult, i2);
    }

    private final int getPrevWordOffsetForLayout(TextLayoutResult textLayoutResult, int i2) {
        while (i2 > 0) {
            long jM6097getWordBoundaryjx7JFs = textLayoutResult.m6097getWordBoundaryjx7JFs(charOffset(i2));
            if (TextRange.m6123getStartimpl(jM6097getWordBoundaryjx7JFs) < i2) {
                return TextRange.m6123getStartimpl(jM6097getWordBoundaryjx7JFs);
            }
            i2--;
        }
        return 0;
    }

    static /* synthetic */ int getLineStartByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = TextRange.m6121getMinimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i2);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i2) {
        return textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i2));
    }

    static /* synthetic */ int getLineEndByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if ((i3 + 1) - (i3 | 1) != 0) {
            i2 = TextRange.m6120getMaximpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i2);
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i2) {
        return textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i2), true);
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i2) {
        int iM6118getEndimpl = TextRange.m6118getEndimpl(this.selection);
        if (Float.isNaN(this.textPreparedSelectionState.getCachedX())) {
            this.textPreparedSelectionState.setCachedX(textLayoutResult.getCursorRect(iM6118getEndimpl).getLeft());
        }
        int lineForOffset = textLayoutResult.getLineForOffset(iM6118getEndimpl) + i2;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return this.text.length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        float cachedX = this.textPreparedSelectionState.getCachedX();
        if ((isLtr() && cachedX >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && cachedX <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return textLayoutResult.m6095getOffsetForPositionk4lQ0M(OffsetKt.Offset(cachedX, lineBottom));
    }

    private final int charOffset(int i2) {
        return RangesKt.coerceAtMost(i2, this.text.length() - 1);
    }

    /* JADX INFO: compiled from: TextPreparedSelection.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*w\u0012YL {D6\r\b3I\u007fJl\u000b\u0015Tk?r{>_\u0014Q\u0003j", "", "u(E", "\u001cn25T9:Q(~\b?6\r\u0012.", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final TextFieldPreparedSelection moveCursorUpByPage() {
        if (this.text.length() > 0) {
            setCursor(jumpByPagesOffset(-1));
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorDownByPage() {
        if (this.text.length() > 0) {
            setCursor(jumpByPagesOffset(1));
        }
        return this;
    }

    public final TextFieldPreparedSelection selectAll() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(0, this.text.length());
        }
        return this;
    }

    public final TextFieldPreparedSelection deselect() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(TextRange.m6118getEndimpl(this.selection));
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorLeft() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorPrev();
            } else {
                moveCursorNext();
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorRight() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorNext();
            } else {
                moveCursorPrev();
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection collapseLeftOr(Function1<? super TextFieldPreparedSelection, Unit> function1) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m6117getCollapsedimpl(this.selection)) {
                function1.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m6121getMinimpl(this.selection));
            } else {
                setCursor(TextRange.m6120getMaximpl(this.selection));
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection collapseRightOr(Function1<? super TextFieldPreparedSelection, Unit> function1) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m6117getCollapsedimpl(this.selection)) {
                function1.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m6120getMaximpl(this.selection));
            } else {
                setCursor(TextRange.m6121getMinimpl(this.selection));
            }
        }
        return this;
    }

    private final TextFieldPreparedSelection moveCursorPrev() {
        int iM6118getEndimpl;
        int iCalculateAdjacentCursorPosition;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0 && (iCalculateAdjacentCursorPosition = TextPreparedSelectionKt.calculateAdjacentCursorPosition(this.text, (iM6118getEndimpl = TextRange.m6118getEndimpl(this.selection)), false, this.state)) != iM6118getEndimpl) {
            setCursor(iCalculateAdjacentCursorPosition);
        }
        return this;
    }

    private final TextFieldPreparedSelection moveCursorNext() {
        int iM6118getEndimpl;
        int iCalculateAdjacentCursorPosition;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0 && (iCalculateAdjacentCursorPosition = TextPreparedSelectionKt.calculateAdjacentCursorPosition(this.text, (iM6118getEndimpl = TextRange.m6118getEndimpl(this.selection)), true, this.state)) != iM6118getEndimpl) {
            setCursor(iCalculateAdjacentCursorPosition);
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToHome() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(0);
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(this.text.length());
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorLeftByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorPrevByWord();
            } else {
                moveCursorNextByWord();
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorRightByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorNextByWord();
            } else {
                moveCursorPrevByWord();
            }
        }
        return this;
    }

    private final TextFieldPreparedSelection moveCursorNextByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(getNextWordOffset());
        }
        return this;
    }

    private final TextFieldPreparedSelection moveCursorPrevByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(getPreviousWordOffset());
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorPrevByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iFindParagraphStart = StringHelpersKt.findParagraphStart(this.text, TextRange.m6121getMinimpl(this.selection));
            if (iFindParagraphStart == TextRange.m6121getMinimpl(this.selection) && iFindParagraphStart != 0) {
                iFindParagraphStart = StringHelpersKt.findParagraphStart(this.text, iFindParagraphStart - 1);
            }
            setCursor(iFindParagraphStart);
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorNextByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iFindParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, TextRange.m6120getMaximpl(this.selection));
            if (iFindParagraphEnd == TextRange.m6120getMaximpl(this.selection) && iFindParagraphEnd != this.text.length()) {
                iFindParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, iFindParagraphEnd + 1);
            }
            setCursor(iFindParagraphEnd);
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToLineStart() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(getLineStartByOffset());
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToLineEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(getLineEndByOffset());
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToLineLeftSide() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToLineRightSide() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection selectMovement() {
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m6123getStartimpl(this.initialValue.m1446getSelectiond9O1mEE()), TextRange.m6118getEndimpl(this.selection));
        }
        return this;
    }
}
