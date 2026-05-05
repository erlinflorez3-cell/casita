package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Iterator;
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
/* JADX INFO: compiled from: EntityDeletionOrUpdateAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0005\"4\u0012\u0006\u0007nʑA0ZeP.XT2\u000fy\b<řc$\u007fICU ~*\t]]o˧vJh%KƤ\f;\u000f̓TK[ތk\u0011?2po\u007f>]sK:xtd\u0007ڶ6\"F|M\u001c(.`\u0010%\u007fsO\u001a\u0018H@\u001fA\u0003\u0011[\r2\u0012<̄f#ɉ`g\\?\u0011rkDG#1t\tpop>\te\rtaW\u0011\u0005i6+vʺ߱\u0019%a\u0011OkiN\u001b? J5t57CQ\u0004[<W\u0010\u0014Kۀ}\u001eǁv&j\u0017\u001ar\u001a6CO\u0012X\u0001\u00186\b\u0013\u0002\u001d>\u0014\u000e<ΩvAǏ\u001ez"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u000fn\u000f,\u000bT_\u0017\u001eG~\u0012F\u007f\u000fBI\t\u001f3|\u0016\nL?Fz4+j", "\"", "\u001a`]1e6BR,H\bh6\u0005R\u001dh{5{?n\u0003}K~\u000e*\u0006!DY\u0006 @|k", "2`c.U(LS", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000e\u0012", "uKP;W9HW\u0018\u0012Dk6\u0007\u0011xR\n2\u0004\u001f|&\u0013Dk\u001c<Lh&", "0h]1", "", "AsPAX4>\\(", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\u000eFi%.UCDz\n", "3mc6g@", "uKP;W9HW\u0018\u0012Dl8\u0004\r>eI'x\nn'\"Ry\u001bKd\u0011\u001c]\r %|\u0012=MK;tCs{m]J\u0003-3J\u007f)\u00116K1\\P\u0002\u0013W\u0003", "1qT.g,*c\u0019\f\u000f", "", "6`]1_,", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "6`]1_,&c \u000e~i3|", "3mc6g0>a", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004d", "", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class EntityDeletionOrUpdateAdapter<T> extends SharedSQLiteStatement {
    protected abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t2);

    @Override // androidx.room.SharedSQLiteStatement
    protected abstract String createQuery();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityDeletionOrUpdateAdapter(RoomDatabase database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    public final int handle(T t2) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t2);
            return supportSQLiteStatementAcquire.executeUpdateDelete();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final int handleMultiple(Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            int iExecuteUpdateDelete = 0;
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                iExecuteUpdateDelete += supportSQLiteStatementAcquire.executeUpdateDelete();
            }
            return iExecuteUpdateDelete;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final int handleMultiple(T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            int iExecuteUpdateDelete = 0;
            for (T t2 : entities) {
                bind(supportSQLiteStatementAcquire, t2);
                iExecuteUpdateDelete += supportSQLiteStatementAcquire.executeUpdateDelete();
            }
            return iExecuteUpdateDelete;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }
}
