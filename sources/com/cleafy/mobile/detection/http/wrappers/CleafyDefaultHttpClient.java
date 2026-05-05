package com.cleafy.mobile.detection.http.wrappers;

import com.cleafy.mobile.detection.agent.Cleafy;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
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
@Deprecated(message = "\u001cU\u0011t\u0005|$ldKg\t_)kPa\f\u001e:\u000ev\u0013\u0012ZKtkc\u00018N|`t%YemGZkr#\u0018\u0016e\t7\u0018Z@fJ@+KU\u0019I\u001f6\u0018\u0007x\r\u0005C03\u0012\u0010m\u0005\u0014\u0005M\u001eS:J<<6er@c0}\u000e3AaY#+>}!\u0010:X+m#C=f\u0010#:)Ojm.=%TGFT&cG'\u0012\u001eQ2vp\u0019X\\\u0017Q\n1\u000fD\u0006bE6S0h]tuKey{\u0013s|oo\u001e/}Zv\\|o^~SoN'n\u000e cYF\u001eZx\u0011\u001a%mP!CR_PQcLh:", replaceWith = @ReplaceWith(expression = "com.cleafy.mobile.detection.agent.Cleafy.defaultHttpClientFactory.create(connman, params)", imports = {"com.cleafy.mobile.detection.agent.Cleafy"}))
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007loOӄtev-\u0013p0\u0014{\u0004:$i$\nEQTH~2\u0011UNui\u0007Lp\nq\u0012و\u001axx0֘Y}"}, d2 = {"\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@(Dh\tiIz\u00129XCHy}{\u001ch]:\u001bB,Or7N[1;k]PD\u0018\u0012c\u001d$", "\u001ana4\"(IO\u0017\u0002z(/\f\u0018:/\u00040\u0007GJ\u0015\u001eKo\u0017K@\u00045Zy0>|x=\\N\u0019r8\u001e\u001ew7", "1n];`(G", "\u001ana4\"(IO\u0017\u0002z(/\f\u0018:/}2\u0005IJt\u001eKo\u0017KT/>b}\u001eFq 75?Dg6\u001e\">", ">`a.`:", "\u001ana4\"(IO\u0017\u0002z(/\f\u0018:/\u000b$\t<\t%`*~\u001dGa!BU\u0006.\r", "uK^?Zu:^\u0015|}^u\u007f\u0018>pI&\u0006I\n`tNs\u000eE\u0006\u0003?b\u0007 5|\u001a8V+7t0 \u0015u7 \u0011p.\u0018r2CJQ,&U\u0002L\u001f[e\n['\u0015\u0013#$3}O\"\u001b\u0015(Q\u0010\u0011,q", "/fT;g&KS ~vl,"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CleafyDefaultHttpClient extends DefaultHttpClient {
    public CleafyDefaultHttpClient() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public CleafyDefaultHttpClient(ClientConnectionManager clientConnectionManager) {
        this(clientConnectionManager, null, 2, 0 == true ? 1 : 0);
    }

    public CleafyDefaultHttpClient(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        super(clientConnectionManager, httpParams);
        Cleafy.getDefaultHttpClientFactory().create(this);
    }

    public /* synthetic */ CleafyDefaultHttpClient(ClientConnectionManager clientConnectionManager, HttpParams httpParams, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? null : clientConnectionManager, (i2 & 2) != 0 ? null : httpParams);
    }
}
