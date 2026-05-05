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
/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4N\u0007\":\u001b\u007f\u0007ljA0RkP\u008cXX@ş\u001c{b#\u001cG\u0002GIU2}P\n_Rui\u0007J\t\fS\u0013\u0014\u0019\u0011jZJe|k\u0016'2ppУ7M}B\u0002\u0017\u0003B\u001d `Ĳh\u007f\u000b\u0001(*`\u0010%{sQ\u0012\u0012>B\t:\u0001\u000e}\u000b \u0012\u0014A8\u0001L]\u0018T<HzaR/Q\u0004\u07bcA÷Ϯc2\u0003Z\u001bT\u001d8\u001b\u0006y\u001eYPg;#6k\u0005\u001dQ\n>Iӡq\u0006\u000bv9?+w\u0007\u001eJ)\u0017\"\u0019CO;^ů%ؘ՝P_В+3WcYX&*}\u0001\n\u0014\r\u001b\u001c\u0006?H\\.ָeڜս2sɤWHX\u0002lJ\u0018|g?%,PJ9;3f\u007fbߛ\u0018\u05cbӒz\u0004ڟ\"+\tn/cl\u0010f\u001f)[Hh?TX=vO͜XƝҠ\u0003oĊ\u00062\f0U\bG}\u00179%,ڞ[B+$qɗdrf~\u0005f\b\u05eemf"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006c)3\\l*At%2X!Er>+#>", "", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX5M1#\u0006\u0005k", "Bhc9X\nH\\(~\u0004m\n\u0007\u00109r", "/bc6b5\u001c]\"\u000ezg;Z\u00136o\r", "uI9\u0017=\u0013D](\u0006~gu\u0002\u001a7/\u00041\u000b@\u000e \u0013N9l<w!E`\r}Av$=ZS9z>+|dn?\u0007p\u0002\u0012g", "5dc\u000eV;B]\"\\\u0005g;|\u0012>C\n/\u0006MHa\u0016\u0019isAf", "u(9", "\u0018", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109rGrz\u0012z|\u001c7", "5dc\u0010b5MS\"\u000eXh3\u0007\u0016v0~yu&\u0006\u0007", "5dc!\\;ESv\t\u0004m,\u0006\u0018\ro\u00072\t\bK\u0016hAU\u0013,", "1n_F", "1n_F 1+Z\n}\u0005h", "uI9\u0017=o%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`Ok\u001d<\u0004)1`Ki$q\u00141<MErC\" Fk@\u0011p:$", "3pd._:", "", "=sW2e", "6`b566=S", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RichTooltipColors {
    public static final int $stable = 0;
    private final long actionContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long titleContentColor;

    public /* synthetic */ RichTooltipColors(long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5);
    }

    private RichTooltipColors(long j2, long j3, long j4, long j5) {
        this.containerColor = j2;
        this.contentColor = j3;
        this.titleContentColor = j4;
        this.actionContentColor = j5;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2417getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m2418getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m2419getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    /* JADX INFO: renamed from: getActionContentColor-0d7_KjU, reason: not valid java name */
    public final long m2416getActionContentColor0d7_KjU() {
        return this.actionContentColor;
    }

    /* JADX INFO: renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ RichTooltipColors m2414copyjRlVdoo$default(RichTooltipColors richTooltipColors, long j2, long j3, long j4, long j5, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            j2 = richTooltipColors.containerColor;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            j3 = richTooltipColors.contentColor;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            j4 = richTooltipColors.titleContentColor;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            j5 = richTooltipColors.actionContentColor;
        }
        return richTooltipColors.m2415copyjRlVdoo(j2, j3, j4, j5);
    }

    /* JADX INFO: renamed from: copy-jRlVdoo, reason: not valid java name */
    public final RichTooltipColors m2415copyjRlVdoo(long j2, long j3, long j4, long j5) {
        long j6 = j2;
        long j7 = j3;
        long j8 = j4;
        long j9 = j5;
        if (j6 == 16) {
            j6 = this.containerColor;
        }
        if (j7 == 16) {
            j7 = this.contentColor;
        }
        if (j8 == 16) {
            j8 = this.titleContentColor;
        }
        if (j9 == 16) {
            j9 = this.actionContentColor;
        }
        return new RichTooltipColors(j6, j7, j8, j9, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTooltipColors)) {
            return false;
        }
        RichTooltipColors richTooltipColors = (RichTooltipColors) obj;
        return Color.m4179equalsimpl0(this.containerColor, richTooltipColors.containerColor) && Color.m4179equalsimpl0(this.contentColor, richTooltipColors.contentColor) && Color.m4179equalsimpl0(this.titleContentColor, richTooltipColors.titleContentColor) && Color.m4179equalsimpl0(this.actionContentColor, richTooltipColors.actionContentColor);
    }

    public int hashCode() {
        return (((((Color.m4185hashCodeimpl(this.containerColor) * 31) + Color.m4185hashCodeimpl(this.contentColor)) * 31) + Color.m4185hashCodeimpl(this.titleContentColor)) * 31) + Color.m4185hashCodeimpl(this.actionContentColor);
    }
}
