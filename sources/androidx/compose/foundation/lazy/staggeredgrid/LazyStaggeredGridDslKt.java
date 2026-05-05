package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яġ\u0014D߬)\u001ew\u007fL܀kt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfrˎ8D{H6ɟ[*\u001dt\u0004é,[:qKП]\u001a\u0014\"\u0011ѧVg}nRZ\u0011C\u0017\u0006,xr,_U\u0001](\u000f:BuC;M\u0006=A`z7\r H\"@y\u000b\u0004\"*V\u001f~ٙKK\"\u00128@v:Z\r[Ĩ\"\u0012\f>(\u00014\\oޮ>H\u0003]B/9\u0003qBd'gܞ\u0005M\u001bd\\'\u0013vi\u001e9F?ߎ\u001d%i\u0003\u000fRa@\u001bӎpKݛ\u0001'U*ywe6p\u007fB\u0016[U\u0013]\u0001(t\u0005\u007fc<-1OqOh\u000eV|+\u0002\u0013<\u0012\u0014\u001e'v5] l\b\u001c;\rr\u0002I\u0001\bdB\u000e\u0005y6E00919)riai&~=\u0002\u0005\u001b,;\u0001\u001d0\fZ\u0014`#+lw\u007f:\u0002UKYf\u001bi?}\u0004\u001fu\u0012,\u00140u~]\u000e 2\u0017+K\">ٳ ǽɘLFm\f\u0013v\u0001\u05c9h`_X\"\u001d\u0015g.\u0017$rD\u0013\u0006\u001cVZX:\u0013e\u001c\u0003\n.\u000e\u0019 j{T!S\u0015~UnixSu\nS6\u0017=_ny\u0016o9\r<eWi\u0010ok\u000f\u0014mI\u0013\u000b^fPm$Z\u000bCR8Nj\u001e\u0006\u0014D|\u001bC8Eq*DD1GeE]\u0011/ZR\r\u000boZ\u0017#\u000fVC$1hR\u0007֊\u0005Pb\u00056lקHؓʬd$3]_R1Ic@\u00014+B7\u0003\u0002\u0018_gzH|p$\u0010m{N1J=_5U\u0013=\u0006o3ī1EZ\u0013}t[3?z+\u0019??v.\u007f\b\u0019q\\dxTgTE-'b\u0001) d.\u0001(GیKcb-sƽH\u0001&q<|7\u001d\u0007%Ǉ3%\u0018\"+H]M5@.}$1%a$\u000e\u001eS*\u0006\u0015.\u0003\f\u001cIs'\u007fq\u0018\u0002щ?BO\u0001\u000fD(L|\u0005HN\u0011!\u0018D\u00194;]^@\u0013\u0003\u0007[S\u000f=)~$<\u001e\u0001e\"^݇s\b:Uo0yk\u000e\u0016dIK:]Wwo\u0004J\u000b5x!:.\u00029|>4Z0ggqOTӒw\"<hKh\u000bd\u0019&:2b1\u001bEdi4=\u0011~tq?H8D\u0002in9dzlVv5pVp0p%϶\u0013=$ E7\u000b\u0016VV5iX*c\u001f\u0019\u001b\u0019N-\u0016ު/DZjЬ,X\u0007\u001f\fؖI͕\u00066\u0012yAէj}/P\u0018+\u001cb\u001a!ʃ_5\bv^q;_rq||\"hbNhM-.-1B\u0012\u001d11l\u0003\u0001r<\u0013rߺ;M ('J//\u001c~iLAV\u00167==w\u0015*&*i\u0004^\u0004\f.K?!\u00052lfT\u000bŭa%@=\u0002\u001ch*\u0019\u0015V&*WZx\u0003\fD\u0007dy0E26day$9]7<|\u0015\toи|\u0014i\u0014st[3\u0013h7\\ \u0018=R-\tUzD\u0012\u0007ljBY\"f?\u0018?%(/66\u00139!_r/\u0015քSe\u0013R?q0\nA2X$$H\nw\u0014*\u0003'CjܑQ>j:ЁpB]\"%Ȭ.̒x\f7H\u0015ۭHlF+4tq>f5Ю'C\u0004\rus7\u000eSl>'ATO\u001b}V9\u0015X/\u0017\u000bH\t\r2:S\u0019\u0002.\u001eǋ1PZd*-_L}f\t,q|HS\u0018;W2Ŕ3d>GNb DKS9G?:\u0011\u0017H\u0006\u001e1/4\u0019\u0001\u0004]0\u0005\u000b,%q\nB{I\"m«'9\u0015\u0017+]lc57kRMC\u0012vZ\u000e\u0014\bȡ\u0013k2pEK$\"eB\u0006\u0010EM4\n\u0006%\u0016D_rX\u000f\rx\\{e0>\\F\u007fT2u#Րw\u00142\u0011(yj\u0004q6G\u0001:PTO:<3+ƘQr\u007f2T\u0013K<G\u0011\f/Y@\r\u0012_qnX_q{^\r$B\u0015\u00022Rrq8\nGn\n:\u0017=!\u0003\u001aènwW\u0007 >\u00185\u001d\u0006}7x\u0018\u0010q-'moŗJ@b ]Gh3P\u0011*dTk\u001c\r\u0016\u0016\\GE:ҍN`\u001bDчKsG[Xͦ\u0002ؗ!\u0011i^\u001eɜgx|WU W];9َ{n\u00015\u0014o5_/n|1%\u0002z+tk\u0005qJb^\u000e\u001ck|z U\tSV$Ԋ4:V&jIc),!C[;\u001d\u000fCrF\"\tʒ/A]\u0016b[)U\t\u0004\t\u0016gB#\r.Sg\\9r;`n4\u000e`W\u0001\u0015 Y!\u0013pxWǵ\nI5h[r\\\u000eO\u001b]E%C084\u0015YH\u008ek\u001do52e\ttFX/Nq\u0003!jRl%y#6\\;h\u000e\fE\u0014=zNELoOZd \rQU\u0012\f0k\u0018vv_Skb\u0006*N@85̑Si\u001a\u0016ab^f'Y,F9+*\u001f6a*u?/E\u0005\u00144pub\u000f)\u001aDm@d(#vuNrlr´p#lv\u000e!Wlr\u000bfvnx s|;mZƕn#\u0007([g\u001d<GF|)\u000e\\J$q\"\u0002\\S\u007fͩ\n\u000ep\u0013ߢ\u0019{cG|Ůu۱\u0001\u0015\u0013x\u070fr\tt\bSܜ \u001a.ȳJ\u0016"}, d2 = {"\u001a`iF;6KW.\t\u0004m(\u0004v>a\u0002*{M\u0001\u0016xTs\r", "", "@nf@", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003tr(Px'TLM\u000eiVq\u001b\u0014\u0019a\u001c$", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{]'\u001c\u0005/", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "@de2e:>:\u0015\u0013\u0005n;", "", "DdaA\\*:Zt\f\bZ5~\t7e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", "6na6m6Gb\u0015\u0006^m,\u0005v:a},\u0005B", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "4kX;Z\t>V\u0015\u0010~h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w.J?t6z\u0015k]J\u000bm9$", "CrT?F*K] \u0006Zg(y\u0010/d", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{L5\u0018\u0005/", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u001a`iF;6KW.\t\u0004m(\u0004v>a\u0002*{M\u0001\u0016xTs\r\u0004t\n\u0018Ed\u000b'", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PQ;Jx)GYN+>_v<q\u0012a\u0015\\\u0001s\u0001b@1xH62Q*S\nFr\u000f\f_\u001e94XLU\u0014H}\u0015\u0003\u0017\u0010dOXl\u0004K@X,(n\u0014j'j:\u0004%\u001e\u0002\"\u001ad_2\u0014\u0005\u001d\u0018ng\u000e1uV\u0015|:$KmZHRsT\u0006[#4_i\u0007\u000e4Zt8t,eA.5R\u0014Gv\u0018\u0014Et\u001e+iK+%I\u0006\u0011ISn\u007fz>Wi)q\u0011\r^D5#n/jD#\u0011m&% ]^\u007f;[\b/Ev%'TT7Bu\u001e\b\u0014.qd\\\r\u0019^\t%zR\")\u0012\r\u0013o\u0017\u0018=\u001aGbXo&sA]\"RDE\u0019wbE\u0015xH\u0019|\nc[d~(4t\u0018\u001f\u0002\u001aGEu_Ms\u000f)}~\u0015\u0007(}wBC7\u001d5.<UGfj8TiS0(wE\u001c-v\u0012\tVIp;w*\u0011\u000f\u0012r\njR%>\fBHMskAtSN=j[\u000e;Q\u001f8n>vRdqDNx\u0017KY\u0012t\u001c\u001b90yF21\u00199n\u0017\u0016\u0018of<+\ngR\u001eM\\LRP%\bi/\u0012e\u0006*,\u0006", "\u001a`iFI,Kb\u001d|ve\u001a\f\u00051g\u007f5{?b$\u001bF", "1n[B`5L", "DdaA\\*:Z|\u000ezf\u001a\b\u0005-i\t*", "6na6m6Gb\u0015\u0006Vk9x\u00121e\b(\u0005O", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", "\u001a`iFI,Kb\u001d|ve\u001a\f\u00051g\u007f5{?b$\u001bF7#8u-\u0005*H", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PQ;Jx)GYN+>_v<q\u0012a\u0015\\\u0001s\u0001b@1xH62Q*S\nFr\u000f\f_\u001e94XLU\u0014H}\u0015\u0003\u0017\u0010dOXl\u0004K@X,(n\u0014j'j:\u0004%\u001e\u0002\"\u001ad_2\u0014\u0005\u001d\u0018ng\u000e1uV\u0015|:$KmZHRsT\u0006[#4_i\u0007\u000e4Zt8t,eA.5R\u0014Gv\u0018\u0014Et\u001e+iK+%I\u0006\u0011ISn\u007fz>Wi)q\u0011\r^D5#n/jD#\u0011m&% ]^\u007f;[\b/Ev%'TT7<`\u0011\u0012\u00061wiHVdR\u000b\"{N0_Z\u0004\rv!\u001b*%Ac\u001821[KW#\u00182\u0014\u0019\tUL\u0017pP\u0010vZ1>a|(K\u0003\u001aX\u001d:!#r[B|\u001a\u001a3\u0014T|'{tL\b6\\&/Mb7^o3\u0015p\u001d$\u0019uG,,-?K3Grgy\u0004\u0015\u0001\ny\u0001\u001fj\u0014-h9KXq&E-P\u0016D$S 5K$3j}$\f<\u0004>H}\u0012\n\rvNy\u00185%\u0003Q#f.xd\u0016\u0014\u0015y+/d\u000ehW%Q\u001bn\u0012&$\u0006f9\u0013\u0010/\u001cLx\u0010q", "@d\\2`)>`v\t\u0002n4\u0006v6o\u000f6", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_AbX4KK<;XTt=!\u0012Yo[/\fr`K3|/D)\u00190H\u0002H>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PQ;Jx)GYN+>_v<q\u0012a\u0015\\\u0001s\u0001b@1xH62Q*S\nFr\u000f\f_\u000f?zyAR\u001fK\u0004\u001e?H%|PinC#NR^3f\fg\u001deIx\u0007\u001e~\u001d0rY=\u0006\u0003)wn[xtqK\u0018\u000e\u0002\"HufPSo\u001f=~7(Jw\u0007\u0016<a>2pA\u000eD9\u007fO\u0001Jf\u001cG`i\u00113lA5{\u001d8\u001c>XmykQWf)i\u0013\u0018p5z&unrL\u0017\u0007'te=li\u000f7_[\"\rV\u00110E\fL_x(R\u0005.upSQ\u001b\u001e\u0002$\u0001M![ \u0007\roa#*+Q#\u001dw&a9M \tg:\u0019\u007fX\r{l]$OXvZE~ 8z\u0011V!2-IzQ1v\u001a%Bk\u0018\t.whB\u0007\f", "@d\\2`)>`\u0006\t\rL3\u0007\u0018=", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PQ;Jx)GYN+>_v<q\u0012a\u0015\\\u0001s\u0001b@1xH62Q*S\nFr\u000f\f_\u000f?zyAR\u001fK\u0004\u001e?H%|PinC#NR^3f\fg\u001deIx\u0015\u0014~(\u001ffL5_bO\u001aq_\u0004kfZbxB,IwiF\u000fp_L}&\u001bZ\u007f\u0002\u001b{_p?~=\u0013}\u00152c\u0004Op\u001a/Z\u007f%,j\u0017\u000e\"?; IOb\t6<\u0018p*k\u0016\u000e,BA\"tikHXdg\u001ff?o_\u000e\r6I%Ex\u00144P\u0003AnC\u0013\u0013\u000f/wsI\r\u001c^\u0011#o@1c\u001b\fLm\u00141B_Kh\u000bj,_DM\u0012\u000bu<\u000bE@?*\u0005*\u001dqJ`jSq&6\u0006\u0011H\u0003@O;dYM~\u001e\u0001A\u000b\u001c\u0003\u001csv\u0018", "7sT:f", "\"", "", "9dh", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7sT:", "", "1n]AX5MB-\nz", "AoP;", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003tr(Px'TLM\u000eiVq!#\u0012b{Y'\u0016Z", "7sT:66Gb\u0019\b\n", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Yq]+\u0015rWK/n\u001a", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PJ(c\u000b\u0015VHP.\\_r<u\u001f^\r<)\u0017\u0010Y\u0017\u001aUI30\u0004uP}DjJu\u0013\u00135h\u007f\u0018=\u0016Q\t\u001cyJrmWa)zWJCq.n\u0015mf=JC\"#u#$4&\u0015\u0010\u0006b\u0018v[ClxOb{H-<|_PN}\u001f\u001d\u00050\u001dZ\u007f\u0002\u001b}.[1~<\u000b83\u007fi\u0016S1\u0019Ngv$0fJ5o\u0017L\u001c=Zg\u007fu\ncO%k\u0017\u0015f>z\u001evm-I\u001f\u0010[&_?jmJ\u0018b\u000f<Xs\u001f0\u0015T\u0006L", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PJ(c\u000b\u0015VHP.\\_r<u\u001f^\r<)\u0017\u0010Y\u0017\u000bs@H\u001bQ<X\u0006B2g\u0010$\u001d\u000bQvLe\u0017K\u0003^zR12GihwVEOk8.lo&ZI>.\u001d=n\u0002nZ=\u0011\u007f\\Zwc\u00021hW\"xG(Hvi\u0010&\u007f^:\u0004+)TGMx8b\u00042x6M9;>.\u0006[p\u0016Mb\u0003\u001e:&\"7/4K\u0017IT/KSD\u0018w&e\u0011WgF9bfulF\u001e\u000bg i~Bo\n5a\nHR>jj7", "7sT:f\u0010GR\u0019\u0012z]", "", "7mS2k", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PJ(c\u000b\u0015VHP.\\_r<u\u001f^\r<)\u0017\u0010Y\u0017\u001aUI30\u0004uP}DjJu\u0013\u00135h\u007f\u0018=\u0016Q\t\u001cyJrmWa)zWJCq.n\u0015mf=JC\"#u#$5&\u0015\u0010\u0006b\u0018v[ClxOb{H-<|_PN}\u001f\u001d\u00050\u001dZ\u007f\u0002\u001b~.[1~<\u000b83\u007fi\u0016S1\u0019Ngv$0fJ5o\u0017L\u001c=Zg\u007fu\u000bcO%k\u0017\u0015f>z\u001evm-I\u001f\u0010[&_?jmJ\u0018b\u000f<Xs\u001f0\u0016T\u0006L", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PJ(c\u000b\u0015VHP.\\_r<u\u001f^\r<)\u0017\u0010Y\u0017\u000bs@H\u001bQ<X\u0006B2g\u0010$\u001d\u000bQvLe\u0017K\u0003^zR12GihwVEOk8.lo&ZI>.\u001d>n\u0002nZ=\u0011\u007f\\Zwc\u00021hW\"xG(Hvi\u0010&\u007f^:\u0004+)THMx8b\u00042x6M9;>.\u0006[p\u0016Mb\u0003\u001e:&\"7/4K\u0017IT0KSD\u0018w&e\u0011WgF9bfulF\u001e\u000bg i~Bo\n5a\nHR?jj7", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyStaggeredGridDslKt {
    /* JADX INFO: renamed from: LazyVerticalStaggeredGrid-zadm560, reason: not valid java name */
    public static final void m1214LazyVerticalStaggeredGridzadm560(final StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z2, float f2, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z3, final Function1<? super LazyStaggeredGridScope, Unit> function1, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z4 = z3;
        FlingBehavior flingBehavior2 = flingBehavior;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM898spacedBy0680j_4 = horizontal;
        float fM6638constructorimpl = f2;
        boolean z5 = z2;
        PaddingValues paddingValuesM1011PaddingValues0680j_4 = paddingValues;
        LazyStaggeredGridState lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1695323794);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LazyVerticalStaggeredGrid)P(!1,5,7,2,6,9:c#ui.unit.Dp,4,3,8)64@3068L32,69@3365L15,83@3878L67,73@3476L502:LazyStaggeredGridDsl.kt#fzvcnm");
        if ((i3 & 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            int i5 = composerStartRestartGroup.changed(staggeredGridCells) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= ((i3 + 4) - (i3 | 4) == 0 && composerStartRestartGroup.changedInstance(lazyStaggeredGridStateRememberLazyStaggeredGridState)) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(paddingValuesM1011PaddingValues0680j_4) ? 2048 : 1024)));
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 16));
        if (i8 != 0) {
            i4 |= 24576;
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i9 = composerStartRestartGroup.changed(z5) ? 16384 : 8192;
            i4 = (i4 + i9) - (i4 & i9);
        }
        int i10 = (i3 + 32) - (i3 | 32);
        if (i10 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            int i11 = composerStartRestartGroup.changed(fM6638constructorimpl) ? 131072 : 65536;
            i4 = (i4 + i11) - (i4 & i11);
        }
        int i12 = (-1) - (((-1) - i3) | ((-1) - 64));
        if (i12 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 1572864));
        } else if ((-1) - (((-1) - i2) | ((-1) - 1572864)) == 0) {
            i4 |= composerStartRestartGroup.changed(horizontalOrVerticalM898spacedBy0680j_4) ? 1048576 : 524288;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(flingBehavior2)) ? 8388608 : 4194304;
        }
        int i13 = (-1) - (((-1) - i3) | ((-1) - 256));
        if (i13 != 0) {
            i4 |= 100663296;
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            int i14 = composerStartRestartGroup.changed(z4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i4 = (i4 + i14) - (i4 & i14);
        }
        if ((i3 & 512) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 805306368));
        } else if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            int i15 = composerStartRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
            i4 = (i4 + i15) - (i4 & i15);
        }
        if ((i4 + 306783379) - (306783379 | i4) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 + 4) - (i3 | 4) != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
                if (i7 != 0) {
                    paddingValuesM1011PaddingValues0680j_4 = PaddingKt.m1011PaddingValues0680j_4(Dp.m6638constructorimpl(0));
                }
                if (i8 != 0) {
                    z5 = false;
                }
                if (i10 != 0) {
                    fM6638constructorimpl = Dp.m6638constructorimpl(0);
                }
                if (i12 != 0) {
                    horizontalOrVerticalM898spacedBy0680j_4 = Arrangement.INSTANCE.m898spacedBy0680j_4(Dp.m6638constructorimpl(0));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i4 &= -29360129;
                }
                if (i13 != 0) {
                    z4 = true;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 4) - (i3 | 4) != 0) {
                    i4 &= -897;
                }
                if ((i3 + 128) - (i3 | 128) != 0) {
                    i4 &= -29360129;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1695323794, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:72)");
            }
            Orientation orientation = Orientation.Vertical;
            float fMo904getSpacingD9Ej5fM = horizontalOrVerticalM898spacedBy0680j_4.mo904getSpacingD9Ej5fM();
            int i16 = i4 >> 3;
            int i17 = i4 >> 6;
            int i18 = (-1) - (((-1) - ((-1) - (((-1) - (i4 << 6)) | ((-1) - 7168)))) & ((-1) - ((-1) - (((-1) - ((i17 + 14) - (i17 | 14))) & ((-1) - 48)))));
            int i19 = i4 << 3;
            int i20 = i18 | (57344 & i19);
            int i21 = (i19 + 458752) - (i19 | 458752);
            int i22 = (i20 + i21) - (i20 & i21);
            int i23 = (3670016 + i16) - (3670016 | i16);
            int i24 = ((i22 + i23) - (i22 & i23)) | (29360128 & i16);
            int i25 = (-1) - (((-1) - (i4 << 9)) | ((-1) - 234881024));
            int i26 = (i24 + i25) - (i24 & i25);
            int i27 = i4 >> 27;
            LazyStaggeredGridKt.m1219LazyStaggeredGridLJWHXA8(lazyStaggeredGridStateRememberLazyStaggeredGridState, orientation, rememberColumnSlots(staggeredGridCells, horizontalOrVerticalM898spacedBy0680j_4, paddingValuesM1011PaddingValues0680j_4, composerStartRestartGroup, (i16 & 896) | ((-1) - (((-1) - ((-1) - (((-1) - i4) | ((-1) - 14)))) & ((-1) - ((-1) - (((-1) - (i4 >> 15)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))))))), companion, paddingValuesM1011PaddingValues0680j_4, z5, flingBehavior2, z4, fM6638constructorimpl, fMo904getSpacingD9Ej5fM, function1, composerStartRestartGroup, i26, (i27 + 14) - (i27 | 14), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
            final PaddingValues paddingValues2 = paddingValuesM1011PaddingValues0680j_4;
            final boolean z6 = z5;
            final float f3 = fM6638constructorimpl;
            final Arrangement.Horizontal horizontal2 = horizontalOrVerticalM898spacedBy0680j_4;
            final FlingBehavior flingBehavior3 = flingBehavior2;
            final boolean z7 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i28) {
                    LazyStaggeredGridDslKt.m1214LazyVerticalStaggeredGridzadm560(staggeredGridCells, modifier2, lazyStaggeredGridState2, paddingValues2, z6, f3, horizontal2, flingBehavior3, z7, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    private static final LazyGridStaggeredGridSlotsProvider rememberColumnSlots(final StaggeredGridCells staggeredGridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1267076841, "C(rememberColumnSlots)P(!1,2)94@4216L1114:LazyStaggeredGridDsl.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1267076841, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:94)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 463564400, "CC(remember):LazyStaggeredGridDsl.kt#9igjgp");
        int i3 = (-1) - (((-1) - ((((((14 & i2) ^ 6) <= 4 || !composer.changed(staggeredGridCells)) && (-1) - (((-1) - i2) | ((-1) - 6)) != 4) ? 0 : 1) | ((((((-1) - (((-1) - i2) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) ^ 48) <= 32 || !composer.changed(horizontal)) && (48 & i2) != 32) ? 0 : 1))) & ((-1) - ((((((i2 + 896) - (896 | i2)) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(paddingValues)) || (i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256) ? 1 : 0)));
        LazyStaggeredGridSlotCache lazyStaggeredGridSlotCacheRememberedValue = composer.rememberedValue();
        if (i3 != 0 || lazyStaggeredGridSlotCacheRememberedValue == Composer.Companion.getEmpty()) {
            lazyStaggeredGridSlotCacheRememberedValue = new LazyStaggeredGridSlotCache(new Function2<Density, Constraints, LazyStaggeredGridSlots>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberColumnSlots$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGridSlots invoke(Density density, Constraints constraints) {
                    return m1215invoke0kLqBqw(density, constraints.m6597unboximpl());
                }

                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridSlots m1215invoke0kLqBqw(Density density, long j2) {
                    if (Constraints.m6591getMaxWidthimpl(j2) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.".toString());
                    }
                    int iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j2) - density.mo704roundToPx0680j_4(Dp.m6638constructorimpl(PaddingKt.calculateStartPadding(paddingValues, LayoutDirection.Ltr) + PaddingKt.calculateEndPadding(paddingValues, LayoutDirection.Ltr)));
                    StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    Arrangement.Horizontal horizontal2 = horizontal;
                    int[] iArrCalculateCrossAxisCellSizes = staggeredGridCells2.calculateCrossAxisCellSizes(density, iM6591getMaxWidthimpl, density.mo704roundToPx0680j_4(horizontal2.mo904getSpacingD9Ej5fM()));
                    int[] iArr = new int[iArrCalculateCrossAxisCellSizes.length];
                    horizontal2.arrange(density, iM6591getMaxWidthimpl, iArrCalculateCrossAxisCellSizes, LayoutDirection.Ltr, iArr);
                    return new LazyStaggeredGridSlots(iArr, iArrCalculateCrossAxisCellSizes);
                }
            });
            composer.updateRememberedValue(lazyStaggeredGridSlotCacheRememberedValue);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) lazyStaggeredGridSlotCacheRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return lazyGridStaggeredGridSlotsProvider;
    }

    /* JADX INFO: renamed from: LazyHorizontalStaggeredGrid-cJHQLPU, reason: not valid java name */
    public static final void m1213LazyHorizontalStaggeredGridcJHQLPU(final StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z2, Arrangement.Vertical vertical, float f2, FlingBehavior flingBehavior, boolean z3, final Function1<? super LazyStaggeredGridScope, Unit> function1, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z4 = z3;
        FlingBehavior flingBehavior2 = flingBehavior;
        float fM6638constructorimpl = f2;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM898spacedBy0680j_4 = vertical;
        boolean z5 = z2;
        PaddingValues paddingValuesM1011PaddingValues0680j_4 = paddingValues;
        LazyStaggeredGridState lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-8666074);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LazyHorizontalStaggeredGrid)P(6,4,7,1,5,9,3:c#ui.unit.Dp,2,8)154@6993L32,159@7288L15,173@7803L59,163@7399L496:LazyStaggeredGridDsl.kt#fzvcnm");
        if ((i3 & 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(staggeredGridCells) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i6 = ((i3 + 4) - (i3 | 4) == 0 && composerStartRestartGroup.changedInstance(lazyStaggeredGridStateRememberLazyStaggeredGridState)) ? 256 : 128;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            int i8 = composerStartRestartGroup.changed(paddingValuesM1011PaddingValues0680j_4) ? 2048 : 1024;
            i4 = (i4 + i8) - (i4 & i8);
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((i2 & 24576) == 0) {
            int i10 = composerStartRestartGroup.changed(z5) ? 16384 : 8192;
            i4 = (i4 + i10) - (i4 & i10);
        }
        int i11 = (i3 + 32) - (i3 | 32);
        if (i11 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 |= composerStartRestartGroup.changed(horizontalOrVerticalM898spacedBy0680j_4) ? 131072 : 65536;
        }
        int i12 = (i3 + 64) - (i3 | 64);
        if (i12 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 1572864));
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(fM6638constructorimpl) ? 1048576 : 524288)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(flingBehavior2)) ? 8388608 : 4194304;
        }
        int i13 = (-1) - (((-1) - i3) | ((-1) - 256));
        if (i13 != 0) {
            i4 = (i4 + 100663296) - (i4 & 100663296);
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i4 |= composerStartRestartGroup.changed(z4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 512)) != 0) {
            i4 = (i4 + 805306368) - (i4 & 805306368);
        } else if ((i2 & 805306368) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function1) ? 536870912 : 268435456)));
        }
        if ((i4 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i4 = (i4 - 897) - (i4 | (-897));
                }
                if (i7 != 0) {
                    paddingValuesM1011PaddingValues0680j_4 = PaddingKt.m1011PaddingValues0680j_4(Dp.m6638constructorimpl(0));
                }
                if (i9 != 0) {
                    z5 = false;
                }
                if (i11 != 0) {
                    horizontalOrVerticalM898spacedBy0680j_4 = Arrangement.INSTANCE.m898spacedBy0680j_4(Dp.m6638constructorimpl(0));
                }
                if (i12 != 0) {
                    fM6638constructorimpl = Dp.m6638constructorimpl(0);
                }
                if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i4 = (i4 - 29360129) - (i4 | (-29360129));
                }
                if (i13 != 0) {
                    z4 = true;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 4) - (i3 | 4) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
                if ((i3 & 128) != 0) {
                    i4 = (i4 - 29360129) - (i4 | (-29360129));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-8666074, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:162)");
            }
            Orientation orientation = Orientation.Horizontal;
            float fMo904getSpacingD9Ej5fM = horizontalOrVerticalM898spacedBy0680j_4.mo904getSpacingD9Ej5fM();
            int i14 = (-1) - (((-1) - (i4 & 14)) & ((-1) - ((i4 >> 12) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
            int i15 = i4 >> 3;
            int i16 = i15 & 896;
            LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProviderRememberRowSlots = rememberRowSlots(staggeredGridCells, horizontalOrVerticalM898spacedBy0680j_4, paddingValuesM1011PaddingValues0680j_4, composerStartRestartGroup, (i16 + i14) - (i16 & i14));
            int i17 = (-1) - (((-1) - (i4 >> 6)) | ((-1) - 14));
            int i18 = i4 << 6;
            int i19 = (i18 & 7168) | ((i17 + 48) - (i17 & 48));
            int i20 = i4 << 3;
            int i21 = i19 | ((-1) - (((-1) - i20) | ((-1) - 57344))) | (i20 & 458752) | (3670016 & i15);
            int i22 = 29360128 & i15;
            int i23 = (i21 + i22) - (i21 & i22);
            int i24 = (-1) - (((-1) - i18) | ((-1) - 234881024));
            LazyStaggeredGridKt.m1219LazyStaggeredGridLJWHXA8(lazyStaggeredGridStateRememberLazyStaggeredGridState, orientation, lazyGridStaggeredGridSlotsProviderRememberRowSlots, companion, paddingValuesM1011PaddingValues0680j_4, z5, flingBehavior2, z4, fM6638constructorimpl, fMo904getSpacingD9Ej5fM, function1, composerStartRestartGroup, (i23 + i24) - (i23 & i24), (-1) - (((-1) - (i4 >> 27)) | ((-1) - 14)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
            final PaddingValues paddingValues2 = paddingValuesM1011PaddingValues0680j_4;
            final boolean z6 = z5;
            final Arrangement.Vertical vertical2 = horizontalOrVerticalM898spacedBy0680j_4;
            final float f3 = fM6638constructorimpl;
            final FlingBehavior flingBehavior3 = flingBehavior2;
            final boolean z7 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i25) {
                    LazyStaggeredGridDslKt.m1213LazyHorizontalStaggeredGridcJHQLPU(staggeredGridCells, modifier2, lazyStaggeredGridState2, paddingValues2, z6, vertical2, f3, flingBehavior3, z7, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    private static final LazyGridStaggeredGridSlotsProvider rememberRowSlots(final StaggeredGridCells staggeredGridCells, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1532383053, "C(rememberRowSlots)P(1,2)184@8120L940:LazyStaggeredGridDsl.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1532383053, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:184)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1011137904, "CC(remember):LazyStaggeredGridDsl.kt#9igjgp");
        int i3 = (-1) - (((-1) - ((-1) - (((-1) - ((((((-1) - (((-1) - i2) | ((-1) - 14))) ^ 6) <= 4 || !composer.changed(staggeredGridCells)) && (6 & i2) != 4) ? 0 : 1)) & ((-1) - ((((((i2 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i2)) ^ 48) <= 32 || !composer.changed(vertical)) && (-1) - (((-1) - i2) | ((-1) - 48)) != 32) ? 0 : 1))))) & ((-1) - ((((((-1) - (((-1) - i2) | ((-1) - 896))) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(paddingValues)) || (i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256) ? 1 : 0)));
        LazyStaggeredGridSlotCache lazyStaggeredGridSlotCacheRememberedValue = composer.rememberedValue();
        if (i3 != 0 || lazyStaggeredGridSlotCacheRememberedValue == Composer.Companion.getEmpty()) {
            lazyStaggeredGridSlotCacheRememberedValue = new LazyStaggeredGridSlotCache(new Function2<Density, Constraints, LazyStaggeredGridSlots>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberRowSlots$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGridSlots invoke(Density density, Constraints constraints) {
                    return m1216invoke0kLqBqw(density, constraints.m6597unboximpl());
                }

                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridSlots m1216invoke0kLqBqw(Density density, long j2) {
                    if (Constraints.m6590getMaxHeightimpl(j2) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.".toString());
                    }
                    int iM6590getMaxHeightimpl = Constraints.m6590getMaxHeightimpl(j2) - density.mo704roundToPx0680j_4(Dp.m6638constructorimpl(paddingValues.mo971calculateTopPaddingD9Ej5fM() + paddingValues.mo968calculateBottomPaddingD9Ej5fM()));
                    StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    Arrangement.Vertical vertical2 = vertical;
                    int[] iArrCalculateCrossAxisCellSizes = staggeredGridCells2.calculateCrossAxisCellSizes(density, iM6590getMaxHeightimpl, density.mo704roundToPx0680j_4(vertical2.mo904getSpacingD9Ej5fM()));
                    int[] iArr = new int[iArrCalculateCrossAxisCellSizes.length];
                    vertical2.arrange(density, iM6590getMaxHeightimpl, iArrCalculateCrossAxisCellSizes, iArr);
                    return new LazyStaggeredGridSlots(iArr, iArrCalculateCrossAxisCellSizes);
                }
            });
            composer.updateRememberedValue(lazyStaggeredGridSlotCacheRememberedValue);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) lazyStaggeredGridSlotCacheRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return lazyGridStaggeredGridSlotsProvider;
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, Function1 function1, Function1 function12, Function1 function13, Function4 function4, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function12 = new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(T t2) {
                    return null;
                }
            };
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            function13 = null;
        }
        lazyStaggeredGridScope.items(list.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, list) : null, new AnonymousClass3(function12, list), function13 != null ? new LazyStaggeredGridDslKt$items$4$1(function13, list) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new AnonymousClass5(function4, list)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$3, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017$B\u0011&\u0006\u0007l?ӄRex2`TB\u000f\u001a}z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass3 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.$contentType = function1;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int i2) {
            return this.$contentType.invoke((T) this.$items.get(i2));
        }
    }

    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function1<? super T, StaggeredGridItemSpan> function13, Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyStaggeredGridScope.items(list.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, list) : null, new AnonymousClass3(function12, list), function13 != null ? new LazyStaggeredGridDslKt$items$4$1(function13, list) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new AnonymousClass5(function4, list)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$5, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u0006ј~jg/dgN\u008c`SR\u000f\u001a|d(i&\nCiX`\u0007̀\rQTkus"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Yq]+\u0015rWK/n\u001a", "7mS2k", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PJ(c\u000b\u0015VHP.\\_r<u\u001f^\r2:\r\rG?.yD\r\u0003n(R\u0001Hr\u0005\u000b)W3txM`\u001eGC\"\u0006J8lNY)WQIPl8d\u00195\u0001 +"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass5 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyStaggeredGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, List<? extends T> list) {
            super(4);
            this.$itemContent = function4;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            ComposerKt.sourceInformation(composer, "C345@15356L25:LazyStaggeredGridDsl.kt#fzvcnm");
            if ((i3 + 6) - (6 | i3) == 0) {
                i4 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 + 48) - (i3 | 48) == 0) {
                i4 = (-1) - (((-1) - i4) & ((-1) - (composer.changed(i2) ? 32 : 16)));
            }
            if ((-1) - (((-1) - i4) | ((-1) - 147)) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-886456479, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:345)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, (T) this.$items.get(i2), composer, Integer.valueOf((i4 + 14) - (i4 | 14)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, Function2 function2, Function2 function22, Function2 function23, Function5 function5, int i2, Object obj) {
        if ((2 & i2) != 0) {
            function2 = null;
        }
        if ((4 & i2) != 0) {
            function22 = new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1
                public final Void invoke(int i3, T t2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        if ((i2 & 8) != 0) {
            function23 = null;
        }
        lazyStaggeredGridScope.items(list.size(), function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, list) : null, new C05243(function22, list), function23 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(function23, list) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C05255(function5, list)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017$B\u0011&\u0006\u0007l?ӄRex2`TB\u000f\u001a}z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C05243 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05243(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.$contentType = function2;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int i2) {
            return this.$contentType.invoke(Integer.valueOf(i2), (T) this.$items.get(i2));
        }
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function22, Function2<? super Integer, ? super T, StaggeredGridItemSpan> function23, Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyStaggeredGridScope.items(list.size(), function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, list) : null, new C05243(function22, list), function23 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(function23, list) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C05255(function5, list)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$5, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u0006ј~jg/dgN\u008c`SR\u000f\u001a|d(i&\nCiX`\u0007̀\rQTkus"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Yq]+\u0015rWK/n\u001a", "7mS2k", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PJ(c\u000b\u0015VHP.\\_r<u\u001f^\r2:\r\rG?.yD\r\u0003n(R\u0001Hr\u0005\u000b)W3txM`\u001eGC\"\u0006J8lNY)WQIPl8d\u00195\u0001 +"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C05255 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05255(Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, List<? extends T> list) {
            super(4);
            this.$itemContent = function5;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            ComposerKt.sourceInformation(composer, "C385@17315L32:LazyStaggeredGridDsl.kt#fzvcnm");
            if ((6 & i3) == 0) {
                int i5 = composer.changed(lazyStaggeredGridItemScope) ? 4 : 2;
                i4 = (i5 + i3) - (i5 & i3);
            } else {
                i4 = i3;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
                i4 |= composer.changed(i2) ? 32 : 16;
            }
            if ((-1) - (((-1) - i4) | ((-1) - 147)) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(284833944, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:385)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, Integer.valueOf(i2), (T) this.$items.get(i2), composer, Integer.valueOf(i4 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, Function1 function1, Function1 function12, Function1 function13, Function4 function4, int i2, Object obj) {
        if ((2 & i2) != 0) {
            function1 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function12 = new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(T t2) {
                    return null;
                }
            };
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            function13 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, objArr) : null, new AnonymousClass8(function12, objArr), function13 != null ? new LazyStaggeredGridDslKt$items$9$1(function13, objArr) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new AnonymousClass10(function4, objArr)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$8, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017$B\u0011&\u0006\u0007l?ӄRex2`TB\u000f\u001a}z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass8 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.$contentType = function1;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
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
        public final Object invoke(int i2) {
            return this.$contentType.invoke(this.$items[i2]);
        }
    }

    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function1<? super T, StaggeredGridItemSpan> function13, Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyStaggeredGridScope.items(tArr.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, tArr) : null, new AnonymousClass8(function12, tArr), function13 != null ? new LazyStaggeredGridDslKt$items$9$1(function13, tArr) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new AnonymousClass10(function4, tArr)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$10, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u0006ј~jg/dgN\u008c`SR\u000f\u001a|d(i&\nCiX`\u0007̀\rQTkus"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Yq]+\u0015rWK/n\u001a", "7mS2k", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PJ(c\u000b\u0015VHP.\\_r<u\u001f^\r2:\r\rG?.yD\r\u0003n(R\u0001Hr\u0005\u000b)W3txM`\u001eGC\"\u0006J8lNY)WQIPl8d\u00195\u0001 +"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass10 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyStaggeredGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, T[] tArr) {
            super(4);
            this.$itemContent = function4;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
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
        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            ComposerKt.sourceInformation(composer, "C425@19176L25:LazyStaggeredGridDsl.kt#fzvcnm");
            if ((6 & i3) == 0) {
                i4 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
                i4 |= composer.changed(i2) ? 32 : 16;
            }
            if ((i4 & 147) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2101296000, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:425)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, this.$items[i2], composer, Integer.valueOf((-1) - (((-1) - i4) | ((-1) - 14))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, Function2 function2, Function2 function22, Function2 function23, Function5 function5, int i2, Object obj) {
        if ((2 & i2) != 0) {
            function2 = null;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            function22 = new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6
                public final Void invoke(int i3, T t2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        if ((i2 & 8) != 0) {
            function23 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, objArr) : null, new C05278(function22, objArr), function23 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(function23, objArr) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C052310(function5, objArr)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017$B\u0011&\u0006\u0007l?ӄRex2`TB\u000f\u001a}z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C05278 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05278(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.$contentType = function2;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
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
        public final Object invoke(int i2) {
            return this.$contentType.invoke(Integer.valueOf(i2), this.$items[i2]);
        }
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function22, Function2<? super Integer, ? super T, StaggeredGridItemSpan> function23, Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyStaggeredGridScope.items(tArr.length, function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, tArr) : null, new C05278(function22, tArr), function23 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(function23, tArr) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C052310(function5, tArr)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$10, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u0006ј~jg/dgN\u008c`SR\u000f\u001a|d(i&\nCiX`\u0007̀\rQTkus"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Yq]+\u0015rWK/n\u001a", "7mS2k", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PJ(c\u000b\u0015VHP.\\_r<u\u001f^\r2:\r\rG?.yD\r\u0003n(R\u0001Hr\u0005\u000b)W3txM`\u001eGC\"\u0006J8lNY)WQIPl8d\u00195\u0001 +"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C052310 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C052310(Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, T[] tArr) {
            super(4);
            this.$itemContent = function5;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
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
        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            ComposerKt.sourceInformation(composer, "C465@21139L32:LazyStaggeredGridDsl.kt#fzvcnm");
            if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
                i4 = (-1) - (((-1) - (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2)) & ((-1) - i3));
            } else {
                i4 = i3;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
                i4 |= composer.changed(i2) ? 32 : 16;
            }
            if ((-1) - (((-1) - i4) | ((-1) - 147)) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-804487775, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:465)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, Integer.valueOf(i2), this.$items[i2], composer, Integer.valueOf((i4 + 126) - (i4 | 126)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
