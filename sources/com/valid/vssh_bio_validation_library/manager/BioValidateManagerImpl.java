package com.valid.vssh_bio_validation_library.manager;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.gson.Gson;
import com.valid.communication.managers.communicationmanager.CommunicationManager;
import com.valid.vssh_bio_validation_library.executors.BioValidationError;
import com.valid.vssh_bio_validation_library.executors.BioValidationExecutors;
import com.valid.vssh_bio_validation_library.executors.BioValidationFailed;
import com.valid.vssh_bio_validation_library.executors.FingerPrintExecutors;
import com.valid.vssh_bio_validation_library.manager.derive.DeriveManagerImp;
import com.valid.vssh_bio_validation_library.model.DialogBuilderModel;
import com.valid.vssh_bio_validation_library.model.ValidateHardwareModel;
import com.valid.vssh_bio_validation_library.repository.BioValidationAuthRepository;
import com.valid.vssh_bio_validation_library.usecases.MasterKeyHelper;
import com.valid.vssh_bio_validation_library.usecases.ValidateAuthBiometricByDevice;
import com.valid.vssh_bio_validation_library.usecases.ValidateBiometric;
import com.valid.vssh_bio_validation_library.utils.EnumBioAuthenticationResult;
import com.valid.vssh_bio_validation_library.utils.InstanceBioValidationManager;
import com.valid.vssh_bio_validation_library.utils.helpers.SecurePreferencesHelper;
import com.valid.vssh_bio_validation_library.utils.model.EnumAction;
import com.valid.vssh_bio_validation_library_embed.R;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Map;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Яĥ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013.H~*,(w\u000f߿r9FDm߉6Ri*\u0017ӆ\u00044:[,qY;]\u001a\u0014\"\u0011OTgonXZ\u0013¼\u0017\u0006,xr,OU\u0001](\u000f:ԏw?IMw=?a|6\u001b :\">y\r\u0001(6P\u0010|}KK\u001a\u001b8ϋx:h\rU\u0005(\u0018\u000e>6\u0001&ձoNDjt]@/+\u0003\u007fBVϋg0\u0013M\u0015FZ'\u0015vw\u001e3@M5\u001d%Y\f\u000fRq?\u000b?w?\u001bؒW'YH4bF\\\u000e\u0014-+}\u000eǁv&j\u0007\u001a3\u001a9CO\u0012O\u0001\u00126\u000b\u0013{;P4\u0012\u0014<`.[0\u0017\u0018\u001cJ\r~cB`\u0002\rA\u0010|q6E4.=[I)~imK\u001b^7*\u0010\u001d 3\u0001\u001d0\n^>p#4l\u0004a3a@kb^\fi=\u001c\u0013\u001flH*LVU\u001bG{?=G)EwQ#O\t2LR\u0006\u000f\u0005\u000f\u0006\u0004m`gX\"\u001d3g.\u0017!rD\u0013\u001b2P\u001d#:1e\u001c\u0003\u000f.\f!3twj5U \\f\u0001uzOm\nS.v9in\u001a\u001d\u0006C\u000fCCi{\u001cqT\u0007\u0014mGr\u0007hfpb:d\r80K`v y\fD|&#4OqJCZ;_\\]f\u0011?ZA+\u001a\u0010^v,\u0017TaA3m2\u0013!\u0001~y!su\u0018a,+}h-\nqC;>UPwd\u00011\u001a\u0017s.[\u0018\\UZ\u0005\"\u0006W\f D=IS?=A\u001e-3z4;idr\u0014`}\u00165\u000e\u0015y=O\u0019Nu\u0016\u0003\r<rzZ_V'\"%\u0005!Hpj\u0010{qF)mB{\u001b]NI!\u0012\bF\u0015=E1-F=\u0001\u001e1-9;V?\u001dD\fDK#ou\u0002\u007f<\nn\u001f(\u0005e2Is\u0018\u007fb\u007f\\`dHKi~l1RvK`V\u0015\u0010\bp\u0018d\u0011AsYd\u001f\u0003hQ\u0019\\\u0016f5Z=tdnR\u0013\u001e\u0012z3(s\u0002r\u0016\u0014\rRU\u0015[f\u007fm\u001c_\r\u000fX?\"\u000b*b\u001f1*K8qgs\u0019?4&͛:KAn\u0015B\u000f1D.B\u000e1vdk\u0016\u0010)\u000fti?\u001b@v\f;\u00051\u0005|j\f`\u0005\u000fh'!r5\rEK\u001e'Da\t{Yl/\u0012F1c+@3v_\u0001v%Yad;+(\u0007\u007f9n\u000eSW\u0010N\u0010W+}k\u001e/H\u001a\r\u001dp'IC\u001a3m/H^9d\u0015Rr0*f\u0001qR9\r\t\u0015\u001aL\f\u001f\u000bGr\u0003qr-z]&A\n\u001aI%Rc\u001f\f+rv\u001f;\u0019M-k]1\u0015oكVav\u0016\bN/W\b\u00034tW<z:a)O.qDx2\r!\r8\u0004\\m%\u0012\u0018E Q_\u0013C\u0011A]̲o\u0002'L71r\u0013RMn~0q|e~U9\u0012\u0015;\u0007\u0019|Eh8\u00198]=Acŷ>\u001bY,h\u0017\u0006!%(%<.p9\u0012_c\u0017\u007f\u001aY\f,9H\u0004EqB@aL\u0018ψ}\u007f\n6d.\u001bHfODj/j|Dg\u000e\ryVn%\u00107Q\u0015~v\u001dY3B\u0006\u000b\u001e\u0013>g\u001d-n%G\u000f\u001b4UW49=bA+7`.\u007f*\u0007\u00111I\u0011~HcPI\u000b\u007f\u0016;]JbP2'\b8\u001eh\u0011VcEfs8K\u001f\u001c)JjI0M\u000bL̄?[9M)\u0017\u0007\"H\bu\r?hzSc%X\u0010+\u000bSDB7y{\f7!Fu\u000f@'efS%cf#ہ\u000e֮iJ\u0007\u07b74b\u001ddDIcIt\u009c\u0002ˑ\u0004\n'\u07fbt\u0012\u0004(\u0018E_N\u0001ئ\tȡZs_ƨv6Du\\#utO݈6ߢm\u0018{ߪ,\tBJ\u0013/)UN9[wخIWn\u0006\u001bJ\u0013R$9\u0015\fOA'~ O OYSIٌ[ۺa<\u001bŎTF@qNyuQ0إ2Я\u0016TkÅހq\u0014"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017K7t0 \u0015u+\u0016\u000bm\u001dJ}+FH],DN{9\u0016\u0012gqV6\u0014Z", "", "0h^#T3BR\u0015\u000e~h5X\u0019>hl(\u0007J\u000f\u001b&Q|\"", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017P;v>,\u0019wkF\u001b-\tR\u0001\u0018CSR+XavG\u001dmj\u001dQ\u0018\r\u0010cO(}ND3]", "uKR<`uOO \u0003y(=\u000b\u00172_|,\u0006:\u0012\u0013\u001eKn\nKz/>S\u0005$4z\u0012;a\rHk?(#lpC\u0014wu+z18HU0[N\u0002A\u001e\u001b6\u001e].y\u0005dK2rSA,\u001c\u0002\rr", "0h^:X;KW\u0017i\bh4\b\u0018", "\u001a`]1e6BR,Hwb6\u0005\t>r\u0004&E\u001d\u0005!\u001fG~\u001b@t\u0010Bc\u0006+FC", "2da6i,&O\"z|^9`\u0011:", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017K7t0 \u0015u+8\u0007p0_vp&L[0mRZ9\u001d\u000e\\\u000e[\u000f\u0015\u0010/", "4h]4X9)`\u001d\b\n<(\u0004\u0010,a}.", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI)\u007fI\u0003\u0017$R|\u0012E\u0006n\u0016]\u0007\"7z!;QLJS0'\u0011jaFE?<]y'P[R*XavG\u001doV\u0015U(\t\u0003_\u0017", "=m4?e6K/)\u000e};0\u0007\u0011/t\r,y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017CNk2.$rnGP@0Xg#NPM(kV|Fs\u001fg\u0018[\u0001", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "@db=b5LS", "", ">q^:c;\"\\\u001a\t", "\u001a`]1e6BR,Hwb6\u0005\t>r\u0004&E\u001d\u0005!\u001fG~\u001b@t\u0010Bc\u0006+F,\u0001;WKFz\u0018'\u0016r7", "1qT.g,\u001bW#\u0007zm9\u0001\u0007\u001ar\n0\u0007O", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "4qP4`,Gbt|\nb=\u0001\u0018C", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D5{/;~\u001a=a\u0019", "=mBBV*>a'Z\u000bm/", "=m4?e6K/)\u000e}", "=m5.\\3>Rt\u000f\na", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017CNk2.$rnGP@0Xg#NPM(kV|Ft\u000e^\u0015N*b", "1qT.g,\u001fW\"\u0001zk\u0017\n\r8tj2\u00070\f", "Bhc9X", "", "AtQ!\\;ES", "2db0e0Ib\u001d\t\u0004", "1qT.g,\u001fW\"\u0001zk7\n\r8tg$\u0005<\u0003\u0017$%k\u0015Cs!3_", "1qT.g,)`#\u0007\u0006m\u0010\u0006\n9", "2d[2g,\u001dO(zhZ-|\u0010C", "", "5dc\u000f\\6FS(\f~\\\u000fx\u0016.w{5{/\u0015\"\u0017U", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "5dc\u0011T;:A\u0015\u007fze@", "", "7mbAT5<S\u0003\u007fWb6\u0005\t>r\u0004&WP\u0010\u001a~Cx\n>v2", "7mc2e-:Q\u0019f", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017K7t0 \u0015u+\u001dcg6?r.KKJ;`\\{%\u0010\u001bV\u0010N8b", "1n\\:h5BQ\u0015\u000e~h5`\u0012=t{1y@", "\u001ab^:\"=:Z\u001d}D\\6\u0005\u0011?n\u0004&wO\u0005! \u0011w\nEr'5f\fi5w\u001e6]L?i0-\u0019rjA\u0003l(Pv4\u0011*X4db{A\u0012\u000ei\u0012X4t\u0001b=&nQ\r", "<nc6Y@,b\u0015\u000e\u000bl\u000fx\u0016.w{5{\u001f\u0001&\u0017E~\u000e;", "/bc6b5-g$~", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^pk8\u0007ju.\u007f7O(L;`\\{\u0013", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017K7t0 \u0015u+!\u0003l(Pv44L\\7f[\u0001=i", "2`c.", "6`a1j(KSw~\n^*\f\t.", "6`b\u0012a9HZ ~y?0\u0006\u000b/r\u000b5\u007fI\u0010%", "Adc\u0011T;,O\u001a~\u0002r", ";CPAT", "Adc\u0011T;:A\u0015\u007fze@i\t=p\n1\n@", "2`c.<:,O*~y", "AdcBc\tB]!~\nk0zd?t\u0003", "Ag^D50H[\u0019\u000e\bb*g\u00169m\u000b", "7rB2g\u000b:b\u0015lv_,\u0004\u001d", "2hP9b.\u001bc\u001d\u0006y^9d\u0013.e\u0007", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017KEj4%^Ge5\u000em.+\u0007+NKN9D\\q=\u001bg", "D`[6W(MSx\u0012~l;j\t-u\r(Z<\u0010\u0013", "D`[6W(MS{z\b]>x\u0016/B\u00042\u0004@\u0010$\u001bE", "D`[6W(MS\n~\bl0\u0007\u0012\u001dO", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class BioValidateManagerImpl {
    private final BioValidationAuthRepository bioValidationAuthRepository;
    private BiometricPrompt biometricPrompt;
    private DeriveManagerImp deriveManagerImp;
    private FingerprintManager.AuthenticationCallback fingerPrintCallback;
    private Function1<? super BioValidationError, Unit> onErrorAuthBiometric;
    private BiometricPrompt.PromptInfo promptInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 1}, pn = "", xs = "")
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EnumAction.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[EnumAction.VALIDATE_EXIST_SECURE_DATA.ordinal()] = 1;
            iArr[EnumAction.GET_DATA_SAFELY.ordinal()] = 2;
            iArr[EnumAction.VALIDATE_HARDWARE.ordinal()] = 3;
            iArr[EnumAction.DELETE_DATA_SAFELY.ordinal()] = 4;
            iArr[EnumAction.SAVE_DATA_SAFELY.ordinal()] = 5;
            int[] iArr2 = new int[EnumAction.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[EnumAction.VALIDATE_EXIST_SECURE_DATA.ordinal()] = 1;
            iArr2[EnumAction.GET_DATA_SAFELY.ordinal()] = 2;
            iArr2[EnumAction.VALIDATE_HARDWARE.ordinal()] = 3;
            iArr2[EnumAction.DELETE_DATA_SAFELY.ordinal()] = 4;
            iArr2[EnumAction.SAVE_DATA_SAFELY.ordinal()] = 5;
        }
    }

    public BioValidateManagerImpl(BioValidationAuthRepository bioValidationAuthRepository) {
        Intrinsics.checkParameterIsNotNull(bioValidationAuthRepository, C1561oA.Qd("\u0001\u0007\fq{\u0006\u0002{w\n}\u0003\u0001R\u0006\u0004v_q{y|q{uw}", (short) (C1607wl.Xd() ^ ((1719581963 ^ 389868339) ^ 1900177101))));
        this.bioValidationAuthRepository = bioValidationAuthRepository;
    }

    private final BiometricPrompt createBiometricPrompt(Context context, FragmentActivity fragmentActivity, final Function1<Object, Unit> function1, final Function1<? super BioValidationError, Unit> function12, final Function1<? super BioValidationFailed, Unit> function13) {
        return new BioValidationExecutors().createBioValidationPrompt(fragmentActivity, context, new Function1<Object, Unit>() { // from class: com.valid.vssh_bio_validation_library.manager.BioValidateManagerImpl.createBiometricPrompt.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                short sXd = (short) (C1607wl.Xd() ^ ((558021883 ^ 631244227) ^ 81971115));
                int[] iArr = new int["\u000fs".length()];
                QB qb = new QB("\u000fs");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                    i2++;
                }
                Intrinsics.checkParameterIsNotNull(obj, new String(iArr, 0, i2));
                function1.invoke(obj);
                EO.Od("\u000eBb\u0003D/\u000b%\u007f\u0004", (short) (ZN.Xd() ^ (FB.Xd() ^ (1128879191 ^ 480670309))));
                C1561oA.Qd("b\u000e\u0010\u000f\u0001}\u000e8Y\u007f\u0005\u0002x\u0007\u0004yr.N\u0002\u007frnv{ohewkpn", (short) (Od.Xd() ^ ((484851511 ^ 1511708561) ^ (-1190959099))));
            }
        }, new Function1<BioValidationError, Unit>() { // from class: com.valid.vssh_bio_validation_library.manager.BioValidateManagerImpl.createBiometricPrompt.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BioValidationError bioValidationError) {
                invoke2(bioValidationError);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BioValidationError bioValidationError) {
                Intrinsics.checkParameterIsNotNull(bioValidationError, C1593ug.zd("$0", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (1644907669 ^ (-206529166)))), (short) (C1499aX.Xd() ^ ((1765898741 ^ 1814333375) ^ (-90539563)))));
                function12.invoke(bioValidationError);
                C1561oA.od("8DC?A", (short) (ZN.Xd() ^ (ZN.Xd() ^ 864713804)));
                C1561oA.Kd("Ckrqjzyql*L\u0002\u0002vt~\u0006{vu\n\u007f\u0007\u00079_\u000e\u000f\r\u0011", (short) (Od.Xd() ^ (1667748140 ^ (-1667737473))));
            }
        }, new Function1<BioValidationFailed, Unit>() { // from class: com.valid.vssh_bio_validation_library.manager.BioValidateManagerImpl.createBiometricPrompt.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BioValidationFailed bioValidationFailed) {
                invoke2(bioValidationFailed);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BioValidationFailed bioValidationFailed) {
                int iXd = Od.Xd() ^ (830385377 ^ (-1988327336));
                Intrinsics.checkParameterIsNotNull(bioValidationFailed, Wg.Zd(";\u0016", (short) (C1499aX.Xd() ^ ((1030713015 ^ 1516201234) ^ (-1731208880))), (short) (C1499aX.Xd() ^ iXd)));
                function13.invoke(bioValidationFailed);
                C1561oA.Xd("OKTXRR", (short) (OY.Xd() ^ (1904168122 ^ 1904181056)));
                Wg.vd("8`gf_onfa\u001fAvvkiszpkj~t{{.Uqz~\t\u0007z", (short) (C1633zX.Xd() ^ (1709696876 ^ (-1709697000))));
            }
        });
    }

    private final void createFingerPrintPopUp(String str, String str2, String str3, FragmentActivity fragmentActivity) {
        InstanceBioValidationManager.INSTANCE.getDialogFingerprint().setDialogBuilderModel(new DialogBuilderModel(str, str2, str3));
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, C1593ug.zd("'4$+2+5<\n-?5C7CI~EHDEEIL\u001fL<CJCMT.CQELKY", (short) (OY.Xd() ^ (700963166 ^ 700943099)), (short) (OY.Xd() ^ (207227096 ^ 207234654))));
        InstanceBioValidationManager.INSTANCE.getDialogFingerprint().show(supportFragmentManager, C1561oA.od("xhuu", (short) (OY.Xd() ^ (Od.Xd() ^ 1207815024))));
    }

    private final FingerprintManager.AuthenticationCallback createFingerprintManagerCallback(Context context, final Function1<Object, Unit> function1, final Function1<? super BioValidationError, Unit> function12, final Function1<? super BioValidationFailed, Unit> function13) {
        return new FingerPrintExecutors().createFingerprintManagerCallback(context, new Function1<Object, Unit>() { // from class: com.valid.vssh_bio_validation_library.manager.BioValidateManagerImpl.createFingerprintManagerCallback.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                int iXd = ZN.Xd() ^ 864699886;
                Intrinsics.checkParameterIsNotNull(obj, Qg.kd("\f\u0016", (short) (FB.Xd() ^ ((1493848823 ^ 521899330) ^ 1175556840)), (short) (FB.Xd() ^ iXd)));
                function1.invoke(obj);
                InstanceBioValidationManager.INSTANCE.getDialogFingerprint().closeFingerPrintPopUp();
                hg.Vd("+,\u0019\u0018\u0019&%}|{", (short) (FB.Xd() ^ (45743919 ^ 45718080)), (short) (FB.Xd() ^ ((1586971972 ^ 1208101924) ^ 378863736)));
                C1561oA.ud("\u001dHJI;8Hr\u0014:?<3A>4-h\t<:-)16*# 2&+)", (short) (OY.Xd() ^ ((2032581092 ^ 700036630) ^ 1352603166)));
            }
        }, new Function1<BioValidationError, Unit>() { // from class: com.valid.vssh_bio_validation_library.manager.BioValidateManagerImpl.createFingerprintManagerCallback.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BioValidationError bioValidationError) {
                invoke2(bioValidationError);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BioValidationError bioValidationError) {
                Intrinsics.checkParameterIsNotNull(bioValidationError, C1561oA.yd("!+", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207828091)))));
                function12.invoke(bioValidationError);
                C1561oA.Yd("\u000e\u001c\u001d\u001b\u001f", (short) (C1633zX.Xd() ^ ((906331129 ^ 210586927) ^ (-982051703))));
                int iXd = Od.Xd() ^ (2139210671 ^ 947657784);
                Xg.qd("}&-,%54,'d\u0007<<1/9@610D:AAs\u001aHIGK", (short) (ZN.Xd() ^ ((1848947605 ^ 1279237551) ^ 571170292)), (short) (ZN.Xd() ^ iXd));
            }
        }, new Function1<BioValidationFailed, Unit>() { // from class: com.valid.vssh_bio_validation_library.manager.BioValidateManagerImpl.createFingerprintManagerCallback.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BioValidationFailed bioValidationFailed) {
                invoke2(bioValidationFailed);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BioValidationFailed bioValidationFailed) {
                int iXd = FB.Xd() ^ (499031822 ^ (-1112643144));
                int iXd2 = C1633zX.Xd() ^ (1143928915 ^ 813689363);
                short sXd = (short) (C1499aX.Xd() ^ iXd);
                short sXd2 = (short) (C1499aX.Xd() ^ iXd2);
                int[] iArr = new int["U#".length()];
                QB qb = new QB("U#");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                    i2++;
                }
                Intrinsics.checkParameterIsNotNull(bioValidationFailed, new String(iArr, 0, i2));
                function13.invoke(bioValidationFailed);
                ZO.xd("APO[!\u0002", (short) (OY.Xd() ^ (FB.Xd() ^ (1717570285 ^ 965678645))), (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849961820)));
                C1626yg.Ud("z\u001bT{IWYnw*\u0014N^mGOwic\f\u001d$\u001f\u001b[HZ\fq>o\u0005", (short) (C1607wl.Xd() ^ (OY.Xd() ^ 69945612)), (short) (C1607wl.Xd() ^ ((395648810 ^ 91940588) ^ 317698581)));
            }
        });
    }

    private final BiometricPrompt.PromptInfo createPromptInfo(String str, String str2, String str3) {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 597192319 ^ 597192289;
        String strKd = C1561oA.Kd("p\u0019 \u001f\u0018('\u001f\u001a\b+)(,1k\u000f20/38\u000e4ដQhijklmnopqrstuvw\u0007<PEIB\u0007\t", (short) (C1607wl.Xd() ^ ((1880593056 ^ 1649469506) ^ 306650782)));
        int iXd = C1607wl.Xd() ^ (1725839632 ^ (-144331578));
        short sXd = (short) (C1633zX.Xd() ^ (332763614 ^ (-332759550)));
        short sXd2 = (short) (C1633zX.Xd() ^ iXd);
        int[] iArr = new int["B<5FT3\u0014A".length()];
        QB qb = new QB("B<5FT3\u0014A");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(((i4 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i4++;
        }
        String str4 = new String(iArr, 0, i4);
        int i5 = (741637428 ^ 1624418054) ^ 1290197565;
        if (i2 >= i3) {
            BiometricPrompt.PromptInfo promptInfoBuild = new BiometricPrompt.PromptInfo.Builder().setTitle(str).setSubtitle(str2).setDescription(str3).setAllowedAuthenticators(i5).setNegativeButtonText(str4).setConfirmationRequired(true).build();
            Intrinsics.checkExpressionValueIsNotNull(promptInfoBuild, strKd);
            return promptInfoBuild;
        }
        BiometricPrompt.PromptInfo promptInfoBuild2 = new BiometricPrompt.PromptInfo.Builder().setAllowedAuthenticators(i5).setTitle(str).setSubtitle(str2).setDescription(str3).setNegativeButtonText(str4).setConfirmationRequired(true).build();
        Intrinsics.checkExpressionValueIsNotNull(promptInfoBuild2, strKd);
        return promptInfoBuild2;
    }

    private final void notifyStatusHardwareDetected(Context context, EnumAction enumAction, Function1<? super ManagerResponse, Unit> function1, boolean z2, boolean z3) throws Throwable {
        int i2;
        EnumBioAuthenticationResult enumBioAuthenticationResult = EnumBioAuthenticationResult.BIOMETRIC_ERROR_HW_UNAVAILABLE;
        int i3 = R.string.txt_error_hardware_insufficient;
        Class<?> cls = Class.forName(C1561oA.Xd("BPGVTOK\u0016LYY`R\\c\u001e4aahZnk", (short) (C1499aX.Xd() ^ ((866023018 ^ 1395881872) ^ (-1621971615)))));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i3)};
        Method method = cls.getMethod(Wg.vd("QN\\:b_UYI", (short) (OY.Xd() ^ ((1447475939 ^ 663832752) ^ 1909963311))), clsArr);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(context, objArr);
            Intrinsics.checkExpressionValueIsNotNull(str, Qg.kd("\u0001\f\n\u000f~\u0011\fD|y\be\u0006\u0003x|t4]8||yo䳑suaiaqbt]m_XaeijZY[TYT\\a\u0015", (short) (ZN.Xd() ^ ((1141038327 ^ 14472617) ^ 1155429527)), (short) (ZN.Xd() ^ ((248541171 ^ 1356927093) ^ 1580281482))));
            int i4 = 1113953714 ^ 1113953713;
            if (z2 && z3) {
                enumBioAuthenticationResult = EnumBioAuthenticationResult.BIOMETRIC_SUCCESS;
                int i5 = R.string.txt_successful_validation;
                Class<?> cls2 = Class.forName(hg.Vd("\u0017#\u0018%!\u001a\u0014\\\u0011\u001c\u001a\u001f\u000f\u0017\u001cTh\u0014\u0012\u0017\u0007\u0019\u0014", (short) (C1607wl.Xd() ^ (1714818944 ^ 1714815842)), (short) (C1607wl.Xd() ^ ((52311863 ^ 27471477) ^ 45966827))));
                Class<?>[] clsArr2 = {Integer.TYPE};
                Object[] objArr2 = {Integer.valueOf(i5)};
                short sXd = (short) (C1580rY.Xd() ^ ((2032730838 ^ 752189965) ^ (-1442641299)));
                int[] iArr = new int["LIW5URHLD".length()];
                QB qb = new QB("LIW5URHLD");
                int i6 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i6] = xuXd.fK(sXd + i6 + xuXd.CK(iKK));
                    i6++;
                }
                Method method2 = cls2.getMethod(new String(iArr, 0, i6), clsArr2);
                try {
                    method2.setAccessible(true);
                    str = (String) method2.invoke(context, objArr2);
                    Intrinsics.checkExpressionValueIsNotNull(str, C1561oA.yd("U`bg[ml%QN`>b_Y]i)V1yyzp珷qpZqrcbw\u0005\by\f\u0002w\u000ekuuoo\u0002y~\u0011J", (short) (C1499aX.Xd() ^ ((1158171021 ^ 551821464) ^ (-1709989328)))));
                    i2 = 0;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else if (z3) {
                i2 = 1;
            } else {
                enumBioAuthenticationResult = EnumBioAuthenticationResult.BIOMETRIC_ERROR_NONE_ENROLLED;
                int i7 = R.string.txt_biometric_is_not_set_up;
                Class<?> cls3 = Class.forName(C1561oA.Yd("m{r\u0002\u007fzvAw\u0005\u0005\f}\b\u000fI_\r\r\u0014\u0006\u001a\u0017", (short) (C1580rY.Xd() ^ ((1994192511 ^ 757208888) ^ (-1543422275)))));
                Class<?>[] clsArr3 = {Integer.TYPE};
                Object[] objArr3 = {Integer.valueOf(i7)};
                Method method3 = cls3.getMethod(Xg.qd("TScCed\\b\\", (short) (C1499aX.Xd() ^ ((1080181442 ^ 400334399) ^ (-1472105895))), (short) (C1499aX.Xd() ^ ((1199754162 ^ 1959241259) ^ (-860161191)))), clsArr3);
                try {
                    method3.setAccessible(true);
                    str = (String) method3.invoke(context, objArr3);
                    short sXd2 = (short) (Od.Xd() ^ (1788113983 ^ (-1788114407)));
                    short sXd3 = (short) (Od.Xd() ^ (1935284030 ^ (-1935309123)));
                    int[] iArr2 = new int["-u\u0013_\rF\u007f]5\u001aEiIc)di\u007fXH|\u0014a\u000fຉo1> DZNJ']_H\u000f\tmz6\u0010\u0018{A8%.#".length()];
                    QB qb2 = new QB("-u\u0013_\rF\u007f]5\u001aEiIc)di\u007fXH|\u0014a\u000fຉo1> DZNJ']_H\u000f\tmz6\u0010\u0018{A8%.#");
                    int i8 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i8] = xuXd2.fK(xuXd2.CK(iKK2) - ((i8 * sXd3) ^ sXd2));
                        i8++;
                    }
                    Intrinsics.checkExpressionValueIsNotNull(str, new String(iArr2, 0, i8));
                    i2 = i4;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            int i9 = WhenMappings.$EnumSwitchMapping$1[enumAction.ordinal()];
            if (i9 == 1 || i9 == (964679743 ^ 964679741) || i9 == i4 || i9 == (1438973281 ^ 1438973285) || i9 == (172041966 ^ 172041963)) {
                InstanceBioValidationManager.INSTANCE.getIMethodsBioValidation().validateHardwareBiometric(enumBioAuthenticationResult, enumAction, i2, str);
                function1.invoke(new ManagerResponse(enumBioAuthenticationResult, enumAction, i2, str));
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDataSafelyResponse(boolean z2, Function1<? super Boolean, Unit> function1) {
        InstanceBioValidationManager.INSTANCE.getIMethodsBioValidation().setDataSafely(z2);
        function1.invoke(Boolean.valueOf(z2));
    }

    private final void setupBiometricAuth(Context context) throws Throwable {
        try {
            Cipher cipher = MasterKeyHelper.INSTANCE.getCipher();
            cipher.init(1, MasterKeyHelper.INSTANCE.getSecretKey(context));
            if (!validateVersionSO()) {
                FingerprintManager.CryptoObject cryptoObject = new FingerprintManager.CryptoObject(cipher);
                InstanceBioValidationManager.INSTANCE.setCancellationSignal(new CancellationSignal());
                FingerprintManager fingerprintManager = InstanceBioValidationManager.INSTANCE.getFingerprintManager();
                CancellationSignal cancellationSignalInstance = InstanceBioValidationManager.INSTANCE.getCancellationSignalInstance();
                FingerprintManager.AuthenticationCallback authenticationCallback = this.fingerPrintCallback;
                if (authenticationCallback == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Ig.wd("J\u0007wNB#1<g\u001d%\u0012`qi\u0002+G\b", (short) (C1607wl.Xd() ^ ((1554852246 ^ 1931558954) ^ 797724188))));
                }
                fingerprintManager.authenticate(cryptoObject, cancellationSignalInstance, 0, authenticationCallback, null);
                return;
            }
            BiometricPrompt biometricPrompt = this.biometricPrompt;
            if (biometricPrompt == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ZO.xd("4/Upv\u001dRR`E(\u001b\u001er3", (short) (C1580rY.Xd() ^ ((592158191 ^ 1222049111) ^ (-1805459458))), (short) (C1580rY.Xd() ^ ((277120876 ^ 1857234253) ^ (-2117587287)))));
            }
            BiometricPrompt.PromptInfo promptInfo = this.promptInfo;
            if (promptInfo == null) {
                short sXd = (short) (ZN.Xd() ^ ((1248251662 ^ 419483778) ^ 1399214785));
                short sXd2 = (short) (ZN.Xd() ^ (1804833676 ^ 1804838562));
                int[] iArr = new int["$\u007f\"?O{> j;".length()];
                QB qb = new QB("$\u007f\"?O{> j;");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                    i2++;
                }
                Intrinsics.throwUninitializedPropertyAccessException(new String(iArr, 0, i2));
            }
            biometricPrompt.authenticate(promptInfo, new BiometricPrompt.CryptoObject(cipher));
        } catch (KeyPermanentlyInvalidatedException unused) {
            EO.Od("\u001fb)#P+ua\u001aPW\u007f'.\u0016X\u0016", (short) (ZN.Xd() ^ ((1949229235 ^ 285412588) ^ 1697510138)));
            C1561oA.Qd("<Uh>R^XKWMUZQ],PWAKGA=O?=\u001dO9:DG;@>", (short) (C1633zX.Xd() ^ ((1851271572 ^ 805284602) ^ (-1101510204))));
            if (!validateVersionSO()) {
                InstanceBioValidationManager.INSTANCE.getDialogFingerprint().closeFingerPrintPopUp();
            }
            Function1<? super BioValidationError, Unit> function1 = this.onErrorAuthBiometric;
            if (function1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(C1593ug.zd("WW/]^\\`0eeZ5]dc\\lkc^", (short) (OY.Xd() ^ ((2129027698 ^ 128520099) ^ 2035220888)), (short) (OY.Xd() ^ (2044344658 ^ 2044352150))));
            }
            function1.invoke(new BioValidationError((970638264 ^ 1571098832) ^ (-1686098787), C1561oA.od("@:AC\u0019DBG7I", (short) (Od.Xd() ^ ((1789727711 ^ 1225585651) ^ (-597816978))))));
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        } catch (InvalidKeyException e4) {
            e4.printStackTrace();
        } catch (KeyStoreException e5) {
            e5.printStackTrace();
        } catch (NoSuchAlgorithmException e6) {
            e6.printStackTrace();
        } catch (UnrecoverableKeyException e7) {
            e7.printStackTrace();
        } catch (CertificateException e8) {
            e8.printStackTrace();
        }
    }

    private final boolean validateVersionSO() {
        return Build.VERSION.SDK_INT >= (1511400629 ^ 1511400617);
    }

    public final void deleteDataSafely(Context context, final Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, C1561oA.Kd("erryk\u007f|", (short) (ZN.Xd() ^ (Od.Xd() ^ (1405861070 ^ 339113427)))));
        Intrinsics.checkParameterIsNotNull(function1, Wg.Zd("'\u001bM6aJUu", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (1174794242 ^ 94285748))), (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (852249290 ^ (-21384100))))));
        if (InstanceBioValidationManager.INSTANCE.getInstance()) {
            new SecurePreferencesHelper(context).deleteDataSafely(new Function1<Boolean, Unit>() { // from class: com.valid.vssh_bio_validation_library.manager.BioValidateManagerImpl.deleteDataSafely.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    InstanceBioValidationManager.INSTANCE.getIMethodsBioValidation().deleteDataSafely(z2);
                    function1.invoke(Boolean.valueOf(z2));
                }
            });
        }
    }

    public final void getBiometricHardwareTypes(Context context, Function1<? super ArrayList<Integer>, Unit> function1) throws Throwable {
        short sXd = (short) (OY.Xd() ^ (FB.Xd() ^ (1534887098 ^ 76782828)));
        int[] iArr = new int["q~~\u0006w\f\t".length()];
        QB qb = new QB("q~~\u0006w\f\t");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(context, new String(iArr, 0, i2));
        Intrinsics.checkParameterIsNotNull(function1, Wg.vd("\\N_[US[L", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (-1207821997)))));
        if (InstanceBioValidationManager.INSTANCE.getInstance()) {
            ArrayList<Integer> biometricHardwareTypes = new ValidateAuthBiometricByDevice().getBiometricHardwareTypes(context);
            InstanceBioValidationManager.INSTANCE.getIMethodsBioValidation().getBiometricHardwareTypes(biometricHardwareTypes);
            function1.invoke(biometricHardwareTypes);
        }
    }

    public final void getDataSafely(Context context, Function1<? super Map<String, ? extends Object>, Unit> function1) {
        short sXd = (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ (1547044580 ^ 1841259452)));
        short sXd2 = (short) (C1580rY.Xd() ^ (631419343 ^ (-631408169)));
        int[] iArr = new int["\u0001\f\n\u000f~\u0011\f".length()];
        QB qb = new QB("\u0001\f\n\u000f~\u0011\f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(context, new String(iArr, 0, i2));
        int iXd = C1633zX.Xd() ^ (-1951495776);
        int iXd2 = ZN.Xd() ^ 864700439;
        short sXd3 = (short) (C1607wl.Xd() ^ iXd);
        short sXd4 = (short) (C1607wl.Xd() ^ iXd2);
        int[] iArr2 = new int["5'40.,0!".length()];
        QB qb2 = new QB("5'40.,0!");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
            i3++;
        }
        Intrinsics.checkParameterIsNotNull(function1, new String(iArr2, 0, i3));
        boolean instanceBioValidationManager = InstanceBioValidationManager.INSTANCE.getInstance();
        Object objFromJson = new Gson().fromJson(new SecurePreferencesHelper(context).getDataSafely(), (Type) Map.class);
        Intrinsics.checkExpressionValueIsNotNull(objFromJson, C1561oA.ud("T\u007fzx115lwspLtom:J]k6Lli_ᒲ \u0013?fdPPYQ8KY\"!IQEVU\u000fJ@T>\u0005", (short) (C1499aX.Xd() ^ (2073729600 ^ (-2073753104)))));
        Map<String, ? extends Object> map = (Map) objFromJson;
        if (instanceBioValidationManager) {
            InstanceBioValidationManager.INSTANCE.getIMethodsBioValidation().getDataSafely(map);
            function1.invoke(map);
        }
    }

    public final void instanceOfBiometricAuthManager(IBioValidationManager iBioValidationManager, CommunicationManager communicationManager, final Context context) throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (252567543 ^ (-252573718)));
        int[] iArr = new int["NT[MSHDGB+".length()];
        QB qb = new QB("NT[MSHDGB+");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(iBioValidationManager, new String(iArr, 0, i2));
        Intrinsics.checkParameterIsNotNull(communicationManager, C1561oA.Yd("-:9:C=943G=DD FLN<J@C", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (-1134234540)))));
        short sXd2 = (short) (ZN.Xd() ^ ((215988210 ^ 1141463662) ^ 1222036131));
        short sXd3 = (short) (ZN.Xd() ^ (911500244 ^ 911490721));
        int[] iArr2 = new int["\u0019&&-\u001f30".length()];
        QB qb2 = new QB("\u0019&&-\u001f30");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
            i3++;
        }
        Intrinsics.checkParameterIsNotNull(context, new String(iArr2, 0, i3));
        InstanceBioValidationManager.INSTANCE.createInstance(iBioValidationManager);
        DeriveManagerImp deriveManagerImp = new DeriveManagerImp(context, communicationManager);
        this.deriveManagerImp = deriveManagerImp;
        deriveManagerImp.generateDeriveKey();
        if (validateVersionSO()) {
            return;
        }
        getBiometricHardwareTypes(context, new Function1<ArrayList<Integer>, Unit>() { // from class: com.valid.vssh_bio_validation_library.manager.BioValidateManagerImpl.instanceOfBiometricAuthManager.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ArrayList<Integer> arrayList) throws Throwable {
                invoke2(arrayList);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ArrayList<Integer> arrayList) throws Throwable {
                short sXd4 = (short) (Od.Xd() ^ (1309247652 ^ (-1309254456)));
                int[] iArr3 = new int["$i".length()];
                QB qb3 = new QB("$i");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd4 + i4)));
                    i4++;
                }
                Intrinsics.checkParameterIsNotNull(arrayList, new String(iArr3, 0, i4));
                InstanceBioValidationManager.INSTANCE.startFingerPrint(context);
            }
        });
    }

    public final void setDatSafely(Context context, Map<String, ? extends Object> map, final Function1<? super Boolean, Unit> function1) throws Throwable {
        Intrinsics.checkParameterIsNotNull(context, Jg.Wd("\u0015y\"\u00046lC", (short) (Od.Xd() ^ ((107165699 ^ 1602674132) ^ (-1508228146))), (short) (Od.Xd() ^ ((248065326 ^ 1756547385) ^ (-1719375305)))));
        short sXd = (short) (C1580rY.Xd() ^ (2090726268 ^ (-2090710570)));
        short sXd2 = (short) (C1580rY.Xd() ^ ((1875898776 ^ 9429262) ^ (-1866477489)));
        int[] iArr = new int["\\\u0017\f\u0012v".length()];
        QB qb = new QB("\\\u0017\f\u0012v");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(map, new String(iArr, 0, i2));
        Intrinsics.checkParameterIsNotNull(function1, C1626yg.Ud("u\u001bLw>\u001c\u0004/", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (391182400 ^ (-1422635573)))), (short) (ZN.Xd() ^ (ZN.Xd() ^ (1445277495 ^ 1705968889)))));
        try {
            boolean instanceBioValidationManager = InstanceBioValidationManager.INSTANCE.getInstance();
            MasterKeyHelper masterKeyHelper = MasterKeyHelper.INSTANCE;
            DeriveManagerImp deriveManagerImp = this.deriveManagerImp;
            if (deriveManagerImp == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Ig.wd("+^\u001c5o!vQ/0:X:\u0001;Z", (short) (C1607wl.Xd() ^ ((1394440180 ^ 1194398693) ^ 338455771))));
            }
            masterKeyHelper.generateMasterKey(context, deriveManagerImp.getDeriveKeyResult());
            String string = new Gson().toJson(map).toString();
            if (instanceBioValidationManager) {
                new SecurePreferencesHelper(context).setDatSafely(string, new Function1<Boolean, Unit>() { // from class: com.valid.vssh_bio_validation_library.manager.BioValidateManagerImpl.setDatSafely.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z2) {
                        BioValidateManagerImpl.this.setDataSafelyResponse(z2, function1);
                    }
                });
            }
        } catch (NullPointerException unused) {
            setDataSafelyResponse(false, function1);
        } catch (UninitializedPropertyAccessException unused2) {
            setDataSafelyResponse(false, function1);
        }
    }

    public final void showBiometricPromp(Context context, FragmentActivity fragmentActivity, boolean z2, Function1<Object, Unit> function1, Function1<? super BioValidationError, Unit> function12, Function1<? super BioValidationFailed, Unit> function13, DialogBuilderModel dialogBuilderModel) throws Throwable {
        Intrinsics.checkParameterIsNotNull(context, EO.Od("4\u0010^BU&4", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (-1609522342)))));
        short sXd = (short) (C1499aX.Xd() ^ ((515302512 ^ 1007777956) ^ (-581428210)));
        int[] iArr = new int["2=+05,49\u0005&6*6(26".length()];
        QB qb = new QB("2=+05,49\u0005&6*6(26");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(fragmentActivity, new String(iArr, 0, i2));
        Intrinsics.checkParameterIsNotNull(function1, C1593ug.zd("ttZ}lmp\u007f\u0001O\u0005\u0005y", (short) (FB.Xd() ^ ((1351799397 ^ 1798502662) ^ 1000352479)), (short) (FB.Xd() ^ ((162602019 ^ 1794399819) ^ 1665476315))));
        Intrinsics.checkParameterIsNotNull(function12, C1561oA.od("ki?kjfh6igZ", (short) (C1607wl.Xd() ^ (1895494600 ^ 1895470979))));
        short sXd2 = (short) (FB.Xd() ^ (C1607wl.Xd() ^ (1587889174 ^ 820061710)));
        int[] iArr2 = new int["NN'CLPJJ(]]R".length()];
        QB qb2 = new QB("NN'CLPJJ(]]R");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
            i3++;
        }
        Intrinsics.checkParameterIsNotNull(function13, new String(iArr2, 0, i3));
        Intrinsics.checkParameterIsNotNull(dialogBuilderModel, Wg.Zd("*\\dl\u007f\u0005\u0010cHU\u0003<]A[i\u001f.", (short) (Od.Xd() ^ (FB.Xd() ^ (857970753 ^ (-1825364980)))), (short) (Od.Xd() ^ (FB.Xd() ^ (1213975388 ^ (-397707492))))));
        if (z2) {
            MasterKeyHelper.INSTANCE.generateMasterKey(context, C1561oA.Xd(":4G=!<Q", (short) (C1499aX.Xd() ^ ((1657928705 ^ 1126528429) ^ (-569672901)))));
        }
        this.onErrorAuthBiometric = function12;
        if (validateVersionSO()) {
            this.biometricPrompt = createBiometricPrompt(context, fragmentActivity, function1, function12, function13);
            this.promptInfo = createPromptInfo(dialogBuilderModel.getTitle(), dialogBuilderModel.getSubTitle(), dialogBuilderModel.getDescription());
        } else {
            createFingerPrintPopUp(dialogBuilderModel.getTitle(), dialogBuilderModel.getSubTitle(), dialogBuilderModel.getDescription(), fragmentActivity);
            this.fingerPrintCallback = createFingerprintManagerCallback(context, function1, function12, function13);
            Wg.vd("xlv}KqzwbpqgdPuq\u0003\u0005", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207804542))));
            Qg.kd("CKPMIxHFHtBH7G?", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (1325593621 ^ (-2123099639)))), (short) (FB.Xd() ^ (1608411218 ^ 1608393289)));
        }
        setupBiometricAuth(context);
    }

    public final void validateExistSecureData(Context context, final Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, hg.Vd(",75:*<7", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (778818265 ^ (-534955167)))), (short) (OY.Xd() ^ (ZN.Xd() ^ (1052647529 ^ 221521916)))));
        short sXd = (short) (C1607wl.Xd() ^ (457882164 ^ 457889420));
        int[] iArr = new int["\u0010\u0002\u000f\u000b\t\u0007\u000b{".length()];
        QB qb = new QB("\u0010\u0002\u000f\u000b\t\u0007\u000b{");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(function1, new String(iArr, 0, i2));
        if (InstanceBioValidationManager.INSTANCE.getInstance()) {
            new SecurePreferencesHelper(context).validateExistSecureData(new Function1<Boolean, Unit>() { // from class: com.valid.vssh_bio_validation_library.manager.BioValidateManagerImpl.validateExistSecureData.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    InstanceBioValidationManager.INSTANCE.getIMethodsBioValidation().validateExistSecureData(z2);
                    function1.invoke(Boolean.valueOf(z2));
                }
            });
        }
    }

    public final void validateHardwareBiometric(Context context, final EnumAction enumAction, final Function1<? super ManagerResponse, Unit> function1) throws Throwable {
        Intrinsics.checkParameterIsNotNull(context, C1561oA.yd("ERNUCWP", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (1522009068 ^ (-421742978))))));
        Intrinsics.checkParameterIsNotNull(enumAction, C1561oA.Yd("PSe[bbIog]", (short) (ZN.Xd() ^ (FB.Xd() ^ (1986047652 ^ 697287856)))));
        int iXd = C1607wl.Xd() ^ (-1849956476);
        Intrinsics.checkParameterIsNotNull(function1, Xg.qd("RFUSSSYL", (short) (C1580rY.Xd() ^ ((274398196 ^ 96723473) ^ (-362379037))), (short) (C1580rY.Xd() ^ iXd)));
        if (validateVersionSO()) {
            new ValidateBiometric().validateHardwareBiometric(this.bioValidationAuthRepository, context, new Function1<ValidateHardwareModel, Unit>() { // from class: com.valid.vssh_bio_validation_library.manager.BioValidateManagerImpl.validateHardwareBiometric.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ValidateHardwareModel validateHardwareModel) {
                    invoke2(validateHardwareModel);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ValidateHardwareModel validateHardwareModel) {
                    Intrinsics.checkParameterIsNotNull(validateHardwareModel, EO.Od("+~", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (-831091332)))));
                    int i2 = WhenMappings.$EnumSwitchMapping$0[enumAction.ordinal()];
                    if (i2 == 1 || i2 == (C1607wl.Xd() ^ (441921895 ^ 1947411135)) || i2 == (C1580rY.Xd() ^ (1698394753 ^ (-1420977821))) || i2 == ((1558638289 ^ 1782499133) ^ 920136168) || i2 == (OY.Xd() ^ (2004456512 ^ 1934793901))) {
                        InstanceBioValidationManager.INSTANCE.getIMethodsBioValidation().validateHardwareBiometric(validateHardwareModel.getResult(), enumAction, validateHardwareModel.getStatusCode(), validateHardwareModel.getMessage());
                        function1.invoke(new ManagerResponse(validateHardwareModel.getResult(), enumAction, validateHardwareModel.getStatusCode(), validateHardwareModel.getMessage()));
                    }
                }
            });
            return;
        }
        String.valueOf(InstanceBioValidationManager.INSTANCE.getFingerprintManager().hasEnrolledFingerprints());
        Jg.Wd("zP\u0012:5\u0005Uggy*&^)ih\rM!", (short) (Od.Xd() ^ (FB.Xd() ^ (673577567 ^ (-2009789543)))), (short) (Od.Xd() ^ (FB.Xd() ^ (-1609530031))));
        notifyStatusHardwareDetected(context, enumAction, function1, InstanceBioValidationManager.INSTANCE.getFingerprintManager().isHardwareDetected(), InstanceBioValidationManager.INSTANCE.getFingerprintManager().hasEnrolledFingerprints());
    }
}
