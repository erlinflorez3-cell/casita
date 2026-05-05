package androidx.compose.material3.pulltorefresh;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import io.sentry.protocol.SentryThread;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: PullToRefresh.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<K\u0007Ӭ4\u0012\u000e\u0007njG0LeN.ZS@\u000fsڔ<$q$yCAi\"}0ޛWȞog|PbŏK\u000f\u0014\"\u0001j2J]xs\u0012\u0017˰HĤEIݹ CIb\u000563 `!x+\u0015\u0005(+`\u0010%|SU\u001a\u0015HF\u0001<b\r{\nH\u0016\u0016B.\u00076\\\u0016PFLzdR/Q\u000byF\\0w0+WϘJT5\u0018?h,@X7c\u0017kڌ\u0004O_iU\u001bE\u0002?\u0015hU,YM:ʕ7!\u0007\",CO;_9ͭ]MXn$?+}k\u0012\u05fb\u000fp\f\t\u0015%<2\u0018LϰIό,\u0019Ɋ\u0007Ԅ\u07baxtYZ^\u0015'\f\u000e\u0016y6Eӛ0919)giai\u001b~C\u0002\u0005\u001b!;\u0007~#kT<eC\u001f\u0005}W1_FUH|\f\nCs\u0004~i\u001a*28w\u00065{\u001f7/%ee\u007fف ɶ\u0001҆זkx\u000b|vp2XV^:nD7p\u001dTkR\u0004\u001dk~V\t2\u001fm4V\u001d|64fЖx\u0005(32fO\u0017\r1ݫ\\R,=\u000bOY\u001d\u0011Tĺ8'ACw{\u0010\u0010W'\u0018Mcz\u0005\u0007f\tgTdjP:2vo8w*m\u0015 cAMw44Z3Ǭ`\u001bPґ6DG\t\u0017l+w\u001e\u007fl3R\u0005Ȑ(z\u0011ɖh^vpu\u0006\u001aA\u000bc:3QSE\u0019TZPlط\u0001)\u000fѨ\f\u0002MuZV\u001d{$|m{N\u001e׀=W7ˋ+\u0011\u00059@\u0013}\\Z{}Q{\u001cٶy۠ʣ\u000e:ÿ2o\u0010j~@xlPab*Ǵvgz&\u000e\u070f\u001c(`NzM\u0003ӣ\u000f\u0006"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u00025<`\r*Dm\u0017;MQ>5\u001f.\u001coPCsc-[v5J,U,dR{Li", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u00025<`\r*Dm\u0017;MQ>5\u001f.\u001coPCsc-[v5J4X+`Sv=!zd\rN\u0001", "7rA2Y9>a\u001c\u0003\u0004`", "", "=mA2Y9>a\u001c", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "3mP/_,=", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u00025<`\r*Dm\u0017;MQ>5\u001f.\u001coPCsc-[v5J:](kRH", "Bga2f/HZ\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu,T\u00127LPEo31^fkA\u0012m:N@/C[N9`Ny\u000b]\u001dj\u0015U:\u0017\u0012YB1nR:hr<P\t*rm\f\u0017\u001b5xs0e\fVyjV(/rU`c\u0003\u0011FVjsh\u0015n\u001diC6+]P\u0019\u001cd`5\u0019Y]\u001a\u0001a\u0007weV#\b  Ks[S\u001b3F", "5dc\u0012a(;Z\u0019}", "u(I", "5dc\u001ca\u0019>T&~\ta", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "5dc g(MS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn@i\u0005'Fw#.NP;y7g\u007fxh@um\u0019Nw4GZQ\u001akN\u0002=i", "5dc![9>a\u001c\t\u0002]s[\\\u000fjO)c", "u(5", "\u0014", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(NB=\u007f\\\u000e~fg", "1n_F", "1n_F \u0014\u000bDumjJ", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu,T\u00127LPEo31^fkA\u0012m:N@/C[N9`Ny\u000b]\u001dj\u0015U:\u0017\u0012YB1nR:hr<P\t*rm\f\u0017\u001b5xs0e\fVyjV\u0005\u0010dOXl\u0004K@X,(n\u0014j'j:\u0004,\u0010\u0001\u0019(lL5WE^!yY\tqtG\u001a\b82A7FVLvDFa' X{\u0006\u0015\u0012_t3t6\u0013\n", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PullToRefreshElement extends ModifierNodeElement<PullToRefreshModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final boolean isRefreshing;
    private final Function0<Unit> onRefresh;
    private final PullToRefreshState state;
    private final float threshold;

    public /* synthetic */ PullToRefreshElement(boolean z2, Function0 function0, boolean z3, PullToRefreshState pullToRefreshState, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, function0, z3, pullToRefreshState, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-M2VBTUQ$default, reason: not valid java name */
    public static /* synthetic */ PullToRefreshElement m3005copyM2VBTUQ$default(PullToRefreshElement pullToRefreshElement, boolean z2, Function0 function0, boolean z3, PullToRefreshState pullToRefreshState, float f2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = pullToRefreshElement.isRefreshing;
        }
        if ((2 & i2) != 0) {
            function0 = pullToRefreshElement.onRefresh;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            z3 = pullToRefreshElement.enabled;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            pullToRefreshState = pullToRefreshElement.state;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            f2 = pullToRefreshElement.threshold;
        }
        return pullToRefreshElement.m3007copyM2VBTUQ(z2, function0, z3, pullToRefreshState, f2);
    }

    public final boolean component1() {
        return this.isRefreshing;
    }

    public final Function0<Unit> component2() {
        return this.onRefresh;
    }

    public final boolean component3() {
        return this.enabled;
    }

    public final PullToRefreshState component4() {
        return this.state;
    }

    /* JADX INFO: renamed from: component5-D9Ej5fM, reason: not valid java name */
    public final float m3006component5D9Ej5fM() {
        return this.threshold;
    }

    /* JADX INFO: renamed from: copy-M2VBTUQ, reason: not valid java name */
    public final PullToRefreshElement m3007copyM2VBTUQ(boolean z2, Function0<Unit> function0, boolean z3, PullToRefreshState pullToRefreshState, float f2) {
        return new PullToRefreshElement(z2, function0, z3, pullToRefreshState, f2, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullToRefreshElement)) {
            return false;
        }
        PullToRefreshElement pullToRefreshElement = (PullToRefreshElement) obj;
        return this.isRefreshing == pullToRefreshElement.isRefreshing && Intrinsics.areEqual(this.onRefresh, pullToRefreshElement.onRefresh) && this.enabled == pullToRefreshElement.enabled && Intrinsics.areEqual(this.state, pullToRefreshElement.state) && Dp.m6643equalsimpl0(this.threshold, pullToRefreshElement.threshold);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((Boolean.hashCode(this.isRefreshing) * 31) + this.onRefresh.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.state.hashCode()) * 31) + Dp.m6644hashCodeimpl(this.threshold);
    }

    public String toString() {
        return "PullToRefreshElement(isRefreshing=" + this.isRefreshing + ", onRefresh=" + this.onRefresh + ", enabled=" + this.enabled + ", state=" + this.state + ", threshold=" + ((Object) Dp.m6649toStringimpl(this.threshold)) + ')';
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    public final Function0<Unit> getOnRefresh() {
        return this.onRefresh;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final PullToRefreshState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: getThreshold-D9Ej5fM, reason: not valid java name */
    public final float m3008getThresholdD9Ej5fM() {
        return this.threshold;
    }

    private PullToRefreshElement(boolean z2, Function0<Unit> function0, boolean z3, PullToRefreshState pullToRefreshState, float f2) {
        this.isRefreshing = z2;
        this.onRefresh = function0;
        this.enabled = z3;
        this.state = pullToRefreshState;
        this.threshold = f2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PullToRefreshModifierNode create() {
        return new PullToRefreshModifierNode(this.isRefreshing, this.onRefresh, this.enabled, this.state, this.threshold, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PullToRefreshModifierNode pullToRefreshModifierNode) {
        pullToRefreshModifierNode.setOnRefresh(this.onRefresh);
        pullToRefreshModifierNode.setEnabled(this.enabled);
        pullToRefreshModifierNode.setState(this.state);
        pullToRefreshModifierNode.m3021setThreshold0680j_4(this.threshold);
        boolean zIsRefreshing = pullToRefreshModifierNode.isRefreshing();
        boolean z2 = this.isRefreshing;
        if (zIsRefreshing != z2) {
            pullToRefreshModifierNode.setRefreshing(z2);
            pullToRefreshModifierNode.update();
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("PullToRefreshModifierNode");
        inspectorInfo.getProperties().set("isRefreshing", Boolean.valueOf(this.isRefreshing));
        inspectorInfo.getProperties().set("onRefresh", this.onRefresh);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set(SentryThread.JsonKeys.STATE, this.state);
        inspectorInfo.getProperties().set("threshold", Dp.m6636boximpl(this.threshold));
    }
}
