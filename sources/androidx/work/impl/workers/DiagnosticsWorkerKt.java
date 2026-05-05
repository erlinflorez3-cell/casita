package androidx.work.impl.workers;

import androidx.work.Logger;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.model.WorkTagDao;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: DiagnosticsWorker.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d̉=!,u\bDJc|\u0004W\u00068\u000b4B\u0007\":\u0018\u007f\u0007llA0ZeP\u008cZS@\u000fsڔ<$q$yّCU(\u001c*ޛg{ug\u0007J\t\ns\u0013\u0014\u0017\u0011jZK\u0006|k\u0015'2pno9[sU;vsd\nP60>\u0012\u0005/\u0019pHǘzzQR$>>H\t:\u0001\f}\t(\u001b\u001e>N\u000bN`uYNH\u001bij31\u0010\u0002B|5\u0010:\u000b\\%Ld)\u001dv\u0010 YP}551aΈ\u001fR\n>YӍsݘ\th/ݐȋM\u0005"}, d2 = {"\"@6", "", "Ena8F7>Q\u0006\t\r", "Ena8F7>Q", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+#d}\u001e\r", "<`\\2", "AxbAX4\"R", "", "B`V@", "uKP;W9HW\u0018\u0012Dp6\n\u000fxi\b3\u0003\n\t!\u0016GvW.\u00012;G\t 5C|3IT75;\u001a\u001ej+'\u0016p0Wx|.QJ=X\u001cy9\u001d\u0014$qW:\r\u0007YNyUI30\u0004uP}DjJy%\u001b9sr\u0018\u001avLu&q\u000b0dO[)gVNIk,:", "Ena8F7>Q\u0006\t\rl", "Ena8A(FSwz\u0005", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+\u001eU\u0006 \u0016i \u0004", "Ena8G(@2\u0015\t", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+$U\u007f~3wk", "AxbAX4\"R|\b{h\u000bx\u0013", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9{P\u000545aa\u001f\u001bv\u00178,?EA", "Ena8F7>Q'", "", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 2, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DiagnosticsWorkerKt {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("DiagnosticsWrkr");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(\"DiagnosticsWrkr\")");
        TAG = strTagWithPrefix;
    }

    public static final String workSpecRows(WorkNameDao workNameDao, WorkTagDao workTagDao, SystemIdInfoDao systemIdInfoDao, List<WorkSpec> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for (WorkSpec workSpec : list) {
            SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(WorkSpecKt.generationalId(workSpec));
            sb.append(workSpecRow(workSpec, CollectionsKt.joinToString$default(workNameDao.getNamesForWorkSpecId(workSpec.id), ",", null, null, 0, null, null, 62, null), systemIdInfo != null ? Integer.valueOf(systemIdInfo.systemId) : null, CollectionsKt.joinToString$default(workTagDao.getTagsForWorkSpecId(workSpec.id), ",", null, null, 0, null, null, 62, null)));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private static final String workSpecRow(WorkSpec workSpec, String str, Integer num, String str2) {
        return "\n" + workSpec.id + "\t " + workSpec.workerClassName + "\t " + num + "\t " + workSpec.state.name() + "\t " + str + "\t " + str2 + '\t';
    }
}
