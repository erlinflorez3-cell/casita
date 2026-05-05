package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import java.util.Locale;
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
/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\r8é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS@\u000fs{:$c$\bCCU0}*ޛWN}gvJ`\u001bI.\u001cǝ)jZH\u0016\"m\u0018\u001d2ZqU2{pM=nvN\u0005N52<\b\t\u0019\u001aXM ~\tIc\u0010@7)p\u0019ZҫQ\u0005(\u001bVP.\u000b6bwPFH\u001bih:yɈuŌR'gܞM\\\u001bSl';\u0005Ґ\"1HʺM\u0017+b\u0011\u0017#}M\u0015Wqk\u0006\u0019+5<as\u00067\u000fDRY\u0002̄\u0019ǁv0t\u0007Ws\u001a;KQi`^$x!\t\u007f%<2\u00136+VEE\u001a\u0015\rDw37*úП\u0002ެF\u0010\u0003c<33\u001dK-?3tj\u0002=\u001fhE\u0017U\u001c,%\u0019nO^ڍ\u0012f\u001dÑlyWO__שLn"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S!CY\\\u001cFm\u00012KI;x\"-\u0011wa\u001d\u000fn3$", "", "7mXA\\(E2\u001d\r\u0006e(\u0011\t.M\n1\u000bCh\u001b\u001eNs\u001c", "", "GdP?E(GU\u0019", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "Ad[2V;:P ~YZ;|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.,?JkBs", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!<Y\u0007\u001f3z|8K?Bk\n", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;f.\u0006O\b\u001b \u0011|\nEx%C#a)FZ\u00127OC\u0011R0'\u0014uk=\u0006vuL\u0001/RV\\,&ZnL\u0014\u001f^\nUxVrYH$lS3\u001c\u000f,(}Jh\u000fa|\u00131{l\ff\u001fK\u0001^\\K'dMY5=8", "-cX@c3:g\u0019}bh5\f\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"PkB\u0016f\u0002", "1`[2a+:`\u0001\ty^3", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"Pk8\u0007j\u0002", "5dc\u0010T3>\\\u0018z\bF6{\t6", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn9b\r Dv\u00125\u0017!7r4'\u0014dn!\u0011b,UL", ";n]A[\u0014BZ \u0003\t", "2hb=_(RS\u0018f\u0005g;\u007fp3l\u0007,\n", "5dc\u0011\\:IZ\u0015\u0013z]\u0014\u0007\u0012>hg,\u0003G\u0005%", "u(9", "Adc\u0011\\:IZ\u0015\u0013z]\u0014\u0007\u0012>hg,\u0003G\u0005%", "uI\u0018#", "\nrTA \u0006\u0017", "5dc X3>Q(zwe,[\u0005>e\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn#Y\u0005 5|\u0012+TC\u001agC\u001e#>", "Adc X3>Q(zwe,[\u0005>e\u000e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00135`}\u001eFi\u00135M\"7z4,j,R", "Ad[2V;:P ~YZ;|\u0017md\u007f/{B|&\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "5dc&X(K@\u0015\b|^", "u(;8b;EW\"H\bZ5~\t=/c1\u000b-| \u0019GE", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class BaseDatePickerStateImpl {
    public static final int $stable = 0;
    private MutableState<CalendarMonth> _displayedMonth;
    private final CalendarModel calendarModel;
    private final MutableState selectableDates$delegate;
    private final IntRange yearRange;

    public BaseDatePickerStateImpl(Long l2, IntRange intRange, SelectableDates selectableDates, Locale locale) {
        CalendarMonth month;
        this.yearRange = intRange;
        CalendarModel calendarModelCreateCalendarModel = CalendarModel_androidKt.createCalendarModel(locale);
        this.calendarModel = calendarModelCreateCalendarModel;
        this.selectableDates$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(selectableDates, null, 2, null);
        if (l2 != null) {
            month = calendarModelCreateCalendarModel.getMonth(l2.longValue());
            if (!intRange.contains(month.getYear())) {
                throw new IllegalArgumentException(("The initial display month's year (" + month.getYear() + ") is out of the years range of " + intRange + '.').toString());
            }
        } else {
            month = calendarModelCreateCalendarModel.getMonth(calendarModelCreateCalendarModel.getToday());
        }
        this._displayedMonth = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(month, null, 2, null);
    }

    public final IntRange getYearRange() {
        return this.yearRange;
    }

    public final CalendarModel getCalendarModel() {
        return this.calendarModel;
    }

    public final SelectableDates getSelectableDates() {
        return (SelectableDates) this.selectableDates$delegate.getValue();
    }

    public final void setSelectableDates(SelectableDates selectableDates) {
        this.selectableDates$delegate.setValue(selectableDates);
    }

    public final long getDisplayedMonthMillis() {
        return this._displayedMonth.getValue().getStartUtcTimeMillis();
    }

    public final void setDisplayedMonthMillis(long j2) {
        CalendarMonth month = this.calendarModel.getMonth(j2);
        if (!this.yearRange.contains(month.getYear())) {
            throw new IllegalArgumentException(("The display month's year (" + month.getYear() + ") is out of the years range of " + this.yearRange + '.').toString());
        }
        this._displayedMonth.setValue(month);
    }
}
