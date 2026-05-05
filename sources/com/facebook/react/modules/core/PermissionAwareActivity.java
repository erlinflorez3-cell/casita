package com.facebook.react.modules.core;

import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r.4\u0012}\tnjG0L͜P.`b2\u000fq{<$q$yCAU\"}0\u0012WȞmL\u0005Ϻ\u000b\u000bq\u000eN4\u0007jDI\u0004y\u000e\u0016\u001d4Zom6}sK=xtd\u0006P60=\u0012\u0005/\u001bplX\u0005\tIc\f@1ptHT%M3\u001dX*\u0007K\u000f%tg|>xvkCG)\u0013kRNUb^\u0007}\u0011T_?\r%bN1NCM\u0017;R1\u0014\u0019\u007fύ\u0007?\u007fKMv56CI\"gf\\\u000e\u0016-+}\u0010$\u0017Ο[ӤĬ`\u0010/-U\u0003yO˔,\t߿\u007f\f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u000b7z\u001e2[Q?u=y'dn9ba;R\b+V`$", "", "1gT0^\u0017>`!\u0003\tl0\u0007\u0012", "", ">da:\\:LW#\b", "", ">hS", "ChS", "1gT0^\u001a>Z\u001aizk4\u0001\u0017=i\n1", "@d`BX:M>\u0019\f\u0003b:\u000b\r9n\u000e", "", ">da:\\:LW#\b\t", "", "@d`BX:M1#}z", ":hbAX5>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u000b7z\u001e2[Q?u=\u0005\u0019vp9\u0010c9$", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q$g\u0015!O9\u000f8t%2c\b&\u0001z\u0016*KR\u0005s>\u001d%oaGPa6[vp2L[4``\u0001A\u001e\u001bA\u0012\\:\r\u000eYNy25", "Ag^B_+,V#\u0011g^8\r\t=tj(\tH\u0005%%Ky\u0017)r49c\u0007\u001c>m", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface PermissionAwareActivity {
    int checkPermission(String str, int i2, int i3);

    int checkSelfPermission(String str);

    void requestPermissions(String[] strArr, int i2, PermissionListener permissionListener);

    boolean shouldShowRequestPermissionRationale(String str);
}
