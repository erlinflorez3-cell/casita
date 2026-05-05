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
/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4R\u0007\":\u001b\u007f\u0007ljA0RkP.XW0\u0014\u0002ڔd$\n#2vKY(}:\t}Owk|Lr\u000bq\u0010\u0016\u001a\u0007mDI\u0004ym\u0016\u001d6Zom4]sK>xtd\u0006060>\u0012\u0005/\u001bݵL\u0010\u0005\u0002\f\u0016\u001a\"H@\u001fí\u0003\u0013S\u0005(\u0012\u001e>N\u0002NbmNDJ\u0005]h0S\toB\\*w0+N=LZ'\u001bzy\u001eYAg;\u001b%a\b\u001fR\n@3Ew=\u0013n?'YJ؎V̬ݼ\u0004\u0016\u001b<]\u001f&\u00044o\u001dQ\u000f W1]xcR$'&yBȵ<L\u0014\u0014=`.[1-\u001cVN\u0003tk@~\u0003\u000fF\u000e\u0013y6E9F2۸8\u001aȑPĥޅ\u001dP=\u0015\u0013'f>\u000fn9[\u0003\u000f\u0011\u0019)l\u0010Q_e\u0007<̩M\t֨<Чձtd\bE\u0012J\u0010\u001b=~).E&g_G;9k0\\\u000bfѱ\u0004_ŞR֟ʐLB(\u000b$Qz \u001a_\\d3lĥSАą\u0010LɟX\u000f\u0006\b!*tyB)3\u0019\u001ffvm\u0003M\f\u000bˑ.ωǶXm«\u0012_A^A?ie\u0016l`\u007fdVJh\u001dX\u0015CϦ\u000bȗۛ'!ĘLr\u0018w\nNf\u000e\u0019>MzlK:31\\CIԊ\u001dՓ̿{\bރ^p\u0018~b=<\u0005o1\u0003\u0012Qgjp\bg'Jڌ{ʠŮ,@پ9!.U0rL~)\u0015\r|P^uO_L\u001b\u0017çTݨĆ\u0015\u0019\u07fcU7E\u0013\u001d\tA4\b<SUǬeZU\u0015-Ϸ\u0019(\u000eCh4\u0007Ŷn\u000e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006^%>ia/7us8TMHy\n", "", "BdgA66E]&", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", ":dP1\\5@7\u0017\t\u0004<6\u0004\u0013<", "BqP6_0GU||\u0005g\n\u0007\u00109r", "2hb.U3>R\b~\u000em\n\u0007\u00109r", "2hb.U3>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$", "2hb.U3>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "uI9\u0017=\u0011#:\u001f\t\ne0\u0006R4v\bq\u007fI\u0010\u0017$Pk\u0015\u0006U%6U\u000e'FK 7[RH{2-\u001fuI5\u0014i,[Lj8", "5dc\u0011\\::P ~yE,x\b3n\u0002\fyJ\nt!Ny\u001b\u0004A$\u0007Sc%'", "u(9", "\u0018", "5dc\u0011\\::P ~yM,\u0010\u0018\ro\u00072\t\bK\u0016hAU\u0013,", "5dc\u0011\\::P ~yM9x\r6i\t*_>\u000b tQv\u0018I>o4+w\u0006<]", "5dc\u0019X(=W\"\u0001^\\6\u0006f9l\n5C\u000b\u007fh\u0011-t}", "5dc!X?M1#\u0006\u0005ksG\b\u0001_e-k", "5dc!e(BZ\u001d\b|B*\u0007\u0012\ro\u00072\t\bK\u0016hAU\u0013,", "1n_F", "1n_F ;'Aeq\u0001J", "uI9\u0017=\u0011#\u0017\u007fz\u0004]9\u0007\r.xI&\u0006H\f!%G9\u00168\u0006%B]y'\u00057}.VS\u001fz4&rrhC\u0014q\u0002", "3pd._:", "", "=sW2e", "6`b566=S", "", "3mP/_,=", ":dP1\\5@7\u0017\t\u0004<6\u0004\u0013<-\u0011\u0011\u000f\u001dKg\u001d\u0006w\nKv29U\u0005m1z\u00165M?Ik", "uY\u0018\u0017", "BdgA66E]&F\fG?YS\u007fk>0wO\u0001$\u001bCv[6\u0004%<Yy.7", "BqP6_0GU||\u0005g\n\u0007\u00109rG9dS]agM.\u00168\u0006%B]y'\u0005g#.TC7y4", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MenuItemColors {
    public static final int $stable = 0;
    private final long disabledLeadingIconColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long leadingIconColor;
    private final long textColor;
    private final long trailingIconColor;

    public /* synthetic */ MenuItemColors(long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7);
    }

    private MenuItemColors(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.textColor = j2;
        this.leadingIconColor = j3;
        this.trailingIconColor = j4;
        this.disabledTextColor = j5;
        this.disabledLeadingIconColor = j6;
        this.disabledTrailingIconColor = j7;
    }

    /* JADX INFO: renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m2254getTextColor0d7_KjU() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: getLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2253getLeadingIconColor0d7_KjU() {
        return this.leadingIconColor;
    }

    /* JADX INFO: renamed from: getTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2255getTrailingIconColor0d7_KjU() {
        return this.trailingIconColor;
    }

    /* JADX INFO: renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m2251getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* JADX INFO: renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2250getDisabledLeadingIconColor0d7_KjU() {
        return this.disabledLeadingIconColor;
    }

    /* JADX INFO: renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2252getDisabledTrailingIconColor0d7_KjU() {
        return this.disabledTrailingIconColor;
    }

    /* JADX INFO: renamed from: copy-tNS2XkQ$default, reason: not valid java name */
    public static /* synthetic */ MenuItemColors m2248copytNS2XkQ$default(MenuItemColors menuItemColors, long j2, long j3, long j4, long j5, long j6, long j7, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            j2 = menuItemColors.textColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j3 = menuItemColors.leadingIconColor;
        }
        if ((4 & i2) != 0) {
            j4 = menuItemColors.trailingIconColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            j5 = menuItemColors.disabledTextColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            j6 = menuItemColors.disabledLeadingIconColor;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            j7 = menuItemColors.disabledTrailingIconColor;
        }
        return menuItemColors.m2249copytNS2XkQ(j2, j3, j4, j5, j6, j7);
    }

    /* JADX INFO: renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final MenuItemColors m2249copytNS2XkQ(long j2, long j3, long j4, long j5, long j6, long j7) {
        long j8 = j2;
        long j9 = j3;
        long j10 = j4;
        long j11 = j5;
        long j12 = j6;
        long j13 = j7;
        if (j8 == 16) {
            j8 = this.textColor;
        }
        if (j9 == 16) {
            j9 = this.leadingIconColor;
        }
        if (j10 == 16) {
            j10 = this.trailingIconColor;
        }
        if (j11 == 16) {
            j11 = this.disabledTextColor;
        }
        if (j12 == 16) {
            j12 = this.disabledLeadingIconColor;
        }
        if (j13 == 16) {
            j13 = this.disabledTrailingIconColor;
        }
        return new MenuItemColors(j8, j9, j10, j11, j12, j13, null);
    }

    /* JADX INFO: renamed from: textColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2257textColorvNxB06k$material3_release(boolean z2) {
        return z2 ? this.textColor : this.disabledTextColor;
    }

    /* JADX INFO: renamed from: leadingIconColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2256leadingIconColorvNxB06k$material3_release(boolean z2) {
        return z2 ? this.leadingIconColor : this.disabledLeadingIconColor;
    }

    /* JADX INFO: renamed from: trailingIconColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2258trailingIconColorvNxB06k$material3_release(boolean z2) {
        return z2 ? this.trailingIconColor : this.disabledTrailingIconColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MenuItemColors)) {
            return false;
        }
        MenuItemColors menuItemColors = (MenuItemColors) obj;
        return Color.m4179equalsimpl0(this.textColor, menuItemColors.textColor) && Color.m4179equalsimpl0(this.leadingIconColor, menuItemColors.leadingIconColor) && Color.m4179equalsimpl0(this.trailingIconColor, menuItemColors.trailingIconColor) && Color.m4179equalsimpl0(this.disabledTextColor, menuItemColors.disabledTextColor) && Color.m4179equalsimpl0(this.disabledLeadingIconColor, menuItemColors.disabledLeadingIconColor) && Color.m4179equalsimpl0(this.disabledTrailingIconColor, menuItemColors.disabledTrailingIconColor);
    }

    public int hashCode() {
        return (((((((((Color.m4185hashCodeimpl(this.textColor) * 31) + Color.m4185hashCodeimpl(this.leadingIconColor)) * 31) + Color.m4185hashCodeimpl(this.trailingIconColor)) * 31) + Color.m4185hashCodeimpl(this.disabledTextColor)) * 31) + Color.m4185hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m4185hashCodeimpl(this.disabledTrailingIconColor);
    }
}
