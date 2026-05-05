package androidx.compose.material3.internal;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: compiled from: LegacyCalendarModelImpl.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007tpA0JfP.hS2\u000fq|<$iByCQU\"}0\u0015WNmkvJh\u0012K\u000f\f\u0018\u0001jBI]xc\u0013\u00172XoG\u074cUoS9ht<\u000e(288\u0002\u0005\u0007\u001a0Ϻ&͌\u0019q{\f@/xoh\u0013\u001c]\r(\u0012\u001eBN\u0002\u0007\\FPɇLlk=w1\u0011{ZNUd`\u0001[ ^TU\u0012=afMNKM\u0015Sb3\u000b`pW\u0003m\bm\tv>?+w\u0003\b>f\u007f,\u0019YPu]Q(#\u0019\u001an\u001a?CO\u0012T\u0001\u00126\u0011\u0013{;RJ\"N9VHE\u001a\u0015#>;\u0003rkD~\u0003GB^|(J_3\u000eOC9Ik\u0002eI6f7*\u000eS2k\u000f|?sT<\u007fE\u001fb\u0015i1\u007fI\u0004\\\u0017\u0018g[\u0006\u0004\u001f\u00022.\u0012P_\u007f]\u001dW._;EyQ#O\u000b2LR\n\u000f\u0005\u000fm\u0004m`kX\"\u001d\u001b}>Q\u001ahb|\u0005\u001ao\u0005\\:*e\u001c\u0003\u001dD\u001c[6j\u001cT!S/~Sv\u000f\u0003M\f)U3t]qn\u001a\u0013\u001eM'KCx{\u0012wQ%\u001do@p\"pfpb<^j?:2vyV\fDZ\\4+2m\u0011L8:V1\\Cg3\"Pj\u0015\t\u000e_/$GZAN\u001biR\u0004O\u0015\u0019n~\u001b\u007fxwM%`P6qUCE>UP\u0016z|k\u0011\r\u001f\u0018G\u0016moL\u001b5<UL2$\u001eQQ]BiØ\u0001Ȟ6\b5զdtkW[\u0019w\r\u000b\u0002';\u00177\u001e\\A҈.߯nNgV\u001d,\u0005iCG\u0016p\u0018\fqT\u000bSsV\u001b[lX\u0003\u0005i<|G+\u0013M+{˱qݕ\u0001;5ξ?\u001f\u001c\b\"@ֻe\r"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0015ME7iH{\u0011oaB\u0006_96\u0001&GS24gYH", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"Pk8\u0007j\u0002", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!<Y\u0007\u001f3z|8K?Bk\n", "uKY.i(\bc(\u0003\u0002(\u0013\u0007\u0007+l\u007f}?1", "4ha@g\u000b:g\u0003\u007fl^,\u0003", "", "5dc\u0013\\9Lbwz\u000fH-n\t/k", "u(8", "BnS.l", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"G]H\u00079", "5dc!b+:g", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn9b\r Dv\u00125\u0017!7r4'\u0014dn\u0018\u0003r,$", "EdT8W(R<\u0015\u0007zl", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "", "5dc$X,DR\u0015\u0013cZ4|\u0017", "u(;7T=:\u001d)\u000e~euc\r=tU", "2`h\u0016a\u0010,=kOE*", "2`h", "4na:T;0W(\u0002eZ;\f\t<n", "CsR!\\4>;\u001d\u0006\u0002b:", "", ">`cAX9G", "5dc\u0010T5H\\\u001d|ve\u000bx\u0018/", "Bh\\2<5&W \u0006~l", "5dc\u0011T;>7\"\n\u000bm\r\u0007\u00167a\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\rIR;O=)%wBC\u0014k(]L", "5dc\u0011T@(T\u000b~zd", "2`c2", "5dc\u001ab5MV", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"PkB\u0016f\u0002", "4ha@g\u000b:gvz\u0002^5{\u0005<", "\u001aiPCTuNb\u001d\u0006D<(\u0004\t8d{5Q", "GdP?", ";n]A[", ";h]Bf\u0014H\\(\u0002\t", "4q^:", "AtQAe(<b\u0019}bh5\f\f=C\n8\u0005O", ">`a@X", ">kd@@6Gb\u001c\r", "/cS2W\u0014H\\(\u0002\t<6\r\u0012>", "BnBAe0GU", "Bn2._,GR\u0015\f", "Bh\\2M6GS", "\u001aiPCTuNb\u001d\u0006DM0\u0005\t$o\t(Q", "\u0011n\\=T5B]\"", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LegacyCalendarModelImpl extends CalendarModel {
    private final int firstDayOfWeek;
    private final List<Pair<String, String>> weekdayNames;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TimeZone utcTimeZone = TimeZone.getTimeZone("UTC");

    public LegacyCalendarModelImpl(Locale locale) {
        super(locale);
        this.firstDayOfWeek = dayInISO8601(Calendar.getInstance(locale).getFirstDayOfWeek());
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        String[] weekdays = new DateFormatSymbols(locale).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        List listDrop = ArraysKt.drop(weekdays, 2);
        int size = listDrop.size();
        for (int i2 = 0; i2 < size; i2++) {
            listCreateListBuilder.add(new Pair((String) listDrop.get(i2), shortWeekdays[i2 + 2]));
        }
        listCreateListBuilder.add(new Pair(weekdays[1], shortWeekdays[1]));
        this.weekdayNames = CollectionsKt.build(listCreateListBuilder);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate getToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis() + ((long) (calendar.get(15) + calendar.get(16))));
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
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        Intrinsics.checkNotNull(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        return CalendarModelKt.datePatternAsInputFormat(((SimpleDateFormat) dateInstance).toPattern());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate getCanonicalDate(long j2) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.setTimeInMillis(j2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(long j2) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.setTimeInMillis(j2);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return getMonth(calendar);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(CalendarDate calendarDate) {
        return getMonth(calendarDate.getYear(), calendarDate.getMonth());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(int i2, int i3) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.clear();
        calendar.set(1, i2);
        calendar.set(2, i3 - 1);
        calendar.set(5, 1);
        return getMonth(calendar);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public int getDayOfWeek(CalendarDate calendarDate) {
        return dayInISO8601(toCalendar(calendarDate, TimeZone.getDefault()).get(7));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth plusMonths(CalendarMonth calendarMonth, int i2) {
        if (i2 <= 0) {
            return calendarMonth;
        }
        Calendar calendar = toCalendar(calendarMonth);
        calendar.add(2, i2);
        return getMonth(calendar);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth minusMonths(CalendarMonth calendarMonth, int i2) {
        if (i2 <= 0) {
            return calendarMonth;
        }
        Calendar calendar = toCalendar(calendarMonth);
        calendar.add(2, -i2);
        return getMonth(calendar);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public String formatWithPattern(long j2, String str, Locale locale) {
        return Companion.formatWithPattern(j2, str, locale, getFormatterCache$material3_release());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate parse(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = utcTimeZone;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(date);
            return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    public String toString() {
        return "LegacyCalendarModel";
    }

    /* JADX INFO: compiled from: LegacyCalendarModelImpl.jvm.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0013nʑA0RlP.XS2\u000f\u0002{<$q$yّCU(!*ޛWN}gvϺ`ŖD%إFx\u0019+\nZ~]ܫ\u00132Po\bg[tU9\u000fzf\t.9:8(\r1\u001e8Q(v)I{\u0014 :Xth]uMc&B\u0016L-\u0019*li^6vrm<?#1hp\\o\u000e>\fe\rtdW\u0011\u0005j6+n=e\u001d3]\u001b\u000b\u0001f(\u0003\u001e}m\u0015v4?7Yug6\u0007\u0006$\u0017;O;\\!4#\u0005\"r\u001a(CO\u0012M'ʬ*Þ~\u0002\u0015ɝ\u001c\u0010\f*V2Ǐ\u001ew"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0015ME7iH{\u0011oaB\u0006_96\u0001&GS24gY1\u001b\u001e\u001ae\nW/\u0017\u000e/", "", "u(E", "CsR!\\4>H#\bz", "\u001aiPCTuNb\u001d\u0006DM0\u0005\t$o\t(Q", "5dc\"g*-W!~oh5|G7a\u000f(\tD|\u001edA|\u000eCv!CY", "u(;7T=:\u001d)\u000e~euk\r7et2\u0005@V", "4na:T;0W(\u0002eZ;\f\t<n", "", "CsR!\\4>;\u001d\u0006\u0002b:", "", ">`cAX9G", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!<Y\u0007\u001f3z|8K?Bk\n", "1`R5X", "", "5dc\u0010T*AS\u0018l~f7\u0004\t\u000ea\u000f(\\J\u000e\u001f\u0013V", "\u001aiPCTuMS,\u000eDL0\u0005\u00146e^$\u000b@a!$Ok\u001d\u0012", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String formatWithPattern(long j2, String str, Locale locale, Map<String, Object> map) {
            SimpleDateFormat cachedSimpleDateFormat = getCachedSimpleDateFormat(str, locale, map);
            Calendar calendar = Calendar.getInstance(getUtcTimeZone$material3_release());
            calendar.setTimeInMillis(j2);
            return cachedSimpleDateFormat.format(Long.valueOf(calendar.getTimeInMillis()));
        }

        public final TimeZone getUtcTimeZone$material3_release() {
            return LegacyCalendarModelImpl.utcTimeZone;
        }

        private final SimpleDateFormat getCachedSimpleDateFormat(String str, Locale locale, Map<String, Object> map) {
            String str2 = str + locale.toLanguageTag();
            Object obj = map.get(str2);
            Object obj2 = obj;
            if (obj == null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
                simpleDateFormat.setTimeZone(LegacyCalendarModelImpl.Companion.getUtcTimeZone$material3_release());
                map.put(str2, simpleDateFormat);
                obj2 = simpleDateFormat;
            }
            return (SimpleDateFormat) obj2;
        }
    }

    private final int dayInISO8601(int i2) {
        int i3 = (i2 + 6) % 7;
        if (i3 == 0) {
            return 7;
        }
        return i3;
    }

    private final CalendarMonth getMonth(Calendar calendar) {
        int iDayInISO8601 = dayInISO8601(calendar.get(7)) - getFirstDayOfWeek();
        if (iDayInISO8601 < 0) {
            iDayInISO8601 += 7;
        }
        return new CalendarMonth(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), iDayInISO8601, calendar.getTimeInMillis());
    }

    private final Calendar toCalendar(CalendarMonth calendarMonth) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.setTimeInMillis(calendarMonth.getStartUtcTimeMillis());
        return calendar;
    }

    private final Calendar toCalendar(CalendarDate calendarDate, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.clear();
        calendar.set(1, calendarDate.getYear());
        calendar.set(2, calendarDate.getMonth() - 1);
        calendar.set(5, calendarDate.getDayOfMonth());
        return calendar;
    }
}
