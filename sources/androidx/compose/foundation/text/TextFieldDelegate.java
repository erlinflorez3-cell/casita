package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: TextFieldDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0005GيFéLC/\"Z\u00110\u0006g+<ӧHeV.ʈW,"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=.G;r3|\u0015oa;\u0003r,$", "", "u(E", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: TextFieldDelegate.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯĻ\u0014D57\u001eq\u007fR܀kt\nA\u000e0!.Jչ*,(w\u000ffp;8DsH6ɟ[*%k\u0004é,[:qK;[\u001b\u0006\"\u001fOVʴon`Z\u0013¼\u0017\u0006,xrߚQU\u000f]\u001a\u000f8Hw?IMw=Gf|Ȃ\r H\"@ц\r\u00010*PƵ~zYK\u0014\u00126Cx:h\rUĨ\"\u0012\u001c>(ҵ&\\uW>Hr^B/9\u0003qĩV'u0\u0005M\u0013G\\'\u001b\u0015i\u001eA@?5\u001b'[\u0003\u001dRcΪ\u000b?\b=\rؒ/'AI{W<[\b\u0014++W\rsr.\\\u000bUf϶(AՒ\u0014K~\rh|\u0001{Ɂ@\u0004\u001c\u0006of<.2f6\u0010cx\u0001VXP0br\u0004\tfN\u0017S\u0002Ɗ*ݍӸjSgA'U\u007fL\u0013\u00156#/wQ_b\u0018x\u0015I_(U?]X=v[:]K{\u001cp\u0011\u0006Z\b>V\u0018/*\u0015^\u001b3Gs9Q2\u001c\u0006VV\u007fv3s\u0019Wwf`@P\u0004F;8\u001f$Zr{KjĥSА¯\u0015O\"l\u0015\u0017PK.v\u0010<O.@R]r\u0002j{h:)=\u0002OY\u001do>[GnK5\u007ft@e`\t,?ju5\\t^k\f\tqn\"ŮGКݻ{}Jk\u001a1z\u0006\u007f;L>A\u001bl\u0015v$.DQ|7\u0001jj ~\u0003FR#\u001a(\u0003+\u0019P\u000b\u0014 k\u0007mD|\u000fG]E_[1&\u0004I\u0019<\u0003#\u0015'\f\u0002]fzZ\u0013kخtɝދ$\u0018 b_Y\u0006V\u001d*A206uP\u0001qiM@4+\u0001\b1Sh\\\u000b8n~>xjxb\u0005\u001b0#vrQ5\u0015\u0004\b\u0010^zu\u0013\u0005\u000finar1\u000blRF\r\u001d\u001fL6Gnݕ\u000153uoL$+,/Cj\u000em}\\\u0012b=U%i\u0012`{\u0016\u001e\u0018\u0002m@qPUi\u0001N\"Ry\u0013DXj&\u0011p@z\fάLAj)\u001fw[DG}\u0015\u0010\\\u0017~\u0011s@#q\u000e4\\\u001cX/s\u0002\"\u0013[%?\u0003\u0004w{$ch\u001bL\u001f\n9\tAp\"\u001ck)\u0005\u000f\u0013\u000f>C\f\u001aL@i\u0012K;ʢ(42zP^Q\u0014\u0002\u0006>*0JmO/2p5kZ\u001c`\u0011\\\u0005U5dS\u00159*/4?7,;M131vd=\u001aJ\rc\u001f\u0019\u001b\u0019\\\u000fh5+r]gRXh\u000fO]iSK\u001262\r9o{o:AF4cAɓ\u001f9WW(J>&#U\u0013}\u0015z 'jNPj/~\u000b\u001aT\n=\u0018IS\u0001$z-z\u0004(;Q\\\u0019\u0017rl7\u001c\u000b\u001a^'=\bE-kVz\u00167{\u0006\\i580.k\u001c\u00011^g\u000e\u0015Om\u001dJ\u0016 \u001f\u00119O\u0012ц$\u00044\u0013=7\u0018w 6}\u000bc\u0006!)qk&lp+9~\u001eBy5)\u000eq!{n\u0004@3j?f\u0012n[aM\u00195\u0004F\u001fh\\J\u0011\u0002-h\u0013\u0010\u0014C/MmNaѣ\u000f˖ʍlrq\u001di[sZyyy1^[N\u0002-(\u000e\u0004X\u0004X\u0019I'e>\u0013\u0016\rpPg&^\u00199\u0015x\u001a;,|-\u0015%\u0010ӥ8FxoҎ/<!\"aǎc\u000f\u0006ˀI\u001c"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=.G;r3|\u0015oa;\u0003r,\rT1OWJ5`\\{\u0013", "", "u(E", "/o_9l\nH[$\t\tb;\u0001\u00138D\u007f&\u0006M|&\u001bQx", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l-3v$/WPCk3\r\u0015{p\u000f", "1n\\=b:Bb\u001d\t\u0004K(\u0006\u000b/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "BqP;f-H`!~y", "/o_9l\nH[$\t\tb;\u0001\u00138D\u007f&\u0006M|&\u001bQxU\u000eC\u0003ACo\u007f", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri&z\u00127[DEx<\u001e\u0014WaL\u00169o5r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b3nWFh\f5T\u0012J2o\u0019\u0012\u0017CkzO^\u0010Fh\u0015\tP~", "2qPD", "", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "Ad[2V;B]\"i\b^=\u0001\tAH\u0004*~G\u0005\u0019\u001aV\\\nEx%", "2d[2g0H\\\u0004\fzo0|\u001b\u0012i\u0002+\u0003D\u0003\u001a&4k\u0017>v", "=eU@X;&O$\n~g.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#g!8{\u0016=5?Fv8'\u0017>", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "6hV5_0@V(ivb5\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "Ad[2V;B]\"[v\\2~\u00169u\t'YJ\b!$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "2qPD \u0018\nd%^K)j}\u0013?n~$\u000bD\u000b \u0011To\u0015<r35", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7y)Hi$\u00044?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&arP#[^\u0017Y;\u001cNHA7}%;\u001f\u000f+:}Bx\u0001azr\u001cfyAc\u001aKx(??3pQcmy\u0011QI,9d\u001fnf`CE4#;\u0003\u001ci^.\u0019cO\u001c}V\u0003i=.\u0015\u000471HqZY\u000fm_D\u007f1-KE\b\u0016{gt>\u0004vr4=EK\u0001_q(MKx#<cP|\r2E\u0012LUgt\u007f\b\fr'l\u0012\u001cb~A\u001d/gpD\u001a\na\u0015i~L[\u0005@a[#\r`", "2qPD;0@V \u0003|a;", "@`]4X", ">`X;g", "2qPD;0@V \u0003|a;Do/-\u000b8\u0005 ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7y)Hi$\u00042*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001c\u0002='!$\u0012W6\u001d\u0014#+%oR7.o(T\r?q\u0003a|\n>i}LZ\u000fZC\u0013\u007fI4rTY)\nK\u000bTb=sUN\u001doI! ({)*UP<\u001a\u0003bfYN\u0003ftQ\u001dyKm<wcQO}U\u0006\u0005+hM\ts\u001d5\\r9>\u0018\u007f83E:H<", ":`h<h;", "\u001aj^A_0G\u001d\b\f~i3|^", "", "BdgA7,ES\u001bz\n^", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=,CBk6\u001a$h7", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ">qTCE,Lc \u000ei^?\f", ":`h<h;\u0006Mx\u0005aXspG0o\u00101z<\u0010\u001b!Pi\u001b<}%1g}", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001\\\u0016A\\\";r4 \u0011wa\u000fkJ(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011NiJ(}\u000e\u001e\u001b\u001c6Y\u0011\u001al\u000e\f\u0014\u001d9ty\u0018=\fPx\"\u007fE({\u0010Wi\u0002RKSbst\u0010),\\MIm\u0003q,*OLB\u0014\fb}r`\nnv\u001d\\a>.Mt_O\u000f^b@\u007f.\u001f!", "<nc6Y@\u001f]\u0017\u000f\t^+i\t-t", ":`h<h;\u001c]#\fyb5x\u0018/s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "BdgA<5Ic(lzl:\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|y7XSJY4,#lkB\\", "6`b\u0013b*Na", "", "<nc6Y@\u001f]\u0017\u000f\t^+i\t-t>)\u0006P\n\u0016\u0013Vs\u0018Ep25`}\u001cEm", "=m19h9", "3cXAC9HQ\u0019\r\th9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|\u0001;WA;yB(\">", "=mE._<>1\u001cz\u0004`,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "=m19h9|T#\u000f\u0004](\f\r9ny5{G\u0001\u0013%G", "=m41\\;\u001c]!\u0007vg+", "=ob", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|s8UK7t3s", "Adb@\\6G", "=m41\\;\u001c]!\u0007vg+;\n9u\t'wO\u0005! A|\u000eCv!CY", "=m5<V<L", "BdgA<5Ic(lzk=\u0001\u0007/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|y7XSJY4+&l_9\\", "7lT\u001cc;B]\"\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7W!=QMDy\n", "=m8:X\b<b\u001d\t\u0004I,\n\n9r\b(z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", "=m5<V<L\u0012\u001a\t\u000bg+x\u00183o\t\"\t@\b\u0017\u0013Uo", "@dbAT9M7\"\n\u000bm", "@dbAT9M7\"\n\u000bmj}\u0013?n~$\u000bD\u000b \u0011To\u0015<r35", "Adc\u0010h9L]&h{_:|\u0018", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=4?OuD-\u0002hoI\u000er\u0017[\u0001:[\"", "Adc\u0010h9L]&h{_:|\u0018vUf;\u0005BKvUHy\u001eEu!D]\b)1z\u00165M?Ik", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u0005.`R\"gH(%wN9\u0015s3]a4Q_b\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuX\u0002NwJ\u0010\u001f\u0019Ey:\"U\u0014Vd\"\u007f?)vTclO.=Na7n\u0010^0&8D,\u001f{'\u001b2`2S\u000bS$\u0002\u001c}prW(D\"%?{[U-k`Gx0!!b}\u001cA_x4>2\u0015<s7t\u000eIv\u001cHg\u0007^\rlJ%5:F\u001c\u000b!'f", "CoS.g,-S,\u000eaZ@\u0007\u0019>R\u007f6\fG\u0010", "BdgA90>Z\u0018ove<|", "CoS.g,-S,\u000eaZ@\u0007\u0019>R\u007f6\fG\u0010U\u0018Q\u007f\u0017;r49c\u0007\u001aDm\u001d.IQ;", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: layout-_EkL_-Y$foundation_release$default */
        public static /* synthetic */ Triple m1402layout_EkL_Y$foundation_release$default(Companion companion, TextDelegate textDelegate, long j2, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
                textLayoutResult = null;
            }
            return companion.m1405layout_EkL_Y$foundation_release(textDelegate, j2, layoutDirection, textLayoutResult);
        }

        @JvmStatic
        /* JADX INFO: renamed from: layout-_EkL_-Y$foundation_release */
        public final Triple<Integer, Integer, TextLayoutResult> m1405layout_EkL_Y$foundation_release(TextDelegate textDelegate, long j2, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
            TextLayoutResult textLayoutResultM1392layoutNN6EwU = textDelegate.m1392layoutNN6EwU(j2, layoutDirection, textLayoutResult);
            return new Triple<>(Integer.valueOf(IntSize.m6808getWidthimpl(textLayoutResultM1392layoutNN6EwU.m6096getSizeYbymL2g())), Integer.valueOf(IntSize.m6807getHeightimpl(textLayoutResultM1392layoutNN6EwU.m6096getSizeYbymL2g())), textLayoutResultM1392layoutNN6EwU);
        }

        @JvmStatic
        /* JADX INFO: renamed from: draw-Q1vqE60$foundation_release */
        public final void m1404drawQ1vqE60$foundation_release(Canvas canvas, TextFieldValue textFieldValue, long j2, long j3, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint paint, long j4) {
            TextLayoutResult textLayoutResult2 = textLayoutResult;
            Canvas canvas2 = canvas;
            if (!TextRange.m6117getCollapsedimpl(j2)) {
                paint.mo4057setColor8_81llA(j4);
                m1401drawHighlightLepunE(canvas2, j2, offsetMapping, textLayoutResult2, paint);
            } else if (!TextRange.m6117getCollapsedimpl(j3)) {
                Color colorM4168boximpl = Color.m4168boximpl(textLayoutResult2.getLayoutInput().getStyle().m6153getColor0d7_KjU());
                if (colorM4168boximpl.m4188unboximpl() == 16) {
                    colorM4168boximpl = null;
                }
                long jM4188unboximpl = colorM4168boximpl != null ? colorM4168boximpl.m4188unboximpl() : Color.Companion.m4204getBlack0d7_KjU();
                paint.mo4057setColor8_81llA(Color.m4177copywmQWz5c$default(jM4188unboximpl, Color.m4180getAlphaimpl(jM4188unboximpl) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                canvas2 = canvas2;
                textLayoutResult2 = textLayoutResult2;
                m1401drawHighlightLepunE(canvas2, j3, offsetMapping, textLayoutResult2, paint);
            } else if (!TextRange.m6117getCollapsedimpl(textFieldValue.m6370getSelectiond9O1mEE())) {
                paint.mo4057setColor8_81llA(j4);
                m1401drawHighlightLepunE(canvas2, textFieldValue.m6370getSelectiond9O1mEE(), offsetMapping, textLayoutResult2, paint);
            }
            TextPainter.INSTANCE.paint(canvas2, textLayoutResult2);
        }

        /* JADX INFO: renamed from: drawHighlight-Le-punE */
        private final void m1401drawHighlightLepunE(Canvas canvas, long j2, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint paint) {
            int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m6121getMinimpl(j2));
            int iOriginalToTransformed2 = offsetMapping.originalToTransformed(TextRange.m6120getMaximpl(j2));
            if (iOriginalToTransformed != iOriginalToTransformed2) {
                canvas.drawPath(textLayoutResult.getPathForRange(iOriginalToTransformed, iOriginalToTransformed2), paint);
            }
        }

        @JvmStatic
        public final void notifyFocusedRect$foundation_release(TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, TextInputSession textInputSession, boolean z2, OffsetMapping offsetMapping) {
            Rect rect;
            if (z2) {
                int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m6120getMaximpl(textFieldValue.m6370getSelectiond9O1mEE()));
                if (iOriginalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
                    rect = textLayoutResult.getBoundingBox(iOriginalToTransformed);
                } else if (iOriginalToTransformed != 0) {
                    rect = textLayoutResult.getBoundingBox(iOriginalToTransformed - 1);
                } else {
                    rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m6807getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
                }
                long jMo5525localToRootMKHz9U = layoutCoordinates.mo5525localToRootMKHz9U(OffsetKt.Offset(rect.getLeft(), rect.getTop()));
                textInputSession.notifyFocusedRect(RectKt.m3977Recttz77jQw(OffsetKt.Offset(Offset.m3937getXimpl(jMo5525localToRootMKHz9U), Offset.m3938getYimpl(jMo5525localToRootMKHz9U)), SizeKt.Size(rect.getWidth(), rect.getHeight())));
            }
        }

        @JvmStatic
        public final void updateTextLayoutResult$foundation_release(TextInputSession textInputSession, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy) {
            LayoutCoordinates decorationBoxCoordinates;
            final LayoutCoordinates innerTextFieldCoordinates = textLayoutResultProxy.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates == null || !innerTextFieldCoordinates.isAttached() || (decorationBoxCoordinates = textLayoutResultProxy.getDecorationBoxCoordinates()) == null) {
                return;
            }
            textInputSession.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResultProxy.getValue(), new Function1<Matrix, Unit>() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Matrix matrix) {
                    m1407invoke58bKbWc(matrix.m4430unboximpl());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
                public final void m1407invoke58bKbWc(float[] fArr) {
                    if (innerTextFieldCoordinates.isAttached()) {
                        LayoutCoordinatesKt.findRootCoordinates(innerTextFieldCoordinates).mo5529transformFromEL8BTi8(innerTextFieldCoordinates, fArr);
                    }
                }
            }, SelectionManagerKt.visibleBounds(innerTextFieldCoordinates), innerTextFieldCoordinates.localBoundingBoxOf(decorationBoxCoordinates, false));
        }

        @JvmStatic
        public final void onEditCommand$foundation_release(List<? extends EditCommand> list, EditProcessor editProcessor, Function1<? super TextFieldValue, Unit> function1, TextInputSession textInputSession) {
            TextFieldValue textFieldValueApply = editProcessor.apply(list);
            if (textInputSession != null) {
                textInputSession.updateState(null, textFieldValueApply);
            }
            function1.invoke(textFieldValueApply);
        }

        @JvmStatic
        /* JADX INFO: renamed from: setCursorOffset-ULxng0E$foundation_release */
        public final void m1406setCursorOffsetULxng0E$foundation_release(long j2, TextLayoutResultProxy textLayoutResultProxy, EditProcessor editProcessor, OffsetMapping offsetMapping, Function1<? super TextFieldValue, Unit> function1) {
            function1.invoke(TextFieldValue.m6365copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, TextRangeKt.TextRange(offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1427getOffsetForPosition3MmeM6k$default(textLayoutResultProxy, j2, false, 2, null))), (TextRange) null, 5, (Object) null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [T, androidx.compose.ui.text.input.TextInputSession] */
        @JvmStatic
        public final TextInputSession restartInput$foundation_release(TextInputService textInputService, TextFieldValue textFieldValue, final EditProcessor editProcessor, ImeOptions imeOptions, final Function1<? super TextFieldValue, Unit> function1, Function1<? super ImeAction, Unit> function12) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = textInputService.startInput(textFieldValue, imeOptions, new Function1<List<? extends EditCommand>, Unit>() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$restartInput$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends EditCommand> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<? extends EditCommand> list) {
                    TextFieldDelegate.Companion.onEditCommand$foundation_release(list, editProcessor, function1, objectRef.element);
                }
            }, function12);
            return (TextInputSession) objectRef.element;
        }

        @JvmStatic
        public final TextInputSession onFocus$foundation_release(TextInputService textInputService, TextFieldValue textFieldValue, EditProcessor editProcessor, ImeOptions imeOptions, Function1<? super TextFieldValue, Unit> function1, Function1<? super ImeAction, Unit> function12) {
            return restartInput$foundation_release(textInputService, textFieldValue, editProcessor, imeOptions, function1, function12);
        }

        @JvmStatic
        public final void onBlur$foundation_release(TextInputSession textInputSession, EditProcessor editProcessor, Function1<? super TextFieldValue, Unit> function1) {
            function1.invoke(TextFieldValue.m6365copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null));
            textInputSession.dispose();
        }

        /* JADX INFO: renamed from: applyCompositionDecoration-72CqOWE */
        public final TransformedText m1403applyCompositionDecoration72CqOWE(long j2, TransformedText transformedText) {
            int iOriginalToTransformed = transformedText.getOffsetMapping().originalToTransformed(TextRange.m6123getStartimpl(j2));
            int iOriginalToTransformed2 = transformedText.getOffsetMapping().originalToTransformed(TextRange.m6118getEndimpl(j2));
            int iMin = Math.min(iOriginalToTransformed, iOriginalToTransformed2);
            int iMax = Math.max(iOriginalToTransformed, iOriginalToTransformed2);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(transformedText.getText());
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), iMin, iMax);
            return new TransformedText(builder.toAnnotatedString(), transformedText.getOffsetMapping());
        }
    }
}
