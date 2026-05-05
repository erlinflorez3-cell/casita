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
/* JADX INFO: compiled from: SegmentedButton.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4\\\u0007\":\u001b\u007f\u0007lvA0RkP\u008cXX@ş\u001c{b#\u001c\b\u0002GIU2}P\n_Rui\u0007J\t\fS\u0013\u0014\u0019\u0011jZJe|k\u0016'2ppO7[tU9\u000fuF\t.8:8(\u0006\u0011\u001e8O(v)D[\u0010 8XphS\u001dQ\u0013#*\u0006l!\u0011\"jqf6vmm>=.\u001bipO7c>\te\rtUܮ\u0011vo+scEQ-%\u0002\u00047Vi\\\u001b? [5l5FCI\"u|Wŕ\u0013\u0014ܹNՕǁv(b%_\u0002TJ9q{K~\u000fX{\t\u0019%<2,6+VME\u001a\u0015&T2иqRŬO\u061cެF\u0002\u0001\u0005D8m#AOQ\u001b\u0015R\u0012?'kO{3+N'\u000f\u00149[\u0003,'\u0014ŊSvϼ0҅͘AJT0g^6\u0557op)B\u0004^Ϛ05\u0002\u0011<\u0017=7\n:S'q\u0002VF\u007fv3a\u0019YoRVC:nD8Z\u000f\u0012ZRh\u001dk~U\t2\u0017M*Y\u001f}6\u0014Pb}</+(N}i\u001apS]\u0018,GfeZ\u001fq\u0014WGfK5\u007fd@gXv\"HTb3Y\u0017HY\fhf@\"`I\u001b\u0016}{RY$\u0013`@\"\":,?%t\u0015v\u0004ەAˆҴ\ra`\u0011\u001e(\u001dD2-\u0002$#'1Vj\u001c\bi\u000fHZ{'Č-\nWCE>UP\u0016z\u0011s\u001e\rv\u0018G\u0016MݺK˾خtTދ$\u001e\"9_?U\u0015\u0015\r7ARDSL\u000be\u007fNʵ&ϕݙx\u000e³l6o\bx\u0001Dbp[]cg9\u0005`\u000b#6eҹxӓĸyFϭX\u0013c>W\u0003\u001b[B`F\fU6,.\u0019oP}߿,ξܨ\u001c\u0015߳\u00187\u001daky\b0\u007fu\u001d5E|\u00123{\u0016\u001ecҌ\\Цק7H˕\u0003F*$z\u0013ZJp\f\u0016QYK\u001b;`A\u0013q\u00817ԇÊ.|֨\u000b4\u0015pdkR\u0015u\u0013B=0A\u0002O\u0016\u0014\rDӒ\u0010\u07bdтflߑOd\u0013J\u001d\u001a#}7\u0005 +\u000e7daz\t^\u0007\u0605\u0017ܽن:aƀ@\u0011,4:L \rIkw\u0015`\u0012\u000eQw\u000fE3÷rĩے\rSܢ`^P\u0005nUx#0\u0019\r\u001e\u00045\u0007;I\u0005\u001cG´.Ѳӛ\u007fR\u009b\r#rO\rv=-JmG*xo\u000f\u000f]]qJϲ5ߤܔ(lÃs\u0014@\u0018\u000b-Z\u001a!S_ 0\u000e>c#U\u0013OѿuԣٟQMĀ-\u0007\u0003|\u001cL\"\u0011\u00114]\u0002źb6TQ}̡_H\u007f\u001fD/&҂\u0001\u0012"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%7a})Fm\u0015\u000b]RJu={\u001fokF\u00159", "", "/bc6i,\u001c]\"\u000evb5|\u0016\ro\u00072\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "/bc6i,\u001c]\"\u000ezg;Z\u00136o\r", "/bc6i,\u001b]&}zk\n\u0007\u00109r", "7mP0g0OSv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "7mP0g0OSv\t\u0004m,\u0006\u0018\ro\u00072\t", "7mP0g0OSu\t\b],\nf9l\n5", "2hb.U3>Rt|\nb=|f9n\u000f$\u007fI\u0001$tQv\u0018I", "2hb.U3>Rt|\nb=|f9n\u000f(\u0005O^!\u001eQ|", "2hb.U3>Rt|\nb=|e9r~(\t\u001e\u000b\u001e!T", "2hb.U3>R|\bv\\;\u0001\u001a/C\n1\u000b<\u0005 \u0017TM\u0018C\u00012", "2hb.U3>R|\bv\\;\u0001\u001a/C\n1\u000b@\n&tQv\u0018I", "2hb.U3>R|\bv\\;\u0001\u001a/B\n5z@\u000et!Ny\u001b", "uI9\u0017=\u0011#8}c_C\u0011c\u000f9t\u0007,\u0005\n\u0006(\u001f\u0011s\u0017Kv2>U\u0005i\u0016m\u0017*]JJI>'#wnI\u0005r6[^#TRN92\u0016c", "5dc\u000eV;Bd\u0019[\u0005k+|\u0016\ro\u00072\t\bK\u0016hAU\u0013,", "u(9", "\u0018", "5dc\u000eV;Bd\u0019\\\u0005g;x\r8e\r\u0006\u0006G\u000b$^\u0012n_6\\*%", "5dc\u000eV;Bd\u0019\\\u0005g;|\u0012>C\n/\u0006MHa\u0016\u0019isAf", "5dc\u0011\\::P ~y:*\f\r@e\\2\t?\u0001$tQv\u0018I>o4+w\u0006<]", "5dc\u0011\\::P ~y:*\f\r@e]2\u0005O|\u001b G|kF}/B!H\u001f\tg{3=", "5dc\u0011\\::P ~y:*\f\r@e]2\u0005O\u0001 &%y\u0015F\u0004l\u007fXO\u001a\u001dr\u0006", "5dc\u0011\\::P ~yB5x\u0007>i\u0011(XJ\u000e\u0016\u0017TM\u0018C\u00012|$|q1S\u001b\u001e", "5dc\u0011\\::P ~yB5x\u0007>i\u0011(YJ\n&\u0013Kx\u000eIT/<c\u000bg\u0002lg(3H+", "5dc\u0011\\::P ~yB5x\u0007>i\u0011(YJ\n&\u0017P~kF}/B!H\u001f\tg{3=", "5dc\u0016a(<b\u001d\u0010z;6\n\b/r]2\u0003J\u000e^aFA\b\"{\u0015", "5dc\u0016a(<b\u001d\u0010z<6\u0006\u0018+i\t(\t\u001e\u000b\u001e!T7X;H\u001f\u001b^m", "5dc\u0016a(<b\u001d\u0010z<6\u0006\u0018/n\u000f\u0006\u0006G\u000b$^\u0012n_6\\*%", "0na1X9\u001c] \t\b", "3mP/_,=", "", "/bc6i,", "0na1X9\u001c] \t\b&\u001exd\u0010US&:H|&\u0017Ts\nCD\u001fBY\u0005 3{\u0016", "uYIu=", "1n]AT0GS&\\\u0005e6\n", "1n]AT0GS&\\\u0005e6\nP!a[\tk\u0014~U\u001fC~\u000eIz!<'w-7t\u0016*[C", "1n]AX5M1#\u0006\u0005k", "1gT0^,=", "1n]AX5M1#\u0006\u0005ksn\u0005\u000bFo{y~\t\u0013&G|\u00128}r/f}'7i$.", "1n_F", "1n_F xJH\u0002q\u00101", "uI9\u0017=\u0011#8}c_C\u0011@o+n~5\u0006D\u007f*`Ey\u0016G\u000135#\u0006\u001cFm#2IJ\t5\"\u001e\u0017paB\u0016c++\u00076VVW\nfY|J\"g", "3pd._:", "=sW2e", "6`b566=S", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SegmentedButtonColors {
    public static final int $stable = 0;
    private final long activeBorderColor;
    private final long activeContainerColor;
    private final long activeContentColor;
    private final long disabledActiveBorderColor;
    private final long disabledActiveContainerColor;
    private final long disabledActiveContentColor;
    private final long disabledInactiveBorderColor;
    private final long disabledInactiveContainerColor;
    private final long disabledInactiveContentColor;
    private final long inactiveBorderColor;
    private final long inactiveContainerColor;
    private final long inactiveContentColor;

    public /* synthetic */ SegmentedButtonColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13);
    }

    private SegmentedButtonColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.activeContainerColor = j2;
        this.activeContentColor = j3;
        this.activeBorderColor = j4;
        this.inactiveContainerColor = j5;
        this.inactiveContentColor = j6;
        this.inactiveBorderColor = j7;
        this.disabledActiveContainerColor = j8;
        this.disabledActiveContentColor = j9;
        this.disabledActiveBorderColor = j10;
        this.disabledInactiveContainerColor = j11;
        this.disabledInactiveContentColor = j12;
        this.disabledInactiveBorderColor = j13;
    }

    /* JADX INFO: renamed from: getActiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2457getActiveContainerColor0d7_KjU() {
        return this.activeContainerColor;
    }

    /* JADX INFO: renamed from: getActiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m2458getActiveContentColor0d7_KjU() {
        return this.activeContentColor;
    }

    /* JADX INFO: renamed from: getActiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2456getActiveBorderColor0d7_KjU() {
        return this.activeBorderColor;
    }

    /* JADX INFO: renamed from: getInactiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2466getInactiveContainerColor0d7_KjU() {
        return this.inactiveContainerColor;
    }

    /* JADX INFO: renamed from: getInactiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m2467getInactiveContentColor0d7_KjU() {
        return this.inactiveContentColor;
    }

    /* JADX INFO: renamed from: getInactiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2465getInactiveBorderColor0d7_KjU() {
        return this.inactiveBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledActiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2460getDisabledActiveContainerColor0d7_KjU() {
        return this.disabledActiveContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledActiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m2461getDisabledActiveContentColor0d7_KjU() {
        return this.disabledActiveContentColor;
    }

    /* JADX INFO: renamed from: getDisabledActiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2459getDisabledActiveBorderColor0d7_KjU() {
        return this.disabledActiveBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledInactiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2463getDisabledInactiveContainerColor0d7_KjU() {
        return this.disabledInactiveContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledInactiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m2464getDisabledInactiveContentColor0d7_KjU() {
        return this.disabledInactiveContentColor;
    }

    /* JADX INFO: renamed from: getDisabledInactiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2462getDisabledInactiveBorderColor0d7_KjU() {
        return this.disabledInactiveBorderColor;
    }

    /* JADX INFO: renamed from: copy-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ SegmentedButtonColors m2451copy2qZNXz8$default(SegmentedButtonColors segmentedButtonColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i2, Object obj) {
        long j14 = j3;
        long j15 = j2;
        long j16 = j7;
        long j17 = j6;
        long j18 = j5;
        long j19 = j8;
        long j20 = j4;
        long j21 = j13;
        long j22 = j11;
        long j23 = j10;
        long j24 = j12;
        long j25 = j9;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            j15 = segmentedButtonColors.activeContainerColor;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            j14 = segmentedButtonColors.activeContentColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            j20 = segmentedButtonColors.activeBorderColor;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            j18 = segmentedButtonColors.inactiveContainerColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            j17 = segmentedButtonColors.inactiveContentColor;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            j16 = segmentedButtonColors.inactiveBorderColor;
        }
        if ((i2 & 64) != 0) {
            j19 = segmentedButtonColors.disabledActiveContainerColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            j25 = segmentedButtonColors.disabledActiveContentColor;
        }
        if ((i2 + 256) - (i2 | 256) != 0) {
            j23 = segmentedButtonColors.disabledActiveBorderColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 512)) != 0) {
            j22 = segmentedButtonColors.disabledInactiveContainerColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1024)) != 0) {
            j24 = segmentedButtonColors.disabledInactiveContentColor;
        }
        if ((i2 & 2048) != 0) {
            j21 = segmentedButtonColors.disabledInactiveBorderColor;
        }
        long j26 = j20;
        long j27 = j18;
        long j28 = j17;
        long j29 = j16;
        long j30 = j19;
        return segmentedButtonColors.m2455copy2qZNXz8(j15, j14, j26, j27, j28, j29, j30, j25, j23, j22, j24, j21);
    }

    /* JADX INFO: renamed from: copy-2qZNXz8, reason: not valid java name */
    public final SegmentedButtonColors m2455copy2qZNXz8(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        long j14 = j2;
        long j15 = j3;
        long j16 = j4;
        long j17 = j5;
        long j18 = j6;
        long j19 = j7;
        long j20 = j8;
        long j21 = j9;
        long j22 = j10;
        long j23 = j11;
        long j24 = j12;
        long j25 = j13;
        if (j14 == 16) {
            j14 = this.activeContainerColor;
        }
        if (j15 == 16) {
            j15 = this.activeContentColor;
        }
        if (j16 == 16) {
            j16 = this.activeBorderColor;
        }
        if (j17 == 16) {
            j17 = this.inactiveContainerColor;
        }
        if (j18 == 16) {
            j18 = this.inactiveContentColor;
        }
        if (j19 == 16) {
            j19 = this.inactiveBorderColor;
        }
        if (j20 == 16) {
            j20 = this.disabledActiveContainerColor;
        }
        if (j21 == 16) {
            j21 = this.disabledActiveContentColor;
        }
        if (j22 == 16) {
            j22 = this.disabledActiveBorderColor;
        }
        if (j23 == 16) {
            j23 = this.disabledInactiveContainerColor;
        }
        if (j24 == 16) {
            j24 = this.disabledInactiveContentColor;
        }
        if (j25 == 16) {
            j25 = this.disabledInactiveBorderColor;
        }
        return new SegmentedButtonColors(j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, null);
    }

    /* JADX INFO: renamed from: borderColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2452borderColorWaAFU9c$material3_release(boolean z2, boolean z3) {
        if (!z2 || !z3) {
            if (z2 && !z3) {
                return this.inactiveBorderColor;
            }
            if (!z2 && z3) {
                return this.disabledActiveBorderColor;
            }
            return this.disabledInactiveBorderColor;
        }
        return this.activeBorderColor;
    }

    /* JADX INFO: renamed from: contentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2454contentColorWaAFU9c$material3_release(boolean z2, boolean z3) {
        if (!z2 || !z3) {
            if (z2 && !z3) {
                return this.inactiveContentColor;
            }
            if (!z2 && z3) {
                return this.disabledActiveContentColor;
            }
            return this.disabledInactiveContentColor;
        }
        return this.activeContentColor;
    }

    /* JADX INFO: renamed from: containerColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2453containerColorWaAFU9c$material3_release(boolean z2, boolean z3) {
        if (!z2 || !z3) {
            if (z2 && !z3) {
                return this.inactiveContainerColor;
            }
            if (!z2 && z3) {
                return this.disabledActiveContainerColor;
            }
            return this.disabledInactiveContainerColor;
        }
        return this.activeContainerColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SegmentedButtonColors segmentedButtonColors = (SegmentedButtonColors) obj;
        return Color.m4179equalsimpl0(this.activeBorderColor, segmentedButtonColors.activeBorderColor) && Color.m4179equalsimpl0(this.activeContentColor, segmentedButtonColors.activeContentColor) && Color.m4179equalsimpl0(this.activeContainerColor, segmentedButtonColors.activeContainerColor) && Color.m4179equalsimpl0(this.inactiveBorderColor, segmentedButtonColors.inactiveBorderColor) && Color.m4179equalsimpl0(this.inactiveContentColor, segmentedButtonColors.inactiveContentColor) && Color.m4179equalsimpl0(this.inactiveContainerColor, segmentedButtonColors.inactiveContainerColor) && Color.m4179equalsimpl0(this.disabledActiveBorderColor, segmentedButtonColors.disabledActiveBorderColor) && Color.m4179equalsimpl0(this.disabledActiveContentColor, segmentedButtonColors.disabledActiveContentColor) && Color.m4179equalsimpl0(this.disabledActiveContainerColor, segmentedButtonColors.disabledActiveContainerColor) && Color.m4179equalsimpl0(this.disabledInactiveBorderColor, segmentedButtonColors.disabledInactiveBorderColor) && Color.m4179equalsimpl0(this.disabledInactiveContentColor, segmentedButtonColors.disabledInactiveContentColor) && Color.m4179equalsimpl0(this.disabledInactiveContainerColor, segmentedButtonColors.disabledInactiveContainerColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.m4185hashCodeimpl(this.activeBorderColor) * 31) + Color.m4185hashCodeimpl(this.activeContentColor)) * 31) + Color.m4185hashCodeimpl(this.activeContainerColor)) * 31) + Color.m4185hashCodeimpl(this.inactiveBorderColor)) * 31) + Color.m4185hashCodeimpl(this.inactiveContentColor)) * 31) + Color.m4185hashCodeimpl(this.inactiveContainerColor)) * 31) + Color.m4185hashCodeimpl(this.disabledActiveBorderColor)) * 31) + Color.m4185hashCodeimpl(this.disabledActiveContentColor)) * 31) + Color.m4185hashCodeimpl(this.disabledActiveContainerColor)) * 31) + Color.m4185hashCodeimpl(this.disabledInactiveBorderColor)) * 31) + Color.m4185hashCodeimpl(this.disabledInactiveContentColor)) * 31) + Color.m4185hashCodeimpl(this.disabledInactiveContainerColor);
    }
}
