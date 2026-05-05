package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4d\u0007\":\u001b\u007f\u0007lqA0RkP.XX0\u0014\u0002ڔd$\n#2ٗ:e\u001e\f\"!O|hwrX\\#C=\u0007&|x/aU'^\"\u0013@F\b?aN\u007fAGe\r63!B&F\u007f\u001d\u0001H+X\u0014\u0005\u0002[K:\u0013@D~Bj\r{\u0006*\u0016\u0014G8\u0001L]wRDR\u0005]h03\u0007wMf'\u000e1\rQ\u001bRl';wq\"9MO5C&c\u0007\u0015`s?1@\u0002A\u0013w?'YJ\u0004[Dh\u0018\u0014C,̠\u0011]\u00017%(_\u0005$'YP\u0014O^3@w)\"=@\u00125\u001e'vTs\u0019Ɋ\u0007\r\u008fsɁՂDR\b\u0007P)C˙5%O\u00183YݍKlWaI\u0019f7*\u0006=$)\u0001|#sT<aE!Zw_4i@kI~\u0010_={\b\tb0+46M\u007f=\u0001).E&ga?#/q\u001aHrh'\u000bfhapjHn#\u001f\u001c=*\u0017\u0014rD\u0013\u0006\u001cVZX:\u001ae\u001c\u0003\b.\u000e\u0019 j\u0002T!S\u0011~UnixXu\nS0\u0017=_ny\u001ao9\r4eWi\u0010o_\u000f\u0014m=\u0013\u000b^fPa$Z\u000b)R8Nj\u001e\u0007\u0014D|\rC8Eq*DD1G]ŢGґٿFC\u00034m\u00071!\r\u0002K$1\u0010Tz\u0017/h^\u0007n\u0016w\u0010ت|)(;pi5GV\u001c61W\u000bT\u001f~\"\u0001wkZldlD\u001c\u0006\u007f.=29\u007fU\u0004\u0012ĺ}(ʾ\u0001Ώ։Ptk\u0004[;o\u001e\u000b-';\u0017/\u0018\fx\u0016D`\u0019p\u007fX%I\u000f^!INcҹx`ĸyòϭX\rarW\u001cK|J\u0004P|3 N)\u000f\u0015:|cSs++=\u0010\u0014];(\\ˉn-ՙaχ֑xg\nbq?@y_`J;fJ̫}ЖҦ#kúFPrw\u0016V!6\u0013EVT5\bd<e\u000b]~\u05fe\u0006ԭ߱oUݍ>\u001bw}BBw,yX\f'/Z3\u0011eS\u0016n¦JŌ؞I\u000eϻ\u000f\u00049n 0U\"\\mp\u001c\u0001\u001d\u0002\u001aNAicǖ;ɿՐ3+ѧ\f\u0013KTw\u001a(|\u0006]m\"gIP~SV<Uݸ[Ƈ\u0098\u0004_҇d)2\u0001\r#K ~M?\u0018>]b;{2/Tñ\bƅ̻N}ݝ)3LTG/@Z\u0007$Sp\u0014`\u0010?\u001cGWnęnȯֽ\u0017{ܫF #9_%wx6x\u0019h5er\u0001*f\u0001OŖ(ͦԌ{\rۖ\u000e\u0017\u0013\u0019]\u0007\bd3g\\\u000b\bZ(\u0010/DW\bӒ{ݭͣ\u001a,ޅ95EIx(?}]oI\u0011X7.7\u001ctO]\u009e\rўǃ\\\u001aƐ\u001ay\u001eb\u0010\u001d+R&!<]E\n\u0018; 6}\u0003ب\u0001ՂɾXj֏%H/+z\u001aZMn\u0017\u0018v=z|c#\u0003\u00152ڵxҧêO\u001cԷ+U6\u0013fnR\u0013Y?f$P+#-766cѣ\u000f˖ˣgoքSc\u0015+=\u007fBc7P`1N6\b}\u001c*\u0003)ض:ۮٟ=cԚ`tJW\u001cr\u0003*j\u0016\u001a<d\u0014\rMv\u0011A5ґqڽԄ.6ق#c\u0015Gn\u001b\u001cGOH/D#V)=J\u000b\u001e)ь\u0010ܛ΅asʷ.J\u0011r\u000e{D/LwK-ŞY-ug\tΛgs7J\b20é\u0015f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d79h{#\u0015w\u001d8ZQ\u0011", "", "1gT0^,=B\u001c\u000f\u0003[\n\u0007\u00109r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1gT0^,=B&zxd\n\u0007\u00109r", "1gT0^,=0#\fy^9Z\u00136o\r", "1gT0^,=7\u0017\t\u0004<6\u0004\u0013<", "CmR5X*DS\u0018m}n4yf9l\n5", "CmR5X*DS\u0018m\bZ*\u0003f9l\n5", "CmR5X*DS\u0018[\u0005k+|\u0016\ro\u00072\t", "CmR5X*DS\u0018bxh5Z\u00136o\r", "2hb.U3>Rv\u0002z\\2|\b\u001eh\u00100x\u001e\u000b\u001e!T", "2hb.U3>Rv\u0002z\\2|\b\u001er{&\u0002\u001e\u000b\u001e!T", "2hb.U3>Rv\u0002z\\2|\b\fo\r'{M^!\u001eQ|", "2hb.U3>Rv\u0002z\\2|\b\u0013c\n1YJ\b!$", "2hb.U3>R\t\bxa,z\u000f/dn+\fH}t!Ny\u001b", "2hb.U3>R\t\bxa,z\u000f/dn5w>\u0007t!Ny\u001b", "2hb.U3>R\t\bxa,z\u000f/d\\2\t?\u0001$tQv\u0018I", "2hb.U3>R\t\bxa,z\u000f/dc&\u0006I^!\u001eQ|", "uI9\u0017=\u0011#8}c_C\u0011am\u0014Jf.\u0006O\b\u001b \u0011t\u001fD@)>h}-@i\u001dw,C<gD%$FkB\u0015r9^t6QY6(iXrJiUK", "5dc\u0010[,<Y\u0019}Wh9{\t<C\n/\u0006MHa\u0016\u0019isAf", "u(9", "\u0018", "5dc\u0010[,<Y\u0019}^\\6\u0006f9l\n5C\u000b\u007fh\u0011-t}", "5dc\u0010[,<Y\u0019}ia<\u0005\u0006\ro\u00072\t\bK\u0016hAU\u0013,", "5dc\u0010[,<Y\u0019}ik(z\u000f\ro\u00072\t\bK\u0016hAU\u0013,", "5dc\u0011\\::P ~y</|\u00075e~\u0005\u0006M\u007f\u0017$%y\u0015F\u0004l\u007fXO\u001a\u001dr\u0006", "5dc\u0011\\::P ~y</|\u00075e~\fyJ\nt!Ny\u001b\u0004A$\u0007Sc%'", "5dc\u0011\\::P ~y</|\u00075e~\u0017~P\t\u0014tQv\u0018I>o4+w\u0006<]", "5dc\u0011\\::P ~y</|\u00075e~\u0017\t<~\u001dtQv\u0018I>o4+w\u0006<]", "5dc\u0011\\::P ~yN5z\f/c\u0006(z\u001d\u000b$\u0016G|kF}/B!H\u001f\tg{3=", "5dc\u0011\\::P ~yN5z\f/c\u0006(z$~! %y\u0015F\u0004l\u007fXO\u001a\u001dr\u0006", "5dc\u0011\\::P ~yN5z\f/c\u0006(z/\u0004'\u001fDM\u0018C\u00012|$|q1S\u001b\u001e", "5dc\u0011\\::P ~yN5z\f/c\u0006(z/\u000e\u0013\u0015MM\u0018C\u00012|$|q1S\u001b\u001e", "5dc\"a*AS\u0017\u0005z]\t\u0007\u0016.e\r\u0006\u0006G\u000b$^\u0012n_6\\*%", "5dc\"a*AS\u0017\u0005z]\u0010z\u00138C\n/\u0006MHa\u0016\u0019isAf", "5dc\"a*AS\u0017\u0005z]\u001b\u007f\u00197b]2\u0003J\u000e^aFA\b\"{\u0015", "5dc\"a*AS\u0017\u0005z]\u001b\n\u0005-k]2\u0003J\u000e^aFA\b\"{\u0015", "0na1X9\u001c] \t\b", "3mP/_,=", "", "1gT0^,=", "0na1X9\u001c] \t\b&\u001exd\u0010US&:H|&\u0017Ts\nCD\u001fBY\u0005 3{\u0016", "uYIu=", "1n_F", "1n_F \u001886l\u000baN", "uI9\u0017=\u0011#8}c_C\u0011am\u0014JC\u000fwI\u007f$!Kn!\u0006t/=d\b.77\u001e*\\CHo0%b2OK\u000br*QT1NV[:2", "3pd._:", "=sW2e", "6`b566=S", "", "7b^;66E]&", "7b^;66E]&FlZ\b]x\u0003c>0wO\u0001$\u001bCv[6\u0004%<Yy.7", "Bgd:U\nHZ#\f", "Bgd:U\nHZ#\fBP(Xi\u001f9}f\u0004<\u0010\u0017$Kk\u0015\np25`}\u001cEm", "BqP0^\nHZ#\f", "BqP0^\nHZ#\fBP(Xi\u001f9}f\u0004<\u0010\u0017$Kk\u0015\np25`}\u001cEm", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SwitchColors {
    public static final int $stable = 0;
    private final long checkedBorderColor;
    private final long checkedIconColor;
    private final long checkedThumbColor;
    private final long checkedTrackColor;
    private final long disabledCheckedBorderColor;
    private final long disabledCheckedIconColor;
    private final long disabledCheckedThumbColor;
    private final long disabledCheckedTrackColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedIconColor;
    private final long disabledUncheckedThumbColor;
    private final long disabledUncheckedTrackColor;
    private final long uncheckedBorderColor;
    private final long uncheckedIconColor;
    private final long uncheckedThumbColor;
    private final long uncheckedTrackColor;

    public /* synthetic */ SwitchColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17);
    }

    private SwitchColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.checkedThumbColor = j2;
        this.checkedTrackColor = j3;
        this.checkedBorderColor = j4;
        this.checkedIconColor = j5;
        this.uncheckedThumbColor = j6;
        this.uncheckedTrackColor = j7;
        this.uncheckedBorderColor = j8;
        this.uncheckedIconColor = j9;
        this.disabledCheckedThumbColor = j10;
        this.disabledCheckedTrackColor = j11;
        this.disabledCheckedBorderColor = j12;
        this.disabledCheckedIconColor = j13;
        this.disabledUncheckedThumbColor = j14;
        this.disabledUncheckedTrackColor = j15;
        this.disabledUncheckedBorderColor = j16;
        this.disabledUncheckedIconColor = j17;
    }

    /* JADX INFO: renamed from: getCheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2576getCheckedThumbColor0d7_KjU() {
        return this.checkedThumbColor;
    }

    /* JADX INFO: renamed from: getCheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2577getCheckedTrackColor0d7_KjU() {
        return this.checkedTrackColor;
    }

    /* JADX INFO: renamed from: getCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2574getCheckedBorderColor0d7_KjU() {
        return this.checkedBorderColor;
    }

    /* JADX INFO: renamed from: getCheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2575getCheckedIconColor0d7_KjU() {
        return this.checkedIconColor;
    }

    /* JADX INFO: renamed from: getUncheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2588getUncheckedThumbColor0d7_KjU() {
        return this.uncheckedThumbColor;
    }

    /* JADX INFO: renamed from: getUncheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2589getUncheckedTrackColor0d7_KjU() {
        return this.uncheckedTrackColor;
    }

    /* JADX INFO: renamed from: getUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2586getUncheckedBorderColor0d7_KjU() {
        return this.uncheckedBorderColor;
    }

    /* JADX INFO: renamed from: getUncheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2587getUncheckedIconColor0d7_KjU() {
        return this.uncheckedIconColor;
    }

    /* JADX INFO: renamed from: getDisabledCheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2580getDisabledCheckedThumbColor0d7_KjU() {
        return this.disabledCheckedThumbColor;
    }

    /* JADX INFO: renamed from: getDisabledCheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2581getDisabledCheckedTrackColor0d7_KjU() {
        return this.disabledCheckedTrackColor;
    }

    /* JADX INFO: renamed from: getDisabledCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2578getDisabledCheckedBorderColor0d7_KjU() {
        return this.disabledCheckedBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledCheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2579getDisabledCheckedIconColor0d7_KjU() {
        return this.disabledCheckedIconColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2584getDisabledUncheckedThumbColor0d7_KjU() {
        return this.disabledUncheckedThumbColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2585getDisabledUncheckedTrackColor0d7_KjU() {
        return this.disabledUncheckedTrackColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2582getDisabledUncheckedBorderColor0d7_KjU() {
        return this.disabledUncheckedBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2583getDisabledUncheckedIconColor0d7_KjU() {
        return this.disabledUncheckedIconColor;
    }

    /* JADX INFO: renamed from: copy-Q_H9qLU$default, reason: not valid java name */
    public static /* synthetic */ SwitchColors m2571copyQ_H9qLU$default(SwitchColors switchColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i2, Object obj) {
        long j18 = j8;
        long j19 = j7;
        long j20 = j2;
        long j21 = j6;
        long j22 = j5;
        long j23 = j4;
        long j24 = j3;
        long j25 = j12;
        long j26 = j13;
        long j27 = j17;
        long j28 = j16;
        long j29 = j11;
        long j30 = j10;
        long j31 = j15;
        long j32 = j14;
        long j33 = j9;
        if ((i2 & 1) != 0) {
            j20 = switchColors.checkedThumbColor;
        }
        if ((i2 & 2) != 0) {
            j24 = switchColors.checkedTrackColor;
        }
        if ((i2 & 4) != 0) {
            j23 = switchColors.checkedBorderColor;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            j22 = switchColors.checkedIconColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            j21 = switchColors.uncheckedThumbColor;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            j19 = switchColors.uncheckedTrackColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            j18 = switchColors.uncheckedBorderColor;
        }
        if ((i2 + 128) - (i2 | 128) != 0) {
            j33 = switchColors.uncheckedIconColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 256)) != 0) {
            j30 = switchColors.disabledCheckedThumbColor;
        }
        if ((i2 + 512) - (i2 | 512) != 0) {
            j29 = switchColors.disabledCheckedTrackColor;
        }
        if ((i2 & 1024) != 0) {
            j25 = switchColors.disabledCheckedBorderColor;
        }
        if ((i2 + 2048) - (i2 | 2048) != 0) {
            j26 = switchColors.disabledCheckedIconColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4096)) != 0) {
            j32 = switchColors.disabledUncheckedThumbColor;
        }
        if ((i2 + 8192) - (i2 | 8192) != 0) {
            j31 = switchColors.disabledUncheckedTrackColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16384)) != 0) {
            j28 = switchColors.disabledUncheckedBorderColor;
        }
        if ((i2 + 32768) - (i2 | 32768) != 0) {
            j27 = switchColors.disabledUncheckedIconColor;
        }
        return switchColors.m2573copyQ_H9qLU(j20, j24, j23, j22, j21, j19, j18, j33, j30, j29, j25, j26, j32, j31, j28, j27);
    }

    /* JADX INFO: renamed from: copy-Q_H9qLU, reason: not valid java name */
    public final SwitchColors m2573copyQ_H9qLU(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        long j18 = j2;
        long j19 = j3;
        long j20 = j4;
        long j21 = j5;
        long j22 = j6;
        long j23 = j7;
        long j24 = j8;
        long j25 = j9;
        long j26 = j10;
        long j27 = j11;
        long j28 = j12;
        long j29 = j13;
        long j30 = j14;
        long j31 = j15;
        long j32 = j16;
        long j33 = j17;
        if (j18 == 16) {
            j18 = this.checkedThumbColor;
        }
        if (j19 == 16) {
            j19 = this.checkedTrackColor;
        }
        if (j20 == 16) {
            j20 = this.checkedBorderColor;
        }
        if (j21 == 16) {
            j21 = this.checkedIconColor;
        }
        if (j22 == 16) {
            j22 = this.uncheckedThumbColor;
        }
        if (j23 == 16) {
            j23 = this.uncheckedTrackColor;
        }
        if (j24 == 16) {
            j24 = this.uncheckedBorderColor;
        }
        if (j25 == 16) {
            j25 = this.uncheckedIconColor;
        }
        if (j26 == 16) {
            j26 = this.disabledCheckedThumbColor;
        }
        if (j27 == 16) {
            j27 = this.disabledCheckedTrackColor;
        }
        if (j28 == 16) {
            j28 = this.disabledCheckedBorderColor;
        }
        if (j29 == 16) {
            j29 = this.disabledCheckedIconColor;
        }
        if (j30 == 16) {
            j30 = this.disabledUncheckedThumbColor;
        }
        if (j31 == 16) {
            j31 = this.disabledUncheckedTrackColor;
        }
        if (j32 == 16) {
            j32 = this.disabledUncheckedBorderColor;
        }
        if (j33 == 16) {
            j33 = this.disabledUncheckedIconColor;
        }
        return new SwitchColors(j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, null);
    }

    /* JADX INFO: renamed from: thumbColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2591thumbColorWaAFU9c$material3_release(boolean z2, boolean z3) {
        return z2 ? z3 ? this.checkedThumbColor : this.uncheckedThumbColor : z3 ? this.disabledCheckedThumbColor : this.disabledUncheckedThumbColor;
    }

    /* JADX INFO: renamed from: trackColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2592trackColorWaAFU9c$material3_release(boolean z2, boolean z3) {
        return z2 ? z3 ? this.checkedTrackColor : this.uncheckedTrackColor : z3 ? this.disabledCheckedTrackColor : this.disabledUncheckedTrackColor;
    }

    /* JADX INFO: renamed from: borderColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2572borderColorWaAFU9c$material3_release(boolean z2, boolean z3) {
        return z2 ? z3 ? this.checkedBorderColor : this.uncheckedBorderColor : z3 ? this.disabledCheckedBorderColor : this.disabledUncheckedBorderColor;
    }

    /* JADX INFO: renamed from: iconColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2590iconColorWaAFU9c$material3_release(boolean z2, boolean z3) {
        return z2 ? z3 ? this.checkedIconColor : this.uncheckedIconColor : z3 ? this.disabledCheckedIconColor : this.disabledUncheckedIconColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SwitchColors)) {
            return false;
        }
        SwitchColors switchColors = (SwitchColors) obj;
        return Color.m4179equalsimpl0(this.checkedThumbColor, switchColors.checkedThumbColor) && Color.m4179equalsimpl0(this.checkedTrackColor, switchColors.checkedTrackColor) && Color.m4179equalsimpl0(this.checkedBorderColor, switchColors.checkedBorderColor) && Color.m4179equalsimpl0(this.checkedIconColor, switchColors.checkedIconColor) && Color.m4179equalsimpl0(this.uncheckedThumbColor, switchColors.uncheckedThumbColor) && Color.m4179equalsimpl0(this.uncheckedTrackColor, switchColors.uncheckedTrackColor) && Color.m4179equalsimpl0(this.uncheckedBorderColor, switchColors.uncheckedBorderColor) && Color.m4179equalsimpl0(this.uncheckedIconColor, switchColors.uncheckedIconColor) && Color.m4179equalsimpl0(this.disabledCheckedThumbColor, switchColors.disabledCheckedThumbColor) && Color.m4179equalsimpl0(this.disabledCheckedTrackColor, switchColors.disabledCheckedTrackColor) && Color.m4179equalsimpl0(this.disabledCheckedBorderColor, switchColors.disabledCheckedBorderColor) && Color.m4179equalsimpl0(this.disabledCheckedIconColor, switchColors.disabledCheckedIconColor) && Color.m4179equalsimpl0(this.disabledUncheckedThumbColor, switchColors.disabledUncheckedThumbColor) && Color.m4179equalsimpl0(this.disabledUncheckedTrackColor, switchColors.disabledUncheckedTrackColor) && Color.m4179equalsimpl0(this.disabledUncheckedBorderColor, switchColors.disabledUncheckedBorderColor) && Color.m4179equalsimpl0(this.disabledUncheckedIconColor, switchColors.disabledUncheckedIconColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Color.m4185hashCodeimpl(this.checkedThumbColor) * 31) + Color.m4185hashCodeimpl(this.checkedTrackColor)) * 31) + Color.m4185hashCodeimpl(this.checkedBorderColor)) * 31) + Color.m4185hashCodeimpl(this.checkedIconColor)) * 31) + Color.m4185hashCodeimpl(this.uncheckedThumbColor)) * 31) + Color.m4185hashCodeimpl(this.uncheckedTrackColor)) * 31) + Color.m4185hashCodeimpl(this.uncheckedBorderColor)) * 31) + Color.m4185hashCodeimpl(this.uncheckedIconColor)) * 31) + Color.m4185hashCodeimpl(this.disabledCheckedThumbColor)) * 31) + Color.m4185hashCodeimpl(this.disabledCheckedTrackColor)) * 31) + Color.m4185hashCodeimpl(this.disabledCheckedBorderColor)) * 31) + Color.m4185hashCodeimpl(this.disabledCheckedIconColor)) * 31) + Color.m4185hashCodeimpl(this.disabledUncheckedThumbColor)) * 31) + Color.m4185hashCodeimpl(this.disabledUncheckedTrackColor)) * 31) + Color.m4185hashCodeimpl(this.disabledUncheckedBorderColor)) * 31) + Color.m4185hashCodeimpl(this.disabledUncheckedIconColor);
    }
}
