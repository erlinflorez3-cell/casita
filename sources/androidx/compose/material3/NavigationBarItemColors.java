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
/* JADX INFO: compiled from: NavigationBar.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4V\u0007\":\u001b\u007f\u0007ljA0RkP.XY0\u0014\u0002ڔd$\n#2~KY(}:\t}Owk|Lr\u000bq\u0010\u0016\u001a\u0007mDI\u0004ym\u0016\u001d6Zom4]sK>xtd\u0006060>\u0012\u0005/\u001b:L\u001e}\u0013Cy\rܘ4@~B\u001ba[\u00192\u00124̄P\u0007$\\uNNH\u001b^j5)\u0003wDf'\u000e1-S\u0013Fb*%v\u0010\u001f[F=5#)k\u00035S\fE\t?\u007fB\u001dhU([OyWD^\u0018\u0014C,\u007f\u0013cr4c\u001dQ\u000f\r̥*ՒӍOR\u0014=\u0006\u0011D\u001eJ\u001b&\u0006U`^3(\u007f \u0010Is!R\u0007Ч\u0002'H\u000e\u0015y6E@FGs\\)\u0003iai\u001a~;\n\"%\u001eQ\u0019\u001f%ir&`C3\u001bvϼ0Pή<ʰݳ\u000e[C\r\u0012\u0011+%8%HG.0,\u0015<4=7\nQS%y `D\u0016\u000fK_ŞRh˦G̱ؗr\u0018=L\u0017,+[r\u000b\u0004P\u0003Yą\u0010۳ʵS\u0006ą\f\u001b(\\\u0006G9'\u0016W]r:\u0002[d\"%]gǶXʤā\rVߍb;=Qq\u001byT| MF3\u001dfsZS:[\u0013fxöJғ\u000fǮմCMܟ\u00176Ws\"B:;is#H\u001b\u001epBԊ\bݠ̬g\u000fњX;,\u0003w/\r\u000b\u0007_jz@~\u0007LD|\u000f#Ѓ@ٛۺ\u0018%Ɓ&p<|1\u0012\u0017u\u0006WuV\u0018cz\u0018\u000eU*!ۿ\u0019ߙؐ.<т\u0013\u000712\u00108]Nxv_Wb>\t\u0001\u0012\u000fiiؤfōзo+߯nRWT%-\u000f`x5\u0016nP\u0011oK\u0013G\u0012U¤ZŬЭq\u0002ʾ@V@|\u0013*6'\u0007\u00030\u0007މ-L/ \u001c߲0]\u0014i]o\u000fЬ}\u0006"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006_!F]\u007f\u001cFq 7*?HOC\u001e\u001dFk@\u0011p:$", "", "Ad[2V;>R||\u0005g\n\u0007\u00109r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Ad[2V;>R\b~\u000em\n\u0007\u00109r", "Ad[2V;>R|\byb*x\u00189r]2\u0003J\u000e", "Cmb2_,<b\u0019}^\\6\u0006f9l\n5", "Cmb2_,<b\u0019}i^?\ff9l\n5", "2hb.U3>R||\u0005g\n\u0007\u00109r", "2hb.U3>R\b~\u000em\n\u0007\u00109r", "uI9\u0017=\u0011#8\u007f\u0005\u0005m3\u0001\u0012xj\u00110ED\n&\u0017Tx\nC@\u00045Zy0>|s8VQJxD\u001c$rn!\u0003p2N\u0004|\u000b=", "5dc\u0011\\::P ~yB*\u0007\u0012\ro\u00072\t\bK\u0016hAU\u0013,", "u(9", "\u0018", "5dc\u0011\\::P ~yM,\u0010\u0018\ro\u00072\t\bK\u0016hAU\u0013,", "7mS6V(M]&\\\u0005e6\n", "5dc\u0016a+BQ\u0015\u000e\u0005k\n\u0007\u00109rGrz\u0012z|\u001c7.\u00168\u0006%B]y'\u0005g#.TC7y4", "5dc X3>Q(~yB*\u0007\u0012\ro\u00072\t\bK\u0016hAU\u0013,", "5dc X3>Q(~yB5{\r-a\u000f2\t\u001e\u000b\u001e!T7X;H\u001f\u001b^m", "5dc X3>Q(~yM,\u0010\u0018\ro\u00072\t\bK\u0016hAU\u0013,", "5dc\"a:>Z\u0019|\n^+`\u00079n]2\u0003J\u000e^aFA\b\"{\u0015", "5dc\"a:>Z\u0019|\n^+k\tBt]2\u0003J\u000e^aFA\b\"{\u0015", "1n_F", "1n_F z#[\u0017\ra-", "uI9\u0017=\u0011#8\\evg+\n\u00133d\u0013qyJ\t\"!UoWDr45f\u0002\u001c>;_\u0017IT?m0-\u0019rj\u0016\u0003p\u0010]v/%VU6i`H", "3pd._:", "", "=sW2e", "6`b566=S", "", "7b^;66E]&", "Ad[2V;>R", "3mP/_,=", "7b^;66E]&FlZ\b]x\u0003c>0wO\u0001$\u001bCv[6\u0004%<Yy.7", "uYIu=", "BdgA66E]&", "BdgA66E]&FlZ\b]x\u0003c>0wO\u0001$\u001bCv[6\u0004%<Yy.7", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class NavigationBarItemColors {
    public static final int $stable = 0;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long selectedIconColor;
    private final long selectedIndicatorColor;
    private final long selectedTextColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    public /* synthetic */ NavigationBarItemColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8);
    }

    private NavigationBarItemColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.selectedIconColor = j2;
        this.selectedTextColor = j3;
        this.selectedIndicatorColor = j4;
        this.unselectedIconColor = j5;
        this.unselectedTextColor = j6;
        this.disabledIconColor = j7;
        this.disabledTextColor = j8;
    }

    /* JADX INFO: renamed from: getSelectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2282getSelectedIconColor0d7_KjU() {
        return this.selectedIconColor;
    }

    /* JADX INFO: renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2284getSelectedTextColor0d7_KjU() {
        return this.selectedTextColor;
    }

    /* JADX INFO: renamed from: getSelectedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2283getSelectedIndicatorColor0d7_KjU() {
        return this.selectedIndicatorColor;
    }

    /* JADX INFO: renamed from: getUnselectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2285getUnselectedIconColor0d7_KjU() {
        return this.unselectedIconColor;
    }

    /* JADX INFO: renamed from: getUnselectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2286getUnselectedTextColor0d7_KjU() {
        return this.unselectedTextColor;
    }

    /* JADX INFO: renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m2279getDisabledIconColor0d7_KjU() {
        return this.disabledIconColor;
    }

    /* JADX INFO: renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m2280getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* JADX INFO: renamed from: copy-4JmcsL4$default, reason: not valid java name */
    public static /* synthetic */ NavigationBarItemColors m2277copy4JmcsL4$default(NavigationBarItemColors navigationBarItemColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            j2 = navigationBarItemColors.selectedIconColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j3 = navigationBarItemColors.selectedTextColor;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            j4 = navigationBarItemColors.selectedIndicatorColor;
        }
        if ((i2 & 8) != 0) {
            j5 = navigationBarItemColors.unselectedIconColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            j6 = navigationBarItemColors.unselectedTextColor;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            j7 = navigationBarItemColors.disabledIconColor;
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            j8 = navigationBarItemColors.disabledTextColor;
        }
        return navigationBarItemColors.m2278copy4JmcsL4(j2, j3, j4, j5, j6, j7, j8);
    }

    /* JADX INFO: renamed from: copy-4JmcsL4, reason: not valid java name */
    public final NavigationBarItemColors m2278copy4JmcsL4(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        long j9 = j2;
        long j10 = j3;
        long j11 = j4;
        long j12 = j5;
        long j13 = j6;
        long j14 = j7;
        long j15 = j8;
        if (j9 == 16) {
            j9 = this.selectedIconColor;
        }
        if (j10 == 16) {
            j10 = this.selectedTextColor;
        }
        if (j11 == 16) {
            j11 = this.selectedIndicatorColor;
        }
        if (j12 == 16) {
            j12 = this.unselectedIconColor;
        }
        if (j13 == 16) {
            j13 = this.unselectedTextColor;
        }
        if (j14 == 16) {
            j14 = this.disabledIconColor;
        }
        if (j15 == 16) {
            j15 = this.disabledTextColor;
        }
        return new NavigationBarItemColors(j9, j10, j11, j12, j13, j14, j15, null);
    }

    /* JADX INFO: renamed from: iconColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2287iconColorWaAFU9c$material3_release(boolean z2, boolean z3) {
        if (!z3) {
            return this.disabledIconColor;
        }
        if (z2) {
            return this.selectedIconColor;
        }
        return this.unselectedIconColor;
    }

    /* JADX INFO: renamed from: textColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2288textColorWaAFU9c$material3_release(boolean z2, boolean z3) {
        if (!z3) {
            return this.disabledTextColor;
        }
        if (z2) {
            return this.selectedTextColor;
        }
        return this.unselectedTextColor;
    }

    /* JADX INFO: renamed from: getIndicatorColor-0d7_KjU$material3_release, reason: not valid java name */
    public final long m2281getIndicatorColor0d7_KjU$material3_release() {
        return this.selectedIndicatorColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationBarItemColors)) {
            return false;
        }
        NavigationBarItemColors navigationBarItemColors = (NavigationBarItemColors) obj;
        return Color.m4179equalsimpl0(this.selectedIconColor, navigationBarItemColors.selectedIconColor) && Color.m4179equalsimpl0(this.unselectedIconColor, navigationBarItemColors.unselectedIconColor) && Color.m4179equalsimpl0(this.selectedTextColor, navigationBarItemColors.selectedTextColor) && Color.m4179equalsimpl0(this.unselectedTextColor, navigationBarItemColors.unselectedTextColor) && Color.m4179equalsimpl0(this.selectedIndicatorColor, navigationBarItemColors.selectedIndicatorColor) && Color.m4179equalsimpl0(this.disabledIconColor, navigationBarItemColors.disabledIconColor) && Color.m4179equalsimpl0(this.disabledTextColor, navigationBarItemColors.disabledTextColor);
    }

    public int hashCode() {
        return (((((((((((Color.m4185hashCodeimpl(this.selectedIconColor) * 31) + Color.m4185hashCodeimpl(this.unselectedIconColor)) * 31) + Color.m4185hashCodeimpl(this.selectedTextColor)) * 31) + Color.m4185hashCodeimpl(this.unselectedTextColor)) * 31) + Color.m4185hashCodeimpl(this.selectedIndicatorColor)) * 31) + Color.m4185hashCodeimpl(this.disabledIconColor)) * 31) + Color.m4185hashCodeimpl(this.disabledTextColor);
    }
}
