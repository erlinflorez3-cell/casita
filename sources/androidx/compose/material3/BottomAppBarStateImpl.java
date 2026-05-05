package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4D\u0007\"B\u0012\u007f\u0007l{?1Z͜x.\u0001Rj*{\u007fB$s$ DKY(\u007f:\t}Owk|Mr\u000bq\u0010و\u001axx0\u001aa\u0007b*\u000f`HFЃ?ޜs=AśEH\u0013'J\"fz;UpݩJǘz~[M\u0012\u001a>IAc`\u0018e\u0005H\u00136B.\u000b6\\\u0016Ol\u001d+2\u0011Ǚݙ\u0003ݦF^/a6\f[\u001d^V-\u0019\u0005j>-FDC#uu\u0011\u0019j[m\u0004ouK\u0016\u0001'U,\u007fH\u0016\u000b/ó Ʀ/Y%_x9j\u000eqb\u0012;9]4t^#@w)|=@\u0012\u0018\u001e'v/cn%\\dޮώrՂD`\n`H\u0018\tqN\u0019+\u0016A4Y\u001dlhoIϳRP"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S/Dh\b(\u0013x!\u000bIP)z0-\u0015LiD\u000e9", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S/Dh\b(\u0013x!\u000bIP)z0-\u0015>", "7mXA\\(E6\u0019\u0003|a;f\n0s\u007f7bD\t\u001b&", "", "7mXA\\(E6\u0019\u0003|a;f\n0s\u007f7", "7mXA\\(E1#\b\n^5\fr0f\u000e(\u000b", "uE5\u0013\u001c\u001d", "-gT6Z/M=\u001a\u007f\t^;", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "1n[9T7LS\u0018_\bZ*\f\r9n", "5dc\u0010b3EO$\rz]\r\n\u0005-t\u00042\u0005", "u(5", "\nrTA \u0006\u0017", "1n]AX5M=\u001a\u007f\t^;", "5dc\u0010b5MS\"\u000ed_-\u000b\t>", "Adc\u0010b5MS\"\u000ed_-\u000b\t>", "uE\u0018#", "1n]AX5M=\u001a\u007f\t^;;\b/l\u007f*wO\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "<df\u001cY-LS(", "6dX4[;(T\u001a\rzm", "5dc\u0015X0@V(h{_:|\u0018", "Adc\u0015X0@V(h{_:|\u0018", "6dX4[;(T\u001a\rzm\u0013\u0001\u00113t", "5dc\u0015X0@V(h{_:|\u0018\u0016i\b,\u000b", "Adc\u0015X0@V(h{_:|\u0018\u0016i\b,\u000b", "6dX4[;(T\u001a\rzm\u0013\u0001\u00113t>'{G\u0001\u0019\u0013Vo", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class BottomAppBarStateImpl implements BottomAppBarState {
    private MutableFloatState _heightOffset;
    private final MutableFloatState contentOffset$delegate;
    private final MutableFloatState heightOffsetLimit$delegate;

    public BottomAppBarStateImpl(float f2, float f3, float f4) {
        this.heightOffsetLimit$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this.contentOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f4);
        this._heightOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(f3);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public float getHeightOffsetLimit() {
        return this.heightOffsetLimit$delegate.getFloatValue();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public void setHeightOffsetLimit(float f2) {
        this.heightOffsetLimit$delegate.setFloatValue(f2);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public float getHeightOffset() {
        return this._heightOffset.getFloatValue();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public void setHeightOffset(float f2) {
        this._heightOffset.setFloatValue(RangesKt.coerceIn(f2, getHeightOffsetLimit(), 0.0f));
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public float getContentOffset() {
        return this.contentOffset$delegate.getFloatValue();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public void setContentOffset(float f2) {
        this.contentOffset$delegate.setFloatValue(f2);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public float getCollapsedFraction() {
        if (getHeightOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return getHeightOffset() / getHeightOffsetLimit();
    }
}
