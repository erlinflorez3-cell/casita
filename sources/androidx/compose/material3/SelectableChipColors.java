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
/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4O\u0007\":\u001b\u007f\u0007lqA0RkP.XW0\u0014\u0002ڔd$\n#2/KY(}:\t}Owk|Lr\u000bq\u0010\u0016\u001a\u0007mDI\u0004ym\u0016\u001d6Zom4]sK>xtd\u0006060>\u0012\u0005/\u001b:L\u001e}\u0013Cy\r\"4NxRR;N\u0015\u001e \u000fV /\u001flk\\@`l\f;?'\u0011tZNU`@\u0001[\u0019^TU\u000e\u0007e,8X7c\u0016ȏW\u0003\u0015`$b\u0011?\n=3iW+9Y\fWdi0\u0018#=g\r\f\u0004l[՝P_Ѩ&˃յgMV!6\fCԛ\fJ\u0019&\u0006UΞ^3 f\u0016\u000eKt!TpV\b^P\u0002\u0013ad\u0018U\u00069+G\u001e~Q\u0010<IT={\u0013\u00116#/oQaZ\u000en\u001a3T&RaWF=VT\"Ykn4vh\u00028\u000bHG.0,\u00174\u00173?s9Q\"\u001c\bNDu\u007f\u001d`\u0017T\u001aXN@0x.7X\n<`Jd\u0013vhT\u0007-AS\"T\u0015\n \u0013N](B'%\u001e[gh\u0018kލ\\܃ɻ3h=o|\u0003VhGvK5\u007ft@g`\u0010,ARa3W-͒ST`jB:2v\u0006V\fDg\\\u000e+2mrL8:A1\\CY3\"PS\u0015\t\u000ek/\u000fҰS2˭\u0002ǭ˨x\u000b\u0007lj\u00058\u000b\u0007fD|\u000f#]E_E1&\u00043\u00198\u000b5\u001f~\"\u0011\u000efׯFKͷ\u0015߯ʀ\u007f\"\u001c8Gew`!.\u0017)`\u0003]IZ\u0003}Q{#W~\u000b\f';\u0017?.\u0007зo+Äi\u07baׅX\u0019(\u0017l\u0007s\u001cr\u007f\u0012at{\u001eύV¤ZŬЭq\u0002ʾ@P@|\u0013.n9\u000ft:|c.\u001aڲ\u001fʯvҡۥ\u0014`ԃmq6yp\u001ev\ts\nDcDp9Ж_ҟ:ַͯX}й&&t\u0003PW;\f\u0016I!4;4\u001fЫfߞUЕր\n.̱j\t4\r~e,N!y\u00164\\`\u0001ϕEϘ\u0013٫Ȳ$\u0010ߠWiumYk[^\u001d\u0012#{_ohΕ?\u05ebṴƻ\b/Ӓw\u001a>AIqUP\u0017&L,j\ta͒Vʤ\u0005؋Ÿ~Eݍ\u0013\u0019:B\u0002J'\"b{tVv\u00067ѧb֙)܀ь\u000e2\u038b|79\u0005{U%Cq;\u0019SK\nq˅QȤeއƶCSۆ\u001f*`\u0001\u0019T.WW\rN\u0004u*D£qʨ7\u008eն\u001cAɓ\u001f;Y\u0011m\u0006\u0001r\u0019a|N\u0013whשTȂ!Ėϟy{ɽ@\f\u0017\u000b'^C\u0004p:dN&8\u001aב\u0003ԸC͈ކ\u000b{ސJ\u001d5\u0006C<\u000e]x\u0018?{\u0006T\u0012վ\nį\u001fٴ٭s Ǜ[\u0010n\nk*Ű\u0016z\u001ee\bƣ/~\u001f\f.P\u0014Ӄ\u000eO"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.+F?v\u0012(\u001crnG\\", "", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", ":`Q2_\nHZ#\f", ":dP1\\5@7\u0017\t\u0004<6\u0004\u0013<", "BqP6_0GU||\u0005g\n\u0007\u00109r", "2hb.U3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "2hb.U3>R\u007fzw^3Z\u00136o\r", "2hb.U3>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$", "2hb.U3>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "Ad[2V;>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "2hb.U3>R\u0007~\u0002^*\f\t.C\n1\u000b<\u0005 \u0017TM\u0018C\u00012", "Ad[2V;>R\u007fzw^3Z\u00136o\r", "Ad[2V;>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$", "Ad[2V;>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "uI9\u0017=\u0011#8}c_C\u0011ao5o\u000f/\u007fIJ\u001c(O9\u0012E\u0006%Bby'\u0001L\u0016/ISBz\u0012(\u001evpF\u0017a;X\u0004\u000fCYT,i(6.", "\u0018", "3mP/_,=", "", "Ad[2V;>R", "1n]AT0GS&\\\u0005e6\nP!a[\tk\u0014~U\u001fC~\u000eIz!<'w-7t\u0016*[C", "uYIu=", "1n_F", "1n_F +:@\u0005\u000f_:", "uI9\u0017=\u0011#8}c_C\u0011aL\u0016a\t'\tJ\u0005\u0016*\u0011m\u0018D\u0002/CYG(3|\u0016;Q?B9}\f\u0015oa7\u0016_)Uv\u0005JPY\nfY|J\"g", "3pd._:", "=sW2e", "6`b566=S", "", ":`Q2_\nHZ#\fBP(Xi\u001f9}f\u0004<\u0010\u0017$Kk\u0015\np25`}\u001cEm", ":dP1\\5@7\u0017\t\u0004<6\u0006\u0018/n\u000f\u0006\u0006G\u000b$", ":dP1\\5@7\u0017\t\u0004<6\u0006\u0018/n\u000f\u0006\u0006G\u000b$^9ki\u001dfx3\u0018\u0006\u001cFm#2IJ\teA\u001e\u001ch]G\u0007", "BqP6_0GU||\u0005g\n\u0007\u0012>e\t7YJ\b!$", "BqP6_0GU||\u0005g\n\u0007\u0012>e\t7YJ\b!$\u000fa\n\u0018W\u0015\tW<(3|\u0016;Q?B9.+\u0015oa5\u0015c", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SelectableChipColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledSelectedContainerColor;
    private final long disabledTrailingIconColor;
    private final long labelColor;
    private final long leadingIconColor;
    private final long selectedContainerColor;
    private final long selectedLabelColor;
    private final long selectedLeadingIconColor;
    private final long selectedTrailingIconColor;
    private final long trailingIconColor;

    public /* synthetic */ SelectableChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14);
    }

    private SelectableChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.containerColor = j2;
        this.labelColor = j3;
        this.leadingIconColor = j4;
        this.trailingIconColor = j5;
        this.disabledContainerColor = j6;
        this.disabledLabelColor = j7;
        this.disabledLeadingIconColor = j8;
        this.disabledTrailingIconColor = j9;
        this.selectedContainerColor = j10;
        this.disabledSelectedContainerColor = j11;
        this.selectedLabelColor = j12;
        this.selectedLeadingIconColor = j13;
        this.selectedTrailingIconColor = j14;
    }

    /* JADX INFO: renamed from: copy-daRQuJA$default, reason: not valid java name */
    public static /* synthetic */ SelectableChipColors m2476copydaRQuJA$default(SelectableChipColors selectableChipColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, int i2, Object obj) {
        long j15 = j2;
        long j16 = j3;
        long j17 = j7;
        long j18 = j6;
        long j19 = j5;
        long j20 = j8;
        long j21 = j4;
        long j22 = j14;
        long j23 = j13;
        long j24 = j11;
        long j25 = j10;
        long j26 = j12;
        long j27 = j9;
        if ((i2 + 1) - (i2 | 1) != 0) {
            j15 = selectableChipColors.containerColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j16 = selectableChipColors.labelColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            j21 = selectableChipColors.leadingIconColor;
        }
        if ((i2 & 8) != 0) {
            j19 = selectableChipColors.trailingIconColor;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            j18 = selectableChipColors.disabledContainerColor;
        }
        if ((i2 & 32) != 0) {
            j17 = selectableChipColors.disabledLabelColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            j20 = selectableChipColors.disabledLeadingIconColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            j27 = selectableChipColors.disabledTrailingIconColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 256)) != 0) {
            j25 = selectableChipColors.selectedContainerColor;
        }
        if ((i2 & 512) != 0) {
            j24 = selectableChipColors.disabledSelectedContainerColor;
        }
        if ((i2 & 1024) != 0) {
            j26 = selectableChipColors.selectedLabelColor;
        }
        if ((i2 & 2048) != 0) {
            j23 = selectableChipColors.selectedLeadingIconColor;
        }
        if ((i2 + 4096) - (i2 | 4096) != 0) {
            j22 = selectableChipColors.selectedTrailingIconColor;
        }
        long j28 = j16;
        long j29 = j21;
        long j30 = j19;
        long j31 = j18;
        long j32 = j17;
        long j33 = j20;
        return selectableChipColors.m2478copydaRQuJA(j15, j28, j29, j30, j31, j32, j33, j27, j25, j24, j26, j23, j22);
    }

    /* JADX INFO: renamed from: copy-daRQuJA, reason: not valid java name */
    public final SelectableChipColors m2478copydaRQuJA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        long j15 = j2;
        long j16 = j3;
        long j17 = j4;
        long j18 = j5;
        long j19 = j6;
        long j20 = j7;
        long j21 = j8;
        long j22 = j9;
        long j23 = j10;
        long j24 = j11;
        long j25 = j12;
        long j26 = j13;
        long j27 = j14;
        if (j15 == 16) {
            j15 = this.containerColor;
        }
        if (j16 == 16) {
            j16 = this.labelColor;
        }
        if (j17 == 16) {
            j17 = this.leadingIconColor;
        }
        if (j18 == 16) {
            j18 = this.trailingIconColor;
        }
        if (j19 == 16) {
            j19 = this.disabledContainerColor;
        }
        if (j20 == 16) {
            j20 = this.disabledLabelColor;
        }
        if (j21 == 16) {
            j21 = this.disabledLeadingIconColor;
        }
        if (j22 == 16) {
            j22 = this.disabledTrailingIconColor;
        }
        if (j23 == 16) {
            j23 = this.selectedContainerColor;
        }
        if (j24 == 16) {
            j24 = this.disabledSelectedContainerColor;
        }
        if (j25 == 16) {
            j25 = this.selectedLabelColor;
        }
        if (j26 == 16) {
            j26 = this.selectedLeadingIconColor;
        }
        if (j27 == 16) {
            j27 = this.selectedTrailingIconColor;
        }
        return new SelectableChipColors(j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, null);
    }

    /* JADX INFO: renamed from: containerColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2477containerColorWaAFU9c$material3_release(boolean z2, boolean z3) {
        if (!z2) {
            return z3 ? this.disabledSelectedContainerColor : this.disabledContainerColor;
        }
        if (!z3) {
            return this.containerColor;
        }
        return this.selectedContainerColor;
    }

    /* JADX INFO: renamed from: labelColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2479labelColorWaAFU9c$material3_release(boolean z2, boolean z3) {
        if (!z2) {
            return this.disabledLabelColor;
        }
        if (!z3) {
            return this.labelColor;
        }
        return this.selectedLabelColor;
    }

    /* JADX INFO: renamed from: leadingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2480leadingIconContentColorWaAFU9c$material3_release(boolean z2, boolean z3) {
        if (!z2) {
            return this.disabledLeadingIconColor;
        }
        if (!z3) {
            return this.leadingIconColor;
        }
        return this.selectedLeadingIconColor;
    }

    /* JADX INFO: renamed from: trailingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2481trailingIconContentColorWaAFU9c$material3_release(boolean z2, boolean z3) {
        if (!z2) {
            return this.disabledTrailingIconColor;
        }
        if (!z3) {
            return this.trailingIconColor;
        }
        return this.selectedTrailingIconColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SelectableChipColors)) {
            return false;
        }
        SelectableChipColors selectableChipColors = (SelectableChipColors) obj;
        return Color.m4179equalsimpl0(this.containerColor, selectableChipColors.containerColor) && Color.m4179equalsimpl0(this.labelColor, selectableChipColors.labelColor) && Color.m4179equalsimpl0(this.leadingIconColor, selectableChipColors.leadingIconColor) && Color.m4179equalsimpl0(this.trailingIconColor, selectableChipColors.trailingIconColor) && Color.m4179equalsimpl0(this.disabledContainerColor, selectableChipColors.disabledContainerColor) && Color.m4179equalsimpl0(this.disabledLabelColor, selectableChipColors.disabledLabelColor) && Color.m4179equalsimpl0(this.disabledLeadingIconColor, selectableChipColors.disabledLeadingIconColor) && Color.m4179equalsimpl0(this.disabledTrailingIconColor, selectableChipColors.disabledTrailingIconColor) && Color.m4179equalsimpl0(this.selectedContainerColor, selectableChipColors.selectedContainerColor) && Color.m4179equalsimpl0(this.disabledSelectedContainerColor, selectableChipColors.disabledSelectedContainerColor) && Color.m4179equalsimpl0(this.selectedLabelColor, selectableChipColors.selectedLabelColor) && Color.m4179equalsimpl0(this.selectedLeadingIconColor, selectableChipColors.selectedLeadingIconColor) && Color.m4179equalsimpl0(this.selectedTrailingIconColor, selectableChipColors.selectedTrailingIconColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((Color.m4185hashCodeimpl(this.containerColor) * 31) + Color.m4185hashCodeimpl(this.labelColor)) * 31) + Color.m4185hashCodeimpl(this.leadingIconColor)) * 31) + Color.m4185hashCodeimpl(this.trailingIconColor)) * 31) + Color.m4185hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m4185hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m4185hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m4185hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m4185hashCodeimpl(this.selectedContainerColor)) * 31) + Color.m4185hashCodeimpl(this.disabledSelectedContainerColor)) * 31) + Color.m4185hashCodeimpl(this.selectedLabelColor)) * 31) + Color.m4185hashCodeimpl(this.selectedLeadingIconColor)) * 31) + Color.m4185hashCodeimpl(this.selectedTrailingIconColor);
    }
}
