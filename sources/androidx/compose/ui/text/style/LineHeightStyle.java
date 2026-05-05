package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: LineHeightStyle.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\rnjG9LeN.ZS8\u0015sڔ<$i0yCAW \u00038ޛma\u0018g\u001dI\u0013\fU\"\u001aV\fz0WU\u0011]@\u0010BF}AKM\u001e@˃dtD\thC0C\u0012\u0005/&ZN\u001e\u0004\u0013Ea\u000b@/\u0007\u0098:\u001b\u0013[\u00132\u00124Mf\u0015fbu^NH\u001bn\u0001Cs\u001awBf'\u000e1ǠLεѸS&˼zi&+N>M\u0017+X\u0011\r#rM\u0005Wqk\bڋ&ݐɛHrɱ:`\b\u0014#5g\u000fcz4eӧQi\u0014*1մ\u007fyO\u0016(}\u001aԱ\u0011Q"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mx.QE>z\"-)oa\u000f", "", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mx.QE>z\"-)oawbj0P\u007f/GU]\u0002", "BqX:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mx.QE>z\"-)oawup0VL", "uE8\u0019^6MZ\u001d\bDc=\u0005R3n\u000f(\tI|\u001e`&o\u000f8\u0007,D7\b)E|#>KREx\u001c\u001a\"naF\\'\u001d", "5dc\u000e_0@\\!~\u0004msgl+LJ\u001dF", "u(5", "\u0014", "5dc!e0F\u001bxo\u0006>5lx", "u(8", "\u0017", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "\u000fkX4a4>\\(", "\u0011n\\=T5B]\"", "\"qX:", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LineHeightStyle {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final LineHeightStyle Default;
    private final float alignment;
    private final int trim;

    public /* synthetic */ LineHeightStyle(float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, i2);
    }

    private LineHeightStyle(float f2, int i2) {
        this.alignment = f2;
        this.trim = i2;
    }

    /* JADX INFO: renamed from: getAlignment-PIaL0Z0, reason: not valid java name */
    public final float m6494getAlignmentPIaL0Z0() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: getTrim-EVpEnUU, reason: not valid java name */
    public final int m6495getTrimEVpEnUU() {
        return this.trim;
    }

    /* JADX INFO: compiled from: LineHeightStyle.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mx.QE>z\"-)oawdm4Yr0KVW\u0002", "", "u(E", "\u0012dU.h3M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mx.QE>z\"-)oa\u000f", "5dc\u0011X-:c \u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i\u001eq\u001f.0C?m7-\u0003wu@\u00079", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LineHeightStyle getDefault() {
            return LineHeightStyle.Default;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        Default = new LineHeightStyle(Alignment.Companion.m6505getProportionalPIaL0Z0(), Trim.Companion.m6516getBothEVpEnUU(), defaultConstructorMarker);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) obj;
        return Alignment.m6499equalsimpl0(this.alignment, lineHeightStyle.alignment) && Trim.m6510equalsimpl0(this.trim, lineHeightStyle.trim);
    }

    public int hashCode() {
        return (Alignment.m6500hashCodeimpl(this.alignment) * 31) + Trim.m6511hashCodeimpl(this.trim);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.m6501toStringimpl(this.alignment)) + ", trim=" + ((Object) Trim.m6514toStringimpl(this.trim)) + ')';
    }

    /* JADX INFO: compiled from: LineHeightStyle.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007lsA0RqP.XU0ŧ*\u0012éBoTqq:\u000e\u0019\u0012b\u0018UNwk|Jr\u000bq\u0010و\u001azp.WXAu \u0013JB\u001eDcS}CQb\u000b53\u001fxƉ9ѩ\t\u0003 1V\u0018?\tQT$\u0012^A7ńQҫQ\u0007 \u001c\u0014Ah\u000e,g\u007fNdM3җƠ3%\tuP[ol>\u000be\rtYm˙țe 1OEB]2a\u0013\u001fR\nPISџA\u0007n95>\u001a\u007fe6p\u007fB\u0016\u0002̀\u000fǁv&dӤĲ_\fʿ*O\u0012Lם\u0012="}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mx.QE>z\"-)oawup0VL", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "7rC?\\4\u001fW&\r\nE0\u0006\t\u001eo\u000b", "7rC?\\4\u001fW&\r\nE0\u0006\t\u001eo\u000bo\u007fH\f\u001eUWs\bKv8DS\u000b >m\u0012<M", "uH\u0018'", "7rC?\\4%O'\u000eab5|e9t\u000f2\u0004", "7rC?\\4%O'\u000eab5|e9t\u000f2\u0004\b\u0005\u001f\"N.\u001e@p45l\r\u001aDm\u001d.IQ;", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @JvmInline
    public static final class Trim {
        private static final int FlagTrimBottom = 16;
        private static final int FlagTrimTop = 1;
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int FirstLineTop = m6508constructorimpl(1);
        private static final int LastLineBottom = m6508constructorimpl(16);
        private static final int Both = m6508constructorimpl(17);
        private static final int None = m6508constructorimpl(0);

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Trim m6507boximpl(int i2) {
            return new Trim(i2);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        private static int m6508constructorimpl(int i2) {
            return i2;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m6509equalsimpl(int i2, Object obj) {
            return (obj instanceof Trim) && i2 == ((Trim) obj).m6515unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6510equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m6511hashCodeimpl(int i2) {
            return Integer.hashCode(i2);
        }

        /* JADX INFO: renamed from: isTrimFirstLineTop-impl$ui_text_release, reason: not valid java name */
        public static final boolean m6512isTrimFirstLineTopimpl$ui_text_release(int i2) {
            return (-1) - (((-1) - i2) | ((-1) - 1)) > 0;
        }

        /* JADX INFO: renamed from: isTrimLastLineBottom-impl$ui_text_release, reason: not valid java name */
        public static final boolean m6513isTrimLastLineBottomimpl$ui_text_release(int i2) {
            return (-1) - (((-1) - i2) | ((-1) - 16)) > 0;
        }

        public boolean equals(Object obj) {
            return m6509equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m6511hashCodeimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m6515unboximpl() {
            return this.value;
        }

        private /* synthetic */ Trim(int i2) {
            this.value = i2;
        }

        public String toString() {
            return m6514toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m6514toStringimpl(int i2) {
            return i2 == FirstLineTop ? "LineHeightStyle.Trim.FirstLineTop" : i2 == LastLineBottom ? "LineHeightStyle.Trim.LastLineBottom" : i2 == Both ? "LineHeightStyle.Trim.Both" : i2 == None ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        /* JADX INFO: compiled from: LineHeightStyle.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005&4\u0012\u0006\rnj?4JͣIDɟ\u0004*=j<9*[ҸuCIUj\u00150\ngN\u0016iŪIҙǈB\u000eو\u001a\u0001r,WZ\u0011_\u0018\u0012@F@VAS\b=gbԓ5ӌ܌1!أ}\r\t\u001a8M(x\u0001JY\u0010b<NxRR;V[܈dĂB \tȦ-s\\@`l\fC\u0006ݍUݦFN/ڿ\u0001\u0014[\u0018^TU\u000fɱ`Ӝӡ?6߱\u0019-[\u0003\u0015WsA\tK\u007fAU\u007f54CI\"YΥWÜѥ\u0014*̠\u0011ez&j\nib\u001259SҭKY\u0016+}ߠ\u0018;;\f\u000e\fFχ2<"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mx.QE>z\"-)oawup0V5\u0005QTY(eV|Fi", "", "u(E", "\u0010nc5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mx.QE>z\"-)oawup0VL", "5dc\u000fb;A\u001bxo\u0006>5lx", "u(8", "\u0017", "\u0014ha@g\u0013B\\\u0019m\u0005i", "5dc\u0013\\9Lb\u007f\u0003\u0004^\u001b\u0007\u0014vEp3[Ip\u0007", "\u0014kP4G9B[u\t\nm6\u0005", "", "\u0014kP4G9B[\b\t\u0006", "\u001a`bA?0GSu\t\nm6\u0005", "5dc\u0019T:M:\u001d\bz;6\f\u00189mG\blK` \u00077", "\u001cn]2", "5dc\u001bb5>\u001bxo\u0006>5lx", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: renamed from: getFirstLineTop-EVpEnUU, reason: not valid java name */
            public final int m6517getFirstLineTopEVpEnUU() {
                return Trim.FirstLineTop;
            }

            /* JADX INFO: renamed from: getLastLineBottom-EVpEnUU, reason: not valid java name */
            public final int m6518getLastLineBottomEVpEnUU() {
                return Trim.LastLineBottom;
            }

            /* JADX INFO: renamed from: getBoth-EVpEnUU, reason: not valid java name */
            public final int m6516getBothEVpEnUU() {
                return Trim.Both;
            }

            /* JADX INFO: renamed from: getNone-EVpEnUU, reason: not valid java name */
            public final int m6519getNoneEVpEnUU() {
                return Trim.None;
            }
        }
    }

    /* JADX INFO: compiled from: LineHeightStyle.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4C\u0007\":\u001b\u007f\u0007llA0RkP.XT2\u000fy\b<$a&wٙykڼ\u001c39O|f m[\u001b\u0018S\u0013\u0014\u0016\u0011jZJǤ|_\u0018\u0011@E8WAQ\b=ge%<\u0013&J$Nx3\u007f`ީIǘz|IR\u001a\u001axN~Cj\r{\u000f`ƞ\u0005̧$\u0003$guZ~UzjR/Q\u00110VĚ+a6\f[\u001d\u0017`5\r\u000faL,\u0017ʻ7չ)S\u000bޗҁZ?Ŵ>qk\u0006ػ+9"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mx.QE>z\"-)oawbj0P\u007f/GU]\u0002", "", "Bn_\u001fT;B]", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uE\u0018\u0013", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uE;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uE\u0018\u0016", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uE\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @JvmInline
    public static final class Alignment {
        private final float topRatio;
        public static final Companion Companion = new Companion(null);
        private static final float Top = m6497constructorimpl(0.0f);
        private static final float Center = m6497constructorimpl(0.5f);
        private static final float Proportional = m6497constructorimpl(-1.0f);
        private static final float Bottom = m6497constructorimpl(1.0f);

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Alignment m6496boximpl(float f2) {
            return new Alignment(f2);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m6498equalsimpl(float f2, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f2, ((Alignment) obj).m6502unboximpl()) == 0;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6499equalsimpl0(float f2, float f3) {
            return Float.compare(f2, f3) == 0;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m6500hashCodeimpl(float f2) {
            return Float.hashCode(f2);
        }

        public boolean equals(Object obj) {
            return m6498equalsimpl(this.topRatio, obj);
        }

        public int hashCode() {
            return m6500hashCodeimpl(this.topRatio);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ float m6502unboximpl() {
            return this.topRatio;
        }

        private /* synthetic */ Alignment(float f2) {
            this.topRatio = f2;
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static float m6497constructorimpl(float f2) {
            if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
                throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
            }
            return f2;
        }

        public String toString() {
            return m6501toStringimpl(this.topRatio);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m6501toStringimpl(float f2) {
            return f2 == Top ? "LineHeightStyle.Alignment.Top" : f2 == Center ? "LineHeightStyle.Alignment.Center" : f2 == Proportional ? "LineHeightStyle.Alignment.Proportional" : f2 == Bottom ? "LineHeightStyle.Alignment.Bottom" : "LineHeightStyle.Alignment(topPercentage = " + f2 + ')';
        }

        /* JADX INFO: compiled from: LineHeightStyle.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005*2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0\u001al\u0007c*\u000f`DƜ>\u074c߲n<˃d|>\u0005.7::\u007f\f\u000f\u001ez_\u001e~\u0013Cy\u000eݮ/ϋú9QҫQ\r\"\u0012\u0014C8\u0003$euR\u0007_zgR/Q\u0005\u07bcA÷ф^/ƊQ\u0015NT5\u0012\u000fc$6N;ߑ\u0015.[\u0006\rҚwm\u0002GqC$ػ+3"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mx.QE>z\"-)oawbj0P\u007f/GU]j:\\zH\u0010\u001b^\u0018W\u0001", "", "u(E", "\u0010ncAb4", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mx.QE>z\"-)oawbj0P\u007f/GU]\u0002", "5dc\u000fb;M]!FeB(cS$0", "u(5", "\u0014", "\u0011d]AX9", "5dc\u0010X5MS&FeB(cS$0", "\u001eq^=b9MW#\bve", "5dc\u001de6I]&\u000e~h5x\u0010vPc$b\u000bua", "\"n_", "5dc!b7\u0006>|za)!G", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: renamed from: getTop-PIaL0Z0, reason: not valid java name */
            public final float m6506getTopPIaL0Z0() {
                return Alignment.Top;
            }

            /* JADX INFO: renamed from: getCenter-PIaL0Z0, reason: not valid java name */
            public final float m6504getCenterPIaL0Z0() {
                return Alignment.Center;
            }

            /* JADX INFO: renamed from: getProportional-PIaL0Z0, reason: not valid java name */
            public final float m6505getProportionalPIaL0Z0() {
                return Alignment.Proportional;
            }

            /* JADX INFO: renamed from: getBottom-PIaL0Z0, reason: not valid java name */
            public final float m6503getBottomPIaL0Z0() {
                return Alignment.Bottom;
            }
        }
    }
}
