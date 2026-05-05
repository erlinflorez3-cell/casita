package com.ticnow.sdk.idnowonboarding.viewmodel;

import androidx.lifecycle.ViewModel;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration;
import com.ticnow.sdk.idnowonboarding.onboarding.SharedPreference;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApi;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я.\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nj?3Le^.ZS0\u0012s{J$c$wFQ٥J}P\b\u0010Q˗knXZ[[\u001d\u0007.x\u0019. ǈ%ٕ\u0016\u001b:ԏ\bA9P}AYbz;\u0013&\u0003:F\u0001\u001d\u0001H2\u001fƼ#ټGW\u0014۵HBvC`\u0017m\u0007 \u001d\u0014Jp\u0019,i\u007fNdVCҞfǥ'\u000fqĩf)e?\u000b]-HZ8\u001b\t269SO5C9*Ώ3қ_K\u000bӊ\n?\u000b}5=KKynDpą\u0018."}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u000f$7\u007f\u001e8LCB5\u001f+\u001ffaG\u0015M5K\u0001#TKR5^Cv=&yd\rN2b", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "u(E", "4tb2W\u0013HQ\u0015\u000e~h5Z\u00103e\t7", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Ny\f8\u0006)?bG\u0001G{\u0016-4M9gC\"\u001fqLF\u0011t0Mv4%SR,eaH", "5dc\u0013h:>R\u007f\txZ;\u0001\u00138C\u0007,{I\u0010", "u(;0b4\bU#\t|e,F\u00058d\r2\u007f?J\u0019\u001fU9\u0015Ft!D]\b)\u0001N&<MB\"u2\u001a$lkBqp6_z&GY,3`R{Li", "Adc\u0013h:>R\u007f\txZ;\u0001\u00138C\u0007,{I\u0010", "uKR<`u@]#\u0001\u0002^ux\u0012.r\n,z\n\u0003\u001f%\u0011v\u0018:r49c\u0007i\u0018}$.L*Ei0-\u0019rj$\u0014m=Ru'T*U0\\[\u0002\u0013W\u0003", "=m1<T9=W\"\u0001Xh5}\r1u\r$\u000bD\u000b ", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKMDl8 ^L@\"\u0011u\u0016Ws1CYM0eTPG\u001d\u0013^\u0010^8\t\u0014]K-D", "5dc\u001ca\tHO&}~g.Z\u00138f\u0004*\fM|&\u001bQx", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9u=\u001f\u0019j+\u001deL6``0DVJ9[V{?q\u001cc\u000fR-\u001d\u0012UP(xM\r", "Adc\u001ca\tHO&}~g.Z\u00138f\u0004*\fM|&\u001bQx", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AEt5\"\u00172E\u0018om>8\u007f$QH[+`[t\u001b\u001e\u001b[\u0012P;\u001a\u0001hE.w\u001az\u0010", "AdRBe0Mg", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u000f", "5dc X*N`\u001d\u000e\u000f", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#y+;7y\r;C9{A\"$|=D\u000b9", "Adc X*N`\u001d\u000e\u000f", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~U\t$\u0001Qt\u001cMAKx8-)Dl=\\'\u001d", "AgP?X+)`\u0019\u007fzk,\u0006\u0007/", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\b)4w\u0012;LGDm}\f\u0018dn9\u0006N9Nw'TLW*\\(", "5dc [(KS\u0018i\b^-|\u0016/n}(", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fiAv\u00138IP:o= ^Vd5\u0014c+9\u0004'HL[,ePr\u0013", "Adc [(KS\u0018i\b^-|\u0016/n}(", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G*@j *ZB?t6g\u0003k]F\u0007b\u0017[v(GYN5ZRH\u0001\u0005", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class ProcessOnboardingViewModel extends ViewModel {
    public FusedLocationProviderClient fusedLocationClient;
    public IDNowOnboardingConfiguration onBoardingConfiguration;
    public IDSecurityApi security;
    public SharedPreference sharedPreference;

    public final FusedLocationProviderClient getFusedLocationClient() {
        FusedLocationProviderClient fusedLocationProviderClient = this.fusedLocationClient;
        if (fusedLocationProviderClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fusedLocationClient");
        }
        return fusedLocationProviderClient;
    }

    public final IDNowOnboardingConfiguration getOnBoardingConfiguration() {
        IDNowOnboardingConfiguration iDNowOnboardingConfiguration = this.onBoardingConfiguration;
        if (iDNowOnboardingConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onBoardingConfiguration");
        }
        return iDNowOnboardingConfiguration;
    }

    public final IDSecurityApi getSecurity() {
        IDSecurityApi iDSecurityApi = this.security;
        if (iDSecurityApi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("security");
        }
        return iDSecurityApi;
    }

    public final SharedPreference getSharedPreference() {
        SharedPreference sharedPreference = this.sharedPreference;
        if (sharedPreference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreference");
        }
        return sharedPreference;
    }

    public final void setFusedLocationClient(FusedLocationProviderClient fusedLocationProviderClient) {
        Intrinsics.checkParameterIsNotNull(fusedLocationProviderClient, "<set-?>");
        this.fusedLocationClient = fusedLocationProviderClient;
    }

    public final void setOnBoardingConfiguration(IDNowOnboardingConfiguration iDNowOnboardingConfiguration) {
        Intrinsics.checkParameterIsNotNull(iDNowOnboardingConfiguration, "<set-?>");
        this.onBoardingConfiguration = iDNowOnboardingConfiguration;
    }

    public final void setSecurity(IDSecurityApi iDSecurityApi) {
        Intrinsics.checkParameterIsNotNull(iDSecurityApi, "<set-?>");
        this.security = iDSecurityApi;
    }

    public final void setSharedPreference(SharedPreference sharedPreference) {
        Intrinsics.checkParameterIsNotNull(sharedPreference, "<set-?>");
        this.sharedPreference = sharedPreference;
    }
}
