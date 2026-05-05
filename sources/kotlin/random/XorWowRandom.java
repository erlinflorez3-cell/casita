package kotlin.random;

import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007lv?ӄZ͜f>\u0003SX\u000e\u001c\u007fb$D$PDsT*>7\u000f]^kupbZ9F\u001f\n$|\u0003,wXޯa\u0012\u001d7\u0003%E\u074c]sK?xtd\b060?\u0012\u0005/\u001d:L\u001e~\u0013Cy\u000f\"4NyRR;P\u0015\u001e \u0010V /!lk\\A`l\f=ǥ'\u0003wN\u00175m=\u0015M;I\u0005+\u001b\u0005y\u001eYC}I]+a\u0012\u001fR\nBISBI\u0013s?'YLJɑBݼ\u0004\u0014\u001dۀ \u0019k|>\\3T7ϲ3˦ScSִ^4\u0006\u0004\u0014\rj\u0007dͽ3ρ2-\"ǑX\u001aAz\u000bSnSXތNȸ~a>Ѝu\fA2Q\u001b\u0015T8ݥ%\u05ee;{\rټn/\u000fv9[\u0003\u00117ڀ'ƻ{Q9҅͞AY"}, d2 = {"\u001aj^A_0G\u001d&z\u0004]6\u0005R\"o\r\u001a\u0006Rm\u0013 Fy\u0016\u0012", "\u001aj^A_0G\u001d&z\u0004]6\u0005R\u001ca\t'\u0006HV", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "\u001aj^A_0G\u001d\u001d\tDL,\n\r+l\u0004=w=\b\u0017l", "AdT1$", "", "AdT1%", "uH8uI", "F", "G", "H", ExifInterface.LONGITUDE_EAST, "D", "/cS2a+", "uH8\u0016<\u0010\"\u0017\n", "<dgA50Ma", "0hc\u0010b<Gb", "<dgA<5M", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class XorWowRandom extends Random implements Serializable {
    private static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    private int addend;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f19835v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f19836w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f19837x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f19838y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f19839z;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0005ӯ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001aj^A_0G\u001d&z\u0004]6\u0005R\"o\r\u001a\u0006Rm\u0013 Fy\u0016zT/=dy);w\u001f\u0004", "", "u(E", "Ada6T3/S&\r~h5ll\u000e", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public XorWowRandom(int i2, int i3) {
        this(i2, i3, 0, 0, ~i2, (i2 << 10) ^ (i3 >>> 4));
    }

    public XorWowRandom(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f19837x = i2;
        this.f19838y = i3;
        this.f19839z = i4;
        this.f19836w = i5;
        this.f19835v = i6;
        this.addend = i7;
        int i8 = i2 | i3 | i4 | i5;
        if ((i8 + i6) - (i8 & i6) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i9 = 0; i9 < 64; i9++) {
            nextInt();
        }
    }

    @Override // kotlin.random.Random
    public int nextBits(int i2) {
        return RandomKt.takeUpperBits(nextInt(), i2);
    }

    @Override // kotlin.random.Random
    public int nextInt() {
        int i2 = this.f19837x;
        int i3 = i2 ^ (i2 >>> 2);
        this.f19837x = this.f19838y;
        this.f19838y = this.f19839z;
        this.f19839z = this.f19836w;
        int i4 = this.f19835v;
        this.f19836w = i4;
        int i5 = ((i3 ^ (i3 << 1)) ^ i4) ^ (i4 << 4);
        this.f19835v = i5;
        int i6 = this.addend + 362437;
        this.addend = i6;
        return i5 + i6;
    }
}
