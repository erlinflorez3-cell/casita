package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000e^Lc\u0003\u000eI\u00066\f6B\r(4\u0012}\u000enjG9L͜P.`ݷ2\u000fq|<$q$yّCU(\n*\tUNm{\u0005Ϻx\"s\u0015\u0016\u0018\tjZI\u0004w\u0016\u0011&r_uЀCQ}>Q`#6\u0015$@$Py3\u0001*.V\u0013\u000fzqOë\u00160Nu\u0003c\u001bZ\u001d\u001a@\u0014n&\u000f-tid5v|$Ɣ/k\twSf'\u000e4CaULb9%v\u0010,qT\u007f<#8k\u00035f\"ρ\u0003\bwK\u001a\u0001'UA\u0010\b(Ef\u0006,\u0015YOոax.ؘ\u001dSf\u001353 rYY&(&zԫ\u0011B\f\u05fa\u001e)N8;\"7\u0017\u001c6\rr\u0002Dг\u0006dJȕ\u0013c<\"3\fĺ/Q"}, d2 = {"\u001aj^A_0G\u001d&z\u0004`,\u000bR\rh{5fM\u000b\u0019$G}\u001c@\u0001.\u000b", "", "", "AsP?g", "3mS\u0016a*Ec'\u0003\f^", "AsT=", "", "uB2\u0016\u001c\u001d", "4ha@g", "5dc\u0013\\9Lb", "u(2", ":`bA", "5dc\u0019T:M", "5dc g,I", "u(8", "3pd._:", "", "=sW2e", "", "6`b566=S", "7r4:c;R", "7sT?T;H`", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001e\u0004\u0013$+~\u000eIr4?fS", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class CharProgression implements Iterable<Character>, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    private final char first;
    private final char last;
    private final int step;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001c\u007f\u0007ljA0RkP\u008cXݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018juh\u0007J\t\rs\u0013\u0014\u0019\u0011jZM\u0006|k\u0017'2pso7[uU9\u000f{ȫ\t("}, d2 = {"\u001aj^A_0G\u001d&z\u0004`,\u000bR\rh{5fM\u000b\u0019$G}\u001c@\u0001.s7\b(Bi\u001f2WL\u0011", "", "u(E", "4q^:63Ha\u0019}gZ5~\t", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rh{5fM\u000b\u0019$G}\u001c@\u0001.\u000b", "@`]4X\u001aMO&\u000e", "", "@`]4X\fGR", "AsT=", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CharProgression fromClosedRange(char c2, char c3, int i2) {
            return new CharProgression(c2, c3, i2);
        }
    }

    public CharProgression(char c2, char c3, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i2 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = c2;
        this.last = (char) ProgressionUtilKt.getProgressionLastElement((int) c2, (int) c3, i2);
        this.step = i2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CharProgression) {
            if (!isEmpty() || !((CharProgression) obj).isEmpty()) {
                CharProgression charProgression = (CharProgression) obj;
                if (this.first != charProgression.first || this.last != charProgression.last || this.step != charProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    public final char getFirst() {
        return this.first;
    }

    public final char getLast() {
        return this.last;
    }

    public final int getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }

    public boolean isEmpty() {
        if (this.step > 0) {
            if (Intrinsics.compare((int) this.first, (int) this.last) > 0) {
                return true;
            }
        } else if (Intrinsics.compare((int) this.first, (int) this.last) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Character> iterator() {
        return new CharProgressionIterator(this.first, this.last, this.step);
    }

    public String toString() {
        StringBuilder sbAppend;
        int i2;
        if (this.step > 0) {
            sbAppend = new StringBuilder().append(this.first).append("..").append(this.last).append(" step ");
            i2 = this.step;
        } else {
            sbAppend = new StringBuilder().append(this.first).append(" downTo ").append(this.last).append(" step ");
            i2 = -this.step;
        }
        return sbAppend.append(i2).toString();
    }
}
