package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
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
/* JADX INFO: compiled from: EntityInsertionAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0005\"4\u0012\u0006\u0007nʑA0ZeP.XV2\u000fy\u000b<řc$\u007f]C٥\"}0\u0010WNmgvJh\u001fKƤ\u000e\u0016\u0007\u00074I[ze\u0012\u001dPJoE3S\u0015Sʠ\tv<ӌ.1R8(\u0005A%:L\u001ew\u0013Cy\u000eܘ4@~=\u001b([\t2\u00124CP\u0005,b\u007fNdO\u001daH7;\u0003 ĩ\u0015Iۢ4|[\u0016\u000fe5\u0017\u000faL0p;C\u001d=S9ޗқ_?\u0011J:V\u0013r?'YN$cDd\u0018\u001c%/U\fmr\\ؘ3^ԃ\u0010'9],]^\u0018@w)\u0001=F\u0012\u001a\u001e-X0=\u001a\u001dڜ<B=\u0004aPh\u0002\rS0~o>/%6đڢ=\u001btc*T'aO{3!N/\u000fz9cd\u0012f\u0014+T.\u0383_^͘AH\\\u001f\"O{\u0017\tb0>4:U\fG\u0002!0'%mكg9i\r\u0010_\\o\u0007\tfgci\u0001Yn/\u001f\"E6!\u0014jHj\u0004{P\u000bАZ\u001eܖ T\u0015\u0016P2.s\u0010D1)\u0016M_h\u0018{{j:/=rO_~m\u001eWoӔaKɄg\u0010ok?3MVz\u000bhhRS:k\u000bCR>Vv(\u007f\fHT\u000b#2uڤJAϜ5\u0019j1\u0011\u001b,\\Y\u0003\u0019ajh>\u0010\u0003NT\rw0\r\u000f\u0011Rlp&Ο'_ؼ\u0001}"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u000fn\u000f,\u000bTd %G|\u001d@\u0001.\u0011Xy+Fm#\u0004", "\"", "\u001a`]1e6BR,H\bh6\u0005R\u001dh{5{?n\u0003}K~\u000e*\u0006!DY\u0006 @|k", "2`c.U(LS", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000e\u0012", "uKP;W9HW\u0018\u0012Dk6\u0007\u0011xR\n2\u0004\u001f|&\u0013Dk\u001c<Lh&", "0h]1", "", "AsPAX4>\\(", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\u000eFi%.UCDz\n", "3mc6g@", "uKP;W9HW\u0018\u0012Dl8\u0004\r>eI'x\nn'\"Ry\u001bKd\u0011\u001c]\r %|\u0012=MK;tCs{m]J\u0003-3J\u007f)\u00116K1\\P\u0002\u0013W\u0003", "7mb2e;", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "3mc6g0>a", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "", "7mb2e;\u001a\\\u0018kzm<\n\u0012\u0013d", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?%", "7mb2e;\u001a\\\u0018kzm<\n\u0012\u0013d\u000e\u0004\tM|+", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004v{", "", "7mb2e;\u001a\\\u0018kzm<\n\u0012\u0013d\u000e\u0004\tM|+sQ\u0003", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004v}\u001cC\u0001\n\u0006}!>[G\u0007Av\u0018\u0004", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nlZ=V\u00138\b!~`y)97|8VE\u0011", "7mb2e;\u001a\\\u0018kzm<\n\u0012\u0013d\u000e\u000f\u007fN\u0010", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWL\u0006)<#d$E|k", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    protected abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t2);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityInsertionAdapter(RoomDatabase database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    public final void insert(T t2) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t2);
            supportSQLiteStatementAcquire.executeInsert();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final void insert(T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            for (T t2 : entities) {
                bind(supportSQLiteStatementAcquire, t2);
                supportSQLiteStatementAcquire.executeInsert();
            }
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final void insert(Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                supportSQLiteStatementAcquire.executeInsert();
            }
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final long insertAndReturnId(T t2) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t2);
            return supportSQLiteStatementAcquire.executeInsert();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            long[] jArr = new long[entities.size()];
            int i2 = 0;
            for (T t2 : entities) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                bind(supportSQLiteStatementAcquire, t2);
                jArr[i2] = supportSQLiteStatementAcquire.executeInsert();
                i2 = i3;
            }
            return jArr;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                bind(supportSQLiteStatementAcquire, entities[i2]);
                jArr[i3] = supportSQLiteStatementAcquire.executeInsert();
                i2++;
                i3++;
            }
            return jArr;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        Iterator<? extends T> it = entities.iterator();
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i2 = 0; i2 < size; i2++) {
                bind(supportSQLiteStatementAcquire, it.next());
                lArr[i2] = Long.valueOf(supportSQLiteStatementAcquire.executeInsert());
            }
            return lArr;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] insertAndReturnIdsArrayBox(T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        Iterator it = ArrayIteratorKt.iterator(entities);
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i2 = 0; i2 < length; i2++) {
                bind(supportSQLiteStatementAcquire, it.next());
                lArr[i2] = Long.valueOf(supportSQLiteStatementAcquire.executeInsert());
            }
            return lArr;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            for (T t2 : entities) {
                bind(supportSQLiteStatementAcquire, t2);
                listCreateListBuilder.add(Long.valueOf(supportSQLiteStatementAcquire.executeInsert()));
            }
            return CollectionsKt.build(listCreateListBuilder);
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                listCreateListBuilder.add(Long.valueOf(supportSQLiteStatementAcquire.executeInsert()));
            }
            return CollectionsKt.build(listCreateListBuilder);
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }
}
