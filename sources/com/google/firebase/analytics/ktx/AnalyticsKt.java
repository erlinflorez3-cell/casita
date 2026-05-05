package com.google.firebase.analytics.ktx;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.ktx.FirebaseKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d̉=!4i\bDJf|\u0004Oي8\u000b4C\u0007\"B\u0012\u007f\u0007lkA0ReP\u008cZS8\u001bsڔ<$q$yCQU\"}8\tWȞog\u0005Jbŏ[>\u0014\"\u0011jZV}x\f\u0011?6P}W3{~mNn\u0005N\u00160428(\u0017\u0011\u001c:H>\u0004)Tƚ\u0010\u00126S7õXԁLĨ2;\u0014R8\u0001Li\u0010NdG\u001dt@11\u0013\u0002S^)o0+b\u001dHd';\u0004\u0010/ҋD7;(kٍ\t\u008fQ¹_\u001dMмU\u0007~&U* ֖c͏\\\f\u001cƃCQ\u0013]\u0001'|\u0007Wb\u001a*KaqOh\u000eV|Qԉ\u000fʀ\b\u0014\u000eΩ`03 t\u000f.F\u0003zk@~\u0001\u0007B.\u0004\u0018zа)\u0004K-?%t\\Ĩ;\u001eV:\u0002˶=L\"ѐr7"}, d2 = {"\u000fM0\u0019L\u001b\"1\u0007", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n| \u0013N\u0004\u001d@t3~:\u0002-7j\u0012<M\u001fDg;2$l_G\\", "5dc\u000eA\b%G\bbXL", "u(;0b4\bU#\t|e,F\n3r\u007f%wN\u0001`\u0013Pk\u0015P\u0006)3gG\u0001;z\u0016+IQ;G=\u001a\u001c|p=\u0005q\u0002", "Adc\u000eA\b%G\bbXL", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@J\u0013 Cv\"Kz#C#^$Dm\u0013*[C\u0017t0%)we7\u00159o?", "\u001aN2\u0018", "", "5dc\u0019B\n$", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "/mP9l;BQ'", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u0007&*\u0011P\u0012Iv\"1g}u", "5dc\u000ea(Eg(\u0003xl", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@J\u001d&Z9n@\u0004%2U\f \r1|,WK\u0005m>(\u0017oa\u0003\bg9Ns#UL\u0018(eNyQ#\u0016X\u001c\u0018\f\u0011\u0012Y> |D\u0013(\u00043]\u0011?f\u000fa", ":nV\u0012i,Gb", "", "<`\\2", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n| \u0013N\u0004\u001d@t3~_\r3\u0001X\u0012;IK;z4+#Eq=\u000eb,[L", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "Adc\u0010b5LS\"\u000e", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n| \u0013N\u0004\u001d@t3~_\r3\u0001K 7[CDz\u0011.\u0019o`9\u00149", "8`e.!*H[a\u0001\u0005h.\u0004\twa\t'\tJ\u0005\u0016_Iw\u001c:\u000125\"\u0002)Fm\u0018vKJ?k=-]pa5\u0015s9N~'P[H(gVlE\u0014\u000eh\u001e[+\u0015\u0005bP\u001ejO;"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class AnalyticsKt {
    private static volatile FirebaseAnalytics zza = null;
    private static final Object zzb = new Object();

    public static final FirebaseAnalytics getANALYTICS() {
        return zza;
    }

    public static final FirebaseAnalytics getAnalytics(Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        if (zza == null) {
            synchronized (zzb) {
                if (zza == null) {
                    zza = FirebaseAnalytics.getInstance(FirebaseKt.getApp(Firebase.INSTANCE).getApplicationContext());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = zza;
        Intrinsics.checkNotNull(firebaseAnalytics);
        return firebaseAnalytics;
    }

    public static final Object getLOCK() {
        return zzb;
    }

    @Deprecated(message = "\u0010O\u0003Gr\t\u001a\u0017lVg\u0010c\u001akbdQH\u0012x`K3f/.p`\u00041&|Ti\u0002Z]qG\u0006+B>'bQSa`\\OuQ\u000e`ZM\u001dV x5\u0015wYvF+R\n\u0001+%\u0017\t\u0017\u0014N}T|)?W\u0002J\\ =\u0007/\n.M\u001er\f$\u001c\u001d:f\u001b/-\f")
    @InterfaceC1492Gx
    public static final void logEvent(FirebaseAnalytics firebaseAnalytics, String name, Function1<? super ParametersBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        block.invoke(parametersBuilder);
        firebaseAnalytics.logEvent(name, parametersBuilder.getBundle());
    }

    public static final void setANALYTICS(FirebaseAnalytics firebaseAnalytics) {
        zza = firebaseAnalytics;
    }

    @Deprecated(message = "\u0010O\u0003Gr\t\u001a\u0017lVg\u0010c\u001akbdQH\u0012x`K3f/.p`\u00041&|Ti\u0002Z]qG\u0006+B>'bQSa`\\OuQ\u000e`ZM\u001dV x5\u0015wYvF+R\n\u0001+%\u0017\t\u0017\u0014N}T|)?W\u0002J\\ =\u0007/\n.M\u001er\f$\u001c\u001d:f\u001b/-\f")
    @InterfaceC1492Gx
    public static final void setConsent(FirebaseAnalytics firebaseAnalytics, Function1<? super ConsentBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ConsentBuilder consentBuilder = new ConsentBuilder();
        block.invoke(consentBuilder);
        firebaseAnalytics.setConsent(consentBuilder.asMap());
    }
}
