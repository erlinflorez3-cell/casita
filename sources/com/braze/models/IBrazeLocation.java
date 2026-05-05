package com.braze.models;

import bo.app.g00;
import kotlin.Metadata;
import org.json.JSONObject;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>\u000f6B\u0005/2w\u000eј\u0005xi6TgX.\u0001SX\u000e$zCtm2u[;\u0004\u001b4F_ҎP˗krb\\\u0011E\u001d\tf\u000bx2aU'^H3\tԶqУ7Q\b??e\u00039U4@+P{\u001b\u007fH+~4MڀEƚ\u0010\u0016HBvA`\u0015\u001e\u0019(\u001d\u001e@6\u007fL]\u001er\rՆnҺ>3;\u0005oL\\/0D\u000bZ%Hj&;w\u0018B\u0002Ï9߱\u0019)k\u0005\r^iGǚ>мܸ\u0005l/)1h\"V͕\\\u0010Э\u0019*"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI\fXM|,\u0017.y\f8\u0006)?bS", "\u001ab^:\")KO.~Df6{\t6sI\ffP\u0010z VyrJ\u0001.\u000b", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "", "5dc\u0019T;Bb)}z", "u(3", ":`c6g<=S", "5dc\u0019b5@W(\u000fy^", ":n]4\\;NR\u0019", "5dc\u000e_;Bb)}z", "u(;7T=:\u001d z\u0004`u[\u0013?b\u0007(Q", "/kc6g<=S", "5dc\u000eV*N`\u0015|\u000f", "/bRBe(<g", "5dc#X9MW\u0017z\u0002:*z\u0019<a}<", "DdaA\\*:Zt|xn9x\u0007C", "\u0011n\\=T5B]\"", "0n\u001e.c7\bUcI", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public interface IBrazeLocation extends IPutIntoJson<JSONObject> {
    public static final String ACCURACY = "ll_accuracy";
    public static final String ALTITUDE = "altitude";
    public static final g00 Companion = g00.f696a;
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String VERTICAL_ACCURACY = "alt_accuracy";

    Double getAccuracy();

    Double getAltitude();

    double getLatitude();

    double getLongitude();

    Double getVerticalAccuracy();
}
