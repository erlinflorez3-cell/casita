package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.FilledTonalButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
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
/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nj?CLe^.ZS0\u0012s{J$c$wJCU0}*\teNogtUb\u000bY\u000f\u000e\u0016~n4Ikxe\u0012\u0015@JoM<UoC=fӢ6\u001bړb\"fxE\u0006 *Н\u0014v\tC\u0014\u0017 hXph~SRŋ\u001e\u0012\u0014wh9,\u0015\u007fNdt\u001dc@/1=\u0002B|b\u00106\u0003M\u001b\u0003l';2\u0012$1@Er-%\u0002>7Xa?\u0011}\n=3$m,ɛH֕ɱ:Z\u0006S#k\u0018Ok4>\\3\u0014\u0011\u0012-+]'cP<*(\u0001\u0002\rJH&\u0006UJ^3 f\u0016SKt!UpV\b^PF\u0013ad\u0019U\u00069+Gb~Q\u0010=_SӒz˜ڟ\"%\u00077/%\u001d\u0019n_3T&}wV͘AH\\C\"u{N\tb0V46M\u007f=6).E`ga?#/(\u001aHr#'\u000bfha'jHn]\u001f\u001c=*\u0017JrD\u0013@2UղW\u008cҭQ\u001eZR\fH[bjDT!SR~Unix\u0011u\nS1\u0017=_nyRo9\r5eWi\u0010o\u0018\u000f\u0014m>\u0013\u000b^fP\u001a$Z\u000b*R8Nj\u001e?\u0014D|\u000eY7Ǧpʉٜ03\u001f*#\u0012K)P\u0010\u0015\t\u000e\u0007/\u0015њX32<2\\\u0003W\u0019P\u000b\u001d m~I:7x\"[|\u0002;\u001f&c^\u00014+^7\u0005y\u007fU%dGz(F{[{.T29\u007fj\u0004\u0018ĺ}ǻɨ\u0006/K\u001c\u0001&\u001a\u0010 w\u0013|(Qkn4g\u0016.\t,\u000flzUZ\u00170;vrQ\n\u0015\u0006\u007faT@_c\u0003\r\fDOr\u0011 TNf~5%$%\u000f7:|c/\n,߭\u0015ߐӄ3\u0017g/w9v\u000fp0>t\u0014&\\i\u001cop$u2i\f\u0010^˽B\"2AKMV@\u0010\bp5z\u0012άLAr*\u001fp[`G}\u00153\\\u0013vVit+o,o^e0sQ:,^q`ASYg{+c\\9\u0006?\u0010\u0011{?-*\u001ck[\u001d\\ƻ\bݵӒw\u001a<\u0018I#MG\u0017{L,j4QHҰm\u0006\u001e4H~mf/2p k\\\u0014T\u0007\u0017nH3\u001cuf'*\u000f;'3L4e7\u000bmT\u0012Gc`<\u0004#\u000f\u001bx\u000e\u0017fSf\u000bYܜ\u001aι\u0092\u0005\rK6Q\nRJ\u0012HAm\u001aqbՇ\u001aն\u001c\u00adʩ\u001a8ݔ\u0015a~0l\u000e&x\\h\u000f\u0012\u0015T%à+ϟyՄ˓;\t۪\u000f\u001bWr}e}[\\|OCH\u0007ӢH/\u000fљ\u0015eL\";\u000e\u0006AKR\u0003\u0014U}.Ě=״\u0007¶Ţ&\u0003ȯ%^_\u000et\r.*H \n\u0016\u0011\bƤ\u0017V(ɌFLz}\u00186XM]\u000eK\u0002A`Έjլͳ?&߿p\u000eJKv{\"erp|c[\u001at@ny\u001d/ə\u001cԔ¨L- \\bB\u0011a#p\u0013\u0006$#4oM\u0016sA\u0010}eإoաрZ\fĮ3s2a?3j \u00041\b\u0004TAb;-;\u0005OͷcӷїkAŃ\u0012fr(rw$+\u001a\u0011\rV/ !I^rLjԘ;\u001f'ʺ%If\u001d\u0012M\u001a:/Hj?I9\tЦqƂu֫ޔ9a߰\u0004,J\t\u0001\u00038;;^l=H-ڵ(slܞ>MKQP\u0010|%\u001c+GZf\"\u0015ё\u001c͚:Ǜº@\u0018֩\u0005\u0017@\u0006}\niDxlk%X\u001d3F°C}Im@\u0011E\u0011s>\u001d\u000f3W\u0015W[zְP+$\u0004kj\rk4e\u001d\u0003DIcgT?ߝD\u0004\"!*G\u0014\u001as\u000fSV`*\u000exv\u001cؾ[\b>,<\u0015RA\u0018{\u0007\u001b\",\u00184**պe8Y|\u001aAR\\z<z0]M\u0017\u0016A\n՜I\u0018O\u0011\fSA5M&]\u001dX+w\u001fu/\u000b\u000brQJ̝<ߴe:\u0012IF\b85}(b\u0014\u0003j\u001c}\b\u0010f?CKZ֔3ؒd\u0004x\u001f\u001eXY&\u0017Lj+eA\u00117h\u000fR\fd\u0001bƆ\b\u00892L/\u0004\u0004}nDcIU(YG@\u0003$!K>\u0012c\\ȸi\u0095KCms^rGb[\u0004X\u000fMe\u000b1}!y\u0012aSVӮ-ʜKZV\u001c0\u0010\u0014=ȍdQ\u0018G~نD\u001c/80V\u001e\u0088G7"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S5Dh\b)\u0016m\u0017*]JJy\n", "", "u(E", "\u0010tcAb5!]&\u0003\u0010h5\f\u00056P{'zD\n\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0010tcAb5/S&\u000e~\\(\u0004s+d~,\u0005B", "\u0010tcAb50W(\u0002^\\6\u0006f9n\u000f(\u0005Ok\u0013\u0016Fs\u0017>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "5dc\u000fh;M]\"p~m/`\u00079n]2\u0005O\u0001 &2k\r;z.7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w8?:j8'\u0017Y]@\u0017c:$", "\u0010tcAb50W(\u0002^\\6\u0006k9r\u0004=\u0006I\u0010\u0013\u001e5~\nI\u0006\u00101X|$@o", "\u0011n]AX5M>\u0015}yb5~", "5dc\u0010b5MS\"\u000eeZ+{\r8g", "\u0017b^;F0SS", "5dc\u0016V6GA\u001d\u0014z&\u000bPh45\u0001\u0010", "u(5", "\u0017b^;F7:Q\u001d\b|", "5dc\u0016V6GA$zxb5~P\u000e9_-KAh", "\u001bh]\u0015X0@V(", "5dc\u001a\\5!S\u001d\u0001}ms[\\\u000fjO)c", "\u001bh]$\\+MV", "5dc\u001a\\50W\u0018\u000e}&\u000bPh45\u0001\u0010", "\"dgA5<Mb#\bXh5\f\t8tj$z?\u0005 \u0019", "5dc!X?M0)\u000e\nh5Z\u00138t\u007f1\u000b+|\u0016\u0016Kx\u0010", "\"dgA5<Mb#\b]h9\u0001\u001e9n\u000f$\u0003+|\u0016\u0016Kx\u0010", "\"dgA5<Mb#\blb;\u007fl-o\t\u0006\u0006I\u0010\u0017 VZ\n;u)>[", "5dc!X?M0)\u000e\nh5n\r>hc&\u0006I^! Vo\u0017Ka!4X\u0002)9", "\"dgA5<Mb#\blb;\u007fl-o\t\u000b\u0006M\u0005,!P~\nCV.4Dy\u001f6q\u001f0", "3kTCT;>R\u0007\u0002vi,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc\u0012_,OO(~yL/x\u0014/", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\tz\bUL$D", "4h[9X+-]\"z\u0002L/x\u0014/", "5dc\u0013\\3ES\u0018m\u0005g(\u0004v2a\u000b(", "=tc9\\5>Ru\u000f\nm6\u0006e9r~(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "5dc\u001ch;EW\"~y;<\f\u00189n\\2\t?\u0001$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016O6l[q9#\u0016d\u0017\u0018\b\u0017\u0012XA1\\SD)\u000e,\u001f", "=tc9\\5>R\u0007\u0002vi,", "5dc\u001ch;EW\"~yL/x\u0014/", "AgP=X", "5dc [(IS", "BdgAF/:^\u0019", "5dc!X?MA\u001cz\u0006^", "2dU.h3M0)\u000e\nh5Z\u00136o\r6", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S5Dh\b)\u0015w\u001d8ZQ\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000eWn;\f\u00138C\n/\u0006M\u000fU\u001fC~\u000eIz!<'w-7t\u0016*[C", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZN6Q3}N@|\u00123S\u000fI>", "2dU.h3M3 ~\fZ;|\b\fu\u000f7\u0006I^!\u001eQ|\u001c", "5dc\u0011X-:c \u000eZe,\u000e\u0005>e~\u0005\fO\u0010! %y\u0015F\u00043say/7z\u001a*T\u00115x4%\u0015do9", "2dU.h3M4\u001d\u0006\u0002^+k\u00138a\u0007\u0005\fO\u0010! %y\u0015F\u00043", "5dc\u0011X-:c \u000e[b3\u0004\t.T\n1wG]'&Vy\u0017\u001a\u0001,?f\f^?i%.ZG7r\u0002\u0018\"hh9\u0003q,", "2dU.h3M=)\u000e\u0002b5|\b\fu\u000f7\u0006I^!\u001eQ|\u001c", "5dc\u0011X-:c \u000edn;\u0004\r8e~\u0005\fO\u0010! %y\u0015F\u00043say/7z\u001a*T\u00115x4%\u0015do9", "2dU.h3MB\u0019\u0012\n;<\f\u00189n]2\u0003J\u000e%", "5dc\u0011X-:c \u000ei^?\fe?t\u000f2\u0005\u001e\u000b\u001e!T}LDr45f\u0002\u001c>;\u0010;MJ;gB\u001e", "0tcAb5\u001c] \t\bl", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W+;\u001c\u0014cJ\u0002xKA,\u0016\u0002", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX5M1#\u0006\u0005k", "2hb.U3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "2hb.U3>Rv\t\u0004m,\u0006\u0018\ro\u00072\t", "0tcAb5\u001c] \t\bls\n\u0013)MdzN", "uI9\u0017=\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`$Wx\u001d@~%~7\b(Bw$.Z\u0019\u001fOw\u0005\u0011q`F\u0011g+a@%QTY6jR<E\u0010!Z\u001bR'\u0014R#\u001e4}SA(e6P\fHvV", "0tcAb5\u001eZ\u0019\u0010vm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S5Dh\b)\u0017t\u0016?IR?u=s", "2dU.h3M3 ~\fZ;\u0001\u00138", ">qT@f,=3 ~\fZ;\u0001\u00138", "4nRBf,=3 ~\fZ;\u0001\u00138", "6ne2e,=3 ~\fZ;\u0001\u00138", "2hb.U3>Rx\u0006zo(\f\r9n", "0tcAb5\u001eZ\u0019\u0010vm0\u0007\u0012vRy\rY\u001c\u0016%", "uE5\u00139\r%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`T\u007f\u0017Kz-5#[*?x <MP\u0011O\u0018a{dj8\u0014m0M\npEVV7f`r\u0007\u001c\u000ei\u000e[/\t\f'\u000b\u0001~SF)\u0011\fP\u0002Ld\u0010\u0010 \u0017\u000b", "3kTCT;>Ru\u000f\nm6\u0006f9l\n5\n", "3kTCT;>Ru\u000f\nm6\u0006f9l\n5\n\b\u000e!\u0011/T`\u000f", "3kTCT;>Ru\u000f\nm6\u0006h6e\u0011$\u000bD\u000b ", "3kTCT;>Ru\u000f\nm6\u0006h6e\u0011$\u000bD\u000b ^4ir\u001aR:C", "4h[9X+-]\"z\u0002;<\f\u00189n]2\u0003J\u000e%", "4h[9X+-]\"z\u0002;<\f\u00189n]2\u0003J\u000e%^Ty\b$[w\b", "4h[9X+-]\"z\u0002;<\f\u00189n_/{Q|&\u001bQx", "4h[9X+-]\"z\u0002;<\f\u00189n_/{Q|&\u001bQxU)p\n\u00135\u0013.", "3mP/_,=", "", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zk\u00121\u0007\"g=\u001d\"re8\u001a-*X~2QZNu]\\\u0003F\u0013\u000ei\u0012X4VacN#nQ%.\u00156O\u0002\u0011", "=tc9\\5>Ru\u000f\nm6\u0006f9l\n5\n", "=tc9\\5>Ru\u000f\nm6\u0006f9l\n5\n\b\u000e!\u0011/T`\u000f", "BdgA5<Mb#\bXh3\u0007\u0016=", "BdgA5<Mb#\bXh3\u0007\u0016=-\r2u(eii", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;
    private static final PaddingValues ButtonWithIconContentPadding;
    private static final float ButtonWithIconHorizontalStartPadding;
    private static final PaddingValues ContentPadding;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;
    private static final PaddingValues TextButtonWithIconContentPadding;
    private static final float TextButtonWithIconHorizontalEndPadding;

    private ButtonDefaults() {
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    public final PaddingValues getButtonWithIconContentPadding() {
        return ButtonWithIconContentPadding;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    public final PaddingValues getTextButtonWithIconContentPadding() {
        return TextButtonWithIconContentPadding;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1835getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1834getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1832getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* JADX INFO: renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1833getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    public final Shape getShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1234923021, "C542@25460L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234923021, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:542)");
        }
        Shape value = ShapesKt.getValue(FilledButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getElevatedShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 2143958791, "C546@25609L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143958791, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:546)");
        }
        Shape value = ShapesKt.getValue(ElevatedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getFilledTonalShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -886584987, "C550@25767L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-886584987, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:550)");
        }
        Shape value = ShapesKt.getValue(FilledTonalButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getOutlinedShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -2045213065, "C554@25916L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045213065, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:554)");
        }
        Shape value = ShapesKt.getValue(OutlinedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getTextShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -349121587, "C558@26052L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-349121587, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:558)");
        }
        Shape value = ShapesKt.getValue(TextButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final ButtonColors buttonColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1449248637, "C(buttonColors)564@26242L11:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1449248637, i2, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:564)");
        }
        ButtonColors defaultButtonColors$material3_release = getDefaultButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultButtonColors$material3_release;
    }

    /* JADX INFO: renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1826buttonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j4;
        long jM4214getUnspecified0d7_KjU2 = j2;
        long jM4214getUnspecified0d7_KjU3 = j5;
        long jM4214getUnspecified0d7_KjU4 = j3;
        ComposerKt.sourceInformationMarkerStart(composer, -339300779, "C(buttonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)582@27048L11:Button.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339300779, i2, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:582)");
        }
        ButtonColors buttonColorsM1821copyjRlVdoo = getDefaultButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1821copyjRlVdoo(jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU, jM4214getUnspecified0d7_KjU3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return buttonColorsM1821copyjRlVdoo;
    }

    public final ButtonColors getDefaultButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultButtonColorsCached$material3_release = colorScheme.getDefaultButtonColorsCached$material3_release();
        if (defaultButtonColorsCached$material3_release != null) {
            return defaultButtonColorsCached$material3_release;
        }
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getLabelTextColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    public final ButtonColors elevatedButtonColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 2025043443, "C(elevatedButtonColors)609@28364L11:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025043443, i2, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:609)");
        }
        ButtonColors defaultElevatedButtonColors$material3_release = getDefaultElevatedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultElevatedButtonColors$material3_release;
    }

    /* JADX INFO: renamed from: elevatedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1828elevatedButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j2;
        long jM4214getUnspecified0d7_KjU2 = j4;
        long jM4214getUnspecified0d7_KjU3 = j3;
        long jM4214getUnspecified0d7_KjU4 = j5;
        ComposerKt.sourceInformationMarkerStart(composer, 1507908383, "C(elevatedButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)627@29223L11:Button.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507908383, i2, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:627)");
        }
        ButtonColors buttonColorsM1821copyjRlVdoo = getDefaultElevatedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1821copyjRlVdoo(jM4214getUnspecified0d7_KjU, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return buttonColorsM1821copyjRlVdoo;
    }

    public final ButtonColors getDefaultElevatedButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultElevatedButtonColorsCached$material3_release = colorScheme.getDefaultElevatedButtonColorsCached$material3_release();
        if (defaultElevatedButtonColorsCached$material3_release != null) {
            return defaultElevatedButtonColorsCached$material3_release;
        }
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getLabelTextColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getDisabledContainerColor()), ElevatedButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getDisabledLabelTextColor()), ElevatedButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    public final ButtonColors filledTonalButtonColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 824987837, "C(filledTonalButtonColors)655@30593L11:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(824987837, i2, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:655)");
        }
        ButtonColors defaultFilledTonalButtonColors$material3_release = getDefaultFilledTonalButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultFilledTonalButtonColors$material3_release;
    }

    /* JADX INFO: renamed from: filledTonalButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1830filledTonalButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j5;
        long jM4214getUnspecified0d7_KjU2 = j4;
        long jM4214getUnspecified0d7_KjU3 = j3;
        long jM4214getUnspecified0d7_KjU4 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, 1670757653, "C(filledTonalButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)674@31482L11:Button.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1670757653, i2, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:674)");
        }
        ButtonColors buttonColorsM1821copyjRlVdoo = getDefaultFilledTonalButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1821copyjRlVdoo(jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return buttonColorsM1821copyjRlVdoo;
    }

    public final ButtonColors getDefaultFilledTonalButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultFilledTonalButtonColorsCached$material3_release = colorScheme.getDefaultFilledTonalButtonColorsCached$material3_release();
        if (defaultFilledTonalButtonColorsCached$material3_release != null) {
            return defaultFilledTonalButtonColorsCached$material3_release;
        }
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, FilledTonalButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledTonalButtonTokens.INSTANCE.getLabelTextColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTonalButtonTokens.INSTANCE.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTonalButtonTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledTonalButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    public final ButtonColors outlinedButtonColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1344886725, "C(outlinedButtonColors)701@32872L11:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344886725, i2, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:701)");
        }
        ButtonColors defaultOutlinedButtonColors$material3_release = getDefaultOutlinedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultOutlinedButtonColors$material3_release;
    }

    /* JADX INFO: renamed from: outlinedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1836outlinedButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j3;
        long jM4214getUnspecified0d7_KjU2 = j5;
        long jM4214getUnspecified0d7_KjU3 = j4;
        long jM4214getUnspecified0d7_KjU4 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, -1778526249, "C(outlinedButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)719@33731L11:Button.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1778526249, i2, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:719)");
        }
        ButtonColors buttonColorsM1821copyjRlVdoo = getDefaultOutlinedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1821copyjRlVdoo(jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return buttonColorsM1821copyjRlVdoo;
    }

    public final ButtonColors getDefaultOutlinedButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultOutlinedButtonColorsCached$material3_release = colorScheme.getDefaultOutlinedButtonColorsCached$material3_release();
        if (defaultOutlinedButtonColorsCached$material3_release != null) {
            return defaultOutlinedButtonColorsCached$material3_release;
        }
        ButtonColors buttonColors = new ButtonColors(Color.Companion.m4213getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, OutlinedButtonTokens.INSTANCE.getLabelTextColor()), Color.Companion.m4213getTransparent0d7_KjU(), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedButtonTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    public final ButtonColors textButtonColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1880341584, "C(textButtonColors)744@34895L11:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1880341584, i2, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:744)");
        }
        ButtonColors defaultTextButtonColors$material3_release = getDefaultTextButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTextButtonColors$material3_release;
    }

    /* JADX INFO: renamed from: textButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1837textButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j4;
        long jM4214getUnspecified0d7_KjU2 = j2;
        long jM4214getUnspecified0d7_KjU3 = j5;
        long jM4214getUnspecified0d7_KjU4 = j3;
        ComposerKt.sourceInformationMarkerStart(composer, -1402274782, "C(textButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)762@35725L11:Button.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402274782, i2, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:762)");
        }
        ButtonColors buttonColorsM1821copyjRlVdoo = getDefaultTextButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1821copyjRlVdoo(jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU, jM4214getUnspecified0d7_KjU3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return buttonColorsM1821copyjRlVdoo;
    }

    public final ButtonColors getDefaultTextButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultTextButtonColorsCached$material3_release = colorScheme.getDefaultTextButtonColorsCached$material3_release();
        if (defaultTextButtonColorsCached$material3_release != null) {
            return defaultTextButtonColorsCached$material3_release;
        }
        ButtonColors buttonColors = new ButtonColors(Color.Companion.m4213getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, TextButtonTokens.INSTANCE.getLabelTextColor()), Color.Companion.m4213getTransparent0d7_KjU(), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, TextButtonTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultTextButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    /* JADX INFO: renamed from: buttonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1827buttonElevationR_JCAzs(float f2, float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        float fM3260getDisabledContainerElevationD9Ej5fM = f6;
        float fM3262getHoverContainerElevationD9Ej5fM = f5;
        float fM3261getFocusContainerElevationD9Ej5fM = f4;
        float fM3264getPressedContainerElevationD9Ej5fM = f3;
        float fM3258getContainerElevationD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, 1827791191, "C(buttonElevation)P(0:c#ui.unit.Dp,4:c#ui.unit.Dp,2:c#ui.unit.Dp,3:c#ui.unit.Dp,1:c#ui.unit.Dp):Button.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            fM3258getContainerElevationD9Ej5fM = FilledButtonTokens.INSTANCE.m3258getContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            fM3264getPressedContainerElevationD9Ej5fM = FilledButtonTokens.INSTANCE.m3264getPressedContainerElevationD9Ej5fM();
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            fM3261getFocusContainerElevationD9Ej5fM = FilledButtonTokens.INSTANCE.m3261getFocusContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            fM3262getHoverContainerElevationD9Ej5fM = FilledButtonTokens.INSTANCE.m3262getHoverContainerElevationD9Ej5fM();
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            fM3260getDisabledContainerElevationD9Ej5fM = FilledButtonTokens.INSTANCE.m3260getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1827791191, i2, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:802)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(fM3258getContainerElevationD9Ej5fM, fM3264getPressedContainerElevationD9Ej5fM, fM3261getFocusContainerElevationD9Ej5fM, fM3262getHoverContainerElevationD9Ej5fM, fM3260getDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return buttonElevation;
    }

    /* JADX INFO: renamed from: elevatedButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1829elevatedButtonElevationR_JCAzs(float f2, float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        float fM3179getDisabledContainerElevationD9Ej5fM = f6;
        float fM3181getHoverContainerElevationD9Ej5fM = f5;
        float fM3180getFocusContainerElevationD9Ej5fM = f4;
        float fM3183getPressedContainerElevationD9Ej5fM = f3;
        float fM3177getContainerElevationD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, 1065482445, "C(elevatedButtonElevation)P(0:c#ui.unit.Dp,4:c#ui.unit.Dp,2:c#ui.unit.Dp,3:c#ui.unit.Dp,1:c#ui.unit.Dp):Button.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            fM3177getContainerElevationD9Ej5fM = ElevatedButtonTokens.INSTANCE.m3177getContainerElevationD9Ej5fM();
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            fM3183getPressedContainerElevationD9Ej5fM = ElevatedButtonTokens.INSTANCE.m3183getPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            fM3180getFocusContainerElevationD9Ej5fM = ElevatedButtonTokens.INSTANCE.m3180getFocusContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            fM3181getHoverContainerElevationD9Ej5fM = ElevatedButtonTokens.INSTANCE.m3181getHoverContainerElevationD9Ej5fM();
        }
        if ((i3 & 16) != 0) {
            fM3179getDisabledContainerElevationD9Ej5fM = ElevatedButtonTokens.INSTANCE.m3179getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1065482445, i2, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:829)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(fM3177getContainerElevationD9Ej5fM, fM3183getPressedContainerElevationD9Ej5fM, fM3180getFocusContainerElevationD9Ej5fM, fM3181getHoverContainerElevationD9Ej5fM, fM3179getDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return buttonElevation;
    }

    /* JADX INFO: renamed from: filledTonalButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1831filledTonalButtonElevationR_JCAzs(float f2, float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        float fM6638constructorimpl = f6;
        float fM3281getContainerElevationD9Ej5fM = f2;
        float fM3284getFocusContainerElevationD9Ej5fM = f4;
        float fM3287getPressedContainerElevationD9Ej5fM = f3;
        float fM3285getHoverContainerElevationD9Ej5fM = f5;
        ComposerKt.sourceInformationMarkerStart(composer, 5982871, "C(filledTonalButtonElevation)P(0:c#ui.unit.Dp,4:c#ui.unit.Dp,2:c#ui.unit.Dp,3:c#ui.unit.Dp,1:c#ui.unit.Dp):Button.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            fM3281getContainerElevationD9Ej5fM = FilledTonalButtonTokens.INSTANCE.m3281getContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            fM3287getPressedContainerElevationD9Ej5fM = FilledTonalButtonTokens.INSTANCE.m3287getPressedContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            fM3284getFocusContainerElevationD9Ej5fM = FilledTonalButtonTokens.INSTANCE.m3284getFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            fM3285getHoverContainerElevationD9Ej5fM = FilledTonalButtonTokens.INSTANCE.m3285getHoverContainerElevationD9Ej5fM();
        }
        if ((i3 & 16) != 0) {
            fM6638constructorimpl = Dp.m6638constructorimpl(0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(5982871, i2, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:859)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(fM3281getContainerElevationD9Ej5fM, fM3287getPressedContainerElevationD9Ej5fM, fM3284getFocusContainerElevationD9Ej5fM, fM3285getHoverContainerElevationD9Ej5fM, fM6638constructorimpl, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return buttonElevation;
    }

    @Deprecated(message = "\u0013R\u00016\u0005yTlkLg\u000fX\u001akda^\u001c0\u0014vKf~G\u0003*bu/k{\feP\r\\mGG ??\u0016V\f\n#jIH%RCQ\u0013L(\u0004/~9Arm~I P\u0010nq4\u0017\u0007M\u0010~\u0012JB0pgw@\u0013\u001f}\u000e2z%XO5\u000f\u001c\u0018\u0014Mk", replaceWith = @ReplaceWith(expression = "outlinedButtonBorder(enabled)", imports = {}))
    @InterfaceC1492Gx
    public final BorderStroke getOutlinedButtonBorder(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -563957672, "C879@41501L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-563957672, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:877)");
        }
        BorderStroke borderStrokeM600BorderStrokecXLIe8U = BorderStrokeKt.m600BorderStrokecXLIe8U(OutlinedButtonTokens.INSTANCE.m3363getOutlineWidthD9Ej5fM(), ColorSchemeKt.getValue(OutlinedButtonTokens.INSTANCE.getOutlineColor(), composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return borderStrokeM600BorderStrokecXLIe8U;
    }

    public final BorderStroke outlinedButtonBorder(boolean z2, Composer composer, int i2, int i3) {
        long jM4177copywmQWz5c$default;
        ComposerKt.sourceInformationMarkerStart(composer, -626854767, "C(outlinedButtonBorder):Button.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            z2 = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-626854767, i2, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonBorder (Button.kt:889)");
        }
        float fM3363getOutlineWidthD9Ej5fM = OutlinedButtonTokens.INSTANCE.m3363getOutlineWidthD9Ej5fM();
        if (z2) {
            composer.startReplaceGroup(-855870548);
            ComposerKt.sourceInformation(composer, "893@41926L5");
            jM4177copywmQWz5c$default = ColorSchemeKt.getValue(OutlinedButtonTokens.INSTANCE.getOutlineColor(), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-855783004);
            ComposerKt.sourceInformation(composer, "895@42011L5");
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedButtonTokens.INSTANCE.getOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceGroup();
        }
        BorderStroke borderStrokeM600BorderStrokecXLIe8U = BorderStrokeKt.m600BorderStrokecXLIe8U(fM3363getOutlineWidthD9Ej5fM, jM4177copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return borderStrokeM600BorderStrokecXLIe8U;
    }

    static {
        float fM6638constructorimpl = Dp.m6638constructorimpl(24);
        ButtonHorizontalPadding = fM6638constructorimpl;
        float f2 = 8;
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(f2);
        ButtonVerticalPadding = fM6638constructorimpl2;
        PaddingValues paddingValuesM1014PaddingValuesa9UjIt4 = PaddingKt.m1014PaddingValuesa9UjIt4(fM6638constructorimpl, fM6638constructorimpl2, fM6638constructorimpl, fM6638constructorimpl2);
        ContentPadding = paddingValuesM1014PaddingValuesa9UjIt4;
        float f3 = 16;
        float fM6638constructorimpl3 = Dp.m6638constructorimpl(f3);
        ButtonWithIconHorizontalStartPadding = fM6638constructorimpl3;
        ButtonWithIconContentPadding = PaddingKt.m1014PaddingValuesa9UjIt4(fM6638constructorimpl3, fM6638constructorimpl2, fM6638constructorimpl, fM6638constructorimpl2);
        float fM6638constructorimpl4 = Dp.m6638constructorimpl(12);
        TextButtonHorizontalPadding = fM6638constructorimpl4;
        TextButtonContentPadding = PaddingKt.m1014PaddingValuesa9UjIt4(fM6638constructorimpl4, paddingValuesM1014PaddingValuesa9UjIt4.mo971calculateTopPaddingD9Ej5fM(), fM6638constructorimpl4, paddingValuesM1014PaddingValuesa9UjIt4.mo968calculateBottomPaddingD9Ej5fM());
        float fM6638constructorimpl5 = Dp.m6638constructorimpl(f3);
        TextButtonWithIconHorizontalEndPadding = fM6638constructorimpl5;
        TextButtonWithIconContentPadding = PaddingKt.m1014PaddingValuesa9UjIt4(fM6638constructorimpl4, paddingValuesM1014PaddingValuesa9UjIt4.mo971calculateTopPaddingD9Ej5fM(), fM6638constructorimpl5, paddingValuesM1014PaddingValuesa9UjIt4.mo968calculateBottomPaddingD9Ej5fM());
        MinWidth = Dp.m6638constructorimpl(58);
        MinHeight = Dp.m6638constructorimpl(40);
        IconSize = FilledButtonTokens.INSTANCE.m3263getIconSizeD9Ej5fM();
        IconSpacing = Dp.m6638constructorimpl(f2);
    }
}
