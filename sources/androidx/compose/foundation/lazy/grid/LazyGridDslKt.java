package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.FlingBehavior;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĝ\u0014D߬)\u001ew\u007fL܀kt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfrˎ8D{H6ɟ[*\u001dt\u0004é,[:qKП]\u001a\u0014\"\u0011ѧVg}nRZ\u0011C\u0017\u0006,xr,_U\u0001](\u000f:BuB;M}[A`\u0003<\r 8$@y\u001b\u0001\"*N\u0013~zQZ\u0014۵8@\u0007:Z\rS\u0005\"\u0012\u0014̄(ҵ&\\}N>H\u0003]B/9\u0003qBT'g0\u0013M\u0015Fj'\u0015vg 3@M5\u001d%Y\u0004\u001fOiΪ\u001b? <5l5'CI\"Xf^\u0006\u0014#-g\r\fuVb\u000bQn\u0010?+}h{V\u0014(\u0006\u0001\u0014\rj\u000b>\f-H<52f6\u0017czxSNZ\u001a^p\u000b+g<\u00173\fK+g(\u0017Wg;'\\O{3\u001cN)\u0007n/kl\u000e\u000f\u001eKi\u0006bIbP?XN8lMo\u0014p\u0011\u0001X\u0016ΥK\u007f5\u0010W3ϲ)7iN;\u001ey\u0018`D\u0016u5dvj\u0002RvARt\u001c78\u000b$Zrg5qVTf0)MJY7\u0004\u000e\u0013.b\u0010<O,@TUhwre]8._l=Y|w&Wgkc;Wc\u001ekjvBJlh\u000bXtPk\f\tkX(8Hx \u0010{rW<(@P\n-D.A\u0019\u000b(X\u0005.Bo{7q˖l\u0010\u0005hy)ғm$\u0003!\u0019tj\n\bm\tK<|\u000f=[[\u00029'Bm\"\u0017O-'\u0015\u001c\f\u007fu\u0003|KZ\u000b.u\u0004\u0017f\u00162\\_NU\u0013=\u001fY6\u0010D]L!f\u0002Q 1\u0013|(\u001akl<m j\u001f3'kߝST%C\u000f\u0002\u0001E d.\u001a\u0012J\tG{T9\\nM\u0001\u000fq<|E-\t-$=\u0001\u001e)C6ԩG'+9\u0010ӽ.#\u0006ui\u001e-\u001ad\u0015ծ\u0003\u000b,,\u0012) l_\u0002JAHKi~\u0005GR\u00133eNr\u0006/Z&D\u001eCW\b\nވZBS3?\u0004l0<\u000fv\\\u0002d#q\u000e4\\\u000b@rq\u0010D\rI-\u001fyk\u0010}o[\\9x\u001f\u001b\u001b\u000bw\u0014݁ G&~gh\u000fY\u0016u\u001e<ger\u0007L\tRcB;68ͲXi\f$+#Lg\u001dGJ_\u0004Lf\u001d\u001b\u001eחZR\u000b\tUf'S\u0011\u0001\u00159D#E5\u0015o\\S]\u000f`\u0013\u0004N\u000f\u001dx\u0001\u0017\u00125-TTgM8i\u0011\u001a\f\u0003ƀM\f<,W/s\u0015\u007f\u000e>\u001e#GR\u001a+9\u007f\u0010\u000e$ҍb\u000b[\u0018͒hv\u0018z\u0019Ɛ(Ĺ\u0003z\u000bBTØ\u000e\u0019=gr\u001eaMNTߗEhB\u0001EWY\u0011\u001a!{L+/\u00165sbw\u0005DJ\u0002_ab\u0016%017\u0013;FǛ[\u0018l2m!@?\u0002\u0018h\b/=`\"\u0014.x \t\t\\\u001af}\b;\u0010?v\u0002{y1@UY|\u0017RZ/\u001eƠgvi\u0017e\u0011\t\u0010AX\u007ftSz-\u000b7M\\BnYh>\u05c9$X\u0017\u0014D8,'D8zF `sw7\u0011Ϫ_\u00171W{0gZ@T$\u0004E$\u0006\b:V>\u0014i\u0002{P\u0015:bnP\t&\nz*tt:[$\u000e\u000fW%6ӥ8PxFt5=B/]\u0013M\u00071\u0014GY&O0\u0001lװ;2\u0011#Ĭz\u0011\tN)ߔ\u0006̂F\t\u00015\u007fǘ-T\u000bU\u001aUXDojܞ4pm8p\u001b\\\u001b\u001c5G`H\"N\\`Aiwcy\u001f\u0019\u000f<P8\u007f\u0018)D\u0019lƽ)4\u0007%\u0011\u0013E#Am@y]*3@\u001f~a|ǃ?/;\u000e\\-\u0012+uL\u0005S\n\u0001\u001fc<Icp4x\u0004m0M%,22\u000e`\u0010GAHX\u000elQf\u0003\u0006\u001fڲ.@tl3Mr\"\u0004\f2o>+tlqC\b \u008f\u001dNDR=r\rn]j\u007f\u0011j7U\u0016G\u000f4XI\u0016+Hޤu@1]#\u00065`kl+&\u0014KBpd\u0015üDc0.=\u0018Z\rzlsW\u0006GH#\u001d\u001cJ\u001dٽVj\u0006\t-\u001e-t\u0007H<b\u001fwQf\u001bB%#\rYp9;L\u001c0VH\u001a>Zb%\u0013ay\u0004RW!\u0005\u0017ؗ!\u001baM\u0016+m\u0014WA[w~tID\u001b|\u0011}˥if\u000b}1QjT%\u0002p1Tqf@**\u0007\u0005<}ŜL\u0010J,ه,m6Dvɶ\u0005\u0082G]\u000fU7ߧU#\u001c\u00172\u00116{f\u0017ҵE|\u0017R\u00046]\u0003\u0010'(G)\u0015\u001b\u001e\u001a^`=$E7F\n/t{e\u000e}X>\u001e˔N+5.O5Gt|XkE?\u000fO\u0010\u001c/mIˊ\u0017.h\u0010#o\u0014Ko\u0005R<|SXMi\u0011\u0015m\u0001\u000e)\"<q\u0012@c2UC!d,5i\u000eP=>\u007f7bۅn\u00060\u000e\u007flz\u0003]G1{?uA\u0003!r\u0016\u0005֟r[b\u0001N\u001d]OP\u0015\b CPq}X)^Fkb\u001c#ԷX`\u0017md$6h\b#~\u0017NtNKv\bæjY\u0004CaJh2prNG6\u001a|=7E\u000f\u0010\u07fb\u0005\u000bQ\n'\u001a=m\u0007%m9`Lq&c_;Fx1<\u0018\u0012>\u001b}kdNM\u007f.\r\u00153pv\u0004\u0014{3hܝ\bu5ZV`FE=\\-s\u000f?:\u001f\u001c\fKQ͗W\\W\u001e/xj(3  G}cW##\u0003G;6jï\\zt\f\u05f9).\u0002\u001aeːHܐ9lO.ګ7\u0013"}, d2 = {"\u001a`iF;6KW.\t\u0004m(\u0004j<i~", "", "@nf@", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3{\u0015ohG\\", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u0016_;NL", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "@de2e:>:\u0015\u0013\u0005n;", "", "6na6m6Gb\u0015\u0006Vk9x\u00121e\b(\u0005O", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", "DdaA\\*:Zt\f\bZ5~\t7e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", "4kX;Z\t>V\u0015\u0010~h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w.J?t6z\u0015k]J\u000bm9$", "CrT?F*K] \u0006Zg(y\u0010/d", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u0005m7NL", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\u001dx8\u001drhh@\u00159\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001d\t#).mH8#\b9\u001fh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b*rVb^uVEOksk\bt1&<G(\u0013;\u007f\u0017}d\u0010\u0017\u007fR~\u0002N\tg=.\u0015\u000471HqZY\u000fm_D\u007f1-KEx\u001cBas'\u00041\u000e=s=`\u0019Uw'\bIt\u0014+`J)\u00172C#?Y9jS:\u0017g,k\f\ru~/#mpmV\u000fP^!k>`[\u0010;\\\u000f\bPk)1V\u000e\f7\u0007\"\u0005\u0010&mmIL*\u0013c$}H7i\u001a\u0012~mm\u0003*\u001f<f\u0019l)r\u0001K\u001d\u0011sB\u001a{#D\u001f\u0001Q\u000fiZve`9+2\r\u001bY0|'I\u0004NLq\u0010\u001e4\n\u001a=\u000esvQ}4\u000f,z$UAam9\u000fffk\u0017q@');1KSJ~gv#$\u0002\u0018qF\u0017]LG\u0012@AW4\u0003CgT\u0007\u0019ZU\f=Q\u001f<6i|He\u0003<NwW\u0005\u00153B\u0014,5$\u0005K)p)xG\u001c\u0015\b~!9$L.5\u0012V\u0012{RL\u0019\u0011%-\u000f\u0018-Pv\u0015\u0016\u000e9LIRPvh\u0011\u0012\u0006_\u0010@XDOG\u001e>\u0012", "\u001a`iFI,Kb\u001d|ve\u000e\n\r.", "1n[B`5L", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\u001dx8\u001drhh@\u00159\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001d\t#).mH8#\b9\u001fh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b*rVb^uVEOksk\bt1&<G(\u0013;\u007f\u0017}d\u0010\u0017\u007fR~\u0002N\tg=.\u0015\u000471HqZY\u000fm_D\u007f1-KEx\u001cBas'\u00041\u000e=s=`\u0019Uw'\bIt\u0014+`J)\u00172C#?Y9jS:\u0017g,k\f\ru~/#mpmV\u000fP^!k>`[\u0010;\\\u000f\bPk)1V\u000e\f7\u0007\"\u0005\u0010&mmIL*\u0013q\u001a}S&]\r\nXM\u0014%-#G]\u000e{s]AU\u001e\u0013v8U|cS\u001eoD\u001fqU{%^k8@\t \u0013|@X8\u007fTCw\u0010\u001fC?m\t*w~L\u0003E\u000f,z$UAam9\u000fffk\u0017q@');1KSJ~gv#$\u0002\u0018qF\u0017]LG\u0012@AW4\u0003CgT\u0007\u0019ZU\f=Q\u001f<6i|He\u0003<NwW\u0005\u00153B\u0014,5$\u0005K)p)xG\u001c\u0015\b~!9$L.5\u0012V\u0012{RL\u0019\u0011%-\u000f\u0018-Pv\u0015\u0016\u000e9LIRPvh\u0011\u0012\u0006_\u0010@XDOG\u001e>\u0012", "1`[0h3:b\u0019\\ze3\u000bf<o\u000e6WS\u0005%\u0005K\u0005\u000e ~0<", "", "", "5qX1F0SS", "Ak^A66N\\(", "AoP0\\5@", "@d\\2`)>`v\t\u0002n4\u0006z3d\u000f+iP\t%", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u000em;\\a4Q]R+\\_H", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\u001dx8\u001drhh@\u00159\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u000e\u000fiJ#jS;)\u0011uP}Or\u0011\u001b_iBwlKX\u0010Oy\u001e\u0005\u007f\frS]t\u0004PPAi\u007fK\bh\u001ciD>#';\u0017%p[8\u0018{\u001d\u0012|b\u0003fcV\u001d\u0005AmEioPU~\u001f'p&\u001eO\u0005y\u0003._\u0005+\u0003\u0003j035q\u000fOf+\b\\\u0003\u001d7fO'oCL\u001cNOku6\u001c\u0018p*k\u0016\u000eo\u000b\u0015\\LalG\u001c\u0011a\u0016n~_i\tB\\\u0014>\u0013p\u001f7O}>j}\u001f\u0012P+iz]\r\u001da\u0005\u0019:+\u001et%d\u0010j\u0017\n5 Lgyu4p;L\u0013\u0016>", "@d\\2`)>`\u0006\t\rA,\u0001\u000b2tm8\u0004N", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\u001dx8\u001drhh@\u00159\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u000e\u000fiJ#jS;)\u0011uP}Or\u0011\u001b_iBwlKX\u0010Oy\u001e\u0005\u007f\u001ahShcwCH\u001bI&m\u000bl'`9Mm\u0012{!&r^.S|]!{QuvkQ\"D? RwkU\u000fZQ;s+(Mls\u0019BX\u0003\u0001[)\r37@h\u0004^1\u0016Hf\u0004\u001f:\\\u000b46?K\u0017GK-SvF\u0019r-a\u0015cFx\u0018\u0015ndpR\u0013\u0006p`Y?ij\u000bERO?S\u007f\u001e&B\u000eFe\u0003^\u0010\u00039\u0002/KP\u001fSJ\u0001lY6A\u001e\u0007\u0002T\u001f&=$(f\u0019y.^7Zh", "7sT:f", "\"", "", "9dh", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7sT:", "", "AoP;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c4<\u0002#P:L6gRH", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3\u0002$hi'\u0012_5$", "1n]AX5MB-\nz", "7sT:66Gb\u0019\b\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c4<t1RL$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8ta6Yv|=3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPyUJA.\u000f0RK@y\tU\u0017\u001e>h\u007fF`\u0019UCu\u0006J'wJchE\u001d(Kl9k\u0010hfaKBm\u0015\u0002\"\u0019wT8\u0013\n\u001dq\u0003[wvkQ\"G\u000e\u000bDwjMIx\u001fA\u0006/hL\f\u0001\u0010A\\~4\u0003vdD34s\tUpc\u0014E~\u001f;cE0o;M\u001b\tLs~jM\u0012r(oQnr>/(iol\u0017dJN", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8ta6Yv|.QJ=X\u001c\u0003L\u0018\u0019$tR9\u001cZ@G.}K;(Q1Z\n\u0005i\u0011\u0015\u0014\u001d9tyP pW\u0003\u0013\u0005E3q\u0012/F\u007fQPLf3.\u0011p%&;J-\u0012\u0001\u001d%q^wj\f\\\u000f\u0002V\u0004p4\u001d\u007f\u0001B3Eqd\u0010J\u0001]\u0006u7(I\u000b{\u001c;f>\f\u00056\u0002C.@mP!N\u001eHm\u007f\u00195&F8.\u007f=#HIryvG\u001c2\u007fq\u0011\fq9;\"4;'9", "7sT:f\u0010GR\u0019\u0012z]", "7mS2k", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8ta6Yv|=3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPyUJA.\u000f0RK@y\tU\u0017\u001e>h\u007fF`\u0019UCu\u0006J'wJchF\u001d(Kl9k\u0010hfaKBm\u0015\u0002\"\u0019wT8\u0013\n\u001dq\u0003[wvkQ\"H\u000e\u000bDwjMIx\u001fA\u0006/hL\f\u0001\u0010A\\~4\u0003vdD34s\tUpd\u0014E~\u001f;cE0o;M\u001b\tLs~jM\u0012r(oQnr>/(iol\u0018dJN", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8ta6Yv|.QJ=X\u001c\u0003L\u0018\u0019$tR9\u001cZ@G.}K;(Q1Z\n\u0005i\u0011\u0015\u0014\u001d9tyP pW\u0003\u0013\u0005E3q\u0013/F\u007fQPLf3.\u0011p%&;J-\u0012\u0001\u001d%q^wj\f\\\u000f\u0002V\u0004p5\u001d\u007f\u0001B3Eqd\u0010J\u0001]\u0006u7(I\u000b{\u001c;f>\f\u00056\u0002C.@mQ!N\u001eHm\u007f\u00195&F8.\u007f=#HIryvG\u001c2\u007fq\u0011\fq9;\"5;'9", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyGridDslKt {
    public static final void LazyVerticalGrid(final GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z3, final Function1<? super LazyGridScope, Unit> function1, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z4;
        boolean z5 = z3;
        FlingBehavior flingBehavior2 = flingBehavior;
        Arrangement.Vertical top = vertical;
        PaddingValues paddingValuesM1011PaddingValues0680j_4 = paddingValues;
        LazyGridState lazyGridStateRememberLazyGridState = lazyGridState;
        Arrangement.Horizontal start = horizontal;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1485410512);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LazyVerticalGrid)P(!1,5,7,2,6,9,4,3,8)64@2980L23,70@3340L15,75@3468L71,74@3442L481:LazyGridDsl.kt#7791vq");
        if ((i3 & 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (composerStartRestartGroup.changed(gridCells) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i7 = ((i3 & 4) == 0 && composerStartRestartGroup.changed(lazyGridStateRememberLazyGridState)) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (i3 + 8) - (i3 | 8);
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            int i9 = composerStartRestartGroup.changed(paddingValuesM1011PaddingValues0680j_4) ? 2048 : 1024;
            i4 = (i4 + i9) - (i4 & i9);
        }
        int i10 = (i3 + 16) - (i3 | 16);
        if (i10 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i11 = composerStartRestartGroup.changed(z2) ? 16384 : 8192;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 32) - (i3 | 32) == 0 && composerStartRestartGroup.changed(top)) ? 131072 : 65536)));
        }
        int i12 = (i3 + 64) - (i3 | 64);
        if (i12 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 1572864));
        } else if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(start) ? 1048576 : 524288;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 128)) == 0 && composerStartRestartGroup.changed(flingBehavior2)) ? 8388608 : 4194304;
        }
        int i13 = (-1) - (((-1) - i3) | ((-1) - 256));
        if (i13 != 0) {
            i4 = (i4 + 100663296) - (i4 & 100663296);
        } else if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z5) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((i3 + 512) - (i3 | 512) != 0) {
            i4 |= 805306368;
        } else if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            int i14 = composerStartRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
            i4 = (i4 + i14) - (i4 & i14);
        }
        if ((i4 + 306783379) - (306783379 | i4) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 + 4) - (i3 | 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i4 = (i4 - 897) - (i4 | (-897));
                }
                if (i8 != 0) {
                    paddingValuesM1011PaddingValues0680j_4 = PaddingKt.m1011PaddingValues0680j_4(Dp.m6638constructorimpl(0));
                }
                z4 = i10 == 0 ? z2 : false;
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    Arrangement arrangement = Arrangement.INSTANCE;
                    top = !z4 ? arrangement.getTop() : arrangement.getBottom();
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                if (i12 != 0) {
                    start = Arrangement.INSTANCE.getStart();
                }
                if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i4 &= -29360129;
                }
                if (i13 != 0) {
                    z5 = true;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i4 = (i4 - 897) - (i4 | (-897));
                }
                if ((i3 & 32) != 0) {
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                if ((i3 + 128) - (i3 | 128) != 0) {
                    i4 &= -29360129;
                }
                z4 = z2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1485410512, i4, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:73)");
            }
            int i15 = i4 >> 15;
            int i16 = i4 >> 3;
            LazyGridSlotsProvider lazyGridSlotsProviderRememberColumnWidthSums = rememberColumnWidthSums(gridCells, start, paddingValuesM1011PaddingValues0680j_4, composerStartRestartGroup, ((-1) - (((-1) - ((i4 + 14) - (14 | i4))) & ((-1) - ((i15 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i15 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))))) | ((i16 + 896) - (i16 | 896)));
            int i17 = (i16 + 14) - (i16 | 14);
            int i18 = ((i4 + 7168) - (7168 | i4)) | ((i17 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) | ((-1) - (((-1) - i16) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
            int i19 = (57344 + i4) - (57344 | i4);
            int i20 = (i18 + i19) - (i18 & i19);
            int i21 = (3670016 + i16) - (3670016 | i16);
            int i22 = (i20 + i21) - (i20 & i21);
            int i23 = (-1) - (((-1) - 29360128) | ((-1) - i16));
            int i24 = (i22 + i23) - (i22 & i23);
            int i25 = i4 << 9;
            int i26 = i24 | ((-1) - (((-1) - 234881024) | ((-1) - i25)));
            int i27 = i25 & 1879048192;
            LazyGridKt.LazyGrid(companion, lazyGridStateRememberLazyGridState, lazyGridSlotsProviderRememberColumnWidthSums, paddingValuesM1011PaddingValues0680j_4, z4, true, flingBehavior2, z5, top, start, function1, composerStartRestartGroup, (i26 + i27) - (i26 & i27), (i4 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z4 = z2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final LazyGridState lazyGridState2 = lazyGridStateRememberLazyGridState;
            final PaddingValues paddingValues2 = paddingValuesM1011PaddingValues0680j_4;
            final boolean z6 = z4;
            final Arrangement.Vertical vertical2 = top;
            final Arrangement.Horizontal horizontal2 = start;
            final FlingBehavior flingBehavior3 = flingBehavior2;
            final boolean z7 = z5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid.1
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
                    LazyGridDslKt.LazyVerticalGrid(gridCells, modifier2, lazyGridState2, paddingValues2, z6, vertical2, horizontal2, flingBehavior3, z7, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    public static final void LazyHorizontalGrid(final GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, FlingBehavior flingBehavior, boolean z3, final Function1<? super LazyGridScope, Unit> function1, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z4;
        boolean z5 = z3;
        FlingBehavior flingBehavior2 = flingBehavior;
        Arrangement.Horizontal start = horizontal;
        PaddingValues paddingValuesM1011PaddingValues0680j_4 = paddingValues;
        LazyGridState lazyGridStateRememberLazyGridState = lazyGridState;
        Arrangement.Vertical top = vertical;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(2123608858);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LazyHorizontalGrid)P(6,4,7,1,5,3,9,2,8)117@5477L23,123@5834L15,128@5962L64,127@5936L475:LazyGridDsl.kt#7791vq");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = i2 | 6;
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(gridCells) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (i3 | 2);
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 4)) == 0 && composerStartRestartGroup.changed(lazyGridStateRememberLazyGridState)) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i7 = composerStartRestartGroup.changed(paddingValuesM1011PaddingValues0680j_4) ? 2048 : 1024;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            int i9 = ((i3 & 32) == 0 && composerStartRestartGroup.changed(start)) ? 131072 : 65536;
            i4 = (i4 + i9) - (i4 & i9);
        }
        int i10 = i3 & 64;
        if (i10 != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((i2 & 1572864) == 0) {
            int i11 = composerStartRestartGroup.changed(top) ? 1048576 : 524288;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - i3) | ((-1) - 128)) == 0 && composerStartRestartGroup.changed(flingBehavior2)) ? 8388608 : 4194304)));
        }
        int i12 = (i3 + 256) - (i3 | 256);
        if (i12 != 0) {
            i4 = (i4 + 100663296) - (i4 & 100663296);
        } else if ((i2 & 100663296) == 0) {
            int i13 = composerStartRestartGroup.changed(z5) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i4 = (i4 + i13) - (i4 & i13);
        }
        if ((i3 & 512) != 0) {
            i4 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function1) ? 536870912 : 268435456)));
        }
        if ((i4 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 & 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
                if (i6 != 0) {
                    paddingValuesM1011PaddingValues0680j_4 = PaddingKt.m1011PaddingValues0680j_4(Dp.m6638constructorimpl(0));
                }
                z4 = i8 == 0 ? z2 : false;
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    Arrangement arrangement = Arrangement.INSTANCE;
                    start = !z4 ? arrangement.getStart() : arrangement.getEnd();
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                if (i10 != 0) {
                    top = Arrangement.INSTANCE.getTop();
                }
                if ((i3 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i4 = (i4 - 29360129) - (i4 | (-29360129));
                }
                if (i12 != 0) {
                    z5 = true;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
                if ((i3 & 32) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if ((i3 + 128) - (i3 | 128) != 0) {
                    i4 &= -29360129;
                }
                z4 = z2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2123608858, i4, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:126)");
            }
            int i14 = (i4 + 14) - (14 | i4);
            int i15 = (i4 >> 15) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            int i16 = i4 >> 3;
            LazyGridSlotsProvider lazyGridSlotsProviderRememberRowHeightSums = rememberRowHeightSums(gridCells, top, paddingValuesM1011PaddingValues0680j_4, composerStartRestartGroup, (-1) - (((-1) - ((i14 + i15) - (i14 & i15))) & ((-1) - (i16 & 896))));
            int i17 = (-1) - (((-1) - (((i4 + 7168) - (7168 | i4)) | ((((-1) - (((-1) - i16) | ((-1) - 14))) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - (((-1) - i16) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))))) & ((-1) - ((57344 + i4) - (57344 | i4))));
            int i18 = 3670016 & i16;
            int i19 = (i17 + i18) - (i17 & i18);
            int i20 = 29360128 & i16;
            int i21 = i4 << 6;
            LazyGridKt.LazyGrid(companion, lazyGridStateRememberLazyGridState, lazyGridSlotsProviderRememberRowHeightSums, paddingValuesM1011PaddingValues0680j_4, z4, false, flingBehavior2, z5, top, start, function1, composerStartRestartGroup, ((i19 + i20) - (i19 & i20)) | ((i21 + 234881024) - (i21 | 234881024)) | ((-1) - (((-1) - (i4 << 12)) | ((-1) - 1879048192))), (i4 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z4 = z2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final LazyGridState lazyGridState2 = lazyGridStateRememberLazyGridState;
            final PaddingValues paddingValues2 = paddingValuesM1011PaddingValues0680j_4;
            final boolean z6 = z4;
            final Arrangement.Horizontal horizontal2 = start;
            final Arrangement.Vertical vertical2 = top;
            final FlingBehavior flingBehavior3 = flingBehavior2;
            final boolean z7 = z5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid.1
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

                public final void invoke(Composer composer2, int i22) {
                    GridCells gridCells2 = gridCells;
                    Modifier modifier3 = modifier2;
                    LazyGridState lazyGridState3 = lazyGridState2;
                    PaddingValues paddingValues3 = paddingValues2;
                    boolean z8 = z6;
                    Arrangement.Horizontal horizontal3 = horizontal2;
                    Arrangement.Vertical vertical3 = vertical2;
                    FlingBehavior flingBehavior4 = flingBehavior3;
                    boolean z9 = z7;
                    Function1<LazyGridScope, Unit> function12 = function1;
                    int i23 = i2;
                    LazyGridDslKt.LazyHorizontalGrid(gridCells2, modifier3, lazyGridState3, paddingValues3, z8, horizontal3, vertical3, flingBehavior4, z9, function12, composer2, RecomposeScopeImplKt.updateChangedFlags((i23 + 1) - (i23 & 1)), i3);
                }
            });
        }
    }

    private static final LazyGridSlotsProvider rememberColumnWidthSums(final GridCells gridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1632454918, "C(rememberColumnWidthSums)P(!1,2)148@6622L975:LazyGridDsl.kt#7791vq");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1632454918, i2, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:148)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -2103044334, "CC(remember):LazyGridDsl.kt#9igjgp");
        int i3 = (-1) - (((-1) - ((-1) - (((-1) - ((((((-1) - (((-1) - i2) | ((-1) - 14))) ^ 6) <= 4 || !composer.changed(gridCells)) && (i2 + 6) - (6 | i2) != 4) ? 0 : 1)) & ((-1) - (((((112 & i2) ^ 48) <= 32 || !composer.changed(horizontal)) && (i2 + 48) - (48 | i2) != 32) ? 0 : 1))))) & ((-1) - (((((896 & i2) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(paddingValues)) || (i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256) ? 1 : 0)));
        GridSlotCache gridSlotCacheRememberedValue = composer.rememberedValue();
        if (i3 != 0 || gridSlotCacheRememberedValue == Composer.Companion.getEmpty()) {
            gridSlotCacheRememberedValue = new GridSlotCache(new Function2<Density, Constraints, LazyGridSlots>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberColumnWidthSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyGridSlots invoke(Density density, Constraints constraints) {
                    return m1150invoke0kLqBqw(density, constraints.m6597unboximpl());
                }

                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridSlots m1150invoke0kLqBqw(Density density, long j2) {
                    if (Constraints.m6591getMaxWidthimpl(j2) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
                    }
                    int iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j2) - density.mo704roundToPx0680j_4(Dp.m6638constructorimpl(PaddingKt.calculateStartPadding(paddingValues, LayoutDirection.Ltr) + PaddingKt.calculateEndPadding(paddingValues, LayoutDirection.Ltr)));
                    GridCells gridCells2 = gridCells;
                    Arrangement.Horizontal horizontal2 = horizontal;
                    int[] intArray = CollectionsKt.toIntArray(gridCells2.calculateCrossAxisCellSizes(density, iM6591getMaxWidthimpl, density.mo704roundToPx0680j_4(horizontal2.mo904getSpacingD9Ej5fM())));
                    int[] iArr = new int[intArray.length];
                    horizontal2.arrange(density, iM6591getMaxWidthimpl, intArray, LayoutDirection.Ltr, iArr);
                    return new LazyGridSlots(intArray, iArr);
                }
            });
            composer.updateRememberedValue(gridSlotCacheRememberedValue);
        }
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) gridSlotCacheRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return lazyGridSlotsProvider;
    }

    private static final LazyGridSlotsProvider rememberRowHeightSums(final GridCells gridCells, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -741512409, "C(rememberRowHeightSums)P(1,2)181@7795L909:LazyGridDsl.kt#7791vq");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-741512409, i2, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:181)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -380187903, "CC(remember):LazyGridDsl.kt#9igjgp");
        int i3 = ((((14 & i2) ^ 6) <= 4 || !composer.changed(gridCells)) && (-1) - (((-1) - i2) | ((-1) - 6)) != 4) ? 0 : 1;
        int i4 = ((((112 & i2) ^ 48) <= 32 || !composer.changed(vertical)) && (i2 + 48) - (48 | i2) != 32) ? 0 : 1;
        int i5 = (i3 + i4) - (i3 & i4);
        int i6 = (((((-1) - (((-1) - i2) | ((-1) - 896))) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(paddingValues)) || (-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 256) ? 1 : 0;
        int i7 = (i5 + i6) - (i5 & i6);
        GridSlotCache gridSlotCacheRememberedValue = composer.rememberedValue();
        if (i7 != 0 || gridSlotCacheRememberedValue == Composer.Companion.getEmpty()) {
            gridSlotCacheRememberedValue = new GridSlotCache(new Function2<Density, Constraints, LazyGridSlots>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberRowHeightSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyGridSlots invoke(Density density, Constraints constraints) {
                    return m1151invoke0kLqBqw(density, constraints.m6597unboximpl());
                }

                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridSlots m1151invoke0kLqBqw(Density density, long j2) {
                    if (Constraints.m6590getMaxHeightimpl(j2) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.".toString());
                    }
                    int iM6590getMaxHeightimpl = Constraints.m6590getMaxHeightimpl(j2) - density.mo704roundToPx0680j_4(Dp.m6638constructorimpl(paddingValues.mo971calculateTopPaddingD9Ej5fM() + paddingValues.mo968calculateBottomPaddingD9Ej5fM()));
                    GridCells gridCells2 = gridCells;
                    Arrangement.Vertical vertical2 = vertical;
                    int[] intArray = CollectionsKt.toIntArray(gridCells2.calculateCrossAxisCellSizes(density, iM6590getMaxHeightimpl, density.mo704roundToPx0680j_4(vertical2.mo904getSpacingD9Ej5fM())));
                    int[] iArr = new int[intArray.length];
                    vertical2.arrange(density, iM6590getMaxHeightimpl, intArray, iArr);
                    return new LazyGridSlots(intArray, iArr);
                }
            });
            composer.updateRememberedValue(gridSlotCacheRememberedValue);
        }
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) gridSlotCacheRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return lazyGridSlotsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> calculateCellsCrossAxisSizeImpl(int i2, int i3, int i4) {
        int i5 = i2 - (i4 * (i3 - 1));
        int i6 = i5 / i3;
        int i7 = i5 % i3;
        ArrayList arrayList = new ArrayList(i3);
        int i8 = 0;
        while (i8 < i3) {
            arrayList.add(Integer.valueOf((i8 < i7 ? 1 : 0) + i6));
            i8++;
        }
        return arrayList;
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, List list, Function1 function1, Function2 function2, Function1 function12, Function4 function4, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            function1 = null;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            function2 = null;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            function12 = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(T t2) {
                    return null;
                }
            };
        }
        lazyGridScope.items(list.size(), function1 != null ? new AnonymousClass2(function1, list) : null, function2 != null ? new AnonymousClass3(function2, list) : null, new AnonymousClass4(function12, list), ComposableLambdaKt.composableLambdaInstance(699646206, true, new AnonymousClass5(function4, list)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$2, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017\"Z\u0011\u0018\tlʑG0tiV/jSX\u00112\u0004Č([*t"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass2 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.$key = function1;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int i2) {
            return this.$key.invoke((T) this.$items.get(i2));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$3, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u0006ј~jg/dgN\u008c`SR\u000f\u001a|d(i&\nCiX`\u0006̀\rQTkus"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3\u0002$hi'\u0012_5$", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c4<\u0002#P:L6gRH", "7s", "", "7me<^,\u0006M`\t\bF)\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8jr,Vd2CU<*f]r\u0013wU?"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass3 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function2<LazyGridItemSpanScope, T, GridItemSpan> $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, List<? extends T> list) {
            super(2);
            this.$span = function2;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m1137boximpl(m1146invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m1146invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
            return this.$span.invoke(lazyGridItemSpanScope, (T) this.$items.get(i2)).m1144unboximpl();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$4, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017$B\u0011&\u0006\u0007l?ӄRex2`TB\u000f\u001a}z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass4 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
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

    public static final <T> void items(LazyGridScope lazyGridScope, List<? extends T> list, Function1<? super T, ? extends Object> function1, Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, Function1<? super T, ? extends Object> function12, Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyGridScope.items(list.size(), function1 != null ? new AnonymousClass2(function1, list) : null, function2 != null ? new AnonymousClass3(function2, list) : null, new AnonymousClass4(function12, list), ComposableLambdaKt.composableLambdaInstance(699646206, true, new AnonymousClass5(function4, list)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$5, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u0006ј~jg/dgN\u008c`SR\u000f\u001a|d(i&\nCiX`\u0007̀\rQTkus"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c4<t1RL$", "7s", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8jr,Vd%QWN\u0002@9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u0015<R\u0011?p\u0001Us\u0018=uzPV\u001d\u001d]Xf"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass5 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, List<? extends T> list) {
            super(4);
            this.$itemContent = function4;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void invoke(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            ComposerKt.sourceInformation(composer, "C464@19670L22:LazyGridDsl.kt#7791vq");
            if ((i3 + 6) - (6 | i3) == 0) {
                int i5 = composer.changed(lazyGridItemScope) ? 4 : 2;
                i4 = (i5 + i3) - (i5 & i3);
            } else {
                i4 = i3;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
                i4 = (-1) - (((-1) - i4) & ((-1) - (composer.changed(i2) ? 32 : 16)));
            }
            if ((i4 + 147) - (147 | i4) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(699646206, i4, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:464)");
            }
            this.$itemContent.invoke(lazyGridItemScope, (T) this.$items.get(i2), composer, Integer.valueOf((i4 + 14) - (i4 | 14)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, List list, Function2 function2, Function3 function3, Function2 function22, Function5 function5, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function2 = null;
        }
        if ((4 & i2) != 0) {
            function3 = null;
        }
        if ((i2 & 8) != 0) {
            function22 = new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1
                public final Void invoke(int i3, T t2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyGridScope.items(list.size(), function2 != null ? new C05072(function2, list) : null, function3 != null ? new C05083(function3, list) : null, new C05094(function22, list), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new C05105(function5, list)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017\"Z\u0011\u0018\tlʑG0tiV/jSX\u00112\u0004Č([*t"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C05072 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05072(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.$key = function2;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int i2) {
            return this.$key.invoke(Integer.valueOf(i2), (T) this.$items.get(i2));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u0006ј~jg/dgN\u008c`SR\u000f\u001a|d(i&\nCiX`\u0006̀\rQTkus"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3\u0002$hi'\u0012_5$", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c4<\u0002#P:L6gRH", "7s", "", "7me<^,\u0006M`\t\bF)\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8jr,Vd2CU<*f]r\u0013wU?"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C05083 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function3<LazyGridItemSpanScope, Integer, T, GridItemSpan> $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05083(Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, List<? extends T> list) {
            super(2);
            this.$span = function3;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m1137boximpl(m1148invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m1148invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
            return this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i2), (T) this.$items.get(i2)).m1144unboximpl();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$4, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017$B\u0011&\u0006\u0007l?ӄRex2`TB\u000f\u001a}z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C05094 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05094(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
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

    public static final <T> void itemsIndexed(LazyGridScope lazyGridScope, List<? extends T> list, Function2<? super Integer, ? super T, ? extends Object> function2, Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, Function2<? super Integer, ? super T, ? extends Object> function22, Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyGridScope.items(list.size(), function2 != null ? new C05072(function2, list) : null, function3 != null ? new C05083(function3, list) : null, new C05094(function22, list), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new C05105(function5, list)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$5, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u0006ј~jg/dgN\u008c`SR\u000f\u001a|d(i&\nCiX`\u0007̀\rQTkus"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c4<t1RL$", "7s", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8jr,Vd%QWN\u0002@9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u0015<R\u0011?p\u0001Us\u0018=uzPV\u001d\u001d]Xf"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C05105 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05105(Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, List<? extends T> list) {
            super(4);
            this.$itemContent = function5;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void invoke(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            ComposerKt.sourceInformation(composer, "C498@21519L26:LazyGridDsl.kt#7791vq");
            if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
                i4 = (-1) - (((-1) - (composer.changed(lazyGridItemScope) ? 4 : 2)) & ((-1) - i3));
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
                ComposerKt.traceEventStart(1229287273, i4, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:498)");
            }
            this.$itemContent.invoke(lazyGridItemScope, Integer.valueOf(i2), (T) this.$items.get(i2), composer, Integer.valueOf((i4 + 126) - (i4 | 126)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, Object[] objArr, Function1 function1, Function2 function2, Function1 function12, Function4 function4, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        if ((4 & i2) != 0) {
            function2 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            function12 = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(T t2) {
                    return null;
                }
            };
        }
        lazyGridScope.items(objArr.length, function1 != null ? new AnonymousClass7(function1, objArr) : null, function2 != null ? new AnonymousClass8(function2, objArr) : null, new AnonymousClass9(function12, objArr), ComposableLambdaKt.composableLambdaInstance(407562193, true, new AnonymousClass10(function4, objArr)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$7, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017\"Z\u0011\u0018\tlʑG0tiV/jSX\u00112\u0004Č([*t"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass7 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.$key = function1;
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
            return this.$key.invoke(this.$items[i2]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$8, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u0006ј~jg/dgN\u008c`SR\u000f\u001a|d(i&\nCiX`\u0006̀\rQTkus"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3\u0002$hi'\u0012_5$", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c4<\u0002#P:L6gRH", "7s", "", "7me<^,\u0006M`\t\bF)\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8jr,Vd2CU<*f]r\u0013wU?"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass8 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function2<LazyGridItemSpanScope, T, GridItemSpan> $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, T[] tArr) {
            super(2);
            this.$span = function2;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m1137boximpl(m1147invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
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
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m1147invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
            return this.$span.invoke(lazyGridItemSpanScope, this.$items[i2]).m1144unboximpl();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$9, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017$B\u0011&\u0006\u0007l?ӄRex2`TB\u000f\u001a}z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass9 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(Function1<? super T, ? extends Object> function1, T[] tArr) {
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

    public static final <T> void items(LazyGridScope lazyGridScope, T[] tArr, Function1<? super T, ? extends Object> function1, Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, Function1<? super T, ? extends Object> function12, Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyGridScope.items(tArr.length, function1 != null ? new AnonymousClass7(function1, tArr) : null, function2 != null ? new AnonymousClass8(function2, tArr) : null, new AnonymousClass9(function12, tArr), ComposableLambdaKt.composableLambdaInstance(407562193, true, new AnonymousClass10(function4, tArr)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$10, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u0006ј~jg/dgN\u008c`SR\u000f\u001a|d(i&\nCiX`\u0007̀\rQTkus"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c4<t1RL$", "7s", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8jr,Vd%QWN\u0002@9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u0015<R\u0011?p\u0001Us\u0018=uzPV\u001d\u001d]Xf"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass10 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, T[] tArr) {
            super(4);
            this.$itemContent = function4;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
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
        public final void invoke(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            ComposerKt.sourceInformation(composer, "C532@23245L22:LazyGridDsl.kt#7791vq");
            if ((i3 + 6) - (6 | i3) == 0) {
                i4 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
                i4 = (-1) - (((-1) - i4) & ((-1) - (composer.changed(i2) ? 32 : 16)));
            }
            if ((i4 & 147) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407562193, i4, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:532)");
            }
            this.$itemContent.invoke(lazyGridItemScope, this.$items[i2], composer, Integer.valueOf((i4 + 14) - (i4 | 14)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, Object[] objArr, Function2 function2, Function3 function3, Function2 function22, Function5 function5, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            function2 = null;
        }
        if ((4 & i2) != 0) {
            function3 = null;
        }
        if ((i2 & 8) != 0) {
            function22 = new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6
                public final Void invoke(int i3, T t2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyGridScope.items(objArr.length, function2 != null ? new C05127(function2, objArr) : null, function3 != null ? new C05138(function3, objArr) : null, new C05149(function22, objArr), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new C050610(function5, objArr)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$7, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017\"Z\u0011\u0018\tlʑG0tiV/jSX\u00112\u0004Č([*t"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C05127 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05127(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.$key = function2;
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
            return this.$key.invoke(Integer.valueOf(i2), this.$items[i2]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u0006ј~jg/dgN\u008c`SR\u000f\u001a|d(i&\nCiX`\u0006̀\rQTkus"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3\u0002$hi'\u0012_5$", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c4<\u0002#P:L6gRH", "7s", "", "7me<^,\u0006M`\t\bF)\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8jr,Vd2CU<*f]r\u0013wU?"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C05138 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function3<LazyGridItemSpanScope, Integer, T, GridItemSpan> $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05138(Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, T[] tArr) {
            super(2);
            this.$span = function3;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m1137boximpl(m1149invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
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
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m1149invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
            return this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i2), this.$items[i2]).m1144unboximpl();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$9, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017$B\u0011&\u0006\u0007l?ӄRex2`TB\u000f\u001a}z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C05149 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05149(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
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

    public static final <T> void itemsIndexed(LazyGridScope lazyGridScope, T[] tArr, Function2<? super Integer, ? super T, ? extends Object> function2, Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, Function2<? super Integer, ? super T, ? extends Object> function22, Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyGridScope.items(tArr.length, function2 != null ? new C05127(function2, tArr) : null, function3 != null ? new C05138(function3, tArr) : null, new C05149(function22, tArr), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new C050610(function5, tArr)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$10, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u0006ј~jg/dgN\u008c`SR\u000f\u001a|d(i&\nCiX`\u0007̀\rQTkus"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c4<t1RL$", "7s", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8jr,Vd%QWN\u0002@9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u0015<R\u0011?p\u0001Us\u0018=uzPV\u001d\u001d]Xf"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C050610 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C050610(Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, T[] tArr) {
            super(4);
            this.$itemContent = function5;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
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
        public final void invoke(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            ComposerKt.sourceInformation(composer, "C566@25098L26:LazyGridDsl.kt#7791vq");
            if ((6 & i3) == 0) {
                int i5 = composer.changed(lazyGridItemScope) ? 4 : 2;
                i4 = (i5 + i3) - (i5 & i3);
            } else {
                i4 = i3;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
                i4 = (-1) - (((-1) - i4) & ((-1) - (composer.changed(i2) ? 32 : 16)));
            }
            if ((-1) - (((-1) - i4) | ((-1) - 147)) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-911455938, i4, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:566)");
            }
            this.$itemContent.invoke(lazyGridItemScope, Integer.valueOf(i2), this.$items[i2], composer, Integer.valueOf((i4 + 126) - (i4 | 126)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
