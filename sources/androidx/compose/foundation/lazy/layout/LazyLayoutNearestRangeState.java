package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: LazyLayoutNearestRangeState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<H\u0007\"2\u001d\u007f\u0007tjA0JeN\u008chݷH \u001c\u0002D&k$ CiTR|3Ij^kuobZ9E\u001f\n${\u0003,wW\ta \u0013JB\u001eAݯQoK>)\u0001D\u001482PH*\t\u000f\u001bBH>xKOY\u0010*0nr\u0011Ĩ\u000f̂\t\u001a\u001aß\u000f,\u000f$tg|8\u001fǐiƠ3#\u000b݃\u0013Z5bH|{\u000f\u001dÙ)˼za&Ѩ\u0011`C\u001d=S1\u0007\u0003_M\nWqk\u0005\u001f{e{ ֬ɝ6ݼ\u0004$\u001d-U\u001ak\u0001>^\u000bZn\u0016G-UnY\\˔,\n"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;7v#TL\\;IN{?\u0014\u007fi\n]+b", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "4ha@g\u001dBa\u001d{\u0002^\u0010\f\t7", "", "AkX1\\5@E\u001d\byh>j\rDe", "3wc?T\u0010MS!\\\u0005n5\f", "uH8\u0016\u001c\u001d", ":`bA90Ka(o~l0y\u0010/I\u000f(\u0004", "\nrTA \u0006\u0017", "D`[BX", "5dc#T3NS", "u(;8b;EW\"H\bZ5~\t=/c1\u000b-| \u0019GE", "Adc#T3NS", "uKZ<g3B\\b\fvg.|\u0017xI\t7h<\n\u0019\u0017\u001d3~", "D`[BXj=S ~|Z;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "CoS.g,", "", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyLayoutNearestRangeState implements State<IntRange> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private final int extraItemCount;
    private int lastFirstVisibleItem;
    private final int slidingWindowSize;
    private final MutableState value$delegate;

    public LazyLayoutNearestRangeState(int i2, int i3, int i4) {
        this.slidingWindowSize = i3;
        this.extraItemCount = i4;
        this.value$delegate = SnapshotStateKt.mutableStateOf(Companion.calculateNearestItemsRange(i2, i3, i4), SnapshotStateKt.structuralEqualityPolicy());
        this.lastFirstVisibleItem = i2;
    }

    private void setValue(IntRange intRange) {
        this.value$delegate.setValue(intRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.State
    public IntRange getValue() {
        return (IntRange) this.value$delegate.getValue();
    }

    public final void update(int i2) {
        if (i2 != this.lastFirstVisibleItem) {
            this.lastFirstVisibleItem = i2;
            setValue(Companion.calculateNearestItemsRange(i2, this.slidingWindowSize, this.extraItemCount));
        }
    }

    /* JADX INFO: compiled from: LazyLayoutNearestRangeState.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007lk?ӇE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004s(~:\t}P\u0018k|Mr\u000bq\u00136\u001a\u0007oDI\u0004|\u000e\u0016\u001d8Zom7\u0014o\u07b2=g"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;7v#TL\\;IN{?\u0014\u007fi\n]+KbcI/jM;)\u0011\u0002", "", "u(E", "1`[0h3:b\u0019gzZ9|\u0017>I\u000f(\u0004Nm\u0013 Io", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "4ha@g\u001dBa\u001d{\u0002^\u0010\f\t7", "", "AkX1\\5@E\u001d\byh>j\rDe", "3wc?T\u0010MS!\\\u0005n5\f", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final IntRange calculateNearestItemsRange(int i2, int i3, int i4) {
            int i5 = (i2 / i3) * i3;
            return RangesKt.until(Math.max(i5 - i4, 0), i5 + i3 + i4);
        }
    }
}
