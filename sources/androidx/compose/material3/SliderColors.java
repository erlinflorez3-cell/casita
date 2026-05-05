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
/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4Z\u0007\":\u001b\u007f\u0007ljA0RkP.X[0\u0014\u0002ڔd$\n#2\u0017KY(}:\t}Owk|Lr\u000bq\u0010\u0016\u001a\u0007mDI\u0004ym\u0016\u001d6Zom4]sK>xtd\u0006060>\u0012\u0005/\u001b:L\u001e}\u0013Cy\r\"4NxRR;N\u0015\u001e \u000fV /\u001flk\\@`l\f;ǥ'\u0003wM\u0017\u001amH\u0015M;Ͽ\u0005-\u0013vo\u001eC@e6E+Y\u0003\u0015Ts?1@\"C\u000bh5*CI\"Xf^\u0006\u0014#/g\r\fsVb\u000bQn\u0011?+}d{V\u0014(\u0006\u0001\u0014\rj\u0005>\f-H<42f6\u000fczxSNX\u001a^p\u0001+g<\u00173\tK+g\u001c\u0017Wg;'XO{3\u000e\u038d\"Чͼ%]Z'n/ce\u0006lIQnYxT\u0018vUo\u001ao\u0011\u0001pˍ0\u0010\u0006=\u001a).ED}o\u0002>/k\u001aHrh'\tn\tki\u0001d\u0007!Ļ\u00156Ӡ\bȱʑHf\u000b\r^v!O\u001fp4T5~8\u0017.|\u0010<OA@R]\r\u0002j{yP$Ľe6ףm\u0088ް[;dXCw,3oy\u000f\u0014m=\u0013\tf\u0007ZS:v\r,0V`j>\u0014BCā\u000b\u0012֮>ڤʬ8.7Aj;\u0019\u001a,EY|7`̬gɭҰS2ʗ\u0007q,t\u0017\u000fh^v{u\u0006\u001aC\u000bb:-oRۺ\u0018ğǗ!gط\u0001+\u000f~\u0002\u000e_iRVZyf\rc\u00048\u0016H:ؐ.ˋҘ\u000e}Ȟ6\n5EZ\u0001}SS\"5\bM\u0011\u001dB\u0001.\u0016\tзoݚÄiIׅX\u001f*vl\u0001;\nj\u0011\bn\u0017\u0012Uml\u000b\n?ЭqÅ̔;M̞\u0001\r'\u001e3\u000f\b$\u0003G;Pw4$\u0001,/Cbՙh۰ѼxaϪ*|m\u0004:q.qhdk?\fOW_\u0017>P%Ґ\u0002ܩَivڇF\u0011<\rAVYfvjFZ[F\fk\u001f,;qĜZƥޝn|ӑ2g2sQ\f,`I:\u001fZ$~{qc\\9Kٳ\tΚ\u06030m݁ E(Vep!2\f\n&C\u0012Rp\u0005T\tR5˯;ފֺBSɎ\n\u0018\u0003\u007fTm'\u00198Y\u0002Hٜ\u000e]\u0001_\\߂!\u000fDh!0 ϼ\u0013\\"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d,9X}-\u0015w\u001d8ZQ\u0011", "", "Bgd:U\nHZ#\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "/bc6i,-`\u0015|\u0001<6\u0004\u0013<", "/bc6i,-W\u0017\u0005Xh3\u0007\u0016", "7mP0g0OS\b\fv\\2Z\u00136o\r", "7mP0g0OS\b\u0003xd\n\u0007\u00109r", "2hb.U3>R\b\u0002\u000bf)Z\u00136o\r", "2hb.U3>Rt|\nb=|w<a}.YJ\b!$", "2hb.U3>Rt|\nb=|w3c\u0006\u0006\u0006G\u000b$", "2hb.U3>R|\bv\\;\u0001\u001a/T\r$yF^!\u001eQ|", "2hb.U3>R|\bv\\;\u0001\u001a/T\u0004&\u0002\u001e\u000b\u001e!T", "uI9\u0017=\u0011#8}c_E2\u0007\u00186i\tq\u0001Q\t`\u001bP~\u000eI\u007f!<#\\ 8i&5\\!EtB-\"x_H\u0011p\u0014J\u0004-GY$oM", "5dc\u000eV;Bd\u0019m~\\2Z\u00136o\roF?R\u0011|L_", "u(9", "\u0018", "5dc\u000eV;Bd\u0019m\bZ*\u0003f9l\n5C\u000b\u007fh\u0011-t}", "5dc\u0011\\::P ~y:*\f\r@en,yF^!\u001eQ|U\u0007uv/?\u0003\u0010", "5dc\u0011\\::P ~y:*\f\r@en5w>\u0007t!Ny\u001b\u0004A$\u0007Sc%'", "5dc\u0011\\::P ~yB5x\u0007>i\u0011(jD~\u001dtQv\u0018I>o4+w\u0006<]", "5dc\u0011\\::P ~yB5x\u0007>i\u0011(jM|\u0015\u001d%y\u0015F\u0004l\u007fXO\u001a\u001dr\u0006", "5dc\u0011\\::P ~yM/\r\u0011,C\n/\u0006MHa\u0016\u0019isAf", "5dc\u0016a(<b\u001d\u0010zM0z\u000f\ro\u00072\t\bK\u0016hAU\u0013,", "5dc\u0016a(<b\u001d\u0010zM9x\u00075C\n/\u0006MHa\u0016\u0019isAf", "5dc![<FPv\t\u0002h9DS.7y\u000e\u00010", "1n_F", "1n_F s$#dQ\u0010-", "uI9\u0017=\u0011#8}c_\"\u0013x\u0012.r\n,zSJ\u0015!Oz\u0018Jvn=U\r Dq\u00125\u001b\r)r8\u001d\u0015u?C\u000em9\\L", "3pd._:", "", "=sW2e", "6`b566=S", "", "3mP/_,=", "Bgd:U\nHZ#\fBo\u0015\u0010ey6\u0006f\u0004<\u0010\u0017$Kk\u0015\np25`}\u001cEm", "uY\u0018\u0017", "BhR866E]&", "/bc6i,", "BhR866E]&FlZ\b]x\u0003c>0wO\u0001$\u001bCv[6\u0004%<Yy.7", "uYIu=", "BqP0^\nHZ#\f", "BqP0^\nHZ#\fBP(Xi\u001f9}f\u0004<\u0010\u0017$Kk\u0015\np25`}\u001cEm", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SliderColors {
    public static final int $stable = 0;
    private final long activeTickColor;
    private final long activeTrackColor;
    private final long disabledActiveTickColor;
    private final long disabledActiveTrackColor;
    private final long disabledInactiveTickColor;
    private final long disabledInactiveTrackColor;
    private final long disabledThumbColor;
    private final long inactiveTickColor;
    private final long inactiveTrackColor;
    private final long thumbColor;

    public /* synthetic */ SliderColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);
    }

    private SliderColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.thumbColor = j2;
        this.activeTrackColor = j3;
        this.activeTickColor = j4;
        this.inactiveTrackColor = j5;
        this.inactiveTickColor = j6;
        this.disabledThumbColor = j7;
        this.disabledActiveTrackColor = j8;
        this.disabledActiveTickColor = j9;
        this.disabledInactiveTrackColor = j10;
        this.disabledInactiveTickColor = j11;
    }

    /* JADX INFO: renamed from: getThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2501getThumbColor0d7_KjU() {
        return this.thumbColor;
    }

    /* JADX INFO: renamed from: getActiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2493getActiveTrackColor0d7_KjU() {
        return this.activeTrackColor;
    }

    /* JADX INFO: renamed from: getActiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m2492getActiveTickColor0d7_KjU() {
        return this.activeTickColor;
    }

    /* JADX INFO: renamed from: getInactiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2500getInactiveTrackColor0d7_KjU() {
        return this.inactiveTrackColor;
    }

    /* JADX INFO: renamed from: getInactiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m2499getInactiveTickColor0d7_KjU() {
        return this.inactiveTickColor;
    }

    /* JADX INFO: renamed from: getDisabledThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2498getDisabledThumbColor0d7_KjU() {
        return this.disabledThumbColor;
    }

    /* JADX INFO: renamed from: getDisabledActiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2495getDisabledActiveTrackColor0d7_KjU() {
        return this.disabledActiveTrackColor;
    }

    /* JADX INFO: renamed from: getDisabledActiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m2494getDisabledActiveTickColor0d7_KjU() {
        return this.disabledActiveTickColor;
    }

    /* JADX INFO: renamed from: getDisabledInactiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2497getDisabledInactiveTrackColor0d7_KjU() {
        return this.disabledInactiveTrackColor;
    }

    /* JADX INFO: renamed from: getDisabledInactiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m2496getDisabledInactiveTickColor0d7_KjU() {
        return this.disabledInactiveTickColor;
    }

    /* JADX INFO: renamed from: copy--K518z4$default, reason: not valid java name */
    public static /* synthetic */ SliderColors m2490copyK518z4$default(SliderColors sliderColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i2, Object obj) {
        long j12 = j2;
        long j13 = j5;
        long j14 = j4;
        long j15 = j3;
        long j16 = j8;
        long j17 = j7;
        long j18 = j6;
        long j19 = j11;
        long j20 = j10;
        long j21 = j9;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            j12 = sliderColors.thumbColor;
        }
        if ((i2 & 2) != 0) {
            j15 = sliderColors.activeTrackColor;
        }
        if ((i2 & 4) != 0) {
            j14 = sliderColors.activeTickColor;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            j13 = sliderColors.inactiveTrackColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            j18 = sliderColors.inactiveTickColor;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            j17 = sliderColors.disabledThumbColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            j16 = sliderColors.disabledActiveTrackColor;
        }
        if ((i2 + 128) - (i2 | 128) != 0) {
            j21 = sliderColors.disabledActiveTickColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 256)) != 0) {
            j20 = sliderColors.disabledInactiveTrackColor;
        }
        if ((i2 & 512) != 0) {
            j19 = sliderColors.disabledInactiveTickColor;
        }
        long j22 = j15;
        long j23 = j14;
        long j24 = j13;
        return sliderColors.m2491copyK518z4(j12, j22, j23, j24, j18, j17, j16, j21, j20, j19);
    }

    /* JADX INFO: renamed from: copy--K518z4, reason: not valid java name */
    public final SliderColors m2491copyK518z4(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        long j12 = j2;
        long j13 = j3;
        long j14 = j4;
        long j15 = j5;
        long j16 = j6;
        long j17 = j7;
        long j18 = j8;
        long j19 = j9;
        long j20 = j10;
        long j21 = j11;
        if (j12 == 16) {
            j12 = this.thumbColor;
        }
        if (j13 == 16) {
            j13 = this.activeTrackColor;
        }
        if (j14 == 16) {
            j14 = this.activeTickColor;
        }
        if (j15 == 16) {
            j15 = this.inactiveTrackColor;
        }
        if (j16 == 16) {
            j16 = this.inactiveTickColor;
        }
        if (j17 == 16) {
            j17 = this.disabledThumbColor;
        }
        if (j18 == 16) {
            j18 = this.disabledActiveTrackColor;
        }
        if (j19 == 16) {
            j19 = this.disabledActiveTickColor;
        }
        if (j20 == 16) {
            j20 = this.disabledInactiveTrackColor;
        }
        if (j21 == 16) {
            j21 = this.disabledInactiveTickColor;
        }
        return new SliderColors(j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, null);
    }

    /* JADX INFO: renamed from: thumbColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2502thumbColorvNxB06k$material3_release(boolean z2) {
        return z2 ? this.thumbColor : this.disabledThumbColor;
    }

    /* JADX INFO: renamed from: trackColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2504trackColorWaAFU9c$material3_release(boolean z2, boolean z3) {
        return z2 ? z3 ? this.activeTrackColor : this.inactiveTrackColor : z3 ? this.disabledActiveTrackColor : this.disabledInactiveTrackColor;
    }

    /* JADX INFO: renamed from: tickColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2503tickColorWaAFU9c$material3_release(boolean z2, boolean z3) {
        return z2 ? z3 ? this.activeTickColor : this.inactiveTickColor : z3 ? this.disabledActiveTickColor : this.disabledInactiveTickColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SliderColors)) {
            return false;
        }
        SliderColors sliderColors = (SliderColors) obj;
        return Color.m4179equalsimpl0(this.thumbColor, sliderColors.thumbColor) && Color.m4179equalsimpl0(this.activeTrackColor, sliderColors.activeTrackColor) && Color.m4179equalsimpl0(this.activeTickColor, sliderColors.activeTickColor) && Color.m4179equalsimpl0(this.inactiveTrackColor, sliderColors.inactiveTrackColor) && Color.m4179equalsimpl0(this.inactiveTickColor, sliderColors.inactiveTickColor) && Color.m4179equalsimpl0(this.disabledThumbColor, sliderColors.disabledThumbColor) && Color.m4179equalsimpl0(this.disabledActiveTrackColor, sliderColors.disabledActiveTrackColor) && Color.m4179equalsimpl0(this.disabledActiveTickColor, sliderColors.disabledActiveTickColor) && Color.m4179equalsimpl0(this.disabledInactiveTrackColor, sliderColors.disabledInactiveTrackColor) && Color.m4179equalsimpl0(this.disabledInactiveTickColor, sliderColors.disabledInactiveTickColor);
    }

    public int hashCode() {
        return (((((((((((((((((Color.m4185hashCodeimpl(this.thumbColor) * 31) + Color.m4185hashCodeimpl(this.activeTrackColor)) * 31) + Color.m4185hashCodeimpl(this.activeTickColor)) * 31) + Color.m4185hashCodeimpl(this.inactiveTrackColor)) * 31) + Color.m4185hashCodeimpl(this.inactiveTickColor)) * 31) + Color.m4185hashCodeimpl(this.disabledThumbColor)) * 31) + Color.m4185hashCodeimpl(this.disabledActiveTrackColor)) * 31) + Color.m4185hashCodeimpl(this.disabledActiveTickColor)) * 31) + Color.m4185hashCodeimpl(this.disabledInactiveTrackColor)) * 31) + Color.m4185hashCodeimpl(this.disabledInactiveTickColor);
    }
}
