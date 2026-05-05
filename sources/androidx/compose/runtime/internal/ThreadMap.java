package androidx.compose.runtime.internal;

import kotlin.Metadata;
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
/* JADX INFO: compiled from: ThreadMap.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r64ߚ\u007f\u0007tyA0JgP.`Z2\u000fq}<$i-yّA٥0ԂR\t}M(\u000b~Nh\u000b[\u000f4\u0017\tn:Kmx\f\u0015\u001f>PsW;]sM;vsd\u0004N7ŕ<y\u0013\u0007b8V\u0018\u000fzqL<\u0016>I\t:\u0001\u0017\u0014\u0005b \u0014I8\u00034[\u0016MfLzfR/Q\r2X\\3w0+ձ=Jb0%v\u0010([FEB-'i\u00025Q$U\u0011M\n=3wW+9R\fWdb0\u001a#8g\u000fsqT[U]n\u000e?+}f\"ַ\u0010߭{z\u0004Ȟ\r\u0010\u001c\u0006?H\\.pǔ\nԧ7tzԟ\u0011f\u0010bZ\b\u000beF\u0019;~a*g =Ϣcޅ\u001dP?{\u0013\u0014̽'\u0011"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u0012E\u0006%Bby'\u0001\\\u0019;M?:S0)j", "", "Ahi2", "", "9dh@", "", "D`[BX:", "", "uHJ\u0017N\u0013CO*zDe(\u0006\u000bxO|-{>\u0010lZ8", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "4h]1", "9dh", "", "5dc", "<df$\\;A", "D`[BX", "Bqh X;", "", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ThreadMap {
    public static final int $stable = 8;
    private final long[] keys;
    private final int size;
    private final Object[] values;

    public ThreadMap(int i2, long[] jArr, Object[] objArr) {
        this.size = i2;
        this.keys = jArr;
        this.values = objArr;
    }

    public final Object get(long j2) {
        int iFind = find(j2);
        if (iFind >= 0) {
            return this.values[iFind];
        }
        return null;
    }

    public final boolean trySet(long j2, Object obj) {
        int iFind = find(j2);
        if (iFind < 0) {
            return false;
        }
        this.values[iFind] = obj;
        return true;
    }

    public final ThreadMap newWith(long j2, Object obj) {
        int i2 = this.size;
        int i3 = 0;
        int i4 = 0;
        for (Object obj2 : this.values) {
            if (obj2 != null) {
                i4++;
            }
        }
        int i5 = i4 + 1;
        long[] jArr = new long[i5];
        Object[] objArr = new Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (true) {
                if (i3 >= i5 || i6 >= i2) {
                    break;
                }
                long j3 = this.keys[i6];
                Object obj3 = this.values[i6];
                if (j3 > j2) {
                    jArr[i3] = j2;
                    objArr[i3] = obj;
                    i3++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i3] = j3;
                    objArr[i3] = obj3;
                    i3++;
                }
                i6++;
            }
            if (i6 == i2) {
                jArr[i4] = j2;
                objArr[i4] = obj;
            } else {
                while (i3 < i5) {
                    long j4 = this.keys[i6];
                    Object obj4 = this.values[i6];
                    if (obj4 != null) {
                        jArr[i3] = j4;
                        objArr[i3] = obj4;
                        i3++;
                    }
                    i6++;
                }
            }
        } else {
            jArr[0] = j2;
            objArr[0] = obj;
        }
        return new ThreadMap(i5, jArr, objArr);
    }

    private final int find(long j2) {
        int i2 = this.size - 1;
        if (i2 == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 0) {
            long j3 = this.keys[0];
            if (j3 == j2) {
                return 0;
            }
            return j3 > j2 ? -2 : -1;
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j4 = this.keys[i4] - j2;
            if (j4 < 0) {
                i3 = i4 + 1;
            } else {
                if (j4 <= 0) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }
}
