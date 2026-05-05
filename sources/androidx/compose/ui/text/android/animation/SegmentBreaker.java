package androidx.compose.ui.text.android.animation;

import android.text.Layout;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import androidx.compose.ui.text.android.LayoutHelper;
import com.dynatrace.android.agent.Global;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: compiled from: SegmentBreaker.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0004I\u0006>)6B\r(4ߚ\u007f\u0007|jA0JeP.hS2şs{J$cҕyCI^\"}(\u000eWNurvϺb\u000bY\u000f\u000eǝ~͔,_ǁ)]@\u000erGu?ݯQoK9)\tD\u0006882:\n\u0005/\u001dXJ@z\tGc\f@5\u0007p\u0003l\u001bS\u001d \"\bN /!\u000bi~:Vpu:](3mPU?_^\u0005\u0016)T]?\u0013\u0007c.+nAc\u0017UW\u0011\u000bj[m\bouK\u0010\u0001'U7\u0010s Jf\r,\u001b;Q\u001d]!0\u000b\u0007\u0002d\u001a+CO\u0012P\u0017\u000ep\u0014\t\n%B\u0014\u0010\u0016'v8[\u001c\u0017\f\u001c7\rr\u0002E\u0001\u0006lM\u0018z\u0010B]%HG9H3lacK\u0019|A*\u0007=\"1\u0005\u0007!\nYT`]7b\bi7aBMH|\u0014\b?\u001e\b~f\u001a*25w\u0004=\u0007).E1}[\u0002E/|\u001aNTi\u0007\u0005\u000fr\u0002k\u0003LN&\u0007\u0016e/9\u0010hK|\u0005\u001aX\u0005\\:\u001ce\u001c\u0003\u0013F$!2t}L#5\u0010|R\u0017k\u001bQk\u001d=/\u0015K\nry#o9\rI{QӘ\u0014x"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i3v\u001a6IR?u=g\u0003hcA\u0007l;+\u0004'CRN92", "", "u(E", "0qT.^\u0010GE#\fyl", "", "", ":`h<h;!S \nzk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u001ek;)\u0015u7", "0qT.^\u0016?T'~\nl", "AdV:X5MB-\nz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i3v\u001a6IR?u=g\u0003hcA\u0007l;=\u000b2G\"", "0qT.^\u001a>U!~\u0004m\u001e\u0001\u00182C\u0003$\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i3v\u001a6IR?u=g\u0003hcA\u0007l;$", "2q^=F7:Q\u0019\r", "", "0qT.^\u001a>U!~\u0004m\u001e\u0001\u00182D\n&\fH\u0001 &", "0qT.^\u001a>U!~\u0004m\u001e\u0001\u00182L\u00041{", "0qT.^\u001a>U!~\u0004m\u001e\u0001\u00182P{5wB\u000e\u0013\"J", "0qT.^\u001a>U!~\u0004m\u001e\u0001\u00182W\n5z", "0qT.^\u001a>U!~\u0004m:", "0qT.^\u001eBb\u001c[\b^(\u0003l>e\r$\u000bJ\u000e", "BdgA", "", "0qT.^,K", "\u001aiPCTuMS,\u000eD;9|\u00055I\u000f(\t<\u0010!$\u001d", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SegmentBreaker {
    public static final int $stable = 0;
    public static final SegmentBreaker INSTANCE = new SegmentBreaker();

    /* JADX INFO: compiled from: SegmentBreaker.android.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentType.values().length];
            try {
                iArr[SegmentType.Document.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentType.Paragraph.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentType.Line.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SegmentType.Word.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SegmentType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SegmentBreaker() {
    }

    private final List<Integer> breakInWords(LayoutHelper layoutHelper) {
        List<Integer> listBreakWithBreakIterator = breakWithBreakIterator(layoutHelper.getLayout().getText(), BreakIterator.getLineInstance(Locale.getDefault()));
        TreeSet treeSet = new TreeSet();
        int size = listBreakWithBreakIterator.size();
        for (int i2 = 0; i2 < size; i2++) {
            treeSet.add(Integer.valueOf(listBreakWithBreakIterator.get(i2).intValue()));
        }
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i3 = 0; i3 < paragraphCount; i3++) {
            Bidi bidiAnalyzeBidi = layoutHelper.analyzeBidi(i3);
            if (bidiAnalyzeBidi != null) {
                int paragraphStart = layoutHelper.getParagraphStart(i3);
                int runCount = bidiAnalyzeBidi.getRunCount();
                for (int i4 = 0; i4 < runCount; i4++) {
                    treeSet.add(Integer.valueOf(bidiAnalyzeBidi.getRunStart(i4) + paragraphStart));
                }
            }
        }
        return CollectionsKt.toList(treeSet);
    }

    private final List<Integer> breakWithBreakIterator(CharSequence charSequence, BreakIterator breakIterator) {
        CharSequenceCharacterIterator charSequenceCharacterIterator = new CharSequenceCharacterIterator(charSequence, 0, charSequence.length());
        List<Integer> listMutableListOf = CollectionsKt.mutableListOf(0);
        breakIterator.setText(charSequenceCharacterIterator);
        while (breakIterator.next() != -1) {
            listMutableListOf.add(Integer.valueOf(breakIterator.current()));
        }
        return listMutableListOf;
    }

    public final List<Integer> breakOffsets(LayoutHelper layoutHelper, SegmentType segmentType) {
        Layout layout = layoutHelper.getLayout();
        CharSequence text = layout.getText();
        int i2 = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            return CollectionsKt.listOf((Object[]) new Integer[]{0, Integer.valueOf(text.length())});
        }
        if (i2 == 2) {
            List<Integer> listMutableListOf = CollectionsKt.mutableListOf(0);
            int paragraphCount = layoutHelper.getParagraphCount();
            while (i3 < paragraphCount) {
                listMutableListOf.add(Integer.valueOf(layoutHelper.getParagraphEnd(i3)));
                i3++;
            }
            return listMutableListOf;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return breakInWords(layoutHelper);
            }
            if (i2 == 5) {
                return breakWithBreakIterator(text, BreakIterator.getCharacterInstance(Locale.getDefault()));
            }
            throw new NoWhenBranchMatchedException();
        }
        List<Integer> listMutableListOf2 = CollectionsKt.mutableListOf(0);
        int lineCount = layout.getLineCount();
        while (i3 < lineCount) {
            listMutableListOf2.add(Integer.valueOf(layout.getLineEnd(i3)));
            i3++;
        }
        return listMutableListOf2;
    }

    public final List<Segment> breakSegments(LayoutHelper layoutHelper, SegmentType segmentType, boolean z2) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        if (i2 == 1) {
            return breakSegmentWithDocument(layoutHelper);
        }
        if (i2 == 2) {
            return breakSegmentWithParagraph(layoutHelper);
        }
        if (i2 == 3) {
            return breakSegmentWithLine(layoutHelper, z2);
        }
        if (i2 == 4) {
            return breakSegmentWithWord(layoutHelper, z2);
        }
        if (i2 == 5) {
            return breakSegmentWithChar(layoutHelper, z2);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final List<Segment> breakSegmentWithDocument(LayoutHelper layoutHelper) {
        return CollectionsKt.listOf(new Segment(0, layoutHelper.getLayout().getText().length(), 0, 0, layoutHelper.getLayout().getWidth(), layoutHelper.getLayout().getHeight()));
    }

    private final List<Segment> breakSegmentWithParagraph(LayoutHelper layoutHelper) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i2 = 0; i2 < paragraphCount; i2++) {
            int paragraphStart = layoutHelper.getParagraphStart(i2);
            int paragraphEnd = layoutHelper.getParagraphEnd(i2);
            arrayList.add(new Segment(paragraphStart, paragraphEnd, 0, layout.getLineTop(LayoutCompat_androidKt.getLineForOffset(layout, paragraphStart, false)), layout.getWidth(), layout.getLineBottom(LayoutCompat_androidKt.getLineForOffset(layout, paragraphEnd, true))));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithLine(LayoutHelper layoutHelper, boolean z2) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int lineCount = layoutHelper.getLayout().getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            arrayList.add(new Segment(layout.getLineStart(i2), layout.getLineEnd(i2), z2 ? (int) Math.ceil(layout.getLineLeft(i2)) : 0, layout.getLineTop(i2), z2 ? (int) Math.ceil(layout.getLineRight(i2)) : layout.getWidth(), layout.getLineBottom(i2)));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithWord(LayoutHelper layoutHelper, boolean z2) {
        Layout layout = layoutHelper.getLayout();
        int iCeil = (int) Math.ceil(layout.getPaint().measureText(Global.BLANK));
        List<Integer> listBreakOffsets = breakOffsets(layoutHelper, SegmentType.Word);
        if (listBreakOffsets.size() != 0) {
            boolean z3 = true;
            if (listBreakOffsets.size() != 1) {
                ArrayList arrayList = new ArrayList();
                boolean z4 = false;
                Integer num = listBreakOffsets.get(0);
                int lastIndex = CollectionsKt.getLastIndex(listBreakOffsets);
                int i2 = 0;
                while (i2 < lastIndex) {
                    i2++;
                    Integer num2 = listBreakOffsets.get(i2);
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num.intValue();
                    int lineForOffset = LayoutCompat_androidKt.getLineForOffset(layout, iIntValue2, z4);
                    boolean z5 = layout.getParagraphDirection(lineForOffset) == -1 ? z3 : z4;
                    boolean zIsRtlCharAt = layout.isRtlCharAt(iIntValue2);
                    if (zIsRtlCharAt != z5) {
                        z3 = z4;
                    }
                    int iCeil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue2, z3, z4));
                    int iCeil3 = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue, zIsRtlCharAt == z5, true));
                    int iMin = Math.min(iCeil2, iCeil3);
                    int iMax = Math.max(iCeil2, iCeil3);
                    if (z2 && iIntValue != 0 && layout.getText().charAt(iIntValue - 1) == ' ' && layout.getLineEnd(lineForOffset) != iIntValue) {
                        if (zIsRtlCharAt) {
                            iMin += iCeil;
                        } else {
                            iMax -= iCeil;
                        }
                    }
                    arrayList.add(new Segment(iIntValue2, iIntValue, iMin, layout.getLineTop(lineForOffset), iMax, layout.getLineBottom(lineForOffset)));
                    num = num2;
                    z3 = true;
                    z4 = false;
                }
                return arrayList;
            }
        }
        return CollectionsKt.emptyList();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<androidx.compose.ui.text.android.animation.Segment> breakSegmentWithChar(androidx.compose.ui.text.android.LayoutHelper r24, boolean r25) {
        /*
            r23 = this;
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r7 = (java.util.List) r7
            androidx.compose.ui.text.android.animation.SegmentType r1 = androidx.compose.ui.text.android.animation.SegmentType.Character
            r0 = r23
            r8 = r24
            java.util.List r10 = r0.breakOffsets(r8, r1)
            int r0 = r10.size()
            if (r0 == 0) goto L1e
            int r0 = r10.size()
            r11 = 1
            if (r0 != r11) goto L22
        L1e:
            kotlin.collections.CollectionsKt.emptyList()
        L21:
            return r7
        L22:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
            r1 = 0
            java.lang.Object r2 = r10.get(r1)
            int r14 = kotlin.collections.CollectionsKt.getLastIndex(r10)
            r5 = r1
        L33:
            if (r5 >= r14) goto L21
            int r5 = r5 + 1
            java.lang.Object r15 = r10.get(r5)
            r0 = r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r3 = r2.intValue()
            android.text.Layout r9 = r8.getLayout()
            if (r25 == 0) goto L69
            int r0 = r3 + 1
            if (r4 != r0) goto L69
            java.lang.CharSequence r0 = r9.getText()
            char r0 = r0.charAt(r3)
            boolean r0 = r8.isLineEndSpace(r0)
            if (r0 == 0) goto L69
        L60:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r6.add(r0)
            r2 = r15
            r11 = 1
            r1 = 0
            goto L33
        L69:
            int r2 = androidx.compose.ui.text.android.LayoutCompat_androidKt.getLineForOffset(r9, r3, r1)
            int r12 = r9.getParagraphDirection(r2)
            r0 = -1
            if (r12 != r0) goto Lb8
            r13 = r11
        L75:
            boolean r12 = r9.isRtlCharAt(r3)
            if (r12 != r13) goto Lb6
        L7b:
            float r0 = r8.getHorizontalPosition(r3, r11, r1)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r11 = (float) r0
            int r11 = (int) r11
            if (r12 != r13) goto Lb4
            r1 = 1
        L89:
            r0 = 1
            float r0 = r8.getHorizontalPosition(r4, r1, r0)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r12 = (float) r0
            int r1 = (int) r12
            androidx.compose.ui.text.android.animation.Segment r0 = new androidx.compose.ui.text.android.animation.Segment
            int r19 = java.lang.Math.min(r11, r1)
            int r20 = r9.getLineTop(r2)
            int r21 = java.lang.Math.max(r11, r1)
            int r22 = r9.getLineBottom(r2)
            r18 = r4
            r17 = r3
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r7.add(r0)
            goto L60
        Lb4:
            r1 = 0
            goto L89
        Lb6:
            r11 = r1
            goto L7b
        Lb8:
            r13 = r1
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.animation.SegmentBreaker.breakSegmentWithChar(androidx.compose.ui.text.android.LayoutHelper, boolean):java.util.List");
    }
}
