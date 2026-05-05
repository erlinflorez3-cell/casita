package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
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
/* JADX INFO: compiled from: ObservableScopeInvalidator.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b<B\u0007\"2\u0016\u007f\u0007tsA0JgP.`Y2\u000fq~<$i0yCAV Ԅ`\u001fѧ~g\u0016m\u000bo\u001bO\u0015\u0006$x\u00032YW\t]@\u0011`CņC5SrK=)\u007fD\n82P:ѩ\t\u0003 0V\u0017?\u0013QS$\u0012^I!@`\u0017e\u00070\u00114=fԌ\u001f֔kP<Szi\u0003=1\u0010\u0002B|5&ݵ{֔\u0011HZ6\u001b\u0007*)9QO5C'٨\u0007\tXmM\n\b\u007fK\u0018\u0001'U?\u0010\u05ecV͏\\\u0002\u001a*9e]o\u0001&t\u000bab\u001c'YQ\u0012L'ʮ*Þ~{\u0015ɝǒ\r\u0006μG4=\u001cv\b<5#sՈDg"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005U1,\u0015ur5\u0004j,<t1RL25mNyA\u0013\u000ei\u0018[\u0001", "", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW$\u000741V\u0005 %|\u0012=M\u0019~R0'\u0014uk=\u0006vuL\u0001/RV\\,&_\u0003F#\u0016b\u000e\u0018\u0013\u001d\u0014U>+n2F\u001b\u0017,\u001f", "/sc.V/-]\u0007|\u0005i,", "/sc.V/-]\u0007|\u0005i,D\r7p\u0007", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW$\u000741V\u0005 %|\u0012=M\u0019~\\", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW$\u000741V\u0005 %|\u0012=M\u0019\"p0/\u00112h5\u0010eu8s,GJ]\u0002 G", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW$\u000741V\u0005 %|\u0012=M\u0019~O", "7me._0=O(~h\\6\b\t", "7me._0=O(~h\\6\b\tvi\b3\u0003", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW$\u000741V\u0005 %|\u0012=M\u0019~R9\u001a&d+@\u0003l.\u0018d6TPW.2", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class ObservableScopeInvalidator {
    private final MutableState<Unit> state;

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ ObservableScopeInvalidator m1193boximpl(MutableState mutableState) {
        return new ObservableScopeInvalidator(mutableState);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static MutableState<Unit> m1194constructorimpl(MutableState<Unit> mutableState) {
        return mutableState;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m1196equalsimpl(MutableState<Unit> mutableState, Object obj) {
        return (obj instanceof ObservableScopeInvalidator) && Intrinsics.areEqual(mutableState, ((ObservableScopeInvalidator) obj).m1201unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m1197equalsimpl0(MutableState<Unit> mutableState, MutableState<Unit> mutableState2) {
        return Intrinsics.areEqual(mutableState, mutableState2);
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m1198hashCodeimpl(MutableState<Unit> mutableState) {
        return mutableState.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m1200toStringimpl(MutableState<Unit> mutableState) {
        return "ObservableScopeInvalidator(state=" + mutableState + ')';
    }

    public boolean equals(Object obj) {
        return m1196equalsimpl(this.state, obj);
    }

    public int hashCode() {
        return m1198hashCodeimpl(this.state);
    }

    public String toString() {
        return m1200toStringimpl(this.state);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ MutableState m1201unboximpl() {
        return this.state;
    }

    private /* synthetic */ ObservableScopeInvalidator(MutableState mutableState) {
        this.state = mutableState;
    }

    /* JADX INFO: renamed from: constructor-impl$default */
    public static /* synthetic */ MutableState m1195constructorimpl$default(MutableState mutableState, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            mutableState = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
        }
        return m1194constructorimpl(mutableState);
    }

    /* JADX INFO: renamed from: attachToScope-impl */
    public static final void m1192attachToScopeimpl(MutableState<Unit> mutableState) {
        mutableState.getValue();
    }

    /* JADX INFO: renamed from: invalidateScope-impl */
    public static final void m1199invalidateScopeimpl(MutableState<Unit> mutableState) {
        mutableState.setValue(Unit.INSTANCE);
    }
}
