package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яś\u0014D߬)\u001e\u007f\u007fLDiw\fA\u00140\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\n:,[*qK;k\u001a\u0006̝\u0011Odgon`Z\u0013C%\u0006\u001ex\u0001,QU~^\u001a\u000fHBw?IMw=?`|6\u001b :\">z\r\u00010*PƵ~zYK\u0014\u00126@x:h\rUĨ\"\u0012\u0014\\(\u00014\\oޮ>H\u0003]B/)\u0007qB\\:g0\u0003U\u0015Fj'\u0015vw\u001e3¨?5+%[Έ\u000fRie\u000b?\b=\rؒ/'AI{W<X\b\u0014++W\rct.\\\u0013Zh\f-+WcaP\u0016ߊ\u007fz\u0012\rD\u0004\u0014\n/HD-\"f\u000e\u0012;t\tSHА\u001aDP\u0004\u0013ad\u001cU\u00069+G!~Q\u0010BIT={\u0013\u00156#/wQaZ\u000en\u001f3T&\\aWF=VZ\"Ykz4vh\u00028\u0012HG.<,\u00174\u00173Fs9Q1\u001c\u001cVU\u007f\r\u0015bxS\u0018eXB2nD<X\u001bɔ^Dj\u0019\u07fbTT^AWRɟX\u0007\f\u001e+\u0006j\u000fT!S\u0015~UnixSu\nS6\u0017=_ny\u0018o9\r>eWi\u0010oZ\u000f\u0014mE\u0013\u000b^fPk$Z\u000b5R8Nj\u001e\u0006\u0014D|\u0019C8Eq*CD1GuEb\u0011/ZW\r\u000boZ\u0017*\u000fVC$1nR\u0007֊\u0005Pb\u0005״kxOACeĘ1A_P1Ic>\u00014+@7\u0003\u0002\b_gzP|p$\u007fm{N!J=_MU\u0013=\fo1ī1EZ\u0012}\u0005[2?z+\u001b??v6\u007f\b\u0019y\\dxTgTE-'b\u0001A d.\u0007\u0012J\tU{T9hnM\u0001%q<|[C\u0004ȷ\"%\u000f\u0014:Ĳ4;h?\u001dD\u001eD9#\tuo\u007f0\nb=O#\u000e4Mq@\b\u007fa_B;fri\u0001N\"Ry\u0013DXj&\u0015R\u000bD\raUo\u0010ވZ8S _\u001ft3D*\u0001Xk:A\u0019\u000e6>_X\u0001S\u007f$^q2!Ocg\u001czy\b\u05c8N\u000f\u0010 ,5|?4=Nc\bf\u0017^\u001esFCq?p4T\tRA\\@\u0016)[T\u0018\u0013@~\u000eTw\u000fE?rwIe&T'\u007f\u001dHϖdEnQBZ\r4K\u001e'[a\u000f{ml5s4\u0011SK2I\u0013\u007f\u0003tVCD\u0003kK,f4#E\fuy\u0006D1_)\u001cx \u0010FF\u0015\u001dp%K=_@wv^k;Yrl|v@s\u0003R07\u0017z+\u001bl\u000e\u001d\u001a1O!\u0013)-ٮRwEw2R%yA\u0007:\n\u0014P)T\u001e;=?YjBP*\u007f\u0004\\\f28=7\u0006\u0005!\u000b\u0001\u001eh\u001a]IG&s&b0\u0016#R0\u0004\\W#\u001e˹2\b<d27\u0010IvY\u001a\u0005QD5Y\u0005\u0006pX\u0019|\u0018\u0002\u0005c\u001dbQ\u0003~܃U\b&EPK\u0016WW<:p`J\u0013c \u0007:.<EG-` \u007f9\u0012_c\u0017\u001a{Qk\rY<{,q1^_.\u007f/y$\u0011X\u007fӲ\u0019;\\bn\u0006\u0017\t\u0005_g\u0010njV\u000e\u0005\u000e9\u0014+\fX`!\u0013bS\u0003 t/e&M\u0007ǏK`\r\u0019uM4WIRm(g6\u0019\u001e@v?\u0010jf\u0003/BB7\u007f0k:K^Tk'W]2{|\u0003TXu<P\u0017D\u0011<4uZPCL\u00152\u001cincE'\u001b\u0019\u0015f\u0011 \u000b'=\u0003Q\u0002.Z\u0005\u000b\u001f%?(>29ތ;r1h'#)\u0012~;SV\u0016P5\u0016\u001aex\n}gd\u0017y,w>u\"\bsX\u007f8,T(\u0014\u0004;\u007fs>x.m~XV\"zJ%ń:nR^_G\u00070\",\u0018U\u001cd\n dE\tS1Dlj]v\u0015\u0007en\n\rT\rsWeQ6-A[\u0015\u0010}7p/W9e/\u000b#l\u0017\u0002KR2\u0010~*KNwB\u0006[\u001f\u0005gxx\u0006Q\u000e\u001dh\u0016\u001b\u001c\u001cw_u'ٻҼ\u001cȁĔOxL\u007fjCe[pVX\u000fRkVB:46\u001a<\u0015/\u0002,\u0018\u0011\u0019!]_soTX͟\u0014;+_s%42\u0010juh\u0006uf\nQ39;z\\C\u0012t\u0005\u0004.\u0012\u07bdCO\u000e:C.u|f\u001aX\u001c6\u0012S$`\u0010r9t,{wH0~O\u000bUkR4-MY%g\u00151\u0011\nkf!+e\\\u001dd\u001cƪۃwߏК\u0014C\u001ff\u0019rk\f@x\f\r_{$\b\u000b\b\u0006\u0001{\u0011(\u0003\u0010\u0013Q3\u0014\u0016GAyy\u0007iMpo?-\u0019P+29+$\u0011\u001aCs\u001czw\t\\8f)v\t\bj\u0017Fxi\u0013t:n<<caU\u0006?\u0015bލƜ^ގڝ2r\u000f$]H\u0014FsN~voLsn\u001e\u001fN3\u0002\u0011\u0012\u0013\u000eV\u001fWj8V\u0019m%nsH\u001a=8o҅`)^\u0016,ہoحwZhײq6q0rz\u0013xr@{>jGCÄh\u008f\u0002!Yɂz\u000bfsVBřbq4*<Ɣ\u0007G\u007fΤOC"}, d2 = {"\u0011Q> F&\u001aF|lt:\u0013`j\u0018M_\u0011j:n\u0006r4^", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u001d", "5dc\u0010E\u0016,A\u0013ZmB\u001avd\u0016Ia\u0011c i\u0006\u00115^i)e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w+PEyBy(lo\u0015\u000eg.W~'P[$", "\u0011Q> F&\u001aF|lt:\u0013`j\u0018M_\u0011j:o\u0001\u0002", "5dc\u0010E\u0016,A\u0013ZmB\u001avd\u0016Ia\u0011c i\u0006\u00116Yx", "\u0014k^D66Ec!\b", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "DdaA\\*:Zt\f\bZ5~\t7e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", "6na6m6Gb\u0015\u0006Vk9x\u00121e\b(\u0005O", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", ";`g\u0016g,Fa|\bZZ*\u007ff9l\u00100\u0005", "", ";`g\u0019\\5>a", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\u0019u;.\u001dqKJ\u0007p-U\u00019\u001d", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\u0019u;.\u001dqO7\u0011n,$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pd6^\u007f&C[R6e\u001cy9(\u001cj\u001d\u0018\u0007\u001a\u0012UJ&nL7(\u0017j:\u0002Hw\u0005\n\u0012\u0015\u000bQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bFl:m\u000b[,`DCm\u001bm-%x_we\t`\r{TyogP(9\u001b.KqpPN~QCJ\u000b\u00032w\u0001\u0011?bx*\bv\u0002>2An\u0013K1\u0019Hn\u0002\u0014(kE1/\u007fC\u000fSUs\u00056\u001f\u0015r1?\u0012\u0015r=:\u0003vepI\u0016\u0011olB;kn\b;[OCZw^(V\b@j}\u001f\u0012\u0015mNuRA*X\u000b#>\u001a\t[\u001a\u0002\u0010p\u001c\u001bA_;c\u0017s4m7\u0017 \u0019qG\u0010\u0004Y\rrzP\u001bwYrh-S\byi", "\u0014k^DE6P", ";`g\u0016g,Fa|\bZZ*\u007fu9w", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU(uF\b&hn:\u000em>$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU(uF\f\u0013rl9\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pd6^\u007f&C[R6e\u001cy9(\u001cj\u001d\u0018\u0007\u001a\u0012UJ&nL7(\u0017j,\fHl\u0016\u0016\u001f\u001d1qF)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,+n\u001ch\u001cXI>.\u001d; \u0017|Z>\u0019E/\u001e\u007fN\u0003igO\u0019\u0004Gb/mhUImQCJ\u000b\u00032w\u0001\u0011?bx*\bv\u0002>2An\u0013K1\u0019Hn\u0002\u0014(kE1/\u007fC\u000fSUs\u00056\u001f\u0015r1N\u0012 LF1&flmZdmc!j<ehJ<c\u000e\bJ\u007f\u001e%U\u0003Ld\b^i\u0017-ktMM$\"V\u0001lM!l\u001b\u0007\u0002ya\u001a8\u001eHc\u001dhslGV\"\rp8UYcK zV\u0010z!V?\u001b`", "1n[B`5&S\u0015\r\u000bk,\u0005\t8tb(\u0003K\u0001$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7X 5QAOA", ";`g\u0016g,Fa|\bbZ0\u0006dBi\u000e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\nZP7t6\u001e\u001dhjHET,[\u0006+EHU\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001 \u0012<R\u00017w\u0005\u0016\u001fW<f\u0005Lf\u001f\u0011U\"\u0003=2jFa_\u0003V\u007f(l7h!i&k6AywX\u0015$g]8\u000ezfZp\\\u0002rqU\u0019DE4G|_NE93F|2)Y{\u0005g\u0016\u001c['},\u0011>.5wNIq Ih\u0007\u0015ulEp-2P\u001dOZ-]l:\u001cx,ar\u0018i9/-;", "1n[B`5&S\u0015\r\u000bk,\u0005\t8tg8\u0003O\u0005t!P~\u000eE\u0006\b5`\t D", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^5<h\u0002}Av%.VR#k0,%ua$\u0011j0L\u000b|", "=uT?Y3He\u0007\u000evm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%wKJ\u0007p-U\u000195[J;\\(", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\nZP7t6\u001e\u001dhjHET,[\u0006+EHU\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001 \u0012<R\u00017w\u0005\u0016\u001fW<f\u0005Lf\u001f\u0011U\"\u0003=2jFa_\u0003V\u007f(l7h!i&k6AywU\u007f\u0017qO;\u0014\u007fR$<P\u0004orQ'z\u0002%H}dEA~YF}p&G\u0010\u0002\"A\"U2~?j0>@t\u00145x\u0018K_\u007f\u001f>JP#56\u0012y;Tb\u0003vB\r{h_\u0012\u0016m??\u0019/rsQ\u001e\u000be\u0017%\u0013kg\fA`\u0006K\u001fSX\u000eB\bAh\u0004\u0019\b\u001amkoQN%b\u0001c\u0001Hkf\r\u0017\rv'e\u0016&Dh\u0013F4hFM\u001c\u0018P8\b\niP\u0015[R\u0017qI\u00071", "7mc?\\5LW\u0017\\\bh:\u000bdBi\u000e\u0016\u007fU\u0001", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &+x\u001d'r)B/", "1gX9W9>\\", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", ";`X;4?Ba\u0007\u0003\u0010^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "1q^@f\bQW'l~s,", ";`X;4?Bat\u0010vb3x\u00066e", ";`X;4?Ba\u0007\nv\\0\u0006\u000b", "1q^@f\bQW'l\u0006Z*\u0001\u00121", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f.\u0006O\b\u001b \u0011t\u001fD@&Eb{/;w\u001f<\u0017$Kt2-\u0019rj\u0007\\J2X\u0006.KU\u00181mZ<>$\u001bX\u001dR5\u0016\u0013#\"4wBF#\u00125\u0017W\u001fLdoyt1soO`\u0014F\r^sK1sPg_CHKUk)`\u001bc'e\u0004A ({)*215\u0014\u000e:\r\u0007\\\nvQX\u0019\b9+H\u007fIUA~U\u00128\f", ";`X;4?Ba\u0007\u0003\u0010^:", "", "1q^@f\bQW'l~s,\u000b", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;u\fq$dzz+St8\u007f$Bc\u0002\u001fJ7\u00148UNEy4g\u0016rqB\u0006_;R\u00010\u0011SJ@fb\u0002\u0007t\u0019d 5'!\u000fiP\u000e\u007fDD \u000f6[oJd\u0010\fkQ\u001a", ";`g\u0016a;KW\"\r~\\\u0014x\r8A\u0013,\n.\u0005,\u0017", "1q^@f\bQW'Z\fZ0\u0004\u0005,l\u007f", ";h]\u0016a;KW\"\r~\\\u0014x\r8A\u0013,\n.\u0005,\u0017", "@nf\u001aX(Lc&~\u0003^5\fk/l\u000b(\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\nZP7t6\u001e\u001dhjHEF6[z<QU](c(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ-S\u0012Dg|\u001b\u001a\u0018>4w>j\u001aW\t^QN6dO[_\u0002GJT!\u001bd\u0019n!Z6AywX\u0015$g]8\u000ezfZp\\\u0002rqU\u0019DE4G|_NE93F|2)Y{\u0005g\u0016\u001c['},\u0011>.5wNIq Ih\u0007\u0015ulEp-2P\u001dOZ-]l:\u001cx,ar\u0018i9/-;", "@nf\u001aX(Lc&~\u0003^5\fp?l\u000f,YJ\n&\u0017P~p<}05f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\nZP7t6\u001e\u001dhjHEF6[z<QU](c(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ-S\u0012Dg|\u001b\u001a\u0018>4w>j\u001aW\t^QN6dO[_\u0002GJT!\u001bd\u0019n!Z6AywU\u007f\u0017qO;\u0014\u007fR$<P\u0004orQ'z\u0002%H}dEA~YF}p&G\u0010\u0002\"A\"U2~?j0>@t\u00145x\u0018K_\u007f\u001f>JP#56\u0012y;Tb\u0003vB\r{h_\u0012\u0016m??\u0019/rsQ\u001e\u000be\u0017%\u0013kg\fA`\u0006K\u001fSX\u000eB\bAh\u0004\u0019\b\u001amkoQN%b\u0001c\u0001Hkf\r\u0017\rv'e\u0016&Dh\u0013F4hFM\u001c\u0018P8\b\niP\u0015[R\u0017qI\u00071", "0qT.^\u000bHe\"b\n^4\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";dP@h9>>#\u0006~\\@", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"o=\u001e|h]G\u0017p,9\u0001.KJb\u0002", ";dP@h9:P ~\tB;|\u0016+t\n5", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", ";`X;4?Ba\u0007\nv\\0\u0006\u000b\u000ep", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "1q^@f\bQW'l\u0006Z*\u0001\u00121D\u000b", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u007f;QCDz0-\u0019rj\u001d\u0010b,Yv0FLW;:\\{K#\u001fV\u0012W:\u001bZ", "0qT.^\u000bHe\"b\n^4\u000bP.iS\rF!h", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001csG$\u001bY\n]/\u0017\u000e#H \u0003NG.Q\rP\fMO\u0005\u0015\u0016u5f~Rc\u00102\u0004\u001cy?=>-^[\u000bC\u000bUq.kUC,\\G63\u001e~n{I5\u0012mbO\u001aq_\u0004kfZbxB,IwiF\u000fp_L}&\u001bZ\u007f\u0002\u001b{_p?~=\u0013}\u000b=n\u00172c,Hn\b~=\\N(-@N\u0001NGruB\u0002td(`\u0015\u0018f4DbcokS\u0019\u0015]`k9+f|K\\\u0016M\u0013W\u0015#T\u000fO[f\u0015\u0017\u0017+|;", "1q^@f\bQW'f~g", "7r7<e0S]\"\u000eve", "", ";`X;4?Ba\u0001\u0003\u0004", ";dP@h9>/\"}XZ*\u007f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "As^?X\u0017EO\u0017~v[3|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", ";dP@h9>/\"}XZ*\u007f\tvr\f\rGP\r%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Di\u00135M\u0019\"g=\u001d\"re8\u001a-*X~2QZNu]\\\u0003F\u0013\u000ei\u0012X4V\fUU.~S\u0001\u007f\u000f6[h?q\u0001s\u0016\nCz}BA\u001aN}\u0013\n\u0017\u000eOLcn\u0001KJ\u000fg;lU`-e8I(\u001ez'dI`7\b\u000bW\u001b{\u001eO+L", ">kP0X\u000f>Z$~\b", ";`X;4?Ba\b\t\nZ3j\rDe", "1q^@f\bQW'm\u0005m(\u0004v3z\u007f", "7sT:f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", ";dP@h9>6\u0019\u0006\u0006^9", "=tc\u001db:Bb\u001d\t\u0004", ">kP0X\u000f>Z$~\b&\t\u0005\u0005#5Jr", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u0019\u0002x^E \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001b^4\u001c\taAmlN>&\b*X\u0006EqJs&\u001d1gwBG\u0010E\t\u001f\u0003\u0017\u0010dOXl\u0004K@X,(n\u0014j'j:\u0004%\u001e\u0002\"\u001ad_2\u0014\u0005\u001d\u0018nf\u0004wv\u0011y\u0002B6%qdF-oQJ\u00054\u001f6\u0006~\u00160lJ!Xpj035q\u000fOf+\b\\\u0003\u001d7fO'oF@\\FGw\u007f|MWP\u001f]\u0016\u001eo5\u001e\u0019sujWd", "A`U2A,Qb", "7mU<", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"o=\u001exqbC\\", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FlowLayoutKt {
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP = CrossAxisAlignment.Companion.vertical$foundation_layout_release(Alignment.Companion.getTop());
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START = CrossAxisAlignment.Companion.horizontal$foundation_layout_release(Alignment.Companion.getStart());

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$1 */
    /* JADX INFO: compiled from: FlowLayout.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function3<FlowColumnScope, Composer, Integer, Unit> $content;
        final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
        final /* synthetic */ int $maxItemsInEachColumn;
        final /* synthetic */ int $maxLines;
        final /* synthetic */ FlowColumnOverflow $overflow;
        final /* synthetic */ Arrangement.Vertical $verticalArrangement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i2, int i3, FlowColumnOverflow flowColumnOverflow, Function3<? super FlowColumnScope, ? super Composer, ? super Integer, Unit> function3, int i4, int i5) {
            super(2);
            vertical = vertical;
            horizontal = horizontal;
            i = i2;
            i = i3;
            flowColumnOverflow = flowColumnOverflow;
            function3 = function3;
            i = i4;
            i = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            Modifier modifier = modifier;
            Arrangement.Vertical vertical = vertical;
            Arrangement.Horizontal horizontal = horizontal;
            int i3 = i;
            int i4 = i;
            FlowColumnOverflow flowColumnOverflow = flowColumnOverflow;
            Function3<FlowColumnScope, Composer, Integer, Unit> function3 = function3;
            int i5 = i;
            FlowLayoutKt.FlowColumn(modifier, vertical, horizontal, i3, i4, flowColumnOverflow, function3, composer, RecomposeScopeImplKt.updateChangedFlags((i5 + 1) - (i5 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1 */
    /* JADX INFO: compiled from: FlowLayout.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04791 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function3<FlowRowScope, Composer, Integer, Unit> $content;
        final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
        final /* synthetic */ int $maxItemsInEachRow;
        final /* synthetic */ int $maxLines;
        final /* synthetic */ FlowRowOverflow $overflow;
        final /* synthetic */ Arrangement.Vertical $verticalArrangement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04791(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i2, int i3, FlowRowOverflow flowRowOverflow, Function3<? super FlowRowScope, ? super Composer, ? super Integer, Unit> function3, int i4, int i5) {
            super(2);
            horizontal = horizontal;
            vertical = vertical;
            i = i2;
            i = i3;
            flowRowOverflow = flowRowOverflow;
            function3 = function3;
            i = i4;
            i = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            FlowLayoutKt.FlowRow(modifier, horizontal, vertical, i, i, flowRowOverflow, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FlowRow(androidx.compose.ui.Modifier r19, androidx.compose.foundation.layout.Arrangement.Horizontal r20, androidx.compose.foundation.layout.Arrangement.Vertical r21, int r22, int r23, androidx.compose.foundation.layout.FlowRowOverflow r24, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowRowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 793
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, int, int, androidx.compose.foundation.layout.FlowRowOverflow, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FlowColumn(androidx.compose.ui.Modifier r19, androidx.compose.foundation.layout.Arrangement.Vertical r20, androidx.compose.foundation.layout.Arrangement.Horizontal r21, int r22, int r23, androidx.compose.foundation.layout.FlowColumnOverflow r24, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, int, int, androidx.compose.foundation.layout.FlowColumnOverflow, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final MeasurePolicy rowMeasurementHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i2, Composer composer, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 1479255111, "C(rowMeasurementHelper)P(!1,2)380@13086L883:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i3, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:379)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -75342195, "CC(remember):FlowLayout.kt#9igjgp");
        int i4 = ((((14 & i3) ^ 6) <= 4 || !composer.changed(horizontal)) && (i3 + 6) - (6 | i3) != 4) ? 0 : 1;
        int i5 = (((((-1) - (((-1) - i3) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) ^ 48) <= 32 || !composer.changed(vertical)) && (i3 + 48) - (48 | i3) != 32) ? 0 : 1;
        int i6 = (-1) - (((-1) - ((i4 + i5) - (i4 & i5))) & ((-1) - (((((896 & i3) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(i2)) || (i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256) ? 1 : 0)));
        MeasurePolicy measurePolicyRememberedValue = composer.rememberedValue();
        if (i6 != 0 || measurePolicyRememberedValue == Composer.Companion.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.mo904getSpacingD9Ej5fM(), CROSS_AXIS_ALIGNMENT_TOP, vertical.mo904getSpacingD9Ej5fM(), i2, Integer.MAX_VALUE, FlowRowOverflow.Companion.getVisible().createOverflowState$foundation_layout_release(), null);
            measurePolicyRememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                    return flowMeasurePolicy.mo966measure3p2s80s(measureScope, CollectionsKt.listOf(list), j2);
                }
            };
            composer.updateRememberedValue(measurePolicyRememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) measurePolicyRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return measurePolicy;
    }

    public static final MultiContentMeasurePolicy rowMeasurementMultiContentHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i4) {
        ComposerKt.sourceInformationMarkerStart(composer, -2134502475, "C(rowMeasurementMultiContentHelper)P(!1,4)414@14301L649:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2134502475, i4, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:413)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 744443043, "CC(remember):FlowLayout.kt#9igjgp");
        int i5 = (-1) - (((-1) - ((((((-1) - (((-1) - i4) | ((-1) - 14))) ^ 6) <= 4 || !composer.changed(horizontal)) && (6 & i4) != 4) ? 0 : 1)) & ((-1) - (((((112 & i4) ^ 48) <= 32 || !composer.changed(vertical)) && (48 & i4) != 32) ? 0 : 1)));
        int i6 = ((((896 & i4) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composer.changed(i2)) && (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i4) != 256) ? 0 : 1;
        int i7 = (i5 + i6) - (i5 & i6);
        int i8 = (((((-1) - (((-1) - i4) | ((-1) - 7168))) ^ 3072) > 2048 && composer.changed(i3)) || (i4 + 3072) - (i4 | 3072) == 2048) ? 1 : 0;
        int i9 = (-1) - (((-1) - ((i7 + i8) - (i7 & i8))) & ((-1) - (composer.changed(flowLayoutOverflowState) ? 1 : 0)));
        Object objRememberedValue = composer.rememberedValue();
        if (i9 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.mo904getSpacingD9Ej5fM(), CROSS_AXIS_ALIGNMENT_TOP, vertical.mo904getSpacingD9Ej5fM(), i2, i3, flowLayoutOverflowState, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return flowMeasurePolicy;
    }

    public static final MeasurePolicy columnMeasurementHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i2, Composer composer, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -2013098357, "C(columnMeasurementHelper)P(2)443@15212L856:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i3, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:442)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1837869538, "CC(remember):FlowLayout.kt#9igjgp");
        int i4 = (-1) - (((-1) - ((-1) - (((-1) - ((((((-1) - (((-1) - i3) | ((-1) - 14))) ^ 6) <= 4 || !composer.changed(vertical)) && (-1) - (((-1) - i3) | ((-1) - 6)) != 4) ? 0 : 1)) & ((-1) - ((((((-1) - (((-1) - i3) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) ^ 48) <= 32 || !composer.changed(horizontal)) && (48 & i3) != 32) ? 0 : 1))))) & ((-1) - ((((((-1) - (((-1) - i3) | ((-1) - 896))) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(i2)) || (-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 256) ? 1 : 0)));
        MeasurePolicy measurePolicyRememberedValue = composer.rememberedValue();
        if (i4 != 0 || measurePolicyRememberedValue == Composer.Companion.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.mo904getSpacingD9Ej5fM(), CROSS_AXIS_ALIGNMENT_START, horizontal.mo904getSpacingD9Ej5fM(), i2, Integer.MAX_VALUE, FlowRowOverflow.Companion.getVisible().createOverflowState$foundation_layout_release(), null);
            measurePolicyRememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                    return flowMeasurePolicy.mo966measure3p2s80s(measureScope, CollectionsKt.listOf(list), j2);
                }
            };
            composer.updateRememberedValue(measurePolicyRememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) measurePolicyRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return measurePolicy;
    }

    public static final MultiContentMeasurePolicy columnMeasurementMultiContentHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i4) {
        ComposerKt.sourceInformationMarkerStart(composer, 748776953, "C(columnMeasurementMultiContentHelper)P(4)475@16365L652:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(748776953, i4, -1, "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:474)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 287541334, "CC(remember):FlowLayout.kt#9igjgp");
        int i5 = ((-1) - (((-1) - (((-1) - (((-1) - (((((14 & i4) ^ 6) <= 4 || !composer.changed(vertical)) && (6 & i4) != 4) ? 0 : 1)) & ((-1) - ((((((i4 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i4)) ^ 48) <= 32 || !composer.changed(horizontal)) && (48 & i4) != 32) ? 0 : 1)))) | (((((896 & i4) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composer.changed(i2)) && (384 & i4) != 256) ? 0 : 1))) & ((-1) - (((((7168 & i4) ^ 3072) > 2048 && composer.changed(i3)) || (i4 & 3072) == 2048) ? 1 : 0)))) | (composer.changed(flowLayoutOverflowState) ? 1 : 0);
        Object objRememberedValue = composer.rememberedValue();
        if (i5 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new FlowMeasurePolicy(false, horizontal, vertical, vertical.mo904getSpacingD9Ej5fM(), CROSS_AXIS_ALIGNMENT_START, horizontal.mo904getSpacingD9Ej5fM(), i2, i3, flowLayoutOverflowState, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return flowMeasurePolicy;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.collections.IntIterator] */
    public static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i2, int i3, int i4, int i5, int i6, FlowLayoutOverflowState flowLayoutOverflowState) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i8 = 0; i8 < size2; i8++) {
            iArr2[i8] = 0;
        }
        int size3 = list.size();
        for (int i9 = 0; i9 < size3; i9++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i9);
            int iIntValue = function3.invoke(intrinsicMeasurable, Integer.valueOf(i9), Integer.valueOf(i2)).intValue();
            iArr[i9] = iIntValue;
            iArr2[i9] = function32.invoke(intrinsicMeasurable, Integer.valueOf(i9), Integer.valueOf(iIntValue)).intValue();
        }
        int i10 = Integer.MAX_VALUE;
        if (i6 != Integer.MAX_VALUE && i5 != Integer.MAX_VALUE) {
            i10 = i5 * i6;
        }
        int iMin = Math.min(i10 - (((i10 >= list.size() || !(flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandIndicator || flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i10 < list.size() || i6 < flowLayoutOverflowState.getMinLinesToShowCollapse$foundation_layout_release() || flowLayoutOverflowState.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list.size());
        int iSum = ArraysKt.sum(iArr) + ((list.size() - 1) * i3);
        if (size2 != 0) {
            int iM365getFirstimpl = iArr2[0];
            ?? it = new IntRange(1, ArraysKt.getLastIndex(iArr2)).iterator();
            while (it.hasNext()) {
                int i11 = iArr2[it.nextInt()];
                if (iM365getFirstimpl < i11) {
                    iM365getFirstimpl = i11;
                }
            }
            if (size != 0) {
                int i12 = iArr[0];
                ?? it2 = new IntRange(1, ArraysKt.getLastIndex(iArr)).iterator();
                while (it2.hasNext()) {
                    int i13 = iArr[it2.nextInt()];
                    if (i12 < i13) {
                        i12 = i13;
                    }
                }
                int i14 = iSum;
                while (i12 <= i14 && iM365getFirstimpl != i2) {
                    iSum = (i12 + i14) / 2;
                    long jIntrinsicCrossAxisSize = intrinsicCrossAxisSize(list, iArr, iArr2, iSum, i3, i4, i5, i6, flowLayoutOverflowState);
                    iM365getFirstimpl = IntIntPair.m365getFirstimpl(jIntrinsicCrossAxisSize);
                    int iM366getSecondimpl = IntIntPair.m366getSecondimpl(jIntrinsicCrossAxisSize);
                    if (iM365getFirstimpl > i2 || iM366getSecondimpl < iMin) {
                        i12 = iSum + 1;
                        if (i12 > i14) {
                            return i12;
                        }
                    } else {
                        if (iM365getFirstimpl >= i2) {
                            return iSum;
                        }
                        i14 = iSum - 1;
                    }
                }
                return iSum;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.FlowLayoutKt$intrinsicCrossAxisSize$1 */
    /* JADX INFO: compiled from: FlowLayout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,o\bDZc|\u0004G\b>éFB-!T\u0012&\u0007\u0017nG1\\ev-\u0003W8\u0011\u0004{b#\",ڱG=[\u001d\f&"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "7mS2k", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzLo", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\t>h\u000b$@{\u001a,5C7yD+\u0011eh9\\G\u0010\u0012],C]JucN{?]uc\u001dN-\r\u0012/"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04801 extends Lambda implements Function3<IntrinsicMeasurable, Integer, Integer, Integer> {
        final /* synthetic */ int[] $mainAxisSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04801(int[] iArr) {
            super(3);
            iArr = iArr;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
            return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
            return Integer.valueOf(iArr[i2]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.FlowLayoutKt$intrinsicCrossAxisSize$2 */
    /* JADX INFO: compiled from: FlowLayout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,o\bDZc|\u0004G\b>éFB-!T\u0012&\u0007\u0017nG1\\ev-\u0003W8\u0011\u0004{b#\",ڱG=[\u001d\f&"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "7mS2k", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzLo", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\t>h\u000b$@{\u001a,5C7yD+\u0011eh9\\G\u0010\u0012],C]JucN{?]uc\u001dN-\r\u0012/"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function3<IntrinsicMeasurable, Integer, Integer, Integer> {
        final /* synthetic */ int[] $crossAxisSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int[] iArr) {
            super(3);
            iArr = iArr;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
            return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
            return Integer.valueOf(iArr[i2]);
        }
    }

    private static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int[] iArr, int[] iArr2, int i2, int i3, int i4, int i5, int i6, FlowLayoutOverflowState flowLayoutOverflowState) {
        return intrinsicCrossAxisSize(list, new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt.intrinsicCrossAxisSize.1
            final /* synthetic */ int[] $mainAxisSizes;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04801(int[] iArr3) {
                super(3);
                iArr = iArr3;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i22, int i32) {
                return Integer.valueOf(iArr[i22]);
            }
        }, new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt.intrinsicCrossAxisSize.2
            final /* synthetic */ int[] $crossAxisSizes;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(int[] iArr22) {
                super(3);
                iArr = iArr22;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i22, int i32) {
                return Integer.valueOf(iArr[i22]);
            }
        }, i2, i3, i4, i5, i6, flowLayoutOverflowState);
    }

    public static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i2, int i3, int i4, int i5, int i6, FlowLayoutOverflowState flowLayoutOverflowState) {
        int iIntValue;
        int i7;
        int i8 = 0;
        if (list.isEmpty()) {
            return IntIntPair.m361constructorimpl(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i5, flowLayoutOverflowState, OrientationIndependentConstraints.m985constructorimpl(0, i2, 0, Integer.MAX_VALUE), i6, i3, i4, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.getOrNull(list, 0);
        int iIntValue2 = intrinsicMeasurable != null ? function32.invoke(intrinsicMeasurable, 0, Integer.valueOf(i2)).intValue() : 0;
        if (intrinsicMeasurable != null) {
            iIntValue = function3.invoke(intrinsicMeasurable, 0, Integer.valueOf(iIntValue2)).intValue();
        } else {
            iIntValue = 0;
        }
        int i9 = 0;
        int iM366getSecondimpl = 0;
        int iMax = 0;
        if (flowLayoutBuildingBlocks.m941getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m361constructorimpl(i2, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m358boximpl(IntIntPair.m361constructorimpl(iIntValue, iIntValue2)), 0, 0, 0, false, false).isLastItemInContainer()) {
            IntIntPair intIntPairM946ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m946ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
            return IntIntPair.m361constructorimpl(intIntPairM946ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m366getSecondimpl(intIntPairM946ellipsisSizeF35zmw$foundation_layout_release.m369unboximpl()) : 0, 0);
        }
        int size = list.size();
        int i10 = i2;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 < size) {
                i10 -= iIntValue;
                i7 = i11 + 1;
                iMax = Math.max(iMax, iIntValue2);
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(list, i7);
                if (intrinsicMeasurable2 != null) {
                    iIntValue2 = function32.invoke(intrinsicMeasurable2, Integer.valueOf(i7), Integer.valueOf(i2)).intValue();
                } else {
                    iIntValue2 = i8;
                }
                iIntValue = intrinsicMeasurable2 != null ? function3.invoke(intrinsicMeasurable2, Integer.valueOf(i7), Integer.valueOf(iIntValue2)).intValue() + i3 : 0;
                int i13 = i7 - i12;
                FlowLayoutBuildingBlocks.WrapInfo wrapInfoM941getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m941getWrapInfoOpUlnko(i11 + 2 < list.size(), i13, IntIntPair.m361constructorimpl(i10, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m358boximpl(IntIntPair.m361constructorimpl(iIntValue, iIntValue2)), i9, iM366getSecondimpl, iMax, false, false);
                if (wrapInfoM941getWrapInfoOpUlnko.isLastItemInLine()) {
                    iM366getSecondimpl += iMax + i4;
                    int i14 = i9;
                    FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM941getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i14, iM366getSecondimpl, i10, i13);
                    iIntValue -= i3;
                    i9 = i14 + 1;
                    if (!wrapInfoM941getWrapInfoOpUlnko.isLastItemInContainer()) {
                        i10 = i2;
                        i12 = i7;
                        iMax = 0;
                    } else if (wrapEllipsisInfo != null) {
                        long jM942getEllipsisSizeOO21N7I = wrapEllipsisInfo.m942getEllipsisSizeOO21N7I();
                        if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                            iM366getSecondimpl += IntIntPair.m366getSecondimpl(jM942getEllipsisSizeOO21N7I) + i4;
                        }
                    }
                }
                i11 = i7;
                i8 = 0;
            } else {
                i7 = i11;
                break;
            }
        }
        return IntIntPair.m361constructorimpl(iM366getSecondimpl - i4, i7);
    }

    private static final Measurable safeNext(Iterator<? extends Measurable> it, FlowLineInfo flowLineInfo) {
        Measurable next;
        try {
            if (it instanceof ContextualFlowItemIterator) {
                Intrinsics.checkNotNull(flowLineInfo);
                next = ((ContextualFlowItemIterator) it).getNext$foundation_layout_release(flowLineInfo);
            } else {
                next = it.next();
            }
            return next;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static final int mainAxisMin(IntrinsicMeasurable intrinsicMeasurable, boolean z2, int i2) {
        return z2 ? intrinsicMeasurable.minIntrinsicWidth(i2) : intrinsicMeasurable.minIntrinsicHeight(i2);
    }

    public static final int crossAxisMin(IntrinsicMeasurable intrinsicMeasurable, boolean z2, int i2) {
        return z2 ? intrinsicMeasurable.minIntrinsicHeight(i2) : intrinsicMeasurable.minIntrinsicWidth(i2);
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_TOP() {
        return CROSS_AXIS_ALIGNMENT_TOP;
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_START() {
        return CROSS_AXIS_ALIGNMENT_START;
    }

    /* JADX INFO: renamed from: measureAndCache-rqJ1uqs */
    public static final long m944measureAndCacherqJ1uqs(Measurable measurable, FlowLineMeasurePolicy flowLineMeasurePolicy, long j2, Function1<? super Placeable, Unit> function1) {
        FlowLayoutData flowLayoutData;
        Measurable measurable2 = measurable;
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable2)) == 0.0f) {
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable2);
            if (((rowColumnParentData == null || (flowLayoutData = rowColumnParentData.getFlowLayoutData()) == null) ? null : Float.valueOf(flowLayoutData.getFillCrossAxisFraction())) == null) {
                Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(j2);
                function1.invoke(placeableMo5514measureBRTryo0);
                return IntIntPair.m361constructorimpl(flowLineMeasurePolicy.mainAxisSize(placeableMo5514measureBRTryo0), flowLineMeasurePolicy.crossAxisSize(placeableMo5514measureBRTryo0));
            }
        }
        int iMainAxisMin = mainAxisMin(measurable2, flowLineMeasurePolicy.isHorizontal(), Integer.MAX_VALUE);
        return IntIntPair.m361constructorimpl(iMainAxisMin, crossAxisMin(measurable2, flowLineMeasurePolicy.isHorizontal(), iMainAxisMin));
    }

    /* JADX INFO: renamed from: placeHelper-BmaY500 */
    public static final MeasureResult m945placeHelperBmaY500(MeasureScope measureScope, long j2, int i2, int i3, int[] iArr, final MutableVector<MeasureResult> mutableVector, FlowLineMeasurePolicy flowLineMeasurePolicy, int[] iArr2) {
        int iCoerceIn;
        boolean zIsHorizontal = flowLineMeasurePolicy.isHorizontal();
        Arrangement.Vertical verticalArrangement = flowLineMeasurePolicy.getVerticalArrangement();
        Arrangement.Horizontal horizontalArrangement = flowLineMeasurePolicy.getHorizontalArrangement();
        if (zIsHorizontal) {
            if (verticalArrangement == null) {
                throw new IllegalArgumentException("null verticalArrangement".toString());
            }
            iCoerceIn = RangesKt.coerceIn((measureScope.mo704roundToPx0680j_4(verticalArrangement.mo904getSpacingD9Ej5fM()) * (mutableVector.getSize() - 1)) + i3, Constraints.m6592getMinHeightimpl(j2), Constraints.m6590getMaxHeightimpl(j2));
            verticalArrangement.arrange(measureScope, iCoerceIn, iArr, iArr2);
        } else {
            if (horizontalArrangement == null) {
                throw new IllegalArgumentException("null horizontalArrangement".toString());
            }
            iCoerceIn = RangesKt.coerceIn((measureScope.mo704roundToPx0680j_4(horizontalArrangement.mo904getSpacingD9Ej5fM()) * (mutableVector.getSize() - 1)) + i3, Constraints.m6592getMinHeightimpl(j2), Constraints.m6590getMaxHeightimpl(j2));
            horizontalArrangement.arrange(measureScope, iCoerceIn, iArr, measureScope.getLayoutDirection(), iArr2);
        }
        int iCoerceIn2 = RangesKt.coerceIn(i2, Constraints.m6593getMinWidthimpl(j2), Constraints.m6591getMaxWidthimpl(j2));
        if (!zIsHorizontal) {
            int i4 = iCoerceIn;
            iCoerceIn = iCoerceIn2;
            iCoerceIn2 = i4;
        }
        return MeasureScope.layout$default(measureScope, iCoerceIn2, iCoerceIn, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$placeHelper$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                MutableVector<MeasureResult> mutableVector2 = mutableVector;
                int size = mutableVector2.getSize();
                if (size > 0) {
                    MeasureResult[] content = mutableVector2.getContent();
                    int i5 = 0;
                    do {
                        content[i5].placeChildren();
                        i5++;
                    } while (i5 < size);
                }
            }
        }, 4, null);
    }

    public static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, int i2, int i3, int i4) {
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < size) {
            int iIntValue = function3.invoke(list.get(i5), Integer.valueOf(i5), Integer.valueOf(i2)).intValue() + i3;
            int i8 = i5 + 1;
            if (i8 - i6 != i4 && i8 != list.size()) {
                i7 += iIntValue;
            } else {
                iMax = Math.max(iMax, (i7 + iIntValue) - i3);
                i7 = 0;
                i6 = i5;
            }
            i5 = i8;
        }
        return iMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: breakDownItems-di9J0FM */
    public static final MeasureResult m943breakDownItemsdi9J0FM(MeasureScope measureScope, FlowLineMeasurePolicy flowLineMeasurePolicy, Iterator<? extends Measurable> it, float f2, float f3, long j2, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState) throws Throwable {
        IntIntPair intIntPairM358boximpl;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo;
        int height;
        int width;
        IntIntPair intIntPairM358boximpl2;
        IntIntPair intIntPairM358boximpl3;
        int i4;
        int iCoerceAtLeast;
        MutableVector mutableVector = new MutableVector(new MeasureResult[16], 0);
        int iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j2);
        int iM6593getMinWidthimpl = Constraints.m6593getMinWidthimpl(j2);
        int iM6590getMaxHeightimpl = Constraints.m6590getMaxHeightimpl(j2);
        MutableIntObjectMap mutableIntObjectMapMutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(measureScope.mo710toPx0680j_4(f2));
        int iCeil2 = (int) Math.ceil(measureScope.mo710toPx0680j_4(f3));
        long jM985constructorimpl = OrientationIndependentConstraints.m985constructorimpl(0, iM6591getMaxWidthimpl, 0, iM6590getMaxHeightimpl);
        long jM1000toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m1000toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m989copyyUG9Ft0$default(jM985constructorimpl, 0, 0, 0, 0, 14, null), flowLineMeasurePolicy.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int i5 = 0;
        FlowLineInfo flowLineInfo = it instanceof ContextualFlowItemIterator ? new FlowLineInfo(0, 0, measureScope.mo707toDpu2uoSUM(iM6591getMaxWidthimpl), measureScope.mo707toDpu2uoSUM(iM6590getMaxHeightimpl), null) : null;
        Measurable measurableSafeNext = !it.hasNext() ? null : safeNext(it, flowLineInfo);
        if (measurableSafeNext != null) {
            intIntPairM358boximpl = IntIntPair.m358boximpl(m944measureAndCacherqJ1uqs(measurableSafeNext, flowLineMeasurePolicy, jM1000toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                    invoke2(placeable);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    objectRef.element = placeable;
                }
            }));
        } else {
            intIntPairM358boximpl = null;
        }
        Integer numValueOf = intIntPairM358boximpl != null ? Integer.valueOf(IntIntPair.m365getFirstimpl(intIntPairM358boximpl.m369unboximpl())) : null;
        Integer numValueOf2 = intIntPairM358boximpl != null ? Integer.valueOf(IntIntPair.m366getSecondimpl(intIntPairM358boximpl.m369unboximpl())) : null;
        MutableIntList mutableIntList = new MutableIntList(0, 1, null);
        MutableIntList mutableIntList2 = new MutableIntList(0, 1, null);
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i2, flowLayoutOverflowState, j2, i3, iCeil, iCeil2, null);
        FlowLayoutBuildingBlocks.WrapInfo wrapInfoM941getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m941getWrapInfoOpUlnko(it.hasNext(), 0, IntIntPair.m361constructorimpl(iM6591getMaxWidthimpl, iM6590getMaxHeightimpl), intIntPairM358boximpl, 0, 0, 0, false, false);
        if (wrapInfoM941getWrapInfoOpUlnko.isLastItemInContainer()) {
            flowLayoutBuildingBlocks = flowLayoutBuildingBlocks;
            wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM941getWrapInfoOpUlnko, intIntPairM358boximpl != null, -1, 0, iM6591getMaxWidthimpl, 0);
        } else {
            wrapEllipsisInfo = null;
        }
        int i6 = iM6590getMaxHeightimpl;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int iMax = 0;
        int i11 = iM6591getMaxWidthimpl;
        while (!wrapInfoM941getWrapInfoOpUlnko.isLastItemInContainer() && measurableSafeNext != null) {
            Intrinsics.checkNotNull(numValueOf);
            int iIntValue = numValueOf.intValue();
            Intrinsics.checkNotNull(numValueOf2);
            i10 += iIntValue;
            iMax = Math.max(iMax, numValueOf2.intValue());
            i11 -= iIntValue;
            int i12 = i9 + 1;
            flowLayoutOverflowState.setItemShown$foundation_layout_release(i12);
            arrayList.add(measurableSafeNext);
            mutableIntObjectMapMutableIntObjectMapOf.set(i9, objectRef.element);
            int i13 = i12 - i7;
            boolean z2 = i13 < i2;
            if (flowLineInfo != null) {
                int i14 = z2 ? i5 : i5 + 1;
                int i15 = z2 ? i13 : 0;
                if (z2) {
                    i4 = 0;
                    iCoerceAtLeast = RangesKt.coerceAtLeast(i11 - iCeil, 0);
                } else {
                    i4 = 0;
                    iCoerceAtLeast = iM6591getMaxWidthimpl;
                }
                flowLineInfo.m954update4j6BHR0$foundation_layout_release(i14, i15, measureScope.mo707toDpu2uoSUM(iCoerceAtLeast), measureScope.mo707toDpu2uoSUM(z2 ? i6 : RangesKt.coerceAtLeast((i6 - iMax) - iCeil2, i4)));
            }
            measurableSafeNext = !it.hasNext() ? null : safeNext(it, flowLineInfo);
            objectRef.element = null;
            if (measurableSafeNext != null) {
                intIntPairM358boximpl2 = IntIntPair.m358boximpl(m944measureAndCacherqJ1uqs(measurableSafeNext, flowLineMeasurePolicy, jM1000toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                        invoke2(placeable);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable placeable) {
                        objectRef.element = placeable;
                    }
                }));
            } else {
                intIntPairM358boximpl2 = null;
            }
            numValueOf = intIntPairM358boximpl2 != null ? Integer.valueOf(IntIntPair.m365getFirstimpl(intIntPairM358boximpl2.m369unboximpl()) + iCeil) : null;
            numValueOf2 = intIntPairM358boximpl2 != null ? Integer.valueOf(IntIntPair.m366getSecondimpl(intIntPairM358boximpl2.m369unboximpl())) : null;
            boolean zHasNext = it.hasNext();
            long jM361constructorimpl = IntIntPair.m361constructorimpl(i11, i6);
            if (intIntPairM358boximpl2 == null) {
                intIntPairM358boximpl3 = null;
            } else {
                Intrinsics.checkNotNull(numValueOf);
                int iIntValue2 = numValueOf.intValue();
                Intrinsics.checkNotNull(numValueOf2);
                intIntPairM358boximpl3 = IntIntPair.m358boximpl(IntIntPair.m361constructorimpl(iIntValue2, numValueOf2.intValue()));
            }
            wrapInfoM941getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m941getWrapInfoOpUlnko(zHasNext, i13, jM361constructorimpl, intIntPairM358boximpl3, i5, i8, iMax, false, false);
            if (wrapInfoM941getWrapInfoOpUlnko.isLastItemInLine()) {
                iM6593getMinWidthimpl = Math.min(Math.max(iM6593getMinWidthimpl, i10), iM6591getMaxWidthimpl);
                int i16 = i8 + iMax;
                flowLayoutBuildingBlocks = flowLayoutBuildingBlocks;
                wrapInfoM941getWrapInfoOpUlnko = wrapInfoM941getWrapInfoOpUlnko;
                wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM941getWrapInfoOpUlnko, intIntPairM358boximpl2 != null, i5, i16, i11, i13);
                mutableIntList2.add(iMax);
                i6 = (iM6590getMaxHeightimpl - i16) - iCeil2;
                mutableIntList.add(i12);
                numValueOf = numValueOf != null ? Integer.valueOf(numValueOf.intValue() - iCeil) : null;
                i5++;
                i8 = i16 + iCeil2;
                i11 = iM6591getMaxWidthimpl;
                i9 = i12;
                iMax = 0;
                i10 = 0;
                iM6591getMaxWidthimpl = i11;
            } else {
                i9 = i12;
                i12 = i7;
            }
            i7 = i12;
        }
        if (wrapEllipsisInfo != null) {
            arrayList.add(wrapEllipsisInfo.getEllipsis());
            mutableIntObjectMapMutableIntObjectMapOf.set(arrayList.size() - 1, wrapEllipsisInfo.getPlaceable());
            int i17 = mutableIntList._size - 1;
            if (wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                int size = mutableIntList.getSize() - 1;
                mutableIntList2.set(i17, Math.max(mutableIntList2.get(i17), IntIntPair.m366getSecondimpl(wrapEllipsisInfo.m942getEllipsisSizeOO21N7I())));
                mutableIntList.set(size, mutableIntList.last() + 1);
            } else {
                mutableIntList2.add(IntIntPair.m366getSecondimpl(wrapEllipsisInfo.m942getEllipsisSizeOO21N7I()));
                mutableIntList.add(mutableIntList.last() + 1);
            }
        }
        int size2 = arrayList.size();
        Object[] objArr = new Placeable[size2];
        for (int i18 = 0; i18 < size2; i18++) {
            objArr[i18] = mutableIntObjectMapMutableIntObjectMapOf.get(i18);
        }
        int size3 = mutableIntList.getSize();
        int[] iArr = new int[size3];
        for (int i19 = 0; i19 < size3; i19++) {
            iArr[i19] = 0;
        }
        int i20 = 0;
        int size4 = mutableIntList.getSize();
        int[] iArr2 = new int[size4];
        for (int i21 = 0; i21 < size4; i21++) {
            iArr2[i21] = 0;
        }
        MutableIntList mutableIntList3 = mutableIntList;
        int[] iArr3 = mutableIntList3.content;
        int i22 = mutableIntList3._size;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        while (i23 < i22) {
            int i26 = iArr3[i23];
            int i27 = iM6593getMinWidthimpl;
            Object[] objArr2 = objArr;
            MeasureResult measureResultMeasure = RowColumnMeasurePolicyKt.measure(flowLineMeasurePolicy, iM6593getMinWidthimpl, Constraints.m6592getMinHeightimpl(jM985constructorimpl), Constraints.m6591getMaxWidthimpl(jM985constructorimpl), mutableIntList2.get(i23), iCeil, measureScope, arrayList, objArr, i25, i26, iArr, i23);
            if (flowLineMeasurePolicy.isHorizontal()) {
                height = measureResultMeasure.getWidth();
                width = measureResultMeasure.getHeight();
            } else {
                height = measureResultMeasure.getHeight();
                width = measureResultMeasure.getWidth();
            }
            iArr2[i23] = width;
            i24 += width;
            iM6593getMinWidthimpl = Math.max(i27, height);
            mutableVector.add(measureResultMeasure);
            i23++;
            objArr = objArr2;
            i25 = i26;
        }
        if (mutableVector.isEmpty()) {
            i24 = 0;
        } else {
            i20 = iM6593getMinWidthimpl;
        }
        return m945placeHelperBmaY500(measureScope, j2, i20, i24, iArr2, mutableVector, flowLineMeasurePolicy, iArr);
    }
}
