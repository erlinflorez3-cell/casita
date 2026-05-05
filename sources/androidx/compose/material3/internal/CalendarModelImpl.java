package androidx.compose.material3.internal;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
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
/* JADX INFO: compiled from: CalendarModelImpl.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007tpA0JfP.hS2\u000fq|<$iByCQU\"}0\u0015WNmivJh\u0012K\u000f\f\u0018\u0001jBI]xc\u0013\u00172XoG\u074cUoS9ht<\u000f&18\u0600\u0018/1\u001aXGHu%\u0004Z\u001c\u001a>@\t>\u0001\u000e6\u0005x\u0014ĂB \u000f!%\n\\H`l\fI_'\u0011|ZNUs`\u0001[\"^TU\u001c'i,+X;c\u0016\u000eSa\t\u0019o\b\u0011M\bU\u0005\u00170W/W\u000bo6\u0007\u0014Z)sa\u001bu\u000b&\u000b\u001e\u0002h\u001a'CS\u0012L9\u000e\u0007yA\u0010UJ\u0012(\u001e'v3]\u001et#&3#{\u001aT\u0019\u0010l^\u0018z\u0010SG)\u000eNC9Io\u0018u\u0004'\\S\u0014\u0005;;S\u0005|?sT<\u007f[\u001b\u001d\u000e_Mi@ke~\u000eg]\u0006\u0004\u001fg2.\u0012Q_\u007f]\u0001WB_3EwQ#O\t2LR~\u000f\u0005\u000f|\u001a}\u001b^ND\u0007\u0016eG9\u0010hg|\u0005\u001am\u0005\\:5e\u001c\u0003\fD\u001c[8j\u001dT#;\u000f|X\u0019mxhu\nS>\u0017;g\u0004\u0004\u000e\u0006H%G}gq6yR%1o@p(pfpp<^jO:2voV\fDJ\\4+2m\u0001bHt;'\u0006-H1=jA+\u0012&Z1\u001a\r}K$1\tLt7\u001e\u0017\\A\u0002u|a,+exΡCپ9\u001f.Ş:j:\u00031\u000eO\u0006\u000eO\u007fLuU#jLɴ}°\u001a\u001eQS5G!\u001aOM@\u000eEW\\\u0001u]]\u00147z+\t\u001f=x.\u0016\u0017\u0019~ZmAߑQݚ\u001b(~ܥ\u000b%\u000et\u000e\u000bӼJ&"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"Pk8\u0007j\u0010V\u0002.\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"Pk8\u0007j\u0002", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!<Y\u0007\u001f3z|8K?Bk\n", "uKY.i(\bc(\u0003\u0002(\u0013\u0007\u0007+l\u007f}?1", "4ha@g\u000b:g\u0003\u007fl^,\u0003", "", "5dc\u0013\\9Lbwz\u000fH-n\t/k", "u(8", "BnS.l", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"G]H\u00079", "5dc!b+:g", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn9b\r Dv\u00125\u0017!7r4'\u0014dn\u0018\u0003r,$", "EdT8W(R<\u0015\u0007zl", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "", "5dc$X,DR\u0015\u0013cZ4|\u0017", "u(;7T=:\u001d)\u000e~euc\r=tU", "4na:T;0W(\u0002eZ;\f\t<n", "CsR!\\4>;\u001d\u0006\u0002b:", "", ">`cAX9G", "5dc\u0010T5H\\\u001d|ve\u000bx\u0018/", "Bh\\2<5&W \u0006~l", "5dc\u0011T;>7\"\n\u000bm\r\u0007\u00167a\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\rIR;O=)%wBC\u0014k(]L", "5dc\u0011T@(T\u000b~zd", "2`c2", "5dc\u001ab5MV", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"PkB\u0016f\u0002", "4ha@g\u000b:g\u007f\txZ3[\u0005>e", "\u001aiPCTuMW!~DE6z\u00056D{7{\u0016", "GdP?", ";n]A[", ";h]Bf\u0014H\\(\u0002\t", "4q^:", "AtQAe(<b\u0019}bh5\f\f=C\n8\u0005O", ">`a@X", ">kd@@6Gb\u001c\r", "/cS2W\u0014H\\(\u0002\t<6\r\u0012>", "BnBAe0GU", "Bn;<V(E2\u0015\u000ez", "\u0011n\\=T5B]\"", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CalendarModelImpl extends CalendarModel {
    private final int firstDayOfWeek;
    private final List<Pair<String, String>> weekdayNames;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final ZoneId utcTimeZoneId = ZoneId.of("UTC");

    public CalendarModelImpl(Locale locale) {
        super(locale);
        this.firstDayOfWeek = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        DayOfWeek[] dayOfWeekArrValues = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(dayOfWeekArrValues.length);
        for (DayOfWeek dayOfWeek : dayOfWeekArrValues) {
            arrayList.add(TuplesKt.to(dayOfWeek.getDisplayName(TextStyle.FULL, locale), dayOfWeek.getDisplayName(TextStyle.NARROW, locale)));
        }
        this.weekdayNames = arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.time.ZonedDateTime] */
    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate getToday() {
        LocalDate localDateNow = LocalDate.now();
        return new CalendarDate(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(utcTimeZoneId).toInstant().toEpochMilli());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public List<Pair<String, String>> getWeekdayNames() {
        return this.weekdayNames;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public DateInputFormat getDateInputFormat(Locale locale) {
        return CalendarModelKt.datePatternAsInputFormat(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate getCanonicalDate(long j2) {
        LocalDate localDate = Instant.ofEpochMilli(j2).atZone(utcTimeZoneId).toLocalDate();
        return new CalendarDate(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC) * ((long) 1000));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(long j2) {
        return getMonth(Instant.ofEpochMilli(j2).atZone(utcTimeZoneId).withDayOfMonth(1).toLocalDate());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(CalendarDate calendarDate) {
        return getMonth(LocalDate.of(calendarDate.getYear(), calendarDate.getMonth(), 1));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(int i2, int i3) {
        return getMonth(LocalDate.of(i2, i3, 1));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public int getDayOfWeek(CalendarDate calendarDate) {
        return toLocalDate(calendarDate).getDayOfWeek().getValue();
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth plusMonths(CalendarMonth calendarMonth, int i2) {
        return i2 <= 0 ? calendarMonth : getMonth(toLocalDate(calendarMonth).plusMonths(i2));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth minusMonths(CalendarMonth calendarMonth, int i2) {
        return i2 <= 0 ? calendarMonth : getMonth(toLocalDate(calendarMonth).minusMonths(i2));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public String formatWithPattern(long j2, String str, Locale locale) {
        return Companion.formatWithPattern(j2, str, locale, getFormatterCache$material3_release());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.time.ZonedDateTime] */
    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate parse(String str, String str2) {
        try {
            LocalDate localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern(str2));
            return new CalendarDate(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(utcTimeZoneId).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    public String toString() {
        return "CalendarModel";
    }

    /* JADX INFO: compiled from: CalendarModelImpl.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0013nʑA0RlP.XS2\u000f\u0002{<$q$yّCU(!*ޛWN}gvϺ`ŖD%إFx\u0019+\nZ~]ܫ\u00132Po\bg[tU9\u000fzf\t.9:8(\r1\u001e8Q(v)I{\u0014 :Xth]uMc&B\u0016L-\u0019*li^6vrm<?#1hp\\o\u000e>\fe\rtdW\u0011\u0005j6+n=e\u001d3]\u001b\u000b\u0001f(\u0003\u001e}m\u0015v4?7Yug6\u0007\u0006$\u0017;O;\\!4#\u0005\"r\u001a(CO\u0012M'ʬ*Þ~\u0002\u0015ɝ\u001c\u0010\f*V2Ǐ\u001ew"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"Pk8\u0007j\u0010V\u0002.\u0006*X4gN{A\u001e\u001b0", "", "u(E", "CsR!\\4>H#\bzB+", "\u001aiPCTuMW!~DS6\u0006\t\u0013dU", "5dc\"g*-W!~oh5|l.$\b$\u000b@\u000e\u001b\u0013N=\bIv,5U\f ", "u(;7T=:\u001d(\u0003\u0003^uq\u00138ec'Q", "4na:T;0W(\u0002eZ;\f\t<n", "", "CsR!\\4>;\u001d\u0006\u0002b:", "", ">`cAX9G", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!<Y\u0007\u001f3z|8K?Bk\n", "1`R5X", "", "5dc\u0010T*AS\u0018]vm,k\r7e`2\tH|&&G|", "\u001aiPCTuMW!~D_6\n\u0011+tI\u0007wO\u0001\u0006\u001bOonF\u0004-1h\r DC", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String formatWithPattern(long j2, String str, Locale locale, Map<String, Object> map) {
            return Instant.ofEpochMilli(j2).atZone(getUtcTimeZoneId$material3_release()).toLocalDate().format(getCachedDateTimeFormatter(str, locale, map));
        }

        public final ZoneId getUtcTimeZoneId$material3_release() {
            return CalendarModelImpl.utcTimeZoneId;
        }

        private final DateTimeFormatter getCachedDateTimeFormatter(String str, Locale locale, Map<String, Object> map) {
            String str2 = "P:" + str + locale.toLanguageTag();
            Object objWithDecimalStyle = map.get(str2);
            if (objWithDecimalStyle == null) {
                objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
                map.put(str2, objWithDecimalStyle);
            }
            Intrinsics.checkNotNull(objWithDecimalStyle, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
            return (DateTimeFormatter) objWithDecimalStyle;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.time.ZonedDateTime] */
    private final CalendarMonth getMonth(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - getFirstDayOfWeek();
        if (value < 0) {
            value += 7;
        }
        return new CalendarMonth(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(utcTimeZoneId).toInstant().toEpochMilli());
    }

    private final LocalDate toLocalDate(CalendarMonth calendarMonth) {
        return Instant.ofEpochMilli(calendarMonth.getStartUtcTimeMillis()).atZone(utcTimeZoneId).toLocalDate();
    }

    private final LocalDate toLocalDate(CalendarDate calendarDate) {
        return LocalDate.of(calendarDate.getYear(), calendarDate.getMonth(), calendarDate.getDayOfMonth());
    }
}
