package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineProvider;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
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
/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u0005#4\u0012\u0006\rnj?0Le^.Zݷ2\u000f\u0002{<$a.yCQU\"}8\tWN}gvJp\u000bK\u000f\u001c\u0016\u0001jBI]ތcA%˰`\u0003o3{nu>q\u0007I\u00195H9x~\u000b\u0003ʀ.H\u001evCnY\u0011*0nvjV\u001bT\u001d\u001a@\fn$\u000f&tg|?xpkDG#1trR5kH|{\u0013\rrܮ\u0011vg+sWEC-'i\u00025X\fC\u0011I\n=3sm5ȅMu]Ef\u0010d'9P%]!(\u0013S(ӱ\u000eˏ/S{MV\u00116{߁z\u0011T\u001d(!Ceͼ18"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u001d", "", "u(E", "7rA2_(MW*~", "", "7rA2_(MW*~9_6\r\u0012.a\u000f,\u0006Iz\u001e\u0013[y\u001eKp25`}\u001cEm", "u(I", "/kX4a", "", "Ahi2", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ">kP0X(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "0dU<e,\u001c`#\r\t:?\u0001\u0017\u000bl\u0004*\u0005H\u0001 &.s\u0017<", "/kX4aj?])\byZ;\u0001\u00138_\u0007$\u0010J\u0011&\u0011To\u0015<r35", "1`[0h3:b\u0019Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001\u0002!Us\u001d@\u0001.", "1`[0h3:b\u0019Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001\u0002!Us\u001d@\u0001.sZ\b0@l\u0012=QMDe;\u001a)rqH\u0001p,Uv#UL", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0010<U{ 3j\u001d.#\u0007\"p0/\u00112h5\u0010eu2\u007f6GNN92", "\u000fkX4a4>\\(e~g,Z\u00169s\u000e\u0004\u000fD\u000fr\u001eKq\u0017Dv.D", "\u0011d]AX9\u001c`#\r\t:?\u0001\u0017\u000bl\u0004*\u0005H\u0001 &", "\u0011n\\=T5B]\"", "\u0013mS\u0010e6Lat\u0012~l\b\u0004\r1n\b(\u0005O", "\u0016na6m6Gb\u0015\u0006Xk6\u000b\u0017\u000bx\u00046WG\u0005\u0019 Oo\u0017K", "!sP?g\nK]'\rVq0\u000bd6i\u00021\u0004@\n&", "$daA\\*:Zv\f\u0005l:X\u001c3s[/\u007fB\n\u001f\u0017P~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u0006(U0^[z=\u001d!A\u0012W+j\u0012cO2JW;-c3M\u0004Dp\u0001\u0015%c", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u0006*N5kR\u007f\u001b!\u001ch\u001c*>\u0011\u00135H(pM?\u001f\u0011;\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u0006,W+:_|K\"mm\u0012\\\u0007\u0014\t[J,nMFt", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u0006/X9`g|F#\u000eak[5\u001b\u00135T(| >#\n5Q\u0002DwV", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u0006:](iaPJ\u001e hia/\u001b``E&wL7(\u0017\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u0006=N9kVp9\u001bog\u0018\\9h\u0018]O\u007fuH9(\u0010,R\u0011\u0011", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class CrossAxisAlignment {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final CrossAxisAlignment Center = CenterCrossAxisAlignment.INSTANCE;
    private static final CrossAxisAlignment Start = StartCrossAxisAlignment.INSTANCE;
    private static final CrossAxisAlignment End = EndCrossAxisAlignment.INSTANCE;

    public /* synthetic */ CrossAxisAlignment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int align$foundation_layout_release(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3);

    public Integer calculateAlignmentLinePosition$foundation_layout_release(Placeable placeable) {
        return null;
    }

    public boolean isRelative$foundation_layout_release() {
        return false;
    }

    private CrossAxisAlignment() {
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005+4\u0012\u000e\u0007nj?0Le^.ZS0\u000fs{J$c$wCCU0}*\tUNmˮo`ҙ;C=\u0005V}p,֒Yxk\u0012W>P{W3{qm=n\u0002N\u0005N@jK\b\u0014\u0019\u001aXJ@z\tSc\f@A\u0007\u0081ĐV\rS\u0017b%\u0014Q8\u0001L^\u0018RD[\u0005]hCiɅݦFN-tx\u0010[#^TU\u000f'e,AX7c,kمΫ\u000bRaWSY\u007f>\u001dhU)aMJɖ8ݼ\u0004 \u001dۀ_\u000fcu4\\\u001dSf\u001050 }YV&(&|2\u0011\u0013Ǒ\u0010Ν+T6Ʀ*h\u000e\u0015At\u000bUFX\u0010c\u0013\u001a\tjN\u0017S\u0002i/\u0010ӝhЂeG!\u05cbG}\u000b\u0017,#\u0019p'fb\u0013ה\u00194"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u0006*X4gN{A\u001e\u001b0", "", "u(E", "\u0011d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u001d", "5dc\u0010X5MS&=vg5\u0007\u0018+t\u00042\u0005N", "5dc\u0010X5MS&", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w+PEyBy(lo\u0015\u000eg.W~'P[$", "\u0013mS", "5dc\u0012a+|O\"\b\u0005m(\f\r9n\u000e", "5dc\u0012a+", "!sP?g", "5dc g(KbWz\u0004g6\f\u0005>i\n1\n", "5dc g(Kb", "\u000fkX4a4>\\(e~g,", "/kX4a4>\\(e~g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", " d[.g0OS", "/kX4a4>\\(e~g,g\u00169v\u0004'{M", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q5QEDs4'$OeB\u0007N9X\b+FL[\u0002", " d[.g0OSW\u007f\u0005n5{\u0005>i\n1uG|+!W~\bIv,5U\f ", "6na6m6Gb\u0015\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "6na6m6Gb\u0015\u00069_6\r\u0012.a\u000f,\u0006Iz\u001e\u0013[y\u001eKp25`}\u001cEm", "DdaA\\*:Z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", "DdaA\\*:ZW\u007f\u0005n5{\u0005>i\n1uG|+!W~\bIv,5U\f ", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCenter$annotations() {
        }

        public static /* synthetic */ void getEnd$annotations() {
        }

        public static /* synthetic */ void getStart$annotations() {
        }

        private Companion() {
        }

        public final CrossAxisAlignment getCenter() {
            return CrossAxisAlignment.Center;
        }

        public final CrossAxisAlignment getStart() {
            return CrossAxisAlignment.Start;
        }

        public final CrossAxisAlignment getEnd() {
            return CrossAxisAlignment.End;
        }

        public final CrossAxisAlignment AlignmentLine(AlignmentLine alignmentLine) {
            return new AlignmentLineCrossAxisAlignment(new AlignmentLineProvider.Value(alignmentLine));
        }

        public final CrossAxisAlignment Relative$foundation_layout_release(AlignmentLineProvider alignmentLineProvider) {
            return new AlignmentLineCrossAxisAlignment(alignmentLineProvider);
        }

        public final CrossAxisAlignment vertical$foundation_layout_release(Alignment.Vertical vertical) {
            return new VerticalCrossAxisAlignment(vertical);
        }

        public final CrossAxisAlignment horizontal$foundation_layout_release(Alignment.Horizontal horizontal) {
            return new HorizontalCrossAxisAlignment(horizontal);
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u000e\u0007nʑA0ZeP.XT0Ƣk\u0012éT[Rp\u0004@[\u001aԥ&\t]N0\u0013|Kr\u000bq\u00116\u001a\u0007mDI\u0004z\u000e\u0016\u001d6Zom8}sK?xtd\fP60@\u0012\u0005/\u001cpVǘzzITñ\u0016:"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u0006*N5kR\u007f\u001b!\u001ch\u001c*>\u0011\u00135H(pM?\u001f\u0011;\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u001d", "u(E", "/kX4a", "", "Ahi2", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ">kP0X(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "0dU<e,\u001c`#\r\t:?\u0001\u0017\u000bl\u0004*\u0005H\u0001 &.s\u0017<", "/kX4aj?])\byZ;\u0001\u00138_\u0007$\u0010J\u0011&\u0011To\u0015<r35", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class CenterCrossAxisAlignment extends CrossAxisAlignment {
        public static final CenterCrossAxisAlignment INSTANCE = new CenterCrossAxisAlignment();

        private CenterCrossAxisAlignment() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            return i2 / 2;
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u000e\u0007nʑA0ZeP.XT0Ƣk\u0012éT[Rp\u0004@[\u001aԥ&\t]N0\u0013|Kr\u000bq\u00116\u001a\u0007mDI\u0004z\u000e\u0016\u001d6Zom8}sK?xtd\fP60@\u0012\u0005/\u001cpVǘzzITñ\u0016:"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u0006:](iaPJ\u001e hia/\u001b``E&wL7(\u0017\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u001d", "u(E", "/kX4a", "", "Ahi2", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ">kP0X(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "0dU<e,\u001c`#\r\t:?\u0001\u0017\u000bl\u0004*\u0005H\u0001 &.s\u0017<", "/kX4aj?])\byZ;\u0001\u00138_\u0007$\u0010J\u0011&\u0011To\u0015<r35", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class StartCrossAxisAlignment extends CrossAxisAlignment {
        public static final StartCrossAxisAlignment INSTANCE = new StartCrossAxisAlignment();

        private StartCrossAxisAlignment() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            if (layoutDirection == LayoutDirection.Ltr) {
                return 0;
            }
            return i2;
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u000e\u0007nʑA0ZeP.XT0Ƣk\u0012éT[Rp\u0004@[\u001aԥ&\t]N0\u0013|Kr\u000bq\u00116\u001a\u0007mDI\u0004z\u000e\u0016\u001d6Zom8}sK?xtd\fP60@\u0012\u0005/\u001cpVǘzzITñ\u0016:"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u0006,W+:_|K\"mm\u0012\\\u0007\u0014\t[J,nMFt", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u001d", "u(E", "/kX4a", "", "Ahi2", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ">kP0X(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "0dU<e,\u001c`#\r\t:?\u0001\u0017\u000bl\u0004*\u0005H\u0001 &.s\u0017<", "/kX4aj?])\byZ;\u0001\u00138_\u0007$\u0010J\u0011&\u0011To\u0015<r35", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class EndCrossAxisAlignment extends CrossAxisAlignment {
        public static final EndCrossAxisAlignment INSTANCE = new EndCrossAxisAlignment();

        private EndCrossAxisAlignment() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            if (layoutDirection == LayoutDirection.Ltr) {
                return i2;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0007\":\u001b\u007f\u0007lkA0RkP.XS2\u000f\u0002{<řc$\bCCU \u0002(\teȞ\u0018g\u001dI\u001b\u0016S\u0013\u0014\u0016\u0011jZJǤ|] \u0011zm}HKM\u001eGid\u0003A\u001d `,h}\u0013\r2*v\u001d'~QY$\u0012^O!>`\u001de\u0005H\u001cLLŋ\u0005\u001ebx\u0017KV~u:]-3mP\\?_^\f\u0014\u001bТX)\u0013\no2{OE5-%\u0002\u0004\u07baVaGšWsC\bv+w=Wxo6\u0007\u0006Jc\u0002̎\u000fǁv*t\u0007Wg\u001a/ˬSx"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u0006(U0^[z=\u001d!A\u0012W+j\u0012cO2JW;-c3M\u0004Dp\u0001\u0015%c", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u001d", "/kX4a4>\\(e~g,g\u00169v\u0004'{M", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q5QEDs4'$OeB\u0007N9X\b+FL[\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\nTG=t<\u001e\u001ewH=\u0010c\u0017[\u00018KKN92\u0016c", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/P\r2\rD\u007f\u0017$", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w)J?m=&\u0015qp \u000bl,9\u00041XPM,i(", "7rA2_(MW*~", "", "7rA2_(MW*~9_6\r\u0012.a\u000f,\u0006Iz\u001e\u0013[y\u001eKp25`}\u001cEm", "u(I", "/kX4a", "", "Ahi2", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ">kP0X(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "0dU<e,\u001c`#\r\t:?\u0001\u0017\u000bl\u0004*\u0005H\u0001 &.s\u0017<", "/kX4aj?])\byZ;\u0001\u00138_\u0007$\u0010J\u0011&\u0011To\u0015<r35", "1`[0h3:b\u0019Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001\u0002!Us\u001d@\u0001.", "1`[0h3:b\u0019Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001\u0002!Us\u001d@\u0001.sZ\b0@l\u0012=QMDe;\u001a)rqH\u0001p,Uv#UL", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0010<U{ 3j\u001d.#\u0007\"p0/\u00112h5\u0010eu2\u007f6GNN92", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class AlignmentLineCrossAxisAlignment extends CrossAxisAlignment {
        private final AlignmentLineProvider alignmentLineProvider;

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public boolean isRelative$foundation_layout_release() {
            return true;
        }

        public final AlignmentLineProvider getAlignmentLineProvider() {
            return this.alignmentLineProvider;
        }

        public AlignmentLineCrossAxisAlignment(AlignmentLineProvider alignmentLineProvider) {
            super(null);
            this.alignmentLineProvider = alignmentLineProvider;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public Integer calculateAlignmentLinePosition$foundation_layout_release(Placeable placeable) {
            return Integer.valueOf(this.alignmentLineProvider.calculateAlignmentLinePosition(placeable));
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            int iCalculateAlignmentLinePosition = this.alignmentLineProvider.calculateAlignmentLinePosition(placeable);
            if (iCalculateAlignmentLinePosition == Integer.MIN_VALUE) {
                return 0;
            }
            int i4 = i3 - iCalculateAlignmentLinePosition;
            return layoutDirection == LayoutDirection.Rtl ? i2 - i4 : i4;
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0007\":\u0018\u007f\u0007ljA0ZeP\u008cZS@\u000fs{:'c$\u007fLC٥\"}0ޛWNmgvJh\u0017KƤ\fǠ~\u0001ߚyU'\\R\u001aBF}?KM\u001e>˃dtD\u0007h]0=\u0012\u0005/ ZL\u001e}\u0013Cy\u0012B4NxRR;V5\u001e \u0010V /)\rk\\B`l\f@u1ɨmBT4(7\u000b[%F\u0003(Sȿbf<NFM\u0015Sم3\rX[M\u0003Wqk\u0006/Ү&sZ\u0002gNX.%E1]\u001fut<[3d'ц(sVq_h\u000eV}A՟\f\u0005\u000b\u001c\u001b?H\\C`Ȩ\u0007^B\u0003rk@~\u0003ެF\u0006\u0003ʨN\u0019+\u0003A/ݶ\u001f}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u0006=N9kVp9\u001bog\u0018\\9h\u0018]O\u007fuH9(\u0010,R\u0011\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u001d", "DdaA\\*:Z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJr\u001eKq\u0017Dv.D\u0018n D|\u001a,IJ\u0011/%", "5dc#X9MW\u0017z\u0002", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>h<\u00117z%2K?BA", "/kX4a", "", "Ahi2", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ">kP0X(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "0dU<e,\u001c`#\r\t:?\u0001\u0017\u000bl\u0004*\u0005H\u0001 &.s\u0017<", "/kX4aj?])\byZ;\u0001\u00138_\u0007$\u0010J\u0011&\u0011To\u0015<r35", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "BnBAe0GU", "", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class VerticalCrossAxisAlignment extends CrossAxisAlignment {
        private final Alignment.Vertical vertical;

        public static /* synthetic */ VerticalCrossAxisAlignment copy$default(VerticalCrossAxisAlignment verticalCrossAxisAlignment, Alignment.Vertical vertical, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                vertical = verticalCrossAxisAlignment.vertical;
            }
            return verticalCrossAxisAlignment.copy(vertical);
        }

        public final Alignment.Vertical component1() {
            return this.vertical;
        }

        public final VerticalCrossAxisAlignment copy(Alignment.Vertical vertical) {
            return new VerticalCrossAxisAlignment(vertical);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalCrossAxisAlignment) && Intrinsics.areEqual(this.vertical, ((VerticalCrossAxisAlignment) obj).vertical);
        }

        public int hashCode() {
            return this.vertical.hashCode();
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.vertical + ')';
        }

        public final Alignment.Vertical getVertical() {
            return this.vertical;
        }

        public VerticalCrossAxisAlignment(Alignment.Vertical vertical) {
            super(null);
            this.vertical = vertical;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            return this.vertical.align(0, i2);
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0007\":\u0018\u007f\u0007ljA0ZeP\u008cZS@\u000fs{:'c$\u007fLC٥\"}0ޛWNmgvJh\u0017KƤ\fǠ~\u0001ߚyU'\\R\u001aBF}?KM\u001e>˃dtD\u0007h]0=\u0012\u0005/ ZL\u001e}\u0013Cy\u0012B4NxRR;V5\u001e \u0010V /)\rk\\B`l\f@u1ɨmBT4(7\u000b[%F\u0003(Sȿbf<NFM\u0015Sم3\rX[M\u0003Wqk\u0006/Ү&sZ\u0002gNX.%E1]\u001fut<[3d'ц(sVq_h\u000eV}A՟\f\u0005\u000b\u001c\u001b?H\\C`Ȩ\u0007^B\u0003rk@~\u0003ެF\u0006\u0003ʨN\u0019+\u0003A/ݶ\u001f}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u0006/X9`g|F#\u000eak[5\u001b\u00135T(| >#\n5Q\u0002DwV", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u001d", "6na6m6Gb\u0015\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJr\u001eKq\u0017Dv.D\u0018`*Dq+8VR7r\na\u0006", "5dc\u0015b9Bh#\b\nZ3", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>h<\u0003Az\u001aCWLJg;s", "/kX4a", "", "Ahi2", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ">kP0X(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "0dU<e,\u001c`#\r\t:?\u0001\u0017\u000bl\u0004*\u0005H\u0001 &.s\u0017<", "/kX4aj?])\byZ;\u0001\u00138_\u0007$\u0010J\u0011&\u0011To\u0015<r35", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "BnBAe0GU", "", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class HorizontalCrossAxisAlignment extends CrossAxisAlignment {
        private final Alignment.Horizontal horizontal;

        public static /* synthetic */ HorizontalCrossAxisAlignment copy$default(HorizontalCrossAxisAlignment horizontalCrossAxisAlignment, Alignment.Horizontal horizontal, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                horizontal = horizontalCrossAxisAlignment.horizontal;
            }
            return horizontalCrossAxisAlignment.copy(horizontal);
        }

        public final Alignment.Horizontal component1() {
            return this.horizontal;
        }

        public final HorizontalCrossAxisAlignment copy(Alignment.Horizontal horizontal) {
            return new HorizontalCrossAxisAlignment(horizontal);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalCrossAxisAlignment) && Intrinsics.areEqual(this.horizontal, ((HorizontalCrossAxisAlignment) obj).horizontal);
        }

        public int hashCode() {
            return this.horizontal.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.horizontal + ')';
        }

        public final Alignment.Horizontal getHorizontal() {
            return this.horizontal;
        }

        public HorizontalCrossAxisAlignment(Alignment.Horizontal horizontal) {
            super(null);
            this.horizontal = horizontal;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            return this.horizontal.align(0, i2, layoutDirection);
        }
    }
}
