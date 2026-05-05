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
/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0014\u007f\u0007tsAӄLe^.ZS@\u000fs{B$c$\bCCU \u0011*\t]Ȟo˧vJh\u0011K\u000f\f\u0018~jBկ\u0006~m\u0014\u001f2pom2\u000e<M?ftD\u000682P:\n\u000b\u0007\u001a8K(v)E[\u0012\u00180NtRR;O\u0015 \u0018\u0006L%\u0019\u001e\u000bi^:Vru:]*\u0013~PV?p@~]\rt^7\u000f\u0007aL6n@߱\u0019%Y\u000f\u07baV[M\u0010\bwK$\u0001'U+\u0010\b Gf ,\u0015YV=c\u0001Gt\u0007g_:Iqթc\u0014V\u001cK\u0010z*1\u0003\u0018V\u00145mF-Hq8\u0012A\u001b\u000bSnPHr\u000b\n\t\tN\u0017S\u000b[+g%-e2['SO{3\u000ftŇ\rϒ żۣ\r_ڠ\u001fb\u007fQ?cX?N\\\u0018h]o\n\u0001p\u0013z$>K\u0018/*\u0013\u0005ϖ1ܔZݽٳ jɘLRov\u0013r\u0001UoeVOBp\u001cK8\u001a\\zRl\u001d|`Vh,?W,V\u0017}6\u001eNeʟ@!+\u001cʽSnqҔe_\u0010:=|\bq|q&Wge\n̗]Ӓ\u0014mZΘ,ABy\u0013p\u0007DY%hvxB@I\u0003\u0010&}\u001b\u008f\u0018ȇ1ŭܝ\u001b3Ϝ5'd\u0015V\u00156DG\u0018\u0017nzj\u0016\u001bbDt#w'\r\t/R3ʠ{Иw̢ڌ{_Ę1OY5'8m$nQ\u000b2'\u0001y\u001eUxչGUt\u0019{ɿ\u0018N\u0015\"9WN˴\u00177"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6}\u001chi9\u0010r\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u0007\u001fga\u000f", "AsP?g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "Bn_", "3mS", "0ncAb4", "@s[\u000ej(KS", "", "7mb=X*M]&b\u0004_6", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uE5\u00139!%Y#\u000e\u0002b5F\u000e@mI)\fI~&\u001bQx\u001c\u0006W5>W\r$Ava\u00044IEz;\"\u001e2fJ\u000f-0W\u0006'TUJ3&1r>\u0010\"a\u001d,5\u0016\u0013hN4lSA,o(V\b;uVO\u0007", "5dc\u000fb;M]!FY2\f\u0002X0M", "u(5", "Adc\u000fb;M]!FE/~G\u000e)4", "uE\u0018#", "\u0014", "5dc\u0012a+\u00062l^\u007f.-d", "Adc\u0012a+\u0006\u001eiQEc&K", "5dc\u0016a:IS\u0017\u000e\u0005k\u0010\u0006\n9", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "5dc\u001fg3\u001ae\u0015\fz", "u(I", "Adc\u001fg3\u001ae\u0015\fz", "uY\u0018#", "5dc g(Kb`]N>1L\n\u0017", "Adc g(Kb`IK1v\u0002\u0003}", "5dc!b7\u00062l^\u007f.-d", "Adc!b7\u0006\u001eiQEc&K", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "", "CoS.g,", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class PaddingElement extends ModifierNodeElement<PaddingNode> {
    private float bottom;
    private float end;
    private final Function1<InspectorInfo, Unit> inspectorInfo;
    private boolean rtlAware;
    private float start;
    private float top;

    public /* synthetic */ PaddingElement(float f2, float f3, float f4, float f5, boolean z2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, z2, function1);
    }

    /* JADX INFO: renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m1005getStartD9Ej5fM() {
        return this.start;
    }

    /* JADX INFO: renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m1009setStart0680j_4(float f2) {
        this.start = f2;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m1006getTopD9Ej5fM() {
        return this.top;
    }

    /* JADX INFO: renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m1010setTop0680j_4(float f2) {
        this.top = f2;
    }

    /* JADX INFO: renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m1004getEndD9Ej5fM() {
        return this.end;
    }

    /* JADX INFO: renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m1008setEnd0680j_4(float f2) {
        this.end = f2;
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m1003getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m1007setBottom0680j_4(float f2) {
        this.bottom = f2;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    public final void setRtlAware(boolean z2) {
        this.rtlAware = z2;
    }

    public final Function1<InspectorInfo, Unit> getInspectorInfo() {
        return this.inspectorInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PaddingElement(float f2, float f3, float f4, float f5, boolean z2, Function1<? super InspectorInfo, Unit> function1) {
        this.start = f2;
        this.top = f3;
        this.end = f4;
        this.bottom = f5;
        this.rtlAware = z2;
        this.inspectorInfo = function1;
        if (f2 >= 0.0f || Dp.m6643equalsimpl0(f2, Dp.Companion.m6658getUnspecifiedD9Ej5fM())) {
            float f6 = this.top;
            if (f6 >= 0.0f || Dp.m6643equalsimpl0(f6, Dp.Companion.m6658getUnspecifiedD9Ej5fM())) {
                float f7 = this.end;
                if (f7 >= 0.0f || Dp.m6643equalsimpl0(f7, Dp.Companion.m6658getUnspecifiedD9Ej5fM())) {
                    float f8 = this.bottom;
                    if (f8 >= 0.0f || Dp.m6643equalsimpl0(f8, Dp.Companion.m6658getUnspecifiedD9Ej5fM())) {
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PaddingNode create() {
        return new PaddingNode(this.start, this.top, this.end, this.bottom, this.rtlAware, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PaddingNode paddingNode) {
        paddingNode.m1029setStart0680j_4(this.start);
        paddingNode.m1030setTop0680j_4(this.top);
        paddingNode.m1028setEnd0680j_4(this.end);
        paddingNode.m1027setBottom0680j_4(this.bottom);
        paddingNode.setRtlAware(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((Dp.m6644hashCodeimpl(this.start) * 31) + Dp.m6644hashCodeimpl(this.top)) * 31) + Dp.m6644hashCodeimpl(this.end)) * 31) + Dp.m6644hashCodeimpl(this.bottom)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && Dp.m6643equalsimpl0(this.start, paddingElement.start) && Dp.m6643equalsimpl0(this.top, paddingElement.top) && Dp.m6643equalsimpl0(this.end, paddingElement.end) && Dp.m6643equalsimpl0(this.bottom, paddingElement.bottom) && this.rtlAware == paddingElement.rtlAware;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public /* synthetic */ PaddingElement(float f2, float f3, float f4, float f5, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? Dp.m6638constructorimpl(0) : f2, (i2 & 2) != 0 ? Dp.m6638constructorimpl(0) : f3, (i2 + 4) - (i2 | 4) != 0 ? Dp.m6638constructorimpl(0) : f4, (i2 & 8) != 0 ? Dp.m6638constructorimpl(0) : f5, z2, function1, null);
    }
}
