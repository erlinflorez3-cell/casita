package okhttp3;

import io.sentry.rrweb.RRWebVideoEvent;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
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
@Metadata(bv = {}, d1 = {"Яh\u001d<K!&i\u000e^Lc\u000b\u0004I\u0006>\u00176Ȑ\u0007\":!\u007f\u0007lkA0RkP.XS2\u000fy\u0003<řc$\u007fLC٥\"}0ޛWNmhvJp\u000bKƤ\u000e\u0016\u000fj4I[xe\u0012\u001dXJoE3UoKYhҚ>\u000562*8\u007f\u0005\t\u001a8j\u0018v\taS\f\u00184V\u0081Xw=_\u0015(\"\u0012N\"\u0011\u001e\u000bh^8Xl\f;]#1hzNK\u0005p\u0010S\rV^5\u000f\u000fg.-P7c\u0016SVΫ\u000bRiCKC\u007fF\u001dhU1sZ\u0002bNX. E1]\u001aut<[3_'І's`qZh\u0010>v)|=@\u0012\u001e\u001e'v/sՆfP\u001cA\u0006\u000bUVO0pr\u0004\tqN\u0017S\u0001{;G.~Sw:Gbg\u007f\u0013\u001d6#/og`\u001d\u0014n*3T&Xwe\tVVd\"kM{\u0014|r\u0004:\u0004^H\u00101\f\u0011\\\u0018S7\nPi݀kJTRw\u000f\u0005\u000fi\u0004m``X\"\u001d\u001d\u007f4\u0017%rJt\u0007{P\u0003YZ+\u0016 b\"\u0016\bA<%\u0003J'=\u0010|V/nҷQ]\u0010Bw|Ew\u0007}\u001eYI^a6ak gbx$?jc3x\u0015a\u001c\u0012h}@\"`I1$@\bRp$\u0013`@\" BDI\u0019\u000b\u001c\u0011\u0015,eY\u0003\u0019ajh>\u007f\u0003ST\u0007w4\r\t/Q-\u0005}i\u0011O<~p\"[B\u007f8oĢWɋl6\u0005#\u0015\u0004D\u000fUmdGzsL;ʀ\u007f$.\u001c?W=Eш\u0013%"}, d2 = {"\u001anZ5g;I!bazZ+|\u0016=;", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "", "<`\\2f\bGR\nz\u0002n,\u000b", "", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004q", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "Ahi2", "", "u(8", "0xc266N\\(", "", "3pd._:", "", "=sW2e", "", "5dc", "<`\\2", "5dc\u0011T;>", "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", "5dc\u0016a:MO\"\u000e", "\u001aiPCTuMW!~DB5\u000b\u0018+n\u000f}", "6`b566=S", "7sT?T;H`", "", "7mS2k", "<`\\2f", "", "<df\u000fh0ER\u0019\f", "\u001anZ5g;I!bazZ+|\u0016=$\\8\u007fG\u007f\u0017$\u001d", "zcT=e,<O(~yX:\u0001\u001e/", "Bn<B_;B[\u0015\n", "", "", "BnBAe0GU", "D`[BX", "D`[BX:", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>*6B\r.4\u0012}\u000bnjO0Le^.ZS0\u000fs{J$c$wIQ٥J}P\b\u0010Q˗knXZSO\u001d\f.x\u0019ߚyY\u0007d*\u000f`E8UAS\b=gś%:\u0013(J\"f|5\u0005(3`\u0010%\u0005\nPT&>F\t:\u0001҈}\t(\u001a\u001e>N\u0004N`uWNH\u001bh\u0003C1\t\u0002B|ϋ\u00104\u000bU%F\u0003*=zo'C@e8]1a\u000f\u001fR\nΪ3C\u007fJ\u001dhU5s\\\u0002fNX.ϬE/]\u0014urT_Kĩԃ\u0010'1_,f^\u001d@w)Ԉ=@\u0012\u0016\u001e'v1]\u001et\u0011&3#u\u001aóг\u0006^H\u0010CuD(=\u007faٿi\u001ftYy;GQg\u007f\u0013\u00166#/qi_b x\u0015Ib@b?dX?^M8\\mq\u0012xz\u0002X\u0007vϡ\u007fw\b\u001fB/%eكi'/s\u001aHrj?\u001cn}ki\u0001̲p&|\u001eO*7\u000f\u000bHr\u000e\u0004P\u0003brҒMdk\u0015\u0013 \u0013Nο(@/-(N}k\u001an[f\"%]q}ձn4%eNv3cȡ\u0014\u0014oZ\u000f\u0014m?\u0013\tfoZS:]#̬\"\u0003`x\u0011\u0010\u0002TP\u001c\u0013`B \u001e\u000bκ3Ǭ`\u001bPґ6DG\u0001\u0017d˜l&"}, d2 = {"\u001anZ5g;I!bazZ+|\u0016=$\\8\u007fG\u007f\u0017$\u001d", "", "u(E", "<`\\2f\bGR\nz\u0002n,\u000b", "", "", "5dc\u001bT4>at\byO(\u0004\u0019/s>2\u0002C\u0010&\"", "u(;7T=:\u001d)\u000e~euc\r=tU", "/cS", ":h]2", "<`\\2", "D`[BX", "\u001aiPCTuMW!~DB5\u000b\u0018+n\u000f}", "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", "/cS\u000e_3", "6dP1X9L", "\u001anZ5g;I!bazZ+|\u0016=;", "/cS\u0019X5BS\"\u000e", "/cS\u0019X5BS\"\u000e9h2\u007f\u0018>p", "/cS\"a::T\u0019g\u0005g\b\u000b\u00073i", "0tX9W", "5dc", "@d\\<i,\u001aZ ", "Adc", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) line, AbstractJsonLexerKt.COLON, 0, false, 6, (Object) null);
            if (iIndexOf$default == -1) {
                throw new IllegalArgumentException(("Unexpected header: " + line).toString());
            }
            String strSubstring = line.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = StringsKt.trim((CharSequence) strSubstring).toString();
            String strSubstring2 = line.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            add(string, strSubstring2);
            return this;
        }

        public final Builder add(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Headers.Companion.checkName(name);
            Headers.Companion.checkValue(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder add(String name, Instant value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            add(name, new Date(value.toEpochMilli()));
            return this;
        }

        public final Builder add(String name, Date value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            add(name, DatesKt.toHttpDateString(value));
            return this;
        }

        public final Builder addAll(Headers headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                addLenient$okhttp(headers.name(i2), headers.value(i2));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) line, AbstractJsonLexerKt.COLON, 1, false, 4, (Object) null);
            if (iIndexOf$default != -1) {
                String strSubstring = line.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp("", strSubstring3);
            } else {
                addLenient$okhttp("", line);
            }
            return this;
        }

        public final Builder addLenient$okhttp(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.namesAndValues.add(name);
            this.namesAndValues.add(StringsKt.trim((CharSequence) value).toString());
            return this;
        }

        public final Builder addUnsafeNonAscii(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Headers.Companion.checkName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        public final String get(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int size = this.namesAndValues.size() - 2;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return null;
            }
            while (!StringsKt.equals(name, this.namesAndValues.get(size), true)) {
                if (size == progressionLastElement) {
                    return null;
                }
                size -= 2;
            }
            return this.namesAndValues.get(size + 1);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i2 = 0;
            while (i2 < this.namesAndValues.size()) {
                if (StringsKt.equals(name, this.namesAndValues.get(i2), true)) {
                    this.namesAndValues.remove(i2);
                    this.namesAndValues.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        public final Builder set(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Headers.Companion.checkName(name);
            Headers.Companion.checkValue(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder set(String name, Instant value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return set(name, new Date(value.toEpochMilli()));
        }

        public final Builder set(String name, Date value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            set(name, DatesKt.toHttpDateString(value));
            return this;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\":\u001e\u007f\u0007llA0RtP.XS2\u000f\u0002{<$a&yCIw\"}(\tUȥh}ñzZ9BO\u000b\u001cx̶0Icx& \u001d3Zom5}sK<xtd\tf2jN\b\n\u0019\u001aXJ@z\tIc\f@4ptHU%M3\u001eX\u0006\u0007C\u000f%tid5vp\u000eD=+\u001boRP7_^\u0001{\u0016vX5\u0010\u000faL/\u00077߱\u0019%a\rOsiJ\u001b? I5x5/CQ\u0004[<W\u0010\u0014C/}\u0016}rT`KVԃ\u0010)1\\qY\u0019/6\u0005\u0013{;H4\u001e\u0014/`6=\u001el\u0007\u001e3#v\u0002Ip\u0002\rFF\u007fˋ:\u0019+\u000fA9\u0002:t^y;GZg\f\u0013\u001d6/\u0011p1[\u0003\u0012p\u0017+T&U_b\u0007B˓R\n_L6\u001f~t\u001a*2<o\f?}!.E)G]I#Oo0Y\u000blЛ\t`n`\u05c8V["}, d2 = {"\u001anZ5g;I!bazZ+|\u0016=$]2\u0004K| \u001bQxc", "", "u(E", "1gT0^\u0015:[\u0019", "", "<`\\2", "", "1gT0^\u001d:Z)~", "D`[BX", "5dc", "<`\\2f\bGR\nz\u0002n,\u000b", "", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u0011*@gE\u001a^o]B\t-\u001a]\u0004+PN$", "6dP1X9L=\u001a", "\u001anZ5g;I!bazZ+|\u0016=;", "=e", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004g!\u001dJ~\u001dGDn\u0018Yy\u001f7z$\u0004", "zcT=e,<O(~yX6}", "6dP1X9L", "", "Bn72T+>`'", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void checkName(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str).toString());
                }
            }
        }

        public final void checkValue(String str, String str2) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    throw new IllegalArgumentException((Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i2), str2) + (Util.isSensitiveHeader(str2) ? "" : ": " + str)).toString());
                }
            }
        }

        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(length, 0, -2);
            if (progressionLastElement > length) {
                return null;
            }
            while (!StringsKt.equals(str, strArr[length], true)) {
                if (length == progressionLastElement) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = ")[\n8\u0006}$e\u0018T7\u0011U\u0019kbk\f\u000e?\u0019m\u001ae\u007fU|", replaceWith = @ReplaceWith(expression = "headers.toHeaders()", imports = {}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_of */
        public final Headers m10709deprecated_of(Map<String, String> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            return of(headers);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = ")[\n8\u0006}$e\u0018U)\bUT/V]Z\u0010,\t", replaceWith = @ReplaceWith(expression = "headersOf(*namesAndValues)", imports = {}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_of */
        public final Headers m10710deprecated_of(String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            return of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        @JvmStatic
        public final Headers of(Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i2 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = StringsKt.trim((CharSequence) key).toString();
                String string2 = StringsKt.trim((CharSequence) value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i2] = string;
                strArr[i2 + 1] = string2;
                i2 += 2;
            }
            return new Headers(strArr, null);
        }

        @JvmStatic
        public final Headers of(String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                String str = strArr[i3];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr[i3] = StringsKt.trim((CharSequence) str).toString();
            }
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strArr.length - 1, 2);
            if (progressionLastElement >= 0) {
                while (true) {
                    String str2 = strArr[i2];
                    String str3 = strArr[i2 + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i2 == progressionLastElement) {
                        break;
                    }
                    i2 += 2;
                }
            }
            return new Headers(strArr, null);
        }
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public /* synthetic */ Headers(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    @JvmStatic
    public static final Headers of(Map<String, String> map) {
        return Companion.of(map);
    }

    @JvmStatic
    public static final Headers of(String... strArr) {
        return Companion.of(strArr);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = RRWebVideoEvent.JsonKeys.SIZE, imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_size */
    public final int m10708deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            length += (long) this.namesAndValues[i2].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    public final String get(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Companion.get(this.namesAndValues, name);
    }

    public final Date getDate(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String str = get(name);
        if (str != null) {
            return DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    public final Instant getInstant(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Date date = getDate(name);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i2 = 0; i2 < size; i2++) {
            pairArr[i2] = TuplesKt.to(name(i2), value(i2));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    public final String name(int i2) {
        return this.namesAndValues[i2 * 2];
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            treeSet.add(name(i2));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        CollectionsKt.addAll(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String strName = name(i2);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strName.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i2));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String strName = name(i2);
            String strValue = value(i2);
            sb.append(strName);
            sb.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb.append(strValue);
            sb.append("\n");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String value(int i2) {
        return this.namesAndValues[(i2 * 2) + 1];
    }

    public final List<String> values(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            if (StringsKt.equals(name, name(i2), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i2));
            }
        }
        if (arrayList == null) {
            return CollectionsKt.emptyList();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }
}
