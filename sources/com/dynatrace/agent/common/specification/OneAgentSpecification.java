package com.dynatrace.agent.common.specification;

import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0006GيFé^B-!d\u0011yGkʴ=2JeV/ʈW-"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006\u000505W\u0002!;k\u0012=QMD5\u001e'\u0015Dc9\u0010r\u001aYv%KMR*XavG\u001dg", "", "\nh]6g\u0005", "u(E", "\u0010dP0b5,^\u0019|~_0z\u0005>i\n1\n", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class OneAgentSpecification {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00146Ȑ\u0007\":\u0018\u007f\u0007ljA0RlP.XV0Ʀk\u0012éT[Rp\u0004B[\u001aԥ&\u000bUNuh?Vh\r[\u000f4\u0019O̚~֒Yxe܈_>PsW3{t\u0014ʧ3ҽ:\u0005(݅rD\b\u000b\u0019\u001aXMf͓MŲO\f\u001aؓ\u0011|HY%M3\"hæ\u0011ŋ\u0005\u001edɡ\u001fBVuu:](Y݊\u0015Ě+_8ŧ\u001e\u0019T^?\r%ftѯ\u0013˝9\u0015-مS\u0013`fW\u0003mv\u0014ݢ;Ҋ++Q֕(Bf\f,\u0015YTcƥE͉`\u0005YӠИ+8"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006\u000505W\u0002!;k\u0012=QMD5\u001e'\u0015Dc9\u0010r\u001aYv%KMR*XavG\u001dP7\u000eJ)\u0017\u000eGL$lH8#\u0006(X\u0006Eq\u000fa", "", "\nh]6g\u0005", "u(E", "\u0011@?!H\u0019\u001eMw^[:\u001ccw", "", "\u0010D0\u0010B\u00158A|sZX\u0012`e)D_\tW0g\u0006", "", "\u0013U4\u001bG&,7\u000e^tD\u0010Y\u0003\u000eE`\u0004k'o", " DE\u0016F\u0010(<\u0013]Z?\blo\u001e", "", "\u001bH=,5\f\u001a1\u0003gtL\u0010qh)Kc\u0005", "\u001b@G,5\f\u001a1\u0003gtL\u0010qh)Kc\u0005", "\u001bH=,8\u001d\u001e<\bxhB!\\\u0003\u0015I\\", "\u001b@G,8\u001d\u001e<\bxhB!\\\u0003\u0015I\\", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class BeaconSpecifications {
        public static final int BEACON_SIZE_KIB_DEFAULT = 1024;
        public static final boolean CAPTURE_DEFAULT = true;
        public static final int EVENT_SIZE_KIB_DEFAULT = 256;
        public static final BeaconSpecifications INSTANCE = new BeaconSpecifications();
        public static final int MAX_BEACON_SIZE_KIB = 10240;
        public static final int MAX_EVENT_SIZE_KIB = 1024;
        public static final int MIN_BEACON_SIZE_KIB = 256;
        public static final int MIN_EVENT_SIZE_KIB = 128;
        public static final long REVISION_DEFAULT = 0;

        private BeaconSpecifications() {
        }
    }
}
