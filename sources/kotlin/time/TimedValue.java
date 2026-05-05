package kotlin.time;

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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&˛\bDRш|\u0004G\u00068\u000bDB\u0007\"2\u001e\u007f\u0007tsA0JeP.`Y2şs{B0cҕwٙAkڼ&$\u000fѧ\\f\u0018nxZKV\u001f\n$y\u0003,\u007fǁ\ta \u0011JB\u001eBݯQoK=)\u0001D\u001082X\u0600@ە\u0002ʀ.H\u001e\u007fCTY\u0018*0ns\u0001Ŭ\u000e͘\u0004܅Ū\n@&\u000e,b0vDV\u0005cJ13\u0003 ĩ|ϋ\u00106\u0003M\u001bGl'CǸ\u0012$1@E7-%\u0002\u0006MҿZύ\u0007AwL\u0013xo89Z\fWdj0\u001a#>g\u000fsqT\\KƀaT.9c{K~#nĒyD\u0014J\u001a&\u0006U_tǽ\u00197\u001c\u001c5\rr\u0002C҉\u0001މ۰\u0004\u0003i6%,\u001851>)l\"rI\u001af72˜ڟ\"+\tn/el\u0010f\u001d)]ȰQ3Y@Cgݹ\u000eq"}, d2 = {"\u001aj^A_0G\u001d(\u0003\u0003^uk\r7e~\u0019wG\u0011\u0017l", "\"", "", "D`[BX", "2ta.g0H\\", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}`'\u0007!&Ns\u0017\u0006{6=#\u0002)Fm#7IJ\u0005J4\u001f\u0011xhHdm5\\\u00064WJ]6i:nJ\u001a\u0012gc\u0012\u001c", "5dc\u0011h9:b\u001d\t\u0004&\u001c\u000f\u001d\u00198\u000b&", "u(9", "\u0018", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(KBN>\u0011r\u0002p}", "1n_F", "1n_F \u0019\u001fWw\u0013|-", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}`\u0004g\u001d!Vv\u0012E@49a}i&q\u001e.L47rD\u001ej", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class TimedValue<T> {
    private final long duration;
    private final T value;

    private TimedValue(T t2, long j2) {
        this.value = t2;
        this.duration = j2;
    }

    public /* synthetic */ TimedValue(Object obj, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-RFiDyg4$default, reason: not valid java name */
    public static /* synthetic */ TimedValue m10464copyRFiDyg4$default(TimedValue timedValue, Object obj, long j2, int i2, Object obj2) {
        if ((1 & i2) != 0) {
            obj = timedValue.value;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j2 = timedValue.duration;
        }
        return timedValue.m10466copyRFiDyg4(obj, j2);
    }

    public final T component1() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2-UwyO8pc, reason: not valid java name */
    public final long m10465component2UwyO8pc() {
        return this.duration;
    }

    /* JADX INFO: renamed from: copy-RFiDyg4, reason: not valid java name */
    public final TimedValue<T> m10466copyRFiDyg4(T t2, long j2) {
        return new TimedValue<>(t2, j2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue) obj;
        return Intrinsics.areEqual(this.value, timedValue.value) && Duration.m10311equalsimpl0(this.duration, timedValue.duration);
    }

    /* JADX INFO: renamed from: getDuration-UwyO8pc, reason: not valid java name */
    public final long m10467getDurationUwyO8pc() {
        return this.duration;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t2 = this.value;
        return ((t2 == null ? 0 : t2.hashCode()) * 31) + Duration.m10334hashCodeimpl(this.duration);
    }

    public String toString() {
        return "TimedValue(value=" + this.value + ", duration=" + ((Object) Duration.m10355toStringimpl(this.duration)) + ')';
    }
}
