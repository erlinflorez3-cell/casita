package com.statsig.androidsdk;

import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d̉=!,u\bӵLc\u0003\"I\u0006>\u00156B\u0005#4\u0012\u0006\u0017nj?1LeV4Zݷ2\u000f\u0002{<$a(\nQI`2}P\u0015\u007fRut\u0007J\t\n\n\u000f\u001e+\u0007xDOezm\u0012=1pp\u0006ݓ\f܇<ʠžx6\u0013/J4F\n\u001d\u0007*,X\u0010%yqL<\u0016>Q\t:\u0001\u0013m\u0011(Ň\u001e>N\u007ftո:ߑ:HtҗZD1\u0003\u0002H^)o0+O;Gù+\u0013~ѭ6-F:C\u0019Eb\u0011\fj[m\tӭuC\rؒ?)1P\u0002_Vd\u000e\u001d-+}\u00174ýxػ\tQhϯʯ+QkKV%߳{\r"}, d2 = {"\u0012MB,D\u001c\u001e@\rxZG\u000bgr\u0013Nn", "", "\u0012N<\u000e<\u001581{ZgL", "", "", "5dc\u0011B\u0014\u001a7\u0002xXA\biv", "u(;7T=:\u001d)\u000e~euc\r=tU", "\u0014D0!H\u0019\u001eMtlh>\u001bj\u0003\u000eNm\"g0`\u0004\u000b", "", "5dc\u00138\b-C\u0006^t:\u001ajh\u001eSy\u0007d.z\u0003\u0007'\\\u0002", "u(J\u000f", "\u001b@G,F\u001b\u001a@\bxaH\u0016bx\u001a", "", "1qT.g,!b(\nXh5\u0006\t-t\u00042\u0005", "\u001aiPCTuGS(H]m;\bx\u001cL]2\u0005I\u0001\u0015&Ky\u0017\u0012", "Cq[", "4dc0[\u001bQb\u0006~xh9{\u0017", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", ">`a@X\u000bGa\u0006~\ti6\u0006\u0017/", "7m_Bg", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 2, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class DnsTxtQueryKt {
    public static final String DNS_QUERY_ENDPOINT = "https://cloudflare-dns.com/dns-query";
    public static final int MAX_START_LOOKUP = 200;
    private static final byte[] FEATURE_ASSETS_DNS_QUERY = {0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, Ascii.CR, 102, 101, 97, 116, 117, 114, 101, 97, 115, 115, 101, 116, 115, 3, 111, 114, 103, 0, 0, 16, 0, 1};
    private static final List<Character> DOMAIN_CHARS = CollectionsKt.listOf((Object[]) new Character[]{'i', 'e', 'd'});

    /* JADX INFO: renamed from: com.statsig.androidsdk.DnsTxtQueryKt$fetchTxtRecords$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,\b\bDRo|\u0004W\u0006>éFH\u000f$<\u0012&\u0007\u0015ia0rf\u000f\u0097\u0011"}, d2 = {"\n`]<a@F])\rS", "", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<String>>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<String>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HttpURLConnection httpURLConnectionCreateHttpConnection = DnsTxtQueryKt.createHttpConnection(DnsTxtQueryKt.DNS_QUERY_ENDPOINT);
            try {
                try {
                    OutputStream outputStream = Callback.getOutputStream(httpURLConnectionCreateHttpConnection);
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(DnsTxtQueryKt.getFEATURE_ASSETS_DNS_QUERY());
                        outputStream.write(byteArrayOutputStream.toByteArray());
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(outputStream, null);
                        if (Callback.getResponseCode(httpURLConnectionCreateHttpConnection) != 200) {
                            throw new DnsTxtFetchError("Failed to fetch TXT records from DNS");
                        }
                        InputStream inputStream = Callback.getInputStream(httpURLConnectionCreateHttpConnection);
                        Intrinsics.checkNotNullExpressionValue(inputStream, "inputStream");
                        return DnsTxtQueryKt.parseDnsResponse(ByteStreamsKt.readBytes(inputStream));
                    } finally {
                    }
                } catch (Exception unused) {
                    throw new DnsTxtFetchError("Request timed out while fetching TXT records");
                }
            } finally {
                httpURLConnectionCreateHttpConnection.disconnect();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpURLConnection createHttpConnection(String str) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        if (uRLConnectionOpenConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setRequestMethod(HttpPost.METHOD_NAME);
        httpURLConnection.setRequestProperty("Content-Type", "application/dns-message");
        httpURLConnection.setRequestProperty("Accept", "application/dns-message");
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }

    public static final Object fetchTxtRecords(Continuation<? super List<String>> continuation) {
        Dispatchers dispatchers = Dispatchers.INSTANCE;
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(null), continuation);
    }

    public static final List<Character> getDOMAIN_CHARS() {
        return DOMAIN_CHARS;
    }

    public static final byte[] getFEATURE_ASSETS_DNS_QUERY() {
        return FEATURE_ASSETS_DNS_QUERY;
    }

    public static final List<String> parseDnsResponse(byte[] input) throws DnsTxtParseError {
        Intrinsics.checkNotNullParameter(input, "input");
        Iterator<IndexedValue<Byte>> it = ArraysKt.withIndex(input).iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            IndexedValue<Byte> next = it.next();
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            IndexedValue<Byte> indexedValue = next;
            int iComponent1 = indexedValue.component1();
            byte bByteValue = indexedValue.component2().byteValue();
            if (iComponent1 < 200 && ((char) bByteValue) == '=' && iComponent1 > 0 && getDOMAIN_CHARS().contains(Character.valueOf((char) input[iComponent1 - 1]))) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new DnsTxtParseError("Failed to parse TXT records from DNS");
        }
        byte[] bArrCopyOfRange = ArraysKt.copyOfRange(input, i2 - 1, input.length);
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        return StringsKt.split$default((CharSequence) new String(bArrCopyOfRange, UTF_8), new String[]{","}, false, 0, 6, (Object) null);
    }
}
