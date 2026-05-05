package androidx.compose.animation;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: RenderInTransitionOverlayNodeElement.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007njG9L͜P.`X2şs{J$c$\bCCU0}*\teNogt]b\u000bQƤ\u000eǝ\u0001j:O]ތe\u0012\u001d>JģG3[oE9ft>\u000562*\u0600\u007fڏ\u00070ݒx\u0016\u0007|SK:\u0012^?1wb\u0011[\u00062\u00124@0\u000b,_\u007fTFJ|]h4Q\u0007yF\\-w0+T\u001d^b/%\u000bq ;@e?%'c\u00035]kC\u0013A\b<3tU0ȅMseC!\u0007\"/CO;_9ͭ]M^n'?1_e[P<-&~Bɥ=L\u0015\u0014C`.[!-ۣ\u000f{\u0010\u0001pXd\u0012`R\u007f)kF\u00195\u007fa6I\u001fvSw:GZe\u0005Kۃ\u001fkJ|?sT<֫E!Zw_2i@kJ~\u0016_={\u0007\th\u0012,\u00140u\u0005]\u007fA4\u001d%EaQ#Or2bJg\u0005\rx|ckbHn,~\u0018G*7\u0017jHt\u0007\u0002O\u0003dZ\u001a\u0014ʃSO\u0004\u001628\\&<g9X_]\t\u0002j{b:+=\bO[\u0005j<y\u007fӫ3}Wq3yR%8\u0006P+\ff\fZS:\u0001#ͼ!zVx7\u0010{rv<\u0017@h\n\u001cb,w-%\u001fV-6Bo%1_\t\u0014V\u0013%V2\u000b\u00028\u0005\u000b\u0011P\u000bz\u007fi\tIZ\bp&=Cg4G2\u0004+מ8\u0003+Ȕ\u0017u\u0006Uu[\u0018jz\u0019\u000e[\f\"&\u001agV]AiÈ\u000bȞ6\u000e5զdtka[#G|\u0003\f\u001dN9Fu\t\u0003pZbA߁[ݚ\u001b.~ܥ\u000b%\u000ex\u000e\u000f\u0002H\u0001]qk[jLO\u000b\u0003\bCҡ<\u0003\rȔ6'\u0007\b0\u0016ޯ1o"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006c%>X}-\u001bv\u0005;ILIoC\"\u001fqKJ\u0007p3J\u000b\u0010QKN\fcRz=\u001d!0", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006c%>X}-\u001bv\u0005;ILIoC\"\u001fqKJ\u0007p3J\u000b\u0010QKN\u0002", "AgP?X+-`\u0015\b\tb;\u0001\u00138S}2\u0007@", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007G4Y}|", "@d]1X9\"\\\u0003\u0010zk3x\u001d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "HH]1X?\"\\\u0003\u0010zk3x\u001d", "", "1kX=<5(d\u0019\f\u0002Z@", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00138U\u000b 6\\#*VQ?z8(\u001eV_C\u0012c\u0010V\u0002.\u001d3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015`c\u0016QvLe\u0017K\u0003^zR12GihwVEOk8.lo&ZI>.\u001d>n^Y", "5dc\u0010_0I7\"h\f^9\u0004\u0005C", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "5dc\u001fX5=S&b\u0004H=|\u00166a\u0014", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Adc\u001fX5=S&b\u0004H=|\u00166a\u0014", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "5dc [(KS\u0018m\bZ5\u000b\r>i\n1i>\u000b\"\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7l\u0005;ILIoC\"\u001fqO7\u0011n,2~2N\"", "Adc [(KS\u0018m\bZ5\u000b\r>i\n1i>\u000b\"\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00138U\u000b 6\\#*VQ?z8(\u001eV_C\u0012c\u0010V\u0002.\u001d\u0010?", "5dc'<5=S,b\u0004H=|\u00166a\u0014", "u(5", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RenderInTransitionOverlayNodeElement extends ModifierNodeElement<RenderInTransitionOverlayNode> {
    public static final int $stable = 0;
    private final Function2<LayoutDirection, Density, Path> clipInOverlay;
    private Function0<Boolean> renderInOverlay;
    private SharedTransitionScopeImpl sharedTransitionScope;
    private final float zIndexInOverlay;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RenderInTransitionOverlayNodeElement copy$default(RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement, SharedTransitionScopeImpl sharedTransitionScopeImpl, Function0 function0, float f2, Function2 function2, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            sharedTransitionScopeImpl = renderInTransitionOverlayNodeElement.sharedTransitionScope;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function0 = renderInTransitionOverlayNodeElement.renderInOverlay;
        }
        if ((4 & i2) != 0) {
            f2 = renderInTransitionOverlayNodeElement.zIndexInOverlay;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            function2 = renderInTransitionOverlayNodeElement.clipInOverlay;
        }
        return renderInTransitionOverlayNodeElement.copy(sharedTransitionScopeImpl, function0, f2, function2);
    }

    public final SharedTransitionScopeImpl component1() {
        return this.sharedTransitionScope;
    }

    public final Function0<Boolean> component2() {
        return this.renderInOverlay;
    }

    public final float component3() {
        return this.zIndexInOverlay;
    }

    public final Function2<LayoutDirection, Density, Path> component4() {
        return this.clipInOverlay;
    }

    public final RenderInTransitionOverlayNodeElement copy(SharedTransitionScopeImpl sharedTransitionScopeImpl, Function0<Boolean> function0, float f2, Function2<? super LayoutDirection, ? super Density, ? extends Path> function2) {
        return new RenderInTransitionOverlayNodeElement(sharedTransitionScopeImpl, function0, f2, function2);
    }

    public String toString() {
        return "RenderInTransitionOverlayNodeElement(sharedTransitionScope=" + this.sharedTransitionScope + ", renderInOverlay=" + this.renderInOverlay + ", zIndexInOverlay=" + this.zIndexInOverlay + ", clipInOverlay=" + this.clipInOverlay + ')';
    }

    public final SharedTransitionScopeImpl getSharedTransitionScope() {
        return this.sharedTransitionScope;
    }

    public final void setSharedTransitionScope(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.sharedTransitionScope = sharedTransitionScopeImpl;
    }

    public final Function0<Boolean> getRenderInOverlay() {
        return this.renderInOverlay;
    }

    public final void setRenderInOverlay(Function0<Boolean> function0) {
        this.renderInOverlay = function0;
    }

    public final float getZIndexInOverlay() {
        return this.zIndexInOverlay;
    }

    public final Function2<LayoutDirection, Density, Path> getClipInOverlay() {
        return this.clipInOverlay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RenderInTransitionOverlayNodeElement(SharedTransitionScopeImpl sharedTransitionScopeImpl, Function0<Boolean> function0, float f2, Function2<? super LayoutDirection, ? super Density, ? extends Path> function2) {
        this.sharedTransitionScope = sharedTransitionScopeImpl;
        this.renderInOverlay = function0;
        this.zIndexInOverlay = f2;
        this.clipInOverlay = function2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public RenderInTransitionOverlayNode create() {
        return new RenderInTransitionOverlayNode(this.sharedTransitionScope, this.renderInOverlay, this.zIndexInOverlay, this.clipInOverlay);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(RenderInTransitionOverlayNode renderInTransitionOverlayNode) {
        renderInTransitionOverlayNode.setSharedScope(this.sharedTransitionScope);
        renderInTransitionOverlayNode.setRenderInOverlay(this.renderInOverlay);
        renderInTransitionOverlayNode.setZIndexInOverlay(this.zIndexInOverlay);
        renderInTransitionOverlayNode.setClipInOverlay(this.clipInOverlay);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((this.sharedTransitionScope.hashCode() * 31) + this.renderInOverlay.hashCode()) * 31) + Float.hashCode(this.zIndexInOverlay)) * 31) + this.clipInOverlay.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!(obj instanceof RenderInTransitionOverlayNodeElement)) {
            return false;
        }
        RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement = (RenderInTransitionOverlayNodeElement) obj;
        return Intrinsics.areEqual(this.sharedTransitionScope, renderInTransitionOverlayNodeElement.sharedTransitionScope) && this.renderInOverlay == renderInTransitionOverlayNodeElement.renderInOverlay && this.zIndexInOverlay == renderInTransitionOverlayNodeElement.zIndexInOverlay && this.clipInOverlay == renderInTransitionOverlayNodeElement.clipInOverlay;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("renderInSharedTransitionOverlay");
        inspectorInfo.getProperties().set("sharedTransitionScope", this.sharedTransitionScope);
        inspectorInfo.getProperties().set("renderInOverlay", this.renderInOverlay);
        inspectorInfo.getProperties().set("zIndexInOverlay", Float.valueOf(this.zIndexInOverlay));
        inspectorInfo.getProperties().set("clipInOverlayDuringTransition", this.clipInOverlay);
    }
}
