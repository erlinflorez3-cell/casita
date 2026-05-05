package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UShortArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.ExperimentalSerializationApi;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000e6B\r(4\u0012}\tnjG0L͜P.hS2\u000fq\u0003:#qҕ\"IKW*}P\t}M(wtϺj\u000fQ\u0010\u001e\u0016'jÒHǁޯa\u0012\u001d4\u000b\u000bM=eokD\u0011xD\u001182PE@ڎ҈\u0019)ѳ\u000f͌ټGM\u0012 >O9P`\u001de\u0005H\u0012LLơ\u007f\u001eתfMʝGǍҺ>1)\u0014wT\u0017:mC\u0015M;Q\u0005+\u001b\u000by\u001eYF}Cչ)S\t\u001c#rM\u0006Wqk\u0005?Ѫ3ɛH֕ˇ5Wŕ\u0013\u0015ۣS\u000fer4`Umn\u0013?+}i{T\u001c-\u0010z*\u0013zTd\u038b3ρ23\"Ǒ \u00109|\u0001\\ŬO\u061cތB\r\u0003a<.-\u00039ڡUIeYaA8״;\u0012"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#m\u000e:w#=)PHgHz%lh8\u0007p\u0002", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#h-;u\u001a=QT;GA+\u0011|>I\u000bj+N\u0004|", "\u001aj^A_0G\u001d\tl}h9\fd<r{<Q", "0tU3X90W(\u0002YZ;x", "uZB\u0019^6MZ\u001d\bDc=\u0005R3n\u000f(\tI|\u001e`&o\u000f8\u0007,D7\b)E|#>KREx\u001c\u001a\"naF\\'\u001d", "0tU3X9", ")R", "\nrTA \u0006\u0017", "", ">nb6g0H\\", "5dc\u001db:Bb\u001d\t\u0004\u001d2\u0007\u00186i\t;uN\u0001$\u001bCv\u0012Qr49c\u0007\u001a5w#.", "u(8", "/o_2a+", "", "1", "\u001aj^A_0G\u001d\tl}h9\f^", "/o_2a+\u0006f\u001eKfA\u0019\u000fG5o\u000f/\u007fI\u0014\u0011%G|\u00128})JU\r$Av\u0010,WP;", "uR\u0018#", "0tX9W", "0tX9Ws:['\u0011\u0006H\b;\u000f9t\u0007,\u0005Sz%\u0017Ts\nCz:1h\u0002*@g\u00148ZC", "u(J ", "3mbBe,\u001cO$zxb;\u0011", "@d`B\\9>Rvz\u0006Z*\u0001\u0018C", "3mbBe,\u001cO$zxb;\u0011G5o\u000f/\u007fI\u0014\u0011%G|\u00128})JU\r$Av\u0010,WP;", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@ExperimentalSerializationApi
public final class UShortArrayBuilder extends PrimitiveArrayBuilder<UShortArray> {
    private short[] buffer;
    private int position;

    private UShortArrayBuilder(short[] sArr) {
        this.buffer = sArr;
        this.position = UShortArray.m9320getSizeimpl(sArr);
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public /* synthetic */ UShortArrayBuilder(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    /* JADX INFO: renamed from: append-xj2QHRw$kotlinx_serialization_core, reason: not valid java name */
    public final void m10608appendxj2QHRw$kotlinx_serialization_core(short s2) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        short[] sArr = this.buffer;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.position = position$kotlinx_serialization_core + 1;
        UShortArray.m9324set01HTLdE(sArr, position$kotlinx_serialization_core, s2);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public /* bridge */ /* synthetic */ UShortArray build$kotlinx_serialization_core() {
        return UShortArray.m9312boximpl(m10609buildamswpOA$kotlinx_serialization_core());
    }

    /* JADX INFO: renamed from: build-amswpOA$kotlinx_serialization_core, reason: not valid java name */
    public short[] m10609buildamswpOA$kotlinx_serialization_core() {
        short[] sArrCopyOf = Arrays.copyOf(this.buffer, getPosition$kotlinx_serialization_core());
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(this, newSize)");
        return UShortArray.m9314constructorimpl(sArrCopyOf);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int i2) {
        if (UShortArray.m9320getSizeimpl(this.buffer) < i2) {
            short[] sArr = this.buffer;
            short[] sArrCopyOf = Arrays.copyOf(sArr, RangesKt.coerceAtLeast(i2, UShortArray.m9320getSizeimpl(sArr) * 2));
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(this, newSize)");
            this.buffer = UShortArray.m9314constructorimpl(sArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }
}
