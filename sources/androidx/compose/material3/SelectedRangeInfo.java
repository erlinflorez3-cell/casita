package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007f\u0007ls?ӄZ͜f<\u0003SX\u000e$zBd~4uQ;m\u001a,#\u0019S\\i\u007fnx[\u001bG\u001d\t.x\u00190YY\u0007b*\u000f`FņC3[u\u000eHnwN\u0005N6ŕ<\u007f\rЏ2,N\u0017\u0005\u0003\u0014b\u001a\u0014H@\u001f;ƞ\f˟ơ\u0019\u0011ĂB(\t\u001ejrf8NukD\u007f:\u0011iZNU`ޗ{ձЮESܮ\u0011~i\u001e9KO7\u001b1a\rWaiD\u001b? Aݾl-/Ǣau]Cf\bϯ\u00154W\u0010cĘB\u000b\u0004Y`\u0012FˬSr"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/7l\u0003*VE;O=\u001f\u001f>", "", "5qX1F;:`(\\\u0005h9{\r8a\u000f(\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "5qX185=1#\t\b]0\u0006\u0005>e\u000e", "4ha@g\u0010LA\u0019\u0006z\\;\u0001\u00138S\u000f$\tO", "", ":`bA<:,S ~xm0\u0007\u0012\u000fn~", "uI9'M\u0013D](\u0006~gu\u0002\u001a7/\u00041\u000b@\u000e \u0013N9l<w!E`\r}Av$=ZS9z>+|dn?\u0007p\u0002\u0012g", "5dc\u0013\\9Lb|\rh^3|\u0007>i\n1iO|$&", "u(I", "5dc\u0014e0=3\"}Xh6\n\b3n{7{NH \u0001EmU8t", "u(9", "\u0018", "5dc\u0014e0=A(z\bm\n\u0007\u0013<d\u00041wO\u0001%^PY\f:>!3", "5dc\u0019T:M7'lze,z\u00183o\t\b\u0005?", "\u0011n\\=T5B]\"", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SelectedRangeInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean firstIsSelectionStart;
    private final long gridEndCoordinates;
    private final long gridStartCoordinates;
    private final boolean lastIsSelectionEnd;

    public /* synthetic */ SelectedRangeInfo(long j2, long j3, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, z2, z3);
    }

    private SelectedRangeInfo(long j2, long j3, boolean z2, boolean z3) {
        this.gridStartCoordinates = j2;
        this.gridEndCoordinates = j3;
        this.firstIsSelectionStart = z2;
        this.lastIsSelectionEnd = z3;
    }

    /* JADX INFO: renamed from: getGridStartCoordinates-nOcc-ac, reason: not valid java name */
    public final long m2489getGridStartCoordinatesnOccac() {
        return this.gridStartCoordinates;
    }

    /* JADX INFO: renamed from: getGridEndCoordinates-nOcc-ac, reason: not valid java name */
    public final long m2488getGridEndCoordinatesnOccac() {
        return this.gridEndCoordinates;
    }

    public final boolean getFirstIsSelectionStart() {
        return this.firstIsSelectionStart;
    }

    public final boolean getLastIsSelectionEnd() {
        return this.lastIsSelectionEnd;
    }

    /* JADX INFO: compiled from: DateRangePicker.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN.Xݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018luh\u0007Lp\nq\u00116\u001a\u0007mDI\u0004|\u000e\u0016\u001d7Zom9}sK@xtd\u000bڼ6*"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/7l\u0003*VE;O=\u001f\u001f'?C\u000fn(Wz1P\"", "", "u(E", "1`[0h3:b\u0019kvg.|l8f\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/7l\u0003*VE;O=\u001f\u001f>", ";n]A[", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"PkB\u0016f\u0002", "AsP?g\u000b:b\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"G]H\u00079", "3mS\u0011T;>", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SelectedRangeInfo calculateRangeInfo(CalendarMonth calendarMonth, CalendarDate calendarDate, CalendarDate calendarDate2) {
            int daysFromStartOfWeekToFirstOfMonth;
            int daysFromStartOfWeekToFirstOfMonth2;
            if (calendarDate.getUtcTimeMillis() <= calendarMonth.getEndUtcTimeMillis() && calendarDate2.getUtcTimeMillis() >= calendarMonth.getStartUtcTimeMillis()) {
                boolean z2 = calendarDate.getUtcTimeMillis() >= calendarMonth.getStartUtcTimeMillis();
                boolean z3 = calendarDate2.getUtcTimeMillis() <= calendarMonth.getEndUtcTimeMillis();
                if (z2) {
                    daysFromStartOfWeekToFirstOfMonth = (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarDate.getDayOfMonth()) - 1;
                } else {
                    daysFromStartOfWeekToFirstOfMonth = calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
                }
                if (z3) {
                    daysFromStartOfWeekToFirstOfMonth2 = (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarDate2.getDayOfMonth()) - 1;
                } else {
                    daysFromStartOfWeekToFirstOfMonth2 = (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarMonth.getNumberOfDays()) - 1;
                }
                return new SelectedRangeInfo(IntOffsetKt.IntOffset(daysFromStartOfWeekToFirstOfMonth % 7, daysFromStartOfWeekToFirstOfMonth / 7), IntOffsetKt.IntOffset(daysFromStartOfWeekToFirstOfMonth2 % 7, daysFromStartOfWeekToFirstOfMonth2 / 7), z2, z3, null);
            }
            return null;
        }
    }
}
