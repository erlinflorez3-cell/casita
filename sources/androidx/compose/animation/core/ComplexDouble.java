package androidx.compose.animation.core;

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
/* JADX INFO: compiled from: ComplexDouble.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\n8\u000b4M\u0007\":\u001b\u007fјnjG6LeN0ZS8\u001bs{:$aҖwYП\u0006\u001a,!Ib^kunbZ9D\u001f\n$z\u0003,wVޯa\u0012\u001d5\u000bvM<eok:'ӝ7M'@,Py3\u0002`ޕIX\u0012\tNc\f@ؓpv@R\u001bM\u001d\u001a@\u0007n&\u0007\u001ejif6vm$Ǆ.k\u0012wNf'\u000eܞ-Q\u001bSl';w(ӣ3\tHC#=S1\u0016\u0003aM\u0010WsS\u0004\u0017&mȹJ<^Dh\u0018\u0014C<\u0016֬\\;5j\u0017i`:ʬ[SqXh\u000eV»Aԏ\u0015\u0005\u0013\u001c\u0018?H\\ƦJj\u0016\u001bKt!T\u0007З\n'Q\u000e\u000ey6Eӛ079F3f\u007fĥ\u0002ϑV\u007f\u000b\u0013 6#/͙Q_b\u001bx\u0015IU>Ί9\u001aOK\\f\n\bƝ\u001e\b~o\u001a*2\u0382\u000eĐ7D <+=7\nݽS%y\u000f`D\u0016wK¢p\u001cp`]X\"\u001d,}Ҿ\bTaR{\u001dk~ӹ\u001f\u0093\u0019\u001e(b\t\u0016\bA!3ɿHƼ)\u0010Vи9uxMu\nS0=ƀeˇo\u000e_ު/BCU{\u0010\u0010S-X͖@f\u001dZlGa\u0012+k6)JH\u0019\u0011.@ΌR\u0010+4Ey*:Ϣ51"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG}Au!5MV\u001auD\u001b\u001ch7", "", "-qT._", "", "-h\\.Z0GO&\u0013", "uC3uI", "7lP4\\5:`-", "5dc\u0016`(@W\"z\br", "u(3", "@dP9", "5dc\u001fX(E", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "2he", "=sW2e", "3pd._:", "", "6`b566=S", "", ";h]Bf", ">kd@", "Bh\\2f", "BnBAe0GU", "", "CmP?l\u0014B\\)\r", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ComplexDouble {
    public static final int $stable = 8;
    private double _imaginary;
    private double _real;

    private final double component1() {
        return this._real;
    }

    private final double component2() {
        return this._imaginary;
    }

    public static /* synthetic */ ComplexDouble copy$default(ComplexDouble complexDouble, double d2, double d3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            d2 = complexDouble._real;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            d3 = complexDouble._imaginary;
        }
        return complexDouble.copy(d2, d3);
    }

    public final ComplexDouble copy(double d2, double d3) {
        return new ComplexDouble(d2, d3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplexDouble)) {
            return false;
        }
        ComplexDouble complexDouble = (ComplexDouble) obj;
        return Double.compare(this._real, complexDouble._real) == 0 && Double.compare(this._imaginary, complexDouble._imaginary) == 0;
    }

    public int hashCode() {
        return (Double.hashCode(this._real) * 31) + Double.hashCode(this._imaginary);
    }

    public String toString() {
        return "ComplexDouble(_real=" + this._real + ", _imaginary=" + this._imaginary + ')';
    }

    public ComplexDouble(double d2, double d3) {
        this._real = d2;
        this._imaginary = d3;
    }

    public final double getReal() {
        return this._real;
    }

    public final double getImaginary() {
        return this._imaginary;
    }

    public final ComplexDouble plus(double d2) {
        this._real += d2;
        return this;
    }

    public final ComplexDouble plus(ComplexDouble complexDouble) {
        this._real += complexDouble.getReal();
        this._imaginary += complexDouble.getImaginary();
        return this;
    }

    public final ComplexDouble times(double d2) {
        this._real *= d2;
        this._imaginary *= d2;
        return this;
    }

    public final ComplexDouble times(ComplexDouble complexDouble) {
        this._real = (getReal() * complexDouble.getReal()) - (getImaginary() * complexDouble.getImaginary());
        this._imaginary = (getReal() * complexDouble.getImaginary()) + (complexDouble.getReal() * getImaginary());
        return this;
    }

    public final ComplexDouble unaryMinus() {
        double d2 = -1;
        this._real *= d2;
        this._imaginary *= d2;
        return this;
    }

    public final ComplexDouble div(double d2) {
        this._real /= d2;
        this._imaginary /= d2;
        return this;
    }

    public final ComplexDouble minus(double d2) {
        this._real += -d2;
        return this;
    }

    public final ComplexDouble minus(ComplexDouble complexDouble) {
        double d2 = -1;
        complexDouble._real *= d2;
        complexDouble._imaginary *= d2;
        this._real += complexDouble.getReal();
        this._imaginary += complexDouble.getImaginary();
        return this;
    }
}
