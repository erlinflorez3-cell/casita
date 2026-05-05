package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
/* JADX INFO: compiled from: EntityUpsertionAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&˛\bDRш|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ReP\u008cZS@\u000fs{:&c$\u007fRC٥\"}0#WȞog|Qb\u000bI\u000f\u000e\u0016\u0007~4կ]xk.\u00172HqG3[\u000eE9ft<\n6݅J:\u007fڎ\u000f\u0019ZH>v;b[\u0016 1XvJT\u001dM;܅@\bN*\u000f!tm^8Xl\u0014Ž]'ɨmB\\,(>\u000bS%F\u0003.=zo&C@e>[%\u001c\u0014\u0015\\s?1F\"A\u0013s?'aɞָ[6f\f\\.9Y%]!-\r\u0011_m$/;SiJ`\u000e^»)\nɁ@\u0004\u001c\u0015oZ<72f6\u0015c~\u0001`XV\u0012`R\u007f1ʨd'm\u0011A<Q\u001b\u0015c\u0012?'YO{;ټ̷'\u0001|4$m\u001ct-\u001b\u0003\r\u0002=_MUP^\u000e_<}\u0004'ç08˙4G\u000eED#<+=7\nNS+y\u000f`Jwx\u0015`\u001fׅ\u0018i\u0011a0\u0007.?:\r\u0012YTd3}~b\t8\u001fZ4\\\u0017\u0002\u000e\u00120\\.˓O3ŎROv\u00033lk\"=7v;_m{\u000e\u0006K\rAe[q\u001dyX\u0007\u0016O<\u0019ڳ\u0007}͞W\fhvpA@c\u0003\u0016\b}TN:%`[\"(B9I!l\u0019N\u0002.Bwґ7m˖l\u0010\rq{<\u0011\u0005<z\u0019\u0003`\\\u001f\u0002\u0016\u0015y6\u000bm:3QSE\u0019\\ŞP\u007f\u0005\u000f1\b\u0017y\u0010IwL}Ƃ\u001b\u0018Lɠ}°\u001a\u001aA֗\u007fO!\u0012\u0017/B\u0004=E\u0003ǩ\u0014U$ȿ)ϸ\u0001y\u0017\u0090ą2\u0006"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u000fn\u000f,\u000bTp\"%G|\u001d@\u0001.\u0011Xy+Fm#\u0004", "\"", "", "7mb2e;B]\"ZyZ7\f\t<", "\u001a`]1e6BR,H\bh6\u0005R\u000fn\u000f,\u000bTd %G|\u001d@\u0001.\u0011Xy+Fm#\u0004", "CoS.g,\u001aR\u0015\n\n^9", "\u001a`]1e6BR,H\bh6\u0005R\u000fn\u000f,\u000bT_\u0017\u001eG~\u0012F\u007f\u000fBI\t\u001f3|\u0016\nL?Fz4+j", "uKP;W9HW\u0018\u0012Dk6\u0007\u0011xE\t7\u007fO\u0015z Uo\u001bKz/>5|\u001cB|\u0016;#*7t3+\u001fl`LPp6X~p'U]0kfQ=\u001b\u0012i\u0012X4v\u0012IL#jS7z\u0007(T\u0011;uVO\u0007", "1gT0^\u001cGW%\u000fzg,\u000b\u0017\u000fx}(\u0007O\u0005! ", "", "3w", "\u001a`]1e6BRb}vm(y\u0005=eI6\bG\u0005&\u0017\u0011]y#z457\b)E|#*QLJKG\u001c\u0015sp=\u0011l\u0002", "Cob2e;", "3mc6g@", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "3mc6g0>a", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "", "Cob2e;\u001a\\\u0018kzm<\n\u0012\u0013d", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?%", "Cob2e;\u001a\\\u0018kzm<\n\u0012\u0013d\u000e\u0004\tM|+", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004v{", "", "Cob2e;\u001a\\\u0018kzm<\n\u0012\u0013d\u000e\u0004\tM|+sQ\u0003", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004v}\u001cC\u0001\n\u0006}!>[G\u0007Av\u0018\u0004", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nlZ=V\u00138\b!~`y)97|8VE\u0011", "Cob2e;\u001a\\\u0018kzm<\n\u0012\u0013d\u000e\u000f\u007fN\u0010", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWL\u0006)<#d$E|k", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class EntityUpsertionAdapter<T> {
    private final EntityInsertionAdapter<T> insertionAdapter;
    private final EntityDeletionOrUpdateAdapter<T> updateAdapter;

    public EntityUpsertionAdapter(EntityInsertionAdapter<T> insertionAdapter, EntityDeletionOrUpdateAdapter<T> updateAdapter) {
        Intrinsics.checkNotNullParameter(insertionAdapter, "insertionAdapter");
        Intrinsics.checkNotNullParameter(updateAdapter, "updateAdapter");
        this.insertionAdapter = insertionAdapter;
        this.updateAdapter = updateAdapter;
    }

    public final void upsert(T t2) {
        try {
            this.insertionAdapter.insert(t2);
        } catch (SQLiteConstraintException e2) {
            checkUniquenessException(e2);
            this.updateAdapter.handle(t2);
        }
    }

    public final long upsertAndReturnId(T t2) {
        try {
            return this.insertionAdapter.insertAndReturnId(t2);
        } catch (SQLiteConstraintException e2) {
            checkUniquenessException(e2);
            this.updateAdapter.handle(t2);
            return -1L;
        }
    }

    public final long[] upsertAndReturnIdsArray(T[] entities) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(entities, "entities");
        int length = entities.length;
        long[] jArr = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(entities[i2]);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(entities[i2]);
                jInsertAndReturnId = -1;
            }
            jArr[i2] = jInsertAndReturnId;
        }
        return jArr;
    }

    public final long[] upsertAndReturnIdsArray(Collection<? extends T> entities) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(next);
                jInsertAndReturnId = -1;
            }
            jArr[i2] = jInsertAndReturnId;
        }
        return jArr;
    }

    public final List<Long> upsertAndReturnIdsList(T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        for (T t2 : entities) {
            try {
                listCreateListBuilder.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t2)));
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(t2);
                listCreateListBuilder.add(-1L);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public final List<Long> upsertAndReturnIdsList(Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        for (T t2 : entities) {
            try {
                listCreateListBuilder.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t2)));
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(t2);
                listCreateListBuilder.add(-1L);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public final Long[] upsertAndReturnIdsArrayBox(T[] entities) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(entities, "entities");
        int length = entities.length;
        Long[] lArr = new Long[length];
        for (int i2 = 0; i2 < length; i2++) {
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(entities[i2]);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(entities[i2]);
                jInsertAndReturnId = -1;
            }
            lArr[i2] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final Long[] upsertAndReturnIdsArrayBox(Collection<? extends T> entities) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        Long[] lArr = new Long[size];
        for (int i2 = 0; i2 < size; i2++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(next);
                jInsertAndReturnId = -1;
            }
            lArr[i2] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    private final void checkUniquenessException(SQLiteConstraintException sQLiteConstraintException) {
        String message = sQLiteConstraintException.getMessage();
        if (message == null) {
            throw sQLiteConstraintException;
        }
        String str = message;
        if (!StringsKt.contains((CharSequence) str, (CharSequence) "unique", true) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "2067", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "1555", false, 2, (Object) null)) {
            throw sQLiteConstraintException;
        }
    }

    public final void upsert(T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        for (T t2 : entities) {
            try {
                this.insertionAdapter.insert(t2);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(t2);
            }
        }
    }

    public final void upsert(Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        for (T t2 : entities) {
            try {
                this.insertionAdapter.insert(t2);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(t2);
            }
        }
    }
}
