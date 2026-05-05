package okhttp3.internal.ws;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Headers;
import okhttp3.internal.Util;
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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\r(4\u0012}\u001anjG<LeN.Xݾ0%ӆ\u001aNT[Rp{:oZA2\u000fUNug\u0007J\t\fS\u0017\f\u0016\u0007lDKkw\f\u0015\u001f8HoM7eok:p|<\u0005.7::\u0010\u0004/\u001d:N\u0016v\tIc\f@1Pv@R\u001bT\u001d\u001a@\u0007̧$\u0001,d0UDR\u0005]h0iʌj\u000b\\5jH~c\ftWm̠wҐ\"+NC}\u001c3`\u001b\u0007\u0001\\\u0006ƨ@:K\u0013v?)AH\"Z|ޠ\u0001Џ\u0019+]\u0019&y4k\u001dQ\u000f\rm̊P,R^\u001e@w)|Sʤ\u0005VR5YF-HǑ8\u00149t\u0001SXP0_r\b\u0001aD\u0019=\u0002I*g\u001e\u0017Wg;'RO{3\u000eN+\u0007n/`l\u0010v\u0014IW(W7QNC`N8Zms\npp\tB\u0004^HFÂz 2\u00173I$J14\u0004\u0002vE\u0018|\u0013t\u0001U\u007fQv?hę\u0017\u007f1\u0017!rD\u0013\b2ăS!8\u001fc4T5~8\u0017.s\u0010<O&XU]\u0001\u0002j{vPʯ.7Igp\u0004\u0010m8\r6kU:ߌc؏z\u0016G<p\u000e)tPW$Z\u000b)X6\u001fТ\u0012ȑ\u007fDVۼc@Mq44Z2O`kȅ\u0005ٿFA\u0005ȁ0lv\u0015\u0017VI#1lZx_ɞRʷtqoxW5Mn03YQc\u001a\\Yx׃6č'\u0007\u0007͞PUuS_L\u001b\u0017,YR\u0095\u0018׀=Q7ˋш\u0013\u001a"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nr\u0017\u00145y\fBv4\u0015l\r @{\u001a8VQ\u0011", "", ">da\u001aX:LO\u001b~Y^-\u0004\u0005>e", "", "1kX2a;&O,p~g+\u0007\u001b\fi\u000f6", "", "1kX2a;']v\t\u0004m,\u0010\u0018\u001ea\u0006(\u0006Q\u0001$", "AdaCX9&O,p~g+\u0007\u001b\fi\u000f6", "AdaCX9']v\t\u0004m,\u0010\u0018\u001ea\u0006(\u0006Q\u0001$", "CmZ;b>GD\u0015\u0006\u000b^:", "uY;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016u}\u001cC\u0001\n\u0006}!>[G\u0004@|\u00160MP\u0011`)a\u0006", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n_F", "uY;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016u}\u001cC\u0001\n\u0006}!>[G\u0004@|\u00160MP\u0011`)a{rg<\u0016r7\u001c@+P[N9eNy\u0007& $\u007fN(z\u000fWG$}$J.\b5W\u0006Eq\u000fa", "3pd._:", "=sW2e", "6`b566=S", "<n2<a;>f(mvd,\u0007\u001a/r", "1kX2a;(`\u001d\u0001~g(\f\t.", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WebSocketExtensions {
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјnjO0L͜N\u0093Siճ?k*3d`*qٴ?U(}j\u0015]Q\u007fg\u001dN\u000b\u000fQ\u0014\u001e\u0016'p|Ucyu\u0012=4\u0019Ħ\u0012ݯQoEʠƄx="}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nr\u0017\u00145y\fBv4\u0015l\r @{\u001a8VQyI>& dj=\u0011l\u0002", "", "u(E", "\u0016D0\u00118\u00198Ex[tL\u0016Zn\u000fTy\bn/`\u007f\u0005+Yv", "", ">`a@X", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nr\u0017\u00145y\fBv4\u0015l\r @{\u001a8VQ\u0011", "@db=b5LS{~v],\n\u0017", "\u001anZ5g;I!bazZ+|\u0016=;", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WebSocketExtensions parse(Headers responseHeaders) throws IOException {
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z2 = false;
            Integer intOrNull = null;
            boolean z3 = false;
            Integer intOrNull2 = null;
            boolean z4 = false;
            boolean z5 = false;
            for (int i2 = 0; i2 < size; i2++) {
                if (StringsKt.equals(responseHeaders.name(i2), "Sec-WebSocket-Extensions", true)) {
                    String strValue = responseHeaders.value(i2);
                    int i3 = 0;
                    while (i3 < strValue.length()) {
                        int iDelimiterOffset$default = Util.delimiterOffset$default(strValue, AbstractJsonLexerKt.COMMA, i3, 0, 4, (Object) null);
                        int iDelimiterOffset = Util.delimiterOffset(strValue, ';', i3, iDelimiterOffset$default);
                        String strTrimSubstring = Util.trimSubstring(strValue, i3, iDelimiterOffset);
                        int i4 = iDelimiterOffset + 1;
                        if (StringsKt.equals(strTrimSubstring, "permessage-deflate", true)) {
                            if (z2) {
                                z5 = true;
                            }
                            i3 = i4;
                            while (i3 < iDelimiterOffset$default) {
                                int iDelimiterOffset2 = Util.delimiterOffset(strValue, ';', i3, iDelimiterOffset$default);
                                int iDelimiterOffset3 = Util.delimiterOffset(strValue, '=', i3, iDelimiterOffset2);
                                String strTrimSubstring2 = Util.trimSubstring(strValue, i3, iDelimiterOffset3);
                                String strRemoveSurrounding = iDelimiterOffset3 < iDelimiterOffset2 ? StringsKt.removeSurrounding(Util.trimSubstring(strValue, iDelimiterOffset3 + 1, iDelimiterOffset2), (CharSequence) "\"") : null;
                                i3 = iDelimiterOffset2 + 1;
                                if (StringsKt.equals(strTrimSubstring2, "client_max_window_bits", true)) {
                                    if (intOrNull != null) {
                                        z5 = true;
                                    }
                                    intOrNull = strRemoveSurrounding != null ? StringsKt.toIntOrNull(strRemoveSurrounding) : null;
                                    if (intOrNull == null) {
                                        z5 = true;
                                    }
                                } else if (StringsKt.equals(strTrimSubstring2, "client_no_context_takeover", true)) {
                                    if (z3) {
                                        z5 = true;
                                    }
                                    if (strRemoveSurrounding != null) {
                                        z5 = true;
                                    }
                                    z3 = true;
                                } else if (StringsKt.equals(strTrimSubstring2, "server_max_window_bits", true)) {
                                    if (intOrNull2 != null) {
                                        z5 = true;
                                    }
                                    intOrNull2 = strRemoveSurrounding != null ? StringsKt.toIntOrNull(strRemoveSurrounding) : null;
                                    if (intOrNull2 == null) {
                                        z5 = true;
                                    }
                                } else if (StringsKt.equals(strTrimSubstring2, "server_no_context_takeover", true)) {
                                    if (z4) {
                                        z5 = true;
                                    }
                                    if (strRemoveSurrounding != null) {
                                        z5 = true;
                                    }
                                    z4 = true;
                                } else {
                                    z5 = true;
                                }
                            }
                            z2 = true;
                        } else {
                            i3 = i4;
                            z5 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z2, intOrNull, z3, intOrNull2, z4, z5);
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public WebSocketExtensions(boolean z2, Integer num, boolean z3, Integer num2, boolean z4, boolean z5) {
        this.perMessageDeflate = z2;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z3;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z4;
        this.unknownValues = z5;
    }

    public /* synthetic */ WebSocketExtensions(boolean z2, Integer num, boolean z3, Integer num2, boolean z4, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? false : z2, (i2 + 2) - (2 | i2) != 0 ? null : num, (4 & i2) != 0 ? false : z3, (-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? num2 : null, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? false : z4, (i2 & 32) == 0 ? z5 : false);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z2, Integer num, boolean z3, Integer num2, boolean z4, boolean z5, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            z2 = webSocketExtensions.perMessageDeflate;
        }
        if ((2 & i2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            z3 = webSocketExtensions.clientNoContextTakeover;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        if ((i2 + 16) - (16 | i2) != 0) {
            z4 = webSocketExtensions.serverNoContextTakeover;
        }
        if ((i2 & 32) != 0) {
            z5 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(z2, num, z3, num2, z4, z5);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean z2, Integer num, boolean z3, Integer num2, boolean z4, boolean z5) {
        return new WebSocketExtensions(z2, num, z3, num2, z4, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && Intrinsics.areEqual(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && Intrinsics.areEqual(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public int hashCode() {
        boolean z2 = this.perMessageDeflate;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = r02 * 31;
        Integer num = this.clientMaxWindowBits;
        int iHashCode = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z3 = this.clientNoContextTakeover;
        ?? r03 = z3;
        if (z3) {
            r03 = 1;
        }
        int i3 = (iHashCode + r03) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int iHashCode2 = (i3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z4 = this.serverNoContextTakeover;
        ?? r04 = z4;
        if (z4) {
            r04 = 1;
        }
        int i4 = (iHashCode2 + r04) * 31;
        boolean z5 = this.unknownValues;
        return i4 + (z5 ? 1 : z5);
    }

    public final boolean noContextTakeover(boolean z2) {
        return z2 ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ')';
    }
}
