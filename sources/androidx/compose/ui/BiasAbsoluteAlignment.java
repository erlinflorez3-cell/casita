package androidx.compose.ui;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: Alignment.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4F\u0007\"B\u0012\u007fјnjO0LeN.ZS@\u000fs{:(c$\u007fLC٥\"}0ޛWȞog|PbŏK\u000f\u0014\"\u0001j2I[ޔc(ƁbB\u001e>kL\u000b}LpxD\u000582P9\n\t\u000f\u001cBH>wټGK\u001a\u0015xh~Aj\r{\rJ\u0016\u0014G8\u0001Lf\u0018RDS\u0005]h9S\u0007wNf'\u000e=CaЮEÖܮ\u0011xg,9O\u007f<#5k\u00035S\"ϱ\u0004\bxK\u0016\u0001'U,\u0010לX~s\u000e&-+}Օ\u000ex,\\\u0013Qx\fU,\u007fiQP\u001c*\u0010z*\u000e\u0003Ȑ\rN8VAE\u001a\u0015\u001c>9\u0003\bkBf\u0001\rXF҄b~\u001e3\u0017K+g3-ж`\u0004 \\P\u0014\u0005;8iѾmqjb\u000ex\u0015IUɐU7Y̵UJT\u000egB>\u0013~d\u001a*21Ͻ\u00045\u0004߾F\u0019+=i>\u05fd!p\nKJϻ\u00133_ĎW\u0006"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n]\u001b\u0013UK\u000bJ\u0001,Eh}{>q\u00187UCDz\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", "6na6m6Gb\u0015\u0006Wb(\u000b", "", "DdaA\\*:Zu\u0003vl", "uE5uI", "5dc\u0015b9Bh#\b\nZ3Y\r+s", "u(5", "5dc#X9MW\u0017z\u0002;0x\u0017", "/kX4a", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "AoP0X", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "/kX4as$4uqEl\u0014", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Wx\u0012K@\f1m\b0FL\u001a;MAJo>'j,F", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "\u0016na6m6Gb\u0015\u0006", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BiasAbsoluteAlignment implements Alignment {
    public static final int $stable = 0;
    private final float horizontalBias;
    private final float verticalBias;

    public static /* synthetic */ BiasAbsoluteAlignment copy$default(BiasAbsoluteAlignment biasAbsoluteAlignment, float f2, float f3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = biasAbsoluteAlignment.horizontalBias;
        }
        if ((i2 & 2) != 0) {
            f3 = biasAbsoluteAlignment.verticalBias;
        }
        return biasAbsoluteAlignment.copy(f2, f3);
    }

    public final float component1() {
        return this.horizontalBias;
    }

    public final float component2() {
        return this.verticalBias;
    }

    public final BiasAbsoluteAlignment copy(float f2, float f3) {
        return new BiasAbsoluteAlignment(f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAbsoluteAlignment)) {
            return false;
        }
        BiasAbsoluteAlignment biasAbsoluteAlignment = (BiasAbsoluteAlignment) obj;
        return Float.compare(this.horizontalBias, biasAbsoluteAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAbsoluteAlignment.verticalBias) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.horizontalBias) * 31) + Float.hashCode(this.verticalBias);
    }

    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }

    public BiasAbsoluteAlignment(float f2, float f3) {
        this.horizontalBias = f2;
        this.verticalBias = f3;
    }

    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    public final float getVerticalBias() {
        return this.verticalBias;
    }

    @Override // androidx.compose.ui.Alignment
    /* JADX INFO: renamed from: align-KFBX0sM */
    public long mo3783alignKFBX0sM(long j2, long j3, LayoutDirection layoutDirection) {
        long jIntSize = IntSizeKt.IntSize(IntSize.m6808getWidthimpl(j3) - IntSize.m6808getWidthimpl(j2), IntSize.m6807getHeightimpl(j3) - IntSize.m6807getHeightimpl(j2));
        float f2 = 1;
        return IntOffsetKt.IntOffset(Math.round((IntSize.m6808getWidthimpl(jIntSize) / 2.0f) * (this.horizontalBias + f2)), Math.round((IntSize.m6807getHeightimpl(jIntSize) / 2.0f) * (f2 + this.verticalBias)));
    }

    /* JADX INFO: compiled from: Alignment.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4D\u0007\":\u0018\u007f\u0007lkA0ZeP.XT2\u000fy\u0005<řc$\u007fّCU }*\t]Zo˧tЂ`!¼?\u0006Dw+7YY\u0007]*\u000f`CņC3[q\u0006WnyN\u0005N8R<\b\f\u0019\u001aXN@z\tKc\f@6ptH[%M3$X\u001a\u0007'\u000f)tg|7\u000fȔ^\u0003@1\u000f\u0002B|ϋ\u00106\u0003M\u001bFl';w(ԣ*\tHC\"=S1\u0015\u0003aM\u0012WsS\u0004\u00177mȹJ<^Di\u0018\u0014C1\u0016֬\\;-j\u0017i`::q֩b\u001c_\u001c(\u0010z*\u000eʀ\b\u0014\u000eΩ`03\u001dt\fԭ7\t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n]\u001b\u0013UK\u000bJ\u0001,Eh}{>q\u00187UCDzr\u0001\u001fueN\u0011l;J}|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "0hP@", "", "uE\u0018#", "5dc\u000f\\(L", "u(5", "/kX4a", "", "Ahi2", "AoP0X", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "BnBAe0GU", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Horizontal implements Alignment.Horizontal {
        public static final int $stable = 0;
        private final float bias;

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f2 = horizontal.bias;
            }
            return horizontal.copy(f2);
        }

        public final float component1() {
            return this.bias;
        }

        public final Horizontal copy(float f2) {
            return new Horizontal(f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.bias, ((Horizontal) obj).bias) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        public String toString() {
            return "Horizontal(bias=" + this.bias + ')';
        }

        public Horizontal(float f2) {
            this.bias = f2;
        }

        public final float getBias() {
            return this.bias;
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public int align(int i2, int i3, LayoutDirection layoutDirection) {
            return Math.round(((i3 - i2) / 2.0f) * (1 + this.bias));
        }
    }
}
