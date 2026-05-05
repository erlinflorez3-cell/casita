package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
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
/* JADX INFO: compiled from: DateInput.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000fy\b<$a&yCI\\\"}(\u0012WN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]xs\u0012\u00172HpE2cڎm9\u000fsv`0608\u0012\u0005/\u001b:L\u001ex\u0013Cy\u000f\"4NtRR;R\u0015\u001e \fV /%lk\\>`l\fC?'\u0011sZNUh@\u0001[\u0018^TU\u0016\u0007e,7X7c\u001e5[\t\u0007`hW\u0005Upk\u0013x/-+W\u0003o8n~B#ۣS\rk\u0003n\t\u0013ix\fU4\u007fiYi&*\u000ey*'l\b\u001c!?H\\IJn\u0016+Kx!q)P`}݆~Эˋ:\u0019+ AL\n7t`y=/Me\n[ٽ*ţ\u0005|)[b#x\u0017!e\u0006cQSFPVbZuKz\u001crx\u0001X\u0012\u0007ϛ\f\u009e\u007f\u001f6\u00173Ls;)7y\u0014hFm\u000e\u0013t9_wX`@Pulն,Á\u0010ZLߟUw^Xp,?Rr΄\tą\f\u0013(οHH//(N}q@җOύ\u000e%7ω\be|s&Wgg\n̓SӒ\u0014aZΘdKJm\u001dX\u0015K*ۑ\\څ,\":ʋ;\u001c\u0006\b\\N:\u001c\tŰsʬ8,9ǉ-!V\u00056Bo\u007f_ݣ\\ӳ\u0014~\\՜t\u000fw$\r\t/Q3ʜqς|I4ʉʣ\"2IT;ԉB\u0004!פ8\u001f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYa)B}%\u001fIJ?j0-\u001fu7", "", "GdP?E(GU\u0019", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "Ad[2V;:P ~YZ;|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.,?JkBs", "2`c2<5Ic(_\u0005k4x\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\rIR;O=)%wBC\u0014k(]L", "2`c296K[\u0015\u000e\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;.MHs0-$hn\u000f", "3qa<e\u000b:b\u0019ivm;|\u00168", "", "3qa<e\u000b:b\u0019h\u000bm\u0016}|/a\r\u0015wI\u0003\u0017", "3qa<e\u0010Gd\u0015\u0006~]\u0015\u0007\u0018\u000bl\u00072\u000e@\u007f", "3qa<e\u0010Gd\u0015\u0006~]\u0019x\u00121ec1\u0007P\u0010", "1ta?X5MA(z\bm\u000bx\u0018/M\u0004/\u0003D\u000f", "", "1ta?X5M3\"}YZ;|p3l\u0007,\n", "uKZ<g3B\\b\fvg.|\u0017xI\t7h<\n\u0019\u0017\u001dV\nEu2?]|3\u0001k 6XMIk}&\u0011waF\u000b_3\u001c@\u0015GSN*kNoD\u0014pV\u001dN9bkUJ#{N;\u001e\u001buG\fCs\u000b\u001a\u0016W=f\u007fBc\u0014C\u0001b?E2wFfhuN\u000b$^9doh(lI\u001b.!y\u0015*>7*\u0013z`\u001bvQ\r1eQ!\u0006B2>7cBTob@p.l\u0015Zs!2Cx)z-\u0011\u00154Cl\u0001Zv\u0018K4_\u001a(m=p-2E\u0015\t9r\u0003pG\u0010>\u0006f\u0004\u001f^~8\u0015ng-6\u001e\u0014a ]\u000bHd|HNOEEx\u0017p4\u000eO_\u0003\u0017^m)ivE\r\"P\n\u001c:21l\u0015\f\u0005<~!*'9#\u0016d3a\u00014\u001d\u0012j\u000er\u0001UT\u0011:O\fvM<Bax&\f<\u0002", "5dc\u0010h9KS\"\u000eZg+[\u0005>eg,\u0003G\u0005%UOk\u001d<\u0004)1`K\u001aDm\u001d.IQ;", "u(;7T=:\u001d z\u0004`uc\u00138gU", "Adc\u0010h9KS\"\u000eZg+[\u0005>eg,\u0003G\u0005%UOk\u001d<\u0004)1`K\u001aDm\u001d.IQ;", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;C\u0019", "\u001aiPCTuEO\"\u0001DE6\u0006\u000b\u0005", "5dc\u0010h9KS\"\u000ehm(\n\u0018\u000ea\u000f(cD\b\u001e\u001bU.\u00168\u0006%B]y'\u0005g#.TC7y4", "Adc\u0010h9KS\"\u000ehm(\n\u0018\u000ea\u000f(cD\b\u001e\u001bU.\u00168\u0006%B]y'\u0005g#.TC7y4", "D`[6W(MS", "2`c2G6/O \u0003yZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"G]H\u00079", "7m_Bg\u0010=S\"\u000e~_0|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006Z.@i\r\u00046m\u001f=QD?kAs", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!<Y\u0007\u001f3z|8K?Bk\n", "D`[6W(MS`q~o.cl9", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@)>h}-@i\u001dw+?Bk=\u001d\u0011u@5\u0016c\u00022],C]JulavD]xd\fJ2\rZ\u001d()jU3h\u000f(R\u0004\u0005V\u0010\u0019\u001a\u00177@", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DateInputValidator {
    public static final int $stable = 0;
    private Long currentEndDateMillis;
    private Long currentStartDateMillis;
    private final DatePickerFormatter dateFormatter;
    private final DateInputFormat dateInputFormat;
    private final String errorDateOutOfYearRange;
    private final String errorDatePattern;
    private final String errorInvalidNotAllowed;
    private final String errorInvalidRangeInput;
    private final SelectableDates selectableDates;
    private final IntRange yearRange;

    public DateInputValidator(IntRange intRange, SelectableDates selectableDates, DateInputFormat dateInputFormat, DatePickerFormatter datePickerFormatter, String str, String str2, String str3, String str4, Long l2, Long l3) {
        this.yearRange = intRange;
        this.selectableDates = selectableDates;
        this.dateInputFormat = dateInputFormat;
        this.dateFormatter = datePickerFormatter;
        this.errorDatePattern = str;
        this.errorDateOutOfYearRange = str2;
        this.errorInvalidNotAllowed = str3;
        this.errorInvalidRangeInput = str4;
        this.currentStartDateMillis = l2;
        this.currentEndDateMillis = l3;
    }

    public /* synthetic */ DateInputValidator(IntRange intRange, SelectableDates selectableDates, DateInputFormat dateInputFormat, DatePickerFormatter datePickerFormatter, String str, String str2, String str3, String str4, Long l2, Long l3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(intRange, selectableDates, dateInputFormat, datePickerFormatter, str, str2, str3, str4, (i2 & 256) != 0 ? null : l2, (i2 & 512) == 0 ? l3 : null);
    }

    public final Long getCurrentStartDateMillis$material3_release() {
        return this.currentStartDateMillis;
    }

    public final void setCurrentStartDateMillis$material3_release(Long l2) {
        this.currentStartDateMillis = l2;
    }

    public final Long getCurrentEndDateMillis$material3_release() {
        return this.currentEndDateMillis;
    }

    public final void setCurrentEndDateMillis$material3_release(Long l2) {
        this.currentEndDateMillis = l2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX INFO: renamed from: validate-XivgLIo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m2011validateXivgLIo(androidx.compose.material3.internal.CalendarDate r12, int r13, java.util.Locale r14) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateInputValidator.m2011validateXivgLIo(androidx.compose.material3.internal.CalendarDate, int, java.util.Locale):java.lang.String");
    }
}
