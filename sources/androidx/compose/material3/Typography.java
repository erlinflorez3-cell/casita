package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyTokens;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: Typography.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4a\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:)qҕ\"CiTZԞ!\u0019UTgunbZ9D\u001f\f\u001cxx.aU'^\"\u00158B}BKM\u001e>Ifz6\u0013$J\"fz\u0015\u0007 *V\u0015\u000fzqL\u001c\u00186@~@j\r{\u0006*\u0018\f>.\b6\\\u0016OFNr]H7;\u0003\u0018C^-e0\u000bV%F\u0003(\u001d|g\u001e9JO5C&c\t\rRiJ\u001b? >\u0015n-'9U\fWdY\u0010\u001a\u001b+]\u001aurT]\u0015Wf\f59gcyQ\u001e.}z\n\u001cT\u0004<\u0007όL.;*/ڹ\rA\u0016\u000bSnА2dH\u007f\taN\u0017S\u0001c1?\u001btSy;GOg\u0002\u000b\r,&\u0019nO\\\u0005\u0014f\u0015)X\u0010Q_RpCNN\u0018^Um2q\u0013\b0\u0004>M\u0018/*\u0012^\u001d+7i@;!\u001a\u0003xJmv\u0013h\u0001S\u0018SxF(n$@B\t:[tj\u000bk^^p,?NLZ\r}\u0016\u001e8\\&=Q+\u0016N]t\u0002j{^:+5fEf\u0007k<Xid95_q(a\u0001wDEBb\u0013g~B\u0002\r#m6DJH\u00193(\u0002Rr$\u0015H> \u001bzϐ1ab#m\u001b\u001epgC\u001d(`v7\u0017TaLI}t\u0004\u0017\u000bh\\\u001fpς|O4ʉx$3R_Gi5c-\u00014+$ȷ\u0003y\bø\u007fNM_z(Fd\n,.\u001agRȠA\u0019\u0017ȯA4\bAS^Ct_M*')}ɍ\u0013Ap֫\u007f\np\u0006:r;Y]V/\"%_ѓ'\u000elр\u0012cL\u0011Uu%\u001aiAar1Z\u0084R>\u0005þ7 +\u0018}4MD;G?\u001dDxӄ3\u001biӠ\u0002q4\u0012p!v\u0004s\tDcDp͈Uc:ծPK_\u0018L4t{\u0011H`j&\tɚ\r:\u0015Ή`Cj\u000bdJ\u001e\u001a=\u000b~\u0007Z\u000e\u0080ZaBܤ\b\u007f:Im<DR\f\"vCS\u0012ߠWmuޮc^\u0011f\u001d\u001c[\u000b?}*\u001ck!ݫ[h\u0011ݵ\u001eu\u001eSOM3\u0014J\u0010<4Z=ޭ\u000fI\\ȫ\u001e\u0012\u0001\u001eTq_&@J\f;\u0005\u000f֭|b^ޠ\u001dbK\u007f/<Q\u000e\u001d<6xc2ܭqL\\Џ{4\u0007s+\u001bƮnx"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e9@c\u007f-3x\u0019B#", "", "2hb=_(R:\u0015\f|^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "2hb=_(R;\u0019}~n4", "2hb=_(RA!z\u0002e", "6dP1_0GS\u007fz\b`,", "6dP1_0GS\u0001~yb<\u0005", "6dP1_0GS\u0007\u0007ve3", "Bhc9X\u0013:`\u001b~", "Bhc9X\u0014>R\u001d\u000f\u0003", "Bhc9X\u001aFO \u0006", "0nSF?(KU\u0019", "0nSF@,=W)\u0007", "0nSFF4:Z ", ":`Q2_\u0013:`\u001b~", ":`Q2_\u0014>R\u001d\u000f\u0003", ":`Q2_\u001aFO \u0006", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8DG\r4>mk\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011\\RukR\u0006L]\u0001Z!]\u0019\u001c\u0019`AyU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011\t\u0015\tPrWFlngVULb\u007fK\bh\u001ciD>#';\u0017%p[8\u0018{\u001d!v\u001c\tgzVbi87M[jZLo+#p0\u001eX\u0006{\u0011E\"r5|8\u000eB*\u007ft\t\u0015v\u0018QmB\u0004,oP\u00155JC\u0013\u00152_~kK\u0018l\u001etQ\fl=<#se-X\u0013Pl\u0017nD+N\u0001JasM]v\u0015|-zKZ\u0007\u001f\r\u000677cSK&^\u000f\u001a:T&) \u0003\u0016ua\u000b.)LG\u001e|1_\r4\u000f\u0012gE\u0016\u007fXV^nR\u0018xU\u0001[!\u007f(\u007f\b\u0011\\0|:<\na1~$\u001d4Vqz&rvL}5&n#GaCln/TwWk(gK+h\u001c1\u0015a.}r~'jd\nq{\"gB7\u0015|?Sr-FqKNL^\u001c\u001f,`$xOt)QI\u0003IQncf\u007f4w &0%\t\u0011\u001dq#:p\u001a\fS\u007f!x*\u0001k]_<\u0013\u0002W6)\u0012b/Zv\u001eOg\"V\u0005(V\u0004LR~*=\u0016}\u001e\u00166\"FyvID\u0010!T!s\u0017d\u000e\u001f\u001b\u0002W\u001fx\u0005vR.t\u001b \u0016|aI$N\u0005%<i)\u0001hT?Z\u0003gsw\u0010@\u001d{\u000fUn\u0018;Ady\u001cD@*sOrw\u0005!\u0006\u001c,\u001d\r\u001bH\u007f2\u0013\u0006zu`\u0004f\u000b\u0010\u0001 -\u0004EI\\\"?`pz~d942\u0004\u0015S\u001dGEr0,\u0013`\u0014Q\u0004t6[j\n\u00177\t", "5dc\u000fb+R:\u0015\f|^", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhk/Kt\u0016\u0004", "5dc\u000fb+R;\u0019}~n4", "5dc\u000fb+RA!z\u0002e", "5dc\u0011\\:IZ\u0015\u0013aZ9~\t", "5dc\u0011\\:IZ\u0015\u0013b^+\u0001\u00197", "5dc\u0011\\:IZ\u0015\u0013hf(\u0004\u0010", "5dc\u0015X(=Z\u001d\bzE(\n\u000b/", "5dc\u0015X(=Z\u001d\bzF,{\r?m", "5dc\u0015X(=Z\u001d\bzL4x\u00106", "5dc\u0019T)>Z\u007fz\b`,", "5dc\u0019T)>Z\u0001~yb<\u0005", "5dc\u0019T)>Z\u0007\u0007ve3", "5dc!\\;ES\u007fz\b`,", "5dc!\\;ES\u0001~yb<\u0005", "5dc!\\;ES\u0007\u0007ve3", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Typography {
    public static final int $stable = 0;
    private final TextStyle bodyLarge;
    private final TextStyle bodyMedium;
    private final TextStyle bodySmall;
    private final TextStyle displayLarge;
    private final TextStyle displayMedium;
    private final TextStyle displaySmall;
    private final TextStyle headlineLarge;
    private final TextStyle headlineMedium;
    private final TextStyle headlineSmall;
    private final TextStyle labelLarge;
    private final TextStyle labelMedium;
    private final TextStyle labelSmall;
    private final TextStyle titleLarge;
    private final TextStyle titleMedium;
    private final TextStyle titleSmall;

    public Typography() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LayoutKt.LargeDimension, null);
    }

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15) {
        this.displayLarge = textStyle;
        this.displayMedium = textStyle2;
        this.displaySmall = textStyle3;
        this.headlineLarge = textStyle4;
        this.headlineMedium = textStyle5;
        this.headlineSmall = textStyle6;
        this.titleLarge = textStyle7;
        this.titleMedium = textStyle8;
        this.titleSmall = textStyle9;
        this.bodyLarge = textStyle10;
        this.bodyMedium = textStyle11;
        this.bodySmall = textStyle12;
        this.labelLarge = textStyle13;
        this.labelMedium = textStyle14;
        this.labelSmall = textStyle15;
    }

    public /* synthetic */ Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? TypographyTokens.INSTANCE.getDisplayLarge() : textStyle, (i2 + 2) - (i2 | 2) != 0 ? TypographyTokens.INSTANCE.getDisplayMedium() : textStyle2, (i2 & 4) != 0 ? TypographyTokens.INSTANCE.getDisplaySmall() : textStyle3, (i2 + 8) - (i2 | 8) != 0 ? TypographyTokens.INSTANCE.getHeadlineLarge() : textStyle4, (i2 & 16) != 0 ? TypographyTokens.INSTANCE.getHeadlineMedium() : textStyle5, (i2 & 32) != 0 ? TypographyTokens.INSTANCE.getHeadlineSmall() : textStyle6, (i2 + 64) - (i2 | 64) != 0 ? TypographyTokens.INSTANCE.getTitleLarge() : textStyle7, (-1) - (((-1) - i2) | ((-1) - 128)) != 0 ? TypographyTokens.INSTANCE.getTitleMedium() : textStyle8, (-1) - (((-1) - i2) | ((-1) - 256)) != 0 ? TypographyTokens.INSTANCE.getTitleSmall() : textStyle9, (-1) - (((-1) - i2) | ((-1) - 512)) != 0 ? TypographyTokens.INSTANCE.getBodyLarge() : textStyle10, (i2 + 1024) - (i2 | 1024) != 0 ? TypographyTokens.INSTANCE.getBodyMedium() : textStyle11, (i2 + 2048) - (i2 | 2048) != 0 ? TypographyTokens.INSTANCE.getBodySmall() : textStyle12, (i2 + 4096) - (i2 | 4096) != 0 ? TypographyTokens.INSTANCE.getLabelLarge() : textStyle13, (i2 & 8192) != 0 ? TypographyTokens.INSTANCE.getLabelMedium() : textStyle14, (i2 & 16384) != 0 ? TypographyTokens.INSTANCE.getLabelSmall() : textStyle15);
    }

    public final TextStyle getDisplayLarge() {
        return this.displayLarge;
    }

    public final TextStyle getDisplayMedium() {
        return this.displayMedium;
    }

    public final TextStyle getDisplaySmall() {
        return this.displaySmall;
    }

    public final TextStyle getHeadlineLarge() {
        return this.headlineLarge;
    }

    public final TextStyle getHeadlineMedium() {
        return this.headlineMedium;
    }

    public final TextStyle getHeadlineSmall() {
        return this.headlineSmall;
    }

    public final TextStyle getTitleLarge() {
        return this.titleLarge;
    }

    public final TextStyle getTitleMedium() {
        return this.titleMedium;
    }

    public final TextStyle getTitleSmall() {
        return this.titleSmall;
    }

    public final TextStyle getBodyLarge() {
        return this.bodyLarge;
    }

    public final TextStyle getBodyMedium() {
        return this.bodyMedium;
    }

    public final TextStyle getBodySmall() {
        return this.bodySmall;
    }

    public final TextStyle getLabelLarge() {
        return this.labelLarge;
    }

    public final TextStyle getLabelMedium() {
        return this.labelMedium;
    }

    public final TextStyle getLabelSmall() {
        return this.labelSmall;
    }

    public static /* synthetic */ Typography copy$default(Typography typography, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, int i2, Object obj) {
        TextStyle textStyle16 = textStyle;
        TextStyle textStyle17 = textStyle3;
        TextStyle textStyle18 = textStyle2;
        TextStyle textStyle19 = textStyle5;
        TextStyle textStyle20 = textStyle4;
        TextStyle textStyle21 = textStyle7;
        TextStyle textStyle22 = textStyle6;
        TextStyle textStyle23 = textStyle9;
        TextStyle textStyle24 = textStyle8;
        TextStyle textStyle25 = textStyle11;
        TextStyle textStyle26 = textStyle10;
        TextStyle textStyle27 = textStyle13;
        TextStyle textStyle28 = textStyle12;
        TextStyle textStyle29 = textStyle15;
        TextStyle textStyle30 = textStyle14;
        if ((i2 & 1) != 0) {
            textStyle16 = typography.displayLarge;
        }
        if ((i2 & 2) != 0) {
            textStyle18 = typography.displayMedium;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            textStyle17 = typography.displaySmall;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            textStyle20 = typography.headlineLarge;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            textStyle19 = typography.headlineMedium;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            textStyle22 = typography.headlineSmall;
        }
        if ((i2 & 64) != 0) {
            textStyle21 = typography.titleLarge;
        }
        if ((i2 & 128) != 0) {
            textStyle24 = typography.titleMedium;
        }
        if ((i2 + 256) - (i2 | 256) != 0) {
            textStyle23 = typography.titleSmall;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 512)) != 0) {
            textStyle26 = typography.bodyLarge;
        }
        if ((i2 & 1024) != 0) {
            textStyle25 = typography.bodyMedium;
        }
        if ((i2 & 2048) != 0) {
            textStyle28 = typography.bodySmall;
        }
        if ((i2 + 4096) - (i2 | 4096) != 0) {
            textStyle27 = typography.labelLarge;
        }
        if ((i2 & 8192) != 0) {
            textStyle30 = typography.labelMedium;
        }
        if ((i2 & 16384) != 0) {
            textStyle29 = typography.labelSmall;
        }
        return typography.copy(textStyle16, textStyle18, textStyle17, textStyle20, textStyle19, textStyle22, textStyle21, textStyle24, textStyle23, textStyle26, textStyle25, textStyle28, textStyle27, textStyle30, textStyle29);
    }

    public final Typography copy(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15) {
        return new Typography(textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, textStyle15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        return Intrinsics.areEqual(this.displayLarge, typography.displayLarge) && Intrinsics.areEqual(this.displayMedium, typography.displayMedium) && Intrinsics.areEqual(this.displaySmall, typography.displaySmall) && Intrinsics.areEqual(this.headlineLarge, typography.headlineLarge) && Intrinsics.areEqual(this.headlineMedium, typography.headlineMedium) && Intrinsics.areEqual(this.headlineSmall, typography.headlineSmall) && Intrinsics.areEqual(this.titleLarge, typography.titleLarge) && Intrinsics.areEqual(this.titleMedium, typography.titleMedium) && Intrinsics.areEqual(this.titleSmall, typography.titleSmall) && Intrinsics.areEqual(this.bodyLarge, typography.bodyLarge) && Intrinsics.areEqual(this.bodyMedium, typography.bodyMedium) && Intrinsics.areEqual(this.bodySmall, typography.bodySmall) && Intrinsics.areEqual(this.labelLarge, typography.labelLarge) && Intrinsics.areEqual(this.labelMedium, typography.labelMedium) && Intrinsics.areEqual(this.labelSmall, typography.labelSmall);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.displayLarge.hashCode() * 31) + this.displayMedium.hashCode()) * 31) + this.displaySmall.hashCode()) * 31) + this.headlineLarge.hashCode()) * 31) + this.headlineMedium.hashCode()) * 31) + this.headlineSmall.hashCode()) * 31) + this.titleLarge.hashCode()) * 31) + this.titleMedium.hashCode()) * 31) + this.titleSmall.hashCode()) * 31) + this.bodyLarge.hashCode()) * 31) + this.bodyMedium.hashCode()) * 31) + this.bodySmall.hashCode()) * 31) + this.labelLarge.hashCode()) * 31) + this.labelMedium.hashCode()) * 31) + this.labelSmall.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Typography(displayLarge=");
        sb.append(this.displayLarge).append(", displayMedium=").append(this.displayMedium).append(",displaySmall=").append(this.displaySmall).append(", headlineLarge=").append(this.headlineLarge).append(", headlineMedium=").append(this.headlineMedium).append(", headlineSmall=").append(this.headlineSmall).append(", titleLarge=").append(this.titleLarge).append(", titleMedium=").append(this.titleMedium).append(", titleSmall=").append(this.titleSmall).append(", bodyLarge=").append(this.bodyLarge).append(", bodyMedium=").append(this.bodyMedium).append(", bodySmall=");
        sb.append(this.bodySmall).append(", labelLarge=").append(this.labelLarge).append(", labelMedium=").append(this.labelMedium).append(", labelSmall=").append(this.labelSmall).append(')');
        return sb.toString();
    }
}
