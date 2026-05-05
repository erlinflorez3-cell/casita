package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
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
/* JADX INFO: compiled from: OffsetMappingCalculator.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\rnʑA0ZeP.XS2\u000fy\u0005<$a0yCIU\"}(\u000bUȞ}˧\u001fJ\t\n\u0004\u0012و\u001axx,\u0012x\u0007c*\u000f`I CAU\b=ge%:\u0013)J\"f\u0004K\u0001˖)GȮuٙŲO\u000e\u0018;N|\u0003k\u001bZ\u001d\u001a@\rn$\u000f&tg|;֘k\\Ƕ.݊ɨmDT5m?Ef\u001bVl';}\u0012\"9HO5C*ھ\u0002\u0006ӱZΪƄCsC\u0016v6ofW\u0006o6\u0007\u0007D\u00199W%]!+\r\t_s$'YT\u0014O^\"@w)\u0001=@\u0012#\u001e'v3]\u001et\u0011&3#|\u001a@҉\u0001]݆~Эˋ:\u0019+\u0016AB\u00027tiy;Ggg\u007f\u0013'6#/sQ_b)x\u0015IY(U?mX=vSZmKn\u001cp\u0011\u0004\u0001ʹ<ѓ~\u07fcʾ\u0010-ϲ)9c91$<\u000eVH\u007fv3e?\u05c8uʐL@*Âݮ73\u0011\u000f`և\u00013jXT^KҳQ9"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PM-O\u0005'V4J7gV{?q\u000ea\f^2\t\u0014cNy", "", "u(E", "=ob", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PM7*\u00044C`$", ")H", "=ob \\A>", "", ";`_", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "=eU@X;", "4q^:F6N`\u0017~", "", ";`_yYAQdc\u0010E", "uHIu=", ";`_\u0013e6F2\u0019\r\n", ";`_\u0013e6F2\u0019\r\n&s\u0002\u001c\u0001J`6", "uH\u0018\u0017", ";`_\u0013e6FA#\u000f\b\\,", ";`_\u0013e6FA#\u000f\b\\,DP4xQ\r\\N", ";`_ g,I", "=o>3Y:>b", "Cmc?T5LT#\f\u0003^+c\t8", "BqP;f-H`!~yE,\u0006", ";`_ g,I\u001bvO\u000b&\u0014\\|", "uH8\u0016<!\u00028", "@dR<e+\u001eR\u001d\u000edi,\n\u0005>i\n1", "", "And?V,,b\u0015\f\n", "And?V,\u001e\\\u0018", "<df\u0019X5@b\u001c", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class OffsetMappingCalculator {
    public static final int $stable = 8;
    private int[] ops = OpArray.m1520constructorimpl(10);
    private int opsSize;

    public final void recordEditOperation(int i2, int i3, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(("Expected newLen to be ≥ 0, was " + i4).toString());
        }
        int iMin = Math.min(i2, i3);
        int iMax = Math.max(iMin, i3) - iMin;
        if (iMax >= 2 || iMax != i4) {
            int i5 = this.opsSize + 1;
            if (i5 > OpArray.m1527getSizeimpl(this.ops)) {
                this.ops = OpArray.m1522copyOfpSmdads(this.ops, Math.max(i5 * 2, OpArray.m1527getSizeimpl(this.ops) * 2));
            }
            OpArray.m1529setimpl(this.ops, this.opsSize, iMin, iMax, i4);
            this.opsSize = i5;
        }
    }

    /* JADX INFO: renamed from: mapFromSource--jx7JFs */
    public final long m1518mapFromSourcejx7JFs(int i2) {
        return m1515mapfzxv0v0(i2, true);
    }

    /* JADX INFO: renamed from: mapFromDest--jx7JFs */
    public final long m1517mapFromDestjx7JFs(int i2) {
        return m1515mapfzxv0v0(i2, false);
    }

    /* JADX INFO: renamed from: map-fzxv0v0 */
    private final long m1515mapfzxv0v0(int i2, boolean z2) {
        int i3;
        int iMax = i2;
        int[] iArr = this.ops;
        int i4 = this.opsSize;
        if (i4 < 0) {
            i3 = iMax;
        } else if (z2) {
            int iMin = iMax;
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = i5 * 3;
                int i7 = iArr[i6];
                int i8 = iArr[i6 + 1];
                int i9 = iArr[i6 + 2];
                long jM1516mapStepC6uMEY = m1516mapStepC6uMEY(iMin, i7, i8, i9, z2);
                long jM1516mapStepC6uMEY2 = m1516mapStepC6uMEY(iMax, i7, i8, i9, z2);
                iMin = Math.min(TextRange.m6123getStartimpl(jM1516mapStepC6uMEY), TextRange.m6123getStartimpl(jM1516mapStepC6uMEY2));
                iMax = Math.max(TextRange.m6118getEndimpl(jM1516mapStepC6uMEY), TextRange.m6118getEndimpl(jM1516mapStepC6uMEY2));
            }
            i3 = iMax;
            iMax = iMin;
        } else {
            int iMin2 = iMax;
            for (int i10 = i4 - 1; -1 < i10; i10--) {
                int i11 = i10 * 3;
                int i12 = iArr[i11];
                int i13 = iArr[i11 + 1];
                int i14 = iArr[i11 + 2];
                long jM1516mapStepC6uMEY3 = m1516mapStepC6uMEY(iMin2, i12, i13, i14, z2);
                long jM1516mapStepC6uMEY4 = m1516mapStepC6uMEY(iMax, i12, i13, i14, z2);
                iMin2 = Math.min(TextRange.m6123getStartimpl(jM1516mapStepC6uMEY3), TextRange.m6123getStartimpl(jM1516mapStepC6uMEY4));
                iMax = Math.max(TextRange.m6118getEndimpl(jM1516mapStepC6uMEY3), TextRange.m6118getEndimpl(jM1516mapStepC6uMEY4));
            }
            i3 = iMax;
            iMax = iMin2;
        }
        return TextRangeKt.TextRange(iMax, i3);
    }

    /* JADX INFO: renamed from: mapStep-C6u-MEY */
    private final long m1516mapStepC6uMEY(int i2, int i3, int i4, int i5, boolean z2) {
        int i6 = z2 ? i4 : i5;
        if (z2) {
            i4 = i5;
        }
        if (i2 < i3) {
            return TextRangeKt.TextRange(i2);
        }
        if (i2 == i3) {
            if (i6 == 0) {
                return TextRangeKt.TextRange(i3, i4 + i3);
            }
            return TextRangeKt.TextRange(i3);
        }
        if (i2 >= i3 + i6) {
            return TextRangeKt.TextRange((i2 - i6) + i4);
        }
        if (i4 == 0) {
            return TextRangeKt.TextRange(i3);
        }
        return TextRangeKt.TextRange(i3, i4 + i3);
    }
}
