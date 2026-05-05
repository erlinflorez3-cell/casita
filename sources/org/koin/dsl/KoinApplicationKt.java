package org.koin.dsl;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.koin.core.KoinApplication;
import org.koin.core.module.KoinApplicationDslMarker;
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
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!4i\bӵLc\u0003\rIي8\u000bDB\u0007\":\u0012\u007f\u0007|jA0ZeP.XSB\u001dyڔL$\n#\"GIU2}P\n\u0016S\u007f\u001b|Ϻr\u000bq\u000e6\u001c~j:Imx\f\u0013?QHoM5e\tM;ptd\u00040428(\t\u0017\u0019XKxx\u0011B*\u0011ܘ4@v@\u0019\u0012e,(Ň\u001e>N\u007fNyuPNa|_J/Q\u0002yD^'\u000e4\u0013L;I=)#u@#ҋD7;\u001bkX+1`b_\u0014OsM\u0005\u0017&7-Ys\u0006:\u0007\u0003Џ\u0019+U\u0013\u000e\u00046^\u0015Q\u000f\u000b7-_cyT<+Þ~{\u0013Bǲ\u0012\u000e"}, d2 = {"9nX;47IZ\u001d|vm0\u0007\u0012", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041WK\f\u001e\u001bEk\u001d@\u0001.\u000b", "1qT.g,\u001eO\u001b~\bB5\u000b\u0018+n}(\n", "", "/o_\u0011X*EO&z\nb6\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001ana4\"2HW\"Hyl3Fn9i\t\u0004\u0007K_\u0017\u0015Nk\u001b8\u0006)?bS", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u0019nX;47I2\u0019|\u0002Z9x\u00183o\t", "9nX; *H`\u0019"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class KoinApplicationKt {
    @KoinApplicationDslMarker
    public static final KoinApplication koinApplication(Function1<? super KoinApplication, Unit> function1) {
        return koinApplication(true, function1);
    }

    @KoinApplicationDslMarker
    public static final KoinApplication koinApplication(boolean z2) {
        return koinApplication(z2, null);
    }

    @KoinApplicationDslMarker
    public static final KoinApplication koinApplication(boolean z2, Function1<? super KoinApplication, Unit> function1) {
        KoinApplication koinApplicationInit = KoinApplication.Companion.init();
        if (function1 != null) {
            function1.invoke(koinApplicationInit);
        }
        if (z2) {
            koinApplicationInit.createEagerInstances();
        }
        return koinApplicationInit;
    }

    public static /* synthetic */ KoinApplication koinApplication$default(boolean z2, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        return koinApplication(z2, function1);
    }
}
