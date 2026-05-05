package com.facebook.imagepipeline.debug;

import com.facebook.common.references.SharedReference;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4B\u0007\":\u0012\u007fјnjO0LeN.ZS@\u000fsڔ<$i%yCAU b8ޛ\u007fN\u0016f'IfSS\u001d\t.x\u00190y[\u0007b*\u0011HA\u001eEyq8]Gg\r63$b.F\u0002\u001d\t*.X\u0012\ryqJ:\u001b`F~Dj\u000fc\u0004H\u001dLbp\u0011,\\\u007fNdICҾ<ǥ'\u0007\u0002DT'm2ƐQ\u001a"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%2i\u007fi\u0015t <M?8r4\u000b\u0015iaF\u0007l*N]'CR=9XPx=!g", "", "7rB2g", "", "u(I", "Adc\u0019\\:MS\"~\b", "", ":hbAX5>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%2i\u007fi\u0015t <M?8r4\u000b\u0015iaF\u0007l*N]'CR=9XPx=!PA\u0012\\:\r\u000eYNy", "BqP0^\nE]'~v[3|u/f\u007f5{I~\u0017}Gk\u0014", "@dU2e,GQ\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#k#3z\u0016-:C<kA\u001e\u001efa\u000f", "AsP0^;KO\u0017~", "", "\u001ahbAX5>`", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface CloseableReferenceLeakTracker {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4ߚ\u007f\u0007tkAӄJJ^\u008c\u0003SX\u000e4\u001cB$s$ Dka(\u007f:\u0011_Rwi\u0005I\t\nq\u00126\u001c\u0007nDKkw\f\u0017UVԸsE"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%2i\u007fi\u0015t <M?8r4\u000b\u0015iaF\u0007l*N]'CR=9XPx=!PA\u0012\\:\r\u000eYNy", "", "=m29b:>O\u0016\u0006zK,}\t<e\t&{'\u0001\u0013\u001d", "", "@dU2e,GQ\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#k#3z\u0016-:C<kA\u001e\u001efa\u000f", "AsP0^;KO\u0017~", "", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Listener {
        void onCloseableReferenceLeak(SharedReference<Object> sharedReference, Throwable th);
    }

    boolean isSet();

    void setListener(Listener listener);

    void trackCloseableReferenceLeak(SharedReference<Object> sharedReference, Throwable th);
}
