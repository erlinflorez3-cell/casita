package com.ts.coresdk.logger.c;

import android.content.Context;
import com.ts.coresdk.ITSModuleInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLш|\u0004O$8\u000b<N\u0007\"2\u0012\u007f\u0007tsA0JkP.hS0Ơk\u0012éT[R\u007f\u0004B[\u001aԥ&\u000bUZut7gh\u000e[\u0017\u0016\u0018\tjZKkw\f\u0013?6PoW3{n\u0004Nžx8\u000b#@&\u0001\u000f\u0013\u00072*v\u0015'~QK$\u0012^?7Nň\u0011O\u000b  \r\u0007-\u000f&tg|8\u000f\u0002Һ>1)\u000bwK\u00174m:\u0015M;H\u001b<˼zc$5N@}\"3^\u001b\u0007\u0001]\u0006\u0018ӭu?\u000bs50"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e`\u0015\u0011kc", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", "", "", "3mS=b0Gb|\u0001\u0004h9|o3s\u000f", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ#{!FUG0Fq\u001dw4GIz\n", "", "7r;<Z.>`x\bv[3|\b", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ1", "AtQ l:MS!gvf,", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Bd].a;\"2", "Dda@\\6G", "\nh]6g\u0005", "u(E", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class a implements ITSModuleInfo {
    public static final a INSTANCE = new a();

    private a() {
    }

    @Override // com.ts.coresdk.ITSModuleInfo
    public List<String> endpointIgnoreList(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return null;
    }

    @Override // com.ts.coresdk.ITSModuleInfo
    public boolean isLoggerEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return true;
    }

    @Override // com.ts.coresdk.ITSModuleInfo
    public String subSystemName() {
        return "core";
    }

    @Override // com.ts.coresdk.ITSModuleInfo
    public String tenantID() {
        return "";
    }

    @Override // com.ts.coresdk.ITSModuleInfo
    public String version() {
        return "1.0.8.2";
    }
}
