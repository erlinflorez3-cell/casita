package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.Global;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: compiled from: NodeChain.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĉ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013.H~*, }\u000ffp:8D{H6Ri*\u0017ӆ\u00044:[,qI;]\u001a\u0014\"\u0011OTion`Z\u0013C\u0015\u0007\u001exx5QU~_\u001a\u000fHBw?IMw=?m|6\u001b :Ĳ@y\u001b\u0001\"*N\u0016~zQi\u0014\u0012F@x:X\u0013U\u0005(\u0012\u000e>&\u001b&\\uZ>Hr_B/9\u0003qBT.eܞ\u0013ձ=F\u0003&EvM\u000bkKG9#%k\u00035SÜC\u0003Ms\u0006\u001bvJ?+w\u0002\b:f$,\u0015YX=a\u0001Kt\u0005\u007fnR'seqqh\u000eV\u0006+\u007f\u001b`\u001c\u000e40x2;A~\b<A;r\u001cN^*vB.\t\u0012:%N\u00183YGaf\u001a\u001fICf9\u0012\u0004SIC\u0005tďi\u007f$_E%b$i7aBMH\u00155\bj\u001e\u0014~\u0011\u001a6\u00142W\u007fu'!0'%ergRgǾ\bӿCϙЛ\tbn\u0004w\u0004\u0011~0!.;X\u0014\\Zrߟ5o^cp,?[LX\u00151 \u0013N`(F/Y(T_jyj{f8-_pE\u000f\u0007q\u001eYI^a>\u007fk@e`-,?jyKX/LaCrb8$BH\u0019I&4\rj\u001aMJ? 3d4?Et\u0019X\u0003$Co*Oݠ̬gɭњX5*>w`=\u001c\u000f\u000btp\u001e~)M::x\"[E\u0018ځԊ*U('|&1\u0016\u0017u\u0016F.wgPrֵ\u0004\u0001\u0012\u001fF$G}GC#\u0011\u000f)x-[r\u0013ǪḵLȼؠ~~\u007fNI)v\b\u0016,\t,\u000f-z_bE:\u0003nt3\b\u0013\u000e\ncVzu&\u0003:\"ŭO\u03a2\u0007YB\u0012\u00018\u0013`6%/2B\u0001;ԆQR3\u0015(\u001e=Aycyq>y):T\"\u0016\u0014:\u0012.{rSm2\u0002cY[\u000f>Pf\u001b2\tזpΤ\u0007ȷީ8\u000f9\rO*9~F\u000f#/,)70\u001b.n[h\u0017 \u000eB\\w6\u0004E\u000e\u0014\rQ5\u0013]S\u00160\u001cz#֦P؝\u000e\u000b\u0002t72*\u00048V\u0006%9@\u0014\"0BQ=r\u0005j\u001746<<6Mq\u00040г\u0016Ģ\u0004FeV_HP<SV<b)`dq\u001d`snQ.\u000f$'3L\u0007{1M\u0004T\u001eGc`\u000f\u0004!\u0017D\u0003O-tU/R{Q\u001bVfG\u000b\u000eaQ\u0014\u001a62\nqxy;$8F?c\u00adɓ\u001f9W](|>,#U\u0013\\+vZ|`\u001d:)-=-\u0012JY'\u000bG]#sp}dN&T\n\u001aI%Rz\u001f\f+qv\u001f;/M-kW1\u0014o\u0007e&S}6bfٴؗx!b+Vj\u001823:D4^m\u0010^+PNFt\u05fdƶv\n4^~\n\u0010\u000b\u001a\u0013\r\u001c\u001c{/s?+\u001b\nrUv-\"i|e~U9\f\u00159\u0007\u0004|bh#\u0019)].Aa\tBAW.y)\u007fB#V#D>z)>f*h9q]4%+].pay4`w\u0016\u001f(8LSbI-=lL\u0005\u0010)`r܀e9tiXn\u00038A\u001a\r\u0001X^W>bs9ھjծ6؟۵_\u000fM;\u0015D\u000ei4|IRm]gB\u0019\u001e@\u0003!\u0005Jb#\u000e:D\u0019r.*Z\\\r¨CՆ+Y*J->4']8pJL\u0015\u0014ı=\u0006N\u001fnf(HSWCC)\u0011G@f3 \u0017'c\u0003]c':\u0001C,\u001dA\n1\u001a|\"f9܍5ߢnߦ˓j=+\u0013s\u0012o4\u0010Ab~{&\u0007\u0013oia5s\"*eN.\"+4&\u0016uQ\u000eU3X*\u000e\u001fn\u0006:ӓ\nڲ.6t!kMzW\f\nZI^\b-io\u0015YzB'tB8\u000f\u0005\u0007s[/ySW\u001b(,7=HY7%`(O %qߐ\u05ffQ/bC\u00051\u0002jR2\u0010x*KNAB\u0006[\u001b\u0005gxS\u0006Q\u000e\u0019h\u0016\u001b6\u001cw_`'\u007f)2&\u0011cvtx\r~[\\z\rV\u000eRzt˷ՠ\u000f\u0006\u001c\u0019\u0019)\u0010\u0001b`C\u0017i\bJݠI̫Z\u007f9\u001f\u0017`3\fu{xNW]\u0002ZM9a\u0014\u0004I\u0007=<ڧ\u0011Ȝ%KlƓe\u0012x5FMl=H5)\u0006<Ȋ;Э\u001cͭ|D0Ғ\u0001D>\\\u0017bS_\u0011\u001cMFk\u0014\u0014\u0007\tĒCׄh\u00113ŋ(\u000b`d;-'\u00103\u0014O&+\u000bLawryђ\u0019жB\u0002\u0010֟aW\u0003}W!SsX3G\u0006mB\u0018ٜnʂiE!ًW\u0001\u0012459V%2x\u007f\u0013\u0018%X YԘ8̨-Lc[\u0017|P\u0003_\n\u0003\fF\ffVΤA\f\u0019ߊ47AxNF~~\u0017bgl\u0012)\u0014\f=ڑeǕI+}ռ\u000fM\u007f/{O\u000e1\u001fUjeV\u0017\u0006C~SX¨)Ęe\u0002P֢H\u0019[\u0003{\u000bDfn2q4\u001a>;ҶtڳhDkޗTJr;t`ʊ\u001bVLe\u000fɄ\rv@ſfZ"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013\\y$@C", "", ":`h<h;']\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u0004\u00114", "/fV?X.:b\u0019\\}b3{n3n~\u0016{O", "", "5dc\u000eZ.KS\u001bz\n^\n\u007f\r6de,\u0005?n\u0017&", "u(8", "0tU3X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u0015`}(7v%\u0004", "1`R5X+\u001dW\u001a\u007fzk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013\\y$@,t2ND;x\n", "1ta?X5M", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "6dP1", "5dc\u0015X(=\u0012)\u0003tk,\u0004\t+s\u007f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B\u0018f*6mk", "7m]2e\nH]&}~g(\f\u0013<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9qE\u007f%BB\b\u001f7K 8ZB?t0-\u001fu7", "5dc\u0016a5>`v\t\u0005k+\u0001\u0012+t\n5:P\u0005\u0011$Gv\u000e8\u0005%", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006Z.>Y\u000b\tAl\u0016\fWMHj8'\u0011wkF\\", "7rD=W(MW\"\u0001", "", "u(I", "5dc\u0019T@Hc(g\u0005],", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.#", ":nV4X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013\\y$@,|8OE;x\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", "=tc2e\nH]&}~g(\f\u0013<", "5dc\u001ch;>`v\t\u0005k+\u0001\u0012+t\n5:P\u0005\u0011$Gv\u000e8\u0005%", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006_/4Y[*Az\u00152V?JuAs", "B`X9", "5dc!T0E\u0012)\u0003tk,\u0004\t+s\u007f", "1qT.g,\u001a\\\u0018b\u0004l,\n\u0018\u0018o~(WN^\u001a\u001bNn", "3kT:X5M", ">`a2a;", "1qT.g,\u001a\\\u0018b\u0004l,\n\u0018\u0018o~(WNk\u0013$Gx\u001d", "1gX9W", "2dc.V/\u001a\\\u0018kzf6\u000e\t\u0018o~(", "<nS2", "4ha@g\rK]!azZ+", "\"", "Bx_2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001b]\u0007\u001f\r", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "4ha@g\rK]!azZ+D\u0005\u0016cax},?'\u001bA|\u000eCv!CY", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "5dc\u0011\\-?S&", "=eU@X;", "0dU<e,", "/ec2e", "Ag^B_+\u001ab(zxa\u0016\u0006l8s\u007f5\u000b", "5dc\u001ab+BT\u001d~\bB5}\u0013", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^/4]~$7zy7NM\u0011", "6`b", "6`by;\u007f\nd#\\^\u001d<\u0001\u0003<e\u0007(wN\u0001", "uH\u0018'", ";`b8", "6`bph08`\u0019\u0006zZ:|", "6dP1 \u000f\u0012\u001f*\tXBj\r\r)r\u007f/{<\u000f\u0017", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "6dP1G6-O\u001d\u0006", "", "6dP1G6-O\u001d\u00069n0v\u0016/l\u007f$\n@", "6dP1G6-O\u001d\u0006BZ\u0013zj\u007fgkf\fDz$\u0017No\nJv", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIuz^", "6dP1G6-O\u001d\u0006Zq*\u0004\u0019=i\u0011(", "6dP1G6-O\u001d\u0006Zq*\u0004\u0019=i\u0011(:P\u0005\u0011$Gv\u000e8\u0005%", "7mb2e;\u001cV\u001d\u0006y", "7mb2e;)O&~\u0004m", ";`a84:\u001ab(zxa,{", ";`a84:\u001dS(zxa,{", ";`a84:\u001dS(zxa,{G?iy5{G\u0001\u0013%G", ">`S\u0010[(B\\", ">q^=T.:b\u0019\\\u0005h9{\r8a\u000f2\t", "AsP?g", "1n^?W0GO(\t\b", "@d\\<i,']\u0018~", "@db2g\u001aMO(~", "@db2g\u001aMO(~9n0v\u0016/l\u007f$\n@", "@t]\u000eg;:Q\u001ce~_,z\u001d-l\u007f", "@t]\u0011X;:Q\u001ce~_,z\u001d-l\u007f", "@t]\u0011X;:Q\u001ce~_,z\u001d-l\u007ff\fDz$\u0017No\nJv", "AsaBV;N`\u0015\u0006ji+x\u0018/", "Ax]04.@`\u0019\u0001vm,Z\f3l~\u000e\u007fI\u007f\u0005\u0017V", "Ax]066H`\u0018\u0003\u0004Z;\u0007\u0016=", "B`X9 \u000f\u0012\u001f*\tXBj\r\r)r\u007f/{<\u000f\u0017", "B`X9G6!S\u0015}", "B`X9G6!S\u0015}9n0v\u0016/l\u007f$\n@", "B`X9G6!S\u0015}BZ\u0013zj\u007fgkf\fDz$\u0017No\nJv", "BnBAe0GU", "", "BqX:6/:W\"", ">`S1X+!S\u0015}", "CoS.g,\u001f`#\u0007", Global.SEMICOLON, "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "CoS.g,\u001f`#\u00079n0v\u0016/l\u007f$\n@", "CoS.g,']\u0018~", ">qTC", "<dgA", "CrT\u0019b.@S&", "CrT\u0019b.@S&=\u000bb&\n\t6e{6{", "\u0012hU3X9", "\u001anV4X9", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class NodeChain {
    public static final int $stable = 8;
    private MutableVector<Modifier.Element> buffer;
    private Differ cachedDiffer;
    private MutableVector<Modifier.Element> current;
    private Modifier.Node head;
    private final InnerNodeCoordinator innerCoordinator;
    private final LayoutNode layoutNode;
    private Logger logger;
    private NodeCoordinator outerCoordinator;
    private final Modifier.Node tail;

    /* JADX INFO: compiled from: NodeChain.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\r(4ߚ\u007f\u0007|jA0JeP.hS2\u000fq\u0005:\u0003qҕ\"CiTb$0\tgN\u0016h\u001fNh\r[\u000f4\u0019)n:Mmx\f\u0017?6PuW3{tm=n{N\u0005N:h\\B3\u000f#BH>w+GY\u0016*0nsjV\u001bX\u001d\u001a@\tn$\u000f*tg|;xpkGG#1qrR5mH|{\u0015\rxo+\u0005p6+n8e\u00193c\u001b\u0007\u0001^o\u0007M}U\u0005\u0017,W/Wzo6\u0007\bZ9s}\u001bn\u000b&\u000b\u0006\u0002d\u001a7CO\u0012N\u0001\u00126\u0003\u0013{;?4\u0012\u0014+`.[\u001f\u0017\f\u001c9\rr\u0002E\u0001\u0006lI\u0018z\u0010>]IHa9K3f\u007fbk\u001d\\G\u0014\u0005;!S\u0005|,sT<cE\u001fb{i1\u007fEmL\\\u0010q=\u001c\t!f\u00101\u001c0u\bu ö-Ϗ©7_A%'\u000b0Gלk\nޔdg"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013\\y$@,|8OE;x\n", "", ":h]2T9\u001dW\u001a\u007fV[6\n\u0018/d", "", "7mS2k", "", ">qTC", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u0015`}(7v%\u0004", "<dgA", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "<nS2<5LS&\u000ez]", "/s8;W,Q", "<df\u0016a+>f", "3kT:X5M", "1gX9W", "7mb2e;>R", "<nS2E,F]*~y", "=kS\u0016a+>f", "<nS2E,Na\u0019}", "<nS2H7=O(~y", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Logger {
        void linearDiffAborted(int i2, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void nodeInserted(int i2, int i3, Modifier.Element element, Modifier.Node node, Modifier.Node node2);

        void nodeRemoved(int i2, Modifier.Element element, Modifier.Node node);

        void nodeReused(int i2, int i3, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void nodeUpdated(int i2, int i3, Modifier.Element element, Modifier.Element element2, Modifier.Node node);
    }

    public NodeChain(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        TailModifierNode tail = innerNodeCoordinator.getTail();
        this.tail = tail;
        this.head = tail;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final InnerNodeCoordinator getInnerCoordinator$ui_release() {
        return this.innerCoordinator;
    }

    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.outerCoordinator;
    }

    public final Modifier.Node getTail$ui_release() {
        return this.tail;
    }

    public final Modifier.Node getHead$ui_release() {
        return this.head;
    }

    private final boolean isUpdating() {
        return this.head == NodeChainKt.SentinelHead;
    }

    public final int getAggregateChildKindSet() {
        return this.head.getAggregateChildKindSet$ui_release();
    }

    public final void useLogger$ui_release(Logger logger) {
        this.logger = logger;
    }

    private final Modifier.Node padChain() {
        if (!(this.head != NodeChainKt.SentinelHead)) {
            InlineClassHelperKt.throwIllegalStateException("padChain called on already padded chain");
        }
        Modifier.Node node = this.head;
        node.setParent$ui_release(NodeChainKt.SentinelHead);
        NodeChainKt.SentinelHead.setChild$ui_release(node);
        return NodeChainKt.SentinelHead;
    }

    private final Modifier.Node trimChain(Modifier.Node node) {
        if (!(node == NodeChainKt.SentinelHead)) {
            InlineClassHelperKt.throwIllegalStateException("trimChain called on already trimmed chain");
        }
        Modifier.Node child$ui_release = NodeChainKt.SentinelHead.getChild$ui_release();
        if (child$ui_release == null) {
            child$ui_release = this.tail;
        }
        child$ui_release.setParent$ui_release(null);
        NodeChainKt.SentinelHead.setChild$ui_release(null);
        NodeChainKt.SentinelHead.setAggregateChildKindSet$ui_release(-1);
        NodeChainKt.SentinelHead.updateCoordinator$ui_release(null);
        if (!(child$ui_release != NodeChainKt.SentinelHead)) {
            InlineClassHelperKt.throwIllegalStateException("trimChain did not update the head");
        }
        return child$ui_release;
    }

    public final void updateFrom$ui_release(Modifier modifier) {
        Logger logger;
        Modifier.Node nodePadChain = padChain();
        MutableVector<Modifier.Element> mutableVector = this.current;
        int i2 = 0;
        int size = mutableVector != null ? mutableVector.getSize() : 0;
        MutableVector<Modifier.Element> mutableVector2 = this.buffer;
        if (mutableVector2 == null) {
            mutableVector2 = new MutableVector<>(new Modifier.Element[16], 0);
        }
        MutableVector<Modifier.Element> mutableVectorFillVector = NodeChainKt.fillVector(modifier, mutableVector2);
        MutableVector<Modifier.Element> mutableVector3 = null;
        if (mutableVectorFillVector.getSize() == size) {
            Modifier.Node child$ui_release = nodePadChain.getChild$ui_release();
            int i3 = 0;
            while (true) {
                if (child$ui_release == null || i3 >= size) {
                    break;
                }
                if (mutableVector == null) {
                    InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("expected prior modifier list to be non-empty");
                    throw new KotlinNothingValueException();
                }
                Modifier.Element element = mutableVector.getContent()[i3];
                Modifier.Element element2 = mutableVectorFillVector.getContent()[i3];
                int iActionForModifiers = NodeChainKt.actionForModifiers(element, element2);
                if (iActionForModifiers == 0) {
                    Logger logger2 = this.logger;
                    if (logger2 != null) {
                        logger2.linearDiffAborted(i3, element, element2, child$ui_release);
                    }
                    child$ui_release = child$ui_release.getParent$ui_release();
                } else {
                    if (iActionForModifiers == 1) {
                        updateNode(element, element2, child$ui_release);
                        Logger logger3 = this.logger;
                        if (logger3 != null) {
                            logger3.nodeUpdated(i3, i3, element, element2, child$ui_release);
                        }
                    } else if (iActionForModifiers == 2 && (logger = this.logger) != null) {
                        logger.nodeReused(i3, i3, element, element2, child$ui_release);
                    }
                    child$ui_release = child$ui_release.getChild$ui_release();
                    i3++;
                }
            }
            if (i3 < size) {
                if (mutableVector == null) {
                    InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("expected prior modifier list to be non-empty");
                    throw new KotlinNothingValueException();
                }
                if (child$ui_release != null) {
                    structuralUpdate(i3, mutableVector, mutableVectorFillVector, child$ui_release, !this.layoutNode.getApplyingModifierOnAttach$ui_release());
                    i2 = 1;
                } else {
                    InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("structuralUpdate requires a non-null tail");
                    throw new KotlinNothingValueException();
                }
            }
        } else {
            if (this.layoutNode.getApplyingModifierOnAttach$ui_release() && size == 0) {
                Modifier.Node node = nodePadChain;
                while (i2 < mutableVectorFillVector.getSize()) {
                    Modifier.Element element3 = mutableVectorFillVector.getContent()[i2];
                    Modifier.Node nodeCreateAndInsertNodeAsChild = createAndInsertNodeAsChild(element3, node);
                    Logger logger4 = this.logger;
                    if (logger4 != null) {
                        logger4.nodeInserted(0, i2, element3, node, nodeCreateAndInsertNodeAsChild);
                    }
                    i2++;
                    node = nodeCreateAndInsertNodeAsChild;
                }
                syncAggregateChildKindSet();
            } else if (mutableVectorFillVector.getSize() != 0) {
                if (mutableVector == null) {
                    mutableVector = new MutableVector<>(new Modifier.Element[16], 0);
                }
                structuralUpdate(0, mutableVector, mutableVectorFillVector, nodePadChain, !this.layoutNode.getApplyingModifierOnAttach$ui_release());
            } else if (mutableVector != null) {
                Modifier.Node child$ui_release2 = nodePadChain.getChild$ui_release();
                for (int i4 = 0; child$ui_release2 != null && i4 < mutableVector.getSize(); i4++) {
                    Logger logger5 = this.logger;
                    if (logger5 != null) {
                        logger5.nodeRemoved(i4, mutableVector.getContent()[i4], child$ui_release2);
                    }
                    child$ui_release2 = detachAndRemoveNode(child$ui_release2).getChild$ui_release();
                }
                InnerNodeCoordinator innerNodeCoordinator = this.innerCoordinator;
                LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
                innerNodeCoordinator.setWrappedBy$ui_release(parent$ui_release != null ? parent$ui_release.getInnerCoordinator$ui_release() : null);
                this.outerCoordinator = this.innerCoordinator;
            } else {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("expected prior modifier list to be non-empty");
                throw new KotlinNothingValueException();
            }
            i2 = 1;
        }
        this.current = mutableVectorFillVector;
        if (mutableVector != null) {
            mutableVector.clear();
            mutableVector3 = mutableVector;
        }
        this.buffer = mutableVector3;
        this.head = trimChain(nodePadChain);
        if (i2 != 0) {
            syncCoordinators();
        }
    }

    public final void syncCoordinators() {
        LayoutModifierNodeCoordinator layoutModifierNodeCoordinator;
        InnerNodeCoordinator innerNodeCoordinator = this.innerCoordinator;
        for (Modifier.Node parent$ui_release = this.tail.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            LayoutModifierNode layoutModifierNodeAsLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(parent$ui_release);
            if (layoutModifierNodeAsLayoutModifierNode != null) {
                if (parent$ui_release.getCoordinator$ui_release() != null) {
                    NodeCoordinator coordinator$ui_release = parent$ui_release.getCoordinator$ui_release();
                    Intrinsics.checkNotNull(coordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) coordinator$ui_release;
                    LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
                    layoutModifierNodeCoordinator.setLayoutModifierNode$ui_release(layoutModifierNodeAsLayoutModifierNode);
                    if (layoutModifierNode != parent$ui_release) {
                        layoutModifierNodeCoordinator.onLayoutModifierNodeChanged();
                    }
                } else {
                    layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(this.layoutNode, layoutModifierNodeAsLayoutModifierNode);
                    parent$ui_release.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                }
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator2 = layoutModifierNodeCoordinator;
                innerNodeCoordinator.setWrappedBy$ui_release(layoutModifierNodeCoordinator2);
                layoutModifierNodeCoordinator.setWrapped$ui_release(innerNodeCoordinator);
                innerNodeCoordinator = layoutModifierNodeCoordinator2;
            } else {
                parent$ui_release.updateCoordinator$ui_release(innerNodeCoordinator);
            }
        }
        LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
        innerNodeCoordinator.setWrappedBy$ui_release(parent$ui_release2 != null ? parent$ui_release2.getInnerCoordinator$ui_release() : null);
        this.outerCoordinator = innerNodeCoordinator;
    }

    private final void syncAggregateChildKindSet() {
        int i2 = 0;
        for (Modifier.Node parent$ui_release = this.tail.getParent$ui_release(); parent$ui_release != null && parent$ui_release != NodeChainKt.SentinelHead; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            int kindSet$ui_release = parent$ui_release.getKindSet$ui_release();
            i2 = (i2 + kindSet$ui_release) - (i2 & kindSet$ui_release);
            parent$ui_release.setAggregateChildKindSet$ui_release(i2);
        }
    }

    public final List<ModifierInfo> getModifierInfo() {
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector == null) {
            return CollectionsKt.emptyList();
        }
        int i2 = 0;
        MutableVector mutableVector2 = new MutableVector(new ModifierInfo[mutableVector.getSize()], 0);
        Modifier.Node head$ui_release = getHead$ui_release();
        while (head$ui_release != null && head$ui_release != getTail$ui_release()) {
            NodeCoordinator coordinator$ui_release = head$ui_release.getCoordinator$ui_release();
            if (coordinator$ui_release == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator".toString());
            }
            OwnedLayer layer = coordinator$ui_release.getLayer();
            OwnedLayer layer2 = this.innerCoordinator.getLayer();
            Modifier.Node child$ui_release = head$ui_release.getChild$ui_release();
            if (child$ui_release != this.tail || head$ui_release.getCoordinator$ui_release() == child$ui_release.getCoordinator$ui_release()) {
                layer2 = null;
            }
            if (layer == null) {
                layer = layer2;
            }
            mutableVector2.add(new ModifierInfo(mutableVector.getContent()[i2], coordinator$ui_release, layer));
            head$ui_release = head$ui_release.getChild$ui_release();
            i2++;
        }
        return mutableVector2.asMutableList();
    }

    private final Differ getDiffer(Modifier.Node node, int i2, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, boolean z2) {
        Differ differ = this.cachedDiffer;
        if (differ == null) {
            Differ differ2 = new Differ(node, i2, mutableVector, mutableVector2, z2);
            this.cachedDiffer = differ2;
            return differ2;
        }
        differ.setNode(node);
        differ.setOffset(i2);
        differ.setBefore(mutableVector);
        differ.setAfter(mutableVector2);
        differ.setShouldAttachOnInsert(z2);
        return differ;
    }

    public final void propagateCoordinator(Modifier.Node node, NodeCoordinator nodeCoordinator) {
        for (Modifier.Node parent$ui_release = node.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (parent$ui_release == NodeChainKt.SentinelHead) {
                LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
                nodeCoordinator.setWrappedBy$ui_release(parent$ui_release2 != null ? parent$ui_release2.getInnerCoordinator$ui_release() : null);
                this.outerCoordinator = nodeCoordinator;
                return;
            } else {
                int iM5749constructorimpl = NodeKind.m5749constructorimpl(2);
                int kindSet$ui_release = parent$ui_release.getKindSet$ui_release();
                if ((iM5749constructorimpl + kindSet$ui_release) - (iM5749constructorimpl | kindSet$ui_release) == 0) {
                    parent$ui_release.updateCoordinator$ui_release(nodeCoordinator);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: compiled from: NodeChain.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r(4ߚ\u007f\u0007|jA0ZeP.XS2\u000fy\u0005<$a9yCIU\"}(\u000bUȡi}ñzZ9BO=&|x,aU'^\"\u0013@D\b?aP\u007fGGd\r<\u0015\"B\"f\u007f3\u0006*4V\u0017\u000f\u0001SM\u001c\u0012^F\u001f?b\u0011[\r2\u00124Gŋ\u0005\u001ejq\u0017LV\nu:],3mPl?_^\u007f}\u0011Ts?\r%dd?\tEC5=S1(\u0003_M\"Wqk\b/;oAW\u0016o6\u0007!D\u00199r%]!)\r\t_~$'YR*_\u0019$6\u001c\u0013{;]4\u0012\u0014E`.[\u001d\u0017\f\u001cR\rr\u0002C\u0017\u0016/`\u000e\u0002y<''\u00103Y?Ik(ĬGϭRC\u0004˜% )\f|-{V\u0014m#)%\u0016_5iFMJ^\n\bC\u001c\tGî\u000eò\b<OĉG}\u0017=%1W]?3/yR`Rg\u000f\u0005\u000fi*֦^͕D.vݫO,\u000f\u001dhV\u0005\u0007qcbl|)[\u001el\u0007,\u000bi\u0605hʟ@--īfQn~xc}\f+FtO*\u0007y\u0016o9\r<\fȨoߧe^~ܝW>h\u001ef\u0001bU\u0012ujDϘ6m"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013\\y$@,t2ND;x\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l@w&\u0013U\u0005'4i\u00144#", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "=eU@X;", "", "0dU<e,", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u0015`}(7v%\u0004", "/ec2e", "Ag^B_+\u001ab(zxa\u0016\u0006l8s\u007f5\u000b", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW%\u0001$57\u0001\u001c;vk\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011\\RuD\\qA\u0015\u0016Z\u001b\r\u0014\u0017\u0004Y\u0017\bU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\fc P\t\u0019}ArfP`fyEPIl3.so,X7A$\u0005q\u0017*r]\u0004pw\\\u0010\u007f\\}fz\u0011\u0017\u0005@/H{[\u0010R\u007f^Kx/\u001f\u0015y\u0002\u00199Xr:x7\r}\u0012Fs\u0001Hn\u0018/^v$6i\u0017\u001ci'", "5dc\u000eY;>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006t/<`}\u001eFq 7\u0017+Kz0\u001b\u001chR9\u0005r6[L", "Adc\u000eY;>`", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW:\u0001,<Y{/;w\u001fw5SJg1%\u0015Ya7\u0016m9$:\u0018", "5dc\u000fX-H`\u0019", "Adc\u000fX-H`\u0019", "5dc\u001bb+>", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B\u0018f*6mk", "Adc\u001bb+>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2sB\b\u001f7CY\u001f", "5dc\u001cY-LS(", "u(8", "Adc\u001cY-LS(", "uH\u0018#", "5dc [6NZ\u0018Z\nm(z\f\u0019nc1\n@\u000e&", "u(I", "Adc [6NZ\u0018Z\nm(z\f\u0019nc1\n@\u000e&", "uY\u0018#", "/qT\u0016g,Fa\b\u0002zL(\u0005\t", "=kS\u0016a+>f", "<df\u0016a+>f", "7mb2e;", "", "@d\\<i,", "/s8;W,Q", "A`\\2", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class Differ implements DiffCallback {
        private MutableVector<Modifier.Element> after;
        private MutableVector<Modifier.Element> before;
        private Modifier.Node node;
        private int offset;
        private boolean shouldAttachOnInsert;

        public Differ(Modifier.Node node, int i2, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, boolean z2) {
            this.node = node;
            this.offset = i2;
            this.before = mutableVector;
            this.after = mutableVector2;
            this.shouldAttachOnInsert = z2;
        }

        public final Modifier.Node getNode() {
            return this.node;
        }

        public final void setNode(Modifier.Node node) {
            this.node = node;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final void setOffset(int i2) {
            this.offset = i2;
        }

        public final MutableVector<Modifier.Element> getBefore() {
            return this.before;
        }

        public final void setBefore(MutableVector<Modifier.Element> mutableVector) {
            this.before = mutableVector;
        }

        public final MutableVector<Modifier.Element> getAfter() {
            return this.after;
        }

        public final void setAfter(MutableVector<Modifier.Element> mutableVector) {
            this.after = mutableVector;
        }

        public final boolean getShouldAttachOnInsert() {
            return this.shouldAttachOnInsert;
        }

        public final void setShouldAttachOnInsert(boolean z2) {
            this.shouldAttachOnInsert = z2;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public boolean areItemsTheSame(int i2, int i3) {
            return NodeChainKt.actionForModifiers(this.before.getContent()[this.offset + i2], this.after.getContent()[this.offset + i3]) != 0;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void insert(int i2) {
            int i3 = this.offset + i2;
            Modifier.Node node = this.node;
            this.node = NodeChain.this.createAndInsertNodeAsChild(this.after.getContent()[i3], node);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                logger.nodeInserted(i3, i3, this.after.getContent()[i3], node, this.node);
            }
            if (this.shouldAttachOnInsert) {
                Modifier.Node child$ui_release = this.node.getChild$ui_release();
                Intrinsics.checkNotNull(child$ui_release);
                NodeCoordinator coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
                Intrinsics.checkNotNull(coordinator$ui_release);
                LayoutModifierNode layoutModifierNodeAsLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(this.node);
                if (layoutModifierNodeAsLayoutModifierNode != null) {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(NodeChain.this.getLayoutNode(), layoutModifierNodeAsLayoutModifierNode);
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator2 = layoutModifierNodeCoordinator;
                    this.node.updateCoordinator$ui_release(layoutModifierNodeCoordinator2);
                    NodeChain.this.propagateCoordinator(this.node, layoutModifierNodeCoordinator2);
                    layoutModifierNodeCoordinator.setWrappedBy$ui_release(coordinator$ui_release.getWrappedBy$ui_release());
                    layoutModifierNodeCoordinator.setWrapped$ui_release(coordinator$ui_release);
                    coordinator$ui_release.setWrappedBy$ui_release(layoutModifierNodeCoordinator2);
                } else {
                    this.node.updateCoordinator$ui_release(coordinator$ui_release);
                }
                this.node.markAsAttached$ui_release();
                this.node.runAttachLifecycle$ui_release();
                NodeKindKt.autoInvalidateInsertedNode(this.node);
                return;
            }
            this.node.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void remove(int i2, int i3) {
            Modifier.Node child$ui_release = this.node.getChild$ui_release();
            Intrinsics.checkNotNull(child$ui_release);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                MutableVector<Modifier.Element> mutableVector = this.before;
                logger.nodeRemoved(i3, mutableVector.getContent()[this.offset + i3], child$ui_release);
            }
            if ((-1) - (((-1) - NodeKind.m5749constructorimpl(2)) | ((-1) - child$ui_release.getKindSet$ui_release())) != 0) {
                NodeCoordinator coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
                Intrinsics.checkNotNull(coordinator$ui_release);
                NodeCoordinator wrappedBy$ui_release = coordinator$ui_release.getWrappedBy$ui_release();
                NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
                Intrinsics.checkNotNull(wrapped$ui_release);
                if (wrappedBy$ui_release != null) {
                    wrappedBy$ui_release.setWrapped$ui_release(wrapped$ui_release);
                }
                wrapped$ui_release.setWrappedBy$ui_release(wrappedBy$ui_release);
                NodeChain.this.propagateCoordinator(this.node, wrapped$ui_release);
            }
            this.node = NodeChain.this.detachAndRemoveNode(child$ui_release);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void same(int i2, int i3) {
            Modifier.Node child$ui_release = this.node.getChild$ui_release();
            Intrinsics.checkNotNull(child$ui_release);
            this.node = child$ui_release;
            MutableVector<Modifier.Element> mutableVector = this.before;
            Modifier.Element element = mutableVector.getContent()[this.offset + i2];
            MutableVector<Modifier.Element> mutableVector2 = this.after;
            Modifier.Element element2 = mutableVector2.getContent()[this.offset + i3];
            if (!Intrinsics.areEqual(element, element2)) {
                NodeChain.this.updateNode(element, element2, this.node);
                Logger logger = NodeChain.this.logger;
                if (logger != null) {
                    int i4 = this.offset;
                    logger.nodeUpdated(i4 + i2, i4 + i3, element, element2, this.node);
                    return;
                }
                return;
            }
            Logger logger2 = NodeChain.this.logger;
            if (logger2 != null) {
                int i5 = this.offset;
                logger2.nodeReused(i5 + i2, i5 + i3, element, element2, this.node);
            }
        }
    }

    private final void structuralUpdate(int i2, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, Modifier.Node node, boolean z2) {
        MyersDiffKt.executeDiff(mutableVector.getSize() - i2, mutableVector2.getSize() - i2, getDiffer(node, i2, mutableVector, mutableVector2, z2));
        syncAggregateChildKindSet();
    }

    public final Modifier.Node detachAndRemoveNode(Modifier.Node node) {
        if (node.isAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.runDetachLifecycle$ui_release();
            node.markAsDetached$ui_release();
        }
        return removeNode(node);
    }

    private final Modifier.Node removeNode(Modifier.Node node) {
        Modifier.Node child$ui_release = node.getChild$ui_release();
        Modifier.Node parent$ui_release = node.getParent$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(parent$ui_release);
            node.setChild$ui_release(null);
        }
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(child$ui_release);
            node.setParent$ui_release(null);
        }
        Intrinsics.checkNotNull(parent$ui_release);
        return parent$ui_release;
    }

    private final Modifier.Node createAndInsertNodeAsParent(Modifier.Element element, Modifier.Node node) {
        BackwardsCompatNode backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (backwardsCompatNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("createAndInsertNodeAsParent called on an attached node");
        }
        backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        return insertParent(backwardsCompatNode, node);
    }

    private final Modifier.Node insertParent(Modifier.Node node, Modifier.Node node2) {
        Modifier.Node parent$ui_release = node2.getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(node);
            node.setParent$ui_release(parent$ui_release);
        }
        node2.setParent$ui_release(node);
        node.setChild$ui_release(node2);
        return node;
    }

    public final Modifier.Node createAndInsertNodeAsChild(Modifier.Element element, Modifier.Node node) {
        BackwardsCompatNode backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (backwardsCompatNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        return insertChild(backwardsCompatNode, node);
    }

    private final Modifier.Node insertChild(Modifier.Node node, Modifier.Node node2) {
        Modifier.Node child$ui_release = node2.getChild$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(node);
            node.setChild$ui_release(child$ui_release);
        }
        node2.setChild$ui_release(node);
        node.setParent$ui_release(node2);
        return node;
    }

    public final void updateNode(Modifier.Element element, Modifier.Element element2, Modifier.Node node) {
        if ((element instanceof ModifierNodeElement) && (element2 instanceof ModifierNodeElement)) {
            NodeChainKt.updateUnsafe((ModifierNodeElement) element2, node);
            if (node.isAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
                return;
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        if (node instanceof BackwardsCompatNode) {
            ((BackwardsCompatNode) node).setElement(element2);
            if (node.isAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
                return;
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        throw new IllegalStateException("Unknown Modifier.Node type".toString());
    }

    public final void headToTail$ui_release(int i2, Function1<? super Modifier.Node, Unit> function1) {
        int aggregateChildKindSet = getAggregateChildKindSet();
        if ((aggregateChildKindSet + i2) - (aggregateChildKindSet | i2) == 0) {
            return;
        }
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            if ((head$ui_release.getKindSet$ui_release() & i2) != 0) {
                function1.invoke(head$ui_release);
            }
            if ((-1) - (((-1) - head$ui_release.getAggregateChildKindSet$ui_release()) | ((-1) - i2)) == 0) {
                return;
            }
        }
    }

    public final void headToTail$ui_release(Function1<? super Modifier.Node, Unit> function1) {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            function1.invoke(head$ui_release);
        }
    }

    public final void headToTailExclusive$ui_release(Function1<? super Modifier.Node, Unit> function1) {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null && head$ui_release != getTail$ui_release(); head$ui_release = head$ui_release.getChild$ui_release()) {
            function1.invoke(head$ui_release);
        }
    }

    public final void tailToHead$ui_release(int i2, Function1<? super Modifier.Node, Unit> function1) {
        if ((-1) - (((-1) - getAggregateChildKindSet()) | ((-1) - i2)) == 0) {
            return;
        }
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            int kindSet$ui_release = tail$ui_release.getKindSet$ui_release();
            if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                function1.invoke(tail$ui_release);
            }
        }
    }

    public final void tailToHead$ui_release(Function1<? super Modifier.Node, Unit> function1) {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            function1.invoke(tail$ui_release);
        }
    }

    /* JADX INFO: renamed from: has-H91voCI$ui_release */
    public final boolean m5710hasH91voCI$ui_release(int i2) {
        return (i2 & getAggregateChildKindSet()) != 0;
    }

    public final boolean has$ui_release(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - getAggregateChildKindSet())) != 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (this.head == this.tail) {
            sb.append("]");
        } else {
            Modifier.Node head$ui_release = getHead$ui_release();
            while (true) {
                if (head$ui_release == null || head$ui_release == getTail$ui_release()) {
                    break;
                }
                sb.append(String.valueOf(head$ui_release));
                if (head$ui_release.getChild$ui_release() == this.tail) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                head$ui_release = head$ui_release.getChild$ui_release();
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void resetState$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.reset$ui_release();
            }
        }
        runDetachLifecycle$ui_release();
        markAsDetached$ui_release();
    }

    public final void markAsAttached() {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.markAsAttached$ui_release();
        }
    }

    public final void runAttachLifecycle() {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.runAttachLifecycle$ui_release();
            if (head$ui_release.getInsertedNodeAwaitingAttachForInvalidation$ui_release()) {
                NodeKindKt.autoInvalidateInsertedNode(head$ui_release);
            }
            if (head$ui_release.getUpdatedNodeAwaitingAttachForInvalidation$ui_release()) {
                NodeKindKt.autoInvalidateUpdatedNode(head$ui_release);
            }
            head$ui_release.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            head$ui_release.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }

    public final void markAsDetached$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.markAsDetached$ui_release();
            }
        }
    }

    public final void runDetachLifecycle$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.runDetachLifecycle$ui_release();
            }
        }
    }

    /* JADX INFO: renamed from: firstFromHead-aLcG6gQ$ui_release */
    public final /* synthetic */ <T> T m5709firstFromHeadaLcG6gQ$ui_release(int i2, Function1<? super T, Boolean> function1) {
        if ((getAggregateChildKindSet() & i2) != 0) {
            for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                int kindSet$ui_release = head$ui_release.getKindSet$ui_release();
                if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                    Modifier.Node nodePop = head$ui_release;
                    MutableVector mutableVector = null;
                    while (nodePop != null) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        if (nodePop instanceof Object) {
                            if (function1.invoke(nodePop).booleanValue()) {
                                return (T) nodePop;
                            }
                        } else {
                            Object obj = nodePop;
                            if ((((Modifier.Node) nodePop).getKindSet$ui_release() & i2) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate$ui_release = nodePop.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & i2) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            Object obj2 = nodePop;
                                            if (nodePop != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(nodePop);
                                                }
                                                nodePop = (Object) null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & i2) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: headToTail-aLcG6gQ$ui_release */
    public final /* synthetic */ <T> void m5712headToTailaLcG6gQ$ui_release(int i2, Function1<? super T, Unit> function1) {
        int aggregateChildKindSet = getAggregateChildKindSet();
        if ((aggregateChildKindSet + i2) - (aggregateChildKindSet | i2) != 0) {
            for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & i2) != 0) {
                    Modifier.Node nodePop = head$ui_release;
                    MutableVector mutableVector = null;
                    while (nodePop != null) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        if (nodePop instanceof Object) {
                            function1.invoke(nodePop);
                        } else if ((nodePop.getKindSet$ui_release() & i2) != 0 && (nodePop instanceof DelegatingNode)) {
                            int i3 = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                int kindSet$ui_release = delegate$ui_release.getKindSet$ui_release();
                                if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        nodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodePop != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(nodePop);
                                            }
                                            nodePop = null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                int aggregateChildKindSet$ui_release = head$ui_release.getAggregateChildKindSet$ui_release();
                if ((aggregateChildKindSet$ui_release + i2) - (aggregateChildKindSet$ui_release | i2) == 0) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: tailToHead-aLcG6gQ$ui_release */
    public final /* synthetic */ <T> void m5714tailToHeadaLcG6gQ$ui_release(int i2, Function1<? super T, Unit> function1) {
        int aggregateChildKindSet = getAggregateChildKindSet();
        if ((aggregateChildKindSet + i2) - (aggregateChildKindSet | i2) != 0) {
            for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                int kindSet$ui_release = tail$ui_release.getKindSet$ui_release();
                if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                    Modifier.Node nodePop = tail$ui_release;
                    MutableVector mutableVector = null;
                    while (nodePop != null) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        if (nodePop instanceof Object) {
                            function1.invoke(nodePop);
                        } else if ((nodePop.getKindSet$ui_release() & i2) != 0 && (nodePop instanceof DelegatingNode)) {
                            int i3 = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((-1) - (((-1) - delegate$ui_release.getKindSet$ui_release()) | ((-1) - i2)) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        nodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodePop != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(nodePop);
                                            }
                                            nodePop = null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: tail-H91voCI$ui_release */
    public final /* synthetic */ <T> T m5713tailH91voCI$ui_release(int i2) {
        if ((-1) - (((-1) - getAggregateChildKindSet()) | ((-1) - i2)) != 0) {
            for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((-1) - (((-1) - tail$ui_release.getKindSet$ui_release()) | ((-1) - i2)) != 0) {
                    Object obj = (T) tail$ui_release;
                    MutableVector mutableVector = null;
                    while (obj != null) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        if (obj instanceof Object) {
                            return (T) obj;
                        }
                        if ((-1) - (((-1) - ((Modifier.Node) obj).getKindSet$ui_release()) | ((-1) - i2)) != 0 && (obj instanceof DelegatingNode)) {
                            int i3 = 0;
                            for (Modifier.Node delegate$ui_release = obj.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                int kindSet$ui_release = delegate$ui_release.getKindSet$ui_release();
                                if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        obj = (T) delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (obj != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(obj);
                                            }
                                            obj = (T) null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        obj = (T) DelegatableNodeKt.pop(mutableVector);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: head-H91voCI$ui_release */
    public final /* synthetic */ <T> T m5711headH91voCI$ui_release(int i2) {
        int aggregateChildKindSet = getAggregateChildKindSet();
        if ((aggregateChildKindSet + i2) - (aggregateChildKindSet | i2) != 0) {
            for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                int kindSet$ui_release = head$ui_release.getKindSet$ui_release();
                if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                    Object obj = (T) head$ui_release;
                    MutableVector mutableVector = null;
                    while (obj != null) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        if (obj instanceof Object) {
                            return (T) obj;
                        }
                        int kindSet$ui_release2 = ((Modifier.Node) obj).getKindSet$ui_release();
                        if ((kindSet$ui_release2 + i2) - (kindSet$ui_release2 | i2) != 0 && (obj instanceof DelegatingNode)) {
                            int i3 = 0;
                            for (Modifier.Node delegate$ui_release = obj.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                int kindSet$ui_release3 = delegate$ui_release.getKindSet$ui_release();
                                if ((kindSet$ui_release3 + i2) - (kindSet$ui_release3 | i2) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        obj = (T) delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (obj != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(obj);
                                            }
                                            obj = (T) null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        obj = (T) DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & i2) == 0) {
                    break;
                }
            }
        }
        return null;
    }
}
