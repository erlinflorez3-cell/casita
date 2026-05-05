package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.truncatedMessage(InvalidProtocolBufferException.java:70)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.refillBuffer(CodedInputStream.java:1094)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.ensureAvailable(CodedInputStream.java:1080)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readRawBytesSlowPath(CodedInputStream.java:1215)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readBytes(CodedInputStream.java:529)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:244)
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
/* JADX INFO: compiled from: Paragraph.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĥ\u0014D57\u001eq\u007fR܀kŞ\fA\u00149\u0013.H\u007f*, |\u000ffp>8DsN6RY/\u0017k\nR,[:qK;[\u001d\u0006\"\u0017OVʴon`Z\u0013¼\u0017\u0006$\u000br,OW\u0001](\u000f:BuR;M\u0006=A`z8\r H\"@y\u000b\u0004\"*^\u0010~ٙKK\"\u00128@v@Z\rc\u0005\"Ň\u000e>6\u0001&\\mN>H\u0003]Bǂ+\u0003\u007fBVϋg0\u0013M\u0015Ͽ\\'#vi\u001e1A?5+%[\u0003\rTc?\u0019?yܵ\u000b]=ݐ[I\"V~\u0003\u000e/-+})\u000ev4y\u001dQ\u000f*W/]\u0003cP<H(\u0001\u0002\fJ%&\u0006UUtQָeڜԧ7vxuNsJlP$\u0013ad<U\u0004AQQ\u001b\u0015^(_a\\E#\u001d\rL91r/\u0002l\u000e\u000f\"ax@_?yX=vd:]K\u0014\u001cp\u0011\u000fp(x]\u000eX\u0014\u0011\\\u001cU;i_;!\u001a\u000fxHu!\u001d`\u0017T0v\u0011N0\u001a.7X\u000e<^R\u0011\u001dk~a\u001fPY[*\u0002\u001f}6\u0018P`\u0006h9%>[\u0016\r2\u0003[\f\"%]sg]|\u0018&Wgkc;Wc\u001e\u0011jvB@\u0003\u0007Mftrk\f\tiX&@n\u0003\u0010&\t\u000brT!@p\n\u001cb9a\u001djG`\u0003LG\b!Qmh\u001c(~\u00038T\u0007wP\r\t/]#\u00158u\u0007}D|\u000f']E_a1&\u0004//XE1\u00154\f\u007ful|KZ\u0019.u\u0004\tf:bG_eU\u0013=\fY6\u0010Y]L!r\u0018qZ5\t4\u0012\u000fim^k\u0016\u0017\t,\u000fw\u0011s\u001d%0/vrQ\r\u0015\u0004\b\u000e^zup\u001b/$VW,\u001bYj[h\u0001\u0013Y6%/+h!߿,ξے!\u0018}P=R*kw.Fy\u00114Vxs*DcD|)u&HIwaY-~R(zDZH\u0019\u00058F\u0017v%3vN+\u0015\u001f`[NG}\u0015%\\\u0011~\u001bs:A\u0006.8<%BsqDDbQl)M\u000204\u0012ү[֥Ί\u0013\f\u0011E?9Z7KknW\u0011'`\n\u0002>NAioK`˸#3˯;ފդGVoR\u001eHHTm]/2ptkZ\u001c\u0001\u0011\\\u0005UK\u0005\u000e9/y\u0019~=ON|C\u0002\u001dmt&_g@Sk\u001d7n\u001bU\u0005f3\u007f\\Tg X`\u0007\u000bS3[K\u001852\u001eYuqo\u001a\u00100~3AFsiY\u0017_\u0005\nv\rkc|?'\u0018lR\\}A~)YT`õ\u000eԥĢStu@;+\u00172E\u00132\u0001E`Y\u000b\u001aM{FI~6;3=WJ,'*8\u0004C\u0004\b.u?\u0006\u000b \u000b.>n\u0010])\u0012.s,a0aYtݹ\u0003˸ؠxt\u0010\u0010\u0016\u0019\u0018RAQ+^\b\b(%NwCl4\u0014{n~\nqL{n\u0004k3n7V\bDER3\bU$^\u001b^ZHhk\"n\u0010.lE.%6\u0016<A\u0012eb\u0017K\u001cUa\r9\u000b\u0004*\u0010\u000evv̭|Υݺy\u0006086y\ff[>|\t\u000bm\u0019Ň\u0010߿n,|v\u0012+\"\u007fOXl\u0015+4twtҲ1ё\u001d#s\u000fMf\u0015\u000b\u0016Y4)IRm \u000eן\rÃ,z)\u0005@k\u0003\u0007zR\u0017|\u0018gZ2\u001dÎ?Ն+]<oj\u000e4R\u0016HP\u0014D\u0011<\u001e\u0006\u058b:ԯB`2\u001eA_APi!\u000f%P\u0006\u001e\foǡlܱW)B\u0003\u0003\u0012\u001bFJAyL\f7!(\u0006ސq\u0088[jS';xZ.\\\u001as^\u0017UsZ\u001fcBHc[L\u000f,˕\u0002ˌ#(<\b{:\u000e]\u0002X8xt@\u0005x.Ǐ(ń:r\\%M\u0007\u0007zԄ+h}Ʈc[Ȩ4P\u0003\u0017\u001fܴZX,t\u0007Klp{\u0011c;Dƒ;uҩ-4"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:C", "", "2hS\u0012k*>S\u0018fvq\u0013\u0001\u0012/s", "", "5dc\u0011\\+\u001ef\u0017~z]\u0014x\u001c\u0016i\t(\n", "u(I", "4ha@g\t:a\u0019\u0006~g,", "", "5dc\u0013\\9Lbuz\t^3\u0001\u0012/", "u(5", "6dX4[;", "5dc\u0015X0@V(", ":`bA5(LS \u0003\u0004^", "5dc\u0019T:M0\u0015\rze0\u0006\t", ":h]266N\\(", "", "5dc\u0019\\5>1#\u000f\u0004m", "u(8", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "5dc\u001aT?\"\\(\f~g:\u0001\u0007!i~7~", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "5dc\u001a\\5\"\\(\f~g:\u0001\u0007!i~7~", ">kP0X/HZ\u0018~\bK,z\u0018=", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "5dc\u001d_(<S\u001c\t\u0002],\nu/c\u000f6", "u(;7T=:\u001d)\u000e~euc\r=tU", "EhSA[", "5dc$\\+MV", "4h[956N\\\u0018\u0003\u0004`\t\u0007\u001c/s", "", "@`]4X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "/qa.l", "", "/qa.l\u001aMO&\u000e", "4h[956N\\\u0018\u0003\u0004`\t\u0007\u001c/sGz|A\u0006ga3", "uIJ\u0013<o/", "5dc\u000f\\+B@)\bYb9|\u0007>i\n1", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#j Ew\u001d?MB*kG-sln9\u0005r0X\u007f|", "=eU@X;", "5dc\u000fb<GR\u001d\b|;6\u0010", "5dc\u0010h9L]&kz\\;", "5dc\u0015b9Bh#\b\nZ3g\u0013=i\u000f,\u0006I", "CrT\u001de0FO&\u0013Yb9|\u0007>i\n1", "5dc\u0019\\5>0\u0015\rze0\u0006\t", ":h]2<5=S,", "5dc\u0019\\5>0#\u000e\nh4", "5dc\u0019\\5>3\"}", "Dhb6U3>3\"}", "5dc\u0019\\5>4#\fd_-\u000b\t>", "5dc\u0019\\5>4#\fk^9\f\r-a\u0007\u0013\u0006N\u0005&\u001bQx", "DdaA\\*:Z", "5dc\u0019\\5>6\u0019\u0003|a;", "5dc\u0019\\5>:\u0019\u007f\n", "5dc\u0019\\5>@\u001d\u0001}m", "5dc\u0019\\5>A(z\bm", "5dc\u0019\\5>B#\n", "5dc\u0019\\5>E\u001d}\na", "5dc\u001cY-LS(_\u0005k\u0017\u0007\u00173t\u00042\u0005", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5dc\u001cY-LS(_\u0005k\u0017\u0007\u00173t\u00042\u0005\b\u0007^eN[X$", "uI\u0018\u0016", "5dc\u001dT9:U&z\u0006a\u000b\u0001\u0016/c\u000f,\u0006I", "5dc\u001dT;A4#\fgZ5~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "AsP?g", "3mS", "5dc\u001fT5@Sy\t\bK,z\u0018", "@dRA", "5qP;h3:`\u001d\u000e\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u0017fy)Gt\u0012;QROA", "7mR9h:B]\"l\nk(\f\t1y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u0019b{'G{\u001a8V1Jx0-\u0015ju\u000f", "5dc\u001fT5@Sy\t\bK,z\u0018v8GxXH\\z", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFCy\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011\\RukR\u0006L]\u0001Z!]\u000f\u0016\u0003`Q2rN@\r\u00179E\u0011;j\u0015aYr", "5dc$b9=0#\u000f\u0004](\n\u001d", "5dc$b9=0#\u000f\u0004](\n\u001dv-\u0005;M%a%", "uH\u0018\u0017", "7r;6a,\u001eZ \u0003\u0006l0\u0012\t.", ">`X;g", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "/k_5T", "AgP1b>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001fA\u007fk", "BdgA7,<]&z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t.KMHgC\"\u001fq7", "2qPDF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003wu@\u00079", "0kT;W\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", ">`X;gsA\\hmZq.", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7y)Hi$\u00044?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\ti\u0012iO'D%\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYW}^wN%sI]]\b\u0011/H^)n\u001e5\u0004XC91\u001eu\u0018.2N8\u0012\u0007]\u001fr\u001c\nk1V\u0019\u000eGmL|oME9D<\b6}Ky\u0002\u001f.gx5}\u0003j035q\u000fOf+\b\\\u0003\u001d7fO'oF@\\AX_\u0001oB\fvh`\u0015\ntC/#pe-'\u001c\u0003o\u0005jIh_V\u001b\u0016v", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", ">`X;gs+>!rZd2", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7y)Hi$\u00042*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001ctJ\u0010\u001d]\u0012L9Vr\\=#xV\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\n\u0019?P){U#m\t[HE,\u0019d\u001fn{\\8D1\u0010\u0001\u001d%q&qz", ">`X;gs%5hKN<\u0010", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7y)Hi$\u00042*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001ctJ\u0010\u001d]\u0012L9Vr\\=#xV\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\n\u0019?P){U#m\t[HE,\u0019d\u001fn{\\8D1\u0010\u0001\u001d%q&\u0015\u0006\u0005R\u001e|Vxz1E#\u0003C.Lm%VI9WIp2\"Oy\u0006[1ep=\u0003+\u000e?*\u007fC\u0012Gy\u0006Mr\u007f\u0015\u0002@\u0005\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iEu2?]|\u000b3z\u00120Z?Fn\n", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface Paragraph {
    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q */
    void mo5954fillBoundingBoxes8ffj60Q(long j2, float[] fArr, int i2);

    ResolvedTextDirection getBidiRunDirection(int i2);

    Rect getBoundingBox(int i2);

    Rect getCursorRect(int i2);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int i2, boolean z2);

    float getLastBaseline();

    float getLineBaseline(int i2);

    float getLineBottom(int i2);

    int getLineCount();

    int getLineEnd(int i2, boolean z2);

    int getLineForOffset(int i2);

    int getLineForVerticalPosition(float f2);

    float getLineHeight(int i2);

    float getLineLeft(int i2);

    float getLineRight(int i2);

    int getLineStart(int i2);

    float getLineTop(int i2);

    float getLineWidth(int i2);

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M */
    int mo5956getOffsetForPositionk4lQ0M(long j2);

    ResolvedTextDirection getParagraphDirection(int i2);

    Path getPathForRange(int i2, int i3);

    List<Rect> getPlaceholderRects();

    /* JADX INFO: renamed from: getRangeForRect-8-6BmAI */
    long mo5957getRangeForRect86BmAI(Rect rect, int i2, TextInclusionStrategy textInclusionStrategy);

    float getWidth();

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs */
    long mo5958getWordBoundaryjx7JFs(int i2);

    boolean isLineEllipsized(int i2);

    /* JADX INFO: renamed from: paint-LG529CI */
    void mo5959paintLG529CI(Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2);

    /* JADX INFO: renamed from: paint-RPmYEkk */
    void mo5960paintRPmYEkk(Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration);

    /* JADX INFO: renamed from: paint-hn5TExg */
    void mo5961painthn5TExg(Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2);

    /* JADX INFO: compiled from: Paragraph.android.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
    }

    static /* synthetic */ int getLineEnd$default(Paragraph paragraph, int i2, boolean z2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        return paragraph.getLineEnd(i2, z2);
    }

    /* JADX INFO: renamed from: paint-LG529CI$default */
    static /* synthetic */ void m5996paintLG529CI$default(Paragraph paragraph, Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
        Shadow shadow2 = shadow;
        int iM4736getDefaultBlendMode0nO6VwU = i2;
        TextDecoration textDecoration2 = textDecoration;
        long jM4214getUnspecified0d7_KjU = j2;
        if (obj == null) {
            if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
            }
            if ((i3 + 4) - (i3 | 4) != 0) {
                shadow2 = null;
            }
            if ((i3 + 8) - (i3 | 8) != 0) {
                textDecoration2 = null;
            }
            DrawStyle drawStyle2 = (i3 + 16) - (i3 | 16) == 0 ? drawStyle : null;
            if ((i3 & 32) != 0) {
                iM4736getDefaultBlendMode0nO6VwU = DrawScope.Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            paragraph.mo5959paintLG529CI(canvas, jM4214getUnspecified0d7_KjU, shadow2, textDecoration2, drawStyle2, iM4736getDefaultBlendMode0nO6VwU);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
    }

    /* JADX INFO: renamed from: paint-RPmYEkk$default */
    static /* synthetic */ void m5997paintRPmYEkk$default(Paragraph paragraph, Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, int i2, Object obj) {
        Shadow shadow2 = shadow;
        long jM4214getUnspecified0d7_KjU = j2;
        if (obj == null) {
            if ((i2 + 2) - (2 | i2) != 0) {
                jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
            }
            if ((i2 + 4) - (4 | i2) != 0) {
                shadow2 = null;
            }
            paragraph.mo5960paintRPmYEkk(canvas, jM4214getUnspecified0d7_KjU, shadow2, (i2 & 8) == 0 ? textDecoration : null);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
    }

    /* JADX INFO: renamed from: paint-hn5TExg$default */
    static /* synthetic */ void m5998painthn5TExg$default(Paragraph paragraph, Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
        TextDecoration textDecoration2 = textDecoration;
        int iM4736getDefaultBlendMode0nO6VwU = i2;
        Shadow shadow2 = shadow;
        float f3 = f2;
        if (obj == null) {
            if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                f3 = Float.NaN;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                shadow2 = null;
            }
            if ((i3 + 16) - (i3 | 16) != 0) {
                textDecoration2 = null;
            }
            DrawStyle drawStyle2 = (i3 + 32) - (i3 | 32) == 0 ? drawStyle : null;
            if ((i3 + 64) - (i3 | 64) != 0) {
                iM4736getDefaultBlendMode0nO6VwU = DrawScope.Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            paragraph.mo5961painthn5TExg(canvas, brush, f3, shadow2, textDecoration2, drawStyle2, iM4736getDefaultBlendMode0nO6VwU);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
    }
}
