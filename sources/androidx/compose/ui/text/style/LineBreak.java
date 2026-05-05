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
/* JADX INFO: compiled from: LineBreak.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JfP.`Y2\u000fq\u0002<$i-yCAY\"}0\u0015WNmltЂ\u0019!¼-\"Fx\u0019+\u0002W\u0015z0.rauSCQ}=Q`#7\u0015$@$Py3\u0004*.V\u0014\u000fzqPë\u00162FvHYM\\\u000b\u001a\"\nL(\u0019\u001e\u000bpߑ:JrcH9k/wPf'\u000eܞ-S\u0013Fb'%v\u0010\u001f[F=5#'k\u00035U\fE\t?\u007fA\u001dhU,ɛH֕ɱ:Z\u0006##;\u0018%k\u0004>\\3c\u0011\u00125>geaO<'>\u0094|Ɂ@\u0006\u0014\u001a5]v;(| \u000ea}9ն?г\u0006`H\u0017\tk~$3\u0018K+g4-eň?\u001bTQ\n ]*1\t\u0007!\n]d֬\u0017ôXwYĸ\"UKHf\n\b>$Hψạň\u0003/Ͻ\u00043\u0014\u00134\"3A,N1#\u0004\u0002vG\u001e;ߌ_åؾhQ͕D&\u0007\u0018=6\u0017\u0016+Yr\t\u0004P\u0003]bUݬ\u001b\u0381Ϯ|\u0007˙$`\u0010>'2\u001eXсgqҧL]8.Çf@aqqޯsg];5W\u0003߭er"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?AA", "", "Asa.g,@g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?A*\"-\"dp9\tw\u0002", "Asa6V;GS'\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?A*\"-\"l_H\u0010c:\\L", "Ena159>O\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?A*&(\"g>F\u0007_2$", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH8\u0016\u001c\u0010", ";`b8", "", "uH\u0018\u0016", "5dc g9:b\u0019\u0001\u000f&-zj\"I\u00066", "5dc g9BQ(\bzl:D\u0019=l\u0005\u0017\u0007>", "5dc$b9=0&~vds\u0002\u0014\u0002hduy", "1n_F", "1n_F .BX\u0003ffF", "uH8\u0016<o\"", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "!sa.g,@g", "!sa6V;GS'\r", "%na159>O\u001f", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class LineBreak {
    private final int mask;
    public static final Companion Companion = new Companion(null);
    private static final int Simple = m6441constructorimpl(LineBreak_androidKt.packBytes(Strategy.Companion.m6470getSimplefcGXIks(), Strictness.Companion.m6481getNormalusljTpc(), WordBreak.Companion.m6491getDefaultjp8hJ3c()));
    private static final int Heading = m6441constructorimpl(LineBreak_androidKt.packBytes(Strategy.Companion.m6468getBalancedfcGXIks(), Strictness.Companion.m6480getLooseusljTpc(), WordBreak.Companion.m6492getPhrasejp8hJ3c()));
    private static final int Paragraph = m6441constructorimpl(LineBreak_androidKt.packBytes(Strategy.Companion.m6469getHighQualityfcGXIks(), Strictness.Companion.m6482getStrictusljTpc(), WordBreak.Companion.m6491getDefaultjp8hJ3c()));
    private static final int Unspecified = m6441constructorimpl(0);

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineBreak m6440boximpl(int i2) {
        return new LineBreak(i2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m6441constructorimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6445equalsimpl(int i2, Object obj) {
        return (obj instanceof LineBreak) && i2 == ((LineBreak) obj).m6452unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6446equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6450hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    public boolean equals(Object obj) {
        return m6445equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m6450hashCodeimpl(this.mask);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6452unboximpl() {
        return this.mask;
    }

    private /* synthetic */ LineBreak(int i2) {
        this.mask = i2;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m6442constructorimpl(int i2, int i3, int i4) {
        return m6441constructorimpl(LineBreak_androidKt.packBytes(i2, i3, i4));
    }

    /* JADX INFO: renamed from: getStrategy-fcGXIks, reason: not valid java name */
    public static final int m6447getStrategyfcGXIks(int i2) {
        return Strategy.m6462constructorimpl(LineBreak_androidKt.unpackByte1(i2));
    }

    /* JADX INFO: renamed from: getStrictness-usljTpc, reason: not valid java name */
    public static final int m6448getStrictnessusljTpc(int i2) {
        return Strictness.m6473constructorimpl(LineBreak_androidKt.unpackByte2(i2));
    }

    /* JADX INFO: renamed from: getWordBreak-jp8hJ3c, reason: not valid java name */
    public static final int m6449getWordBreakjp8hJ3c(int i2) {
        return WordBreak.m6485constructorimpl(LineBreak_androidKt.unpackByte3(i2));
    }

    /* JADX INFO: renamed from: copy-gijOMQM$default, reason: not valid java name */
    public static /* synthetic */ int m6444copygijOMQM$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 + 1) - (1 | i6) != 0) {
            i3 = m6447getStrategyfcGXIks(i2);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 2)) != 0) {
            i4 = m6448getStrictnessusljTpc(i2);
        }
        if ((i6 + 4) - (i6 | 4) != 0) {
            i5 = m6449getWordBreakjp8hJ3c(i2);
        }
        return m6443copygijOMQM(i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: copy-gijOMQM, reason: not valid java name */
    public static final int m6443copygijOMQM(int i2, int i3, int i4, int i5) {
        return m6442constructorimpl(i3, i4, i5);
    }

    public String toString() {
        return m6451toStringimpl(this.mask);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6451toStringimpl(int i2) {
        return "LineBreak(strategy=" + ((Object) Strategy.m6466toStringimpl(m6447getStrategyfcGXIks(i2))) + ", strictness=" + ((Object) Strictness.m6477toStringimpl(m6448getStrictnessusljTpc(i2))) + ", wordBreak=" + ((Object) WordBreak.m6489toStringimpl(m6449getWordBreakjp8hJ3c(i2))) + ')';
    }

    /* JADX INFO: compiled from: LineBreak.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005.2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005Fi%\nCiWP\u0002xޣQʗf˧ŪIYŲG\u001d\u000e\u0016\u0007p<K[{k\u0012'4HsM8\u001e\u0012K@xtd\u0007V6x؈{܇\u007fɝߋG\u000fͯ~QS\f 6Pr@Z\u001bM\u001d\u001c\u0018\u000fL%Q@jqf6vn\u0014>\u0006ݒ\u0005\u07bcA÷ф^/ƊQ\u001bNT5\u0013\u0007c$6N7M\u0017+_\u0011\f#}M\u0010Wqk\u0007\u001f+}ǪK؎V̬ߒ~\u0013Ʀ/]\u0015]\u0001,l\u0007Wn\u001a'CQiZ^\u0013ߍw\u0004\u0004\u0010Bǫ*4&P.39Ǻ\f\u001e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?A*\u0012(\u001ds]B\u000bm5$", "", "u(E", "\u0016dP1\\5@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?AA", "5dc\u0015X(=W\"\u0001Bk\b^V\u001e2\u0006fwI\n!&C~\u0012F\u007f3", "5dc\u0015X(=W\"\u0001Bk\b^V\u001e2\u0006", "u(8", "\u0017", "\u001e`a.Z9:^\u001c", "5dc\u001dT9:U&z\u0006as\nd\u00113nt\u0002~|  Q~\nKz/>g", "5dc\u001dT9:U&z\u0006as\nd\u00113nt\u0002", "!h\\=_,", "5dc \\4IZ\u0019F\b:\u000eJw{k>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc \\4IZ\u0019F\b:\u000eJw{k", "#mb=X*BT\u001d~y", "5dc\"a:IS\u0017\u0003{b,{P<Aauj\r\u0007U\u0013Px\u0018Kr49c\u0007.", "5dc\"a:IS\u0017\u0003{b,{P<Aauj\r\u0007", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getHeading-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m6453getHeadingrAG3T2k$annotations() {
        }

        /* JADX INFO: renamed from: getParagraph-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m6454getParagraphrAG3T2k$annotations() {
        }

        /* JADX INFO: renamed from: getSimple-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m6455getSimplerAG3T2k$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m6456getUnspecifiedrAG3T2k$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getSimple-rAG3T2k, reason: not valid java name */
        public final int m6459getSimplerAG3T2k() {
            return LineBreak.Simple;
        }

        /* JADX INFO: renamed from: getHeading-rAG3T2k, reason: not valid java name */
        public final int m6457getHeadingrAG3T2k() {
            return LineBreak.Heading;
        }

        /* JADX INFO: renamed from: getParagraph-rAG3T2k, reason: not valid java name */
        public final int m6458getParagraphrAG3T2k() {
            return LineBreak.Paragraph;
        }

        /* JADX INFO: renamed from: getUnspecified-rAG3T2k, reason: not valid java name */
        public final int m6460getUnspecifiedrAG3T2k() {
            return LineBreak.Unspecified;
        }
    }

    /* JADX INFO: compiled from: LineBreak.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007lnA0RqP.XU0ŧ*\u0012éBjTqq:\u000e\u0019\rb\u0018UȞwk|Jr\u000bq\u0010و\u001azp.WXAu \u0013JB\u001eDcS}CQb\u000b53\u001fxƉ9ѩ\t\u0003 1V\u0018?\tQT$\u0012^A7ńQҫQ\u0007 \u001c\u0014Ah\u000e,g\u007fNdT3qƠ3%\tvP\\wk>|e\rtU}˚xҐ\"+Hʺߗ\u0014%٘\u0002\u0007\u0001\\ϓ\u0007O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?A*\"-\"dp9\tw\u0002", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @JvmInline
    public static final class Strategy {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Simple = m6462constructorimpl(1);
        private static final int HighQuality = m6462constructorimpl(2);
        private static final int Balanced = m6462constructorimpl(3);
        private static final int Unspecified = m6462constructorimpl(0);

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strategy m6461boximpl(int i2) {
            return new Strategy(i2);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m6462constructorimpl(int i2) {
            return i2;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m6463equalsimpl(int i2, Object obj) {
            return (obj instanceof Strategy) && i2 == ((Strategy) obj).m6467unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6464equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m6465hashCodeimpl(int i2) {
            return Integer.hashCode(i2);
        }

        public boolean equals(Object obj) {
            return m6463equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m6465hashCodeimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m6467unboximpl() {
            return this.value;
        }

        /* JADX INFO: compiled from: LineBreak.android.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005*2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0\u001al\u0007c*\u000f`DƜ>\u074c߲n<˃d|>\u0005.7::\u007f\f\u000f\u001ez_\u001e~\u0013Cy\u000eݮ/ϋú9QҫQ\r\"\u0012\u0014C8\u0003$euR\u0007_zgR/Q\u0005\u07bcA÷ф^/ƊQ\u0015NT5\u0012\u000fc$6N;ߑ\u0015.[\u0006\rҚwm\u0002GqC$ػ+3"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?A*\"-\"dp9\twj,\u0001/RHW0f[H", "", "u(E", "\u0010`[.a*>R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?A*\"-\"dp9\tw\u0002", "5dc\u000fT3:\\\u0017~y&-zj\"I\u00066", "u(8", "\u0017", "\u0016hV5D<:Z\u001d\u000e\u000f", "5dc\u0015\\.A?)z\u0002b;\u0011P0ca\u001b_F\u000f", "!h\\=_,", "5dc \\4IZ\u0019F{\\\u000eol5s", "#mb=X*BT\u001d~y", "5dc\"a:IS\u0017\u0003{b,{P0ca\u001b_F\u000f", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: renamed from: getSimple-fcGXIks, reason: not valid java name */
            public final int m6470getSimplefcGXIks() {
                return Strategy.Simple;
            }

            /* JADX INFO: renamed from: getHighQuality-fcGXIks, reason: not valid java name */
            public final int m6469getHighQualityfcGXIks() {
                return Strategy.HighQuality;
            }

            /* JADX INFO: renamed from: getBalanced-fcGXIks, reason: not valid java name */
            public final int m6468getBalancedfcGXIks() {
                return Strategy.Balanced;
            }

            /* JADX INFO: renamed from: getUnspecified-fcGXIks, reason: not valid java name */
            public final int m6471getUnspecifiedfcGXIks() {
                return Strategy.Unspecified;
            }
        }

        private /* synthetic */ Strategy(int i2) {
            this.value = i2;
        }

        public String toString() {
            return m6466toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m6466toStringimpl(int i2) {
            return m6464equalsimpl0(i2, Simple) ? "Strategy.Simple" : m6464equalsimpl0(i2, HighQuality) ? "Strategy.HighQuality" : m6464equalsimpl0(i2, Balanced) ? "Strategy.Balanced" : m6464equalsimpl0(i2, Unspecified) ? "Strategy.Unspecified" : "Invalid";
        }
    }

    /* JADX INFO: compiled from: LineBreak.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007lnA0RqP.XU0ŧ*\u0012éBjTqq:\u000e\u0019\rb\u0018UȞwk|Jr\u000bq\u0010و\u001azp.WXAu \u0013JB\u001eDcS}CQb\u000b53\u001fxƉ9ѩ\t\u0003 1V\u0018?\tQT$\u0012^A7ńQҫQ\u0007 \u001c\u0014Ah\u000e,g\u007fNdT3qƠ3%\tvP\\wk>|e\rtU}˚xҐ\"+Hʺߗ\u0014%٘\u0002\u0007\u0001\\ϓ\u0007O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?A*\"-\"l_H\u0010c:\\L", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @JvmInline
    public static final class Strictness {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m6473constructorimpl(1);
        private static final int Loose = m6473constructorimpl(2);
        private static final int Normal = m6473constructorimpl(3);
        private static final int Strict = m6473constructorimpl(4);
        private static final int Unspecified = m6473constructorimpl(0);
        private final int value;

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strictness m6472boximpl(int i2) {
            return new Strictness(i2);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m6473constructorimpl(int i2) {
            return i2;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m6474equalsimpl(int i2, Object obj) {
            return (obj instanceof Strictness) && i2 == ((Strictness) obj).m6478unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6475equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m6476hashCodeimpl(int i2) {
            return Integer.hashCode(i2);
        }

        public boolean equals(Object obj) {
            return m6474equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m6476hashCodeimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m6478unboximpl() {
            return this.value;
        }

        /* JADX INFO: compiled from: LineBreak.android.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005,2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0\u001al\u0007c*\u000f`DƜ>\u074c߲n<˃d|>\u0005.7::\u007f\f\u000f\u001ez_\u001e~\u0013Cy\u000eݮ/ϋú9QҫQ\r\"\u0012\u0014C8\u0003$euR\u0007_zgR/Q\u0005\u07bcA÷ф^/ƊQ\u0015NT5\u0012\u000fc$6N;\u0006,3_\u001b\u0007\u0001]У\u0002ӊҵ<\u0004ص+/3I\u0002\\NZ\u0006!#/̀\rfz)bԆm\u000f\u000b/+U\u0003\u05c8T\u001c"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?A*\"-\"l_H\u0010c:\\5\u0005QTY(eV|Fi", "", "u(E", "\u0012dU.h3M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?A*\"-\"l_H\u0010c:\\L", "5dc\u0011X-:c \u000eBn:\u0004\u000e\u001ep}", "u(8", "\u0017", "\u001an^@X", "5dc\u0019b6LS`\u000f\te1k\u0014-", "\u001cna:T3", "5dc\u001bb9FO F\u000bl3\u0002w:c", "!sa6V;", "5dc g9BQ(F\u000bl3\u0002w:c", "#mb=X*BT\u001d~y", "5dc\"a:IS\u0017\u0003{b,{P?s\u0007-jK~", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: renamed from: getDefault-usljTpc, reason: not valid java name */
            public final int m6479getDefaultusljTpc() {
                return Strictness.Default;
            }

            /* JADX INFO: renamed from: getLoose-usljTpc, reason: not valid java name */
            public final int m6480getLooseusljTpc() {
                return Strictness.Loose;
            }

            /* JADX INFO: renamed from: getNormal-usljTpc, reason: not valid java name */
            public final int m6481getNormalusljTpc() {
                return Strictness.Normal;
            }

            /* JADX INFO: renamed from: getStrict-usljTpc, reason: not valid java name */
            public final int m6482getStrictusljTpc() {
                return Strictness.Strict;
            }

            /* JADX INFO: renamed from: getUnspecified-usljTpc, reason: not valid java name */
            public final int m6483getUnspecifiedusljTpc() {
                return Strictness.Unspecified;
            }
        }

        private /* synthetic */ Strictness(int i2) {
            this.value = i2;
        }

        public String toString() {
            return m6477toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m6477toStringimpl(int i2) {
            return m6475equalsimpl0(i2, Default) ? "Strictness.None" : m6475equalsimpl0(i2, Loose) ? "Strictness.Loose" : m6475equalsimpl0(i2, Normal) ? "Strictness.Normal" : m6475equalsimpl0(i2, Strict) ? "Strictness.Strict" : m6475equalsimpl0(i2, Unspecified) ? "Strictness.Unspecified" : "Invalid";
        }
    }

    /* JADX INFO: compiled from: LineBreak.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007lnA0RqP.XU0ŧ*\u0012éBjTqq:\u000e\u0019\rb\u0018UȞwk|Jr\u000bq\u0010و\u001azp.WXAu \u0013JB\u001eDcS}CQb\u000b53\u001fxƉ9ѩ\t\u0003 1V\u0018?\tQT$\u0012^A7ńQҫQ\u0007 \u001c\u0014Ah\u000e,g\u007fNdT3qƠ3%\tvP\\wk>|e\rtU}˚xҐ\"+Hʺߗ\u0014%٘\u0002\u0007\u0001\\ϓ\u0007O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?A*&(\"g>F\u0007_2$", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @JvmInline
    public static final class WordBreak {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m6485constructorimpl(1);
        private static final int Phrase = m6485constructorimpl(2);
        private static final int Unspecified = m6485constructorimpl(0);
        private final int value;

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WordBreak m6484boximpl(int i2) {
            return new WordBreak(i2);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m6485constructorimpl(int i2) {
            return i2;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m6486equalsimpl(int i2, Object obj) {
            return (obj instanceof WordBreak) && i2 == ((WordBreak) obj).m6490unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6487equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m6488hashCodeimpl(int i2) {
            return Integer.hashCode(i2);
        }

        public boolean equals(Object obj) {
            return m6486equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m6488hashCodeimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m6490unboximpl() {
            return this.value;
        }

        /* JADX INFO: compiled from: LineBreak.android.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005(2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0\u001al\u0007c*\u000f`DƜ>\u074c߲n<˃d|>\u0005.7::\u007f\f\u000f\u001ez_\u001e~\u0013Cy\u000eݮ/ϋú9QҫQ\r\"\u0012\u0014C8\u0003$euRȧHue=5ݬ\u001f\u0018AV'eOƐQ\u0017"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?A*&(\"g>F\u0007_2\rT1OWJ5`\\{\u0013", "", "u(E", "\u0012dU.h3M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?A*&(\"g>F\u0007_2$", "5dc\u0011X-:c \u000eBc7O\f\u00143}", "u(8", "\u0017", "\u001ega.f,", "5dc\u001d[9:a\u0019F\u007fi~\u007fm|c", "#mb=X*BT\u001d~y", "5dc\"a:IS\u0017\u0003{b,{P4pR+`\u000e~", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: renamed from: getDefault-jp8hJ3c, reason: not valid java name */
            public final int m6491getDefaultjp8hJ3c() {
                return WordBreak.Default;
            }

            /* JADX INFO: renamed from: getPhrase-jp8hJ3c, reason: not valid java name */
            public final int m6492getPhrasejp8hJ3c() {
                return WordBreak.Phrase;
            }

            /* JADX INFO: renamed from: getUnspecified-jp8hJ3c, reason: not valid java name */
            public final int m6493getUnspecifiedjp8hJ3c() {
                return WordBreak.Unspecified;
            }
        }

        private /* synthetic */ WordBreak(int i2) {
            this.value = i2;
        }

        public String toString() {
            return m6489toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m6489toStringimpl(int i2) {
            return m6487equalsimpl0(i2, Default) ? "WordBreak.None" : m6487equalsimpl0(i2, Phrase) ? "WordBreak.Phrase" : m6487equalsimpl0(i2, Unspecified) ? "WordBreak.Unspecified" : "Invalid";
        }
    }
}
