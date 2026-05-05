package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLcz\u0004I\u0006>\"6Ȑ\u0007\":\u0018\u007fјnjG0LeN/ZS8\u001bs{:-c$\u007fMCU }*\t]UogtJ`ŏYƤ6\u0016'ilLǤ|] \u000fz`}DKM\u001eCid\u0003=\u001d `&h}\u0013\t2*v\u0014'~QT$\u0012^J7:\u001b\u001b[\u00102\u00124DP\u0005,h\u007fNdL3]\u0003E1\u0010\u0002B|+\u00104\u000b[%F\u0003+=zo-C@e9[%\u001c\t\u0015bs?1E8QMn58CI\"a|lH\"#=g\r\fxV`\u0013dx\fU5\u0016w\u0014^\u001c<\u0010z*\u0013l\b\u001c\u001b?H\\C`zP\u001cA\f\u000bSnV2bP\u0018\u0013ad0k\u0014{9G5~Q\u0010AIRE\u000f\u001d\rL-G\u0003qgb\u000fx\u0015IVNΆ=ҨD=PݐZeKp\u001cp\u0011\u0006\u0001ʹ<Ͻ\u0004/\u0004߾ѭ\u001b@"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u0013[MDZ>\f$ueB\tU9R\u0006'T\"", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u0013[MD]A\"$hn\u000f", "u(E", "/qa.l", "", "Ahi2", "", "/o_2a+,b&\u0003\u0004`\u001a\u0004\u0013AP{7~", "", "4ha@g\fLQ\u0015\nz]\n\u007f\u0005<", "1ta?X5MA\u001d\u0014z", "Asa6a.", "", "3mbBe,\u001aR\u0018\u0003\nb6\u0006\u00056C{3w>\u0005&+", "3w_2V;>R", "3mbBe,-](z\u0002<(\b\u0005-i\u000f<", "=kS \\A>", "/cS6g0H\\\u0015\u0006", "@d[2T:>", "BnBAe0GU", "EqXAX", "BdgA", "EqXAX\nAO&", "1gP?", "", "EqXAX\u0013H\\\u001b", "D`[BX", "", "EqXAX\u0018N](~y", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class JsonToStringWriter implements JsonWriter {
    private char[] array = CharArrayPool.INSTANCE.take();
    private int size;

    private final void appendStringSlowPath(int i2, int i3, String str) {
        int length = str.length();
        while (i2 < length) {
            int iEnsureTotalCapacity = ensureTotalCapacity(i3, 2);
            char cCharAt = str.charAt(i2);
            if (cCharAt < StringOpsKt.getESCAPE_MARKERS().length) {
                byte b2 = StringOpsKt.getESCAPE_MARKERS()[cCharAt];
                if (b2 == 0) {
                    i3 = iEnsureTotalCapacity + 1;
                    this.array[iEnsureTotalCapacity] = cCharAt;
                } else if (b2 == 1) {
                    String str2 = StringOpsKt.getESCAPE_STRINGS()[cCharAt];
                    Intrinsics.checkNotNull(str2);
                    int iEnsureTotalCapacity2 = ensureTotalCapacity(iEnsureTotalCapacity, str2.length());
                    str2.getChars(0, str2.length(), this.array, iEnsureTotalCapacity2);
                    i3 = iEnsureTotalCapacity2 + str2.length();
                    this.size = i3;
                } else {
                    char[] cArr = this.array;
                    cArr[iEnsureTotalCapacity] = '\\';
                    cArr[iEnsureTotalCapacity + 1] = (char) b2;
                    i3 = iEnsureTotalCapacity + 2;
                    this.size = i3;
                }
            } else {
                i3 = iEnsureTotalCapacity + 1;
                this.array[iEnsureTotalCapacity] = cCharAt;
            }
            i2++;
        }
        int iEnsureTotalCapacity3 = ensureTotalCapacity(i3, 1);
        this.array[iEnsureTotalCapacity3] = '\"';
        this.size = iEnsureTotalCapacity3 + 1;
    }

    private final void ensureAdditionalCapacity(int i2) {
        ensureTotalCapacity(this.size, i2);
    }

    private final int ensureTotalCapacity(int i2, int i3) {
        int i4 = i3 + i2;
        char[] cArr = this.array;
        if (cArr.length <= i4) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i4, i2 * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(this, newSize)");
            this.array = cArrCopyOf;
        }
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void release() {
        CharArrayPool.INSTANCE.release(this.array);
    }

    public String toString() {
        return new String(this.array, 0, this.size);
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void write(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        ensureAdditionalCapacity(length);
        text.getChars(0, text.length(), this.array, this.size);
        this.size += length;
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void writeChar(char c2) {
        ensureAdditionalCapacity(1);
        char[] cArr = this.array;
        int i2 = this.size;
        this.size = i2 + 1;
        cArr[i2] = c2;
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void writeLong(long j2) {
        write(String.valueOf(j2));
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void writeQuoted(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ensureAdditionalCapacity(text.length() + 2);
        char[] cArr = this.array;
        int i2 = this.size;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        for (int i5 = i3; i5 < i4; i5++) {
            char c2 = cArr[i5];
            if (c2 < StringOpsKt.getESCAPE_MARKERS().length && StringOpsKt.getESCAPE_MARKERS()[c2] != 0) {
                appendStringSlowPath(i5 - i3, i5, text);
                return;
            }
        }
        cArr[i4] = '\"';
        this.size = i4 + 1;
    }
}
