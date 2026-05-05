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
/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4S\u0007\"B\u0012\u007fјnjG9LeN0ZS8şsڔ<$i*yCAV }8ޛ\u007fN\u0016f/\u000ej\u000fQ\u000f\u001e\u0016'k<Mczu\u0012=3RsM6eok:pxD\t82P9\n\t\u000f\u001fBH>w\u000bGY\u0012*0nqJV\u001bT\u001d\u001a@\u0007N$\u000f&tg|7Ղp]H8k\u001cwVf-o2\rM;G\u0003<=zo4C@eL[:٨\u0007\u0007`s\b\u001cM\u000bU\u000bx)7+wt\u0006K\t\u0004\"+CO;t9;ػ\tQn$o<]}cP<?(\u0001\n(T\u0006$\u0005Udtƽ\u001a/\u000e\u001cP\rr\u0002^\u0017\u0016'[\u000e\u001ay<''\u00103Y:I{\u0002eI/f7*\u001cS3ţ\u0005n/s\u001d'n53Z\bSAQn>vc:]K\u0004\u001cp\u0011\u0019p\u0019ΥK\u007f=\u0014aE%,O[g$ޢjȵӿCfЛ\thpSw^`B(x$Bz \u001a_\\d3lĥSАą\u0010LɟX\u000f\u0006\b!,tyB.3\u001b\u001ffvi\u0003M\f\u000bˑ.ωǶXm«\u0012_A^AAie\u0016o`\u0002dVJe\u001dX\u0015CϦ\u000bȗۛ'!ĘLr\u0018w\nPf\u000e\u0019AM|lK:91\\CIԊ\u001dՓ̿{\bރ^p\u0018~b?<\u0005o4\u0003\u0014Qgjv\bg'Jڌ{ʠŮ,@پ9!.U0tL~)\u0018\r~P^uN_L\u001b\u0017çTݨĆ\u0015\u0019\u07fcU7E\u0013\u001d\u000bA4\b?SWC|_Q*')}ʣ\u000e\u0090ŕ-fŰnx4`xVgV\u001d5\u0005iг#\u0011l\u0003\u007fӵb)FkT\u0011zƕM\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U%6U\u000e'FL#*_CHOC\u001e\u001dv?C\u000em9$", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006_!F]\u007f\u001cFq 7,P7}4+xwaAdm3X\u00045\u001d", "Ad[2V;>R||\u0005g\n\u0007\u00109r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Cmb2_,<b\u0019}^\\6\u0006f9l\n5", "Ad[2V;>R\b~\u000em\n\u0007\u00109r", "Cmb2_,<b\u0019}i^?\ff9l\n5", "Ad[2V;>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "Cmb2_,<b\u0019}Xh5\f\u00053n\u007f5YJ\b!$", "Ad[2V;>Ruzy`,Z\u00136o\r", "Cmb2_,<b\u0019}WZ+~\t\ro\u00072\t", "uI9\u0017=\u0011#8}e\u0001h;\u0004\r8/\u00059\u0004\n\u0005 &G|\u00178}n\u0014Y~\u001cGt%\fWLIzA.\u0013wkFn_9Tv4\u001d\u0010?", "5dc X3>Q(~y;({\u000b/C\n/\u0006MHa\u0016\u0019isAf", "u(9", "\u0018", "5dc X3>Q(~y<6\u0006\u0018+i\t(\t\u001e\u000b\u001e!T7X;H\u001f\u001b^m", "5dc X3>Q(~yB*\u0007\u0012\ro\u00072\t\bK\u0016hAU\u0013,", "5dc X3>Q(~yM,\u0010\u0018\ro\u00072\t\bK\u0016hAU\u0013,", "5dc\"a:>Z\u0019|\n^+Y\u0005.g\u007f\u0006\u0006G\u000b$^\u0012n_6\\*%", "5dc\"a:>Z\u0019|\n^+Z\u00138t{,\u0005@\u000et!Ny\u001b\u0004A$\u0007Sc%'", "5dc\"a:>Z\u0019|\n^+`\u00079n]2\u0003J\u000e^aFA\b\"{\u0015", "5dc\"a:>Z\u0019|\n^+k\tBt]2\u0003J\u000e^aFA\b\"{\u0015", "0`S4X\nHZ#\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "Ad[2V;>R", "", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zk\u0012\u0011*7t3+\u001fl`LPa6V\u00021UL\u00189l[\u0002A\u001c\u0012${]'\u001c\u0005/", "1n]AT0GS&\\\u0005e6\n", "3pd._:", "=sW2e", "", "6`b566=S", "", "7b^;66E]&", "BdgA66E]&", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class DefaultDrawerItemsColor implements NavigationDrawerItemColors {
    private final long selectedBadgeColor;
    private final long selectedContainerColor;
    private final long selectedIconColor;
    private final long selectedTextColor;
    private final long unselectedBadgeColor;
    private final long unselectedContainerColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    public /* synthetic */ DefaultDrawerItemsColor(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9);
    }

    private DefaultDrawerItemsColor(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.selectedIconColor = j2;
        this.unselectedIconColor = j3;
        this.selectedTextColor = j4;
        this.unselectedTextColor = j5;
        this.selectedContainerColor = j6;
        this.unselectedContainerColor = j7;
        this.selectedBadgeColor = j8;
        this.unselectedBadgeColor = j9;
    }

    /* JADX INFO: renamed from: getSelectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2072getSelectedIconColor0d7_KjU() {
        return this.selectedIconColor;
    }

    /* JADX INFO: renamed from: getUnselectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2076getUnselectedIconColor0d7_KjU() {
        return this.unselectedIconColor;
    }

    /* JADX INFO: renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2073getSelectedTextColor0d7_KjU() {
        return this.selectedTextColor;
    }

    /* JADX INFO: renamed from: getUnselectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2077getUnselectedTextColor0d7_KjU() {
        return this.unselectedTextColor;
    }

    /* JADX INFO: renamed from: getSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2071getSelectedContainerColor0d7_KjU() {
        return this.selectedContainerColor;
    }

    /* JADX INFO: renamed from: getUnselectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2075getUnselectedContainerColor0d7_KjU() {
        return this.unselectedContainerColor;
    }

    /* JADX INFO: renamed from: getSelectedBadgeColor-0d7_KjU, reason: not valid java name */
    public final long m2070getSelectedBadgeColor0d7_KjU() {
        return this.selectedBadgeColor;
    }

    /* JADX INFO: renamed from: getUnselectedBadgeColor-0d7_KjU, reason: not valid java name */
    public final long m2074getUnselectedBadgeColor0d7_KjU() {
        return this.unselectedBadgeColor;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State<Color> iconColor(boolean z2, Composer composer, int i2) {
        composer.startReplaceGroup(1141354218);
        ComposerKt.sourceInformation(composer, "C(iconColor)1090@44743L78:NavigationDrawer.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1141354218, i2, -1, "androidx.compose.material3.DefaultDrawerItemsColor.iconColor (NavigationDrawer.kt:1089)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4168boximpl(z2 ? this.selectedIconColor : this.unselectedIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State<Color> textColor(boolean z2, Composer composer, int i2) {
        composer.startReplaceGroup(1275109558);
        ComposerKt.sourceInformation(composer, "C(textColor)1095@44922L78:NavigationDrawer.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1275109558, i2, -1, "androidx.compose.material3.DefaultDrawerItemsColor.textColor (NavigationDrawer.kt:1094)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4168boximpl(z2 ? this.selectedTextColor : this.unselectedTextColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State<Color> containerColor(boolean z2, Composer composer, int i2) {
        composer.startReplaceGroup(-433512770);
        ComposerKt.sourceInformation(composer, "C(containerColor)1100@45106L110:NavigationDrawer.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-433512770, i2, -1, "androidx.compose.material3.DefaultDrawerItemsColor.containerColor (NavigationDrawer.kt:1099)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4168boximpl(z2 ? this.selectedContainerColor : this.unselectedContainerColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State<Color> badgeColor(boolean z2, Composer composer, int i2) {
        composer.startReplaceGroup(-561675044);
        ComposerKt.sourceInformation(composer, "C(badgeColor)1107@45318L80:NavigationDrawer.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-561675044, i2, -1, "androidx.compose.material3.DefaultDrawerItemsColor.badgeColor (NavigationDrawer.kt:1106)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4168boximpl(z2 ? this.selectedBadgeColor : this.unselectedBadgeColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultDrawerItemsColor)) {
            return false;
        }
        DefaultDrawerItemsColor defaultDrawerItemsColor = (DefaultDrawerItemsColor) obj;
        if (Color.m4179equalsimpl0(this.selectedIconColor, defaultDrawerItemsColor.selectedIconColor) && Color.m4179equalsimpl0(this.unselectedIconColor, defaultDrawerItemsColor.unselectedIconColor) && Color.m4179equalsimpl0(this.selectedTextColor, defaultDrawerItemsColor.selectedTextColor) && Color.m4179equalsimpl0(this.unselectedTextColor, defaultDrawerItemsColor.unselectedTextColor) && Color.m4179equalsimpl0(this.selectedContainerColor, defaultDrawerItemsColor.selectedContainerColor) && Color.m4179equalsimpl0(this.unselectedContainerColor, defaultDrawerItemsColor.unselectedContainerColor) && Color.m4179equalsimpl0(this.selectedBadgeColor, defaultDrawerItemsColor.selectedBadgeColor)) {
            return Color.m4179equalsimpl0(this.unselectedBadgeColor, defaultDrawerItemsColor.unselectedBadgeColor);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((Color.m4185hashCodeimpl(this.selectedIconColor) * 31) + Color.m4185hashCodeimpl(this.unselectedIconColor)) * 31) + Color.m4185hashCodeimpl(this.selectedTextColor)) * 31) + Color.m4185hashCodeimpl(this.unselectedTextColor)) * 31) + Color.m4185hashCodeimpl(this.selectedContainerColor)) * 31) + Color.m4185hashCodeimpl(this.unselectedContainerColor)) * 31) + Color.m4185hashCodeimpl(this.selectedBadgeColor)) * 31) + Color.m4185hashCodeimpl(this.unselectedBadgeColor);
    }
}
