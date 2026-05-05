package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
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
/* JADX INFO: compiled from: GapBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLш|\u0004O\u001d8é6B\r(4\u0012}\fnjG0L͜P.hS2\u000f\u0002{<$a'yCI_\"}(\rWNurvJ`\fK\u000f\u0014\"\u0001̓2Ikތ\u000e\u0012=1\u0003\u000bO7[oU9\u000fuF\t.4:8(\b\u0011\u001e8L(v)Fƚ\u0010\u0012>E9J`\u0017e\u0005H\u001d6F.\r6`\u0016[\u001fHKk\u0003E1\u0012\u0002B|2\u00104\u000b]%F\u0003*=zo/C@e8[%\u001c\t\u0015ds?1B8=Mw5:CI\"kf\\\u000e)-+}\u0010$ý&%\t_v$'YR,Y^%@w)\u0007=@\u0012&\u001e'v1s\u001a/8\u001cL\rr\u0002K\u0001\u0006lR\u0018z\u00109G)\u000eDC9Ii\u0002eI3f7* =$)\u0001|=sT<cE!Zw_Ni@kK\u0017\u0010g[\u0006\u0004\u001f\u0002H>T<U\u0006G{?/m©C٦=#)ǽRTRn\u000f\u0005\u000fk*֢^͕D\"vݫ\b6\u0017\u0014rD\u0013\bB¯`г0\u0011Uȼ%\u0013\f\u0011+ \u000bz\u0013Ɯ1ŎROpȉҽQ}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PE(YS7HMN92", "", "7mXA5<?T\u0019\f", "", "7mXA:(IA(z\bm", "", "7mXA:(I3\"}", "uZ2\u0016<o/", "0tU3X9", "1`_.V0Mg", "5`_\u0012a+", "5`_ g(Kb", "/o_2a+", "", "0tX9W,K", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", "2d[2g,", "AsP?g", "3mS", "5`_\u0019X5@b\u001c", "5dc", "", "7mS2k", ":d]4g/", ";`Z2F<KSt\u0010vb3x\u00066em3w>\u0001", "@d`BX:MA\u001d\u0014z", "@d_9T*>", "BdgA", "", "BdgAF;:`(", "BdgA85=", "BnBAe0GU", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class GapBuffer {
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    public GapBuffer(char[] cArr, int i2, int i3) {
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i2;
        this.gapEnd = i3;
    }

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    public final char get(int i2) {
        int i3 = this.gapStart;
        if (i2 < i3) {
            return this.buffer[i2];
        }
        return this.buffer[(i2 - i3) + this.gapEnd];
    }

    private final void makeSureAvailableSpace(int i2) {
        if (i2 <= gapLength()) {
            return;
        }
        int iGapLength = i2 - gapLength();
        int i3 = this.capacity;
        do {
            i3 *= 2;
        } while (i3 - this.capacity < iGapLength);
        char[] cArr = new char[i3];
        ArraysKt.copyInto(this.buffer, cArr, 0, 0, this.gapStart);
        int i4 = this.capacity;
        int i5 = this.gapEnd;
        int i6 = i4 - i5;
        int i7 = i3 - i6;
        ArraysKt.copyInto(this.buffer, cArr, i7, i5, i6 + i5);
        this.buffer = cArr;
        this.capacity = i3;
        this.gapEnd = i7;
    }

    private final void delete(int i2, int i3) {
        int i4 = this.gapStart;
        if (i2 < i4 && i3 <= i4) {
            int i5 = i4 - i3;
            char[] cArr = this.buffer;
            ArraysKt.copyInto(cArr, cArr, this.gapEnd - i5, i3, i4);
            this.gapStart = i2;
            this.gapEnd -= i5;
            return;
        }
        if (i2 < i4 && i3 >= i4) {
            this.gapEnd = i3 + gapLength();
            this.gapStart = i2;
            return;
        }
        int iGapLength = i2 + gapLength();
        int iGapLength2 = i3 + gapLength();
        int i6 = this.gapEnd;
        char[] cArr2 = this.buffer;
        ArraysKt.copyInto(cArr2, cArr2, this.gapStart, i6, iGapLength);
        this.gapStart += iGapLength - i6;
        this.gapEnd = iGapLength2;
    }

    public static /* synthetic */ void replace$default(GapBuffer gapBuffer, int i2, int i3, CharSequence charSequence, int i4, int i5, int i6, Object obj) {
        if ((8 & i6) != 0) {
            i4 = 0;
        }
        if ((i6 + 16) - (i6 | 16) != 0) {
            i5 = charSequence.length();
        }
        gapBuffer.replace(i2, i3, charSequence, i4, i5);
    }

    public final void replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        int i6 = i5 - i4;
        makeSureAvailableSpace(i6 - (i3 - i2));
        delete(i2, i3);
        ToCharArray_androidKt.toCharArray(charSequence, this.buffer, this.gapStart, i4, i5);
        this.gapStart += i6;
    }

    public final void append(StringBuilder sb) {
        Intrinsics.checkNotNullExpressionValue(sb.append(this.buffer, 0, this.gapStart), "this.append(value, start…x, endIndex - startIndex)");
        char[] cArr = this.buffer;
        int i2 = this.gapEnd;
        Intrinsics.checkNotNullExpressionValue(sb.append(cArr, i2, this.capacity - i2), "this.append(value, start…x, endIndex - startIndex)");
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        return sb.toString();
    }
}
