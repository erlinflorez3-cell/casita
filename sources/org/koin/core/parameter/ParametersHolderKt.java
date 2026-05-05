package org.koin.core.parameter;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d̉=!4i\bDJc|\u0004O\u00158\u000b<Ȑ\u0007\"2\u0014\u007f\u0007|jAӄ\\iV\u008cjSX\u000e\u0004\u001dB$s$ Bki(~:\u0013_Tmf~Lp\nq\u00124\u0018\u0019lBH\u0004{ٕ\u0016\u000f@F\b`AR\b=g_%J\u0013!J,H\u007f\u000b\u007f*,^\u000f%}qM,\u0014F?\u001f=ň\u0011M\u0013\u001e*'L&\u0019\u001e\u000bf~JVmuD?)\thRP=^^\u007f{\u000ffV=\f%dӿ/@E9=9a\n'XkA\u0013? <3pW-;K\u0004WdW.\u001cƬ/X"}, d2 = {"3l_Al\u0017:`\u0015\u0007zm,\n\u0017\u0012o\u0007'{M", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", ">`a.`,MS&Z\bk(\u0011r0", ">`a.`,MS&\r", "", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g!$I9\u0014Fz.~W\b-77!*Z?CkC\u001e\"2L5\u0014_4N\u0006'TZ16cQrJi", ">`a.`,MS&lzm\u0016}", ">`a.`,MS&\rd_", "\u001e`a.`,MS&\rY^-\u0001\u00123t\u00042\u0005", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "9nX; *H`\u0019"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ParametersHolderKt {
    public static final ParametersHolder emptyParametersHolder() {
        return new ParametersHolder(null, null, 3, null);
    }

    public static final ParametersHolder parameterArrayOf(Object... parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new ParametersHolder(ArraysKt.toMutableList(parameters), true);
    }

    public static final ParametersHolder parameterSetOf(Object... parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new ParametersHolder(ArraysKt.toMutableList(parameters), false);
    }

    public static final ParametersHolder parametersOf(Object... parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new ParametersHolder(ArraysKt.toMutableList(parameters), null, 2, null);
    }
}
