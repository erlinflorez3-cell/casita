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
/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0014\u007f\u0007tsAӄLe^.ZS@\u000fs{B$c$\bCCU \u0001*\t]Ȟo˧vJh\u0011K\u000f\f\u0018~jBկ\u0006~m\u0014\u001f2pom2\u000e<M?ftD\u000682P:\n\u000b\u0007\u001a8K(v)E[\u0012\u00180NtRR;O\u0015 \u0018\u0006L%\u0019\u001e\u000bi^:Vru:]*\u0013~PV?p@~]\rt^7\u000f\u0007aL6n@߱\u0019%Y\u000f\u07baV[M\u0010\bwK\u0014\u0001'U+\u0010\b Gf\u0010,\u0015YV=c\u00017t\u0007g_:9qթc\u0014V\u001c;\u0010z*!\u0003\u0018V\u00145]F-Hq8\u0012A\u000b\u000bSnPHr\u000b\n\txN\u0017S\u000b[+g%-e2G'TO{3\u0014tŃ\u0003ͼ%[\\ו12)\\\u0010bASP=vX\u001a[Mm2{\u0011\u000bò\b0M\f\u0006Ɉ\u0013ѧ\u001b%?ك\n7/p\u001aHriMݖbŞR֟˦G?̱r\u0018?*\u0017\u001a+Xr\t\u0004P\u0003Z\u0003ҍOʵS͵ś\u0007\u0012ء`yD!3\u001e\u001fcvl\u0003M\f\f{ÇhǶXʤā\rVߍb5=Qq\u001e2f\u0005\u0015W<\u0011\u0007/٫DϦ\u000bȗۛ'!ĘLl\u0018w\nR\u008b\f\u001c:BwʫPZ0!\\\u001bgҺ\"Z"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00042bC\u001br4&\u0015qp\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00042bC$u3\u001ej", ";h]$\\+MV", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", ";h]\u0015X0@V(", ";`g$\\+MV", ";`g\u0015X0@V(", "3mU<e*>7\"|\u0005f0\u0006\u000b", "", "7mb=X*M]&b\u0004_6", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uE5\u00139!%Y#\u000e\u0002b5F\u000e@mI)\fI~&\u001bQx\u001c\u0006W5>W\r$Ava\u00044IEz;\"\u001e2fJ\u000f-0W\u0006'TUJ3&1r>\u0010\"a\u001d,5\u0016\u0013hN4lSA,o(V\b;uVO\u0007", "\u0014", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "", "CoS.g,", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class SizeElement extends ModifierNodeElement<SizeNode> {
    private final boolean enforceIncoming;
    private final Function1<InspectorInfo, Unit> inspectorInfo;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ SizeElement(float f2, float f3, float f4, float f5, boolean z2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, z2, function1);
    }

    public /* synthetic */ SizeElement(float f2, float f3, float f4, float f5, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? Dp.Companion.m6658getUnspecifiedD9Ej5fM() : f2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? Dp.Companion.m6658getUnspecifiedD9Ej5fM() : f3, (i2 & 4) != 0 ? Dp.Companion.m6658getUnspecifiedD9Ej5fM() : f4, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? Dp.Companion.m6658getUnspecifiedD9Ej5fM() : f5, z2, function1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SizeElement(float f2, float f3, float f4, float f5, boolean z2, Function1<? super InspectorInfo, Unit> function1) {
        this.minWidth = f2;
        this.minHeight = f3;
        this.maxWidth = f4;
        this.maxHeight = f5;
        this.enforceIncoming = z2;
        this.inspectorInfo = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SizeNode create() {
        return new SizeNode(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SizeNode sizeNode) {
        sizeNode.m1079setMinWidth0680j_4(this.minWidth);
        sizeNode.m1078setMinHeight0680j_4(this.minHeight);
        sizeNode.m1077setMaxWidth0680j_4(this.maxWidth);
        sizeNode.m1076setMaxHeight0680j_4(this.maxHeight);
        sizeNode.setEnforceIncoming(this.enforceIncoming);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return Dp.m6643equalsimpl0(this.minWidth, sizeElement.minWidth) && Dp.m6643equalsimpl0(this.minHeight, sizeElement.minHeight) && Dp.m6643equalsimpl0(this.maxWidth, sizeElement.maxWidth) && Dp.m6643equalsimpl0(this.maxHeight, sizeElement.maxHeight) && this.enforceIncoming == sizeElement.enforceIncoming;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((Dp.m6644hashCodeimpl(this.minWidth) * 31) + Dp.m6644hashCodeimpl(this.minHeight)) * 31) + Dp.m6644hashCodeimpl(this.maxWidth)) * 31) + Dp.m6644hashCodeimpl(this.maxHeight)) * 31) + Boolean.hashCode(this.enforceIncoming);
    }
}
