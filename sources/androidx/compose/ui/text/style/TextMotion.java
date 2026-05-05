package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: TextMotion.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r+4\u0012}\u0011njG6L͜P.`_2\u000fq|:)qҕ\u0010VkUH|Z\tbb(|tϺj\u000fQ\u000f\u001e\u0016'k<Mczu\u0012=5Բs?AQ8aGj\r63ړb(>y\u0013\u00012*v\u0011'\u0001IK\u001a\u0014H@\u001f=\u0019҈͘\u0004܅Ū\n@&\f,h0_DU\u0005]h2S\twPf)u/+LSЖTo\u0013\u0005p6+nG{)mY\u0011\u0018j[m\u0015\u0006\u0006\u000e\u001fv'?+wt.̭Zŕ\u0013ƃܹN\fǁv.d\u0005_g$)1TqQ! 6y\u0013{;?Z\u05fb\bόL45Կ~\n\u0014;\u0003{Ԣ@Y\naHȷ\u0017\u00105\u001f%\u0006Rڨ=0"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|}8\\GEt\n", "", ":h]2T9Bb-", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|}8\\GEtr\u0005\u0019qa5\u0014g;bL", "AtQ=\\?>Z\b~\u000em\u0017\u0007\u00173t\u00042\u0005D\n\u0019", "", "uHI\u0019^6MZ\u001d\bDc=\u0005R3n\u000f(\tI|\u001e`&o\u000f8\u0007,D7\b)E|#>KREx\u001c\u001a\"naF\\'\u001d", "5dc\u0019\\5>O&\u0003\nrsK\tyV\u0001rJ~\u0011\u001b\u0011Vo!Kp25`}\u001cEm", "u(8", "\u0017", "5dc h)IW,~\u0002M,\u0010\u0018\u001ao\u000e,\u000bD\u000b \u001bPqLLz\u001fDY\u0011/1z\u00165M?Ik", "u(I", "1n_F", "1n_F \u0011=2(ffhj\r\r)t\u007f;\u000b:\u000e\u0017\u001eGk\u001c<", "uHIu?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011~\u000eO\u0006nCh\u0012'77\u0005.`R#uC\"\u001fq7", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "\u001ah]2T9Bb-", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextMotion {
    public static final int $stable = 0;
    private static final TextMotion Animated;
    public static final Companion Companion;
    private static final TextMotion Static;
    private final int linearity;
    private final boolean subpixelTextPositioning;

    public /* synthetic */ TextMotion(int i2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z2);
    }

    private TextMotion(int i2, boolean z2) {
        this.linearity = i2;
        this.subpixelTextPositioning = z2;
    }

    /* JADX INFO: renamed from: getLinearity-4e0Vf04$ui_text_release, reason: not valid java name */
    public final int m6555getLinearity4e0Vf04$ui_text_release() {
        return this.linearity;
    }

    public final boolean getSubpixelTextPositioning$ui_text_release() {
        return this.subpixelTextPositioning;
    }

    /* JADX INFO: compiled from: TextMotion.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^[R\u001d\u000b.x\u0019.֒Y~e܈'4HuM7ޢsD"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|}8\\GEtr{\u001fpl5\u0010g6WL", "", "u(E", "\u000fmX:T;>R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|}8\\GEt\n", "5dc\u000ea0FO(~y", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i&m)=5MJo>'j", "!sPA\\*", "5dc g(MW\u0017", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TextMotion getStatic() {
            return TextMotion.Static;
        }

        public final TextMotion getAnimated() {
            return TextMotion.Animated;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        Static = new TextMotion(Linearity.Companion.m6563getFontHinting4e0Vf04(), false, defaultConstructorMarker);
        Animated = new TextMotion(Linearity.Companion.m6564getLinear4e0Vf04(), true, defaultConstructorMarker);
    }

    /* JADX INFO: renamed from: copy-JdDtMQo$ui_text_release$default, reason: not valid java name */
    public static /* synthetic */ TextMotion m6553copyJdDtMQo$ui_text_release$default(TextMotion textMotion, int i2, boolean z2, int i3, Object obj) {
        if ((i3 + 1) - (1 | i3) != 0) {
            i2 = textMotion.linearity;
        }
        if ((i3 & 2) != 0) {
            z2 = textMotion.subpixelTextPositioning;
        }
        return textMotion.m6554copyJdDtMQo$ui_text_release(i2, z2);
    }

    /* JADX INFO: renamed from: copy-JdDtMQo$ui_text_release, reason: not valid java name */
    public final TextMotion m6554copyJdDtMQo$ui_text_release(int i2, boolean z2) {
        return new TextMotion(i2, z2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) obj;
        return Linearity.m6559equalsimpl0(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning;
    }

    public int hashCode() {
        return (Linearity.m6560hashCodeimpl(this.linearity) * 31) + Boolean.hashCode(this.subpixelTextPositioning);
    }

    public String toString() {
        return Intrinsics.areEqual(this, Static) ? "TextMotion.Static" : Intrinsics.areEqual(this, Animated) ? "TextMotion.Animated" : "Invalid";
    }

    /* JADX INFO: compiled from: TextMotion.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007lnA0RqP.XU0š*\u0012éBjTqq:\u000e\u0019\rb\u0018UNwk|Jr\u000bq\u0010و\u001azp.WXAu \u0013JB\u001eDcS}CQb\u000b53\u001fxƉ9ѩ\t\u0003 1V\u0018?\tQT$\u0012^A7ńQҫQ\u0007 \u001c\u0014Ah\u000e,g\u007fNdT3qƠ3%\tvP\\wk>|e\rtU}˜xҐ\"+Hʺߗ\u0014%٘\u0002\u0007\u0001\\ϓ\u0007O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|}8\\GEtr\u0005\u0019qa5\u0014g;bL", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @JvmInline
    public static final class Linearity {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Linear = m6557constructorimpl(1);
        private static final int FontHinting = m6557constructorimpl(2);
        private static final int None = m6557constructorimpl(3);

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Linearity m6556boximpl(int i2) {
            return new Linearity(i2);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        private static int m6557constructorimpl(int i2) {
            return i2;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m6558equalsimpl(int i2, Object obj) {
            return (obj instanceof Linearity) && i2 == ((Linearity) obj).m6562unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6559equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m6560hashCodeimpl(int i2) {
            return Integer.hashCode(i2);
        }

        public boolean equals(Object obj) {
            return m6558equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m6560hashCodeimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m6562unboximpl() {
            return this.value;
        }

        /* JADX INFO: compiled from: TextMotion.android.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005(2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0\u001al\u0007c*\u000f`DƜ>\u074c߲n<˃d|>\u0005.7::\u007f\f\u000f\u001ez_\u001e~\u0013Cy\u000eݮ/ϋú9QҫQ\r\"\u0012\u0014C8\u0003$euRȧHue=5ݬ\u001f\u0018AV'eOƐQ\u0017"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|}8\\GEtr\u0005\u0019qa5\u0014g;b5\u0005QTY(eV|Fi", "", "u(E", "\u0014n]A;0Gb\u001d\b|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|}8\\GEtr\u0005\u0019qa5\u0014g;bL", "5dc\u0013b5M6\u001d\b\nb5~P}eJ\u0019|\u000bO", "u(8", "\u0017", "\u001ah]2T9", "5dc\u0019\\5>O&FI^vm\ny4", "\u001cn]2", "5dc\u001bb5>\u001bg~EO-GW", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: renamed from: getLinear-4e0Vf04, reason: not valid java name */
            public final int m6564getLinear4e0Vf04() {
                return Linearity.Linear;
            }

            /* JADX INFO: renamed from: getFontHinting-4e0Vf04, reason: not valid java name */
            public final int m6563getFontHinting4e0Vf04() {
                return Linearity.FontHinting;
            }

            /* JADX INFO: renamed from: getNone-4e0Vf04, reason: not valid java name */
            public final int m6565getNone4e0Vf04() {
                return Linearity.None;
            }
        }

        private /* synthetic */ Linearity(int i2) {
            this.value = i2;
        }

        public String toString() {
            return m6561toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m6561toStringimpl(int i2) {
            return m6559equalsimpl0(i2, Linear) ? "Linearity.Linear" : m6559equalsimpl0(i2, FontHinting) ? "Linearity.FontHinting" : m6559equalsimpl0(i2, None) ? "Linearity.None" : "Invalid";
        }
    }
}
