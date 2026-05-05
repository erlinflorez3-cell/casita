package androidx.compose.ui.text.android;

import android.text.Layout;
import com.drew.metadata.exif.makernotes.SonyType1MakernoteDirectory;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
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
/* JADX INFO: compiled from: LayoutHelper.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":(\u007f\u0007lkA0R\u0005P.hS2şs{B*c$wDCU(\u001c*ޛWNu~vJ`\fK\u000f\u0014\u001b\u0001j2I]xk\u001b\u00172HqG3[~E9vt>\u0005&9*8\b\u000f\t\u001a0L\u0016͌\u0011ŏ{\f@/xog\u0013\u0018]\t(\u0012\u001e>N\u0002ɉ`g\\8\u0011zkLG%\u0019hpWWc>\u0010e\rt_o#\u0005u6+nLe\u00193i\u001b\u0007\u0001fo\u0007M\tU\u0005\u0017?m+\u0012\u0010eOp\u007fB*[S\u001bs\u000b&\u000b\u0010\u0002d\u001aACO\u0012c\u0001\u00126\u0013\u0013{;TL)\u0014C`4=\u001cv\b<Q#\u0010\u0004D^!vB.\u0006(اа)\u00029KG</]o]1Ne\u00075\u0011,B\u0019nOf\u001d\u001cn83T&\\aWF<Va\"YkxL\tp&B\u0004^R05\u0002\u0010<-=7\nDS'q\u0002V_\u007fv3x1aww`@PyF=0\b\u001am\\d3v\u0019`fR)MJl7\u0002\u0016:8\\&di3\u001ewgh\u0018\u0003}c\u0010$=yOY\u001dvVmG\tK5\u007fn@e`\",?jm5\\tnk\f\tgn\"\u0003Tx\u0013\u0010{rRbƑ4Ɛu\u001c<ι\u0002(j\u0015`\u0003LC˩\u0001\u000fgʳ\u0001\u0012\u0005YA*S}2{!\t``\u0001q}ww5+hx\u038dCپ9\u0019.ŞrwB\u0007;\u0007-~õKmT܁dn\u001c\u0002c\tp((Gi5M\u0015\u001f~W=0<\u001cɦtϯUM\u001a\u05fdK\u000b\b\u001fSjDf6{GݝlʧNO\\ϟȚz\r"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u001ek;)\u0015u7", "", ":`h<h;", "\u001a`]1e6BRb\u000ezq;Fo+y\n8\u000b\u0016", "uKP;W9HW\u0018H\n^?\fR\u0016a\u00142\fOVZ\b", "0hS6C9HQ\u0019\r\t^+g\u0005<a\u00025wK\u0004%", "", "5dc\u0019T@Hc(", "u(;.a+K]\u001d}Dm,\u0010\u0018xL{<\u0006P\u0010l", ">`a.Z9:^\u001c[~]0", "", "\u001aiPCTuMS,\u000eD;0{\r\u0005", ">`a.Z9:^\u001c\\\u0005n5\f", "", "5dc\u001dT9:U&z\u0006a\n\u0007\u00198t", "u(8", ">`a.Z9:^\u001c^\u0004]:", "", "Bl_\u000fh-?S&", "", "/mP9lA>0\u001d}~", ">`a.Z9:^\u001cb\u0004],\u0010", "5dc\u0011b>Ga(\fzZ4_\u0013<i\u00152\u0005O|\u001e", "", "=eU@X;", ">qX:T9R", "", "5dc\u0015b9Bh#\b\nZ3g\u0013=i\u000f,\u0006I", "CrT\u001de0FO&\u0013Yb9|\u0007>i\n1", "CobAe,:[", "5dc\u0019\\5>0\u001d}~K<\u0006\u0017", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u001ek;)\u0015u \u0016\u000bb0;\u00070\u001d", ":h]2<5=S,", "5dc\u0019\\5>0\u001d}~K<\u0006\u0017mu\u0004\"\u000b@\u0014&\u0011To\u0015<r35", "uH\u0018(?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011~\u000eO\u0006n1b|-Aq\u0015w4?OuD-whhD\u0007pj+z&K9^52", "5dc\u0019\\5>D\u001d\r~[3|h8d", "5dc\u001dT9:U&z\u0006a\f\u0006\b", "5dc\u001dT9:U&z\u0006a\r\u0007\u0016\u0019f\u00016{O", "5dc\u001dT9:U&z\u0006a\u001a\f\u0005<t", "7r;6a,\u001e\\\u0018l\u0006Z*|", "1", "", "7rAA_\u0017:`\u0015\u0001\bZ7\u007f", ":h]285=B#o~l0y\u0010/E\t'", ":h]285=", ":h]2F;:`(", "\u0010hS6E<G", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LayoutHelper {
    public static final int $stable = 8;
    private final boolean[] bidiProcessedParagraphs;
    private final Layout layout;
    private final List<Bidi> paragraphBidi;
    private final int paragraphCount;
    private final List<Integer> paragraphEnds;
    private char[] tmpBuffer;

    public LayoutHelper(Layout layout) {
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iIndexOf$default = StringsKt.indexOf$default(this.layout.getText(), '\n', length, false, 4, (Object) null);
            length = iIndexOf$default < 0 ? this.layout.getText().length() : iIndexOf$default + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    public final Layout getLayout() {
        return this.layout;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi analyzeBidi(int r11) {
        /*
            r10 = this;
            boolean[] r0 = r10.bidiProcessedParagraphs
            boolean r0 = r0[r11]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r10.paragraphBidi
            java.lang.Object r0 = r0.get(r11)
            java.text.Bidi r0 = (java.text.Bidi) r0
            return r0
        Lf:
            r3 = 0
            if (r11 != 0) goto L63
            r2 = r3
        L13:
            java.util.List<java.lang.Integer> r0 = r10.paragraphEnds
            java.lang.Object r0 = r0.get(r11)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r8 = r1 - r2
            char[] r4 = r10.tmpBuffer
            if (r4 == 0) goto L28
            int r0 = r4.length
            if (r0 >= r8) goto L2a
        L28:
            char[] r4 = new char[r8]
        L2a:
            android.text.Layout r0 = r10.layout
            java.lang.CharSequence r0 = r0.getText()
            android.text.TextUtils.getChars(r0, r2, r1, r4, r3)
            boolean r0 = java.text.Bidi.requiresBidi(r4, r3, r8)
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L4d
            boolean r9 = r10.isRtlParagraph(r11)
            java.text.Bidi r3 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r0 = r3.getRunCount()
            if (r0 != r1) goto L4e
        L4d:
            r3 = r2
        L4e:
            java.util.List<java.text.Bidi> r0 = r10.paragraphBidi
            r0.set(r11, r3)
            boolean[] r0 = r10.bidiProcessedParagraphs
            r0[r11] = r1
            if (r3 == 0) goto L5e
            char[] r0 = r10.tmpBuffer
            if (r4 != r0) goto L61
            r4 = r2
        L5e:
            r10.tmpBuffer = r4
            return r3
        L61:
            r4 = r0
            goto L5e
        L63:
            java.util.List<java.lang.Integer> r1 = r10.paragraphEnds
            int r0 = r11 + (-1)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutHelper.analyzeBidi(int):java.text.Bidi");
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public static /* synthetic */ int getParagraphForOffset$default(LayoutHelper layoutHelper, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return layoutHelper.getParagraphForOffset(i2, z2);
    }

    public final int getParagraphForOffset(int i2, boolean z2) {
        int iBinarySearch$default = CollectionsKt.binarySearch$default(this.paragraphEnds, Integer.valueOf(i2), 0, 0, 6, (Object) null);
        int i3 = iBinarySearch$default < 0 ? -(iBinarySearch$default + 1) : iBinarySearch$default + 1;
        if (z2 && i3 > 0) {
            int i4 = i3 - 1;
            if (i2 == this.paragraphEnds.get(i4).intValue()) {
                return i4;
            }
        }
        return i3;
    }

    public final int getParagraphStart(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return this.paragraphEnds.get(i2 - 1).intValue();
    }

    public final int getParagraphEnd(int i2) {
        return this.paragraphEnds.get(i2).intValue();
    }

    public final boolean isRtlParagraph(int i2) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(i2))) == -1;
    }

    public final float getHorizontalPosition(int i2, boolean z2, boolean z3) {
        int iLineEndToVisibleEnd = i2;
        if (!z3) {
            return getDownstreamHorizontal(iLineEndToVisibleEnd, z2);
        }
        int lineForOffset = LayoutCompat_androidKt.getLineForOffset(this.layout, iLineEndToVisibleEnd, z3);
        int lineStart = this.layout.getLineStart(lineForOffset);
        int lineEnd = this.layout.getLineEnd(lineForOffset);
        if (iLineEndToVisibleEnd != lineStart && iLineEndToVisibleEnd != lineEnd) {
            return getDownstreamHorizontal(iLineEndToVisibleEnd, z2);
        }
        if (iLineEndToVisibleEnd == 0 || iLineEndToVisibleEnd == this.layout.getText().length()) {
            return getDownstreamHorizontal(iLineEndToVisibleEnd, z2);
        }
        int paragraphForOffset = getParagraphForOffset(iLineEndToVisibleEnd, z3);
        boolean zIsRtlParagraph = isRtlParagraph(paragraphForOffset);
        int iLineEndToVisibleEnd2 = lineEndToVisibleEnd(lineEnd, lineStart);
        int paragraphStart = getParagraphStart(paragraphForOffset);
        int i3 = lineStart - paragraphStart;
        int i4 = iLineEndToVisibleEnd2 - paragraphStart;
        Bidi bidiAnalyzeBidi = analyzeBidi(paragraphForOffset);
        Bidi bidiCreateLineBidi = bidiAnalyzeBidi != null ? bidiAnalyzeBidi.createLineBidi(i3, i4) : null;
        boolean z4 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (z2 || zIsRtlParagraph == zIsRtlCharAt) {
                zIsRtlParagraph = !zIsRtlParagraph;
            }
            if (iLineEndToVisibleEnd == lineStart) {
                z4 = zIsRtlParagraph;
            } else if (!zIsRtlParagraph) {
                z4 = true;
            }
            Layout layout = this.layout;
            return z4 ? layout.getLineLeft(lineForOffset) : layout.getLineRight(lineForOffset);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i5 = 0; i5 < runCount; i5++) {
            bidiRunArr[i5] = new BidiRun(bidiCreateLineBidi.getRunStart(i5) + lineStart, bidiCreateLineBidi.getRunLimit(i5) + lineStart, bidiCreateLineBidi.getRunLevel(i5) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i6 = 0; i6 < runCount2; i6++) {
            bArr[i6] = (byte) bidiCreateLineBidi.getRunLevel(i6);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i7 = -1;
        if (iLineEndToVisibleEnd == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    break;
                }
                if (bidiRunArr[i8].getStart() == iLineEndToVisibleEnd) {
                    i7 = i8;
                    break;
                }
                i8++;
            }
            BidiRun bidiRun = bidiRunArr[i7];
            if (z2 || zIsRtlParagraph == bidiRun.isRtl()) {
                zIsRtlParagraph = !zIsRtlParagraph;
            }
            if (i7 == 0 && zIsRtlParagraph) {
                return this.layout.getLineLeft(lineForOffset);
            }
            if (i7 == ArraysKt.getLastIndex(bidiRunArr) && !zIsRtlParagraph) {
                return this.layout.getLineRight(lineForOffset);
            }
            if (zIsRtlParagraph) {
                return this.layout.getPrimaryHorizontal(bidiRunArr[i7 - 1].getStart());
            }
            return this.layout.getPrimaryHorizontal(bidiRunArr[i7 + 1].getStart());
        }
        if (iLineEndToVisibleEnd > iLineEndToVisibleEnd2) {
            iLineEndToVisibleEnd = lineEndToVisibleEnd(iLineEndToVisibleEnd, lineStart);
        }
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                break;
            }
            if (bidiRunArr[i9].getEnd() == iLineEndToVisibleEnd) {
                i7 = i9;
                break;
            }
            i9++;
        }
        BidiRun bidiRun2 = bidiRunArr[i7];
        if (!z2 && zIsRtlParagraph != bidiRun2.isRtl()) {
            zIsRtlParagraph = !zIsRtlParagraph;
        }
        if (i7 == 0 && zIsRtlParagraph) {
            return this.layout.getLineLeft(lineForOffset);
        }
        if (i7 == ArraysKt.getLastIndex(bidiRunArr) && !zIsRtlParagraph) {
            return this.layout.getLineRight(lineForOffset);
        }
        if (zIsRtlParagraph) {
            return this.layout.getPrimaryHorizontal(bidiRunArr[i7 - 1].getEnd());
        }
        return this.layout.getPrimaryHorizontal(bidiRunArr[i7 + 1].getEnd());
    }

    public final int getLineVisibleEnd(int i2) {
        return lineEndToVisibleEnd(this.layout.getLineEnd(i2), this.layout.getLineStart(i2));
    }

    private final float getDownstreamHorizontal(int i2, boolean z2) {
        int iCoerceAtMost = RangesKt.coerceAtMost(i2, this.layout.getLineEnd(this.layout.getLineForOffset(i2)));
        return z2 ? this.layout.getPrimaryHorizontal(iCoerceAtMost) : this.layout.getSecondaryHorizontal(iCoerceAtMost);
    }

    /* JADX INFO: compiled from: LayoutHelper.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\":\u001b\u007f\u0007luA0RqP\u008cXݸ0%ӆ,4RZd\rS?c\u001a\u0016\"7P^kupbZ9D\u001f\n${\u0003,wYޯa\u0012\u001d7\u000bvM=eok:'ӡ7M'@-Py3\u0002`ޙIX}\tOc\f@4\u0007È;\u001b2[\u00122\u00124̄P\u0007$\\uNNH\u001b^j5)\u0003wDf'\u000e1-S\u0013Fb*%v\u0010\"qï6}&3a\u001b\u0007\u0001_o\tM\u0001U\u0007~&U*\u0010\u05ecX~_\u000e$-+}\u000e$ō%%\f_q$'Ya*\u05f6O^7\u0006|\u0014\rj\u0005؝\n-P͓E\u001cl\u000e\u001c:E\u0002aCh\u0002\rFȸ~g>Ѝ=\u00029.G#7`o;1Ne|˿\u0011$+Ч\u0007#a]\u001cgڦ\u001fg"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u001ek;)\u0015u \u0016\u000bb0;\u00070\u001d", "", "AsP?g", "", "3mS", "7rAA_", "", "uH8'\u001c\u001d", "5dc\u0012a+", "u(8", "u(I", "5dc g(Kb", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "BnBAe0GU", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class BidiRun {
        public static final int $stable = 0;
        private final int end;
        private final boolean isRtl;
        private final int start;

        public static /* synthetic */ BidiRun copy$default(BidiRun bidiRun, int i2, int i3, boolean z2, int i4, Object obj) {
            if ((i4 + 1) - (1 | i4) != 0) {
                i2 = bidiRun.start;
            }
            if ((i4 + 2) - (2 | i4) != 0) {
                i3 = bidiRun.end;
            }
            if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
                z2 = bidiRun.isRtl;
            }
            return bidiRun.copy(i2, i3, z2);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final boolean component3() {
            return this.isRtl;
        }

        public final BidiRun copy(int i2, int i3, boolean z2) {
            return new BidiRun(i2, i3, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) obj;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31) + Boolean.hashCode(this.isRtl);
        }

        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }

        public BidiRun(int i2, int i3, boolean z2) {
            this.start = i2;
            this.end = i3;
            this.isRtl = z2;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public final boolean isRtl() {
            return this.isRtl;
        }
    }

    private final int lineEndToVisibleEnd(int i2, int i3) {
        while (i2 > i3 && isLineEndSpace(this.layout.getText().charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    public final BidiRun[] getLineBidiRuns$ui_text_release(int i2) {
        Bidi bidiCreateLineBidi;
        int lineStart = this.layout.getLineStart(i2);
        int lineEnd = this.layout.getLineEnd(i2);
        int paragraphForOffset$default = getParagraphForOffset$default(this, lineStart, false, 2, null);
        int paragraphStart = getParagraphStart(paragraphForOffset$default);
        int i3 = lineStart - paragraphStart;
        int i4 = lineEnd - paragraphStart;
        Bidi bidiAnalyzeBidi = analyzeBidi(paragraphForOffset$default);
        if (bidiAnalyzeBidi == null || (bidiCreateLineBidi = bidiAnalyzeBidi.createLineBidi(i3, i4)) == null) {
            return new BidiRun[]{new BidiRun(lineStart, lineEnd, this.layout.isRtlCharAt(lineStart))};
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i5 = 0; i5 < runCount; i5++) {
            bidiRunArr[i5] = new BidiRun(bidiCreateLineBidi.getRunStart(i5) + lineStart, bidiCreateLineBidi.getRunLimit(i5) + lineStart, bidiCreateLineBidi.getRunLevel(i5) % 2 == 1);
        }
        return bidiRunArr;
    }

    public final boolean isLineEndSpace(char c2) {
        return c2 == ' ' || c2 == '\n' || c2 == 5760 || (Intrinsics.compare((int) c2, 8192) >= 0 && Intrinsics.compare((int) c2, SonyType1MakernoteDirectory.TAG_HDR) <= 0 && c2 != 8199) || c2 == 8287 || c2 == 12288;
    }
}
