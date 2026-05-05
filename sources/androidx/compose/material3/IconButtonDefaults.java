package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: IconButton.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u000e\u0007njO0LeN/ZS@\u000fs{:+c$\bCCU \u0010*\teNo˧vJh\u0014K\u000f\f(~͛,_ǁ)]@\u000erGu?ݯQoK9)\u007fD\u001982P@@\nв\u001e*V%?3Q_$\u0012^H!@X\r[\u001b2\u00124UP\u0007$\\ufNH\u001btj5)\u0003w[f'\u000eG-S\u0013FbA%v\u00105qE̳4ՖȏW\u0005\rmi[KJ\u007fZ\u001dhU4qNָ[6f\u001e\\a9l%]!3\r\u000bW`\u001a=CO\u0012b\u0001\u0014.w\t\u0014%<2%6-N.;3~\b<J%xY@^\u001cvB.\u0012\u0012<\u001d%\u000eRC9I}\u0002gA\u0019\\W\u0014\u0005;5i\u0006ϒ żڍ\u0012b\u001b<b\u001a\u001a<_cUH|\u0012 Bъ\bpp\u0017r<>j\u0018/*\u0019^\u001d+7iO;!\u001a\u0019xJmv\u0013x\u0001S\u0018ixF(n$PB\t:qtj\u000bk^np,?dbYϮ|ܱ˙$^}`/AXY]\u000e\u0002j{jP*çj7g\r4Ze^v3c^\u0014\u0016gR\u0005*W<\u0011\u001c\tlHS\u001art(PIxp\u0016w\n]f\fAIow\"4:K1\\C_3$HA\u000b(wZ\u0017'/Z9$\u0011\n<t7\u0018\u0017a̒nΟ֑M.\u0003\u00070O\n\\C@>UPpz\u0002ɠ\u000b~\u0002\u0015\u0010 ZndlD}\u0006\u0002&\u0016(Oi/k*?\u0005/2\u0010E]L!|\u0002S\u0018'\t\u0016\u0012\u000fi\u007f^m\u000ej~Fxjxf\u001b\u001cɪuܥѓ'\nj(\b}\u000f\u0006U\rl\u000b\nK\u0010wè]<\\VEQ-G=\u0001\u001e/-;3C53.wBFEgci}F\u0012b==%k\n,q/\bb\u007ftbA>Ig\u0019V\"R\u00043HNj\u0006'Z\tb$cNGd~vPM9FDk÷+ݸ\u0080Z]@=} |AmU\fC,@\u000fG3>eS\u0016\u001c4Pů\u000fJ\u001d9S\u0007?\u001f*\u001ck(\u001d\\ť\r0\u0014\t`nOkz\u0005j\u0011T:2<\u0016![T\u0018\u001d@\u0001\u0006Fm'/2p\u000bk\\\u0014T\u0007unH3wuf'*\u000f\u0019'3L\u0010{6ރlۮߟ3e82a9Q8x\u0002\u0017h;*r\u0001i\u001f6\u0006\u0019\u000bs\fsM\u0010i\u001cGW\u001c2tɒ<\u0018\u000bQ\u000b#)ni\u0011\u000e\u0004vcκYd\\\u0003?^t\bf\"W\f+\u0003\u0014<\u0018%#\u0019}\n h3L\\\u0010OCH\u0018GJ/\u0007\u001a\u0016{FID6;3=W\u0005,'*n\u0004A\u0004\b.??\u0004#8\r]\u0014f\u0018}3:D\t\\gר\bސц$\u00064\u0001\u0003\u0015RJ\u0016mg\u0002a\n;^\bt(%N_Cl4Y\u0012ЕɆ\tɨؼgp[D\u0011!yr\b*EPK\u0016OM\\\u001c\t^HIk \u0007(FǴߴ%˿߱\fd/L]!1\ry\u000es\rY7\u0014*\u0010:`V,67y$\u001bpĔՈ\u0014ܑ͇Q@jHj'\u000bs\u001c\u001f\u0003(\u0013\u00024)B\u0006/LlI+4t\ndҋծ6؟۵_\u000fM\"\u0015A\u0016X4\"IRm\u001dmwцs,\u000f\u0013\t=pxP9P\u000e\u000b\u007f\u0016.c\fÊA\u001e?[*sr\u0007vaS?Z\bZ\u00196\u0011]cn^\u0015я\u001c̄?UKC\u001f\u001b\u000f \t\u001c}\u001315\u0019^{%X\n3?cׅ{܊o>\f9x1=\u001e@1evS%cmt':\u000b\u001c\tU\u07b8eȡ\u0013eDK;V,\u0005&V\u000e\u001c7$R\u0013\u001e#.Ng\u0007\u0001ؤ^ȡZwo\u0006,=D}ޒ#Lt{yԣH\u0018\u0017Şh\u001e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006Z#?bZ0F| 7,C<gD%$v7", "", "u(E", "4h[9X+,V\u0015\nz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc\u0013\\3ES\u0018l}Z7|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\tz\bUL$D", "=tc9\\5>R\u0007\u0002vi,", "5dc\u001ch;EW\"~yL/x\u0014/", "2dU.h3M4\u001d\u0006\u0002^+`\u00079n\\8\u000bO\u000b tQv\u0018I\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006Z#?bZ0F| 7+MBuA,j", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000e[b3\u0004\t.I}2\u0005\u001d\u0011&&QxkF}/Bg<(3|\u0016;Q?B9.+\u0015oa5\u0015c", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZN=?.w!G.\u00176R_Eo\u000b\u0019$c", "2dU.h3M4\u001d\u0006\u0002^+`\u00079nn2}B\b\u0017sW~\u001dF\u007f\u0003?`\b-E", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006Z#?bl*9o\u001d.*SJz>'rrhC\u0014q\u0002", "5dc\u0011X-:c \u000e[b3\u0004\t.I}2\u0005/\u000b\u0019\u0019NojL\u00064?b[*>w#<\fK7z4+\u0019dh\u0007\u0001p,Uv#UL", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZN=?.w3A!\n3I^Kw\u0010\u0016\u001fk?qzOde", "2dU.h3M4\u001d\u0006\u0002^+k\u00138a\u0007\fyJ\ns'V~\u0018ET/<c\u000b.", "5dc\u0011X-:c \u000e[b3\u0004\t.T\n1wGd\u0015!PL\u001eK\u0006/>7\b'Az$lU?JkA\"\u0011o/3\u0014c3Nr5G", "2dU.h3M4\u001d\u0006\u0002^+k\u00138a\u0007\fyJ\n\u0006!Iq\u0015<S5Dh\b)\u0015w\u001d8ZQ", "5dc\u0011X-:c \u000e[b3\u0004\t.T\n1wGd\u0015!P^\u0018>x,56\u000e/Fw\u001f\fWJExB\\\u001ddp9\u0014g(UD!TLU,X`r", "4h[9X+\"Q#\bWn;\f\u00138C\n/\u0006M\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W2)\u0017\u000e6Q3}N@|\u00123S\u000fI>", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX5M1#\u0006\u0005k", "2hb.U3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "2hb.U3>Rv\t\u0004m,\u0006\u0018\ro\u00072\t", "4h[9X+\"Q#\bWn;\f\u00138C\n/\u0006M\u000f^$Qiu!Iw", "uI9\u0017=\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`$Wx\u001d@~%~7\b(Bw$.Z\u0019\u001fOw\u0005\u0011q`F\u0011g+a@%QTY6jR<E\u0010!Z\u001bR'\u0014R#%\"xM\u0014/\u0017;S\u000b\u0019r\b\u0016#\u001c\u000b", "4h[9X+\"Q#\bih.~\u0010/B\u00107\u000bJ\nt!Ny\u001bJ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W2)\u0017\u000eHK&pK7{\u0018;X\fDF\u000b\u0013 \u001bC@", "1gT0^,=1#\b\nZ0\u0006\t<C\n/\u0006M", "1gT0^,=1#\b\n^5\ff9l\n5", "4h[9X+\"Q#\bih.~\u0010/B\u00107\u000bJ\nt!Ny\u001bJ>tD`L\"Ek", "uI9\u0017=\u0011#:\u0015\byk6\u0001\bB/}2\u0004K\u000b%\u0017\u0011|\u001eE\u0006)=YG}Au!8[CHA\u0018\u0002XO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u001aV\u001dN8\u0011\u0001`\u000fmRBA(v6K\u0004Bh]\u001c%\u001d?sNL]\u001aT\bj", "4h[9X+-]\"z\u0002B*\u0007\u0012\fu\u000f7\u0006I^!\u001eQ|\u001c", "4h[9X+-]\"z\u0002B*\u0007\u0012\fu\u000f7\u0006I^!\u001eQ|\u001c\u0004\u0004//Abr\n", "4h[9X+-]\"z\u0002B*\u0007\u0012\u001eo\u0002*\u0003@]'&Vy\u0017\u001a\u0001,?f\f", "4h[9X+-]\"z\u0002B*\u0007\u0012\u001eo\u0002*\u0003@]'&Vy\u0017\u001a\u0001,?f\fg\u0007|\u001d|OQ9", "7b^;5<Mb#\bXh3\u0007\u0016=", "7b^;5<Mb#\bXh3\u0007\u0016=-\r2u(eii", "7b^;G6@U ~Wn;\f\u00138C\n/\u0006M\u000f", "7b^;G6@U ~Wn;\f\u00138C\n/\u0006M\u000f^fVv\\>\u0005#", "=tc9\\5>R||\u0005g\t\r\u0018>o\t\u0005\u0006M\u007f\u0017$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "3mP/_,=", "", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zk\u0012\u0011*7t3+\u001fl`LPa6V\u00021UL\u0018-fb{<\u0010!^\u0018Wti\u000ff@${2F,\u00122IW", "=tc9\\5>R||\u0005g\t\r\u0018>o\t\u0006\u0006G\u000b$%", "=tc9\\5>R||\u0005g\t\r\u0018>o\t\u0006\u0006G\u000b$%\u000f|\u00186^\n\b,", "=tc9\\5>R||\u0005g\u001b\u0007\u000b1l\u007f\u0005\fO\u0010! $y\u001b;v2", "1gT0^,=", "uYI\u0019T5=`#\u0003yquz\u00137p\n6{\n\u000e' Vs\u0016<@\u0003?a\t*Em#\u00041\u0007\"g=\u001d\"re8\u001a-*X~2QZNu]\\\u0003F\u0013\u000ei\u0012X4VacN#nQ%.\u00156O\u0002\u0011", "=tc9\\5>R||\u0005g\u001b\u0007\u000b1l\u007f\u0005\fO\u0010! %y\u0015F\u00043", "=tc9\\5>R||\u0005g\u001b\u0007\u000b1l\u007f\u0005\fO\u0010! %y\u0015F\u00043|)\r'\u0006o$,", "2dU.h3M7\u0017\t\u0004;<\f\u00189n]2\u0003J\u000e%", ":nR._\nH\\(~\u0004m\n\u0007\u00109r", "2dU.h3M7\u0017\t\u0004;<\f\u00189n]2\u0003J\u000e%^\u0016a|\"c\b!\u0018\u0006\u001cFm#2IJ\teA\u001e\u001ch]G\u0007", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011Pw\u0005\u0011q`F\u0011g+a@%QTY6jR<E\u0010!Z\u001bR'\u0014R#%\"xM\u0014/\u0017;S\u000b\u0019r\b\u0016#\u001c\u000b", "2dU.h3M7\u0017\t\u0004M6~\u000b6e\\8\u000bO\u000b tQv\u0018I\u0005", "2dU.h3M7\u0017\t\u0004M6~\u000b6e\\8\u000bO\u000b tQv\u0018I\u0005l\u0004Kl\u0006$P\u0002lU?JkA\"\u0011o/3\u0014c3Nr5G", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011Pw\u0005\u0011q`F\u0011g+a@%QTY6jR<E\u0010!Z\u001bR'\u0014R#%\"xM&)\n.P\u0002\u0018x\u0010\u001b \u0017\u0013twLc\u001e\u001d", "2dU.h3M=)\u000e\u0002b5|\b\u0013c\n1XP\u0010&!PM\u0018C\u00012C", "2dU.h3M=)\u000e\u0002b5|\b\u0013c\n1XP\u0010&!PM\u0018C\u00012C!L\u0012&S\u0003\u00119\u0002CgC\u001e\"l]@T]9N}'CZN", "2dU.h3M=)\u000e\u0002b5|\b\u0013c\n1jJ\u0003\u0019\u001eGL\u001eK\u0006/>7\b'Az$", "2dU.h3M=)\u000e\u0002b5|\b\u0013c\n1jJ\u0003\u0019\u001eGL\u001eK\u0006/>7\b'Az$u\u001c5*Q!\u0001\u0001'i5\u0016c9Rr.\u0015F[,cRnK\u0014", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class IconButtonDefaults {
    public static final int $stable = 0;
    public static final IconButtonDefaults INSTANCE = new IconButtonDefaults();

    private IconButtonDefaults() {
    }

    public final Shape getFilledShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1265841879, "C584@27553L5:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1265841879, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButton.kt:584)");
        }
        Shape value = ShapesKt.getValue(FilledIconButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getOutlinedShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1327125527, "C588@27711L5:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1327125527, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-outlinedShape> (IconButton.kt:588)");
        }
        Shape value = ShapesKt.getValue(OutlinedIconButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final IconButtonColors iconButtonColors(Composer composer, int i2) {
        composer.startReplaceGroup(-1519621781);
        ComposerKt.sourceInformation(composer, "C(iconButtonColors)593@27925L7,594@27968L11:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1519621781, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:592)");
        }
        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContentColor);
        ComposerKt.sourceInformationMarkerEnd(composer);
        long jM4188unboximpl = ((Color) objConsume).m4188unboximpl();
        IconButtonColors iconButtonColorsM2154defaultIconButtonColors4WTKRHQ$material3_release = m2154defaultIconButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), jM4188unboximpl);
        if (Color.m4179equalsimpl0(iconButtonColorsM2154defaultIconButtonColors4WTKRHQ$material3_release.m2151getContentColor0d7_KjU(), jM4188unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return iconButtonColorsM2154defaultIconButtonColors4WTKRHQ$material3_release;
        }
        IconButtonColors iconButtonColorsM2146copyjRlVdoo$default = IconButtonColors.m2146copyjRlVdoo$default(iconButtonColorsM2154defaultIconButtonColors4WTKRHQ$material3_release, 0L, jM4188unboximpl, 0L, Color.m4177copywmQWz5c$default(jM4188unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconButtonColorsM2146copyjRlVdoo$default;
    }

    /* JADX INFO: renamed from: iconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m2162iconButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long jM4177copywmQWz5c$default = j5;
        long jM4214getUnspecified0d7_KjU = j4;
        long jM4188unboximpl = j3;
        long jM4214getUnspecified0d7_KjU2 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, 999008085, "C(iconButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)617@28950L7,622@29180L11,623@29247L7:IconButton.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            jM4188unboximpl = ((Color) objConsume).m4188unboximpl();
        }
        if ((i3 & 4) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(jM4188unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(999008085, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:622)");
        }
        ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(composer, 6);
        ProvidableCompositionLocal<Color> localContentColor2 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(localContentColor2);
        ComposerKt.sourceInformationMarkerEnd(composer);
        IconButtonColors iconButtonColorsM2149copyjRlVdoo = m2154defaultIconButtonColors4WTKRHQ$material3_release(colorScheme, ((Color) objConsume2).m4188unboximpl()).m2149copyjRlVdoo(jM4214getUnspecified0d7_KjU2, jM4188unboximpl, jM4214getUnspecified0d7_KjU, jM4177copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return iconButtonColorsM2149copyjRlVdoo;
    }

    /* JADX INFO: renamed from: defaultIconButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconButtonColors m2154defaultIconButtonColors4WTKRHQ$material3_release(ColorScheme colorScheme, long j2) {
        IconButtonColors defaultIconButtonColorsCached$material3_release = colorScheme.getDefaultIconButtonColorsCached$material3_release();
        if (defaultIconButtonColorsCached$material3_release != null) {
            return defaultIconButtonColorsCached$material3_release;
        }
        IconButtonColors iconButtonColors = new IconButtonColors(Color.Companion.m4213getTransparent0d7_KjU(), j2, Color.Companion.m4213getTransparent0d7_KjU(), Color.m4177copywmQWz5c$default(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultIconButtonColorsCached$material3_release(iconButtonColors);
        return iconButtonColors;
    }

    public final IconToggleButtonColors iconToggleButtonColors(Composer composer, int i2) {
        composer.startReplaceGroup(-589987581);
        ComposerKt.sourceInformation(composer, "C(iconToggleButtonColors)651@30397L7,652@30440L11:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-589987581, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:650)");
        }
        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContentColor);
        ComposerKt.sourceInformationMarkerEnd(composer);
        long jM4188unboximpl = ((Color) objConsume).m4188unboximpl();
        IconToggleButtonColors iconToggleButtonColorsM2155defaultIconToggleButtonColors4WTKRHQ$material3_release = m2155defaultIconToggleButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), jM4188unboximpl);
        if (Color.m4179equalsimpl0(iconToggleButtonColorsM2155defaultIconToggleButtonColors4WTKRHQ$material3_release.m2176getContentColor0d7_KjU(), jM4188unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return iconToggleButtonColorsM2155defaultIconToggleButtonColors4WTKRHQ$material3_release;
        }
        IconToggleButtonColors iconToggleButtonColorsM2171copytNS2XkQ$default = IconToggleButtonColors.m2171copytNS2XkQ$default(iconToggleButtonColorsM2155defaultIconToggleButtonColors4WTKRHQ$material3_release, 0L, jM4188unboximpl, 0L, Color.m4177copywmQWz5c$default(jM4188unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconToggleButtonColorsM2171copytNS2XkQ$default;
    }

    /* JADX INFO: renamed from: iconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m2163iconToggleButtonColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j7;
        long jM4214getUnspecified0d7_KjU2 = j6;
        long jM4177copywmQWz5c$default = j5;
        long jM4214getUnspecified0d7_KjU3 = j4;
        long jM4188unboximpl = j3;
        long jM4214getUnspecified0d7_KjU4 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, -2020719549, "C(iconToggleButtonColors)P(2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color)678@31629L7,685@31979L11,686@32052L7:IconButton.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            jM4188unboximpl = ((Color) objConsume).m4188unboximpl();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(jM4188unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020719549, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:685)");
        }
        ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(composer, 6);
        ProvidableCompositionLocal<Color> localContentColor2 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(localContentColor2);
        ComposerKt.sourceInformationMarkerEnd(composer);
        IconToggleButtonColors iconToggleButtonColorsM2172copytNS2XkQ = m2155defaultIconToggleButtonColors4WTKRHQ$material3_release(colorScheme, ((Color) objConsume2).m4188unboximpl()).m2172copytNS2XkQ(jM4214getUnspecified0d7_KjU4, jM4188unboximpl, jM4214getUnspecified0d7_KjU3, jM4177copywmQWz5c$default, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return iconToggleButtonColorsM2172copytNS2XkQ;
    }

    /* JADX INFO: renamed from: defaultIconToggleButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconToggleButtonColors m2155defaultIconToggleButtonColors4WTKRHQ$material3_release(ColorScheme colorScheme, long j2) {
        IconToggleButtonColors defaultIconToggleButtonColorsCached$material3_release = colorScheme.getDefaultIconToggleButtonColorsCached$material3_release();
        if (defaultIconToggleButtonColorsCached$material3_release != null) {
            return defaultIconToggleButtonColorsCached$material3_release;
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(Color.Companion.m4213getTransparent0d7_KjU(), j2, Color.Companion.m4213getTransparent0d7_KjU(), Color.m4177copywmQWz5c$default(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m4213getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, IconButtonTokens.INSTANCE.getSelectedIconColor()), null);
        colorScheme.setDefaultIconToggleButtonColorsCached$material3_release(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconButtonColors filledIconButtonColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1857395287, "C(filledIconButtonColors)719@33486L11:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1857395287, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:719)");
        }
        IconButtonColors defaultFilledIconButtonColors$material3_release = getDefaultFilledIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultFilledIconButtonColors$material3_release;
    }

    /* JADX INFO: renamed from: filledIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m2158filledIconButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j4;
        long jM4214getUnspecified0d7_KjU2 = j5;
        long jM1947contentColorForek8zF_U = j3;
        long jM4214getUnspecified0d7_KjU3 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, -669858473, "C(filledIconButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)732@34130L31,736@34326L11:IconButton.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(jM4214getUnspecified0d7_KjU3, composer, (-1) - (((-1) - i2) | ((-1) - 14)));
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-669858473, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:736)");
        }
        IconButtonColors iconButtonColorsM2149copyjRlVdoo = getDefaultFilledIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2149copyjRlVdoo(jM4214getUnspecified0d7_KjU3, jM1947contentColorForek8zF_U, jM4214getUnspecified0d7_KjU, jM4214getUnspecified0d7_KjU2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return iconButtonColorsM2149copyjRlVdoo;
    }

    public final IconButtonColors getDefaultFilledIconButtonColors$material3_release(ColorScheme colorScheme) {
        IconButtonColors defaultFilledIconButtonColorsCached$material3_release = colorScheme.getDefaultFilledIconButtonColorsCached$material3_release();
        if (defaultFilledIconButtonColorsCached$material3_release != null) {
            return defaultFilledIconButtonColorsCached$material3_release;
        }
        IconButtonColors iconButtonColors = new IconButtonColors(ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.m1946contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getContainerColor())), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getDisabledContainerColor()), FilledIconButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getDisabledColor()), FilledIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledIconButtonColorsCached$material3_release(iconButtonColors);
        return iconButtonColors;
    }

    public final IconToggleButtonColors filledIconToggleButtonColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1554706367, "C(filledIconToggleButtonColors)766@35781L11:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1554706367, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:766)");
        }
        IconToggleButtonColors defaultFilledIconToggleButtonColors$material3_release = getDefaultFilledIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultFilledIconToggleButtonColors$material3_release;
    }

    /* JADX INFO: renamed from: filledIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m2159filledIconToggleButtonColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j6;
        long jM4214getUnspecified0d7_KjU2 = j3;
        long jM4214getUnspecified0d7_KjU3 = j5;
        long jM1947contentColorForek8zF_U = j7;
        long jM4214getUnspecified0d7_KjU4 = j4;
        long jM4214getUnspecified0d7_KjU5 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, 1887173701, "C(filledIconToggleButtonColors)P(2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color)788@36995L38,790@37088L11:IconButton.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 16) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 32) != 0) {
            jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(jM4214getUnspecified0d7_KjU, composer, (i2 >> 12) & 14);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1887173701, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:790)");
        }
        IconToggleButtonColors iconToggleButtonColorsM2172copytNS2XkQ = getDefaultFilledIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2172copytNS2XkQ(jM4214getUnspecified0d7_KjU5, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU, jM1947contentColorForek8zF_U);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return iconToggleButtonColorsM2172copytNS2XkQ;
    }

    public final IconToggleButtonColors getDefaultFilledIconToggleButtonColors$material3_release(ColorScheme colorScheme) {
        IconToggleButtonColors defaultFilledIconToggleButtonColorsCached$material3_release = colorScheme.getDefaultFilledIconToggleButtonColorsCached$material3_release();
        if (defaultFilledIconToggleButtonColorsCached$material3_release != null) {
            return defaultFilledIconToggleButtonColorsCached$material3_release;
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getToggleUnselectedColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getDisabledContainerColor()), FilledIconButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getDisabledColor()), FilledIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.m1946contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getSelectedContainerColor())), null);
        colorScheme.setDefaultFilledIconToggleButtonColorsCached$material3_release(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconButtonColors filledTonalIconButtonColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1099140437, "C(filledTonalIconButtonColors)830@39188L11:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1099140437, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:830)");
        }
        IconButtonColors defaultFilledTonalIconButtonColors$material3_release = getDefaultFilledTonalIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultFilledTonalIconButtonColors$material3_release;
    }

    /* JADX INFO: renamed from: filledTonalIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m2160filledTonalIconButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j2;
        long jM4214getUnspecified0d7_KjU2 = j5;
        long jM4214getUnspecified0d7_KjU3 = j4;
        long jM1947contentColorForek8zF_U = j3;
        ComposerKt.sourceInformationMarkerStart(composer, -18532843, "C(filledTonalIconButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)844@39854L31,848@40050L11:IconButton.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(jM4214getUnspecified0d7_KjU, composer, (-1) - (((-1) - i2) | ((-1) - 14)));
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-18532843, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:848)");
        }
        IconButtonColors iconButtonColorsM2149copyjRlVdoo = getDefaultFilledTonalIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2149copyjRlVdoo(jM4214getUnspecified0d7_KjU, jM1947contentColorForek8zF_U, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return iconButtonColorsM2149copyjRlVdoo;
    }

    public final IconButtonColors getDefaultFilledTonalIconButtonColors$material3_release(ColorScheme colorScheme) {
        IconButtonColors defaultFilledTonalIconButtonColorsCached$material3_release = colorScheme.getDefaultFilledTonalIconButtonColorsCached$material3_release();
        if (defaultFilledTonalIconButtonColorsCached$material3_release != null) {
            return defaultFilledTonalIconButtonColorsCached$material3_release;
        }
        IconButtonColors iconButtonColors = new IconButtonColors(ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.m1946contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getContainerColor())), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor()), FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getDisabledColor()), FilledTonalIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledTonalIconButtonColorsCached$material3_release(iconButtonColors);
        return iconButtonColors;
    }

    public final IconToggleButtonColors filledTonalIconToggleButtonColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 434219587, "C(filledTonalIconToggleButtonColors)878@41565L11:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(434219587, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:878)");
        }
        IconToggleButtonColors defaultFilledTonalIconToggleButtonColors$material3_release = getDefaultFilledTonalIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultFilledTonalIconToggleButtonColors$material3_release;
    }

    /* JADX INFO: renamed from: filledTonalIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m2161filledTonalIconToggleButtonColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j6;
        long jM4214getUnspecified0d7_KjU2 = j5;
        long jM1947contentColorForek8zF_U = j3;
        long jM4214getUnspecified0d7_KjU3 = j4;
        long jM4214getUnspecified0d7_KjU4 = j7;
        long jM4214getUnspecified0d7_KjU5 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, -19426557, "C(filledTonalIconToggleButtonColors)P(2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color)894@42431L31,900@42747L11:IconButton.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(jM4214getUnspecified0d7_KjU5, composer, (-1) - (((-1) - i2) | ((-1) - 14)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-19426557, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:900)");
        }
        IconToggleButtonColors iconToggleButtonColorsM2172copytNS2XkQ = getDefaultFilledTonalIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2172copytNS2XkQ(jM4214getUnspecified0d7_KjU5, jM1947contentColorForek8zF_U, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU, jM4214getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return iconToggleButtonColorsM2172copytNS2XkQ;
    }

    public final IconToggleButtonColors getDefaultFilledTonalIconToggleButtonColors$material3_release(ColorScheme colorScheme) {
        IconToggleButtonColors defaultFilledTonalIconToggleButtonColorsCached$material3_release = colorScheme.getDefaultFilledTonalIconToggleButtonColorsCached$material3_release();
        if (defaultFilledTonalIconToggleButtonColorsCached$material3_release != null) {
            return defaultFilledTonalIconToggleButtonColorsCached$material3_release;
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getUnselectedContainerColor()), ColorSchemeKt.m1946contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getUnselectedContainerColor())), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor()), FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getDisabledColor()), FilledTonalIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getToggleSelectedColor()), null);
        colorScheme.setDefaultFilledTonalIconToggleButtonColorsCached$material3_release(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconButtonColors outlinedIconButtonColors(Composer composer, int i2) {
        composer.startReplaceGroup(389287465);
        ComposerKt.sourceInformation(composer, "C(outlinedIconButtonColors)940@44790L11,940@44852L7,941@44906L7:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(389287465, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:938)");
        }
        ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(composer, 6);
        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContentColor);
        ComposerKt.sourceInformationMarkerEnd(composer);
        IconButtonColors iconButtonColorsM2156defaultOutlinedIconButtonColors4WTKRHQ$material3_release = m2156defaultOutlinedIconButtonColors4WTKRHQ$material3_release(colorScheme, ((Color) objConsume).m4188unboximpl());
        ProvidableCompositionLocal<Color> localContentColor2 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(localContentColor2);
        ComposerKt.sourceInformationMarkerEnd(composer);
        long jM4188unboximpl = ((Color) objConsume2).m4188unboximpl();
        if (Color.m4179equalsimpl0(iconButtonColorsM2156defaultOutlinedIconButtonColors4WTKRHQ$material3_release.m2151getContentColor0d7_KjU(), jM4188unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return iconButtonColorsM2156defaultOutlinedIconButtonColors4WTKRHQ$material3_release;
        }
        IconButtonColors iconButtonColorsM2146copyjRlVdoo$default = IconButtonColors.m2146copyjRlVdoo$default(iconButtonColorsM2156defaultOutlinedIconButtonColors4WTKRHQ$material3_release, 0L, jM4188unboximpl, 0L, Color.m4177copywmQWz5c$default(jM4188unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconButtonColorsM2146copyjRlVdoo$default;
    }

    /* JADX INFO: renamed from: outlinedIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m2164outlinedIconButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j4;
        long jM4177copywmQWz5c$default = j5;
        long jM4188unboximpl = j3;
        long jM4214getUnspecified0d7_KjU2 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, -1030517545, "C(outlinedIconButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)965@45873L7,970@46107L11,971@46182L7:IconButton.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            jM4188unboximpl = ((Color) objConsume).m4188unboximpl();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(jM4188unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1030517545, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:970)");
        }
        ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(composer, 6);
        ProvidableCompositionLocal<Color> localContentColor2 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(localContentColor2);
        ComposerKt.sourceInformationMarkerEnd(composer);
        IconButtonColors iconButtonColorsM2149copyjRlVdoo = m2156defaultOutlinedIconButtonColors4WTKRHQ$material3_release(colorScheme, ((Color) objConsume2).m4188unboximpl()).m2149copyjRlVdoo(jM4214getUnspecified0d7_KjU2, jM4188unboximpl, jM4214getUnspecified0d7_KjU, jM4177copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return iconButtonColorsM2149copyjRlVdoo;
    }

    /* JADX INFO: renamed from: defaultOutlinedIconButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconButtonColors m2156defaultOutlinedIconButtonColors4WTKRHQ$material3_release(ColorScheme colorScheme, long j2) {
        IconButtonColors defaultOutlinedIconButtonColorsCached$material3_release = colorScheme.getDefaultOutlinedIconButtonColorsCached$material3_release();
        if (defaultOutlinedIconButtonColorsCached$material3_release != null) {
            return defaultOutlinedIconButtonColorsCached$material3_release;
        }
        IconButtonColors iconButtonColors = new IconButtonColors(Color.Companion.m4213getTransparent0d7_KjU(), j2, Color.Companion.m4213getTransparent0d7_KjU(), Color.m4177copywmQWz5c$default(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedIconButtonColorsCached$material3_release(iconButtonColors);
        return iconButtonColors;
    }

    public final IconToggleButtonColors outlinedIconToggleButtonColors(Composer composer, int i2) {
        composer.startReplaceGroup(-779749183);
        ComposerKt.sourceInformation(composer, "C(outlinedIconToggleButtonColors)1001@47390L7,1002@47433L11:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-779749183, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:1000)");
        }
        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContentColor);
        ComposerKt.sourceInformationMarkerEnd(composer);
        long jM4188unboximpl = ((Color) objConsume).m4188unboximpl();
        IconToggleButtonColors iconToggleButtonColorsM2157defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release = m2157defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), jM4188unboximpl);
        if (Color.m4179equalsimpl0(iconToggleButtonColorsM2157defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release.m2176getContentColor0d7_KjU(), jM4188unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return iconToggleButtonColorsM2157defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release;
        }
        IconToggleButtonColors iconToggleButtonColorsM2171copytNS2XkQ$default = IconToggleButtonColors.m2171copytNS2XkQ$default(iconToggleButtonColorsM2157defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release, 0L, jM4188unboximpl, 0L, Color.m4177copywmQWz5c$default(jM4188unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconToggleButtonColorsM2171copytNS2XkQ$default;
    }

    /* JADX INFO: renamed from: outlinedIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m2165outlinedIconToggleButtonColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long jM1947contentColorForek8zF_U = j7;
        long jM4177copywmQWz5c$default = j5;
        long jM4214getUnspecified0d7_KjU = j6;
        long jM4214getUnspecified0d7_KjU2 = j4;
        long jM4188unboximpl = j3;
        long jM4214getUnspecified0d7_KjU3 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, 2130592709, "C(outlinedIconToggleButtonColors)P(2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color)1028@48650L7,1033@48932L38,1035@49025L11,1036@49106L7:IconButton.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            jM4188unboximpl = ((Color) objConsume).m4188unboximpl();
        }
        if ((i3 & 4) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(jM4188unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i3 & 16) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 32) != 0) {
            jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(jM4214getUnspecified0d7_KjU, composer, (-1) - (((-1) - (i2 >> 12)) | ((-1) - 14)));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2130592709, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:1035)");
        }
        ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(composer, 6);
        ProvidableCompositionLocal<Color> localContentColor2 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(localContentColor2);
        ComposerKt.sourceInformationMarkerEnd(composer);
        IconToggleButtonColors iconToggleButtonColorsM2172copytNS2XkQ = m2157defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release(colorScheme, ((Color) objConsume2).m4188unboximpl()).m2172copytNS2XkQ(jM4214getUnspecified0d7_KjU3, jM4188unboximpl, jM4214getUnspecified0d7_KjU2, jM4177copywmQWz5c$default, jM4214getUnspecified0d7_KjU, jM1947contentColorForek8zF_U);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return iconToggleButtonColorsM2172copytNS2XkQ;
    }

    /* JADX INFO: renamed from: defaultOutlinedIconToggleButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconToggleButtonColors m2157defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release(ColorScheme colorScheme, long j2) {
        IconToggleButtonColors defaultIconToggleButtonColorsCached$material3_release = colorScheme.getDefaultIconToggleButtonColorsCached$material3_release();
        if (defaultIconToggleButtonColorsCached$material3_release != null) {
            return defaultIconToggleButtonColorsCached$material3_release;
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(Color.Companion.m4213getTransparent0d7_KjU(), j2, Color.Companion.m4213getTransparent0d7_KjU(), Color.m4177copywmQWz5c$default(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedIconButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.m1946contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, OutlinedIconButtonTokens.INSTANCE.getSelectedContainerColor())), null);
        colorScheme.setDefaultOutlinedIconToggleButtonColorsCached$material3_release(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final BorderStroke outlinedIconToggleButtonBorder(boolean z2, boolean z3, Composer composer, int i2) {
        composer.startReplaceGroup(1244729690);
        ComposerKt.sourceInformation(composer, "C(outlinedIconToggleButtonBorder)P(1)1082@51041L33:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1244729690, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonBorder (IconButton.kt:1078)");
        }
        if (z3) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        int i3 = (-1) - (((-1) - i2) | ((-1) - 14));
        int i4 = (-1) - (((-1) - (i2 >> 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
        BorderStroke borderStrokeOutlinedIconButtonBorder = outlinedIconButtonBorder(z2, composer, (i3 + i4) - (i3 & i4));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return borderStrokeOutlinedIconButtonBorder;
    }

    public final BorderStroke outlinedIconButtonBorder(boolean z2, Composer composer, int i2) {
        long jM4177copywmQWz5c$default;
        ComposerKt.sourceInformationMarkerStart(composer, -511461558, "C(outlinedIconButtonBorder)1100@51643L108:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511461558, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonBorder (IconButton.kt:1091)");
        }
        if (z2) {
            composer.startReplaceGroup(1186104514);
            ComposerKt.sourceInformation(composer, "1094@51433L7");
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            jM4177copywmQWz5c$default = ((Color) objConsume).m4188unboximpl();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1186170420);
            ComposerKt.sourceInformation(composer, "1096@51496L7");
            ProvidableCompositionLocal<Color> localContentColor2 = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composer.consume(localContentColor2);
            ComposerKt.sourceInformationMarkerEnd(composer);
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(((Color) objConsume2).m4188unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerStart(composer, 176816691, "CC(remember):IconButton.kt#9igjgp");
        boolean zChanged = composer.changed(jM4177copywmQWz5c$default);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = BorderStrokeKt.m600BorderStrokecXLIe8U(OutlinedIconButtonTokens.INSTANCE.m3374getUnselectedOutlineWidthD9Ej5fM(), jM4177copywmQWz5c$default);
            composer.updateRememberedValue(objRememberedValue);
        }
        BorderStroke borderStroke = (BorderStroke) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return borderStroke;
    }
}
