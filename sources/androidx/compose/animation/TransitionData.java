package androidx.compose.animation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
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
/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<řc$\u007feCU0}*\teNogt_b\u000bQ\u0015\u000eǝ\u0001j:U]ތc܊\u0015Hԏ ?aL0\u0015Ihz6\u0013 J$Nx3\u0002*2N\u0010\u0005|[M\"\u0011^C\u0001BX\r[\t2\u0014\u001c=N\u0006.dmNDN\u0005_P.Q\nyHT'm8\u0015M;Od=\u0013vo(CPG;%)c\u0003\rS\nK\u0013A\u0002=3uU2ȅMseD!\t\"0CQ#\\!'#ԫR)\u00155GgeaO<+>\u0084|UE\u0012+\u001e)^-[\u001f-ۣ\u000f{}\u0001qXR\u0018]p\u0007A˯7_,\u000eRC9Io\u0018Ŭ<aeE\u001c\u001d\u001d.)\u0011r1[Z\u000f\u000f!+V\bQ_^nH\u000fޗ\u000b\"\u0019{%\tb0Ï48M\u007f={)0-$e\\i+'k\u0010J\\i\r\u0004\u000fk\u0004qXHN&\u0007\u0018M)7\u0011\u000bLj\u0005yVlZB\u0010{#\u0005\r\u0004\b!(twj*U&TOvs\u0003]m\u001053v7_o\u001a\u001ag;n3c^\u0012\u001b(سu\\PJ\u0005\u001dX\u0015K\u0004\u0012h\u007f@$HG\u0019\u000f>ՒE\u0017\u0013!VWqJYrג\u0018%\u001cV)6Bo$O\u07b7Y9!\rXK&\u0019hRy֊\u0005Vdʙ\bi~X:\r1A;KiE),e&x4\u0003$5\u000b\u0004\u0002WgzTzwטy[\u0004\u008d.\u001c?b=Oc \r)J\u0004CDzsϯUS\u001a\u05fd\u0013~\u007f\"I|~v\u0016r\t,\u000fsߝSZ\u001fǱ\u000f`x8\u0016zP\u000boL\u0013IyS9bƏMx\u000bʛTP>\u0014\u00137n6\u000fq:~K,q*ޗ\u001a}\u001c٬-cc\u0003}Hԉf7"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006e21b\f$Fq 7,?Jg\n", "", "4`S2", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006W!4YS", "AkX1X", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d,9X}u", "1gP;Z,,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006T(1b\u007f %q+.#", "AbP9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d#1`}u", "6n[1", "", "3eU2V;L;\u0015\n", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006e21b\f$Fq 7-D<k2-zhu\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006e21b\f$Fq 7-D<k2-j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00061X}u\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018r0KTJ;`\\{\u0007\u0002\u0019^\rN\u0001s\u0001b@1xH62Q*S\nFr\u000f\f_\n>nx>e\u0014Q\u0003^SD%qHYM}\\A\u001bI&m\u000bl'`9Mm\u0012{!&r^.Sw\\\u0015zN\tkqPbh6 Em1;,tQMpp/Z\u007f~[\u001aT\u007f\u00018\u001e", "5dc\u0010[(GU\u0019l~s,", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn\u0013\\y)9m\u00042bC\u0011", "5dc\u0012Y->Q(\rbZ7", "u(;7T=:\u001d)\u000e~eud\u0005:;", "5dc\u0013T+>", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn\u0016U| \r", "5dc\u0015b3=", "u(I", "5dc V(ES", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#Wy'7C", "5dc _0=S", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#`\u0002\u001f7C", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TransitionData {
    public static final int $stable = 0;
    private final ChangeSize changeSize;
    private final Map<TransitionEffectKey<?>, TransitionEffect> effectsMap;
    private final Fade fade;
    private final boolean hold;
    private final Scale scale;
    private final Slide slide;

    public TransitionData() {
        this(null, null, null, null, false, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransitionData copy$default(TransitionData transitionData, Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z2, Map map, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            fade = transitionData.fade;
        }
        if ((2 & i2) != 0) {
            slide = transitionData.slide;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            changeSize = transitionData.changeSize;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            scale = transitionData.scale;
        }
        if ((16 & i2) != 0) {
            z2 = transitionData.hold;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            map = transitionData.effectsMap;
        }
        return transitionData.copy(fade, slide, changeSize, scale, z2, map);
    }

    public final Fade component1() {
        return this.fade;
    }

    public final Slide component2() {
        return this.slide;
    }

    public final ChangeSize component3() {
        return this.changeSize;
    }

    public final Scale component4() {
        return this.scale;
    }

    public final boolean component5() {
        return this.hold;
    }

    public final Map<TransitionEffectKey<?>, TransitionEffect> component6() {
        return this.effectsMap;
    }

    public final TransitionData copy(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z2, Map<TransitionEffectKey<?>, ? extends TransitionEffect> map) {
        return new TransitionData(fade, slide, changeSize, scale, z2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) obj;
        return Intrinsics.areEqual(this.fade, transitionData.fade) && Intrinsics.areEqual(this.slide, transitionData.slide) && Intrinsics.areEqual(this.changeSize, transitionData.changeSize) && Intrinsics.areEqual(this.scale, transitionData.scale) && this.hold == transitionData.hold && Intrinsics.areEqual(this.effectsMap, transitionData.effectsMap);
    }

    public int hashCode() {
        Fade fade = this.fade;
        int iHashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        Slide slide = this.slide;
        int iHashCode2 = (iHashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        ChangeSize changeSize = this.changeSize;
        int iHashCode3 = (iHashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.scale;
        return ((((iHashCode3 + (scale != null ? scale.hashCode() : 0)) * 31) + Boolean.hashCode(this.hold)) * 31) + this.effectsMap.hashCode();
    }

    public String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ", hold=" + this.hold + ", effectsMap=" + this.effectsMap + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z2, Map<TransitionEffectKey<?>, ? extends TransitionEffect> map) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = changeSize;
        this.scale = scale;
        this.hold = z2;
        this.effectsMap = map;
    }

    public final Fade getFade() {
        return this.fade;
    }

    public final Slide getSlide() {
        return this.slide;
    }

    public final ChangeSize getChangeSize() {
        return this.changeSize;
    }

    public final Scale getScale() {
        return this.scale;
    }

    public final boolean getHold() {
        return this.hold;
    }

    public /* synthetic */ TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z2, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? null : fade, (2 & i2) != 0 ? null : slide, (i2 + 4) - (4 | i2) != 0 ? null : changeSize, (i2 + 8) - (8 | i2) == 0 ? scale : null, (i2 + 16) - (16 | i2) != 0 ? false : z2, (i2 & 32) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<TransitionEffectKey<?>, TransitionEffect> getEffectsMap() {
        return this.effectsMap;
    }
}
