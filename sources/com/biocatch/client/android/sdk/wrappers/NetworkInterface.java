package com.biocatch.client.android.sdk.wrappers;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\"\u007f\u0007lkA0RtP.`_2\u000fq\u007f:řqҕ\"CiTZ\t2\r]N\u007fg\u001dKҼ\u000fC\u001d\bf\nx/aW\u000f\\@\u0013h\u0007ņC7eqC>nz\u0007\u001c.9:@\n\t\u0011\u001c@G>\u007f)K\u0002Pܘ4D\t<X\u0017[\u0010j#\u0014J8\u00034[\u0016Wl\rǰa>G%\tvP\\wk>|e\rtU}˜xҐ\"+Hʺ߷\u00194"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5\u001d\u001e$zkF\rG5]v4HHL,2", "", "<dcDb9D7\"\u000ezk-x\u0007/", "\u001aiPCTuGS(Hc^;\u000f\u0013<kc1\u000b@\u000e\u0018\u0013Eoc", "uKY.i(\b\\\u0019\u000eDG,\f\u001b9r\u0006\f\u0005O\u0001$\u0018Cm\u000e\u0012:\u0016", "6`a1j(KSt}yk,\u000b\u0017", "", "5dc\u0015T9=e\u0015\fz:+{\u0016/s\u000e", "u(J\u000f", "7Oe\u00014+=`\u0019\r\t^:", "", "", "5dc\u0016C=\r/\u0018}\b^:\u000b\t=", "u(J\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "<`\\2", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class NetworkInterface {
    private final java.net.NetworkInterface networkInterface;

    public NetworkInterface(java.net.NetworkInterface networkInterface) {
        Intrinsics.checkNotNullParameter(networkInterface, "networkInterface");
        this.networkInterface = networkInterface;
    }

    public final byte[] getHardwareAddress() throws SocketException {
        return this.networkInterface.getHardwareAddress();
    }

    public final String[] getIPv4Addresses() {
        ArrayList arrayList = new ArrayList();
        Enumeration<InetAddress> inetAddresses = this.networkInterface.getInetAddresses();
        while (inetAddresses.hasMoreElements()) {
            InetAddress inetAddressNextElement = inetAddresses.nextElement();
            if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                arrayList.add(inetAddressNextElement.getHostAddress());
            }
        }
        Object[] array = arrayList.toArray(new String[arrayList.size()]);
        Intrinsics.checkNotNullExpressionValue(array, "localIps.toArray(localIpsArray)");
        return (String[]) array;
    }

    public final String getName() {
        return this.networkInterface.getName();
    }
}
