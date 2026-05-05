package com.swmansion.rnscreens.transition;

import android.animation.FloatEvaluator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLш|\u0004W\u00068\u000b<D\u0007\":\u0017\u007f\u0007|jA0Jx^\u008c\u0003SX\u000e,7D<i$\nWKY*\u007f8\b}Pwk~Lp\nq\u00124\u0017aj\u000bMe\u0011k\u0017'FRsO5cnk;pxF\u000761P;(\u0006i\u001a\tLǘzzQQT;>R\t<h\f{\bJ\u0016\u0014Q8\u0001L_\u0018TD\\\u0005_P.Q\u0005\u001aH\\<w2\u0013L;H\u001b;˼za,A\tIC,=U\u0019\u0006\u0001]o\tM\u0007U\u0007~&U-\u0010s Hf\u0018,\u0017AN;_#,j\u0019ib\"&YQ*K!(6~\u0013}#;2\u0010\\ΰTͶ1&nڜ&5zzaIp\u0004dL\u000e\u00062Y%*\u0018G;=+hg`i\u001b^;\f\u0007#\u001dQ\u0004\u001d\"DTldڠ\u001fZ\u007f\u0383ISFIV[ZsK{\u001crx\u0001X\u0006\u0007ϡ\f\u009e\u007f\u001d6Ϗ=9aH1*\f\u0004NTu\u0002U\u0004vS\u0002fXD2p,6X\u000b\u001c^Tf\u001bj~W\u0007-yMzXΘ\u0002\u000e\u001b\u05fetyB23\u001d˃S\u0002"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011~\u001b8\u007f39h\u0002*@7uA\\CHt0%qrqB\u0006_9bg#N\\N:<cnD$\u000ei\u0018[\u0001", "\u001a`]1e6BRbz\u0004b4x\u00183o\tq\\G\u000b\u0013&'\u0001\nC\u0007!Dc\u000bu", "AsP?g\u001d:Z)~ek6\u000e\r.e\r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011~\u001b8\u007f39h\u0002*@7r8]L:gA2\u0006dhI\u0007N9X\b+FL[\re(", "3mS#T3NS\u0004\f\u0005o0{\t<", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d]0Q?", "3mS#T3NSvzxa,", "5dc\u0012a+/O \u000fz<(z\f/", "u(;7T=:\u001d z\u0004`ue\u00197b\u007f5Q", "Adc\u0012a+/O \u000fz<(z\f/", "uKY.i(\bZ\u0015\b|(\u0015\r\u0011,e\r}?1", "5dc\u0012a+/O \u000fzI9\u0007\u001a3d\u007f5", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "AsP?g\u001d:Z)~XZ*\u007f\t", "5dc g(Kb\nz\u0002n,Z\u0005-h\u007f", "Adc g(Kb\nz\u0002n,Z\u0005-h\u007f", "5dc g(Kb\nz\u0002n,g\u00169v\u0004'{M", "3uP9h(MS", "4qP0g0H\\", "AsP?g\u001d:Z)~", "3mS#T3NS", "uE;7T=:\u001d z\u0004`ue\u00197b\u007f5Q'\u0006\u0013(C9\u00158\u007f'~B\u000e(4m#\u0004\u0011*@gE\u001a^o]B\t-\rU\u0001#V\"", "5dc\u0012a+/O \u000fz", "5dc g(Kb\nz\u0002n,", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ExternalBoundaryValuesEvaluator extends FloatEvaluator {
    private Number endValueCache;
    private final Function1<Number, Float> endValueProvider;
    private Number startValueCache;
    private final Function1<Number, Float> startValueProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public ExternalBoundaryValuesEvaluator(Function1<? super Number, Float> startValueProvider, Function1<? super Number, Float> endValueProvider) {
        Intrinsics.checkNotNullParameter(startValueProvider, "startValueProvider");
        Intrinsics.checkNotNullParameter(endValueProvider, "endValueProvider");
        this.startValueProvider = startValueProvider;
        this.endValueProvider = endValueProvider;
    }

    private final Number getEndValue(Number number) {
        if (this.endValueCache == null) {
            this.endValueCache = this.endValueProvider.invoke(number);
        }
        return this.endValueCache;
    }

    private final Number getStartValue(Number number) {
        if (this.startValueCache == null) {
            this.startValueCache = this.startValueProvider.invoke(number);
        }
        return this.startValueCache;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.animation.TypeEvaluator
    public Float evaluate(float f2, Number number, Number number2) {
        Number startValue = getStartValue(number);
        Number endValue = getEndValue(number2);
        if (startValue == null || endValue == null) {
            return null;
        }
        return super.evaluate(f2, startValue, endValue);
    }

    public final Number getEndValueCache() {
        return this.endValueCache;
    }

    public final Function1<Number, Float> getEndValueProvider() {
        return this.endValueProvider;
    }

    public final Number getStartValueCache() {
        return this.startValueCache;
    }

    public final Function1<Number, Float> getStartValueProvider() {
        return this.startValueProvider;
    }

    public final void setEndValueCache(Number number) {
        this.endValueCache = number;
    }

    public final void setStartValueCache(Number number) {
        this.startValueCache = number;
    }
}
