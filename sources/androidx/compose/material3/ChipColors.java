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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4S\u0007\":\u001b\u007f\u0007lpA0RkP.XU0\u0014\u0002ڔd$\n#2\u0007KY(}:\t}Owk|Lr\u000bq\u0010\u0016\u001a\u0007mDI\u0004ym\u0016\u001d6Zom4]sK>xtd\u0006060>\u0012\u0005/\u001b:L\u001e}\u0013Cy\r\"4NxRR;Nŋ\u001e\u0012\u0014Gh\u001c,\\\u007fNdI\u001daHC;\u0003\u0018W\u0015&ܸ/{ת\fϿù+\u000f|w,B\t\u0016C-=S1ޗ\u0003aE\u0003MqU\u0005\u0017(W1Ose8p\u007fB\u0016[U\u0013]\u0001)t\u0005\u007fa<-1OqOh\u000eVx+\u0002\u0013<\u0012\u0013\u001e'v/] l\b\u001c9\rr\u0002A\u0001\bdB\u000e\u0002y6E&0919)niai\u001aل6ަ˿\u0011 )\u001a|;$e\u001c{-\u001b\u0003\r\u00027_\\UJd\t\b<4եp+\b8!HG.MB%v239s9Q\"\u001c\u0006VX\u007fv3u/RؘQGڐ!Âގ;,\u000f+h[- ySlXZ\u0012} b\u001b\u0016\bA5#v͌ $ƤMиŹmlS}\u0018<w\u0002E]\u0007k<XibAIic>v\u0019uޖ>;Ѯ\u0004֚ڋFU\u0012{j?rIVj(w*Eā\u000bƎ֮>pʬ849\u0019j!`\u0005$LO\bYvhm(~\u00034˭\u0002ǭ̾s\bɹTdxou\u0005a.\u0003m08\u0012hC\u001f>UPiڍ{Ƚʍ}rõKoTGZx.w[\n.!jP_6U\u0013=\u007fɴ1ĈЈDKȌiYU\u00125\u0007\u0015{\u0015Jv98\u001fxxD`\u0019K؛Sϟɪu]ѓ'\u0010l\u007f\bm^|Msb\u0016,UWt\u001bYjOʹ{þʍ\u001d$˽s*\u00055;O?\u001f\u001c\t\":exkl\b.(cр%۩Ѻ\u0003+І\u001awjQk>S:Ok\rIr;z\u0007ZH\u0019x\u06ddAކϢ\f2ȈElxVFY#1\u0004y\u00157ݻp_c=\u0019̬\u001ab-g*ybΈ\u0018\u0001"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T(9d[*>w#<#", "", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", ":`Q2_\nHZ#\f", ":dP1\\5@7\u0017\t\u0004<6\u0006\u0018/n\u000f\u0006\u0006G\u000b$", "BqP6_0GU||\u0005g\n\u0007\u0012>e\t7YJ\b!$", "2hb.U3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "2hb.U3>R\u007fzw^3Z\u00136o\r", "2hb.U3>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\n&\u0017P~kF}/B", "2hb.U3>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b &Gx\u001d\u001a\u0001,?f", "uI9\u0017=\u0011#8}e\u0001h;\u0004\r8/\u00059\u0004\n\u0005 &G|\u00178}n\u0014Y~\u001cGt%\fWLIzA.\u0013wkFn_9Tv4\u001d\u0010?", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109rGrz\u0012z|\u001c7", "u(9", "\u0018", "5dc\u0011\\::P ~y<6\u0006\u0018+i\t(\t\u001e\u000b\u001e!T7X;H\u001f\u001b^m", "5dc\u0011\\::P ~yE(y\t6C\n/\u0006MHa\u0016\u0019isAf", "5dc\u0011\\::P ~yE,x\b3n\u0002\fyJ\nt!P~\u000eE\u0006\u0003?`\b-~8\u0015\u007fG)@[", "5dc\u0011\\::P ~yM9x\r6i\t*_>\u000b tQx\u001d<\u007f4\u0013c\u0005*D5`-\u001f=!p$", "5dc\u0019T)>Zv\t\u0002h9DS.7y\u000e\u00010", "5dc\u0019X(=W\"\u0001^\\6\u0006f9n\u000f(\u0005O^!\u001eQ|U\u0007uv/?\u0003\u0010", "5dc!e(BZ\u001d\b|B*\u0007\u0012\ro\t7{I\u0010t!Ny\u001b\u0004A$\u0007Sc%'", "3mP/_,=", "", "1n]AT0GS&\\\u0005e6\nP@N\u0013\u0005F\u0011\u0007U\u001fC~\u000eIz!<'w-7t\u0016*[C", "uY\u0018\u0017", "1n_F", "1n_F \r\u001d!+\u000b\u000b\\", "uI9\u0017=\u0011#8}BaZ5{\u00169i~;E>\u000b\u001f\"Q}\u000e\u0006~!DY\u000b$3tcw+F?v\u0012(\u001crnG\\", "3pd._:", "=sW2e", "6`b566=S", "", ":`Q2_\nHZ#\fBo\u0015\u0010ey6\u0006f\u0004<\u0010\u0017$Kk\u0015\np25`}\u001cEm", ":dP1\\5@7\u0017\t\u0004<6\u0006\u0018/n\u000f\u0006\u0006G\u000b$^XX!\u0019Au;\u0018\u0006\u001cFm#2IJ\teA\u001e\u001ch]G\u0007", "BqP6_0GU||\u0005g\n\u0007\u0012>e\t7YJ\b!$\u000f\u0001vOSo\u0006_<(3|\u0016;Q?B9.+\u0015oa5\u0015c", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ChipColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconContentColor;
    private final long disabledTrailingIconContentColor;
    private final long labelColor;
    private final long leadingIconContentColor;
    private final long trailingIconContentColor;

    public /* synthetic */ ChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9);
    }

    private ChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.containerColor = j2;
        this.labelColor = j3;
        this.leadingIconContentColor = j4;
        this.trailingIconContentColor = j5;
        this.disabledContainerColor = j6;
        this.disabledLabelColor = j7;
        this.disabledLeadingIconContentColor = j8;
        this.disabledTrailingIconContentColor = j9;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1874getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getLabelColor-0d7_KjU, reason: not valid java name */
    public final long m1879getLabelColor0d7_KjU() {
        return this.labelColor;
    }

    /* JADX INFO: renamed from: getLeadingIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m1880getLeadingIconContentColor0d7_KjU() {
        return this.leadingIconContentColor;
    }

    /* JADX INFO: renamed from: getTrailingIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m1881getTrailingIconContentColor0d7_KjU() {
        return this.trailingIconContentColor;
    }

    /* JADX INFO: renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1875getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledLabelColor-0d7_KjU, reason: not valid java name */
    public final long m1876getDisabledLabelColor0d7_KjU() {
        return this.disabledLabelColor;
    }

    /* JADX INFO: renamed from: getDisabledLeadingIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m1877getDisabledLeadingIconContentColor0d7_KjU() {
        return this.disabledLeadingIconContentColor;
    }

    /* JADX INFO: renamed from: getDisabledTrailingIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m1878getDisabledTrailingIconContentColor0d7_KjU() {
        return this.disabledTrailingIconContentColor;
    }

    /* JADX INFO: renamed from: copy-FD3wquc$default, reason: not valid java name */
    public static /* synthetic */ ChipColors m1871copyFD3wquc$default(ChipColors chipColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i2, Object obj) {
        long j10 = j2;
        long j11 = j3;
        long j12 = j4;
        long j13 = j5;
        long j14 = j6;
        long j15 = j7;
        long j16 = j8;
        long j17 = j9;
        if ((i2 & 1) != 0) {
            j10 = chipColors.containerColor;
        }
        if ((i2 & 2) != 0) {
            j11 = chipColors.labelColor;
        }
        if ((i2 & 4) != 0) {
            j12 = chipColors.leadingIconContentColor;
        }
        if ((i2 & 8) != 0) {
            j13 = chipColors.trailingIconContentColor;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            j14 = chipColors.disabledContainerColor;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            j15 = chipColors.disabledLabelColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            j16 = chipColors.disabledLeadingIconContentColor;
        }
        if ((i2 & 128) != 0) {
            j17 = chipColors.disabledTrailingIconContentColor;
        }
        return chipColors.m1873copyFD3wquc(j10, j11, j12, j13, j14, j15, j16, j17);
    }

    /* JADX INFO: renamed from: copy-FD3wquc, reason: not valid java name */
    public final ChipColors m1873copyFD3wquc(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        long j10 = j2;
        long j11 = j3;
        long j12 = j4;
        long j13 = j5;
        long j14 = j6;
        long j15 = j7;
        long j16 = j8;
        long j17 = j9;
        if (j10 == 16) {
            j10 = this.containerColor;
        }
        if (j11 == 16) {
            j11 = this.labelColor;
        }
        if (j12 == 16) {
            j12 = this.leadingIconContentColor;
        }
        if (j13 == 16) {
            j13 = this.trailingIconContentColor;
        }
        if (j14 == 16) {
            j14 = this.disabledContainerColor;
        }
        if (j15 == 16) {
            j15 = this.disabledLabelColor;
        }
        if (j16 == 16) {
            j16 = this.disabledLeadingIconContentColor;
        }
        if (j17 == 16) {
            j17 = this.disabledTrailingIconContentColor;
        }
        return new ChipColors(j10, j11, j12, j13, j14, j15, j16, j17, null);
    }

    /* JADX INFO: renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1872containerColorvNxB06k$material3_release(boolean z2) {
        return z2 ? this.containerColor : this.disabledContainerColor;
    }

    /* JADX INFO: renamed from: labelColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1882labelColorvNxB06k$material3_release(boolean z2) {
        return z2 ? this.labelColor : this.disabledLabelColor;
    }

    /* JADX INFO: renamed from: leadingIconContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1883leadingIconContentColorvNxB06k$material3_release(boolean z2) {
        return z2 ? this.leadingIconContentColor : this.disabledLeadingIconContentColor;
    }

    /* JADX INFO: renamed from: trailingIconContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1884trailingIconContentColorvNxB06k$material3_release(boolean z2) {
        return z2 ? this.trailingIconContentColor : this.disabledTrailingIconContentColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipColors)) {
            return false;
        }
        ChipColors chipColors = (ChipColors) obj;
        return Color.m4179equalsimpl0(this.containerColor, chipColors.containerColor) && Color.m4179equalsimpl0(this.labelColor, chipColors.labelColor) && Color.m4179equalsimpl0(this.leadingIconContentColor, chipColors.leadingIconContentColor) && Color.m4179equalsimpl0(this.trailingIconContentColor, chipColors.trailingIconContentColor) && Color.m4179equalsimpl0(this.disabledContainerColor, chipColors.disabledContainerColor) && Color.m4179equalsimpl0(this.disabledLabelColor, chipColors.disabledLabelColor) && Color.m4179equalsimpl0(this.disabledLeadingIconContentColor, chipColors.disabledLeadingIconContentColor) && Color.m4179equalsimpl0(this.disabledTrailingIconContentColor, chipColors.disabledTrailingIconContentColor);
    }

    public int hashCode() {
        return (((((((((((((Color.m4185hashCodeimpl(this.containerColor) * 31) + Color.m4185hashCodeimpl(this.labelColor)) * 31) + Color.m4185hashCodeimpl(this.leadingIconContentColor)) * 31) + Color.m4185hashCodeimpl(this.trailingIconContentColor)) * 31) + Color.m4185hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m4185hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m4185hashCodeimpl(this.disabledLeadingIconContentColor)) * 31) + Color.m4185hashCodeimpl(this.disabledTrailingIconContentColor);
    }
}
