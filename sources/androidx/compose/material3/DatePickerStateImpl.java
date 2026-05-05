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
/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<I\u0007\"2\u0012\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCCU0}*\tUNog\u0005JbŏK\u000f\u001c\u0016\u0001j2T[ys܈-Orom2}ok9\u0019sSE[B(Fz\u001d\u00030)v\u0012\u0007\u0001QN$\u0014F?\u001f<b\u0011[\t2\u00124C0\u0005,b\u007fNdO|aH7;\u0003\u0018K^/m:\u0015Q;Q='k\u0003Ґ\"+ND\u0006'3a\u001b\rb]O\u0003mxk\u0014?Ѫ3ȅMs_̬)\u0014\"%CW\u001da\u0003(r\u0004\u007fq:6\u0002ՕoׂT\u000e0»K$\u001bN\u001c\u000e4.x2;,~\b<:+G\u0012\u0015'سj݆~Э̡5\u0016Ӿ\u0004=C;!y_u[\u001bTL\n\u001b]D1\u0019\u0007#qS<bE!b\u000fi3g?kJ\u0005^\u0018\u0012Dե|Ċ\u00064\u001c2M\u0019=\u001610\u001d@Ewހ#*s\u0005Nו\u0004%\u0004hhY\tʖL^"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;;R7z4\u0002\u001dsh\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S!CY\\\u001cFm\u00012KI;x\"-\u0011wa\u001d\u000fn3$", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;;R7z4s", "7mXA\\(EA\u0019\u0006z\\;|\b\u000ea\u000f(cD\b\u001e\u001bU", "", "7mXA\\(E2\u001d\r\u0006e(\u0011\t.M\n1\u000bCh\u001b\u001eNs\u001c", "GdP?E(GU\u0019", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "7mXA\\(E2\u001d\r\u0006e(\u0011p9d\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U)Cd\u0005\u001cKU -M\u0019", "Ad[2V;:P ~YZ;|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.,?JkBs", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!<Y\u0007\u001f3z|8K?Bk\n", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;f-wQ|`\u001eCx\u0010\u0006]/>[S\u0007=w%5QL\u0005x0'\u0017ho\u0003jl;;r0IL$\u0010CN{<!\u001c^\rat\u000b\u000faL.|D\u0001'\u0004;I\u000f?d\bY_{5qp@e\fD\u0001\u0015T=8hT/F~CRA,:s\u0010ffCD8 \u001bqn\u0002nZ=\u0011\u007f\\Zwc\u00021kP(zE-:t%%EpQL{6|U\u0005\u0006!?hr:~:k07<d\u0012!+\t", "-cX@c3:g\u0001\ty^", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "-rT9X*MS\u0018]vm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"G]H\u00079", "2hb=_(R;#}z", "5dc\u0011\\:IZ\u0015\u0013bh+|P4F\u0007oJQK", "u(8", "Adc\u0011\\:IZ\u0015\u0013bh+|P@C\t\n\u00053\u0003", "uH\u0018#", "2`c2@0EZ\u001d\r", "Ad[2V;>Rwz\n^\u0014\u0001\u00106i\u000e", "5dc X3>Q(~y=(\f\t\u0017i\u0007/\u007fN", "u(;7T=:\u001d z\u0004`uc\u00138gU", "Adc X3>Q(~y=(\f\t\u0017i\u0007/\u007fN", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;C\u0019", "\u0011n\\=T5B]\"", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class DatePickerStateImpl extends BaseDatePickerStateImpl implements DatePickerState {
    public static final Companion Companion = new Companion(null);
    private MutableState<DisplayMode> _displayMode;
    private MutableState<CalendarDate> _selectedDate;

    public /* synthetic */ DatePickerStateImpl(Long l2, Long l3, IntRange intRange, int i2, SelectableDates selectableDates, Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(l2, l3, intRange, i2, selectableDates, locale);
    }

    private DatePickerStateImpl(Long l2, Long l3, IntRange intRange, int i2, SelectableDates selectableDates, Locale locale) {
        CalendarDate canonicalDate;
        super(l3, intRange, selectableDates, locale);
        if (l2 != null) {
            canonicalDate = getCalendarModel().getCanonicalDate(l2.longValue());
            if (!intRange.contains(canonicalDate.getYear())) {
                throw new IllegalArgumentException(("The provided initial date's year (" + canonicalDate.getYear() + ") is out of the years range of " + intRange + '.').toString());
            }
        } else {
            canonicalDate = null;
        }
        this._selectedDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(canonicalDate, null, 2, null);
        this._displayMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DisplayMode.m2079boximpl(i2), null, 2, null);
    }

    @Override // androidx.compose.material3.DatePickerState
    public Long getSelectedDateMillis() {
        CalendarDate value = this._selectedDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DatePickerState
    public void setSelectedDateMillis(Long l2) {
        if (l2 != null) {
            CalendarDate canonicalDate = getCalendarModel().getCanonicalDate(l2.longValue());
            if (!getYearRange().contains(canonicalDate.getYear())) {
                throw new IllegalArgumentException(("The provided date's year (" + canonicalDate.getYear() + ") is out of the years range of " + getYearRange() + '.').toString());
            }
            this._selectedDate.setValue(canonicalDate);
            return;
        }
        this._selectedDate.setValue(null);
    }

    @Override // androidx.compose.material3.DatePickerState
    /* JADX INFO: renamed from: getDisplayMode-jFl-4v0 */
    public int mo2054getDisplayModejFl4v0() {
        return this._displayMode.getValue().m2085unboximpl();
    }

    @Override // androidx.compose.material3.DatePickerState
    /* JADX INFO: renamed from: setDisplayMode-vCnGnXg */
    public void mo2055setDisplayModevCnGnXg(int i2) {
        Long selectedDateMillis = getSelectedDateMillis();
        if (selectedDateMillis != null) {
            setDisplayedMonthMillis(getCalendarModel().getMonth(selectedDateMillis.longValue()).getStartUtcTimeMillis());
        }
        this._displayMode.setValue(DisplayMode.m2079boximpl(i2));
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS@\u000fsڔ:Š\\:ڎs;\u0004\u0019>'\u000fOɁkg|J#/Q\u0010\u001e\"\tl<I\u0004{m\u0014\u001f2pnm5}sK=xtd\nP:0>\u0012\t/!\u0013Hn~ڂGT"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;;R7z4\u0002\u001dshwdm4Yr0KVW\u0002", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;;R7z4\u0002\u001dsh\u000f", "Ad[2V;:P ~YZ;|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.,?JkBs", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!<Y\u0007\u001f3z|8K?Bk\n", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<DatePickerStateImpl, Object> Saver(final SelectableDates selectableDates, final Locale locale) {
            return ListSaverKt.listSaver(new Function2<SaverScope, DatePickerStateImpl, List<? extends Object>>() { // from class: androidx.compose.material3.DatePickerStateImpl$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                public final List<Object> invoke(SaverScope saverScope, DatePickerStateImpl datePickerStateImpl) {
                    return CollectionsKt.listOf(datePickerStateImpl.getSelectedDateMillis(), Long.valueOf(datePickerStateImpl.getDisplayedMonthMillis()), Integer.valueOf(datePickerStateImpl.getYearRange().getFirst()), Integer.valueOf(datePickerStateImpl.getYearRange().getLast()), Integer.valueOf(datePickerStateImpl.mo2054getDisplayModejFl4v0()));
                }
            }, new Function1<List, DatePickerStateImpl>() { // from class: androidx.compose.material3.DatePickerStateImpl$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ DatePickerStateImpl invoke(List list) {
                    return invoke2((List<? extends Object>) list);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final DatePickerStateImpl invoke2(List<? extends Object> list) {
                    Long l2 = (Long) list.get(0);
                    Long l3 = (Long) list.get(1);
                    Object obj = list.get(2);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) obj).intValue();
                    Object obj2 = list.get(3);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                    IntRange intRange = new IntRange(iIntValue, ((Integer) obj2).intValue());
                    Object obj3 = list.get(4);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                    return new DatePickerStateImpl(l2, l3, intRange, DisplayMode.m2080constructorimpl(((Integer) obj3).intValue()), selectableDates, locale, null);
                }
            });
        }
    }
}
