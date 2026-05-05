package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition.TransitionAnimationState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Lambda;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:254)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яħ\u0014D߬)\u001ew\u0006L܀kt\u0012F\u000e0\u00111J~8,\u001aw\rir9FDmHDR[*\u001dk\u0004é,[:qK;[\u001a\u0006\"\u001fOVʴonXf\u0013C\u0015\b\u001ex\u0001,QU~]\u001a\u000fHBw?IMw=?`|6\u001b :\"Ny\r\u00010*P\u0010\rzKŷ\u0014\u0012F@x:X\u0011U\u00050\u0012\u000ē(\u00014\\oޮ>H\u0003]Bǂ+\u0003\u007fBVϋg0\u0013M\u0015FZ'\u0015vw\u001e3¨?5+%[\u0003\rZc?\u0019?y=\u000bm?X9Y\f]FZ\u0010\u0014[=}\u001e}t,ؘ\u0013c\u0011\u00165>gi[R\u001e(>\r*!l\f\u0014\u00065]F/0e6$yyɤW@^\u0019vm\u000e\u0013y<''\u00103qKIwqcAϊ\\I,\t\u001b7;\u000153\f\\\u0014`#0lyg0\u007fV\u0004Mݳ\u000eYK\b\u001c\"p\u001aB\n@I\u0010/B#\\(E9aݽ13\u001c\fVW\u007f|\u0015bxS0dv[Rv\u001c78\u001e$\\Zc3\u0002\u0017Yг0\u0011[8l\u0378|\u001608b\b>1%>m}\u0007\nlSΪ\u0018EWlG[~kTwgoc]Wk\u001e\u0003j\u0019$GLh\u0015ZvB\u001a,\t~8*BNz\u0012\b{rm:6`Lۇ 42UǬ`\u0015N(NHG|\u0017trh>\u0015\u0005W2)\u0002D\u0005\u001a\u0011_#\u0011״k\u0003OS\rf(UQS;\u001fL~2jD|Q&-\u0001õKgRk\u0013̆\u001c\u0091Y{.@2ߜP=h+\u0015\u000f+B\u0002[Fz\u0011\u0006SSȼ5\u001b%\u007f\u001f=x..(\u0019\u0002\\\tpR]u/D\u0007f\u0003)\u0018f\u0010y(f)is\\\u001baNK\u0003\u0003\b=|[+\u0012ȷ\"%\u0007\u0014ݕ\u000153hW#\u001cw\"D-a\f\u007f R\b\t'F\u0005v\u0014;*6̔f[cYK>O\u0002\u000f@(*\u0013,RJzw6C7A٢7HG\t7ޑ>Ԫ\u000f/\f\u0011\u001f\u0530\f~\u0003s@#q\u000e4\\^X\u0012c\u007f\u001a٫QE9Sci}m\u0012|9[?2\u0011\u0004?\u0010*>M(f]r\u000b@\u0006:8dcKj\u0015B\u0019&D,j\u00079f\u0003vѕ\u0014z\u0006jݍ\u0013\u00178g$A\\\u000eb\u000etVv\u001b\u0011inGB!\u000f C-?Ṵ\twL{?i8)c\u001f\u000f!\u0011x\u000fh5+rSg(Ϝ\\\u0001\u0011i$ťOΜ:\u0004US\u0006£n\u001ae0\u0003-D(\u001bg\u007f?}\u00172dΗc\u0005vj\u0007\u0014vR\u0015BW\u0010+%\u0014D\u00180#;_z\u007fh=N^w}cH#'L9\r\u001c~sFI[4X[Jƹn\u0014- \u009cW;\u0004-P&-\u0004\u00036tW<|:\u0002)`.\u0012&s\u0012\u0018Ypܣ\b8P\u001c\u0003\u001040FQ\b9(<n[{wOnU8˭\nBQ\r?ƅiؼgnc5\u001bϢ0d)\u00073`\u001f\u0019'{^Avz<\u0017֦.x9\u0006$\u00176\u001f|(\u0011:@wip~\rg}\u001d3?q:cA0\u0019>,A\n}\u00140d*%;\u0005}l\b7i\u05cfFW\u0014\u0003Ɉ,dz1Y\u001a\u0003~Vs)\u0013b\\#BrUO9/l\u001dV''ʺIS,HAXECG4\u0011uN !\u0005Jb#0XO֟v\u007fmPsýZٗ\u001e'gN\u0006ѩ\u00024|]>R\n<\u0011<C]xX\"Dю(<cWCC)\u0011G5f\u0017 /\u001f=xrkG:\t\r\u0007\u001dA\n12Z\"Y\u0003+?\u0015\u007f\u001dgfiWc\tz4ڧ\u0006eP#ߚgV\u0015\u0007\\O;E,\u000fm@. OH2,\u000eC\u0010VAWp\u007fЪD`y~\u0014,0^~F)M\u0013\"\u0004\f<iF&\u0013hɈ8A\u00018_ܚDЃ1l\u0015oeˋx\u0019w%K$9\u001f\u0006WgE\u001b0Qw˟9i\u001bS?^m<Y\u00142Kb\n<\u0002UaqL\u00165\"Zslzm\u0018\u007f>Z\"\u0015\u001d\n\b3b`.\u0015K;UXŗJ6b\u001d³Eb\u0011e?*d.P!#\u0006DDx;\u0010$b\u0001%$CV:aۊ\u0016`\u0002H-\u0017aM\u0016'mpmhesh=gg9zՕ\\5k\u0001Kȁ'ʢh+#*\u0003ݟ-U\fV :Z\u0016\u000es\u001bv.dzJ٪{PX6`\u0001jC$!J0m}\u001bm\rSzYkl!1GY~R\u001cC[\u001b\u0012\u000b G)\u0015\u001b\u001e\u0002o`F\"\u001aжB{\u000e\u0001ƖY|sn@\tgJ/D\u001e?]W{\u0011d\fW9gP\u000f\u001bfGդ\n\u001d*\nw\u0019o62a\tR\\\u007f9J[Y?\u001dpw٠~t\u0012RRޓ[ΤA\u0006\u001f\r4\u07b4:mwD4\u0001\u000bWO1\u000eX\u0004\u0010hzɾ[eKw\u001f=?\u00041iU_\"'y\\\u0007w?]6B#\u0002`=Tr,X7j/asozs\u001br![Dkv\u001d(.\u0017\rDkL]`\u000f)n_\u0004+STbO\u0001\u001fjQ\u0018rr<)FH1+/$yn\u008d\u00187J\u001bƛk3@G\u0012(Y]3\\b\u0006<\u0001\u0012\u001c#\"uSF\u001e\u007f;C5҂Bpx+|\u000bSX\u0014m58l\u0004P\u001e=Zm\u007f\u0017\u0015ɱ\u0012\f\u0003)r̼Y\u0092Uu-/|Y1[2Gg;W!Y\u0015GM(4Së\t\u000fx^+-\n\u0018G\u0018R}El\b\u0014*D\bwU4k3A}\u0018\u000eP1yP\u001c\u0004Z4_x)1Ґ2W}.iB_i\u0012\f(/JG%)\u0012Hz\\`/ә\u0005\u000f<<\u0011ըtޓ)\tsLG4\u0004OJsNuv].FoNu_\u0005Ч;O\u0012\nQH{\u0011SM\u001eK&:\u0016l\u001c\u0007\fAbXJ\u00076\u0016a\u0014\u0002ysB]\n8fB/R{u\u0019Ziץ2\u001ah+\u0007L\u0005\u0016y&M\u0018\u001d\u0014KP\u0004+3@k\u0018\u000f.PA\u0019r-7\u0018e\u0013\u001cd\u0013.Џ@^2\u0011NWt ;\b\u000bKrR>9s2hQ%]\u0014g*qPxx{6i\"\u0004&8-\u007f{K\u001du`^{ \rD\u0006)\u0014'|d q^H\u000ebф$/iO&6t\u0015h\u0013Q\t|.=\t!5_\u0017\bȇSB=Ek\u0018u\u0017VrA]v\f\rzL(\u0004a72\u000e\u0006g3o0F\u00122Q\u0018t\"F\u007fy\u000f\u000b`\u0013R,s8\u0016_\u001dk\\\u0007E\n\bCmv!)92wjR\u0007\u001d%g:\u001b\u001a8a3K\u001ePX&Q(\u000f\u001b\u001c\u001fV\u001bч)\t;\u001e\u0017\u0007(Ĝ( \u0004\u000f\u0016Ԃeбbw\b̃i<>s!MznT҇=эnwfƃo}J_\u0017wdF~ԨxͰ?\u0014jǌd3i+\\\u0017<\u001fuڽv\u05fa\u0010n8ٰ|t\fs\u000fR\u0011\u00137ΝAϝ\\@=ؿC\r4\u0006\u0019\tQ^\u0002¯\u0011ЀYFlݯ\u0007\u0010^I*^#E ;^ӓڲ\u0004ךOo:\u001e?S\b,\u00046F*8k4@s\u0018%\\`3*:o<(:j)\u00042\u000f\u0017?O\u0019\u0002ZŢHąv\txީډM-"}, d2 = {"\u000fmX:T;B]\"]z[<~g?r{7\u007fJ\n\u0005\u0015Cv\u000e", "", "\u001cnA2f,M", "", " db2g\bGW!z\nb6\u0006v8a\u000b", " db2g\bGW!z\nb6\u0006v8a\u000b\u0006\fM\u000e\u0017 V", " db2g\bGW!z\nb6\u0006v8a\u000b\u0017wM\u0003\u0017&", " db2g\u0015HA\"z\u0006", "!dT8T)ES\u0007\u000evm,f\u0006=e\r9{M", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0003w]H\u0007M)\\v4XL[\u0002", "5dc X,DO\u0016\u0006zL;x\u0018/O|6{M\u0012\u0017$", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fwOH\u0003r,8s5GY_,i(", "!dT8T)ES\u0007\u000evm,f\u0006=e\r9{M?\u0016\u0017No\u00108\u0006%", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "!dT8T)ES\b\fvg:\u0001\u00183o\t\u0016\u000b<\u0010\u0017\u0006Q~\nCU5BU\r$Avs1IL=k3", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000e7m\u001c*JJ;ZA\u001a\u001eveH\u000bm5<\u0006#VL$", "", "@d\\2`)>`\b\fvg:\u0001\u00183o\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "\"", "BqP;f0MW#\bhm(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\f$dp9\\", ":`Q2_", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'\u0003w]H\u00079\u0013Sr8C\u0016U(eT<+#\u001f^\u0017P\u0001s\u0001b@1xH62Q*S\nFr\u000f\f_\u001bEs\u007fF^\u0010\u0011W\u001f}L3vFf5]+\u0005,^3c\u0019i![M\u0004\"\u001ey$%vPw\u0006\u0005W\u0019na}qp\u0011\u0017\u0005E$\b\\hBN}YKx1(!", "CoS.g,-`\u0015\b\tb;\u0001\u00138", "B`a4X;,b\u0015\u000ez", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011Y^5kVz=]od\u0016Y5\u001b\u0005f\u0017\bR\b\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYC\u0003\u0019}=8lPb)wQNE,\u0019q\bh+`I>.\u001dG", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\bG|\u0012+TC*x0'#lp=\u0011l\u001a]r6G\"", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u001f}%*JJ;ZA\u001a\u001eveH\u000bm5<\u0006#VL$\u0013aN\u00049]\u0019V\u0017Ptz\u0014fE-p\u001a\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYT\n\u001e\u0005E1h\u00107i\u0002RKSb7:oC`C6C#!{\u001d\u001a{\u001a,\u0014\u0004^\u001b\u0001RCcpK!vG(Hv%DO|U\u0006c4\u001bT\n{!6b}\u0001", "/mX:T;>2$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "!", "BqP;f0MW#\bhi,z", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\\u0003hcA\u0007l;$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "B`a4X;/O \u000fz;@j\u0018+t\u007f", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "AsPAX", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0005tn1E\u001372\b\b\u001f\u0010~X\u007fOZ\u0019IO{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013I)wn[xtqK\u0018\u000e\u0002\"HufPSo\u001fI\u00050.O\u0004w[\u0010b|6~;\u0004A\u007f\u001aHH2c!=k\u0003\u0019+o\u000b%0>G\u001dMK-\u0003|G\u001dl'aQ{q1@\u0019;", "/mX:T;>4 \tvm", "/mX:T;>7\"\u000e", "/mX:T;>7\"\u000ed_-\u000b\t>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "/mX:T;>7\"\u000ehbA|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "/mX:T;>=\u001a\u007f\t^;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "/mX:T;>@\u0019|\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "/mX:T;>A\u001d\u0014z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "/mX:T;>D\u0015\u0006\u000b^", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "Bx_266Gd\u0019\f\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u000ec\u0012V'\u001c\tcJmlND\u001fQ\u001b[\f-d\u0015i \u0017Fj}QV\u001d\u001d`\u001b\u007fP0lO#d\u000bO\u000bFr3b\u001bc'eH\u0004\u0005$z\u0017*lZ7WQ:\u0016ncu1nC\"|\u0002\u0012Mz_OGE<B~6&O\u0005A\u0017C`>,\u00056\u0002C.@m\u0013\u0015H(G\\\b\u00196e\u000f|\r2E\u0012LUgt\u007f\b\fr'l\u0012\u001cb~>)ntgP\u000fP;!c@km\u0001D(i\"\rV\u00110E\fL_x(R\u0005.upSQ\u001b\u001e\u000e*yS&g\u0011Lpu\u0014+.k", "1qT.g,\u001cV\u001d\u0006yM9x\u0012=i\u000f,\u0006I", "BqP;f-H`!m\u0005</\u0001\u0010.S\u000f$\u000b@", ">`a2a;,b\u0015\u000ez", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jOf5\u0018_uUr0I\u0016<;iV{?ix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0015O{qJ(uP]^\r\u0011?Oj5n\u001a_fiJC3\u0018y\u0019dFZ6\u0015\u0006a\u0011\u007f(]K+.\u0015\u000471HqZY\u000fm_D\u007f1-KEs\u001b6`p:x7\r}(@q\u0005\u0015V%:g\u0007\u0019;`K0{", "1qT.g,\u001cV\u001d\u0006yM9x\u0012=i\u000f,\u0006Id &G|\u00178}", "7mXA\\(EA(z\n^", "1gX9W\u0013:P\u0019\u0006", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jOf5\u0018_uUr0I\u00168)aRpLix_\n_'V\fUJ&8.4$\b*XW\"m|\u001d\u0012W<fyD }V\u0007\u0019~C~OBb^\u0007QEDusb\u0016g(fH:m!\u0002\"*lX.SY]\u0019}\\\bgt\u001d|>\u001f GlhPInh\u0006r1'V\u0006\u0006\u0012{T}/|)\u001384?.\u0003Ut\u0018\bM\u0006\u00115jE6*@Eh", "1qT.g,\u001dS\u001a~\bk,{d8i\b$\u000bD\u000b ", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\shb9\u0014p,MR0KTJ;`\\{\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u000ec\u0012V'\u001c\tcJmlND\u001fQ\u001b[\f-d\u0015i \u0017Fj}QV\u001d\u001d`\u001aqR%2MUh{\u0011/To.m\u000e5\u0004XC91\u001eu\u0018.2N8\u0012\u0007]\u001fr\u001c\u0007wpV\u001d\u00038m\u001cwcQO}UIJ\u000b\u0003\u000fbs\u001b1e~/s@M24>o\u000fYga:g|\u001d(kE1/\u007f:\u001dLK-dy:\u0017v#p\f\u0018ks\u0010\u0019fepU\u000f\u00069 _=]n\u0005A[[", "1qT.g,-`\u0015\b\tb;\u0001\u00138A\t,\u0004<\u0010\u001b!P", "7mXA\\(ED\u0015\u0006\u000b^", "B`a4X;/O \u000fz", "/mX:T;B]\"l\u0006^*", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jOf5\u0018_uUr0I\u00168)aRpLix_\n_'V\fUJ&8.4$\b*XW\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004ArdO]guVEOksb\u0016l\u001d&\u001b>-\u0018\u0001\u0019vqT6\u0006\u000bW\u001b{@\u0005ge\u001d\u007fvA#Kw_EX9SF|2)Y{A\u000e;\\|'\u00041\u000e=s4n\u0012K1\u0007Phj\u0011@:K076I\"?X9\\q:\u001fdhh\u0004\u0017d~\u001f(rilJdmY ZBkc\u007fJ\u001c\u0004HQz\u001f5FHOk\u0003$\r\u000f$7CSK&^\u000f\u001a}\u001a\u0006#w~\fe%&2\u0015P#\rr2jA[\u0013RuH\u0015\u000b]K\u0015:6\u001fiZr1", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;
    private static final float NoReset = -1.0f;
    private static final float ResetAnimationSnap = -3.0f;
    private static final float ResetAnimationSnapCurrent = -4.0f;
    private static final float ResetAnimationSnapTarget = -5.0f;
    private static final float ResetNoSnap = -2.0f;
    private static final Function1<SeekableTransitionState<?>, Unit> SeekableTransitionStateTotalDurationChanged = new Function1<SeekableTransitionState<?>, Unit>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableTransitionStateTotalDurationChanged$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SeekableTransitionState<?> seekableTransitionState) {
            invoke2(seekableTransitionState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SeekableTransitionState<?> seekableTransitionState) {
            seekableTransitionState.onTotalDurationChanged$animation_core_release();
        }
    };
    private static final Lazy SeekableStateObserver$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<SnapshotStateObserver>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableStateObserver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final SnapshotStateObserver invoke() {
            SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new Function1<Function0<? extends Unit>, Unit>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableStateObserver$2.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
                    invoke2((Function0<Unit>) function0);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Function0<Unit> function0) {
                    function0.invoke();
                }
            });
            snapshotStateObserver.start();
            return snapshotStateObserver;
        }
    });

    public static final <T> Transition<T> updateTransition(T t2, String str, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 2029166765, "C(updateTransition)P(1)92@3848L51,93@3915L22,94@3971L190,94@3942L219:Transition.kt#pdpnli");
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2029166765, i2, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:91)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -659287595, "CC(remember):Transition.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Transition(t2, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<T> transition = (Transition) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        int i4 = (i2 + 8) - (8 | i2);
        int i5 = (i4 + 48) - (i4 & 48);
        int i6 = (-1) - (((-1) - i2) | ((-1) - 14));
        transition.animateTo$animation_core_release(t2, composer, (i5 + i6) - (i5 & i6));
        ComposerKt.sourceInformationMarkerStart(composer, -659283520, "CC(remember):Transition.kt#9igjgp");
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final Transition<T> transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.onDisposed$animation_core_release();
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.DisposableEffect(transition, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return transition;
    }

    public static final SnapshotStateObserver getSeekableStateObserver() {
        return (SnapshotStateObserver) SeekableStateObserver$delegate.getValue();
    }

    public static final <T> Transition<T> rememberTransition(TransitionState<T> transitionState, String str, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 1643203617, "C(rememberTransition)P(1)821@34295L94,836@35019L190,836@34990L219:Transition.kt#pdpnli");
        if ((i3 + 2) - (i3 | 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1643203617, i2, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:820)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 587423396, "CC(remember):Transition.kt#9igjgp");
        int i4 = ((-1) - (((-1) - i2) | ((-1) - 14))) ^ 6;
        boolean z2 = true;
        boolean z3 = (i4 > 4 && composer.changed(transitionState)) || (6 & i2) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Transition((TransitionState) transitionState, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<T> transition = (Transition) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (transitionState instanceof SeekableTransitionState) {
            composer.startReplaceGroup(1030413636);
            ComposerKt.sourceInformation(composer, "825@34526L382,825@34452L456");
            T currentState = transitionState.getCurrentState();
            T targetState = transitionState.getTargetState();
            ComposerKt.sourceInformationMarkerStart(composer, 587431076, "CC(remember):Transition.kt#9igjgp");
            if ((i4 <= 4 || !composer.changed(transitionState)) && (i2 & 6) != 4) {
                z2 = false;
            }
            Object objRememberedValue2 = composer.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function2) new TransitionKt$rememberTransition$1$1(transitionState, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            EffectsKt.LaunchedEffect(currentState, targetState, (Function2) objRememberedValue2, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1030875195);
            ComposerKt.sourceInformation(composer, "834@34941L38");
            transition.animateTo$animation_core_release(transitionState.getTargetState(), composer, 0);
            composer.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerStart(composer, 587446660, "CC(remember):Transition.kt#9igjgp");
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final Transition<T> transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.onDisposed$animation_core_release();
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.DisposableEffect(transition, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return transition;
    }

    @Deprecated(message = "\u0018Y\u0001t\u0004y\"\\eI-\rD'-\\oU\u001d0\u0014vS\u001b6O|}by%j", replaceWith = @ReplaceWith(expression = "rememberTransition(transitionState, label)", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Transition<T> updateTransition(MutableTransitionState<T> mutableTransitionState, String str, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 882913843, "C(updateTransition)P(1)875@36666L32:Transition.kt#pdpnli");
        if ((i3 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(882913843, i2, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:873)");
        }
        Transition<T> transitionRememberTransition = rememberTransition(mutableTransitionState, str, composer, i2 & 126, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return transitionRememberTransition;
    }

    public static final <S, T, V extends AnimationVector> Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(final Transition<S> transition, TwoWayConverter<T, V> twoWayConverter, String str, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -1714122528, "C(createDeferredAnimation)P(1)1780@72634L58,1781@72724L75,1781@72697L102:Transition.kt#pdpnli");
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            str = "DeferredAnimation";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1714122528, i2, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1779)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1378234273, "CC(remember):Transition.kt#9igjgp");
        int i4 = (14 & i2) ^ 6;
        boolean z2 = true;
        boolean z3 = (i4 > 4 && composer.changed(transition)) || (-1) - (((-1) - i2) | ((-1) - 6)) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = transition.new DeferredAnimation(twoWayConverter, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<S>.DeferredAnimation<T, V> deferredAnimation = (Transition.DeferredAnimation) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -1378231376, "CC(remember):Transition.kt#9igjgp");
        if ((i4 <= 4 || !composer.changed(transition)) && (i2 + 6) - (i2 | 6) != 4) {
            z2 = false;
        }
        boolean zChangedInstance = composer.changedInstance(deferredAnimation) | z2;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final Transition<S> transition2 = transition;
                    final Transition<S>.DeferredAnimation<T, V> deferredAnimation2 = deferredAnimation;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.removeAnimation$animation_core_release(deferredAnimation2);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.DisposableEffect(deferredAnimation, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            deferredAnimation.setupSeeking$animation_core_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return deferredAnimation;
    }

    public static final <S, T> Transition<T> createChildTransition(Transition<S> transition, String str, Function3<? super S, ? super Composer, ? super Integer, ? extends T> function3, Composer composer, int i2, int i3) {
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart(composer, 1215497572, "CC(createChildTransition)1813@74138L36,1814@74198L74,1815@74295L39,1816@74346L63:Transition.kt#pdpnli");
        boolean z2 = true;
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            str2 = "ChildTransition";
        }
        ComposerKt.sourceInformationMarkerStart(composer, 272027253, "CC(remember):Transition.kt#9igjgp");
        int i4 = (-1) - (((-1) - i2) | ((-1) - 14));
        if (((i4 ^ 6) <= 4 || !composer.changed(transition)) && (i2 + 6) - (6 | i2) != 4) {
            z2 = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = transition.getCurrentState();
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (transition.isSeeking()) {
            objRememberedValue = transition.getCurrentState();
        }
        int i5 = (i2 >> 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
        int i6 = (-1) - (((-1) - (i2 << 6)) | ((-1) - 7168));
        Transition<T> transitionCreateChildTransitionInternal = createChildTransitionInternal(transition, function3.invoke(objRememberedValue, composer, Integer.valueOf(i5)), function3.invoke(transition.getTargetState(), composer, Integer.valueOf(i5)), str2, composer, (i4 + i6) - (i4 & i6));
        ComposerKt.sourceInformationMarkerEnd(composer);
        return transitionCreateChildTransitionInternal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <S, T> Transition<T> createChildTransitionInternal(final Transition<S> transition, T t2, T t3, String str, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -198307638, "C(createChildTransitionInternal)P(1,2)1826@74609L116,1830@74760L112,1830@74731L141:Transition.kt#pdpnli");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198307638, i2, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1825)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1039290434, "CC(remember):Transition.kt#9igjgp");
        int i3 = (14 & i2) ^ 6;
        int i4 = 1;
        byte b2 = (i3 > 4 && composer.changed(transition)) || (-1) - (((-1) - i2) | ((-1) - 6)) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (b2 != false || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Transition(new MutableTransitionState(t2), transition, transition.getLabel() + " > " + str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<T> transition2 = (Transition) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 1039295262, "CC(remember):Transition.kt#9igjgp");
        if ((i3 <= 4 || !composer.changed(transition)) && (i2 + 6) - (i2 | 6) != 4) {
            i4 = 0;
        }
        boolean zChanged = composer.changed(transition2);
        int i5 = ((zChanged ? 1 : 0) + i4) - ((zChanged ? 1 : 0) & i4);
        Object objRememberedValue2 = composer.rememberedValue();
        if (i5 != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    transition.addTransition$animation_core_release(transition2);
                    final Transition<S> transition3 = transition;
                    final Transition<T> transition4 = transition2;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition3.removeTransition$animation_core_release(transition4);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.DisposableEffect(transition2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            transition2.seek(t2, t3, transition.getLastSeekedTimeNanos$animation_core_release());
        } else {
            transition2.updateTarget$animation_core_release(t3);
            transition2.setSeeking$animation_core_release(false);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return transition2;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.TransitionKt$animateValue$1 */
    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C04221<S, T> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<T>> {
        public static final C04221 INSTANCE = ;

        public final SpringSpec<T> invoke(Transition.Segment<S> segment, Composer composer, int i2) {
            composer.startReplaceGroup(-895531546);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-895531546, i2, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1880)");
            }
            SpringSpec<T> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return springSpecSpring$default;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }
    }

    public static final <S, T, V extends AnimationVector> State<T> animateValue(Transition<S> transition, TwoWayConverter<T, V> twoWayConverter, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<T>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, ? extends T> function32, Composer composer, int i2, int i3) {
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        if ((i3 + 2) - (i3 | 2) != 0) {
            function3 = C04221.INSTANCE;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            str2 = "ValueAnimation";
        }
        S currentState = transition.getCurrentState();
        int i4 = i2 >> 9;
        int i5 = (i4 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i4 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
        int i6 = ((i2 + 14) - (i2 | 14)) | (57344 & (i2 << 9));
        int i7 = i2 << 6;
        int i8 = (i7 + 458752) - (i7 | 458752);
        State<T> stateCreateTransitionAnimation = createTransitionAnimation(transition, function32.invoke(currentState, composer, Integer.valueOf(i5)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i5)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((-1) - (((-1) - (i2 >> 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))), twoWayConverter, str2, composer, (i6 + i8) - (i6 & i8));
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateCreateTransitionAnimation;
    }

    public static final <S, T, V extends AnimationVector> State<T> createTransitionAnimation(final Transition<S> transition, T t2, T t3, FiniteAnimationSpec<T> finiteAnimationSpec, TwoWayConverter<T, V> twoWayConverter, String str, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -304821198, "C(createTransitionAnimation)P(1,3!1,4)1901@77675L499,1924@78558L128,1924@78520L166:Transition.kt#pdpnli");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304821198, i2, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1900)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1397689602, "CC(remember):Transition.kt#9igjgp");
        int i3 = ((-1) - (((-1) - i2) | ((-1) - 14))) ^ 6;
        boolean z2 = (i3 > 4 && composer.changed(transition)) || (6 & i2) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = transitionAnimationState;
            Object transitionAnimationState = transition.new TransitionAnimationState(t2, AnimationStateKt.createZeroVectorFrom(twoWayConverter, t3), twoWayConverter, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition.TransitionAnimationState transitionAnimationState2 = (Transition.TransitionAnimationState) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (transition.isSeeking()) {
            transitionAnimationState2.updateInitialAndTargetValue$animation_core_release(t2, t3, finiteAnimationSpec);
        } else {
            transitionAnimationState2.updateTargetValue$animation_core_release(t3, finiteAnimationSpec);
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1397717487, "CC(remember):Transition.kt#9igjgp");
        boolean zChanged = composer.changed(transitionAnimationState2) | ((i3 > 4 && composer.changed(transition)) || (i2 + 6) - (i2 | 6) == 4);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    transition.addAnimation$animation_core_release(transitionAnimationState2);
                    final Transition<S> transition2 = transition;
                    final Transition<S>.TransitionAnimationState<T, V> transitionAnimationState3 = transitionAnimationState2;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.removeAnimation$animation_core_release(transitionAnimationState3);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.DisposableEffect(transitionAnimationState2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return transitionAnimationState2;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.TransitionKt$animateFloat$1 */
    /* JADX INFO: compiled from: Transition.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C04151<S> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Float>> {
        public static final C04151 INSTANCE = ;

        public final SpringSpec<Float> invoke(Transition.Segment<S> segment, Composer composer, int i2) {
            composer.startReplaceGroup(-522164544);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-522164544, i2, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1964)");
            }
            SpringSpec<Float> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return springSpecSpring$default;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }
    }

    public static final <S> State<Float> animateFloat(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, Float> function32, Composer composer, int i2, int i3) {
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart(composer, -1338768149, "CC(animateFloat)P(2)1968@80576L78:Transition.kt#pdpnli");
        if ((i3 + 1) - (i3 | 1) != 0) {
            function3 = C04151.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            str2 = "FloatAnimation";
        }
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int i4 = i2 << 3;
        int i5 = ((-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - 14)))) & ((-1) - ((i4 + 896) - (896 | i4))))) | (7168 & i4);
        int i6 = (i4 + 57344) - (i4 | 57344);
        int i7 = (i5 + i6) - (i5 & i6);
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        S currentState = transition.getCurrentState();
        int i8 = i7 >> 9;
        int i9 = (i8 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i8 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
        Float fInvoke = function32.invoke(currentState, composer, Integer.valueOf(i9));
        Float fInvoke2 = function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i9));
        int i10 = i7 >> 3;
        FiniteAnimationSpec<Float> finiteAnimationSpecInvoke = function3.invoke(transition.getSegment(), composer, Integer.valueOf((i10 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i10 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
        int i11 = i7 & 14;
        int i12 = i7 << 6;
        int i13 = (i12 + 458752) - (i12 | 458752);
        State<Float> stateCreateTransitionAnimation = createTransitionAnimation(transition, fInvoke, fInvoke2, finiteAnimationSpecInvoke, vectorConverter, str2, composer, (i11 + i13) - (i11 & i13));
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateCreateTransitionAnimation;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.TransitionKt$animateDp$1 */
    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1<S> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Dp>> {
        public static final AnonymousClass1 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ SpringSpec<Dp> invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }

        public final SpringSpec<Dp> invoke(Transition.Segment<S> segment, Composer composer, int i2) {
            composer.startReplaceGroup(-575880366);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-575880366, i2, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1994)");
            }
            SpringSpec<Dp> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m6636boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.Companion)), 3, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return springSpecSpring$default;
        }
    }

    public static final <S> State<Dp> animateDp(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Dp>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, Dp> function32, Composer composer, int i2, int i3) {
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart(composer, 184732935, "CC(animateDp)P(2)1999@82290L75:Transition.kt#pdpnli");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            function3 = AnonymousClass1.INSTANCE;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            str2 = "DpAnimation";
        }
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(Dp.Companion);
        int i4 = i2 << 3;
        int i5 = (-1) - (((-1) - (i2 & 14)) & ((-1) - (896 & i4)));
        int i6 = 7168 & i4;
        int i7 = (i5 + i6) - (i5 & i6);
        int i8 = i4 & 57344;
        int i9 = (i7 + i8) - (i7 & i8);
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        S currentState = transition.getCurrentState();
        int i10 = (i9 >> 9) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
        Dp dpInvoke = function32.invoke(currentState, composer, Integer.valueOf(i10));
        Dp dpInvoke2 = function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i10));
        int i11 = i9 >> 3;
        State<Dp> stateCreateTransitionAnimation = createTransitionAnimation(transition, dpInvoke, dpInvoke2, function3.invoke(transition.getSegment(), composer, Integer.valueOf((i11 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i11 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))), vectorConverter, str2, composer, (-1) - (((-1) - (i9 & 14)) & ((-1) - ((i9 << 6) & 458752))));
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateCreateTransitionAnimation;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.TransitionKt$animateOffset$1 */
    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C04191<S> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Offset>> {
        public static final C04191 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ SpringSpec<Offset> invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }

        public final SpringSpec<Offset> invoke(Transition.Segment<S> segment, Composer composer, int i2) {
            composer.startReplaceGroup(1623385561);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1623385561, i2, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:2025)");
            }
            SpringSpec<Offset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m3926boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return springSpecSpring$default;
        }
    }

    public static final <S> State<Offset> animateOffset(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Offset>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, Offset> function32, Composer composer, int i2, int i3) {
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart(composer, 2078477582, "CC(animateOffset)P(2)2030@84030L79:Transition.kt#pdpnli");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            function3 = C04191.INSTANCE;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            str2 = "OffsetAnimation";
        }
        TwoWayConverter<Offset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Offset.Companion);
        int i4 = i2 << 3;
        int i5 = (-1) - (((-1) - ((-1) - (((-1) - (((-1) - (((-1) - i2) | ((-1) - 14))) | (896 & i4))) & ((-1) - ((-1) - (((-1) - i4) | ((-1) - 7168))))))) & ((-1) - (i4 & 57344)));
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        S currentState = transition.getCurrentState();
        int i6 = (-1) - (((-1) - (i5 >> 9)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
        int i7 = (-1) - (((-1) - i5) | ((-1) - 14));
        int i8 = (i5 << 6) & 458752;
        State<Offset> stateCreateTransitionAnimation = createTransitionAnimation(transition, function32.invoke(currentState, composer, Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)), vectorConverter, str2, composer, (i7 + i8) - (i7 & i8));
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateCreateTransitionAnimation;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.TransitionKt$animateSize$1 */
    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C04211<S> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Size>> {
        public static final C04211 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ SpringSpec<Size> invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }

        public final SpringSpec<Size> invoke(Transition.Segment<S> segment, Composer composer, int i2) {
            composer.startReplaceGroup(-1607152761);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1607152761, i2, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:2056)");
            }
            SpringSpec<Size> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m3994boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return springSpecSpring$default;
        }
    }

    public static final <S> State<Size> animateSize(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Size>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, Size> function32, Composer composer, int i2, int i3) {
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart(composer, -802210820, "CC(animateSize)P(2)2061@85759L77:Transition.kt#pdpnli");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            function3 = C04211.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            str2 = "SizeAnimation";
        }
        TwoWayConverter<Size, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Size.Companion);
        int i4 = i2 << 3;
        int i5 = (-1) - (((-1) - (((-1) - (((-1) - ((i2 + 14) - (i2 | 14))) & ((-1) - ((-1) - (((-1) - i4) | ((-1) - 896)))))) | ((i4 + 7168) - (7168 | i4)))) & ((-1) - ((-1) - (((-1) - i4) | ((-1) - 57344)))));
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        S currentState = transition.getCurrentState();
        int i6 = (-1) - (((-1) - (i5 >> 9)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
        State<Size> stateCreateTransitionAnimation = createTransitionAnimation(transition, function32.invoke(currentState, composer, Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((-1) - (((-1) - (i5 >> 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))), vectorConverter, str2, composer, ((i5 + 14) - (14 | i5)) | ((i5 << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateCreateTransitionAnimation;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.TransitionKt$animateIntOffset$1 */
    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C04171<S> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<IntOffset>> {
        public static final C04171 INSTANCE = ;

        public final SpringSpec<IntOffset> invoke(Transition.Segment<S> segment, Composer composer, int i2) {
            composer.startReplaceGroup(-1953479610);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1953479610, i2, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:2088)");
            }
            SpringSpec<IntOffset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m6757boximpl(IntOffsetKt.IntOffset(1, 1)), 3, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return springSpecSpring$default;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ SpringSpec<IntOffset> invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }
    }

    public static final <S> State<IntOffset> animateIntOffset(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntOffset>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, IntOffset> function32, Composer composer, int i2, int i3) {
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart(composer, 776131825, "CC(animateIntOffset)P(2)2092@87507L82:Transition.kt#pdpnli");
        if ((i3 + 1) - (i3 | 1) != 0) {
            function3 = C04171.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            str2 = "IntOffsetAnimation";
        }
        TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
        int i4 = i2 << 3;
        int i5 = ((i2 + 14) - (i2 | 14)) | (896 & i4);
        int i6 = (-1) - (((-1) - i4) | ((-1) - 7168));
        int i7 = (-1) - (((-1) - ((i5 + i6) - (i5 & i6))) & ((-1) - ((i4 + 57344) - (i4 | 57344))));
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        S currentState = transition.getCurrentState();
        int i8 = (-1) - (((-1) - (i7 >> 9)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
        int i9 = (-1) - (((-1) - i7) | ((-1) - 14));
        int i10 = (-1) - (((-1) - (i7 << 6)) | ((-1) - 458752));
        State<IntOffset> stateCreateTransitionAnimation = createTransitionAnimation(transition, function32.invoke(currentState, composer, Integer.valueOf(i8)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i8)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i7 >> 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)), vectorConverter, str2, composer, (i9 + i10) - (i9 & i10));
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateCreateTransitionAnimation;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.TransitionKt$animateInt$1 */
    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C04161<S> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Integer>> {
        public static final C04161 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ SpringSpec<Integer> invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }

        public final SpringSpec<Integer> invoke(Transition.Segment<S> segment, Composer composer, int i2) {
            composer.startReplaceGroup(-785273069);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-785273069, i2, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:2118)");
            }
            SpringSpec<Integer> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, 1, 3, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return springSpecSpring$default;
        }
    }

    public static final <S> State<Integer> animateInt(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Integer>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, Integer> function32, Composer composer, int i2, int i3) {
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart(composer, 1318902782, "CC(animateInt)P(2)2123@89210L76:Transition.kt#pdpnli");
        if ((i3 & 1) != 0) {
            function3 = C04161.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            str2 = "IntAnimation";
        }
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
        int i4 = i2 << 3;
        int i5 = (-1) - (((-1) - ((-1) - (((-1) - ((i2 & 14) | ((-1) - (((-1) - i4) | ((-1) - 896))))) & ((-1) - ((i4 + 7168) - (7168 | i4)))))) & ((-1) - ((-1) - (((-1) - i4) | ((-1) - 57344)))));
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        S currentState = transition.getCurrentState();
        int i6 = (i5 >> 9) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
        Integer numInvoke = function32.invoke(currentState, composer, Integer.valueOf(i6));
        Integer numInvoke2 = function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i6));
        int i7 = i5 >> 3;
        State<Integer> stateCreateTransitionAnimation = createTransitionAnimation(transition, numInvoke, numInvoke2, function3.invoke(transition.getSegment(), composer, Integer.valueOf((i7 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i7 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateCreateTransitionAnimation;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.TransitionKt$animateIntSize$1 */
    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C04181<S> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<IntSize>> {
        public static final C04181 INSTANCE = ;

        public final SpringSpec<IntSize> invoke(Transition.Segment<S> segment, Composer composer, int i2) {
            composer.startReplaceGroup(967893300);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(967893300, i2, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:2149)");
            }
            SpringSpec<IntSize> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m6800boximpl(IntSizeKt.IntSize(1, 1)), 3, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return springSpecSpring$default;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }
    }

    public static final <S> State<IntSize> animateIntSize(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntSize>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, IntSize> function32, Composer composer, int i2, int i3) {
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart(composer, -2104123233, "CC(animateIntSize)P(2)2153@90939L80:Transition.kt#pdpnli");
        if ((i3 & 1) != 0) {
            function3 = C04181.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            str2 = "IntSizeAnimation";
        }
        TwoWayConverter<IntSize, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntSize.Companion);
        int i4 = (i2 + 14) - (i2 | 14);
        int i5 = i2 << 3;
        int i6 = 896 & i5;
        int i7 = (i4 + i6) - (i4 & i6);
        int i8 = (i5 + 7168) - (7168 | i5);
        int i9 = (-1) - (((-1) - ((i7 + i8) - (i7 & i8))) & ((-1) - (i5 & 57344)));
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        S currentState = transition.getCurrentState();
        int i10 = i9 >> 9;
        int i11 = (i10 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i10 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
        int i12 = (i9 + 14) - (14 | i9);
        int i13 = (-1) - (((-1) - (i9 << 6)) | ((-1) - 458752));
        State<IntSize> stateCreateTransitionAnimation = createTransitionAnimation(transition, function32.invoke(currentState, composer, Integer.valueOf(i11)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i11)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((-1) - (((-1) - (i9 >> 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))), vectorConverter, str2, composer, (i12 + i13) - (i12 & i13));
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateCreateTransitionAnimation;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.TransitionKt$animateRect$1 */
    /* JADX INFO: compiled from: Transition.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C04201<S> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Rect>> {
        public static final C04201 INSTANCE = ;

        public final SpringSpec<Rect> invoke(Transition.Segment<S> segment, Composer composer, int i2) {
            composer.startReplaceGroup(691336298);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(691336298, i2, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:2179)");
            }
            SpringSpec<Rect> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return springSpecSpring$default;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ SpringSpec<Rect> invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }
    }

    public static final <S> State<Rect> animateRect(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Rect>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, Rect> function32, Composer composer, int i2, int i3) {
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart(composer, 1496278239, "CC(animateRect)P(2)2183@92665L77:Transition.kt#pdpnli");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            function3 = C04201.INSTANCE;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            str2 = "RectAnimation";
        }
        TwoWayConverter<Rect, AnimationVector4D> vectorConverter = VectorConvertersKt.getVectorConverter(Rect.Companion);
        int i4 = i2 << 3;
        int i5 = ((i2 + 14) - (i2 | 14)) | (896 & i4) | ((i4 + 7168) - (7168 | i4)) | (i4 & 57344);
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        S currentState = transition.getCurrentState();
        int i6 = i5 >> 9;
        int i7 = (i6 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i6 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
        State<Rect> stateCreateTransitionAnimation = createTransitionAnimation(transition, function32.invoke(currentState, composer, Integer.valueOf(i7)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i7)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((-1) - (((-1) - (i5 >> 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))), vectorConverter, str2, composer, (i5 & 14) | ((-1) - (((-1) - (i5 << 6)) | ((-1) - 458752))));
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateCreateTransitionAnimation;
    }
}
