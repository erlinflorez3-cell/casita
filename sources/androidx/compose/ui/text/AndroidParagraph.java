package androidx.compose.ui.text;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary_androidKt;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: compiled from: AndroidParagraph.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яē\u0015D57\u001eq\u007fZDkŞ\fA\u0014<\u0013ǞJ~8,\u001aՄ\u000ffxW8D{H6Ri*\u0017ӆ\u00044:[,ڎK;c \u0006̝\u0011O\\poñRZ!C\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:Bu?;M\u0006=A`z6\r @-@y\u000b\u000b\"*V\u0015~zIP\u0014\u0012F@x:X\u0016U\u00050\u0012\u000e>&\u0002&\\}N>Hr_B/9\u0003qBT.g0\u0013M\u0015FZ*\u0015vo\u001e3¨?5+%[Έ\u000fRiQ\u000b?w?\rh='3Iyn>X\u0016\u0014\u001d+U\u000fer<\\\rQf\u000f/+ecSִ\u0016(\u000ez\u0004\rB\n\u0016\u0006=H6Ʀ\"f\u001e\u000e;txSHP\u0018^Jȕ\u0003aL\u0017-Į;+O\u001bnϟi;/N?{\u000b\u000e&#\u0017n)[Z\u0011h\u0015)c\u007fQGQH=NN\u0012YSm\f͏j\u0002@\u00048Ϛ\u0006\u07fc\u0012߾^\u0017S6\u001c\u001f)5{\u0006VD\u007fv3axWwT`@Pq&G8\r$fTl\u0015q`Vh,?TJZ5\u0003\u0018#.d\u0010H1- T_jyj{f8+]kG]|u&WgiC9_o(a\u0001\u0004$CJp\u001dX\u0015Qc\u0010hl@\"`Yz\u0014\u0006\u000e\\N:&\u0558Cq*HlT)`#]\u001b\u001epW\r\rmd\u0001\u0010-_C(\u0011u<t7\u000e``~}\u007fxw;ʬd\";X\u001a}'om\"\u0017b-'\u0015I\f\u007fur|KZ8.u\u0004\u0007P\u001c(\u0006i1S\u0012=LY6\u00107]L!p\u0002Q u\u0013|(\u001akl<7 j\u001f7\u0011nX l\u0017P\u0002\u000fv1Y|\u007f(l\rz\u0010\u000eb]s>wF3]J#P|3tN)\u000fF:|c\u0005s-#\u0015\u0006lG\u0015\u0010h0\u0004ѼxʬϪ*vk]:>^}p-u2i\u0015y]\r\u001c:$\u001b\u000e\t\\3\u0006\u0016!!4;mxErNn8{\u0016u\u0012/\u0015:l\tV\ntCs\f\u0012F_X~\n\u0012\\tQ\u0006)M\u0002\u000e\u001eqY:#J=\u0015;\u007f?P*\u001ck-\u001dk+\u001c>h\f\u0018dgkf\u0013 !$b7\u0003ފդGTojX\t\u000e,w\u000fEXrwI:&T'g\u001d\\MnSG9*/%?7,\\M13x\rhwv@hk\u001d7A\u001bS\rJ=+r_\u007fЉϜ\\\u0001\u0011.&YWkN\u0004u4\u001eo}oP\u0018+(r\u001c)$i\u0011\u000e\u0004vrScr:|v@q\u0003R0\u0007\u0017z+\u0019\u0003\u001eW\u0019'<\u000bo\u00118|R\u0006%[\u001a/=\u000b=O\u001a\u000bR^\u001b[,e1K-\u0003\u0014U\u0007\u001eg\u0004\f\u0016\u00108'2\u001bQ`eq~\n\f&\u0001*:$pr!\u0013~F42XX\u000b\n\\\u0013|cJA\u0010\u0005vY\u001a\u0003QD5\u000f\u0005\u0006pV/\rRqzV\u0007U9)\u00175d]\u0007-~(O;\u0016<!Lr:?yP\\\u001fc,\u0015T*|\u001c+A\u001eD{h\u001fv\u007f_\u001b!GkXXwD\u07b5\u001dݙψ}w\n\"b!]IdGVd79\u001dFekvjVo; q*\u000by`^?\u000fdJ\u0001\u001b|/e$O_\u001bEx\u00072P\u0010:ia`̉\u001aO29EX{\u001fܝ9zt.dr\u000f\u0001ψfD.t«<J-gރl|\u0004TɚD~V߃+ֶã\u00153`߇\u001fLі\u0019dY_ߋ@1\u0011/jh\n}d15\u0019\\\u001a9\u07b2\u007f{Վ\fׄƺ5o@ݳ6\u0001ܗ.W~)ʼeS%cr|+\u001ae}J-X*jWr:ކ4]\u001e()p\u0006\u0018ٸ#<\u0007$\u008d~\f1\u0011\tmД?ns\u0006WV0DˢC;H\u001bԼr:2wѲr|\\\u0010Ż@+\u0019'ܤ=B-\u001b-uUvݲ\n\\\u0010[\u0013eʨ\u0005Y;%ϙ\u000fgtV*wײL_dkځ\u0012\f\u0007P1\u0010֤xwFgػ\u0005E\u0013\u0003ķi1\u0002͢^ݐ١\u0016\u0011\u0013\u0558v?؋_H +Ȏ&cvt\n\r~[ڷa#A=Ī]^H\u001aƢ\u0005./vǤ\u0001.Rnś\u0012KJ\n@u̜U,)+ǣZ=\t;f\u0019߅>\u001c\u0006ڢ<غߵ\u000fqP֎4sۄ\u0004\u001evYߊ*-\u007f\u0019~^MdÛ\u0019BY4ڕD\u0015N\u001eͧw\\)\u001cԅ/`X\r߳Bu\u00042\u001ek։\u0014\u0016\u0007@Ĥ6sg'*eǰm\u0003]1١w\u001a\u0006&@GҒ\nNYG߀\"\f\u000e_ğzNpǬTޮ̚M\u0014\t˒I/Ǵ\u0005\bJOپknoO\u001cg@-ǰ\u001f=#4ڄ#\u000bgA\u0018T\"ό\u0007MD̫(\u0011eg̛eZj=\b\u001d\r\\ۧ7\u0006\u0010Kۦ\u0010z!E;eAZɒoOG \u0005\nB}o\u0015\u000e\u0010Ʋ\u001cΐw֟B=y±sQe.|ltZD3eC\u0011*\u0010(5&\u0010\u000bǔ(ܦƵTbݺn{\\`\u001fyLm6\u0003\b\u00127vL\u0005V<vyO;&ʞ\u001dэHf!bvjO33{:3NH\u0019&ʑ\u0005Qi߫,9J\u001b1\u000b\u0004L0\u0007:S\fK}\u001f\\\u0098l˧{\u0019\u0014_9]\u001b\u0018|\u000f#.Vf!*#Y$ܑ\u0006β36^\\FF;\u0003w\u007fv3B\u000e:#;\u0001E֞Tަy#\u000bf\u0005O,B\u0012cGt9\u00131G\u0013\u03834ï\\zvˉ-7<+\u001e\u001f@M2\nC͡uڥ7[\nQ:\u000e,ZN{\u0006R%k@*\u001a\u001fyԒkϔ\u0015aFO}:gd*P\u0010\u0014:)R\u0013Ɯ+\bPϵb4(W\u000f@\u0007*X\u001c\u0007xS/\u001c`\u0006܉w˗6qVul\u0014u\\\u0012Lcr\u0017E[Eʺ\fQQԄ\u0017-MEWN\u000biZ'\u000ecMX&4\u001dn2k>x7݊DǏ{\u000ejԕ\u0004<\u0002\u0003\u0011P;c<Wrf\u001d+-\u000f8Ч?Ԍ\u0011\u001e\u0015@yh1[=af(\u000e|Y\t+yiE\u0013NzO~Б4ӟ\u0016\u0019XZlR)\u001d\u001dMj_$\u007f\u0016\u000bN\u0013-[2\u000e\u001a&xڀJ̉,3\"y\u001c~+(\u00819\u0016{Sdک\u0004\r\b]#\u0014FӴSɖp"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iEu2?]|\u000b3z\u00120Z?Fn\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:C", "BdgA", "", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "AoP;F;RZ\u0019\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9{Gr.#h\u0012'7C", ">kP0X/HZ\u0018~\bl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", ";`g\u0019\\5>a", "", "3k[6c:Ba", "", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\rJkG-^WaL\u0016Q;b}'\u001d3S(mN<M#\u0016aW5/\u001b\u0014/()jU3h\u0018;M\t\u0005O\u0005\u001a%c\u0019_U)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUn\u001doI\u0004%\u001ez(dIZ7\u0019\\O\u0019vY\u000e&TG'\u0005?5>z1-AxTI~+\u001e^Eu\u001c:c~9tv\u00148sFm\tZ1v>g\u0007\u0019;p\u0017\u000e,@K\u001aCT-z}FWl(p\b\u001bk18bDedD\u001f\u000elte>on\u000eGP\u0015HVW\u00114L~O1=\u0006", ">`a.Z9:^\u001cb\u0004m9\u0001\u0012=i}6", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0019Cr46c\u000b(\u0001I\u001f-ZM?j\u001f\u001a\"dcF\u0003n/2\u007f6TPW:`P\u0001\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~WG}!DZ\b-?7q7LPEo3\t\u0011u];\u0014_7QZ0VYR5jVpKiuOr51\u0017\u0014`E-8IH'Q0R\u0011;u\n\b\u001dW\u0014jq>f\u0017VW\u001f~O8uVWn\u0004T)Ao0d\u00195`M", "1gP?F,Jc\u0019\bx^", "", "5dc\u0010[(KA\u0019\u000b\u000b^5z\tmu\u0004\"\u000b@\u0014&\u0011To\u0015<r35\u0018y)@w%*\\GEtB", "u(E", "5dc\u0010[(KA\u0019\u000b\u000b^5z\tmu\u0004\"\u000b@\u0014&\u0011To\u0015<r35", "u(;7T=:\u001d z\u0004`uZ\f+rm(\bP\u0001 \u0015GE", "5dc\u0010b5Lb&z~g;\u000bP7s_\rw\u001f\u0007", "u(9", "\u0018", "2hS\u0012k*>S\u0018fvq\u0013\u0001\u0012/s", "5dc\u0011\\+\u001ef\u0017~z]\u0014x\u001c\u0016i\t(\n", "u(I", "5dc\u0012_3B^'\u0003\t", "4ha@g\t:a\u0019\u0006~g,", "", "5dc\u0013\\9Lbuz\t^3\u0001\u0012/", "u(5", "6dX4[;", "5dc\u0015X0@V(", ":`bA5(LS \u0003\u0004^", "5dc\u0019T:M0\u0015\rze0\u0006\t", ":`h<h;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i&m)=4?OuD-j", ":h]266N\\(", "5dc\u0019\\5>1#\u000f\u0004m", "u(8", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "5dc\u001aT?\"\\(\f~g:\u0001\u0007!i~7~", "5dc\u001aT?%W\"~\t", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "5dc\u001a\\5\"\\(\f~g:\u0001\u0007!i~7~", "5dc\u001dT9:U&z\u0006a\u0010\u0006\u0018<i\t6\u007f>\u000f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u0002,1h~*Du_\nVBHu8\u001d\u007fdn5\tp(Yy\u000bP[[0e`v;\"g", ">kP0X/HZ\u0018~\bK,z\u0018=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "5dc\u001d_(<S\u001c\t\u0002],\nu/c\u000f6", "u(;7T=:\u001d)\u000e~euc\r=tU", "BdgA?6<O ~", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "5dc!X?M:#|ve,;\u00193_\u000f(\u000fOz$\u0017No\nJvc1b\u0007*Fi%2WLI", "5dc!X?M:#|ve,;\u00193_\u000f(\u000fOz$\u0017No\nJv", "u(;7T=:\u001d)\u000e~euc\u0013-a\u0007(Q", "BdgAC(B\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0019Cr46c\u000b(\u0001I\u001f-ZM?j#\u001e(wL5\u000bl;$", "5dc!X?M>\u0015\u0003\u0004mj\r\r)t\u007f;\u000b:\u000e\u0017\u001eGk\u001c<5!>b\b/3|\u001a8VQ", "5dc!X?M>\u0015\u0003\u0004mj\r\r)t\u007f;\u000b:\u000e\u0017\u001eGk\u001c<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u0002,1h~*Du_\nVBHu8\u001d\u0004htHq_0W\u0006|", "EhSA[", "5dc$\\+MV", "1n]@g9NQ(mzq;c\u0005Co\u00107", "/kX4a4>\\(", "8tbA\\-BQ\u0015\u000e~h5d\u0013.e", "3k[6c:Bh\u0019", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0018\u000bD\b%U6|\u001eEt!DYY/\r", "6x_5X5L", "0qT.^\u001aM`\u0015\u000ez`@", ":h]259>O\u001fl\nr3|", ":h]259>O\u001fp\u0005k+j\u0018Cl\u007f", "4h[956N\\\u0018\u0003\u0004`\t\u0007\u001c/s", "", "@`]4X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "/qa.l", "", "/qa.l\u001aMO&\u000e", "4h[956N\\\u0018\u0003\u0004`\t\u0007\u001c/sGz|A\u0006ga3", "uIJ\u0013<o/", "5dc\u000f\\+B@)\bYb9|\u0007>i\n1", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#j Ew\u001d?MB*kG-sln9\u0005r0X\u007f|", "=eU@X;", "5dc\u000fb<GR\u001d\b|;6\u0010", "5dc\u0010h9L]&kz\\;", "5dc\u0015b9Bh#\b\nZ3g\u0013=i\u000f,\u0006I", "CrT\u001de0FO&\u0013Yb9|\u0007>i\n1", "5dc\u0019\\5>/'|zg;", ":h]2<5=S,", "5dc\u0019\\5>/'|zg;;\u00193_\u000f(\u000fOz$\u0017No\nJv", "5dc\u0019\\5>0\u0015\rze0\u0006\t", "5dc\u0019\\5>0#\u000e\nh4", "5dc\u0019\\5>2\u0019\rx^5\f", "5dc\u0019\\5>2\u0019\rx^5\fG?iy7{S\u0010\u0011$Gv\u000e8\u0005%", "5dc\u0019\\5>3\"}", "Dhb6U3>3\"}", "5dc\u0019\\5>4#\fd_-\u000b\t>", "5dc\u0019\\5>4#\fk^9\f\r-a\u0007\u0013\u0006N\u0005&\u001bQx", "DdaA\\*:Z", "5dc\u0019\\5>6\u0019\u0003|a;", "5dc\u0019\\5>:\u0019\u007f\n", "5dc\u0019\\5>@\u001d\u0001}m", "5dc\u0019\\5>A(z\bm", "5dc\u0019\\5>B#\n", "5dc\u0019\\5>E\u001d}\na", "5dc\u001cY-LS(_\u0005k\u0017\u0007\u00173t\u00042\u0005", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5dc\u001cY-LS(_\u0005k\u0017\u0007\u00173t\u00042\u0005\b\u0007^eN[X$", "uI\u0018\u0016", "5dc\u001dT9:U&z\u0006a\u000b\u0001\u0016/c\u000f,\u0006I", "5dc\u001dT;A4#\fgZ5~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "AsP?g", "3mS", "5dc\u001fT5@Sy\t\bK,z\u0018", "@dRA", "5qP;h3:`\u001d\u000e\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u0017fy)Gt\u0012;QROA", "7mR9h:B]\"l\nk(\f\t1y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u0019b{'G{\u001a8V1Jx0-\u0015ju\u000f", "5dc\u001fT5@Sy\t\bK,z\u0018v8GxXH\\z", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFCy\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011\\RukR\u0006L]\u0001Z!]\u000f\u0016\u0003`Q2rN@\r\u00179E\u0011;j\u0015aYr", "5dc$b9=0#\u000f\u0004](\n\u001d", "5dc$b9=0#\u000f\u0004](\n\u001dv-\u0005;M%a%", "uH\u0018\u0017", "7r;6a,\u001eZ \u0003\u0006l0\u0012\t.", ">`X;g", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "/k_5T", "AgP1b>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001fA\u007fk", "BdgA7,<]&z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t.KMHgC\"\u001fq7", "2qPDF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003wu@\u00079", "0kT;W\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", ">`X;gsA\\hmZq.", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7y)Hi$\u00044?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\ti\u0012iO'D%\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYW}^wN%sI]]\b\u0011/H^)n\u001e5\u0004XC91\u001eu\u0018.2N8\u0012\u0007]\u001fr\u001c\nk1V\u0019\u000eGmL|oME9D<\b6}Ky\u0002\u001f.gx5}\u0003j035q\u000fOf+\b\\\u0003\u001d7fO'oF@\\AX_\u0001oB\fvh`\u0015\ntC/#pe-'\u001c\u0003o\u0005jIh_V\u001b\u0016v", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", ">`X;gs+>!rZd2", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7y)Hi$\u00042*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001ctJ\u0010\u001d]\u0012L9Vr\\=#xV\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\n\u0019?P){U#m\t[HE,\u0019d\u001fn{\\8D1\u0010\u0001\u001d%q&qz", ">`X;gs%5hKN<\u0010", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7y)Hi$\u00042*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001ctJ\u0010\u001d]\u0012L9Vr\\=#xV\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\n\u0019?P){U#m\t[HE,\u0019d\u001fn{\\8D1\u0010\u0001\u001d%q&\u0015\u0006\u0005R\u001e|Vxz1E#\u0003C.Lm%VI9WIp2\"Oy\u0006[1ep=\u0003+\u000e?*\u007fC\u0012Gy\u0006Mr\u007f\u0015\u0002@\u0005\u0018", "5dc [(=S&[\bn:\u007fv:a\t6", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0019Cr46c\u000b(\u0001{%BTC\u0005Y7\u001a\u0014hn\u0016\u0014s:Qd2CU$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W8\u007f$Bc\u0002\u001f\u0001\\\u0016A\\*7\u007f>.$>%/m_5M\u00041KKauZ\\zH\u001e ZW^/V\u0014YT38O>\u001b\u0017-S\u000fC2\u000f\u001b*\u001554^ER\u000fG\u0007q\u0003Q7k4d[\u0003\u001d", "6`b c(G", "\u001a`]1e6BRb\u000ezq;Fv:a\t1{?V", "1kPGm", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidParagraph implements Paragraph {
    public static final int $stable = 8;
    private final CharSequence charSequence;
    private final long constraints;
    private final boolean ellipsis;
    private final TextLayout layout;
    private final int maxLines;
    private final AndroidParagraphIntrinsics paragraphIntrinsics;
    private final List<Rect> placeholderRects;

    /* JADX INFO: compiled from: AndroidParagraph.android.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            try {
                iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i2, boolean z2, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(androidParagraphIntrinsics, i2, z2, j2);
    }

    public /* synthetic */ AndroidParagraph(String str, TextStyle textStyle, List list, List list2, int i2, boolean z2, long j2, FontFamily.Resolver resolver, Density density, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, list, list2, i2, z2, j2, resolver, density);
    }

    public static /* synthetic */ void getCharSequence$ui_text_release$annotations() {
    }

    public static /* synthetic */ void getTextLocale$ui_text_release$annotations() {
    }

    public static /* synthetic */ void getTextPaint$ui_text_release$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i2, boolean z2, long j2) {
        CharSequence charSequence$ui_text_release;
        ArrayList arrayListEmptyList;
        Rect rect;
        float horizontalPosition;
        float heightPx;
        float lineBaseline;
        float lineBaseline2;
        float lineBottom;
        int heightPx2;
        this.paragraphIntrinsics = androidParagraphIntrinsics;
        this.maxLines = i2;
        this.ellipsis = z2;
        this.constraints = j2;
        if (Constraints.m6592getMinHeightimpl(j2) == 0 && Constraints.m6593getMinWidthimpl(j2) == 0) {
            if (i2 < 1) {
                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
            }
            TextStyle style = androidParagraphIntrinsics.getStyle();
            if (AndroidParagraph_androidKt.shouldAttachIndentationFixSpan(style, z2)) {
                charSequence$ui_text_release = AndroidParagraph_androidKt.attachIndentationFixSpan(androidParagraphIntrinsics.getCharSequence$ui_text_release());
            } else {
                charSequence$ui_text_release = androidParagraphIntrinsics.getCharSequence$ui_text_release();
            }
            this.charSequence = charSequence$ui_text_release;
            int iM5968toLayoutAlignaXe7zB0 = AndroidParagraph_androidKt.m5968toLayoutAlignaXe7zB0(style.m6164getTextAligne0LSkKk());
            boolean zM6523equalsimpl0 = TextAlign.m6523equalsimpl0(style.m6164getTextAligne0LSkKk(), TextAlign.Companion.m6529getJustifye0LSkKk());
            int iM5970toLayoutHyphenationFrequency3fSNIE = AndroidParagraph_androidKt.m5970toLayoutHyphenationFrequency3fSNIE(style.getParagraphStyle$ui_text_release().m6024getHyphensvmbZdU8());
            int iM5969toLayoutBreakStrategyxImikfE = AndroidParagraph_androidKt.m5969toLayoutBreakStrategyxImikfE(LineBreak.m6447getStrategyfcGXIks(style.m6161getLineBreakrAG3T2k()));
            int iM5971toLayoutLineBreakStylehpcqdu8 = AndroidParagraph_androidKt.m5971toLayoutLineBreakStylehpcqdu8(LineBreak.m6448getStrictnessusljTpc(style.m6161getLineBreakrAG3T2k()));
            int iM5972toLayoutLineBreakWordStylewPN0Rpw = AndroidParagraph_androidKt.m5972toLayoutLineBreakWordStylewPN0Rpw(LineBreak.m6449getWordBreakjp8hJ3c(style.m6161getLineBreakrAG3T2k()));
            TextUtils.TruncateAt truncateAt = z2 ? TextUtils.TruncateAt.END : null;
            TextLayout textLayoutConstructTextLayout = constructTextLayout(iM5968toLayoutAlignaXe7zB0, zM6523equalsimpl0 ? 1 : 0, truncateAt, i2, iM5970toLayoutHyphenationFrequency3fSNIE, iM5969toLayoutBreakStrategyxImikfE, iM5971toLayoutLineBreakStylehpcqdu8, iM5972toLayoutLineBreakWordStylewPN0Rpw);
            if (z2 && textLayoutConstructTextLayout.getHeight() > Constraints.m6590getMaxHeightimpl(j2) && i2 > 1) {
                int iNumberOfLinesThatFitMaxHeight = AndroidParagraph_androidKt.numberOfLinesThatFitMaxHeight(textLayoutConstructTextLayout, Constraints.m6590getMaxHeightimpl(j2));
                if (iNumberOfLinesThatFitMaxHeight >= 0 && iNumberOfLinesThatFitMaxHeight != i2) {
                    textLayoutConstructTextLayout = constructTextLayout(iM5968toLayoutAlignaXe7zB0, zM6523equalsimpl0 ? 1 : 0, truncateAt, RangesKt.coerceAtLeast(iNumberOfLinesThatFitMaxHeight, 1), iM5970toLayoutHyphenationFrequency3fSNIE, iM5969toLayoutBreakStrategyxImikfE, iM5971toLayoutLineBreakStylehpcqdu8, iM5972toLayoutLineBreakWordStylewPN0Rpw);
                }
                this.layout = textLayoutConstructTextLayout;
            } else {
                this.layout = textLayoutConstructTextLayout;
            }
            getTextPaint$ui_text_release().m6390setBrush12SF9DM(style.getBrush(), SizeKt.Size(getWidth(), getHeight()), style.getAlpha());
            ShaderBrushSpan[] shaderBrushSpans = getShaderBrushSpans(this.layout);
            if (shaderBrushSpans != null) {
                Iterator it = ArrayIteratorKt.iterator(shaderBrushSpans);
                while (it.hasNext()) {
                    ((ShaderBrushSpan) it.next()).m6410setSizeuvyYCjk(SizeKt.Size(getWidth(), getHeight()));
                }
            }
            CharSequence charSequence = this.charSequence;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                Object[] spans = spanned.getSpans(0, charSequence.length(), PlaceholderSpan.class);
                ArrayList arrayList = new ArrayList(spans.length);
                for (Object obj : spans) {
                    PlaceholderSpan placeholderSpan = (PlaceholderSpan) obj;
                    int spanStart = spanned.getSpanStart(placeholderSpan);
                    int spanEnd = spanned.getSpanEnd(placeholderSpan);
                    int lineForOffset = this.layout.getLineForOffset(spanStart);
                    byte b2 = lineForOffset >= this.maxLines;
                    byte b3 = this.layout.getLineEllipsisCount(lineForOffset) > 0 && spanEnd > this.layout.getLineEllipsisOffset(lineForOffset);
                    byte b4 = spanEnd > this.layout.getLineEnd(lineForOffset);
                    if (b3 == false && b4 == false && b2 == false) {
                        int i3 = WhenMappings.$EnumSwitchMapping$0[getBidiRunDirection(spanStart).ordinal()];
                        if (i3 == 1) {
                            horizontalPosition = getHorizontalPosition(spanStart, true);
                        } else if (i3 == 2) {
                            horizontalPosition = getHorizontalPosition(spanStart, true) - placeholderSpan.getWidthPx();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        float widthPx = placeholderSpan.getWidthPx() + horizontalPosition;
                        TextLayout textLayout = this.layout;
                        switch (placeholderSpan.getVerticalAlign()) {
                            case 0:
                                lineBottom = textLayout.getLineBaseline(lineForOffset);
                                heightPx2 = placeholderSpan.getHeightPx();
                                lineBaseline2 = lineBottom - heightPx2;
                                rect = new Rect(horizontalPosition, lineBaseline2, widthPx, placeholderSpan.getHeightPx() + lineBaseline2);
                                break;
                            case 1:
                                lineBaseline2 = textLayout.getLineTop(lineForOffset);
                                rect = new Rect(horizontalPosition, lineBaseline2, widthPx, placeholderSpan.getHeightPx() + lineBaseline2);
                                break;
                            case 2:
                                lineBottom = textLayout.getLineBottom(lineForOffset);
                                heightPx2 = placeholderSpan.getHeightPx();
                                lineBaseline2 = lineBottom - heightPx2;
                                rect = new Rect(horizontalPosition, lineBaseline2, widthPx, placeholderSpan.getHeightPx() + lineBaseline2);
                                break;
                            case 3:
                                lineBaseline2 = ((textLayout.getLineTop(lineForOffset) + textLayout.getLineBottom(lineForOffset)) - placeholderSpan.getHeightPx()) / 2;
                                rect = new Rect(horizontalPosition, lineBaseline2, widthPx, placeholderSpan.getHeightPx() + lineBaseline2);
                                break;
                            case 4:
                                heightPx = placeholderSpan.getFontMetrics().ascent;
                                lineBaseline = textLayout.getLineBaseline(lineForOffset);
                                lineBaseline2 = heightPx + lineBaseline;
                                rect = new Rect(horizontalPosition, lineBaseline2, widthPx, placeholderSpan.getHeightPx() + lineBaseline2);
                                break;
                            case 5:
                                lineBaseline2 = (placeholderSpan.getFontMetrics().descent + textLayout.getLineBaseline(lineForOffset)) - placeholderSpan.getHeightPx();
                                rect = new Rect(horizontalPosition, lineBaseline2, widthPx, placeholderSpan.getHeightPx() + lineBaseline2);
                                break;
                            case 6:
                                Paint.FontMetricsInt fontMetrics = placeholderSpan.getFontMetrics();
                                heightPx = ((fontMetrics.ascent + fontMetrics.descent) - placeholderSpan.getHeightPx()) / 2;
                                lineBaseline = textLayout.getLineBaseline(lineForOffset);
                                lineBaseline2 = heightPx + lineBaseline;
                                rect = new Rect(horizontalPosition, lineBaseline2, widthPx, placeholderSpan.getHeightPx() + lineBaseline2);
                                break;
                            default:
                                throw new IllegalStateException("unexpected verticalAlignment");
                        }
                    } else {
                        rect = null;
                    }
                    arrayList.add(rect);
                }
                arrayListEmptyList = arrayList;
            } else {
                arrayListEmptyList = CollectionsKt.emptyList();
            }
            this.placeholderRects = arrayListEmptyList;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final boolean getEllipsis() {
        return this.ellipsis;
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m5955getConstraintsmsEJaDk() {
        return this.constraints;
    }

    private AndroidParagraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i2, boolean z2, long j2, FontFamily.Resolver resolver, Density density) {
        this(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i2, z2, j2, null);
    }

    public final CharSequence getCharSequence$ui_text_release() {
        return this.charSequence;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return Constraints.m6591getMaxWidthimpl(this.constraints);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return this.layout.getHeight();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getFirstBaseline() {
        return getLineBaseline(0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLastBaseline() {
        return getLineBaseline(getLineCount() - 1);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    public final Locale getTextLocale$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release().getTextLocale();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForVerticalPosition(float f2) {
        return this.layout.getLineForVertical((int) f2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public int mo5956getOffsetForPositionk4lQ0M(long j2) {
        return this.layout.getOffsetForHorizontal(this.layout.getLineForVertical((int) Offset.m3938getYimpl(j2)), Offset.m3937getXimpl(j2));
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public long mo5957getRangeForRect86BmAI(Rect rect, int i2, final TextInclusionStrategy textInclusionStrategy) {
        int[] rangeForRect = this.layout.getRangeForRect(RectHelper_androidKt.toAndroidRectF(rect), AndroidParagraph_androidKt.m5973toLayoutTextGranularityduNsdkg(i2), new Function2<RectF, RectF, Boolean>() { // from class: androidx.compose.ui.text.AndroidParagraph$getRangeForRect$range$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Boolean invoke(RectF rectF, RectF rectF2) {
                return Boolean.valueOf(textInclusionStrategy.isIncluded(RectHelper_androidKt.toComposeRect(rectF), RectHelper_androidKt.toComposeRect(rectF2)));
            }
        });
        if (rangeForRect == null) {
            return TextRange.Companion.m6128getZerod9O1mEE();
        }
        return TextRangeKt.TextRange(rangeForRect[0], rangeForRect[1]);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect getBoundingBox(int i2) {
        if (i2 < 0 || i2 >= this.charSequence.length()) {
            throw new IllegalArgumentException(("offset(" + i2 + ") is out of bounds [0," + this.charSequence.length() + ')').toString());
        }
        RectF boundingBox = this.layout.getBoundingBox(i2);
        return new Rect(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public void mo5954fillBoundingBoxes8ffj60Q(long j2, float[] fArr, int i2) {
        this.layout.fillBoundingBoxes(TextRange.m6121getMinimpl(j2), TextRange.m6120getMaximpl(j2), fArr, i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Path getPathForRange(int i2, int i3) {
        if (i2 < 0 || i2 > i3 || i3 > this.charSequence.length()) {
            throw new IllegalArgumentException(("start(" + i2 + ") or end(" + i3 + ") is out of range [0.." + this.charSequence.length() + "], or start > end!").toString());
        }
        android.graphics.Path path = new android.graphics.Path();
        this.layout.getSelectionPath(i2, i3, path);
        return AndroidPath_androidKt.asComposePath(path);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect getCursorRect(int i2) {
        if (i2 < 0 || i2 > this.charSequence.length()) {
            throw new IllegalArgumentException(("offset(" + i2 + ") is out of bounds [0," + this.charSequence.length() + AbstractJsonLexerKt.END_LIST).toString());
        }
        float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.layout, i2, false, 2, null);
        int lineForOffset = this.layout.getLineForOffset(i2);
        return new Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default, this.layout.getLineBottom(lineForOffset));
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public long mo5958getWordBoundaryjx7JFs(int i2) {
        WordIterator wordIterator = this.layout.getWordIterator();
        return TextRangeKt.TextRange(WordBoundary_androidKt.getWordStart(wordIterator, i2), WordBoundary_androidKt.getWordEnd(wordIterator, i2));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineLeft(int i2) {
        return this.layout.getLineLeft(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineRight(int i2) {
        return this.layout.getLineRight(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineTop(int i2) {
        return this.layout.getLineTop(i2);
    }

    public final float getLineAscent$ui_text_release(int i2) {
        return this.layout.getLineAscent(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBaseline(int i2) {
        return this.layout.getLineBaseline(i2);
    }

    public final float getLineDescent$ui_text_release(int i2) {
        return this.layout.getLineDescent(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBottom(int i2) {
        return this.layout.getLineBottom(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineHeight(int i2) {
        return this.layout.getLineHeight(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineWidth(int i2) {
        return this.layout.getLineWidth(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineStart(int i2) {
        return this.layout.getLineStart(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineEnd(int i2, boolean z2) {
        return z2 ? this.layout.getLineVisibleEnd(i2) : this.layout.getLineEnd(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean isLineEllipsized(int i2) {
        return this.layout.isLineEllipsized(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForOffset(int i2) {
        return this.layout.getLineForOffset(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHorizontalPosition(int i2, boolean z2) {
        return z2 ? TextLayout.getPrimaryHorizontal$default(this.layout, i2, false, 2, null) : TextLayout.getSecondaryHorizontal$default(this.layout, i2, false, 2, null);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getParagraphDirection(int i2) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(i2)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getBidiRunDirection(int i2) {
        return this.layout.isRtlCharAt(i2) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    private final ShaderBrushSpan[] getShaderBrushSpans(TextLayout textLayout) {
        if (!(textLayout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = textLayout.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        if (!hasSpan((Spanned) text, ShaderBrushSpan.class)) {
            return null;
        }
        CharSequence text2 = textLayout.getText();
        Intrinsics.checkNotNull(text2, "null cannot be cast to non-null type android.text.Spanned");
        return (ShaderBrushSpan[]) ((Spanned) text2).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
    }

    private final boolean hasSpan(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-RPmYEkk, reason: not valid java name */
    public void mo5960paintRPmYEkk(Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration) {
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m6392setColor8_81llA(j2);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        paint(canvas);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-LG529CI, reason: not valid java name */
    public void mo5959paintLG529CI(Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        int iM6387getBlendMode0nO6VwU = getTextPaint$ui_text_release().m6387getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m6392setColor8_81llA(j2);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m6389setBlendModes9anfk8(i2);
        paint(canvas);
        getTextPaint$ui_text_release().m6389setBlendModes9anfk8(iM6387getBlendMode0nO6VwU);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-hn5TExg, reason: not valid java name */
    public void mo5961painthn5TExg(Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        int iM6387getBlendMode0nO6VwU = getTextPaint$ui_text_release().m6387getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m6390setBrush12SF9DM(brush, SizeKt.Size(getWidth(), getHeight()), f2);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m6389setBlendModes9anfk8(i2);
        paint(canvas);
        getTextPaint$ui_text_release().m6389setBlendModes9anfk8(iM6387getBlendMode0nO6VwU);
    }

    private final void paint(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    private final TextLayout constructTextLayout(int i2, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, int i6, int i7, int i8) {
        CharSequence charSequence = this.charSequence;
        float width = getWidth();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        return new TextLayout(charSequence, width, textPaint$ui_text_release, i2, truncateAt, this.paragraphIntrinsics.getTextDirectionHeuristic$ui_text_release(), 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.paragraphIntrinsics.getStyle()), true, i4, i6, i7, i8, i5, i3, null, null, this.paragraphIntrinsics.getLayoutIntrinsics$ui_text_release(), 196736, null);
    }
}
