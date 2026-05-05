package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Composables.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яx\u001d̉=!4i\bDJd|\u0004O\f8\u000b4C\u0007\"B\u0012\u007f\u0007lmA0ZeP.XT2\u000fy{<řc$\u007fّC٥\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001jBI]xs\u0012\u00172XoG3SoE9vt>\u0005&2*8\u0010\u0005\t\u001a0M\u0018v\tLS\f\u00181HpHa\u0015M\u000b%\u001a\u0006T \t\u001ebgf\u0011V|u:]4#oH÷5qX|{ f`-\f\u0005u4*h;E\u0015+T1\u001c\u0003gE\tM\bU\u000bx)7+\u0010\u0006\u0006M\t \"-Ck\u001de\u0003,l\u0007a`R9YisM`\u000eV\t)\u0015Ɂ@\u0004\u0014!όL.36-ڤ\u0014\u07baxra]hklR\u0018z\u0010G7'\u0006đ9K;rW`I-d6$\t\u001d\u001e)\u0002\u001d6\f`\u0014f#1l}a3a@\u0004Z|!\n]{\u001c\t~\u00122\u00146W\u0002?{W@E?G]I#O|0aזkv\u000b{ĈWiXdp1|4O5\u0019\u000ejD\u0013\u0016\u001agԜ\\,\u0017lbΉ\rą\f\u0013.|\u0010˥ 3 fO\u0017z\u000bOc܃3A\u0007C_my\"m8\u00077EQi\u0011\u0010g' EBp\u001bplRU\u001cZ#:PIx\u000b\u001e\u0010\u0014`^\u0014#8Os,4rCGv%J\u0013\u001epR+\"ރ^h\u0016\u001aՁ7$\t\u0006T\u0017\u000f\u0007^}\t\fw\u0001Y2\rb2-\bcc;6W2hb\u000eQ ҋw\u007fM\u0007֙KLr2&d\n>.%IS?=A -@ɨ\u0006-Kk9ϔW̊\u0016'\t \u0012iI\rFg6{\u00112fʄXa|\u0017P\n~~)\u0007r\u0014\u0010`n~WcZ\f\nSy~\t_JdP\u0003\u0015!.%G\u0002P\u0014eMQ?52\b\u001c?\u001bq_yot\f\u0011)6vu\u0004ZtD\t͈U]8VΒMY\u0005ZhقrúFHx\u0015 ,\u0017X%3vR\u0005r\\Е[\u001dO\nl\u0006:!\u0007U\u0004>#o\u00045\\tZ\u007fI\u0004\"t[+!Ocg4\u007fys;j\u001d\"#\u0018Av\"\"M\"fW)\u001b^ \u0004\u001aFAis3Uʢ(42Wޭ\u000fCZ\u00066\u001f\t\u001e^j\u001f\u0019BB\"L\u0005%֭|\\\\gKނKȚ%*\u000f\u001f'ʎ\u001d\u0007YI\u0005\u001cWt1iѢ\u000fe=\u0015!i]\u0013|$SHd9!)\u0007\u0016;QcIW\u0018N\nW+}k6\u001ef/-=P03Ua\u0019o|@`\u001bU+`\u0013\u0011\"hbNP:-\u0014է\u0012<\u0010*Ո\u001dOx\f\u0013ORT\u0006X[6\u0011\u001fT/\u0017\u000e\rc\r-[(E/MI\u0019%U\u0015\u009cW;\u0004'Ù$'\n\u0011Qke,~\u0015m\u001dJ\u0016 '\u0011\u0019Ƥ\u0017P&#t\u0605zҽ\u000e.\u0016Yg+A'+^\b|('NMCn\u001cAy{)\u0019q\u000b{ye\r\u0013f_g(\u0006\u0094T\u001d\u000fF\u0014ܠ\u0019͠^:\u001fz8\u0002\u001f(,\u0015T0f\fpR(O\u0012\u0013!|U]\u001bIGv:cA0\u0001/,6ݺy\u00040snׅAܑQ>r4trP\u0004&^\u00199+s$f\"#\u0017H%#36Lݱ,v_K'Ls\u0017Wf\r\u0003UK< _emIW4!nV\nA\u0012H\u0012\r\u000b:D\u0019rFyZDĘX= F ކs҉\u0007&YuPi\u0016])\u000eWAz:&ڨj,LLW5OK)\f%:\u0016oM+c\u0002ܱW%0\u001cCӝ\u0013ק}1ym\fh\u0001TG\u000f6-whAäCw|-\u001a6}L\u0015L\u0012i?r2KCw6\u0005eB\u0010\ne6R\u001dÑ'\u007fKL\u000f߳eЪDV\u0002\r\u001ca8g\u0007DiY\rzyԁ:{Hyr\u0010y6WyB,tD8c\u0005\t[L\u0017\r;U\u0013G\"i'\u001195'|Va W\u0557MrSJ#ѶB\u038bw\u0004Hiy{\bxXYp\u0018M\u0014Zĝx|\u001eWmDP\u0014#\f2\u000baXn6x\u001f.&y\nv<j1eCx\nn\"To4D\u001a=\u001e!>J'\u0002D\\\u000f,Θ7Gy\\\u000e̐\\Ý%\u001d\u001f\u0015=E3\u0019\u0003G\u0006g\u0012ZCغA\u001d\u001e^fb}f\u0015['Jt-+~\u0019>\\uv@0)\u0007\u0019>VjJ\u001ev\u0011O8o@0vb-q\u05cfa\u0001\":\u0004ս\u001b\u05ca\u00032pqso\u001ffOW\u001d\u000f\u001c(٭|\u0002\u0011Ma(!Ǻ6Sg1Y9Կ5B\u0014\nbIc}\u000eX\u001e\u0005yJO2<\u0005ĪEO\u0005XkC'\\_\u0014\u001a&?$4\u001aZ(ԝ\u0017s\u001e$e\u000bZ?n+NUg\u001c\u0007Qx\u001b\u0013t:;B}˴\nA\u001e\u0013h*CJݓDj"}, d2 = {"1ta?X5M1#\u0007\u0006h:|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\r", "5dc\u0010h9KS\"\u000eXh4\b\u0013=e\r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016[<eavE\u0014[8\u0018V6\u0017\u0013YNy", "1ta?X5M1#\u0007\u0006h:\u0001\u0018/K\u007f<^<\u000f\u001a", "", "5dc\u0010h9KS\"\u000eXh4\b\u0013=i\u000f(a@\u0015y\u0013Ur", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq1", "1ta?X5M1#\u0007\u0006h:\u0001\u00183o\t\u000f\u0006>|\u001etQx\u001d<\n4", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0015WA7r\u0012(\u001ewaL\u00169", "5dc\u0010h9KS\"\u000eXh4\b\u0013=i\u000f,\u0006Ig!\u0015CvkF\u007f45l\r^3v\u001f8\\?Jo>'#", "u(E", "5dc\u0010h9KS\"\u000eXh4\b\u0013=i\u000f,\u0006Ig!\u0015CvkF\u007f45l\r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016[<eavE\u0014[8\u0018V6\u0017\u0013]P(xM\u001e)\u0006(P_Eq\u0010\f)\u001d\u000b", "1ta?X5M@\u0019|\u0005f7\u0007\u0017/S}2\u0007@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u0011", "5dc\u0010h9KS\"\u000eg^*\u0007\u0011:o\u000e(i>\u000b\"\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016[<eavE\u0014[G\u000eL5\u0015\u0010cO$\\BA*\b\u0002", "\u0011n\\=b:><#}z", "", "\"", "", "\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "4`RAb9R", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "CoS.g,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9}Gu!DY\u000bu", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l@\u0005!<`\b2\u0015w\u001e9WQ7h;\u001erdh@\u00159", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d]0tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u000e\u001c\u001f\u001d9rp\f4\u001aO\u0005\u001f\u0004A6>*\u001dP", "1n]AX5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d]0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003aK(%qEfi}FT\u000f`4l\u0017i+\\\u0004G4\u001d\u0001\u001d#h\u001a\f\u0014\u0004^\u001b\u0001R\u0007=K\u000b\n", "AjX=c(;Z\u0019n\u0006](\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Bz0@Uz'7]!-IR;x\n", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d]0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003bK(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\]H9upfT#~77\bkeNPyc<>4/T\u000b{\u001a2\"R5|8\u000eB*C:h\u000fX", " dd@T)ESv\t\u0003i6\u000b\t\u0018o~(", " dd@T)ESv\t\u0004m,\u0006\u0018", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0012iJ3rL7he6Q\rEv\u0001\u0019kqx[", " dd@T)ESv\t\u0004m,\u0006\u0018\u0012o\u000e7", "/bc6i,", "", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u00047P[R4\\\u001cPG\u001c\u001dd\u001cN8bh\u001d2", "7me._0=/$\n\u0002b,\n", "9dh@", "", "0k^0^", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0007!&Ns\u0017\u0006{6=#~0@k%2WLI5\u0015.\u001efp=\u0011lx$]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNfQ-}H?\u001fQ\nS\nFr\u000f\f#c\u0019.WGR!CC\u001cqJ+20VdyEP\u001b", "@d\\2`)>`", "1`[0h3:b\u001d\t\u0004", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001pH@F \u007f@\u0001&\u00045KK%e\u0006\f\u0014\u001d\u000b", "9dh}", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010.\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0012iJ3rL7he6Q\rEv\u0001\u0019kqxQu>g\f\u0011\u0001\u0011~CrRC^_wV\u0017", "9dh~", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WubkUJ#{N;\u001e\u001buG\fCs\u000b\u001a\u0016WBzyQZ\u0018GCr\u007fI4rTYlO+\u0005,g&u\b)$XC<m}n\u001e\u001bf_\u0004", "9dh\u007f", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015`c\u001cfyAc\u001aKx(??3pQcmy\u0011NUk9h\u0014_f:DB/\u001e\u007f\u0019(>4qp\u0001O\"n\u001c\u0001cpIbd5)>kj\u001c", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0007!&Ns\u0017\u0006{6=#~0@k%2WLI5\u0015.\u001efp=\u0011lv$]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNfQ-}H?\u001fQ\nS\nFr\u000f\f#c\u0019.WGR!CC\u001cqJ+20VdyEP\u001b", "@d\\2`)>`v\t\u0003i6\u000b\r>i\n1YJ\n&\u0017Z~", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016[<eavE\u0014[8\u0018V6\u0017\u0013]P(xM\u0015)\u0011;I\u0015J>", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ComposablesKt {
    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations() {
    }

    public static final <T> T remember(Function0<? extends T> function0, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -492369756, "CC(remember):Composables.kt#9igjgp");
        T tInvoke = (T) composer.rememberedValue();
        if (tInvoke == Composer.Companion.getEmpty()) {
            tInvoke = function0.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return tInvoke;
    }

    public static final <T> T remember(Object obj, Function0<? extends T> function0, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1157296644, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean zChanged = composer.changed(obj);
        T tInvoke = (T) composer.rememberedValue();
        if (zChanged || tInvoke == Composer.Companion.getEmpty()) {
            tInvoke = function0.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return tInvoke;
    }

    public static final <T> T remember(Object obj, Object obj2, Function0<? extends T> function0, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 511388516, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean z2 = (-1) - (((-1) - (composer.changed(obj) ? 1 : 0)) & ((-1) - (composer.changed(obj2) ? 1 : 0))) == 1;
        T tInvoke = (T) composer.rememberedValue();
        if (z2 || tInvoke == Composer.Companion.getEmpty()) {
            tInvoke = function0.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return tInvoke;
    }

    public static final <T> T remember(Object obj, Object obj2, Object obj3, Function0<? extends T> function0, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1618982084, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean zChanged = composer.changed(obj);
        boolean zChanged2 = composer.changed(obj2);
        boolean zChanged3 = (((zChanged ? 1 : 0) + (zChanged2 ? 1 : 0)) - ((zChanged ? 1 : 0) & (zChanged2 ? 1 : 0)) == 1) | composer.changed(obj3);
        T tInvoke = (T) composer.rememberedValue();
        if (zChanged3 || tInvoke == Composer.Companion.getEmpty()) {
            tInvoke = function0.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return tInvoke;
    }

    public static final <T> T remember(Object[] objArr, Function0<? extends T> function0, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -568225417, "CC(remember)P(1):Composables.kt#9igjgp");
        int i3 = 0;
        for (Object obj : objArr) {
            boolean zChanged = composer.changed(obj);
            int i4 = (i3 + (zChanged ? 1 : 0)) - (i3 & (zChanged ? 1 : 0));
            i3 = 1;
            if (i4 != 1) {
                i3 = 0;
            }
        }
        T tInvoke = (T) composer.rememberedValue();
        if (i3 != 0 || tInvoke == Composer.Companion.getEmpty()) {
            tInvoke = function0.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return tInvoke;
    }

    public static final <T> T key(Object[] objArr, Function2<? super Composer, ? super Integer, ? extends T> function2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -11941951, "CC(key)P(1)132@4789L7:Composables.kt#9igjgp");
        int i3 = i2 >> 3;
        T tInvoke = function2.invoke(composer, Integer.valueOf((i3 + 14) - (i3 | 14)));
        ComposerKt.sourceInformationMarkerEnd(composer);
        return tInvoke;
    }

    public static final void ReusableContent(Object obj, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 444418301, "CC(ReusableContent)P(1)149@5444L9:Composables.kt#9igjgp");
        composer.startReusableGroup(207, obj);
        function2.invoke(composer, Integer.valueOf((i2 >> 3) & 14));
        composer.endReusableGroup();
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final void ReusableContentHost(boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2) {
        composer.startReusableGroup(207, Boolean.valueOf(z2));
        boolean zChanged = composer.changed(z2);
        composer.startReplaceGroup(-869707859);
        ComposerKt.sourceInformation(composer, "175@6712L9");
        if (z2) {
            int i3 = i2 >> 3;
            function2.invoke(composer, Integer.valueOf((i3 + 14) - (i3 | 14)));
        } else {
            composer.deactivateToEndGroup(zChanged);
        }
        composer.endReplaceGroup();
        composer.endReusableGroup();
    }

    public static final Composer getCurrentComposer(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -554250212, "C:Composables.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554250212, i2, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:187)");
        }
        throw new NotImplementedError("Implemented as an intrinsic");
    }

    public static final RecomposeScope getCurrentRecomposeScope(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 394957799, "C:Composables.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394957799, i2, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:196)");
        }
        RecomposeScope recomposeScope = composer.getRecomposeScope();
        if (recomposeScope == null) {
            throw new IllegalStateException("no recompose scope found".toString());
        }
        composer.recordUsed(recomposeScope);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return recomposeScope;
    }

    public static final CompositionLocalContext getCurrentCompositionLocalContext(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -43352356, "C:Composables.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-43352356, i2, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:211)");
        }
        CompositionLocalContext compositionLocalContext = new CompositionLocalContext(composer.buildContext().getCompositionLocalScope$runtime_release());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return compositionLocalContext;
    }

    public static final int getCurrentCompositeKeyHash(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(524444915, i2, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:228)");
        }
        int compoundKeyHash = composer.getCompoundKeyHash();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compoundKeyHash;
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1886828752, "CC(ComposeNode):Composables.kt#9igjgp");
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m3670boximpl(Updater.m3671constructorimpl(composer)));
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m3670boximpl(Updater.m3671constructorimpl(composer)));
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -548224868, "CC(ComposeNode)P(1,2)336@12596L9:Composables.kt#9igjgp");
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m3670boximpl(Updater.m3671constructorimpl(composer)));
        int i3 = i2 >> 6;
        function2.invoke(composer, Integer.valueOf((i3 + 14) - (i3 | 14)));
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m3670boximpl(Updater.m3671constructorimpl(composer)));
        int i3 = i2 >> 6;
        function2.invoke(composer, Integer.valueOf((i3 + 14) - (i3 | 14)));
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Function3<? super SkippableUpdater<T>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2) {
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m3670boximpl(Updater.m3671constructorimpl(composer)));
        function3.invoke(SkippableUpdater.m3662boximpl(SkippableUpdater.m3663constructorimpl(composer)), composer, Integer.valueOf((i2 >> 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
        composer.startReplaceableGroup(2058660585);
        function2.invoke(composer, Integer.valueOf((i2 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Function3<? super SkippableUpdater<T>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2) {
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m3670boximpl(Updater.m3671constructorimpl(composer)));
        function3.invoke(SkippableUpdater.m3662boximpl(SkippableUpdater.m3663constructorimpl(composer)), composer, Integer.valueOf((-1) - (((-1) - (i2 >> 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))));
        composer.startReplaceableGroup(2058660585);
        function2.invoke(composer, Integer.valueOf((-1) - (((-1) - (i2 >> 9)) | ((-1) - 14))));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    public static final CompositionContext rememberCompositionContext(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1165786124, "C(rememberCompositionContext):Composables.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1165786124, i2, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:484)");
        }
        CompositionContext compositionContextBuildContext = composer.buildContext();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return compositionContextBuildContext;
    }
}
