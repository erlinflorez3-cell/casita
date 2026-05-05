package okhttp3;

import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.Global;
import com.google.firebase.sessions.settings.RemoteSettings;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\":\u0019\u007f\u0007lkA0RnP.X]2\u000fy\u0002<$a&yCQU\"}(\u0012eȞ\u0006\f\u001fJ\t\n{\u000f):982Ie|k\u0012'2ppO7[qU9\u000fuF\t.5:8(\t\u0011\u001e8M(v)D[\u0010 6XphS\u001dQ\u0013!*\u0006l(\u0011\"jpf6vtm>=-\u001bipV7c>\be\rt\\ܮ\u0011vo*sKE:-%\u0002\u0004MWÜC\u0003E\u0002\u0006\u0016v8?+w{\b<f\u0012,\u0017AN;\\9̽\\M\\n\u000f?+}g\u0012Uˎ,w\u0001\u000fUB\u0012\"\u001e'vCs//\u0013\u001c>\rr\u0002H\u0017\u0007ެF\u007f\u0001w~\"3\tK+g#-Vň?\u0019TND\u0011\u001b6;\u0001\u001d)\fX\u001cy-\u001b\u0003\u0012\u001a<_@UH|\u000b Bъ\bph\u001dr\u000f>M\u0018/*\u0012t\u001cÉ;[??iv\u0010R\\g%\r'mרmRN]jy$>B\t:b\u000biʰoPZvt\u0017[;l\u0007,\tY4%\u000bJ@=\u0010|P\u0019mxmu\nS7-Ž֍rk\u0014x\u0002iA7ic>b\u0019{݀C<h')wPX$Z\u000b)X7ʮn\u0016\u007fӻ\\P\u0012\u0018@LB-B/I\u0019\u000b\u0019~\bٿFG\u0005ȁw\\n\u0013\rb\u00045\u0011t<t7\t\u0007aʼsm\u0001̢D~f-;P\"F'/m\"\u0017<3(ȷ\u0003y\bø\u007fNMUz%Ff\n .\u001agReBт\u0013\u00051Ʌ\u001a/KL\u0001r\"^ -\u0013|(\u0010qm\u05cek\u000erѱDbpP]ag3\u0005h\u000b#6l6~ӶJ\u0001Oϊl\raHW\u0002SjJUP|3'T*˽s(\u0005ކEE-$$\u0007d@#cui\u001e/0gϪ*zmֽDe\u001cqp^Њ6`"}, d2 = {"\u001anZ5g;I!b\\\u0005h2\u0001\t\u0005", "", "<`\\2", "", "D`[BX", "3w_6e,L/(", "", "2n\\.\\5", ">`c5", "AdRBe,", "", "6sc=B5Eg", ">da@\\:MS\"\u000e", "6nbAB5Eg", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u00134H7|0g\u001cdj;PQ;[z0I\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D9,\u0014|o:", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "u(9", "u(I", "zcT=e,<O(~yX+\u0007\u0011+i\t", "3pd._:", "=sW2e", "zcT=e,<O(~yX,\u0010\u00143r\u007f6WO", "6`b566=S", "", "zcT=e,<O(~yX/\u0007\u0017>O\t/\u0010", "zcT=e,<O(~yX/\f\u0018:O\t/\u0010", ";`c0[,L", "Cq[", "\u001anZ5g;I!ba\nm7l\u00166;", "zcT=e,<O(~yX5x\u0011/", "zcT=e,<O(~yX7x\u00182", "zcT=e,<O(~yX7|\u0016=i\u000e7{I\u0010", "zcT=e,<O(~yX:|\u0007?r\u007f", "BnBAe0GU", "4na\u001cU:HZ\u0019\u000ezK-zU\u00036O", "BnBAe0GUW\t\u0001a;\f\u0014", "zcT=e,<O(~yX=x\u0010?e", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u0019\u007fјnjG9LeN3ZS@\u000fs{:$qҕ\"CiTZ\u0001̀\rO\\g0rXg#C=\u0014^\u0005x-aU'زB\u0013@C\b?aO8SGa\r63ړb&Fz\u001d\u0001H,x\u0014\u0005\u007f[K:\u0018v@9F`\u0010e\u0005HŇ6B.\u00046\\\u0016R~TzlR/QɅ\u001aF\\(w0+OUJb.%v\u0010ӜsLE=-%\u0002Έ7ViG\u001b? ?Mt50CI\"Ɏf\\\u000e\u001d-+}\u000f&v4g\u001dQ\u000fϯo7]ocP<ߊ(~\n\u0019T\u0004<\bwV<.2h\u001e\ravIԢLг\u0006^JȕKmD\u001a=\u007fa/\u0010ӘrЂe;!\u05cb\b\b\u0013\u00126#/twſ`\u05f8d\u0015#ƘH]?XX=vT`ԲIъ\bpj̣z\u0012>O\u00181\u0012\u0010\\\u0019{ڞgޠ'!sȵ\u0019Pu\u007f\u001d`\u0017U@ɰTغ&n\u001eճz\u0015\u001ad\\d3q'Ӽd¯\u0015M$\u0381W\n\u0016\u001e8\\&Bwغ\u001cʽShqҔ\u001ek\u00181GhMX\u001dmdæEӷ75Yү߭eb"}, d2 = {"\u001anZ5g;I!b\\\u0005h2\u0001\tmB\u0010,\u0003?\u0001$l", "", "u(E", "2n\\.\\5", "", "3w_6e,L/(", "", "6nbAB5Eg", "", "6sc=B5Eg", "<`\\2", ">`c5", ">da@\\:MS\"\u000e", "AdRBe,", "D`[BX", "0tX9W", "\u001anZ5g;I!b\\\u0005h2\u0001\t\u0005", "6nbAB5Egw\t\u0003Z0\u0006", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private boolean persistent;
        private boolean secure;
        private String value;
        private long expiresAt = DatesKt.MAX_DATE;
        private String path = RemoteSettings.FORWARD_SLASH_STRING;

        private final Builder domain(String str, boolean z2) {
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                throw new IllegalArgumentException("unexpected domain: " + str);
            }
            this.domain = canonicalHost;
            this.hostOnly = z2;
            return this;
        }

        public final Cookie build() {
            String str = this.name;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.value;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j2 = this.expiresAt;
            String str3 = this.domain;
            if (str3 != null) {
                return new Cookie(str, str2, j2, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
            }
            throw new NullPointerException("builder.domain == null");
        }

        public final Builder domain(String domain) {
            Intrinsics.checkNotNullParameter(domain, "domain");
            return domain(domain, false);
        }

        public final Builder expiresAt(long j2) {
            if (j2 <= 0) {
                j2 = Long.MIN_VALUE;
            }
            if (j2 > DatesKt.MAX_DATE) {
                j2 = 253402300799999L;
            }
            this.expiresAt = j2;
            this.persistent = true;
            return this;
        }

        public final Builder hostOnlyDomain(String domain) {
            Intrinsics.checkNotNullParameter(domain, "domain");
            return domain(domain, true);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder name(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (!Intrinsics.areEqual(StringsKt.trim((CharSequence) name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed".toString());
            }
            this.name = name;
            return this;
        }

        public final Builder path(String path) {
            Intrinsics.checkNotNullParameter(path, "path");
            if (!StringsKt.startsWith$default(path, RemoteSettings.FORWARD_SLASH_STRING, false, 2, (Object) null)) {
                throw new IllegalArgumentException("path must start with '/'".toString());
            }
            this.path = path;
            return this;
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder value(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!Intrinsics.areEqual(StringsKt.trim((CharSequence) value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed".toString());
            }
            this.value = value;
            return this;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u0006\rnʑA0RqP.XT2\u000fy\u0005<$a&yCQU\"Ԃ*\t]Uo˧vJp\u000bK\u000f\f\u0017\u0001j:g]ތe\u0012%2JoE8Sڕ>Oś%63\u001fr'>yڱ\u0005\u001a8HX\u001d\tJc\f@8ptH[%M3$B\nL+\u0019\u001e\u000bo~:Vxu:]+3mP[?_^\u000b\u0014\r\u000fj5\u001c\u000faL9p;C%=S1\u0011\u0003_M\u0014Wqk\u000f/'oPW\u0006o8n~B([S\u001bq\u000b&\u000b\u001a\u0002d\u001a=CO\u0012b\u0001\u00126\u0010\u0013{;FJ\u05faΝ+H4Fb~\u0016 Kv\tRnc2bP\u0016\u0013ad.U\u0004ACQ\u001b\u0015[(@ajE\u0016\u001d\u0013.%\u0011nOn\u0003)\u0011\u0019)j\u0010Q_hpAVj\"Yk\u000bJu+\u00108\"HG.9,\u0015<6=7\nCi!4 Vd\u007fv3u\u0019Wwq`@PxF;8\u0014$Zrl5o^`p,?UbTO\f\u001648\\&QQ)\u001emgh\u0018t\u0014]R;=\tOY\u001dy>[GtK5\u007fz@e`\u001a,?jlKX7Va\rrdF%ZJ\u0001\u000f&}rPbƑ4Ɛu\u001c<ι\u0002-j\u0019`\u000b<Ei~\u001f^\tj>\u0001+՟&ғm$|էQdju\bo\u0017LT~v![C\u007f7oĢWɋl4\u0005ȽW\u0013\u0002\u0006_ojJtn,t\u0004}N\u0018pߜSȠA\u0013\u0017ȯȤ6&"}, d2 = {"\u001anZ5g;I!b\\\u0005h2\u0001\tmC\n0\u0007<\n\u001b!PE", "", "u(E", "\u0012@H,B\r8;\u0003giA&gd\u001eT_\u0015d", "\u001aiPCTuNb\u001d\u0006Dk,~\tB/j$\u000bO\u0001$ \u001d", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "\u001bN=!;&)/\bmZK\u0015", "\"H<\u0012R\u0017\u001aB\b^gG", "'D0\u001fR\u0017\u001aB\b^gG", "2`c26/:`\u0015|\n^9f\n0s\u007f7", "", "7m_Bg", "", ">nb", ":h\\6g", "7me2e;", "", "2n\\.\\5&O(|}", "Cq[\u0015b:M", "2n\\.\\5", ">`a@X", "\u001anZ5g;I!b\\\u0005h2\u0001\t\u0005", "1ta?X5MB\u001d\u0007zF0\u0004\u00103s", "", "Cq[", "\u001anZ5g;I!ba\nm7l\u00166;", "Adc\u0010b6DW\u0019", ">`a@XjHY\u001c\u000e\ni", ">`a@X\bEZ", "", "6dP1X9L", "\u001anZ5g;I!bazZ+|\u0016=;", ">`a@X\u000bH[\u0015\u0003\u0004", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, ">`a@X\fQ^\u001d\fzl", ">`a@X\u0014:ft\u0001z", ">`c5@(MQ\u001c", ">`c5", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int dateCharacterOffset(String str, int i2, int i3, boolean z2) {
            while (i2 < i3) {
                char cCharAt = str.charAt(i2);
                boolean z3 = true;
                if ((cCharAt >= ' ' || cCharAt == '\t') && cCharAt < 127 && (('0' > cCharAt || cCharAt >= ':') && (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && cCharAt != ':')))) {
                    z3 = false;
                }
                if (z3 == (!z2)) {
                    return i2;
                }
                i2++;
            }
            return i3;
        }

        public final boolean domainMatch(String str, String str2) {
            if (Intrinsics.areEqual(str, str2)) {
                return true;
            }
            return StringsKt.endsWith$default(str, str2, false, 2, (Object) null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.canParseAsIpAddress(str);
        }

        private final String parseDomain(String str) {
            if (StringsKt.endsWith$default(str, ".", false, 2, (Object) null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(StringsKt.removePrefix(str, (CharSequence) "."));
            if (canonicalHost != null) {
                return canonicalHost;
            }
            throw new IllegalArgumentException();
        }

        private final long parseExpires(String str, int i2, int i3) {
            int iDateCharacterOffset = dateCharacterOffset(str, i2, i3, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int iIndexOf$default = -1;
            int i7 = -1;
            int i8 = -1;
            while (iDateCharacterOffset < i3) {
                int iDateCharacterOffset2 = dateCharacterOffset(str, iDateCharacterOffset + 1, i3, true);
                matcher.region(iDateCharacterOffset, iDateCharacterOffset2);
                if (i5 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                    i5 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                    i7 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                    i8 = Integer.parseInt(strGroup3);
                } else if (i6 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i6 = Integer.parseInt(strGroup4);
                } else if (iIndexOf$default == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = Cookie.MONTH_PATTERN.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                    iIndexOf$default = StringsKt.indexOf$default((CharSequence) strPattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i4 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                    i4 = Integer.parseInt(strGroup6);
                }
                iDateCharacterOffset = dateCharacterOffset(str, iDateCharacterOffset2 + 1, i3, false);
            }
            if (70 <= i4 && i4 < 100) {
                i4 += 1900;
            }
            if (i4 >= 0 && i4 < 70) {
                i4 += 2000;
            }
            if (i4 < 1601) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (iIndexOf$default == -1) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (1 > i6 || i6 >= 32) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i5 < 0 || i5 >= 24) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i7 < 0 || i7 >= 60) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i8 < 0 || i8 >= 60) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i4);
            gregorianCalendar.set(2, iIndexOf$default - 1);
            gregorianCalendar.set(5, i6);
            gregorianCalendar.set(11, i5);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long parseMaxAge(String str) {
            try {
                long j2 = Long.parseLong(str);
                if (j2 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j2;
            } catch (NumberFormatException e2) {
                if (new Regex("-?\\d+").matches(str)) {
                    return StringsKt.startsWith$default(str, Global.HYPHEN, false, 2, (Object) null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e2;
            }
        }

        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            String strEncodedPath = httpUrl.encodedPath();
            if (Intrinsics.areEqual(strEncodedPath, str)) {
                return true;
            }
            return StringsKt.startsWith$default(strEncodedPath, str, false, 2, (Object) null) && (StringsKt.endsWith$default(str, RemoteSettings.FORWARD_SLASH_STRING, false, 2, (Object) null) || strEncodedPath.charAt(str.length()) == '/');
        }

        @JvmStatic
        public final Cookie parse(HttpUrl url, String setCookie) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), url, setCookie);
        }

        public final Cookie parse$okhttp(long j2, HttpUrl url, String setCookie) {
            long j3;
            Cookie cookie;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            int iDelimiterOffset$default = Util.delimiterOffset$default(setCookie, ';', 0, 0, 6, (Object) null);
            int iDelimiterOffset$default2 = Util.delimiterOffset$default(setCookie, '=', 0, iDelimiterOffset$default, 2, (Object) null);
            String domain = null;
            if (iDelimiterOffset$default2 == iDelimiterOffset$default) {
                return null;
            }
            String strTrimSubstring$default = Util.trimSubstring$default(setCookie, 0, iDelimiterOffset$default2, 1, null);
            if (strTrimSubstring$default.length() == 0 || Util.indexOfControlOrNonAscii(strTrimSubstring$default) != -1) {
                return null;
            }
            String strTrimSubstring = Util.trimSubstring(setCookie, iDelimiterOffset$default2 + 1, iDelimiterOffset$default);
            if (Util.indexOfControlOrNonAscii(strTrimSubstring) != -1) {
                return null;
            }
            int i2 = iDelimiterOffset$default + 1;
            int length = setCookie.length();
            String str = null;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = true;
            long maxAge = -1;
            long expires = DatesKt.MAX_DATE;
            while (i2 < length) {
                int iDelimiterOffset = Util.delimiterOffset(setCookie, ';', i2, length);
                int iDelimiterOffset2 = Util.delimiterOffset(setCookie, '=', i2, iDelimiterOffset);
                String strTrimSubstring2 = Util.trimSubstring(setCookie, i2, iDelimiterOffset2);
                String strTrimSubstring3 = iDelimiterOffset2 < iDelimiterOffset ? Util.trimSubstring(setCookie, iDelimiterOffset2 + 1, iDelimiterOffset) : "";
                if (StringsKt.equals(strTrimSubstring2, ClientCookie.EXPIRES_ATTR, true)) {
                    try {
                        expires = parseExpires(strTrimSubstring3, 0, strTrimSubstring3.length());
                        z4 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (StringsKt.equals(strTrimSubstring2, "max-age", true)) {
                    maxAge = parseMaxAge(strTrimSubstring3);
                    z4 = true;
                } else if (StringsKt.equals(strTrimSubstring2, ClientCookie.DOMAIN_ATTR, true)) {
                    domain = parseDomain(strTrimSubstring3);
                    z5 = false;
                } else if (StringsKt.equals(strTrimSubstring2, "path", true)) {
                    str = strTrimSubstring3;
                } else if (StringsKt.equals(strTrimSubstring2, ClientCookie.SECURE_ATTR, true)) {
                    z2 = true;
                } else if (StringsKt.equals(strTrimSubstring2, "httponly", true)) {
                    z3 = true;
                }
                i2 = iDelimiterOffset + 1;
            }
            long j4 = Long.MIN_VALUE;
            if (maxAge != Long.MIN_VALUE) {
                if (maxAge != -1) {
                    j4 = j2 + (maxAge <= 9223372036854775L ? maxAge * ((long) 1000) : Long.MAX_VALUE);
                    if (j4 >= j2) {
                        j3 = DatesKt.MAX_DATE;
                        if (j4 > DatesKt.MAX_DATE) {
                        }
                    } else {
                        j3 = DatesKt.MAX_DATE;
                    }
                    j4 = j3;
                } else {
                    j4 = expires;
                }
            }
            String strHost = url.host();
            if (domain == null) {
                domain = strHost;
                cookie = null;
            } else {
                if (!domainMatch(strHost, domain)) {
                    return null;
                }
                cookie = null;
            }
            if (strHost.length() != domain.length() && PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(domain) == null) {
                return cookie;
            }
            String strSubstring = RemoteSettings.FORWARD_SLASH_STRING;
            if (str == null || !StringsKt.startsWith$default(str, RemoteSettings.FORWARD_SLASH_STRING, false, 2, (Object) cookie)) {
                String strEncodedPath = url.encodedPath();
                int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) strEncodedPath, '/', 0, false, 6, (Object) null);
                if (iLastIndexOf$default != 0) {
                    strSubstring = strEncodedPath.substring(0, iLastIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            } else {
                strSubstring = str;
            }
            return new Cookie(strTrimSubstring$default, strTrimSubstring, j4, domain, strSubstring, z2, z3, z4, z5, null);
        }

        @JvmStatic
        public final List<Cookie> parseAll(HttpUrl url, Headers headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List<String> listValues = headers.values("Set-Cookie");
            int size = listValues.size();
            ArrayList arrayList = null;
            for (int i2 = 0; i2 < size; i2++) {
                Cookie cookie = parse(url, listValues.get(i2));
                if (cookie != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookie);
                }
            }
            if (arrayList == null) {
                return CollectionsKt.emptyList();
            }
            List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }
    }

    private Cookie(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j2;
        this.domain = str3;
        this.path = str4;
        this.secure = z2;
        this.httpOnly = z3;
        this.persistent = z4;
        this.hostOnly = z5;
    }

    public /* synthetic */ Cookie(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j2, str3, str4, z2, z3, z4, z5);
    }

    @JvmStatic
    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return Companion.parse(httpUrl, str);
    }

    @JvmStatic
    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = ClientCookie.DOMAIN_ATTR, imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_domain */
    public final String m10690deprecated_domain() {
        return this.domain;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "expiresAt", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_expiresAt */
    public final long m10691deprecated_expiresAt() {
        return this.expiresAt;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "hostOnly", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_hostOnly */
    public final boolean m10692deprecated_hostOnly() {
        return this.hostOnly;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "httpOnly", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_httpOnly */
    public final boolean m10693deprecated_httpOnly() {
        return this.httpOnly;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "name", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_name */
    public final String m10694deprecated_name() {
        return this.name;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "path", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_path */
    public final String m10695deprecated_path() {
        return this.path;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "persistent", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_persistent */
    public final boolean m10696deprecated_persistent() {
        return this.persistent;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = ClientCookie.SECURE_ATTR, imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_secure */
    public final boolean m10697deprecated_secure() {
        return this.secure;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "value", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_value */
    public final String m10698deprecated_value() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (Intrinsics.areEqual(cookie.name, this.name) && Intrinsics.areEqual(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && Intrinsics.areEqual(cookie.domain, this.domain) && Intrinsics.areEqual(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + Long.hashCode(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + Boolean.hashCode(this.secure)) * 31) + Boolean.hashCode(this.httpOnly)) * 31) + Boolean.hashCode(this.persistent)) * 31) + Boolean.hashCode(this.hostOnly);
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if ((this.hostOnly ? Intrinsics.areEqual(url.host(), this.domain) : Companion.domainMatch(url.host(), this.domain)) && Companion.pathMatch(url, this.path)) {
            return !this.secure || url.isHttps();
        }
        return false;
    }

    public final String name() {
        return this.name;
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=").append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (z2) {
                sb.append(".");
            }
            sb.append(this.domain);
        }
        sb.append("; path=").append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    public final String value() {
        return this.value;
    }
}
