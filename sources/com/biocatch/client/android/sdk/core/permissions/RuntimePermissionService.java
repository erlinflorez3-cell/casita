package com.biocatch.client.android.sdk.core.permissions;

import com.biocatch.android.commonsdk.core.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeV:ZS8\u0018sڔ<$iByCAW Ԃ8ޛm[\u0018g\u001dI\u0013\nPO\u0019&|x,aU'^\"\u0013@D\b?aPڱA9nx~\u0011.;:@\n\u0007\u0011\u001aXO&u)M\u0014\u0018 ;XphZ=Q\u0013&*\u0006l'Q*jgf6vm4ƀ1ݭ\u0007iJ÷ww>\u0002e\u0019VV7\r%h.-P7c\u001dSYYޚTÜC\u0003Gм\u000e\u0011v)?+wv.̯Zÿ\u0018\u00153˽վa\u0001"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wXCHs8,#lkB\u0015-\u0019^\u007f6KTN\u0017\\_zA\" ^\u0018W\u0019\r\u0012jE\"n\u001a", "", ">da:\\:LW#\bh^9\u000e\r-e", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wXCHs8,#lkB\u0015-\u0017N\u0004/KZ\\0f[`=!#^\fN\u0001", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017N;x<\"#veC\u0010qu9v4OP\\:`\\{+\u0014\u001fk\u0012L+bkWK,8A;)\u0006(X\u007f>2|\u0015\u0015\u001b?no\fT\u001aO\u0002\u001f~O(n\u0010Wi\u0007G\u000b5q.k\u001a5`M", "@t]A\\4>>\u0019\f\u0003b:\u000b\r9n\u000e\u0016\u000b<\u0010'%", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "", "", "5qP;g,=>\u0019\f\u0003b:\u000b\r9n\u000e", "", "6`b\u001dX9FW'\r~h5", ">da:\\:LW#\b", "\u0011n\\=T5B]\"", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class RuntimePermissionService {
    public static final Companion Companion = new Companion(null);
    private static final String[] runtimePermissions = {"android.permission.READ_PHONE_STATE", "android.permission.BLUETOOTH_CONNECT"};
    private final PermissionService permissionService;
    private final HashMap<String, Boolean> runtimePermissionsStatus;
    private final Utils utils;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001a6B\r.4\u0012}\u0007lʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$BWIV2\u00042\u000b_N\u0016j\u001dL1ŒEǇ\n\u0018\u0001j:MǪ|b"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wXCHs8,#lkB\u0015-\u0019^\u007f6KTN\u0017\\_zA\" ^\u0018W\u0019\r\u0012jE\"n\u0003\u0015)\u00107E\u000b?r\na", "", "u(E", "@t]A\\4>>\u0019\f\u0003b:\u000b\r9n\u000e", "", "", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RuntimePermissionService(PermissionService permissionService, Utils utils) {
        Intrinsics.checkNotNullParameter(permissionService, "permissionService");
        Intrinsics.checkNotNullParameter(utils, "utils");
        this.permissionService = permissionService;
        this.utils = utils;
        this.runtimePermissionsStatus = new HashMap<>();
        for (String str : runtimePermissions) {
            this.runtimePermissionsStatus.put(str, Boolean.valueOf(hasPermission(str)));
        }
    }

    public final List<String> grantedPermissions() {
        if (!this.utils.isVersionGreaterOrEqualTo(31)) {
            return null;
        }
        HashMap<String, Boolean> map = this.runtimePermissionsStatus;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            if (hasPermission(entry.getKey()) && !entry.getValue().booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return arrayList;
    }

    public final boolean hasPermission(String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return this.permissionService.hasPermission(permission);
    }
}
