package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: BasicMarquee.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<H\u0007Ӭ4\u0012\u000e\u0007nj?1Le^.Zݷ2\u000f\u0002{<$a4yCI^\"Ԃ*\t]ȞogtJb\u000bQ\u001b\u000eǝ\u0001j:I]xc\u0012\u00172XoG\u074cSڑCOś%<\u0015\"B\"fy3\u007fZ]X\u0014\u0005{[K:\u0014@D~=j\r{\t*\u0016\u0014C8\u0001L^wRDN\u0005]h13\u0007wIf'\u000e8\rQ\u001bOl';\u0001Ґ\"+NB}\u001c3a\u001b\u0007\u0001]\u0006Ƥ@:Q\u0013w?'YM:ʑ7ߒ~\u0013Ǽ*˽ոat,l\u0013b)\u00135=gcyRT\u008cxC\u0003\u001bO\u001c\u000e4)\u000fΖ.bm\u0016\"Kt![\u0007ѓ\u0003'V\u000e\u0010y6E/FŔ,߆\u001aeј`ݢϭR9\u0002\u001b\u001b5kN|9sT<֫E!Zw_2i@kJ~\u0010_={\u0007\tb0.46M\u007f=\u0001).E'ga?#/q\u001aHri'\u000bfhapjHn*\u001f\u001c=*\u0017\u0015rD\u0013\u000f2óS҉+Ҋܖ V\r\u0017\u0016-hb\u0006W9%>N\u0016|2{[y\"%]\u0004g_|\n&YO]aT\u0018Ԇ\u0011*Y\u00054W<\u0011\u0007\u001fڿA\u001c\u0013h}@\"`j1ޯvDR\\/+2m\u0016L8:V1\\CHI2\u000bK\u000b/wZ\u00174'TaKI}t\t\u0017\u0004h\\\u001fs>ձKڌ{ʠŮ,@پ9\u001b.U0t\u0005\t1\f\u0017s.I>չIƥp\u0016}ɝL,$ QQ]?iÄ\u0001Ȟ6\u00025զ\u001d~sRe\u0012U|Sȭ\u0011³l.oō;|:g\u0003J}\\mǴx݈v#\u0010ۭP\u000eoO\u0013G\u0012^aϸ@ЭqÅ̔;M̞\u0001\u0007'\u001e3\u000eǾ\"\u0006=0Iۑ9Dv\u001c/\u001b\u0001ԉm\u0018"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\r1f\n07m}8LG<o4+toaA\u0007l;$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\r1f\n07m}8LG<o4+}r`9\\", "7sT?T;B]\"\r", "", "/mX:T;B]\"f\u0005],", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\r1f\n07mq7QK7z8(\u001ePk8\u00079", "2d[.l\u0014BZ \u0003\t", "7mXA\\(E2\u0019\u0006vr\u0014\u0001\u00106i\u000e", "AoP0\\5@", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\r1f\n07m\u00049IA?t6s", "Dd[<V0Mg", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "uH8\u0016<\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`\u0018Q\u007f\u0017;r49c\u0007i\u001fi#:]C;Y?\u001a\u0013lj;\\D\u0013T\u00016NPWuacz\u0007\u0018\u001bi\u000e[4\t\f# $o@G&\u0017\nS\u000bIw\u000e\u001c\u0014\u001d?wX>c\u0016G\u0007j92", "\u0017", "\u0014", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(KBS)\\r8fk", "u(8", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(OB=\u007f\\\u000e~fg", "u(5", "1n_F", "1n_F 30T\u0002\u0011{-", "uH8\u0016<\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`\u0018Q\u007f\u0017;r49c\u0007i\u001fi#:]C;Y?\u001a\u0013lj;\\Do5r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0006cQ-m@F#\u00125\u0013i7u\r\u001c\u0016\u000e\u001dtoFW\u0014G\u0007t|A1hOh5", "1qT.g,", "3pd._:", "", "=sW2e", "", "6`b566=S", "BnBAe0GU", "", "CoS.g,", "", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class MarqueeModifierElement extends ModifierNodeElement<MarqueeModifierNode> {
    private final int animationMode;
    private final int delayMillis;
    private final int initialDelayMillis;
    private final int iterations;
    private final MarqueeSpacing spacing;
    private final float velocity;

    public /* synthetic */ MarqueeModifierElement(int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4, i5, marqueeSpacing, f2);
    }

    private final int component1() {
        return this.iterations;
    }

    /* JADX INFO: renamed from: component2-ZbEOnfQ, reason: not valid java name */
    private final int m654component2ZbEOnfQ() {
        return this.animationMode;
    }

    private final int component3() {
        return this.delayMillis;
    }

    private final int component4() {
        return this.initialDelayMillis;
    }

    private final MarqueeSpacing component5() {
        return this.spacing;
    }

    /* JADX INFO: renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m655component6D9Ej5fM() {
        return this.velocity;
    }

    /* JADX INFO: renamed from: copy-lWfNwf4$default, reason: not valid java name */
    public static /* synthetic */ MarqueeModifierElement m656copylWfNwf4$default(MarqueeModifierElement marqueeModifierElement, int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2, int i6, Object obj) {
        if ((-1) - (((-1) - i6) | ((-1) - 1)) != 0) {
            i2 = marqueeModifierElement.iterations;
        }
        if ((i6 + 2) - (2 | i6) != 0) {
            i3 = marqueeModifierElement.animationMode;
        }
        if ((i6 + 4) - (4 | i6) != 0) {
            i4 = marqueeModifierElement.delayMillis;
        }
        if ((8 & i6) != 0) {
            i5 = marqueeModifierElement.initialDelayMillis;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 16)) != 0) {
            marqueeSpacing = marqueeModifierElement.spacing;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 32)) != 0) {
            f2 = marqueeModifierElement.velocity;
        }
        return marqueeModifierElement.m657copylWfNwf4(i2, i3, i4, i5, marqueeSpacing, f2);
    }

    /* JADX INFO: renamed from: copy-lWfNwf4, reason: not valid java name */
    public final MarqueeModifierElement m657copylWfNwf4(int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2) {
        return new MarqueeModifierElement(i2, i3, i4, i5, marqueeSpacing, f2, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
        return this.iterations == marqueeModifierElement.iterations && MarqueeAnimationMode.m647equalsimpl0(this.animationMode, marqueeModifierElement.animationMode) && this.delayMillis == marqueeModifierElement.delayMillis && this.initialDelayMillis == marqueeModifierElement.initialDelayMillis && Intrinsics.areEqual(this.spacing, marqueeModifierElement.spacing) && Dp.m6643equalsimpl0(this.velocity, marqueeModifierElement.velocity);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((((Integer.hashCode(this.iterations) * 31) + MarqueeAnimationMode.m648hashCodeimpl(this.animationMode)) * 31) + Integer.hashCode(this.delayMillis)) * 31) + Integer.hashCode(this.initialDelayMillis)) * 31) + this.spacing.hashCode()) * 31) + Dp.m6644hashCodeimpl(this.velocity);
    }

    public String toString() {
        return "MarqueeModifierElement(iterations=" + this.iterations + ", animationMode=" + ((Object) MarqueeAnimationMode.m649toStringimpl(this.animationMode)) + ", delayMillis=" + this.delayMillis + ", initialDelayMillis=" + this.initialDelayMillis + ", spacing=" + this.spacing + ", velocity=" + ((Object) Dp.m6649toStringimpl(this.velocity)) + ')';
    }

    private MarqueeModifierElement(int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2) {
        this.iterations = i2;
        this.animationMode = i3;
        this.delayMillis = i4;
        this.initialDelayMillis = i5;
        this.spacing = marqueeSpacing;
        this.velocity = f2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public MarqueeModifierNode create() {
        return new MarqueeModifierNode(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(MarqueeModifierNode marqueeModifierNode) {
        marqueeModifierNode.m660updatelWfNwf4(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("basicMarquee");
        inspectorInfo.getProperties().set("iterations", Integer.valueOf(this.iterations));
        inspectorInfo.getProperties().set("animationMode", MarqueeAnimationMode.m644boximpl(this.animationMode));
        inspectorInfo.getProperties().set("delayMillis", Integer.valueOf(this.delayMillis));
        inspectorInfo.getProperties().set("initialDelayMillis", Integer.valueOf(this.initialDelayMillis));
        inspectorInfo.getProperties().set("spacing", this.spacing);
        inspectorInfo.getProperties().set("velocity", Dp.m6636boximpl(this.velocity));
    }
}
