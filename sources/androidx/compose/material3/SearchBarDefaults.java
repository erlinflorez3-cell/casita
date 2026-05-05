package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.SearchBarTokens;
import androidx.compose.material3.tokens.SearchViewTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
/* JADX INFO: compiled from: SearchBar.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005+4\u0012\u000e\u0007nj?5Le^.ZS0\u0010s{B$cҕyCIa\"Ԃ*\teNogtJb\u000bQ\u0018\u000e\u0016~j4Ikxe\u0012\u00152JoU3UoS9ht<\u0006(288\u0002ڎ\t\u001a@H\u0018͌\u0003Ca\f\u001aؓHpPR\u0015M\u000b\"\u001a\u0006T \t\u001ebvTɬH\u0003җj/Q\u0002*GT'ۢ4|[\r\u000fğ&\u001b\u0010y\u001eYZg9#@k\u00035n\fO\u0011\\\nI\u0015j7'Ye\u0004YFX..CI\u007f\u001dk\u0012>h\u0015Sp\fUG_e[P<B&\u0019,\u0011J$&\u0006Ui^=(\t \u001aCv\u0003Snq\u0012`R\u007f){d5U\u00069+G>~Q\u0010_IT={\u001326#/\u0010QnZ\u000en;3a\bSAQnW^M8\u0001ǀq\u0004v\u000b2=\n0U)G\t!0'%euO\"O\u0013ɘLDm\u001f5snSw|`M2p&7X#\"Yr\fʰoPZ\u0001\\\u0017S\u001cb2\u0016\bAL\r\u007fB!3=fQ~h\u0019{$\u000fɻ3fE\t7\u0010\u001c\u0003Q^ae\u0002i\u0016a`(,?j\u00155^lBa?r\\VTxMғ\u000fǮԞHP\u0012G@t:JBWI\u0019\u000bEx\t$BO.!_\t\u001b@\u0005Z326\u0002$#;1Vbp}\u001e\u0011IZ)''Ѓ@ٛڤ\u001d([YvlEɈ\u0006\r*\u0018G\u0016xwRr\u0016\u0004\u000f\u0014 DLiW5=!I\u0017)`4]KRrs\re\u0012U--\u007f\u0015;vj\u007f\b\u0019.\\fpJ]\u0013/\"%\u0011#)\u000ed\u000e9yF)y\u0014Z\u0011[L\n\u000b\u0003\bn~>\u0003\u0005-_=\u0001\u001eT-;3C5_.wBaEgci}q\u0012b=X%k\n,qZ\bb\u007f\u0010bA>IgDV\"R\u001fIGَi̫ڇF\u000b:SA\u0010\nыodne\u000b]*\u0017\r2\r~\u001fs:A\".:4_8=[}B\u0011s+\u0017Ma\"\u0006my\u000f;P\u0015\n\u00197In@Nm&\\WpEH\u0006\"UfGAb\u0013z!$b^l\u000e\u0011Cb)\u001e\u0010)2ve\u0015\u0017@\u0003\f;\u0005@\u0005~bVVFxE\u000fSZ\u0007\u0005\u000fA`\u00115_7\u001eLZ/qu\u0019SK;KpU~toCD\u0003kK.^\u0001\u0019\u0011uCw4f\nM){1\b\ffJC\"Ħ\u0017ÇʦU\u0013eC>,[wrO|v@h\tRxĞ\u0001Ԍ{ɚܬ\t\u000eՈ\u001d]zop3\\P}:Q\u001a\u0019\u0019J-\u0015\u0011MzT\"E\u0006c/؊HݝΘ&z\u009cWC\u0006\b.&?\u0006z)j\\^}\u0018f3:DsҭaկǺ\u0012Oܣ\b6Rt\u0001\u0010F\n<Y\u00108R*ld\u0004wOBՈ*ˊߢAJи|\u0012klqtm\r\tr?[J};]5\tU[dX͠^>)U&g\u001f\u0010d$40N\b\u00117F\u0015ʍlt\u0004Qa\u001f9?<9oDHRL\fU?Ȅ\b.l*\u001bOd]\u000fs\u0017q\u0005B\u0006$\u00150܍hx$+\u001a\u0014\r`ՠ\u0011\u001c<Ix۟\u0001]6!\u001fa,ӺdU"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%1f{#\u0014i#\rMD7{;-#>", "", "u(E", "\u0013kTCT;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0012_,OO(\u0003\u0005gs[\\\u000fjO)c~|  Q~\nKz/>g", "5dc\u0012_,OO(\u0003\u0005gs[\\\u000fjO)c", "u(5", "\u0014", "\u0017m_Bg\rBS }]^0~\f>", "5dc\u0016a7Nby\u0003ze+_\t3g\u00037C\u001fTv\u001c\u0017pu", "!gP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "5dc [(=]+^\u0002^=x\u00183o\toZ\u0014`\u001cfHW", "\"n]._\fES*z\nb6\u0006", "5dc!b5:Zx\u0006zo(\f\r9nG\u0007O \u0006f\u0018/", "2nR8X+,V\u0015\nz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc\u0011b*DS\u0018l}Z7|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\tz\bUL$D", "4t[9F*KS\u0019\bha(\b\t", "5dc\u0013h3EA\u0017\fz^5j\f+p\u007f", "7m_Bg\rBS }ha(\b\t", "5dc\u0016a7Nby\u0003ze+j\f+p\u007f", "Eh]1b>\"\\'~\nl", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", "5dc$\\5=]+b\u0004l,\f\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016O6l[q9#\u0016d\u0017\u00182\t\u0019cQ386;(\u00076[eDv\u0001\u001b$c", "\u0017m_Bg\rBS }", "", "?tT?l", "", "=m@BX9R1\u001cz\u0004`,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "=mB2T9<V", "3w_.a+>R", "", "=m4Ec(GR\u0019}Xa(\u0006\u000b/", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mP/_,=", ">kP0X/HZ\u0018~\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", ":dP1\\5@7\u0017\t\u0004", "BqP6_0GU||\u0005g", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e%Hh^$7t\u0015\fWJExBs", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\u0007>ur\u001c\u0018DqtK \u0015X\u0002^vQ2fU]i\u0003U\u000b&r3b\u001bc'e\u0006\u0010\u000b\u0010z\u0018(rT-\u001dEQ\u001bz]\u0004ug\u0011)~\u0002\fHl_GIob\u0012i\u000e%U\u000b~\u0016;\"y<|v\u0005D34s\tUp&\b?\t\u001e*kE1/\u0003\u0012yEUr|pGWm0iQ\u000fr>/(iolVXgm YDei\n\u0004(lDS~\u001c+OHGl\u0002^\n\u0017-ktMM$bJz\u0001M n\u0015\r\f3m\u0003*\u001f<f\u0019l)r\u0001K\u001d\u0011sB\u001a{#K\u0011\u007fH\u001dqGy)!^$I\bqM!:J\u001a\u0001YM|\u001ek\u001b|\u0014}*}mA\r\u007f\u0011/-HcFb*0\u0015w\\!\u0015v<&(v5\u000ba@{Zu6\u0019\b\u00172d%l:5\t3%Ry\"I_I\u0014@d[}6]\"-`J|>drBTr\r\u0013M)\u0003\u001b'64u\u0011,w$>j\u0014\fSM'7&\u000bfN##vR,\f\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%1f{#\u0014i#\fWJExBs", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "2he6W,K1#\u0006\u0005k", "1n[<e:\u0006R\u001b\u0001Nh\u001eO", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u000e' Vs\u0016<@\u0003?a\t*Em#\u00041'~R0'\u0014uk=\u0006vuL\u0001/RV\\,&ZnL\u0014\u001f^\nUxVrY=1lG\u0014\u001b\u0015\nS\tEu\u000fa", "7m_Bg\rBS }Xh3\u0007\u0016=", "1n[<e:\u00069 \u0001\u000e&\u0017~", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\t\u0013&G|\u00128}r~H}3FN\u001a.TB\u0019u;(\"v7 \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001b^4\u001c\taAmLN?*\u0012:I\u000f\u0011LdO|\n>i}LZ\u000fZC\u0013\u007fI4rTY)\u0002CPEo.`\u0013-fJ:61\u0012tu\u0017u.8\u0011\u0006`\u001fH", "BdgA66E]&", "2hb.U3>R\b~\u000em\n\u0007\u00109r", "1ta@b9\u001c] \t\b", "Ad[2V;B]\"\\\u0005e6\n\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0004htHtc3Nt6KVW\nfY|J\"g", "4nRBf,=:\u0019zyb5~l-o\t\u0006\u0006G\u000b$", "CmU<V<LS\u0018ezZ+\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "2hb.U3>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$", "4nRBf,=B&z~e0\u0006\u000b\u0013c\n1YJ\b!$", "CmU<V<LS\u0018m\bZ0\u0004\r8gc&\u0006I^!\u001eQ|", "2hb.U3>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", ">kP0X/HZ\u0018~\b<6\u0004\u0013<", "2hb.U3>R\u0004\u0006v\\,\u007f\u00136d\u007f5YJ\b!$", "7m_Bg\rBS }Xh3\u0007\u0016=-G8C&\u0003 \u000b", "uI9\u0017?(GR&\t~]?F\u00079m\u000b2\n@J\u0018!Wx\r8\u0006)?bG/7\u0001%w[CBk2-\u0019rj\u0003uc?]d'NLL;`\\{\u001b\u001e\u0019d\u001b\\\u0001qi>&\tS)\u001c\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\u0007%~P-pF#=\u0004OLOp*qaC\u0001@}! \u001dp&%lOASy]\u0019}\\\bg1O\u0015\n81Bib\u0014\u000f^UO\u0004\b#K\u0003vo<_~8\u0003\u0003", "4nRBf,=B\u0019\u0012\n<6\u0004\u0013<", "CmU<V<LS\u0018mzq;Z\u00136o\r", "4nRBf,=> zx^/\u0007\u0010.e\r\u0006\u0006G\u000b$", "CmU<V<LS\u0018i\u0002Z*|\f9l~(\t\u001e\u000b\u001e!T", "7m_Bg\rBS }Xh3\u0007\u0016=-c\u0017\u0007$O!)", "uI9\u0017=\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`\u0018Q\u007f\u0017;r49c\u0007iFm)=\u0017Q;r4\u001c$lkBPR,a\u0006\u0015GSN*kV|Fq\u001ca\u0018[9bi>&\tS)\u001c\u0004l\u0013E\u000b:u\u000b\u0010\u0015!~hzJa\u001aUy^\u0003Q2wJa_C%KMm4r\flr@\u001e\u001egzm\"\u001auZ2\t\u000f\u001d\u000f|Z\u0005quGb\u000343>z_BL=\u001f+t:.,\u007fw\u001916~2~:\u0012\n", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SearchBarDefaults {
    public static final int $stable = 0;
    private static final float Elevation;
    public static final SearchBarDefaults INSTANCE = new SearchBarDefaults();
    private static final float InputFieldHeight;
    private static final float ShadowElevation;
    private static final float TonalElevation;

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0015K\n6~y\u0019\u0017lVgn_#-ZAX\u000e=\u0006|\u0015a\u0005\u0014.X]\tczw\ffG\r_wGL3F?\u0016\u0016c\u00036`\b.m?8!#, I1wH\u000b\u0002\u001a=", replaceWith = @ReplaceWith(expression = "TonalElevation", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: getElevation-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2432getElevationD9Ej5fM$annotations() {
    }

    private SearchBarDefaults() {
    }

    static {
        float fM3191getLevel0D9Ej5fM = ElevationTokens.INSTANCE.m3191getLevel0D9Ej5fM();
        TonalElevation = fM3191getLevel0D9Ej5fM;
        ShadowElevation = ElevationTokens.INSTANCE.m3191getLevel0D9Ej5fM();
        Elevation = fM3191getLevel0D9Ej5fM;
        InputFieldHeight = SearchBarTokens.INSTANCE.m3492getContainerHeightD9Ej5fM();
    }

    /* JADX INFO: renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m2438getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    /* JADX INFO: renamed from: getShadowElevation-D9Ej5fM, reason: not valid java name */
    public final float m2437getShadowElevationD9Ej5fM() {
        return ShadowElevation;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2435getElevationD9Ej5fM() {
        return Elevation;
    }

    /* JADX INFO: renamed from: getInputFieldHeight-D9Ej5fM, reason: not valid java name */
    public final float m2436getInputFieldHeightD9Ej5fM() {
        return InputFieldHeight;
    }

    public final Shape getInputFieldShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -971556142, "C349@15770L5:SearchBar.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-971556142, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.android.kt:349)");
        }
        Shape value = ShapesKt.getValue(SearchBarTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getFullScreenShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1665502056, "C353@15944L5:SearchBar.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1665502056, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.android.kt:353)");
        }
        Shape value = ShapesKt.getValue(SearchViewTokens.INSTANCE.getFullScreenContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getDockedShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1006952150, "C357@16094L5:SearchBar.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1006952150, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-dockedShape> (SearchBar.android.kt:357)");
        }
        Shape value = ShapesKt.getValue(SearchViewTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 2112270157, "C361@16229L10:SearchBar.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2112270157, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-windowInsets> (SearchBar.android.kt:361)");
        }
        WindowInsets statusBars = WindowInsets_androidKt.getStatusBars(WindowInsets.Companion, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return statusBars;
    }

    /* JADX INFO: renamed from: colors-dgg9oW8, reason: not valid java name */
    public final SearchBarColors m2434colorsdgg9oW8(long j2, long j3, Composer composer, int i2, int i3) {
        long value = j3;
        long value2 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, -1507037523, "C(colors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color)375@16778L5,376@16845L5,381@17019L18:SearchBar.android.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            value2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6);
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            value = ColorSchemeKt.getValue(SearchViewTokens.INSTANCE.getDividerColor(), composer, 6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1507037523, i2, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.android.kt:378)");
        }
        int i4 = i2 << 6;
        SearchBarColors searchBarColors = new SearchBarColors(value2, value, m2440inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, (i4 + 57344) - (i4 | 57344), 16383), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return searchBarColors;
    }

    /* JADX INFO: renamed from: inputFieldColors-ITpI4ow, reason: not valid java name */
    public final TextFieldColors m2440inputFieldColorsITpI4ow(long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, Composer composer, int i2, int i3, int i4) {
        long jM4177copywmQWz5c$default = j14;
        long value = j12;
        long value2 = j10;
        long value3 = j9;
        long value4 = j5;
        long jM4177copywmQWz5c$default2 = j8;
        TextSelectionColors textSelectionColors2 = textSelectionColors;
        long value5 = j7;
        long value6 = j6;
        long jM4177copywmQWz5c$default3 = j11;
        long value7 = j13;
        long jM4177copywmQWz5c$default4 = j4;
        long value8 = j3;
        long value9 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, -602148837, "C(inputFieldColors)P(7:c#ui.graphics.Color,12:c#ui.graphics.Color,3:c#ui.graphics.Color,0:c#ui.graphics.Color,9,5:c#ui.graphics.Color,10:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,13:c#ui.graphics.Color,4:c#ui.graphics.Color,6:c#ui.graphics.Color,11:c#ui.graphics.Color,2:c#ui.graphics.Color)410@18829L5,411@18903L5,413@18998L5,416@19154L5,417@19233L7,418@19316L5,419@19399L5,421@19507L5,424@19683L5,425@19768L5,427@19878L5,430@20056L5,431@20142L5,433@20244L5,437@20389L847:SearchBar.android.kt#uh7d8r");
        if ((i4 + 1) - (i4 | 1) != 0) {
            value9 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            value8 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6);
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            jM4177copywmQWz5c$default4 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i4 & 8) != 0) {
            value4 = ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6);
        }
        if ((i4 + 16) - (i4 | 16) != 0) {
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) objConsume;
        }
        if ((i4 + 32) - (i4 | 32) != 0) {
            value6 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6);
        }
        if ((i4 & 64) != 0) {
            value5 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 128)) != 0) {
            jM4177copywmQWz5c$default2 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 256)) != 0) {
            value3 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6);
        }
        if ((i4 & 512) != 0) {
            value2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 1024)) != 0) {
            jM4177copywmQWz5c$default3 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2048)) != 0) {
            value = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        }
        if ((i4 & 4096) != 0) {
            value7 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        }
        if ((i4 & 8192) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-602148837, i2, i3, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:437)");
        }
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        int i5 = (i2 & PhotoshopDirectory.TAG_QUICK_MASK_INFORMATION) | ((i2 << 15) & 234881024);
        int i6 = i2 >> 12;
        int i7 = ((i6 + 14) - (i6 | 14)) | (458752 & i2);
        int i8 = 3670016 & i2;
        int i9 = ((i7 + i8) - (i7 & i8)) | ((-1) - (((-1) - i2) | ((-1) - 29360128)));
        int i10 = i2 << 3;
        int i11 = (-1) - (((-1) - i9) & ((-1) - ((i10 + 1879048192) - (i10 | 1879048192))));
        int i12 = i2 >> 27;
        int i13 = (-1) - (((-1) - ((i12 + 14) - (i12 | 14))) & ((-1) - ((i3 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
        int i14 = i3 << 18;
        int i15 = (i14 + 29360128) - (i14 | 29360128);
        int i16 = (i13 + i15) - (i13 & i15);
        int i17 = (i14 + 234881024) - (i14 | 234881024);
        TextSelectionColors textSelectionColors3 = textSelectionColors2;
        TextFieldColors textFieldColorsM2692colors0hiis_0 = textFieldDefaults.m2692colors0hiis_0(value9, value8, jM4177copywmQWz5c$default4, 0L, 0L, 0L, 0L, 0L, value4, 0L, textSelectionColors3, 0L, 0L, 0L, 0L, value6, value5, jM4177copywmQWz5c$default2, 0L, value3, value2, jM4177copywmQWz5c$default3, 0L, 0L, 0L, 0L, 0L, value, value7, jM4177copywmQWz5c$default, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, i5, i11, (-1) - (((-1) - ((i16 + i17) - (i16 & i17))) & ((-1) - ((-1) - (((-1) - i14) | ((-1) - 1879048192))))), 0, 3072, 1204058872, 4095);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textFieldColorsM2692colors0hiis_0;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void InputField(final java.lang.String r80, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r81, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r82, final boolean r83, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r84, androidx.compose.ui.Modifier r85, boolean r86, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r87, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r88, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r89, androidx.compose.material3.TextFieldColors r90, androidx.compose.foundation.interaction.MutableInteractionSource r91, androidx.compose.runtime.Composer r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instruction units count: 1596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarDefaults.InputField(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Deprecated(message = "\u0016K|Gt|TYYY;:^$C\u000epM\u0014,D|\u0014W6O|zc\tclqQpF\r]{xG]C;$WY~6]Z\t%>= \u001c\\(*${@\u0006U\u001b{F.^};p*\u0017\u0011T\u0014~|Fm82f\u0003@W[s\u00140\u0002+G\u0019:\u000b4T\u001fH\u0012&($}@s\u000b,:\u0001A_bW5i\u000f-:w8 C\u0019\u0012\u0006\u00114xp*\u0004n`\u0016+a|=<f\u0002\u0004S4.~(yX\u001fam\u0012\u0004|!|\u001dm~St\bqj\\[Vl\t-b-^lN9\u001eBCa\u001a", replaceWith = @ReplaceWith(expression = "colors(containerColor, dividerColor)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: colors-Klgx-Pg, reason: not valid java name */
    public final SearchBarColors m2433colorsKlgxPg(long j2, long j3, TextFieldColors textFieldColors, Composer composer, int i2, int i3) {
        TextFieldColors textFieldColorsM2440inputFieldColorsITpI4ow = textFieldColors;
        long value = j3;
        long value2 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, -1216168196, "C(colors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color)586@27706L5,587@27773L5,588@27824L18:SearchBar.android.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            value2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6);
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            value = ColorSchemeKt.getValue(SearchViewTokens.INSTANCE.getDividerColor(), composer, 6);
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            int i4 = i2 << 3;
            textFieldColorsM2440inputFieldColorsITpI4ow = m2440inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, (i4 + 57344) - (i4 | 57344), 16383);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1216168196, i2, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.android.kt:590)");
        }
        SearchBarColors searchBarColors = new SearchBarColors(value2, value, textFieldColorsM2440inputFieldColorsITpI4ow, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return searchBarColors;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: inputFieldColors--u-KgnY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m2439inputFieldColorsuKgnY(long j2, long j3, long j4, TextSelectionColors textSelectionColors, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, Composer composer, int i2, int i3, int i4) {
        long jM4177copywmQWz5c$default = j12;
        long value = j6;
        long value2 = j11;
        long jM4177copywmQWz5c$default2 = j10;
        long value3 = j9;
        long jM4177copywmQWz5c$default3 = j7;
        long value4 = j8;
        long jM4177copywmQWz5c$default4 = j3;
        TextSelectionColors textSelectionColors2 = textSelectionColors;
        long value5 = j4;
        long value6 = j5;
        long value7 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, 355927049, "C(inputFieldColors)P(9:c#ui.graphics.Color,3:c#ui.graphics.Color,0:c#ui.graphics.Color,8,5:c#ui.graphics.Color,10:c#ui.graphics.Color,1:c#ui.graphics.Color,6:c#ui.graphics.Color,11:c#ui.graphics.Color,4:c#ui.graphics.Color,7:c#ui.graphics.Color,2:c#ui.graphics.Color)599@28228L5,601@28323L5,604@28479L5,605@28558L7,606@28641L5,607@28724L5,609@28832L5,612@29008L5,613@29093L5,615@29203L5,618@29374L5,620@29476L5,624@29586L825:SearchBar.android.kt#uh7d8r");
        if ((i4 + 1) - (i4 | 1) != 0) {
            value7 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6);
        }
        if ((i4 + 2) - (i4 | 2) != 0) {
            jM4177copywmQWz5c$default4 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i4 & 4) != 0) {
            value5 = ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6);
        }
        if ((i4 + 8) - (i4 | 8) != 0) {
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) objConsume;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
            value6 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
            value = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
            jM4177copywmQWz5c$default3 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 128)) != 0) {
            value4 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 256)) != 0) {
            value3 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6);
        }
        if ((i4 + 512) - (i4 | 512) != 0) {
            jM4177copywmQWz5c$default2 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i4 + 1024) - (i4 | 1024) != 0) {
            value2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        }
        if ((i4 + 2048) - (i4 | 2048) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(355927049, i2, i3, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:624)");
        }
        int i5 = i2 << 3;
        int i6 = (-1) - (((-1) - (((-1) - (((-1) - i2) | ((-1) - 14))) | ((i5 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i5)))) & ((-1) - ((i5 + 896) - (896 | i5))));
        int i7 = (-1) - (((-1) - i5) | ((-1) - 7168));
        int i8 = ((-1) - (((-1) - ((i6 + i7) - (i6 & i7))) & ((-1) - ((i5 + 57344) - (i5 | 57344))))) | ((-1) - (((-1) - 458752) | ((-1) - i5))) | ((3670016 + i5) - (3670016 | i5));
        int i9 = (29360128 + i5) - (29360128 | i5);
        int i10 = (-1) - (((-1) - ((i8 + i9) - (i8 & i9))) & ((-1) - ((234881024 + i5) - (234881024 | i5))));
        int i11 = i5 & 1879048192;
        int i12 = (i10 + i11) - (i10 & i11);
        int i13 = i2 >> 27;
        int i14 = i3 << 3;
        int i15 = ((i13 + 14) - (i13 | 14)) | ((i14 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i14 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
        int i16 = i3 << 6;
        int i17 = (i16 + 896) - (896 | i16);
        int i18 = (-1) - (((-1) - ((i15 + i17) - (i15 & i17))) & ((-1) - ((i16 + 7168) - (7168 | i16))));
        int i19 = (-1) - (((-1) - i16) | ((-1) - 57344));
        TextSelectionColors textSelectionColors3 = textSelectionColors2;
        TextFieldColors textFieldColorsM2440inputFieldColorsITpI4ow = m2440inputFieldColorsITpI4ow(value7, value7, jM4177copywmQWz5c$default4, value5, textSelectionColors3, value6, value, jM4177copywmQWz5c$default3, value4, value3, jM4177copywmQWz5c$default2, value2, value2, jM4177copywmQWz5c$default, composer, i12, (i18 + i19) - (i18 & i19), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textFieldColorsM2440inputFieldColorsITpI4ow;
    }
}
