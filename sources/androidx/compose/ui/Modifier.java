package androidx.compose.ui;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
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
/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\u0015\"4\u0012\u000e\u0007nj?3Le^.ZS0\u0015qaJřy3\"CiTR~1\u0019`\u0017\u0002unbZ9D?\u0016$z\u00038YW\t]@\u0013BD\u007f?aN\u001e@\u007f\u0005=P\u0013%J\"fz5\u0011(,`\u001c\u0007|SK:\u0016@B\u0001:\u0001\u000e{\b`6Nq.\u00076\\.UVJrҗH6S\u0007wJf'&7-c\u001bOl9\u001dxq\u001eqGG7%%\u0002\u0007\u0017Tk?IF GK\rҊ++W~ if\f,\u0015qV-_x̦j\f\u0002d\u001a/CO*R\u0001$6\u0001\u0013\u000e\u001d>\u0014\u000e4+X0=\u001a-\u000f\u001e5\u0005r\u001aG~\f%fȸ~aD\"m\u000fA8Q\u001b\u0015ϟ\u0012?'\\O{3ټdŗ\u0003ϒ ż٭\u000ed\u001d\u001dZ\u0017\u007f0ҮDO˱R\u000b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u0015`}(7v%\u0004", "/mh", "4n[1<5", Global.BLANK, "7mXA\\(E", "=oT?T;B]\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "4n[1B<M", "BgT;", "=sW2e", "\u0011n\\=T5B]\"", "\u0013kT:X5M", "\u001cnS2", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface Modifier {
    public static final Companion Companion = Companion.$$INSTANCE;

    boolean all(Function1<? super Element, Boolean> function1);

    boolean any(Function1<? super Element, Boolean> function1);

    <R> R foldIn(R r2, Function2<? super R, ? super Element, ? extends R> function2);

    <R> R foldOut(R r2, Function2<? super Element, ? super R, ? extends R> function2);

    /* JADX INFO: compiled from: Modifier.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @Deprecated
        public static Modifier then(Modifier modifier, Modifier modifier2) {
            return Modifier.super.then(modifier2);
        }
    }

    default Modifier then(Modifier modifier) {
        return modifier == Companion ? this : new CombinedModifier(this, modifier);
    }

    /* JADX INFO: compiled from: Modifier.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLш|\u0004O\u000f8é6B\u0015\"4\u0012}\nnjO0LeN/X8@ş\u001c{b#$>\u007fCSUH~R\u0019]P\u007fs~Lj\u000bqƤ\u0016\u0018\tjZJ\u0004{$&WLPsW3{pmInvN\u00110428(ڎ\u0011\u001c:H>w)F\u0012 ZcNuRRSS%\u001c\u0018ßL&1\"jnf6\u000fr\u000eP=+\u001b{RP7_v\u0003]\u000fVTU˙\u0007c.+\u0007=c\u001ekgΫ\u000bRiIKr\u007fH\u001dhm-KKyɎD^0\u0018#2g\r$xVr\u0013Yx\u001e7-_cyִ\u001e*\bzB\u0013L\u0006\u001e\u0006mN\\6`zڿ\u00123\u0003|֘?А؟^F\b|gUE$ŗ77ގ\u001fg"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u0015`}(7v%\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "/mh", "4n[1<5", Global.BLANK, "7mXA\\(E", "=oT?T;B]\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "4n[1B<M", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Element extends Modifier {

        /* JADX INFO: compiled from: Modifier.kt */
        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class DefaultImpls {
            @Deprecated
            public static Modifier then(Element element, Modifier modifier) {
                return Element.super.then(modifier);
            }

            @Deprecated
            public static <R> R foldIn(Element element, R r2, Function2<? super R, ? super Element, ? extends R> function2) {
                return (R) Element.super.foldIn(r2, function2);
            }

            @Deprecated
            public static <R> R foldOut(Element element, R r2, Function2<? super Element, ? super R, ? extends R> function2) {
                return (R) Element.super.foldOut(r2, function2);
            }

            @Deprecated
            public static boolean any(Element element, Function1<? super Element, Boolean> function1) {
                return Element.super.any(function1);
            }

            @Deprecated
            public static boolean all(Element element, Function1<? super Element, Boolean> function1) {
                return Element.super.all(function1);
            }
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldIn(R r2, Function2<? super R, ? super Element, ? extends R> function2) {
            return function2.invoke(r2, this);
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldOut(R r2, Function2<? super Element, ? super R, ? extends R> function2) {
            return function2.invoke(this, r2);
        }

        @Override // androidx.compose.ui.Modifier
        default boolean any(Function1<? super Element, Boolean> function1) {
            return function1.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default boolean all(Function1<? super Element, Boolean> function1) {
            return function1.invoke(this).booleanValue();
        }
    }

    /* JADX INFO: compiled from: Modifier.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116B\u0005*4\u0012\u000e\u0007nj?2Le^.ZS0\u0010s{B-c$wOCU0}*\tU\\og\u0005Jb\u000bI\u0010\u000e\u0016\u0007j4I[\be\u0012%2JoE4S\u0015Sʠ\u0011td\u0004`5ŕ<y\u0013\u0001bGVD\u000fzqa<\u001a>u\t>b\rS\u0006HHL̅&Ԯ\u001dձʄR8N$krw.\u0011#ZNU\u001av\u000b֔\u0011FZbU\u0002oZC@eo[3٨\u0007\u0007X\u0019\b\tM0U\u0005\u0017am?\u0012yeup\u007fBOqcUc\u0001ft\u0005\u007f\u001bR;sZq\rh\u000eV2A\nɁ@\u0004\u0014HoS<p2f6Hy\u0003ɤW@VF'M\u000e@y6E_FAڢ=\u001bl\u0018*N'\u0016O{3GN'\u000f79[\u0003ו'#ôXwWz\u001aTK\u0013f\n\bw\u001e\u000e~.\u001a0\u00142W\u007f]6?z]*\u007fpGp9k0\u0003tm\u0005\u0013xjih\u0001U\u00070å\u001a70W\\rRe\u001dk~V/\u008d\u001dܖ `\u000fâ \u0015&_\u0006@A'\u0016S]n:\u0005[d\"'EeeժE\u0089\u001aĆ=j;̐ie\u0016i`\u007f4ABl\u0013c7ba\u001ar^>!`U\u001b\u0016\u0006\b\\P\"\u0012`L0\\\u000bκ=Ǭ`\u001bPґ6DG\f\u0017o+w\u001e\u0010l3R\u0015 hڲ\r\u0005h^v\u0003u\r\u001aD\u000bu:-og\fӨ2Ɓ&t<ê;\t\u0005\u000b\u000e_\bNMez0Fq\n;.\u001agg_A!\u001b\u0017)`\u0018k\u0006#ǰq˛Q\u0018/ϕ\u0015{\u0015VvF8 x\rD`\u0019L&ܸ#Ȕzjzּ f\u0006\u0017oJ\u001bIir\u0019a\u000fk\u0001\"q<|˻-\t-*=\u0001\u001eܲ;u\u0004υ3ޗ\u001a\u0004\u001c٬%cc\n}.\u0012d\u0015G\u0003nT8q8\bb\u007fs\tձDա]~FЭtx\u0011e`j&\u001e\u0019މ@٢7HIЬApFq#1\u0014e5Qcߟbݍ>\u001fwϘL0eP\u0002j\u001e\u0016dk3:\u001emu\u0018\u0006Mr\nx\u05fa`Λ\bϥr\u001e$ܻ8X]\u000e\u00179&u\u001ebOF3\u0013J6<6B;6\u001d\u001aҐuѕ\u0014z\bʋ0'%`ZsilD)O\u05cbX߃\tjUb'Y\u000f~'5$)CIU\u0006T\u0006Gc`\u0017*ߺ\u0015ƨn[\u0007ܺ=-J\u0007G3HZ\u0007>SwŠI\u0007>\u0007Mԅ\n\u001anɘ<g"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r\u001c4t\u0016\u0017WB;A", "u(E", "/fV?X.:b\u0019\\}b3{n3n~\u0016{O", "", "5dc\u000eZ.KS\u001bz\n^\n\u007f\r6de,\u0005?n\u0017&\u0006\u007f\u00126\u0004%<Yy.7", "u(8", "Adc\u000eZ.KS\u001bz\n^\n\u007f\r6de,\u0005?n\u0017&\u0006\u007f\u00126\u0004%<Yy.7", "uH\u0018#", "1gX9W", "5dc\u0010[0ERW\u000f~X9|\u0010/a\u000e(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B\u0018f*6mk", "Adc\u0010[0ERW\u000f~X9|\u0010/a\u000e(", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2sB\b\u001f7CY\u001f", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", "1n^?W0GO(\t\b", "5dc\u0010b6KR\u001d\bvm6\nG?iy5{G\u0001\u0013%G", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006_/4Y[*Az\u00152V?JuAs", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "5dc\u0010b9Hc(\u0003\u0004^\u001az\u0013:e", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt!Ty\u001eKz.5G{*Bmk", "7mb2e;>R\u0002\ty^\b\u000f\u00053t\u00041}\u001c\u0010&\u0013ErnF\u0004\t>jy';l\u0012=QMD", "", "5dc\u0016a:>`(~yG6{\t\u000bw{,\u000bD\n\u0019rV~\n:y\u0006?fa)Hi\u001d2L?Jo>'Sxe3\u0014c3Nr5G", "u(I", "Adc\u0016a:>`(~yG6{\t\u000bw{,\u000bD\n\u0019rV~\n:y\u0006?fa)Hi\u001d2L?Jo>'Sxe3\u0014c3Nr5G", "uY\u0018#", "7r0Ag(<V\u0019}", "9h]1F,M", "5dc\u0018\\5=A\u0019\u000e9n0v\u0016/l\u007f$\n@", "Adc\u0018\\5=A\u0019\u000e9n0v\u0016/l\u007f$\n@", "<nS2", "5dc\u001bb+>\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u001bb+>", "=m0Ag(<V\u0006\u000f\u0004>?\b\t-t\u007f'", "=m32g(<V\u0006\u000f\u0004>?\b\t-t\u007f'", "=v]2e\u001a<]$~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9w9\u0005%Bj}- w\u0015.7UDkA\f\u0013rl9\\", "5dc\u001cj5>`\u0007|\u0005i,;\u00193_\r(\u0003@|%\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006`\"CY\u000b17z~8LC%}=\u001e\"V_C\u0012c\u0002", "Adc\u001cj5>`\u0007|\u0005i,;\u00193_\r(\u0003@|%\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW&s35f\u000f DV -M-Mt4+\u0003fkD\u00079o?", ">`a2a;", "5dc\u001dT9>\\(=\u000bb&\n\t6e{6{", "Adc\u001dT9>\\(=\u000bb&\n\t6e{6{", "Ab^=X", "Ag^B_+\u001ac(\t^g=x\u00103d{7{", "5dc [6NZ\u0018Z\u000bm6`\u0012@a\u0007,z<\u0010\u0017UCx\u0017F\u0006!D]\b)E", "5dc [6NZ\u0018Z\u000bm6`\u0012@a\u0007,z<\u0010\u0017", "CoS.g,=<#}z:>x\r>i\t*WO\u0010\u0013\u0015JP\u0018IZ.FU\u0005$6i%2WL", "5dc\"c+:b\u0019}ch+|dAa\u00047\u007fI\u0003r&Vk\f?W/B=\u000713t\u001a-IR?u=\\%l[F\u0007j,J\u0005'", "Adc\"c+:b\u0019}ch+|dAa\u00047\u007fI\u0003r&Vk\f?W/B=\u000713t\u001a-IR?u=\\%l[F\u0007j,J\u0005'", "7r:6a+", "9h]1", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001b]\u0007\u001f\r", "7r:6a+\u00066lJ\fh\n`G?iy5{G\u0001\u0013%G", "uH\u0018'", ";`a84:\u001ab(zxa,{", "", ";`a84:\u001ab(zxa,{G?iy5{G\u0001\u0013%G", ";`a84:\u001dS(zxa,{", ";`a84:\u001dS(zxa,{G?iy5{G\u0001\u0013%G", "=m0Ag(<V", "=m32g(<V", "=mA2f,M", "@db2g", "@db2gjNW\u0013\fze,x\u0017/", "@t]\u000eg;:Q\u001ce~_,z\u001d-l\u007f", "@t]\u000eg;:Q\u001ce~_,z\u001d-l\u007ff\fDz$\u0017No\nJv", "@t]\u0011X;:Q\u001ce~_,z\u001d-l\u007f", "@t]\u0011X;:Q\u001ce~_,z\u001d-l\u007ff\fDz$\u0017No\nJv", "Adc\u000ef\u000b>Z\u0019\u0001vm,k\u0013", "=v]2e", "Adc\u000ef\u000b>Z\u0019\u0001vm,k\u0013mu\u0004\"\t@\b\u0017\u0013Uo", "AhS28-?S\u0017\u000e", "3eU2V;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "CoS.g,\u001c]#\fyb5x\u00189r", "CoS.g,\u001c]#\fyb5x\u00189r>8\u007f:\u000e\u0017\u001eGk\u001c<", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static abstract class Node implements DelegatableNode {
        public static final int $stable = 8;
        private Node child;
        private NodeCoordinator coordinator;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;
        private ObserverNodeOwnerScope ownerScope;
        private Node parent;
        private CoroutineScope scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;
        private Node node = this;
        private int aggregateChildKindSet = -1;

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        public final Node getNode() {
            return this.node;
        }

        public final CoroutineScope getCoroutineScope() {
            CoroutineScope coroutineScope = this.scope;
            if (coroutineScope != null) {
                return coroutineScope;
            }
            Node node = this;
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(DelegatableNodeKt.requireOwner(node).getCoroutineContext().plus(JobKt.Job((Job) DelegatableNodeKt.requireOwner(node).getCoroutineContext().get(Job.Key))));
            this.scope = CoroutineScope;
            return CoroutineScope;
        }

        public final int getKindSet$ui_release() {
            return this.kindSet;
        }

        public final void setKindSet$ui_release(int i2) {
            this.kindSet = i2;
        }

        public final int getAggregateChildKindSet$ui_release() {
            return this.aggregateChildKindSet;
        }

        public final void setAggregateChildKindSet$ui_release(int i2) {
            this.aggregateChildKindSet = i2;
        }

        public final Node getParent$ui_release() {
            return this.parent;
        }

        public final void setParent$ui_release(Node node) {
            this.parent = node;
        }

        public final Node getChild$ui_release() {
            return this.child;
        }

        public final void setChild$ui_release(Node node) {
            this.child = node;
        }

        public final ObserverNodeOwnerScope getOwnerScope$ui_release() {
            return this.ownerScope;
        }

        public final void setOwnerScope$ui_release(ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        public final NodeCoordinator getCoordinator$ui_release() {
            return this.coordinator;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z2) {
            this.insertedNodeAwaitingAttachForInvalidation = z2;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z2) {
            this.updatedNodeAwaitingAttachForInvalidation = z2;
        }

        public final boolean isAttached() {
            return this.isAttached;
        }

        public void updateCoordinator$ui_release(NodeCoordinator nodeCoordinator) {
            this.coordinator = nodeCoordinator;
        }

        /* JADX INFO: renamed from: isKind-H91voCI$ui_release */
        public final boolean m3784isKindH91voCI$ui_release(int i2) {
            return (-1) - (((-1) - i2) | ((-1) - getKindSet$ui_release())) != 0;
        }

        public void markAsAttached$ui_release() {
            if (this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node attached multiple times");
            }
            if (!(this.coordinator != null)) {
                InlineClassHelperKt.throwIllegalStateException("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void runAttachLifecycle$ui_release() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            onAttach();
            this.onDetachRunExpected = true;
        }

        public void runDetachLifecycle$ui_release() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node detached multiple times");
            }
            if (!(this.coordinator != null)) {
                InlineClassHelperKt.throwIllegalStateException("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            onDetach();
        }

        public void markAsDetached$ui_release() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            CoroutineScope coroutineScope = this.scope;
            if (coroutineScope != null) {
                CoroutineScopeKt.cancel(coroutineScope, new ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        public void reset$ui_release() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("reset() called on an unattached node");
            }
            onReset();
        }

        public final void sideEffect(Function0<Unit> function0) {
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(function0);
        }

        public void setAsDelegateTo$ui_release(Node node) {
            this.node = node;
        }
    }

    /* JADX INFO: compiled from: Modifier.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007f\u0007|jA0JhP.hS2\u000fq~<$i0yّA٬\u001b\u0014̝9O|f(sPZŲG\u000f\u0014\u0016A\u0005:Jmx\f\u0014?BPrW?]qM9\u000fyF\u000702P:(\tG.rb\u001e|\u0013Cy\u000eB@NsR^\u001dO\u0015\u001a@\u000bN\"\u0011\u001e\u000bi|:\u000f\u0001&m=*\u001bi\tVGa6ŧ[\u0015vX5\u0016\u000fad3pMC\u001f=e\u0013\tb[\u0006\u000bOsM\u0005\u0017,7-Ys\u001e>\u0007\u000bZ)ۣS\rk~n\u0010\u0013^x\fm3oeQִ\u001c0(~\n\u0016T\u0004T\u000eW^<72x\u0018\u0010Ct!XPR\u0012^\t\b\u000bcF\u0017k\ba6\u007f/ƻUaI%\u0017F\n\u0013%\u001eQ\u007f\u001f%ic&`C\u001a\u001bɄSyWNM`N8j\u0004\u0002շtt"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u0013c\u0006+3v\u001a8V\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "u(E", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u0015`}(7v%\u0004", "/mh", "4n[1<5", Global.BLANK, "7mXA\\(E", "=oT?T;B]\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "4n[1B<M", "BgT;", "=sW2e", "BnBAe0GU", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Override // androidx.compose.ui.Modifier
        public boolean all(Function1<? super Element, Boolean> function1) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public boolean any(Function1<? super Element, Boolean> function1) {
            return false;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldIn(R r2, Function2<? super R, ? super Element, ? extends R> function2) {
            return r2;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldOut(R r2, Function2<? super Element, ? super R, ? extends R> function2) {
            return r2;
        }

        @Override // androidx.compose.ui.Modifier
        public Modifier then(Modifier modifier) {
            return modifier;
        }

        private Companion() {
        }

        public String toString() {
            return "Modifier";
        }
    }
}
