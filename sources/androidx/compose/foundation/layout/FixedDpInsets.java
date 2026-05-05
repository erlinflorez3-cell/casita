package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
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
/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{J$c$wCCU0}*\tUPog|VbŏI\u0010\u001cǝ)jZH\u0016\u001cm\u0016\u001d2Zom4]sK;xtd\u0006060;\u0012\u0005/\u001b:L\u001ez\u0013Cy\rܘ4@~?\u001b\u001e[\f2\u00124FP\u0007,e\u007fPLG\u001bg\u0001Ǚ#KwPY?_^\t}\u0011Ta?\r%od?\tMC$=S1\u0013\u0003_M\u0010Wqk\u0013\u0019+5;as\u0006G\u001f\u0014\\+9a%]!2\r\t_m$'Y]\u0014O^\u001e@w)\rSPL\u001c\u0014:`.[&\u0017\f\u001c@\rr\u0002N\u0017\u0016'H\u000e\u000fy6E1FGs?){iai/\u0015KL\u0019\u001b\";\u0001\u001d\"2٭\u0010ؤ\u0014ÑȑvPśUBEH\\\u0010*Q{\u0004\tb0+Z΅IƂ.Ʌö-\u0016É;]A#/qR\\Rj\u000f\u0005\u000fi*֢TΫ?̎Ļ\u00156Ҋ\r\u000ebDr\u000b<dbZD\u0011{\u001d+\u0378\u007fު\u0012\u05feиv;Ƽ)\u0012VOvoҗMf\u0012(5ϫS\bms\u000e]Xӽ7L"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v2`C:J?\u0002\u001evaH\u00159", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", ":dUA77", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "Bn_\u0011c", "@hV5g\u000bI", "0ncAb4\u001d^", "uE5\u00139\u0013D](\u0006~gu\u0002\u001a7/\u00041\u000b@\u000e \u0013N9l<w!E`\r}Av$=ZS9z>+|dn?\u0007p\u0002\u0012g", "\u0014", "3pd._:", "", "=sW2e", "", "5dc\u000fb;M]!", "", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "5dc\u0019X-M", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u001f\\.Ab", "5dc!b7", "6`b566=S", "BnBAe0GU", "", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class FixedDpInsets implements WindowInsets {
    private final float bottomDp;
    private final float leftDp;
    private final float rightDp;
    private final float topDp;

    public /* synthetic */ FixedDpInsets(float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5);
    }

    private FixedDpInsets(float f2, float f3, float f4, float f5) {
        this.leftDp = f2;
        this.topDp = f3;
        this.rightDp = f4;
        this.bottomDp = f5;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return density.mo704roundToPx0680j_4(this.leftDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return density.mo704roundToPx0680j_4(this.topDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return density.mo704roundToPx0680j_4(this.rightDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return density.mo704roundToPx0680j_4(this.bottomDp);
    }

    public String toString() {
        return "Insets(left=" + ((Object) Dp.m6649toStringimpl(this.leftDp)) + ", top=" + ((Object) Dp.m6649toStringimpl(this.topDp)) + ", right=" + ((Object) Dp.m6649toStringimpl(this.rightDp)) + ", bottom=" + ((Object) Dp.m6649toStringimpl(this.bottomDp)) + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDpInsets)) {
            return false;
        }
        FixedDpInsets fixedDpInsets = (FixedDpInsets) obj;
        return Dp.m6643equalsimpl0(this.leftDp, fixedDpInsets.leftDp) && Dp.m6643equalsimpl0(this.topDp, fixedDpInsets.topDp) && Dp.m6643equalsimpl0(this.rightDp, fixedDpInsets.rightDp) && Dp.m6643equalsimpl0(this.bottomDp, fixedDpInsets.bottomDp);
    }

    public int hashCode() {
        return (((((Dp.m6644hashCodeimpl(this.leftDp) * 31) + Dp.m6644hashCodeimpl(this.topDp)) * 31) + Dp.m6644hashCodeimpl(this.rightDp)) * 31) + Dp.m6644hashCodeimpl(this.bottomDp);
    }
}
