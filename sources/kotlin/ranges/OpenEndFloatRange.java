package kotlin.ranges;

import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLc\u0003\tI\u00066\u00126B\r+4\u0012}\bnjGӄL͜P.`Y2\u000fq~<$i0yّAU0ԂR\u000f_Pwg\u001dJ\t\n\u0004\"\u0016\u001a\u0007kDI\u0004xm\u0016\u001d4Zom3ޜs=Gc=E\u0013)J\"f\u00045\u0005(5`\u0010%z\nƎ\fZAN|RR;W5  \u0013V\"\u0017\u001d\u000bu\u0015ȻH5cH>;\u0003\u0018R\u0015;(6\u000b^%F\u00031S\u000b*49RO5C/\u0004\u0007\u0015es?1?\"A\u0013|?'YI:W~^\u000e)-+}#$\u0007vh\u0013Ux\fU+&ҭMח\u0012(\u007f\u07beL\u0019J\t&\u0006UH\u0005Ʃ\u001cǴ\f\u000e;οCeNR\u001a^p\u007f16\rФ'ő7/Q\u001dlWoBi`E|\u001d\rL#7CwƓV\u05f8d\u00193V}Y?X͞A_"}, d2 = {"\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0019p\u007f1[I\u007fw\u001eQk\u001d)r.7YS", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0019p\u007f1[I\u007f\u0004\u0013Pq\u000e\u0012", "", "AsP?g", "3mS\u0012k*Ec'\u0003\f^", "uE5uI", "-d]18?<Z)\r~o,", "-rc.e;", "5dc\u0012a+\u001ef\u0017\u0006\u000bl0\u000e\t", "u(;7T=:\u001d z\u0004`u]\u00109a\u000f}", "5dc g(Kb", "1n]AT0Ga", "", "D`[BX", "3pd._:", "=sW2e", "", "6`b566=S", "", "7r4:c;R", ":db@G/:\\\u0003\fZj<x\u0010=", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "BnBAe0GU", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class OpenEndFloatRange implements OpenEndRange<Float> {
    private final float _endExclusive;
    private final float _start;

    public OpenEndFloatRange(float f2, float f3) {
        this._start = f2;
        this._endExclusive = f3;
    }

    private final boolean lessThanOrEquals(float f2, float f3) {
        return f2 <= f3;
    }

    public boolean contains(float f2) {
        return f2 >= this._start && f2 < this._endExclusive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).floatValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof OpenEndFloatRange) {
            if (!isEmpty() || !((OpenEndFloatRange) obj).isEmpty()) {
                OpenEndFloatRange openEndFloatRange = (OpenEndFloatRange) obj;
                if (this._start != openEndFloatRange._start || this._endExclusive != openEndFloatRange._endExclusive) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    public Float getEndExclusive() {
        return Float.valueOf(this._endExclusive);
    }

    @Override // kotlin.ranges.OpenEndRange
    public Float getStart() {
        return Float.valueOf(this._start);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this._start) * 31) + Float.hashCode(this._endExclusive);
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return this._start >= this._endExclusive;
    }

    public String toString() {
        return this._start + "..<" + this._endExclusive;
    }
}
