package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
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
/* JADX INFO: compiled from: AnnotatedString.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u000eOLш|\u0004O\u00128é6B\r@4\u0012\u000e\u0007njO0L͜P.hS2\u000fq}<$iҕyCAW\"}0\u000fWNmnvJh\u0014K\u000f\f\u0016\u0001j:S]xc\u0012\u00172XoG3SrE9vt>ӌ(288\u0002\u0005\u0007\u001f2H&v\u0003CQ\u0013\u00185V\u0081X\u000b=M3\u0019J\u0007uX:^\u0016mbFLz]R/Q\u0004yTT'm2\u0015Y\u001dNd-\u001dxq\u001eYEe9C(c\u0015\rRiE\u001bK\u0002E\u0015n7);I\"^d\\.\u0017Ʀ/O\u001be3}bӤad\u001a'CO\u0012L`\".w\t\u0005%J\u0014\u0016\u0016-X0=\u001a\u0015\r<7\u000bq\u0002C`\u0016dB\u000e\u0005yD'-\u00109;;+f\u007fhi\u001dd6*\b\u001d4)\u0001|,sd\u001ej%#d{W0a@kT|\u000eo<\u001c\u0007Ͳf\u00028\u0011xX\u000eI\u0014\u0011\\2U=iU;#\u0002\u0001vP.Џ\u0005)wa\u0007jHn@\u001f\u001aEI!\f\tU+ʤk\u0019tfL)Y,\\\u0017\u0004\u0018\u00150\\&]O)>Q\u007flw\re]86_jE|\u0007k<h\u0002~AYio ib|$ALb3Y\u0015F\u0002\u000f\u000b`6DJH\u0019!(\u007fRq$\u0013`P:DBPI%l\u001dX\t.DQ|7`\tl>\u0002\u000572(\u0002$#\n1Tj\u0013\bg'Z\\\u0001nEEA\u007fFaFcH\u0001@\r+\u0017\u0005\u0004\u0002WgznzpDx\u0006\u007f.829\u007f@m\u0017\u001d\"A20>\u000en\u0001\u000eiY\"/\u000b\u0003\n\u0011Kh\\\u00116n\u001f/\u0011nXql\u0017P\b\u000fv1+|\u007f(r\r\u007f\u0010ob5s>w\u000e3]JjP|3Ȕf9\u000f\u001b:|cHs++8\u0010\u0014]&\u0012aw\u0013Fy\u0011 n\u0011s0DcD\u000b\u0013UkWS8wZ/B0F\u0005\u0003pY\u001b{\u0016e!4;D\u0011Gr\u001en8{\u001cu\u0012/\u0016:;\tV\nƥCs\fPF_Xϒ\nͧ\u0014'Y3@eS\u0016ƚ\u001eOj;b\u000f8<\u06030ޫ݁ ?&\te\u0016QF\u0014#06oݥ\u0013\tJ=<4ZM8\u000fQ\n\u0002\u0006>\fFZ(\u0015%hZsiWThI~dS\u001dpUj12\u0011\u0003\u00152.xc=3q\\S]f\tܭU\u009b\r!rʪ\u0017h+9Rc\n-6h\u0019\u000bsny\u001eXԤ\u0006ھ-q\u0004q\u0012J&\u0010m]&!Q]!g\u00076n\red|k%\u0016\u0015U\u0005fĹ\u0003~\u0015\u0010B\u001e\u001d\u001aio\u0001yz;\\V\b=S\u001c\u0011\u0017r05\u0010\u0013bt\u001e\u0004ݣ7ϦAOr̟?}]hI\rX;.)\u001c\u00011dg\u0014v\fm\u001bh\u001b \u001a\u0011\u0005?Wц$\bFLz\t\u0018=XV]\u000bK\u0010#fiq\b#P'Yq4Fag'\r:ؚe߾Y\u0011\u000bϟIX\u007f\u0006;_m\u00185MF\u0013\u0007[ϳ\u0015Y(ǅ)\u0002\u001a-48ߑ\bg1\u0013Uʌ\u0005\u001fjϰ_G"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "", "BdgA", "", "AoP;F;RZ\u0019\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9{Gr.#h\u0012'7C", ">`a.Z9:^\u001cl\nr3|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:[%BTC\u0011", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n\u001c]\f/\rT\u001b*^?\u0005{C\"\u001c2H=\u0015r\u0002\u0012g", "AoP;F;RZ\u0019\rdk\u0015\r\u00106", ">`a.Z9:^\u001cl\nr3|\u0017\u0019rh8\u0003G", "/m]<g(MW#\b\t", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n\u001c]\f/\rT\u001b*^?\u0005{C\"\u001c2H=\u0015r\u00025{#XH\u0018<kVy\u0007z\u0016h\u001d$n}", "5dc\u000ea5Hb\u0015\u000e~h5\u000bG?iy7{S\u0010\u0011$Gv\u000e8\u0005%", "u(;7T=:\u001d)\u000e~euc\r=tU", ":d]4g/", "", "5dc\u0019X5@b\u001c", "u(8", "5dc\u001dT9:U&z\u0006a\u001a\f\u001d6e\u000e", "5dc\u001dT9:U&z\u0006a\u001a\f\u001d6e\u000e\u0012\t)\u0011\u001e\u001e\u0006\u007f\u00126\u0006%Hhw-7t\u0016*[C", "5dc c(GA(\u0013\u0002^:", "5dc c(GA(\u0013\u0002^:f\u0016\u0018u\u0007/:P\u0005\u0011&G\u0003\u001d6\u0004%<Yy.7", "5dc!X?M", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "3pd._:", "", "=sW2e", "5dc", "", "7mS2k", "5dc\u0019\\5D/\"\b\u0005m(\f\r9n\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9t@\u007f+\u0011b\u0007*Fi%2WL\u0011", "AsP?g", "3mS", "5dc g9B\\\u001bZ\u0004g6\f\u0005>i\n1\n", "B`V", "5dc!g:\u001a\\\"\t\nZ;\u0001\u00138s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|K\u0005\u0001>b\b/3|\u001a8V\u0019", "5dc\"e3\u001a\\\"\t\nZ;\u0001\u00138s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9}I}\u0001>b\b/3|\u001a8V\u0019", "6`b\u0012d<:Zt\b\u0004h;x\u00183o\t6", "6`b\u0019\\5D/\"\b\u0005m(\f\r9n\u000e", "6`b g9B\\\u001bZ\u0004g6\f\u0005>i\n1\n", "6`b566=S", ">kd@", "AtQ X8NS\"|z", "@`]4X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "AtQ X8NS\"|z&{\u0012\u0007vtfz", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@\u0001>b\b/3|\u0016-;RHo= j", "AsP?g\u0010GR\u0019\u0012", "3mS\u0016a+>f", "BnBAe0GU", "\u0010tX9W,K", "\u0011n\\=T5B]\"", " `]4X", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnnotatedString implements CharSequence {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<AnnotatedString, ?> Saver = SaversKt.getAnnotatedStringSaver();
    private final List<Range<? extends Object>> annotations;
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;
    private final List<Range<SpanStyle>> spanStylesOrNull;
    private final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedString(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2, List<? extends Range<? extends Object>> list3) {
        List listSortedWith;
        this.text = str;
        this.spanStylesOrNull = list;
        this.paragraphStylesOrNull = list2;
        this.annotations = list3;
        if (list2 == null || (listSortedWith = CollectionsKt.sortedWith(list2, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt.compareValues(Integer.valueOf(((AnnotatedString.Range) t2).getStart()), Integer.valueOf(((AnnotatedString.Range) t3).getStart()));
            }
        })) == null) {
            return;
        }
        int size = listSortedWith.size();
        int end = -1;
        for (int i2 = 0; i2 < size; i2++) {
            Range range = (Range) listSortedWith.get(i2);
            if (range.getStart() < end) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
            if (range.getEnd() > this.text.length()) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + range.getStart() + ", " + range.getEnd() + ") is out of boundary").toString());
            }
            end = range.getEnd();
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i2) {
        return get(i2);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (2 & i2) != 0 ? null : list, (i2 + 4) - (4 | i2) != 0 ? null : list2, (i2 + 8) - (i2 | 8) != 0 ? null : list3);
    }

    public final String getText() {
        return this.text;
    }

    public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text_release() {
        return this.spanStylesOrNull;
    }

    public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text_release() {
        return this.paragraphStylesOrNull;
    }

    public final List<Range<? extends Object>> getAnnotations$ui_text_release() {
        return this.annotations;
    }

    public final List<Range<SpanStyle>> getSpanStyles() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (2 & i2) != 0 ? CollectionsKt.emptyList() : list, (i2 + 4) - (i2 | 4) != 0 ? CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnnotatedString(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2) {
        List<Range<SpanStyle>> list3 = list;
        List<Range<ParagraphStyle>> list4 = list2;
        this(str, list3.isEmpty() ? null : list3, list4.isEmpty() ? null : list4, null);
    }

    public int getLength() {
        return this.text.length();
    }

    public char get(int i2) {
        return this.text.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public AnnotatedString subSequence(int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException(("start (" + i2 + ") should be less or equal to end (" + i3 + ')').toString());
        }
        if (i2 == 0 && i3 == this.text.length()) {
            return this;
        }
        String strSubstring = this.text.substring(i2, i3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new AnnotatedString(strSubstring, AnnotatedStringKt.filterRanges(this.spanStylesOrNull, i2, i3), AnnotatedStringKt.filterRanges(this.paragraphStylesOrNull, i2, i3), AnnotatedStringKt.filterRanges(this.annotations, i2, i3));
    }

    /* JADX INFO: renamed from: subSequence-5zc-tL8 */
    public final AnnotatedString m5974subSequence5zctL8(long j2) {
        return subSequence(TextRange.m6121getMinimpl(j2), TextRange.m6120getMaximpl(j2));
    }

    public final AnnotatedString plus(AnnotatedString annotatedString) {
        Builder builder = new Builder(this);
        builder.append(annotatedString);
        return builder.toAnnotatedString();
    }

    public final List<Range<String>> getStringAnnotations(String str, int i2, int i3) {
        ArrayList arrayListEmptyList;
        List<Range<? extends Object>> list = this.annotations;
        if (list == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Range<? extends Object> range = list.get(i4);
                Range<? extends Object> range2 = range;
                if ((range2.getItem() instanceof String) && Intrinsics.areEqual(str, range2.getTag()) && AnnotatedStringKt.intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
            arrayListEmptyList = arrayList;
        }
        Intrinsics.checkNotNull(arrayListEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return arrayListEmptyList;
    }

    public final boolean hasStringAnnotations(String str, int i2, int i3) {
        List<Range<? extends Object>> list = this.annotations;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Range<? extends Object> range = list.get(i4);
            if ((range.getItem() instanceof String) && Intrinsics.areEqual(str, range.getTag()) && AnnotatedStringKt.intersect(i2, i3, range.getStart(), range.getEnd())) {
                return true;
            }
        }
        return false;
    }

    public final List<Range<String>> getStringAnnotations(int i2, int i3) {
        ArrayList arrayListEmptyList;
        List<Range<? extends Object>> list = this.annotations;
        if (list == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Range<? extends Object> range = list.get(i4);
                Range<? extends Object> range2 = range;
                if ((range2.getItem() instanceof String) && AnnotatedStringKt.intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
            arrayListEmptyList = arrayList;
        }
        Intrinsics.checkNotNull(arrayListEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return arrayListEmptyList;
    }

    public final List<Range<TtsAnnotation>> getTtsAnnotations(int i2, int i3) {
        ArrayList arrayListEmptyList;
        List<Range<? extends Object>> list = this.annotations;
        if (list == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Range<? extends Object> range = list.get(i4);
                Range<? extends Object> range2 = range;
                if ((range2.getItem() instanceof TtsAnnotation) && AnnotatedStringKt.intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
            arrayListEmptyList = arrayList;
        }
        Intrinsics.checkNotNull(arrayListEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return arrayListEmptyList;
    }

    @Deprecated(message = "\u0018Y\u0001t]}#b9U6\nd\u0016@WkZH\btQK[\u0005Y\u0003oOx", replaceWith = @ReplaceWith(expression = "getLinkAnnotations(start, end)", imports = {}))
    @InterfaceC1492Gx
    public final List<Range<UrlAnnotation>> getUrlAnnotations(int i2, int i3) {
        ArrayList arrayListEmptyList;
        List<Range<? extends Object>> list = this.annotations;
        if (list == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Range<? extends Object> range = list.get(i4);
                Range<? extends Object> range2 = range;
                if ((range2.getItem() instanceof UrlAnnotation) && AnnotatedStringKt.intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
            arrayListEmptyList = arrayList;
        }
        Intrinsics.checkNotNull(arrayListEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return arrayListEmptyList;
    }

    public final List<Range<LinkAnnotation>> getLinkAnnotations(int i2, int i3) {
        ArrayList arrayListEmptyList;
        List<Range<? extends Object>> list = this.annotations;
        if (list == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Range<? extends Object> range = list.get(i4);
                Range<? extends Object> range2 = range;
                if ((range2.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
            arrayListEmptyList = arrayList;
        }
        Intrinsics.checkNotNull(arrayListEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return arrayListEmptyList;
    }

    public final boolean hasLinkAnnotations(int i2, int i3) {
        List<Range<? extends Object>> list = this.annotations;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Range<? extends Object> range = list.get(i4);
            if ((range.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(i2, i3, range.getStart(), range.getEnd())) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        return Intrinsics.areEqual(this.text, annotatedString.text) && Intrinsics.areEqual(this.spanStylesOrNull, annotatedString.spanStylesOrNull) && Intrinsics.areEqual(this.paragraphStylesOrNull, annotatedString.paragraphStylesOrNull) && Intrinsics.areEqual(this.annotations, annotatedString.annotations);
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<Range<ParagraphStyle>> list2 = this.paragraphStylesOrNull;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Range<? extends Object>> list3 = this.annotations;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    public final boolean hasEqualAnnotations(AnnotatedString annotatedString) {
        return Intrinsics.areEqual(this.annotations, annotatedString.annotations);
    }

    /* JADX INFO: compiled from: AnnotatedString.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&˛\bDRш|\u0004G\u00068\u000b<H\u0007\"2\u0013\u007f\u0007tvA0JsP.`\\2\u000fq}:ša:ڎk=[ڼ\f!9O|g(\fPn\u001bG\u001d\u0007.x!ߚYY\u0007_*\u000f`E\u007fCAQ\b=gcҽ:\u0005.7b[\n\t\u000f\u001bBHF͌\u000bGY\u000e*0nsJV\u001bQ\u001d\u001a@\tN$\u000f$tg|=Ղp]H7k\u000fwSf'\u0016ܞCָ\u000eТX'\u001b\u0003*%9RO5C(\u001aϏ\b\u001bbM\u0016Wqk\b/Ү(sP\u0002kNX.\u001b[܇PU\u0018\u0001;t\u000bab\u001c'aՒ\u0012֟\u0001\u0014.w\t|%<:\u05fa6-N.;\u001c~\b<6%xY@^\u0006vB.}\u0012<\u001d%\u000e9C9Im\u0018Ŭ:ϭR7\n\u001bU/1\u0018\u0007!\nl>f#4lyg0\u007f@\u0004̇OR`K\b\u001cp\u0011\u0005p̍/\u0010\u0007=\u0017).E,}ښ8s0y\u0006`D\u0016yݶdn[֟jJF+| \b;\u0017\rrD\u001bʍ\u07fbT\\`,\u001fZ4V\r\t\u0016\u001fpk\u0006>9%>Qћlorܔu\f+=tA*}y\u0014o9\r:̳Ui\u0018Рjx\u001aNJrۜ\\\u0003"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\"", "", "7sT:", "AsP?g", "", "3mS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_$D\b", "B`V", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_$g\u001c\u0013XkWCr.7#k/Dq\u001f0#\u0007,", "5dc\u0012a+", "u(8", "5dc\u0016g,F", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "5dc g(Kb", "5dc!T.", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_$g\u001c\u0013XkWCr.7#k/Dq\u001f0#\u0007\"g=\u001d\"re8\u001a-*X~2QZNulV<L\u0014%iW*4\u0016\u000fh=3nC%.\u00150R\u0004yU|\u0015\u0018\u000e\u000b", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Range<T> {
        public static final int $stable = 0;
        private final int end;
        private final T item;
        private final int start;
        private final String tag;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range copy$default(Range range, Object obj, int i2, int i3, String str, int i4, Object obj2) {
            if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
                obj = range.item;
            }
            if ((i4 + 2) - (2 | i4) != 0) {
                i2 = range.start;
            }
            if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
                i3 = range.end;
            }
            if ((i4 + 8) - (i4 | 8) != 0) {
                str = range.tag;
            }
            return range.copy(obj, i2, i3, str);
        }

        public final T component1() {
            return this.item;
        }

        public final int component2() {
            return this.start;
        }

        public final int component3() {
            return this.end;
        }

        public final String component4() {
            return this.tag;
        }

        public final Range<T> copy(T t2, int i2, int i3, String str) {
            return new Range<>(t2, i2, i3, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            return Intrinsics.areEqual(this.item, range.item) && this.start == range.start && this.end == range.end && Intrinsics.areEqual(this.tag, range.tag);
        }

        public int hashCode() {
            T t2 = this.item;
            return ((((((t2 == null ? 0 : t2.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public Range(T t2, int i2, int i3, String str) {
            this.item = t2;
            this.start = i2;
            this.end = i3;
            this.tag = str;
            if (i2 > i3) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public final int getEnd() {
            return this.end;
        }

        public final T getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        public final String getTag() {
            return this.tag;
        }

        public Range(T t2, int i2, int i3) {
            this(t2, i2, i3, "");
        }
    }

    /* JADX INFO: compiled from: AnnotatedString.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яċ\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.P\u000b*ܥ\u001aw\u001dfr96DmH<X[*\u0015k\u000442z,qY;]\u001a\f̝\u0011OTion`Z\u0013¼\u0017\u0006,xrߚQU\u000f]\u001a\u000fHBwЀ;M}=Aś|6\u001b :\">z\r\u00010*P\u0010|\u007fKK\"\u00128@v:Z\rc\u0005\"\u0012\f>(\u0001,foNDSt]@2+\u0003\u007fBV'e5\u0003R#Ͽ\u0005+;uJ\u001e\n@o4Ne`\t\u001bb_M\u0004Wqk\u0007ص+'9L4d<l\u0010\u0018#,g\r\fv͉`\u0005_eL4;UiK^\u0014@w)\u0003Ɂ@\u0004\u001c\u000eod<D2f6&cx\u0001lXP0xr\u0004\t|N\u0017S\u0007c/G7~Q\u0010BajE\u0013\u001d\rL;1r/xl\u000e\u000f3KX\u0006lIQnDxR\u0018uUm2w+&8#HG.G,\u0015<7=7\n;S%y#`D\u0016x5dvn\u0002RvGRr$SB\t:a\r\u0001\u0013\u000ehT\u0007DAQ*w\u001f}6$P`\u0006W9%>U\u007flw\u0007e]8,w\u0003E{\u0007k<oibAXic>t\u0003z\"ZTb3_\u0017Fa(r\\V)zfx4\u0010{rf<\u0017@d\n\u001cbRa\u001dj0`\u0003LIq\u0001\u0017{rh>\u0006\u001b8l!wK\r\t/h\rt}\u0010\u0011IZ&\u0011&;\\i5G-\u0006&vP\u0015#5\u0006:\u0005\u0010sZqdlD\u000e\u0006\u007f.\u001729\u007f3\u0006/\u001d)A20EuP\u0001fiM@++\u0001\b*Sh\\n8n~HxjxV\u001d%0!vrQΨ\u0015\u0004\b\r^zu\u0010\u001b\u001f$NW\u001d\u001bYjѾh\u0003\u0013 6'\u0017nP*{A\fG+@\u0010\u0014]֒\u0012cwpF{x\u000eT\"\u0016\b:~.o\u0011X\u000e6ITaY-Eh85\u000fPr\u0003w6Z98\u001b4`A\u0013r\u001fK[9G}\u0015\u001f\\\u0011~\u0002s:A\u001cD9ˀc*ymF\u0018lr=\u0011{k0y{zt\u000bx':\u000f\na\u0007\u0012JDhbe\u0014!04zH:Omz\u0005j<lH:p \u000bq[\u001a\n\u001e\u001b\u0018F\u000e\u0011G6P\u0015SV<VAhd}\u001d`sgQ.\u000f\"'3L\n}=\u0013#^T]jb\u0005a@!\u001b\u0019bGr3a\\Tg\"X\\\u000f0]]qoJD\u0012~Am\u001av<<&%5BFD\u007fVYc\u0005hv\u000b\u0004h\u001f~\u0005\u001b~`^,9\u0007\u000b\u0001\u0014;\u001a\u000f9%}}\u001el\u0004َPߺ;C\"݅gS7\u0014$|\u0012MQqޅ91UKp\"5\u000b(kI\u000e ,0/\u0014z1^g\u000e\u0015\u001b\f&h Hзd֒\r\u0013X܀TFX\u0007\u000b\u0016>\u0010FU\u00125\u0012\u0013\rl\u001a\u0003OJ}ߟnތFKpǍZ}zw\u0007c\u001b\rv9f}t,`\u001d73{9Ab1ϓ\u0013\u05c9$X\u0019֧d%4 N\f\u0011>xOB~GդQܣ\u0011+7մ˴ek"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*\u0011.\u0019o`9\u00149", "\u001aiPCTuEO\"\u0001D:7\b\t8d{%\u0003@V", "\u001aj^A_0G\u001d(~\u000emuX\u0014:e\t'w=\b\u0017l", "BdgA", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\na\u0006", "1`_.V0Mg", "", "uH\u0018#", "/m]<g(MW#\b\t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*\u0011.\u0019o`9\u0014\"\u0014^\u0006#DSN\u0019X[t=i", "", ":d]4g/", "5dc\u0019X5@b\u001c", "u(8", ">`a.Z9:^\u001cl\nr3|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:[%BTC\u0011", "AoP;F;RZ\u0019\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9{Gr.#h\u0012'7C", "Ash9X\u001aMO\u0017\u0005", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", "/cS\u0019\\5D", "", "1kX0^(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9t@\u007f+\u0011b\u0007*Fi%2WLyI;\"\u0013n]6\u000ec\u0002", "AsP?g", "3mS", "Cq[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9t@\u007f+\u0011b\u0007*Fi%2WLy[A%j", "/cS g9B\\\u001bZ\u0004g6\f\u0005>i\n1", "B`V", "/m]<g(MW#\b", "/cS g@ES", "Ash9X", "/cS!g:\u001a\\\"\t\nZ;\u0001\u00138", "Bsb\u000ea5Hb\u0015\u000e~h5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|K\u0005\u0001>b\b/3|\u001a8V\u0019", "/cS\"e3\u001a\\\"\t\nZ;\u0001\u00138", "Cq[\u000ea5Hb\u0015\u000e~h5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9}I}\u0001>b\b/3|\u001a8V\u0019", "/o_2a+", "1gP?", "", "", "2d_?X*:b\u0019}tZ7\b\t8dy5{O\u0011$ Kx\u00106\b/9X", ">n_", "7mS2k", ">tb5?0GY", ":h]8", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9t@\u007f+\u0011b\u0007*Fi%2WL\u0011", ">tb5F;KW\"\u0001Vg5\u0007\u0018+t\u00042\u0005", ">tb5F;RZ\u0019", ">tb5G;L/\"\b\u0005m(\f\r9n", ">tb5H9E/\"\b\u0005m(\f\r9n", "Bn0;a6MO(~yL;\n\r8g", "\u001btc.U3>@\u0015\b|^", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder implements Appendable {
        public static final int $stable = 8;
        private final List<MutableRange<? extends Object>> annotations;
        private final List<MutableRange<ParagraphStyle>> paragraphStyles;
        private final List<MutableRange<SpanStyle>> spanStyles;
        private final List<MutableRange<? extends Object>> styleStack;
        private final StringBuilder text;

        public Builder() {
            this(0, 1, null);
        }

        public Builder(int i2) {
            this.text = new StringBuilder(i2);
            this.spanStyles = new ArrayList();
            this.paragraphStyles = new ArrayList();
            this.annotations = new ArrayList();
            this.styleStack = new ArrayList();
        }

        public /* synthetic */ Builder(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? 16 : i2);
        }

        /* JADX INFO: compiled from: AnnotatedString.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я0\u001d<K!&˛\bDRш|\u0004G\u00068\u000b<H\u0007\"2\u0012\u007f\u0007tvA0JuP.`\\2\u000fq|<$q$yCAV ԅ(\u001fѧvimñXY;C=\u0006V z0WV\u0011]HƁBF}AKM\u001e@Ifz6\u0013$J\"f|\u0015\u0007 *V\u0015\u000fzqQë\u00160Nw\u0003^\u001b_\u001d\u001aHß\u0005ů\u0002ɉ`g\\C\u0011skMG#1l\tľ((7\u000ba%F\u0003*Sȿbf2NLM\u0015SYIߞS$y\u0011U\nC\u0015j7'aɞ\"Ɏf^\u0006\u0014#,g\r\u0014öVb\u000bQn\u000e?+}f{V\u0014(\u0006~\u0014\rj\u0007>\f-H<22f6\u0014yІqՂDP\u0010u\u000b\u0011\tyN\u0017S\u0019c1G5~Sw:GN}߽\u0006U%1\u001c\u0007!\nWT\u0602\u0014ch\u0006mIWP?XN@ԯk\u000b4vh\u00028\"HG.2D\u0018<6=7\n?iހjR`Rk\u000f\u0005\u000fk*֦^͕D.vݫO,\u000f\u0014hM\u0005\u0007qZbc|\"[\u001dl\u00074ܱ˙$d\u007f</3(PUtww\u001el\u0018'Gfe\\ˇo\u0014_ުv5;`q\u00192a\u0005\u0019W<\u0011\u000bֽjH[ێr^.2@Yу\u0014\u0018"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*\u0011.\u0019o`9\u0014\"\u0014^\u0006#DSN\u0019X[t=i", "\"", "", "7sT:", "AsP?g", "", "3mS", "B`V", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_$g\u001c\u0013XkWCr.7#k/Dq\u001f0#\u0007,", "5dc\u0012a+", "u(8", "Adc\u0012a+", "uH\u0018#", "5dc\u0016g,F", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "5dc g(Kb", "5dc!T.", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_$g\u001c\u0013XkWCr.7#k/Dq\u001f0#\u0007\"g=\u001d\"re8\u001a-*X~2QZNulV<L\u0014%iW*4\u0016\u000fh=3nC%.\u00150R\u0004yE\u0011\u0010\u001d\r5w/*f\u001fCv\u001cu.%qHY5", "3pd._:", "", "=sW2e", "6`b566=S", "BnA.a.>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "2dU.h3M3\"}", "BnBAe0GU", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        private static final class MutableRange<T> {
            private int end;
            private final T item;
            private final int start;
            private final String tag;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MutableRange copy$default(MutableRange mutableRange, Object obj, int i2, int i3, String str, int i4, Object obj2) {
                if ((i4 + 1) - (1 | i4) != 0) {
                    obj = mutableRange.item;
                }
                if ((2 & i4) != 0) {
                    i2 = mutableRange.start;
                }
                if ((4 & i4) != 0) {
                    i3 = mutableRange.end;
                }
                if ((i4 + 8) - (i4 | 8) != 0) {
                    str = mutableRange.tag;
                }
                return mutableRange.copy(obj, i2, i3, str);
            }

            public final T component1() {
                return this.item;
            }

            public final int component2() {
                return this.start;
            }

            public final int component3() {
                return this.end;
            }

            public final String component4() {
                return this.tag;
            }

            public final MutableRange<T> copy(T t2, int i2, int i3, String str) {
                return new MutableRange<>(t2, i2, i3, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) obj;
                return Intrinsics.areEqual(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && Intrinsics.areEqual(this.tag, mutableRange.tag);
            }

            public int hashCode() {
                T t2 = this.item;
                return ((((((t2 == null ? 0 : t2.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            public MutableRange(T t2, int i2, int i3, String str) {
                this.item = t2;
                this.start = i2;
                this.end = i3;
                this.tag = str;
            }

            public final T getItem() {
                return this.item;
            }

            public final int getStart() {
                return this.start;
            }

            public final int getEnd() {
                return this.end;
            }

            public final void setEnd(int i2) {
                this.end = i2;
            }

            public /* synthetic */ MutableRange(Object obj, int i2, int i3, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i2, (-1) - (((-1) - i4) | ((-1) - 4)) != 0 ? Integer.MIN_VALUE : i3, (i4 & 8) != 0 ? "" : str);
            }

            public final String getTag() {
                return this.tag;
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, int i2, int i3, Object obj) {
                if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
                    i2 = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(i2);
            }

            public final Range<T> toRange(int i2) {
                int i3 = this.end;
                if (i3 != Integer.MIN_VALUE) {
                    i2 = i3;
                }
                if (i2 == Integer.MIN_VALUE) {
                    throw new IllegalStateException("Item.end should be set first".toString());
                }
                return new Range<>(this.item, this.start, i2, this.tag);
            }
        }

        public Builder(String str) {
            this(0, 1, null);
            append(str);
        }

        public Builder(AnnotatedString annotatedString) {
            this(0, 1, null);
            append(annotatedString);
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void append(String str) {
            this.text.append(str);
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence charSequence) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence);
            } else {
                this.text.append(charSequence);
            }
            return this;
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence charSequence, int i2, int i3) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence, i2, i3);
            } else {
                this.text.append(charSequence, i2, i3);
            }
            return this;
        }

        @Override // java.lang.Appendable
        public Builder append(char c2) {
            this.text.append(c2);
            return this;
        }

        public final void append(AnnotatedString annotatedString) {
            int length = this.text.length();
            this.text.append(annotatedString.getText());
            List<Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
            if (spanStylesOrNull$ui_text_release != null) {
                int size = spanStylesOrNull$ui_text_release.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i2);
                    addStyle(range.getItem(), range.getStart() + length, range.getEnd() + length);
                }
            }
            List<Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
            if (paragraphStylesOrNull$ui_text_release != null) {
                int size2 = paragraphStylesOrNull$ui_text_release.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Range<ParagraphStyle> range2 = paragraphStylesOrNull$ui_text_release.get(i3);
                    addStyle(range2.getItem(), range2.getStart() + length, range2.getEnd() + length);
                }
            }
            List<Range<? extends Object>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
            if (annotations$ui_text_release != null) {
                int size3 = annotations$ui_text_release.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    Range<? extends Object> range3 = annotations$ui_text_release.get(i4);
                    this.annotations.add(new MutableRange<>(range3.getItem(), range3.getStart() + length, range3.getEnd() + length, range3.getTag()));
                }
            }
        }

        public final void append(AnnotatedString annotatedString, int i2, int i3) {
            int length = this.text.length();
            this.text.append((CharSequence) annotatedString.getText(), i2, i3);
            List localSpanStyles = AnnotatedStringKt.getLocalSpanStyles(annotatedString, i2, i3);
            if (localSpanStyles != null) {
                int size = localSpanStyles.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Range range = (Range) localSpanStyles.get(i4);
                    addStyle((SpanStyle) range.getItem(), range.getStart() + length, range.getEnd() + length);
                }
            }
            List localParagraphStyles = AnnotatedStringKt.getLocalParagraphStyles(annotatedString, i2, i3);
            if (localParagraphStyles != null) {
                int size2 = localParagraphStyles.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    Range range2 = (Range) localParagraphStyles.get(i5);
                    addStyle((ParagraphStyle) range2.getItem(), range2.getStart() + length, range2.getEnd() + length);
                }
            }
            List localAnnotations = AnnotatedStringKt.getLocalAnnotations(annotatedString, i2, i3);
            if (localAnnotations != null) {
                int size3 = localAnnotations.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    Range range3 = (Range) localAnnotations.get(i6);
                    this.annotations.add(new MutableRange<>(range3.getItem(), range3.getStart() + length, range3.getEnd() + length, range3.getTag()));
                }
            }
        }

        public final void addStyle(SpanStyle spanStyle, int i2, int i3) {
            this.spanStyles.add(new MutableRange<>(spanStyle, i2, i3, null, 8, null));
        }

        public final void addStyle(ParagraphStyle paragraphStyle, int i2, int i3) {
            this.paragraphStyles.add(new MutableRange<>(paragraphStyle, i2, i3, null, 8, null));
        }

        public final void addStringAnnotation(String str, String str2, int i2, int i3) {
            this.annotations.add(new MutableRange<>(str2, i2, i3, str));
        }

        public final void addTtsAnnotation(TtsAnnotation ttsAnnotation, int i2, int i3) {
            this.annotations.add(new MutableRange<>(ttsAnnotation, i2, i3, null, 8, null));
        }

        @Deprecated(message = "\u0018Y\u0001t]}#b9U6\nd\u0016@WkZH\btQKX\u0006X.vW\u0003/y(UrUaai=", replaceWith = @ReplaceWith(expression = "addLink(, start, end)", imports = {}))
        @InterfaceC1492Gx
        public final void addUrlAnnotation(UrlAnnotation urlAnnotation, int i2, int i3) {
            this.annotations.add(new MutableRange<>(urlAnnotation, i2, i3, null, 8, null));
        }

        public final void addLink(LinkAnnotation.Url url, int i2, int i3) {
            this.annotations.add(new MutableRange<>(url, i2, i3, null, 8, null));
        }

        public final void addLink(LinkAnnotation.Clickable clickable, int i2, int i3) {
            this.annotations.add(new MutableRange<>(clickable, i2, i3, null, 8, null));
        }

        public final int pushStyle(SpanStyle spanStyle) {
            MutableRange<SpanStyle> mutableRange = new MutableRange<>(spanStyle, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.spanStyles.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(ParagraphStyle paragraphStyle) {
            MutableRange<ParagraphStyle> mutableRange = new MutableRange<>(paragraphStyle, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.paragraphStyles.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStringAnnotation(String str, String str2) {
            MutableRange<? extends Object> mutableRange = new MutableRange<>(str2, this.text.length(), 0, str, 4, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushTtsAnnotation(TtsAnnotation ttsAnnotation) {
            MutableRange<? extends Object> mutableRange = new MutableRange<>(ttsAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @Deprecated(message = "\u0018Y\u0001t]}#b9U6\nd\u0016@WkZH\btQKX\u0006X.vW\u0003/y(UrUaai=", replaceWith = @ReplaceWith(expression = "pushLink(, start, end)", imports = {}))
        @InterfaceC1492Gx
        public final int pushUrlAnnotation(UrlAnnotation urlAnnotation) {
            MutableRange<? extends Object> mutableRange = new MutableRange<>(urlAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushLink(LinkAnnotation linkAnnotation) {
            MutableRange<? extends Object> mutableRange = new MutableRange<>(linkAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final void pop() {
            if (this.styleStack.isEmpty()) {
                throw new IllegalStateException("Nothing to pop.".toString());
            }
            this.styleStack.remove(r1.size() - 1).setEnd(this.text.length());
        }

        public final void pop(int i2) {
            if (i2 >= this.styleStack.size()) {
                throw new IllegalStateException((i2 + " should be less than " + this.styleStack.size()).toString());
            }
            while (this.styleStack.size() - 1 >= i2) {
                pop();
            }
        }

        public final AnnotatedString toAnnotatedString() {
            String string = this.text.toString();
            List<MutableRange<SpanStyle>> list = this.spanStyles;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(list.get(i2).toRange(this.text.length()));
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            ArrayList arrayList3 = arrayList2;
            List<MutableRange<ParagraphStyle>> list2 = this.paragraphStyles;
            ArrayList arrayList4 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList4.add(list2.get(i3).toRange(this.text.length()));
            }
            ArrayList arrayList5 = arrayList4;
            if (arrayList5.isEmpty()) {
                arrayList5 = null;
            }
            ArrayList arrayList6 = arrayList5;
            List<MutableRange<? extends Object>> list3 = this.annotations;
            ArrayList arrayList7 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                arrayList7.add(list3.get(i4).toRange(this.text.length()));
            }
            ArrayList arrayList8 = arrayList7;
            return new AnnotatedString(string, arrayList3, arrayList6, arrayList8.isEmpty() ? null : arrayList8);
        }
    }

    /* JADX INFO: compiled from: AnnotatedString.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\blʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$B\\IV2\b2\u000b_N\u0016j~J`\fq\u0011و\u001a~rߚaW~a \u0014̙Fu"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*\u0012(\u001ds]B\u000bm5$", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "5dc T=>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005!FYy\u001d>m_\u001cIT;x\n", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<AnnotatedString, ?> getSaver() {
            return AnnotatedString.Saver;
        }
    }
}
