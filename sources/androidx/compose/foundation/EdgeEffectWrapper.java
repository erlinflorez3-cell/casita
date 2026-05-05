package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: AndroidOverscroll.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\u0007njO0LeN2ZS@\u000fs{:&c$\u007fLCU \u007f*\t]No˧vJp\u000bK\u000f\f,~jBկ\u0006x\f\u0011OGRsM3eok:pz<\u0004.4:8(\bв\u001e*V\u0014?\u0001Q`$\u0012^F7:\u001b([\u001b2\u00124UP\u0011,t\u007fZFJ|]h53\u0005yB|>\u000eICո\u0013\u000fX5'\u000faL1\t;C0=S1\r\u001b_M\u001fWqk\u000b1+5Has\u0006<!\u0004\"3CO;c;*j$i`:-sSqkh\u000eV}C\u007f\u001b]\u001c\u000e4-\u00112;<~\b<E=vach\u0002\rTH~oZ/%.Es=)\fiai+\u0017;\n+%\u001eQ\u00137%i{&`C-\u001d{_Yi@kZ\u0017\u000egf\u0006\u0004\u001ftJ.\u0012Z_\u007f]\u000eY2%PO[g5io\u0010t\\g%\u0017)la\u0017jHn47,EX!\f\t[\u0015\ty\\lXZ\u001eݬ\u001b\u0381Θ\u0002\n\u0019Oj(\r/3\u0015fQ~h\u0019S4܆1çj7aʤ<\u001ce@v5KP\u0012\u00168ׯ\u0003݀C<jڳ)rPS$Z\u000b)xøJн\u0014w\u0004ͩ\u001f\u0018!4WqJ7\u0003վ\u001bÅ\u0019H\u000bٜ\u0013O\u000b\u0011w\\~\u000f-Z\nɷ\u000fȐ(t\u0011ɖ!j~x\u007fz_++fx\u038dMپ9\u0019.ŞrvB\u0007;\t\u0015r.M>չSƥp\u0016}ɝL.$%QSE<A\u0015UǾ>ī1ETǩ6e[\u001e?z+\u0007e\u0093tؤfōзo+߯nLWT%0Gl\u00012 f\u0016x\u0010LQõoӝ\u000f[FδC\u0011gLf:\u0013\u0004M${˝{ݕ\u000155ξw5$\t,/Cs\u0006k\u0006-(hEfKЄ\u0006Нg\u001a\bdWn@N\tag\u0013V\"R~+D^i&\u000exI\u000bق5ȈEh\tX>a\u0019B̑f\u00104\u0010vÅwh\u0012w}:Mʧ.%"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00054[}\u007f8n\u0016,\\5Hg?)\u0015u7", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5k^D66E]&", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEq\u007fg", "0ncAb4\u001eT\u001a~xm", "\u001a`]1e6BRb\u0011~].|\u0018xE~*{ \u0002\u0018\u0017E~c", "0ncAb4\u001eT\u001a~xm\u0015|\u000b+t\u00042\u0005", ":dUA8-?S\u0017\u000e", ":dUA8-?S\u0017\u000ec^.x\u00183o\t", "@hV5g\f?T\u0019|\n", "@hV5g\f?T\u0019|\nG,~\u0005>i\n1", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\u0018", "Bn_\u0012Y->Q(", "Bn_\u0012Y->Q(gz`(\f\r9n", "7r0;\\4:b\u001d\b|", "", "uKP;W9HW\u0018H\rb+~\t>/_'}@`\u0018\u0018Gm\u001d\u0012:\u001a", "7rBAe,MQ\u001c~y", "1qT.g,\u001eR\u001b~Z_-|\u0007>", "4na\u0012T*A3\u001a\u007fz\\;", "", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "5dc\u001ce\nKS\u0015\u000ez;6\f\u00189m_)|@~&", "5dc\u001ce\nKS\u0015\u000ez;6\f\u00189m_)|@~&\u007fGq\nKz/>", "5dc\u001ce\nKS\u0015\u000ezE,}\u0018\u000ff\u0001(yO", "5dc\u001ce\nKS\u0015\u000ezE,}\u0018\u000ff\u0001(yOi\u0017\u0019C~\u0012F\u007f", "5dc\u001ce\nKS\u0015\u000ezK0~\f>E\u0001){>\u0010", "5dc\u001ce\nKS\u0015\u000ezK0~\f>E\u0001){>\u0010\u007f\u0017Ik\u001d@\u0001.", "5dc\u001ce\nKS\u0015\u000ezM6\bh0f\u007f&\u000b", "5dc\u001ce\nKS\u0015\u000ezM6\bh0f\u007f&\u000b)\u0001\u0019\u0013Vs\u0018E", "7r1<g;H[t\b~f(\f\r8g", "7r1<g;H[\u0002~|Z;\u0001\u00138S\u000f5{O~\u001a\u0017F", "7r1<g;H[\u0007\u000e\b^;z\f/d", "7r;2Y;\u001a\\\u001d\u0007vm0\u0006\u000b", "7r;2Y;'S\u001bz\nb6\u0006v>r\u007f7yC\u0001\u0016", "7r;2Y;,b&~\n\\/|\b", "7rA6Z/M/\"\u0003\u0003Z;\u0001\u00121", "7rA6Z/M<\u0019\u0001vm0\u0007\u0012\u001dt\r(\u000b>\u0004\u0017\u0016", "7rA6Z/MA(\fzm*\u007f\t.", "7rC<c\bGW!z\nb5~", "7rC<c\u0015>U\u0015\u000e~h5j\u0018<e\u000f&~@\u007f", "7rC<c\u001aM`\u0019\u000exa,{", "Adc \\A>", "Adc \\A>\u001b#\u0014\u0003s!gl", "uI\u0018#", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class EdgeEffectWrapper {
    private EdgeEffect bottomEffect;
    private EdgeEffect bottomEffectNegation;
    private final Context context;
    private final int glowColor;
    private EdgeEffect leftEffect;
    private EdgeEffect leftEffectNegation;
    private EdgeEffect rightEffect;
    private EdgeEffect rightEffectNegation;
    private long size = IntSize.Companion.m6813getZeroYbymL2g();
    private EdgeEffect topEffect;
    private EdgeEffect topEffectNegation;

    public EdgeEffectWrapper(Context context, int i2) {
        this.context = context;
        this.glowColor = i2;
    }

    public final void forEachEffect(Function1<? super EdgeEffect, Unit> function1) {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            function1.invoke(edgeEffect);
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            function1.invoke(edgeEffect2);
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            function1.invoke(edgeEffect3);
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            function1.invoke(edgeEffect4);
        }
    }

    public final boolean isTopStretched() {
        return isStretched(this.topEffect);
    }

    public final boolean isBottomStretched() {
        return isStretched(this.bottomEffect);
    }

    public final boolean isLeftStretched() {
        return isStretched(this.leftEffect);
    }

    public final boolean isRightStretched() {
        return isStretched(this.rightEffect);
    }

    public final boolean isTopNegationStretched() {
        return isStretched(this.topEffectNegation);
    }

    public final boolean isBottomNegationStretched() {
        return isStretched(this.bottomEffectNegation);
    }

    public final boolean isLeftNegationStretched() {
        return isStretched(this.leftEffectNegation);
    }

    public final boolean isRightNegationStretched() {
        return isStretched(this.rightEffectNegation);
    }

    private final boolean isStretched(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect) == 0.0f);
    }

    public final boolean isTopAnimating() {
        return isAnimating(this.topEffect);
    }

    public final boolean isBottomAnimating() {
        return isAnimating(this.bottomEffect);
    }

    public final boolean isLeftAnimating() {
        return isAnimating(this.leftEffect);
    }

    public final boolean isRightAnimating() {
        return isAnimating(this.rightEffect);
    }

    private final boolean isAnimating(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public final EdgeEffect getOrCreateTopEffect() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect();
        this.topEffect = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    public final EdgeEffect getOrCreateBottomEffect() {
        EdgeEffect edgeEffect = this.bottomEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect();
        this.bottomEffect = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    public final EdgeEffect getOrCreateLeftEffect() {
        EdgeEffect edgeEffect = this.leftEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect();
        this.leftEffect = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    public final EdgeEffect getOrCreateRightEffect() {
        EdgeEffect edgeEffect = this.rightEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect();
        this.rightEffect = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    public final EdgeEffect getOrCreateTopEffectNegation() {
        EdgeEffect edgeEffect = this.topEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect();
        this.topEffectNegation = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    public final EdgeEffect getOrCreateBottomEffectNegation() {
        EdgeEffect edgeEffect = this.bottomEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect();
        this.bottomEffectNegation = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    public final EdgeEffect getOrCreateLeftEffectNegation() {
        EdgeEffect edgeEffect = this.leftEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect();
        this.leftEffectNegation = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    public final EdgeEffect getOrCreateRightEffectNegation() {
        EdgeEffect edgeEffect = this.rightEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect();
        this.rightEffectNegation = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    private final EdgeEffect createEdgeEffect() {
        EdgeEffect edgeEffectCreate = EdgeEffectCompat.INSTANCE.create(this.context);
        edgeEffectCreate.setColor(this.glowColor);
        if (!IntSize.m6806equalsimpl0(this.size, IntSize.Companion.m6813getZeroYbymL2g())) {
            edgeEffectCreate.setSize(IntSize.m6808getWidthimpl(this.size), IntSize.m6807getHeightimpl(this.size));
        }
        return edgeEffectCreate;
    }

    /* JADX INFO: renamed from: setSize-ozmzZPI, reason: not valid java name */
    public final void m628setSizeozmzZPI(long j2) {
        this.size = j2;
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            edgeEffect.setSize(IntSize.m6808getWidthimpl(j2), IntSize.m6807getHeightimpl(j2));
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize(IntSize.m6808getWidthimpl(j2), IntSize.m6807getHeightimpl(j2));
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize(IntSize.m6807getHeightimpl(j2), IntSize.m6808getWidthimpl(j2));
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize(IntSize.m6807getHeightimpl(j2), IntSize.m6808getWidthimpl(j2));
        }
        EdgeEffect edgeEffect5 = this.topEffectNegation;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize(IntSize.m6808getWidthimpl(j2), IntSize.m6807getHeightimpl(j2));
        }
        EdgeEffect edgeEffect6 = this.bottomEffectNegation;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize(IntSize.m6808getWidthimpl(j2), IntSize.m6807getHeightimpl(j2));
        }
        EdgeEffect edgeEffect7 = this.leftEffectNegation;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize(IntSize.m6807getHeightimpl(j2), IntSize.m6808getWidthimpl(j2));
        }
        EdgeEffect edgeEffect8 = this.rightEffectNegation;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize(IntSize.m6807getHeightimpl(j2), IntSize.m6808getWidthimpl(j2));
        }
    }
}
