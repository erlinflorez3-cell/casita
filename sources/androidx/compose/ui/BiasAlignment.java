package androidx.compose.ui;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4F\u0007\"B\u0012\u007fјnjO0LeN.ZS@\u000fs{:(c$\u007fLC٥\"}0ޛWȞog|PbŏK\u000f\u0014\"\u0001j2J[ޔc(ƁbB\u001e>kM\u000bYys\u0005:\u0013 J\"fz\u0015\u0005(,`\u0010%{ŲO\f 3\t\u0019HY%M3\"B\nL)\u0019\u001e\u000bq~:Vwu:]-3mPZ?_^\n\u0014!ѸS܋˼zc$9NF}\u001c3c\u001b\u0007\u0001\\\u0006ƨ@:D\u0013y?'YJ:ʕ7!\u001b\"'CO;ƞ#,b\u0005_`$'YP\u0014QV\u000e6y\u0013{;=Jف\u0005oY<@2f6\"cz\u0001hXR\u0018]p\u0016A˿7_,\u000eJC9I~\u0018ż:aUE\u0015\u001d\rL=Gΰ ,c\u001c`-\u001b\u0003xΦ5WH׀`P\u0010]KrT\u007fp\u0004B\u0004^HĬ3\u0002\u0019ф/'=aG(ܬk\u0007PGmК!\u000fg\u05eemo"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n]\u001b\u0013UK\u0015@x.=Y\u0007/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", "6na6m6Gb\u0015\u0006Wb(\u000b", "", "DdaA\\*:Zu\u0003vl", "uE5uI", "5dc\u0015b9Bh#\b\nZ3Y\r+s", "u(5", "5dc#X9MW\u0017z\u0002;0x\u0017", "/kX4a", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "AoP0X", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "/kX4as$4uqEl\u0014", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Wx\u0012K@\f1m\b0FL\u001a;MAJo>'j,F", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "\u0016na6m6Gb\u0015\u0006", "$daA\\*:Z", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BiasAlignment implements Alignment {
    public static final int $stable = 0;
    private final float horizontalBias;
    private final float verticalBias;

    public static /* synthetic */ BiasAlignment copy$default(BiasAlignment biasAlignment, float f2, float f3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = biasAlignment.horizontalBias;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = biasAlignment.verticalBias;
        }
        return biasAlignment.copy(f2, f3);
    }

    public final float component1() {
        return this.horizontalBias;
    }

    public final float component2() {
        return this.verticalBias;
    }

    public final BiasAlignment copy(float f2, float f3) {
        return new BiasAlignment(f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) obj;
        return Float.compare(this.horizontalBias, biasAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAlignment.verticalBias) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.horizontalBias) * 31) + Float.hashCode(this.verticalBias);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }

    public BiasAlignment(float f2, float f3) {
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
        float f2;
        float fM6808getWidthimpl = (IntSize.m6808getWidthimpl(j3) - IntSize.m6808getWidthimpl(j2)) / 2.0f;
        float fM6807getHeightimpl = (IntSize.m6807getHeightimpl(j3) - IntSize.m6807getHeightimpl(j2)) / 2.0f;
        if (layoutDirection == LayoutDirection.Ltr) {
            f2 = this.horizontalBias;
        } else {
            f2 = (-1) * this.horizontalBias;
        }
        float f3 = 1;
        return IntOffsetKt.IntOffset(Math.round(fM6808getWidthimpl * (f2 + f3)), Math.round(fM6807getHeightimpl * (f3 + this.verticalBias)));
    }

    /* JADX INFO: compiled from: Alignment.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4D\u0007\":\u0018\u007f\u0007lkA0ZeP.XT2\u000fy\u0005<řc$\u007fّCU }*\t]Zo˧tЂ`!¼?\u0006Dw+7YY\u0007]*\u000f`CņC3[q\u0006WnyN\u0005N8R<\b\f\u0019\u001aXN@z\tKc\f@6ptH[%M3$X\u001a\u0007'\u000f)tg|7\u000fȔ^\u0003@1\u000f\u0002B|ϋ\u00106\u0003M\u001bFl';w(ԣ*\tHC\"=S1\u0015\u0003aM\u0012WsS\u0004\u00177mȹJ<^Di\u0018\u0014C1\u0016֬\\;-j\u0017i`::q֩b\u001c_\u001c(\u0010z*\u000eʀ\b\u0014\u000eΩ`03\u001dt\fԭ7\t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n]\u001b\u0013UK\u0015@x.=Y\u0007/uP ;QXEtC\u001a\u001c>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "0hP@", "", "uE\u0018#", "5dc\u000f\\(L", "u(5", "/kX4a", "", "Ahi2", "AoP0X", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "BnBAe0GU", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Horizontal implements Alignment.Horizontal {
        public static final int $stable = 0;
        private final float bias;

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, float f2, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
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
            return Math.round(((i3 - i2) / 2.0f) * (1 + (layoutDirection == LayoutDirection.Ltr ? this.bias : (-1) * this.bias)));
        }
    }

    /* JADX INFO: compiled from: Alignment.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4D\u0007\":\u0018\u007f\u0007lmA0RnP\u008cZS8şs{:$c$\u007fOC٥ Ԋ(\u001fѧ~g\u0016m\u000be\u001bG\u001d\u0006.x\u0019-֒Yxk\u0014WHPtW3{um=n{N\u0005N8R<\b\r\u0019\u001aXNV\u000bCJY\u0015*0nq\u0001Ŭ\u000e\u0016\u0016(\u001c\u001e>NҵNbmNDH\u0005]h0iʌh\u000b_5jH|{\u0019vZ5\u001a\u000fc4*nE{֭&\u001c\n\u0015as?1E8ތ\u00041.5;as\u0006G\u001fĳ\u0013e:]\rurT]ԇUf\u0014ʬCQiN^\u0012߳{\r"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n]\u001b\u0013UK\u0015@x.=Y\u0007/u^\u0016;\\G9g;s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", "0hP@", "", "uE\u0018#", "5dc\u000f\\(L", "u(5", "/kX4a", "", "Ahi2", "AoP0X", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "BnBAe0GU", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Vertical implements Alignment.Vertical {
        public static final int $stable = 0;
        private final float bias;

        public static /* synthetic */ Vertical copy$default(Vertical vertical, float f2, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                f2 = vertical.bias;
            }
            return vertical.copy(f2);
        }

        public final float component1() {
            return this.bias;
        }

        public final Vertical copy(float f2) {
            return new Vertical(f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Vertical) && Float.compare(this.bias, ((Vertical) obj).bias) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        public String toString() {
            return "Vertical(bias=" + this.bias + ')';
        }

        public Vertical(float f2) {
            this.bias = f2;
        }

        public final float getBias() {
            return this.bias;
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        public int align(int i2, int i3) {
            return Math.round(((i3 - i2) / 2.0f) * (1 + this.bias));
        }
    }
}
