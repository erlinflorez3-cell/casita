package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import java.util.ArrayList;
import java.util.List;
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
/* JADX INFO: compiled from: QueryInterceptorProgram.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLcz\u0004I\u0006>*6B\rӬ4\u0012}\bnjG0L͜P.`Y2şs{B4cҕyCIY\"Ԃ*\t]UogtJb\u000bQ\u001b\u000e\u0016~m2կkތ\u000e\u0012=1\u0003rУ7M}=\u0002v\u0003<\u001d `)h}\u0013\t2*v\u0019'~QU$\u0012^K7N\u001b#[\u00112\u00124EP\u0005,d\u007fNdQ\u001daH9;\u0003\u0018O\u0015;(F\u000b[%F\u0003.=zo&C@e>E)a\r\u001fR\nNIS:K\u0013x?'YP$[D`\u0018\u0014C4\u0016!&\t4m\u001dQ\u000f\u0013W/]kcP<1(~\n\u0017T\u0004<\u0018m\\v3(y \u000ea{9g\tV\u0010rZ\u007f)h|+m\u0018A@Q\u001b\u0015X\u0012?'dO{3\u0016N)\u000fx9]j\r\u000f\u0018aTHk?RXEXR\u001a[Sl2s\u0011\u0004\u0001ʷ2Ͻ\u00045\u0004߾F\u0019+;i>أ%\u0003"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001bu\u007f5\u0010$\n&\u0017Tm\u000eG\u0006/BD\u000b*9z\u00126#", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\u000bDw\u0018;IK\u0011", "u(E", "0h]149@avzxa,", "", "", "5dc\u000f\\5=/&\u0001\t<(z\f/$\r2\u0006Hz$'P~\u0012Dv\u001fBY\u0005 3{\u0016", "u(;7T=:\u001d)\u000e~euc\r=tU", "0h]153HP", "", "7mS2k", "", "D`[BX", "", "0h]176NP ~", "", "0h]1?6GU", "", "0h]1A<EZ", "0h]1F;KW\"\u0001", "", "1kT.e\tB\\\u0018\u0003\u0004`:", "1k^@X", "A`e249@a\b\tXZ*\u007f\t", "0h]1<5=S,", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class QueryInterceptorProgram implements SupportSQLiteProgram {
    private final List<Object> bindArgsCache = new ArrayList();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final List<Object> getBindArgsCache$room_runtime_release() {
        return this.bindArgsCache;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i2) {
        saveArgsToCache(i2, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i2, long j2) {
        saveArgsToCache(i2, Long.valueOf(j2));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i2, double d2) {
        saveArgsToCache(i2, Double.valueOf(d2));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i2, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        saveArgsToCache(i2, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i2, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        saveArgsToCache(i2, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.bindArgsCache.clear();
    }

    private final void saveArgsToCache(int i2, Object obj) {
        int size;
        int i3 = i2 - 1;
        if (i3 >= this.bindArgsCache.size() && (size = this.bindArgsCache.size()) <= i3) {
            while (true) {
                this.bindArgsCache.add(null);
                if (size == i3) {
                    break;
                } else {
                    size++;
                }
            }
        }
        this.bindArgsCache.set(i3, obj);
    }
}
