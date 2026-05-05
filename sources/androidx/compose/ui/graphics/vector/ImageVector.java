package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\u0015\"4\u0012}\u0007njG5LeN.ZS@\u000fsڔ<$q$yّCU0}*ޛWNupvϺb\u000bQ\u0015\u000e\u0016~\u00032Nkތ{<?2pnw3v\u001a}\u0011fҚF\t.2:8(\u0006\u0011\u001e8J(v)F[\u0010 4XphU\u001dQ\u0013\u001f*\u0006l&\u0011\"jnf6vrm>=+\u001bipW7c>\u0007e\rt_7\u0011\u0005m6+nDE\u00193a\u001b\u0007\u0001jO\tEqK\u0015\u0001'U<ʁwWDjH%#Qg\r\f\u0002Vb\u0013xx\u000e=*}b\u0012\u05cb\u000ep}\t$%<2\u001fL;\u0019=;(~\b<BϢvYHА\u001a`H\u0013\tu\u0007.3\u0004K+g\u001eȑPĥߛ\u0018MѼ\u007f\r\u0015\u001e1\u0018\u0007#ai\u001cve2byi1\u007fCعGݐ͜X<ъ\bxj\u00028\u001bHI\u0006G\n'~)3Gs9Q2BȶJזk|\r\u009b\u0001UokVZr}$7B\t:[ֈh\u000bs¬lZ2,[8%\u0016\f\u0010+ \u000b\u0001˶%+\u0018ʚgjo\b[{Z<=rOY\u001dx\u0085VުՍ24Ʉg\u0018iR\u00054W>h$f\u0001\u0013j\u001adt(P=̄iݘɧzC«\u0010\u001b:?\u007f?L.7:j7\u0019\u0012,IY|7e˖l\u0016\u0007ԞK&\t\u000e2\u000bY\u0010^a\to\u0016~ͅ0\u0003hõECWZ'<š\"q<\u007f)ȶ\u001b\"~OgRfƫpA"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0012U?=k%\u001e\u0013wkF\\", "", "<`\\2", "", "2dU.h3ME\u001d}\na", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "2dU.h3M6\u0019\u0003|a;", "DhTDc6Kb\u000b\u0003ym/", "", "DhTDc6Kb{~~`/\f", "@n^A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\u007f\"rqD\\", "Bh]A66E]&", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Bh]A53>\\\u0018f\u0005],", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "/tc<@0K`#\f", "", "5d]\u0016W", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}\\!aw}Cx\rI\u0001)4lG\u001eAu!8[C\u0005{8g\u0017u]D\ng*\\@8GJ]6i\u001cc=\u0012!d\u001b08\u0017\u0015d\u0017\tR9\u001b\u0006\u000e6X\t?qJ\u0011'\u0016~nyQV\u001dPu\u001c? )iBif\t%KNp9q\u001c],fG\" !w\u0019(>\u0014\u001f", "5dc\u000eh;H;\u001d\f\bh9", "u(I", "5dc\u0011X-:c \u000e]^0~\f>-^{[EP\u0018~", "u(5", "\u0014", "5dc\u0011X-:c \u000elb+\f\fvDS\b\u0001\u0010\u0002~", "5dc\u0014X5\"RW\u000f~X9|\u0010/a\u000e(", "u(8", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001fb6M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#\u000f 5| ;\u00174;iC(\"JnC\u0017n\u0002", "5dc!\\5M0 ~\u0004]\u0014\u0007\b/-J1e\u0011q)\u0007", "\u0017", "5dc!\\5M1#\u0006\u0005ksG\b\u0001_e-k", "u(9", "\u0018", "5dc#\\,P^#\f\nA,\u0001\u000b2t", "5dc#\\,P^#\f\nP0{\u00182", "3pd._:", "=sW2e", "6`b566=S", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ImageVector {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int imageVectorCount = 0;
    private final boolean autoMirror;
    private final float defaultHeight;
    private final float defaultWidth;
    private final int genId;
    private final String name;
    private final VectorGroup root;
    private final int tintBlendMode;
    private final long tintColor;
    private final float viewportHeight;
    private final float viewportWidth;

    public /* synthetic */ ImageVector(String str, float f2, float f3, float f4, float f5, VectorGroup vectorGroup, long j2, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f2, f3, f4, f5, vectorGroup, j2, i2, z2, i3);
    }

    private ImageVector(String str, float f2, float f3, float f4, float f5, VectorGroup vectorGroup, long j2, int i2, boolean z2, int i3) {
        this.name = str;
        this.defaultWidth = f2;
        this.defaultHeight = f3;
        this.viewportWidth = f4;
        this.viewportHeight = f5;
        this.root = vectorGroup;
        this.tintColor = j2;
        this.tintBlendMode = i2;
        this.autoMirror = z2;
        this.genId = i3;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getDefaultWidth-D9Ej5fM, reason: not valid java name */
    public final float m4866getDefaultWidthD9Ej5fM() {
        return this.defaultWidth;
    }

    /* JADX INFO: renamed from: getDefaultHeight-D9Ej5fM, reason: not valid java name */
    public final float m4865getDefaultHeightD9Ej5fM() {
        return this.defaultHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final VectorGroup getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m4868getTintColor0d7_KjU() {
        return this.tintColor;
    }

    /* JADX INFO: renamed from: getTintBlendMode-0nO6VwU, reason: not valid java name */
    public final int m4867getTintBlendMode0nO6VwU() {
        return this.tintBlendMode;
    }

    public final boolean getAutoMirror() {
        return this.autoMirror;
    }

    public /* synthetic */ ImageVector(String str, float f2, float f3, float f4, float f5, VectorGroup vectorGroup, long j2, int i2, boolean z2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f2, f3, f4, f5, vectorGroup, j2, i2, z2, (i4 & 512) != 0 ? Companion.generateImageVectorId$ui_release() : i3, null);
    }

    public final int getGenId$ui_release() {
        return this.genId;
    }

    /* JADX INFO: compiled from: ImageVector.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яď\u0014D57\u001eq\u007fR܀kŞ\fA\u0014<\u0013ǞJ~8,\u001aw\rfr9>ImH4R[*%k\u0004é,[:qK;[\u001a\u0006\"\u0017XVgmnRZ!C\u0017\u0006\u001c{r,_U\u0001](\u000f:BuI;M}[A`\u000b6\r 8#@y\u001b\u0001\"ݒP\u0010\rzKK\u0012\u00158@\u0007:Z҈U\u00050\u0012\u000e>&\u0006&\\}N>Hr]B/1\u0003qĩV'u0\u0005M\u0013FZ,#Ǹ\u0012\u001eY?o4We\u0017\t\u001cbaE\u0003MqU\u0005\u0017(7/Wuo6\u0007\u0003$\u00199S%]!)l\t_e$'YUsO^\u0015@w)\u0002\u001dB\n\u000e\u0014/`.[#v\u000e\u00143\u0003|k@~\rެF\u007f\tmvb5\u00069+G\u001b~Q\u0010<)RE}\u001d\rL&\u0011r/_l\u000e\u000f\u0018+X\u0006VIQnCXR\u0018`Um2vr\b0\u0004>O\u0018/*\u001a>\u001d+7iC;!\u001a\rXJmv\u0013m\u0001S\u0018`͕D\"|%\u007f\u000f\u0017(rD\u0013ʍ\u001cVZX:\u0011e\u001c\u0003\b.\u000e\u0019 j\u0015T!S\u0016~Unixku\nS5\u0017=_ny-o9\r9eWi\u0010or\u000f\u0014mB\u0013\u000b^fPt$Z\u000b.R8Nj\u001e\u001a\u0014D|\u0012C8Eq*WD1GbET\t\u001ePe\u0015\u000fo\\x\u0010-zaIKȒ#\u00030\u0019P\u000bʙ q\u0007qD\u0003p$=A\u007f[GK\u0006(n4\u000bL\u001f~\"*wmRGZl.u\u0004|P\u001e 9_ZU\u0015%}W^23KL\u0001\u0013iM@-+\u0005\u007f\u000fI\u0017Fi\u001ei\u001fX\u0011pPObF:v\rxS\u000ej\u007f\b\u0012^zui\u0005\u0011a>W$\u001bYj\u0001h\u0003\u000b\u001f,X\u0019oP1e3I'+K\u0010\u0014]\u001b\u0012coo<0z\u000fTz\u0016\n2c$'zQ\f8k>OY\rv:$\u001b\tޢG۳͎\fD\u000fm\u001bm\u0011Er,n8{Gw\u0002tDD\r\u001f£$@!.\u00164\\\u001fps\f\b\"\u001f[%?\u000f{g\u001c~\u0012\\[V\u001d\u0017#{_|hΕ?֕ZWj־\u0001\u0018\u0002(NAis;|_Ӛ6ʙ@\f#EZ{\u0014#K\u0014Tc'\u0017`EJĬX\u05ceSۿحUGϖdGh!8\u0015O#A \u00115_\bD۱V҈bѢޥR\u001c͢\u001flW~t9{PbN3(\u0007\u000faԸiƀM\u0002>ߤ\u00185{k\b\ff\u0019S܋Dɓ\u001f9YΙ0\u0013>t#etPtv@w\u0001e\u000b/\u000f|\r\u000ej\u001bm#o\u06ddtƚf-TϕHCQ3\u0019\u0017r:]ќ\tސJ\u001b5ݢ\u0006AKS\u0003\u0014U\u0007.Ě=״\u0007¶Ţ&\u0003ȯ%^_\u000et$./H\u001e\n\u0016\u0011\u000b_ޓRݹ\u0003˸ٶsq˹2\n>O\u0010NR\u001fl`\u0004wOF}ߟnތFKpǍZozh\u0007U9\t=۵XӖr-Xȿԗ'V6\u0016^ŶV?R(X\u0017\u001fȝ\u0019i"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0012U?=k%\u001e\u0013wkFE@<R}&GY$", "", "<`\\2", "", "2dU.h3ME\u001d}\na", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "2dU.h3M6\u0019\u0003|a;", "DhTDc6Kb\u000b\u0003ym/", "", "DhTDc6Kb{~~`/\f", "Bh]A66E]&", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Bh]A53>\\\u0018f\u0005],", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}\\!aw{+V\u0014F\u0006,9bG%Hu_2VR;x=\u001a\u001c2@9\b_<U\u0006\u0005QU\\;ibpL\u001e\u001fB\n[1\r\u0012/\u0005\u0015", "/tc<@0K`#\f", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}\\!aw{+dtB\u00014<]\u0007i<~\u001ewQLJkA'\u0011o+\u0018\u0007d(^}6%VW:k_\u0003;#\u001cguJ8\u0013\u0005f\u0017g_", "1ta?X5M5&\t\u000bi", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0012U?=k%\u001e\u0013wkFE@<R}&GY\r\u000ei\\\u0003H~\u000eg\nV9b", "5dc\u0010h9KS\"\u000e\\k6\r\u0014", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#\u000f 5| ;\u0017'Cg6\u001e\u0006h_H\u0011pj+\u0007+NKN9\u001b4\u007fG$\u001dE\n['\u0015\u0013/", "\u0014", "7r2<a:N[\u0019}", "<nS2f", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "@n^A", "\u0017", "\u0018", "/cS\u0014e6N^", "@nc.g,", ">he<g\u001f", ">he<g ", "AbP9X\u001f", "AbP9X ", "BqP;f3:b\u001d\t\u0004Q", "BqP;f3:b\u001d\t\u0004R", "1kX=C(MVwz\nZ", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "/cS\u001dT;A", ">`c57(MO", ">`c590EZ\b\u0013\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u0018q\u001d5<WFk\n", "4h[9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "4h[943IV\u0015", "Asa<^,", "Asa<^,\u001aZ$\u0002v", "Asa<^,%W\"~lb+\f\f", "Asa<^,%W\"~XZ7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", "Asa<^,%W\"~_h0\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=mz8QL\u0011", "Asa<^,%W\"~bb;|\u0016", "BqX:C(MV\u0007\u000evk;", "BqX:C(MVx\by", "BqX:C(MV\u0003\u007f{l,\f", "/cS\u001dT;A\u001b#b\u000f>(\u0011p", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;c\u000f\u0001<\u0012\u0013`Nk\u0017>@\u0013Df\u0002)9C|*VBHu8\u001d(2_C\u000fn6\\vpWP\u0018.iN}@\u0018\u0010hW+8\u001d\u0013\\\u0017\u0005U@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011{\"qL,lDg)VTQSe\u007fElC\u0001=\u001b\u001b\u0005WX\u0015$g]8\u000ezfZp\\\u0002rqU\u0019DH(\bohBPrY:\u0003p0Ky\u0007\u001c?\"X3p/\u0004%*4s\u000fX&tNb\u007f\u0014,i\u0017", "0tX9W", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0012U?=k%\u001e\u0013wkF\\", "1kT.e\u000eK])\n", "3mbBe,'](\\\u0005g:\r\u0011/d", "", "/rE2V;H`z\f\u0005n7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\u007f\"rqD\\", "\u0015q^Bc\u0017:`\u0015\u0007\t", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        public static final int $stable = 8;
        private final boolean autoMirror;
        private final float defaultHeight;
        private final float defaultWidth;
        private boolean isConsumed;
        private final String name;
        private final ArrayList<GroupParams> nodes;
        private GroupParams root;
        private final int tintBlendMode;
        private final long tintColor;
        private final float viewportHeight;
        private final float viewportWidth;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0015K\fArw\u001a\u0017oP<\u0003\u0010}9OcQ~,\b|\u001bdD(\u0004sZx)x(`lCa\u001ckHT1HG\u0017i\fz0\u0018WKyGC \rSSE0\u000bCA\u007f\u0015\u0002I+]=\f^4\t\tM$D\r", replaceWith = @ReplaceWith(expression = "Builder(name, defaultWidth, defaultHeight, viewportWidth, viewportHeight, tintColor, tintBlendMode, false)", imports = {"androidx.compose.ui.graphics.vector"}))
        @InterfaceC1492Gx
        public /* synthetic */ Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f2, f3, f4, f5, j2, i2);
        }

        public /* synthetic */ Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f2, f3, f4, f5, j2, i2, z2);
        }

        private Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2, boolean z2) {
            this.name = str;
            this.defaultWidth = f2;
            this.defaultHeight = f3;
            this.viewportWidth = f4;
            this.viewportHeight = f5;
            this.tintColor = j2;
            this.tintBlendMode = i2;
            this.autoMirror = z2;
            ArrayList<GroupParams> arrayList = new ArrayList<>();
            this.nodes = arrayList;
            GroupParams groupParams = new GroupParams(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.root = groupParams;
            ImageVectorKt.push(arrayList, groupParams);
        }

        public /* synthetic */ Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, f2, f3, f4, f5, (-1) - (((-1) - i3) | ((-1) - 32)) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j2, (i3 + 64) - (i3 | 64) != 0 ? BlendMode.Companion.m4118getSrcIn0nO6VwU() : i2, (i3 & 128) != 0 ? false : z2, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, f2, f3, f4, f5, (i3 + 32) - (i3 | 32) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j2, (i3 + 64) - (i3 | 64) != 0 ? BlendMode.Companion.m4118getSrcIn0nO6VwU() : i2, (DefaultConstructorMarker) null);
        }

        private Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2) {
            this(str, f2, f3, f4, f5, j2, i2, false, (DefaultConstructorMarker) null);
        }

        private final GroupParams getCurrentGroup() {
            return (GroupParams) ImageVectorKt.peek(this.nodes);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder addGroup$default(Builder builder, String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, int i2, Object obj) {
            String str2 = str;
            float f9 = f5;
            List emptyPath = list;
            float f10 = f7;
            float f11 = f4;
            float f12 = f3;
            float f13 = f2;
            if ((i2 & 1) != 0) {
                str2 = "";
            }
            if ((i2 + 2) - (i2 | 2) != 0) {
                f13 = 0.0f;
            }
            if ((i2 + 4) - (i2 | 4) != 0) {
                f12 = 0.0f;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
                f11 = 0.0f;
            }
            if ((i2 & 16) != 0) {
                f9 = 1.0f;
            }
            float f14 = (i2 + 32) - (i2 | 32) == 0 ? f6 : 1.0f;
            if ((i2 + 64) - (i2 | 64) != 0) {
                f10 = 0.0f;
            }
            float f15 = (i2 & 128) == 0 ? f8 : 0.0f;
            if ((i2 & 256) != 0) {
                emptyPath = VectorKt.getEmptyPath();
            }
            return builder.addGroup(str2, f13, f12, f11, f9, f14, f10, f15, emptyPath);
        }

        public final Builder addGroup(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List<? extends PathNode> list) {
            ensureNotConsumed();
            ImageVectorKt.push(this.nodes, new GroupParams(str, f2, f3, f4, f5, f6, f7, f8, list, null, 512, null));
            return this;
        }

        public final Builder clearGroup() {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(asVectorGroup((GroupParams) ImageVectorKt.pop(this.nodes)));
            return this;
        }

        /* JADX INFO: renamed from: addPath-oIyEayM$default, reason: not valid java name */
        public static /* synthetic */ Builder m4869addPathoIyEayM$default(Builder builder, List list, int i2, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8, int i5, Object obj) {
            float f9 = f6;
            int defaultStrokeLineCap = i3;
            float f10 = f2;
            float f11 = f4;
            float f12 = f5;
            int defaultStrokeLineJoin = i4;
            Brush brush3 = brush;
            float f13 = f3;
            String str2 = str;
            int defaultFillType = i2;
            if ((-1) - (((-1) - i5) | ((-1) - 2)) != 0) {
                defaultFillType = VectorKt.getDefaultFillType();
            }
            if ((i5 & 4) != 0) {
                str2 = "";
            }
            if ((i5 + 8) - (i5 | 8) != 0) {
                brush3 = null;
            }
            if ((i5 + 16) - (i5 | 16) != 0) {
                f10 = 1.0f;
            }
            Brush brush4 = (i5 + 32) - (i5 | 32) == 0 ? brush2 : null;
            if ((i5 & 64) != 0) {
                f13 = 1.0f;
            }
            if ((-1) - (((-1) - i5) | ((-1) - 128)) != 0) {
                f11 = 0.0f;
            }
            if ((i5 & 256) != 0) {
                defaultStrokeLineCap = VectorKt.getDefaultStrokeLineCap();
            }
            if ((i5 + 512) - (i5 | 512) != 0) {
                defaultStrokeLineJoin = VectorKt.getDefaultStrokeLineJoin();
            }
            if ((-1) - (((-1) - i5) | ((-1) - 1024)) != 0) {
                f12 = 4.0f;
            }
            if ((i5 + 2048) - (i5 | 2048) != 0) {
                f9 = 0.0f;
            }
            return builder.m4870addPathoIyEayM(list, defaultFillType, str2, brush3, f10, brush4, f13, f11, defaultStrokeLineCap, defaultStrokeLineJoin, f12, f9, (i5 & 4096) == 0 ? f7 : 1.0f, (i5 & 8192) == 0 ? f8 : 0.0f);
        }

        /* JADX INFO: renamed from: addPath-oIyEayM, reason: not valid java name */
        public final Builder m4870addPathoIyEayM(List<? extends PathNode> list, int i2, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8) {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(new VectorPath(str, list, i2, brush, f2, brush2, f3, f4, i3, i4, f5, f6, f7, f8, null));
            return this;
        }

        public final ImageVector build() {
            ensureNotConsumed();
            while (this.nodes.size() > 1) {
                clearGroup();
            }
            ImageVector imageVector = new ImageVector(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, asVectorGroup(this.root), this.tintColor, this.tintBlendMode, this.autoMirror, 0, 512, null);
            this.isConsumed = true;
            return imageVector;
        }

        private final void ensureNotConsumed() {
            if (this.isConsumed) {
                InlineClassHelperKt.throwIllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        private final VectorGroup asVectorGroup(GroupParams groupParams) {
            return new VectorGroup(groupParams.getName(), groupParams.getRotate(), groupParams.getPivotX(), groupParams.getPivotY(), groupParams.getScaleX(), groupParams.getScaleY(), groupParams.getTranslationX(), groupParams.getTranslationY(), groupParams.getClipPathData(), groupParams.getChildren());
        }

        /* JADX INFO: compiled from: ImageVector.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\r'4\u0012}\fnjGNLe^.Zݷ2\u000fy\u001b<$q$yCAo }8ޛ\u007fN\u0016f/>j\u0011I\u000f\u0014\u0016\u0011jZJe~c\u0012\u001d4Zom6]uC9nxN\u0005N52>\u007f\u0005\u000f\u001fBH>y\u000bIQ\f 6XphU\u001dS\u000b\u001a \rV /!lmT6Vtu:]&\u0013oHN5hH|{\u0010V`-\r\u0005k61P9E\u0015S_1\u0012bgE\u0003M~U\u000bx)7+w\u0003\u0006Dݼ\u0004\u0014#; +k\u007f>b\u0015Sp\fU:}q\"ֻ\u001a߭{\u0007\u0004ȞT\u0006\u0014\u00175ZN/ y\u0016\"\u0004\u0013\u0001]XV\u0012`R\u007f)md\"{ĵ?ڢ='nϟy=\u001fcE\u000e%\u000f$9\u000f\u0003qsb\u000ex\u0015IUNΊ=ҨDIPݐ\"[C\u0005\u0012\t\u0003\u00040\u001d>aPG\n\u0015F\u0017S:2ބ/\u074co\u000ePֳ\u007fx\u000b{vo\nTN]0\rfO8\u000e$Zrg[ߟ\\Ԝ\\8\u0019۳4V\r\u001d\u0016/@^}\\/C`f]j\u0002j{``ɟ;Ϭ;ev\u0088&Y?\u007fAQqe\u0016\u0004`\u0015dWJh\u001dX\u0015E*ەfڅ,.:ʋ\u0003\u0012}\u001fRj,\u00158c\u007f:\u0005D? t\u0015v\u0006t՚MҴ\rkbӐ(\u0001ZX2\u001f\n&z/\u000fn-\t}o\u0011IZ\u007f7ü9ۮUA!ğm$n[\u000b?'\u0001y(U\u0006\u001d_Zu.u\u0004~vڍ&\u07fcU;EП'\u0001/[\u0010IeNx\u0010_kɥ+&"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0012U?=k%\u001e\u0013wkFE@<R}&GY\r\u000ei\\\u0003H~\u000eg\nV9b", "", "<`\\2", "", "@nc.g,", "", ">he<g\u001f", ">he<g ", "AbP9X\u001f", "AbP9X ", "BqP;f3:b\u001d\t\u0004Q", "BqP;f3:b\u001d\t\u0004R", "1kX=C(MVwz\nZ", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "1gX9W9>\\", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\u0007\u001fga\u000f", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}\\!aww(PtAr61#\u000e/;t_\u0015QQJA\u001b#\u0011y]\u0003\u0017r0U@\u000eKZ]\u0002 C", "5dc\u0010[0ER&~\u0004", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u0010[0ER&~\u0004", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "5dc\u0010_0I>\u0015\u000e}=(\f\u0005", "Adc\u0010_0I>\u0015\u000e}=(\f\u0005", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u001bT4>", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001d\\=Hb\f", "u(5", "Adc\u001d\\=Hb\f", "uE\u0018#", "5dc\u001d\\=Hb\r", "Adc\u001d\\=Hb\r", "5dc\u001fb;:b\u0019", "Adc\u001fb;:b\u0019", "5dc V(ES\f", "Adc V(ES\f", "5dc V(ES\r", "Adc V(ES\r", "5dc!e(Ga z\nb6\u0006{", "Adc!e(Ga z\nb6\u0006{", "5dc!e(Ga z\nb6\u0006|", "Adc!e(Ga z\nb6\u0006|", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        private static final class GroupParams {
            private List<VectorNode> children;
            private List<? extends PathNode> clipPathData;
            private String name;
            private float pivotX;
            private float pivotY;
            private float rotate;
            private float scaleX;
            private float scaleY;
            private float translationX;
            private float translationY;

            public GroupParams() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }

            public GroupParams(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List<? extends PathNode> list, List<VectorNode> list2) {
                this.name = str;
                this.rotate = f2;
                this.pivotX = f3;
                this.pivotY = f4;
                this.scaleX = f5;
                this.scaleY = f6;
                this.translationX = f7;
                this.translationY = f8;
                this.clipPathData = list;
                this.children = list2;
            }

            public /* synthetic */ GroupParams(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 + 1) - (i2 | 1) != 0 ? "" : str, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0.0f : f3, (i2 & 8) != 0 ? 0.0f : f4, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? 1.0f : f5, (i2 + 32) - (i2 | 32) == 0 ? f6 : 1.0f, (i2 & 64) != 0 ? 0.0f : f7, (i2 + 128) - (i2 | 128) == 0 ? f8 : 0.0f, (-1) - (((-1) - i2) | ((-1) - 256)) != 0 ? VectorKt.getEmptyPath() : list, (-1) - (((-1) - i2) | ((-1) - 512)) != 0 ? new ArrayList() : list2);
            }

            public final String getName() {
                return this.name;
            }

            public final void setName(String str) {
                this.name = str;
            }

            public final float getRotate() {
                return this.rotate;
            }

            public final void setRotate(float f2) {
                this.rotate = f2;
            }

            public final float getPivotX() {
                return this.pivotX;
            }

            public final void setPivotX(float f2) {
                this.pivotX = f2;
            }

            public final float getPivotY() {
                return this.pivotY;
            }

            public final void setPivotY(float f2) {
                this.pivotY = f2;
            }

            public final float getScaleX() {
                return this.scaleX;
            }

            public final void setScaleX(float f2) {
                this.scaleX = f2;
            }

            public final float getScaleY() {
                return this.scaleY;
            }

            public final void setScaleY(float f2) {
                this.scaleY = f2;
            }

            public final float getTranslationX() {
                return this.translationX;
            }

            public final void setTranslationX(float f2) {
                this.translationX = f2;
            }

            public final float getTranslationY() {
                return this.translationY;
            }

            public final void setTranslationY(float f2) {
                this.translationY = f2;
            }

            public final List<PathNode> getClipPathData() {
                return this.clipPathData;
            }

            public final void setClipPathData(List<? extends PathNode> list) {
                this.clipPathData = list;
            }

            public final List<VectorNode> getChildren() {
                return this.children;
            }

            public final void setChildren(List<VectorNode> list) {
                this.children = list;
            }
        }
    }

    /* JADX INFO: compiled from: ImageVector.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{|/i'\nCiW`Ԃ̀\rOTk8zX[#C=\blёv߽MU\u0001زܱ\u00137"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0012U?=k%\u001e\u0013wkFEA6V\u0002#PPX52", "", "u(E", "7lP4X\u001d>Q(\t\b<6\r\u0012>", "", "5d]2e(MS|\u0007v`,m\t-t\n5_?", "5d]2e(MS|\u0007v`,m\t-t\n5_??'\u001bA|\u000eCv!CY", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int generateImageVectorId$ui_release() {
            int i2;
            synchronized (this) {
                Companion companion = ImageVector.Companion;
                i2 = ImageVector.imageVectorCount;
                ImageVector.imageVectorCount = i2 + 1;
            }
            return i2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        return Intrinsics.areEqual(this.name, imageVector.name) && Dp.m6643equalsimpl0(this.defaultWidth, imageVector.defaultWidth) && Dp.m6643equalsimpl0(this.defaultHeight, imageVector.defaultHeight) && this.viewportWidth == imageVector.viewportWidth && this.viewportHeight == imageVector.viewportHeight && Intrinsics.areEqual(this.root, imageVector.root) && Color.m4179equalsimpl0(this.tintColor, imageVector.tintColor) && BlendMode.m4089equalsimpl0(this.tintBlendMode, imageVector.tintBlendMode) && this.autoMirror == imageVector.autoMirror;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + Dp.m6644hashCodeimpl(this.defaultWidth)) * 31) + Dp.m6644hashCodeimpl(this.defaultHeight)) * 31) + Float.hashCode(this.viewportWidth)) * 31) + Float.hashCode(this.viewportHeight)) * 31) + this.root.hashCode()) * 31) + Color.m4185hashCodeimpl(this.tintColor)) * 31) + BlendMode.m4090hashCodeimpl(this.tintBlendMode)) * 31) + Boolean.hashCode(this.autoMirror);
    }
}
