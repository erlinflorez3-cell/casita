package kotlin.text;

import com.dynatrace.android.agent.Global;
import com.facebook.hermes.intl.Constants;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CharIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яċ\u0014D߬)\u001e\u007f\u007fLDq\u007f\fA\f1\u0013.P\u0005*,\u0018x\u000ffx98DkH6Ra6\u0017k\u00024,[2zK;[\u001b\u0006\"\u0017YVʴon`Z\u0013C\u0015\t\u001ex\u0001,Qǁ\u0001] +:BuG;M\u0006=A`z<\r @9@y\u000b\u0005\"*^\u0010~zIL\u0014\u0012F@xíZ\r[#\"\u0012\fD(\u0001,koN<Tt]P/+\u0003\u007fBV'eO\u0015[\u001bMl';~\u0012\"9IO5C)\u001aΈ\u001fliI\u001b? H-hU'[M\u0002cNX.\u0014E1U\rk\u007f>\\3_x&5:gcy[6(&z,\u0011J\u0010&\u0006UH^3 f\u0016\u001bKt!aXm\u0010nZ\u007f)o^\u0017S\u007fc/G,~Q\u0010MIT={\u0013\u001a6#/|gƃT&}#+lw\u007f?y@kH~\u000egI\u0006\u0004\u001fb20\n0U\rG{?<]\u00ad7sL11\u0004\u0002vR\u0010v3`\u0019Wwe`@P\u0003\\ջ2!\"hY|\u0005\u001a^|ZB\u0010{\u001c\u0005\r\f\u0014+\"rvj!kīfev\u007f\u0003M\f\u0018M1|6\bn\u001c\u0014eEv5KP\u0012\u0010(\u05ec\u000f.MSz\u0005\u0007tjS:Z\r,0C`j>\n,JT\f!?WqJBDK's-H1,jA+\t\u0010^v(\u0017Ta$3o*t\u0017\u000eh\\\u001f}\u007f1WE\u0015n2/QQc\u001d6W2hb\b9\u0006-\u000e(G\u0016LwVz1\u000e[\f\"&\u001ag\\]YC\u0015\u0005)@\u001fEEzv\u0016WS\u00125\b\u0015y=I\u0001qu!\u0003~<bzJ}X'$\u0007^!.\u001ec.\u0014\nF)G\u0014^\u0019vVO\u0003\u0005i<|C+!O\"3\u001e\b\"+9]G5*.wB=Eek\b\b.(pU&܌i\u00042\u0003.(pqu@K:YY-B2&|\u0003pS\u0001v6\\14;3xKr\fn>]\r?}\u0015\u0012Z)!\\a:!\r\u00164\\cZyI}\"k[%?[kw{\u000fc\\9X7\n9{ar >U \u0005[z>>)\f\u0018|e[l\u000bµ\u0017I\\,j\b3C\u001b\u000e&\u0012\u0001~T\u00047\u0017xg$Ed4l~lXX\u0005'i\u000fHp܈\u0005ݩ2ͨא91\u0013\u0016^\n=\rJ\u0001\u001aA)%pʪ\r\fM+rTa\u001bn|!\rK\\Qm*6JlYwy\u0016$>(~-B^?gxW٫|ӣ]ΗڀhNr\u001f*\u000b`x:)-~%\u000ej\n?\u000f'`\u000bo\u0011?|T}7Q7\u0019\u0017r-7\u0012\u0003cT(E\u0006c;U\u0003x>?{\u0006Wc}6 P+\u0012\u00019\\\u0006\u000e\u0017\u000ek8R\u0016 \u001a\u0013\u0006\u0017>h 22zx\u0001\u0017F\bd]29\b\u0013lw\u0004wONm+˭\nBQ\u0015\u0011.q\u0017{n\u0004\u000f+f_V*r;}5\tUX^\u0019^ZH.k \u0007\u00150\u001a\u001b&-C bW\u001eg\bv\u001f\u0004O\n\u0011S/\u001a*\u00125>\u00026}M*&\n0T62SV{B\u0015\u000fblPd&^\u00196|\u001f\u001aW,|-L\u0007\u0011A4v|,\u007fG=)!k\ruk5 uO,!?oW\u001be6;u.v\u001f\u0010Rb#\u000eBM\u0017$\u0018gZ;nTk\u001amښ*\u0006o\u0011XcEfP0,?\u000eW˗`P+L\u00102\u001ci_[AG\u0011G͉>\u001e\u000e\u0015MMj\u007faM,\u0017{/\r\u0006Ɵ7ˌ:\u007f?|)˄\u001fo1V~=+6s͗?*\u0010\u001bb~{q~\u0011w+w5\fɒ\u007f\u07bd@\f\u0012)*ڎ\u0016u9~]3N+mЇXa\u0002\u000e\u001c&Xm\u0017DQG3Դs\"PwP\fd\ne\\A)\u0014IHL;El5W}n\u007f\u000bR*]\u0014e\u00136/9\u0017\u000b\u001dgqn9a\u0017[gt]j\u0017\u001c\u0004h2\u0012:\btXYX\u0011]\u0018Zcx\b\u0006Q\u000e\u0014h\u0018\u0013\r\u0012\u0005IR\u000f\u000exA&`cvt:\u0005x{A\u0013\u000fN><^\\r<\u0011\f\u0016<e/\u0002,N\u0011\u001b\u00193U\u0001YG@d\u0014K+Js%4)\u0010ju?\u0006{fXQ9\u001boZXcp\u000b!\u0006'Qd92\u0018jY2w\\D\u001a8e\u001e\u000esr`\u001eR3\\.}2@0~\n\t~\u0006\u0001J\u001fUc#\"\u00178r9kd?6e\u0015\u0017R\u0004#E\f\u0010A(AG!3\u001e\u00029b'\u0002 I>*\u001c#Ż_\u0015zWO\u001bax,W\bU.oV3ɧkW3e\u007f\u0017\fN'L\u0006A$\u0013k!+&\"\u000e\u0007|<\\)V\u000eq\u0011\u0015T\u0003)\t5$.:C}\u0006k\u0011Af*vS_n0^v\u000fG]-\u0014*\u0014\u0002~\u000fg\u0011]+$\u0019f1 \u0011\u0014SmU\u0007Q\u000b\\n\u001d]&NU\u001a\u001aK8y\u0016VlH\u0017\u0004n\u0016j\"_\u0011\u0015gu\u00040\u0013}#lj>q\u0001TH\u001b+~\u0015\f_iJr\u000bppv@>\u001e\u0015,U6xv'F\u0019Sq\u001b\u001a6TvQra\u0001Rg(SkB_J4\u0012\u001bg}\u0015\njK6;}\\\u0003\u001b\u0005Lo\u000b\u0004\u001b\t\u00140ʽo18\u000eh\t4hhk\u0006n\u0018,\u001e\f+\u0004Z*{R\u007fuOvrD;\u001eHq\b?M!! 1<66}^\u0001nfi=.*\u0014O\u0018H{CuYs*7\u001eqٝ8]$p\u0016\u001c\u0006i%k@\u0012\fJQO\u001af\u001f(FM&\u000b\n@gM\u001a\nP)T\f#r\u001aHbNb&1B'6FN\u0017r\u00072!e:=;҉&B{\u000b\ff\fg\\AkU\u000e\u0003SzGq6Ka}\rw_\u000ew!bOzx&_K\".25o\u001cI\u001eBx[p\u0017 \b\u00114\u001c>\nd\u001b\u0014\u0019O^\u001eh\u0012\u0007l%Ty Kd%\u00143>\u001c)Q@Ucn7\u0018;7o5R_\u0014|\u000br\u001cP``IB\u0013Vu~\u000eI\u00065OrE.9s|\u0007Ѣ\u001bs\u0017u2i\"\u0016S\u0014(]\u0015(\u001aDl\u00185g\f:ϭdMwlYm#<'\u0017O6q`6Uur ][ \u001eX7dP;L/l\\\u0002'v%W-\u0002XE:-Q71g36\u0015;\fh\u0004h\tp\u0007[\n'H\u0016\u0014r+AM\u00166$6\u007f%_B\u001d\u000e\u0001nHC\u0010([F\bB\u0005}\\\u0013\u0007\"A_J{pG6(cl\u0015\u001d\rS!@#&yylAz=(PNCz);!\u0010JIU\r;i\u000fzH2(LccW\nAm\u0007w.!y4>\u0007!Mz\u0002.@puxLv\u001c_sL]-NFG8\u0010TRii)ǔJоZϸ\\2\u001cq7*R=4n^\u001b\rl\f\u0003\u000fR\u0011&\u00118|\rp@c6iղ,\u0019#\u0017{u+BI\u0002Uto?j\u0005#[\u0012\r\u0007nm\u000b_I\u001d2\u0011{k8\u001cG#\u0012!\u001a?XD8;,$\u0014\u00175L~8J:m\u000f:9j&$4\rn)@\u0019\u007f45L\u0011\u0001b\t1`Tw~-\u0007v)\u001fv\"/~]qQ|\u00022\u0017TJ\u0012;1#}\"JP\u0018CO%#f7j:\u007f\u001b?CLt^XJ*\u0006R\u001fr\u0003DC[jl\u0001L8\"L:b\u0018?^HhO8o*e|2o\u0014rny4,Eu\u001a0iy\u000b\u001bx;-9-Z\u0007Z\u001ci3\u001bnw[|\\\u001bhI=\u0018RHn\u0004V\u0016\u001c`|hw!l\u001c:SR0)rTa6\u0010chL\u001e\b`O\u0018L\u0019\u001c*\u0013`K6\")3~IbS\u001e\\dw\u000eH7P&fd\u007fn\u0010[\u001dn.4AMep~\u0002PnfAJ/4$Y\u0017<\u001cp-eT.ZJ\u000e&Ka*b\u0004n\u001d /2\u0013?r\u001a%\u000b,\u0004l 9\u0016g\u0003B{PL'QvE\u0010\u0005^&(u@\r\\\u0005 TH0\u0019]tD\u0002ݍyl\bGPxv\u00062xhe!;\u0002@\u0018dkn#=_9%Z\u001fc\u0013\u0002\u0014\u007f\u0003\u0019מ=ߊX܄ʃJl\u000e\u000e7lw}\b\u0005fygK\u0019!WOeLsl:B\u0014\u0003V'T\"6\u0012U\rl\u0013dɪ\u001ǎ&ѐ۵[Pjb\u000bj(v\u0004P77:EkC\u0006di\u000fS%\rN<\u00153QG\tH-\u0018p4L-n\u0013\fiQk\u0012IP\u0011\n\u0012Q\u001c\u0010+\u0001*\u0004.\"\b\u0011q\u001a)@99ugaVCe&P~z'1\u0007\u007f\u001cqpu,21\"s>\u00073\u0003X\u0013\u001d,\\|:^+\u000e.\rѽ\u0016:H8H\u0010PWDHb\u0017\f&vg5.^Uqga\rW\bgsf\u000eΩS}[\u00045\u0013\"iV|\u000f\u0019\u0004\u0003\u0003dd%B\\RZ<8\u0014\u001cTl7/:y\u0005V3HEW{UbhJ\\^)\u0011\"h-*\u0005`KG5sd\u000bڊ\u0017B%^\" \u001b<P\u0013\u00058UM\blOo\n:#k1;)X\u001c\u0014]D|[\u0017\u000fZ{o\f:=<C\u001aO\u007f+'\u00111u$7wd\u0013'nDBI\u0017\u00076\u0017u\fx1pn/@\u0011rd\n`'\\\u0002#\u000b1\u0019\u0005\u001aBy\u00011g~~\u001d\u0014<J|ŹaDh1%45\rE\u0013,L\u0019Mw^inN\fB;MW_\u0005\u001c.<\u0007A8\u0005\u007f,?\u000eF\u0010x*ŨB]}kO#TF6\u0016\u000fx_!?X{CLASj\u0017\r\rnHc\u001e7\u000e)\u0012^c\u001dp\u0014O]\b\u0016f.~\\\u000e{\u0016HtQ9/j\u0004\u0004$yǈh\u0017P2*I\u000e'\u001b8\u0010G8j\u0016y7\u007f>sJ>\f]zTf\u001bd\u0017>F@7}jt\u000e2\u0018(R\u0016HODP{UWad;p~\u007f32ezA4%~ANP<g;Mw\tjO\t|z\f;C1\u0001[\u001d\u0004MGz`,¢:x7!5:S\f b\u0014\u001e\u0015.\u0004\u00161`\u0018/?~8+Cy0\n\tp~[i|@\u0001vL\u0006\u000bbXE7\u000b4\u0004`\"Y\u0013]\u0017\t\u0004p>lz\u0018Ug<#\u000f`+=$?m~\r\u000e\u001cU\r_S\u0013\u001eg\u0004m\u0005c\u0012B,\\5\u0016\u001d[u\b*%,E?\\~\u0016\u001e%q='~$D6`N\u0015$f\u0019@\u001d\".4\u001d\u0017c$\f[[k?\u0017wfW\u001f\tac\u0003Z\u000beMVQދh\u001e\u001cO4I\u0019Y\\f\u001f!dt/sObC@\"_6/:\u0017\u001aQ$\u0012oKō}ow'OCsllmD`B6/\u0018Y(*\u000771KpCpnAy'TwK\u0019xP>!\u0010_'%-^WU;nY'&\u001f6w1=B5);!H[[61\u000fzCQLT=\b'!#CWC~8?r!\tc\u0014<wY\u0011kI3o\u001a\u000ep1AwoJ@\fTO-Q3\u0019GPRv\u0007>E\u001a7\u00041)\u0013-L(y9$Y\u0015sQEF7\u0014Q9u\r}w\\F#\u0003Q>G\u0002\u0011k|\u0015AE\u0018WK0*^l1m\u0001\u0011!\u001aA4Cgp\u001ai~%B12, wf\b\u007fTpX}\u001fhZ*j@\u0016dQ#HA.\r\u0003,/v\u0002Pe\u0005G\u0014>y\u0010,GZBR=7\u001ayU#\rc\u0005#$,;M(=I)\u000529\u0002DiX\u000b{Ef\u007fF[\u0011>jR~p\u0018_\u001dr*@HVju\u0004!SqkFOc\u001f/t$A%P0l[7uT\u0011gHN\u001dYqyC`I6\u001f+\u0013\u001bڨ\u0014*<GC\u001a F\u0005=m?w\u007fwSb\r\u001e%I!\u001e\r:9&\u0007\bScz\u0005QS?5\b\u000b|Wy~~\u000e9\u0004:\u0006ݲ\u001a\u05f7>ߨwvs:JdP\u0016y$z \t\u0005bcmDn|t\u000f\rU\n\u0014D\u001d_ou\u00039D#L\u001cծ!C]qr~e]P-\u000eYGy59\fJ ]D7sGO>q `ww?C\u001cܥ#©SĆy,_5cU\u0015k\"?Sr\u0004\u001b\"[G0<Opj\"=\u0006&\u0002i+`lba:ui-\tdp1\u0005-&p\u001eX\u0006H_. \u00052FQwTjT\u0019$cW%\u0012d3>ǋzϧ\\Њc\u001a3<]\u0002;c\bsB\u0003\n~\u0001wIif\u0003e\u0014RIXv\nBI@Yp\u0018\u0006E\u0007#ڳ\u001f}N66|\u000e1\u0006-J\u001aY\u0001`~\u000e\u0013k\u000e)k^+%\u0003\u0005jSpz%\u001cwѴ^\u0603(ϝ)w{5W?~\nSsY\tb}@\u0013\nM\u0002\u000b:&)w\u00101\u001a`e@U\nf\u000fU\u0017hCz\u0005\u000f\t\f8@{qJ\u0013rv=MrO{\u0001\b\u001d00~)4EU\u0011C<ޫ\tח\u0012ƎPHYfCYa%=##\u0002lUj2\u001bi\u001baf\b<=SU\u0016D!Q&Xkk f\u0003¯\u0016I$w\u0003H\u0011&'F}\u0003@q\f\u0003\u0018\u0010D\u0018\u0004+iv{e\u00146._>>v\u0016ғZžM®N\u0007#\u001aV$\te\u000f\rg\u0014*$I>\u0018(z0pe'\u0002\"aYٰqm9XeC7$\n\u001aʖ\u000b;\u0017\fW\u001bLa\u0001`\u0018fahT2/\u0004B5Z@ʽyPI\f y4$Ó\u0016f\u0015'tɭrXmݲ\u000b\u0011"}, d2 = {"7mS6V,L", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "", "5dc\u0016a+BQ\u0019\r", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001d3tB\u00014<]\u0007iDi\u001f0MQ\u0005O=-\u0002dj;\u00079", ":`bA<5=S,", "", "5dc\u0019T:M7\"}zq", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001d3q", "@d`B\\9><#\bc^.x\u00183v\u007f\u000f\u007fH\u0005&", "", ":h\\6g", "1n\\:b5)`\u0019\u007f~q\u001e\u0001\u00182", "", "=sW2e", "7f]<e,\u001cO'~", "", "1n\\:b5,c\u001a\u007f~q\u001e\u0001\u00182", "1n]AT0Ga", "1gP?", "", "@dV2k", "\u001aj^A_0G\u001d(~\u000emui\t1e\u0013}", "1n]AX5M3%\u000fve:`\u000b8o\r(Y<\u000f\u0017zOz\u0015", "1n]AX5M3%\u000fve:`\u0011:l", "3mS@J0MV", "AtU3\\?", "4h]145R=\u001a", "\u001aj^A_0G\u001d\u0004z~k\u0002", "Asa6a.L", "", "AsP?g\u0010GR\u0019\u0012", ":`bA", "4h]145R=\u001a=hm9\u0001\u00121se7u:n&$Kx\u0010J\\4", "4h]1?(Lbt\b\u000fH-", "6`b h9K]\u001bz\n^\u0017x\r<A\u000f", "7mS2k", "7e19T5D", Global.BLANK, "\u0011", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u0014F\u0006,9bG%Hu_/]L9z8(\u001ev+\u001a\u0017l*]z1P\u0017$oCWnN\u0010[a\nW-VnVF$lS\r", "7e4:c;R", "7mS2k\u0016?", "3mS\u0016a+>f", "7mS2k\u0016?\u0012\u0007\u000e\bb5~\u0017\u0015ty\"iO\u000e\u001b I}sK", "Asa6a.", "7mS2k\u0016?/\"\u0013", "1gP?f", "", "7r4:c;R", "7r=<g\tEO\"\u0005", "7r=<g\fF^(\u0013", "7r=B_3(`u\u0006vg2", "7r=B_3(`x\u0007\u0006m@", "7sT?T;H`", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001e\u0004\u0013$+~\u000eIr4?fS", ":`bA<5=S,h{", ":`bA<5=S,h{:5\u0011", ":h]2F,Jc\u0019\bx^", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", ":h]2f", "", ";`c0[,L", "=q4:c;R", ">`S\u0012a+", ":d]4g/", ">`S\u0010[(K", ">`S g(Kb", "@`]4X:\u001dS \u0003\u0003b;|\b\fy", "2d[6`0MS&\r", "", "@`]4X:\u001dS \u0003\u0003b;|\b\fy>\u0016\u000bM\u0005 \u0019UU\u001d6p\u0013Df\u0002)9{{=", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001detAr61#\u0005\u001c@o_\u001c\\P?t6sx]E|mi6]}+P\u0016\\,hbrF\u0012\u0012hW<+\u0019\u0015YJ\"n\u001a", "@dV6b5&O(|}^:`\u0011:l", "BgX@B-?a\u0019\u000e", "=sW2e\u0016?T'~\n", "@d\\<i,)`\u0019\u007f~q", ">qT3\\?", "@d\\<i,+O\"\u0001z", "@`]4X", "@d\\<i,,c\u001a\u007f~q", "@d\\<i,,c&\f\u0005n5{\r8g", "2d[6`0MS&", "@d_9T*>", "BqP;f-H`!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d(~\u000emud\u0005>c\u0003\u0015{N\u0011\u001e&\u001d", "@d_9T*>[\u0019\b\n", "@d_9T*>/\u001a\u000ezk", ";hb@\\5@2\u0019\u0006~f0\f\t<V{/\f@", "@d_9T*>/\u001a\u000ezk\u0013x\u0017>", "@d_9T*>0\u0019\u007f\u0005k,", "@d_9T*>0\u0019\u007f\u0005k,c\u0005=t", "@d_9T*>4\u001d\f\tm", "@d_9T*>4\u001d\f\tm\n\u007f\u0005<", "@d_9T*>4\u001d\f\tm\n\u007f\u0005<W\u00047~\u001e\u0004\u0013$", "@d_9T*>4\u001d\f\tm\n\u007f\u0005<W\u00047~\u001e\u0004\u0013$5o\u001aLv.3Y", "@d_9T*>@\u0015\b|^", "Ao[6g", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001detAr61#\u0005\u001c@o_\u001c\\P?t6s\nL% \f_=J@7VPUuCV\u0001Li", "Ao[6gj,b&\u0003\u0004`:b\u0018)_m7\tD\n\u0019%-~", "Ao[6g\u001bHA\u0019\u000b\u000b^5z\t", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001detAr61#\u0005\u001c@o_\u001c\\P?t6s\nL% \rm;Uz0\u0011ZN8lR{;\u0014 ${N7\u001d\u0005b?$D", "AsP?g:0W(\u0002", "AtQ X8NS\"|z", "AsP?g", "3mS", "AtQ@g9B\\\u001b", "AtQ@g9B\\\u001bZ{m,\n", "AtQ@g9B\\\u001bZ{m,\no+s\u000f", "AtQ@g9B\\\u001b[z_6\n\t", "AtQ@g9B\\\u001b[z_6\n\t\u0016a\u000e7", "Bn1<b3>O\"l\nk0z\u0018", "Bn1<b3>O\"l\nk0z\u0018\u0019rh8\u0003G", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~6\b*>m\u00127#", "BqX:", ">qT1\\*:b\u0019", "BqX:85=", "BqX:F;:`(", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{@0B=v\u001a:7-1)4\u000b3")
public class StringsKt__StringsKt extends StringsKt__StringsJVMKt {

    /* JADX INFO: renamed from: kotlin.text.StringsKt__StringsKt$iterator$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001f\u001d̉=!4i\bӵLc\u0003\nIي8\u000b<K\u0007Ӭ4\u0012\u0006\u0011nʑa/ǏkPDɟ\u0004*=jD;2]<qq>\u001cۓ}j\u000f]R\u007fg\u001dO!\u001f\u0014\u001b\u0014\u0016\u0011jZJ,ޏiܫ\u00132JģЩ7S"}, d2 = {"9nc9\\5\bb\u0019\u0012\n(\u001a\f\u00163n\u00026aOz\u0011\u0005V|\u0012Ex3\u001bh<$Fm#*\\MH*\u007f", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001e\u0004\u0013$+~\u000eIr4?fS", "7mS2k", "", "6`b\u001bX?M", "", "<dgA6/:`", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends CharIterator {
        final /* synthetic */ CharSequence $this_iterator;
        private int index;

        AnonymousClass1(CharSequence charSequence) {
            charSequence = charSequence;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < charSequence.length();
        }

        @Override // kotlin.collections.CharIterator
        public char nextChar() {
            CharSequence charSequence = charSequence;
            int i2 = this.index;
            this.index = i2 + 1;
            return charSequence.charAt(i2);
        }
    }

    /* JADX INFO: renamed from: kotlin.text.StringsKt__StringsKt$splitToSequence$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,u\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C13811 extends Lambda implements Function1<IntRange, String> {
        final /* synthetic */ CharSequence $this_splitToSequence;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13811(CharSequence charSequence) {
            super(1);
            charSequence = charSequence;
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(IntRange it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return StringsKt.substring(charSequence, it);
        }
    }

    /* JADX INFO: renamed from: kotlin.text.StringsKt__StringsKt$splitToSequence$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,u\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function1<IntRange, String> {
        final /* synthetic */ CharSequence $this_splitToSequence;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CharSequence charSequence) {
            super(1);
            charSequence = charSequence;
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(IntRange it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return StringsKt.substring(charSequence, it);
        }
    }

    public static final String commonPrefixWith(CharSequence charSequence, CharSequence other, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(charSequence.length(), other.length());
        int i2 = 0;
        while (i2 < iMin && CharsKt.equals(charSequence.charAt(i2), other.charAt(i2), z2)) {
            i2++;
        }
        int i3 = i2 - 1;
        if (StringsKt.hasSurrogatePairAt(charSequence, i3) || StringsKt.hasSurrogatePairAt(other, i3)) {
            i2--;
        }
        return charSequence.subSequence(0, i2).toString();
    }

    public static /* synthetic */ String commonPrefixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.commonPrefixWith(charSequence, charSequence2, z2);
    }

    public static final String commonSuffixWith(CharSequence charSequence, CharSequence other, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = charSequence.length();
        int iMin = Math.min(length, other.length());
        int i2 = 0;
        while (i2 < iMin && CharsKt.equals(charSequence.charAt((length - i2) - 1), other.charAt((r4 - i2) - 1), z2)) {
            i2++;
        }
        if (StringsKt.hasSurrogatePairAt(charSequence, (length - i2) - 1) || StringsKt.hasSurrogatePairAt(other, (r4 - i2) - 1)) {
            i2--;
        }
        return charSequence.subSequence(length - i2, length).toString();
    }

    public static /* synthetic */ String commonSuffixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.commonSuffixWith(charSequence, charSequence2, z2);
    }

    public static final boolean contains(CharSequence charSequence, char c2, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt.indexOf$default(charSequence, c2, 0, z2, 2, (Object) null) >= 0;
    }

    public static final boolean contains(CharSequence charSequence, CharSequence other, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            if (StringsKt.indexOf$default(charSequence, (String) other, 0, z2, 2, (Object) null) >= 0) {
                return true;
            }
        } else if (indexOf$StringsKt__StringsKt$default(charSequence, other, 0, charSequence.length(), z2, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    private static final boolean contains(CharSequence charSequence, Regex regex) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.containsMatchIn(charSequence);
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, char c2, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        return StringsKt.contains(charSequence, c2, z2);
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        return StringsKt.contains(charSequence, charSequence2, z2);
    }

    public static final boolean contentEqualsIgnoreCaseImpl(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsKt.equals((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!CharsKt.equals(charSequence.charAt(i2), charSequence2.charAt(i2), true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean contentEqualsImpl(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return Intrinsics.areEqual(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i2) != charSequence2.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean endsWith(CharSequence charSequence, char c2, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && CharsKt.equals(charSequence.charAt(StringsKt.getLastIndex(charSequence)), c2, z2);
    }

    public static final boolean endsWith(CharSequence charSequence, CharSequence suffix, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return (!z2 && (charSequence instanceof String) && (suffix instanceof String)) ? StringsKt.endsWith$default((String) charSequence, (String) suffix, false, 2, (Object) null) : StringsKt.regionMatchesImpl(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z2);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, char c2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.endsWith(charSequence, c2, z2);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        return StringsKt.endsWith(charSequence, charSequence2, z2);
    }

    public static final Pair<Integer, String> findAnyOf(CharSequence charSequence, Collection<String> strings, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        return findAnyOf$StringsKt__StringsKt(charSequence, strings, i2, z2, false);
    }

    public static final Pair<Integer, String> findAnyOf$StringsKt__StringsKt(CharSequence charSequence, Collection<String> collection, int i2, boolean z2, boolean z3) {
        Object next;
        Object next2;
        boolean z4 = z2;
        if (!z4 && collection.size() == 1) {
            String str = (String) CollectionsKt.single(collection);
            int iIndexOf$default = !z3 ? StringsKt.indexOf$default(charSequence, str, i2, false, 4, (Object) null) : StringsKt.lastIndexOf$default(charSequence, str, i2, false, 4, (Object) null);
            if (iIndexOf$default < 0) {
                return null;
            }
            return TuplesKt.to(Integer.valueOf(iIndexOf$default), str);
        }
        IntRange intRange = !z3 ? new IntRange(RangesKt.coerceAtLeast(i2, 0), charSequence.length()) : RangesKt.downTo(RangesKt.coerceAtMost(i2, StringsKt.getLastIndex(charSequence)), 0);
        if (charSequence instanceof String) {
            int first = intRange.getFirst();
            int last = intRange.getLast();
            int step = intRange.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        if (StringsKt.regionMatches(str2, 0, (String) charSequence, first, str2.length(), z4)) {
                            break;
                        }
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (first == last) {
                            break;
                        }
                        first += step;
                    } else {
                        return TuplesKt.to(Integer.valueOf(first), str3);
                    }
                }
            }
        } else {
            int first2 = intRange.getFirst();
            int last2 = intRange.getLast();
            int step2 = intRange.getStep();
            if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        z4 = z4;
                        if (StringsKt.regionMatchesImpl(str4, 0, charSequence, first2, str4.length(), z4)) {
                            break;
                        }
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (first2 == last2) {
                            break;
                        }
                        first2 += step2;
                    } else {
                        return TuplesKt.to(Integer.valueOf(first2), str5);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ Pair findAnyOf$default(CharSequence charSequence, Collection collection, int i2, boolean z2, int i3, Object obj) {
        if ((i3 + 2) - (2 | i3) != 0) {
            i2 = 0;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            z2 = false;
        }
        return StringsKt.findAnyOf(charSequence, collection, i2, z2);
    }

    public static final Pair<Integer, String> findLastAnyOf(CharSequence charSequence, Collection<String> strings, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        return findAnyOf$StringsKt__StringsKt(charSequence, strings, i2, z2, true);
    }

    public static /* synthetic */ Pair findLastAnyOf$default(CharSequence charSequence, Collection collection, int i2, boolean z2, int i3, Object obj) {
        if ((i3 + 2) - (2 | i3) != 0) {
            i2 = StringsKt.getLastIndex(charSequence);
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            z2 = false;
        }
        return StringsKt.findLastAnyOf(charSequence, collection, i2, z2);
    }

    public static final IntRange getIndices(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new IntRange(0, charSequence.length() - 1);
    }

    public static final int getLastIndex(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final boolean hasSurrogatePairAt(CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new IntRange(0, charSequence.length() + (-2)).contains(i2) && Character.isHighSurrogate(charSequence.charAt(i2)) && Character.isLowSurrogate(charSequence.charAt(i2 + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <C extends CharSequence & R, R> R ifBlank(C c2, Function0<? extends R> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return StringsKt.isBlank(c2) ? defaultValue.invoke() : c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <C extends CharSequence & R, R> R ifEmpty(C c2, Function0<? extends R> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return c2.length() == 0 ? defaultValue.invoke() : c2;
    }

    public static final int indexOf(CharSequence charSequence, char c2, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? StringsKt.indexOfAny(charSequence, new char[]{c2}, i2, z2) : ((String) charSequence).indexOf(c2, i2);
    }

    public static final int indexOf(CharSequence charSequence, String string, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z2 || !(charSequence instanceof String)) ? indexOf$StringsKt__StringsKt$default(charSequence, string, i2, charSequence.length(), z2, false, 16, null) : ((String) charSequence).indexOf(string, i2);
    }

    private static final int indexOf$StringsKt__StringsKt(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z2, boolean z3) {
        IntRange intRange = !z3 ? new IntRange(RangesKt.coerceAtLeast(i2, 0), RangesKt.coerceAtMost(i3, charSequence.length())) : RangesKt.downTo(RangesKt.coerceAtMost(i2, StringsKt.getLastIndex(charSequence)), RangesKt.coerceAtLeast(i3, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int first = intRange.getFirst();
            int last = intRange.getLast();
            int step = intRange.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return -1;
            }
            while (!StringsKt.regionMatches((String) charSequence2, 0, (String) charSequence, first, charSequence2.length(), z2)) {
                if (first == last) {
                    return -1;
                }
                first += step;
            }
            return first;
        }
        int first2 = intRange.getFirst();
        int last2 = intRange.getLast();
        int step2 = intRange.getStep();
        if ((step2 <= 0 || first2 > last2) && (step2 >= 0 || last2 > first2)) {
            return -1;
        }
        while (!StringsKt.regionMatchesImpl(charSequence2, 0, charSequence, first2, charSequence2.length(), z2)) {
            if (first2 == last2) {
                return -1;
            }
            first2 += step2;
        }
        return first2;
    }

    static /* synthetic */ int indexOf$StringsKt__StringsKt$default(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z2, boolean z3, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
            z3 = false;
        }
        return indexOf$StringsKt__StringsKt(charSequence, charSequence2, i2, i3, z2, z3);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, char c2, int i2, boolean z2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i2 = 0;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            z2 = false;
        }
        return StringsKt.indexOf(charSequence, c2, i2, z2);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, String str, int i2, boolean z2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i2 = 0;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            z2 = false;
        }
        return StringsKt.indexOf(charSequence, str, i2, z2);
    }

    public static final int indexOfAny(CharSequence charSequence, Collection<String> strings, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Pair<Integer, String> pairFindAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, strings, i2, z2, false);
        if (pairFindAnyOf$StringsKt__StringsKt != null) {
            return pairFindAnyOf$StringsKt__StringsKt.getFirst().intValue();
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.IntIterator] */
    public static final int indexOfAny(CharSequence charSequence, char[] chars, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z2 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ArraysKt.single(chars), i2);
        }
        ?? it = new IntRange(RangesKt.coerceAtLeast(i2, 0), StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            char cCharAt = charSequence.charAt(iNextInt);
            for (char c2 : chars) {
                if (CharsKt.equals(c2, cCharAt, z2)) {
                    return iNextInt;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, Collection collection, int i2, boolean z2, int i3, Object obj) {
        if ((2 & i3) != 0) {
            i2 = 0;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            z2 = false;
        }
        return StringsKt.indexOfAny(charSequence, (Collection<String>) collection, i2, z2);
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, char[] cArr, int i2, boolean z2, int i3, Object obj) {
        if ((i3 + 2) - (2 | i3) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return StringsKt.indexOfAny(charSequence, cArr, i2, z2);
    }

    private static final boolean isEmpty(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    private static final boolean isNotBlank(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !StringsKt.isBlank(charSequence);
    }

    private static final boolean isNotEmpty(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0;
    }

    private static final boolean isNullOrBlank(CharSequence charSequence) {
        return charSequence == null || StringsKt.isBlank(charSequence);
    }

    private static final boolean isNullOrEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static final CharIterator iterator(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new CharIterator() { // from class: kotlin.text.StringsKt__StringsKt.iterator.1
            final /* synthetic */ CharSequence $this_iterator;
            private int index;

            AnonymousClass1(CharSequence charSequence2) {
                charSequence = charSequence2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < charSequence.length();
            }

            @Override // kotlin.collections.CharIterator
            public char nextChar() {
                CharSequence charSequence2 = charSequence;
                int i2 = this.index;
                this.index = i2 + 1;
                return charSequence2.charAt(i2);
            }
        };
    }

    public static final int lastIndexOf(CharSequence charSequence, char c2, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? StringsKt.lastIndexOfAny(charSequence, new char[]{c2}, i2, z2) : ((String) charSequence).lastIndexOf(c2, i2);
    }

    public static final int lastIndexOf(CharSequence charSequence, String string, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z2 || !(charSequence instanceof String)) ? indexOf$StringsKt__StringsKt(charSequence, string, i2, 0, z2, true) : ((String) charSequence).lastIndexOf(string, i2);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, char c2, int i2, boolean z2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i2 = StringsKt.getLastIndex(charSequence);
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            z2 = false;
        }
        return StringsKt.lastIndexOf(charSequence, c2, i2, z2);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, String str, int i2, boolean z2, int i3, Object obj) {
        if ((2 & i3) != 0) {
            i2 = StringsKt.getLastIndex(charSequence);
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return StringsKt.lastIndexOf(charSequence, str, i2, z2);
    }

    public static final int lastIndexOfAny(CharSequence charSequence, Collection<String> strings, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Pair<Integer, String> pairFindAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, strings, i2, z2, true);
        if (pairFindAnyOf$StringsKt__StringsKt != null) {
            return pairFindAnyOf$StringsKt__StringsKt.getFirst().intValue();
        }
        return -1;
    }

    public static final int lastIndexOfAny(CharSequence charSequence, char[] chars, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z2 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(ArraysKt.single(chars), i2);
        }
        for (int iCoerceAtMost = RangesKt.coerceAtMost(i2, StringsKt.getLastIndex(charSequence)); -1 < iCoerceAtMost; iCoerceAtMost--) {
            char cCharAt = charSequence.charAt(iCoerceAtMost);
            for (char c2 : chars) {
                if (CharsKt.equals(c2, cCharAt, z2)) {
                    return iCoerceAtMost;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, Collection collection, int i2, boolean z2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i2 = StringsKt.getLastIndex(charSequence);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            z2 = false;
        }
        return StringsKt.lastIndexOfAny(charSequence, (Collection<String>) collection, i2, z2);
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, char[] cArr, int i2, boolean z2, int i3, Object obj) {
        if ((i3 + 2) - (2 | i3) != 0) {
            i2 = StringsKt.getLastIndex(charSequence);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            z2 = false;
        }
        return StringsKt.lastIndexOfAny(charSequence, cArr, i2, z2);
    }

    public static final Sequence<String> lineSequence(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt.splitToSequence$default(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    public static final List<String> lines(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return SequencesKt.toList(StringsKt.lineSequence(charSequence));
    }

    private static final boolean matches(CharSequence charSequence, Regex regex) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.matches(charSequence);
    }

    private static final String orEmpty(String str) {
        return str == null ? "" : str;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.IntIterator] */
    public static final CharSequence padEnd(CharSequence charSequence, int i2, char c2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException("Desired length " + i2 + " is less than zero.");
        }
        if (i2 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i2);
        sb.append(charSequence);
        ?? it = new IntRange(1, i2 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb.append(c2);
        }
        return sb;
    }

    public static final String padEnd(String str, int i2, char c2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.padEnd((CharSequence) str, i2, c2).toString();
    }

    public static /* synthetic */ CharSequence padEnd$default(CharSequence charSequence, int i2, char c2, int i3, Object obj) {
        if ((i3 + 2) - (i3 | 2) != 0) {
            c2 = TokenParser.SP;
        }
        return StringsKt.padEnd(charSequence, i2, c2);
    }

    public static /* synthetic */ String padEnd$default(String str, int i2, char c2, int i3, Object obj) {
        if ((i3 + 2) - (i3 | 2) != 0) {
            c2 = TokenParser.SP;
        }
        return StringsKt.padEnd(str, i2, c2);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.IntIterator] */
    public static final CharSequence padStart(CharSequence charSequence, int i2, char c2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException("Desired length " + i2 + " is less than zero.");
        }
        if (i2 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i2);
        ?? it = new IntRange(1, i2 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb.append(c2);
        }
        sb.append(charSequence);
        return sb;
    }

    public static final String padStart(String str, int i2, char c2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.padStart((CharSequence) str, i2, c2).toString();
    }

    public static /* synthetic */ CharSequence padStart$default(CharSequence charSequence, int i2, char c2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            c2 = TokenParser.SP;
        }
        return StringsKt.padStart(charSequence, i2, c2);
    }

    public static /* synthetic */ String padStart$default(String str, int i2, char c2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            c2 = TokenParser.SP;
        }
        return StringsKt.padStart(str, i2, c2);
    }

    private static final Sequence<IntRange> rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence, final char[] cArr, int i2, final boolean z2, int i3) {
        StringsKt.requireNonNegativeLimit(i3);
        return new DelimitedRangesSequence(charSequence, i2, i3, new Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence2, Integer num) {
                return invoke(charSequence2, num.intValue());
            }

            public final Pair<Integer, Integer> invoke(CharSequence $receiver, int i4) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                int iIndexOfAny = StringsKt.indexOfAny($receiver, cArr, i4, z2);
                if (iIndexOfAny < 0) {
                    return null;
                }
                return TuplesKt.to(Integer.valueOf(iIndexOfAny), 1);
            }
        });
    }

    private static final Sequence<IntRange> rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence, String[] strArr, int i2, final boolean z2, int i3) {
        StringsKt.requireNonNegativeLimit(i3);
        final List listAsList = ArraysKt.asList(strArr);
        return new DelimitedRangesSequence(charSequence, i2, i3, new Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence2, Integer num) {
                return invoke(charSequence2, num.intValue());
            }

            public final Pair<Integer, Integer> invoke(CharSequence $receiver, int i4) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                Pair pairFindAnyOf$StringsKt__StringsKt = StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt($receiver, listAsList, i4, z2, false);
                if (pairFindAnyOf$StringsKt__StringsKt != null) {
                    return TuplesKt.to(pairFindAnyOf$StringsKt__StringsKt.getFirst(), Integer.valueOf(((String) pairFindAnyOf$StringsKt__StringsKt.getSecond()).length()));
                }
                return null;
            }
        });
    }

    static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, char[] cArr, int i2, boolean z2, int i3, int i4, Object obj) {
        if ((2 & i4) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            z2 = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, cArr, i2, z2, i3);
    }

    static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, String[] strArr, int i2, boolean z2, int i3, int i4, Object obj) {
        if ((2 & i4) != 0) {
            i2 = 0;
        }
        if ((4 & i4) != 0) {
            z2 = false;
        }
        if ((i4 + 8) - (i4 | 8) != 0) {
            i3 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, strArr, i2, z2, i3);
    }

    public static final boolean regionMatchesImpl(CharSequence charSequence, int i2, CharSequence other, int i3, int i4, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > other.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!CharsKt.equals(charSequence.charAt(i2 + i5), other.charAt(i3 + i5), z2)) {
                return false;
            }
        }
        return true;
    }

    public static final CharSequence removePrefix(CharSequence charSequence, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return StringsKt.startsWith$default(charSequence, prefix, false, 2, (Object) null) ? charSequence.subSequence(prefix.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final String removePrefix(String str, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!StringsKt.startsWith$default((CharSequence) str, prefix, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final CharSequence removeRange(CharSequence charSequence, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("End index (" + i3 + ") is less than start index (" + i2 + ").");
        }
        if (i3 == i2) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(charSequence.length() - (i3 - i2));
        Intrinsics.checkNotNullExpressionValue(sb.append(charSequence, 0, i2), "append(...)");
        Intrinsics.checkNotNullExpressionValue(sb.append(charSequence, i3, charSequence.length()), "append(...)");
        return sb;
    }

    public static final CharSequence removeRange(CharSequence charSequence, IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return StringsKt.removeRange(charSequence, range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    private static final String removeRange(String str, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.removeRange((CharSequence) str, i2, i3).toString();
    }

    private static final String removeRange(String str, IntRange range) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return StringsKt.removeRange((CharSequence) str, range).toString();
    }

    public static final CharSequence removeSuffix(CharSequence charSequence, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return StringsKt.endsWith$default(charSequence, suffix, false, 2, (Object) null) ? charSequence.subSequence(0, charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final String removeSuffix(String str, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!StringsKt.endsWith$default((CharSequence) str, suffix, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final CharSequence removeSurrounding(CharSequence charSequence, CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return StringsKt.removeSurrounding(charSequence, delimiter, delimiter);
    }

    public static final CharSequence removeSurrounding(CharSequence charSequence, CharSequence prefix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return (charSequence.length() >= prefix.length() + suffix.length() && StringsKt.startsWith$default(charSequence, prefix, false, 2, (Object) null) && StringsKt.endsWith$default(charSequence, suffix, false, 2, (Object) null)) ? charSequence.subSequence(prefix.length(), charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final String removeSurrounding(String str, CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return StringsKt.removeSurrounding(str, delimiter, delimiter);
    }

    public static final String removeSurrounding(String str, CharSequence prefix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length()) {
            return str;
        }
        String str2 = str;
        if (!StringsKt.startsWith$default((CharSequence) str2, prefix, false, 2, (Object) null) || !StringsKt.endsWith$default((CharSequence) str2, suffix, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final String replace(CharSequence charSequence, Regex regex, String replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return regex.replace(charSequence, replacement);
    }

    private static final String replace(CharSequence charSequence, Regex regex, Function1<? super MatchResult, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return regex.replace(charSequence, transform);
    }

    public static final String replaceAfter(String str, char c2, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        String str2 = str;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, c2, 0, false, 6, (Object) null);
        return iIndexOf$default == -1 ? missingDelimiterValue : StringsKt.replaceRange((CharSequence) str2, iIndexOf$default + 1, str.length(), (CharSequence) replacement).toString();
    }

    public static final String replaceAfter(String str, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        String str2 = str;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, delimiter, 0, false, 6, (Object) null);
        return iIndexOf$default == -1 ? missingDelimiterValue : StringsKt.replaceRange((CharSequence) str2, iIndexOf$default + delimiter.length(), str.length(), (CharSequence) replacement).toString();
    }

    public static /* synthetic */ String replaceAfter$default(String str, char c2, String str2, String str3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            str3 = str;
        }
        return StringsKt.replaceAfter(str, c2, str2, str3);
    }

    public static /* synthetic */ String replaceAfter$default(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            str4 = str;
        }
        return StringsKt.replaceAfter(str, str2, str3, str4);
    }

    public static final String replaceAfterLast(String str, char c2, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        String str2 = str;
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str2, c2, 0, false, 6, (Object) null);
        return iLastIndexOf$default == -1 ? missingDelimiterValue : StringsKt.replaceRange((CharSequence) str2, iLastIndexOf$default + 1, str.length(), (CharSequence) replacement).toString();
    }

    public static final String replaceAfterLast(String str, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        String str2 = str;
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str2, delimiter, 0, false, 6, (Object) null);
        return iLastIndexOf$default == -1 ? missingDelimiterValue : StringsKt.replaceRange((CharSequence) str2, iLastIndexOf$default + delimiter.length(), str.length(), (CharSequence) replacement).toString();
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, char c2, String str2, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = str;
        }
        return StringsKt.replaceAfterLast(str, c2, str2, str3);
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            str4 = str;
        }
        return StringsKt.replaceAfterLast(str, str2, str3, str4);
    }

    public static final String replaceBefore(String str, char c2, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        String str2 = str;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, c2, 0, false, 6, (Object) null);
        return iIndexOf$default == -1 ? missingDelimiterValue : StringsKt.replaceRange((CharSequence) str2, 0, iIndexOf$default, (CharSequence) replacement).toString();
    }

    public static final String replaceBefore(String str, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        String str2 = str;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, delimiter, 0, false, 6, (Object) null);
        return iIndexOf$default == -1 ? missingDelimiterValue : StringsKt.replaceRange((CharSequence) str2, 0, iIndexOf$default, (CharSequence) replacement).toString();
    }

    public static /* synthetic */ String replaceBefore$default(String str, char c2, String str2, String str3, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            str3 = str;
        }
        return StringsKt.replaceBefore(str, c2, str2, str3);
    }

    public static /* synthetic */ String replaceBefore$default(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            str4 = str;
        }
        return StringsKt.replaceBefore(str, str2, str3, str4);
    }

    public static final String replaceBeforeLast(String str, char c2, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        String str2 = str;
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str2, c2, 0, false, 6, (Object) null);
        return iLastIndexOf$default == -1 ? missingDelimiterValue : StringsKt.replaceRange((CharSequence) str2, 0, iLastIndexOf$default, (CharSequence) replacement).toString();
    }

    public static final String replaceBeforeLast(String str, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        String str2 = str;
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str2, delimiter, 0, false, 6, (Object) null);
        return iLastIndexOf$default == -1 ? missingDelimiterValue : StringsKt.replaceRange((CharSequence) str2, 0, iLastIndexOf$default, (CharSequence) replacement).toString();
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, char c2, String str2, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = str;
        }
        return StringsKt.replaceBeforeLast(str, c2, str2, str3);
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            str4 = str;
        }
        return StringsKt.replaceBeforeLast(str, str2, str3, str4);
    }

    private static final String replaceFirst(CharSequence charSequence, Regex regex, String replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return regex.replaceFirst(charSequence, replacement);
    }

    private static final String replaceFirstCharWithChar(String str, Function1<? super Character, Character> transform) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (str.length() <= 0) {
            return str;
        }
        char cCharValue = transform.invoke(Character.valueOf(str.charAt(0))).charValue();
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return cCharValue + strSubstring;
    }

    private static final String replaceFirstCharWithCharSequence(String str, Function1<? super Character, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sbAppend = new StringBuilder().append((Object) transform.invoke(Character.valueOf(str.charAt(0))));
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return sbAppend.append(strSubstring).toString();
    }

    public static final CharSequence replaceRange(CharSequence charSequence, int i2, int i3, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("End index (" + i3 + ") is less than start index (" + i2 + ").");
        }
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNullExpressionValue(sb.append(charSequence, 0, i2), "append(...)");
        sb.append(replacement);
        Intrinsics.checkNotNullExpressionValue(sb.append(charSequence, i3, charSequence.length()), "append(...)");
        return sb;
    }

    public static final CharSequence replaceRange(CharSequence charSequence, IntRange range, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return StringsKt.replaceRange(charSequence, range.getStart().intValue(), range.getEndInclusive().intValue() + 1, replacement);
    }

    private static final String replaceRange(String str, int i2, int i3, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return StringsKt.replaceRange((CharSequence) str, i2, i3, replacement).toString();
    }

    private static final String replaceRange(String str, IntRange range, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return StringsKt.replaceRange((CharSequence) str, range, replacement).toString();
    }

    public static final void requireNonNegativeLimit(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2).toString());
        }
    }

    private static final List<String> split(CharSequence charSequence, Regex regex, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.split(charSequence, i2);
    }

    public static final List<String> split(CharSequence charSequence, char[] delimiters, boolean z2, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return split$StringsKt__StringsKt(charSequence, String.valueOf(delimiters[0]), z2, i2);
        }
        Iterable iterableAsIterable = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z2, i2, 2, (Object) null));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableAsIterable, 10));
        Iterator it = iterableAsIterable.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.substring(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static final List<String> split(CharSequence charSequence, String[] delimiters, boolean z2, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return split$StringsKt__StringsKt(charSequence, str, z2, i2);
            }
        }
        Iterable iterableAsIterable = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z2, i2, 2, (Object) null));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableAsIterable, 10));
        Iterator it = iterableAsIterable.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.substring(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    private static final List<String> split$StringsKt__StringsKt(CharSequence charSequence, String str, boolean z2, int i2) {
        StringsKt.requireNonNegativeLimit(i2);
        int length = 0;
        int iIndexOf = StringsKt.indexOf(charSequence, str, 0, z2);
        if (iIndexOf != -1) {
            if (i2 != 1) {
                boolean z3 = i2 > 0;
                ArrayList arrayList = new ArrayList(z3 ? RangesKt.coerceAtMost(i2, 10) : 10);
                do {
                    arrayList.add(charSequence.subSequence(length, iIndexOf).toString());
                    length = str.length() + iIndexOf;
                    if (z3 && arrayList.size() == i2 - 1) {
                        break;
                    }
                    iIndexOf = StringsKt.indexOf(charSequence, str, length, z2);
                } while (iIndexOf != -1);
                arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
                return arrayList;
            }
        }
        return CollectionsKt.listOf(charSequence.toString());
    }

    static /* synthetic */ List split$default(CharSequence charSequence, Regex regex, int i2, int i3, Object obj) {
        if ((i3 + 2) - (i3 | 2) != 0) {
            i2 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.split(charSequence, i2);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, char[] cArr, boolean z2, int i2, int i3, Object obj) {
        if ((2 & i3) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return StringsKt.split(charSequence, cArr, z2, i2);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z2, int i2, int i3, Object obj) {
        if ((i3 + 2) - (2 | i3) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return StringsKt.split(charSequence, strArr, z2, i2);
    }

    private static final Sequence<String> splitToSequence(CharSequence charSequence, Regex regex, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.splitToSequence(charSequence, i2);
    }

    public static final Sequence<String> splitToSequence(CharSequence charSequence, char[] delimiters, boolean z2, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z2, i2, 2, (Object) null), new Function1<IntRange, String>() { // from class: kotlin.text.StringsKt__StringsKt.splitToSequence.2
            final /* synthetic */ CharSequence $this_splitToSequence;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CharSequence charSequence2) {
                super(1);
                charSequence = charSequence2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final String invoke(IntRange it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StringsKt.substring(charSequence, it);
            }
        });
    }

    public static final Sequence<String> splitToSequence(CharSequence charSequence, String[] delimiters, boolean z2, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z2, i2, 2, (Object) null), new Function1<IntRange, String>() { // from class: kotlin.text.StringsKt__StringsKt.splitToSequence.1
            final /* synthetic */ CharSequence $this_splitToSequence;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13811(CharSequence charSequence2) {
                super(1);
                charSequence = charSequence2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final String invoke(IntRange it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StringsKt.substring(charSequence, it);
            }
        });
    }

    static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, Regex regex, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i2 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.splitToSequence(charSequence, i2);
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, char[] cArr, boolean z2, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            i2 = 0;
        }
        return StringsKt.splitToSequence(charSequence, cArr, z2, i2);
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, String[] strArr, boolean z2, int i2, int i3, Object obj) {
        if ((i3 + 2) - (2 | i3) != 0) {
            z2 = false;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            i2 = 0;
        }
        return StringsKt.splitToSequence(charSequence, strArr, z2, i2);
    }

    public static final boolean startsWith(CharSequence charSequence, char c2, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && CharsKt.equals(charSequence.charAt(0), c2, z2);
    }

    public static final boolean startsWith(CharSequence charSequence, CharSequence prefix, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (!z2 && (charSequence instanceof String) && (prefix instanceof String)) ? StringsKt.startsWith$default((String) charSequence, (String) prefix, i2, false, 4, (Object) null) : StringsKt.regionMatchesImpl(charSequence, i2, prefix, 0, prefix.length(), z2);
    }

    public static final boolean startsWith(CharSequence charSequence, CharSequence prefix, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (!z2 && (charSequence instanceof String) && (prefix instanceof String)) ? StringsKt.startsWith$default((String) charSequence, (String) prefix, false, 2, (Object) null) : StringsKt.regionMatchesImpl(charSequence, 0, prefix, 0, prefix.length(), z2);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, char c2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.startsWith(charSequence, c2, z2);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, int i2, boolean z2, int i3, Object obj) {
        if ((i3 + 4) - (i3 | 4) != 0) {
            z2 = false;
        }
        return StringsKt.startsWith(charSequence, charSequence2, i2, z2);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        return StringsKt.startsWith(charSequence, charSequence2, z2);
    }

    public static final CharSequence subSequence(CharSequence charSequence, IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    @Deprecated(message = "\u0018Y\u0001t\u0002u'XeL<\u007fb(k\\]Y\u000e+D{ S\tZWxRy<&iZh\u0002Rjl\"T\"8R_", replaceWith = @ReplaceWith(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    @InterfaceC1492Gx
    private static final CharSequence subSequence(String str, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.subSequence(i2, i3);
    }

    private static final String substring(CharSequence charSequence, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.subSequence(i2, i3).toString();
    }

    public static final String substring(CharSequence charSequence, IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }

    public static final String substring(String str, IntRange range) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        String strSubstring = str.substring(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    static /* synthetic */ String substring$default(CharSequence charSequence, int i2, int i3, int i4, Object obj) {
        if ((i4 + 2) - (i4 | 2) != 0) {
            i3 = charSequence.length();
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.subSequence(i2, i3).toString();
    }

    public static final String substringAfter(String str, char c2, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iIndexOf$default + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String substringAfter(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iIndexOf$default + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringAfter$default(String str, char c2, String str2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str2 = str;
        }
        return StringsKt.substringAfter(str, c2, str2);
    }

    public static /* synthetic */ String substringAfter$default(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            str3 = str;
        }
        return StringsKt.substringAfter(str, str2, str3);
    }

    public static final String substringAfterLast(String str, char c2, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iLastIndexOf$default + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String substringAfterLast(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iLastIndexOf$default + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringAfterLast$default(String str, char c2, String str2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str2 = str;
        }
        return StringsKt.substringAfterLast(str, c2, str2);
    }

    public static /* synthetic */ String substringAfterLast$default(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            str3 = str;
        }
        return StringsKt.substringAfterLast(str, str2, str3);
    }

    public static final String substringBefore(String str, char c2, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String substringBefore(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringBefore$default(String str, char c2, String str2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str2 = str;
        }
        return StringsKt.substringBefore(str, c2, str2);
    }

    public static /* synthetic */ String substringBefore$default(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            str3 = str;
        }
        return StringsKt.substringBefore(str, str2, str3);
    }

    public static final String substringBeforeLast(String str, char c2, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String substringBeforeLast(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            str2 = str;
        }
        return StringsKt.substringBeforeLast(str, c2, str2);
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return StringsKt.substringBeforeLast(str, str2, str3);
    }

    public static final boolean toBooleanStrict(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, "true")) {
            return true;
        }
        if (Intrinsics.areEqual(str, Constants.CASEFIRST_FALSE)) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: " + str);
    }

    public static final Boolean toBooleanStrictOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, "true")) {
            return true;
        }
        return Intrinsics.areEqual(str, Constants.CASEFIRST_FALSE) ? false : null;
    }

    public static final CharSequence trim(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean zIsWhitespace = CharsKt.isWhitespace(charSequence.charAt(!z2 ? i2 : length));
            if (z2) {
                if (!zIsWhitespace) {
                    break;
                }
                length--;
            } else if (zIsWhitespace) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static final CharSequence trim(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean zBooleanValue = predicate.invoke(Character.valueOf(charSequence.charAt(!z2 ? i2 : length))).booleanValue();
            if (z2) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static final CharSequence trim(CharSequence charSequence, char... chars) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean zContains = ArraysKt.contains(chars, charSequence.charAt(!z2 ? i2 : length));
            if (z2) {
                if (!zContains) {
                    break;
                }
                length--;
            } else if (zContains) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    private static final String trim(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.trim((CharSequence) str).toString();
    }

    public static final String trim(String str, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        String str2 = str;
        int length = str2.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean zBooleanValue = predicate.invoke(Character.valueOf(str2.charAt(!z2 ? i2 : length))).booleanValue();
            if (z2) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return str2.subSequence(i2, length + 1).toString();
    }

    public static final String trim(String str, char... chars) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        String str2 = str;
        int length = str2.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean zContains = ArraysKt.contains(chars, str2.charAt(!z2 ? i2 : length));
            if (z2) {
                if (!zContains) {
                    break;
                }
                length--;
            } else if (zContains) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return str2.subSequence(i2, length + 1).toString();
    }

    public static final CharSequence trimEnd(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (!CharsKt.isWhitespace(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return "";
    }

    public static final CharSequence trimEnd(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (!predicate.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return "";
    }

    public static final CharSequence trimEnd(CharSequence charSequence, char... chars) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (!ArraysKt.contains(chars, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return "";
    }

    private static final String trimEnd(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.trimEnd((CharSequence) str).toString();
    }

    public static final String trimEnd(String str, Function1<? super Character, Boolean> predicate) {
        String strSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        String str2 = str;
        int length = str2.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (!predicate.invoke(Character.valueOf(str2.charAt(length))).booleanValue()) {
                    strSubSequence = str2.subSequence(0, length + 1);
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return strSubSequence.toString();
    }

    public static final String trimEnd(String str, char... chars) {
        String strSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        String str2 = str;
        int length = str2.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (!ArraysKt.contains(chars, str2.charAt(length))) {
                    strSubSequence = str2.subSequence(0, length + 1);
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return strSubSequence.toString();
    }

    public static final CharSequence trimStart(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!CharsKt.isWhitespace(charSequence.charAt(i2))) {
                return charSequence.subSequence(i2, charSequence.length());
            }
        }
        return "";
    }

    public static final CharSequence trimStart(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                return charSequence.subSequence(i2, charSequence.length());
            }
        }
        return "";
    }

    public static final CharSequence trimStart(CharSequence charSequence, char... chars) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!ArraysKt.contains(chars, charSequence.charAt(i2))) {
                return charSequence.subSequence(i2, charSequence.length());
            }
        }
        return "";
    }

    private static final String trimStart(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.trimStart((CharSequence) str).toString();
    }

    public static final String trimStart(String str, Function1<? super Character, Boolean> predicate) {
        String strSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        String str2 = str;
        int length = str2.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (!predicate.invoke(Character.valueOf(str2.charAt(i2))).booleanValue()) {
                strSubSequence = str2.subSequence(i2, str2.length());
                break;
            }
            i2++;
        }
        return strSubSequence.toString();
    }

    public static final String trimStart(String str, char... chars) {
        String strSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        String str2 = str;
        int length = str2.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (!ArraysKt.contains(chars, str2.charAt(i2))) {
                strSubSequence = str2.subSequence(i2, str2.length());
                break;
            }
            i2++;
        }
        return strSubSequence.toString();
    }
}
