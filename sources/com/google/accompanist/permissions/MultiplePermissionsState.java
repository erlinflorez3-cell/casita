package com.google.accompanist.permissions;

import java.util.List;
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4C\u0007\":0\u007f\u0007|jA0JjP.`S2şqaJř\f$ B\u0004[(\u000b:\t}\\.\f?Zh\u000b[\u000f4\u0017O̺.֒Y|u\u0014\u00154Pr\u0010I[sU?pvF\u0005N8P=Pڵ\u0003ʀ.L(x\u0001JY\u0014bFNyRX\u001dO\u0015\u001a@\fl%Wɍ^ʄR:`ncD=+SyPY?_^}$ϜHù+\u0011\u000fc$7N:Æ\u0014Ǭو\u0003\u000bZ]E\"mpݞ\twҨ+*"}, d2 = {"\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7}>TR?v;\u001e\u007fhnA\u000bq:R\u00010U:](kRH", "", "/k[\u001dX9FW'\r~h5\u000bj<a\t7{?", "", "5dc\u000e_3)S&\u0007~l:\u0001\u00138sa5wI\u0010\u0017\u0016", "u(I", ">da:\\:LW#\b\t", "", "\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7\u0001.ZK?yB\"\u001fqOH\u0003r,$", "5dc\u001dX9FW'\r~h5\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "@de<^,=>\u0019\f\u0003b:\u000b\r9n\u000e", "5dc\u001fX=HY\u0019}e^9\u0005\r=s\u00042\u0005N", "Ag^B_+,V#\u0011gZ;\u0001\u00138a\u0007(", "5dc [6NZ\u0018l}h>i\u0005>i\n1wG\u0001", ":`d;V/&c \u000e~i3|s/r\b,\nN\u0005! 4o\u001aLv3D", "", ">da:\\:LW#\b\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface MultiplePermissionsState {
    boolean getAllPermissionsGranted();

    List<PermissionState> getPermissions();

    List<PermissionState> getRevokedPermissions();

    boolean getShouldShowRationale();

    void launchMultiplePermissionRequest();
}
