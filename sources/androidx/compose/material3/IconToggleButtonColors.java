package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
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
/* JADX INFO: compiled from: IconButton.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4N\u0007\"B\u0012\u007fјnjG9LeN6ZS8\u0015sڔ:)qҕ\"CiTZ12\r]N\u007fg\u001dKj\u000fQ\u0011\u001e\u0016'k<Mc{u\u0012=3RsM7eok:pxD\n82P9\n\t\u000f BH>wټGK\u001a\u0019xc~:j\u0013]\u0007*\u00124?N\u0011N`u_NH\u001boj31\u0016\u0002B|9&/ƊQ\u000fLh5\"?\u0005,-X=E\u00175S1\b\u0001ko\u0007M\u0003U\u0005\u00179W/W\u0007o6\u0007\u0012Z\u0014ۣS\u000fc\t4qM\u001cn#?+}Ҫ{V\u0014(\u0006z\u0014\rj\u0005>\f-H</2f6\u000fczxSNS\u001a^p\u0001+g<\u00173\u0004K+g\u001c\u0017Wg;'SO{3\u000eN)\u0007n/al\u000e\u000f\u0016ŊSȭΦ5SFUVgRjK\b\u001cp\u0011\u0014Z\n>b\u00181\u0012\u0010\\\u0016kڲ[\u0002)/\b\u001aHr\u0005=\u00191\u007fanjHn#Ļ\u0015ճӠ\b\u000bʑHl\rk^^p.\u0017U*]W\u0015\u0016\u00198\\&=Ȓ$ī̓NgȬnUe\n39~9_yy\u0017(Pl3MQ\u0012\u0011ҙQΘޖ>;И\t`nBa\u0016r^..@Q;'\u0006}\\N:\u0014֮>ڤ̂3+֞\u001dd\u001dH\u0011(ZC\u0003\u0016mc9'\rWK$1j̾sէˏO[ʼso\u0001I:\u0007x$3O_>i=c&\u00014+$ʍ}͞ŋFf֙KTt\u0016\u0004_\u0014\"\u001c)GZȀ=\u001c\u0017\u0002/ɧ\u001e[DTrkp̐\u0016E"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006Z#?bl*9o\u001d.*SJz>'rrhC\u0014q\u0002", "", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX5M1#\u0006\u0005k", "2hb.U3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "2hb.U3>Rv\t\u0004m,\u0006\u0018\ro\u00072\t", "1gT0^,=1#\b\nZ0\u0006\t<C\n/\u0006M", "1gT0^,=1#\b\n^5\ff9l\n5", "uI9\u0017=\u0011#:\u001f\t\ne0\u0006R4v\bq\u007fI\u0010\u0017$Pk\u0015\u0006U%6U\u000e'FK 7[RH{2-\u001fuI5\u0014i,[Lj8", "5dc\u0010[,<Y\u0019}Xh5\f\u00053n\u007f5YJ\b!$\u000f:\r\u000ep\u000b:I", "u(9", "\u0018", "5dc\u0010[,<Y\u0019}Xh5\f\t8t]2\u0003J\u000e^aFA\b\"{\u0015", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109rGrz\u0012z|\u001c7", "5dc\u0010b5MS\"\u000eXh3\u0007\u0016v0~yu&\u0006\u0007", "5dc\u0011\\::P ~y<6\u0006\u0018+i\t(\t\u001e\u000b\u001e!T7X;H\u001f\u001b^m", "5dc\u0011\\::P ~y<6\u0006\u0018/n\u000f\u0006\u0006G\u000b$^\u0012n_6\\*%", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "3mP/_,=", "", "1gT0^,=", "1n]AT0GS&\\\u0005e6\nG7a\u000f(\tD|\u001edA|\u000eCv!CY", "uYI\u0019T5=`#\u0003yquz\u00137p\n6{\n\u000e' Vs\u0016<@\u0003?a\t*Em#\u00041\u0007\"g=\u001d\"re8\u001a-*X~2QZNuib{L\u0018\u001aZW<:\t\u0014Y\u0017", "1n]AX5M1#\u0006\u0005kj\u0005\u0005>e\r,wGN\u0011$Gv\u000e8\u0005%", "1n_F", "1n_F ;'Aeq\u0001J", "uI9\u0017=\u0011#\u0017\u007fz\u0004]9\u0007\r.xI&\u0006H\f!%G9\u00168\u0006%B]y'\u00057y,WL*u6 \u001ch>I\u0016r6WT1NV[:2", "3pd._:", "=sW2e", "6`b566=S", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class IconToggleButtonColors {
    public static final int $stable = 0;
    private final long checkedContainerColor;
    private final long checkedContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    public /* synthetic */ IconToggleButtonColors(long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7);
    }

    private IconToggleButtonColors(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.containerColor = j2;
        this.contentColor = j3;
        this.disabledContainerColor = j4;
        this.disabledContentColor = j5;
        this.checkedContainerColor = j6;
        this.checkedContentColor = j7;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2175getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m2176getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2177getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name */
    public final long m2178getDisabledContentColor0d7_KjU() {
        return this.disabledContentColor;
    }

    /* JADX INFO: renamed from: getCheckedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2173getCheckedContainerColor0d7_KjU() {
        return this.checkedContainerColor;
    }

    /* JADX INFO: renamed from: getCheckedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2174getCheckedContentColor0d7_KjU() {
        return this.checkedContentColor;
    }

    /* JADX INFO: renamed from: copy-tNS2XkQ$default, reason: not valid java name */
    public static /* synthetic */ IconToggleButtonColors m2171copytNS2XkQ$default(IconToggleButtonColors iconToggleButtonColors, long j2, long j3, long j4, long j5, long j6, long j7, int i2, Object obj) {
        if ((1 & i2) != 0) {
            j2 = iconToggleButtonColors.containerColor;
        }
        if ((2 & i2) != 0) {
            j3 = iconToggleButtonColors.contentColor;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            j4 = iconToggleButtonColors.disabledContainerColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            j5 = iconToggleButtonColors.disabledContentColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            j6 = iconToggleButtonColors.checkedContainerColor;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            j7 = iconToggleButtonColors.checkedContentColor;
        }
        return iconToggleButtonColors.m2172copytNS2XkQ(j2, j3, j4, j5, j6, j7);
    }

    /* JADX INFO: renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final IconToggleButtonColors m2172copytNS2XkQ(long j2, long j3, long j4, long j5, long j6, long j7) {
        long j8 = j2;
        long j9 = j3;
        long j10 = j4;
        long j11 = j5;
        long j12 = j6;
        long j13 = j7;
        if (j8 == 16) {
            j8 = this.containerColor;
        }
        if (j9 == 16) {
            j9 = this.contentColor;
        }
        if (j10 == 16) {
            j10 = this.disabledContainerColor;
        }
        if (j11 == 16) {
            j11 = this.disabledContentColor;
        }
        if (j12 == 16) {
            j12 = this.checkedContainerColor;
        }
        if (j13 == 16) {
            j13 = this.checkedContentColor;
        }
        return new IconToggleButtonColors(j8, j9, j10, j11, j12, j13, null);
    }

    public final State<Color> containerColor$material3_release(boolean z2, boolean z3, Composer composer, int i2) {
        long j2;
        ComposerKt.sourceInformationMarkerStart(composer, 1175394478, "C(containerColor)P(1)1246@57659L28:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1175394478, i2, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:1239)");
        }
        if (!z2) {
            j2 = this.disabledContainerColor;
        } else if (!z3) {
            j2 = this.containerColor;
        } else {
            j2 = this.checkedContainerColor;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4168boximpl(j2), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateRememberUpdatedState;
    }

    public final State<Color> contentColor$material3_release(boolean z2, boolean z3, Composer composer, int i2) {
        long j2;
        ComposerKt.sourceInformationMarkerStart(composer, 1340854054, "C(contentColor)P(1)1263@58229L28:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1340854054, i2, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:1256)");
        }
        if (!z2) {
            j2 = this.disabledContentColor;
        } else if (!z3) {
            j2 = this.contentColor;
        } else {
            j2 = this.checkedContentColor;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4168boximpl(j2), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateRememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IconToggleButtonColors)) {
            return false;
        }
        IconToggleButtonColors iconToggleButtonColors = (IconToggleButtonColors) obj;
        return Color.m4179equalsimpl0(this.containerColor, iconToggleButtonColors.containerColor) && Color.m4179equalsimpl0(this.contentColor, iconToggleButtonColors.contentColor) && Color.m4179equalsimpl0(this.disabledContainerColor, iconToggleButtonColors.disabledContainerColor) && Color.m4179equalsimpl0(this.disabledContentColor, iconToggleButtonColors.disabledContentColor) && Color.m4179equalsimpl0(this.checkedContainerColor, iconToggleButtonColors.checkedContainerColor) && Color.m4179equalsimpl0(this.checkedContentColor, iconToggleButtonColors.checkedContentColor);
    }

    public int hashCode() {
        return (((((((((Color.m4185hashCodeimpl(this.containerColor) * 31) + Color.m4185hashCodeimpl(this.contentColor)) * 31) + Color.m4185hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m4185hashCodeimpl(this.disabledContentColor)) * 31) + Color.m4185hashCodeimpl(this.checkedContainerColor)) * 31) + Color.m4185hashCodeimpl(this.checkedContentColor);
    }
}
