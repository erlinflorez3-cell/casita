package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
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
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<I\u0007\"2\u0013\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCCU0}*\tUNog\u0005JbŏK\u000f\u001c\u0016\u0001j2S]xk\u0012\u00172HrE4cڎ[\\\u0011td\u0004P2P82\u0004$ZoX\u0016\u0005{[M\"\u0011^B\u0001@`\u0010e\u00070\u00114@0\u0007,`\u007fPLG\u001b_J31\b\u0002B|-o4\u000bT%F\u0003/\u001dzo'C@e?%-a\u000e\u001fV\nKk?PJݾl'59\u0012\u0013eTp\u007fB4[U\u001b}\u000b(r\u0004\u007fb<-9p{Mf\rVyA\u0010Ɂ@\u0004\u001c(wZ<<2l\u0018\u0010Ct![n`XތNȸ~a>Ѝu\u0014A<Q#vUq=/Me\u000e3\u001dtŃ\rͼ%[\\ו1))g\u0010YAUP?^M8kk}Z͒n͆.\u00048ϚPW\n%F\u0017S?\f=15\u0004\u0002vL\u001eKC5?לu˦Gؗ·m\u0015֖.\u0013$\\Jy\u0013\u0002pV^C\u001felh\u0015\u0017 \u00156[&>WyfʱQŹmne_\u0010?=\u0002\bm|\b&YO]a7\b8fзTλ\u0018CTd\u000but]Ͱ\fcd+(ėd\u0019\u000f\u007f{Jmܥ\u0017V"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYj\u001c@o\u0016\u0019QAAkA\f$dp9jk7UL", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S!CY\\\u001cFm\u00012KI;x\"-\u0011wa\u001d\u000fn3$", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYj\u001c@o\u0016\u0019QAAkA\f$dp9\\", "7mXA\\(EA\u0019\u0006z\\;|\b\u001dt{5\u000b\u001f|&\u0017/s\u0015Cz3", "", "7mXA\\(EA\u0019\u0006z\\;|\b\u000fn~\u0007wO\u0001~\u001bNv\u0012J", "7mXA\\(E2\u001d\r\u0006e(\u0011\t.M\n1\u000bCh\u001b\u001eNs\u001c", "GdP?E(GU\u0019", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "7mXA\\(E2\u001d\r\u0006e(\u0011p9d\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U)Cd\u0005\u001cKU -M\u0019", "Ad[2V;:P ~YZ;|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.,?JkBs", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!<Y\u0007\u001f3z|8K?Bk\n", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;f-wQ|`\u001eCx\u0010\u0006]/>[S\u0007<i'*\u0017J7t6g{rj;\\J2X\u0006.KU\u00189X[t=\"[>\u0017]\u0018\t\u000e[AyR+3(\u00079S\u0006:{J\n \u0016@t~B \u0018C\t\u0015\u0003E%o\u0014#MyNACq&a\u0013_{XI:2iX\u001e\u0017yLw\u001a\u000bW\u0018<9\u0004ecN\u0019P\u001f*H|bJN9ZM|p#T\u000bw\u001f;T{tS-\u00050:=sbUp&Mk\t\u0013;fN\u000f\"CB\u0013L!'f", "-cX@c3:g\u0001\ty^", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "-rT9X*MS\u0018^\u0004]\u000bx\u0018/", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"G]H\u00079", "-rT9X*MS\u0018l\nZ9\fg+t\u007f", "2hb=_(R;#}z", "5dc\u0011\\:IZ\u0015\u0013bh+|P4F\u0007oJQK", "u(8", "Adc\u0011\\:IZ\u0015\u0013bh+|P@C\t\n\u00053\u0003", "uH\u0018#", "Ad[2V;>Rx\by=(\f\t\u0017i\u0007/\u007fN", "5dc X3>Q(~y>5{g+t\u007f\u0010\u007fG\b\u001b%", "u(;7T=:\u001d z\u0004`uc\u00138gU", "Ad[2V;>R\u0007\u000evk;[\u0005>eg,\u0003G\u0005%", "5dc X3>Q(~yL;x\u0016>D{7{(\u0005\u001e\u001eK}", "Adc X3>Q(\u0003\u0005g", "", "AsP?g\u000b:b\u0019f~e3\u0001\u0017", "3mS\u0011T;>;\u001d\u0006\u0002b:", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;f-wQ|`\u001eCx\u0010\u0006]/>[Sc(", "\u0011n\\=T5B]\"", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class DateRangePickerStateImpl extends BaseDatePickerStateImpl implements DateRangePickerState {
    public static final Companion Companion = new Companion(null);
    private MutableState<DisplayMode> _displayMode;
    private MutableState<CalendarDate> _selectedEndDate;
    private MutableState<CalendarDate> _selectedStartDate;

    public /* synthetic */ DateRangePickerStateImpl(Long l2, Long l3, Long l4, IntRange intRange, int i2, SelectableDates selectableDates, Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(l2, l3, l4, intRange, i2, selectableDates, locale);
    }

    private DateRangePickerStateImpl(Long l2, Long l3, Long l4, IntRange intRange, int i2, SelectableDates selectableDates, Locale locale) {
        super(l4, intRange, selectableDates, locale);
        this._selectedStartDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._selectedEndDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        setSelection(l2, l3);
        this._displayMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DisplayMode.m2079boximpl(i2), null, 2, null);
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public Long getSelectedStartDateMillis() {
        CalendarDate value = this._selectedStartDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public Long getSelectedEndDateMillis() {
        CalendarDate value = this._selectedEndDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    /* JADX INFO: renamed from: getDisplayMode-jFl-4v0 */
    public int mo2068getDisplayModejFl4v0() {
        return this._displayMode.getValue().m2085unboximpl();
    }

    @Override // androidx.compose.material3.DateRangePickerState
    /* JADX INFO: renamed from: setDisplayMode-vCnGnXg */
    public void mo2069setDisplayModevCnGnXg(int i2) {
        Long selectedStartDateMillis = getSelectedStartDateMillis();
        if (selectedStartDateMillis != null) {
            setDisplayedMonthMillis(getCalendarModel().getMonth(selectedStartDateMillis.longValue()).getStartUtcTimeMillis());
        }
        this._displayMode.setValue(DisplayMode.m2079boximpl(i2));
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public void setSelection(Long l2, Long l3) {
        CalendarDate canonicalDate = l2 != null ? getCalendarModel().getCanonicalDate(l2.longValue()) : null;
        CalendarDate canonicalDate2 = l3 != null ? getCalendarModel().getCanonicalDate(l3.longValue()) : null;
        if (canonicalDate != null && !getYearRange().contains(canonicalDate.getYear())) {
            throw new IllegalArgumentException(("The provided start date year (" + canonicalDate.getYear() + ") is out of the years range of " + getYearRange() + '.').toString());
        }
        if (canonicalDate2 != null && !getYearRange().contains(canonicalDate2.getYear())) {
            throw new IllegalArgumentException(("The provided end date year (" + canonicalDate2.getYear() + ") is out of the years range of " + getYearRange() + '.').toString());
        }
        if (canonicalDate2 != null) {
            if (canonicalDate == null) {
                throw new IllegalArgumentException("An end date was provided without a start date.".toString());
            }
            if (canonicalDate.getUtcTimeMillis() > canonicalDate2.getUtcTimeMillis()) {
                throw new IllegalArgumentException("The provided end date appears before the start date.".toString());
            }
        }
        this._selectedStartDate.setValue(canonicalDate);
        this._selectedEndDate.setValue(canonicalDate2);
    }

    /* JADX INFO: compiled from: DateRangePicker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS@\u000fsڔ:Š\\:ڎs;\u0004\u0019>'\u000fOɁkg|J#/Q\u0010\u001e\"\tl<I\u0004{m\u0014\u001f2pnm5}sK=xtd\nP:0>\u0012\t/!\u0013Hn~ڂGT"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYj\u001c@o\u0016\u0019QAAkA\f$dp9jk7U5\u0005QTY(eV|Fi", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYj\u001c@o\u0016\u0019QAAkA\f$dp9jk7UL", "Ad[2V;:P ~YZ;|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.,?JkBs", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!<Y\u0007\u001f3z|8K?Bk\n", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<DateRangePickerStateImpl, Object> Saver(final SelectableDates selectableDates, final Locale locale) {
            return ListSaverKt.listSaver(new Function2<SaverScope, DateRangePickerStateImpl, List<? extends Object>>() { // from class: androidx.compose.material3.DateRangePickerStateImpl$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                public final List<Object> invoke(SaverScope saverScope, DateRangePickerStateImpl dateRangePickerStateImpl) {
                    return CollectionsKt.listOf(dateRangePickerStateImpl.getSelectedStartDateMillis(), dateRangePickerStateImpl.getSelectedEndDateMillis(), Long.valueOf(dateRangePickerStateImpl.getDisplayedMonthMillis()), Integer.valueOf(dateRangePickerStateImpl.getYearRange().getFirst()), Integer.valueOf(dateRangePickerStateImpl.getYearRange().getLast()), Integer.valueOf(dateRangePickerStateImpl.mo2068getDisplayModejFl4v0()));
                }
            }, new Function1<List, DateRangePickerStateImpl>() { // from class: androidx.compose.material3.DateRangePickerStateImpl$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ DateRangePickerStateImpl invoke(List list) {
                    return invoke2((List<? extends Object>) list);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final DateRangePickerStateImpl invoke2(List<? extends Object> list) {
                    Long l2 = (Long) list.get(0);
                    Long l3 = (Long) list.get(1);
                    Long l4 = (Long) list.get(2);
                    Object obj = list.get(3);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) obj).intValue();
                    Object obj2 = list.get(4);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                    IntRange intRange = new IntRange(iIntValue, ((Integer) obj2).intValue());
                    Object obj3 = list.get(5);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                    return new DateRangePickerStateImpl(l2, l3, l4, intRange, DisplayMode.m2080constructorimpl(((Integer) obj3).intValue()), selectableDates, locale, null);
                }
            });
        }
    }
}
