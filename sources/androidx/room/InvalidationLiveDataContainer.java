package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
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
/* JADX INFO: compiled from: InvalidationLiveDataContainer.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":3\u007f\u0007|jA0JhP.`b2\u000fy\b<řc$\u007fLC٥\"}8\tWNmgvJh\u000bK\u000f\f\u0017~̓Bկ\u0006x\f\u0011O=RsM3eok:žx6\u0013\"z_F\u0002\u001d\u0007*,X\u0010=\u0004qP,\u00146ϋ~C\u0003\u0019[\u000f2\u001a\u0016B&\u007f.\\\u0016ZdS\u001daH<;\u0003\u0018P~3m?\u0015U\u001dJd)#u('YP˝9\u00153dK\u0017`mW\u0003m\u0005m\rv;?/Ys]7\u0007\u0005\\%9d%]!9\r\r_t$+;OiL~\u0013x\u0004\t{%<2\u000f\\άJͶ1\u001anڜ^O\u0003ukJ`\bnF\u0010zg7E*.7\u0002ݎ\u001dƻUgCϊf9\u0002\u000b\u001b%ũ\u0005\u0005"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017#z658y/3K 7\\??t4+j", "", "2`c.U(LS", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000e\u0012", "uKP;W9HW\u0018\u0012Dk6\u0007\u0011xR\n2\u0004\u001f|&\u0013Dk\u001c<Lh&", ":he27(MO\u0007~\n", "", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005(\u0017&k\u001d8L", "5dc\u0019\\=>2\u0015\u000evL,\fG<o\n0uM\u0011 &Kw\u000e6\u0004%<Yy.7", "u(;7T=:\u001d)\u000e~euj\t>;", "1qT.g,", "\"", "B`Q9X\u0015:[\u0019\r", "", "", "7mC?T5LO\u0017\u000e~h5", "", "1n\\=h;>4)\bxm0\u0007\u0012", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Nv\n9}%\u000b", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q5g\u001c\u0013XkWL\u0006)<#{*@k&;ZCDz}{\u0011oh5\u0004j,$:\u000eCUM9fVqP]\u0019^\u000fN)!\u0003`AmUHH\u001ff(X}\u0011", "=m00g0OS", "", ":he27(MO", "=m8;T*MW*~", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InvalidationLiveDataContainer {
    private final RoomDatabase database;
    private final Set<LiveData<?>> liveDataSet;

    public InvalidationLiveDataContainer(RoomDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.database = database;
        Set<LiveData<?>> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.liveDataSet = setNewSetFromMap;
    }

    public final Set<LiveData<?>> getLiveDataSet$room_runtime_release() {
        return this.liveDataSet;
    }

    public final <T> LiveData<T> create(String[] tableNames, boolean z2, Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return new RoomTrackingLiveData(this.database, this, z2, computeFunction, tableNames);
    }

    public final void onActive(LiveData<?> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        this.liveDataSet.add(liveData);
    }

    public final void onInactive(LiveData<?> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        this.liveDataSet.remove(liveData);
    }
}
