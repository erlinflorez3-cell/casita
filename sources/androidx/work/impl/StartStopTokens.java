package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
/* JADX INFO: compiled from: StartStopToken.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0005I\u0006>.6B\u0015\"4\u0012\u000e\u0007nʑA0RnP.XT2\u000f\u0002{<$iByّCU(\n*\tUN}˧\u001fJ\t\n\u0004\u0012و\u001axx,\u0012a\u0007c*\u000f`I CAU\b=gd=D\u0013)J$Nx3\u0006J.V\u0018\u000fzqOT >I\t<h\f{\nJ\u0016\u0014H8\u0001Lg0`DQ\u0005cJ13\u0003\u0018G|3\u00104\u000bZ%F\u00035U\u0003o-C@e:E)a\u000b\u001fR\nCKK\u007fL\u001dhU,[M\u0002aNX.\u001fe7]\u000eurT[[ĬbВ++WҪ\u001ch\u001c*\u0010\u0007\f\u000fL\u0004<\n7J>-Hk6\u0011\nςtՂDP\nމ۶\u0004\u000b"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E.\u0010\u0013$V]\u001dF\u0002\u0014?_})EC", "", "u(E", ":nR8", "@t]@", "", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+\u0017Y\u0007 Di%2WL7r\u0018\u001dj", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E.\u0010\u0013$V]\u001dF\u0002\u0014?_})\r", "1n]AT0Ga", "", "7c", "@d\\<i,", "AoT0", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+#d}\u001e\r", "", "Ena8F7>Q|}", "", "BnZ2a\rH`", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class StartStopTokens {
    private final Object lock = new Object();
    private final Map<WorkGenerationalId, StartStopToken> runs = new LinkedHashMap();

    public final StartStopToken tokenFor(WorkGenerationalId id) {
        StartStopToken startStopToken;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.lock) {
            Map<WorkGenerationalId, StartStopToken> map = this.runs;
            StartStopToken startStopToken2 = map.get(id);
            if (startStopToken2 == null) {
                startStopToken2 = new StartStopToken(id);
                map.put(id, startStopToken2);
            }
            startStopToken = startStopToken2;
        }
        return startStopToken;
    }

    public final StartStopToken remove(WorkGenerationalId id) {
        StartStopToken startStopTokenRemove;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.lock) {
            startStopTokenRemove = this.runs.remove(id);
        }
        return startStopTokenRemove;
    }

    public final List<StartStopToken> remove(String workSpecId) {
        List<StartStopToken> list;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.lock) {
            Map<WorkGenerationalId, StartStopToken> map = this.runs;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<WorkGenerationalId, StartStopToken> entry : map.entrySet()) {
                if (Intrinsics.areEqual(entry.getKey().getWorkSpecId(), workSpecId)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            Iterator it = linkedHashMap2.keySet().iterator();
            while (it.hasNext()) {
                this.runs.remove((WorkGenerationalId) it.next());
            }
            list = CollectionsKt.toList(linkedHashMap2.values());
        }
        return list;
    }

    public final boolean contains(WorkGenerationalId id) {
        boolean zContainsKey;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.lock) {
            zContainsKey = this.runs.containsKey(id);
        }
        return zContainsKey;
    }

    public final StartStopToken tokenFor(WorkSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return tokenFor(WorkSpecKt.generationalId(spec));
    }

    public final StartStopToken remove(WorkSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return remove(WorkSpecKt.generationalId(spec));
    }
}
