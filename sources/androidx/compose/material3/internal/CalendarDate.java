package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eQLш|\u0004O\f8\u000b4C\u0007\":\u0019\u007f\u0007lwA0RnP.`ݷ2şs{B0cҕyCQU\"}(\u000bUȟm}ñz`\u001bE\u001f\u0006Dю\u0019+\nx\ta \u000fJB\u001e@CQ}?Q`#7\u0015$@%Py3\u0002*.V\u0014\u000fzqPë\u00160Nv\u0003a\u001bZ\u001d\u001a@\u0007n$\u000f,tg|Ȥ\u000fǤ]\u000361\u0012\u0002B|(&ݥ}\u0016\u0014Td?\r%bdүA\u007f<#6k\u00035S\"ϱ\u0004\bxK\u0017\u0001'U0\u0010לX~\b\u000e'-+}Օ\u000ex,\\\u0013Qx\fU,\u007fiQP\u001c*\u0010z*\u000el\n\u0014\u00065KF-Hg8\u00149t\u0001WXP0c\tɜy*G%9\u00183YNKl_oS\u001bd6*\u001bSͫ$I\u0003/rl\u000e\u000f-KX\u0006jIQnWxR\u0018tUm2\t+\t8 HG.0BÔ-_,ExQ#O\u0004HӝC8\u0006\u0013c\u0001S\u0018S͕D(vݫO,\u000f\u0013hL5\u0014yRlXZ\u0012ܖ Z\u000fâ \u0015&e\u0006Dq4\u001eRgh\u0018oܷa\u0010-Ä~9_xy\u0019(Hl3MQ\u0012\u0011уV|\u001c̳Td\u000bdtJΖ\u0010x"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"G]H\u00079", "", "GdP?", "", ";n]A[", "2`h\u001cY\u0014H\\(\u0002", "CsR!\\4>;\u001d\u0006\u0002b:", "", "uH8\u0016=o/", "5dc\u0011T@(T\u0001\t\u0004m/", "u(8", "5dc\u001ab5MV", "5dc\"g*-W!~bb3\u0004\r=", "u(9", "5dc&X(K", "1n\\=T9>B#", "=sW2e", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "", "4na:T;", "", "1`[2a+:`\u0001\ty^3", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"Pk8\u0007j\u0002", "AjT9X;H\\", "6`b566=S", "BnBAe0GU", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CalendarDate implements Comparable<CalendarDate> {
    public static final int $stable = 0;
    private final int dayOfMonth;
    private final int month;
    private final long utcTimeMillis;
    private final int year;

    public static /* synthetic */ CalendarDate copy$default(CalendarDate calendarDate, int i2, int i3, int i4, long j2, int i5, Object obj) {
        if ((i5 + 1) - (1 | i5) != 0) {
            i2 = calendarDate.year;
        }
        if ((2 & i5) != 0) {
            i3 = calendarDate.month;
        }
        if ((i5 + 4) - (4 | i5) != 0) {
            i4 = calendarDate.dayOfMonth;
        }
        if ((i5 & 8) != 0) {
            j2 = calendarDate.utcTimeMillis;
        }
        return calendarDate.copy(i2, i3, i4, j2);
    }

    public final int component1() {
        return this.year;
    }

    public final int component2() {
        return this.month;
    }

    public final int component3() {
        return this.dayOfMonth;
    }

    public final long component4() {
        return this.utcTimeMillis;
    }

    public final CalendarDate copy(int i2, int i3, int i4, long j2) {
        return new CalendarDate(i2, i3, i4, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarDate)) {
            return false;
        }
        CalendarDate calendarDate = (CalendarDate) obj;
        return this.year == calendarDate.year && this.month == calendarDate.month && this.dayOfMonth == calendarDate.dayOfMonth && this.utcTimeMillis == calendarDate.utcTimeMillis;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.year) * 31) + Integer.hashCode(this.month)) * 31) + Integer.hashCode(this.dayOfMonth)) * 31) + Long.hashCode(this.utcTimeMillis);
    }

    public String toString() {
        return "CalendarDate(year=" + this.year + ", month=" + this.month + ", dayOfMonth=" + this.dayOfMonth + ", utcTimeMillis=" + this.utcTimeMillis + ')';
    }

    public CalendarDate(int i2, int i3, int i4, long j2) {
        this.year = i2;
        this.month = i3;
        this.dayOfMonth = i4;
        this.utcTimeMillis = j2;
    }

    public final int getYear() {
        return this.year;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final long getUtcTimeMillis() {
        return this.utcTimeMillis;
    }

    @Override // java.lang.Comparable
    public int compareTo(CalendarDate calendarDate) {
        return Intrinsics.compare(this.utcTimeMillis, calendarDate.utcTimeMillis);
    }

    public final String format(CalendarModel calendarModel, String str) {
        return calendarModel.formatWithSkeleton(this, str, calendarModel.getLocale());
    }
}
