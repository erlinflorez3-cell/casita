package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106B\u0005+4\u0012\u0006\u0010nj?6LeV.ZS0\u0015qzJř\f$ B{X۟\u0002\"\u0017O\u0017ku\u0005bZ9ZW:$\u0011\u0003,wl)a (JB\u001eAcQ}WQ`#D5$@=Py3\u000fJ.V,\u000fzqM<\u0016>]\t:\u0001\u000f}\t(0\u001e>N\u0003n\u0006uQNH\u001b_j31\u0004\u0002B|)\u0016t;\u0012cІå'˼zq&-F?C\u001e=U\t\u000b``_\u0005EwK\f9P55as\u00068\t\u0004\"\u0016CO;_)j\u001bI(ӧϾ'˦SsSR\u00145\u0006\u0004\u0014\u000fB\u000f\u001c\u000bGJ49(mX7A\u0004\u000bSn^2bP\u0001\u0013ad%[Dqo\u0010ӜƧQň?)V9\u0002\u0019\u001b3;\u0003t1ie.b\u001b-b\u000bά5p"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U21k}-\"z\u0016-QAJoE\u001eqd_?tr(]v|", "", "u(E", "\nrTA \u0006\u0017", "", "AbP9X\u001f\u001dW'\u000evg*|", "5dc V(ES\f]~l;x\u0012-e", "u(5", "Adc V(ES\f]~l;x\u0012-e", "uE\u0018#", "AbP9X\u001f\u001dW'\u000evg*|G.e\u0007(}<\u0010\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "AbP9X \u001dW'\u000evg*|", "5dc V(ES\r]~l;x\u0012-e", "Adc V(ES\r]~l;x\u0012-e", "AbP9X \u001dW'\u000evg*|G.e\u0007(}<\u0010\u0017", "", "AvX=X\f=U\u0019fvm*\u007f\t=D\r$\u000e@\u000e", "5dc j0ISx}|^\u0014x\u0018-h\u007f6ZM|)\u0017T", "u(I", "Adc j0ISx}|^\u0014x\u0018-h\u007f6ZM|)\u0017T", "uY\u0018#", "AvX=X\f=U\u0019fvm*\u007f\t=D\r$\u000e@\u000eU\u0016Gv\u000e>r45", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "1kT.e", "", "CoS.g,", ">q^4e,La", "AvX=X\f=U\u0019ez_;", "7rAA_", ";`g V(ES\f]~l;x\u0012-ea5\u0006R", ";`g V(ES\f]~l;x\u0012-em+\tD\n\u001d", ";`g V(ES\r]~l;x\u0012-e", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DrawerPredictiveBackState {
    public static final int $stable = 0;
    private final MutableState swipeEdgeMatchesDrawer$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    private final MutableFloatState scaleXDistance$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    private final MutableFloatState scaleYDistance$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getSwipeEdgeMatchesDrawer() {
        return ((Boolean) this.swipeEdgeMatchesDrawer$delegate.getValue()).booleanValue();
    }

    public final void setSwipeEdgeMatchesDrawer(boolean z2) {
        this.swipeEdgeMatchesDrawer$delegate.setValue(Boolean.valueOf(z2));
    }

    public final float getScaleXDistance() {
        return this.scaleXDistance$delegate.getFloatValue();
    }

    public final void setScaleXDistance(float f2) {
        this.scaleXDistance$delegate.setFloatValue(f2);
    }

    public final float getScaleYDistance() {
        return this.scaleYDistance$delegate.getFloatValue();
    }

    public final void setScaleYDistance(float f2) {
        this.scaleYDistance$delegate.setFloatValue(f2);
    }

    public final void update(float f2, boolean z2, boolean z3, float f3, float f4, float f5) {
        setSwipeEdgeMatchesDrawer(z2 != z3);
        if (!getSwipeEdgeMatchesDrawer()) {
            f3 = f4;
        }
        setScaleXDistance(MathHelpersKt.lerp(0.0f, f3, f2));
        setScaleYDistance(MathHelpersKt.lerp(0.0f, f5, f2));
    }

    public final void clear() {
        setSwipeEdgeMatchesDrawer(true);
        setScaleXDistance(0.0f);
        setScaleYDistance(0.0f);
    }
}
