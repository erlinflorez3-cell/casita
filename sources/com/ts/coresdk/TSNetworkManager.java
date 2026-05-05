package com.ts.coresdk;

import android.content.Context;
import java.util.List;
import java.util.Map;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007t\tAӄLe^.Zݷ2\u000fy\u0005<řc$\u007feCU \u0002*\t]Ȟm̯n`ҙ;C=\u0018V\u007fp,֒Yzc\"\u001dC\u000b]MAeqS8\u0017ҚV\u0007&݅0E*\t\u000f\u001aBH>u+GY\u000e*0nqjV\u001bQ\u001d\u001a@\tn,\u000f$to^8Xl\f=E\"1nrX5gH\u0003]\u000fVT]˙%hN1F7C\u001f=S1\u0010\u0003oE\u0003M}U\u0013x)7+wvg8h\u007fB\u0018AN;h9+ػ\tSf\u001a5:"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$MW\nEr'5fS", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", ">0", "", ">1", "", ">2", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", ">3", "", ">4", "", ">5", "\"", "1qT.g,", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D+<\u001b\u0019(\u0013\u0012Jl\bU|\u0012CyF)[\fXu^|=2j\u00107fuUO\u001bW\u0011i\bp\u0019&JI(\u001b;\u0001\u0017s&qp\u0001O\"n\u001c\u0001cpIbd5)>kj\u001c", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TSNetworkManager {
    public static final TSNetworkManager INSTANCE = new TSNetworkManager();

    private TSNetworkManager() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object create$default(TSNetworkManager tSNetworkManager, Context context, ITSModuleInfo iTSModuleInfo, String str, List list, Class cls, boolean z2, Map map, int i2, Object obj) {
        if ((32 & i2) != 0) {
            z2 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            map = null;
        }
        return tSNetworkManager.create(context, iTSModuleInfo, str, list, cls, z2, map);
    }

    public final <T> T create(Context context, ITSModuleInfo iTSModuleInfo, String str, List<String> list, Class<T> cls, boolean z2, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        try {
            return (T) com.ts.coresdk.a.b.a.a.INSTANCE.a(context, iTSModuleInfo, str, list, cls, z2, map);
        } catch (Throwable unused) {
            return null;
        }
    }
}
