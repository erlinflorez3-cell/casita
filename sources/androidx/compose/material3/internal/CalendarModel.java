package androidx.compose.material3.internal;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
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
/* JADX INFO: compiled from: CalendarModel.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007tpA0JfP.`v2\u000fy\b<$a'yCQU\"}(\nWNu\u0006vJp\u000bK\u000f\f\u0018\u0001j:P]xc\u0015\u00172XoG3SpE9vt>\u0005&:(V\u0010ڎ1\u001aXGP\u0006\u000bKY\f*4nq#RkOŋ\u001e\u0012\u0014Ah#,t\u007fNdR\u001daHH;\u0003\u0018\\~+mK\u0015M;P\u0005/\u001bvy\"YA 5s'\u001a'Oti[\u001b? G5l5DCI\"gf\\\u000e2-+}\u0017\u000e|,\\\u0013Qx\u0010U,8c*RVJ\u0006\u0017\u0014\rj\u000e>\n5gF-H\u00078\u0012A\u0013\u000bSnZ2hH\u007f\taN\u001bS\u0001\u001c+\u0018\u001d/_o\\1Ne\f5\u0011,E\u0019nOu\u001b2)))w\u0010Q_upGNN\u0018YUq2qK\u0002\t\u0006vkH=\n6F\u0017S<\f=1>\u0004\u0002vT.\u001bMnvy\u0002Rv`Rr$TB\t:j\u000b\tM\u0002^zp,?mLX\u0015% \u0013Na(@/D(N}m0\u000f\u0016k\u0018KGfey\u001fo\u001cyQ^aO\u0018\bXw`\u001f,?j\u00035\\tkk\f\t|X&@r\u0003\u0010&\u0001\u000brT+@j\n\u001eJ+_)\r\u0019V 6Bo\u00079ch\u0004(~\u0003=j'2:\u00035\u0019P\u000b\u0011 k\u0007rD|\u000fB]E_b1&\u0004'/XM3\u0015\u0003\f\u007ful#ܨN̡\u001aym}&\u001c(@\"MK\u001b'\u000b94\u0012-sV\u0003gaM@&)\u0006Pҹ=ÿ2m\u0010ξ\t.fuX[%*0vvvQ\tM\u007fXcâ~MkҺ#]DV\u0001\u0011*L\\G\u0015\u0005M.{́qݕ\u00019EE-.$\ndQ#tu{\u007f<\nn\u001f(\u0005e26s\u0018\u007fb\u007fg`Pf]0́@ѐ(p\u001bDN\u0001\u0006\u001fɠ\rb"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"Pk8\u0007j\u0002", "", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!<Y\u0007\u001f3z|8K?Bk\n", "uKY.i(\bc(\u0003\u0002(\u0013\u0007\u0007+l\u007f}?1", "4ha@g\u000b:g\u0003\u007fl^,\u0003", "", "5dc\u0013\\9Lbwz\u000fH-n\t/k", "u(8", "4na:T;MS&\\v\\/|", "", "", "5dc\u0013b9FO(\u000ezk\nx\u00072e>0wO\u0001$\u001bCv[6\u0004%<Yy.7", "u(;7T=:\u001d)\u000e~eud\u0005:;", "5dc\u0019b*:Z\u0019", "u(;7T=:\u001d)\u000e~euc\u0013-a\u0007(Q", "BnS.l", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"G]H\u00079", "5dc!b+:g", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn9b\r Dv\u00125\u0017!7r4'\u0014dn\u0018\u0003r,$", "EdT8W(R<\u0015\u0007zl", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "5dc$X,DR\u0015\u0013cZ4|\u0017", "u(;7T=:\u001d)\u000e~euc\r=tU", "4na:T;0W(\u0002eZ;\f\t<n", "CsR!\\4>;\u001d\u0006\u0002b:", "", ">`cAX9G", "4na:T;0W(\u0002hd,\u0004\t>o\t", "2`c2", "AjT9X;H\\", ";n]A[", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"PkB\u0016f\u0002", "5dc\u0010T5H\\\u001d|ve\u000bx\u0018/", "Bh\\2<5&W \u0006~l", "5dc\u0011T;>7\"\n\u000bm\r\u0007\u00167a\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\rIR;O=)%wBC\u0014k(]L", "5dc\u0011T@(T\u000b~zd", "5dc\u001ab5MV", "GdP?", ";h]Bf\u0014H\\(\u0002\t", "4q^:", "AtQAe(<b\u0019}bh5\f\f=C\n8\u0005O", ">`a@X", ">kd@@6Gb\u001c\r", "/cS2W\u0014H\\(\u0002\t<6\r\u0012>", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class CalendarModel {
    public static final int $stable = 8;
    private final Map<String, Object> formatterCache = new LinkedHashMap();
    private final Locale locale;

    public abstract String formatWithPattern(long j2, String str, Locale locale);

    public abstract CalendarDate getCanonicalDate(long j2);

    public abstract DateInputFormat getDateInputFormat(Locale locale);

    public abstract int getDayOfWeek(CalendarDate calendarDate);

    public abstract int getFirstDayOfWeek();

    public abstract CalendarMonth getMonth(int i2, int i3);

    public abstract CalendarMonth getMonth(long j2);

    public abstract CalendarMonth getMonth(CalendarDate calendarDate);

    public abstract CalendarDate getToday();

    public abstract List<Pair<String, String>> getWeekdayNames();

    public abstract CalendarMonth minusMonths(CalendarMonth calendarMonth, int i2);

    public abstract CalendarDate parse(String str, String str2);

    public abstract CalendarMonth plusMonths(CalendarMonth calendarMonth, int i2);

    public CalendarModel(Locale locale) {
        this.locale = locale;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final Map<String, Object> getFormatterCache$material3_release() {
        return this.formatterCache;
    }

    public static /* synthetic */ DateInputFormat getDateInputFormat$default(CalendarModel calendarModel, Locale locale, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDateInputFormat");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            locale = calendarModel.locale;
        }
        return calendarModel.getDateInputFormat(locale);
    }

    public static /* synthetic */ String formatWithSkeleton$default(CalendarModel calendarModel, CalendarMonth calendarMonth, String str, Locale locale, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            locale = calendarModel.locale;
        }
        return calendarModel.formatWithSkeleton(calendarMonth, str, locale);
    }

    public final String formatWithSkeleton(CalendarMonth calendarMonth, String str, Locale locale) {
        return CalendarModel_androidKt.formatWithSkeleton(calendarMonth.getStartUtcTimeMillis(), str, locale, this.formatterCache);
    }

    public static /* synthetic */ String formatWithSkeleton$default(CalendarModel calendarModel, CalendarDate calendarDate, String str, Locale locale, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }
        if ((i2 & 4) != 0) {
            locale = calendarModel.locale;
        }
        return calendarModel.formatWithSkeleton(calendarDate, str, locale);
    }

    public final String formatWithSkeleton(CalendarDate calendarDate, String str, Locale locale) {
        return CalendarModel_androidKt.formatWithSkeleton(calendarDate.getUtcTimeMillis(), str, locale, this.formatterCache);
    }
}
