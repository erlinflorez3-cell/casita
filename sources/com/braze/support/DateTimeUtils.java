package com.braze.support;

import android.os.Build;
import android.os.SystemClock;
import bo.app.dp;
import bo.app.ep;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!,p\bDJc|\u0004O\u00128é6B\u0015\"4\u0012}\u0007njG9L͜P.hS2şs{B*c$wHCU0}*\tUOog|Nb\u000bI\u0014\u001eR\u0007rDI\u0004\u0002\u000e\u0016\u001d<Zom>}sKExtd\u0010P60E\u0012\u0005/%ZN\u0016v\tQc\f@;pv@R\u001b\\\u001d\u001a@\u0011n&\u0007\u001ejwf6vw$?G/\u0011zZNUa`\u0001[\u001f^TU \u000fe,?X7c\u0014=W\u0011\u001cj[m\u0002WuK\u001b\u0001'UBa{e>p\u007fB\u001eSO;\\\u000bBj\u001di`:)SO\u0012T\u0001\u00126\n\u0013{;O4\u0014\f'VGE\u001a\u0015\fT8\r\u0011aZh\u0002\rD(z\u00105G+\u000639K3f\u007ftk\u001fT7\n\u001e%\u001eQ\u00055ďs\\\u001c{-\u001b\u0003vy1\u007fIUP\\&q=\u001c\u000b\u0019b0,\u001c@U\u001dG{?7?%e]i'/}\u001aHrz\u0017\u0011nåki\u0001G\u0017̑Aގ;*\u0011ȱzPr\u0005\u0004P\u0003W\u0003ҍ ɟX\u0007\u0006ܱ3,jxT!S\u0012%лjȬnMe܃ECt:qv\n\u0013\u007f;t2cU\u0012\u00148ׯx݀C<jڳxrPY$Z\u000b/xøTн\u0014w\u0004ͩ±\u00101"}, d2 = {"\u001bH=\u0016@\u001c&M\u0002^iP\u0016in)Tc\u0010[", "", "\u001bR4\u0010F&\"<\u0013lZ<", "\"@6", "", "#S2,G\u0010&3\u0013sdG\f", "\u001aiPCTuNb\u001d\u0006DM0\u0005\t$o\t(Q", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "Ag^B_+.a\u0019gzm>\u0007\u00165T\u00040{\u001e\b!\u0015M", "", "1qT.g,\u001dO(~", "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", "GdP?", "", ";n]A[", "2`h", "6nd?f", ";h]Bg,L", "AdR<a+L", "4na:T;\u001dO(~ch>", "2`c296K[\u0015\u000e", "\u001ab^:\")KO.~D^5\r\u0011=/\\5wU\u0001u\u0013VonF\u0004-1hS", "<nf\u0016a\u0014BZ \u0003\t^*\u0007\u0012.s", "<nf\u0016a\u001a>Q#\byl", "<nf\u0016a\u001a>Q#\byl\u0017\n\t-i\u000e(", "", "4na:T;\u001dO(~", "Bh\\2M6GS", "4na:T;\u001dO(~[k6\u0005p3l\u0007,\n", "5dc!\\4>4&\t\u0003>7\u0007\u00072I\t\u0016{>\u000b \u0016U", "7rE._0=B\u001d\u0007zS6\u0006\t", ">`a@X\u000b:b\u0019", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DateTimeUtils {
    private static final long MINIMUM_NETWORK_TIME = 1691768838316L;
    private static final long MSECS_IN_SEC = 1000;
    private static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("UTC");
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("DateTimeUtils");
    private static boolean shouldUseNetworkTimeClock = true;

    public static final Date createDate(int i2, int i3, int i4) {
        return createDate$default(i2, i3, i4, 0, 0, 0, 56, null);
    }

    public static final Date createDate(int i2, int i3, int i4, int i5) {
        return createDate$default(i2, i3, i4, i5, 0, 0, 48, null);
    }

    public static final Date createDate(int i2, int i3, int i4, int i5, int i6) {
        return createDate$default(i2, i3, i4, i5, i6, 0, 32, null);
    }

    public static final Date createDate(int i2, int i3, int i4, int i5, int i6, int i7) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        gregorianCalendar.setTimeZone(UTC_TIME_ZONE);
        Date time = gregorianCalendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "calendar.time");
        return time;
    }

    public static final Date createDate(long j2) {
        return new Date(j2 * 1000);
    }

    public static /* synthetic */ Date createDate$default(int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        int i9 = i6;
        int i10 = i5;
        if ((8 & i8) != 0) {
            i10 = 0;
        }
        if ((i8 + 16) - (16 | i8) != 0) {
            i9 = 0;
        }
        return createDate(i2, i3, i4, i10, i9, (-1) - (((-1) - i8) | ((-1) - 32)) == 0 ? i7 : 0);
    }

    public static final String formatDate(Date date, BrazeDateFormat dateFormat) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        return formatDate$default(date, dateFormat, null, 2, null);
    }

    public static final String formatDate(Date date, BrazeDateFormat dateFormat, TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        String str = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "simpleDateFormat.format(this)");
        return str;
    }

    public static /* synthetic */ String formatDate$default(Date date, BrazeDateFormat brazeDateFormat, TimeZone UTC_TIME_ZONE2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            UTC_TIME_ZONE2 = UTC_TIME_ZONE;
            Intrinsics.checkNotNullExpressionValue(UTC_TIME_ZONE2, "UTC_TIME_ZONE");
        }
        return formatDate(date, brazeDateFormat, UTC_TIME_ZONE2);
    }

    public static final String formatDateFromMillis(long j2, BrazeDateFormat dateFormat, TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        return formatDate(new Date(j2), dateFormat, timeZone);
    }

    public static /* synthetic */ String formatDateFromMillis$default(long j2, BrazeDateFormat brazeDateFormat, TimeZone timeZone, int i2, Object obj) {
        if ((1 & i2) != 0) {
            brazeDateFormat = BrazeDateFormat.ANDROID_LOGCAT;
        }
        if ((i2 & 2) != 0) {
            timeZone = TimeZone.getDefault();
            Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault()");
        }
        return formatDateFromMillis(j2, brazeDateFormat, timeZone);
    }

    public static final String formatDateNow(BrazeDateFormat dateFormat) {
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        Date dateCreateDate = createDate(nowInSeconds());
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault()");
        return formatDate(dateCreateDate, dateFormat, timeZone);
    }

    public static final long getTimeFromEpochInSeconds(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        return TimeUnit.MILLISECONDS.toSeconds(date.getTime());
    }

    public static final boolean isValidTimeZone(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String[] availableIDs = TimeZone.getAvailableIDs();
        Intrinsics.checkNotNullExpressionValue(availableIDs, "getAvailableIDs()");
        return ArraysKt.contains(availableIDs, str);
    }

    public static final long nowInMilliseconds() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (Build.VERSION.SDK_INT < 33 || !shouldUseNetworkTimeClock) {
                return jCurrentTimeMillis;
            }
            long jMillis = SystemClock.currentNetworkTimeClock().millis();
            return jMillis < MINIMUM_NETWORK_TIME ? jCurrentTimeMillis : jMillis;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) e2, false, (Function0) dp.f507a, 8, (Object) null);
            shouldUseNetworkTimeClock = false;
            return jCurrentTimeMillis;
        }
    }

    public static final long nowInSeconds() {
        return TimeUnit.MILLISECONDS.toSeconds(nowInMilliseconds());
    }

    public static final double nowInSecondsPrecise() {
        return nowInMilliseconds() / 1000.0d;
    }

    public static final Date parseDate(String str, BrazeDateFormat dateFormat) throws Exception {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(UTC_TIME_ZONE);
        try {
            Date date = simpleDateFormat.parse(str);
            Intrinsics.checkNotNull(date);
            return date;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new ep(str), 8, (Object) null);
            throw e2;
        }
    }
}
