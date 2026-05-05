package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: Magnifier.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"B\u0012\u007f\u0007|jA0ZeP.XS2\u000f\u0002{<$i$yّCU(\u0003*ޛWNupvJ`\u000bK\u000f\u001c\u0016\u0001j2J]xs\u0012\u00172HsG3[ڎEʠhtD\u000b(2(9\u0002\u0005\u0017\u001a2Ϻ\u0016͌\u0011ŏ{\u0012\"2PphR;LEܝ\u0011\u0016S.\u00026mwPFH\u001b`J13\u0003\u0018F|)ۢ4|S\u0012Vm-\r\u0005g6>P9E\u0015SV\u0013\tb[m\u0007Upk\u0007ص+'1N\u0004k<X\u000e\u001b-9_\u000fmrTd\u0015Sp\fU4ebyR\u001e.}z\n\u0017T\u0004<\u00117N4-(r \u000ea\u0002\u0003YFP\u0010lZ\u007f)iF\u001d+\u007fA:Q\u001b\u0015aqA\u001fNE\r\u001d\rL3\u0011t'[b x\u0015Ia\bU?dX=vb̆]={\u00199h\u0010B\u001c0u\u007fu\u0010Y?%>O[g0Qq\u0010b\\i\r\u0004\u000f\u0004\u001aֶR\u0011F0\u000b.7X&Rn\rr\u0013\nhT\u00075AQ*s\u001f}6\u0013fp@F/E(N}q\u0012j{~P9\u007frEk\u0007k<d\u0010ӗ5̳Uc\u0018Р#\u000b\"NTb3h=̾U݇Y٢Ξ!1ʮn\u0012\u007f{Rd\\'@P\n\u001cb<\bǌ^ŢGґەA@Ҵ\rabh\u001e\u0015%R2\t\u00027\u0005\u000b\u0011P\u000bs\u007fi\tIZ\u0001v![Cپ9\u0019,Zx־6č'\u0007\u0007͞PauS_Z|\u0018\u0006U*(&\u001cIQ]F)\u000e-+\tċ/։Prmʸ\u001e\u001e5\u000e\u0015y=O?֮iŰnp4ߌ;^]b/\"%fIֿ\nݦ~טՌEyĕgV\u0013[L`C g=fI\r\u0007/\u001eS\u0004\u007f$\r5[GU\u001fə{\u00145\u001a8ӣkܓ2yjχv\u0001s\u0010DcD|9Ж_щ?8QʲOJ0.\u0005\u0003pSA̮\nɚ\r4\u0015ΉǨAmxY>ԩ']|n\u00072,\u0086Z}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\r1[\u0007$8q\u0016;-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\r1[\u0007$8q\u0016;6M:k\n", "And?V,\u001cS\"\u000ezk", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ";`V;\\-BS&\\zg;|\u0016", "=mB6m,\u001cV\u0015\b|^+", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "", "Hn^:", "", "CrT!X?M2\u0019\u007fvn3\f", "", "Ahi2", "1na;X9+O\u0018\u0003\u000bl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "3kTCT;B]\"", "1kX=c0GUx\bv[3|\b", ">kPAY6K[\u0001z|g0}\r/r`$yO\u000b$+", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0010<U\r!Az\u001e\u0016IEDo5\"\u0015uB5\u0005r6[\u000b|", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d]0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003`K\"\u001eM':T`CJDo4h\u000brfZDB/\u001e\u007f\u0019diZ>\u0013zO v\\\u00031RN\u0015\n9.KuCBGxY=x',,wu!<e\t\u0001[3\u000eC1:mNPx \bb\u0002$,iJ#-\u007f\u001b\u0013@Gs|{\u001c\u0018q-p\u0015\u001e`D;&MapN\u000f\u00143ZL", "\u0014", "\u0018", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "", "CoS.g,", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MagnifierElement extends ModifierNodeElement<MagnifierNode> {
    public static final int $stable = 0;
    private final boolean clippingEnabled;
    private final float cornerRadius;
    private final float elevation;
    private final Function1<Density, Offset> magnifierCenter;
    private final Function1<DpSize, Unit> onSizeChanged;
    private final PlatformMagnifierFactory platformMagnifierFactory;
    private final long size;
    private final Function1<Density, Offset> sourceCenter;
    private final boolean useTextDefault;
    private final float zoom;

    public /* synthetic */ MagnifierElement(Function1 function1, Function1 function12, Function1 function13, float f2, boolean z2, long j2, float f3, float f4, boolean z3, PlatformMagnifierFactory platformMagnifierFactory, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function12, function13, f2, z2, j2, f3, f4, z3, platformMagnifierFactory);
    }

    public /* synthetic */ MagnifierElement(Function1 function1, Function1 function12, Function1 function13, float f2, boolean z2, long j2, float f3, float f4, boolean z3, PlatformMagnifierFactory platformMagnifierFactory, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : function12, (i2 + 4) - (i2 | 4) == 0 ? function13 : null, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? Float.NaN : f2, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? DpSize.Companion.m6745getUnspecifiedMYxV2XQ() : j2, (i2 + 64) - (i2 | 64) != 0 ? Dp.Companion.m6658getUnspecifiedD9Ej5fM() : f3, (i2 & 128) != 0 ? Dp.Companion.m6658getUnspecifiedD9Ej5fM() : f4, (-1) - (((-1) - i2) | ((-1) - 256)) != 0 ? true : z3, platformMagnifierFactory, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MagnifierElement(Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, Function1<? super DpSize, Unit> function13, float f2, boolean z2, long j2, float f3, float f4, boolean z3, PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = function1;
        this.magnifierCenter = function12;
        this.onSizeChanged = function13;
        this.zoom = f2;
        this.useTextDefault = z2;
        this.size = j2;
        this.cornerRadius = f3;
        this.elevation = f4;
        this.clippingEnabled = z3;
        this.platformMagnifierFactory = platformMagnifierFactory;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public MagnifierNode create() {
        return new MagnifierNode(this.sourceCenter, this.magnifierCenter, this.onSizeChanged, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.platformMagnifierFactory, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(MagnifierNode magnifierNode) {
        magnifierNode.m637update5F03MCQ(this.sourceCenter, this.magnifierCenter, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.onSizeChanged, this.platformMagnifierFactory);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return this.sourceCenter == magnifierElement.sourceCenter && this.magnifierCenter == magnifierElement.magnifierCenter && this.zoom == magnifierElement.zoom && this.useTextDefault == magnifierElement.useTextDefault && DpSize.m6733equalsimpl0(this.size, magnifierElement.size) && Dp.m6643equalsimpl0(this.cornerRadius, magnifierElement.cornerRadius) && Dp.m6643equalsimpl0(this.elevation, magnifierElement.elevation) && this.clippingEnabled == magnifierElement.clippingEnabled && this.onSizeChanged == magnifierElement.onSizeChanged && Intrinsics.areEqual(this.platformMagnifierFactory, magnifierElement.platformMagnifierFactory);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = this.sourceCenter.hashCode() * 31;
        Function1<Density, Offset> function1 = this.magnifierCenter;
        int iHashCode2 = (((((((((((((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + Float.hashCode(this.zoom)) * 31) + Boolean.hashCode(this.useTextDefault)) * 31) + DpSize.m6738hashCodeimpl(this.size)) * 31) + Dp.m6644hashCodeimpl(this.cornerRadius)) * 31) + Dp.m6644hashCodeimpl(this.elevation)) * 31) + Boolean.hashCode(this.clippingEnabled)) * 31;
        Function1<DpSize, Unit> function12 = this.onSizeChanged;
        return ((iHashCode2 + (function12 != null ? function12.hashCode() : 0)) * 31) + this.platformMagnifierFactory.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("magnifier");
        inspectorInfo.getProperties().set("sourceCenter", this.sourceCenter);
        inspectorInfo.getProperties().set("magnifierCenter", this.magnifierCenter);
        inspectorInfo.getProperties().set("zoom", Float.valueOf(this.zoom));
        inspectorInfo.getProperties().set(RRWebVideoEvent.JsonKeys.SIZE, DpSize.m6724boximpl(this.size));
        inspectorInfo.getProperties().set("cornerRadius", Dp.m6636boximpl(this.cornerRadius));
        inspectorInfo.getProperties().set("elevation", Dp.m6636boximpl(this.elevation));
        inspectorInfo.getProperties().set("clippingEnabled", Boolean.valueOf(this.clippingEnabled));
    }
}
