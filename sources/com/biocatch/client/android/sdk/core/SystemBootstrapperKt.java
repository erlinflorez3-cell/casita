package com.biocatch.client.android.sdk.core;

import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.collection.CollectorIDMapperKt;
import com.biocatch.client.android.sdk.contract.BCCollectorID;
import java.util.ArrayList;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,\b\bDZc|\u0004W\u00068é6B\r.4ߚ\u0010+tʑQ6TgX.\u0001SX\u000e\u0014\u0002D&k$ DiTJ\b0\u000bgTwi~J\t\u000eq\u000eL\u0016ѷn0"}, d2 = {"4h[AX9'](h\f^9\u0004\u0005:p\u00041}", "", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u0011{rrh@\u0007a;X\u0004\u000b&\"", "3wc2e5:Zv\t\u0002e,z\u00189r\u000e\u0011wH\u0001%", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 2, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class SystemBootstrapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CollectorID> filterNotOverlapping(List<? extends BCCollectorID> list, List<String> list2) {
        List<CollectorID> listMapExternalToInternalCollectorsIds = CollectorIDMapperKt.mapExternalToInternalCollectorsIds(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMapExternalToInternalCollectorsIds) {
            CollectorID collectorID = (CollectorID) obj;
            boolean zContains = list2.contains(collectorID.name());
            if (zContains) {
                Log.Companion.getLogger().warning("Ignoring an attempt to disable an external collector: " + collectorID.name());
            }
            if (!zContains) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
