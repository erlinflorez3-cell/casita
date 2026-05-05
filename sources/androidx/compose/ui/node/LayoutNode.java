package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
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
/* JADX INFO: compiled from: LayoutNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŕ\u0015D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aw\u001dfr9FDmHDR[ճ\u0017k\n=,Ӌ,qQA]\u001a\u0004\"\u0011OdgonP[\u0013C%\u0006\u001eюr,_U\u0001]\u0018\u000f:B\u0006?;ݹw=O`|6\u000b,:\"F\u0018\r\u00010*P\u0010|\nKK\"\u00128@v>Z\rc\u0005\"\u0012\f>(\u00014\\oN<^t]P/+\u0003\u007fBV'e3\u0005M#F\\܋\u0015vw\u001e3@=B\u001d%i\u0003\u000fRa?\u000b?\b=\rh--3I\nW>X\u0006\u0019\u001d+e\rer,c\rQv\f/+UdSP$(\u007fz\u0002\u000fD\u0004$\u0006/H4=\"f\u001e\u000e;txTHP\u0018^J\u007f\u0011a>\u00173\u007f;+?1nQw;!N=~\r\r4#\tn'b\\\u000en\u001a#T}\\9QNIPN\u0010]Em\u001apj̣2\u0004FG\b/\u0002\u00136\u0017;7cݽ+!\u0002\u0002PDmy\r`~SqR^@*Â\u001e7@\t\u0014ZJe\rkfT`\u008c\u0019M2T\u000f}\u000e\u0018(\\\u000e<)%\u0016cWh\u007fjU]\u0010k5ωMժ\rú\u000e\b9\r2eQ\u0012\u0010\u0012R%\u0015o<\u0011\u0007\tfpV<Z\u000b,R2voH}խDû\fȂ2Ǣq\\K<7\u001f\\#N\u001b\u001epH\r\u000feZv\u0018\u0017Ta-ғm$\u0003\u0013Iaj́n\u007fywً{\u0011';۴PM\u0019Tlhh|\u00151ɽ}\f\u0001uѽKwRz\u05f7tm|Nڽ\u0019\u007f֗ȠA\u0014\u0015ʙ(z\u0010;בK\u000bf\u007f̟\u0011mϕ܃}\u0010Aň-0\u0010xӞ+xkxךS]\"?p\u0001ت\u0007|\u0001(ՂE+MiT\u0019%VI!\f <\u0017F\u000bŮ\u001e6&/ȳ!CކԩG(#ʧv\\=#͇\\\u0002p\\ԘaUծ܌i\u00052і\u00158\u0007_ѕ1S9w˪}n(2Ҍ\u0002ZI\u0019Ρ\u0007r\u0011Bڶ2`Dzo\u0005ҍLQɀ̱j\b2߱o\u001f{Hޞn\u00165\\ʶ)$V\fұ][3!Ocg\u001cޮ[_\u001bK=А\n*ϸmXΙCh|eƾ\bH\u0007\"Ͱ5qTpǘ;!8D.L\b9Ldk\u0016\u0010)ĔVb\u001f\u0018`¶riۖ\r\u001b܆b\u001fo\u0013߸Dx\"Xܸ}?G,ب4I\u0014}Id0\u0012ӡ\u007fc \u0019\u001c\u0019ˢ}\u0015\u07bd*\u000bǵ?Ь,Y\u0007\u05caD&iWͺ6\u001cHWՎj \u001fFĉ{5P(\u001dIQ?t\u00073n\f\u0004͜M\u0013ʰ\u0011-śTĀ-\u007f\u0001Ն\u000e\u0005\u0012\u001dԨ\u0019gs\u001eܦ,\u0013b@HQג\u0001/N?\u0006:Ŷc/\u001eC\u0005\u0014ω=\u0010\u007f\\5\n\u0080SS\u0005\u0018#0(2Ȕ!\u000b}TzRd)Ŷ\u0016\n\u0016\u0011eO\u0013\u0019^\u0012̂J\rs8ی\u0007fU\u0010ֺ\u0002+_\bšwQF5ߩl\u001eCyУx:jrc|θ\u000b\u001bf_]*u3P+Ԥ'e.A_!ϐŇRݰǨ\u0015\u0004\u001aތ&-ߠ\b+g\u001e˩c\u0001q\u001aϿZ=1=տ*y2^݈\u001e.%\bǵ\u0004BUV\u05cb;\u0007TDd\u0017ϭlZW<e\u001b/jt\u001aÙ\u0014\u0015~veWӂ\u0383Eݱ۠h3=ش\u001fiƾG)&\u0012\u0018a'O݈Qo(Eس\n\b0\u0007\u0014\u0013;\u0011\u0084~Xл\t9φmǋ1GZً\u001aoy2ݾd\u001b'yՏ7r\r:\u05cf\u000e)/\tAPCjӤ\u001cSQa߿_ֆܗ\u00199\f˪\u0007a=xܪS=+/ϭ\u007fS?B?y¼sOsQ˼\u000e6ߦ˓j<+˽e\u00155\u001a֪eb\u007f{߇UUʨϕM6Kɪy\u001eN\u000eˊ\u001f<%4æ\"FӚ˜L+eЩ@\u001f\u0002eǋ&B7\u001d߇\"\u000e؝Րw\u000b2ʺ\u0018<riɊ4Y{BՄC\u0005Ϡ̘p\bKަhB\u0019RՠE,8=Ҡ(yٚϧ\u0014Pẇ+\u0012\u0004[Ҷ\\u=AƆ\u0003j9g6\bă@q*44Z\\qðj\u0006R\u000eވ7X\rU\"\u0006چRx\u007f\u000f$H1QvT֊\\\u0011PWa9ڨ\u000fjۋ\u07b4AԽƨ\n\u00174в\u0017J\fX¦\u0015+4uً@\u000ë\u0382\u007f\"#ǿ[m\u00143ڒj_@\u0004\u0085W\u0004غߵ\u000fnP֢5.j\u0013ȭ!ceYܚ~1ݜʜKWDЋ*!\u0014\u001cɀd`\u0011r҅CnҒԊ41VڻZ\fk\u000f¬\u001fUVCן}xďۼ_e\u0017Ӯ7 |`Ѯ#Ex0\f@F'Ә\n6Sg;k\u0001\u001bю>\u0014\b\u000bR\u0006\u0001{\u001a(\u0003\u0010Si=\u0014ݖ/YK\u001b_\u0016D'ک>\u0017\fN0l\u0013!۞b\u007f\u0013\u0018\u0017Rc\u0011\u001dNVWQ\u0014g\u001f߭B\u0003\u000f)}<3\u001aߩT\u001e=4\u001a+)CŢ_X,\\y9K];\u0014*\u0014x/\u0003gǲECuGGav\u001f͌Nw\u0014\u001dZ%eL݃W>@A\u000bJ!42\u0014HW9_~qޙj\fU\u000fتXdp>ڜy\u000bf\u0013G\u0014CJÕl1f}\u0007KVRу\txpvJVؠ܍0(<Ƹja\u0012\u000fʟa/\u0015eަuSlAك\"y\"\u0002ԥkG\u0013\u000e\u001cėa\u0010\u0016*ז2|!84\u000bй\u0005Vg!ĐkKMx\fyπ2^[n̰,!;6p\u0016ʚ\u000e$}3سm\u001af\u001a}-ʼd\u0017$Lמ@\u001eM\u0010/!҆\u0019T\t`ĄWAьˬ`&4¤\u0006g2Pܽ5\u0005B\"ں2\bv]͵]6),r(%\u001bݐ\u0012\u001ccx,\u0016قϔ\u0015^4ؐwOaJׁA\u001a\u000bPˮ#N\u0015o VъJJ\"Q\b?@\u001eJtýx=\f{\u000b]ܠuTٲœ=ӺՑah:»=\u001ek\rѾ-Gr6ߡH4Ț֖K\u000fOܗ:\u0018l{ؾ[UUD\u0089\u0006 \t?֢sx[p (\rp՚kR{u\fZӳץ2\u001b`ʳn5\u0005^ި\u0010U\u0017;ђ\u0004\u0005ثߑ'A+£`0\u0019I̝p58\u007fҔc;K\u0017(nՌ>*\u000fv_-ºܝ\u0006\u0006Q؉\u001a^hS\u009d@c\u0016\n¥f\u0014X(gV̈́(G\n&\u001df$\u00065Gϳsh^cn\u000f\u0010[#\u001c߰ng\b 7xϭʗ^!5٤\bVctɁP%B5ّ-'}x\u0017M˭\u0002BEP$\nȸ߅k\u0006<ʸ;&\u0018a͓z6o\nс&`\u0005\f!!֑\u001f.\u000eR\u000f0{a4]У\u0001XHA\u0013JJ4\b\"לed\u0005c\u0011\b\u05ccجWq\u001fߍw(uPӒ\r=\"Vԛ\u0017XfzƓo-(PǭY؊˗q\n\u0016ùIm\u0011;ٹv\u0013\u001b`Ի\u001f\u001c\u0010\b\u0018!Ѻ^\u0010\u0001Oϰ/vƹ֝QMsº.3vxň^(O C$~@>SΝ\u0010>Siӭa#Xoi6݀\u0017&\u001fM۲#xғɼ4\u001cbś}@\u000f`m*fDpEXnۉY/7dWˑ\u000bւa/,@_bTr_t\u0005_[\u0014tslySϏ=ې\b\u0006Sь\u0003.GZ\u0012'{6P\"XƩB6<΅\u000fٴT-\"\u05900J0LT\u001d\n/-¢gևv߹\b/NâC\u0017~EJKu[MA5\u0601|\u0378}/Xޗ\u0012Y|E2\u0017TO8ʲ/Ǌi\"$Ȕ8QW=-\u0015/l\u001ct1\u009aKp\u000bj\u0001ػ\u000eј(\u0014Jޘ\u0007\u0003Q\u0004V{,6$tPΟ\u0018@\u0005բdƋ.\u0016\u001aʏ\u001f9e\f|\u0013\u0010;4x$ߕ\u0004ÜM\u000b%()H\u00197z\u0015Zai3\u001bj}\u0014M͓\u000fش5A\u0002I6j\u0004\u0017N>@\u0011Xw!h\"Ǣ\u0004įnѴPǽ5D\nҋ`Nu\u001d>j*N\u0011d /RB$#)z7aBm\u000ebFnmDW%<\rl,\u0015ЎOłZ2\u001e8#\bx(D\u000fd\u0011+E'\u0014&|-c\u001c\f;$|˱,آ\u0004WKc\u0002\u0003a\u0014_`%^|:R\u0016/\u000bLݤ\u0003FAI&ۧ6҇<P\u0011HTro.~6(\u0011@\u000fDo\u001e`p\u0017WҪH٦?!\fVfh\u007f\u0011G\u00025\u0003\u00017D\u0014\"6Q}w^O6\u0016`Q sԱ\u001fٜ\u0006c5ȔK9M\r\u0016x^n\u000eb-z\n!u;F&\u0010mxP??\u00061\fd8x\u001c\u0003VN\u0003t|Ā3ڭBI&ɢ,8-@\u0019\u0014pf\b0XXe}^HO\u0012s}y*7ösޗ)bb\u000e\u0017f4qY<7,\u0005&#X\u001fh\u001a\nQ]^t\u000f7`ח]ќ\u0014\u0007\u0005¢L\u0018(\u001f \b6\u001dnhG\u00108aA~\u001c\u000e~YF\u008a=ёxwu˾p\u00168M,xZz\u000e6f\u001ci\u0014f;zL;a>FGǢPS`%Nу+߉$f\u0001\u0003{@g\u000ffp5AO]-\u0007&&\u001cŦIτQi8wXJ*u%~\u001d;\u0011TsE\u001bK\u0019ÆDΞz$$\u000eV8FT\u000bW\bz\u0005(s0GŽhψNNY\u0600a\u0006hP<~\u000fRt[Jφ\tڊ\u0017F/|\u0010F\u001b/\t!\u0003\r]Oo`OG\u0018zKޮ\u0003˱\u001f\u0017\u001c\u00165kj19\u00158N\u0002\fZ7zӚw̠S1)̯;n\u0012\u0011W|\u001b{f<8gW%4r_\t`rvKiBvm5\u0015\u001fѱ:գv\u0013+Ҙ\u0005\u001c\u001aJ^\rywl}s\u001aT\u000b!@\\db\f?\u000b\u0001Ϧ\u0019\u008bN\tU˴$S?\u000b$\u0014i\u0003*Ւ}ā2\u001azшJ\u0001\u0006\u0005D]fczL\u0006&\u0016TkT#Nd;<c!͛t½4\u007f-N\u0017.jmE!l0u\u001fU\u0015+\u000b>N\u0015p\u0014KkRfۃ,ΡH\u0014Uߠ0pQ%/}<\u0016\u0004bodEI\u0002fqڑCƼ6\u0004]*pT|%\u0015%\u0002\nV[\u0004sE\u0013\u03a2:j6H\u0018\u0013[\u0001?\u001f2y(T}9ME\u0001@ؼRM|\u000frUj\u0015\u001d_\u0003\"J\u0015-\u001ayvWԍ=Ҭ{\\~C{U\tyw\u001f9\u0001s\u000f)<\u001eɰ^Գ'4hӌce0Eu\u0012h\u001bFŕ\nȲ\f,P \u0019/T%3_\f%w|P\u0015\u0014a|M\u0001vLm9˹,ڨ\u000b\r.ݪ`$1\n;\tS&p+lz\u0018@\u007f\u001e#_`+=\u000fUB'ɪiĄKKOؗ| =zmck\u0014\u001a%:-`1[کnBvL4e\rlӺ Κu\u001a?S*˟1`\u001bM:Fǽ'\u001a\u0015s\u05fc\u001c\u001f\"Rۜ/Ϭ?A!\u0012T٣o\u0013ʛ^E\u0004\u0001с\u001ej\u000boi<=\u0018մ3\u05c8/VV\"xםC9\u0002\u0003^Qڰ\u001dG0WA?-\u0010۱eڟ\t}\u0010Zmָb9\u0010\u000f}Sɂ1Z\rA\t8מ))8G1\u0019\u0016/ֻ\u0015ԁ\u0003ZaDnڳA|Ƀ\u000f\u0002T\u001bÆO\u0003?Q?|ӠVw9ӎ,Gq3(;ƓV\u0016,Ġ/¢fS+ T'\u007fȚ\b1¬K;\u0003\u0010ݳA+ͧ\u0010LRWԜ_}Da̹?,/YЋa\u05cb@X\fX'Ɇ(A؍;phvɢ%]pSƘ*s\u0013MhF8aإCثiiEJ\u000fĿ(Gɱ\u0001\u001e\b\\ޘ\n\u001b#a\u001e2IBֳ=ǷInd6\u001c̨nbM\u0010\u001fvٿjN\u0005mȤ\u001d2n^K*,Z̾\u0011\\#^ɠUڮB\u007f8ʏr\u007fe̸\u0015DÑqd7aˑ\u0002\fʤEL^sƎl\u0014>yjJk#ɛ<Ω\r\u0014iXzЖ2\u000f|\"(I͌\u0015%CQjZ\u001e@ϐ=ŢvfOymΒ,\u0014};K\u0002ʵ\u0013iJ\tABA4\u001d\b\u0004A\u0011\u0010@V\u0019\"Ƽ-ղ\u0010O\u000fF\u000eǜ,:ԮN\u0019Z@̥\u0004eѕyem/ɉo8LD,fǖ:ƕ/ \u001aѐ\u0005@EǂN\u000eesMpə0?E@# ϗv\u001fXqߣ\u0005CɿEӵ)\u0010dٯ_{tȤ^9ܴc\u0010L\"ֳ>bprhV3\u0013ܿ\u0015a'\\!\u0007յSJTrĖK+ܖjסu\u0019>˻_sM۠\u0010Rɉ@u#!Ԃ:q٦e6]Sɨ\rCMY(;\u0018`ےLR*\u0004\u001akÐn&_wе\u0010Dю&ט\u007fd\u001bϐ0UGēTtܚx_)mʏ\u0012\"ʷ.\u0001\"-Վi\f+\u001c3*2iڅ@\u0097=?_l\u001b\u0081U\tnU$4\u0099\u001dB\t.NNֽkV=]\u0019l?X\bP־V5D\rʯ\u0004ǧxeeЊc\n+ĶD\u0010զb0\u000b\"ޝX\u000ft^0\u0018\u07b4\t\u0004jԩ9ؘo\u0002d5F˱d}ѹ\u0016LszˊdD*Vc<\u00051Y!ݽPҳTv1~eˡ&iދ{c\u0002\u0011۽RZn\rE_a/֍5Ѐ\u0015cuպ\u0010S^Ȁ*\f+,;,p:ڕOť^\u001f>}k\u009c(\u001a\u001f\u001eM5ȱ=''E6wܖ\u001aۃ\r]@ЉL]Xjzhv>=Ր\u0006َ\f|&Ö\u0015\u001c:đFp#\u00166\t֭\u00129o\u0005k}ۇXK(+\"#ߓ;$ǜ\u000fמm|9Ǽ \u00121ҢI\u0016ǽ\bq{Sܮj\u007fϾ;\"\u001d?څh$0?~rߒ\nݬ9A\u0004ұs!FҒ\u00013jvٕTB+<iH\u0011OΘ\r\u0013!%ÅBͮ\u00193FĒr^lƷ8\u0017ʆ\u001b[\u0013\u0006\u008eK\u000e\u0600dI|\u0010ɺJ_Y\u001c\u00140ְO͓(S]ɳWK\r͔P2>\u000ei\u0004^:ޜjǴ2\f\u001c\u0017;ݗz\t+\u001dG\u0018ȯs>\u001frֻ`CdEɖDārx\u001f\u001d\u0005\u0087h*ٌMYE\u0017ܷ\u0007U\t\\/\u0004p\"ڿi)7_\u0016͗aк\u0019b3=xՕw*Jjk\u0001ؐ*$#8yQ΅@i\u0001\u000bZ%ڎ ǖwe:ɫå{AO!\u000eڂf[\u000b֧GƇ\f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}\tAl\u0016\u0015QD;iH\u001c\u001ch?5\u000ej)Jt-\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c%=Yy.Gz\u00166MLJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%BG{*Bmk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u001bv\u00178#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9kF~0?g}\u0010;V -M\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9qE\u0006%Bc\t Di\u00135M!Es?(#hQ=om+NL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%B\u0018g)\u001ei*8]R\u0019u<)\u001chp9\u0006J0\\\u0006'PL[\u0002", "7rE6e;NO ", "", "Ad\\.a;BQ'by", "", "uY8uI", "-bW6_+KS\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "5dc,V/BZ\u0018\fzgj\r\r)r\u007f/{<\u000f\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006t/<`}\u001eFq 7\u0017+Kz0\u001b\u001chR9\u0005r6[L", "-b^9_(Ia\u0019}h^4x\u0012>i}6", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ\u0019u=\u001f\u0019jqF\u0003r0X\u007f|", "-e^9W,=1\u001c\u0003\u0002]9|\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uL\u0006!2`}\u00117k%8Z5?z7\u0006%w]H\u000bm5=\u0004#ERR5^(", "-e^9W,=>\u0015\fzg;", "-h];X9%O-~\b<6\u0007\u0016.i\t$\u000bJ\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", "-l^1\\-BS&", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "-t]3b3=S\u0018\\}b3{\u0016/n", "-yB<e;>Rv\u0002~e+\n\t8", "/kX4a4>\\(e~g,\u000bu/q\u0010,\t@\u007f", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/sl(\bP\u0005$\u0017F.\u001e@p25`}\u001cEm", "u(I", "/o_9l0GU\u0001\tyb-\u0001\t<O\t\u0004\u000bO|\u0015\u001a", "5dc\u000ec7Eg\u001d\b|F6{\r0i\u007f5eI\\&&Cm\u0011z\u0007)/f}'7i$.", "1`]\u001ah3MW\u0001~vl<\n\t", "5dc\u0010T5&c \u000e~F,x\u0017?r\u007ff\fDz$\u0017No\nJvc1b\u0007*Fi%2WLI", "u(E", "5dc\u0010T5&c \u000e~F,x\u0017?r\u007ff\fDz$\u0017No\nJv", "Adc\u0010T5&c \u000e~F,x\u0017?r\u007ff\fDz$\u0017No\nJv", "uY\u0018#", "1gX9W\u0013H]\u001fz}^({p/a\u000e8\t<}\u001e\u0017U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "5dc\u0010[0ER\u007f\t\u0005d(\u007f\t+dg(wN\u0011$\u0013Dv\u000eJ559S\u000b >m\u0012<M", "u(;7T=:\u001d)\u000e~euc\r=tU", "1gX9W\u0014>O'\u000f\bZ)\u0004\t=", "5dc\u0010[0ER\u0001~vl<\n\u0005,l\u007f6:P\u0005\u0011$Gv\u000e8\u0005%", "1gX9W9>\\", "5dc\u0010[0ER&~\u0004\u001d<\u0001\u0003<e\u0007(wN\u0001", "1n[9T7LS\u0018lzf(\u0006\u00183c\u000e", "5dc\u0010b3EO$\rz]\u001a|\u0011+n\u000f,yN?'\u001bA|\u000eCv!CY", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Gw\nE\u0006)3gG\u000e7u\u00127\\G9y\u0012(\u001eie;\u0017p(]z1P\"", "\nrTA \u0006\u0017", "1n\\=b:Bb\u0019dzr\u000fx\u00172", "5dc\u0010b4I]'\u0003\n^\u0012|\u001d\u0012a\u000e+:<\n !Vk\u001d@\u0001.C", "5dc\u0010b4I]'\u0003\n^\u0012|\u001d\u0012a\u000e+", "u(8", "Adc\u0010b4I]'\u0003\n^\u0012|\u001d\u0012a\u000e+", "uH\u0018#", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0015WA7r\u001c\u001a >", "1n\\=b:Bb\u001d\t\u0004E6z\u00056M{3", "5dc\u0010b4I]'\u0003\nb6\u0006o9c{/c<\f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.;|\u001a8V*Ei0%|dl\u000f", "Adc\u0010b4I]'\u0003\nb6\u0006o9c{/c<\f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 74M9g;\u0006\u0011s7|w", "1n^?W0GO(~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "5dc\u0010b6KR\u001d\bvm,\u000b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "2d]@\\;R", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "Adc\u0011X5LW(\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\r1\u0007", "2d_A[", "5dc\u0011X7MVW\u000f~X9|\u0010/a\u000e(", "Adc\u0011X7MVW\u000f~X9|\u0010/a\u000e(", "4n[1X+\u001cV\u001d\u0006yk,\u0006", "5dc\u0013b3=S\u0018\\}b3{\u0016/n>8\u007f:\u000e\u0017\u001eGk\u001c<", "6`b\u0013\\?>R|\b\u0004^9Z\u00138t\u007f1\u000b\u001e\u000b %V|\n@\u007f4C", "5dc\u0015T:\u001fW,~yB5\u0006\t<C\n1\u000b@\n&tQx\u001cK\u0004!9b\r.u}\u001a(ZCBk0,\u0015", "6dX4[;", "5dc\u0015X0@V(", "7f]<e,+S!~vl<\n\t\u001ce\f8{N\u0010%", "7m]2e\nH]&}~g(\f\u0013<", "5dc\u0016a5>`v\t\u0005k+\u0001\u0012+t\n5:P\u0005\u0011$Gv\u000e8\u0005%", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006_/4Y[*Az\u00152V?JuAs", "7m]2e\u0013:g\u0019\fXh6\n\b3n{7\u0006M", "5dc\u0016a5>`\u007fz\u000f^9Z\u00139r~,\u0005<\u0010!$", "7m]2e\u0013:g\u0019\fXh6\n\b3n{7\u0006Md%uK|\u001dP", "5dc\u0016a5>`\u007fz\u000f^9Z\u00139r~,\u0005<\u0010!$+}l@\u00044I\u0018\u000e$1z\u00165M?Ik", "Adc\u0016a5>`\u007fz\u000f^9Z\u00139r~,\u0005<\u0010!$+}l@\u00044I\u0018\u000e$1z\u00165M?Ik", "7mc2e6ID\u001d~\r?(z\u00189r\u0014\u000b\u0006G\u007f\u0017$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0012\u001b\u0017Ys\u0017Kv2?dG{@l#8QB,o40wrh8\u0007p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0012\u001b\u0017Ys\u0017Kv2?dG\u0004@|\u0016;WN,o40ud_H\u0011p@1\u0001.FL[\u0002", "5dc\u0016a;>`#\nkb,\u000fi+c\u000f2\tTc!\u001eFo\u001bz\u0007)/f}'7i$.", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`(Ko @\u007f45f\b+\u0001I\u001f-ZM?j%\"\u0015zDC\u000eb,[L", "Adc\u0016a;>`#\nkb,\u000fi+c\u000f2\tTc!\u001eFo\u001bz\u0007)/f}'7i$.", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ(\u001bG\u0002\u0012E\u0006%Bc\ti\u0013v\u0015;WG:\\8\u001e'Kk@\u0006c9$:\u0018", "7mc?\\5LW\u0017\reh3\u0001\u0007C", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9qE\u000629b\f$5{\u00018TG9\u007f\n", "7mc?\\5LW\u0017\rjl(~\t\fyj$\t@\n&", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mT\u001e[?=k\u00112\u007fdn9\u0010r\u0002", "5dc\u0016a;KW\"\r~\\:l\u0017+g\u007f\u0005\u0010+|$\u0017P~LLz\u001fBY\u0005 3{\u0016", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.\f3Ig6\u001eq|L5\u0014c5]L", "Adc\u0016a;KW\"\r~\\:l\u0017+g\u007f\u0005\u0010+|$\u0017P~LLz\u001fBY\u0005 3{\u0016", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016l=Q7m4z)S]F\u0007l;$:\u0018", "7r0Ag(<V\u0019}", "7r32T*MW*z\n^+", "7r?9T*>R", "7r?9T*>Ru\u0013eZ9|\u0012>", "7r?9T*>R|\bah6\u0003\u00052e{'", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "7rE._0==+\bzk\u001az\u0013:e", "7rE6e;NO e\u0005h2x\f/a~\u0015\u0006J\u0010", "7rE6e;NO e\u0005h2x\f/a~\u0015\u0006J\u0010U'Ki\u001b<}%1g}", "Adc#\\9Mc\u0015\u0006ah6\u0003\u00052e{'hJ\u000b&UWs\bIv,5U\f ", ":`h<h;\u001dS ~|Z;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6m|*aMKz\u0013\u001e\u001chc5\u0016c\u0002", "5dc\u0019T@Hc(]ze,~\u0005>e>8\u007f:\u000e\u0017\u001eGk\u001c<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.4?OuD-shh9\t_;NL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ":`h<h;\u001dW&~xm0\u0007\u0012", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "Adc\u0019T@Hc(]~k,z\u00183o\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W#r9?i\r~;z\u0016,\\GEt\na\u0006", ":`h<h;)S\"}~g.", "5dc\u0019T@Hc(izg+\u0001\u00121$\u0010,uM\u0001\u001e\u0017C}\u000e", ":`h<h;,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mT\u0015IWE{C\f$dp9\\", "5dc\u0019T@Hc(l\nZ;|G?iy5{G\u0001\u0013%G", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.\f*7\u007f>.$Vp5\u0016c\u0002", ":n^8T/>O\u0018evr6\r\u0018\u001ae\t'\u007fI\u0003", "5dc\u0019b6DO\u001c~v]\u0013x\u001d9u\u000f\u0013{I\u007f\u001b I.\u001e@p25`}\u001cEm", ":n^8T/>O\u0018fzZ:\r\u0016/P\u007f1zD\n\u0019", "5dc\u0019b6DO\u001c~v]\u0014|\u0005=u\r(f@\n\u0016\u001bPqLLz\u001fBY\u0005 3{\u0016", ":n^8T/>O\u0018ivl:[\t6e\u0002$\u000b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6m|*aMKz\u0013\u001e\u001chc5\u0016cj5\u00011MHQ,XQ]9\" 9\u000eU+\u000f\u0001hAy", "5dc\u0019b6DO\u001c~v]\u0017x\u0017=D\u007f/{B|&\u0017\u0006\u007f\u00126\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.4?OuD-shh9\t_;N5\u000eQVT(_Rn<~\u000eh\u001c-+\u0014\u0005[=3n\u001a", "<df\u001fb6M", ":n^8T/>O\u0018k\u0005h;", "5dc\u0019b6DO\u001c~v]\u0019\u0007\u0013>$\u0010,uM\u0001\u001e\u0017C}\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.#", "Adc\u0019b6DO\u001c~v]\u0019\u0007\u0013>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u0004\u00114", ";Ca.j\u001a<]$~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mt;IU)i>)\u0015>", "5dc\u001a79:e\u0007|\u0005i,;\u00193_\r(\u0003@|%\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.,P7}\"\u001c\u001fsa\u000f", ";dP@h9>>\u0015\r\t=,\u0004\t1a\u000f(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6m|*aMKz\u0013\u001e\u001chc5\u0016cj6v#U\\[,GN\u0001Kr\u0012a\u000eP'\u001c\u0005/", "5dc\u001aX(Lc&~eZ:\u000bg/l\u007f*wO\u0001U'Ki\u001b<}%1g}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.4?OuD-shh9\t_;N5\u000fGH\\<iR]9\" 9\u000eU+\u000f\u0001hAy", ";dP@h9>>\u0019\byb5~", "5dc\u001aX(Lc&~e^5{\r8g>8\u007f:\u000e\u0017\u001eGk\u001c<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7X 5QAOA", ";dP@h9>>#\u0006~\\@", "5dc\u001aX(Lc&~eh3\u0001\u0007C", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001dYy.Gz\u0016\u0019WJ?iHs", "Adc\u001aX(Lc&~eh3\u0001\u0007C", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u00018TG9\u007f\na\u0006", ";dP@h9>Ru\u0013eZ9|\u0012>", "5dc\u001aX(Lc&~y;@g\u0005<e\t7:P\u0005\u0011$Gv\u000e8\u0005%", ";dP@h9>Ru\u0013eZ9|\u0012>I\t\u000f\u0006J\u0007\u0013\u001aGk\r", "5dc\u001aX(Lc&~y;@g\u0005<e\t7_Ig!!Mk\u0011<r$si\u0002\u001aDm\u001d.IQ;", ";nS6Y0>`", "5dc\u001ab+BT\u001d~\b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/", "Adc\u001ab+BT\u001d~\b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b\u001dn", "<dT1f\u0016G>#\r~m0\u0007\u0012/d^,\nK|&\u0015J", "5dc\u001bX,=a\u0003\beh:\u0001\u00183o\t(z\u001f\u0005%\"C~\f?559S\u000b >m\u0012<M", "Adc\u001bX,=a\u0003\beh:\u0001\u00183o\t(z\u001f\u0005%\"C~\f?559S\u000b >m\u0012<M", "<nS2f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013\\y$@C", "5dc\u001bb+>aW\u000f~X9|\u0010/a\u000e(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006_/4Y[#3q\u001f\u0004", "=m0Ag(<V", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%B/", "", "5dc\u001ca\bMb\u0015|}\u001d<\u0001\u0003<e\u0007(wN\u0001", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u001ca\bMb\u0015|}\u001d<\u0001\u0003<e\u0007(wN\u0001", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "=m32g(<V", "5dc\u001ca\u000b>b\u0015|}\u001d<\u0001\u0003<e\u0007(wN\u0001", "Adc\u001ca\u000b>b\u0015|}\u001d<\u0001\u0003<e\u0007(wN\u0001", "=tc2e\nH]&}~g(\f\u0013<", "5dc\u001ch;>`v\t\u0005k+\u0001\u0012+t\n5:P\u0005\u0011$Gv\u000e8\u0005%", "=v]2e", "5dc\u001cj5>`W\u000f~X9|\u0010/a\u000e(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006`7>Y\u000bu", ">`a2a;", "5dc\u001dT9>\\(=\u000bb&\n\t6e{6{", ">`a2a;\"\\\u001a\t", "5dc\u001dT9>\\(b\u0004_6", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|y7NM\u0011", ">d]1\\5@;#}~_0|\u0016", ">kP0X\u0016KR\u0019\f", "5dc\u001d_(<S\u0003\fy^9;\u00193_\r(\u0003@|%\u0017", ">qTC\\6Na|\b\nk0\u0006\u00173c\u000e\u0018\n<\u0003\u0017s[Z\nIv.D", "5dc X4:\\(\u0003xl\u0010{", "Adc X4:\\(\u0003xl\u0010{", "AtQ0b4I]'\u0003\nb6\u0006\u0017\u001dt{7{", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/ w\u0015.;S8i>& ro=\u0016g6W\u0005\u0015VH],2", "5dc h)<]!\n\u0005l0\f\r9n\u000e\u0016\u000b<\u0010\u0017UWs\bIv,5U\f ", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|~8LC){1\u001c\u001fplC\u0015g;R\u00010U:](kRH", "Adc h)<]!\n\u0005l0\f\r9n\u000e\u0016\u000b<\u0010\u0017UWs\bIv,5U\f ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FV -M1Kh2(\u001dskG\u000br0X\u007f55[J;\\(6.", "CmU<_+>R\n\u0003\bm<x\u0010\rh\u0004/zM\u0001 }K}\u001d\u001bz2Dm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "DhTD66GT\u001d\u0001\u000bk(\f\r9n", "5dc#\\,P1#\b{b.\r\u0016+t\u00042\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#n$7\u007fs8VD?mD+\u0011weC\u00109", "Adc#\\,P1#\b{b.\r\u0016+t\u00042\u0005", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~J\u0002 IK 7NG={A\u001a$lkB\\'\u001d", "DhaAh(E1\u001c\u0003\u0002]9|\u0012\ro\u00101\u000b", "EhSA[", "5dc$\\+MV", "HH]1X?", "", "5dc'<5=S,", "u(5", "HR^?g,=1\u001c\u0003\u0002]9|\u0012", "5dc'F6Kb\u0019}Xa0\u0004\b<e\tfwI\n!&C~\u0012F\u007f3", "5dc'F6Kb\u0019}Xa0\u0004\b<e\t", "HR^?g,=1\u001c\u0003\u0002]9|\u0012\u0013n\u0011$\u0003D\u007f\u0013&Gn", "/o_9l\u0014HR\u001d\u007f~^9", "/sc.V/", "/sc.V/|c\u001dx\b^3|\u0005=e", "1kT.e\u001aNP(\fz^\u0010\u0006\u0018<i\t6\u007f>\u000f\u0007%Cq\u000e", "1kT.e\u001aNP(\fz^\u0010\u0006\u0018<i\t6\u007f>\u000f\u0007%Cq\u000ez\u0007)/f}'7i$.", "1kT.e\u001aNP(\fz^\u0017\u0004\u0005-e\b(\u0005Od &Ts\u0017Jz#CI\f\u001c9m", "2dQBZ\u001bKS\u0019m\u0005L;\n\r8g", "", "2dc.V/", "2dc.V/|c\u001dx\b^3|\u0005=e", "2hb=T;<V\u0003\beh:\u0001\u00183o\t(z\u001e|\u001e\u001eDk\fB\u0005", "2hb=T;<V\u0003\beh:\u0001\u00183o\t(z\u001e|\u001e\u001eDk\fB\u0005cE]w-7t\u0016*[C", "2qPD", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "5qP=[0<a\u007fz\u000f^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "2qPD\u0017<BM&~\u0002^(\u000b\t", "4na\u0012T*A1\u001c\u0003\u0002]", "0k^0^", "4na\u0012T*A1\u001c\u0003\u0002]\u0010\u0006\b/x\u007f'", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "4na\u0012T*A1#\t\b]0\u0006\u0005>o\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001errkF\u0006g5J\u00061T\"", "4na\u0012T*A1#\t\b]0\u0006\u0005>o\rf\fDz$\u0017No\nJv", "4na\u0012T*A1#\t\b]0\u0006\u0005>o\r\f\u0005>\b'\u0016Kx\u0010 \u007f.5f", "4na\u0012T*A1#\t\b]0\u0006\u0005>o\r\f\u0005>\b'\u0016Kx\u0010 \u007f.5f<0;g#.TC7y4", "4na0X\u0019>[\u0019z\tn9|", "5dc\u0016a;>`#\nkb,\u000f", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0012\u001b\u0017Ys\u0017Kv2?dG\u0004@|\u0016;WN,o40j", "5dc\u001ab+BT\u001d~\bB5}\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^/4]~$7zy7NM\u0011", "5dc\u001ce\nKS\u0015\u000ezB5\f\u00163n\u000e,yNk!\u001eKm\"", "6hc!X:M", ">nX;g,K>#\r~m0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "6hc!X:M@\u0019\r\u000be;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9p@\u0006\u00145g\r\r7{&5\\\u0019", "7rC<h*A3*~\u0004m", "7r8;?(RS&", "6hc!X:M\u001b\u0001xLr\u0014etmu\u0004\"\t@\b\u0017\u0013Uo", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006Y)DH}.FZ\u0016<]JJA)\u0013XY", "6hc!X:MA\u0019\u0007vg;\u0001\u0007=", "6hc X4:\\(\u0003xl\f\u0006\u00183t\u0004(\n", "6hc!X:MA\u0019\u0007vg;\u0001\u0007=-g\"MTh\u007f\u0003\u0006\u007f\u00126\u0004%<Yy.7", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "7f]<e,+S!~vl<\n\t\u001ce\f8{N\u0010%UWs\bIv,5U\f ", "7mb2e;\u001ab", "7mS2k", "7mbAT5<S", "7mb2e;\u001abW\u000f~X9|\u0010/a\u000e(", "7me._0=O(~[h*\r\u0017\u0019n[7\u000b<~\u001a", "7me._0=O(~aZ@|\u0016", "7me._0=O(~aZ@|\u0016mu\u0004\"\t@\b\u0017\u0013Uo", "7me._0=O(~aZ@|\u0016=", "7me._0=O(~aZ@|\u0016=$\u0010,uM\u0001\u001e\u0017C}\u000e", "7me._0=O(~b^(\u000b\u0019<e\b(\u0005O\u000f", "7me._0=O(~b^(\u000b\u0019<e\b(\u0005O\u000fU'Ki\u001b<}%1g}", "7me._0=O(~dg\u0017\u0007\u00173t\u00042\u0005@\u007f", "7me._0=O(~dg\u0017\u0007\u00173t\u00042\u0005@\u007fU'Ki\u001b<}%1g}", "7me._0=O(~eZ9|\u0012>D{7w", "7me._0=O(~eZ9|\u0012>D{7w~\u0011\u001b\u0011To\u0015<r35", "7me._0=O(~h^4x\u0012>i}6", "7me._0=O(~h^4x\u0012>i}6:P\u0005\u0011$Gv\u000e8\u0005%", "7me._0=O(~hn)\f\u0016/e", "7rA<b;(T|\b\fZ3\u0001\b+t\u00042\u0005", "7me._0=O(~jg-\u0007\u0010.e~\u0019\u007fM\u0010'\u0013NM\u0011@}$BY\u0007", ":n^8T/>O\u0018kzf,x\u0017?r\u007f", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ":n^8T/>O\u0018kzf,x\u0017?r\u007fou.\u0014f\nNWLLz\u001fBY\u0005 3{\u0016", ":n^8T/>O\u0018kzi3x\u0007/", ":n^8T/>O\u0018kzi3x\u0007/$\u0010,uM\u0001\u001e\u0017C}\u000e", ";`a8?(R])\u000ee^5{\r8g", ";`a8?(R])\u000ee^5{\r8g>8\u007f:\u000e\u0017\u001eGk\u001c<", ";`a8?6HY\u0015\u0002zZ+c\u0005Co\u00107f@\n\u0016\u001bPq", ";`a8?6HY\u0015\u0002zZ+c\u0005Co\u00107f@\n\u0016\u001bPqLLz\u001fBY\u0005 3{\u0016", ";`a8?6HY\u0015\u0002zZ+d\t+s\u00105{+\u0001 \u0016Kx\u0010", ";`a8?6HY\u0015\u0002zZ+d\t+s\u00105{+\u0001 \u0016Kx\u0010z\u0007)/f}'7i$.", ";`a8@,:a)\fzI,\u0006\b3n\u0002", ";`a8@,:a)\fzI,\u0006\b3n\u0002f\fDz$\u0017No\nJv", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", ";`g\u0019b6DO\u001c~v]\u0010\u0006\u0018<i\t6\u007f>c\u0017\u001bIr\u001d", ";`g\u0019b6DO\u001c~v]\u0010\u0006\u0018<i\t6\u007f>r\u001b\u0016Vr", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", ";h]\u0019b6DO\u001c~v]\u0010\u0006\u0018<i\t6\u007f>c\u0017\u001bIr\u001d", ";h]\u0019b6DO\u001c~v]\u0010\u0006\u0018<i\t6\u007f>r\u001b\u0016Vr", ";ne2", "4q^:", "Bn", "1nd;g", ";ne2\u0017<BM&~\u0002^(\u000b\t", "=m25\\3=@\u0019\u0007\u0005o,{", "1gX9W", "=m32T*MW*z\n^", "=m32a:Bb-h\bE(\u0011\u0013?t^,\t@~&\u001bQxk?r.7Y|", "=m;.l6Nbv\t\u0003i3|\u0018/", "=mA2_,:a\u0019", "=mA2h:>", "=mI b9MS\u0018\\}b3{\u0016/nc1\r<\b\u001b\u0016C~\u000e;", "=mI b9MS\u0018\\}b3{\u0016/nc1\r<\b\u001b\u0016C~\u000e;559S\u000b >m\u0012<M", ">kP0X", "F", "G", ">kP0XjNW\u0013\fze,x\u0017/", "@dR?X(MS\t\b{h3{\t.C\u0003,\u0003?\u000e\u0017 +pl@\u00044I", "@d\\2T:N`\u0019", "@d\\2T:N`\u0019FtL?L{6M>8\u007f:\u000e\u0017\u001eGk\u001c<", "@d\\<i,\u001aZ ", "@d\\<i,\u001aZ =\u000bb&\n\t6e{6{", "@d\\<i,\u001ab", "@d\\<i,\u001abW\u000f~X9|\u0010/a\u000e(", "@d_9T*>", "@d_9T*>\u0012)\u0003tk,\u0004\t+s\u007f", "@d`BX:M:#\t\u0001Z/|\u0005.R\u007f/wT\u000b'&", "4na0X\u0019>_)~\tm", "@d`BX:M:#\t\u0001Z/|\u0005.R\u007f/wT\u000b'&\u0006\u007f\u00126\u0004%<Yy.7", "@d`BX:M:#\t\u0001Z/|\u0005.R\u007f0{<\u000f'$G", "AbW2W<ES\u0001~vl<\n\t\u000bn~\u000fwT\u000b'&", "7me._0=O(~^g;\n\r8s\u0004&\n", "@d`BX:M:#\t\u0001Z/|\u0005.R\u007f0{<\u000f'$G.\u001e@p25`}\u001cEm", "@d`BX:M@\u0019\u0006vr6\r\u0018", "@d`BX:M@\u0019\u0006vr6\r\u0018mu\u0004\"\t@\b\u0017\u0013Uo", "@d`BX:M@\u0019\u0007zZ:\r\u0016/", "@d`BX:M@\u0019\u0007zZ:\r\u0016/$\u0010,uM\u0001\u001e\u0017C}\u000e", "@db0[,=c ~g^4|\u0005=u\r(eMm\u0017\u001eC\u0004\u0018L\u0006", "7s", "@db0[,=c ~g^4|\u0005=u\r(eMm\u0017\u001eC\u0004\u0018L\u0006cE]w-7t\u0016*[C", "@db2g\u0014HR\u001d\u007f~^9j\u0018+t\u007f", "@db2g\u001aNP(\fz^\u0010\u0006\u0018<i\t6\u007f>\u000f\u0007%Cq\u000e", "@db2g\u001aNP(\fz^\u0010\u0006\u0018<i\t6\u007f>\u000f\u0007%Cq\u000ez\u0007)/f}'7i$.", "Ag^B_+\"\\*z\u0002b+x\u0018/P{5{I\u0010}\u0013[o\u001b", "BnBAe0GU", "CoS.g,\u001cV\u001d\u0006yk,\u0006l0D\u00045\u000bT", "CoS.g,\u001cV\u001d\u0006yk,\u0006l0D\u00045\u000bT?'\u001bA|\u000eCv!CY", "\u0011n\\=T5B]\"", "\u001a`h<h;,b\u0015\u000ez", "\u001cn8;g9B\\'\u0003xl\u0014|\u0005=u\r(fJ\b\u001b\u0015[", "#rP4X\tR>\u0015\fzg;", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;
    private SemanticsConfiguration _collapsedSemantics;
    private final MutableVectorWithMutationTracking<LayoutNode> _foldedChildren;
    private LayoutNode _foldedParent;
    private NodeCoordinator _innerLayerCoordinator;
    private Modifier _modifier;
    private MutableVector<LayoutNode> _unfoldedChildren;
    private final MutableVector<LayoutNode> _zSortedChildren;
    private boolean canMultiMeasure;
    private int compositeKeyHash;
    private CompositionLocalMap compositionLocalMap;
    private Density density;
    private int depth;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerCoordinatorIsDirty;
    private AndroidViewHolder interopViewFactoryHolder;
    private IntrinsicsPolicy intrinsicsPolicy;
    private UsageByParent intrinsicsUsageByParent;
    private boolean isDeactivated;
    private final boolean isVirtual;
    private boolean isVirtualLookaheadRoot;
    private final LayoutNodeLayoutDelegate layoutDelegate;
    private LayoutDirection layoutDirection;
    private LayoutNode lookaheadRoot;
    private MeasurePolicy measurePolicy;
    private boolean needsOnPositionedDispatch;
    private final NodeChain nodes;
    private Function1<? super Owner, Unit> onAttach;
    private Function1<? super Owner, Unit> onDetach;
    private Owner owner;
    private Modifier pendingModifier;
    private UsageByParent previousIntrinsicsUsageByParent;
    private int semanticsId;
    private LayoutNodeSubcompositionsState subcompositionsState;
    private boolean unfoldedVirtualChildrenListDirty;
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;
    private boolean zSortedChildrenInvalidated;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List list, long j2) {
            return (MeasureResult) m5671measure3p2s80s(measureScope, (List<? extends Measurable>) list, j2);
        }

        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public Void m5671measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    };
    private static final Function0<LayoutNode> Constructor = new Function0<LayoutNode>() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final LayoutNode invoke() {
            return new LayoutNode(false, 0, 3, null);
        }
    };
    private static final ViewConfiguration DummyViewConfiguration = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public float getTouchSlop() {
            return 16.0f;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        /* JADX INFO: renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public long mo5670getMinimumTouchTargetSizeMYxV2XQ() {
            return DpSize.Companion.m6746getZeroMYxV2XQ();
        }
    };
    private static final Comparator<LayoutNode> ZComparator = new Comparator() { // from class: androidx.compose.ui.node.LayoutNode$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LayoutNode.ZComparator$lambda$41((LayoutNode) obj, (LayoutNode) obj2);
        }
    };

    /* JADX INFO: compiled from: LayoutNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\tGً/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001\u000b\tURPgtOӂ\u000fI"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mT\u0015IWE{C\f$dp9\\", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001bdP@h9B\\\u001b", "\u001an^8T/>O\u0018fzZ:\r\u00163n\u0002", "\u001a`h6a.(c(", "\u001an^8T/>O\u0018evr0\u0006\u000b\u0019u\u000f", "\u0017c[2", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0007Gً/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001͆\rS"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mT\u001e[?=k\u00112\u007fdn9\u0010r\u0002", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0017m<2T:N`\u0019[\u0002h*\u0003", "\u0017m;.l6Nbu\u0006\u0005\\2", "\u001cnc\"f,=", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LayoutNode() {
        this(false, 0, 3, null);
    }

    @Deprecated(message = "\u0017K\tE\u0001\u0007\u0016iq\u0007\tj9T@]\u001c_\u001e7\u0015w\u001ef6)}xa\t6gqZx.NuwNZ]CL!j[\u000e;hQIl\f")
    @InterfaceC1492Gx
    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    public static /* synthetic */ void getCompositeKeyHash$annotations() {
    }

    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    public LayoutNode(boolean z2, int i2) {
        this.isVirtual = z2;
        this.semanticsId = i2;
        this._foldedChildren = new MutableVectorWithMutationTracking<>(new MutableVector(new LayoutNode[16], 0), new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode$_foldedChildren$1
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
                this.this$0.getLayoutDelegate$ui_release().markChildrenDirty();
            }
        });
        this._zSortedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.density = LayoutNodeKt.DefaultDensity;
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        this.compositionLocalMap = CompositionLocalMap.Companion.getEmpty();
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        this.previousIntrinsicsUsageByParent = UsageByParent.NotUsed;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this._modifier = Modifier.Companion;
    }

    public /* synthetic */ LayoutNode(boolean z2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? false : z2, (-1) - (((-1) - i3) | ((-1) - 2)) != 0 ? SemanticsModifierKt.generateSemanticsId() : i2);
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getSemanticsId() {
        return this.semanticsId;
    }

    public void setSemanticsId(int i2) {
        this.semanticsId = i2;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setCompositeKeyHash(int i2) {
        this.compositeKeyHash = i2;
    }

    public final boolean isVirtualLookaheadRoot$ui_release() {
        return this.isVirtualLookaheadRoot;
    }

    public final void setVirtualLookaheadRoot$ui_release(boolean z2) {
        this.isVirtualLookaheadRoot = z2;
    }

    public final LayoutNode getLookaheadRoot$ui_release() {
        return this.lookaheadRoot;
    }

    private final void setLookaheadRoot(LayoutNode layoutNode) {
        if (Intrinsics.areEqual(layoutNode, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = layoutNode;
        if (layoutNode != null) {
            this.layoutDelegate.ensureLookaheadDelegateCreated$ui_release();
            NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
            for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                outerCoordinator$ui_release.ensureLookaheadDelegateCreated();
            }
        }
        invalidateMeasurements$ui_release();
    }

    public final Boolean isPlacedInLookahead() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            return Boolean.valueOf(lookaheadPassDelegate$ui_release.isPlaced());
        }
        return null;
    }

    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this._foldedChildren.asList();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i2 = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                mutableVector = new MutableVector<>(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector;
            }
            mutableVector.clear();
            MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
            int size = vector.getSize();
            if (size > 0) {
                LayoutNode[] content = vector.getContent();
                do {
                    LayoutNode layoutNode = content[i2];
                    if (layoutNode.isVirtual) {
                        mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                    } else {
                        mutableVector.add(layoutNode);
                    }
                    i2++;
                } while (i2 < size);
            }
            this.layoutDelegate.markChildrenDirty();
        }
    }

    public final List<Measurable> getChildMeasurables$ui_release() {
        return getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
    }

    public final List<Measurable> getChildLookaheadMeasurables$ui_release() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.getChildDelegates$ui_release();
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode layoutNode;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (layoutNode = this._foldedParent) == null) {
            return;
        }
        layoutNode.invalidateUnfoldedVirtualChildren();
    }

    public final MutableVector<LayoutNode> get_children$ui_release() {
        updateChildrenIfDirty$ui_release();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.getVector();
        }
        MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
        Intrinsics.checkNotNull(mutableVector);
        return mutableVector;
    }

    public final void updateChildrenIfDirty$ui_release() {
        if (this.virtualChildrenCount > 0) {
            recreateUnfoldedChildrenIfDirty();
        }
    }

    public final void forEachChild(Function1<? super LayoutNode, Unit> function1) {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                function1.invoke(content[i2]);
                i2++;
            } while (i2 < size);
        }
    }

    public final void forEachChildIndexed(Function2<? super Integer, ? super LayoutNode, Unit> function2) {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                function2.invoke(Integer.valueOf(i2), content[i2]);
                i2++;
            } while (i2 < size);
        }
    }

    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this._foldedParent;
        while (layoutNode != null && layoutNode.isVirtual) {
            layoutNode = layoutNode._foldedParent;
        }
        return layoutNode;
    }

    public final Owner getOwner$ui_release() {
        return this.owner;
    }

    public final AndroidViewHolder getInteropViewFactoryHolder$ui_release() {
        return this.interopViewFactoryHolder;
    }

    public final void setInteropViewFactoryHolder$ui_release(AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    @Override // androidx.compose.ui.node.InteroperableComposeUiNode
    public View getInteropView() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isAttached() {
        return this.owner != null;
    }

    public final int getDepth$ui_release() {
        return this.depth;
    }

    public final void setDepth$ui_release(int i2) {
        this.depth = i2;
    }

    public final LayoutState getLayoutState$ui_release() {
        return this.layoutDelegate.getLayoutState$ui_release();
    }

    public final LayoutNodeLayoutDelegate.LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.layoutDelegate.getLookaheadPassDelegate$ui_release();
    }

    public final LayoutNodeLayoutDelegate.MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.layoutDelegate.getMeasurePassDelegate$ui_release();
    }

    public final void insertAt$ui_release(int i2, LayoutNode layoutNode) {
        if (!(layoutNode._foldedParent == null)) {
            StringBuilder sbAppend = new StringBuilder("Cannot insert ").append(layoutNode).append(" because it already has a parent. This tree: ").append(debugTreeToString$default(this, 0, 1, null)).append(" Other tree: ");
            LayoutNode layoutNode2 = layoutNode._foldedParent;
            InlineClassHelperKt.throwIllegalStateException(sbAppend.append(layoutNode2 != null ? debugTreeToString$default(layoutNode2, 0, 1, null) : null).toString());
        }
        if (!(layoutNode.owner == null)) {
            InlineClassHelperKt.throwIllegalStateException("Cannot insert " + layoutNode + " because it already has an owner. This tree: " + debugTreeToString$default(this, 0, 1, null) + " Other tree: " + debugTreeToString$default(layoutNode, 0, 1, null));
        }
        layoutNode._foldedParent = this;
        this._foldedChildren.add(i2, layoutNode);
        onZSortedChildrenInvalidated$ui_release();
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount++;
        }
        invalidateUnfoldedVirtualChildren();
        Owner owner = this.owner;
        if (owner != null) {
            layoutNode.attach$ui_release(owner);
        }
        if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() + 1);
        }
    }

    public final void onZSortedChildrenInvalidated$ui_release() {
        if (this.isVirtual) {
            LayoutNode parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                parent$ui_release.onZSortedChildrenInvalidated$ui_release();
                return;
            }
            return;
        }
        this.zSortedChildrenInvalidated = true;
    }

    public final void removeAt$ui_release(int i2, int i3) {
        if (!(i3 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("count (" + i3 + ") must be greater than 0");
        }
        int i4 = (i3 + i2) - 1;
        if (i2 > i4) {
            return;
        }
        while (true) {
            onChildRemoved(this._foldedChildren.get(i4));
            this._foldedChildren.removeAt(i4);
            if (i4 == i2) {
                return;
            } else {
                i4--;
            }
        }
    }

    public final void removeAll$ui_release() {
        for (int size = this._foldedChildren.getSize() - 1; -1 < size; size--) {
            onChildRemoved(this._foldedChildren.get(size));
        }
        this._foldedChildren.clear();
    }

    private final void onChildRemoved(LayoutNode layoutNode) {
        if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            this.layoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(r1.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            layoutNode.detach$ui_release();
        }
        layoutNode._foldedParent = null;
        layoutNode.getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount--;
            MutableVector<LayoutNode> vector = layoutNode._foldedChildren.getVector();
            int size = vector.getSize();
            if (size > 0) {
                LayoutNode[] content = vector.getContent();
                int i2 = 0;
                do {
                    content[i2].getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
                    i2++;
                } while (i2 < size);
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated$ui_release();
    }

    public final void move$ui_release(int i2, int i3, int i4) {
        if (i2 == i3) {
            return;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            this._foldedChildren.add(i2 > i3 ? i3 + i5 : (i3 + i4) - 2, this._foldedChildren.removeAt(i2 > i3 ? i2 + i5 : i2));
        }
        onZSortedChildrenInvalidated$ui_release();
        invalidateUnfoldedVirtualChildren();
        invalidateMeasurements$ui_release();
    }

    public final void invalidateSemantics$ui_release() {
        this._collapsedSemantics = null;
        LayoutNodeKt.requireOwner(this).onSemanticsChange();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
    public final SemanticsConfiguration getCollapsedSemantics$ui_release() {
        if (isAttached() && !isDeactivated()) {
            if (!this.nodes.m5710hasH91voCI$ui_release(NodeKind.m5749constructorimpl(8)) || this._collapsedSemantics != null) {
                return this._collapsedSemantics;
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new SemanticsConfiguration();
            LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeSemanticsReads$ui_release(this, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode$collapsedSemantics$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v14, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
                /* JADX WARN: Type inference failed for: r7v6 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    NodeChain nodes$ui_release = this.this$0.getNodes$ui_release();
                    int iM5749constructorimpl = NodeKind.m5749constructorimpl(8);
                    Ref.ObjectRef<SemanticsConfiguration> objectRef2 = objectRef;
                    if ((nodes$ui_release.getAggregateChildKindSet() & iM5749constructorimpl) != 0) {
                        for (Modifier.Node tail$ui_release = nodes$ui_release.getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                            if ((tail$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                                Modifier.Node nodePop = tail$ui_release;
                                MutableVector mutableVector = null;
                                while (nodePop != 0) {
                                    if (nodePop instanceof SemanticsModifierNode) {
                                        SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) nodePop;
                                        if (semanticsModifierNode.getShouldClearDescendantSemantics()) {
                                            objectRef2.element = new SemanticsConfiguration();
                                            objectRef2.element.setClearingSemantics(true);
                                        }
                                        if (semanticsModifierNode.getShouldMergeDescendantSemantics()) {
                                            objectRef2.element.setMergingSemanticsOfDescendants(true);
                                        }
                                        semanticsModifierNode.applySemantics(objectRef2.element);
                                    } else if ((-1) - (((-1) - nodePop.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0 && (nodePop instanceof DelegatingNode)) {
                                        Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release();
                                        int i2 = 0;
                                        nodePop = nodePop;
                                        while (delegate$ui_release != null) {
                                            int kindSet$ui_release = delegate$ui_release.getKindSet$ui_release();
                                            if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    nodePop = delegate$ui_release;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodePop != 0) {
                                                        if (mutableVector != null) {
                                                            mutableVector.add(nodePop);
                                                        }
                                                        nodePop = 0;
                                                    }
                                                    if (mutableVector != null) {
                                                        mutableVector.add(delegate$ui_release);
                                                    }
                                                }
                                            }
                                            delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                            nodePop = nodePop;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    nodePop = DelegatableNodeKt.pop(mutableVector);
                                }
                            }
                        }
                    }
                }
            });
            this._collapsedSemantics = (SemanticsConfiguration) objectRef.element;
            return (SemanticsConfiguration) objectRef.element;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attach$ui_release(androidx.compose.ui.node.Owner r7) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.attach$ui_release(androidx.compose.ui.node.Owner):void");
    }

    public final void detach$ui_release() {
        Owner owner = this.owner;
        if (owner == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui_release = getParent$ui_release();
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(sb.append(parent$ui_release != null ? debugTreeToString$default(parent$ui_release, 0, 1, null) : null).toString());
            throw new KotlinNothingValueException();
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            parent$ui_release2.invalidateMeasurements$ui_release();
            getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(UsageByParent.NotUsed);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(UsageByParent.NotUsed);
            }
        }
        this.layoutDelegate.resetAlignmentLines();
        Function1<? super Owner, Unit> function1 = this.onDetach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        if (this.nodes.m5710hasH91voCI$ui_release(NodeKind.m5749constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        this.nodes.runDetachLifecycle$ui_release();
        this.ignoreRemeasureRequests = true;
        MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
        int size = vector.getSize();
        if (size > 0) {
            LayoutNode[] content = vector.getContent();
            int i2 = 0;
            do {
                content[i2].detach$ui_release();
                i2++;
            } while (i2 < size);
        }
        this.ignoreRemeasureRequests = false;
        this.nodes.markAsDetached$ui_release();
        owner.onDetach(this);
        this.owner = null;
        setLookaheadRoot(null);
        this.depth = 0;
        getMeasurePassDelegate$ui_release().onNodeDetached();
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release2 != null) {
            lookaheadPassDelegate$ui_release2.onNodeDetached();
        }
    }

    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector<LayoutNode> mutableVector = this._zSortedChildren;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            this._zSortedChildren.sortWith(ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final boolean getHasFixedInnerContentConstraints$ui_release() {
        long jM5733getLastMeasurementConstraintsmsEJaDk$ui_release = getInnerCoordinator$ui_release().m5733getLastMeasurementConstraintsmsEJaDk$ui_release();
        return Constraints.m6589getHasFixedWidthimpl(jM5733getLastMeasurementConstraintsmsEJaDk$ui_release) && Constraints.m6588getHasFixedHeightimpl(jM5733getLastMeasurementConstraintsmsEJaDk$ui_release);
    }

    static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i2, int i3, Object obj) {
        if ((i3 + 1) - (i3 | 1) != 0) {
            i2 = 0;
        }
        return layoutNode.debugTreeToString(i2);
    }

    private final String debugTreeToString(int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i4 = 0;
            do {
                sb.append(content[i4].debugTreeToString(i2 + 1));
                i4++;
            } while (i4 < size);
        }
        String string = sb.toString();
        if (i2 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4B\u0007\":\u0011\u007f\u0007|jAӄLeVLZS@\u000fsڔ<$i*yCAX \u001c8ޛ\u007fN\u0016f/Uj\u000fQ\u000f\u001e\u0016'k߽MU\u0007_Z/@E\b?aQ\u0018=ge%@\u0013&J(H{\u0015\u0001H2v\u0017'~QT$\u0012^J7N\u001b-[\u00102\u00124BH\u0001La\u0018XDN\u0005cJ13\u0003\u0018J|.\u00104\u000bY%F\u00031S\u000b*>9MO5C){\u00035W\fI\u0011E\nC\u0015j7'YQ\"^f\\\u000e\u001d-+}\u0017$\u0007n|\u0013_x\fU/wcyU>2\u0006\u0001\u0014\u0013L\u0006\u001e\u0006UP\\4Jj\u0016\u001aKt!]\u0007dRjP\u007f\u0013ad\u0018{ı5ڢ=\u001bnϟŎ?("}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mT\u0017W'DzA\"\u001eve7\u0015K,J\u00057TL96cVpQi", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7X 5QAOA", "3qa<e", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", ";dP@h9:P ~\t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "EhSA[", "", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        public static final int $stable = 0;
        private final String error;

        public NoIntrinsicsMeasurePolicy(String str) {
            this.error = str;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return ((Number) m5672maxIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i2)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return ((Number) m5673maxIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i2)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return ((Number) m5674minIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i2)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return ((Number) m5675minIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i2)).intValue();
        }

        /* JADX INFO: renamed from: minIntrinsicWidth */
        public Void m5675minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
            throw new IllegalStateException(this.error.toString());
        }

        /* JADX INFO: renamed from: minIntrinsicHeight */
        public Void m5674minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
            throw new IllegalStateException(this.error.toString());
        }

        /* JADX INFO: renamed from: maxIntrinsicWidth */
        public Void m5673maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
            throw new IllegalStateException(this.error.toString());
        }

        /* JADX INFO: renamed from: maxIntrinsicHeight */
        public Void m5672maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
            throw new IllegalStateException(this.error.toString());
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setMeasurePolicy(MeasurePolicy measurePolicy) {
        if (Intrinsics.areEqual(this.measurePolicy, measurePolicy)) {
            return;
        }
        this.measurePolicy = measurePolicy;
        IntrinsicsPolicy intrinsicsPolicy = this.intrinsicsPolicy;
        if (intrinsicsPolicy != null) {
            intrinsicsPolicy.updateFrom(getMeasurePolicy());
        }
        invalidateMeasurements$ui_release();
    }

    private final IntrinsicsPolicy getOrCreateIntrinsicsPolicy() {
        IntrinsicsPolicy intrinsicsPolicy = this.intrinsicsPolicy;
        if (intrinsicsPolicy != null) {
            return intrinsicsPolicy;
        }
        IntrinsicsPolicy intrinsicsPolicy2 = new IntrinsicsPolicy(this, getMeasurePolicy());
        this.intrinsicsPolicy = intrinsicsPolicy2;
        return intrinsicsPolicy2;
    }

    public final int minLookaheadIntrinsicWidth(int i2) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicWidth(i2);
    }

    public final int minLookaheadIntrinsicHeight(int i2) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicHeight(i2);
    }

    public final int maxLookaheadIntrinsicWidth(int i2) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicWidth(i2);
    }

    public final int maxLookaheadIntrinsicHeight(int i2) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicHeight(i2);
    }

    public final int minIntrinsicWidth(int i2) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicWidth(i2);
    }

    public final int minIntrinsicHeight(int i2) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicHeight(i2);
    }

    public final int maxIntrinsicWidth(int i2) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicWidth(i2);
    }

    public final int maxIntrinsicHeight(int i2) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public Density getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setDensity(Density density) {
        if (!Intrinsics.areEqual(this.density, density)) {
            this.density = density;
            onDensityOrLayoutDirectionChanged();
            for (Modifier.Node head$ui_release = this.nodes.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((-1) - (((-1) - NodeKind.m5749constructorimpl(16)) | ((-1) - head$ui_release.getKindSet$ui_release())) != 0) {
                    ((PointerInputModifierNode) head$ui_release).onDensityChange();
                } else if (head$ui_release instanceof CacheDrawModifierNode) {
                    ((CacheDrawModifierNode) head$ui_release).invalidateDrawCache();
                }
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setLayoutDirection(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            onDensityOrLayoutDirectionChanged();
            NodeChain nodeChain = this.nodes;
            int iM5749constructorimpl = NodeKind.m5749constructorimpl(4);
            if ((nodeChain.getAggregateChildKindSet() & iM5749constructorimpl) != 0) {
                for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                    if ((head$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                        Modifier.Node nodePop = head$ui_release;
                        MutableVector mutableVector = null;
                        while (nodePop != 0) {
                            if (nodePop instanceof DrawModifierNode) {
                                DrawModifierNode drawModifierNode = (DrawModifierNode) nodePop;
                                if (drawModifierNode instanceof CacheDrawModifierNode) {
                                    ((CacheDrawModifierNode) drawModifierNode).invalidateDrawCache();
                                }
                            } else if ((-1) - (((-1) - nodePop.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0 && (nodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release();
                                int i2 = 0;
                                nodePop = nodePop;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(nodePop);
                                                }
                                                nodePop = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    nodePop = nodePop;
                                }
                                if (i2 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if ((-1) - (((-1) - head$ui_release.getAggregateChildKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setViewConfiguration(ViewConfiguration viewConfiguration) {
        if (Intrinsics.areEqual(this.viewConfiguration, viewConfiguration)) {
            return;
        }
        this.viewConfiguration = viewConfiguration;
        NodeChain nodeChain = this.nodes;
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(16);
        if ((-1) - (((-1) - nodeChain.getAggregateChildKindSet()) | ((-1) - iM5749constructorimpl)) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                    Modifier.Node nodePop = head$ui_release;
                    MutableVector mutableVector = null;
                    while (nodePop != 0) {
                        if (nodePop instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) nodePop).onViewConfigurationChange();
                        } else {
                            int kindSet$ui_release = nodePop.getKindSet$ui_release();
                            if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release();
                                int i2 = 0;
                                nodePop = nodePop;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(nodePop);
                                                }
                                                nodePop = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    nodePop = nodePop;
                                }
                                if (i2 == 1) {
                                }
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((-1) - (((-1) - head$ui_release.getAggregateChildKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) == 0) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public CompositionLocalMap getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setCompositionLocalMap(CompositionLocalMap compositionLocalMap) {
        this.compositionLocalMap = compositionLocalMap;
        setDensity((Density) compositionLocalMap.get(CompositionLocalsKt.getLocalDensity()));
        setLayoutDirection((LayoutDirection) compositionLocalMap.get(CompositionLocalsKt.getLocalLayoutDirection()));
        setViewConfiguration((ViewConfiguration) compositionLocalMap.get(CompositionLocalsKt.getLocalViewConfiguration()));
        NodeChain nodeChain = this.nodes;
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(32768);
        if ((-1) - (((-1) - nodeChain.getAggregateChildKindSet()) | ((-1) - iM5749constructorimpl)) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                    Modifier.Node nodePop = head$ui_release;
                    MutableVector mutableVector = null;
                    while (nodePop != 0) {
                        if (nodePop instanceof CompositionLocalConsumerModifierNode) {
                            Modifier.Node node = ((CompositionLocalConsumerModifierNode) nodePop).getNode();
                            if (node.isAttached()) {
                                NodeKindKt.autoInvalidateUpdatedNode(node);
                            } else {
                                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                            }
                        } else if ((-1) - (((-1) - nodePop.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0 && (nodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release();
                            int i2 = 0;
                            nodePop = nodePop;
                            while (delegate$ui_release != null) {
                                int kindSet$ui_release = delegate$ui_release.getKindSet$ui_release();
                                if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        nodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodePop != 0) {
                                            if (mutableVector != null) {
                                                mutableVector.add(nodePop);
                                            }
                                            nodePop = 0;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                nodePop = nodePop;
                            }
                            if (i2 == 1) {
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((-1) - (((-1) - head$ui_release.getAggregateChildKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) == 0) {
                    return;
                }
            }
        }
    }

    private final void onDensityOrLayoutDirectionChanged() {
        invalidateMeasurements$ui_release();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getWidth() {
        return this.layoutDelegate.getWidth$ui_release();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getHeight() {
        return this.layoutDelegate.getHeight$ui_release();
    }

    public final boolean getAlignmentLinesRequired$ui_release() {
        AlignmentLines alignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        if (layoutNodeLayoutDelegate.getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release()) {
            return true;
        }
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNodeLayoutDelegate.getLookaheadAlignmentLinesOwner$ui_release();
        return (lookaheadAlignmentLinesOwner$ui_release == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release()) ? false : true;
    }

    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isPlaced() {
        return getMeasurePassDelegate$ui_release().isPlaced();
    }

    public final boolean isPlacedByParent() {
        return getMeasurePassDelegate$ui_release().isPlacedByParent();
    }

    public final int getPlaceOrder$ui_release() {
        return getMeasurePassDelegate$ui_release().getPlaceOrder$ui_release();
    }

    public final UsageByParent getMeasuredByParent$ui_release() {
        return getMeasurePassDelegate$ui_release().getMeasuredByParent$ui_release();
    }

    public final UsageByParent getMeasuredByParentInLookahead$ui_release() {
        UsageByParent measuredByParent$ui_release;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        return (lookaheadPassDelegate$ui_release == null || (measuredByParent$ui_release = lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release()) == null) ? UsageByParent.NotUsed : measuredByParent$ui_release;
    }

    public final UsageByParent getIntrinsicsUsageByParent$ui_release() {
        return this.intrinsicsUsageByParent;
    }

    public final void setIntrinsicsUsageByParent$ui_release(UsageByParent usageByParent) {
        this.intrinsicsUsageByParent = usageByParent;
    }

    public final boolean getCanMultiMeasure$ui_release() {
        return this.canMultiMeasure;
    }

    public final void setCanMultiMeasure$ui_release(boolean z2) {
        this.canMultiMeasure = z2;
    }

    public final NodeChain getNodes$ui_release() {
        return this.nodes;
    }

    public final NodeCoordinator getInnerCoordinator$ui_release() {
        return this.nodes.getInnerCoordinator$ui_release();
    }

    public final LayoutNodeLayoutDelegate getLayoutDelegate$ui_release() {
        return this.layoutDelegate;
    }

    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.nodes.getOuterCoordinator$ui_release();
    }

    private final float getZIndex() {
        return getMeasurePassDelegate$ui_release().getZIndex$ui_release();
    }

    public final LayoutNodeSubcompositionsState getSubcompositionsState$ui_release() {
        return this.subcompositionsState;
    }

    public final void setSubcompositionsState$ui_release(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    public final boolean getInnerLayerCoordinatorIsDirty$ui_release() {
        return this.innerLayerCoordinatorIsDirty;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui_release(boolean z2) {
        this.innerLayerCoordinatorIsDirty = z2;
    }

    private final NodeCoordinator getInnerLayerCoordinator() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
            NodeCoordinator wrappedBy$ui_release = getOuterCoordinator$ui_release().getWrappedBy$ui_release();
            this._innerLayerCoordinator = null;
            while (true) {
                if (Intrinsics.areEqual(innerCoordinator$ui_release, wrappedBy$ui_release)) {
                    break;
                }
                if ((innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getLayer() : null) != null) {
                    this._innerLayerCoordinator = innerCoordinator$ui_release;
                    break;
                }
                innerCoordinator$ui_release = innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getWrappedBy$ui_release() : null;
            }
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("layer was not set");
        throw new KotlinNothingValueException();
    }

    public final void invalidateLayer$ui_release() {
        NodeCoordinator innerLayerCoordinator = getInnerLayerCoordinator();
        if (innerLayerCoordinator != null) {
            innerLayerCoordinator.invalidateLayer();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public final boolean getApplyingModifierOnAttach$ui_release() {
        return this.pendingModifier != null;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public Modifier getModifier() {
        return this._modifier;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setModifier(Modifier modifier) {
        if (!(!this.isVirtual || getModifier() == Modifier.Companion)) {
            InlineClassHelperKt.throwIllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        if (isDeactivated()) {
            InlineClassHelperKt.throwIllegalArgumentException("modifier is updated when deactivated");
        }
        if (isAttached()) {
            applyModifier(modifier);
        } else {
            this.pendingModifier = modifier;
        }
    }

    private final void applyModifier(Modifier modifier) {
        this._modifier = modifier;
        this.nodes.updateFrom$ui_release(modifier);
        this.layoutDelegate.updateParentData();
        if (this.lookaheadRoot == null && this.nodes.m5710hasH91voCI$ui_release(NodeKind.m5749constructorimpl(512))) {
            setLookaheadRoot(this);
        }
    }

    private final void resetModifierState() {
        this.nodes.resetState$ui_release();
    }

    public final void invalidateParentData$ui_release() {
        this.layoutDelegate.invalidateParentData();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public LayoutCoordinates getCoordinates() {
        return getInnerCoordinator$ui_release();
    }

    public final Function1<Owner, Unit> getOnAttach$ui_release() {
        return this.onAttach;
    }

    public final void setOnAttach$ui_release(Function1<? super Owner, Unit> function1) {
        this.onAttach = function1;
    }

    public final Function1<Owner, Unit> getOnDetach$ui_release() {
        return this.onDetach;
    }

    public final void setOnDetach$ui_release(Function1<? super Owner, Unit> function1) {
        this.onDetach = function1;
    }

    public final boolean getNeedsOnPositionedDispatch$ui_release() {
        return this.needsOnPositionedDispatch;
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z2) {
        this.needsOnPositionedDispatch = z2;
    }

    public final void place$ui_release(int i2, int i3) {
        Placeable.PlacementScope placementScope;
        NodeCoordinator innerCoordinator$ui_release;
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null || (innerCoordinator$ui_release = parent$ui_release.getInnerCoordinator$ui_release()) == null || (placementScope = innerCoordinator$ui_release.getPlacementScope()) == null) {
            placementScope = LayoutNodeKt.requireOwner(this).getPlacementScope();
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, getMeasurePassDelegate$ui_release(), i2, i3, 0.0f, 4, null);
    }

    public final void replace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        getMeasurePassDelegate$ui_release().replace();
    }

    public final void lookaheadReplace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        lookaheadPassDelegate$ui_release.replace();
    }

    public final void draw$ui_release(Canvas canvas, GraphicsLayer graphicsLayer) {
        getOuterCoordinator$ui_release().draw(canvas, graphicsLayer);
    }

    /* JADX INFO: renamed from: hitTest-M_7yMNQ$ui_release$default */
    public static /* synthetic */ void m5662hitTestM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 + 4) - (4 | i2) != 0) {
            z2 = false;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            z3 = true;
        }
        layoutNode.m5666hitTestM_7yMNQ$ui_release(j2, hitTestResult, z2, z3);
    }

    /* JADX INFO: renamed from: hitTest-M_7yMNQ$ui_release */
    public final void m5666hitTestM_7yMNQ$ui_release(long j2, HitTestResult hitTestResult, boolean z2, boolean z3) {
        getOuterCoordinator$ui_release().m5736hitTestYqVAtuI(NodeCoordinator.Companion.getPointerInputSource(), NodeCoordinator.m5720fromParentPosition8S9VItk$default(getOuterCoordinator$ui_release(), j2, false, 2, null), hitTestResult, z2, z3);
    }

    /* JADX INFO: renamed from: hitTestSemantics-M_7yMNQ$ui_release$default */
    public static /* synthetic */ void m5663hitTestSemanticsM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, boolean z2, boolean z3, int i2, Object obj) {
        boolean z4 = z2;
        if ((4 & i2) != 0) {
            z4 = true;
        }
        layoutNode.m5667hitTestSemanticsM_7yMNQ$ui_release(j2, hitTestResult, z4, (i2 + 8) - (i2 | 8) == 0 ? z3 : true);
    }

    /* JADX INFO: renamed from: hitTestSemantics-M_7yMNQ$ui_release */
    public final void m5667hitTestSemanticsM_7yMNQ$ui_release(long j2, HitTestResult hitTestResult, boolean z2, boolean z3) {
        getOuterCoordinator$ui_release().m5736hitTestYqVAtuI(NodeCoordinator.Companion.getSemanticsSource(), NodeCoordinator.m5720fromParentPosition8S9VItk$default(getOuterCoordinator$ui_release(), j2, false, 2, null), hitTestResult, true, z3);
    }

    public final void rescheduleRemeasureOrRelayout$ui_release(LayoutNode layoutNode) {
        if (WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()] == 1) {
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                requestLookaheadRemeasure$ui_release$default(layoutNode, true, false, false, 6, null);
                return;
            }
            if (layoutNode.getLookaheadLayoutPending$ui_release()) {
                layoutNode.requestLookaheadRelayout$ui_release(true);
            }
            if (layoutNode.getMeasurePending$ui_release()) {
                requestRemeasure$ui_release$default(layoutNode, true, false, false, 6, null);
                return;
            } else {
                if (layoutNode.getLayoutPending$ui_release()) {
                    layoutNode.requestRelayout$ui_release(true);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Unexpected state " + layoutNode.getLayoutState$ui_release());
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(LayoutNode layoutNode, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            z2 = false;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z3 = true;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            z4 = true;
        }
        layoutNode.requestRemeasure$ui_release(z2, z3, z4);
    }

    public final void requestRemeasure$ui_release(boolean z2, boolean z3, boolean z4) {
        Owner owner;
        if (this.ignoreRemeasureRequests || this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.onRequestMeasure$default(owner, this, false, z2, z3, 2, null);
        if (z4) {
            getMeasurePassDelegate$ui_release().invalidateIntrinsicsParent(z2);
        }
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui_release$default(LayoutNode layoutNode, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = false;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            z3 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z4 = true;
        }
        layoutNode.requestLookaheadRemeasure$ui_release(z2, z3, z4);
    }

    public final void requestLookaheadRemeasure$ui_release(boolean z2, boolean z3, boolean z4) {
        if (!(this.lookaheadRoot != null)) {
            InlineClassHelperKt.throwIllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        Owner owner = this.owner;
        if (owner == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        owner.onRequestMeasure(this, true, z2, z3);
        if (z4) {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.invalidateIntrinsicsParent(z2);
        }
    }

    public final void invalidateMeasurements$ui_release() {
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, false, 7, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, false, 7, null);
        }
    }

    public final void invalidateOnPositioned$ui_release() {
        if (getLayoutPending$ui_release() || getMeasurePending$ui_release() || this.needsOnPositionedDispatch) {
            return;
        }
        LayoutNodeKt.requireOwner(this).requestOnPositionedCallback(this);
    }

    private final void invalidateFocusOnAttach() {
        NodeChain nodeChain = this.nodes;
        int iM5749constructorimpl = (-1) - (((-1) - NodeKind.m5749constructorimpl(1024)) & ((-1) - NodeKind.m5749constructorimpl(2048)));
        int iM5749constructorimpl2 = NodeKind.m5749constructorimpl(4096);
        if (nodeChain.has$ui_release((iM5749constructorimpl + iM5749constructorimpl2) - (iM5749constructorimpl & iM5749constructorimpl2))) {
            for (Modifier.Node head$ui_release = this.nodes.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                int i2 = (NodeKind.m5749constructorimpl(1024) & head$ui_release.getKindSet$ui_release()) != 0 ? 1 : 0;
                int iM5749constructorimpl3 = NodeKind.m5749constructorimpl(2048);
                int kindSet$ui_release = head$ui_release.getKindSet$ui_release();
                int i3 = (-1) - (((-1) - i2) & ((-1) - ((iM5749constructorimpl3 + kindSet$ui_release) - (iM5749constructorimpl3 | kindSet$ui_release) != 0 ? 1 : 0)));
                int i4 = (-1) - (((-1) - NodeKind.m5749constructorimpl(4096)) | ((-1) - head$ui_release.getKindSet$ui_release())) == 0 ? 0 : 1;
                if ((i3 + i4) - (i3 & i4) != 0) {
                    NodeKindKt.autoInvalidateInsertedNode(head$ui_release);
                }
            }
        }
    }

    public final void ignoreRemeasureRequests$ui_release(Function0<Unit> function0) {
        this.ignoreRemeasureRequests = true;
        function0.invoke();
        this.ignoreRemeasureRequests = false;
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(LayoutNode layoutNode, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = false;
        }
        layoutNode.requestRelayout$ui_release(z2);
    }

    public final void requestRelayout$ui_release(boolean z2) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.onRequestRelayout$default(owner, this, false, z2, 2, null);
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui_release$default(LayoutNode layoutNode, boolean z2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            z2 = false;
        }
        layoutNode.requestLookaheadRelayout$ui_release(z2);
    }

    public final void requestLookaheadRelayout$ui_release(boolean z2) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.onRequestRelayout(this, true, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6 */
    public final void dispatchOnPositionedCallbacks$ui_release() {
        if (getLayoutState$ui_release() != LayoutState.Idle || getLayoutPending$ui_release() || getMeasurePending$ui_release() || isDeactivated() || !isPlaced()) {
            return;
        }
        NodeChain nodeChain = this.nodes;
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(256);
        if ((-1) - (((-1) - nodeChain.getAggregateChildKindSet()) | ((-1) - iM5749constructorimpl)) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                int kindSet$ui_release = head$ui_release.getKindSet$ui_release();
                if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0) {
                    Modifier.Node nodePop = head$ui_release;
                    MutableVector mutableVector = null;
                    while (nodePop != 0) {
                        if (nodePop instanceof GlobalPositionAwareModifierNode) {
                            GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) nodePop;
                            globalPositionAwareModifierNode.onGloballyPositioned(DelegatableNodeKt.m5636requireCoordinator64DMado(globalPositionAwareModifierNode, NodeKind.m5749constructorimpl(256)));
                        } else {
                            int kindSet$ui_release2 = nodePop.getKindSet$ui_release();
                            if ((kindSet$ui_release2 + iM5749constructorimpl) - (kindSet$ui_release2 | iM5749constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release();
                                int i2 = 0;
                                nodePop = nodePop;
                                while (delegate$ui_release != null) {
                                    if ((-1) - (((-1) - delegate$ui_release.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(nodePop);
                                                }
                                                nodePop = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    nodePop = nodePop;
                                }
                                if (i2 == 1) {
                                }
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                int aggregateChildKindSet$ui_release = head$ui_release.getAggregateChildKindSet$ui_release();
                if ((aggregateChildKindSet$ui_release + iM5749constructorimpl) - (aggregateChildKindSet$ui_release | iM5749constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public List<ModifierInfo> getModifierInfo() {
        return this.nodes.getModifierInfo();
    }

    /* JADX INFO: renamed from: lookaheadRemeasure-_Sx5XlM$ui_release$default */
    public static /* synthetic */ boolean m5664lookaheadRemeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m5683getLastLookaheadConstraintsDWUhwKw();
        }
        return layoutNode.m5668lookaheadRemeasure_Sx5XlM$ui_release(constraints);
    }

    /* JADX INFO: renamed from: lookaheadRemeasure-_Sx5XlM$ui_release */
    public final boolean m5668lookaheadRemeasure_Sx5XlM$ui_release(Constraints constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.m5687remeasureBRTryo0(constraints.m6597unboximpl());
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release$default */
    public static /* synthetic */ boolean m5665remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            constraints = layoutNode.layoutDelegate.m5682getLastConstraintsDWUhwKw();
        }
        return layoutNode.m5669remeasure_Sx5XlM$ui_release(constraints);
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release */
    public final boolean m5669remeasure_Sx5XlM$ui_release(Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreeIntrinsicsUsage$ui_release();
        }
        return getMeasurePassDelegate$ui_release().m5691remeasureBRTryo0(constraints.m6597unboximpl());
    }

    public final boolean getMeasurePending$ui_release() {
        return this.layoutDelegate.getMeasurePending$ui_release();
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutDelegate.getLayoutPending$ui_release();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.layoutDelegate.getLookaheadMeasurePending$ui_release();
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.layoutDelegate.getLookaheadLayoutPending$ui_release();
    }

    public final void markLayoutPending$ui_release() {
        this.layoutDelegate.markLayoutPending$ui_release();
    }

    public final void markMeasurePending$ui_release() {
        this.layoutDelegate.markMeasurePending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.layoutDelegate.markLookaheadLayoutPending$ui_release();
    }

    public static /* synthetic */ void invalidateSubtree$default(LayoutNode layoutNode, boolean z2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            z2 = true;
        }
        layoutNode.invalidateSubtree(z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final void invalidateSubtree(boolean z2) {
        LayoutNode parent$ui_release;
        if (z2 && (parent$ui_release = getParent$ui_release()) != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateSemantics$ui_release();
        requestRemeasure$ui_release$default(this, false, false, false, 7, null);
        NodeChain nodeChain = this.nodes;
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(2);
        if ((nodeChain.getAggregateChildKindSet() & iM5749constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((-1) - (((-1) - head$ui_release.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0) {
                    Modifier.Node nodePop = head$ui_release;
                    MutableVector mutableVector = null;
                    while (nodePop != 0) {
                        if (nodePop instanceof LayoutModifierNode) {
                            OwnedLayer layer = DelegatableNodeKt.m5636requireCoordinator64DMado((LayoutModifierNode) nodePop, NodeKind.m5749constructorimpl(2)).getLayer();
                            if (layer != null) {
                                layer.invalidate();
                            }
                        } else {
                            int kindSet$ui_release = nodePop.getKindSet$ui_release();
                            if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release();
                                int i2 = 0;
                                nodePop = nodePop;
                                while (delegate$ui_release != null) {
                                    if ((-1) - (((-1) - delegate$ui_release.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(nodePop);
                                                }
                                                nodePop = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    nodePop = nodePop;
                                }
                                if (i2 == 1) {
                                }
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                int aggregateChildKindSet$ui_release = head$ui_release.getAggregateChildKindSet$ui_release();
                if ((aggregateChildKindSet$ui_release + iM5749constructorimpl) - (aggregateChildKindSet$ui_release | iM5749constructorimpl) == 0) {
                    break;
                }
            }
        }
        MutableVector<LayoutNode> mutableVector2 = get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector2.getContent();
            int i3 = 0;
            do {
                content[i3].invalidateSubtree(false);
                i3++;
            } while (i3 < size);
        }
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.layoutDelegate.markLookaheadMeasurePending$ui_release();
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public void forceRemeasure() {
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, false, 5, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, false, 5, null);
        }
        Constraints constraintsM5682getLastConstraintsDWUhwKw = this.layoutDelegate.m5682getLastConstraintsDWUhwKw();
        if (constraintsM5682getLastConstraintsDWUhwKw != null) {
            Owner owner = this.owner;
            if (owner != null) {
                owner.mo5805measureAndLayout0kLqBqw(this, constraintsM5682getLastConstraintsDWUhwKw.m6597unboximpl());
                return;
            }
            return;
        }
        Owner owner2 = this.owner;
        if (owner2 != null) {
            Owner.measureAndLayout$default(owner2, false, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public void onLayoutComplete() {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(128);
        boolean zM5758getIncludeSelfInTraversalH91voCI = NodeKindKt.m5758getIncludeSelfInTraversalH91voCI(iM5749constructorimpl);
        Modifier.Node tail = innerCoordinator$ui_release.getTail();
        if (zM5758getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node nodeHeadNode = innerCoordinator$ui_release.headNode(zM5758getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui_release() & iM5749constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild$ui_release()) {
                int kindSet$ui_release = nodeHeadNode.getKindSet$ui_release();
                if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0) {
                    Modifier.Node nodePop = nodeHeadNode;
                    MutableVector mutableVector = null;
                    while (nodePop != 0) {
                        if (nodePop instanceof LayoutAwareModifierNode) {
                            ((LayoutAwareModifierNode) nodePop).onPlaced(getInnerCoordinator$ui_release());
                        } else if ((nodePop.getKindSet$ui_release() & iM5749constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release();
                            int i2 = 0;
                            nodePop = nodePop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        nodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodePop != 0) {
                                            if (mutableVector != null) {
                                                mutableVector.add(nodePop);
                                            }
                                            nodePop = 0;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                nodePop = nodePop;
                            }
                            if (i2 == 1) {
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (nodeHeadNode == tail) {
                    return;
                }
            }
        }
    }

    public final void forEachCoordinator$ui_release(Function1<? super LayoutModifierNodeCoordinator, Unit> function1) {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            function1.invoke(layoutModifierNodeCoordinator);
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
        }
    }

    public final void forEachCoordinatorIncludingInner$ui_release(Function1<? super NodeCoordinator, Unit> function1) {
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            function1.invoke(outerCoordinator$ui_release);
        }
    }

    private final boolean shouldInvalidateParentLayer() {
        if (this.nodes.m5710hasH91voCI$ui_release(NodeKind.m5749constructorimpl(4)) && !this.nodes.m5710hasH91voCI$ui_release(NodeKind.m5749constructorimpl(2))) {
            return true;
        }
        for (Modifier.Node head$ui_release = this.nodes.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            int iM5749constructorimpl = NodeKind.m5749constructorimpl(2);
            int kindSet$ui_release = head$ui_release.getKindSet$ui_release();
            if ((iM5749constructorimpl + kindSet$ui_release) - (iM5749constructorimpl | kindSet$ui_release) != 0 && DelegatableNodeKt.m5636requireCoordinator64DMado(head$ui_release, NodeKind.m5749constructorimpl(2)).getLayer() != null) {
                return false;
            }
            if ((NodeKind.m5749constructorimpl(4) & head$ui_release.getKindSet$ui_release()) != 0) {
                return true;
            }
        }
        return true;
    }

    public final void clearSubtreeIntrinsicsUsage$ui_release() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                LayoutNode layoutNode = content[i2];
                if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                    layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
                }
                i2++;
            } while (i2 < size);
        }
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                LayoutNode layoutNode = content[i2];
                if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                    layoutNode.clearSubtreePlacementIntrinsicsUsage();
                }
                i2++;
            } while (i2 < size);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public LayoutInfo getParentInfo() {
        return getParent$ui_release();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isDeactivated() {
        return this.isDeactivated;
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("onReuse is only expected on attached node");
        }
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onReuse();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onReuse();
        }
        if (isDeactivated()) {
            this.isDeactivated = false;
            invalidateSemantics$ui_release();
        } else {
            resetModifierState();
        }
        setSemanticsId(SemanticsModifierKt.generateSemanticsId());
        this.nodes.markAsAttached();
        this.nodes.runAttachLifecycle();
        rescheduleRemeasureOrRelayout$ui_release(this);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onDeactivate();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onDeactivate();
        }
        this.isDeactivated = true;
        resetModifierState();
        if (isAttached()) {
            invalidateSemantics$ui_release();
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onRelease();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onRelease();
        }
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            outerCoordinator$ui_release.onRelease();
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\bnjO0LeN/ZS@\u000fsڔ<$i*yCAU\"}8\tWNmhtϻ[!¼?\u0006Dw+1OUޯa\u0012\u001d2\u0013\bM4euM;ptd\bN4x\u0601{ڱ\u0005 2Ϻ(x\u0001GY\u0011bBNvRR;T[܆\u0014ĂB&\tȦtiT>Vu.F=-\u001bipY}ۂ2ƊQ\rNÖw\u001f\u0005m6+nD\f\u0557w٨\u0007\rZ¹O\u0005E\u007fK\u00059?5:ayg8h\u007fB\u0018Y_cƟt͉`\u000bYӠ$)1`q]ם\u0012;"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mT\fWKFg=\"\u001fq7", "", "u(E", "\u0011n]@g9NQ(\t\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "5dc\u0010b5Lb&\u000fxm6\nG?iy5{G\u0001\u0013%G", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "\u0012t\\:l\u001dBS+\\\u0005g-\u0001\u000b?r{7\u007fJ\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "5dc\u0011h4Fg\n\u0003zp\n\u0007\u00120i\u00028\t<\u0010\u001b!P.\u001e@p25`}\u001cEm", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#n$7\u007fs8VD?mD+\u0011weC\u00109", "\u0013qa<e\u0014>O'\u000f\b^\u0017\u0007\u00103c\u0014", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mT\u0017W'DzA\"\u001eve7\u0015K,J\u00057TL96cVpQi", "\u001cnc\u001d_(<S\u0018i\u0002Z*|r<d\u007f5", "", "5dc\u001bb;)Z\u0015|z]\u0017\u0004\u0005-ei5z@\u000eU'Ki\u001b<}%1g}^3v\u001f8\\?Jo>'#", "(B^:c(KO(\t\b", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "5dc'66F^\u0015\fvm6\nG?iy5{G\u0001\u0013%G", "u(;7T=:\u001d)\u000e~euZ\u00137p{5wO\u000b$l", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getNotPlacedPlaceOrder$ui_release$annotations() {
        }

        private Companion() {
        }

        public final Function0<LayoutNode> getConstructor$ui_release() {
            return LayoutNode.Constructor;
        }

        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.DummyViewConfiguration;
        }

        public final Comparator<LayoutNode> getZComparator$ui_release() {
            return LayoutNode.ZComparator;
        }
    }

    public static final int ZComparator$lambda$41(LayoutNode layoutNode, LayoutNode layoutNode2) {
        return layoutNode.getZIndex() == layoutNode2.getZIndex() ? Intrinsics.compare(layoutNode.getPlaceOrder$ui_release(), layoutNode2.getPlaceOrder$ui_release()) : Float.compare(layoutNode.getZIndex(), layoutNode2.getZIndex());
    }

    public final void invalidateLayers$ui_release() {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            OwnedLayer layer = layoutModifierNodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
        }
        OwnedLayer layer2 = getInnerCoordinator$ui_release().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                LayoutNode layoutNode = content[i2];
                UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
                layoutNode.intrinsicsUsageByParent = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                }
                i2++;
            } while (i2 < size);
        }
    }
}
