package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\":&\u007f\u0007ljA0RkP.XT2\u000fy\u0005<$a&yCIU\"}(\fWNusvϺ`ŏYƤ6\u0016'ilLǤ|] \u000fzQ}IKM\u001eHid\u0003B\u001d `)~э\u0005I&8U(v)J{\u0010 <XphYUY\u0013(*\u0006l'1\"jsf6vs&Q=2\u001bip^Wc>\te\rt[W\u0011\u0005r6+nB{՝%\u001c\u0017\u0015ds?1O\"A\u0013{?'YP$[Dl\u0018\u0014C2\u0018\u0013k\b>\\3g' w7]dcP<*N߁\bɁ@\u0004\u0016ͺwV<02h\u001e\raxIԢLг\u0006^JȕKmD\u001c=\u007fa-\u0010ӘrЂe;!\u05cb\b\u000b\u0013\u00136#/uW ڍ\u0012d-\u001dZ\u007f_:ҮDT"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9j@\u0006\u00165W\r*DC", "", "u(E", "4ha@g", "", "=sW2e:", "", "AdR<a+", "Ahi2", "", "5dc \\A>", "u(8", "5dc", "", "7mS2k", "<dgA63>O&", "<dgAF,M", "Adc", "", "D`[BX", "Adc\u001fT5@S", "AsP?g", "3mS", "BnBAe0GU", "", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BitVector {
    public static final int $stable = 8;
    private long first;
    private long[] others;
    private long second;

    public final int getSize() {
        long[] jArr = this.others;
        if (jArr != null) {
            return (jArr.length + 2) * 64;
        }
        return 128;
    }

    public final boolean get(int i2) {
        int i3;
        if (i2 < 0 || i2 >= getSize()) {
            throw new IllegalStateException(("Index " + i2 + " out of bound").toString());
        }
        if (i2 < 64) {
            long j2 = this.first;
            long j3 = 1 << i2;
            return (j3 + j2) - (j3 | j2) != 0;
        }
        if (i2 < 128) {
            return (-1) - (((-1) - (1 << (i2 - 64))) | ((-1) - this.second)) != 0;
        }
        long[] jArr = this.others;
        if (jArr != null && (i2 / 64) - 2 < jArr.length) {
            return (-1) - (((-1) - (1 << (i2 % 64))) | ((-1) - jArr[i3])) != 0;
        }
        return false;
    }

    public final void set(int i2, boolean z2) {
        long j2;
        long j3;
        if (i2 < 64) {
            long j4 = 1 << i2;
            if (z2) {
                j3 = (-1) - (((-1) - this.first) & ((-1) - j4));
            } else {
                long j5 = this.first;
                long j6 = ~j4;
                j3 = (j5 + j6) - (j5 | j6);
            }
            this.first = j3;
            return;
        }
        if (i2 < 128) {
            long j7 = 1 << (i2 - 64);
            if (z2) {
                long j8 = this.second;
                j2 = (j8 + j7) - (j8 & j7);
            } else {
                long j9 = this.second;
                long j10 = ~j7;
                j2 = (j9 + j10) - (j9 | j10);
            }
            this.second = j2;
            return;
        }
        int i3 = i2 / 64;
        int i4 = i3 - 2;
        long j11 = 1 << (i2 % 64);
        long[] jArrCopyOf = this.others;
        if (jArrCopyOf == null) {
            jArrCopyOf = new long[i3 - 1];
            this.others = jArrCopyOf;
        }
        if (i4 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3 - 1);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.others = jArrCopyOf;
        }
        long j12 = jArrCopyOf[i4];
        jArrCopyOf[i4] = z2 ? j11 | j12 : (-1) - (((-1) - (~j11)) | ((-1) - j12));
    }

    public final int nextSet(int i2) {
        int size = getSize();
        while (i2 < size) {
            if (get(i2)) {
                return i2;
            }
            i2++;
        }
        return Integer.MAX_VALUE;
    }

    public final int nextClear(int i2) {
        int size = getSize();
        while (i2 < size) {
            if (!get(i2)) {
                return i2;
            }
            i2++;
        }
        return Integer.MAX_VALUE;
    }

    public final void setRange(int i2, int i3) {
        while (i2 < i3) {
            set(i2, true);
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BitVector [");
        int size = getSize();
        boolean z2 = true;
        for (int i2 = 0; i2 < size; i2++) {
            if (get(i2)) {
                if (!z2) {
                    sb.append(", ");
                }
                sb.append(i2);
                z2 = false;
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
