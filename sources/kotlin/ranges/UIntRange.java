package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4\u0012}\u0010njG9LeN1ZS8şsڔ<$i*yCAU\"}0\u0015WNmgtOpŏa)6\u0016'i\\Oezm\u0012=3poo9]qM9\u000fud\u0007X1<x\r\u0015\u0005(-`\u0010%{SO\u001a\u0016H@\u001f;ň\u0011M\u0013\u001fZ\u001cL-\u0019\u001e\u000bu~:V{u:]$IݚBĚ+a6\r[\u001e\u000fe5\u001f\u000faL9p=C(=U\u0019\u0006\u0001o\u0006Ÿ?:C\u0013}?'Y_:k~^\u000e+-+}\u001b$\u0007nb\u0013ix\fUD\u0016w\u001ck\u001c.\u0010z*\u000erXdΒ)З-Ʀբj\u0012\u001e5zyaHh\u0004dK\u000e\u00052K%)\u00183Y:Q;(ļ=уMљ߉\t\u00116%\u0007y/e%#n\u00183T&Rg&\u0017חJ߉\tԯǀq\b\td\b6\u0012:ϝ\u007f1\u0004\u001146Ï;v"}, d2 = {"\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fI\t7h<\n\u0019\u0017\u001d", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fI\t7fM\u000b\u0019$G}\u001c@\u0001.\u000b", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?m\u0013 Ioc", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0019p\u007f1[I\u007f\u0004\u0013Pq\u000e\u0012", "AsP?g", "3mS\u0016a*Ec'\u0003\f^", "uH8\u0019^6MZ\u001d\bDc=\u0005R3n\u000f(\tI|\u001e`&o\u000f8\u0007,D7\b)E|#>KREx\u001c\u001a\"naF\\'\u001d", "3mS\u0012k*Ec'\u0003\f^", "5dc\u0012a+\u001ef\u0017\u0006\u000bl0\u000e\tvpp*K\u001c\u000erUCx\u0017F\u0006!D]\b)E", "u(E", "5dc\u0012a+\u001ef\u0017\u0006\u000bl0\u000e\tvpp*K\u001c\u000er", "u(8", "5dc\u0012a+\"\\\u0017\u0006\u000bl0\u000e\tvpp*K\u001c\u000er", "5dc g(Kb`\nk`{X\u0016\u000b", "1n]AT0Ga", "", "D`[BX", "1n]AT0Ga`po-\u0018Lq=", "uH\u0018'", "3pd._:", "=sW2e", "", "6`b566=S", "", "7r4:c;R", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class UIntRange extends UIntProgression implements ClosedRange<UInt>, OpenEndRange<UInt> {
    public static final Companion Companion = new Companion(null);
    private static final UIntRange EMPTY = new UIntRange(-1, 0, null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fI\t7h<\n\u0019\u0017\u0006M\u0018D\u0002!>]\b)\r", "", "u(E", "\u0013L?!L", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fI\t7h<\n\u0019\u0017\u001d", "5dc\u0012@\u0017-G", "u(;8b;EW\"H\bZ5~\t=/o\f\u0005Om\u0013 Ioc", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UIntRange getEMPTY() {
            return UIntRange.EMPTY;
        }
    }

    private UIntRange(int i2, int i3) {
        super(i2, i3, 1, null);
    }

    public /* synthetic */ UIntRange(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3);
    }

    @Deprecated(message = "\u0006G\nt\u0006|'fo\u0007)\t\u0010\u001aDQa\\\u001d0\u0014vKi~K|*W\tjy(UqR\\o{BH*8y&e\f\f'hZ@xCB&K[\u001cIZ\r5\u000e\b\u0011/N%_\u0006;R\u000b\u0016\u0010\b$X\u000bFyg7b\u0002zX4o\t0\u0002'\u0010O=\u0007 #JMZ\u0017_1?El\u007fV/O>brO6/\u000f&\u0013f$V\u0014\u0004tiQnM\u007f^W\u0017i\u000f\"1\bE\u0002b\u0001{H]=\n(\u0006]d t\u0011|ltx\u001b:}ak\u000bm\"\u000e,YuY\u001el<8 Y?\rUpL['nYfC\r4\u0011yqM5")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: getEndExclusive-pVg5ArA$annotations */
    public static /* synthetic */ void m10207getEndExclusivepVg5ArA$annotations() {
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m10208containsWZ4Q5Ns(((UInt) comparable).m9127unboximpl());
    }

    /* JADX INFO: renamed from: contains-WZ4Q5Ns */
    public boolean m10208containsWZ4Q5Ns(int i2) {
        return Integer.compareUnsigned(m10203getFirstpVg5ArA(), i2) <= 0 && Integer.compareUnsigned(i2, m10204getLastpVg5ArA()) <= 0;
    }

    @Override // kotlin.ranges.UIntProgression
    public boolean equals(Object obj) {
        if (obj instanceof UIntRange) {
            if (!isEmpty() || !((UIntRange) obj).isEmpty()) {
                UIntRange uIntRange = (UIntRange) obj;
                if (m10203getFirstpVg5ArA() != uIntRange.m10203getFirstpVg5ArA() || m10204getLastpVg5ArA() != uIntRange.m10204getLastpVg5ArA()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ Comparable getEndExclusive() {
        return UInt.m9069boximpl(m10209getEndExclusivepVg5ArA());
    }

    /* JADX INFO: renamed from: getEndExclusive-pVg5ArA */
    public int m10209getEndExclusivepVg5ArA() {
        if (m10204getLastpVg5ArA() != -1) {
            return UInt.m9075constructorimpl(m10204getLastpVg5ArA() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ Comparable getEndInclusive() {
        return UInt.m9069boximpl(m10210getEndInclusivepVg5ArA());
    }

    /* JADX INFO: renamed from: getEndInclusive-pVg5ArA */
    public int m10210getEndInclusivepVg5ArA() {
        return m10204getLastpVg5ArA();
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ Comparable getStart() {
        return UInt.m9069boximpl(m10211getStartpVg5ArA());
    }

    /* JADX INFO: renamed from: getStart-pVg5ArA */
    public int m10211getStartpVg5ArA() {
        return m10203getFirstpVg5ArA();
    }

    @Override // kotlin.ranges.UIntProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m10203getFirstpVg5ArA() * 31) + m10204getLastpVg5ArA();
    }

    @Override // kotlin.ranges.UIntProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return Integer.compareUnsigned(m10203getFirstpVg5ArA(), m10204getLastpVg5ArA()) > 0;
    }

    @Override // kotlin.ranges.UIntProgression
    public String toString() {
        return ((Object) UInt.m9121toStringimpl(m10203getFirstpVg5ArA())) + ".." + ((Object) UInt.m9121toStringimpl(m10204getLastpVg5ArA()));
    }
}
