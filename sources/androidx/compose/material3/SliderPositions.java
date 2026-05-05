package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
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
/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "\u0011U\u0010t\u007fy\u0018\\kZ)\riTCWpTH;\rmK[\u0005Z\u0001yR\n'zq[r\u0002\\b(,R'7?$\u0016_\u000e#lM")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b<G\u0007Ӭ4\u0012\u0006\u0019nj?>LeV7ZS0\u000fs{B*cҕwHQ٥J}P\b\u0010kwstJh\u000b[\u0015\u0016\u0018\tjZK\u0004ym\u0018\u00152PrW3{sެ=`\u0003;M1@6Py3\u0016J0V&\u000f|YJ:\u0011vϢp\u0003X\u001bd\u001d\u001a@\u001e\u00054QSjnf<Xnm:]%1jrX5eH\u0003]\u000fVTU\u000f%bTo~u\f՝ǻSΫ\u000bbcA\tK\u007fJ\u001dj-/9R\u0014Y<b\u000e\u001feT]\u001burT`5Un\u0012?+}g\u0002\u0015LfN߅ԗ\rʀ\b\u001e\u000e)NA;'~\n\u0014B\u0003\u0003sBV\u0013lTȾ~z"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d,9X}-\"w$2\\GEtBs", "", "7mXA\\(E/\u0017\u000e~o,i\u00058g\u007f", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?a\u001e!C~\u0012Ex\u0010?]\u0007/$i\u001f0M\u0019", "", "7mXA\\(EB\u001d|\u0001?9x\u0007>i\n1\n", "", "uKZ<g3B\\b\fvg.|\u0017xC\u00072\n@\u007fw\u001eQk\u001d@\u007f' c\u0002)FZ\u00127OC\u0011a\u0015a\u0006", "\nrTA \u0006\u0017", "/bc6i,+O\"\u0001z", "5dc\u000eV;Bd\u0019kvg.|", "u(;8b;EW\"H\bZ5~\t=/]/\u0006N\u0001\u0016wNy\nKz.7D\b$@|\u0003*VE;A", "Adc\u000eV;Bd\u0019kvg.|G7a\u000f(\tD|\u001edA|\u000eCv!CY", "uKZ<g3B\\b\fvg.|\u0017xC\u00072\n@\u007fw\u001eQk\u001d@\u007f' c\u0002)FZ\u00127OC\u0011/%", "/bc6i,+O\"\u0001z\u001d+|\u0010/g{7{", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "BhR899:Q(\u0003\u0005g:", "5dc!\\*D4&zxm0\u0007\u0012=", "u(J\u0013", "Adc!\\*D4&zxm0\u0007\u0012=$\b$\u000b@\u000e\u001b\u0013N=\bIv,5U\f ", "uZ5uI", "BhR899:Q(\u0003\u0005g:;\b/l\u007f*wO\u0001", "3pd._:", "", "=sW2e", "6`b566=S", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SliderPositions {
    public static final int $stable = 0;
    private final MutableState activeRange$delegate;
    private final MutableState tickFractions$delegate;

    public SliderPositions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public SliderPositions(ClosedFloatingPointRange<Float> closedFloatingPointRange, float[] fArr) {
        this.activeRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(closedFloatingPointRange, null, 2, null);
        this.tickFractions$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fArr, null, 2, null);
    }

    public /* synthetic */ SliderPositions(ClosedFloatingPointRange closedFloatingPointRange, float[] fArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? RangesKt.rangeTo(0.0f, 1.0f) : closedFloatingPointRange, (i2 & 2) != 0 ? new float[0] : fArr);
    }

    public final ClosedFloatingPointRange<Float> getActiveRange() {
        return (ClosedFloatingPointRange) this.activeRange$delegate.getValue();
    }

    public final void setActiveRange$material3_release(ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        this.activeRange$delegate.setValue(closedFloatingPointRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float[] getTickFractions() {
        return (float[]) this.tickFractions$delegate.getValue();
    }

    public final void setTickFractions$material3_release(float[] fArr) {
        this.tickFractions$delegate.setValue(fArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SliderPositions)) {
            return false;
        }
        SliderPositions sliderPositions = (SliderPositions) obj;
        return Intrinsics.areEqual(getActiveRange(), sliderPositions.getActiveRange()) && Arrays.equals(getTickFractions(), sliderPositions.getTickFractions());
    }

    public int hashCode() {
        return (getActiveRange().hashCode() * 31) + Arrays.hashCode(getTickFractions());
    }
}
