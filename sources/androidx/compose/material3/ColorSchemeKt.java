package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.PaletteTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: ColorScheme.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d̉=!,n\bӵLc\u000b\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0010nj?0Le^.ZS@\u000fs{:Wc$\bCCU \u0006:!][\u007fg\u001dS\u000b\u000fQ\u001d\u001e\u0016'srNȺwزܫ\u00134H~MCeۃ=Gq\r63\"b(>y\u0013\u00132*v\u0019'\u0001IK\u001a%H@\u001fC\u0003\u0013S\u0005(&\u001e>N\nNbmND]\u0005]h8S\toB\\=w0+V=LZ'\u001b\u000ey\u001eYIg;\u001b%a\u001b\u001fR\nH3Ew=\u0013\u0002?'YR$]<X\u000e.-+}\u0016\u000ex,\\\u0013lx\fU4\u007fiQP\u001cD\u0010z*\u0016l\n\u0014\u00065eF-Ho8\u00149t\u0001qXP0gr\u0006\u0001aD6=\u007fa4i!lQo[1Ne\u00055\u0013$#\u000f\u00109[\u0003\u0017\u0011\u001b!T\u0006sIQnFxT\u0010YK\u0011\u001cp\u0011\u000bZ\n6G\u000eS\u0014\u0011\\ U=a91F\u0004\u0002vM\u0018|\u000b`vy\u0002RvIRt\u001c780$Zrm5qVTfT)MJ]7\u0004\u000e\u0013.\u0006\u0010<O.@TUhw\u0015e]8._l=Y|\u0017&Wggc;Wc\u001e\u000ejvBHlh\u000bXtok\f\teX(8Hx>\u0010{rWR\u0018֮>ڤʬ8.7HjE`Ԋ\u001ePR\u0015\t\u000e\\\u0019\u0016\u0005TA6\u001biR}9\u0007V\\~\u0003\u007fxw5-f(-OeM\u0019T^Rn:|1\u001c\u0017s.P\u0018RMLz,\u000eU*)F ?Q=T+\u000f-2b\b3EZ\u000b}Q{\u001bW\u0001\u0003y\u001dT\u0001.\u0016\u0011\u001bv2`xdgTE+'dx#\u0016\u007f\u0018y\u0010O+MiT\u0019wVI!\f\nBT8\u000b\"7\u001eS\n (\u00035;a?\u001dD\u0001D5\u001bak\t\b.(k?,ze\u0012L{\u0016\u001ek\u0002c8;Fjq~l+Tr\tBV\r\u0010\bp\u0012d\u00139HO\b\tVfV;5\u0004f\u0015P%p\u0005dj\u0019u}BSw*\"L.\u001adC37eS\u0016v\u001eQb\u000bX6\"\u000b*:\u001f\u0018\"=.~ob796y\u001e6Odz\u0005j\u0012T:2<\u00165[T\u0018\u000f@\u0001\u0006Fm:/2p|k\\\u0014T\u0007\tnH3iuf'*\u000f,'3L\u0002e7\u000bmT\u0003Gc`\n\u0004#\u000f\u001bx\u0001\u0017fS4tZ?\u001b6\u000b\u0019\u000bsfsO\b6\u0012zAm\u001ax<>\u001e|+v0\u001bgZAe|0l@md|m'\u0018lR\\XA~)\u0006>B\u0010\u000f\u0019Pgr\u001ekЛKϕߺ;E 9%}A\r\u001a7{FI/LזE׆IxO?{\u0006Uk\u0004\u000e .9\u001ctOe\b\u0014l\nk.R\u0016 \u001f\u0013\b\u000f\u0013^4\u001c.x}#\u00104\bDd\u001a30\u001c\u000f_qw/V?+\u001b\u000frQnx\u0018z\u0005c\u001d^;\tl1d\u0012\u0007-~&9-S.!qr:?\\P^\u0017\u007f\"/>\u001fd\u0011\u0013/\u0016Oq\u0004\tk}d=15k8}I0\u0001'.%\u007fu\u0012Gl(CD\u0007SDd\u0017z\u0005B\u0006\u0017\u000fp.d\u0003+A\u0014+\bxd\u0017\u0013Bf\u000b\u001e\u00138g\u001f%[\u001bhx\u00072Ny,'1`a37`\u0014 .|\u0011\u0011]zt.3r\u000fx\u007fuPEF\u0003FJ-_${\n\u001b&yNhH\u000e,\u001f4)/\tAPDb\u001a*bi3o\"A\u0007\u001b8\u0014\u0018\u001f\u0019cs\u0002Y+*\u000f&\u0019\rm\u0003aq@sE\u001d;/=xK]l;3`}LU\u00152kP~[\u0010n\u000f\u00105y;K\u001e\b\u0003X\u007f8(T*\fu1.]1v3&aɷU؛ӵ\b(0r|t;ڒl\u0007/\",\u0018\u001a$jaaBS\u0013\u0014GMn03l\u0015Xeh(\u0014t\u0013K\u0014E#\u001e)a -\u0016UqN@ar{8\rcB\u0013\u0002\u001aR2\u0010?*MFY8\u001dE\u0012\u0003l\u001bpsQm(P\u0012;\u00164}7Rn\u0019x\u001dF0{|L6j\u0013eA\u0011\u0014p\u0015*^<]$\u000b4\u001f^N\u001d\u0002\ffx\u0015A<wyGG s\u0014!K\u001a\f+\f%u\t_?\u0004z\tC?3\u0019\rbXcn\r\u000b[!Y\u0005C\u0015.s[4MVL;BX4\u0017ujN\u0010R\u001b\\(\u001c9`6V~hfu\u0001J(m[\u001be\rVz7\nmA1=W|wm#[\u00022\t\u0016A'9#\u001e\u0002Bb)y\r?e\u0014\b\u000bR\u0006\u0003sI\u001e+yJO86E5AY\u0016nem\"\bE\u0005\f.Q<\u0006A-\u0013m\u0019i\u001cMw\u0003z?\u0007/NKg=~B\u0019\u0018+z\u0012.\u001aem\u0006k\u000fAh\"5I\u000eX,\\y9MUj\n[}o\u0015}\nSK+\u0004KV1 \u001a\u0014Ue\u0014|\u0005tXl \b,F\u0013\u0010N5&\u0010\u0005x/6\u0017c\u0019\u0006j\"]\u0011\u0017_4yf|y!o\u0015Di>J\u007f\u0005\u0019\u0015X̀\u001aЪɥf\u000bf.Vz(\u0007zj?6vsA\u0001/M\u0012\u001b\"E\\vQpc>0!:S\fe\u000eI֊\rÎ˧{\u0017\u0002\u001fAx%\f:\n-\u0005lo\u001b\u0004\u001b\u0007}4\u0012yG2tc\u0007!\u0087Y¨ўl\n0Q\u001aA\u001dC|\u0019jQ$(\u001bd-%N\u001eO_QGO\u001dI\u0018۠\f2[\u001f\u0013\u000bf$=.*\u000fG\u0012p}epO3\u00143\u00062\u00169¯\u001dàբmy&Uy[$oXЯgi\u0011\u00104÷ Ȣ\u000bYDխa\u001a\u0018\"A*\u0018\u00177\u0002v6x3xҷ\u0003ٖ:\u001eRՠ\u0007z+\fs\u0010O\n\u0004\u0013JsNuv]\u0016:o>ϩa\u0005MԜGs\u000eRWq\u001fAU\u0016a\u0016hXtm$es\u0014lߓ\tب\b5(uffP#ܖ\bg<n@߽c1\u0013ԜOx"}, d2 = {"\u0012hb.U3>Rt\u0006\u0006a(", "", "\u001anR._\nHZ#\fh\\/|\u0011/", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u000169Xy\u001d>ms8UNEy8-\u0019rj \u0011a(UL", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0019b*:Zv\t\u0002h9j\u00072e\b(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006a2?j\u0002\u001f3j\u001d.+MCv>,\u0019weC\u0010J6Lr.\u001d", "\u001anR._\u001bH\\\u0015\u0006Ze,\u000e\u0005>i\n1[I|\u0014\u001eGn", "", "5dc\u0019b*:Z\b\t\u0004Z3\\\u0010/v{7\u007fJ\nv Cl\u0015<u", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001K 5WP)i7\u001e\u001dhG9\u001bR6Tv0U\"", "5dc#T3NS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@4?_})E7s8TMHY2!\u0015pa\u001f\u0007w\u001bX|'PZ$\u0013X[qJ\u001e\u0016Y!\u0018)\u0017\rdK2n\u000eD/\u0011;M\n;2^\u0016\u001e\u0019?xpO,s\u000b^", "1n]AX5M1#\u0006\u0005k\r\u0007\u0016", "0`R8Z9Hc\"}Xh3\u0007\u0016", "1n]AX5M1#\u0006\u0005k\r\u0007\u0016ve\u0006z\u0011!z\u0007", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zk\u0012\u0011(", "2`a866E]&lxa,\u0005\t", ">qX:T9R", "=m??\\4:`-", ">qX:T9R1#\b\nZ0\u0006\t<", "=m??\\4:`-\\\u0005g;x\r8e\r", "7me2e:>>&\u0003\u0003Z9\u0011", "AdR<a+:`-", "=mB2V6GR\u0015\f\u000f", "AdR<a+:`-\\\u0005g;x\r8e\r", "=mB2V6GR\u0015\f\u000f<6\u0006\u0018+i\t(\t", "BdaA\\(Kg", "=mC2e;BO&\u0013", "BdaA\\(Kgv\t\u0004m(\u0001\u0012/r", "=mC2e;BO&\u0013Xh5\f\u00053n\u007f5", "0`R8Z9Hc\"}", "=m1.V2@`#\u000f\u0004]", "Ata3T*>", "=mBBe-:Q\u0019", "Ata3T*>D\u0015\f~Z5\f", "=mBBe-:Q\u0019ovk0x\u0012>", "Ata3T*>B\u001d\b\n", "7me2e:>A)\f{Z*|", "7me2e:>=\"l\u000bk-x\u0007/", "3qa<e", "=m4?e6K", "3qa<e\nH\\(z~g,\n", "=m4?e6K1#\b\nZ0\u0006\t<", "=tc9\\5>", "=tc9\\5>D\u0015\f~Z5\f", "Aba6`", "2`a866E]&lxa,\u0005\tvGK\u0013\\>H)", "uI9\u0017=\u0011#8}c_C\u0011am\u0014Jd\r`%e{{,Tr![\nx@y)6z 2LV\u0005i>& ro9Pk(]v4KHUy&0|D\u001e\u001fH\fQ+\u0015\u0005/", "Ata3T*>0&\u0003|a;", "Ata3T*>1#\b\nZ0\u0006\t<", "Ata3T*>1#\b\nZ0\u0006\t<H\u0004*~", "Ata3T*>1#\b\nZ0\u0006\t<H\u0004*~@\u000f&", "Ata3T*>1#\b\nZ0\u0006\t<L\n:", "Ata3T*>1#\b\nZ0\u0006\t<L\n:{N\u0010", "Ata3T*>2\u001d\u0007", "2`a866E]&lxa,\u0005\tvCG\u001b\u0003\u0014\u0015r", "uI9\u0017=\u0011#8}c_C\u0011am\u0014Jd\r`%e{{,Tr![\n\u001a>b\u0005\u001cRzq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W,5\u0014\u000ff/\"qD?\u001f]", "3w_?X:LW*~ab.\u007f\u0018\ro\u00072\t.~\u001a\u0017Oo", ":hV5g\nHZ#\fh\\/|\u0011/", ":hV5g\nHZ#\fh\\/|\u0011/-asf!~^)", ":hV5g\nHZ#\fh\\/|\u0011/-]onGT+r", "/o_9l\u001bH\\\u0015\u0006Ze,\u000e\u0005>i\n1", "3kTCT;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "/o_9l\u001bH\\\u0015\u0006Ze,\u000e\u0005>i\n1C-at\u0017PY`", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011P\u0015\u0005\u0011q`F\u0011g+a@%QTY6jR<J$\u001bi\u0012V+VbcI/xR7,]\u0010\rf", "1n]AX5M1#\u0006\u0005k\r\u0007\u0016v4q\u0017a-c\u0003", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011Pw\u0003", "4q^:G6DS\"", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011R0'\u0014uk=\u0006vuL\u0001/RV\\,&ZnL\u0014\u001f^\nUxV\u0014cG$wR\u0001|\u00123S\u000f)f\u0004\f\u001e\u000e\u001bj\u00051`\u0016G\u0003#K\u0005\u000e", "Ata3T*>1#\u0006\u0005k\b\fh6e\u0011$\u000bD\u000b ", "Ata3T*>1#\u0006\u0005k\b\fh6e\u0011$\u000bD\u000b ^\u0015Kj=_\u000bC", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011Lw\u0003", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(new Function0<ColorScheme>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalColorScheme$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ColorScheme invoke() {
            return ColorSchemeKt.m1953lightColorSchemeCXl9yA$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
        }
    });
    private static final ProvidableCompositionLocal<Boolean> LocalTonalElevationEnabled = CompositionLocalKt.staticCompositionLocalOf(new Function0<Boolean>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalTonalElevationEnabled$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return true;
        }
    });

    /* JADX INFO: compiled from: ColorScheme.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: lightColorScheme-C-Xl9yA$default */
    public static /* synthetic */ ColorScheme m1953lightColorSchemeCXl9yA$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, int i2, int i3, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            j2 = ColorLightTokens.INSTANCE.m3129getPrimary0d7_KjU();
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            j3 = ColorLightTokens.INSTANCE.m3113getOnPrimary0d7_KjU();
        }
        if ((i2 & 4) != 0) {
            j4 = ColorLightTokens.INSTANCE.m3130getPrimaryContainer0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            j5 = ColorLightTokens.INSTANCE.m3114getOnPrimaryContainer0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            j6 = ColorLightTokens.INSTANCE.m3108getInversePrimary0d7_KjU();
        }
        if ((i2 & 32) != 0) {
            j7 = ColorLightTokens.INSTANCE.m3134getSecondary0d7_KjU();
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            j8 = ColorLightTokens.INSTANCE.m3117getOnSecondary0d7_KjU();
        }
        if ((i2 & 128) != 0) {
            j9 = ColorLightTokens.INSTANCE.m3135getSecondaryContainer0d7_KjU();
        }
        if ((i2 & 256) != 0) {
            j10 = ColorLightTokens.INSTANCE.m3118getOnSecondaryContainer0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 512)) != 0) {
            j11 = ColorLightTokens.INSTANCE.m3148getTertiary0d7_KjU();
        }
        if ((i2 + 1024) - (i2 | 1024) != 0) {
            j12 = ColorLightTokens.INSTANCE.m3123getOnTertiary0d7_KjU();
        }
        if ((i2 & 2048) != 0) {
            j13 = ColorLightTokens.INSTANCE.m3149getTertiaryContainer0d7_KjU();
        }
        if ((i2 + 4096) - (i2 | 4096) != 0) {
            j14 = ColorLightTokens.INSTANCE.m3124getOnTertiaryContainer0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8192)) != 0) {
            j15 = ColorLightTokens.INSTANCE.m3104getBackground0d7_KjU();
        }
        if ((i2 & 16384) != 0) {
            j16 = ColorLightTokens.INSTANCE.m3110getOnBackground0d7_KjU();
        }
        if ((i2 & 32768) != 0) {
            j17 = ColorLightTokens.INSTANCE.m3138getSurface0d7_KjU();
        }
        if ((i2 & 65536) != 0) {
            j18 = ColorLightTokens.INSTANCE.m3121getOnSurface0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 131072)) != 0) {
            j19 = ColorLightTokens.INSTANCE.m3147getSurfaceVariant0d7_KjU();
        }
        if ((i2 & 262144) != 0) {
            j20 = ColorLightTokens.INSTANCE.m3122getOnSurfaceVariant0d7_KjU();
        }
        if ((i2 & 524288) != 0) {
            j21 = j2;
        }
        if ((i2 + 1048576) - (i2 | 1048576) != 0) {
            j22 = ColorLightTokens.INSTANCE.m3109getInverseSurface0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2097152)) != 0) {
            j23 = ColorLightTokens.INSTANCE.m3107getInverseOnSurface0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4194304)) != 0) {
            j24 = ColorLightTokens.INSTANCE.m3105getError0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8388608)) != 0) {
            j25 = ColorLightTokens.INSTANCE.m3111getOnError0d7_KjU();
        }
        if ((i2 + 16777216) - (i2 | 16777216) != 0) {
            j26 = ColorLightTokens.INSTANCE.m3106getErrorContainer0d7_KjU();
        }
        if ((i2 + 33554432) - (i2 | 33554432) != 0) {
            j27 = ColorLightTokens.INSTANCE.m3112getOnErrorContainer0d7_KjU();
        }
        if ((i2 + AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) - (i2 | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            j28 = ColorLightTokens.INSTANCE.m3127getOutline0d7_KjU();
        }
        if ((i2 + 134217728) - (i2 | 134217728) != 0) {
            j29 = ColorLightTokens.INSTANCE.m3128getOutlineVariant0d7_KjU();
        }
        if ((i2 & 268435456) != 0) {
            j30 = ColorLightTokens.INSTANCE.m3133getScrim0d7_KjU();
        }
        if ((i2 & 536870912) != 0) {
            j31 = ColorLightTokens.INSTANCE.m3139getSurfaceBright0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1073741824)) != 0) {
            j32 = ColorLightTokens.INSTANCE.m3140getSurfaceContainer0d7_KjU();
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            j33 = ColorLightTokens.INSTANCE.m3141getSurfaceContainerHigh0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            j34 = ColorLightTokens.INSTANCE.m3142getSurfaceContainerHighest0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            j35 = ColorLightTokens.INSTANCE.m3143getSurfaceContainerLow0d7_KjU();
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            j36 = ColorLightTokens.INSTANCE.m3144getSurfaceContainerLowest0d7_KjU();
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            j37 = ColorLightTokens.INSTANCE.m3145getSurfaceDim0d7_KjU();
        }
        return m1952lightColorSchemeCXl9yA(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37);
    }

    /* JADX INFO: renamed from: lightColorScheme-C-Xl9yA */
    public static final ColorScheme m1952lightColorSchemeCXl9yA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37) {
        return new ColorScheme(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j37, j32, j33, j34, j35, j36, null);
    }

    /* JADX INFO: renamed from: lightColorScheme-G1PFc-w$default */
    public static /* synthetic */ ColorScheme m1955lightColorSchemeG1PFcw$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            j2 = ColorLightTokens.INSTANCE.m3129getPrimary0d7_KjU();
        }
        if ((i2 & 2) != 0) {
            j3 = ColorLightTokens.INSTANCE.m3113getOnPrimary0d7_KjU();
        }
        if ((i2 & 4) != 0) {
            j4 = ColorLightTokens.INSTANCE.m3130getPrimaryContainer0d7_KjU();
        }
        if ((i2 & 8) != 0) {
            j5 = ColorLightTokens.INSTANCE.m3114getOnPrimaryContainer0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            j6 = ColorLightTokens.INSTANCE.m3108getInversePrimary0d7_KjU();
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            j7 = ColorLightTokens.INSTANCE.m3134getSecondary0d7_KjU();
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            j8 = ColorLightTokens.INSTANCE.m3117getOnSecondary0d7_KjU();
        }
        if ((i2 & 128) != 0) {
            j9 = ColorLightTokens.INSTANCE.m3135getSecondaryContainer0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 256)) != 0) {
            j10 = ColorLightTokens.INSTANCE.m3118getOnSecondaryContainer0d7_KjU();
        }
        if ((i2 & 512) != 0) {
            j11 = ColorLightTokens.INSTANCE.m3148getTertiary0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1024)) != 0) {
            j12 = ColorLightTokens.INSTANCE.m3123getOnTertiary0d7_KjU();
        }
        if ((i2 & 2048) != 0) {
            j13 = ColorLightTokens.INSTANCE.m3149getTertiaryContainer0d7_KjU();
        }
        if ((i2 + 4096) - (i2 | 4096) != 0) {
            j14 = ColorLightTokens.INSTANCE.m3124getOnTertiaryContainer0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8192)) != 0) {
            j15 = ColorLightTokens.INSTANCE.m3104getBackground0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16384)) != 0) {
            j16 = ColorLightTokens.INSTANCE.m3110getOnBackground0d7_KjU();
        }
        if ((i2 & 32768) != 0) {
            j17 = ColorLightTokens.INSTANCE.m3138getSurface0d7_KjU();
        }
        if ((i2 & 65536) != 0) {
            j18 = ColorLightTokens.INSTANCE.m3121getOnSurface0d7_KjU();
        }
        if ((i2 & 131072) != 0) {
            j19 = ColorLightTokens.INSTANCE.m3147getSurfaceVariant0d7_KjU();
        }
        if ((i2 + 262144) - (i2 | 262144) != 0) {
            j20 = ColorLightTokens.INSTANCE.m3122getOnSurfaceVariant0d7_KjU();
        }
        if ((i2 & 524288) != 0) {
            j21 = j2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1048576)) != 0) {
            j22 = ColorLightTokens.INSTANCE.m3109getInverseSurface0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2097152)) != 0) {
            j23 = ColorLightTokens.INSTANCE.m3107getInverseOnSurface0d7_KjU();
        }
        if ((i2 + 4194304) - (i2 | 4194304) != 0) {
            j24 = ColorLightTokens.INSTANCE.m3105getError0d7_KjU();
        }
        if ((i2 & 8388608) != 0) {
            j25 = ColorLightTokens.INSTANCE.m3111getOnError0d7_KjU();
        }
        if ((i2 & 16777216) != 0) {
            j26 = ColorLightTokens.INSTANCE.m3106getErrorContainer0d7_KjU();
        }
        if ((i2 & 33554432) != 0) {
            j27 = ColorLightTokens.INSTANCE.m3112getOnErrorContainer0d7_KjU();
        }
        if ((i2 + AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) - (i2 | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            j28 = ColorLightTokens.INSTANCE.m3127getOutline0d7_KjU();
        }
        if ((i2 + 134217728) - (i2 | 134217728) != 0) {
            j29 = ColorLightTokens.INSTANCE.m3128getOutlineVariant0d7_KjU();
        }
        if ((i2 + 268435456) - (i2 | 268435456) != 0) {
            j30 = ColorLightTokens.INSTANCE.m3133getScrim0d7_KjU();
        }
        return m1954lightColorSchemeG1PFcw(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}\u0010\rQ{>\u0006-I?$b[z&\u0018_DyFs\u0013\u0010K\u001dX$\u0006B\u0003~K\u0003L.Q~~ba\u001a\u000bT\u0015R:J<;EXp?")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: lightColorScheme-G1PFc-w */
    public static final /* synthetic */ ColorScheme m1954lightColorSchemeG1PFcw(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30) {
        return m1953lightColorSchemeCXl9yA$default(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* JADX INFO: renamed from: darkColorScheme-C-Xl9yA$default */
    public static /* synthetic */ ColorScheme m1949darkColorSchemeCXl9yA$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            j2 = ColorDarkTokens.INSTANCE.m3081getPrimary0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j3 = ColorDarkTokens.INSTANCE.m3065getOnPrimary0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            j4 = ColorDarkTokens.INSTANCE.m3082getPrimaryContainer0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            j5 = ColorDarkTokens.INSTANCE.m3066getOnPrimaryContainer0d7_KjU();
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            j6 = ColorDarkTokens.INSTANCE.m3060getInversePrimary0d7_KjU();
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            j7 = ColorDarkTokens.INSTANCE.m3086getSecondary0d7_KjU();
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            j8 = ColorDarkTokens.INSTANCE.m3069getOnSecondary0d7_KjU();
        }
        if ((i2 & 128) != 0) {
            j9 = ColorDarkTokens.INSTANCE.m3087getSecondaryContainer0d7_KjU();
        }
        if ((i2 & 256) != 0) {
            j10 = ColorDarkTokens.INSTANCE.m3070getOnSecondaryContainer0d7_KjU();
        }
        if ((i2 & 512) != 0) {
            j11 = ColorDarkTokens.INSTANCE.m3100getTertiary0d7_KjU();
        }
        if ((i2 + 1024) - (i2 | 1024) != 0) {
            j12 = ColorDarkTokens.INSTANCE.m3075getOnTertiary0d7_KjU();
        }
        if ((i2 + 2048) - (i2 | 2048) != 0) {
            j13 = ColorDarkTokens.INSTANCE.m3101getTertiaryContainer0d7_KjU();
        }
        if ((i2 + 4096) - (i2 | 4096) != 0) {
            j14 = ColorDarkTokens.INSTANCE.m3076getOnTertiaryContainer0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8192)) != 0) {
            j15 = ColorDarkTokens.INSTANCE.m3056getBackground0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16384)) != 0) {
            j16 = ColorDarkTokens.INSTANCE.m3062getOnBackground0d7_KjU();
        }
        if ((i2 & 32768) != 0) {
            j17 = ColorDarkTokens.INSTANCE.m3090getSurface0d7_KjU();
        }
        if ((i2 & 65536) != 0) {
            j18 = ColorDarkTokens.INSTANCE.m3073getOnSurface0d7_KjU();
        }
        if ((i2 + 131072) - (i2 | 131072) != 0) {
            j19 = ColorDarkTokens.INSTANCE.m3099getSurfaceVariant0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 262144)) != 0) {
            j20 = ColorDarkTokens.INSTANCE.m3074getOnSurfaceVariant0d7_KjU();
        }
        if ((i2 + 524288) - (i2 | 524288) != 0) {
            j21 = j2;
        }
        if ((i2 + 1048576) - (i2 | 1048576) != 0) {
            j22 = ColorDarkTokens.INSTANCE.m3061getInverseSurface0d7_KjU();
        }
        if ((i2 & 2097152) != 0) {
            j23 = ColorDarkTokens.INSTANCE.m3059getInverseOnSurface0d7_KjU();
        }
        if ((i2 & 4194304) != 0) {
            j24 = ColorDarkTokens.INSTANCE.m3057getError0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8388608)) != 0) {
            j25 = ColorDarkTokens.INSTANCE.m3063getOnError0d7_KjU();
        }
        if ((i2 + 16777216) - (i2 | 16777216) != 0) {
            j26 = ColorDarkTokens.INSTANCE.m3058getErrorContainer0d7_KjU();
        }
        if ((i2 + 33554432) - (i2 | 33554432) != 0) {
            j27 = ColorDarkTokens.INSTANCE.m3064getOnErrorContainer0d7_KjU();
        }
        if ((i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            j28 = ColorDarkTokens.INSTANCE.m3079getOutline0d7_KjU();
        }
        if ((i2 + 134217728) - (i2 | 134217728) != 0) {
            j29 = ColorDarkTokens.INSTANCE.m3080getOutlineVariant0d7_KjU();
        }
        if ((i2 & 268435456) != 0) {
            j30 = ColorDarkTokens.INSTANCE.m3085getScrim0d7_KjU();
        }
        if ((i2 & 536870912) != 0) {
            j31 = ColorDarkTokens.INSTANCE.m3091getSurfaceBright0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1073741824)) != 0) {
            j32 = ColorDarkTokens.INSTANCE.m3092getSurfaceContainer0d7_KjU();
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            j33 = ColorDarkTokens.INSTANCE.m3093getSurfaceContainerHigh0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            j34 = ColorDarkTokens.INSTANCE.m3094getSurfaceContainerHighest0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j35 = ColorDarkTokens.INSTANCE.m3095getSurfaceContainerLow0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            j36 = ColorDarkTokens.INSTANCE.m3096getSurfaceContainerLowest0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            j37 = ColorDarkTokens.INSTANCE.m3097getSurfaceDim0d7_KjU();
        }
        return m1948darkColorSchemeCXl9yA(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37);
    }

    /* JADX INFO: renamed from: darkColorScheme-C-Xl9yA */
    public static final ColorScheme m1948darkColorSchemeCXl9yA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37) {
        return new ColorScheme(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j37, j32, j33, j34, j35, j36, null);
    }

    /* JADX INFO: renamed from: darkColorScheme-G1PFc-w$default */
    public static /* synthetic */ ColorScheme m1951darkColorSchemeG1PFcw$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = ColorDarkTokens.INSTANCE.m3081getPrimary0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j3 = ColorDarkTokens.INSTANCE.m3065getOnPrimary0d7_KjU();
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            j4 = ColorDarkTokens.INSTANCE.m3082getPrimaryContainer0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            j5 = ColorDarkTokens.INSTANCE.m3066getOnPrimaryContainer0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            j6 = ColorDarkTokens.INSTANCE.m3060getInversePrimary0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            j7 = ColorDarkTokens.INSTANCE.m3086getSecondary0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            j8 = ColorDarkTokens.INSTANCE.m3069getOnSecondary0d7_KjU();
        }
        if ((i2 & 128) != 0) {
            j9 = ColorDarkTokens.INSTANCE.m3087getSecondaryContainer0d7_KjU();
        }
        if ((i2 + 256) - (i2 | 256) != 0) {
            j10 = ColorDarkTokens.INSTANCE.m3070getOnSecondaryContainer0d7_KjU();
        }
        if ((i2 & 512) != 0) {
            j11 = ColorDarkTokens.INSTANCE.m3100getTertiary0d7_KjU();
        }
        if ((i2 & 1024) != 0) {
            j12 = ColorDarkTokens.INSTANCE.m3075getOnTertiary0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2048)) != 0) {
            j13 = ColorDarkTokens.INSTANCE.m3101getTertiaryContainer0d7_KjU();
        }
        if ((i2 + 4096) - (i2 | 4096) != 0) {
            j14 = ColorDarkTokens.INSTANCE.m3076getOnTertiaryContainer0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8192)) != 0) {
            j15 = ColorDarkTokens.INSTANCE.m3056getBackground0d7_KjU();
        }
        if ((i2 + 16384) - (i2 | 16384) != 0) {
            j16 = ColorDarkTokens.INSTANCE.m3062getOnBackground0d7_KjU();
        }
        if ((i2 & 32768) != 0) {
            j17 = ColorDarkTokens.INSTANCE.m3090getSurface0d7_KjU();
        }
        if ((i2 + 65536) - (i2 | 65536) != 0) {
            j18 = ColorDarkTokens.INSTANCE.m3073getOnSurface0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 131072)) != 0) {
            j19 = ColorDarkTokens.INSTANCE.m3099getSurfaceVariant0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 262144)) != 0) {
            j20 = ColorDarkTokens.INSTANCE.m3074getOnSurfaceVariant0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 524288)) != 0) {
            j21 = j2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1048576)) != 0) {
            j22 = ColorDarkTokens.INSTANCE.m3061getInverseSurface0d7_KjU();
        }
        if ((i2 & 2097152) != 0) {
            j23 = ColorDarkTokens.INSTANCE.m3059getInverseOnSurface0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4194304)) != 0) {
            j24 = ColorDarkTokens.INSTANCE.m3057getError0d7_KjU();
        }
        if ((i2 + 8388608) - (i2 | 8388608) != 0) {
            j25 = ColorDarkTokens.INSTANCE.m3063getOnError0d7_KjU();
        }
        if ((i2 + 16777216) - (i2 | 16777216) != 0) {
            j26 = ColorDarkTokens.INSTANCE.m3058getErrorContainer0d7_KjU();
        }
        if ((i2 + 33554432) - (i2 | 33554432) != 0) {
            j27 = ColorDarkTokens.INSTANCE.m3064getOnErrorContainer0d7_KjU();
        }
        if ((i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            j28 = ColorDarkTokens.INSTANCE.m3079getOutline0d7_KjU();
        }
        if ((i2 + 134217728) - (i2 | 134217728) != 0) {
            j29 = ColorDarkTokens.INSTANCE.m3080getOutlineVariant0d7_KjU();
        }
        if ((i2 & 268435456) != 0) {
            j30 = ColorDarkTokens.INSTANCE.m3085getScrim0d7_KjU();
        }
        return m1950darkColorSchemeG1PFcw(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}\u0010\rQ{>\u0006-I?$b[z&\u0018_DyFs\u0013\u0010K\u001dX$\u0006B\u0003~K\u0003L.Q~~ba\u001a\u000bT\u0015R:J<;EXp?")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: darkColorScheme-G1PFc-w */
    public static final /* synthetic */ ColorScheme m1950darkColorSchemeG1PFcw(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30) {
        return m1949darkColorSchemeCXl9yA$default(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* JADX INFO: renamed from: contentColorFor-4WTKRHQ */
    public static final long m1946contentColorFor4WTKRHQ(ColorScheme colorScheme, long j2) {
        if (Color.m4179equalsimpl0(j2, colorScheme.m1928getPrimary0d7_KjU())) {
            return colorScheme.m1918getOnPrimary0d7_KjU();
        }
        if (Color.m4179equalsimpl0(j2, colorScheme.m1931getSecondary0d7_KjU())) {
            return colorScheme.m1920getOnSecondary0d7_KjU();
        }
        if (Color.m4179equalsimpl0(j2, colorScheme.m1943getTertiary0d7_KjU())) {
            return colorScheme.m1924getOnTertiary0d7_KjU();
        }
        if (Color.m4179equalsimpl0(j2, colorScheme.m1909getBackground0d7_KjU())) {
            return colorScheme.m1915getOnBackground0d7_KjU();
        }
        if (Color.m4179equalsimpl0(j2, colorScheme.m1910getError0d7_KjU())) {
            return colorScheme.m1916getOnError0d7_KjU();
        }
        if (Color.m4179equalsimpl0(j2, colorScheme.m1929getPrimaryContainer0d7_KjU())) {
            return colorScheme.m1919getOnPrimaryContainer0d7_KjU();
        }
        if (Color.m4179equalsimpl0(j2, colorScheme.m1932getSecondaryContainer0d7_KjU())) {
            return colorScheme.m1921getOnSecondaryContainer0d7_KjU();
        }
        if (Color.m4179equalsimpl0(j2, colorScheme.m1944getTertiaryContainer0d7_KjU())) {
            return colorScheme.m1925getOnTertiaryContainer0d7_KjU();
        }
        if (Color.m4179equalsimpl0(j2, colorScheme.m1911getErrorContainer0d7_KjU())) {
            return colorScheme.m1917getOnErrorContainer0d7_KjU();
        }
        if (Color.m4179equalsimpl0(j2, colorScheme.m1914getInverseSurface0d7_KjU())) {
            return colorScheme.m1912getInverseOnSurface0d7_KjU();
        }
        if (Color.m4179equalsimpl0(j2, colorScheme.m1933getSurface0d7_KjU())) {
            return colorScheme.m1922getOnSurface0d7_KjU();
        }
        if (Color.m4179equalsimpl0(j2, colorScheme.m1942getSurfaceVariant0d7_KjU())) {
            return colorScheme.m1923getOnSurfaceVariant0d7_KjU();
        }
        if (!Color.m4179equalsimpl0(j2, colorScheme.m1934getSurfaceBright0d7_KjU()) && !Color.m4179equalsimpl0(j2, colorScheme.m1935getSurfaceContainer0d7_KjU()) && !Color.m4179equalsimpl0(j2, colorScheme.m1936getSurfaceContainerHigh0d7_KjU()) && !Color.m4179equalsimpl0(j2, colorScheme.m1937getSurfaceContainerHighest0d7_KjU()) && !Color.m4179equalsimpl0(j2, colorScheme.m1938getSurfaceContainerLow0d7_KjU()) && !Color.m4179equalsimpl0(j2, colorScheme.m1939getSurfaceContainerLowest0d7_KjU())) {
            return Color.Companion.m4214getUnspecified0d7_KjU();
        }
        return colorScheme.m1922getOnSurface0d7_KjU();
    }

    /* JADX INFO: renamed from: contentColorFor-ek8zF_U */
    public static final long m1947contentColorForek8zF_U(long j2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 509589638, "C(contentColorFor)P(0:c#ui.graphics.Color):ColorScheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i2, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:878)");
        }
        composer.startReplaceGroup(-1680936624);
        ComposerKt.sourceInformation(composer, "*878@39525L11,879@39609L7");
        long jM1946contentColorFor4WTKRHQ = m1946contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j2);
        if (jM1946contentColorFor4WTKRHQ == 16) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            jM1946contentColorFor4WTKRHQ = ((Color) objConsume).m4188unboximpl();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return jM1946contentColorFor4WTKRHQ;
    }

    /* JADX INFO: renamed from: applyTonalElevation-RFCenO8 */
    public static final long m1945applyTonalElevationRFCenO8(ColorScheme colorScheme, long j2, float f2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1610977682, "C(applyTonalElevation)P(0:c#ui.graphics.Color,1:c#ui.unit.Dp)896@40465L7:ColorScheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610977682, i2, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:895)");
        }
        ProvidableCompositionLocal<Boolean> providableCompositionLocal = LocalTonalElevationEnabled;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        boolean zBooleanValue = ((Boolean) objConsume).booleanValue();
        if (Color.m4179equalsimpl0(j2, colorScheme.m1933getSurface0d7_KjU()) && zBooleanValue) {
            j2 = m1956surfaceColorAtElevation3ABfNKs(colorScheme, f2);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return j2;
    }

    public static final ColorScheme expressiveLightColorScheme() {
        return m1953lightColorSchemeCXl9yA$default(0L, 0L, 0L, PaletteTokens.INSTANCE.m3440getPrimary300d7_KjU(), 0L, 0L, 0L, 0L, PaletteTokens.INSTANCE.m3453getSecondary300d7_KjU(), 0L, 0L, 0L, PaletteTokens.INSTANCE.m3453getSecondary300d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -4361, 15, null);
    }

    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.m1909getBackground0d7_KjU();
            case 2:
                return colorScheme.m1910getError0d7_KjU();
            case 3:
                return colorScheme.m1911getErrorContainer0d7_KjU();
            case 4:
                return colorScheme.m1912getInverseOnSurface0d7_KjU();
            case 5:
                return colorScheme.m1913getInversePrimary0d7_KjU();
            case 6:
                return colorScheme.m1914getInverseSurface0d7_KjU();
            case 7:
                return colorScheme.m1915getOnBackground0d7_KjU();
            case 8:
                return colorScheme.m1916getOnError0d7_KjU();
            case 9:
                return colorScheme.m1917getOnErrorContainer0d7_KjU();
            case 10:
                return colorScheme.m1918getOnPrimary0d7_KjU();
            case 11:
                return colorScheme.m1919getOnPrimaryContainer0d7_KjU();
            case 12:
                return colorScheme.m1920getOnSecondary0d7_KjU();
            case 13:
                return colorScheme.m1921getOnSecondaryContainer0d7_KjU();
            case 14:
                return colorScheme.m1922getOnSurface0d7_KjU();
            case 15:
                return colorScheme.m1923getOnSurfaceVariant0d7_KjU();
            case 16:
                return colorScheme.m1941getSurfaceTint0d7_KjU();
            case 17:
                return colorScheme.m1924getOnTertiary0d7_KjU();
            case 18:
                return colorScheme.m1925getOnTertiaryContainer0d7_KjU();
            case 19:
                return colorScheme.m1926getOutline0d7_KjU();
            case 20:
                return colorScheme.m1927getOutlineVariant0d7_KjU();
            case 21:
                return colorScheme.m1928getPrimary0d7_KjU();
            case 22:
                return colorScheme.m1929getPrimaryContainer0d7_KjU();
            case 23:
                return colorScheme.m1930getScrim0d7_KjU();
            case 24:
                return colorScheme.m1931getSecondary0d7_KjU();
            case 25:
                return colorScheme.m1932getSecondaryContainer0d7_KjU();
            case 26:
                return colorScheme.m1933getSurface0d7_KjU();
            case 27:
                return colorScheme.m1942getSurfaceVariant0d7_KjU();
            case 28:
                return colorScheme.m1934getSurfaceBright0d7_KjU();
            case 29:
                return colorScheme.m1935getSurfaceContainer0d7_KjU();
            case 30:
                return colorScheme.m1936getSurfaceContainerHigh0d7_KjU();
            case 31:
                return colorScheme.m1937getSurfaceContainerHighest0d7_KjU();
            case 32:
                return colorScheme.m1938getSurfaceContainerLow0d7_KjU();
            case 33:
                return colorScheme.m1939getSurfaceContainerLowest0d7_KjU();
            case 34:
                return colorScheme.m1940getSurfaceDim0d7_KjU();
            case 35:
                return colorScheme.m1943getTertiary0d7_KjU();
            case 36:
                return colorScheme.m1944getTertiaryContainer0d7_KjU();
            default:
                return Color.Companion.m4214getUnspecified0d7_KjU();
        }
    }

    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalTonalElevationEnabled() {
        return LocalTonalElevationEnabled;
    }

    public static final long getValue(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -810780884, "C1009@45379L11:ColorScheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810780884, i2, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1009)");
        }
        long jFromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return jFromToken;
    }

    /* JADX INFO: renamed from: surfaceColorAtElevation-3ABfNKs */
    public static final long m1956surfaceColorAtElevation3ABfNKs(ColorScheme colorScheme, float f2) {
        if (Dp.m6643equalsimpl0(f2, Dp.m6638constructorimpl(0))) {
            return colorScheme.m1933getSurface0d7_KjU();
        }
        return ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(colorScheme.m1941getSurfaceTint0d7_KjU(), ((((float) Math.log(f2 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1933getSurface0d7_KjU());
    }
}
