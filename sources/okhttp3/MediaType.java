package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4C\u0007\":!\u007f\u0007llA0ZeP.XS2\u000fy\u0005<$a$yCI[\"}(\u000eeȞ\u0006}\u001fJ\t\n{\u000e\u001cV$p,YY\u0007]*\u000f`C\u007fCAO\b=ga\u0005:\u0013#J\"fz\u0015\u000b(.`\u0016\u0007|SK:\u0013^E¤>R\u001bSM. \u000fV\"\u0017\u001d\u000bq~>NlkEG%\u0019hpXmdx\u000e[\u0019^TU\u001a'g,9X9K\u0014SRIޮR$E\u0011N\n=3xm;sW\u0002hNZ\u0016\u0013C,\u007f\u0011k\u0005>\\3R)\u00175.gcyQT-Þ~{\u0013OL\u0014\u0014;`.[\u001b-\u001cV>\u0003tk@~\u0003%Gȸ~a<,u\fA+Q\u001b\u0015R8ݥ\u001b\u05ee;{\rټn7\u000fr9ad\u0010p\u0015IU&V\b҈BףLP\u0012YKtT\u0002p\u0005B\u0004^H64ɨ\u00154\u001f¦O]?&/sRYRi\u000f\u0005\u000fi\nnʐLF*Â.90\u000b\u001ab֎h\u001c"}, d2 = {"\u001anZ5g;I!bfz]0xwCp\u007f}", "", ";dS6T\u001bR^\u0019", "", "Bx_2", "AtQAl7>", ">`a.`,MS&gvf,\u000bd8dp$\u0003P\u0001%", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001dB51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D\b(", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "2dU.h3MD\u0015\u0006\u000b^", "3pd._:", "", "=sW2e", "6`b566=S", "", ">`a.`,MS&", "<`\\2", "zcT=e,<O(~yX:\r\u0006>y\u000b(", "BnBAe0GU", "zcT=e,<O(~yX;\u0011\u0014/", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MediaType {
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;
    public static final Companion Companion = new Companion(null);
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\u0013nj?1Le^.ZS0\u0014qڛ5:ӋTqq:\u0016\u001f\u0004\"\u07beSNug7]h\u0013[\u000f4\u001f)n:Smx\f\u0017U7Բs?9X8RGl\r8\u001b\u001f`+h}\u0013\u000b2*v\u0015=\u007fŲO\f\u0018=\t\u007fH`%M3#:\u0006l%G#֔kN<P5nH>;\u0005\u007fA|0\b0+RSKù+\r|mn?N8M\u001dCV+\thZm\u0005ms\u0014ݞjҊ++Q֕(Bf\u0004,\u0015YTcơE͉`\u0005YӠ\\39U{K~\u0013~¾Mԫ\u0011<\f\u05faV;V5E\"\u0005\u000b65\u000bq\u0002B~\u00045ې\u0002ѐe6\u001fӛŗ7;"}, d2 = {"\u001anZ5g;I!bfz]0xwCp\u007ffYJ\t\"\u0013Ps\u0018EL", "", "u(E", "\u001e@A\u000e@\f-3\u0006", "\u001aiPCTuNb\u001d\u0006Dk,~\tB/j$\u000bO\u0001$ \u001d", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "\u001fT>!8\u000b", "", "\"N:\u0012A", "\"X?\u0012R\u001a.0\bre>", "5dc", "\u001anZ5g;I!bfz]0xwCp\u007f}", ";dS6T\u001bR^\u0019", "zcT=e,<O(~yX.|\u0018", ">`a@X", "zcT=e,<O(~yX7x\u0016=e", "Bn<2W0:B-\nz", "Bn<2W0:B-\nzH9e\u00196l", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_get */
        public final MediaType m10736deprecated_get(String mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            return get(mediaType);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_parse */
        public final MediaType m10737deprecated_parse(String mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            return parse(mediaType);
        }

        @JvmStatic
        public final MediaType get(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            String str2 = str;
            Matcher matcher = MediaType.TYPE_SUBTYPE.matcher(str2);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            Intrinsics.checkNotNullExpressionValue(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strGroup.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            Intrinsics.checkNotNullExpressionValue(strGroup2, "typeSubtype.group(2)");
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase2 = strGroup2.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType.PARAMETER.matcher(str2);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    throw new IllegalArgumentException(sb.append(strSubstring).append("\" for: \"").append(str).append('\"').toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (StringsKt.startsWith$default(strGroup4, "'", false, 2, (Object) null) && StringsKt.endsWith$default(strGroup4, "'", false, 2, (Object) null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(strGroup3);
                    arrayList2.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
        }

        @JvmStatic
        public final MediaType parse(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    @JvmStatic
    public static final MediaType get(String str) {
        return Companion.get(str);
    }

    @JvmStatic
    public static final MediaType parse(String str) {
        return Companion.parse(str);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "subtype", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_subtype */
    public final String m10734deprecated_subtype() {
        return this.subtype;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "type", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_type */
    public final String m10735deprecated_type() {
        return this.type;
    }

    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }

    public final Charset charset(Charset charset) {
        String strParameter = parameter("charset");
        if (strParameter == null) {
            return charset;
        }
        try {
            return Charset.forName(strParameter);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && Intrinsics.areEqual(((MediaType) obj).mediaType, this.mediaType);
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String parameter(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i2 = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, this.parameterNamesAndValues.length - 1, 2);
        if (progressionLastElement < 0) {
            return null;
        }
        while (!StringsKt.equals(this.parameterNamesAndValues[i2], name, true)) {
            if (i2 == progressionLastElement) {
                return null;
            }
            i2 += 2;
        }
        return this.parameterNamesAndValues[i2 + 1];
    }

    public final String subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }
}
