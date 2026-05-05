package com.davivienda.daviviendaapp.bridges.biovalidation;

import android.app.Activity;
import androidx.biometric.BiometricManager;
import androidx.fragment.app.FragmentActivity;
import com.davivienda.daviviendaapp.common.helper.CoreHelper;
import com.davivienda.daviviendaapp.common.helper.Utils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.valid.communication.managers.communicationmanager.CommunicationManager;
import com.valid.vssh_android_core.VsshCoreManagerImp;
import com.valid.vssh_bio_validation_library.executors.BioValidationError;
import com.valid.vssh_bio_validation_library.executors.BioValidationFailed;
import com.valid.vssh_bio_validation_library.manager.BioValidateManagerImpl;
import com.valid.vssh_bio_validation_library.manager.IBioValidationManager;
import com.valid.vssh_bio_validation_library.manager.ManagerResponse;
import com.valid.vssh_bio_validation_library.model.DialogBuilderModel;
import com.valid.vssh_bio_validation_library.repository.BioValidationAuthRepository;
import com.valid.vssh_bio_validation_library.utils.EnumBioAuthenticationResult;
import com.valid.vssh_bio_validation_library.utils.model.EnumAction;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.`\\2\u000fq~<$q$yّCU(}*\tUNog\u0005Jb\u000bI\u0010\u000e\u0016\u0007v4I[|e\u0012%2JoM9UoS9ht<\u0006(288\u0002\u0005\u0007\u001a2H&v\u0003CQ\u000f(ؓpphQMX\u0015\u001e \u0006V /\u001f֔kNDJ5cH>;\u0003\u0018R\u0015,(>\u000b^%F\u00037=zo0C@eH[*\u001c\t\u0015fs?1G8=M\u00075<CI\"gf\\\u000e*-+}$\u000ev4t\u001dQ\u000f#W/]ucP<;>\u007fD\u0013J\u001d&\u0006U_tAbt\u0016(Kt!cpT\u0010pZ\u007f)t|\u0017m\u000eAFQ\u001b\u0015a\u0012?'`O{3 d#I\u0015/wl\u000e\u000f%Kh\u0006nIaP?XN8xk\flvr\u0004:\u0004^f^O,\u0015<)=7\nLi!4\bVe\u007fv3p/S2xVb:nDGZ\r\u001a}\\d3\u0010\u0001XfB)MJk7\u0002\u0016+8\\&SQ)\u001e`gh\u0018}\u0014bRW=\fOY\u001d{>[GtK5\u007fz@e`\u000f,?jy5hthk\u0018j^8\"`gz\u0012\b{r^::bC\u007fDL,_!#\u0015\u0011\u0011,kY|7o\u000bl\u001e\u0011l3R\u00160)=\u0017\u000fztp\u001ew)M:\u000fx\"[T\u0018:a4cM\u00014+37\u0003\u0002\u0012_gzZ\u0013qf\u0002c~8\u0016H=(Ȁ?т\u0013~1ɅR9SQ\u000be\u007fSh\u0600'܃}\u000fCÜ~\u007f\u0016q\t,\u000fr!֩`Ђ&\u0003fа;\nj\t\bkf|Mnb\u0017,JW\u007f\u001bYj\\\u000fً\u0011ȷ\"%\tǻr\tC-['K\u0017NҤ1ֵe]q۰Ь}\u000f"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wJGE|0%\u0019g]H\u000bm5\u0018S+Q=J3`QnL\u0018\u001ccuJ4\t\u0007YNy", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\ 7y4\u0003\u0011y]!\u0011b<Uv|", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "0h^#T3BR\u0015\u000ezF(\u0006\u00051e\r", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017K7t0 \u0015u+\u0016\u000bm\u001dJ}+FH],DN{9\u0016\u0012gqV6\u0014Z", "1na2@(GO\u001b~\b", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)a\t'\tJ\u0005\u0016\u0011Ey\u001b<@\u0016Cg\u0001}Az\u0016\u0016IL7m4+xpl\u000f", "6`b\u000f\\6FS(\f\u000f", "", "5dc\u0015T:\u001bW#\u0007zm9\u0011", "u(I", "Adc\u0015T:\u001bW#\u0007zm9\u0011", "uY\u0018#", "7mXA\\(EW.~y;0\u0007\u0011/t\r,y(| \u0013Io\u001b", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017K7t0 \u0015u+\u001dcg6?r.KKJ;`\\{%\u0010\u001bV\u0010N8b", "1qT.g,\"\\'\u000evg*|e3o\b(\u000bM\u0005\u0015~Cx\n>v2", "", "2d[2g,\u001dO(zhZ-|\u0010C", "1`[9U(<Y", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar,<Vy\u001e=C", "5dc\u000f\\6FS(\f~\\\u001a\f\u0005>u\u000e", "5dc\u0011T;:A\u0015\u007fze@", "Bhc9X", "", "2db0e0Ib\u001d\t\u0004", "5dc\u001bT4>", "6`]1_,\u001e`&\t\bB5m\u00056i~$\u000b@", "6`]1_,\u001e`&\t\bB5m\u00056i~$\u000b@r\u001b&Jy\u001eK_5<`", "6`]1_,,c\u0017|zl:`\u0012 a\u0007,z<\u0010\u0017", "@db=b5LS", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "7mXA66KS", "Adc\u0011T;:A\u0015\u007fze@", ";CPAT", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "Ag^DC6IC$", "/tc5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7rB2g\u000b:b\u0015lv_,\u0004\u001d", "D`[6W(MSt\u000f\na\t\u0001\u00137e\u000f5\u007f>]+uG\u0001\u0012:v", "D`[6W(MSx\u0012~l;j\t-u\r(Z<\u0010\u0013", "D`[6W(MS{z\b]>x\u0016/B\u00042\u0004@\u0010$\u001bE", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class BioValidationManager extends ReactContextBaseJavaModule {
    private final BioValidateManagerImpl bioValidateManager;
    private VsshCoreManagerImp coreManager;
    private boolean hasBiometry;
    private IBioValidationManager initializedBiometricManager;
    private final ReactApplicationContext reactContext;

    /* JADX INFO: renamed from: $r8$lambda$pODSXz9k57eFDwg3gMm7P3V-Fpk, reason: not valid java name */
    public static /* synthetic */ void m7086$r8$lambda$pODSXz9k57eFDwg3gMm7P3VFpk(BioValidationManager bioValidationManager, boolean z2, String str, String str2, Function1 function1) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.od("^if&[Wk]i[V^SO\u001bPL`R^PKSHDCQP\r@OE?A>K\u00058>CI3=93/A5:8v\n05\u001b%/+%!3',*\b\u001b'\u0019\u001e\u001b'", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207814501)))));
        Class<?>[] clsArr = new Class[(1306829797 ^ 868625878) ^ 2116193846];
        clsArr[0] = Class.forName(C1561oA.Kd("BON\u0010GE[O]QNXOM\u001bRPfZh\\YcZXYij)^ogcgfu1fnu}iusom\u0002w~~?T|\u0004kw\u0004\u0002}{\u0010\u0006\r\rl\u0002\u0010\u0004\u000b\n\u0018", (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951472537))));
        clsArr[1] = Boolean.TYPE;
        int iXd = ZN.Xd() ^ (1427000240 ^ 1719956802);
        int iXd2 = OY.Xd() ^ (1095227345 ^ 1164756622);
        clsArr[iXd] = Class.forName(Wg.Zd("5\f i.[?<,QuvkQF.", (short) (FB.Xd() ^ ((1420466868 ^ 443950480) ^ 1323093486)), (short) (FB.Xd() ^ iXd2)));
        int iXd3 = Od.Xd() ^ (1177269656 ^ 30810574);
        short sXd = (short) (OY.Xd() ^ (C1580rY.Xd() ^ (780175243 ^ (-520720217))));
        int[] iArr = new int["80F2\u007f?5C=\u0005+MLDJD".length()];
        QB qb = new QB("80F2\u007f?5C=\u0005+MLDJD");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        clsArr[iXd3] = Class.forName(new String(iArr, 0, i2));
        clsArr[(1631085958 ^ 1448564563) ^ 930034385] = Class.forName(Wg.vd("MPTKGK\nE`V\u0016M[SGW;@>B{\u0013A9=MAFD\u0006", (short) (Od.Xd() ^ ((380061295 ^ 1043496868) ^ (-680872074)))));
        Object[] objArr = new Object[C1633zX.Xd() ^ (-1951491122)];
        objArr[0] = bioValidationManager;
        objArr[1] = Boolean.valueOf(z2);
        objArr[ZN.Xd() ^ 864698098] = str;
        objArr[739852580 ^ 739852583] = str2;
        objArr[(1239636223 ^ 1509004597) ^ 269667790] = function1;
        Method declaredMethod = cls.getDeclaredMethod(Qg.kd("vjpwOmmQk\u001eeYdXYU\u0017\"", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (1813638051 ^ (-1569767503)))), (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (903724841 ^ (-1099737218))))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public BioValidationManager(ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, hg.Vd("\r~yz\u000bX\u0004\u0002\u0007v\t\u0004", (short) (Od.Xd() ^ (Od.Xd() ^ (-1207815458))), (short) (Od.Xd() ^ (C1499aX.Xd() ^ 1134263049))));
        this.reactContext = reactApplicationContext;
        this.bioValidateManager = new BioValidateManagerImpl(new BioValidationAuthRepository());
        this.initializedBiometricManager = new IBioValidationManager() { // from class: com.davivienda.daviviendaapp.bridges.biovalidation.BioValidationManager$initializedBiometricManager$1
            @Override // com.valid.vssh_bio_validation_library.manager.IBioValidationManager
            public void deleteDataSafely(boolean z2) {
            }

            @Override // com.valid.vssh_bio_validation_library.manager.IBioValidationManager
            public void generateDeriveKey(int i2, String str) {
                short sXd = (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609512707)));
                int[] iArr = new int["qhutafc".length()];
                QB qb = new QB("qhutafc");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(sXd + sXd + i3 + xuXd.CK(iKK));
                    i3++;
                }
                Intrinsics.checkNotNullParameter(str, new String(iArr, 0, i3));
            }

            @Override // com.valid.vssh_bio_validation_library.manager.IBioValidationManager
            public void getBiometricHardwareTypes(ArrayList<Integer> arrayList) {
                Intrinsics.checkNotNullParameter(arrayList, C1561oA.Kd("ACH>EEK", (short) (FB.Xd() ^ (Od.Xd() ^ 1207817086))));
            }

            @Override // com.valid.vssh_bio_validation_library.manager.IBioValidationManager
            public void getDataSafely(Map<String, ? extends Object> map) {
                Intrinsics.checkNotNullParameter(map, Wg.Zd("CeM;", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207822987))), (short) (C1633zX.Xd() ^ ((1057187932 ^ 42173984) ^ (-1031844882)))));
            }

            @Override // com.valid.vssh_bio_validation_library.manager.IBioValidationManager
            public void setDataSafely(boolean z2) {
            }

            @Override // com.valid.vssh_bio_validation_library.manager.IBioValidationManager
            public void validateExistSecureData(boolean z2) {
            }

            @Override // com.valid.vssh_bio_validation_library.manager.IBioValidationManager
            public void validateHardwareBiometric(EnumBioAuthenticationResult enumBioAuthenticationResult, EnumAction enumAction, int i2, String str) {
                short sXd = (short) (C1499aX.Xd() ^ (FB.Xd() ^ (971059648 ^ (-1712196281))));
                int[] iArr = new int["%/70\u00179';-".length()];
                QB qb = new QB("%/70\u00179';-");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
                    i3++;
                }
                Intrinsics.checkNotNullParameter(enumBioAuthenticationResult, new String(iArr, 0, i3));
                Intrinsics.checkNotNullParameter(enumAction, Wg.vd("47I?>>", (short) (OY.Xd() ^ (1115832930 ^ 1115832009))));
                int iXd = C1499aX.Xd() ^ 1134237196;
                Intrinsics.checkNotNullParameter(str, Qg.kd("\r\u0004\u0011\u0010|\u0002~", (short) (C1499aX.Xd() ^ ((1366519666 ^ 66394005) ^ (-1384534029))), (short) (C1499aX.Xd() ^ iXd)));
            }
        };
    }

    public static final /* synthetic */ void access$handleErrorInValidate(BioValidationManager bioValidationManager, Callback callback) throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (157416911 ^ (-988537134))));
        int[] iArr = new int["0;8w-)=/;-(0%!l\"\u001e2$0\"\u001d%\u001a\u0016\u0015#\"^\u0012!\u0017\u0011\u0013\u0010\u001dV\n\u0010\u0015\u001b\u0005\u000f\u000b\u0005\u0001\u0013\u0007\f\nH[\u0002\u0007lv\u0001|vr\u0005x}{Ylxjolx".length()];
        QB qb = new QB("0;8w-)=/;-(0%!l\"\u001e2$0\"\u001d%\u001a\u0016\u0015#\"^\u0012!\u0017\u0011\u0013\u0010\u001dV\n\u0010\u0015\u001b\u0005\u000f\u000b\u0005\u0001\u0013\u0007\f\nH[\u0002\u0007lv\u0001|vr\u0005x}{Ylxjolx");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {callback};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Yd("\u001a\u0014\"\u0019\"\u001c|+,*.\u0006,\u0015!-+'%9+", (short) (OY.Xd() ^ ((466027049 ^ 426071513) ^ 44203321))), Class.forName(C1561oA.yd("x\u0004\u0001@wqrso{zu7zlg\t\u0019Q\u0005\u0014\n\u0004\u0006\u0003J^{\u0006\u0005ywX_", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (1393705775 ^ (-1654352494)))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(bioValidationManager, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final /* synthetic */ void access$handleSuccessInValidate(BioValidationManager bioValidationManager, ArrayList arrayList, Callback callback) throws Throwable {
        Class<?> cls = Class.forName(Xg.qd("\u001f,+l$\"8,:.+5,*w/-C7E96@756FG\u0006;LD@DCR\u000eCKRZFRPLJ^T[[\u001c1Y`HT`^ZXlbiiI^l`gft", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951480422))), (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (221706079 ^ (-1019212287))))));
        Class<?>[] clsArr = new Class[227937162 ^ 227937160];
        clsArr[0] = Class.forName(Jg.Wd("9_\\OD\u001b\u0003~*[vOT2SMrl\u0016", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ (2031515580 ^ 391269306))), (short) (ZN.Xd() ^ (2083474159 ^ 2083472392))));
        clsArr[1] = Class.forName(ZO.xd("\u001b\u001b{\u001bub-;56iIw\u000elo\\t\u000bjr\u0003\u0005$BOg\u0019<O-\u0012,X", (short) (ZN.Xd() ^ (Od.Xd() ^ (1349725629 ^ 395239325))), (short) (ZN.Xd() ^ ((663846077 ^ 540842727) ^ 128831623))));
        Object[] objArr = new Object[263319747 ^ 263319745];
        objArr[0] = arrayList;
        objArr[1] = callback;
        int iXd = C1499aX.Xd() ^ (-1134243439);
        Method declaredMethod = cls.getDeclaredMethod(C1626yg.Ud("E\u0011d063>JRV.L\\or{LlO8^W\u001e", (short) (C1607wl.Xd() ^ ((477849849 ^ 606050353) ^ 946119391)), (short) (C1607wl.Xd() ^ iXd)), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(bioValidationManager, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final boolean getBiometricStatus() {
        BiometricManager biometricManagerFrom = BiometricManager.from(this.reactContext);
        short sXd = (short) (C1607wl.Xd() ^ (OY.Xd() ^ (765537437 ^ 696928992)));
        int[] iArr = new int["2w%<\u0015fT\u0012j".length()];
        QB qb = new QB("2w%<\u0015fT\u0012j");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Intrinsics.checkNotNullExpressionValue(biometricManagerFrom, new String(iArr, 0, i2));
        int iCanAuthenticate = biometricManagerFrom.canAuthenticate((1059977455 ^ 436002746) ^ 651241306);
        if (iCanAuthenticate != 0) {
            return (iCanAuthenticate == 1 || iCanAuthenticate == (Od.Xd() ^ (1510304967 ^ 502855833)) || iCanAuthenticate == ((1624092991 ^ 825510117) ^ 1375336918)) ? false : true;
        }
        return true;
    }

    private final void handleErrorInValidate(Callback callback) {
        callback.invoke(null, new WritableNativeArray());
    }

    private final void handleErrorInValidateWithoutNull(Callback callback) {
        callback.invoke(new WritableNativeArray());
    }

    private final void handleSuccessInValidate(ArrayList<Integer> arrayList, Callback callback) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Integer num : arrayList) {
            Intrinsics.checkNotNull(num);
            writableNativeArray.pushInt(num.intValue());
        }
        callback.invoke(null, writableNativeArray);
    }

    private final void initCore() throws Throwable {
        CoreHelper coreHelper = CoreHelper.INSTANCE;
        int iXd = C1607wl.Xd() ^ 1849974626;
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("\u001fcOlj,qdH{y`!\u0014t\u0006/Ny\u0013<\\K=!\tv#R6r\u000b#?\t\u0013k\t\u0015\u0007{!/6A\\r&Ux\u001dN;", (short) (C1607wl.Xd() ^ iXd))).getMethod(C1561oA.Qd("WTb6Z^^JVJK(SUG.AM?DAM", (short) (Od.Xd() ^ (333503760 ^ (-333487551)))), new Class[0]);
        try {
            method.setAccessible(true);
            this.coreManager = (VsshCoreManagerImp) method.invoke(coreHelper, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final void showPopUp(final String str, final String str2, final Function1<? super Integer, Unit> function1, final boolean z2) {
        try {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.davivienda.daviviendaapp.bridges.biovalidation.BioValidationManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    BioValidationManager.m7086$r8$lambda$pODSXz9k57eFDwg3gMm7P3VFpk(this.f$0, z2, str, str2, function1);
                }
            });
        } catch (IllegalStateException unused) {
        }
    }

    private static final void showPopUp$lambda$0(BioValidationManager bioValidationManager, boolean z2, String str, String str2, final Function1 function1) throws Throwable {
        Intrinsics.checkNotNullParameter(bioValidationManager, C1593ug.zd("ujlw)6", (short) (FB.Xd() ^ (1117898465 ^ 1117889742)), (short) (FB.Xd() ^ ((1060280341 ^ 1759383366) ^ 1475139944))));
        Intrinsics.checkNotNullParameter(str, C1561oA.od("6\u0006y\u0004zr", (short) (C1633zX.Xd() ^ (1226725372 ^ (-1226731559)))));
        short sXd = (short) (FB.Xd() ^ (C1499aX.Xd() ^ (638805536 ^ (-1703444347))));
        int[] iArr = new int["^ \"1\"2*27-44".length()];
        QB qb = new QB("^ \"1\"2*27-44");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str2, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(function1, Wg.Zd("]\u0017\u001d\bi", (short) (Od.Xd() ^ (ZN.Xd() ^ (724610921 ^ (-414882738)))), (short) (Od.Xd() ^ (1610799838 ^ (-1610781880)))));
        BioValidateManagerImpl bioValidateManagerImpl = bioValidationManager.bioValidateManager;
        ReactApplicationContext reactApplicationContext = bioValidationManager.reactContext;
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity, C1561oA.Xd("\b\u0010\b\t=\u0002\u0001\u000f\u0010\u0012\u0018D\b\fG\f\u000b\u001e L\"\u001eO\u001f!!`#+#$X.4,\"] .%42-)>t.;+292<C}2BC\u0002\u001bH8?F?IP\u001eASIWKW]", (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849950835))));
        bioValidateManagerImpl.showBiometricPromp(reactApplicationContext, (FragmentActivity) currentActivity, z2, new Function1<Object, Unit>() { // from class: com.davivienda.daviviendaapp.bridges.biovalidation.BioValidationManager$showPopUp$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) throws Throwable {
                Class<?> cls = Class.forName(Xg.qd("lyx:qo\u0006y\b{x\u0003ywE|z\u0011\u0005\u0013\u0007\u0004\u000e\u0005\u0003\u0004\u0014\u0015S\t\u001a\u0012\u000e\u0012\u0011 [\u0011\u0019 (\u0014 \u001e\u001a\u0018,\"))i~'.\u0016\".,(&:077\u0017,:.54BtE;CL&FH.J~\r\u0001\u000f", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207811882))), (short) (C1633zX.Xd() ^ ((586271977 ^ 678525942) ^ (-176201583)))));
                Class<?>[] clsArr = new Class[1];
                int iXd = C1499aX.Xd() ^ (-1134248491);
                short sXd2 = (short) (OY.Xd() ^ ((2074759697 ^ 314226785) ^ 1762697752));
                short sXd3 = (short) (OY.Xd() ^ iXd);
                int[] iArr2 = new int["l\u000fOkeOq*PH\u0015S\u000b1`\u001f".length()];
                QB qb2 = new QB("l\u000fOkeOq*PH\u0015S\u000b1`\u001f");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                Object[] objArr = {obj};
                Method method = cls.getMethod(ZO.xd("nekl\u0015&", (short) (FB.Xd() ^ (ZN.Xd() ^ 864688814)), (short) (FB.Xd() ^ (807890301 ^ 807882929))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(this, objArr);
                    return Unit.INSTANCE;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                Intrinsics.checkNotNullParameter(obj, C1626yg.Ud("BY", (short) (FB.Xd() ^ (2012363300 ^ 2012366116)), (short) (FB.Xd() ^ ((1630819245 ^ 1804548471) ^ 180052127))));
                function1.invoke(1);
            }
        }, new Function1<BioValidationError, Unit>() { // from class: com.davivienda.daviviendaapp.bridges.biovalidation.BioValidationManager$showPopUp$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BioValidationError bioValidationError) throws Throwable {
                Object[] objArr = {bioValidationError};
                Method method = Class.forName(Ig.wd("a\u0016R2 HI$n\r\u00136]XE\u0015=`\u001b P SMW{({O1m}\u00199\u0006Mm\u0006\b\u001c'i.1IR!^6\u0015;\u001bf{<\u0013\u001c~OFU0yj!-^{.&[/\u001f>m\u0006\u0001D[`aYv\f\u001d", (short) (Od.Xd() ^ (1720249017 ^ (-1720229550))))).getMethod(C1561oA.Qd(">BIA<5", (short) (C1633zX.Xd() ^ ((584457800 ^ 1224624414) ^ (-1781039020)))), Class.forName(EO.Od("\u0004H(H\u00188W\f*g&\t8/F/k\u0004\u000b*X/B9I\u0019/\u0003\f.Os\r> v\u0019i&K4Y\u0013,h\u007fex\u001ba?z\"=\u0001PO<{\b\u000b<F4y\u0005", (short) (OY.Xd() ^ (2106189713 ^ 2106178750)))));
                try {
                    method.setAccessible(true);
                    method.invoke(this, objArr);
                    return Unit.INSTANCE;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BioValidationError bioValidationError) {
                Intrinsics.checkNotNullParameter(bioValidationError, C1593ug.zd("P\\", (short) (C1607wl.Xd() ^ (684346791 ^ 684343885)), (short) (C1607wl.Xd() ^ ((1646954933 ^ 702405255) ^ 1274478865))));
                function1.invoke(Integer.valueOf(bioValidationError.getErrorCode()));
            }
        }, new Function1<BioValidationFailed, Unit>() { // from class: com.davivienda.daviviendaapp.bridges.biovalidation.BioValidationManager$showPopUp$1$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BioValidationFailed bioValidationFailed) throws Throwable {
                Object[] objArr = {bioValidationFailed};
                Method method = Class.forName(C1561oA.od("z\u0006\u0003Bws\by\u0006wrzok7lh|nzlgod`_ml)\\ka[]Zg!TZ_eOYUOK]QVT\u0013&LQ7AKGA=OCHF$7C5:7CsB6<C\u001b99\u001d7iugu", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (-831065327))))).getMethod(Wg.Zd("\b\u001e;2CB", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849956308))), (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ 831084713))), Class.forName(C1561oA.Kd("z\b\u0007H\u0012}\n\b\u0004N\u0018\u0016\u0017\r\u0005\t\u0011\u0018\t!\r\u0019\u0017\u0013\u0011%\u001b\"\"\u0014\" \u001a+\u001b-5j#7%$77379t\n29!-9731E;BB\u001b7@D>>", (short) (C1580rY.Xd() ^ (287741060 ^ (-287749954))))));
                try {
                    method.setAccessible(true);
                    method.invoke(this, objArr);
                    return Unit.INSTANCE;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BioValidationFailed bioValidationFailed) {
                Intrinsics.checkNotNullParameter(bioValidationFailed, C1561oA.Xd("\r\u0019", (short) (FB.Xd() ^ (FB.Xd() ^ 1609499421))));
            }
        }, new DialogBuilderModel(str, str2, ""));
    }

    @ReactMethod
    public final void createInstanceBiometricManager() throws Throwable {
        boolean z2 = false;
        try {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(Wg.vd("JWV\u0018GE[OeYV`OM\u001bR8NBP<9C:@AQR\t>OGkon}1fnu\u0006q}{om\u0002wff'<\\cKWkiecoells\t\u0017\u000b\n\t\u0017", (short) (ZN.Xd() ^ (1731697654 ^ 1731695533)))).getDeclaredMethod(Qg.kd("KHV#INKBPMC<+K7IIF", (short) (C1499aX.Xd() ^ (1216972298 ^ (-1217002750))), (short) (C1499aX.Xd() ^ (412780787 ^ (-412779338)))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                if (((Boolean) declaredMethod.invoke(this, objArr)).booleanValue()) {
                    Object[] objArr2 = new Object[0];
                    Method declaredMethod2 = Class.forName(hg.Vd("8C@\u007f51E7C508-)t*&:,8*%-\"\u001e\u001d+*f\u001a)\u001f\u0019\u001b\u0018%^\u0012\u0018\u001d#\r\u0017\u0013\r\t\u001b\u000f\u0014\u0012Pc\n\u000ft~\t\u0005~z\r\u0001\u0006\u0004at\u0001rwt\u0001", (short) (C1499aX.Xd() ^ (178330796 ^ (-178337841))), (short) (C1499aX.Xd() ^ ((971801778 ^ 143220455) ^ (-828749499))))).getDeclaredMethod(C1561oA.ud("mqkuCnpb", (short) (Od.Xd() ^ (2110455725 ^ (-2110425544)))), new Class[0]);
                    try {
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(this, objArr2);
                        BioValidateManagerImpl bioValidateManagerImpl = this.bioValidateManager;
                        IBioValidationManager iBioValidationManager = this.initializedBiometricManager;
                        VsshCoreManagerImp vsshCoreManagerImp = this.coreManager;
                        if (vsshCoreManagerImp == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(C1561oA.yd("lwykReqcheq", (short) (C1633zX.Xd() ^ (307523273 ^ (-307525363)))));
                            vsshCoreManagerImp = null;
                        }
                        CommunicationManager communicationManager = vsshCoreManagerImp.getCommunicationManager();
                        Intrinsics.checkNotNullExpressionValue(communicationManager, C1561oA.Yd("_^n>kjktnjedxnuuUjxlsr\u00017>?@<", (short) (C1580rY.Xd() ^ (167252647 ^ (-167275972)))));
                        bioValidateManagerImpl.instanceOfBiometricAuthManager(iBioValidationManager, communicationManager, this.reactContext);
                        z2 = true;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (IllegalStateException unused) {
        }
        this.hasBiometry = z2;
    }

    @ReactMethod
    public final void deleteDataSafely(final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, Xg.qd("\r\f\u0018\u0019\u0010\u0010\u0013\u001c", (short) (C1607wl.Xd() ^ ((1793171916 ^ 724762041) ^ 1104360391)), (short) (C1607wl.Xd() ^ (395578366 ^ 395607115))));
        try {
            if (this.hasBiometry) {
                this.bioValidateManager.deleteDataSafely(this.reactContext, new Function1<Boolean, Unit>() { // from class: com.davivienda.daviviendaapp.bridges.biovalidation.BioValidationManager.deleteDataSafely.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) throws Throwable {
                        boolean zBooleanValue = bool.booleanValue();
                        Class<?> cls = Class.forName(C1561oA.ud("}\t\u0006Ezv\u000b|\tzu}rn:ok\u007fq}ojrgcbpo,_nd^`]j$W]bhR\\XRN`TYW\u0016)OT:DNJD@RFKI':F8=:Fv66<4B2\u0010,>*\u001b(,*0<eq", (short) (Od.Xd() ^ (Od.Xd() ^ (1451306331 ^ (-293395940))))));
                        Class<?>[] clsArr = {Boolean.TYPE};
                        Object[] objArr = {Boolean.valueOf(zBooleanValue)};
                        short sXd = (short) (OY.Xd() ^ (ZN.Xd() ^ 864695931));
                        int[] iArr = new int["MQXPSL".length()];
                        QB qb = new QB("MQXPSL");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                            i2++;
                        }
                        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                        try {
                            method.setAccessible(true);
                            method.invoke(this, objArr);
                            return Unit.INSTANCE;
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }

                    public final void invoke(boolean z2) {
                        callback.invoke(null, Boolean.valueOf(z2));
                    }
                });
            } else {
                callback.invoke(null, false);
            }
        } catch (IllegalStateException unused) {
            callback.invoke(null, false);
        }
    }

    @ReactMethod
    public final void getDataSafely(String str, String str2, final Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(str, Jg.Wd("^\b\u001f#g", (short) (C1499aX.Xd() ^ (313720083 ^ (-313710415))), (short) (C1499aX.Xd() ^ (739023855 ^ (-739018499)))));
        Intrinsics.checkNotNullParameter(str2, ZO.xd("t+5)$`\u0016vHE\u0007", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831085080))), (short) (C1607wl.Xd() ^ (FB.Xd() ^ (470577901 ^ 1138977683)))));
        Intrinsics.checkNotNullParameter(callback, C1626yg.Ud("B=Xjna9f", (short) (C1633zX.Xd() ^ ((215901452 ^ 1079290182) ^ (-1284155828))), (short) (C1633zX.Xd() ^ (887111740 ^ (-887099754)))));
        try {
            if (!this.hasBiometry) {
                callback.invoke(false);
                return;
            }
            Function1<Integer, Unit> function1 = new Function1<Integer, Unit>() { // from class: com.davivienda.daviviendaapp.bridges.biovalidation.BioValidationManager.getDataSafely.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws Throwable {
                    int iIntValue = num.intValue();
                    Class<?> cls = Class.forName(C1561oA.Qd("T_\\\u001cQMaS_QLTIE\u0011FBVHTFAI>:9GF\u00036E;574Az.49?)3/)%7+0.l\u007f&+\u0011\u001b%!\u001b\u0017)\u001d\" }\u0011\u001d\u000f\u0014\u0011\u001dM\u0010\r\u001bi\u0006\u0018\u0004t\u0002\u0006\u0004\n\u0016?K", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849979090)))));
                    Class<?>[] clsArr = {Integer.TYPE};
                    Object[] objArr = {Integer.valueOf(iIntValue)};
                    Method method = cls.getMethod(C1593ug.zd("\u000f\u0015\u001e\u0018\u0015\u0010", (short) (ZN.Xd() ^ ((1910471446 ^ 594036927) ^ 1387734680)), (short) (ZN.Xd() ^ (Od.Xd() ^ 1207816240))), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(this, objArr);
                        return Unit.INSTANCE;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }

                public final void invoke(int i2) {
                    if (i2 != 1) {
                        callback.invoke(Integer.valueOf(i2));
                        return;
                    }
                    BioValidateManagerImpl bioValidateManagerImpl = BioValidationManager.this.bioValidateManager;
                    ReactApplicationContext reactApplicationContext = BioValidationManager.this.reactContext;
                    final Callback callback2 = callback;
                    bioValidateManagerImpl.getDataSafely(reactApplicationContext, new Function1<Map<String, ? extends Object>, Unit>() { // from class: com.davivienda.daviviendaapp.bridges.biovalidation.BioValidationManager.getDataSafely.1.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map) throws Throwable {
                            Map<String, ? extends Object> map2 = map;
                            short sXd = (short) (ZN.Xd() ^ (892361961 ^ 892367544));
                            int[] iArr = new int["+87x0.D8F:7A86\u0004;9OCQEBLCABRS\u0012GXPLPO^\u001aOW^fR^\\XVj`gg(=elT`ljfdxnuuUjxlsr\u00013wv\u0007Wu\nwjy\u007f\u007f\b\u0016AOCQ".length()];
                            QB qb = new QB("+87x0.D8F:7A86\u0004;9OCQEBLCABRS\u0012GXPLPO^\u001aOW^fR^\\XVj`gg(=elT`ljfdxnuuUjxlsr\u00013wv\u0007Wu\nwjy\u007f\u007f\b\u0016AOCQ");
                            int i3 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
                                i3++;
                            }
                            Class<?> cls = Class.forName(new String(iArr, 0, i3));
                            Class<?>[] clsArr = {Class.forName(Xg.qd("\u000e\u0006\u001c\bU\u001e\u001e\u0014\u0018Zz\u0010 ", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207810206))), (short) (C1580rY.Xd() ^ ((1346461722 ^ 130796732) ^ (-1468708893)))))};
                            Object[] objArr = {map2};
                            short sXd2 = (short) (FB.Xd() ^ ((634547313 ^ 1058711552) ^ 449369186));
                            short sXd3 = (short) (FB.Xd() ^ ((1495205843 ^ 1997879459) ^ 772433672));
                            int[] iArr2 = new int["\nkPi>\u0019".length()];
                            QB qb2 = new QB("\nkPi>\u0019");
                            int i4 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((i4 * sXd3) ^ sXd2));
                                i4++;
                            }
                            Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
                            try {
                                method.setAccessible(true);
                                method.invoke(this, objArr);
                                return Unit.INSTANCE;
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Map<String, ? extends Object> map) throws Throwable {
                            Intrinsics.checkNotNullParameter(map, ZO.xd("~4w%", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (234816526 ^ (-1673210503)))), (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ 1951469381))));
                            Callback callback3 = callback2;
                            Utils utils = Utils.INSTANCE;
                            Class<?> cls = Class.forName(C1626yg.Ud("HY,JH\\s\u0004-qH+,tj3_\\z2hj+\u0014o\u0001N*\rqQ&3Y\tOyI{m~3&Ds)/\"", (short) (ZN.Xd() ^ (FB.Xd() ^ 1609530545)), (short) (ZN.Xd() ^ ((1648262691 ^ 336677580) ^ 1982800114))));
                            Class<?>[] clsArr = new Class[1];
                            short sXd = (short) (C1580rY.Xd() ^ ((1082540830 ^ 1772739053) ^ (-690991211)));
                            int[] iArr = new int["o8_nce<*Y?d\u0013n".length()];
                            QB qb = new QB("o8_nce<*Y?d\u0013n");
                            int i3 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
                                i3++;
                            }
                            clsArr[0] = Class.forName(new String(iArr, 0, i3));
                            Object[] objArr = {map};
                            Method method = cls.getMethod(EO.Od("{?\\M\u0016Y+\u001bYzk\b\u001dM>`\u0005XD:u=\u0016\u0017W", (short) (Od.Xd() ^ ((254088087 ^ 975152430) ^ (-893031116)))), clsArr);
                            try {
                                method.setAccessible(true);
                                callback3.invoke(null, (WritableMap) method.invoke(utils, objArr));
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        }
                    });
                }
            };
            short sXd = (short) (ZN.Xd() ^ (1059065708 ^ 1059061929));
            int[] iArr = new int["{;%P\u0005\\\b\u0011f, t\u001c%kAu\u0017/\u0017Cd\u000ey4Bp8\u0002e\f$Igk9\tci_l|Unp\u007f;\u0004Y2(o-htqx]\u0006\u0013\u0004\\:!E\u0004V\u0013tpO".length()];
            QB qb = new QB("{;%P\u0005\\\b\u0011f, t\u001c%kAu\u0017/\u0017Cd\u000ey4Bp8\u0002e\f$Igk9\tci_l|Unp\u007f;\u0004Y2(o-htqx]\u0006\u0013\u0004\\:!E\u0004V\u0013tpO");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[(895045655 ^ 793755935) ^ 437686540];
            clsArr[0] = Class.forName(EO.Od("#h\u000e\u00175 vnE_~\u0002K@Q,", (short) (FB.Xd() ^ (1789270775 ^ 1789290104))));
            short sXd2 = (short) (Od.Xd() ^ (1408018329 ^ (-1408028911)));
            int[] iArr2 = new int["%\u001b/\u0019d\"\u0016\"\u001a_\u0004$!\u0017\u001b\u0013".length()];
            QB qb2 = new QB("%\u001b/\u0019d\"\u0016\"\u001a_\u0004$!\u0017\u001b\u0013");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            clsArr[1] = Class.forName(new String(iArr2, 0, i3));
            clsArr[(723920112 ^ 456023981) ^ 805862239] = Class.forName(C1593ug.zd("\u000b\u0010\u0016\u000f\r\u0013S\u0011\u001e\u0016W\u0011!\u001b\u0011#\u0019  &az+%\u001b-#**m", (short) (Od.Xd() ^ ((1372738066 ^ 907603047) ^ (-1741341726))), (short) (Od.Xd() ^ (1560440289 ^ (-1560426004)))));
            clsArr[(161333957 ^ 958265472) ^ 813709894] = Boolean.TYPE;
            Object[] objArr = new Object[1579323501 ^ 1579323497];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[1205164601 ^ 1205164603] = function1;
            objArr[(1635870131 ^ 267217210) ^ 1852574858] = false;
            short sXd3 = (short) (C1499aX.Xd() ^ (580514689 ^ (-580500722)));
            int[] iArr3 = new int["\u000b~\u0005\fc\u0002\u0002e\u007f".length()];
            QB qb3 = new QB("\u000b~\u0005\fc\u0002\u0002e\u007f");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(sXd3 + sXd3 + i4 + xuXd3.CK(iKK3));
                i4++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IllegalStateException unused) {
            callback.invoke(false);
        }
    }

    public final boolean getHasBiometry() {
        return this.hasBiometry;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        short sXd = (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ 1134242187));
        int[] iArr = new int[";cjR^jhdbvlssShvjqp~N\\Sb`[W".length()];
        QB qb = new QB(";cjR^jhdbvlssShvjqp~N\\Sb`[W");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @ReactMethod
    public final void setDataSafely(ReadableMap readableMap, String str, String str2, final Callback callback) throws Throwable {
        String strZd = Wg.Zd("\u0003\u0007\u001dKM\u0002\u001b\n", (short) (FB.Xd() ^ (C1499aX.Xd() ^ (-1134242060))), (short) (FB.Xd() ^ (C1633zX.Xd() ^ (1615356599 ^ (-337183070)))));
        String strXd = C1561oA.Xd("/%8:5)6/", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (292725132 ^ (-1452216170)))));
        short sXd = (short) (C1633zX.Xd() ^ (2063782376 ^ (-2063765205)));
        int[] iArr = new int["oalc".length()];
        QB qb = new QB("oalc");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        String str3 = new String(iArr, 0, i2);
        String strKd = Qg.kd("\u001e$\u001b\u0012\u001e\u001am\u0018\u000b\u001c\u0013\n\u0012\u0017\u0011", (short) (C1499aX.Xd() ^ (674375401 ^ (-674374096))), (short) (C1499aX.Xd() ^ (882133300 ^ (-882131693))));
        String strVd = hg.Vd(", &$w\"\u0015&\u001d\u0014\u001c!\u001b", (short) (C1633zX.Xd() ^ ((165249619 ^ 928739635) ^ (-1048745097))), (short) (C1633zX.Xd() ^ ((1486463765 ^ 364305846) ^ (-1294946652))));
        Intrinsics.checkNotNullParameter(readableMap, C1561oA.ud("\u0010e\u0002\u0014\u007f", (short) (OY.Xd() ^ ((2041941672 ^ 1330562199) ^ 922445764))));
        Intrinsics.checkNotNullParameter(str, C1561oA.yd("A5C:6", (short) (C1499aX.Xd() ^ ((1033729761 ^ 1415962564) ^ (-1777905472)))));
        Intrinsics.checkNotNullParameter(str2, C1561oA.Yd("GIXIYQY^T[[", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ (1090570895 ^ 793022591)))));
        Intrinsics.checkNotNullParameter(callback, Xg.qd(".-9:114=", (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ 831063053)), (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (349454873 ^ 1464810227)))));
        try {
            if (!this.hasBiometry) {
                callback.invoke(false);
                return;
            }
            Pair[] pairArr = new Pair[(1001730012 ^ 129249764) ^ 1006706237];
            pairArr[0] = TuplesKt.to(strVd, String.valueOf(readableMap.toHashMap().get(strVd)));
            pairArr[1] = TuplesKt.to(strKd, String.valueOf(readableMap.toHashMap().get(strKd)));
            pairArr[(1047161863 ^ 1717418924) ^ 1480054697] = TuplesKt.to(str3, String.valueOf(readableMap.toHashMap().get(str3)));
            pairArr[(585631040 ^ 140678241) ^ 713724194] = TuplesKt.to(strXd, String.valueOf(readableMap.toHashMap().get(strXd)));
            pairArr[130375342 ^ 130375338] = TuplesKt.to(strZd, String.valueOf(readableMap.toHashMap().get(strZd)));
            final Map mapMapOf = MapsKt.mapOf(pairArr);
            Function1<Integer, Unit> function1 = new Function1<Integer, Unit>() { // from class: com.davivienda.daviviendaapp.bridges.biovalidation.BioValidationManager.setDataSafely.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws Throwable {
                    int iIntValue = num.intValue();
                    Class<?> cls = Class.forName(C1561oA.yd("!,-l\u001e\u001a2$<.-5&\"q'/C9E3.:/76HG\u007f3F<BDER\b;EJ\\FTPFBXL][\u001e1SXBLb^\\XfZcaK^n`a^n\u001fyj|KcueVosu{\u0004-=", (short) (OY.Xd() ^ (Od.Xd() ^ (84986576 ^ 1122831848)))));
                    Class<?>[] clsArr = {Integer.TYPE};
                    Object[] objArr = {Integer.valueOf(iIntValue)};
                    Method method = cls.getMethod(C1561oA.Yd("!'0*'\"", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ (114435252 ^ 928737663)))), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(this, objArr);
                        return Unit.INSTANCE;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }

                public final void invoke(int i3) throws Throwable {
                    if (i3 != 1) {
                        callback.invoke(Integer.valueOf(i3));
                        return;
                    }
                    BioValidateManagerImpl bioValidateManagerImpl = BioValidationManager.this.bioValidateManager;
                    ReactApplicationContext reactApplicationContext = BioValidationManager.this.reactContext;
                    Map<String, String> map = mapMapOf;
                    final Callback callback2 = callback;
                    bioValidateManagerImpl.setDatSafely(reactApplicationContext, map, new Function1<Boolean, Unit>() { // from class: com.davivienda.daviviendaapp.bridges.biovalidation.BioValidationManager.setDataSafely.1.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) throws Throwable {
                            boolean zBooleanValue = bool.booleanValue();
                            Class<?> cls = Class.forName(hg.Vd("7B?~40D6B4/7,(s)%9+7)$,!\u001d\u001c*)e\u0019(\u001e\u0018\u001a\u0017$]\u0011\u0017\u001c\"\f\u0016\u0012\f\b\u001a\u000e\u0013\u0011Ob\t\u000es}\b\u0004}y\f\u007f\u0005\u0003`s\u007fqvs\u007f0~o}LhzfWdhflx\". ,", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (1358661637 ^ 1634901914))), (short) (C1499aX.Xd() ^ ((497830900 ^ 928374472) ^ (-721010049)))));
                            Class<?>[] clsArr = {Boolean.TYPE};
                            Object[] objArr = {Boolean.valueOf(zBooleanValue)};
                            Method method = cls.getMethod(C1561oA.ud("\t\r\u0014\f\u0007\u007f", (short) (FB.Xd() ^ (1873166191 ^ 1873154044))), clsArr);
                            try {
                                method.setAccessible(true);
                                method.invoke(this, objArr);
                                return Unit.INSTANCE;
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        }

                        public final void invoke(boolean z2) {
                            callback2.invoke(null, Boolean.valueOf(z2));
                        }
                    });
                }
            };
            Class<?> cls = Class.forName(Jg.Wd("xg0stTt:B\b^z;;Rks[I)v\u0006YR\u001a|\u0017i\")\u0014\u001eci2#hoqJ,*\u007f\u007fE%C\u000b\f]w\u001f\u0011\u001aK9O\u001f\u0015dRZ+-VMe+,|d", (short) (C1499aX.Xd() ^ (1315198343 ^ (-1315191146))), (short) (C1499aX.Xd() ^ (1674989784 ^ (-1674989998)))));
            Class<?>[] clsArr = new Class[(531501340 ^ 222574835) ^ 317336043];
            short sXd2 = (short) (Od.Xd() ^ ((1535500477 ^ 1001385846) ^ (-1613381634)));
            short sXd3 = (short) (Od.Xd() ^ ((1791031427 ^ 2037366812) ^ (-330256146)));
            int[] iArr2 = new int["\u00147\u0004\u001fS\u007f>\u0007I\u001aA\u0018\b\u001eWS".length()];
            QB qb2 = new QB("\u00147\u0004\u001fS\u007f>\u0007I\u001aA\u0018\b\u001eWS");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            short sXd4 = (short) (OY.Xd() ^ (1149477502 ^ 1149477567));
            short sXd5 = (short) (OY.Xd() ^ (714662776 ^ 714658291));
            int[] iArr3 = new int["wped9*M\f\u001f\u0001arj))@".length()];
            QB qb3 = new QB("wped9*M\f\u001f\u0001arj))@");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + (i4 * sXd5))) + xuXd3.CK(iKK3));
                i4++;
            }
            clsArr[1] = Class.forName(new String(iArr3, 0, i4));
            clsArr[1090904264 ^ 1090904266] = Class.forName(Ig.wd("v%\u001as\u001eGj\u0018X\u007f>\u001dXSD{\u0017+b_^3\r\u000e\u0003 3\u0014!\u0012", (short) (ZN.Xd() ^ ((469162509 ^ 218884302) ^ 385698632))));
            clsArr[(1183864190 ^ 706820846) ^ 1823567763] = Boolean.TYPE;
            Object[] objArr = new Object[1826781525 ^ 1826781521];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[1784229984 ^ 1784229986] = function1;
            objArr[(832510262 ^ 1092931293) ^ 1891358696] = true;
            Method declaredMethod = cls.getDeclaredMethod(EO.Od("Z\u001ehS-!8?\u001d", (short) (Od.Xd() ^ (1881574514 ^ (-1881584072)))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IllegalStateException unused) {
            callback.invoke(false);
        }
    }

    public final void setHasBiometry(boolean z2) {
        this.hasBiometry = z2;
    }

    @ReactMethod
    public final void validateAuthBiometricByDevice(final Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, C1561oA.Qd("\u0007\u0004\u000e\r\u0002\u007f\u0001\b", (short) (C1633zX.Xd() ^ ((1085605193 ^ 1384810950) ^ (-306158821)))));
        try {
            if (this.hasBiometry) {
                this.bioValidateManager.validateHardwareBiometric(this.reactContext, EnumAction.VALIDATE_HARDWARE, new Function1<ManagerResponse, Unit>() { // from class: com.davivienda.daviviendaapp.bridges.biovalidation.BioValidationManager.validateAuthBiometricByDevice.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ManagerResponse managerResponse) throws Throwable {
                        Class<?> cls = Class.forName(C1561oA.yd("0=8y-+=1K?8B53|4>TDRB?E<FGST\u000fDQIQUP_\u0017LPWkW_]UScYll)>biMYqogeuknnZoympoy,\fw\u007f}us\u0004u^\u0014\u0010\u0005[\u0004\u0007\u0006\u000b\u001b\u0016\u000e\u0005d\u0019d\u0013%\u0015\u0010\u000fNX", (short) (OY.Xd() ^ (1930947972 ^ 1930921962))));
                        Class<?>[] clsArr = {Class.forName(C1561oA.Yd("\u0016#\"c-\u0019%#\u001fi312( $,3$<(42.,@6==/=;5F6HP\u0006F;I=DCQ\u000e.CQELKY:N][[[aT", (short) (FB.Xd() ^ (1212848257 ^ 1212862331))))};
                        Object[] objArr = {managerResponse};
                        int iXd = C1580rY.Xd() ^ (816663123 ^ (-19162740));
                        short sXd = (short) (C1607wl.Xd() ^ (1179175169 ^ 1179157341));
                        short sXd2 = (short) (C1607wl.Xd() ^ iXd);
                        int[] iArr = new int["gmvpmh".length()];
                        QB qb = new QB("gmvpmh");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                            i2++;
                        }
                        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                        try {
                            method.setAccessible(true);
                            method.invoke(this, objArr);
                            return Unit.INSTANCE;
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ManagerResponse managerResponse) throws Throwable {
                        Intrinsics.checkNotNullParameter(managerResponse, Jg.Wd("\u0018\u0016\u0010a", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (70840258 ^ 1201902756))), (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (1196330570 ^ (-688559713))))));
                        if (managerResponse.getStatusCode() != 0) {
                            BioValidationManager.access$handleErrorInValidate(BioValidationManager.this, callback);
                            return;
                        }
                        if (BiometricManager.from(BioValidationManager.this.reactContext).canAuthenticate(ZN.Xd() ^ 864698111) == ((2145710103 ^ 548732681) ^ 1599082261)) {
                            BioValidationManager.access$handleErrorInValidate(BioValidationManager.this, callback);
                            return;
                        }
                        BioValidateManagerImpl bioValidateManagerImpl = BioValidationManager.this.bioValidateManager;
                        ReactApplicationContext reactApplicationContext = BioValidationManager.this.reactContext;
                        final BioValidationManager bioValidationManager = BioValidationManager.this;
                        final Callback callback2 = callback;
                        bioValidateManagerImpl.getBiometricHardwareTypes(reactApplicationContext, new Function1<ArrayList<Integer>, Unit>() { // from class: com.davivienda.daviviendaapp.bridges.biovalidation.BioValidationManager.validateAuthBiometricByDevice.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ArrayList<Integer> arrayList) throws Throwable {
                                Object[] objArr = {arrayList};
                                Method method = Class.forName(Wg.vd("erq3jh~rpdakb`.eSi]k_\\f]KL\\]\u001cQbZFJIX\u0014IQXP<HFB@TJAA\u0002\u0017?F.:640.B8??\u000f$2&-,:l0\u001c(&\" 4&r((\u001dw '&\u000f\u001f\u001e\u0016\u0011p)t\u0007\u0019\r\b\u000bJXLJ", (short) (FB.Xd() ^ (739818836 ^ 739813600)))).getMethod(hg.Vd("\u000f\u0013\u001a\u0012\r\u0006", (short) (C1633zX.Xd() ^ (1251784533 ^ (-1251772940))), (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ 1951488773))), Class.forName(Qg.kd("\u0007|\u0011zF\r\u000b~\u0001AS\u0004\u0003p\bYu~~", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207814486))), (short) (C1633zX.Xd() ^ ((218771976 ^ 345900199) ^ (-429132426))))));
                                try {
                                    method.setAccessible(true);
                                    method.invoke(this, objArr);
                                    return Unit.INSTANCE;
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ArrayList<Integer> arrayList) throws Throwable {
                                short sXd = (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134253079));
                                int[] iArr = new int["\u0013\u0005\u0012\u000e\f\n\u000e~".length()];
                                QB qb = new QB("\u0013\u0005\u0012\u000e\f\n\u000e~");
                                int i2 = 0;
                                while (qb.YK()) {
                                    int iKK = qb.KK();
                                    Xu xuXd = Xu.Xd(iKK);
                                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                                    i2++;
                                }
                                Intrinsics.checkNotNullParameter(arrayList, new String(iArr, 0, i2));
                                BioValidationManager.access$handleSuccessInValidate(bioValidationManager, arrayList, callback2);
                            }
                        });
                    }
                });
                return;
            }
            Class<?> cls = Class.forName(C1593ug.zd("\u0004\u0011\u0010Q\t\u0007\u001d\u0011\u001f\u0013\u0010\u001a\u0011\u000f\\\u0014\u0012(\u001c*\u001e\u001b%\u001c\u001a\u001b+,j 1)%)(7r(07?+751/C9@@\u0001\u0016>E-9EC?=QGNN.CQELKY", (short) (C1607wl.Xd() ^ ((1147968780 ^ 44394366) ^ 1187621549)), (short) (C1607wl.Xd() ^ ((2110089932 ^ 902422187) ^ 1208779381))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.od("jur2icdeamlg)l^YZj#Ve[UWT\u001c0MWVKIJQ", (short) (C1499aX.Xd() ^ (160159118 ^ (-160154836)))));
            Object[] objArr = {callback};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.Kd("(\"0'0*\u000b9:8<\u0014:#/;953G9,?K@HOO*RJK", (short) (C1607wl.Xd() ^ (75046464 ^ 75070197))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IllegalStateException unused) {
            Class<?> cls2 = Class.forName(Wg.Zd("L6\t'*\u0005/\u007fY*z\"d?`t\u001f\u0012YD\u0004]{G\u0019vZp\u0003\u0015yevV*\r\u001d.K&\u0003J+=\u000egh:V2?0-\u0010\u0005lM'o\nrD7\u0014\bqS$~Rt", (short) (C1607wl.Xd() ^ ((44456134 ^ 549047437) ^ 572497522)), (short) (C1607wl.Xd() ^ (1846256006 ^ 1846264538))));
            Class<?>[] clsArr2 = {Class.forName(C1561oA.Xd("Ta`\"[WZ][ijg+pdadv1fwokon8Nmyzqqt}", (short) (C1499aX.Xd() ^ (1456530201 ^ (-1456507229)))))};
            Object[] objArr2 = {callback};
            short sXd = (short) (C1499aX.Xd() ^ ((905502631 ^ 805559141) ^ (-100352959)));
            int[] iArr = new int["82@7@:\u001bIJHL$J3?K)%#7)\u001c/;08??\u001aB:;".length()];
            QB qb = new QB("82@7@:\u001bIJHL$J3?K)%#7)\u001c/;08??\u001aB:;");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Method declaredMethod2 = cls2.getDeclaredMethod(new String(iArr, 0, i2), clsArr2);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(this, objArr2);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    @ReactMethod
    public final void validateExistSecureData(final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, Qg.kd("zw\u0002\u0001ust{", (short) (OY.Xd() ^ ((273980884 ^ 1460906407) ^ 1195838003)), (short) (OY.Xd() ^ (466991457 ^ 466982615))));
        try {
            if (this.hasBiometry) {
                this.bioValidateManager.validateExistSecureData(this.reactContext, new Function1<Boolean, Unit>() { // from class: com.davivienda.daviviendaapp.bridges.biovalidation.BioValidationManager.validateExistSecureData.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) throws Throwable {
                        boolean zBooleanValue = bool.booleanValue();
                        Class<?> cls = Class.forName(ZO.xd("B\u001e\u001dPzCAY\u0005@/\u000f\"{_'\\\u001fT\fdB&x \u0011(\u007f>P\u000b<2\u001e_#\u001d(}\u0001zaHh\u0007drN).\u0006A\n!6\u0012\u0010'GadYLT\u000b0+S\b\u0017vPS\u0012ys\"Q[@~c }d$%W)9#v~N\u0001xO", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (-69949362))), (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (244333127 ^ (-1025135033))))));
                        Class<?>[] clsArr = {Boolean.TYPE};
                        Object[] objArr = {Boolean.valueOf(zBooleanValue)};
                        Method method = cls.getMethod(C1626yg.Ud(" 0E9\u0001|", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207798300))), (short) (C1580rY.Xd() ^ (FB.Xd() ^ (552907449 ^ (-2132531222))))), clsArr);
                        try {
                            method.setAccessible(true);
                            method.invoke(this, objArr);
                            return Unit.INSTANCE;
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }

                    public final void invoke(boolean z2) {
                        callback.invoke(null, Boolean.valueOf(z2));
                    }
                });
            } else {
                callback.invoke(null, false);
            }
        } catch (IllegalStateException unused) {
            callback.invoke(null, false);
        }
    }

    @ReactMethod
    public final void validateHardwareBiometric(final Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, hg.Vd("ur|{pnov", (short) (FB.Xd() ^ (669677266 ^ 669667535)), (short) (FB.Xd() ^ ((709668830 ^ 1455395197) ^ 2096321714))));
        try {
            if (this.hasBiometry) {
                this.bioValidateManager.validateHardwareBiometric(this.reactContext, EnumAction.VALIDATE_HARDWARE, new Function1<ManagerResponse, Unit>() { // from class: com.davivienda.daviviendaapp.bridges.biovalidation.BioValidationManager.validateHardwareBiometric.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ManagerResponse managerResponse) throws Throwable {
                        Object[] objArr = {managerResponse};
                        Method method = Class.forName(Ig.wd("D}.\u000fF\u0016\u0007R\u007fOQ8ba2Gv\u000e9N\u0002&\u0005~\\8*xw\u001f\u000b^9\u001f$\u0001\u0014$*\u001a\u001e `o4E\u0004>b\u0001Y),*>ti\u0001MXKY;\u0018NJ\u0015Kkm\u0018M}\u001c\rW.\u0005\bVY<#xf^sNd\u00025\u001f#WG\u001e`|\u001e", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207800826))))).getMethod(C1561oA.Qd("\u0001\u0005\f\u0004~w", (short) (OY.Xd() ^ (1019408875 ^ 1019400575))), Class.forName(EO.Od("fH\u001658G|\u001cM\nV+\u0016\u0003{\u001bnp;\b)\u000f,%(u\u000bY|}5L_\f4\u00127\u0006NRYf\u001f1=l\"ed7M)R1 \u0002|Y(71", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ 1951480192)))));
                        try {
                            method.setAccessible(true);
                            method.invoke(this, objArr);
                            return Unit.INSTANCE;
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ManagerResponse managerResponse) {
                        int iXd = Od.Xd() ^ (1793409961 ^ (-756597653));
                        Intrinsics.checkNotNullParameter(managerResponse, C1593ug.zd("-+?-", (short) (Od.Xd() ^ ((1506192113 ^ 654272971) ^ (-2134476727))), (short) (Od.Xd() ^ iXd)));
                        callback.invoke(null, Integer.valueOf(managerResponse.getStatusCode()));
                    }
                });
            } else {
                callback.invoke(false);
            }
        } catch (IllegalStateException unused) {
            callback.invoke(false);
        }
    }
}
