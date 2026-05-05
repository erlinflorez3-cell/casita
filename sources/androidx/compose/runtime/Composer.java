package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŕ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013.H\u0002*,(w\u000ffp;8D{H6RY+\u0017k\u00124,[*rK;c \u0006\"\u000fQVg}nRZ\u0011G\u0017\u0006$\u0002r,OZ\u0001](\u000f:BuH;M}=A`z8\r H\"@y\u001b\u0001\"*N\u0010~zYK\u0014۵8@~=Z\r[\u000f\"\u0012\u0014B(\u0001,aoNDOt]H7+\u0003oDV'u0\u0005M\u0013G\\'#vi\u001e1J?5+%[\u0003\rTc?\u0019?y=\u000bi/'9g{WLX\b\u0014++W\rc{.\\\u0013]h\f-0WcaP\u0016(}z\u0004\rJ\u0013\u0016\u0006-O6-0f\u0010Ԅ9i\tԟ^И\u0001\u000fB.y\u001a6Е$Hq9l3f\u007f\u0016[\u001bTљ\n:- )\u007f|W\fX\u001c\u0018-\u001b\u001b-\u0002L_xU_^\fi=4:\u0001d\u0012*JeW\u0002?{?bE^ھ_9)[2'ҩHg\u0005@)na&jHn_5;\u007f:\u0017JrD\u0013%\u001cVb\u0010D\u0013c\u001b\u0003\u0006D-[.j6T!S0~Sv!\u0003M\f*kD/Eg-\u0004\u000e\u0006Y\u000f7C\t{\u0010\u0010\u0012=)\bJpCpfps<^j_:2v+V\rDR\\J+2m\u0012L8:h1\\C\nI3\u000bO\u000bGwZ\u00170/XA[\u001biR7O\u0016\u0019j~.\u007fxwL-d0dYQc-ljjvB;;\u0007-\u00140Ku\u0004_L\u001bY<jD.$XQQ]]C\u0013\r`J\u0002[\n\u0013\b.a[W?z+\u001a?Ave\u007f\n\u0001oZ_1_\u0018Z%h\u000f^!WN\tH\u0019o\u000e\u0013G*\u000b+]Dδ\u00019\nF\\\u0001\u0015\u000b/ 5\u00016X+~shے!\u0016\u0006^w/o)\u0002o\\.\u0003\u0011,۩s:\\m$<zWm4K8\u0010\u0010-\fhI5\u0011P\u0017\u0003w6v98\u001bq`A\u0013\u0011\u001d]\u0016\u0011=M~\u0007ZA7{$@!@\u00164\\\u0014p\u0019\f\u0004\"0[%?\u0002\u001a\r6sY/#J=>Q!yt oU \u0005\f).x\f\u0002lNAi\u0017KaQ*B\u0002T\b9w\u001b\u000fN\u0016\tV^_=Kxg<Adelx\u000b\u000b\u000f*)KnyB\u0001-CyCA=?^\u0006Hj.\u0012\rGxe\u000f)Fg~\u0015Yqi\u001dG)\u0005p\u00019y\u000eGW_N\u0004u=4\u00118(Fv\u0015\u001dpLKA_Hwz@^\u0011V\u0013.\u0015| GjP8(-yC3\u0005,\u001dl1O!$\u0013EZ1\u0010KS*\u0011%T+\u0017\f+IV\u001f=\bK,k/\u0019xU_\u001ex\u0004\u0018\u0016\u00078'2sQbeu~\fs\u001ah\u0015\"\u001cpj!\u0015f\u001f2-\u0011\u001a;\u001e<qNO0g2\u001dlD\u0004}1B7+\u001b:p\u0019/\u001eRqzO\u0007U97\u00175df\u0007-~EOL\u00166!Fr<'RNWW%\\\u001b4\u000eN\b\u0011]Vt,n~[g[;_u\u0011ro?!j\u001e,S*y\u0012\u001bl(C-\u001dq\u0007j\u0017O\u0005B\u0006B%\u000fpz\u0003\u007fA\u0014+3xb\u001f[LF!2\u00153E\n7[;9'+LKW\u001b91\u0001sa\\z#}\u001e\u000f\u00111n\u0013x\u000erZ\t!\u0014\u00182;=l?0&\b#4\nK,Y=PB6`W3YAh18>\u000bNLC_jY\u001d!\u0001\u001b94iM>}\n_N=*/11\u001dMuIwJ{=q33\u001fo!X\u00155S2,qۡ\u0010\u0002sHG\\qǿ\u000ey,wiu\"\b\u001eX\u007f83jIN\u00051ǉDIHX\u0014\rDd<o\u0004T>|\u0014\r2Uؠw\f\nZʖHwr$y4o\u000fZ>\rW8˹k\u001fE{\u001d*\u000fRU]\u0014e#6/A\u000e\u0015\u0012epn*\u0010\u0018\u00166jѳ;+s2nx\u0007~\u000bUʥXB\u0006[F\u0005ix\"\u0006Su\u000ff\u0011S2L~?\u05f6_\u0018`KLmpGbD\\\u0011QQb\u0011A=%\u0015R\u0019ե\rʲ\u001a8X\u0019\b\u007fXc-\u00159K\u0002F\u0018*d\u00029\u001d?b[k{ڈlߒC_\u0002ZCAA\u000e\u0006L^>sfUg/V|+C\f!\u0011\u0005ܿXð\u001e.p\b\u0014RrV`T\u0007S@m^@\u0007ʖ\u0001\u0082Ga\u0019\u001e%Nc'6\u0017@uO[\u0013%a[.ׁTї'7\t\u0004\t%O\u001c+\r$iGIs\u0004\u001bIV{6u ʷ~̚M\u0014\u001bcP;=!\u0010GOg\u0005V\u0014SO{\u0016ן\u000eԯ+.\u0016\u0015*\u007fu\u0016\u0002\u0010(}\u0011c\u0007n7gcY?\u0007x\u000fe߯v\u07be2\u0016HW\f^\u0014\u0014z\u001e;]mc|F~-_O\u0019\u001c`\nFѽvʡQO;w\u001fc?t)eU\u0006\"\u0012\"vfe/Y<?A*PA|ɧ}ž-:'Wi\u0017xvlb\u0017\u0004B\u0017\u0001~\b\u001f~fTbl;~\u0011oˈQʪ\u001f[Td\u000f\u000e~KY\u0012h\u001b:V\u0007`xI\u0019\u0001y\u0002M8\u000eޖxƛk=J$gSa`=IP8\u001c\u000eˇv\u0015ف\\מ5ŧѨ,\u0001\u001d\u0007D\u0006!\u0003Ɉ\tԵ/˛o."}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\r", "", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "5dc\u000ec7EW\u0019\f9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "u(E", "5dc\u000ec7EW\u0019\f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006R0@`\u0002 DC", "/o_9l\nH`#\u000f\nb5|f9n\u000f(\u000fO", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "5dc\u000ec7Egv\t\bh<\f\r8e]2\u0005O\u0001*&\u0006k\u0017E\u000141h\u0002*@{", "5dc\u000ec7Egv\t\bh<\f\r8e]2\u0005O\u0001*&", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "1n\\=b:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF\u007f4Bc\u0005'7ls8UNEy8-\u0019rj\u000f", "5dc\u0010b4I]'\u0003\nb6\u0006", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/>h\u000b*>t\u0016-+MCv>,\u0019weC\u00109", "1n\\=b:Bb\u001d\t\u0004=(\f\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001dF\u0001,9b\u007fi\u0015w\u001e9WQ?z8(\u001eG]H\u00039", "5dc\u0010b4I]'\u0003\nb6\u0006g+t{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0006/?`\u0002)97s8UNEy8-\u0019rj\u0018\u0003r($", "1n\\=b<GR~~\u000fA(\u000b\f", "", "5dc\u0010b4I])\byD,\u0011k+s\u0003fwI\n!&C~\u0012F\u007f3", "5dc\u0010b4I])\byD,\u0011k+s\u0003", "u(8", "1ta?X5M1#\u0007\u0006h:\u0001\u00183o\t\u000f\u0006>|\u001e~Cz", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0015WA7r\u001c\u001a >", "5dc\u0010h9KS\"\u000eXh4\b\u0013=i\u000f,\u0006Ig!\u0015Cvu8\u0002", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.;|\u001a8V*Ei0%|dl\u000f", "1ta?X5M;\u0015\f\u0001^9", "5dc\u0010h9KS\"\u000ebZ9\u0003\t<${1\u0005J\u0010\u0013&Ky\u0017J", "5dc\u0010h9KS\"\u000ebZ9\u0003\t<", "2dU.h3Ma|\b\fZ3\u0001\b", "", "5dc\u0011X-:c \u000e\tB5\u000e\u00056i~fwI\n!&C~\u0012F\u007f3", "5dc\u0011X-:c \u000e\tB5\u000e\u00056i~", "u(I", "7mb2e;B\\\u001b", "5dc\u0016a:>`(\u0003\u0004`jx\u00128o\u000f$\u000bD\u000b %", "5dc\u0016a:>`(\u0003\u0004`", "@dR<`7Ha\u0019lxh7|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u0011", "5dc\u001fX*H[$\t\t^\u001az\u0013:e>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u001fX*H[$\t\t^\u001az\u0013:e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006c%3c\u0006+A{\u0016\u001cKMFk\n", "@dR<`7Ha\u0019lxh7|l.e\t7\u007fO\u0015", "5dc\u001fX*H[$\t\t^\u001az\u0013:ec'{I\u0010\u001b&[.\nE\u007f/DU\r$Av$", "5dc\u001fX*H[$\t\t^\u001az\u0013:ec'{I\u0010\u001b&[", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "AjX=c0GU", "5dc ^0I^\u001d\b|\u001d(\u0006\u00129t{7\u007fJ\n%", "5dc ^0I^\u001d\b|", "/o_9l", "", "$", "\"", "D`[BX", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012g", "0tX9W\nH\\(~\u000em", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "1gP;Z,=", "", "", "", "", "", "", "1gP;Z,=7\"\r\nZ5z\t", "1n[9X*M>\u0015\fvf,\f\t<I\t)\u0006M\t\u0013&Ky\u0017", "1n]@h4>", "9dh", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0015WA7r\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 74M9g;sXOf5\u0018_uUr0I\u00168)aRpLi", "1qT.g,']\u0018~", "4`RAb9R", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "2dP0g0OO(~ih\f\u0006\b\u0011r\n8\u0007", "2hb.U3>@\u0019\u000f\tb5~", "2hb.U3>A#\u000f\b\\,`\u00120o\r0wO\u0005! ", "3mP/_,+S)\r~g.", "3mS\u0011X-:c \u000e\t", "3mS\u001ab=:P ~\\k6\r\u0014", "3mS\u001bb+>", "3mS\u001de6OW\u0018~\b", "3mS\u001de6OW\u0018~\bl", "3mS\u001fX7EO\u0017~\\k6\r\u0014", "3mS\u001fX7EO\u0017~v[3|j<o\u00103", "3mS\u001fX:MO&\u000e\\k6\r\u0014", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{:\u000105I\t\u001f3|\u0016\u001cKMFk\n", "3mS\u001fX<LO\u0016\u0006z@9\u0007\u0019:", "3mS!b\u0014:`\u001f~\b", ";`a8X9", "7mb2e;&]*zwe,Z\u00138t\u007f1\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR\u0011", ">`a.`,MS&", "7mb2e;&]*zwe,Z\u00138t\u007f1\u000b-\u0001\u0018\u0017To\u0017:v3", "@dU2e,GQ\u0019\r", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015Ua:\u0007p,Wt'\u001d", "8nX;>,R", ":dUA", "@hV5g", "@dR<e+,W\u0018~Z_-|\u0007>", "3eU2V;", "@dR<e+.a\u0019}", "Ab^=X", "@d\\2`)>`\u0019}kZ3\r\t", "AjX=6<K`\u0019\b\n@9\u0007\u0019:", "AjX=G6 `#\u000f\u0006>5{", "And?V,\"\\\u001a\t\bf(\f\r9n", "", "And?V,\"\\\u001a\t\bf(\f\r9ng$\tF\u0001$vPn", "And?V,\"\\\u001a\t\bf(\f\r9ng$\tF\u0001$\u0005Vk\u001bK", "AsP?g\u000b>T\u0015\u000f\u0002m:", "AsP?g\u0014Hd\u0015{\u0002^\u000e\n\u0013?p", "2`c.>,R", "AsP?g\u0015HR\u0019", "AsP?g\u0017K]*\u0003y^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u000169X}\u001f(i\u001d>M\u0019", "AsP?g\u0017K]*\u0003y^9\u000b", "D`[BX:", "", "uZ;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006a2?j\u0002\u001f7l\u0007*TS;Aw\u000f", "AsP?g\u0019>^ zx^\u000e\n\u0013?p", "AsP?g\u0019>^ zx^(y\u0010/G\r2\fK", "AsP?g\u0019>a(z\bm\u000e\n\u0013?p", "AsP?g\u0019>c'zwe,^\u00169u\u000b", "AsP?g\u0019>c'zwe,e\u0013.e", "CoS.g,+S!~\u0003[,\n\t.V{/\f@", "CrT\u001bb+>", "\u0011n\\=T5B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\u001bu!5#", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface Composer {
    public static final Companion Companion = Companion.$$INSTANCE;

    @ComposeCompilerApi
    static /* synthetic */ void getApplier$annotations() {
    }

    static /* synthetic */ void getApplyCoroutineContext$annotations() {
    }

    static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getCurrentMarker$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getInserting$annotations() {
    }

    static /* synthetic */ void getRecomposeScope$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getRecomposeScopeIdentity$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getSkipping$annotations() {
    }

    @ComposeCompilerApi
    <V, T> void apply(V v2, Function2<? super T, ? super V, Unit> function2);

    CompositionContext buildContext();

    @ComposeCompilerApi
    boolean changed(Object obj);

    void collectParameterInformation();

    <T> T consume(CompositionLocal<T> compositionLocal);

    @ComposeCompilerApi
    <T> void createNode(Function0<? extends T> function0);

    @ComposeCompilerApi
    void deactivateToEndGroup(boolean z2);

    @ComposeCompilerApi
    void disableReusing();

    void disableSourceInformation();

    @ComposeCompilerApi
    void enableReusing();

    @ComposeCompilerApi
    void endDefaults();

    @ComposeCompilerApi
    void endMovableGroup();

    @ComposeCompilerApi
    void endNode();

    void endProvider();

    void endProviders();

    @ComposeCompilerApi
    void endReplaceGroup();

    @ComposeCompilerApi
    void endReplaceableGroup();

    @ComposeCompilerApi
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    @ComposeCompilerApi
    void endToMarker(int i2);

    Applier<?> getApplier();

    CoroutineContext getApplyCoroutineContext();

    ControlledComposition getComposition();

    CompositionData getCompositionData();

    int getCompoundKeyHash();

    CompositionLocalMap getCurrentCompositionLocalMap();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    RecomposeScope getRecomposeScope();

    Object getRecomposeScopeIdentity();

    boolean getSkipping();

    void insertMovableContent(MovableContent<?> movableContent, Object obj);

    void insertMovableContentReferences(List<Pair<MovableContentStateReference, MovableContentStateReference>> list);

    @ComposeCompilerApi
    Object joinKey(Object obj, Object obj2);

    void recordSideEffect(Function0<Unit> function0);

    void recordUsed(RecomposeScope recomposeScope);

    @ComposeCompilerApi
    Object rememberedValue();

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(String str);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int i2, String str);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int i2, Object obj);

    @ComposeCompilerApi
    void startNode();

    void startProvider(ProvidedValue<?> providedValue);

    void startProviders(ProvidedValue<?>[] providedValueArr);

    @ComposeCompilerApi
    void startReplaceGroup(int i2);

    @ComposeCompilerApi
    void startReplaceableGroup(int i2);

    @ComposeCompilerApi
    Composer startRestartGroup(int i2);

    @ComposeCompilerApi
    void startReusableGroup(int i2, Object obj);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(Object obj);

    @ComposeCompilerApi
    void useNode();

    @ComposeCompilerApi
    default boolean changed(boolean z2) {
        return changed(z2);
    }

    @ComposeCompilerApi
    default boolean changed(char c2) {
        return changed(c2);
    }

    @ComposeCompilerApi
    default boolean changed(byte b2) {
        return changed(b2);
    }

    @ComposeCompilerApi
    default boolean changed(short s2) {
        return changed(s2);
    }

    @ComposeCompilerApi
    default boolean changed(int i2) {
        return changed(i2);
    }

    @ComposeCompilerApi
    default boolean changed(float f2) {
        return changed(f2);
    }

    @ComposeCompilerApi
    default boolean changed(long j2) {
        return changed(j2);
    }

    @ComposeCompilerApi
    default boolean changed(double d2) {
        return changed(d2);
    }

    @ComposeCompilerApi
    default boolean changedInstance(Object obj) {
        return changed(obj);
    }

    /* JADX INFO: compiled from: Composer.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0007I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIY2}P\u000e\u007fRum\u0007J\t\u0012\n\u0014V%\u0007kDI\u0004wٕ\u0016\u0015:ԏ\bA9O}@ˉd|"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-uK 6X?Do>'j", "", "u(E", "\u0013l_Al", "5dc\u0012`7Mg", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc!e(<S&", "", "BqP0X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u001dZ?9kAs", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            public String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        public final Object getEmpty() {
            return Empty;
        }

        public final void setTracer(CompositionTracer compositionTracer) {
            ComposerKt.compositionTracer = compositionTracer;
        }
    }
}
