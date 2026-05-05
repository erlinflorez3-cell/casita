package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4B\u0007\":\u001b\u007f\u0007lpA0ZeP.Xa2\u000f\u0002{<$a(wCQ٥8!R\t}M f\u0012\u000bu\u001bG\u001d\u0006.x\u0019-YY\u0007_*\u000f`C\u007fCAP\b=gdҽ:\u0005.7rZ\b\f\u0019\u001aXI@z\tIc\f@1vEx'c˶\u0011ܨ\u0016\u0010V\"\u0007&jpn8NvkE\u007f2\u0011uZNUl݁\u0001S\u0015Ͽl)\u0013\u0005o-{XEE-%\u0002\u0007]ҏgύ\u0007Kyܵ\u001dj-79Z\u0014Y<j\u000e'eT]\"urT`5Un ?+}g\u0002%L|Nߕԗ\rʀ\b\u001e\u000e)NE;2~\n\u0014H\u0003\u0004sBV\u0018lUP\u001doO/%.4[=)liai\u001a\u0005\f:Yc̫/ъr+sV\u0014z#$tyWL_K\u000eW\\&q=\u001c\u0011Ͳf\b2ʶHI\u0006L\n ~F3Vs9Q?\u001c\u0006VX\u007fv3~\u001f(('\u001fخ̝nߤ6ѧė\u000bYֈh\u0015sRZz:)e\u001eZ'\f\u00113\"b\u0019J,غ\u0010WWkoҶi\f\t-/lV֓r\u0010"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;;R7z4\u0002\u001dsh\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;;R7z4s", "7mXA\\(E6#\u000f\b", "", "7mXA\\(E;\u001d\b\u000bm,", "7r!\u0001;6N`", "", "uH8'\u001c\u001d", "D`[BX", "6nd?", "5dc\u0015b<K", "u(8", "Adc\u0015b<K", "uH\u0018#", "6nd?F;:b\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0004@|\u0004=IR;A", "5dc\u0015b<KA(z\n^", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006^5DUz'7Q\u001f=;R7z4s", "7r!\u0001[6N`", "u(I", "Adc~'/Hc&", "uY\u0018#", "\nrTA \u0006\u0017", "7r03g,K\\#\t\u0004", "Adc\u000eY;>`\"\t\u0005g", "7r03g,K\\#\t\u0004\u001d+|\u0010/g{7{", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", ";h]Bg,", "5dc\u001a\\5Nb\u0019", "Adc\u001a\\5Nb\u0019", ";h]Bg,,b\u0015\u000ez", "5dc\u001a\\5Nb\u0019l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;;CBk2-\u0019rj!\u0011b,$", "Ad[2V;B]\"", "5dc X3>Q(\u0003\u0005gs\u0011\t-R\u000f\u0005_", "Adc X3>Q(\u0003\u0005gsM\u0003\u0002sP\u0007g", "Ad[2V;B]\"=y^3|\u000b+t\u007f", "\u0011n\\=T5B]\"", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class TimePickerStateImpl implements TimePickerState {
    public static final Companion Companion = new Companion(null);
    private final MutableIntState hourState;
    private boolean is24hour;
    private final MutableState isAfternoon$delegate;
    private final MutableIntState minuteState;
    private final MutableState selection$delegate;

    public TimePickerStateImpl(int i2, int i3, boolean z2) {
        if (i2 < 0 || i2 >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range".toString());
        }
        if (i3 < 0 || i3 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range".toString());
        }
        this.is24hour = z2;
        this.selection$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TimePickerSelectionMode.m2762boximpl(TimePickerSelectionMode.Companion.m2769getHouryecRtBI()), null, 2, null);
        this.isAfternoon$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(i2 >= 12), null, 2, null);
        this.hourState = SnapshotIntStateKt.mutableIntStateOf(i2 % 12);
        this.minuteState = SnapshotIntStateKt.mutableIntStateOf(i3);
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean is24hour() {
        return this.is24hour;
    }

    @Override // androidx.compose.material3.TimePickerState
    public void set24hour(boolean z2) {
        this.is24hour = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: getSelection-yecRtBI */
    public int mo1776getSelectionyecRtBI() {
        return ((TimePickerSelectionMode) this.selection$delegate.getValue()).m2768unboximpl();
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: setSelection-6_8s6DQ */
    public void mo1777setSelection6_8s6DQ(int i2) {
        this.selection$delegate.setValue(TimePickerSelectionMode.m2762boximpl(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.TimePickerState
    public boolean isAfternoon() {
        return ((Boolean) this.isAfternoon$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setAfternoon(boolean z2) {
        this.isAfternoon$delegate.setValue(Boolean.valueOf(z2));
    }

    public final MutableIntState getHourState() {
        return this.hourState;
    }

    public final MutableIntState getMinuteState() {
        return this.minuteState;
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getMinute() {
        return this.minuteState.getIntValue();
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setMinute(int i2) {
        this.minuteState.setIntValue(i2);
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getHour() {
        return this.hourState.getIntValue() + (isAfternoon() ? 12 : 0);
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setHour(int i2) {
        setAfternoon(i2 >= 12);
        this.hourState.setIntValue(i2 % 12);
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ}џg\u0001ˎ`D\u0014GnWY*Ƃo{B$$2\u007fDS_*\u007f2\t}QwgtK\t\rå\u0013\n"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;;R7z4\u0002\u001dshwdm4Yr0KVW\u0002", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;;R7z4\u0002\u001dsh\u000f", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<TimePickerStateImpl, ?> Saver() {
            return SaverKt.Saver(new Function2<SaverScope, TimePickerStateImpl, List<? extends Object>>() { // from class: androidx.compose.material3.TimePickerStateImpl$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                public final List<Object> invoke(SaverScope saverScope, TimePickerStateImpl timePickerStateImpl) {
                    return CollectionsKt.listOf(Integer.valueOf(timePickerStateImpl.getHour()), Integer.valueOf(timePickerStateImpl.getMinute()), Boolean.valueOf(timePickerStateImpl.is24hour()));
                }
            }, new Function1<List, TimePickerStateImpl>() { // from class: androidx.compose.material3.TimePickerStateImpl$Companion$Saver$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ TimePickerStateImpl invoke(List list) {
                    return invoke2((List<? extends Object>) list);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final TimePickerStateImpl invoke2(List<? extends Object> list) {
                    Object obj = list.get(0);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) obj).intValue();
                    Object obj2 = list.get(1);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue2 = ((Integer) obj2).intValue();
                    Object obj3 = list.get(2);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    return new TimePickerStateImpl(iIntValue, iIntValue2, ((Boolean) obj3).booleanValue());
                }
            });
        }
    }
}
