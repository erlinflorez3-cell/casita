package kotlin.text;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
@Metadata(bv = {}, d1 = {"Я^\u001d̉=!4i\bDZc|İI\u0006F\u000b6B\r%4\u0012\u0006\u000bnjG5LeV4ZS8\u0016s{B,cҕyCIl\"}(\tWNurvϺb\u000bY\u000f\u000e\u0016\u000fj4Ic\u0003e\u0012\u001d˰JoM<UoKEht<\t(208\u0002\u0005\u0007\u001dBe\u001e͌\u0013Gy\u000bz0\u001fpbV;Lm\u001ap\u0006n&\u000f\u001ftid5vn$ƅ5;\u001ewĩf+\u000e/eMkF|+;uJ\u001e\n@g9#&k\u00035U\"β\tW\rKݛ\u0001+U*2s66\u0001\u0004B\u0014\u0014Ok]#*j\u0006i`:+q՚ick\u001cߊ\u0010~*\f%\u0004l\u0006OL\\,\u0003ff\u000ecx\u0001TXP0c\tȝ\u0001yQ%ӛ\u00187Y8\u0004f0ac\u001d|6d\u0005k\u001eS\u0005|\"sT<f[ÙZ\u0010l?҅XAvMrY\u001cm,t\u0011\u0001\u0013\u0004\u000fG03\n\u0012F\u0017S>\"ޅ)9\u0007\u0010҆\\k%\u0004Ih2izLn!W\u0016\u0016*9\u0010hE|\u0005\u001aX\u001bИ2)p*\u0381\u001f\u00026\u0012\t\\V<I)>M8hHj}i\u0018&GnMX\u001djvYO]\u00125\u0018ҷ\u0016y}\u0005\u001dW@\u0011\u0004Af!S4^\u000b'\u000b2'j@{\nEf\fA<ou*?D1GbEL\u0011*ZA+\u000f&ʻn(*b<<\u0007\u0018#]\t_P\u0005t\u001efaI\u000b|\u0011&;Bi5G3\u0006&v?\u0015#5\u0005$\u0004UsdGzr\\߷[\u00142$(QU]L{\u000f]9Z\u0006[T5rDa\u0014\u0017?\u0016\u000b\b'?\u0017=P\bI\u0001Td\u0019Y8Tu2'b\u0001$ d.\u000b(Ç\u0001_\u0001b\u0019sBw\u0002kY\u001b^`\u00013.\u0007%_\u007fR\u0003C.[)3\u0015&!u֚gu{}<\u0012f=%]eb,\f\u001a\u001ea:]\u0011;~Nq\u001cL0<p1A1jV\bj\rb\f\u001cH d!\\FN#1\u0014e5.Sߦ\\sW!}\u00168\\^\u0013s\"}<bq$yM2g\u001esY]#L%\t9\u000ew\u07b3\u00184X.dof7/nsv6i?\u0011\u0004%\t\u00034\\@\u0016\f[T\u0018\u0019Vć\u0006^z\u001d%JF\":?\u000e3x\u0005Zv\u0004IE?!Z\u0005\r\u0010K\u001e'8wܒs^o=qJ\u0005\u0002\u001cq\u001bIO'jS*-T\u0018\u001bX\\\u000f\f]]qZHԕ\n_D{y\b\u0010f\u0017e\u001d!\u0018C=\u007f\u0010Hv\u000f^;YrO|v@p\u0019Ƒ(A\u001c\t\u000b&@8\u000es\u0019.r\u0018f[K7w\u0016CJ\u0007%EA\t\"{\u0012SaҖ\fMHKW\u0003\u0018Uz@S\u001a}0$N&lt\u007f\\\b\u0012t\u000bu\u001bh\u001a8мh\u001a$!^8\b\\I]rh.0:}\u0001\u001c\u0002q^\no\u0006\"X'YqLפQ\u0001\u0014\u0018q\u0005g\u001dTs\u0003E1~}\u001d,9\u001dg'}2!Yr:?YfǍ\u0017\u0018/#47:6a\u0012\u0010.c\u0011t\u001aND\r\n/\u001c.o2HRL\u0005eݟ{\u001cEb6-?\u0005L'dg\\\u0015F\u0006\rGj\u0007d%\u00107\u0015\u0015~vfWӊ:^\u0010,rG;G\u001eD\r&`/\bsH\u000f!\u0010Ro!E3#q>u?\u0017\u0001ŏz\u0018MP\u0017\u000b\u0004\u0016+\u0016F3=B+\b#Vda&{QFC 4'\r?.C:6=;\u001abԥWKS'&\u0019\u0019f\u0005X\u0007w5\u0013U\u0002$\u0013\u0001[\u0001SD\u0012LyP\f;!\"\u0018\u000fN\u001b\u007fji$\u001ee+'<\u0006sa\u0017M\u0012\\Uʰ2aXS6\u0012Yn~r\u001f\u0003$.yQ~.1'*\u0010`Na\fW2,Z:|P;G\u001b~:ԉ2\u0002K\u0002}seb@c\u0014wDf.[koE,h*\u000fR$]\u0014e\u00156-A\u0018\u0015\u0010}{p/W}e/\u000bcl\u0017\u0002\u0010R2\u0010<@áFq]\u0014F*X\u0012iSm0_8<@\fu\u0004V1\u0003d\u000ew5\u0018UQ'JD]\u0011Moo;D\u001d/v.p\u0012;\n$:`\u00170\u0004\u0011߿\u001b+RU\u000eYG@q$%K\u0010D%d%\u0018nUVmq\u0007Ci7\u0019nbXcv#ո]9vrG-\u0004\u0019*\u0017G5>B.\u0007\u0005vECH@H\u0007O@m^6`T\rf[]/\"OAc\u0016}~`v}֩j)`Et\u0007R\u0004>U|0\u0002xAw\u0013;\"aWJ#\"\u0017aD\u0002\bjhm|\u001cO@\tgJ/:\u001e?]G{r\\eM%o?-\u0012fΜ*ː\u0017D"}, d2 = {"/o_2a+%W\"~", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", "D`[BX", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8|A\u0001$l", "", "", "", "", "", "", "/o_2a++O\"\u0001z", "", "AsP?g\u0010GR\u0019\u0012", "3mS\u0016a+>f", "", "/o_2a+E\\", "\u001aiPCTuEO\"\u0001D:7\b\t8d{%\u0003@V", "\u001aj^A_0G\u001d(~\u000emuX\u0014:e\t'w=\b\u0017l", "", "", "", "", "1kT.e", "2d[2g,\u001ab", "7mS2k", "2d[2g,+O\"\u0001z", "7mb2e;+O\"\u0001z", "Adc", "", "Adc\u001fT5@S", "Bn25T9\u001a`&z\u000f", "2dbA\\5:b\u001d\t\u0004", "2dbA\\5:b\u001d\t\u0004H-}\u0017/t", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{@0B=v\u001a:7-1)4\u000b3")
class StringsKt__StringBuilderJVMKt extends StringsKt__RegexExtensionsKt {
    private static final StringBuilder appendLine(StringBuilder sb, byte b2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append((int) b2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        StringBuilder sbAppend2 = sbAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final StringBuilder appendLine(StringBuilder sb, double d2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(d2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        StringBuilder sbAppend2 = sbAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final StringBuilder appendLine(StringBuilder sb, float f2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(f2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        StringBuilder sbAppend2 = sbAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final StringBuilder appendLine(StringBuilder sb, int i2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(i2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        StringBuilder sbAppend2 = sbAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final StringBuilder appendLine(StringBuilder sb, long j2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(j2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        StringBuilder sbAppend2 = sbAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final StringBuilder appendLine(StringBuilder sb, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(stringBuffer);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        StringBuilder sbAppend2 = sbAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final StringBuilder appendLine(StringBuilder sb, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append((CharSequence) sb2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        StringBuilder sbAppend2 = sbAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final StringBuilder appendLine(StringBuilder sb, short s2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append((int) s2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        StringBuilder sbAppend2 = sbAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final StringBuilder appendRange(StringBuilder sb, CharSequence value, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sbAppend = sb.append(value, i2, i3);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return sbAppend;
    }

    private static final StringBuilder appendRange(StringBuilder sb, char[] value, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sbAppend = sb.append(value, i2, i3 - i2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return sbAppend;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine()", imports = {}))
    @InterfaceC1492Gx
    public static final Appendable appendln(Appendable appendable) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(SystemProperties.LINE_SEPARATOR);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return appendableAppend;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InterfaceC1492Gx
    private static final Appendable appendln(Appendable appendable, char c2) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(c2);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return StringsKt.appendln(appendableAppend);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InterfaceC1492Gx
    private static final Appendable appendln(Appendable appendable, CharSequence charSequence) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return StringsKt.appendln(appendableAppend);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine()", imports = {}))
    @InterfaceC1492Gx
    public static final StringBuilder appendln(StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(SystemProperties.LINE_SEPARATOR);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return sbAppend;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InterfaceC1492Gx
    private static final StringBuilder appendln(StringBuilder sb, byte b2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append((int) b2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return StringsKt.appendln(sbAppend);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InterfaceC1492Gx
    private static final StringBuilder appendln(StringBuilder sb, char c2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(c2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return StringsKt.appendln(sbAppend);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InterfaceC1492Gx
    private static final StringBuilder appendln(StringBuilder sb, double d2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(d2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return StringsKt.appendln(sbAppend);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InterfaceC1492Gx
    private static final StringBuilder appendln(StringBuilder sb, float f2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(f2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return StringsKt.appendln(sbAppend);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InterfaceC1492Gx
    private static final StringBuilder appendln(StringBuilder sb, int i2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(i2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return StringsKt.appendln(sbAppend);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InterfaceC1492Gx
    private static final StringBuilder appendln(StringBuilder sb, long j2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(j2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return StringsKt.appendln(sbAppend);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InterfaceC1492Gx
    private static final StringBuilder appendln(StringBuilder sb, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return StringsKt.appendln(sbAppend);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InterfaceC1492Gx
    private static final StringBuilder appendln(StringBuilder sb, Object obj) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(obj);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return StringsKt.appendln(sbAppend);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InterfaceC1492Gx
    private static final StringBuilder appendln(StringBuilder sb, String str) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(str);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return StringsKt.appendln(sbAppend);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InterfaceC1492Gx
    private static final StringBuilder appendln(StringBuilder sb, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(stringBuffer);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return StringsKt.appendln(sbAppend);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InterfaceC1492Gx
    private static final StringBuilder appendln(StringBuilder sb, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append((CharSequence) sb2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return StringsKt.appendln(sbAppend);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InterfaceC1492Gx
    private static final StringBuilder appendln(StringBuilder sb, short s2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append((int) s2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return StringsKt.appendln(sbAppend);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InterfaceC1492Gx
    private static final StringBuilder appendln(StringBuilder sb, boolean z2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbAppend = sb.append(z2);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return StringsKt.appendln(sbAppend);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tr\u0005%\\fK\u0014\u0004^\u001akWj_\u001d,\u0006lY\u0012dU\u0003o\u000e\t,g|\fxJR\u001cv>]]@?&^[}aYTRfWGQ\rW$I)zGA\u0007\u0014tv(T\f\u0001\u001d(\r\u0001LOB\u0003B@)4gtM\u0013bj\nf54I\u0017'\u0011\u001f!\u0010LeQ/%}Km\u007fV9ZNjbXp(XG7.8eC\u0019\u0012\u0006\u0018>v9", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InterfaceC1492Gx
    private static final StringBuilder appendln(StringBuilder sb, char[] value) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sbAppend = sb.append(value);
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return StringsKt.appendln(sbAppend);
    }

    public static final StringBuilder clear(StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.setLength(0);
        return sb;
    }

    private static final StringBuilder deleteAt(StringBuilder sb, int i2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbDeleteCharAt = sb.deleteCharAt(i2);
        Intrinsics.checkNotNullExpressionValue(sbDeleteCharAt, "deleteCharAt(...)");
        return sbDeleteCharAt;
    }

    private static final StringBuilder deleteRange(StringBuilder sb, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder sbDelete = sb.delete(i2, i3);
        Intrinsics.checkNotNullExpressionValue(sbDelete, "delete(...)");
        return sbDelete;
    }

    private static final StringBuilder insertRange(StringBuilder sb, int i2, CharSequence value, int i3, int i4) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sbInsert = sb.insert(i2, value, i3, i4);
        Intrinsics.checkNotNullExpressionValue(sbInsert, "insert(...)");
        return sbInsert;
    }

    private static final StringBuilder insertRange(StringBuilder sb, int i2, char[] value, int i3, int i4) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sbInsert = sb.insert(i2, value, i3, i4 - i3);
        Intrinsics.checkNotNullExpressionValue(sbInsert, "insert(...)");
        return sbInsert;
    }

    private static final void set(StringBuilder sb, int i2, char c2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.setCharAt(i2, c2);
    }

    private static final StringBuilder setRange(StringBuilder sb, int i2, int i3, String value) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sbReplace = sb.replace(i2, i3, value);
        Intrinsics.checkNotNullExpressionValue(sbReplace, "replace(...)");
        return sbReplace;
    }

    private static final void toCharArray(StringBuilder sb, char[] destination, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        sb.getChars(i3, i4, destination, i2);
    }

    static /* synthetic */ void toCharArray$default(StringBuilder sb, char[] destination, int i2, int i3, int i4, int i5, Object obj) {
        if ((2 & i5) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 4)) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = sb.length();
        }
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        sb.getChars(i3, i4, destination, i2);
    }
}
