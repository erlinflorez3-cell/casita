package com.reactlibrary.react.http;

import cz.msebera.android.httpclient.client.methods.HttpPost;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import yg.InterfaceC1492Gx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004O\u00128\u000b4J\u0005ӳܧ\u0012\u000eј\u0017pI2Tev\u008c\u0001Rj\u001cq{D(i$\nCiV۟\u0002\"\u0017Q\u001fvunbZ9DǇ\n\u001c\u0001̓DK[{k\u0016w2Ht(3Su&9f{\u001f\u0005&:\u000b8\u007f\u000ei\u001a0RǞz\u0006"}, d2 = {"\u001ab^:\"9>O\u0017\u000e\u0002b)\n\u0005<yI5{<~&`J~\u001dG@\bDh\t\b7|\u00198L\u0019", "", "@`f#T3NS", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u00114", "5dc\u001fT>/O \u000fz", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u0015DC", "\u001eNB!", "\u001eTC", "\u001e@C\u0010;", "\u0012D;\u0012G\f", "\u0016D0\u0011", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class HttpMethod {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HttpMethod[] $VALUES;
    private final String rawValue;
    public static final HttpMethod GET = new HttpMethod("GET", 0, "GET");
    public static final HttpMethod POST = new HttpMethod(HttpPost.METHOD_NAME, 1, HttpPost.METHOD_NAME);
    public static final HttpMethod PUT = new HttpMethod("PUT", 2, "PUT");
    public static final HttpMethod PATCH = new HttpMethod("PATCH", 3, "PATCH");
    public static final HttpMethod DELETE = new HttpMethod("DELETE", 4, "DELETE");
    public static final HttpMethod HEAD = new HttpMethod("HEAD", 5, "HEAD");

    private static final /* synthetic */ HttpMethod[] $values() {
        return new HttpMethod[]{GET, POST, PUT, PATCH, DELETE, HEAD};
    }

    static {
        HttpMethod[] httpMethodArr$values = $values();
        $VALUES = httpMethodArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(httpMethodArr$values);
    }

    private HttpMethod(String str, int i2, String str2) {
        this.rawValue = str2;
    }

    public static EnumEntries<HttpMethod> getEntries() {
        return $ENTRIES;
    }

    public static HttpMethod valueOf(String str) {
        return (HttpMethod) Enum.valueOf(HttpMethod.class, str);
    }

    public static HttpMethod[] values() {
        return (HttpMethod[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
