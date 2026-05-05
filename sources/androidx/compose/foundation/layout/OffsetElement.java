package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007tsAӄLe^.ZS@\u000fs{B$c$\bCCU \b*\t]Ȟo˧vJh\u0011KƤ\u000e\u0016\u0007v4I[zc\u0012%˰ruO5]ok9\u000fsv90609\u0012\u0005/\u001c:L\u001ey\u0013Cy\u000e\"4NtRR;R\u0015/ \fV1\u0011 lg|>Xnm:],1pŌR'e:ƊQ\rT_o\u0013\u0005u6+n7{)md\u0011\u001cj[m\bowK\u001b\u0001)=*w\u000b\u001e̓XH\u001a#Cg\r\f\flpMWn&?+}~\u0012dV6\u0006\u0017\u0014\rj\r>\n5eF-HfN\"{~\u0001qXP0gj\u007f)i|+u A1Q,vSq;GVG}\u0015\rL,/uĲ_T\u0014jڠ\u001fZ\u007f\u0383ISFIV[ZhKq\u001cp\u0011\u0007ò\b6OĉG}\u0017<%4\brG$9k0Jجfϸߌ_gרmZP@0\u0001.90\u0019\u001ak\u0015{\u0013nhT\u0007.ԃLȼϺ\u0006|ݔ\u0017(dwJ3=\u0012TbvzҗMf\u0012(5ϫS\bms\u000e]Xӽ7T"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u007f/NQ;z\u0014%\u0015paB\u00169", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u007f/NQ;z\u001d(\u0014h7", "F", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "G", "@s[\u000ej(KS", "", "7mb=X*M]&b\u0004_6", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uE5'?2Hb \u0003\u0004(1\u000e\u0011xf\u00101yO\u0005! U9nL\u007f#D]\b)\u0003C|4WRBo=g\u001ayi\u0003\u000bl;N\u00040CS\u0018\u000b\\SnM\u001b!8\u0018W9\u001c\u0012i?3xQ\u001f\u001b\u00152I\u000f\u0011,q", "5dc\u0016a:IS\u0017\u000e\u0005k\u0010\u0006\n9", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "5dc\u001fg3\u001ae\u0015\fz", "u(I", "5dc% \u000b\u00123\u001eN{F", "u(5", "\u0014", "5dc& \u000b\u00123\u001eN{F", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class OffsetElement extends ModifierNodeElement<OffsetNode> {
    private final Function1<InspectorInfo, Unit> inspectorInfo;
    private final boolean rtlAware;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f99x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f100y;

    public /* synthetic */ OffsetElement(float f2, float f3, boolean z2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, z2, function1);
    }

    /* JADX INFO: renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final float m974getXD9Ej5fM() {
        return this.f99x;
    }

    /* JADX INFO: renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final float m975getYD9Ej5fM() {
        return this.f100y;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    public final Function1<InspectorInfo, Unit> getInspectorInfo() {
        return this.inspectorInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private OffsetElement(float f2, float f3, boolean z2, Function1<? super InspectorInfo, Unit> function1) {
        this.f99x = f2;
        this.f100y = f3;
        this.rtlAware = z2;
        this.inspectorInfo = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OffsetNode create() {
        return new OffsetNode(this.f99x, this.f100y, this.rtlAware, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OffsetNode offsetNode) {
        offsetNode.m982setX0680j_4(this.f99x);
        offsetNode.m983setY0680j_4(this.f100y);
        offsetNode.setRtlAware(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        if (offsetElement == null) {
            return false;
        }
        return Dp.m6643equalsimpl0(this.f99x, offsetElement.f99x) && Dp.m6643equalsimpl0(this.f100y, offsetElement.f100y) && this.rtlAware == offsetElement.rtlAware;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((Dp.m6644hashCodeimpl(this.f99x) * 31) + Dp.m6644hashCodeimpl(this.f100y)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + ((Object) Dp.m6649toStringimpl(this.f99x)) + ", y=" + ((Object) Dp.m6649toStringimpl(this.f100y)) + ", rtlAware=" + this.rtlAware + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }
}
