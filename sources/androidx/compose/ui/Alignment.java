package androidx.compose.ui;

import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: Alignment.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeN2Xߟմ\u000e\u0002ڔR-\f$ BsV#\b-Qw\\g\u007fnx[;G\u001d\b.x\u0019/yY\u0007a*\u000f`E CAR\b=gf;ZՅ\u001f݅ŕ<{\u000b\b(2ѳ\u000fuٜCV\u0014\u00156ϭ\rhQ\u0015O\u000b9@\u0005̭$\rɧ`f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", "", "/kX4a", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "AoP0X", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "/kX4as$4uqEl\u0014", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Wx\u0012K@\f1m\b0FL\u001a;MAJo>'j,F", "\u0011n\\=T5B]\"", "\u0016na6m6Gb\u0015\u0006", "$daA\\*:Z", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface Alignment {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: Alignment.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\"B\u0012\u007fјl˹ˏ/Z͜x.\u0001Rr-y{L$\n%\"GIW2}P\n\u007fRuj\u0007J\t\fs\u0013\u0014\u001a\u0011jZN\u001c\u001dګ\u0011Ɓ˳BsG5S\u000fk8Ƅx<ԍ$1"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "", "/kX4a", "", "Ahi2", "AoP0X", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Horizontal {
        int align(int i2, int i3, LayoutDirection layoutDirection);
    }

    /* JADX INFO: compiled from: Alignment.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0005Քܦ\u0011\u000eј\u0017jg/\r{V.jSX\u0010\u001c\u007fB&s$ DkY(\u0001:\t}O.\fŪIҙŒC\u0013\u000e\u0018~\nZHǪ|a݉\u00131"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", "", "/kX4a", "", "Ahi2", "AoP0X", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Vertical {
        int align(int i2, int i3);
    }

    /* JADX INFO: renamed from: align-KFBX0sM */
    long mo3783alignKFBX0sM(long j2, long j3, LayoutDirection layoutDirection);

    /* JADX INFO: compiled from: Alignment.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u000e\u0007nj?>Le^.ZS0)qڛ5:ӋTqq:\u0016\u001f\u0004\"\u07beSNug?dh\f[\u000f4\u0018/n\u0003շWޯa\u001e\u0017˰RqE6[oU;fxD\npL0>\u0012\u0005/!`Lf͔|ŲO\u0018\u001aؓPr@Z\u001bM\u001d\u001c\u0018\u000fL*Q8jrf6vs\u0014>\u0006ݒ\u0005ݦFZ/ڿ@~S\u0019TT?\u000f|n,5\u0011QC#=S1\u000e\t_\u0016ũAџA\u0011pѧ7-O\u0003e6p\u0002\u001a%9Y]w\u00017t\u0005\u007fgB+\u0002՚eׂT\u001a0»\u000b}\u0013N\u0012\u000e\u001e)NA;$7\"\u001cG\rr\u0002G\u0007\u00065ە\u0002ѐeB\u001fӛ\u001051N)ficA/\\AL\u001f\u001b5;\u0001\u001d9\u0012Xdֳ\u0017ôX\u0004YĸaBCa\\\nq?s\u001e~}RD\u0012L_\u007f]\u0003G2m®9٦=/)ǽ\u0012JJ\u0005\u0005\u0005xjY\b`R\u0011<|5O*7\u000e\u0011H;ʕmÏXd4Ҋ]\u001eZ'\f\b+\"b\u0019J&u*\\q\u0001i\u0019e\u0014\u000e{ÌhƠ]zsލg;dVCQ{\u0012gv\u0005/\u0010Vp*pfpkB^3̭$ĘLv\u0018Ǯ\fFT2!2Ws\"[:Liv#p\u001b\u001epC3\r6ʻjʐ\u0003`;ɴ\u0013k*\u001e\u0017\u0001h^v\u001au}\u001aF\u000b\f:-oXk\u001d|Ŧ$מ8\t+Ȕ\u000fu\u0006suL_NrC\u0004_L:$HQQ]DI\u0013Uȃ4ī1QTǩuSSA5z\u0015{\u0015kv88\"x\"D`\u0019Q\u0006Xmǹx݈v/\u0010ۭ\u0010{gx\tG{V\u0011\u000fLSΨ\u0007\u000e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s7\b(Bi\u001f2WL\u0011", "", "u(E", "\u0010ncAb4", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", "5dc\u000fb;M]!=vg5\u0007\u0018+t\u00042\u0005N", "5dc\u000fb;M]!", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>h<\u00117z%2K?BA", "\u0010ncAb4\u001cS\"\u000ezk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", "5dc\u000fb;M]!\\zg;|\u0016ma\t1\u0006O|&\u001bQx\u001c", "5dc\u000fb;M]!\\zg;|\u0016", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>hS", "\u0010ncAb4\u001e\\\u0018", "5dc\u000fb;M]!^\u0004]jx\u00128o\u000f$\u000bD\u000b %", "5dc\u000fb;M]!^\u0004]", "\u0010ncAb4,b\u0015\f\n", "5dc\u000fb;M]!l\nZ9\fG+n\t2\u000b<\u0010\u001b!P}", "5dc\u000fb;M]!l\nZ9\f", "\u0011d]AX9", "5dc\u0010X5MS&=vg5\u0007\u0018+t\u00042\u0005N", "5dc\u0010X5MS&", "\u0011d]AX9\u001e\\\u0018", "5dc\u0010X5MS&^\u0004]jx\u00128o\u000f$\u000bD\u000b %", "5dc\u0010X5MS&^\u0004]", "\u0011d]AX9!]&\u0003\u0010h5\f\u00056l\u0014", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "5dc\u0010X5MS&a\u0005k0\u0012\u00138t{/\u0003T?\u0013 Py\u001d8\u0006)?b\f", "5dc\u0010X5MS&a\u0005k0\u0012\u00138t{/\u0003T", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>h<\u0003Az\u001aCWLJg;s", "\u0011d]AX9,b\u0015\f\n", "5dc\u0010X5MS&l\nZ9\fG+n\t2\u000b<\u0010\u001b!P}", "5dc\u0010X5MS&l\nZ9\f", "\u0011d]AX9/S&\u000e~\\(\u0004\u0010C", "5dc\u0010X5MS&ozk;\u0001\u0007+l\u0007<:<\n !Vk\u001d@\u0001.C", "5dc\u0010X5MS&ozk;\u0001\u0007+l\u0007<", "\u0013mS", "5dc\u0012a+|O\"\b\u0005m(\f\r9n\u000e", "5dc\u0012a+", "!sP?g", "5dc g(KbWz\u0004g6\f\u0005>i\n1\n", "5dc g(Kb", "\"n_", "5dc!b7|O\"\b\u0005m(\f\r9n\u000e", "5dc!b7", "\"n_\u0010X5MS&", "5dc!b7\u001cS\"\u000ezkjx\u00128o\u000f$\u000bD\u000b %", "5dc!b7\u001cS\"\u000ezk", "\"n_\u0012a+", "5dc!b7\u001e\\\u0018=vg5\u0007\u0018+t\u00042\u0005N", "5dc!b7\u001e\\\u0018", "\"n_ g(Kb", "5dc!b7,b\u0015\f\n\u001d(\u0006\u00129t{7\u007fJ\n%", "5dc!b7,b\u0015\f\n", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Alignment TopStart = new BiasAlignment(-1.0f, -1.0f);
        private static final Alignment TopCenter = new BiasAlignment(0.0f, -1.0f);
        private static final Alignment TopEnd = new BiasAlignment(1.0f, -1.0f);
        private static final Alignment CenterStart = new BiasAlignment(-1.0f, 0.0f);
        private static final Alignment Center = new BiasAlignment(0.0f, 0.0f);
        private static final Alignment CenterEnd = new BiasAlignment(1.0f, 0.0f);
        private static final Alignment BottomStart = new BiasAlignment(-1.0f, 1.0f);
        private static final Alignment BottomCenter = new BiasAlignment(0.0f, 1.0f);
        private static final Alignment BottomEnd = new BiasAlignment(1.0f, 1.0f);
        private static final Vertical Top = new BiasAlignment.Vertical(-1.0f);
        private static final Vertical CenterVertically = new BiasAlignment.Vertical(0.0f);
        private static final Vertical Bottom = new BiasAlignment.Vertical(1.0f);
        private static final Horizontal Start = new BiasAlignment.Horizontal(-1.0f);
        private static final Horizontal CenterHorizontally = new BiasAlignment.Horizontal(0.0f);
        private static final Horizontal End = new BiasAlignment.Horizontal(1.0f);

        public static /* synthetic */ void getBottom$annotations() {
        }

        public static /* synthetic */ void getBottomCenter$annotations() {
        }

        public static /* synthetic */ void getBottomEnd$annotations() {
        }

        public static /* synthetic */ void getBottomStart$annotations() {
        }

        public static /* synthetic */ void getCenter$annotations() {
        }

        public static /* synthetic */ void getCenterEnd$annotations() {
        }

        public static /* synthetic */ void getCenterHorizontally$annotations() {
        }

        public static /* synthetic */ void getCenterStart$annotations() {
        }

        public static /* synthetic */ void getCenterVertically$annotations() {
        }

        public static /* synthetic */ void getEnd$annotations() {
        }

        public static /* synthetic */ void getStart$annotations() {
        }

        public static /* synthetic */ void getTop$annotations() {
        }

        public static /* synthetic */ void getTopCenter$annotations() {
        }

        public static /* synthetic */ void getTopEnd$annotations() {
        }

        public static /* synthetic */ void getTopStart$annotations() {
        }

        private Companion() {
        }

        public final Alignment getTopStart() {
            return TopStart;
        }

        public final Alignment getTopCenter() {
            return TopCenter;
        }

        public final Alignment getTopEnd() {
            return TopEnd;
        }

        public final Alignment getCenterStart() {
            return CenterStart;
        }

        public final Alignment getCenter() {
            return Center;
        }

        public final Alignment getCenterEnd() {
            return CenterEnd;
        }

        public final Alignment getBottomStart() {
            return BottomStart;
        }

        public final Alignment getBottomCenter() {
            return BottomCenter;
        }

        public final Alignment getBottomEnd() {
            return BottomEnd;
        }

        public final Vertical getTop() {
            return Top;
        }

        public final Vertical getCenterVertically() {
            return CenterVertically;
        }

        public final Vertical getBottom() {
            return Bottom;
        }

        public final Horizontal getStart() {
            return Start;
        }

        public final Horizontal getCenterHorizontally() {
            return CenterHorizontally;
        }

        public final Horizontal getEnd() {
            return End;
        }
    }
}
