package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
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
/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4S\u0007\"B\u0012\u007f\u0007loA0RnP\u008cZS8şsڔ<$i*yّCU(\n*ޛUM}˧\u001fJ\t\n\u0004:\u0016\u001c~j:Imx\f\u0013\u001f8HoM5eok:pz<\u0005.5:8(\u0006\u0011 0H\u001ez\u0013Cy\rܘ4@~?\u001b [\u00162\u00124?f\u0015ʟ[f¦5ԟǰa<55\u0011r\u000bi5rH|{\u000evX5!\u000faL@\u0007KÆ\u0014$ھ\u0002ޗқ_A\tU\u007fTM\u00045?CI\"Xf\\\u000e(-+}\"$\u0007Ο[\u0004Ƣ_ϯˏ/Qid^%p\u000b\t\u0016%<2\u000fL;З-,ָeڜԧ7vxnNYJoP\u001c\u0013ad4U\u0006AIQ\u001d|P\u0010Z_ע7D\u000b\u001b>;\u0001\u001dB\"hVf#=lw\u007fT\u0018T\u000ej\\\u000eq=\u001c\u0005'fX×\u0006ϻFĉôz\u0010ѧ\u001b3?[G-1m\bNRn\u000f\u0007fpar#jN%\u0007\u0016e+?\u00101խf̆j¬ղW+ҭQ*\\\u0007\f\u0012#\"b\u0003J(=\u0012T[vr;ok\n=/\u00158\u0010rBޕY¢]ڨΉPbߧe`~\u0014MFr\u0007^sPZ$\\b60;\u0019\r\u001ey\u0014D|\rI6\u0016ڬ\u001eڲ+ջɂ[\u0014Ƞ\u0007,JA\u000b\u0013o\\n\u001f\r[K&\ty2}ժ\u0001Ydsuρ\u0015w+\u0005`(L۴UY"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u0015G4Y}|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "AsP?g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "Bn_", "3mS", "0ncAb4", "uE5\u00139\u0013D](\u0006~gu\u0002\u001a7/\u00041\u000b@\u000e \u0013N9l<w!E`\r}Av$=ZS9z>+|dn?\u0007p\u0002\u0012g", "5dc\u000fb;M]!FY2\f\u0002X0M>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "u(E", "5dc\u000fb;M]!FY2\f\u0002X0M", "u(5", "\u0014", "5dc\u0012a+\u00062l^\u007f.-dG+n\t2\u000b<\u0010\u001b!P}", "5dc\u0012a+\u00062l^\u007f.-d", "5dc g(Kb`]N>1L\n\u0017${1\u0005J\u0010\u0013&Ky\u0017J", "5dc g(Kb`]N>1L\n\u0017", "5dc!b7\u00062l^\u007f.-dG+n\t2\u000b<\u0010\u001b!P}", "5dc!b7\u00062l^\u007f.-d", "1`[0h3:b\u0019[\u0005m;\u0007\u0011\u001aa~'\u007fI\u0003", "1`[0h3:b\u0019[\u0005m;\u0007\u0011\u001aa~'\u007fI\u0003^u\u001bO\u0013\fw\r", "1`[0h3:b\u0019ez_;g\u0005.d\u00041}", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "1`[0h3:b\u0019ez_;g\u0005.d\u00041}\b\u0011c'Q]}$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W#r9?i\r~;z\u0016,\\GEt\nau", "1`[0h3:b\u0019k~`/\fs+d~,\u0005B", "1`[0h3:b\u0019k~`/\fs+d~,\u0005BH'cWy{,^", "1`[0h3:b\u0019m\u0005i\u0017x\b.i\t*", "1`[0h3:b\u0019m\u0005i\u0017x\b.i\t*C\u001fTv\u001c\u0017pu", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PaddingValuesImpl implements PaddingValues {
    public static final int $stable = 0;
    private final float bottom;
    private final float end;
    private final float start;
    private final float top;

    public /* synthetic */ PaddingValuesImpl(float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5);
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1035getBottomD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getEnd-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1036getEndD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getStart-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1037getStartD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1038getTopD9Ej5fM$annotations() {
    }

    private PaddingValuesImpl(float f2, float f3, float f4, float f5) {
        this.start = f2;
        this.top = f3;
        this.end = f4;
        this.bottom = f5;
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative".toString());
        }
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative".toString());
        }
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative".toString());
        }
        if (f5 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative".toString());
        }
    }

    /* JADX INFO: renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m1041getStartD9Ej5fM() {
        return this.start;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m1042getTopD9Ej5fM() {
        return this.top;
    }

    /* JADX INFO: renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m1040getEndD9Ej5fM() {
        return this.end;
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m1039getBottomD9Ej5fM() {
        return this.bottom;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
    public float mo969calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.start : this.end;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM */
    public float mo971calculateTopPaddingD9Ej5fM() {
        return this.top;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
    public float mo970calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.end : this.start;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo968calculateBottomPaddingD9Ej5fM() {
        return this.bottom;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
        return Dp.m6643equalsimpl0(this.start, paddingValuesImpl.start) && Dp.m6643equalsimpl0(this.top, paddingValuesImpl.top) && Dp.m6643equalsimpl0(this.end, paddingValuesImpl.end) && Dp.m6643equalsimpl0(this.bottom, paddingValuesImpl.bottom);
    }

    public int hashCode() {
        return (((((Dp.m6644hashCodeimpl(this.start) * 31) + Dp.m6644hashCodeimpl(this.top)) * 31) + Dp.m6644hashCodeimpl(this.end)) * 31) + Dp.m6644hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) Dp.m6649toStringimpl(this.start)) + ", top=" + ((Object) Dp.m6649toStringimpl(this.top)) + ", end=" + ((Object) Dp.m6649toStringimpl(this.end)) + ", bottom=" + ((Object) Dp.m6649toStringimpl(this.bottom)) + ')';
    }

    public /* synthetic */ PaddingValuesImpl(float f2, float f3, float f4, float f5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? Dp.m6638constructorimpl(0) : f2, (i2 + 2) - (2 | i2) != 0 ? Dp.m6638constructorimpl(0) : f3, (i2 + 4) - (4 | i2) != 0 ? Dp.m6638constructorimpl(0) : f4, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? Dp.m6638constructorimpl(0) : f5, null);
    }
}
