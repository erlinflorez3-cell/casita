package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.ui.text.android.LayoutHelper;
import androidx.compose.ui.text.android.selection.SegmentFinder;
import androidx.compose.ui.text.android.selection.SegmentFinder_androidKt;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: TextLayoutGetRangeForRectExtensions.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d̉=!,n\bӵLc\u0003\nI\u00066\u000b6B\r44\u0012}\u0007njO0L͜P.hS2\u000fq~<$q$yّCU0}*\t]Wo˧vJh\u001eK\u000f\u001c\u0016\u0001̓4Ikxe܈\u00172XoG3SvUWnҚN\u0005N1R<\b\u0005\u0019\u001aXI@z\tEc\f@1ptHU%M3\u001eX\u0006V>\u000f#tg|5xpk:G#1jrR5aH|{\u000evX5\u0010\u000faL/\u00077My3Y\u001b\u0007\u0001\\g\u0003mxm\tv/?+w|\b:f\u0002,\u0015YP=a\u00010t\u0005\u007fa<+9Z{K~\u000fX{\t\b%<2\r6+V;E\u001a\u0015\u0007>7\u0003uk@~\u0006\u000fF\u000e\ty6E40I9I3xacK\u0019|@\f\u0007\u001d\u001eQ\n~#kT<rC,\u001bwiw_SUJd\t\bQ\u0016\u0004\u001fw2.\u0012F_\u007f]\u0013A2%=O[g<Qo\u0010P\\g%\u000e\u0011la\u0004jHn#\u001f,E:!\u001ejFt\u0005\u001aYdZ<\u0011{%d\t\u000e\bA2\u000b\t\u0003ƙ=t\\j\u0001i\u0019N\u0006\nS6\u0017;gv\u0004\u000e\u0006B\u000f7CS{\u0010\u0010S'\u0018MFz\u0005\u0007grW\u001aet(P3xn\u001e\u0004\u0014D|\u000bC6M~44Z0I`#K\u001b\u001epE-\rmh\u0001\u0010-cc:\u0011y<\u0007\u0019\u0003`\\\u001fxwzY,+i2/QQc+TfhhLQ1#\u0017s.H\u0010Lua\u001d\u001a\u0004k\u0014 D1iU=U+\u000f-Bb\u0006;bdr\u0014R}\u00165\u0003\u0015y=D\u00192u\u0016\u0003pZo\u001b`]d/4\u0007`\u0003#6m\u0010{qF)PsV\u001b[l[!\u0014\n@\\V\u0015\u0005M0k\u0001\b<\u000bTECU/>wB8Eek\n\b.(a?*\u0003\u0007\u001c,\u0012\u00156bмaT"}, d2 = {"5dc\u0010[(KO\u0017\u000ezk\u0013|\n>B\n8\u0005?\u000f", "", "=eU@X;", "", ":h]2F;:`(", "6na6m6Gb\u0015\u0006Wh<\u0006\b=", "", "5dc\u0010[(KO\u0017\u000ezk\u0019\u0001\u000b2t\\2\fI\u007f%", "5dc\u0012a+(T\u001a\rzm\r\u0007\u0016\u001ce}7mD\u0010\u001a\u001bP\\\u001eE", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u001ek;)\u0015u \u0016\u000bb0;\u00070\u001d", "@dRA", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010wl", ":h]2G6I", ":h]256Mb#\u0007", "@t]\u0019X-M", "@t]\u001f\\.Ab", "AdV:X5M4\u001d\by^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|iEm\u001d.KR?u=g\u0003hcA\u0007l;/z0FL[\u0002", "7mR9h:B]\"l\nk(\f\t1y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "5dc\u001fT5@Sy\t\bK,z\u0018", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i&m)=4?OuD-j", ":`h<h;", "\u001a`]1e6BRb\u000ezq;Fo+y\n8\u000b\u0016", ":`h<h;!S \nzk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u001ek;)\u0015u7", "5qP;h3:`\u001d\u000e\u000f", "5dc g(Kb\u0003\u007f{l,\fi9rl(yOr\u001b&Js\u0017)\u0007.", "5dc g(Kb\u0003\fZg+f\n0s\u007f7\\J\u000e\u0004\u0017E~\u007f@\u0006(9bd$@m", ":h]2<5=S,", "5dc g(Kb", "6na6m6Gb\u0015\u0006do,\n\u0010+p", ":dUA", "@hV5g", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextLayoutGetRangeForRectExtensions_androidKt {
    public static final int[] getRangeForRect(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, RectF rectF, int i2, Function2<? super RectF, ? super RectF, Boolean> function2) {
        WordSegmentFinder wordSegmentFinderCreateGraphemeClusterSegmentFinder;
        if (i2 == 1) {
            wordSegmentFinderCreateGraphemeClusterSegmentFinder = new WordSegmentFinder(textLayout.getText(), textLayout.getWordIterator());
        } else {
            wordSegmentFinderCreateGraphemeClusterSegmentFinder = SegmentFinder_androidKt.createGraphemeClusterSegmentFinder(textLayout.getText(), textLayout.getTextPaint());
        }
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > textLayout.getLineBottom(lineForVertical) && (lineForVertical = lineForVertical + 1) >= textLayout.getLineCount()) {
            return null;
        }
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < textLayout.getLineTop(0)) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, lineForVertical, rectF, wordSegmentFinderCreateGraphemeClusterSegmentFinder, function2, true);
        while (startOrEndOffsetForRectWithinLine == -1 && lineForVertical < lineForVertical2) {
            lineForVertical++;
            startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, lineForVertical, rectF, wordSegmentFinderCreateGraphemeClusterSegmentFinder, function2, true);
        }
        if (startOrEndOffsetForRectWithinLine == -1) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, lineForVertical2, rectF, wordSegmentFinderCreateGraphemeClusterSegmentFinder, function2, false);
        while (startOrEndOffsetForRectWithinLine2 == -1 && lineForVertical < lineForVertical2) {
            lineForVertical2--;
            startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, lineForVertical2, rectF, wordSegmentFinderCreateGraphemeClusterSegmentFinder, function2, false);
        }
        if (startOrEndOffsetForRectWithinLine2 == -1) {
            return null;
        }
        return new int[]{wordSegmentFinderCreateGraphemeClusterSegmentFinder.previousStartBoundary(startOrEndOffsetForRectWithinLine + 1), wordSegmentFinderCreateGraphemeClusterSegmentFinder.nextEndBoundary(startOrEndOffsetForRectWithinLine2 - 1)};
    }

    private static final int getStartOrEndOffsetForRectWithinLine(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, int i2, RectF rectF, SegmentFinder segmentFinder, Function2<? super RectF, ? super RectF, Boolean> function2, boolean z2) {
        IntRange intRangeDownTo;
        float characterLeftBounds;
        float characterRightBounds;
        int endOffsetForRectWithinRun;
        int lineTop = layout.getLineTop(i2);
        int lineBottom = layout.getLineBottom(i2);
        int lineStart = layout.getLineStart(i2);
        int lineEnd = layout.getLineEnd(i2);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        textLayout.fillLineHorizontalBounds$ui_text_release(i2, fArr);
        LayoutHelper.BidiRun[] lineBidiRuns$ui_text_release = layoutHelper.getLineBidiRuns$ui_text_release(i2);
        if (z2) {
            intRangeDownTo = ArraysKt.getIndices(lineBidiRuns$ui_text_release);
        } else {
            intRangeDownTo = RangesKt.downTo(ArraysKt.getLastIndex(lineBidiRuns$ui_text_release), 0);
        }
        int first = intRangeDownTo.getFirst();
        int last = intRangeDownTo.getLast();
        int step = intRangeDownTo.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return -1;
        }
        while (true) {
            LayoutHelper.BidiRun bidiRun = lineBidiRuns$ui_text_release[first];
            if (bidiRun.isRtl()) {
                characterLeftBounds = getCharacterLeftBounds(bidiRun.getEnd() - 1, lineStart, fArr);
            } else {
                characterLeftBounds = getCharacterLeftBounds(bidiRun.getStart(), lineStart, fArr);
            }
            if (bidiRun.isRtl()) {
                characterRightBounds = getCharacterRightBounds(bidiRun.getStart(), lineStart, fArr);
            } else {
                characterRightBounds = getCharacterRightBounds(bidiRun.getEnd() - 1, lineStart, fArr);
            }
            if (!z2) {
                endOffsetForRectWithinRun = getEndOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, segmentFinder, function2);
            } else {
                endOffsetForRectWithinRun = getStartOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, segmentFinder, function2);
            }
            if (endOffsetForRectWithinRun >= 0) {
                return endOffsetForRectWithinRun;
            }
            if (first == last) {
                return -1;
            }
            first += step;
        }
    }

    private static final int getStartOffsetForRectWithinRun(LayoutHelper.BidiRun bidiRun, RectF rectF, int i2, int i3, int i4, float f2, float f3, float[] fArr, SegmentFinder segmentFinder, Function2<? super RectF, ? super RectF, Boolean> function2) {
        int start;
        int iPreviousStartBoundary;
        float characterLeftBounds;
        float characterRightBounds;
        if (!horizontalOverlap(rectF, f2, f3)) {
            return -1;
        }
        if ((!bidiRun.isRtl() && rectF.left <= f2) || (bidiRun.isRtl() && rectF.right >= f3)) {
            start = bidiRun.getStart();
        } else {
            start = bidiRun.getStart();
            int end = bidiRun.getEnd();
            while (end - start > 1) {
                int i5 = (end + start) / 2;
                float characterLeftBounds2 = getCharacterLeftBounds(i5, i2, fArr);
                if ((bidiRun.isRtl() || characterLeftBounds2 <= rectF.left) && (!bidiRun.isRtl() || characterLeftBounds2 >= rectF.right)) {
                    start = i5;
                } else {
                    end = i5;
                }
            }
            if (bidiRun.isRtl()) {
                start = end;
            }
        }
        int iNextEndBoundary = segmentFinder.nextEndBoundary(start);
        if (iNextEndBoundary == -1 || (iPreviousStartBoundary = segmentFinder.previousStartBoundary(iNextEndBoundary)) >= bidiRun.getEnd()) {
            return -1;
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(iPreviousStartBoundary, bidiRun.getStart());
        int iCoerceAtMost = RangesKt.coerceAtMost(iNextEndBoundary, bidiRun.getEnd());
        RectF rectF2 = new RectF(0.0f, i3, 0.0f, i4);
        while (true) {
            if (bidiRun.isRtl()) {
                characterLeftBounds = getCharacterLeftBounds(iCoerceAtMost - 1, i2, fArr);
            } else {
                characterLeftBounds = getCharacterLeftBounds(iCoerceAtLeast, i2, fArr);
            }
            rectF2.left = characterLeftBounds;
            if (bidiRun.isRtl()) {
                characterRightBounds = getCharacterRightBounds(iCoerceAtLeast, i2, fArr);
            } else {
                characterRightBounds = getCharacterRightBounds(iCoerceAtMost - 1, i2, fArr);
            }
            rectF2.right = characterRightBounds;
            if (function2.invoke(rectF2, rectF).booleanValue()) {
                return iCoerceAtLeast;
            }
            iCoerceAtLeast = segmentFinder.nextStartBoundary(iCoerceAtLeast);
            if (iCoerceAtLeast == -1 || iCoerceAtLeast >= bidiRun.getEnd()) {
                break;
            }
            iCoerceAtMost = RangesKt.coerceAtMost(segmentFinder.nextEndBoundary(iCoerceAtLeast), bidiRun.getEnd());
        }
        return -1;
    }

    private static final int getEndOffsetForRectWithinRun(LayoutHelper.BidiRun bidiRun, RectF rectF, int i2, int i3, int i4, float f2, float f3, float[] fArr, SegmentFinder segmentFinder, Function2<? super RectF, ? super RectF, Boolean> function2) {
        int start;
        int iNextEndBoundary;
        float characterLeftBounds;
        float characterRightBounds;
        if (!horizontalOverlap(rectF, f2, f3)) {
            return -1;
        }
        if ((!bidiRun.isRtl() && rectF.right >= f3) || (bidiRun.isRtl() && rectF.left <= f2)) {
            start = bidiRun.getEnd() - 1;
        } else {
            start = bidiRun.getStart();
            int end = bidiRun.getEnd();
            while (end - start > 1) {
                int i5 = (end + start) / 2;
                float characterLeftBounds2 = getCharacterLeftBounds(i5, i2, fArr);
                if ((bidiRun.isRtl() || characterLeftBounds2 <= rectF.right) && (!bidiRun.isRtl() || characterLeftBounds2 >= rectF.left)) {
                    start = i5;
                } else {
                    end = i5;
                }
            }
            if (bidiRun.isRtl()) {
                start = end;
            }
        }
        int iPreviousStartBoundary = segmentFinder.previousStartBoundary(start + 1);
        if (iPreviousStartBoundary == -1 || (iNextEndBoundary = segmentFinder.nextEndBoundary(iPreviousStartBoundary)) <= bidiRun.getStart()) {
            return -1;
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(iPreviousStartBoundary, bidiRun.getStart());
        int iCoerceAtMost = RangesKt.coerceAtMost(iNextEndBoundary, bidiRun.getEnd());
        RectF rectF2 = new RectF(0.0f, i3, 0.0f, i4);
        while (true) {
            if (bidiRun.isRtl()) {
                characterLeftBounds = getCharacterLeftBounds(iCoerceAtMost - 1, i2, fArr);
            } else {
                characterLeftBounds = getCharacterLeftBounds(iCoerceAtLeast, i2, fArr);
            }
            rectF2.left = characterLeftBounds;
            if (bidiRun.isRtl()) {
                characterRightBounds = getCharacterRightBounds(iCoerceAtLeast, i2, fArr);
            } else {
                characterRightBounds = getCharacterRightBounds(iCoerceAtMost - 1, i2, fArr);
            }
            rectF2.right = characterRightBounds;
            if (function2.invoke(rectF2, rectF).booleanValue()) {
                return iCoerceAtMost;
            }
            iCoerceAtMost = segmentFinder.previousEndBoundary(iCoerceAtMost);
            if (iCoerceAtMost == -1 || iCoerceAtMost <= bidiRun.getStart()) {
                break;
            }
            iCoerceAtLeast = RangesKt.coerceAtLeast(segmentFinder.previousStartBoundary(iCoerceAtMost), bidiRun.getStart());
        }
        return -1;
    }

    private static final float getCharacterLeftBounds(int i2, int i3, float[] fArr) {
        return fArr[(i2 - i3) * 2];
    }

    private static final float getCharacterRightBounds(int i2, int i3, float[] fArr) {
        return fArr[((i2 - i3) * 2) + 1];
    }

    private static final boolean horizontalOverlap(RectF rectF, float f2, float f3) {
        return f3 >= rectF.left && f2 <= rectF.right;
    }
}
