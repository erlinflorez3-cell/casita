package com.ticnow.sdk.idnowonboarding.viewmodel;

import androidx.lifecycle.ViewModel;
import com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration;
import com.ticnow.sdk.idnowonboarding.model.data.IDNowOnboardingData;
import com.ticnow.sdk.idnowonboarding.model.step.IDNowStep;
import com.ticnow.sdk.idnowonboarding.onboarding.SharedPreference;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApi;
import java.util.ArrayList;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"ЯV\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116B\u0005%4\u0012\u000e\u0007njO0Le^.ZS0\u0012s{J$c$wFCU0}*\tUQog\u0005Jb\u000bI\u0012\u000e\u0016\u000fj4I[{e\u0012\u001d7JoE4UoKEht<\u00066݅R8(\u0004A\u001dݵL\u0010\u0005z\u0014c\u001a\u0013H@\u001f<)ҏYŋ\u001e\u001e\u000ē8\u0003$_uRVJrbH5s/wIf;o2\rM;Oj&;~J&;BG5C.i\u0002e\\2α\u000fӭuI\rؒ?)1T\u0002cVZ\u0006!#9 'k\u0002>^\u001bP\u000f\u001c}ˊ[ӍO\\\u0016ߊ\u0010|\u0002\u001eJ\u0016.\b-[<Aj\u0001\u0016#Kv\tRnfXސNȸ~m>Ѝ=\u00029BG3\u0007SgT'h\b\u0016\u0013(6%\u0017mOw+לlڠ\u001f`\u007f\u0383ISFZVl*[C\r\u0012\u00113\u001c8%HI\u0016.*3\u0005ϖ1ھ_E+ܩ\u0004\u0004Ngu\u001b%bnxwx\u0019R0\u0016.7X1bɵ\u0007\u0081\tqXӹp.\u0017v*~W*\u0016>8p\b>1%>zeg\u0018r6e\u001a'?fe\u0006\u0005jla\u0010ӛ?̳Uo\u0018Рjx\u001alJn%Zlpa\u001aɀ`W"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u000f$7\u007f\u001e8LCB5\"-\u0015sD5\u0010b3N\u0004\u0018KL`\u0014fQrDi", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "u(E", "1ta?X5MA(~\u0006B5{\tB", "", "5dc\u0010h9KS\"\u000ehm,\bl8d\u007f;", "u(8", "Adc\u0010h9KS\"\u000ehm,\bl8d\u007f;", "uH\u0018#", "7c=<j\u001aMS$\r", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dw[R;v}\u0002sQkKtr,YL", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "5dc\u0016W\u0015He\u0007\u000ezi:", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u0016W\u0015He\u0007\u000ezi:", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "=m1<T9=W\"\u0001Xh5}\r1u\r$\u000bD\u000b ", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKMDl8 ^L@\"\u0011u\u0016Ws1CYM0eTPG\u001d\u0013^\u0010^8\t\u0014]K-D", "5dc\u001ca\tHO&}~g.Z\u00138f\u0004*\fM|&\u001bQx", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9u=\u001f\u0019j+\u001deL6``0DVJ9[V{?q\u001cc\u000fR-\u001d\u0012UP(xM\r", "Adc\u001ca\tHO&}~g.Z\u00138f\u0004*\fM|&\u001bQx", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AEt5\"\u00172E\u0018om>8\u007f$QH[+`[t\u001b\u001e\u001b[\u0012P;\u001a\u0001hE.w\u001az\u0010", "=mQ<T9=W\"\u0001YZ;x", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwL?Jg}\u0002sQkKpl)Xr4FPW.;N\u00029i", "5dc\u001ca)HO&}~g.[\u0005>a", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r:gC\u001a^L@\"\u0011u\u0016Ws1CYM0eTQ9#\u000e0", "Adc\u001ca)HO&}~g.[\u0005>a", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017B7z0gxGJC\u0019M5K\u0001#TKR5^1nL\u0010g\u001e~", "AdRBe0Mg", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u000f", "5dc X*N`\u001d\u000e\u000f", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#y+;7y\r;C9{A\"$|=D\u000b9", "Adc X*N`\u001d\u000e\u000f", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~U\t$\u0001Qt\u001cMAKx8-)Dl=\\'\u001d", "AgP?X+)`\u0019\u007fzk,\u0006\u0007/", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\b)4w\u0012;LGDm}\f\u0018dn9\u0006N9Nw'TLW*\\(", "5dc [(KS\u0018i\b^-|\u0016/n}(", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fiAv\u00138IP:o= ^Vd5\u0014c+9\u0004'HL[,ePr\u0013", "Adc [(KS\u0018i\b^-|\u0016/n}(", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G*@j *ZB?t6g\u0003k]F\u0007b\u0017[v(GYN5ZRH\u0001\u0005", "AsT=6,EZ{~~`/\f", "", "5dc g,I1\u0019\u0006\u0002A,\u0001\u000b2t", "u(5", "AsT=A(FS'", "", "5dc g,I<\u0015\u0007zl", "Adc g,I<\u0015\u0007zl", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class StepHandlerViewModel extends ViewModel {
    private ArrayList<IDNowStep> idNowSteps;
    private IDNowOnboardingConfiguration onBoardingConfiguration;
    private IDNowOnboardingData onboardingData;
    private IDSecurityApi security;
    private SharedPreference sharedPreference;
    private ArrayList<String> stepNames;
    private int currentStepIndex = -1;
    private final float stepCellHeight = 70.0f;

    public final int getCurrentStepIndex() {
        return this.currentStepIndex;
    }

    public final ArrayList<IDNowStep> getIdNowSteps() {
        return this.idNowSteps;
    }

    public final IDNowOnboardingConfiguration getOnBoardingConfiguration() {
        return this.onBoardingConfiguration;
    }

    public final IDNowOnboardingData getOnboardingData() {
        return this.onboardingData;
    }

    public final IDSecurityApi getSecurity() {
        return this.security;
    }

    public final SharedPreference getSharedPreference() {
        return this.sharedPreference;
    }

    public final float getStepCellHeight() {
        return this.stepCellHeight;
    }

    public final ArrayList<String> getStepNames() {
        return this.stepNames;
    }

    public final void setCurrentStepIndex(int i2) {
        this.currentStepIndex = i2;
    }

    public final void setIdNowSteps(ArrayList<IDNowStep> arrayList) {
        this.idNowSteps = arrayList;
    }

    public final void setOnBoardingConfiguration(IDNowOnboardingConfiguration iDNowOnboardingConfiguration) {
        this.onBoardingConfiguration = iDNowOnboardingConfiguration;
    }

    public final void setOnboardingData(IDNowOnboardingData iDNowOnboardingData) {
        this.onboardingData = iDNowOnboardingData;
    }

    public final void setSecurity(IDSecurityApi iDSecurityApi) {
        this.security = iDSecurityApi;
    }

    public final void setSharedPreference(SharedPreference sharedPreference) {
        this.sharedPreference = sharedPreference;
    }

    public final void setStepNames(ArrayList<String> arrayList) {
        this.stepNames = arrayList;
    }
}
