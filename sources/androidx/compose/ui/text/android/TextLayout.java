package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:299)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: compiled from: TextLayout.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яħ\u0014D57\u001eq\u007fR܀kŞ\fA\u0014;\u0013ǞJ~01\u001aՄ\u000ff\u000198ǏmH<X[ճ\u0017k\u00124,[*sK;c#\u0006\"\u000fUVgu\u0002RZ\u0011C\u0017\u0006,xr,OU\u0001](\u000f:ԏw?IMw=?m|6\u001b :Ĳ@y\u001b\u0001\"*N\u001a~zQZ\u0014\u0012F@x:X\u0012U\u00050\u0012\u000e>&\f&\\uN>Hr^B/1\u0015qBT*g0\u0013M\u0015FZA\u0015vw\u001e3@=8\u001d%i\u0003\u000fRaC\u000b?\b=\rؒ-ݐAɞ$WdW@а\u0014;S\u001b]\u000b&\u000b\u0006ad\u001a)CO\u0012N`\u00126{\u0013{;A\u0014\u0014\f'V4E\u001a\u0015\u000f\u001e;zraHh\u0004tA.\u0004q<\u001d%\u000e=C9ImagA\u0019\\B\u0014\u0005;!3\u0007t\"i`&`C\u001ed}W1_MUH|\u0018iCs\u0004~q\u001a*2>W\u00065{\u001f>/%ebI)'k\u0010Y\\g%\fpnYi`ZX\"\u001d\u001dG0\u000f\fhW|\u0005\u001aWd^2\u0011[0l\u0007,\u000f#&bwJ6=\u0010|VxqpMk =1|6\b\u0006{\u0016]9lKMSy\u000f\u0010i\u0007\u001aE<p\u001epfpm۱^\\6=zlxd\u0010{r$<\u0017@\u0016\n\u001cb3a\u001djl`\u0003LIq\u0001\u00178rh>X\u000572]\u0002$#\u0010IkjL\bg'\u001f\\\u0001n~EA\u007f<I*cz\u00014+|MѨ\u0381\u0004Gm*\u0010Xzt\u000eU*\u007fF\u001eG2G=A\u0016G7@cEEzu\u0016U[t?z+\u0001U;1:uk\u0003pZc\u001bN]7/\"%e;/\u0016I\u0018y\u0010I+Kq7#[lP;\u000fg\"f8+\bO\"3c\b\"+<uO5\u0004.wB2EekL\b.(iW2\u0003M\u001c,\u0012\u001d f_:J;fP\"\u000bL\u000b<l1Ixn\u0006dZ\tb\u0014{TON\tVfT;3\fC\u001f,;w\u001fgH}\b}b5\u0010.\u0002$\u0016\u0014\rJm\u001d[?\u007fm\u001cR\r\u000fX{\"\u000b*87\u001e*+8V\u0006e94\u0014P06oB+\u0011Jw<4Z?8\u000fQ1\u0002\u0006>\u0002HRm~/2pvkZ\u001c1\u0011\\\u0005OMlSQ9*/\u0006?7,UM13t\u000f`=UJ\u0001\u0002 9\u001fx2\u0017fS2\r`G\u000e@X/\u0012uaQ&\u001a62Nqyyc$8F\u007fMF&wQQ?f?Dl\u007fmd|k'\u0016t5f\"W\u0006+\u0001\u001c2\"\u000f9\u001c\u0018~}YEL|~gG(c/DW\u000eT\u0013q>3-48]AWK,'*^\u0004A\u0004\b.\u0019?\u0004#/%\b\u001c`\"_19D\tFf\u0010O+PNc^N\u0003m\".6=\u007f\u0018A}+pim\b!n\u0007;n\u0016ByH\t\fsl\u0012|\u0004\bK|?T\u0012n[SM\r5.F\u0013\u0007aj\u0017Y f\n\u0018\u0014C4gW\u0016Ӵ((O\u0012>!p]܂\fC/\u001a1\u00126>ܿ\u001d\u0016\u001f(|40bӓ\u0014SW{̃cQiz܆V&^\u00196+Æצ-\u0015\u0003ۏG'\u001e!̒E\u000b\u001e\u0013=g\u001d-8%G\u000f\u000eLRW\u0097 IRm)g6\u0019P@v?\n\u0003q\u0003ʞ)Z\t!U\u00182;ĀSU\u001bUڞ#>r\u0011BcGNA6IgÃ\u001d˲^8(ڨ-(*Yi5W\u0018? kƌ\u0012˲\u000b\u0019=շ\"m3J\u0019|/\u0014uƗ\bˋ<ތ;~+˄\u001fq!xt]=7ko50RtX$ec\u0005\u001dˋ0O=\u00966{[f\u000e1o32\u0015\u000e#.S˜L0gЇXXy\u007f\u0012MzE|m;G\u001b\u007f*Nߢm\u001c\ffa\fBeK#'QV*[zخISpݟ#F\u0013p\"^_\u00127_/|>]Hˢ-߳vM7ۗ.H!!\u001c:`h\r̙I˂]*\u000eЌbbq\u0019\u0003og^>ghԗ\u000fՠ{1ZϒPz+H?K%wl`O\u0098CǶ\u000fL\u0017ěn0H>\u0019(.0NJ\u00102\u001br#HKG\"^}R-½#ͻ\u0015_=\b+\u001ex~\u0010d\u007fqU9a%ǮN^=ƶt\u0007[YY\u001e{!\u000e%C.uY\u0015ϙ,Ө\n\u000eMĹ\u0019\u001fR4\\(\u001c7߳4V\u0007ߠ[_\u0007X-a&+s<JjG]t\u0011Yvmm\u0001\u0014yٍz߲\u0007\u0012I\u0019!KnbGs;s;4t@ţ`Mm~s\f\u001eF2Y/s\u001e?]D\u00021ʂiC1YED\u001acw0\u0014Y<b\u0016Z@ځ$ό\u0007L>̅yTY\")fpmeߊv\u07be2\f@ˑVL\u0014Zz\u001cc<\u0016\u0005ڝ2t!IU5\nu6~txqMs0ݕ\u001dD9ޡ)eU,\"<\"vf\r/WTGI˫pܰ(ɢ\u007fT1ܦ'Wi=x\u0016lb\u0017*B\u0010\u0001s\bD~dl\u0003t\u0001´p\u001d~Q\u0004m_\u0018Ч\rȯo"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i&m)=4?OuD-j", "", "1gP?F,Jc\u0019\bx^", "", "EhSA[", "", "BdgAC(B\\(", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0013wD\n&l", "/kX4a4>\\(", "", "3k[6c:Bh\u0019", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0018\u000bD\b%U6|\u001eEt!DYY/\r", "BdgA70KS\u0017\u000e~h5_\t?r\u00046\u000bD~", ":h]2F7:Q\u001d\b|F<\u0004\u00183p\u0007,{M", ":h]2F7:Q\u001d\b|>?\f\u0016+", "7mR9h+>>\u0015}yb5~", "", "4`[9U(<Y\u007f\u0003\u0004^\u001a\b\u0005-i\t*", ";`g\u0019\\5>a", "0qT.^\u001aM`\u0015\u000ez`@", ":h]259>O\u001fl\nr3|", ":h]259>O\u001fp\u0005k+j\u0018Cl\u007f", "6x_5X5:b\u001d\t\u0004?9|\u0015?e\t&\u0010", "8tbA\\-BQ\u0015\u000e~h5d\u0013.e", ":dUA<5=S\"\u000e\t", "", "@hV5g\u0010GR\u0019\b\nl", ":`h<h;\"\\(\f~g:\u0001\u0007=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u001ftC+\u0019qo=\u0005q\u0002", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dPt8\u007f$Bc\u0002\u001f\u0001|\u0016A\\\r*kG-\u007fdeB\u00169\u00105r0FYX0[\u001c\u0002='!$|N>\u001cthE+|\u0003&,\u00185G}Jh\\\u001bkq\u0016Ke7:s+]xY7\r^*@[\u0003FNOf)wU]'dED2\u0014;)\u001f2_.\u001d\u000b\u001d\r{Q\u0007qkFba48H}j*N~b@}5#I\nMU#", "0`R8\\5@:\u0015\u0013\u0005n;_\t6p\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u001ek;)\u0015u7", "0`R8\\5@E#\fyB;|\u0016+t\n5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|iEm\u001d.KR?u=g\u0007rn8jr,[r6QY$", "0ncAb4)O\u0018}~g.", "5dc\u000fb;M]!iv]+\u0001\u00121$\u0010,uO\u0001*&A|\u000eCv!CY<\u001c@v =IR?u=,", "u(E", "5dc\u000fb;M]!iv]+\u0001\u00121$\u0010,uO\u0001*&A|\u000eCv!CY", "u(8", "2hS\u0012k*>S\u0018fvq\u0013\u0001\u0012/s", "5dc\u0011\\+\u001ef\u0017~z]\u0014x\u001c\u0016i\t(\n", "u(I", "5dc\u0013T3EP\u0015|\u0001E0\u0006\t\u001dp{&\u007fI\u0003", "6dX4[;", "5dc\u0015X0@V(", "5dc\u0016a*Ec\u0018~eZ+{\r8g", "7r1<e0GU\u007fz\u000fh<\f", ":`bA?0GSx\u0012\nk(", ":`bA?0GSy\t\u0004m\u0014|\u0018<i}6", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&U(y\u0017K^%Df\u0002\u001eEQ\u001f=#", ":`h<h;", "\u001a`]1e6BRb\u000ezq;Fo+y\n8\u000b\u0016", "5dc\u0019T@Hc(=vg5\u0007\u0018+t\u00042\u0005N", "5dc\u0019T@Hc(", "u(;.a+K]\u001d}Dm,\u0010\u0018xL{<\u0006P\u0010l", ":`h<h;!S \nzk", "5dc\u0019T@Hc(aze7|\u0016", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006r.4f\b$67|*aMKz\u0017\u001e\u001csaF\\", "5dc\u0019T@Hc(b\u0004m9\u0001\u0012=i}6", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006r.4f\b$67|*aMKz\u0018'$ueB\u0015g*\\L", ":dUAC(=R\u001d\b|", ":h]266N\\(", "5dc\u0019\\5>1#\u000f\u0004m", ":h]2;,BU\u001c\u000ehi(\u0006\u0017", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|iE|*5M\r\"o=\u001ewhe;\nr\u001a]\u000b.G:Y(e(", ")KP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W8\u007f$Bc\u0002\u001f\u0001{%BTC\u0005R8'\u0015Ka=\tf;<\u0006;NL<7X[H", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "5dc\u001aT?\"\\(\f~g:\u0001\u0007!i~7~", "u(5", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "5dc\u001a\\5\"\\(\f~g:\u0001\u0007!i~7~", "@dRA", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "@hV5g\u0017:R\u0018\u0003\u0004`", "BdgA", "5dc!X?M", "u(;7T=:\u001d z\u0004`uZ\f+rm(\bP\u0001 \u0015GE", "5dc!X?M>\u0015\u0003\u0004m", "u(;.a+K]\u001d}Dm,\u0010\u0018xT\u007f;\u000b+|\u001b VE", "Bn_\u001dT+=W\"\u0001", "5dc!b7)O\u0018}~g.;\u00193_\u000f(\u000fOz$\u0017No\nJvc1b\u0007*Fi%2WLI", "5dc!b7)O\u0018}~g.;\u00193_\u000f(\u000fOz$\u0017No\nJv", "Ena1<;>`\u0015\u000e\u0005k", "5dc$b9=7(~\bZ;\u0007\u0016", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006r.4f\b$67$.TC9z8(\u001e2SC\u0014b\u0010]v4C[X92", "4h[956N\\\u0018\u0003\u0004`\t\u0007\u001c/s", "", "AsP?g\u0016?T'~\n", "3mS\u001cY-LS(", "/qa.l", "", "/qa.l\u001aMO&\u000e", "4h[9?0GS{\t\bbA\u0007\u0012>a\u0007\u0005\u0006P\n\u0016%", ":h]2<5=S,", "4h[9?0GS{\t\bbA\u0007\u0012>a\u0007\u0005\u0006P\n\u0016%\u0006\u007f\u00126\u0006%Hhw-7t\u0016*[C", "5dc\u000fb<GR\u001d\b|;6\u0010", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010wl", "=eU@X;", "5dc\u0015b9Bh#\b\nZ3g\u0005.d\u00041}", ":h]2", "5dc\u0019\\5>/'|zg;", "5dc\u0019\\5>0\u0015\rze0\u0006\t", "5dc\u0019\\5>0#\u000e\nh4", "5dc\u0019\\5>2\u0019\rx^5\f", "5dc\u0019\\5>3 \u0006~i:\u0001\u0017\ro\u00101\u000b", "5dc\u0019\\5>3 \u0006~i:\u0001\u0017\u0019f\u00016{O", "5dc\u0019\\5>3\"}", "5dc\u0019\\5>4#\fd_-\u000b\t>", "5dc\u0019\\5>4#\fk^9\f\r-a\u0007", "DdaA\\*:Z", "5dc\u0019\\5>6\u0019\u0003|a;", "5dc\u0019\\5>:\u0019\u007f\n", "5dc\u0019\\5>@\u001d\u0001}m", "5dc\u0019\\5>A(z\bm", "5dc\u0019\\5>B#\n", "5dc\u0019\\5>D\u001d\r~[3|h8d", "5dc\u0019\\5>E\u001d}\na", "5dc\u001cY-LS(_\u0005k\u000f\u0007\u00163z\n1\u000b<\b", "6na6m6Gb\u0015\u0006", "5dc\u001dT9:U&z\u0006a\u000b\u0001\u0016/c\u000f,\u0006I", "5dc\u001de0FO&\u0013]h9\u0001\u001e9n\u000f$\u0003", "CobAe,:[", "5dc\u001fT5@Sy\t\bK,z\u0018", "5qP;h3:`\u001d\u000e\u000f", "7mR9h:B]\"l\nk(\f\t1y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "5dc X*H\\\u0018z\br\u000f\u0007\u00163z\n1\u000b<\b", "5dc X3>Q(\u0003\u0005g\u0017x\u00182", "AsP?g", "3mS", "2dbA", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wO\u0004l", "7r5._3;O\u0017\u0005ab5|\u0017:a},\u0005B\\\"\"Ns\u000e;", "7r5._3;O\u0017\u0005ab5|\u0017:a},\u0005B\\\"\"Ns\u000e;559S\r J|\u0010;MJ;gB\u001e", "7r;6a,\u001eZ \u0003\u0006l0\u0012\t.", "7rAA_\nAO&Z\n", ">`X;g", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextLayout {
    public static final int $stable = 8;
    private LayoutHelper backingLayoutHelper;
    private WordIterator backingWordIterator;
    private final int bottomPadding;
    private final boolean didExceedMaxLines;
    private final boolean fallbackLineSpacing;
    private final boolean includePadding;
    private final boolean isBoringLayout;
    private final int lastLineExtra;
    private final Paint.FontMetricsInt lastLineFontMetrics;
    private final Layout layout;
    private final LayoutIntrinsics layoutIntrinsics;
    private final float leftPadding;
    private final int lineCount;
    private final LineHeightStyleSpan[] lineHeightSpans;
    private final Rect rect;
    private final float rightPadding;
    private final TextPaint textPaint;
    private final int topPadding;

    public static /* synthetic */ void getBottomPadding$ui_text_release$annotations() {
    }

    public static /* synthetic */ void getLayout$annotations() {
    }

    public static /* synthetic */ void getTopPadding$ui_text_release$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextLayout(java.lang.CharSequence r33, float r34, android.text.TextPaint r35, int r36, android.text.TextUtils.TruncateAt r37, int r38, float r39, float r40, boolean r41, boolean r42, int r43, int r44, int r45, int r46, int r47, int r48, int[] r49, int[] r50, androidx.compose.ui.text.android.LayoutIntrinsics r51) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.TextLayout.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int, int, int[], int[], androidx.compose.ui.text.android.LayoutIntrinsics):void");
    }

    public final TextPaint getTextPaint() {
        return this.textPaint;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextLayout(CharSequence charSequence, float f2, TextPaint textPaint, int i2, TextUtils.TruncateAt truncateAt, int i3, float f3, float f4, boolean z2, boolean z3, int i4, int i5, int i6, int i7, int i8, int i9, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        int[] iArr3 = iArr;
        int i11 = i8;
        int i12 = i5;
        boolean z4 = z3;
        int i13 = i6;
        float f5 = f3;
        LayoutIntrinsics layoutIntrinsics2 = layoutIntrinsics;
        int i14 = i7;
        int i15 = i4;
        int i16 = i3;
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        boolean z5 = z2;
        float f6 = f4;
        int i17 = (i10 + 8) - (i10 | 8) != 0 ? 0 : i2;
        truncateAt2 = (i10 & 16) != 0 ? null : truncateAt2;
        i16 = (-1) - (((-1) - i10) | ((-1) - 32)) != 0 ? 2 : i16;
        this(charSequence, f2, textPaint, i17, truncateAt2, i16, (-1) - (((-1) - i10) | ((-1) - 64)) != 0 ? 1.0f : f5, (i10 & 128) != 0 ? 0.0f : f6, (-1) - (((-1) - i10) | ((-1) - 256)) != 0 ? false : z5, (i10 + 512) - (i10 | 512) != 0 ? true : z4, (i10 + 1024) - (i10 | 1024) != 0 ? Integer.MAX_VALUE : i15, (-1) - (((-1) - i10) | ((-1) - 2048)) != 0 ? 0 : i12, (i10 + 4096) - (i10 | 4096) != 0 ? 0 : i13, (i10 & 8192) != 0 ? 0 : i14, (i10 & 16384) != 0 ? 0 : i11, (32768 + i10) - (32768 | i10) == 0 ? i9 : 0, (65536 + i10) - (65536 | i10) != 0 ? null : iArr3, (-1) - (((-1) - 131072) | ((-1) - i10)) == 0 ? iArr2 : null, (i10 & 262144) != 0 ? new LayoutIntrinsics(charSequence, textPaint, i16) : layoutIntrinsics2);
    }

    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final WordIterator getWordIterator() {
        WordIterator wordIterator = this.backingWordIterator;
        if (wordIterator != null) {
            return wordIterator;
        }
        WordIterator wordIterator2 = new WordIterator(this.layout.getText(), 0, this.layout.getText().length(), this.textPaint.getTextLocale());
        this.backingWordIterator = wordIterator2;
        return wordIterator2;
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getTopPadding$ui_text_release() {
        return this.topPadding;
    }

    public final int getBottomPadding$ui_text_release() {
        return this.bottomPadding;
    }

    private final LayoutHelper getLayoutHelper() {
        LayoutHelper layoutHelper = this.backingLayoutHelper;
        if (layoutHelper == null) {
            LayoutHelper layoutHelper2 = new LayoutHelper(this.layout);
            this.backingLayoutHelper = layoutHelper2;
            return layoutHelper2;
        }
        Intrinsics.checkNotNull(layoutHelper);
        return layoutHelper;
    }

    public final CharSequence getText() {
        return this.layout.getText();
    }

    public final int getHeight() {
        int height;
        if (this.didExceedMaxLines) {
            height = this.layout.getLineBottom(this.lineCount - 1);
        } else {
            height = this.layout.getHeight();
        }
        return height + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    private final float getHorizontalPadding(int i2) {
        if (i2 == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    public final float getLineLeft(int i2) {
        return this.layout.getLineLeft(i2) + (i2 == this.lineCount + (-1) ? this.leftPadding : 0.0f);
    }

    public final float getLineRight(int i2) {
        return this.layout.getLineRight(i2) + (i2 == this.lineCount + (-1) ? this.rightPadding : 0.0f);
    }

    public final float getLineTop(int i2) {
        return this.layout.getLineTop(i2) + (i2 == 0 ? 0 : this.topPadding);
    }

    public final float getLineBottom(int i2) {
        if (i2 != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            return this.topPadding + this.layout.getLineBottom(i2) + (i2 == this.lineCount + (-1) ? this.bottomPadding : 0);
        }
        return this.layout.getLineBottom(i2 - 1) + this.lastLineFontMetrics.bottom;
    }

    public final float getLineAscent(int i2) {
        Paint.FontMetricsInt fontMetricsInt;
        return (i2 != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineAscent(i2) : fontMetricsInt.ascent;
    }

    public final float getLineBaseline(int i2) {
        return this.topPadding + ((i2 != this.lineCount + (-1) || this.lastLineFontMetrics == null) ? this.layout.getLineBaseline(i2) : getLineTop(i2) - this.lastLineFontMetrics.ascent);
    }

    public final float getLineDescent(int i2) {
        Paint.FontMetricsInt fontMetricsInt;
        return (i2 != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineDescent(i2) : fontMetricsInt.descent;
    }

    public final float getLineHeight(int i2) {
        return getLineBottom(i2) - getLineTop(i2);
    }

    public final float getLineWidth(int i2) {
        return this.layout.getLineWidth(i2);
    }

    public final int getLineStart(int i2) {
        return this.layout.getLineStart(i2);
    }

    public final int getLineEnd(int i2) {
        return this.layout.getEllipsisStart(i2) == 0 ? this.layout.getLineEnd(i2) : this.layout.getText().length();
    }

    public final int getLineVisibleEnd(int i2) {
        if (this.layout.getEllipsisStart(i2) == 0) {
            return getLayoutHelper().getLineVisibleEnd(i2);
        }
        return this.layout.getEllipsisStart(i2) + this.layout.getLineStart(i2);
    }

    public final boolean isLineEllipsized(int i2) {
        return TextLayout_androidKt.isLineEllipsized(this.layout, i2);
    }

    public final int getLineEllipsisOffset(int i2) {
        return this.layout.getEllipsisStart(i2);
    }

    public final int getLineEllipsisCount(int i2) {
        return this.layout.getEllipsisCount(i2);
    }

    public final int getLineForVertical(int i2) {
        return this.layout.getLineForVertical(i2 - this.topPadding);
    }

    public final int getOffsetForHorizontal(int i2, float f2) {
        return this.layout.getOffsetForHorizontal(i2, f2 + ((-1) * getHorizontalPadding(i2)));
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout textLayout, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return textLayout.getPrimaryHorizontal(i2, z2);
    }

    public final float getPrimaryHorizontal(int i2, boolean z2) {
        return getLayoutHelper().getHorizontalPosition(i2, true, z2) + getHorizontalPadding(getLineForOffset(i2));
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout textLayout, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return textLayout.getSecondaryHorizontal(i2, z2);
    }

    public final float getSecondaryHorizontal(int i2, boolean z2) {
        return getLayoutHelper().getHorizontalPosition(i2, false, z2) + getHorizontalPadding(getLineForOffset(i2));
    }

    public final int getLineForOffset(int i2) {
        return this.layout.getLineForOffset(i2);
    }

    public final boolean isRtlCharAt(int i2) {
        return this.layout.isRtlCharAt(i2);
    }

    public final int getParagraphDirection(int i2) {
        return this.layout.getParagraphDirection(i2);
    }

    public final void getSelectionPath(int i2, int i3, Path path) {
        this.layout.getSelectionPath(i2, i3, path);
        if (this.topPadding == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.topPadding);
    }

    public final int[] getRangeForRect(RectF rectF, int i2, Function2<? super RectF, ? super RectF, Boolean> function2) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AndroidLayoutApi34.INSTANCE.getRangeForRect$ui_text_release(this, rectF, i2, function2);
        }
        return TextLayoutGetRangeForRectExtensions_androidKt.getRangeForRect(this, this.layout, getLayoutHelper(), rectF, i2, function2);
    }

    public final void fillLineHorizontalBounds$ui_text_release(int i2, float[] fArr) {
        float secondaryDownstream;
        float secondaryUpstream;
        int lineStart = getLineStart(i2);
        int lineEnd = getLineEnd(i2);
        if (fArr.length < (lineEnd - lineStart) * 2) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2".toString());
        }
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        int i3 = 0;
        boolean z2 = getParagraphDirection(i2) == 1;
        while (lineStart < lineEnd) {
            boolean zIsRtlCharAt = isRtlCharAt(lineStart);
            if (z2 && !zIsRtlCharAt) {
                secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(lineStart);
                secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(lineStart + 1);
            } else if (z2 && zIsRtlCharAt) {
                secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(lineStart);
                secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(lineStart + 1);
            } else if (zIsRtlCharAt) {
                secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(lineStart);
                secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(lineStart + 1);
            } else {
                secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(lineStart);
                secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(lineStart + 1);
            }
            fArr[i3] = secondaryDownstream;
            fArr[i3 + 1] = secondaryUpstream;
            i3 += 2;
            lineStart++;
        }
    }

    public final void fillBoundingBoxes(int i2, int i3, float[] fArr, int i4) {
        float secondaryDownstream;
        float secondaryUpstream;
        int length = getText().length();
        if (i2 < 0) {
            throw new IllegalArgumentException("startOffset must be > 0".toString());
        }
        if (i2 >= length) {
            throw new IllegalArgumentException("startOffset must be less than text length".toString());
        }
        if (i3 <= i2) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
        }
        if (i3 > length) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
        }
        if (fArr.length - i4 < (i3 - i2) * 4) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
        }
        int lineForOffset = getLineForOffset(i2);
        int lineForOffset2 = getLineForOffset(i3 - 1);
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        while (true) {
            int lineStart = getLineStart(lineForOffset);
            int lineEnd = getLineEnd(lineForOffset);
            int iMin = Math.min(i3, lineEnd);
            float lineTop = getLineTop(lineForOffset);
            float lineBottom = getLineBottom(lineForOffset);
            boolean z2 = getParagraphDirection(lineForOffset) == 1;
            for (int iMax = Math.max(i2, lineStart); iMax < iMin; iMax++) {
                boolean zIsRtlCharAt = isRtlCharAt(iMax);
                if (z2 && !zIsRtlCharAt) {
                    secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(iMax);
                    secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(iMax + 1);
                } else if (z2 && zIsRtlCharAt) {
                    secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(iMax);
                    secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(iMax + 1);
                } else if (!z2 && zIsRtlCharAt) {
                    secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(iMax);
                    secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(iMax + 1);
                } else {
                    secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(iMax);
                    secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(iMax + 1);
                }
                fArr[i4] = secondaryDownstream;
                fArr[i4 + 1] = lineTop;
                fArr[i4 + 2] = secondaryUpstream;
                fArr[i4 + 3] = lineBottom;
                i4 += 4;
            }
            if (lineForOffset == lineForOffset2) {
                return;
            } else {
                lineForOffset++;
            }
        }
    }

    public final RectF getBoundingBox(int i2) {
        float secondaryHorizontal;
        float secondaryHorizontal2;
        int lineForOffset = getLineForOffset(i2);
        float lineTop = getLineTop(lineForOffset);
        float lineBottom = getLineBottom(lineForOffset);
        boolean z2 = getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = this.layout.isRtlCharAt(i2);
        if (z2 && !zIsRtlCharAt) {
            secondaryHorizontal = getPrimaryHorizontal(i2, false);
            secondaryHorizontal2 = getPrimaryHorizontal(i2 + 1, true);
        } else if (z2 && zIsRtlCharAt) {
            secondaryHorizontal2 = getSecondaryHorizontal(i2, false);
            secondaryHorizontal = getSecondaryHorizontal(i2 + 1, true);
        } else if (zIsRtlCharAt) {
            secondaryHorizontal2 = getPrimaryHorizontal(i2, false);
            secondaryHorizontal = getPrimaryHorizontal(i2 + 1, true);
        } else {
            secondaryHorizontal = getSecondaryHorizontal(i2, false);
            secondaryHorizontal2 = getSecondaryHorizontal(i2 + 1, true);
        }
        return new RectF(secondaryHorizontal, lineTop, secondaryHorizontal2, lineBottom);
    }

    public final void paint(Canvas canvas) {
        if (canvas.getClipBounds(this.rect)) {
            int i2 = this.topPadding;
            if (i2 != 0) {
                canvas.translate(0.0f, i2);
            }
            TextAndroidCanvas textAndroidCanvas = TextLayout_androidKt.SharedTextAndroidCanvas;
            textAndroidCanvas.setCanvas(canvas);
            this.layout.draw(textAndroidCanvas);
            int i3 = this.topPadding;
            if (i3 != 0) {
                canvas.translate(0.0f, (-1) * i3);
            }
        }
    }

    public final boolean isFallbackLinespacingApplied$ui_text_release() {
        if (this.isBoringLayout) {
            BoringLayoutFactory boringLayoutFactory = BoringLayoutFactory.INSTANCE;
            Layout layout = this.layout;
            Intrinsics.checkNotNull(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return boringLayoutFactory.isFallbackLineSpacingEnabled((BoringLayout) layout);
        }
        StaticLayoutFactory staticLayoutFactory = StaticLayoutFactory.INSTANCE;
        Layout layout2 = this.layout;
        Intrinsics.checkNotNull(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return staticLayoutFactory.isFallbackLineSpacingEnabled((StaticLayout) layout2, this.fallbackLineSpacing);
    }
}
