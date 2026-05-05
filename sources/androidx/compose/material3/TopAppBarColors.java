package androidx.compose.material3;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
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
/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4M\u0007\":\u0017\u007f\u0007lnA0RnP.XS2\u000fy\u0002<řa)\bّkUH|b4_Rug\u0007J\t\fS\u0013\u0014\u0018\u0011jZJe|k\u0015'2ppO7[sU9\u000fuF\t.7:8(\u0006в\u001e*V\u0016?\u0016QK$\u0012^A!>`\u001be\u0005H!L=ơ\u007f\u001dתfޮɇLncJ=4K*P`?_^ŧ}\u0013LT5\r\u000faL,p=;\u00153U\u001b\u0007\u0001\\o\tEqK\b\u0001'U,yy]6f\u0004,\u0015YP=cx&j\ni`:(̼NҪׂT\u0010.\u000b\t\u0010UM\u0012#\u001e'vD] t\u001f&5\u000bq\u0002?\u0017س^\u000b\u0006\tyN\u0017S\u0019y?\n2tVy;GOӒz˜۵\u001d\"ъr)cT\u001ci-\u001dZ~_9\"WKHf\n\b>Ҡ\u0003͏Š\u0001)˙4O\b/\n\u001aF\u0019+AiAs8y\u0005`D\u0016wߌ_åؾhQ͕D*v\u0016E3!\u000e`Or\r<gbZD\u0011{\u001dϺ\u0006âު\u0012\u001fϢ{D)%\u001eWgjov[eZ<=jOY\u001dl\u0085VުՍ24Ʉg\u0018iR\u0005\u001dW>h\u0012fn̾S\u0015b_.ϑNvi\u0018w\u0002c±\u0010-"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/@5\t+\u0014i#\fWJExBs", "", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Aba<_3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "<`e6Z(MW#\b^\\6\u0006f9n\u000f(\u0005O^!\u001eQ|", "Bhc9X\nH\\(~\u0004m\n\u0007\u00109r", "/bc6b5\"Q#\bXh5\f\t8t]2\u0003J\u000e", "uI9\u0017=\u0011%Y#\u000e\u0002b5F\u000e@mI,\u0005O\u0001$ CvW\u001bv&1i\u0005/\u0015w\u001f<\\PKiC(\"P]F\rc9$:\u0018", "5dc\u000eV;B]\"bxh5Z\u00138t\u007f1\u000b\u001e\u000b\u001e!T7X;H\u001f\u001b^m", "u(9", "\u0018", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109rGrz\u0012z|\u001c7", "5dc\u001bT=BU\u0015\u000e~h5`\u00079n]2\u0005O\u0001 &%y\u0015F\u0004l\u007fXO\u001a\u001dr\u0006", "5dc V9HZ ~y<6\u0006\u0018+i\t(\t\u001e\u000b\u001e!T7X;H\u001f\u001b^m", "5dc!\\;ESv\t\u0004m,\u0006\u0018\ro\u00072\t\bK\u0016hAU\u0013,", "1n[<e\u001bKO\"\r~m0\u0007\u0012\u0010r{&\u000bD\u000b ", "", "1n]AT0GS&\\\u0005e6\nP@N\u0013\u0005F\u0011\u0007U\u001fC~\u000eIz!<'w-7t\u0016*[C", "uE\u0018\u0017", "1n_F", "1n_F ;\u000f!hg\u0006p", "uI9\u0017=\u0011\u0002:\u0015\byk6\u0001\bB/}2\u0004K\u000b%\u0017\u0011w\nKv29U\u0005m\u0001\\ 9)NFH0+rrhC\u0014q\u0002", "3pd._:", "", "=sW2e", "6`b566=S", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TopAppBarColors {
    public static final int $stable = 0;
    private final long actionIconContentColor;
    private final long containerColor;
    private final long navigationIconContentColor;
    private final long scrolledContainerColor;
    private final long titleContentColor;

    public /* synthetic */ TopAppBarColors(long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6);
    }

    private TopAppBarColors(long j2, long j3, long j4, long j5, long j6) {
        this.containerColor = j2;
        this.scrolledContainerColor = j3;
        this.navigationIconContentColor = j4;
        this.titleContentColor = j5;
        this.actionIconContentColor = j6;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2870getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getScrolledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2872getScrolledContainerColor0d7_KjU() {
        return this.scrolledContainerColor;
    }

    /* JADX INFO: renamed from: getNavigationIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m2871getNavigationIconContentColor0d7_KjU() {
        return this.navigationIconContentColor;
    }

    /* JADX INFO: renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m2873getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    /* JADX INFO: renamed from: getActionIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m2869getActionIconContentColor0d7_KjU() {
        return this.actionIconContentColor;
    }

    /* JADX INFO: renamed from: copy-t635Npw$default, reason: not valid java name */
    public static /* synthetic */ TopAppBarColors m2866copyt635Npw$default(TopAppBarColors topAppBarColors, long j2, long j3, long j4, long j5, long j6, int i2, Object obj) {
        if ((1 & i2) != 0) {
            j2 = topAppBarColors.containerColor;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            j3 = topAppBarColors.scrolledContainerColor;
        }
        if ((4 & i2) != 0) {
            j4 = topAppBarColors.navigationIconContentColor;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            j5 = topAppBarColors.titleContentColor;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            j6 = topAppBarColors.actionIconContentColor;
        }
        return topAppBarColors.m2868copyt635Npw(j2, j3, j4, j5, j6);
    }

    /* JADX INFO: renamed from: copy-t635Npw, reason: not valid java name */
    public final TopAppBarColors m2868copyt635Npw(long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2;
        long j8 = j3;
        long j9 = j4;
        long j10 = j5;
        long j11 = j6;
        if (j7 == 16) {
            j7 = this.containerColor;
        }
        if (j8 == 16) {
            j8 = this.scrolledContainerColor;
        }
        if (j9 == 16) {
            j9 = this.navigationIconContentColor;
        }
        if (j10 == 16) {
            j10 = this.titleContentColor;
        }
        if (j11 == 16) {
            j11 = this.actionIconContentColor;
        }
        return new TopAppBarColors(j7, j8, j9, j10, j11, null);
    }

    /* JADX INFO: renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2867containerColorvNxB06k$material3_release(float f2) {
        return ColorKt.m4229lerpjxsXWHM(this.containerColor, this.scrolledContainerColor, EasingKt.getFastOutLinearInEasing().transform(f2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TopAppBarColors)) {
            return false;
        }
        TopAppBarColors topAppBarColors = (TopAppBarColors) obj;
        return Color.m4179equalsimpl0(this.containerColor, topAppBarColors.containerColor) && Color.m4179equalsimpl0(this.scrolledContainerColor, topAppBarColors.scrolledContainerColor) && Color.m4179equalsimpl0(this.navigationIconContentColor, topAppBarColors.navigationIconContentColor) && Color.m4179equalsimpl0(this.titleContentColor, topAppBarColors.titleContentColor) && Color.m4179equalsimpl0(this.actionIconContentColor, topAppBarColors.actionIconContentColor);
    }

    public int hashCode() {
        return (((((((Color.m4185hashCodeimpl(this.containerColor) * 31) + Color.m4185hashCodeimpl(this.scrolledContainerColor)) * 31) + Color.m4185hashCodeimpl(this.navigationIconContentColor)) * 31) + Color.m4185hashCodeimpl(this.titleContentColor)) * 31) + Color.m4185hashCodeimpl(this.actionIconContentColor);
    }
}
