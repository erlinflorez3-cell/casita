package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.ranges.IntRange;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&˛\bDRш|İI\u0006>\u00116B\u0005&4\u0012\u0006\u0016nj?2LeV.ZS0\u0016q Jř\u0004*wّITB}P\t\u007fN\u0016g/Uj\u000fQ\u0010\u001e\u0016'l߽MU\u0007`Z @O\b?a[ AGo\r6;ړݨ&8\b\u0015I 8I(v)E\u0012\u000eZKN\u0002RRC˟5\u001e \u0018V 7Ȧ\rk\\I`l\u0014Žu%ɨmB\\;(?\u000bb%F\u0003)5v\u0018Ӝqb˝9\u00153iS\u001f`_W\u0003ms\u0014ݠtҊ+7Q֕o8^\u0005\"\u001bKQ\u0013d\u0001)-\u0011_a$'YQ:֢Rˎ,w\u0003Ԉ]X\u0012\u0016\u001e/X2=\u001c|\u0007Dޗ#{*öRؿbJ\bzoB''\u0006=9DӾjh"}, d2 = {"\u001aj^A_0G\u001d\u001e\u0010\u0003(0\u0006\u0018/r\t$\u0003\nk$\u001bOs\u001d@\b%#d\u000b 3lr>QJ:kAs", "\"", "", "Ahi2", "", "uH\u0018#", ">nb6g0H\\", "5dc\u001db:Bb\u001d\t\u0004", "u(8", "Adc\u001db:Bb\u001d\t\u0004", "Aoa2T+L", "", "5dc c9>O\u0018\r9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "u(E", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "/cS c9>O\u0018", "", "Aoa2T+\u001a`\u001b\u000f\u0003^5\f", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "Bn0?e(R", "D`[BX:", "@dbB_;", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", "5dc \\A>", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class PrimitiveSpreadBuilder<T> {
    private int position;
    private final int size;
    private final T[] spreads;

    public PrimitiveSpreadBuilder(int i2) {
        this.size = i2;
        this.spreads = (T[]) new Object[i2];
    }

    private static /* synthetic */ void getSpreads$annotations() {
    }

    public final void addSpread(T spreadArgument) {
        Intrinsics.checkNotNullParameter(spreadArgument, "spreadArgument");
        T[] tArr = this.spreads;
        int i2 = this.position;
        this.position = i2 + 1;
        tArr[i2] = spreadArgument;
    }

    protected final int getPosition() {
        return this.position;
    }

    protected abstract int getSize(T t2);

    protected final void setPosition(int i2) {
        this.position = i2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.IntIterator] */
    protected final int size() {
        int size = 0;
        ?? it = new IntRange(0, this.size - 1).iterator();
        while (it.hasNext()) {
            T t2 = this.spreads[it.nextInt()];
            size += t2 != null ? getSize(t2) : 1;
        }
        return size;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.IntIterator] */
    protected final T toArray(T values, T result) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(result, "result");
        ?? it = new IntRange(0, this.size - 1).iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            T t2 = this.spreads[iNextInt];
            if (t2 != null) {
                if (i2 < iNextInt) {
                    int i4 = iNextInt - i2;
                    System.arraycopy(values, i2, result, i3, i4);
                    i3 += i4;
                }
                int size = getSize(t2);
                System.arraycopy(t2, 0, result, i3, size);
                i3 += size;
                i2 = iNextInt + 1;
            }
        }
        int i5 = this.size;
        if (i2 < i5) {
            System.arraycopy(values, i2, result, i3, i5 - i2);
        }
        return result;
    }
}
