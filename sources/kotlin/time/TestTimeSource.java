package kotlin.time;

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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00126Ȑ\u0007\":\u0012\u007fјnjO0LeN2XX@ş\u001c{b#\u001c'ڱG;c\u001aF7\u0017Rfg\u0016rz^\u0019H'\u0006D~1,֒Yzc\u0019\u001d:\u000b\u0006M<eok=\u0011xD\n82P>@ڕ\u0001ʀ.J\u0016\u0001\tK\u0014\u0012 ;XphTS_U& \u0007V / 3ɤZɇLleŽǫ'\u000f"}, d2 = {"\u001aj^A_0G\u001d(\u0003\u0003^uk\t=tn,\u0004@n!'Tm\u000e\u0012", "\u001aj^A_0G\u001d(\u0003\u0003^uX\u0006=t\r$yOg! I^\u0012Dv\u0013?i\u000b\u001e7C", "u(E", "@dP1\\5@", "", "=uT?Y3He", "", "2ta.g0H\\", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "=uT?Y3He`eg=:fm9", "uI\u0018#", ">kd@4:LW\u001b\b", ">kd@4:LW\u001b\bBE\u0019[\u0017\u0019J\n", "@dP1", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        markNow();
    }

    /* JADX INFO: renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m10441overflowLRDsOJo(long j2) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + DurationUnitKt.shortName(getUnit()) + " is advanced by " + ((Object) Duration.m10355toStringimpl(j2)) + '.');
    }

    /* JADX INFO: renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m10442plusAssignLRDsOJo(long j2) {
        long jM10352toLongimpl = Duration.m10352toLongimpl(j2, getUnit());
        if (((jM10352toLongimpl - 1) | 1) != Long.MAX_VALUE) {
            long j3 = this.reading;
            long j4 = j3 + jM10352toLongimpl;
            if ((jM10352toLongimpl ^ j3) >= 0 && (j3 ^ j4) < 0) {
                m10441overflowLRDsOJo(j2);
            }
            this.reading = j4;
            return;
        }
        long jM10309divUwyO8pc = Duration.m10309divUwyO8pc(j2, 2);
        if ((1 | (Duration.m10352toLongimpl(jM10309divUwyO8pc, getUnit()) - 1)) == Long.MAX_VALUE) {
            m10441overflowLRDsOJo(j2);
            return;
        }
        long j5 = this.reading;
        try {
            m10442plusAssignLRDsOJo(jM10309divUwyO8pc);
            m10442plusAssignLRDsOJo(Duration.m10341minusLRDsOJo(j2, jM10309divUwyO8pc));
        } catch (IllegalStateException e2) {
            this.reading = j5;
            throw e2;
        }
    }

    @Override // kotlin.time.AbstractLongTimeSource
    protected long read() {
        return this.reading;
    }
}
