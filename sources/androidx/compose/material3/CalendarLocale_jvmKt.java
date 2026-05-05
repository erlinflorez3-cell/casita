package androidx.compose.material3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: CalendarLocale.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d̉=!4i\bDRo|\u0004W\u00068\u000b4B\u0007\":\u0018\u007f\u0007ljA0RnP.XS2\u000f\u0002{<řsB\u007fESUH~R\r]Q\u007fg\u001dN\u000b\u000fQ\u0014\u001e\u0016'n\\Mc~u\u0012=9\toW[[wU9\u000ft^\u0005N6R>\u007f\u0005\u000f\u001dBH>z+IQ\f 5XphV=S\u000b\u001a \fV /%#ɡnNVǍuF?%\u0013ipN7a@|{\u000etS}˜xҐ\"+Hʺ]\u001d3\\#\u0007\u0001eo\u0003m{ݞ\ts"}, d2 = {"1`R5X+\u001f]&\u0007vm;|\u0016=", "\u001aiPCTuNb\u001d\u0006DP,x\u000f\u0012a\u000e+c<\fl", "", "\u001aiPCTuMS,\u000eDG<\u0005\u0006/r`2\tH|&l", "5dc\u0010T*AS\u0018]vm,k\r7e`2\tH|&&G|", ";h]\u0011\\.Bb'", "", ";`g\u0011\\.Bb'", "7r6?b<IW\"\u0001jl,{", "", "Bn;<V(EA(\f~g.", "\u0011`[2a+:`\u007f\txZ3|", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CalendarLocale_jvmKt {
    private static final WeakHashMap<String, NumberFormat> cachedFormatters = new WeakHashMap<>();

    public static /* synthetic */ String toLocalString$default(int i2, int i3, int i4, boolean z2, int i5, Object obj) {
        if ((1 & i5) != 0) {
            i3 = 1;
        }
        if ((2 & i5) != 0) {
            i4 = 40;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 4)) != 0) {
            z2 = false;
        }
        return toLocalString(i2, i3, i4, z2);
    }

    public static final String toLocalString(int i2, int i3, int i4, boolean z2) {
        return getCachedDateTimeFormatter(i3, i4, z2).format(Integer.valueOf(i2));
    }

    private static final NumberFormat getCachedDateTimeFormatter(int i2, int i3, boolean z2) {
        String str = i2 + '.' + i3 + '.' + z2 + '.' + Locale.getDefault().toLanguageTag();
        WeakHashMap<String, NumberFormat> weakHashMap = cachedFormatters;
        NumberFormat integerInstance = weakHashMap.get(str);
        if (integerInstance == null) {
            integerInstance = NumberFormat.getIntegerInstance();
            integerInstance.setGroupingUsed(z2);
            integerInstance.setMinimumIntegerDigits(i2);
            integerInstance.setMaximumIntegerDigits(i3);
            weakHashMap.put(str, integerInstance);
        }
        return integerInstance;
    }
}
