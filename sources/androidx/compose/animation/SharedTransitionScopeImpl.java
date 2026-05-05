package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: SharedTransitionScope.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŧ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0\u0011.J~8,\u001aw\rhr9>MmH4W[*%k\u00044*`,qY;]\u001a\f\"\u0011ѧVg}nRZ!C\u0017\u0006\u001czr,_U\u0001] Ɓ:B\u0006?;ݹw=O`|Ȃ\r H\"@y\u000b\u0002\"*^\u0010~ٙKK\"\u00128@v:Z\rc\u0005\"\u0012\fD(\u00014\\oN<Jt]P/+\u0003oEV'u0\u0005ձ\u0015Fj'\u0015vg 3@E:\u001d%Y\u0005\u000fRq?\u000b?wA\rh='3ɞ{WLX\b\u0014++W\rsr.\\\u001bQh\f-+WcaP\u0016ߊ\u007fz\u0012\rDǉ\u0016\u0006=H6Ʀ\"f\u001e\u000e;οzSVP\n^H\u0001\u0003aL\u0017-\u007f92?\u001a|ϟ\u0012;GMg{3\rV\"t/6a٪\u001ed#\u001clw\u007f1aDKJf\n\b@ъ\bpp\u0006r\u0012>q\u0018/*<^\u001b3cs9QN2\u0016\u0011Wu%\u001d`\u0017l\u001aVVo:nDgp\u009eɔ^Dj64cb\u000bD\u0011{5\u0005\u000b\f;+ \u000b\u0014\u0003ƙٚ\u0014NU\u001d2}[\u0013\"%]\u007fg]|\u001f&Wgzy̐Ʉg\u0010g\t?'Msz\u0005\u0007\u007frW\u001a\u0013t(Pk\u000fКݻ{{J\tT&@z\n\u001cbEa\u001djM`\u0003L{\bґȤcZnLGgAa\u001biR39\u0005^\u001c\to\u0016\u001b\u0010Aʬd\";\u0002\u001a\u0001'gm\"\u0017m-'\u0015A\f\u007fu\u000b|KZ0.u\u0004@P\u001a(~i/kY?\u00037y\u001a-sT#i_\u0016*');*\u0013I2Fg6\u0016!0n5bO\u0003bRzl?;\b\u0013\b@bâ~Gq\"SiL\u0018\u000b\u0003\b_~<\u000bD7\u001eS#6\"E;;g?\u001dD\u0011Z/]\u0013k9\b.(37&#u40qg\bb\u007fmbA>IgQV\"R=3HNj\u0006[Z\tb\u0015yǼ@ҥoމиQ\r5Rt\\tI~-s:AG&4\\7Z}QV,dS'!M\u0002o\u001c\u0006{`\u0019\u0015'\n9Ga\u0007 eU4fYr\t^`\u0004\u001aFAi>\u0015@\u0019&J+jd9\u001d\u001b}Nj\t]^_=nZB\"\u0013\u0007\u0012bAtVvC\u0011In\u007fB\u0001-nc\"\u0007\u0016I\u0005\u001c(\u00053q\u0015\u0019SKlKn]c~%Y*\u0005=)\u000fp\u00019-\u000eGWGN\u0004uo\u001eo}XP\u0018+%r\u001c)\u0004i\u0011\u000eB`b\u0019\u001f|N\u0013\"Xz\u001b=0\u0012\u0017z+e\\\f\u0015ԥ'9\u001bo\u0011\u0005|R\u0006\u007f[\u001a/Ut5\u0015v\u0015kV\u001d=\u0006{\u0017SH\u0019\u007fW\fe@S\n\u0018\"0'J^1^g\u000e\u0015\u0012\f@j\u001a\u007fzz\u00027x\u0001&\n.X:\u000b\n\\NfS\u0010z\u001a\u0013\ra\u001c{/\r?+\u001b\u000erOvC\"c\u001b/\u001fY\u0019L~1\u0005%5-\u0019n\u0017\u0015e.A0\u0003:?+P\\\u001fH,\u0015T]f\fp\u0016(O\u0012p!qU[\u001b\u0010GkXGa6X\u001e\fd\u0012u2p\u0005.\u001b;d\u001aVd7d\u001dH]\u000el5@d#WY\u001a\u0003~V()\u0013bq9ڽҮ37\u001f\u000e$OU#\u001f\u0004s!N!_*o\u001fE\"#oV5A\u0007HA\r\u007fX\"9v\u000eLD-t:m\u001e5\u001f<m\u0013IVOS\u0005Z\bZ\u0019>\u0015=%P l(J I\u001bKAG<G)\u0001H}w15\u0019){%XX-\u0005\u001b\b\u00121\u001ax$;\u0001\u0010G\u000f\u001e#\bjI\nMez\r<\u0006s\u0010\u0017M\u0012\u001d?e:\u0016MEL\u0002\u0006D\u000eT7$RQ&'\u000e\u000fIHX\u000b#T\u001f}eu>*dFl#uD?\bR7w\u000b\fd\nq\\A)$_ܩ=z<z\t]M\u0017|߃H\u0013MũO\u0011\f.A\u001dM9]zX+wz}3jdT\u0013\"\fp\u0007 \u0007PðʮYم\n=\u001aViwx{ia\u0016A \u0017-\u0006}<`lPr+'?K%Vl\u001bO\u0091CǶ\u000fD'&d?P\u001e[ $A`\u0019\u0018|xpkͶ?˝wMÖn}'1\u001fmE\b+|x]\u0010g\u007foU?C\r}J\u0007N\u0014t[Ǽ#ʢh+\u001dɸ;=<anD*,h\u0006<a\u0013cf͍zه,m8ߐ\u0001h\rw[]/,u\u07b8\u0002Ȁi\u000b:ďO]j/9IwpXt1CI\u001a\u00110Y%#\r.SgT3u\u001d1l\u001f6} ʓ~̚M\u0010\u000bʱ\u001b9=*W;QM|V\u0014>)YO~:9UI\\٣&\u008ek\u0013qپrs\u0011rNVWXsY?\u000e\u0019ؿ\u0012ߪx\u0010F\u000e>}\u0014fۀ\u0011g$8A\u074c\\Z-¦\r<"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007G4Y}|", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u00079", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]/?_y#7i\u0015\u001cKMFk\n", ":n^8T/>O\u0018lxh7|", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f?c\u0004\u001c:m\u0012-;AEv4s{nkH\u000eg5a@%QYX<kV{=\"[8\u0018[5\u001d\u0014]J$\\BA*\b\u0002\rr", "5dc\u0010b9Hc(\u0003\u0004^\u001az\u0013:e", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt!Ty\u001eKz.5G{*Bmk", "\nrTA \u0006\u0017", "", "7rC?T5LW(\u0003\u0005g\bz\u00183v\u007f", "u(I", "Adc!e(Ga\u001d\u000e~h5X\u0007>i\u0011(", "uY\u0018#", "7rC?T5LW(\u0003\u0005g\bz\u00183v\u007ffz@\b\u0017\u0019C~\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", ":n^8T/>O\u0018k\u0005h;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "5dc\u0019b6DO\u001c~v]\u0019\u0007\u0013>${1\u007fH|&\u001bQx\bIv,5U\f ", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", "<t[9T)ES\u007f\t\u0005d(\u007f\t+dl2\u0006O", "5dc\u001bh3EO\u0016\u0006zE6\u0007\u000f+h\u007f$z-\u000b!&\u0006k\u0017@~!D]\b)1z\u00165M?Ik", "Adc\u001bh3EO\u0016\u0006zE6\u0007\u000f+h\u007f$z-\u000b!&\u0006k\u0017@~!D]\b)1z\u00165M?Ik", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7|w", "=ab2e=>/\"\u0003\u0003Z;\u0001\u00121B\u00072yF", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "@d]1X9>`'", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0003w]H\u0007J0\\\u0006|", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006]!IY\u000b\r7v\u0015.ZCHA", "@n^A", "5dc\u001fb6M\u0012\u0015\b~f(\f\r9ny5{G\u0001\u0013%G", "Adc\u001fb6M\u0012\u0015\b~f(\f\r9ny5{G\u0001\u0013%G", "AgP?X+\u001eZ\u0019\u0007zg;\u000b", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r DU\u00129#", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f\u0017t\u00166MLJA", "CoS.g,-`\u0015\b\tb;\u0001\u00138A}7\u007fQ\u0001 \u0017U}", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", ":n^8T/>O\u0018lxh7|f9o\r'\u007fI|&\u0017U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "5dc\u0019b6DO\u001c~v]\u001az\u0013:e]2\u0006M\u007f\u001b C~\u000eJ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0010<U{ 3j\u001d.\f.Bg2\u001e\u001dhjHta6Yv|\u000b3J5[_|A\u0013%$\fX3\u0018\u000fgAm~H\u0001&\u0004@S\u0012J2g\b*\u0018EyNL`\u001dF}\u001eqP)v\u001c", "\u001duT?_(R1 \u0003\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u0016_v4NHb\ncV}\u0013", "1kX=F/:^\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "2qPD<5(d\u0019\f\u0002Z@", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "2qPD<5(d\u0019\f\u0002Z@;\u00058i\b$\u000bD\u000b \u0011To\u0015<r35", "=m;.l,K@\u0019\by^9|\u0016\rr\u007f$\u000b@\u007f", "@d]1X9>`", "=m;.l,K@\u0019\by^9|\u0016\rr\u007f$\u000b@\u007fU\u0013Ps\u00168\u0006)?bw-7t\u0016*[C", "=m;.l,K@\u0019\by^9|\u0016\u001ce\b2\r@\u007f", "=m;.l,K@\u0019\by^9|\u0016\u001ce\b2\r@\u007fU\u0013Ps\u00168\u0006)?bw-7t\u0016*[C", "=mBAT;>/\u0018}z]", "AgP?X+\u001eZ\u0019\u0007zg;j\u0018+t\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f\u0017t\u00166MLJO=-\u0015uj5\u000eQ;J\u0006'\u001d", "=mBAT;>/\u0018}z]jx\u00123m{7\u007fJ\n\u0011$Gv\u000e8\u0005%", "=mBAT;>@\u0019\u0007\u0005o,{", "=mBAT;>@\u0019\u0007\u0005o,{G+n\u00040wO\u0005! A|\u000eCv!CY", "@d\\2`)>`\u0007\u0002vk,{f9n\u000f(\u0005On&\u0013Vo", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u001aQr4GK,6earF#\u007fi\n]+b", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_;]LJo<\u001e^FkA\u0012m:N\u0004|+\u00105(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8@@#\u0010(X\u0006EqJy\u0019\nBjo1c\fP\b\u0019\u0005E3q4Wi\u0005G\u007f3e&q\f^zfCI$\u001d\u0001\u0007*d_._", "@d\\2`)>`\u0007\u0002vk,{h6e\b(\u0005On&\u0013Vo", "AgP?X+\u001eZ\u0019\u0007zg;", "0nd;W:\u001a\\\u001d\u0007vm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006S/Eb|.\u0013v\u001a6IR?u=s", ">kP0X\u000fHZ\u0018~\bL0\u0012\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u0017Ur%G/X3[R\u007f+\u0018'Zc", "@d]1X9(\\ \u0013la,\u0006y3s\u0004%\u0003@", "AgP?X+\u001c]\"\u000ezg;j\u0018+t\u007f", "1kX=<5(d\u0019\f\u0002Z@[\u0019<i\t*jM| %K~\u0012F\u007f", "HH]1X?\"\\\u0003\u0010zk3x\u001d", "", "@d]1X9\"\\\u0003\u0010zk3x\u001d\u000eu\r,\u0005Bo$\u0013P}\u0012Kz/>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00138U\u000b 6M\u001d.UCDz\n\u0005\u0011q`F\u0011g+a@%QTY6jR<9\u001d\u0016b\n]/\u0017\u000e#\u001e.~M6-c5M\n7w\u0005\u0016\u001fc\u001cfyAc\u001aKx(??3pQcmy\u0011=Nf2`\u001bc'e\u0004('\u0010~\u0019\u001aW]*\u0013\nW v\\\u0003UeQ$zv\u000fEiYF(y\\;t4\rO\u0011wg'?p4s:\u000e8)I.\u0003Uo#Hlx^(eE/\"E@\u001dH\u0015QxhK\u000eg\u000en\u0004\u0017p9@\u001donQF\u0019\u0012]UI8]l\u000160\u0010GXo\u001e64\u000e>jyjo\u0003-lrSG\u001agJ\u0018zL-i\u001f\u0003Lb! 6\u0012L]\u0019qsM:I \tg'\u0019wbQ\u0019\u007fL\u001av9pebob \n\u0011V(/_\u001a}VNEp\u000b\u001b|\u0014}*}mA\r\u007f\u0011/-HcFb*<\u001bpb&!g\u0002y)5<\f`@{4[j{y\u0017g\n\u001fa=KK1KQu,Jc\u0015\u0001E^Z\f;Q\u001f8*b\u0019>hs4*u\u000e\b\u00044\bv%;&\u0003P\u001bn\t>b\u001b\f_", "AgP?X+\u001eZ\u0019\u0007zg;\u000bi9r", ":nR._\u0013H]\u001fz}^({s9s\u00047\u007fJ\n\u0001\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "And?V,\u001c]#\fyb5x\u0018/s", "@d[.g0OS\b\thh<\n\u0007/", "7mR9h+>;#\u000e~h5]\u0016+m\u007f\u0012|-\u0001\u0018\u0017To\u0017:v", ":nR._\u0013H]\u001fz}^({s9s\u00047\u007fJ\n\u0001\u0018\u000fk\u001e\u0004r\u0011DW", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7 \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001eRt\u0014\u0001mK4}\u000e\u001e\u001b\u001c6Y\u0011\u0019r\u000b\u0019\u0015\u0012>f\u007fBde,nXZ", "@d]1X9\"\\\u0007\u0002vk,{w<a\t6\u007fO\u0005! 5m\u0018Gv\u000fFY\u000b'3\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "@d]1X9\"\\\u0003\u0010zk3x\u001d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "AgP?X+\u001b])\byl", "/mX:T;>R\n\u0003\tb)\u0001\u00103t\u0014\u0016yJ\f\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.9ay/7l\u00072[G8o;\"$|O7\u0011n,$", "3mc2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u000fDi\u001f<QR?u=s", "3wXA", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V89hl-3v$2\\GEt\n", "0nd;W:-`\u0015\b\t_6\n\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006S/Eb|.&z\u00127[DEx<s", "@db6m,&]\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u0019N\u0005+\\L66[RH", "AgP?X+\u001b])\byl\u0010\u0005\u00146", "\"", ">`a2a;-`\u0015\b\tb;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "Dhb6U3>", "AgP?X+\u001b])\byl\u001e\u0001\u00182C{/\u0003@\u000e~\u0013Pk\u0010<u\u00169g\u0002\u001d;t\u001a=a", "AgP?X+\u001b])\byl\u001e\u0001\u00182C{/\u0003@\u000e~\u0013Pk\u0010<u\u00169g\u0002\u001d;t\u001a=a\u00027t8&\u0011weC\u0010]9N}'CZN", "AsPAX", "AgP?X+\u001eZ\u0019\u0007zg;n\r>h]$\u0003G\u0001$~Cx\n>v$&]\f$4q\u001d2\\W", "AjX=G6%]#\u0005va,x\b\u001di\u0015(", "Bn;<b2:V\u0019zy<6\u0007\u0016.i\t$\u000b@\u000f", "!gP=X\t:a\u0019}Xe0\b", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SharedTransitionScopeImpl implements SharedTransitionScope, LookaheadScope {
    public static final int $stable = 0;
    private final /* synthetic */ LookaheadScope $$delegate_0;
    private final CoroutineScope coroutineScope;
    private LayoutCoordinates nullableLookaheadRoot;
    public LayoutCoordinates root;
    private final MutableState isTransitionActive$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final Function0<Unit> observeAnimatingBlock = new Function0<Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$observeAnimatingBlock$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableScatterMap mutableScatterMap = this.this$0.sharedElements;
            Object[] objArr = mutableScatterMap.keys;
            Object[] objArr2 = mutableScatterMap.values;
            long[] jArr = mutableScatterMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((-1) - (((-1) - ((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2)))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (((SharedElement) objArr2[i5]).isAnimating()) {
                                return;
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
        }
    };
    private final Function1<SharedTransitionScope, Unit> updateTransitionActiveness = new Function1<SharedTransitionScope, Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.updateTransitionActiveness.1
        C04011() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SharedTransitionScope sharedTransitionScope) {
            invoke2(sharedTransitionScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SharedTransitionScope sharedTransitionScope) {
            SharedTransitionScopeImpl.this.updateTransitionActiveness();
        }
    };
    private final SnapshotStateList<LayerRenderer> renderers = SnapshotStateKt.mutableStateListOf();
    private final MutableScatterMap<Object, SharedElement> sharedElements = new MutableScatterMap<>(0, 1, null);

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope) {
        return this.$$delegate_0.getLookaheadScopeCoordinates(placementScope);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    /* JADX INFO: renamed from: localLookaheadPositionOf-au-aQtc */
    public long mo446localLookaheadPositionOfauaQtc(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j2, boolean z2) {
        return this.$$delegate_0.mo446localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2, j2, z2);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        return this.$$delegate_0.toLookaheadCoordinates(layoutCoordinates);
    }

    public SharedTransitionScopeImpl(LookaheadScope lookaheadScope, CoroutineScope coroutineScope) {
        this.coroutineScope = coroutineScope;
        this.$$delegate_0 = lookaheadScope;
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    private void setTransitionActive(boolean z2) {
        this.isTransitionActive$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionScope
    public boolean isTransitionActive() {
        return ((Boolean) this.isTransitionActive$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier skipToLookaheadSize(Modifier modifier) {
        return modifier.then(new SkipToLookaheadElement(null, null, 3, null));
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier renderInSharedTransitionScopeOverlay(Modifier modifier, Function0<Boolean> function0, float f2, Function2<? super LayoutDirection, ? super Density, ? extends Path> function2) {
        return modifier.then(new RenderInTransitionOverlayNodeElement(this, function0, f2, function2));
    }

    /* JADX INFO: renamed from: androidx.compose.animation.SharedTransitionScopeImpl$sharedElement$1 */
    /* JADX INFO: compiled from: SharedTransitionScope.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u007fJq%\u001c\\?Jk\n", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u0005>h}-\u0017\u0001\u001a=;R7z4sXOf5\u0018_uUr0I\u0016+6fYr9\u001dg"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C03991 extends Lambda implements Function1<EnterExitState, Boolean> {
        public static final C03991 INSTANCE = ;

        C03991() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(EnterExitState enterExitState) {
            return Boolean.valueOf(enterExitState == EnterExitState.Visible);
        }
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedElement(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z2, float f2, SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, animatedVisibilityScope.getTransition(), C03991.INSTANCE, boundsTransform, placeHolderSize, true, z2, f2, overlayClip);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$1 */
    /* JADX INFO: compiled from: SharedTransitionScope.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u007fJq%\u001c\\?Jk\n", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u0005>h}-\u0017\u0001\u001a=;R7z4sXOf5\u0018_uUr0I\u0016+6fYr9\u001dg"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<EnterExitState, Boolean> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(EnterExitState enterExitState) {
            return Boolean.valueOf(enterExitState == EnterExitState.Visible);
        }
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedBounds(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, BoundsTransform boundsTransform, SharedTransitionScope.ResizeMode resizeMode, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z2, float f2, SharedTransitionScope.OverlayClip overlayClip) {
        return ComposedModifierKt.composed$default(sharedBoundsImpl(modifier, sharedContentState, animatedVisibilityScope.getTransition(), AnonymousClass1.INSTANCE, boundsTransform, placeHolderSize, false, z2, f2, overlayClip), null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.2
            final /* synthetic */ EnterTransition $enter;
            final /* synthetic */ ExitTransition $exit;
            final /* synthetic */ SharedTransitionScope.ResizeMode $resizeMode;
            final /* synthetic */ SharedTransitionScope.SharedContentState $sharedContentState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EnterTransition enterTransition2, ExitTransition exitTransition2, SharedTransitionScope.SharedContentState sharedContentState2, SharedTransitionScope.ResizeMode resizeMode2) {
                super(3);
                enterTransition = enterTransition2;
                exitTransition = exitTransition2;
                sharedContentState = sharedContentState2;
                resizeMode = resizeMode2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                Modifier.Companion companionCreateContentScaleModifier;
                composer.startReplaceGroup(-419341573);
                ComposerKt.sourceInformation(composer, "C779@41927L35,771@41404L656:SharedTransitionScope.kt#xbi5r1");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-419341573, i2, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.<anonymous> (SharedTransitionScope.kt:770)");
                }
                Transition<EnterExitState> transition = animatedVisibilityScope.getTransition();
                EnterTransition enterTransition2 = enterTransition;
                ExitTransition exitTransition2 = exitTransition;
                ComposerKt.sourceInformationMarkerStart(composer, -1411456741, "CC(remember):SharedTransitionScope.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(sharedContentState);
                final SharedTransitionScope.SharedContentState sharedContentState2 = sharedContentState;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (Function0) new Function0<Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$1$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(sharedContentState2.isMatchFound());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier modifierCreateModifier = EnterExitTransitionKt.createModifier(transition, enterTransition2, exitTransition2, (Function0) objRememberedValue, "enter/exit for " + sharedContentState.getKey(), composer, 0, 0);
                if (resizeMode instanceof ScaleToBoundsImpl) {
                    composer.startReplaceGroup(-805247216);
                    ComposerKt.sourceInformation(composer, "784@42227L530");
                    Modifier.Companion companion = Modifier.Companion;
                    ScaleToBoundsImpl scaleToBoundsImpl = (ScaleToBoundsImpl) resizeMode;
                    ComposerKt.sourceInformationMarkerStart(composer, -1411446646, "CC(remember):SharedTransitionScope.kt#9igjgp");
                    boolean zChangedInstance2 = composer.changedInstance(sharedContentState);
                    final SharedTransitionScope.SharedContentState sharedContentState3 = sharedContentState;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$2$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return Boolean.valueOf(sharedContentState3.isMatchFound());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    companionCreateContentScaleModifier = SharedTransitionScopeKt.createContentScaleModifier(companion, scaleToBoundsImpl, (Function0) objRememberedValue2);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-804630006);
                    composer.endReplaceGroup();
                    companionCreateContentScaleModifier = Modifier.Companion;
                }
                Modifier modifierThen = modifierCreateModifier.then(companionCreateContentScaleModifier);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierThen;
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2 */
    /* JADX INFO: compiled from: SharedTransitionScope.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJc\u0003İY\u0006^\nVB-!r\u001bէ\u000bhp9>E"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pp<W\u0006+OL\u0018\nfZ}G\"\u0012gc2ns\u0001b@1xH62Q*S\nFr\u000f\f_\u001e94XLU\u0014H}\u0015\u0003\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ EnterTransition $enter;
        final /* synthetic */ ExitTransition $exit;
        final /* synthetic */ SharedTransitionScope.ResizeMode $resizeMode;
        final /* synthetic */ SharedTransitionScope.SharedContentState $sharedContentState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(EnterTransition enterTransition2, ExitTransition exitTransition2, SharedTransitionScope.SharedContentState sharedContentState2, SharedTransitionScope.ResizeMode resizeMode2) {
            super(3);
            enterTransition = enterTransition2;
            exitTransition = exitTransition2;
            sharedContentState = sharedContentState2;
            resizeMode = resizeMode2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
            return invoke(modifier2, composer, num.intValue());
        }

        public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
            Modifier.Companion companionCreateContentScaleModifier;
            composer.startReplaceGroup(-419341573);
            ComposerKt.sourceInformation(composer, "C779@41927L35,771@41404L656:SharedTransitionScope.kt#xbi5r1");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-419341573, i2, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.<anonymous> (SharedTransitionScope.kt:770)");
            }
            Transition<EnterExitState> transition = animatedVisibilityScope.getTransition();
            EnterTransition enterTransition2 = enterTransition;
            ExitTransition exitTransition2 = exitTransition;
            ComposerKt.sourceInformationMarkerStart(composer, -1411456741, "CC(remember):SharedTransitionScope.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(sharedContentState);
            final SharedTransitionScope.SharedContentState sharedContentState2 = sharedContentState;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function0) new Function0<Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$1$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Boolean.valueOf(sharedContentState2.isMatchFound());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier modifierCreateModifier = EnterExitTransitionKt.createModifier(transition, enterTransition2, exitTransition2, (Function0) objRememberedValue, "enter/exit for " + sharedContentState.getKey(), composer, 0, 0);
            if (resizeMode instanceof ScaleToBoundsImpl) {
                composer.startReplaceGroup(-805247216);
                ComposerKt.sourceInformation(composer, "784@42227L530");
                Modifier.Companion companion = Modifier.Companion;
                ScaleToBoundsImpl scaleToBoundsImpl = (ScaleToBoundsImpl) resizeMode;
                ComposerKt.sourceInformationMarkerStart(composer, -1411446646, "CC(remember):SharedTransitionScope.kt#9igjgp");
                boolean zChangedInstance2 = composer.changedInstance(sharedContentState);
                final SharedTransitionScope.SharedContentState sharedContentState3 = sharedContentState;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$2$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(sharedContentState3.isMatchFound());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                companionCreateContentScaleModifier = SharedTransitionScopeKt.createContentScaleModifier(companion, scaleToBoundsImpl, (Function0) objRememberedValue2);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-804630006);
                composer.endReplaceGroup();
                companionCreateContentScaleModifier = Modifier.Companion;
            }
            Modifier modifierThen = modifierCreateModifier.then(companionCreateContentScaleModifier);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierThen;
        }
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedElementWithCallerManagedVisibility(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, boolean z2, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z3, float f2, SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, null, new Function1<Unit, Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedElementWithCallerManagedVisibility.1
            final /* synthetic */ boolean $visible;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04001(boolean z22) {
                super(1);
                z = z22;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Unit unit) {
                return Boolean.valueOf(z);
            }
        }, boundsTransform, placeHolderSize, true, z3, f2, overlayClip);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.SharedTransitionScopeImpl$sharedElementWithCallerManagedVisibility$1 */
    /* JADX INFO: compiled from: SharedTransitionScope.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u0003\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "", "7me<^,", "uKZ<g3B\\bn\u0004b;RL\u0016j{9w\n\b\u0013 I9jF\u0001,5U\u0007u"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04001 extends Lambda implements Function1<Unit, Boolean> {
        final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04001(boolean z22) {
            super(1);
            z = z22;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Unit unit) {
            return Boolean.valueOf(z);
        }
    }

    public static /* synthetic */ Modifier sharedBoundsWithCallerManagedVisibility$animation_release$default(SharedTransitionScopeImpl sharedTransitionScopeImpl, Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, boolean z2, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z3, float f2, SharedTransitionScope.OverlayClip overlayClip, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            boundsTransform = SharedTransitionScopeKt.DefaultBoundsTransform;
        }
        if ((8 & i2) != 0) {
            placeHolderSize = SharedTransitionScope.PlaceHolderSize.Companion.getContentSize();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            z3 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            f2 = 0.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            overlayClip = SharedTransitionScopeKt.ParentClip;
        }
        return sharedTransitionScopeImpl.sharedBoundsWithCallerManagedVisibility$animation_release(modifier, sharedContentState, z2, boundsTransform, placeHolderSize, z3, f2, overlayClip);
    }

    public final Modifier sharedBoundsWithCallerManagedVisibility$animation_release(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, final boolean z2, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z3, float f2, SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, null, new Function1<Unit, Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Unit unit) {
                return Boolean.valueOf(z2);
            }
        }, boundsTransform, placeHolderSize, false, z3, f2, overlayClip);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public SharedTransitionScope.OverlayClip OverlayClip(Shape shape) {
        return new ShapeBasedClip(shape);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public SharedTransitionScope.SharedContentState rememberSharedContentState(Object obj, Composer composer, int i2) {
        composer.startReplaceGroup(799702514);
        ComposerKt.sourceInformation(composer, "C(rememberSharedContentState)912@49465L53:SharedTransitionScope.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(799702514, i2, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedContentState (SharedTransitionScope.kt:912)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 935469886, "CC(remember):SharedTransitionScope.kt#9igjgp");
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new SharedTransitionScope.SharedContentState(obj);
            composer.updateRememberedValue(objRememberedValue);
        }
        SharedTransitionScope.SharedContentState sharedContentState = (SharedTransitionScope.SharedContentState) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return sharedContentState;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.SharedTransitionScopeImpl$updateTransitionActiveness$1 */
    /* JADX INFO: compiled from: SharedTransitionScope.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u00079", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04011 extends Lambda implements Function1<SharedTransitionScope, Unit> {
        C04011() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SharedTransitionScope sharedTransitionScope) {
            invoke2(sharedTransitionScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SharedTransitionScope sharedTransitionScope) {
            SharedTransitionScopeImpl.this.updateTransitionActiveness();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateTransitionActiveness() {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SharedTransitionScopeImpl.updateTransitionActiveness():void");
    }

    static /* synthetic */ Modifier sharedBoundsImpl$default(SharedTransitionScopeImpl sharedTransitionScopeImpl, Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, Transition transition, Function1 function1, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z2, boolean z3, float f2, SharedTransitionScope.OverlayClip overlayClip, int i2, Object obj) {
        if ((i2 + 16) - (i2 | 16) != 0) {
            placeHolderSize = SharedTransitionScope.PlaceHolderSize.Companion.getContentSize();
        }
        return sharedTransitionScopeImpl.sharedBoundsImpl(modifier, sharedContentState, transition, function1, boundsTransform, placeHolderSize, z2, z3, f2, overlayClip);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.SharedTransitionScopeImpl$sharedBoundsImpl$1 */
    /* JADX INFO: compiled from: SharedTransitionScope.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJd\u0003İY\u0006^\nND\u0005Ӭ:\u0012 \u0007\u0015i\u007f9ǲiJ4Sa,"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "\"", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pp<W\u0006+OL\u0018\nfZ}G\"\u0012gc2ns\u0001b@1xH62Q*S\nFr\u000f\f_\u001e94XLU\u0014H}\u0015\u0003\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C03981 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ BoundsTransform $boundsTransform;
        final /* synthetic */ SharedTransitionScope.OverlayClip $clipInOverlayDuringTransition;
        final /* synthetic */ Transition<T> $parentTransition;
        final /* synthetic */ SharedTransitionScope.PlaceHolderSize $placeHolderSize;
        final /* synthetic */ boolean $renderInOverlayDuringTransition;
        final /* synthetic */ boolean $renderOnlyWhenVisible;
        final /* synthetic */ Function1<T, Boolean> $visible;
        final /* synthetic */ float $zIndexInOverlay;
        final /* synthetic */ SharedTransitionScopeImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C03981(Transition<T> transition, Function1<? super T, Boolean> function1, SharedTransitionScopeImpl sharedTransitionScopeImpl, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z2, SharedTransitionScope.OverlayClip overlayClip, float f2, boolean z3, BoundsTransform boundsTransform) {
            super(3);
            transition = transition;
            function1 = function1;
            sharedTransitionScopeImpl = sharedTransitionScopeImpl;
            placeHolderSize = placeHolderSize;
            z = z2;
            overlayClip = overlayClip;
            f = f2;
            z = z3;
            boundsTransform = boundsTransform;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            Transition transitionRememberTransition;
            composer.startReplaceGroup(-1843478929);
            ComposerKt.sourceInformation(composer, "C:SharedTransitionScope.kt#xbi5r1");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1843478929, i2, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous> (SharedTransitionScope.kt:968)");
            }
            Object key = sharedContentState.getKey();
            composer.startMovableGroup(-359675295, key);
            ComposerKt.sourceInformation(composer, "970@51556L35,1006@53390L522");
            ComposerKt.sourceInformationMarkerStart(composer, -359676293, "CC(remember):SharedTransitionScope.kt#9igjgp");
            SharedTransitionScopeImpl sharedTransitionScopeImpl = sharedTransitionScopeImpl;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = sharedTransitionScopeImpl.sharedElementsFor(key);
                composer.updateRememberedValue(objRememberedValue);
            }
            SharedElement sharedElement = (SharedElement) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.startMovableGroup(-359672306, transition);
            ComposerKt.sourceInformation(composer, "*997@53029L278");
            boolean z2 = false;
            if (transition != 0) {
                composer.startReplaceGroup(1735101820);
                ComposerKt.sourceInformation(composer, "974@51759L53");
                Transition<T> transition = transition;
                String string = key.toString();
                Function1<T, Boolean> function1 = function1;
                ComposerKt.sourceInformationMarkerStart(composer, 1215497572, "CC(createChildTransition)1813@74138L36,1814@74198L74,1815@74295L39,1816@74346L63:Transition.kt#pdpnli");
                ComposerKt.sourceInformationMarkerStart(composer, 272027253, "CC(remember):Transition.kt#9igjgp");
                boolean zChanged = composer.changed(transition);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = transition.getCurrentState();
                    composer.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (transition.isSeeking()) {
                    objRememberedValue2 = transition.getCurrentState();
                }
                composer.startReplaceGroup(1329676753);
                ComposerKt.sourceInformation(composer, "C:SharedTransitionScope.kt#xbi5r1");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1329676753, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:974)");
                }
                boolean zBooleanValue = function1.invoke((T) objRememberedValue2).booleanValue();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                Object targetState = transition.getTargetState();
                composer.startReplaceGroup(1329676753);
                ComposerKt.sourceInformation(composer, "C:SharedTransitionScope.kt#xbi5r1");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1329676753, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:974)");
                }
                boolean zBooleanValue2 = function1.invoke((T) targetState).booleanValue();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                transitionRememberTransition = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, boolValueOf, Boolean.valueOf(zBooleanValue2), string, composer, 0);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1735245009);
                ComposerKt.sourceInformation(composer, "*979@52034L707,992@52800L35");
                Function1<T, Boolean> function12 = function1;
                Intrinsics.checkNotNull(function12, "null cannot be cast to non-null type kotlin.Function1<kotlin.Unit, kotlin.Boolean>");
                boolean zBooleanValue3 = ((Boolean) ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function12, 1)).invoke(Unit.INSTANCE)).booleanValue();
                ComposerKt.sourceInformationMarkerStart(composer, -359660325, "CC(remember):SharedTransitionScope.kt#9igjgp");
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    if (sharedElement.getCurrentBounds() == null) {
                        z2 = zBooleanValue3;
                    } else if (!zBooleanValue3) {
                        z2 = true;
                    }
                    objRememberedValue3 = new MutableTransitionState(Boolean.valueOf(z2));
                    composer.updateRememberedValue(objRememberedValue3);
                }
                MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(composer);
                mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(zBooleanValue3));
                transitionRememberTransition = androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, null, composer, MutableTransitionState.$stable, 2);
                composer.endReplaceGroup();
            }
            composer.startMovableGroup(-359633642, Boolean.valueOf(sharedTransitionScopeImpl.isTransitionActive()));
            ComposerKt.sourceInformation(composer, "995@52949L45");
            Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transitionRememberTransition, VectorConvertersKt.getVectorConverter(Rect.Companion), null, composer, 0, 2);
            composer.endMovableGroup();
            ComposerKt.sourceInformationMarkerStart(composer, -359628914, "CC(remember):SharedTransitionScope.kt#9igjgp");
            boolean zChanged2 = composer.changed(transitionRememberTransition);
            SharedTransitionScopeImpl sharedTransitionScopeImpl2 = sharedTransitionScopeImpl;
            BoundsTransform boundsTransform = boundsTransform;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new BoundsAnimation(sharedTransitionScopeImpl2, transitionRememberTransition, deferredAnimationCreateDeferredAnimation, boundsTransform);
                composer.updateRememberedValue(objRememberedValue4);
            }
            BoundsAnimation boundsAnimation = (BoundsAnimation) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composer);
            boundsAnimation.updateAnimation(deferredAnimationCreateDeferredAnimation, boundsTransform);
            composer.endMovableGroup();
            SharedElementInternalState sharedElementInternalStateRememberSharedElementState = sharedTransitionScopeImpl.rememberSharedElementState(sharedElement, boundsAnimation, placeHolderSize, z, sharedContentState, overlayClip, f, z, composer, 0);
            composer.endMovableGroup();
            Modifier modifierThen = modifier.then(new SharedBoundsNodeElement(sharedElementInternalStateRememberSharedElementState));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierThen;
        }
    }

    private final <T> Modifier sharedBoundsImpl(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, Transition<T> transition, Function1<? super T, Boolean> function1, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z2, boolean z3, float f2, SharedTransitionScope.OverlayClip overlayClip) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.1
            final /* synthetic */ BoundsTransform $boundsTransform;
            final /* synthetic */ SharedTransitionScope.OverlayClip $clipInOverlayDuringTransition;
            final /* synthetic */ Transition<T> $parentTransition;
            final /* synthetic */ SharedTransitionScope.PlaceHolderSize $placeHolderSize;
            final /* synthetic */ boolean $renderInOverlayDuringTransition;
            final /* synthetic */ boolean $renderOnlyWhenVisible;
            final /* synthetic */ Function1<T, Boolean> $visible;
            final /* synthetic */ float $zIndexInOverlay;
            final /* synthetic */ SharedTransitionScopeImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C03981(Transition<T> transition2, Function1<? super T, Boolean> function12, SharedTransitionScopeImpl this, SharedTransitionScope.PlaceHolderSize placeHolderSize2, boolean z22, SharedTransitionScope.OverlayClip overlayClip2, float f22, boolean z32, BoundsTransform boundsTransform2) {
                super(3);
                transition = transition2;
                function1 = function12;
                sharedTransitionScopeImpl = this;
                placeHolderSize = placeHolderSize2;
                z = z22;
                overlayClip = overlayClip2;
                f = f22;
                z = z32;
                boundsTransform = boundsTransform2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                Transition transitionRememberTransition;
                composer.startReplaceGroup(-1843478929);
                ComposerKt.sourceInformation(composer, "C:SharedTransitionScope.kt#xbi5r1");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1843478929, i2, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous> (SharedTransitionScope.kt:968)");
                }
                Object key = sharedContentState.getKey();
                composer.startMovableGroup(-359675295, key);
                ComposerKt.sourceInformation(composer, "970@51556L35,1006@53390L522");
                ComposerKt.sourceInformationMarkerStart(composer, -359676293, "CC(remember):SharedTransitionScope.kt#9igjgp");
                SharedTransitionScopeImpl sharedTransitionScopeImpl = sharedTransitionScopeImpl;
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = sharedTransitionScopeImpl.sharedElementsFor(key);
                    composer.updateRememberedValue(objRememberedValue);
                }
                SharedElement sharedElement = (SharedElement) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.startMovableGroup(-359672306, transition);
                ComposerKt.sourceInformation(composer, "*997@53029L278");
                boolean z22 = false;
                if (transition != 0) {
                    composer.startReplaceGroup(1735101820);
                    ComposerKt.sourceInformation(composer, "974@51759L53");
                    Transition<T> transition2 = transition;
                    String string = key.toString();
                    Function1<T, Boolean> function12 = function1;
                    ComposerKt.sourceInformationMarkerStart(composer, 1215497572, "CC(createChildTransition)1813@74138L36,1814@74198L74,1815@74295L39,1816@74346L63:Transition.kt#pdpnli");
                    ComposerKt.sourceInformationMarkerStart(composer, 272027253, "CC(remember):Transition.kt#9igjgp");
                    boolean zChanged = composer.changed(transition2);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = transition2.getCurrentState();
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (transition2.isSeeking()) {
                        objRememberedValue2 = transition2.getCurrentState();
                    }
                    composer.startReplaceGroup(1329676753);
                    ComposerKt.sourceInformation(composer, "C:SharedTransitionScope.kt#xbi5r1");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1329676753, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:974)");
                    }
                    boolean zBooleanValue = function12.invoke((T) objRememberedValue2).booleanValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                    Object targetState = transition2.getTargetState();
                    composer.startReplaceGroup(1329676753);
                    ComposerKt.sourceInformation(composer, "C:SharedTransitionScope.kt#xbi5r1");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1329676753, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:974)");
                    }
                    boolean zBooleanValue2 = function12.invoke((T) targetState).booleanValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    transitionRememberTransition = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition2, boolValueOf, Boolean.valueOf(zBooleanValue2), string, composer, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1735245009);
                    ComposerKt.sourceInformation(composer, "*979@52034L707,992@52800L35");
                    Function1<T, Boolean> function122 = function1;
                    Intrinsics.checkNotNull(function122, "null cannot be cast to non-null type kotlin.Function1<kotlin.Unit, kotlin.Boolean>");
                    boolean zBooleanValue3 = ((Boolean) ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function122, 1)).invoke(Unit.INSTANCE)).booleanValue();
                    ComposerKt.sourceInformationMarkerStart(composer, -359660325, "CC(remember):SharedTransitionScope.kt#9igjgp");
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                        if (sharedElement.getCurrentBounds() == null) {
                            z22 = zBooleanValue3;
                        } else if (!zBooleanValue3) {
                            z22 = true;
                        }
                        objRememberedValue3 = new MutableTransitionState(Boolean.valueOf(z22));
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(zBooleanValue3));
                    transitionRememberTransition = androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, null, composer, MutableTransitionState.$stable, 2);
                    composer.endReplaceGroup();
                }
                composer.startMovableGroup(-359633642, Boolean.valueOf(sharedTransitionScopeImpl.isTransitionActive()));
                ComposerKt.sourceInformation(composer, "995@52949L45");
                Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transitionRememberTransition, VectorConvertersKt.getVectorConverter(Rect.Companion), null, composer, 0, 2);
                composer.endMovableGroup();
                ComposerKt.sourceInformationMarkerStart(composer, -359628914, "CC(remember):SharedTransitionScope.kt#9igjgp");
                boolean zChanged2 = composer.changed(transitionRememberTransition);
                SharedTransitionScopeImpl sharedTransitionScopeImpl2 = sharedTransitionScopeImpl;
                BoundsTransform boundsTransform2 = boundsTransform;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new BoundsAnimation(sharedTransitionScopeImpl2, transitionRememberTransition, deferredAnimationCreateDeferredAnimation, boundsTransform2);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                BoundsAnimation boundsAnimation = (BoundsAnimation) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(composer);
                boundsAnimation.updateAnimation(deferredAnimationCreateDeferredAnimation, boundsTransform);
                composer.endMovableGroup();
                SharedElementInternalState sharedElementInternalStateRememberSharedElementState = sharedTransitionScopeImpl.rememberSharedElementState(sharedElement, boundsAnimation, placeHolderSize, z, sharedContentState, overlayClip, f, z, composer, 0);
                composer.endMovableGroup();
                Modifier modifierThen = modifier2.then(new SharedBoundsNodeElement(sharedElementInternalStateRememberSharedElementState));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierThen;
            }
        }, 1, null);
    }

    public final SharedElementInternalState rememberSharedElementState(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z2, SharedTransitionScope.SharedContentState sharedContentState, SharedTransitionScope.OverlayClip overlayClip, float f2, boolean z3, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 2066772852, "C(rememberSharedElementState)P(6!1,2,4,5!1,7)*1032@54440L467:SharedTransitionScope.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2066772852, i2, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedElementState (SharedTransitionScope.kt:1032)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -663265575, "CC(remember):SharedTransitionScope.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new SharedElementInternalState(sharedElement, boundsAnimation, placeHolderSize, z2, overlayClip, z3, sharedContentState, f2);
            composer.updateRememberedValue(objRememberedValue);
        }
        SharedElementInternalState sharedElementInternalState = (SharedElementInternalState) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        sharedContentState.setInternalState$animation_release(sharedElementInternalState);
        sharedElementInternalState.setSharedElement(sharedElement);
        sharedElementInternalState.setRenderOnlyWhenVisible(z2);
        sharedElementInternalState.setBoundsAnimation(boundsAnimation);
        sharedElementInternalState.setPlaceHolderSize(placeHolderSize);
        sharedElementInternalState.setOverlayClip(overlayClip);
        sharedElementInternalState.setZIndex(f2);
        sharedElementInternalState.setRenderInOverlayDuringTransition(z3);
        sharedElementInternalState.setUserState(sharedContentState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return sharedElementInternalState;
    }

    public final LayoutCoordinates getRoot$animation_release() {
        LayoutCoordinates layoutCoordinates = this.root;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        Intrinsics.throwUninitializedPropertyAccessException("root");
        return null;
    }

    public final void setRoot$animation_release(LayoutCoordinates layoutCoordinates) {
        this.root = layoutCoordinates;
    }

    public final LayoutCoordinates getLookaheadRoot$animation_release() {
        LayoutCoordinates layoutCoordinates = this.nullableLookaheadRoot;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.".toString());
    }

    public final LayoutCoordinates getNullableLookaheadRoot$animation_release() {
        return this.nullableLookaheadRoot;
    }

    public final void setNullableLookaheadRoot$animation_release(LayoutCoordinates layoutCoordinates) {
        this.nullableLookaheadRoot = layoutCoordinates;
    }

    public final SharedElement sharedElementsFor(Object obj) {
        SharedElement sharedElement = this.sharedElements.get(obj);
        if (sharedElement != null) {
            return sharedElement;
        }
        SharedElement sharedElement2 = new SharedElement(obj, this);
        this.sharedElements.set(obj, sharedElement2);
        return sharedElement2;
    }

    public final void drawInOverlay$animation_release(ContentDrawScope contentDrawScope) {
        SnapshotStateList<LayerRenderer> snapshotStateList = this.renderers;
        if (snapshotStateList.size() > 1) {
            CollectionsKt.sortWith(snapshotStateList, new Comparator() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t2, T t3) {
                    LayerRenderer layerRenderer = (LayerRenderer) t2;
                    LayerRenderer layerRenderer2 = (LayerRenderer) t3;
                    return ComparisonsKt.compareValues(Float.valueOf((layerRenderer.getZIndex() == 0.0f && (layerRenderer instanceof SharedElementInternalState) && ((SharedElementInternalState) layerRenderer).getParentState() == null) ? -1.0f : layerRenderer.getZIndex()), Float.valueOf((layerRenderer2.getZIndex() == 0.0f && (layerRenderer2 instanceof SharedElementInternalState) && ((SharedElementInternalState) layerRenderer2).getParentState() == null) ? -1.0f : layerRenderer2.getZIndex()));
                }
            });
        }
        SnapshotStateList<LayerRenderer> snapshotStateList2 = this.renderers;
        int size = snapshotStateList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            snapshotStateList2.get(i2).drawInOverlay(contentDrawScope);
        }
    }

    public final void onStateRemoved$animation_release(SharedElementInternalState sharedElementInternalState) {
        SharedElement sharedElement = sharedElementInternalState.getSharedElement();
        sharedElement.removeState(sharedElementInternalState);
        this.updateTransitionActiveness.invoke(this);
        SharedTransitionScopeKt.getSharedTransitionObserver().observeReads(sharedElement.getScope(), this.updateTransitionActiveness, this.observeAnimatingBlock);
        this.renderers.remove(sharedElementInternalState);
        if (sharedElement.getStates().isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(sharedElement.getScope().coroutineScope, null, null, new SharedTransitionScopeImpl$onStateRemoved$1$1(sharedElement, null), 3, null);
        }
    }

    public final void onStateAdded$animation_release(SharedElementInternalState sharedElementInternalState) {
        SharedElement sharedElement = sharedElementInternalState.getSharedElement();
        sharedElement.addState(sharedElementInternalState);
        this.updateTransitionActiveness.invoke(this);
        SharedTransitionScopeKt.getSharedTransitionObserver().observeReads(sharedElement.getScope(), this.updateTransitionActiveness, this.observeAnimatingBlock);
        Iterator<LayerRenderer> it = this.renderers.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            LayerRenderer next = it.next();
            SharedElementInternalState sharedElementInternalState2 = next instanceof SharedElementInternalState ? (SharedElementInternalState) next : null;
            if (Intrinsics.areEqual(sharedElementInternalState2 != null ? sharedElementInternalState2.getSharedElement() : null, sharedElementInternalState.getSharedElement())) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == this.renderers.size() - 1 || i2 == -1) {
            this.renderers.add(sharedElementInternalState);
        } else {
            this.renderers.add(i2 + 1, sharedElementInternalState);
        }
    }

    public final void onLayerRendererCreated$animation_release(LayerRenderer layerRenderer) {
        this.renderers.add(layerRenderer);
    }

    public final void onLayerRendererRemoved$animation_release(LayerRenderer layerRenderer) {
        this.renderers.remove(layerRenderer);
    }

    /* JADX INFO: compiled from: SharedTransitionScope.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fsڔ<$q$yّCU0}*ޛUN}˧\u001fJ\t\n\u0004\u001a\u0016\u001a\u0007jDI\u0004yٕ\u0016\u000f@D8eAT\b=gf%:\u0013(J\"f\u00035\u0005(4`\u0010%\u0006sO\u001a\u001eH@\u001fG\u0003\u0011[\u00132\u00124Mf\u0015nkuNNH\u001b^Ơ3)\u000b݃ZP-b>\u0001\u001e\u0019TY?\r%gtѫB˝9\u0015-مα\u000bb"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007G4Y}e5OJ7\\/nK\u0014\u00118\u0015R6b", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u0016_v4NHb\ncV}\u0013", "1kX=F/:^\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~G\u0001\u001cBmkq>", "5dc\u0010_0IA\u001cz\u0006^", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3x\u0016\u0004", ">`c5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "5dc\u0010_0I>\u0015\u000e}", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u001aQr4GK,6earF#\u007fi\n]+b", "0nd;W:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class ShapeBasedClip implements SharedTransitionScope.OverlayClip {
        private final Shape clipShape;
        private final Path path = AndroidPath_androidKt.Path();

        public ShapeBasedClip(Shape shape) {
            this.clipShape = shape;
        }

        public final Shape getClipShape() {
            return this.clipShape;
        }

        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        public Path getClipPath(SharedTransitionScope.SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density) {
            this.path.reset();
            OutlineKt.addOutline(this.path, this.clipShape.mo621createOutlinePq9zytI(rect.m3970getSizeNHjbRc(), layoutDirection, density));
            this.path.mo4073translatek4lQ0M(rect.m3972getTopLeftF1C5BW0());
            return this.path;
        }
    }
}
