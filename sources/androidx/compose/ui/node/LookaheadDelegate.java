package androidx.compose.ui.node;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: LookaheadDelegate.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĳ\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*,\u0018w\u000ff\u000198DkJ6Ri*\u0017k\u00025,[2\u0015K;k\u001a\u0006\"\u0017UVgmrRZ!C\u0017\u0006\u001cyr,_U\u0001]\u0018\u0012:B}D;Mu@A`\u0003?\r 8$@y\u001b\u0001\"*N\u0011~zYK\u0014\u00126Ax:h\rU\u0005 \u0019\u000e>.ҵ&\\mO>H\u0003]B/)\u0006qBd'g0\u0003V\u0015Fj'\u0015Ǹi\u001eA@?5\u001b&[\u0003\u0015Rc?\t?y=\u001bh/'AI{WLX\b\u0014\u001b8U+söV\\3P\u0011\fU+\u0010n[T\u001c)\u0010z*\u000fʀ\b\u000e\u0014*\u0011A;d~\b<C%va\fh\u0002\rQFЭˋ:\u0017+L{9Gh~Q\u0010KIREJ\u001d\rL3G\u0003iib]x\u0015Id(U?\"X=v^Pm\u0006{\u0012Bz\u0002X\u0014`K\u000e}\u0014\u0011\\'kK$G1s\u0004\u0002vT\u0018z\u00131\u0001S\u0018b\u000fTj\u0016$\u000bB\t:/th\u0013\u0002hT\u0007CAW**\u001f\u0004\u0018\u00150\\&AO{VʡUǏhҔܷa\f+\u0007t\u0010\"*ygo9\r\u000eeUqQyR%Vo@p`pfpt<qj\u0005:EXl w*#^\u000e#2mL23Z\u000fǬ`\u0015NbdD̿{ȁރ^j\u0016_b\u0015l\tw\u0007\r\t/+#\u00038\u007f\u0007-D|\u000f|]E_v1&\u0004d/4ţ\"Ȕҋw\u0002MLZ\r\u0015\u0005$[m{NpJ=_pU\u0013=AoɅƁ,զʆvgW4 lC \bvSh\\*8n~\u0015xjx֢\u0005\u001b0`vrQ/+рّ`EܢFϊӝ\u000f]D4\u0001n\"G\\%\u0015\u0005Mxk\u000fȞ&|;\u001b\u0014G+\u001c\u0010\u0016E\u0014\u0010b\u001au<}z\u0011<s\u0014\tj$l˴nжa8Cͯi[\u0005E0,=\u0015PQ\u0003w6L?\tcΠJыhtn:S\u0016=\n7%:\u001a\tbk<#o,C>a:sq\u000eBl\u001aў\u0013ߠWmuޮc^\u0011[\u001d\u001c[\u0010?\u0002*\u001eS\u001f\u0005W\u0019]\u0007ӆu͛:ESd\u000bP\u00179\u0005DJ\u001e#C\u0003\u0001<NQĕHޣ\u000eğѡArŌZ\u0012lzbnV\u001e1Wn;B\u0001-*irO\u008c3ܭqJl1iN\u000fpm\u0018)kg~\u0015'ŠHZAЉ@Z\u0007)S|\u0014[\u0010V\u001cGW\u000f\"Db՛\u001aԠ!F0\u001d?s\u001f\u0003GBl/md|\u0006-f=űPĀ-\u0003\u0013~\u0014a\u00182[+]\u0019\bb[s\u0005L\u000eƨ\u001cݨ\u001bHA\t\u0012%qok?\u0014_E=w\u0012J{R\u0090Uȯ\u0002\f8\"-.\u0003J-i\u001c\u0012\"]IfLFlȟ\u0004Ƥ\u0017T8\u00064w\u0003!Z@\u0016eg\u0002a2I30Ŭy̝D+Cn\fsY\u001bI\u0019q {n\u0004?өj7^ҳ\u0007/VR\u0017]\u001e@!\u0010r:?XV'gָ\u0016ޞ*#N\nha\u001e\t4\u0003~&gi\u001d-?kXpA2b\u001e,/\u0010t28+Ӓ!ͪZMFĹYpz}o\u0010tiVd+`\u007fل~۫Lb)\u0015:\u0003\u000135CEV7]#F\u000fE:\u001a ¥#ܳVC398J}hG1\u0011{zt.l\u0019֓~оfƨØESٗ\u001e5a${+\u001b(Q\tF[(.\u0017R\u001ft+P.\u0006t\u001aJ\u0004\bq\u0018˓\u0013ݭ\u0014Ɖ݆n\u0006ص9niU+s\u000f\u0016Ә\rH\u00024qÁ\u0010eq+/\u0015\u000f\u008e[U"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9tF\u0001+1\\}\u001c6L\u00165ME7z4s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9tF\u0001+1\\}\u001c6K\u00129I@Bk\u001f%\u0011fa5\u0004j,$", "1n^?W0GO(\t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW%\u0001$57\b*Dl\u001a7IREx\na\u0006", "@dbB_;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "-lT.f<KS\u0006~\tn3\f", "Adc,`,:a)\fzK,\u000b\u00196t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0003.[SBz\na\u0006", "/kX4a4>\\(e~g,\u000brAn\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9iCz'>a})FT\u001a7MQ%}=\u001e\">", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/si:\u0005@\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006R,9[\u0007(7v%\u0015QL;y\u001e0\u001ehn\u000f", "1`R5X+\u001aZ\u001d\u0001\u0004f,\u0006\u0018\u0016i\t(\n(|\"", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "", "5dc\u0010T*AS\u0018Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001%~Cz", "u(;7T=:\u001d)\u000e~eud\u0005:;", "1gX9W", "5dc\u0010[0ER", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]/?_y#7i\u0015\fIN7h;\u001e\u007fo]7\u0007_)Uv|", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "5dc\u0010b5Lb&z~g;\u000bP7s_\rw\u001f\u0007U'Ki\u001b<}%1g}", "u(9", "1n^?W0GO(~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "5dc\u0010b6KR\u001d\bvm,\u000b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", "5dc\u0010b6KR\u001d\bvm6\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006_/4Y[*Az\u00152V?JuAs", "2d]@\\;R", "", "5dc\u0011X5LW(\u0013", "u(5", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", "6`b\u001aX(Lc&~g^:\r\u0010>", "", "5dc\u0015T:&S\u0015\r\u000bk,i\t=u\u00077", "u(I", "7r;<b2B\\\u001bZ}^({", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", ":`h<h;']\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "5dc\u0019T@Hc(g\u0005],", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.#", ":n^8T/>O\u0018evr6\r\u0018\ro\n5zD\n\u0013&G}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]/?_y#7i\u0015\u0015IWE{C{\u001frn8\u000bl(]v5\u001d", "5dc\u0019b6DO\u001c~v]\u0013x\u001d9u\u000f\u0006\u0006J\u000e\u0016\u001bPk\u001d<\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cc\b&3p\u0016*L*7\u007f>.$FkC\u0014b0Wr6GZ$", ";dP@h9>@\u0019\r\u000be;", "5dc\u001aX(Lc&~g^:\r\u0010>$\u0010,uM\u0001\u001e\u0017C}\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001dYy.Gz\u0016\u001bMQKrCs", "=kS\u000e_0@\\!~\u0004m\u0013\u0001\u0012/s", ">`a2a;", "5dc\u001dT9>\\(", ">`a2a;\u001dO(z", "", "5dc\u001dT9>\\(]vm(", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "5dc\u001db:Bb\u001d\t\u0004&5f\u0007--{&", "Adc\u001db:Bb\u001d\t\u0004&s~\u001dCY\\6", "uI\u0018#", "\u0018", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc \\A>\u001b\r{\u000ff\u0013I\u000bmu\u0004\"\t@\b\u0017\u0013Uo", "5dc\u0010T*AS\u0018Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001", "/kX4a4>\\(e~g,", "5dc\u0010T*AS\u0018Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001U'Ki\u001b<}%1g}", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", ">da3b9FW\"\u0001b^(\u000b\u0019<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ">da3b9FW\"\u0001b^(\u000b\u0019<eG\u000eJ\u000baj*#", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuzT\u00127LPEo31^fkA\u0012m:N@7K\u0016U(p\\\u0003L]|a\nL+\t\u0002`Ay", ">kP0X\bM", "", "HH]1X?", ":`h2e\tE]\u0017\u0005", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ">kP0X\bM\u001b\u001aQ\u000eO\u000e\u0006\u0013", "uI5\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1\u0007", ">kP0X\nAW }\b^5", ">kP0X\u001a>Z\u001a", ">kP0X\u001a>Z\u001aFB`@\u0011|\fs", ">kP0X\u001a>Z\u001aZ\u0006i(\n\t8tn2h@|\u001e\u0001Hp\u001c<\u0006", ">kP0X\u001a>Z\u001aZ\u0006i(\n\t8tn2h@|\u001e\u0001Hp\u001c<\u0006l|[\u00124+J$l]G5x4%\u0015do9", ">nb6g0H\\|\b", "/mR2f;H`", "3wR9h+B\\\u001bZ|g6\u000b\u00183ci)|N\u0001&", ">nb6g0H\\|\bBb\u001ay\u0014\u0016lsf\fDz$\u0017No\nJv", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#\u0001/;U\u0001 3lt.TC=gC\u001ej]%\u001e", "@d_9T*>", "@d_9T*>\u0012)\u0003tk,\u0004\t+s\u007f", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    public static final int $stable = 0;
    private MeasureResult _measureResult;
    private final NodeCoordinator coordinator;
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position = IntOffset.Companion.m6776getZeronOccac();
    private final LookaheadLayoutCoordinates lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this);
    private final Map<AlignmentLine, Integer> cachedAlignmentLinesMap = new LinkedHashMap();

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return true;
    }

    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    public LookaheadDelegate(NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        return wrapped$ui_release != null ? wrapped$ui_release.getLookaheadDelegate() : null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: getPosition-nOcc-ac */
    public long mo5692getPositionnOccac() {
        return this.position;
    }

    /* JADX INFO: renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m5700setPositiongyyYBs(long j2) {
        this.position = j2;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        NodeCoordinator wrappedBy$ui_release = this.coordinator.getWrappedBy$ui_release();
        return wrappedBy$ui_release != null ? wrappedBy$ui_release.getLookaheadDelegate() : null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g$ui_release, reason: not valid java name */
    public final long m5696getSizeYbymL2g$ui_release() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m5695getConstraintsmsEJaDk$ui_release() {
        return m5574getMeasurementConstraintsmsEJaDk();
    }

    public final LookaheadLayoutCoordinates getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = this.coordinator.getLayoutNode().getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        Intrinsics.checkNotNull(lookaheadAlignmentLinesOwner$ui_release);
        return lookaheadAlignmentLinesOwner$ui_release;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_measureResult(MeasureResult measureResult) {
        Unit unit;
        Map<AlignmentLine, Integer> map;
        if (measureResult == null) {
            unit = null;
        } else {
            m5576setMeasuredSizeozmzZPI(IntSizeKt.IntSize(measureResult.getWidth(), measureResult.getHeight()));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            m5576setMeasuredSizeozmzZPI(IntSize.Companion.m6813getZeroYbymL2g());
        }
        if (!Intrinsics.areEqual(this._measureResult, measureResult) && measureResult != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || !measureResult.getAlignmentLines().isEmpty()) && !Intrinsics.areEqual(measureResult.getAlignmentLines(), this.oldAlignmentLines))) {
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            LinkedHashMap linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(measureResult.getAlignmentLines());
        }
        this._measureResult = measureResult;
    }

    protected final Map<AlignmentLine, Integer> getCachedAlignmentLinesMap() {
        return this.cachedAlignmentLinesMap;
    }

    public final int getCachedAlignmentLine$ui_release(AlignmentLine alignmentLine) {
        Integer num = this.cachedAlignmentLinesMap.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo5515placeAtf8xVGno(mo5692getPositionnOccac(), 0.0f, (Function1<? super GraphicsLayerScope, Unit>) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public final void mo5515placeAtf8xVGno(long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
        m5694placeSelfgyyYBs(j2);
        if (isShallowPlacing$ui_release()) {
            return;
        }
        placeChildren();
    }

    /* JADX INFO: renamed from: placeSelf--gyyYBs, reason: not valid java name */
    private final void m5694placeSelfgyyYBs(long j2) {
        if (!IntOffset.m6765equalsimpl0(mo5692getPositionnOccac(), j2)) {
            m5700setPositiongyyYBs(j2);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
            }
            invalidateAlignmentLinesFromPositionChange(this.coordinator);
        }
        if (isPlacingForAlignment$ui_release()) {
            return;
        }
        captureRulers$ui_release(getMeasureResult$ui_release());
    }

    /* JADX INFO: renamed from: placeSelfApparentToRealOffset--gyyYBs$ui_release, reason: not valid java name */
    public final void m5698placeSelfApparentToRealOffsetgyyYBs$ui_release(long j2) {
        m5694placeSelfgyyYBs(IntOffset.m6770plusqkQi6aY(j2, m5572getApparentToRealOffsetnOccac()));
    }

    protected void placeChildren() {
        getMeasureResult$ui_release().placeChildren();
    }

    /* JADX INFO: renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m5697performingMeasureK40F9xA(long j2, Function0<? extends MeasureResult> function0) {
        m5577setMeasurementConstraintsBRTryo0(j2);
        set_measureResult(function0.invoke());
        return this;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    public int minIntrinsicWidth(int i2) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        Intrinsics.checkNotNull(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicWidth(i2);
    }

    public int maxIntrinsicWidth(int i2) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        Intrinsics.checkNotNull(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicWidth(i2);
    }

    public int minIntrinsicHeight(int i2) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        Intrinsics.checkNotNull(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicHeight(i2);
    }

    public int maxIntrinsicHeight(int i2) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        Intrinsics.checkNotNull(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicHeight(i2);
    }

    /* JADX INFO: renamed from: positionIn-iSbpLlY$ui_release, reason: not valid java name */
    public final long m5699positionIniSbpLlY$ui_release(LookaheadDelegate lookaheadDelegate, boolean z2) {
        long jM6776getZeronOccac = IntOffset.Companion.m6776getZeronOccac();
        LookaheadDelegate lookaheadDelegate2 = this;
        while (!Intrinsics.areEqual(lookaheadDelegate2, lookaheadDelegate)) {
            if (!lookaheadDelegate2.isPlacedUnderMotionFrameOfReference() || !z2) {
                jM6776getZeronOccac = IntOffset.m6770plusqkQi6aY(jM6776getZeronOccac, lookaheadDelegate2.mo5692getPositionnOccac());
            }
            NodeCoordinator wrappedBy$ui_release = lookaheadDelegate2.coordinator.getWrappedBy$ui_release();
            Intrinsics.checkNotNull(wrappedBy$ui_release);
            lookaheadDelegate2 = wrappedBy$ui_release.getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate2);
        }
        return jM6776getZeronOccac;
    }
}
