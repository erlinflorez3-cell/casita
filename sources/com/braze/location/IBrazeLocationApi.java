package com.braze.location;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.LocationProviderName;
import com.braze.models.IBrazeLocation;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0ZeP\u008cZS@\u000fsڔ<$i-yّCU0}*\teNog\u0005Jb\u000bI\u0010\f{\u000f̓\\I\u0004w&6\u001d2Zom4}sK;xtd\bP<0<\u0012\u000b\u0011\u001c:H>|)H{\u0010 7XphZSqMC \u000fV /(\r\u0007\\A`\bmK?21vŌR1e>\rS\u0013Ud)\u0013|\b.;BG5C&\u0002\u000fMvĲ>šӍqA\rj-FYH־[Gޚ\u0004\u0013"}, d2 = {"\u001ab^:\")KO.~De6z\u0005>i\n1E$]$\u0013\\otFt!D]\b)\u0013x\u001a\u0004", "", "7mXAJ0MVv\t\u0004m,\u0010\u0018", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/k[<j,=>&\t\fb+|\u0016=", "\u001aiPCTuNb\u001d\u0006D>5\r\u0011\u001de\u000f}", "\u001ab^:\")KO.~D^5\r\u0011=/f2y<\u0010\u001b!PZ\u001bF\b)4Y\u000b\t3u\u0016\u0004", "/o_\u0010b5?W\u001b\u000f\bZ;\u0001\u00138P\r2\rD\u007f\u0017$", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;o&;IR?u=\t\"rr=\u0006c9$", "@d`BX:MA\u001d\b|e,c\u0013-a\u000f,\u0006Ip\"\u0016C~\u000e", "", ";`]BT3%]\u0017z\nb6\u0006x:d{7{\u001e|\u001e\u001eDk\fB", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ab^:\")KO.~Df6{\t6sI\fXM|,\u0017.y\f8\u0006)?bS", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", ":nR.g0H\\", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface IBrazeLocationApi {
    void initWithContext(Context context, EnumSet<LocationProviderName> enumSet, BrazeConfigurationProvider brazeConfigurationProvider);

    boolean requestSingleLocationUpdate(Function1<? super IBrazeLocation, Unit> function1);
}
