package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Set;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: PreferencesKeys.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!4i\bDRl|İI\u0006>\u00176B\u0005\"4\u0012\u0006\u000bnj?0LeV3ZS0\u000fs{B*c$wCCU(\u0005*\tUPog|jb\u000bI\u000f\u001e/\u0007̓DOezm\u0012=2pno7[pU9\u000fv|\nڶ6\">|\u001d\u001a(.`\u0016\u0007|SK:\u0017^?!>`\u000ee\u0005H\u0014LCŋ\u0005\u001ebmfOVsu@?%\u0013ipVU^`\u0001[\u000e^TU\u000f=fӿ/@=>->a\r\u001fXkA\u0013? H3gW+9J\fWdZF\u0019Ʀ/O\u0013i\u000b?j\u0012if\u001c);O\u0012Y~\rX{\t|%<2\u0010L,ρ2- u 'A\u0005\u000bYPR\u0012^p\u0002)`f\u001b3\u0001K+g\u001d-Vň?\u0019TH\u0014$\u001b0;\r~)kZ\u001eb%\u001b\u0003y\u007fD\u007f?mL\\\u000bq=\u001c\u00067g͆.\u00046[Ĳ3\u0011"}, d2 = {"0n^9X(G>&~{^9|\u0012-e\u000e\u000e{T", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGEI,bL", "", "<`\\2", "", "0n^9X(G9\u0019\u0013", "2nd/_,)`\u0019\u007fzk,\u0006\u0007/se(\u0010", "", "2nd/_,$S-", "4k^.g\u0017KS\u001a~\b^5z\t=K\u007f<", "", "4k^.g\u0012>g", "7mc\u001de,?S&~\u0004\\,\u000bn/y", "", "7mc\u0018X@", ":n]4C9>T\u0019\fzg*|\u0017\u0015e\u0014", "", ":n]4>,R", "Asa6a.)`\u0019\u007fzk,\u0006\u0007/se(\u0010", "Asa6a.$S-", "Asa6a.,S(i\b^-|\u0016/n}(\n&\u0001+", "", "Asa6a.,S(dzr", "2`c.f;H`\u0019F\u0006k,}\t<e\t&{NH\u0015!To"}, k = 2, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class PreferencesKeys {
    public static final Preferences.Key<Integer> intKey(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<Double> doubleKey(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<String> stringKey(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<Boolean> booleanKey(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<Float> floatKey(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<Long> longKey(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<Set<String>> stringSetKey(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }
}
