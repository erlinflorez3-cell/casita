package kotlin.text;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d̉=!,u\bӵLc\u0003\nIي8\u000bDB\u0007\"B\u0012\u007f\u0007|jA0ReP.hS2\u000fq{<$iҕyّCU(\r*\tUOog|ab\u000bI\u0010\u000e\u0016\u0007s4Ic\u0003e\u0012\u001d=JģWo[ڎU9\u000fsf\t.2:8(\u0006138J(\f\u000bI[\u0010@4)p\u0019W\u001dO\u0015\u001a@\fl#Ә\"\\mU|ԧrԐ9ǂݍ\u0003qJT-^@|[\rdS?A\u0005ѭ6+n6e.3U\u001b\u001cbaO\u0007mu&\u0005G,7-Ys\u0006<\u0007\u0003Џ\u0019+U\u0014$þ,ڑ\u0004ĩӣ\f/3UiJ`\u000e6v\u0019z%Y\u0012\u0016\u001e+v2\u0016\u001aE\r67#v<@/\u0007\u000fH\u000e\u0004y8-$.=qݕ!~~oC1Re\u007fm\r|()rO_=\u000e?\u001aKh\u0006\\I[PCNM\u001a[Sl2z\u0011\u000eJ\u0006FF.9ɨ\u0015.%2O\tG+9o0L-gU\n\tl\u0002m;H\u001f'\u001f*E5!\u0016jJj\u0004{RjWZ\u0010{(t\t\u0014\u0007A\u001fϢ{</3(y]p\u0002n{ar%\u000ek_]\u001dovW\u0018cc9_r(a\u0001\u0007DCJs\u001dX\u0015C\u0004\u0010hn@\"`I1ݠ}\u0014W\\\u001f+6mu\u00054\u000b6A`CLk\u001e!FCȉer\u0006\u001e\u0012l7R\u0007R$S\u000e)T\u000btXgWN\\\u0003n-ECg4G0\u001cȰnL\u00181\u001a\u0017w.KPL&Q\u0015\u001a$Yd t\u001fiU=H+\u000f-=xĐ3]g\u0001xiQ@+c|X\u0014cl\\kpjO1\u0011nXZl\u0017P\f%и) \u007f\u000e\ryJ)KLTi`fM!\u0007B<-=-\t-)=\u0001\u001e2Cގ3[D+)\u0010\u0018]\u0019J]HtV}\u0011\u0013\u000ftD\t\\i$zzSs1iN\u0010ʺ\u0005V?2\u007f\u001bFvn`\b!\u000e\\\u0011aL*dO[hS\u0019:\u0016h\u001d+;o\u001dܲ@ܧo\u0003<1e͢$q|џbZ"}, d2 = {"0tX9W\u001aM`\u001d\b|", "", "1`_.V0Mg", "", "0tX9W,K/\u0017\u000e~h5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "/o_2a+", "=aY", "", "D`[BX", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002\u0005\fD\b\u0016\u0017TE\u0004#{!FUG'3v\u0018w7@@k2-j,H>\u0003t(\u0018}#PN\u0018\u001ak_vF\u0016nj\u0012U*\r\u0012/", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002\u0005\fD\b\u0016\u0017TE\u0004#{!FUG'3v\u0018w;RHo= j,H>\u0003t(\u0018}#PN\u0018\u001ak_vF\u0016nj\u0012U*\r\u0012/", "Asa", "", "=eU@X;", ":d]", "/o_2a+%W\"~", "", "", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{@0B=v\u001a:7-1)4\u000b3")
class StringsKt__StringBuilderKt extends StringsKt__StringBuilderJVMKt {
    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fKo\u0011Q!AS6\fi5\u001eGT\u0012\u007fT\u0002~Su(", replaceWith = @ReplaceWith(expression = "append(value = obj)", imports = {}))
    @InterfaceC1492Gx
    private static final StringBuilder append(StringBuilder sb, Object obj) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(obj);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return sbAppend;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001tr\u0005%\\fK\u001a{^\u001c1\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    @InterfaceC1492Gx
    private static final StringBuilder append(StringBuilder sb, char[] str, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(str, "str");
        throw new NotImplementedError(null, 1, null);
    }

    public static final StringBuilder append(StringBuilder sb, Object... value) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        for (Object obj : value) {
            sb.append(obj);
        }
        return sb;
    }

    public static final StringBuilder append(StringBuilder sb, String... value) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        for (String str : value) {
            sb.append(str);
        }
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return sbAppend;
    }

    private static final StringBuilder appendLine(StringBuilder sb, char c2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(c2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        StringBuilder sbAppend2 = sbAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final StringBuilder appendLine(StringBuilder sb, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        StringBuilder sbAppend2 = sbAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final StringBuilder appendLine(StringBuilder sb, Object obj) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(obj);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        StringBuilder sbAppend2 = sbAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final StringBuilder appendLine(StringBuilder sb, String str) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(str);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        StringBuilder sbAppend2 = sbAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final StringBuilder appendLine(StringBuilder sb, boolean z2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(z2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        StringBuilder sbAppend2 = sbAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final StringBuilder appendLine(StringBuilder sb, char[] value) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sbAppend = sb.append(value);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        StringBuilder sbAppend2 = sbAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final String buildString(int i2, Function1<? super StringBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        StringBuilder sb = new StringBuilder(i2);
        builderAction.invoke(sb);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final String buildString(Function1<? super StringBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        StringBuilder sb = new StringBuilder();
        builderAction.invoke(sb);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
