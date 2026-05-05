package com.google.firebase.analytics.ktx;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
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
/* JADX INFO: loaded from: classes7.dex */
@Deprecated(message = "\u0010O\u0003Gr\t\u001a\u0017lVg\u0010c\u001akbdQH\u0012x`K3f/.p`\u00041&|Ti\u0002Z]qG\u0006+B>'bQSa`\\OuQ\u000e`ZM\u001dV x5\u0015wYvF+R\n\u0001+%\u0017\t\u0017\u0014N}T|)?W\u0002J\\ =\u0007/\n.M\u001er\f$\u001c\u001d:f\u001b/-\f")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0005(4\u0012\u0006)njO0L͜N3hݷZ\u000f\u001azt)Ӯ(sI;c\u001bF2\u0017ZfswpZZ9P\u001f\b&x\u0019/waIw \u0011JD\u0006>aPFސEžxB\rړJ$>}\u0013\u0006:,N\u0016\u0005\u0002\u0014e\u001a\u001aHB\u00079\u0001\u0010$į&Ū\nJ(ҵ6^mWDM\r_@91\nݬF\\"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n| \u0013N\u0004\u001d@t3~_\r3\u0001K 7[CDz\u0011.\u0019o`9\u00149", "", "\nh]6g\u0005", "u(E", "/cBAb9:U\u0019", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n| \u0013N\u0004\u001d@t3~:\u0002-7j\u0012<M\u001fDg;2$l_GEA6W\u0005'P[<;Xa\u0003Ki", "5dc\u000eW\u001aM]&z|^", "u(;0b4\bU#\t|e,F\n3r\u007f%wN\u0001`\u0013Pk\u0015P\u0006)3gG\u0001;z\u0016+IQ;G=\u001a\u001c|p=\u0005qj,\u00010ULW;JanL$ 0", "Adc\u000eW\u001aM]&z|^", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@J\u0013 Cv\"Kz#C#^$Dm\u0013*[C\u0017t0%)we7\u0015\"\nX\u007f5GU]\u001akN\u0002M\"g\u001e~", "/mP9l;BQ'l\nh9x\u000b/", "5dc\u000ea(Eg(\u0003xl\u001a\f\u0013<a\u0002(", "Adc\u000ea(Eg(\u0003xl\u001a\f\u0013<a\u0002(", "/r<.c", "", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n| \u0013N\u0004\u001d@t3~:\u0002-7j\u0012<M\u001fDg;2$l_GEA6W\u0005'P[=@gRH", "8`e.!*H[a\u0001\u0005h.\u0004\twa\t'\tJ\u0005\u0016_Iw\u001c:\u000125\"\u0002)Fm\u0018vKJ?k=-]pa5\u0015s9N~'P[H(gVlE\u0014\u000eh\u001e[+\u0015\u0005bP\u001ejO;"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ConsentBuilder {
    private FirebaseAnalytics.ConsentStatus zza;
    private FirebaseAnalytics.ConsentStatus zzb;

    public final Map<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus> asMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FirebaseAnalytics.ConsentStatus consentStatus = this.zza;
        if (consentStatus != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_STORAGE, consentStatus);
        }
        FirebaseAnalytics.ConsentStatus consentStatus2 = this.zzb;
        if (consentStatus2 != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, consentStatus2);
        }
        return linkedHashMap;
    }

    public final FirebaseAnalytics.ConsentStatus getAdStorage() {
        return this.zza;
    }

    public final FirebaseAnalytics.ConsentStatus getAnalyticsStorage() {
        return this.zzb;
    }

    public final void setAdStorage(FirebaseAnalytics.ConsentStatus consentStatus) {
        this.zza = consentStatus;
    }

    public final void setAnalyticsStorage(FirebaseAnalytics.ConsentStatus consentStatus) {
        this.zzb = consentStatus;
    }
}
