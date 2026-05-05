package androidx.compose.runtime;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.collection.MutableIntList;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
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
/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яų\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\u00124,[*rK;c;\u0006\"\u001fOVgmoRZ\u0019L\u0017\u0006\u001cyr,_U\u0001ز\u001a\u000fHBw?AMw=O`|6\u000b$:\"Ny\rЏ\"*V.~zYK\u0014\u00126Ax:h\rUĨ\"\u0012\u0014^(\u0001,ձoN<It]P/+\u0003\u007fBV'e6\u0005M\u001bL\\'\u0013\u007fi\u001eA@?5\u001b+[\u0003\u001dRc?\u0019?y=\u000bi/'AI{W<r\b\u0014++W\rcu.\\\u001bQh\f--WcaP\u0016(\u000ez\u0004\rB\u0006\u0016\u0006=H6-0f\u0010Ԅ;t\tSHP\baJ\u007f\u0011a>\u0017+\u0001;+O\u001bnϟi;/N?{\u000b $ŀ\u0017͙Q[\u0003\r\u0011\u0015IT(Q_Rp=vPBYǃlD\u0014r\u00068\u0007HG.3\f\u0019<\u001c=;k9)\"\u001a\bXLmv\u0013g\u0001U\u007fQvH̱r\u0016E3Q\u0012h\u001b|\u0005\u001ah\u001blt'[sl\u0007, C$jPT!S:~SvC\u0003M\f\u001bk//SgF\u0004\u000e\u0006Q\u000f=C,{\u0016qT\u0007\u0014mf\u0011.\tjP-$Z\u000b9h2\u0011p\u001eS\u0014D|$YF\b\u007f*\u0011D1GtEL\u00112ZA+\u001e&Z1\u0016\r2K$1\u0002j\tQ\u0007^;\to\u0016\u0011\u0010@Ef0\rYQc1lUj\u0007B];\u0007-\f0Vu._W|\u0018\u0006U*8D1\u07fcU/C,U\u0013Ȟ6\u0002;b\u0015\u0011s4e\u0012U\u0013-\t\u001d\u001d\u00019w\nzpZx\u0019aׅX\u0017(\u0010%rן\fd\u000e\u0017*Q\t+{T9\u0014\u0005δ\u03a2\u0007YB3\u0001\u0003\u0013\u00056%/\bh\u0011}^Q\u000e5\u0016>{O\u0017gӠwW^\u007fpw>v{\u0003ZbFsp;u2ipyc\r):*|\u0005RH1_6YOH٢7HOP9\\F:#/,~M@U~dIR\u0013\u001e\u0016d2m\u0019\fC,\u0004%Wm\u0017[D\u007fm\u001cc#\u000b\u0013\u0015\u0018|\u00141\u001d*b=hweU!2\u001cr^*a=hŝJ|T>:1 \u0011SVy\u0006Vn.<&#ł6B\u00022\u001f.bptV\u000fx\u0001GfԠ8t/\u0019A\t\u0011;A\u0007}F\u001b#\u0012IGҸ#͢\u001fj]w/f9>l9a\u001cx\u0003\u0011Եk7y-Dn_P}\t\u007f'H\u001a\r\u001dp;+;a\u0011\u000e!^\rκYnT`\u0007\u0018lO^$/\u0005!\u0011\u001e>\u001a\u000fQ\r}m6۱3ٮRwEAb(%\u05ee(\u001f\f+{v7;ݤ4ETY}$8\fZc<,М\u001f0,\u0014w7[\u0006ʮe8܄\u001ah88*+\u001e\u0017ޕO8\u0005\\\u0603s#\u000f<ā5g\u0002a%Cegŝv9B=*\u001b0\t_1\u007f\u0018ɱk{n\u0004#Izy|\bұ,h\u001e7\u07b6L^\u0018fś9)SN{A\u0006\"ކ%776ӿ(@Vqִo\u0004Qq\fYY2**>>݉\u001d\u0016\u001f(\u000e4.b\u001d-;\u0005\u0006\u0007s\u0017ϬkZW<v\u001b,rM$)B'EH')!̙E\u000b\u001f\u0013ԅ6I%iƽFx\b2ْHlϳܳV@!γ1Sy6Ϥ\u0010\u001b=xs.˱AOrH|:ߴEl=H8\n.{?\u001b,[GHB6V?7WC#M.ڽ[2\u001ciicK'{\u0019\u001bH\b\u007f\u0007GM\u0019h\u001a9r\b\u000bӫ\fWy_|\u0001\b\u007f\u00031˛\u000e\b\u001b\u0006~k*C֔K?\f0\t\u0011\u0013\u0016xdշ`DIc]N\u0004c\u001b\u0018\u0010/&4\u0006$M.nw\\rnjȗU\fW2>Z:|\u001d;G\u001b#:\u001etx&ŏcsabY+\u0018'\u001dV*[\u0017MY\u0016\u0002\b\u07bbC%EBO?\u000e7\"/\u0001 OwAYx9ىҰ`^B΄rLY@ݠ5\u0012GnqZ\u000b;¢S{j\u0019\u0018\u0002d\u001eم\u0011%\r2\u001bwׯϵ\u0004a#ȟ&\u0014\u0016Tռ[\u0011Moz;O\u001d\u0006v9R\u000e\u001b\u0006DFv.ў\u0002Jf.YG˝wAU/\u001f\u001b/\u0378\u0010s%4=\u0018yU!m|h?I39\u0006xo˥i\\\u000bng_ߠ/\u0015\u000e\bsAUݫ=26h\b\u001eE\u0013k F\tDV\u0018^^vPG{Q\u05fb\u007f4\u001f\u0004I5g\u0005Ʈp+\fn\u001f\u0016O]~Te#sl0\u001aVà\u001fҝ\u000f\u001ea2z>\u0002Կ0V{6myZ\u000b˾H(\u0003\u0010mQ6\u0014ܢ.YM\u0003U\u0014i_W\b\u000e\u001a\u0530&<\u0006A<\u0013k!;&\"\u000eU\u00136\u001f0VæX)fp\u0003U\u000fE\u001a<\u0016PW\u001c<4\u00199ɒ7ņc@4ȨA!UZ\u0003\u0002:g\u007ff#f{Q\u0002ܵ\u001b҅5w\u0019ˮ_a\u001a|_k)N%\\>D#\u0002 \u001eTgRŞ+݉\u001bUkݗ;\u0006bp)Yb|f%PۻhΆBgV>N~'y \n)e\\b7uGֶCŹfl4ȯ\u0007mx/\u0019\f[c'\u0014e\\%:ת7:(zx˳iծKX\u000e\u000ex\u007f\u0010\u0017\u0002wAQ-q2\u0019#\"\u000fr\u0001#\u0005\u0005{PZΒ1ȭJZH˸}r5\u000f\u0001\u000e:\u0010\u001c|3O\u001du\t\u0011Lضtկ\u0003'6\u001cG{Glq%\u0011?T\u000eBOhz\u001d{\u000bL\u0005ߙ\bǋ\u0016B\u0004Қ=Y\u0002$K]\u0002QD]LS,\u0013._cۿ\u0014˲gN;Qo\u000e\u001f\n~i\u00064qLiC\u0012\nPS4\u000e%+\u0012H:K`QQ/e՞\u001aɺjn\u0001ΕYq\u001a_\ru<CDҧ\u007fՑag<ߦ\u000egk0]-]\u0003>  ԛ\u0001֖K\u0012a\u0018@\u0002Z\u0001FmK\b.25\u0001:\u0006fӤbݖF\u001b\u0010\nhhyMLY\u0011I\u0003Q>\u001cjf\u001d\u0010%w8Ш?Ԍ\u0011\u0014\rقD71v=avf.ã_ސ)ϠUElϕ\u0015\u001d6\u0018J>@G\u001fڙrÝ\u001f\u0002\rċ52$r]\u0005PM%[2\u000bsS2gv\u0016V]`ϗ\"°!\u007f=ܖ]\u0006^\u0019Mg\r\u001a\fwdޥp˖\fuH4M\u0018h3\u007fm\u0016IbfzaC\u0016]ذ0ֹzv/A\u001b=8Xr,Q\"1g3Gɶ?cpƯ||$+inw<\fC9\u0013o4l̹&Ԃ\u0004tcʑ \u0002\u000f~`\u0013:D\u001aǋ\nĄ\teT\u05cb\u0006\"OpW_\u0001\u001b;w\u000e\tR\u0007\u001d%OK9F~\u07bcnōs\u00150ɘ\u0014+\u0005[\u0006\u0015 \u001eY%7Wax\u000b\u001a`3N\u0004fк\fծf^\u007fÒqa>q\f\u000f]N}}\\\u0015\u001e\u0014.\u001efՋsƥa\u0003\u00108Kj\u001eR#M\"&tDU ~ۑ\u0019Ӂ\"%2ſJ\u000etu)#9\n}yjb@d\u000bΈ7ӒD53ĴQD\u000fH!#\f<jřeʑJv\u0017Õ\u0007RIZl\u0004Vk\u0003Q?0$\bQ0@g\ni\bm\u0004HP&:d*#\u00146;\u001a95*:o>88jER~U¥\u0013֧nt\fş\u0017 \u0001\u0010\t1`Q\u0016!φ0bArqI=!#Y[@G\u001aEx\u000fն9̀Oq*˪UiC\u001d3$%!p`\u0003XÃ9֯["}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0012UNBA", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF\u007f4Bc\u0005'7ls8UNEy8-\u0019rj\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<\u000731V\u0005 \u0015w\u001e9WQ?z8(\u001e>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC%}=\u001e\">", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u001cMPLo2\u001e#>", ">`a2a;", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "@dR<`7Ha\u0019\\\u0005g;|\u001c>", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 7+MDz41$>H5\u0010b9Xz&Z\u0016L6d]|K\u0014[g\u001eW:\u0011\rY\u000b\u007fyO>#\b9\u001fhAr\u0010\u0013\u001a\u0017~hzO` V}\u001euOrFPfi\nVENb\bn\u0015n\u001doI\u0010g\u0005", "-qT0b4I]'~Xh5\f\tBt", "/aP;W6GA\u0019\u000e", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-!j$.ZT;x\n", "5dc\u000eU(GR#\bh^;;\u00058n\n7wO\u0005! U", "u(E", "/qT\u0010[0ER&~\u0004<6\u0005\u00149s\u00041}", "", "5dc\u000ee,\u001cV\u001d\u0006yk,\u0006f9m\u000b2\nD\n\u0019", "u(I", "1gP;Z,L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\fP?Dm4\u0005\u0019vp\u000f", "1n\\=b::P ~", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "5dc\u0010b4I]'zwe,", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "Adc\u0010b4I]'zwe,", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0002/", "1n\\=b:>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\u001bu!5#", "1n]1\\;B]\"z\u0002L*\u0007\u0014/s", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u001fs?%j", "5dc\u0010b5=W(\u0003\u0005g(\u0004v-o\u000b(\n~\u000e' Vs\u0016<p25`}\u001cEm", "u(;7T=:\u001d)\u000e~euc\r=tU", "1n]1\\;B]\"z\u0002e@`\u0012@a\u0007,z<\u0010\u0017\u00165m\u0018Gv3", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=#", "2da6i,=A(z\n^\u000b|\u0014/n~(\u0005>\u0005\u0017%", "", "", "5dc\u0011X9Bd\u0019}hm(\f\t\u000ee\u000b(\u0005?\u0001 \u0015Ko\u001cz\u00045>h\u0002(7g#.TC7y4", "u(;7T=:\u001d)\u000e~euj\t>;", "2da6i,=A(z\n^:", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u001cKMFk\u001c\u001a >", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l<\u0004)FY|\u000eFi%.#", "2hb=b:>R", "6`b\u0016a=:Z\u001d}vm0\u0007\u0012=", "5dc\u0015T:\"\\*z\u0002b+x\u00183o\t6", "6`b\u001dX5=W\"\u0001Xa(\u0006\u000b/s", "5dc\u0015T:)S\"}~g.Z\f+n\u0002(\n", "7me._0=O(~yL*\u0007\u0014/s", "7me._0=O(\u0003\u0005g\u000b|\u0010/g{7{", "7me._0=O(\u0003\u0005g\u000b|\u0010/g{7{\"\u000e!'R", "", "7me._0=O(\u0003\u0005g:", "7r2<`7Ha\u001d\b|", "7r36f7Ha\u0019}", "7rA<b;", ":`c26/:\\\u001b~\t", ":nR8", "=ab2e=:b\u001d\t\u0004l", "=ab2e=:b\u001d\t\u0004l\u0017\n\u0013-e\u000e6{?", "=ab2e=>R\u0003{\u007f^*\f\u0017", "5dc\u001cU:>`*~yH)\u0002\t-t\u000ef\tP\n&\u001bOo\bIv,5U\f ", "=ab2e=>`{\t\u0002],\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0018JQ;xE\u001e\"Kk@\u0006c9$", "5dc\u001cU:>`*~\bA6\u0004\b/r>5\fI\u0010\u001b\u001fGi\u001b<}%1g}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.;|\u001a8V-8y4+&hn\u001c\u0011j+N\u0004|", ">d]1\\5@7\"\u0010ve0{v-o\u000b(\n", "5dc\u001dX5=W\"\u0001^g=x\u00103dm&\u0006K\u0001%UT\u007f\u0017Kz-5S\u000b >m\u0012<M\u00027t=($dp=\u0011l:", "5dc\u001dX5=W\"\u0001^g=x\u00103dm&\u0006K\u0001%UT\u007f\u0017Kz-5S\u000b >m\u0012<M", "Adc\u001dX5=W\"\u0001^g=x\u00103dm&\u0006K\u0001%UT\u007f\u0017Kz-5S\u000b >m\u0012<M", "uY\u0018#", ">d]1\\5@;#}~_0z\u0005>i\n1\n", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Z\u0016/MP;t2\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iK\u0001-9Wj 8m#.VA;A", "5dc\u001fX*H[$\t\t^\n\u0007\u0012>e\u00137", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "Ak^AG(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014$Uz'7C", "5dc _6MB\u0015{\u0002^j\n\u00198t\u00040{:\u000e\u0017\u001eGk\u001c<5!>b\b/3|\u001a8VQ", "5dc _6MB\u0015{\u0002^j\n\u00198t\u00040{:\u000e\u0017\u001eGk\u001c<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d,?hl\u001c4t\u0016\u0004", "/aP;W6G1\u001cz\u0004`,\u000b", "/cS\u001dX5=W\"\u0001^g=x\u00103d{7\u007fJ\n%}Qm\u0014<u", "D`[BX", "4na4X;\u001c]\"}~m0\u0007\u0012+lm&\u0006K\u0001%", "D`[BX:", "/o_9l\nAO\"\u0001zl", "/o_9l\nAO\"\u0001zl\u0010\u0006o9c\u0006(z", "/o_9l\u0013:b\u0019\\}Z5~\t=", "1gP;Z,L/$\n\u0002b,{", "1kT.a\u001cI2\u0019\f~o,{v>a\u000f(e=\u000f\u0017$Xk\u001d@\u0001.C", "1n\\=b:>1#\b\n^5\f", "1n]AX5M", "1n\\=b:>7\"\u0003\nb(\u0004", "1n\\=b:>`\u0007\u000ev\\2\u000bv3z\u007f6", "1n\\=b:>`\u0007\u000ev\\2\u000bv3z\u007f6:M\u0011 &Kw\u000e6\u0004%<Yy.7", "2dP0g0OO(~", "2d[2Z(MS|\b\fZ3\u0001\b+t\u00042\u0005N", Global.BLANK, "Bn", "5q^Bc\u0010GR\u0019\u0012", "0k^0^", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001.Df\b'>m\u0015\fWKFuB\"$lkB\\G\u0013T\u00016NPWuacz\u0007\u0015\"c\f]/\u0017\u000eg\u000b\u0005~M5.\f6RL\u0011,g\u0011\u0012\u001f14w>_\u0012\u0011c\u0012zA'w\u001c", "2hb=b:>", "2hb=b:>C\"\u000f\t^+d\u0013@a|/{\u001e\u000b &Gx\u001d", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015>", "2qP6a\u0017>\\\u0018\u0003\u0004`\u0014\u0007\b3f\u0004&wO\u0005! UP\u0018IT/=d\b.;|\u001a8V*Ei:\u001e\u0014", "2qP6a\u0017>\\\u0018\u0003\u0004`\u0014\u0007\b3f\u0004&wO\u0005! UV\u0018:|%4", "5dc\u0010b4I]'\u0003\nb6\u0006v/r\u0011,y@", "\"", "9dh", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u001cMPLo2\u001ezhu\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 7;CH|8\u001c\u0015NaM\\'\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001", "5tP?W\nAO\"\u0001zl", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "5tP?W\u0010Gd\u0015\u0006~](\f\r9n\u000e\u000f\u0006>\u0007\u0017\u0016", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "7mb2e;&]*zwe,Z\u00138t\u007f1\u000b", "@dU2e,GQ\u0019\r", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015Ua:\u0007p,Wt'\u001d", "7me._0=O(~", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9qE\b!<]|\u001cFq 7:CI{;-j", "Ab^=X", "7mbAT5<S", "7me._0=O(~Ve3", "7me._0=O(~Xa,z\u000f/d", "/mR5b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "7me._0=O(~\\k6\r\u0014=W\u00047~&\u0001+", "7me._0=O(~h\\6\b\t\u0019ff2yF\u0001\u0016", "=ab2e=>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001dF\u0001,9b\u007fi\u0015w\u001e9WQ?z8(\u001eR^G\u0007p=N\u0004\nCUM3\\(", "=ab2e=>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001dF\u0001,9b\u007fi\u0015w\u001e9WQ?z8(\u001eR^G\u0007p=N\u0004|", "=ab2e=>\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "=ab2e=>at\b\u000fH-", ">qT=T9>1#\u0007\u0006h:|", "@dR<`7Ha\u0019", "@dR<`7Ha\u0019lxh7|u/l\u007f$\n@\u007f", "@dR<e+&]\u0018\u0003{b*x\u00183o\t6eA", "@dR<e++S\u0015}d_", "@dR<e+0`\u001d\u000ezH-", "@d\\<i,\u001dS&\u0003\f^+j\u0018+t\u007f\u0012xN\u0001$(C~\u0012F\u007f", "@d\\<i,\u001dS&\u0003\f^+j\u0018+t\u007f\u0012xN\u0001$(C~\u0012F\u007fcBi\u0007/;u\u0016(ZCBk0,\u0015", "@d\\<i,(P'~\bo(\f\r9n", "@d\\<i,(P'~\bo(\f\r9n>5\fI\u0010\u001b\u001fGi\u001b<}%1g}", "Adc\u0010b5MS\"\u000e", "Adc\u0010b5MS\"\u000elb;\u007fu/u\u000e(", "B`Z2<5OO \u0003yZ;\u0001\u00138s", "BqP0^\b;O\"}\u0005g,{y+l\u0010(\n", "Bqh\u0016`4B\\\u0019\b\nB5\u000e\u00056i~$\u000bD\u000b ", "D`[6W(MS\u0006~xh4\b\u0013=em&\u0006K\u0001r Er\u0018I\u0005", "Dda6Y@\u001c]\"\r~l;|\u0012>", " d\\2`)>`x\u0010zg;[\r=p{7yC\u0001$", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices {
    public static final int $stable = 8;
    private final CoroutineContext _recomposeContext;
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final ChangeList changes;
    private Function2<? super Composer, ? super Integer, Unit> composable;
    private final ComposerImpl composer;
    private final MutableScatterSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;
    private final ScopeMap<Object, DerivedState<?>> derivedStates;
    private boolean disposed;
    private final MutableScatterSet<RecomposeScopeImpl> invalidatedScopes;
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;
    private ScopeMap<RecomposeScopeImpl, Object> invalidations;
    private final boolean isRoot;
    private final ChangeList lateChanges;
    private final Object lock;
    private final ScopeMap<Object, RecomposeScopeImpl> observations;
    private final ScopeMap<Object, RecomposeScopeImpl> observationsProcessed;
    private final CompositionObserverHolder observerHolder;
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    private final AtomicReference<Object> pendingModifications;
    private final SlotTable slotTable;

    private static /* synthetic */ void getAbandonSet$annotations() {
    }

    public static /* synthetic */ void getPendingInvalidScopes$runtime_release$annotations() {
    }

    public static /* synthetic */ void getSlotTable$runtime_release$annotations() {
    }

    public CompositionImpl(CompositionContext compositionContext, Applier<?> applier, CoroutineContext coroutineContext) {
        this.parent = compositionContext;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        Set<RememberObserver> setAsMutableSet = new MutableScatterSet(0, 1, null).asMutableSet();
        this.abandonSet = setAsMutableSet;
        SlotTable slotTable = new SlotTable();
        if (compositionContext.getCollectingCallByInformation$runtime_release()) {
            slotTable.collectCalledByInformation();
        }
        if (compositionContext.getCollectingSourceInformation$runtime_release()) {
            slotTable.collectSourceInformation();
        }
        this.slotTable = slotTable;
        this.observations = new ScopeMap<>();
        this.invalidatedScopes = new MutableScatterSet<>(0, 1, null);
        this.conditionallyInvalidatedScopes = new MutableScatterSet<>(0, 1, null);
        this.derivedStates = new ScopeMap<>();
        ChangeList changeList = new ChangeList();
        this.changes = changeList;
        ChangeList changeList2 = new ChangeList();
        this.lateChanges = changeList2;
        this.observationsProcessed = new ScopeMap<>();
        this.invalidations = new ScopeMap<>();
        this.observerHolder = new CompositionObserverHolder(null, false, 3, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, setAsMutableSet, changeList, changeList2, this);
        compositionContext.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m3635getLambda1$runtime_release();
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i2 + 4) - (i2 | 4) != 0 ? null : coroutineContext);
    }

    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }

    public final Set<Object> getObservedObjects$runtime_release() {
        return this.observations.getMap().asMap().keySet();
    }

    public final Set<Object> getDerivedStateDependencies$runtime_release() {
        return this.derivedStates.getMap().asMap().keySet();
    }

    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return CollectionsKt.toList(this.conditionallyInvalidatedScopes.asSet());
    }

    public final boolean getPendingInvalidScopes$runtime_release() {
        return this.pendingInvalidScopes;
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z2) {
        this.pendingInvalidScopes = z2;
    }

    public final CompositionObserverHolder getObserverHolder$runtime_release() {
        return this.observerHolder;
    }

    public final CoroutineContext getRecomposeContext() {
        CoroutineContext coroutineContext = this._recomposeContext;
        return coroutineContext == null ? this.parent.getRecomposeCoroutineContext$runtime_release() : coroutineContext;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    public final Function2<Composer, Integer, Unit> getComposable() {
        return this.composable;
    }

    public final void setComposable(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.composable = function2;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.isComposing$runtime_release();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.disposed;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        composeInitial(function2);
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.composer.startReuseFromRoot();
        composeInitial(function2);
        this.composer.endReuseFromRoot();
    }

    private final void composeInitial(Function2<? super Composer, ? super Integer, Unit> function2) {
        if (this.disposed) {
            PreconditionsKt.throwIllegalStateException("The composition is disposed");
        }
        this.composable = function2;
        this.parent.composeInitial$runtime_release(this, function2);
    }

    public final CompositionObserverHandle observe$runtime_release(final CompositionObserver compositionObserver) {
        synchronized (this.lock) {
            this.observerHolder.setObserver(compositionObserver);
            this.observerHolder.setRoot(true);
            Unit unit = Unit.INSTANCE;
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.CompositionImpl$observe$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj = this.this$0.lock;
                CompositionImpl compositionImpl = this.this$0;
                CompositionObserver compositionObserver2 = compositionObserver;
                synchronized (obj) {
                    if (Intrinsics.areEqual(compositionImpl.getObserverHolder$runtime_release().getObserver(), compositionObserver2)) {
                        compositionImpl.getObserverHolder$runtime_release().setObserver(null);
                        compositionImpl.getObserverHolder$runtime_release().setRoot(false);
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        };
    }

    public final void invalidateGroupsWithKey(int i2) {
        List<RecomposeScopeImpl> listInvalidateGroupsWithKey$runtime_release;
        synchronized (this.lock) {
            listInvalidateGroupsWithKey$runtime_release = this.slotTable.invalidateGroupsWithKey$runtime_release(i2);
        }
        if (listInvalidateGroupsWithKey$runtime_release != null) {
            int size = listInvalidateGroupsWithKey$runtime_release.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (listInvalidateGroupsWithKey$runtime_release.get(i3).invalidateForResult(null) != InvalidationResult.IGNORED) {
                }
            }
            return;
        }
        if (this.composer.forceRecomposeScopes$runtime_release()) {
            this.parent.invalidate$runtime_release(this);
        }
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.PendingApplyNoModifications);
        if (andSet != null) {
            if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set<? extends Object>) andSet, true);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set<? extends Object> set : (Set[]) andSet) {
                    addPendingInvalidationsLocked(set, true);
                }
                return;
            }
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (!Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
                return;
            }
            if (!(andSet instanceof Object[])) {
                if (andSet == null) {
                    ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
                    throw new KotlinNothingValueException();
                }
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                ScopeMap<RecomposeScopeImpl, Object> scopeMapTakeInvalidations = takeInvalidations();
                try {
                    CompositionObserver compositionObserverObserver = observer();
                    if (compositionObserverObserver != null) {
                        Map<RecomposeScopeImpl, Set<Object>> mapAsMap = scopeMapTakeInvalidations.asMap();
                        Intrinsics.checkNotNull(mapAsMap, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                        compositionObserverObserver.onBeginComposition(this, mapAsMap);
                    }
                    this.composer.composeContent$runtime_release(scopeMapTakeInvalidations, function2);
                    if (compositionObserverObserver != null) {
                        compositionObserverObserver.onEndComposition(this);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e2) {
                    this.invalidations = scopeMapTakeInvalidations;
                    throw e2;
                }
            }
        } finally {
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            if (this.composer.isComposing$runtime_release()) {
                PreconditionsKt.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if (!this.disposed) {
                this.disposed = true;
                this.composable = ComposableSingletons$CompositionKt.INSTANCE.m3636getLambda2$runtime_release();
                ChangeList deferredChanges$runtime_release = this.composer.getDeferredChanges$runtime_release();
                if (deferredChanges$runtime_release != null) {
                    applyChangesInLocked(deferredChanges$runtime_release);
                }
                boolean z2 = this.slotTable.getGroupsSize() > 0;
                if (z2 || !this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                    if (z2) {
                        this.applier.onBeginChanges();
                        SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                        try {
                            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
                            Unit unit = Unit.INSTANCE;
                            slotWriterOpenWriter.close(true);
                            this.applier.clear();
                            this.applier.onEndChanges();
                            rememberEventDispatcher.dispatchRememberObservers();
                        } catch (Throwable th) {
                            slotWriterOpenWriter.close(false);
                            throw th;
                        }
                    }
                    rememberEventDispatcher.dispatchAbandons();
                }
                this.composer.dispose$runtime_release();
            }
            Unit unit2 = Unit.INSTANCE;
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z2;
        synchronized (this.lock) {
            z2 = this.invalidations.getSize() > 0;
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(Set<? extends Object> set) {
        Object obj;
        Object objPlus;
        do {
            obj = this.pendingModifications.get();
            if (obj == null ? true : Intrinsics.areEqual(obj, CompositionKt.PendingApplyNoModifications)) {
                objPlus = set;
            } else if (obj instanceof Set) {
                objPlus = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objPlus = ArraysKt.plus((Set<? extends Object>[]) obj, set);
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.pendingModifications, obj, objPlus));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(Function0<Unit> function0) {
        this.composer.prepareCompose$runtime_release(function0);
    }

    private final void addPendingInvalidationsLocked(Object obj, boolean z2) {
        Object obj2 = this.observations.getMap().get(obj);
        if (obj2 == null) {
            return;
        }
        if (obj2 instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                long j3 = (~j2) << 7;
                long j4 = (j3 + j2) - (j3 | j2);
                if ((j4 - 9187201950435737472L) - (j4 | (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i2 << 3) + i4];
                            if (!this.observationsProcessed.remove(obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                                if (!recomposeScopeImpl.isConditional() || z2) {
                                    this.invalidatedScopes.add(recomposeScopeImpl);
                                } else {
                                    this.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                                }
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        } else {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj2;
            if (!this.observationsProcessed.remove(obj, recomposeScopeImpl2) && recomposeScopeImpl2.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                if (recomposeScopeImpl2.isConditional() && !z2) {
                    this.conditionallyInvalidatedScopes.add(recomposeScopeImpl2);
                } else {
                    this.invalidatedScopes.add(recomposeScopeImpl2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void cleanUpDerivedStateObservations() {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.cleanUpDerivedStateObservations():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00a4  */
    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void recordReadOf(java.lang.Object r24) {
        /*
            r23 = this;
            r11 = r23
            boolean r0 = r23.getAreChildrenComposing()
            if (r0 != 0) goto Lb0
            androidx.compose.runtime.ComposerImpl r0 = r11.composer
            androidx.compose.runtime.RecomposeScopeImpl r10 = r0.getCurrentRecomposeScope$runtime_release()
            if (r10 == 0) goto Lb0
            r9 = 1
            r10.setUsed(r9)
            r12 = r24
            boolean r0 = r10.recordRead(r12)
            if (r0 != 0) goto Lb0
            boolean r0 = r12 instanceof androidx.compose.runtime.snapshots.StateObjectImpl
            if (r0 == 0) goto L2c
            r1 = r12
            androidx.compose.runtime.snapshots.StateObjectImpl r1 = (androidx.compose.runtime.snapshots.StateObjectImpl) r1
            androidx.compose.runtime.snapshots.ReaderKind$Companion r0 = androidx.compose.runtime.snapshots.ReaderKind.Companion
            int r0 = androidx.compose.runtime.snapshots.ReaderKind.m3769constructorimpl(r9)
            r1.m3782recordReadInh_f27i8$runtime_release(r0)
        L2c:
            androidx.compose.runtime.collection.ScopeMap<java.lang.Object, androidx.compose.runtime.RecomposeScopeImpl> r0 = r11.observations
            r0.add(r12, r10)
            boolean r0 = r12 instanceof androidx.compose.runtime.DerivedState
            if (r0 == 0) goto Lb0
            r8 = r12
            androidx.compose.runtime.DerivedState r8 = (androidx.compose.runtime.DerivedState) r8
            androidx.compose.runtime.DerivedState$Record r22 = r8.getCurrentRecord()
            androidx.compose.runtime.collection.ScopeMap<java.lang.Object, androidx.compose.runtime.DerivedState<?>> r0 = r11.derivedStates
            r0.removeScope(r12)
            androidx.collection.ObjectIntMap r0 = r22.getDependencies()
            java.lang.Object[] r7 = r0.keys
            long[] r6 = r0.metadata
            int r0 = r6.length
            int r5 = r0 + (-2)
            if (r5 < 0) goto La9
            r4 = 0
        L4f:
            r2 = r6[r4]
            long r0 = ~r2
            r13 = 7
            long r0 = r0 << r13
            long r0 = r0 & r2
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r14
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 == 0) goto La1
            int r0 = r4 - r5
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r13 = 8 - r1
            r1 = 0
        L69:
            if (r1 >= r13) goto La2
            r20 = 255(0xff, double:1.26E-321)
            r18 = -1
            long r16 = r18 - r2
            long r14 = r18 - r20
            long r16 = r16 | r14
            long r18 = r18 - r16
            r15 = 128(0x80, double:6.3E-322)
            int r14 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            if (r14 >= 0) goto La0
            int r0 = r4 << 3
            int r0 = r0 + r1
            r14 = r7[r0]
            androidx.compose.runtime.snapshots.StateObject r14 = (androidx.compose.runtime.snapshots.StateObject) r14
            boolean r0 = r14 instanceof androidx.compose.runtime.snapshots.StateObjectImpl
            if (r0 == 0) goto L9f
            r15 = r14
            androidx.compose.runtime.snapshots.StateObjectImpl r15 = (androidx.compose.runtime.snapshots.StateObjectImpl) r15
            androidx.compose.runtime.snapshots.ReaderKind$Companion r0 = androidx.compose.runtime.snapshots.ReaderKind.Companion
            int r0 = androidx.compose.runtime.snapshots.ReaderKind.m3769constructorimpl(r9)
            r15.m3782recordReadInh_f27i8$runtime_release(r0)
        L94:
            androidx.compose.runtime.collection.ScopeMap<java.lang.Object, androidx.compose.runtime.DerivedState<?>> r0 = r11.derivedStates
            r0.add(r14, r12)
            r0 = 8
        L9b:
            long r2 = r2 >> r0
            int r1 = r1 + 1
            goto L69
        L9f:
            goto L94
        La0:
            goto L9b
        La1:
            goto La4
        La2:
            if (r13 != r0) goto La9
        La4:
            if (r4 == r5) goto La9
            int r4 = r4 + 1
            goto L4f
        La9:
            java.lang.Object r0 = r22.getCurrentValue()
            r10.recordDerivedStateValue(r8, r0)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.recordReadOf(java.lang.Object):void");
    }

    private final void invalidateScopeOfLocked(Object obj) {
        Object obj2 = this.observations.getMap().get(obj);
        if (obj2 == null) {
            return;
        }
        if (obj2 instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                long j3 = (~j2) << 7;
                if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i2 << 3) + i4];
                            if (recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                                this.observationsProcessed.add(obj, recomposeScopeImpl);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        } else {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj2;
            if (recomposeScopeImpl2.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                this.observationsProcessed.add(obj, recomposeScopeImpl2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0073  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void recordWriteOf(java.lang.Object r20) {
        /*
            r19 = this;
            r11 = r19
            java.lang.Object r9 = r11.lock
            monitor-enter(r9)
            r1 = r20
            r11.invalidateScopeOfLocked(r1)     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.collection.ScopeMap<java.lang.Object, androidx.compose.runtime.DerivedState<?>> r0 = r11.derivedStates     // Catch: java.lang.Throwable -> L81
            androidx.collection.MutableScatterMap r0 = r0.getMap()     // Catch: java.lang.Throwable -> L81
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L7d
            boolean r0 = r1 instanceof androidx.collection.MutableScatterSet     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L78
            androidx.collection.MutableScatterSet r1 = (androidx.collection.MutableScatterSet) r1     // Catch: java.lang.Throwable -> L81
            androidx.collection.ScatterSet r1 = (androidx.collection.ScatterSet) r1     // Catch: java.lang.Throwable -> L81
            java.lang.Object[] r10 = r1.elements     // Catch: java.lang.Throwable -> L81
            long[] r8 = r1.metadata     // Catch: java.lang.Throwable -> L81
            int r0 = r8.length     // Catch: java.lang.Throwable -> L81
            int r7 = r0 + (-2)
            if (r7 < 0) goto L7d
            r18 = 0
            r6 = r18
        L2b:
            r4 = r8[r6]     // Catch: java.lang.Throwable -> L81
            long r0 = ~r4     // Catch: java.lang.Throwable -> L81
            r2 = 7
            long r0 = r0 << r2
            r16 = -1
            long r2 = r16 - r0
            long r0 = r16 - r4
            long r2 = r2 | r0
            long r16 = r16 - r2
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = -1
            long r2 = r12 - r16
            long r0 = r12 - r14
            long r2 = r2 | r0
            long r12 = r12 - r2
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L73
            int r0 = r6 - r7
            int r0 = ~r0     // Catch: java.lang.Throwable -> L81
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r3 = r18
        L55:
            if (r3 >= r12) goto L71
            r0 = 255(0xff, double:1.26E-321)
            long r14 = r0 + r4
            long r0 = r0 | r4
            long r14 = r14 - r0
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6d
            int r0 = r6 << 3
            int r0 = r0 + r3
            r0 = r10[r0]     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.DerivedState r0 = (androidx.compose.runtime.DerivedState) r0     // Catch: java.lang.Throwable -> L81
            r11.invalidateScopeOfLocked(r0)     // Catch: java.lang.Throwable -> L81
        L6d:
            long r4 = r4 >> r13
            int r3 = r3 + 1
            goto L55
        L71:
            if (r12 != r13) goto L7d
        L73:
            if (r6 == r7) goto L7d
            int r6 = r6 + 1
            goto L2b
        L78:
            androidx.compose.runtime.DerivedState r1 = (androidx.compose.runtime.DerivedState) r1     // Catch: java.lang.Throwable -> L81
            r11.invalidateScopeOfLocked(r1)     // Catch: java.lang.Throwable -> L81
        L7d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L81
            monitor-exit(r9)
            return
        L81:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.recordWriteOf(java.lang.Object):void");
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean zRecompose$runtime_release;
        synchronized (this.lock) {
            drainPendingModificationsForCompositionLocked();
            try {
                ScopeMap<RecomposeScopeImpl, Object> scopeMapTakeInvalidations = takeInvalidations();
                try {
                    CompositionObserver compositionObserverObserver = observer();
                    if (compositionObserverObserver != null) {
                        Map<RecomposeScopeImpl, Set<Object>> mapAsMap = scopeMapTakeInvalidations.asMap();
                        Intrinsics.checkNotNull(mapAsMap, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                        compositionObserverObserver.onBeginComposition(this, mapAsMap);
                    }
                    zRecompose$runtime_release = this.composer.recompose$runtime_release(scopeMapTakeInvalidations);
                    if (!zRecompose$runtime_release) {
                        drainPendingModificationsLocked();
                    }
                    if (compositionObserverObserver != null) {
                        compositionObserverObserver.onEndComposition(this);
                    }
                } catch (Exception e2) {
                    this.invalidations = scopeMapTakeInvalidations;
                    throw e2;
                }
            } finally {
            }
        }
        return zRecompose$runtime_release;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(MovableContentState movableContentState) {
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter slotWriterOpenWriter = movableContentState.getSlotTable$runtime_release().openWriter();
        try {
            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
            Unit unit = Unit.INSTANCE;
            slotWriterOpenWriter.close(true);
            rememberEventDispatcher.dispatchRememberObservers();
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:221:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void applyChangesInLocked(androidx.compose.runtime.changelist.ChangeList r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.applyChangesInLocked(androidx.compose.runtime.changelist.ChangeList):void");
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            } finally {
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.isNotEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            } finally {
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime_release();
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            } finally {
            }
        }
    }

    private final <T> T guardInvalidationsLocked(Function1<? super ScopeMap<RecomposeScopeImpl, Object>, ? extends T> function1) throws Exception {
        ScopeMap<RecomposeScopeImpl, Object> scopeMapTakeInvalidations = takeInvalidations();
        try {
            return function1.invoke(scopeMapTakeInvalidations);
        } catch (Exception e2) {
            this.invalidations = scopeMapTakeInvalidations;
            throw e2;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            for (Object obj : this.slotTable.getSlots()) {
                RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            if (!isComposing()) {
                this.composer.verifyConsistent$runtime_release();
                this.slotTable.verifyWellFormed();
                validateRecomposeScopeAnchors(this.slotTable);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(ControlledComposition controlledComposition, int i2, Function0<? extends R> function0) {
        if (controlledComposition != null && !Intrinsics.areEqual(controlledComposition, this) && i2 >= 0) {
            this.invalidationDelegate = (CompositionImpl) controlledComposition;
            this.invalidationDelegateGroup = i2;
            try {
                return function0.invoke();
            } finally {
                this.invalidationDelegate = null;
                this.invalidationDelegateGroup = 0;
            }
        }
        return function0.invoke();
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        CompositionImpl compositionImpl;
        if (recomposeScopeImpl.getDefaultsInScope()) {
            recomposeScopeImpl.setDefaultsInvalid(true);
        }
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (!this.slotTable.ownsAnchor(anchor)) {
            synchronized (this.lock) {
                compositionImpl = this.invalidationDelegate;
            }
            if (compositionImpl != null && compositionImpl.tryImminentInvalidation(recomposeScopeImpl, obj)) {
                return InvalidationResult.IMMINENT;
            }
            return InvalidationResult.IGNORED;
        }
        if (!recomposeScopeImpl.getCanRecompose()) {
            return InvalidationResult.IGNORED;
        }
        return invalidateChecked(recomposeScopeImpl, anchor, obj);
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(RecomposeScopeImpl recomposeScopeImpl) {
        this.pendingInvalidScopes = true;
    }

    @Override // androidx.compose.runtime.CompositionServices
    public <T> T getCompositionService(CompositionServiceKey<T> compositionServiceKey) {
        if (Intrinsics.areEqual(compositionServiceKey, CompositionKt.getCompositionImplServiceKey())) {
            return (T) this;
        }
        return null;
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime_release(recomposeScopeImpl, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00b8 A[Catch: all -> 0x00d8, EDGE_INSN: B:136:0x00b8->B:121:0x00b8 BREAK  A[LOOP:0: B:103:0x0064->B:117:0x00b0], EDGE_INSN: B:137:0x00b8->B:121:0x00b8 BREAK  A[LOOP:0: B:103:0x0064->B:117:0x00b0], TRY_LEAVE, TryCatch #0 {, blocks: (B:75:0x0005, B:77:0x000c, B:84:0x001f, B:86:0x0025, B:89:0x0029, B:91:0x002f, B:93:0x003a, B:95:0x003e, B:96:0x0046, B:98:0x0052, B:100:0x0056, B:103:0x0064, B:105:0x0081, B:107:0x008d, B:109:0x009b, B:114:0x00a8, B:117:0x00b0, B:118:0x00b3, B:121:0x00b8), top: B:134:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final androidx.compose.runtime.InvalidationResult invalidateChecked(androidx.compose.runtime.RecomposeScopeImpl r23, androidx.compose.runtime.Anchor r24, java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.invalidateChecked(androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.Anchor, java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    public final void removeObservation$runtime_release(Object obj, RecomposeScopeImpl recomposeScopeImpl) {
        this.observations.remove(obj, recomposeScopeImpl);
    }

    public final void removeDerivedStateObservation$runtime_release(DerivedState<?> derivedState) {
        if (this.observations.contains(derivedState)) {
            return;
        }
        this.derivedStates.removeScope(derivedState);
    }

    private final ScopeMap<RecomposeScopeImpl, Object> takeInvalidations() {
        ScopeMap<RecomposeScopeImpl, Object> scopeMap = this.invalidations;
        this.invalidations = new ScopeMap<>();
        return scopeMap;
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList2.get(i2);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                PreconditionsKt.throwIllegalStateException("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + ArraysKt.indexOf((RecomposeScopeImpl[]) slotTable.getSlots(), recomposeScopeImpl2));
            }
        }
    }

    private final <T> T trackAbandonedValues(Function0<? extends T> function0) {
        try {
            T tInvoke = function0.invoke();
            InlineMarker.finallyStart(1);
            InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    private final CompositionObserver observer() {
        CompositionObserverHolder compositionObserverHolder = this.observerHolder;
        if (compositionObserverHolder.getRoot()) {
            return compositionObserverHolder.getObserver();
        }
        CompositionObserverHolder observerHolder$runtime_release = this.parent.getObserverHolder$runtime_release();
        CompositionObserver observer = observerHolder$runtime_release != null ? observerHolder$runtime_release.getObserver() : null;
        if (!Intrinsics.areEqual(observer, compositionObserverHolder.getObserver())) {
            compositionObserverHolder.setObserver(observer);
            return observer;
        }
        return observer;
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        synchronized (this.lock) {
            boolean z2 = this.slotTable.getGroupsSize() > 0;
            if (z2 || !this.abandonSet.isEmpty()) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:deactivate");
                try {
                    RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                    if (z2) {
                        this.applier.onBeginChanges();
                        SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                        try {
                            ComposerKt.deactivateCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
                            Unit unit = Unit.INSTANCE;
                            slotWriterOpenWriter.close(true);
                            this.applier.onEndChanges();
                            rememberEventDispatcher.dispatchRememberObservers();
                        } catch (Throwable th) {
                            slotWriterOpenWriter.close(false);
                            throw th;
                        }
                    }
                    rememberEventDispatcher.dispatchAbandons();
                    Unit unit2 = Unit.INSTANCE;
                } finally {
                    Trace.INSTANCE.endSection(objBeginSection);
                }
            }
            this.observations.clear();
            this.derivedStates.clear();
            this.invalidations.clear();
            this.changes.clear();
            this.lateChanges.clear();
            this.composer.deactivate$runtime_release();
            Unit unit3 = Unit.INSTANCE;
        }
    }

    public final int composerStacksSizes$runtime_release() {
        return this.composer.stacksSize$runtime_release();
    }

    /* JADX INFO: compiled from: Composition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLш|\u0004O'8\u000bDB\u0007\"2\u0012\u007f\u0007|jAӄLeVMZS8şs{:%c$\bCCU0}*\tUNog\u0005Jb\u000bQ\u000f\u000e\u0016~k4Ic~e\u0012\u0015;HoU\u074c}ok8!\u0006F\u000f.2:>\n\u0007\u0011\u001aXJ>wټGK\u001a\u0015xf~Lj\r{\u0016J\u0016\u0014Q8\u0001Li\u0018RD\\\u0005]hDS\u0007wXf'\u000eE-Q\u001b]l';\f(2sDEM-%\u0002\u0014OViX\u001b? NMl5ACI\"h~~\u000e/-+}\u001e\u000ev4o\u001dQ\u000f\u000eW/]wcP<=(~\n#T\u0004<\u001bWL<D2f6#y\t;aNl\u001a^p\u0011+eD+=\u007fa@\u007f\u001b/woX1Ne\r5\u0011,6\u0019nOc\u0005\u0012n)3T&faUNS`N8nmq\u0012\bz\u0002X\u0019vGHU\n\u001cF\u0017SH\f=14\u0004\u0002vQ\u0018z\u0013t\u0001S\u0018gxD0\u0005.7X\u001e<^R{\u001dk~i\u001f@Y[*b\u001f}6$P`\u0006O9%>P\u0016|2~[{\"%]wgc|\u000b&]I`C5\u007ft>q\u0019\u000bdQJb\u001d^vDc\f\t^V#\tʎlݻ{{L\u0088\\\u001f@C\n\u001cb1\bǌ^ČL\u0003&Փ\u0012\u000f\u0017ern \u0001d3R\u000b\u0018+Kժ\u0003˩`pwΟI[:\u0006x(=Ca5G.\u0004)?ؗ~ɠ\u000b~{Ò\u0018sZQdlDz,ݫ\"ک\u001e9Yǽ\u000e'\u001d\nA:\u0012/UL!rgL@3Qۣ\u0006ӛ?h6ԖX|~:xpZQd\u0017Px\ryyΫfѣ}aNک\u0018{b\u001asJYz\u0013_LPH|30L5/vxğ7ԩG'%ȶ߹\u0018O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0012UNB*!\u001e\u001dhi6\u0007p\f_v0V+R:gN\u0002;\u0017\u0012gc", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "/aP;W6GW\"\u0001", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-!j$.ZT;x\n", "uKY.i(\bc(\u0003\u0002(\u001a|\u0018\u0005)p", "/ec2e:", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.D@\u0002.FC", ":dPC\\5@", "", "", ">d]1\\5@", ">qX<e0MW\u0019\r", "@d[2T:B\\\u001b", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=#", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}\tAl\u0016\u0015QD;iH\u001c\u001ch?5\u000ej)Jt-\u001d", "@d\\2`)>`\u001d\b|", "AhS28-?S\u0017\u000e\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "2dP0g0OO(\u0003\u0004`", "7mbAT5<S", "3mS\u001fX3:b\u001d\u0010zH9{\t<", "", ">qX<e0Mg", "3mS\u001fX3:b\u001d\u0010z:-\f\t<", "2hb=T;<Vt{vg+\u0007\u0012=", "2hb=T;<V\u0006~\u0003^4y\t<O|6{M\u0012\u0017$U", "2hb=T;<V\u0007\u0003y^\f}\n/c\u000f6", "4na4X;MW\"\u0001", ">q^0X:L>\u0019\byb5~o/a\u0011,\u0005B", "@dR<e+%S\u0015\u0010~g.", "AhS28-?S\u0017\u000e", "3eU2V;", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class RememberEventDispatcher implements RememberManager {
        private final Set<RememberObserver> abandoning;
        private MutableScatterSet<ComposeNodeLifecycleCallback> releasing;
        private final List<RememberObserver> remembering = new ArrayList();
        private final List<Object> leaving = new ArrayList();
        private final List<Function0<Unit>> sideEffects = new ArrayList();
        private final List<Object> pending = new ArrayList();
        private final MutableIntList priorities = new MutableIntList(0, 1, null);
        private final MutableIntList afters = new MutableIntList(0, 1, null);

        public RememberEventDispatcher(Set<RememberObserver> set) {
            this.abandoning = set;
        }

        @Override // androidx.compose.runtime.RememberManager
        public void remembering(RememberObserver rememberObserver) {
            this.remembering.add(rememberObserver);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void forgetting(RememberObserver rememberObserver, int i2, int i3, int i4) {
            recordLeaving(rememberObserver, i2, i3, i4);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void sideEffect(Function0<Unit> function0) {
            this.sideEffects.add(function0);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void deactivating(ComposeNodeLifecycleCallback composeNodeLifecycleCallback, int i2, int i3, int i4) {
            recordLeaving(composeNodeLifecycleCallback, i2, i3, i4);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void releasing(ComposeNodeLifecycleCallback composeNodeLifecycleCallback, int i2, int i3, int i4) {
            MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSetMutableScatterSetOf = this.releasing;
            if (mutableScatterSetMutableScatterSetOf == null) {
                mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
                this.releasing = mutableScatterSetMutableScatterSetOf;
            }
            mutableScatterSetMutableScatterSetOf.plusAssign(composeNodeLifecycleCallback);
            recordLeaving(composeNodeLifecycleCallback, i2, i3, i4);
        }

        public final void dispatchRememberObservers() {
            processPendingLeaving(Integer.MIN_VALUE);
            if (!this.leaving.isEmpty()) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
                try {
                    MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSet = this.releasing;
                    for (int size = this.leaving.size() - 1; -1 < size; size--) {
                        Object obj = this.leaving.get(size);
                        if (obj instanceof RememberObserver) {
                            this.abandoning.remove(obj);
                            ((RememberObserver) obj).onForgotten();
                        }
                        if (obj instanceof ComposeNodeLifecycleCallback) {
                            if (mutableScatterSet != null && mutableScatterSet.contains((ComposeNodeLifecycleCallback) obj)) {
                                ((ComposeNodeLifecycleCallback) obj).onRelease();
                            } else {
                                ((ComposeNodeLifecycleCallback) obj).onDeactivate();
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
            if (this.remembering.isEmpty()) {
                return;
            }
            Object objBeginSection2 = Trace.INSTANCE.beginSection("Compose:onRemembered");
            try {
                List<RememberObserver> list = this.remembering;
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    RememberObserver rememberObserver = list.get(i2);
                    this.abandoning.remove(rememberObserver);
                    rememberObserver.onRemembered();
                }
                Unit unit2 = Unit.INSTANCE;
            } finally {
            }
        }

        public final void dispatchSideEffects() {
            if (this.sideEffects.isEmpty()) {
                return;
            }
            Object objBeginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
            try {
                List<Function0<Unit>> list = this.sideEffects;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.get(i2).invoke();
                }
                this.sideEffects.clear();
                Unit unit = Unit.INSTANCE;
            } finally {
                Trace.INSTANCE.endSection(objBeginSection);
            }
        }

        public final void dispatchAbandons() {
            if (this.abandoning.isEmpty()) {
                return;
            }
            Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
            try {
                Iterator<RememberObserver> it = this.abandoning.iterator();
                while (it.hasNext()) {
                    RememberObserver next = it.next();
                    it.remove();
                    next.onAbandoned();
                }
                Unit unit = Unit.INSTANCE;
            } finally {
                Trace.INSTANCE.endSection(objBeginSection);
            }
        }

        private final void recordLeaving(Object obj, int i2, int i3, int i4) {
            processPendingLeaving(i2);
            if (i4 >= 0 && i4 < i2) {
                this.pending.add(obj);
                this.priorities.add(i3);
                this.afters.add(i4);
                return;
            }
            this.leaving.add(obj);
        }

        private final void processPendingLeaving(int i2) {
            if (this.pending.isEmpty()) {
                return;
            }
            int i3 = 0;
            int i4 = 0;
            List listMutableListOf = null;
            MutableIntList mutableIntList = null;
            MutableIntList mutableIntList2 = null;
            while (i4 < this.afters.getSize()) {
                if (i2 <= this.afters.get(i4)) {
                    Object objRemove = this.pending.remove(i4);
                    int iRemoveAt = this.afters.removeAt(i4);
                    int iRemoveAt2 = this.priorities.removeAt(i4);
                    if (listMutableListOf == null) {
                        listMutableListOf = CollectionsKt.mutableListOf(objRemove);
                        mutableIntList2 = new MutableIntList(0, 1, null);
                        mutableIntList2.add(iRemoveAt);
                        mutableIntList = new MutableIntList(0, 1, null);
                        mutableIntList.add(iRemoveAt2);
                    } else {
                        Intrinsics.checkNotNull(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        Intrinsics.checkNotNull(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        listMutableListOf.add(objRemove);
                        mutableIntList2.add(iRemoveAt);
                        mutableIntList.add(iRemoveAt2);
                    }
                } else {
                    i4++;
                }
            }
            if (listMutableListOf != null) {
                Intrinsics.checkNotNull(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                Intrinsics.checkNotNull(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                int size = listMutableListOf.size() - 1;
                while (i3 < size) {
                    int i5 = i3 + 1;
                    int size2 = listMutableListOf.size();
                    for (int i6 = i5; i6 < size2; i6++) {
                        int i7 = mutableIntList2.get(i3);
                        int i8 = mutableIntList2.get(i6);
                        if (i7 < i8 || (i8 == i7 && mutableIntList.get(i3) < mutableIntList.get(i6))) {
                            CompositionKt.swap(listMutableListOf, i3, i6);
                            CompositionKt.swap(mutableIntList, i3, i6);
                            CompositionKt.swap(mutableIntList2, i3, i6);
                        }
                    }
                    i3 = i5;
                }
                this.leaving.addAll(listMutableListOf);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0058, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005f  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean observesAnyOf(java.util.Set<? extends java.lang.Object> r19) {
        /*
            r18 = this;
            r1 = r19
            boolean r0 = r1 instanceof androidx.compose.runtime.collection.ScatterSetWrapper
            r17 = 0
            r16 = 1
            r4 = r18
            if (r0 == 0) goto L64
            androidx.compose.runtime.collection.ScatterSetWrapper r1 = (androidx.compose.runtime.collection.ScatterSetWrapper) r1
            androidx.collection.ScatterSet r0 = r1.getSet$runtime_release()
            java.lang.Object[] r9 = r0.elements
            long[] r8 = r0.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L85
            r6 = r17
        L1d:
            r2 = r8[r6]
            long r0 = ~r2
            r5 = 7
            long r0 = r0 << r5
            long r0 = r0 & r2
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r10
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r5 == 0) goto L5f
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r10 = 8 - r0
            r5 = r17
        L38:
            if (r5 >= r10) goto L5d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r2
            r12 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L59
            int r0 = r6 << 3
            int r0 = r0 + r5
            r1 = r9[r0]
            androidx.compose.runtime.collection.ScopeMap<java.lang.Object, androidx.compose.runtime.RecomposeScopeImpl> r0 = r4.observations
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L58
            androidx.compose.runtime.collection.ScopeMap<java.lang.Object, androidx.compose.runtime.DerivedState<?>> r0 = r4.derivedStates
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L59
        L58:
            return r16
        L59:
            long r2 = r2 >> r11
            int r5 = r5 + 1
            goto L38
        L5d:
            if (r10 != r11) goto L85
        L5f:
            if (r6 == r7) goto L85
            int r6 = r6 + 1
            goto L1d
        L64:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r2 = r1.iterator()
        L6a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r1 = r2.next()
            androidx.compose.runtime.collection.ScopeMap<java.lang.Object, androidx.compose.runtime.RecomposeScopeImpl> r0 = r4.observations
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L84
            androidx.compose.runtime.collection.ScopeMap<java.lang.Object, androidx.compose.runtime.DerivedState<?>> r0 = r4.derivedStates
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L6a
        L84:
            return r16
        L85:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.observesAnyOf(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:271:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0189 A[EDGE_INSN: B:302:0x0189->B:459:0x010a BREAK  A[LOOP:13: B:292:0x0141->B:303:0x018b]] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x02b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void addPendingInvalidationsLocked(java.util.Set<? extends java.lang.Object> r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 1037
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.addPendingInvalidationsLocked(java.util.Set, boolean):void");
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(List<Pair<MovableContentStateReference, MovableContentStateReference>> list) {
        int size = list.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = true;
                break;
            } else if (!Intrinsics.areEqual(list.get(i2).getFirst().getComposition$runtime_release(), this)) {
                break;
            } else {
                i2++;
            }
        }
        ComposerKt.runtimeCheck(z2);
        try {
            this.composer.insertMovableContentReferences(list);
            Unit unit = Unit.INSTANCE;
        } finally {
        }
    }

    private final <T> T guardChanges(Function0<? extends T> function0) throws Exception {
        try {
            try {
                T tInvoke = function0.invoke();
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                return tInvoke;
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                InlineMarker.finallyEnd(1);
                throw th;
            }
        } catch (Exception e2) {
            abandonChanges();
            throw e2;
        }
    }
}
