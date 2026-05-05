package com.ts.coresdk.c.a;

import android.content.Context;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ts.coresdk.c.a.a.c;
import java.util.LinkedHashMap;
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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000egLc\u0003\u0010I\u0006F\u000b6B\u0005$4\u0012\u0006\u0007nj?0Le^.ZS0\u0012s{BřaӖqYП\u0006\u001a,1IVTg̊rL`\u0018Q\u001dN)\u0007qDI\u0004~\u000e\u0016\u001d7Zom3ޜs??g\u0003>M=@-Py3\u0002J.V\u0015\u000fzqT<\u0016>J\t:\u0001\r\u0014\u0005ܨ\u0016\bD+\u000f*%\u0005\\:`l\f;_'\u0011nZNUh`\u0001[\u0017^TU\r=fӿ/B=9#1$!\u0015VsK\u0013A\u0002=3h7);I\"XdW6\u0014kۄQոav.^\u000bSn\u000f"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxcI$E<V", "", "", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxcI$E<J\u0015l", "1S", "\u001aiPCTuNb\u001d\u0006DF(\b^", RemoteSettings.FORWARD_SLASH_STRING, ">/", "", "9", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">0", AdkSettings.PLATFORM_TYPE_MOBILE, "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6sXO_C\u000f-;\\@%QYN:[X<;]\u000e$\n\u0018)b", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class a {
    public static final a INSTANCE = new a();
    private static final Map<String, c> cT = new LinkedHashMap();

    private a() {
    }

    private final c b(Context context, String str) {
        com.ts.coresdk.c.a.a.a aVar = new com.ts.coresdk.c.a.a.a(context, str);
        cT.put(str, aVar);
        return aVar;
    }

    public final c a(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        c cVar = cT.get(str);
        return cVar != null ? cVar : b(context, str);
    }

    public final void k(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, c> map = cT;
        c cVar = map.get(str);
        if (cVar != null) {
            cVar.F();
            map.remove(str);
        }
    }
}
