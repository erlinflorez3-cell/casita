package com.dynatrace.agent.view;

import com.dynatrace.agent.events.enrichment.EventKeys;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4B\u0007\":\u0018\u007f\u0007lnA0RnP\u008cZS@\u000fs{:Bc$\u007fOCU }(ޜUdʴ\u0006\u001ezZ9BG\u0005E9D<Mcxu\u0012=3RsM5eok:pxD\b82P<\n\t\u000f\u001fBH>z\u000bGY\u0012*0ntJV\u001bT\u001d\u001a@\nN$\u000f&tg|:XpkCG#1mRR5iH|{\u0018V\\-\r\u0005m6-V6c\"ȏW\u0005\r`iNKC\u007f[\u001dhU4sP\u0002vNX.\u0015[܇PUd\u0001Ft\u0005\u007faR˳,\u0018jYq&(&~Bɥ=L\u0015\u0014I`.[\u001e-ۣ\u000f{{\u0001vXP0b\tɜ{*=%I\u00183Y=aǟR*B'sO{3\u0011dƇ\u00027(iz&`C\u001f\u001bɴRyXNd`N8d\u0004Ѯ\u00059k\u0010R\u001c2]~]\tWҋ\u0018m%ib;!\u001aȵxJmv\u0013`\u0001S\u0018SxF(n$9B\t:[tj\u000bk^Wp,?QLZ\r}\u0016\u00188\\&@Q+\u0016N]n\u0002j{a:+5fE`\u0007k<[id95_k(a\u0001zDEBb\u0013a~B\u0002\u0010\u000bb.\"@R\u0003\u0010&\u0007tV\u0012\u0013@K\n\u001eJ+_&#İGK/Pk\u0015\t\u000ee\u0019\u0016\r\u007fK&\u0019hRsOʭQ%w}\u0014\u0011IZ\u0001'Ō,\nXCF>UP\u0017zŁ\"W\u000e\u0002\u007f_gzHƥp\u001c}ɝ\u0014\"\u001c*Gb\u007fL!\u0011\u0017)`\u0003βIRzόiO\u00189\t\u000eJ\u001eIkFg6nҔ0fr\u07bagV\u001d5\u0005rC2\u0016i\u0018y\u0010JیKi\\ެs@O\b\u0011m\r]F\u0003\u001d\u001fL)˽s(\u0005ކEE-3$\fd>#hui\u001e2ԃf\u0015.۩}\u00062z$\u00043`k:S8w]˽B(,З\u001bDN\u0003\u0006\u001c\u0013\u0018B\u0016KHohވZ>UߒG\u007fl :!AeiD+o,?ˀc0{ʕ\u0016\u0016d]3,\u001eduy\u0006Mr\nx\u001cϻ\u000f\u00029ޫ*\u001eC<dtū\r`"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0012\u001b\u0017Y9~@v7#i\u0006(3z*\u0004", "", "AsP?g\u001bB[\u0019", "", "2ta.g0H\\", "3qa<e\nHc\"\u000e", "", "3qa<e\fQQ\u0019\n\nb6\u0006f9u\t7", "3qa<e\u000fMb$M\u000eq\n\u0007\u00198t", "3qa<e\u000fMb$N\u000eq\n\u0007\u00198t", "3qa<e\u000fMb$h\na,\nf9u\t7", "3qa<e\u0019>_)~\tm\u0016\f\f/r]2\fI\u0010", "6`b\u0010e(LV", "", "4hT9W:", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "\nh]6g\u0005", "uI9\u0016<\u0010\"7|sah9~R4s\n1E%n\u0001\u007f1l\u0013<t4\u000b\u001dn", "5dc g(Kb\b\u0003\u0003^", "u(9", "5dc\u0011h9:b\u001d\t\u0004", "5dc\u0012e9H`v\t\u000bg;", "u(8", "5dc\u0012e9H`x\u0012x^7\f\r9n]2\fI\u0010", "5dc\u0012e9H`{\u000e\niz\u0010\u001c\ro\u00101\u000b", "5dc\u0012e9H`{\u000e\ni{\u0010\u001c\ro\u00101\u000b", "5dc\u0012e9H`{\u000e\ni\u0016\f\f/r]2\fI\u0010", "5dc\u0012e9H`\u0006~\u0007n,\u000b\u0018\u0019t\u0003(\t\u001e\u000b' V", "5dc\u0015T:\u001c`\u0015\r}", "u(I", "5dc\u0013\\,ER'", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "Bn9@b5", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n\\=b5>\\(JE", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "BnBAe0GU", "", "$hTDF<F[\u0015\f\u000fD,\u0011\u0017", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ViewSummary {
    public static final String COUNT = "error.count";
    private static final String ERROR_NAMESPACE = "error.";
    public static final String EXCEPTION_COUNT = "error.exception_count";
    public static final String HAS_CRASH = "error.has_crash";
    public static final String HTTP_4XX_COUNT = "error.http_4xx_count";
    public static final String HTTP_5XX_COUNT = "error.http_5xx_count";
    public static final String HTTP_OTHER_COUNT = "error.http_other_count";
    public static final String REQUEST_OTHER_COUNT = "error.request_other_count";
    public static final ViewSummaryKeys ViewSummaryKeys = new ViewSummaryKeys(null);
    private final long duration;
    private final int errorCount;
    private final int errorExceptionCount;
    private final int errorHttp4xxCount;
    private final int errorHttp5xxCount;
    private final int errorHttpOtherCount;
    private final int errorRequestOtherCount;
    private final JSONObject fields;
    private final boolean hasCrash;
    private final long startTime;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005(2ߡx\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޞ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰\u0013{M8eok<7ҡ\tӯ$2*\u0600J\u0011\u000f BH>yQŖ\u001eë\u00160H\u0081\u000b^\u001bT\u001d\u001a@\t\u0015įSɉ`gVȤ\u0019xkBG#1l\u0019þyۢ4|Uε\u0017`5\u0016\u000faL.\u0017ˁ\bչ)S\u000bޗ#gM\rWqk\b?ѮyȅMs_̬ނ\u0004\u001f"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0012\u001b\u0017Y9~@v7#i\u0006(3z*l>G;}\".\u001dp]F\u001bI,b\u0005|", "", "\nh]6g\u0005", "u(E", "\u0013QA\u001cE&'/\u0001^hI\bZh", "", "\u0011ND\u001bG", "\u0013W2\u0012C\u001b\"=\u0002xXH\u001cew", "\u0016SC\u001dRz1F\u0013\\dN\u0015k", "\u0016SC\u001dR{1F\u0013\\dN\u0015k", "\u0016SC\u001dR\u0016-6xkt<\u0016lq\u001e", " D@\"8\u001a-M\u0003m]>\u0019vf\u0019Uh\u0017", "\u0016@B,6\u0019\u001aA{", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class ViewSummaryKeys {
        private ViewSummaryKeys() {
        }

        public /* synthetic */ ViewSummaryKeys(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ViewSummary(long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, JSONObject jSONObject) {
        this.startTime = j2;
        this.duration = j3;
        this.errorCount = i2;
        this.errorExceptionCount = i3;
        this.errorHttp4xxCount = i4;
        this.errorHttp5xxCount = i5;
        this.errorHttpOtherCount = i6;
        this.errorRequestOtherCount = i7;
        this.hasCrash = z2;
        this.fields = jSONObject;
    }

    public /* synthetic */ ViewSummary(long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, JSONObject jSONObject, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, i2, i3, i4, i5, i6, i7, z2, (i8 + 512) - (i8 | 512) != 0 ? null : jSONObject);
    }

    public static /* synthetic */ ViewSummary copy$default(ViewSummary viewSummary, long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, JSONObject jSONObject, int i8, Object obj) {
        if ((-1) - (((-1) - i8) | ((-1) - 1)) != 0) {
            j2 = viewSummary.startTime;
        }
        if ((i8 + 2) - (2 | i8) != 0) {
            j3 = viewSummary.duration;
        }
        if ((-1) - (((-1) - i8) | ((-1) - 4)) != 0) {
            i2 = viewSummary.errorCount;
        }
        if ((i8 + 8) - (8 | i8) != 0) {
            i3 = viewSummary.errorExceptionCount;
        }
        if ((i8 + 16) - (16 | i8) != 0) {
            i4 = viewSummary.errorHttp4xxCount;
        }
        if ((i8 + 32) - (32 | i8) != 0) {
            i5 = viewSummary.errorHttp5xxCount;
        }
        if ((64 & i8) != 0) {
            i6 = viewSummary.errorHttpOtherCount;
        }
        if ((128 & i8) != 0) {
            i7 = viewSummary.errorRequestOtherCount;
        }
        if ((-1) - (((-1) - i8) | ((-1) - 256)) != 0) {
            z2 = viewSummary.hasCrash;
        }
        if ((i8 & 512) != 0) {
            jSONObject = viewSummary.fields;
        }
        return viewSummary.copy(j2, j3, i2, i3, i4, i5, i6, i7, z2, jSONObject);
    }

    public final long component1() {
        return this.startTime;
    }

    public final JSONObject component10() {
        return this.fields;
    }

    public final long component2() {
        return this.duration;
    }

    public final int component3() {
        return this.errorCount;
    }

    public final int component4() {
        return this.errorExceptionCount;
    }

    public final int component5() {
        return this.errorHttp4xxCount;
    }

    public final int component6() {
        return this.errorHttp5xxCount;
    }

    public final int component7() {
        return this.errorHttpOtherCount;
    }

    public final int component8() {
        return this.errorRequestOtherCount;
    }

    public final boolean component9() {
        return this.hasCrash;
    }

    public final ViewSummary copy(long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, JSONObject jSONObject) {
        return new ViewSummary(j2, j3, i2, i3, i4, i5, i6, i7, z2, jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewSummary)) {
            return false;
        }
        ViewSummary viewSummary = (ViewSummary) obj;
        return this.startTime == viewSummary.startTime && this.duration == viewSummary.duration && this.errorCount == viewSummary.errorCount && this.errorExceptionCount == viewSummary.errorExceptionCount && this.errorHttp4xxCount == viewSummary.errorHttp4xxCount && this.errorHttp5xxCount == viewSummary.errorHttp5xxCount && this.errorHttpOtherCount == viewSummary.errorHttpOtherCount && this.errorRequestOtherCount == viewSummary.errorRequestOtherCount && this.hasCrash == viewSummary.hasCrash && Intrinsics.areEqual(this.fields, viewSummary.fields);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getErrorCount() {
        return this.errorCount;
    }

    public final int getErrorExceptionCount() {
        return this.errorExceptionCount;
    }

    public final int getErrorHttp4xxCount() {
        return this.errorHttp4xxCount;
    }

    public final int getErrorHttp5xxCount() {
        return this.errorHttp5xxCount;
    }

    public final int getErrorHttpOtherCount() {
        return this.errorHttpOtherCount;
    }

    public final int getErrorRequestOtherCount() {
        return this.errorRequestOtherCount;
    }

    public final JSONObject getFields() {
        return this.fields;
    }

    public final boolean getHasCrash() {
        return this.hasCrash;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((Long.hashCode(this.startTime) * 31) + Long.hashCode(this.duration)) * 31) + Integer.hashCode(this.errorCount)) * 31) + Integer.hashCode(this.errorExceptionCount)) * 31) + Integer.hashCode(this.errorHttp4xxCount)) * 31) + Integer.hashCode(this.errorHttp5xxCount)) * 31) + Integer.hashCode(this.errorHttpOtherCount)) * 31) + Integer.hashCode(this.errorRequestOtherCount)) * 31) + Boolean.hashCode(this.hasCrash)) * 31;
        JSONObject jSONObject = this.fields;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(EventKeys.START_TIME, this.startTime).put("duration", this.duration).put(EventKeys.Characteristics.HAS_VIEW_SUMMARY, true).put(COUNT, this.errorCount).put(EXCEPTION_COUNT, this.errorExceptionCount).put(HTTP_4XX_COUNT, this.errorHttp4xxCount).put(HTTP_5XX_COUNT, this.errorHttp5xxCount).put(HTTP_OTHER_COUNT, this.errorHttpOtherCount).put(REQUEST_OTHER_COUNT, this.errorRequestOtherCount).put(HAS_CRASH, this.hasCrash);
        JSONObject jSONObject = this.fields;
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObjectPut.has(next)) {
                    jSONObjectPut.put(next, jSONObject.get(next));
                }
            }
        }
        Intrinsics.checkNotNull(jSONObjectPut);
        return jSONObjectPut;
    }

    public String toString() {
        return "ViewSummary(startTime=" + this.startTime + ", duration=" + this.duration + ", errorCount=" + this.errorCount + ", errorExceptionCount=" + this.errorExceptionCount + ", errorHttp4xxCount=" + this.errorHttp4xxCount + ", errorHttp5xxCount=" + this.errorHttp5xxCount + ", errorHttpOtherCount=" + this.errorHttpOtherCount + ", errorRequestOtherCount=" + this.errorRequestOtherCount + ", hasCrash=" + this.hasCrash + ", fields=" + this.fields + ')';
    }
}
