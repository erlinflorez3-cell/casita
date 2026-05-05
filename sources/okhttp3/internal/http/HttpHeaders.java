package okhttp3.internal.http;

import cz.msebera.android.httpclient.message.BasicHeaderValueFormatter;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.ByteString;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d̉=!4i\bDJc|\u0004O\u000f8é6B\u0015\"4ߚ\u007f\u0007t\tA0ZeP.hS2şs{B0c$wCCU(}*\teNo˧vJh*K\u000f\f\u0017\u0001jBI]ތe\u0012%2JoE5UoK<hҚN\u0013.3:8(\u00071\u001e8K(v)G\u0012\u0011*FNuRX\u001dO\u0015\u001a@\rl&)\u001e\u000bo~:Vuu:]-\u001bqPY?_^~u\rtX?%\u0005m6+nD]\u0015Sa3\u0011`jW\tOsM\u0005\u0017.U;\u0010soBf\u0011,\u0017AN;g\u001b&\u000b\u0013\u0018`$39a{Mf\rV\u0002#{;JJ\u000e\u001e?VAE\u001a\u0015\u001563#\u0007\u0004D^\u0017vB.\u0011\u0012:%<\u00183YA3p_yS\u0019|9$\u0005;,i\u0001\u00073im&`C\u001d|w\u007f?\u0002DKbf\n\bX4\u0004\u0011n\u0010Ï\u001c0u~\u0006Ɉ\u0013ѧ\u001b%?كY//k\u001aHrfMݖbĈWiZ̲ـ&\u000b"}, d2 = {"\u001fT>!8\u000b8A\bk^G\u000evg\u000fLc\u0010_/`\u0004\u0005", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\"N:\u0012A&\u001d3\u007fbbB\u001b\\u\u001d", "6`b\u000fb+R", "", "@db=b5LS", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", ">`a@X\nAO \u0006zg.|\u0017", "", "\u001anZ5g;I!b\\}Z3\u0004\t8g\u007f}", "\u001anZ5g;I!bazZ+|\u0016=;", "6dP1X9'O!~", "", ">q^:\\:>au\tyr", "@dP16/:Z ~\u0004`,_\t+d\u007f5", "", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "@dbB_;", "", "@dP1D<Hb\u0019}hm9\u0001\u00121", "@dP1G6DS\"", "@dR2\\=>6\u0019zy^9\u000b", "\u001anZ5g;I!b\\\u0005h2\u0001\t\u0014a\r}", "Cq[", "\u001anZ5g;I!ba\nm7l\u00166;", "6dP1X9L", "AjX=66F[\u0015\rVg+n\f3t\u007f6\u0007<~\u0017", "AsP?g:0W(\u0002", ">qT3\\?", "", "=jWAg7"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class HttpHeaders {
    private static final ByteString QUOTED_STRING_DELIMITERS = ByteString.Companion.encodeUtf8(BasicHeaderValueFormatter.UNSAFE_CHARS);
    private static final ByteString TOKEN_DELIMITERS = ByteString.Companion.encodeUtf8("\t ,=");

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0011U;A\u0001\u0003\u001c\\j\u0007;\u0010`%;`pQ\r", replaceWith = @ReplaceWith(expression = "response.promisesBody()", imports = {}))
    @InterfaceC1492Gx
    public static final boolean hasBody(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String headerName) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (StringsKt.equals(headerName, headers.name(i2), true)) {
                try {
                    readChallengeHeader(new Buffer().writeUtf8(headers.value(i2)), arrayList);
                } catch (EOFException e2) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e2);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        if (Intrinsics.areEqual(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !StringsKt.equals(HTTP.CHUNK_CODING, Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b3, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b3, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void readChallengeHeader(okio.Buffer r7, java.util.List<okhttp3.Challenge> r8) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(okio.Buffer, java.util.List):void");
    }

    private static final String readQuotedString(Buffer buffer) throws EOFException {
        if (buffer.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Buffer buffer2 = new Buffer();
        while (true) {
            long jIndexOfElement = buffer.indexOfElement(QUOTED_STRING_DELIMITERS);
            if (jIndexOfElement == -1) {
                return null;
            }
            if (buffer.getByte(jIndexOfElement) == 34) {
                buffer2.write(buffer, jIndexOfElement);
                buffer.readByte();
                return buffer2.readUtf8();
            }
            if (buffer.size() == jIndexOfElement + 1) {
                return null;
            }
            buffer2.write(buffer, jIndexOfElement);
            buffer.readByte();
            buffer2.write(buffer, 1L);
        }
    }

    private static final String readToken(Buffer buffer) {
        long jIndexOfElement = buffer.indexOfElement(TOKEN_DELIMITERS);
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        if (jIndexOfElement != 0) {
            return buffer.readUtf8(jIndexOfElement);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl url, Headers headers) {
        Intrinsics.checkNotNullParameter(cookieJar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.Companion.parseAll(url, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(url, all);
    }

    private static final boolean skipCommasAndWhitespace(Buffer buffer) throws EOFException {
        boolean z2 = false;
        while (!buffer.exhausted()) {
            byte b2 = buffer.getByte(0L);
            if (b2 == 44) {
                buffer.readByte();
                z2 = true;
            } else {
                if (b2 != 32 && b2 != 9) {
                    break;
                }
                buffer.readByte();
            }
        }
        return z2;
    }

    private static final boolean startsWith(Buffer buffer, byte b2) {
        return !buffer.exhausted() && buffer.getByte(0L) == b2;
    }
}
