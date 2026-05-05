package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>\u00156B\u0015\"4\u0012}\u0010njG9LeN/ZS8şsڔ<$i*yCAU\"}0\u0015WNmg\u0005Ϻx#s\u000f4\u0015)p<Kex\f\u0013=2ruO5]ok:\u000fvn\u00048r5H}\u0013\u00042*v\u0011\u0007~QO$\u0012^A¤>R\u001bRM) \u0013V /,\rk\\E`l\f;uݡ\u00032S\\7w0+[=Lb8%xw\u001dYR}ߥ\u0015mY\u0011\u001aj[m\u0017\u0006\u0006\u0006\u000bv<?+w\u0002\u001eJ!\u0006\"+CO;t9:-\u001d_f$'YP\u001a '˃*Þ~\u0006\u001d>\n\u0015\u0014/`03#t\u0012^E\u0003vk@~\u0003\u0015\u0017Vфcي\u001b)\u001851D)p\"sI\u001cf7*\u0006CryоpĲ_X&b\u001b'b\u0002ά5j"}, d2 = {"\u001aj^A_0G\u001d&z\u0004`,\u000bR\rh{5h<\n\u0019\u0017\u001d", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rh{5fM\u000b\u0019$G}\u001c@\u0001.\u000b", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?m\u0013 Ioc", "", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0019p\u007f1[I\u007f\u0004\u0013Pq\u000e\u0012", "AsP?g", "3mS\u0016a*Ec'\u0003\f^", "uB2uI", "3mS\u0012k*Ec'\u0003\f^", "5dc\u0012a+\u001ef\u0017\u0006\u000bl0\u000e\tma\t1\u0006O|&\u001bQx\u001c", "u(E", "5dc\u0012a+\u001ef\u0017\u0006\u000bl0\u000e\t", "u(;7T=:\u001d z\u0004`uZ\f+r{&\u000b@\u000el", "5dc\u0012a+\"\\\u0017\u0006\u000bl0\u000e\t", "5dc g(Kb", "1n]AT0Ga", "", "D`[BX", "3pd._:", "=sW2e", "", "6`b566=S", "", "7r4:c;R", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CharRange extends CharProgression implements ClosedRange<Character>, OpenEndRange<Character> {
    public static final Companion Companion = new Companion(null);
    private static final CharRange EMPTY = new CharRange(1, 0);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001aj^A_0G\u001d&z\u0004`,\u000bR\rh{5h<\n\u0019\u0017\u0006M\u0018D\u0002!>]\b)\r", "", "u(E", "\u0013L?!L", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rh{5h<\n\u0019\u0017\u001d", "5dc\u0012@\u0017-G", "u(;8b;EW\"H\bZ5~\t=/]+wMm\u0013 Ioc", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CharRange getEMPTY() {
            return CharRange.EMPTY;
        }
    }

    public CharRange(char c2, char c3) {
        super(c2, c3, 1);
    }

    @Deprecated(message = "\u0006G\nt\u0006|'fo\u0007)\t\u0010\u001aDQa\\\u001d0\u0014vKi~K|*W\tjy(UqR\\o{BH*8y&e\f\f'hZ@xCB&K[\u001cIZ\r5\u000e\b\u0011/N%_\u0006;@*\t\u000e\b$X\u000bFyg7b\u0002zX4o\t0\u0002'\u0010O=\u0007 #JMZ\u0017_1?El\u007fV/O>brO6/\u000f&\u0013f$V\u0014\u0004tiQnM\u007f^W\u0017i\u000f\"1\bE\u0002b\u0001{H]=\n(\u0006]d t\u0011|ltx\u001b:}ak\u000bm\"\u000e,YuY\u001el<8 Y?\rUpL['nYfC\r4\u0011yqM5")
    @InterfaceC1492Gx
    public static /* synthetic */ void getEndExclusive$annotations() {
    }

    public boolean contains(char c2) {
        return Intrinsics.compare((int) getFirst(), (int) c2) <= 0 && Intrinsics.compare((int) c2, (int) getLast()) <= 0;
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Character) comparable).charValue());
    }

    @Override // kotlin.ranges.CharProgression
    public boolean equals(Object obj) {
        if (obj instanceof CharRange) {
            if (!isEmpty() || !((CharRange) obj).isEmpty()) {
                CharRange charRange = (CharRange) obj;
                if (getFirst() != charRange.getFirst() || getLast() != charRange.getLast()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    public Character getEndExclusive() {
        if (getLast() != 65535) {
            return Character.valueOf((char) (getLast() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // kotlin.ranges.ClosedRange
    public Character getEndInclusive() {
        return Character.valueOf(getLast());
    }

    @Override // kotlin.ranges.ClosedRange
    public Character getStart() {
        return Character.valueOf(getFirst());
    }

    @Override // kotlin.ranges.CharProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    @Override // kotlin.ranges.CharProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return Intrinsics.compare((int) getFirst(), (int) getLast()) > 0;
    }

    @Override // kotlin.ranges.CharProgression
    public String toString() {
        return getFirst() + ".." + getLast();
    }
}
