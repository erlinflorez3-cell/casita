package androidx.compose.material3.internal;

import kotlin.Metadata;
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
/* JADX INFO: compiled from: CalendarModel.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4D\u0007\":\u0019\u007f\u0007lyA0RnP.XS2\u000fy\b<řc$\bCCU \u007f*\teNogtJ`ŐI%إFx\u0019+\n\u0001\ta \u000fJB\u001e@CQ}?Q`#7\u0015$@%Py3\u0002*.V\u0014\u000fzqL\u001c\u0016>E\t:\u0001\u0013̂\t\u001a \r\u0007'\u000f/tg|7\u000fȔ^\u000361\u0015\u0002B|(&ݥ}\u0016\u0014Tg?\r%bdүA\u007f<#9k\u00035S\"ϱ\u0004\bxK\u001a\u0001'U1\u0010לX~\u0012\u000e*-+}Օ\u000ex,\\\u0013Qx\fU,\u007fiQP\u001c*\u0010z*\u000el\n\u0014\u00065KF-Hg8\u00149t\u0001WXP0_r\u0006\u0001aD\u001c=\u007fa1\u007fԜe\u001arI0f7*\u001d=$1\u001a\u0007#qS<_[ĨU@e?kX=vi:]K\n\u001cp\u0011\u001fZ\b>e\u0018/*,v\u001e3Vs9Q\"2ʌG\rs\u0005%xh\u0002j\u0003LNC\u0007\u0016eLQ\u0013hg|\u0005\u001ak\u001bѧ+a\\*X\u001f}6\u0014ء`}Dƙ=\u0012TWvr;\\k\u0014=/\u0015=֍rq\u0016ãQ`9@_o`p`x,?jcۖ\\lJͭ$\\b50;\u0019y\u001ez\u0014D|\rƱ6EyʉL.7'j\u001e\u0019\u0012,GY|7e˖l\u0016\u0007ԞK&\tx2\u0001Y\u0010^\\\to\u0016yͅ0\u0003hõECWE'/Ƈ&\r"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"PkB\u0016f\u0002", "", "GdP?", "", ";n]A[", "<t\\/X9(Twz\u000fl", "2`h@99H[\u0007\u000evk;f\n!e\u007f.jJa\u001b$U~w=^/>h\u0001", "AsP?g\u001cMQ\b\u0003\u0003^\u0014\u0001\u00106i\u000e", "", "uH8\u0016<\u0011\u0002D", "5dc\u0011T@L4&\t\u0003L;x\u0016>O\u0001\u001a{@\u0007\u0006!(s\u001bJ\u0006\u000f6A\b)Fp", "u(8", "3mS\"g*-W!~bb3\u0004\r=", "5dc\u0012a+.b\u0017m~f,d\r6l\u00046", "u(9", "5dc\u001ab5MV", "5dc\u001bh4;S&h{=(\u0011\u0017", "5dc g(Kb\t\u000exM0\u0005\t\u0017i\u0007/\u007fN", "5dc&X(K", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n_F", "3pd._:", "", "=sW2e", "4na:T;", "", "1`[2a+:`\u0001\ty^3", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"Pk8\u0007j\u0002", "AjT9X;H\\", "6`b566=S", "7mS2k\u0010G", "GdP?f", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "BnBAe0GU", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CalendarMonth {
    public static final int $stable = 0;
    private final int daysFromStartOfWeekToFirstOfMonth;
    private final long endUtcTimeMillis;
    private final int month;
    private final int numberOfDays;
    private final long startUtcTimeMillis;
    private final int year;

    public static /* synthetic */ CalendarMonth copy$default(CalendarMonth calendarMonth, int i2, int i3, int i4, int i5, long j2, int i6, Object obj) {
        if ((-1) - (((-1) - i6) | ((-1) - 1)) != 0) {
            i2 = calendarMonth.year;
        }
        if ((i6 + 2) - (2 | i6) != 0) {
            i3 = calendarMonth.month;
        }
        if ((4 & i6) != 0) {
            i4 = calendarMonth.numberOfDays;
        }
        if ((8 & i6) != 0) {
            i5 = calendarMonth.daysFromStartOfWeekToFirstOfMonth;
        }
        if ((i6 + 16) - (i6 | 16) != 0) {
            j2 = calendarMonth.startUtcTimeMillis;
        }
        return calendarMonth.copy(i2, i3, i4, i5, j2);
    }

    public final int component1() {
        return this.year;
    }

    public final int component2() {
        return this.month;
    }

    public final int component3() {
        return this.numberOfDays;
    }

    public final int component4() {
        return this.daysFromStartOfWeekToFirstOfMonth;
    }

    public final long component5() {
        return this.startUtcTimeMillis;
    }

    public final CalendarMonth copy(int i2, int i3, int i4, int i5, long j2) {
        return new CalendarMonth(i2, i3, i4, i5, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarMonth)) {
            return false;
        }
        CalendarMonth calendarMonth = (CalendarMonth) obj;
        return this.year == calendarMonth.year && this.month == calendarMonth.month && this.numberOfDays == calendarMonth.numberOfDays && this.daysFromStartOfWeekToFirstOfMonth == calendarMonth.daysFromStartOfWeekToFirstOfMonth && this.startUtcTimeMillis == calendarMonth.startUtcTimeMillis;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.year) * 31) + Integer.hashCode(this.month)) * 31) + Integer.hashCode(this.numberOfDays)) * 31) + Integer.hashCode(this.daysFromStartOfWeekToFirstOfMonth)) * 31) + Long.hashCode(this.startUtcTimeMillis);
    }

    public String toString() {
        return "CalendarMonth(year=" + this.year + ", month=" + this.month + ", numberOfDays=" + this.numberOfDays + ", daysFromStartOfWeekToFirstOfMonth=" + this.daysFromStartOfWeekToFirstOfMonth + ", startUtcTimeMillis=" + this.startUtcTimeMillis + ')';
    }

    public CalendarMonth(int i2, int i3, int i4, int i5, long j2) {
        this.year = i2;
        this.month = i3;
        this.numberOfDays = i4;
        this.daysFromStartOfWeekToFirstOfMonth = i5;
        this.startUtcTimeMillis = j2;
        this.endUtcTimeMillis = (j2 + (((long) i4) * CalendarModelKt.MillisecondsIn24Hours)) - 1;
    }

    public final int getYear() {
        return this.year;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getNumberOfDays() {
        return this.numberOfDays;
    }

    public final int getDaysFromStartOfWeekToFirstOfMonth() {
        return this.daysFromStartOfWeekToFirstOfMonth;
    }

    public final long getStartUtcTimeMillis() {
        return this.startUtcTimeMillis;
    }

    public final long getEndUtcTimeMillis() {
        return this.endUtcTimeMillis;
    }

    public final int indexIn(IntRange intRange) {
        return (((this.year - intRange.getFirst()) * 12) + this.month) - 1;
    }

    public final String format(CalendarModel calendarModel, String str) {
        return calendarModel.formatWithSkeleton(this, str, calendarModel.getLocale());
    }
}
