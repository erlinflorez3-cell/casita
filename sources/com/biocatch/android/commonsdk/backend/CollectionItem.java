package com.biocatch.android.commonsdk.backend;

import kotlin.Metadata;
import org.json.JSONArray;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000f6B\u0005\"4\u0012\u0006\fnj?0LeV4ZS0\u000fs{B+c$wCCU(\n*\tUNog\u0005JbŏI3\u001cǝ)jZH\u0016{ٕ\u0016\u000f@B8TAN\b=gb%<\u0013#J$Nx3\u0003`,Н\u0014v\tG\u0014! 1XphW=S\u0013 *\bT\u001f/##iߑ:Hzd\u0003D1\u0004\u0002B|/\u00106\u000bV%Hj&;~( ҋD7C\u001fmh\u0011\bj[m\u000eowK\u0011\u0001)=*w~\u001e8ݼ\u0004\u0014#8\u0018\u001dks>\\3_\u0011\u00125:geaO<6>|D\u0013J\u0014&\u0006UYtQըj\u001a"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "", "u(E", "1kT.e\u0015NZ ", "", "2nd/_,", "uKY.i(\bZ\u0015\b|(\u000b\u0007\u0019,l\u007f}?\u001f", "", "4k^.g", "uKY.i(\bZ\u0015\b|(\r\u0004\u0013+tUk\\", "", "7mc", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004d", "", ":n]4", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;C\r", "", "Asa6a.", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class CollectionItem {
    protected final double clearNull(Double d2) {
        if (d2 != null) {
            return d2.doubleValue();
        }
        return 0.0d;
    }

    protected final float clearNull(Float f2) {
        if (f2 != null) {
            return f2.floatValue();
        }
        return 0.0f;
    }

    protected final int clearNull(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    protected final long clearNull(Long l2) {
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    protected final String clearNull(String str) {
        return str == null ? "" : str;
    }

    public abstract JSONArray toJSONArray();
}
