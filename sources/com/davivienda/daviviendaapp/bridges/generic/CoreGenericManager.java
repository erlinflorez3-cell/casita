package com.davivienda.daviviendaapp.bridges.generic;

import com.davivienda.daviviendaapp.bridges.generic.CoreGenericManager;
import com.davivienda.daviviendaapp.common.helper.CoreHelper;
import com.davivienda.daviviendaapp.common.helper.Utils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.valid.vssh_android_core.basecore.BaseResponse;
import com.valid.vssh_android_core.generic.CoreGenericImp;
import com.valid.vssh_android_core.model.GenericModel;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericBridgeModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
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
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007|jAӄLeV.Zݷ2\u000fy\b<řc$\u007fICU }*\t]WogtLb\u000bY\u000f\u000e\u0016~m4Ikxe\u0012\u00154JoU3UoKʠhtD\f(݅*8\u0010\u0005\t\u001a0H&͌+Cy\u000bR;PtHR%M3\u001bŪ\n>.\u0003fպf\\<`l\fA_)\tiPV?_^\u0006}\u0013LT5\u0017\u000faL6p=;\u00153_\u001b\u0007\u0001do\tEqK\u0012\u0001'U9yy]6f\u000f,\u0015Y]=cx&j\u0015i`:5[UiK^\u001f@w)\n=B\u0012 \u001e)^-[-\u0017\u000e\u00143\u0003\u0007k@~\u000b\u000fH\u000e\u0010y8-$.F[?)|icQ\u0018|J,\u000b\u001b5;\u0003\u0005 \ng>d#3lw\u007fJ\u0018E\u0006V\\$q=\u001c\u000f!f\u00102\u001c0u\tu{Y4%@O[g,g\u007fJNR\u0004\u000f\u0005\u000fo\u001ai\u001btN?\u0007&G,\u0019\f\tRt\t{RjWZ0c\u001b\u0003%.\f!*twjAU\u0014\\p\u0001i\u0019o$܊cçj7g\u0012< e<v9ESs\u0010\u0010W%\u0018\u0016ֽ\u000fۖ\\fJͭ۷^\u0001"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wOCDkA\"\u00132?C\u0014c\u000eN\u007f'TPL\u0014X[n?\u0014\u001f0", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\ 7y4\u0003\u0011y]!\u0011b<Uv|", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "1na2@(GO\u001b~\b", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)a\t'\tJ\u0005\u0016\u0011Ey\u001b<@'5b}-;k_\fWP;M4'\u0015ue7jk7$", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)a\t'\tJ\u0005\u0016\u0011Ey\u001b<@\"1g}\u001eAz\u0016w*?Ik!\u001e#skB\u0015c\u0002", "1n]@h4>5\u0019\bzk0zv/r\u0011,y@", "", ";dc5b+", "", "Bh\\2b<M", "", "3mS\u001db0Gb", "Ar[\u001d\\5GW\"\u0001", "", "AdRBe,+S%\u000fzl;", "@db=b5LSx\bxk@\b\u0018/d", "/cS X:LW#\b^]\u001b\u0007u/q\u0010(\nO", "@d`BX:M0#}\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "/oX", "6dP1X9L", "/cS6g0H\\\u0015\u0006YZ;x", ">qX;V0IO ]vm(", "1`[9U(<Y", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar,<Vy\u001e=C", "5dc\u0015g;I;\u0019\u000e}h+e\u00197b\u007f5", "5dc\u001bT4>", "7mXA66KS", ":hQ2e,G/\u000b\u0003\u0002e0", "\u001aj^A_0G\u001d\u0004z~k\u0002", "", "", "5d]2e0<;#}ze", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)a\t'\tJ\u0005\u0016\u0011Ey\u001b<@-?X}'\u0001O\u00167MP?i\u001c(\u0014hh\u000f", "uI;0b4\bd\u0015\u0006~]u\u000e\u0017=hy$\u0005?\u000e!\u001bFi\fF\u0004%~a\b\u001f7t_\u0010ML;x8\u001c|r`9\u000e9\u0013T\u00016NPWuZ\\\u007fG$!^\u0017N9VbcJ3rMG\u001b\u00170S\u000b\u0011,g\u0011\u0012\u001f14w>_\u0012\u0011c\u0012zA'w\u001c", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CoreGenericManager extends ReactContextBaseJavaModule {
    private CoreGenericImp<BaseResponse> coreManager;

    /* JADX INFO: renamed from: com.davivienda.daviviendaapp.bridges.generic.CoreGenericManager$consumeGenericService$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ GenericModel $genericModel;
        final /* synthetic */ int $timeout;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i2, GenericModel genericModel, Callback callback, Continuation<? super AnonymousClass1> continuation) {
            super(179387759 ^ 179387757, continuation);
            this.$timeout = i2;
            this.$genericModel = genericModel;
            this.$callback = callback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CoreGenericManager.this.new AnonymousClass1(this.$timeout, this.$genericModel, this.$callback, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            Class<?> cls = Class.forName(Qg.kd("/:7v,(<.:,'/$ k!\u001d1#/!\u001c$\u0019\u0015\u0014\"!]\u0011 \u0016\u0010\u0012\u000f\u001cU\u000e\u000b\u0013\t\u0015\u000b\u0004Ma\r\u000f\u0001a~\u0007|\t~w`s\u007fqvs\u007f0nyw{|sjKhpfrhaPampb[\\\u001a&", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849972802))), (short) (C1499aX.Xd() ^ ((2044620469 ^ 1019710775) ^ (-1159317638)))));
            Class<?>[] clsArr = new Class[ZN.Xd() ^ (1806412947 ^ 1478595169)];
            int iXd = OY.Xd() ^ 69927083;
            clsArr[0] = Class.forName(hg.Vd("vy}tpt}2fqsotrfj`m';fhdig[_UBQ\\\\P", (short) (ZN.Xd() ^ ((894164638 ^ 117655132) ^ 843644845)), (short) (ZN.Xd() ^ iXd)));
            clsArr[1] = Class.forName(C1561oA.ud("=@D;7;y.9;7<:.2(5n\u0003.,1%)/\u001a, %#", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831074073)))));
            Object[] objArr = new Object[838451399 ^ 838451397];
            objArr[0] = coroutineScope;
            objArr[1] = continuation;
            Method method = cls.getMethod(C1561oA.yd("\u0002\u0006\u0011\t\b\u0001", (short) (C1499aX.Xd() ^ ((1730534694 ^ 1536324973) ^ (-1018673650)))), clsArr);
            try {
                method.setAccessible(true);
                return method.invoke(this, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            Class<?> cls = Class.forName(C1561oA.Yd("\u0014! a\u0019\u0017-!/# *!\u001fl$\"8,:.+5,*+;<z0A9598G\u0003=<F>LD?\u000b!NRF)HRJXPK6KYMTSa\u0014Taagjc\\?^h`nfaResxlgj*8", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ 1134232076))));
            Class<?>[] clsArr = new Class[FB.Xd() ^ 1609527089];
            clsArr[0] = Class.forName(Xg.qd("{s\nuC\u0003x\u0007\u0001Hj~\b\u0004\u0003\u0015", (short) (Od.Xd() ^ ((1348680620 ^ 1270428904) ^ (-467289220))), (short) (Od.Xd() ^ (FB.Xd() ^ (-1609502827)))));
            clsArr[1] = Class.forName(Jg.Wd("\u001ck!Ky+\u001d\u0007Dq\u001fS\u0004%X\u0004CL\u0012q!Sr+dz>f!L", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69948015))), (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864684780)))));
            Object[] objArr = new Object[C1499aX.Xd() ^ (1600991140 ^ (-485902518))];
            objArr[0] = coroutineScope;
            objArr[1] = continuation;
            short sXd = (short) (ZN.Xd() ^ ((777376861 ^ 1186103223) ^ 1760020008));
            short sXd2 = (short) (ZN.Xd() ^ ((1232376685 ^ 1294511323) ^ 73158317));
            int[] iArr = new int["=\u00019`<V".length()];
            QB qb = new QB("=\u00019`<V");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) ((Continuation) method.invoke(this, objArr));
                Object[] objArr2 = {Unit.INSTANCE};
                Method method2 = Class.forName(C1626yg.Ud("b\u0007\nl\u001a!\"ewjlU=\r9vRI\u0016g\b\u00010\u001c\rTG=\u0006g\"9\u0016s\u007f\u001c\u001f8\u00022oE\u0015%\u007fq\u0006\u0003\u001e&l\u0012y3\"AD :q<W+w^4,\u001dSCe+&V?\u0018t@\u000e\u0012\\i0\b%V+", (short) (C1633zX.Xd() ^ ((441397100 ^ 1004370641) ^ (-563247269))), (short) (C1633zX.Xd() ^ ((854114621 ^ 835588710) ^ (-52864627))))).getMethod(EO.Od("_5Kk7V0:o \u0017:\u001b", (short) (C1633zX.Xd() ^ ((441287418 ^ 1097436228) ^ (-1529101905)))), Class.forName(Ig.wd("\n27\u0005O`s\u00171\u0015:m+&*V", (short) (C1580rY.Xd() ^ (1724823757 ^ (-1724817388))))));
                try {
                    method2.setAccessible(true);
                    return method2.invoke(anonymousClass1, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoreGenericManager coreGenericManager = CoreGenericManager.this;
                    long j2 = this.$timeout;
                    GenericModel genericModel = this.$genericModel;
                    AnonymousClass1 anonymousClass1 = this;
                    this.label = 1;
                    Class<?> cls = Class.forName(C1593ug.zd(">KJ\fCAWKYMJTKI\u0017NLbVdXU_VTUef%Zkc_cbq-gfphvni5Kx|pSr|t\u0003zu`u\u0004w~}\f", (short) (C1580rY.Xd() ^ ((1864314106 ^ 303503048) ^ (-2097704945))), (short) (C1580rY.Xd() ^ (2066423355 ^ (-2066420333)))));
                    Class<?>[] clsArr = new Class[(1728276188 ^ 1348260381) ^ 929019074];
                    clsArr[0] = Long.TYPE;
                    clsArr[1] = Class.forName(C1561oA.od("\u0004\u000f\fK\u0013|\u0007\u0003|E\r\t\b{qr~s\u0001|uoilwyk3qrffl-Ebj`lb[DeYY_", (short) (C1499aX.Xd() ^ ((942298909 ^ 1225973239) ^ (-1899536427)))));
                    clsArr[(2142706642 ^ 1149737827) ^ 993034419] = Class.forName(C1561oA.Kd("\f\u0011\u0017\u0010\u000e\u0014T\u000b\u0018\u001c\u001a!!\u0017\u001d\u0015$_u##* &.\u001b/%,,", (short) (C1580rY.Xd() ^ ((1481175896 ^ 68358165) ^ (-1549507297)))));
                    Object[] objArr = new Object[(143356807 ^ 1264070040) ^ 1137925660];
                    objArr[0] = Long.valueOf(j2);
                    objArr[1] = genericModel;
                    objArr[(295686398 ^ 1618139198) ^ 1911359682] = anonymousClass1;
                    Method method = cls.getMethod(Wg.Zd("\u0013\u0018V\u001fq:\t {c,q4", (short) (ZN.Xd() ^ ((1651537076 ^ 1639219463) ^ 63231971)), (short) (ZN.Xd() ^ (703838407 ^ 703849160))), clsArr);
                    try {
                        method.setAccessible(true);
                        obj = method.invoke(coreGenericManager, objArr);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException(C1561oA.Qd("*'10b60_e0\"/0'\u001e^V\u0018\u001a\u001a\"$\u0016OU\u0017\u001b\"\u001a\u0015\u000eNF\u001d\u000e\u0018\u000bA\u0004\u000f\u0011\r\u0012\u0010\u0004\b}", (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849962783))));
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Pair pair = (Pair) obj;
                if (pair != null) {
                    this.$callback.invoke(null, pair.getSecond());
                } else {
                    this.$callback.invoke(null, C1561oA.Xd("&TUSW\u0006UW]\n^Q_dXSV\u0012Ycjd[", (short) (C1607wl.Xd() ^ (1122372833 ^ 1122398911))));
                }
            } catch (Exception e3) {
                this.$callback.invoke(null, e3.getMessage());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.davivienda.daviviendaapp.bridges.generic.CoreGenericManager$liberenAWilli$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C11061 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11061(Continuation<? super C11061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.result = obj;
            this.label |= 302365964 ^ (-1845117684);
            CoreGenericManager coreGenericManager = CoreGenericManager.this;
            Class<?> cls = Class.forName(Wg.vd("9FA\u000364F:THAK><\u0006='=-;+(.%/0<=w-:2Z^Yh ZU_cqe`(>gkK.ISGUID;PZNQPZ", (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ 1951490025))));
            Class<?>[] clsArr = new Class[C1499aX.Xd() ^ (-1134257937)];
            clsArr[0] = Long.TYPE;
            clsArr[1] = Class.forName(Qg.kd("r}z:\u0002kuqk4{wvj`ambokd^X[fhZ\"`aUU[\u001c4QYO[QJ3THHN", (short) (ZN.Xd() ^ ((222274760 ^ 1340866016) ^ 1121199737)), (short) (ZN.Xd() ^ ((1414640915 ^ 33974175) ^ 1448606713))));
            clsArr[C1580rY.Xd() ^ (2008436911 ^ (-1178551476))] = Class.forName(hg.Vd("pswnjn-alnjomae[h\"6a_dX\\bM_SXV", (short) (Od.Xd() ^ (Od.Xd() ^ (-1207814259))), (short) (Od.Xd() ^ (649508143 ^ (-649525167)))));
            Object[] objArr = new Object[(831944673 ^ 1045769258) ^ 264461256];
            objArr[0] = 0L;
            objArr[1] = null;
            objArr[OY.Xd() ^ 69929194] = this;
            Method method = cls.getMethod(C1561oA.ud("73+-9+3\u0005\u001a+-,(", (short) (ZN.Xd() ^ (1706220112 ^ 1706221280))), clsArr);
            try {
                method.setAccessible(true);
                return method.invoke(coreGenericManager, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    /* JADX INFO: renamed from: com.davivienda.daviviendaapp.bridges.generic.CoreGenericManager$liberenAWilli$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Channel<Pair<Boolean, Object>> $channel;
        final /* synthetic */ GenericModel $genericModel;
        int label;

        public static /* synthetic */ void $r8$lambda$HrC34NCF1hgWukrWD0qcpcZmn3c(Channel channel, CoreErrorModelResponse coreErrorModelResponse) throws Throwable {
            Class<?> cls = Class.forName(C1561oA.yd("HSP\u0010EAUGcUPXMI\u0015JVj\\hZU]R^]kj'Zi_)+(5n'$,2>4-v\u000b68:\u001b8@6B81*=I;@=Iy\u0011\r\u0005\u0007\u0013\u0005\r^\u0004\u0015\u0017\u0016\u0012KX", (short) (Od.Xd() ^ (1431727445 ^ (-1431713945)))));
            Class<?>[] clsArr = new Class[ZN.Xd() ^ 864698098];
            clsArr[0] = Class.forName(C1561oA.Yd("INTMKQ\\\u0013IVZX__U[Sb\u001eTZTbc[ck'=c]kldl", (short) (C1633zX.Xd() ^ (1579329462 ^ (-1579349687)))));
            int iXd = ZN.Xd() ^ (833030666 ^ 36533291);
            int iXd2 = ZN.Xd() ^ (401687831 ^ 612072102);
            short sXd = (short) (C1607wl.Xd() ^ iXd);
            short sXd2 = (short) (C1607wl.Xd() ^ iXd2);
            int[] iArr = new int["Uba#lXdb^)rpqg_bpgvtokgly}q;{~tv~A\u0007z\n\b\b\b\u000e\u0001J`\u000e\u0012\u0006f\u0015\u0016\u0014\u0018s\u0017\r\u000f\u0017}\u0012!\u001f\u001f\u001f%\u0018".length()];
            QB qb = new QB("Uba#lXdb^)rpqg_bpgvtokgly}q;{~tv~A\u0007z\n\b\b\b\u000e\u0001J`\u000e\u0012\u0006f\u0015\u0016\u0014\u0018s\u0017\r\u000f\u0017}\u0012!\u001f\u001f\u001f%\u0018");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            clsArr[1] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = new Object[2028542278 ^ 2028542276];
            objArr[0] = channel;
            objArr[1] = coreErrorModelResponse;
            int iXd3 = OY.Xd() ^ (1250356751 ^ (-1319996548));
            short sXd3 = (short) (C1499aX.Xd() ^ (400736790 ^ (-400748045)));
            short sXd4 = (short) (C1499aX.Xd() ^ iXd3);
            int[] iArr2 = new int["\nz\u0003$@PNhf{3DZqjY\"31*z%".length()];
            QB qb2 = new QB("\nz\u0003$@PNhf{3DZqjY\"31*z%");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                i3++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX INFO: renamed from: $r8$lambda$JzD-ZQtPPQE5UjzO6sPnjhtkhqc, reason: not valid java name */
        public static /* synthetic */ void m7089$r8$lambda$JzDZQtPPQE5UjzO6sPnjhtkhqc(Channel channel, CoreGenericModelResponse coreGenericModelResponse) throws Throwable {
            Class<?> cls = Class.forName(ZO.xd("w?\u0002\u0011h$\u0011(\u0004t<\u000fap=\u0017\u001fjHB\u001671{J\u0016\\\u0004-\u0019!-\u0002@lSA4bQ_\fy5zc\u0013[:/A<A\ts<\fR=8u@w\u0005\u0018V\u0012O2cF3d{\u0019\u001eixD", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (1541727765 ^ (-67879845)))), (short) (C1633zX.Xd() ^ ((2086898093 ^ 226523290) ^ (-1910759382)))));
            Class<?>[] clsArr = new Class[(1055859821 ^ 1625007523) ^ 1580499404];
            clsArr[0] = Class.forName(C1626yg.Ud("/ki`<\u000b`C4\u0017!h$[At8r\u001e0c~\u0016t`P\rR4<,G>WM", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (1119122200 ^ (-88726845)))), (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951485136))));
            clsArr[1] = Class.forName(Ig.wd("|YcF\u001d:;\u0007V.v\u0018ha2T,\u0012vM\fYHN?\u0010_b\u0012`;\u001dy\u001c\u00014\u001fyk^a*CX)\"-?M9]=Rbm=6W\u0014y\u0003,\\o$#V", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207813954)))));
            Object[] objArr = new Object[FB.Xd() ^ (669309875 ^ 2014033026)];
            objArr[0] = channel;
            objArr[1] = coreGenericModelResponse;
            Method declaredMethod = cls.getDeclaredMethod(EO.Od("L+AVM\u001d%X\u001eleF\bOyJ4\u0015`\u0004\u001eT", (short) (C1499aX.Xd() ^ (639419117 ^ (-639419009)))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX INFO: renamed from: $r8$lambda$vuz8ur-jZ4m8ytVS-m9rvcL6rPg, reason: not valid java name */
        public static /* synthetic */ void m7090$r8$lambda$vuz8urjZ4m8ytVSm9rvcL6rPg(Channel channel, CoreGenericBridgeModelResponse coreGenericBridgeModelResponse) throws Throwable {
            Class<?> cls = Class.forName(C1561oA.Qd("'2/n$ 4&2$\u001f'\u001c\u0018c\u0019\u0015)\u001b'\u0019\u0014\u001c\u0011\r\f\u001a\u0019U\t\u0018\u000e\b\n\u0007\u0014M\u0006\u0003\u000b\u0001\r\u0003{EY\u0005\u0007xYv~t\u0001voXkwinkw(okceqck=Rced`\u001a'", (short) (Od.Xd() ^ ((136457129 ^ 191983881) ^ (-55791389)))));
            Class<?>[] clsArr = new Class[FB.Xd() ^ (212606367 ^ 1396929198)];
            clsArr[0] = Class.forName(C1593ug.zd("\u0004\t\u000f\b\u0006\f\u0017M\u0004\u0011\u0015\u0013\u001a\u001a\u0010\u0016\u000e\u001dX\u000f\u0015\u000f\u001d\u001e\u0016\u001e&aw\u001e\u0018&'\u001f'", (short) (C1607wl.Xd() ^ (190846439 ^ 190841931)), (short) (C1607wl.Xd() ^ (1878063791 ^ 1878059497))));
            clsArr[1] = Class.forName(C1561oA.od("'2/n6 *& h0,+\u001f\u0015\u0016\"\u0017$ \u0019\u0013\r\u0010\u001b\u001d\u000fV\u0015\u0016\n\n\u0010P\u0014\u0006\u0013\u000f\r\u000b\u000f\u007fG[\u0007\tz[x\u0001v\u0003xqO~tnpmTuiioTfsomko`", (short) (OY.Xd() ^ (FB.Xd() ^ 1609503338))));
            Object[] objArr = new Object[ZN.Xd() ^ (456219447 ^ 683369925)];
            objArr[0] = channel;
            objArr[1] = coreGenericBridgeModelResponse;
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.Kd("IOXROJ9\\[YOYP\u0011ZP]SVT\u0018%", (short) (FB.Xd() ^ (853960750 ^ 853947412))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(GenericModel genericModel, Channel<Pair<Boolean, Object>> channel, Continuation<? super AnonymousClass2> continuation) {
            super((1336414400 ^ 359627595) ^ 1523018633, continuation);
            this.$genericModel = genericModel;
            this.$channel = channel;
        }

        private static final void invokeSuspend$lambda$0(Channel channel, CoreGenericBridgeModelResponse coreGenericBridgeModelResponse) throws Throwable {
            Utils utils = Utils.INSTANCE;
            Intrinsics.checkNotNull(coreGenericBridgeModelResponse);
            Class<?> cls = Class.forName(Wg.Zd("u~|8oE\u001dI\u0017$_!Yo=m+\u001a\u000f\u0017\u000ba+Z\u001a2\u0003=9\b\u0017\rO+*d \u0018A~4;X8\u001aG*+", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849973846))), (short) (C1499aX.Xd() ^ (1913059804 ^ (-1913042750)))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609523617)));
            int[] iArr = new int["anm/xdpnj5~|}skn|s\u0003\u0001{wsx\u0006\n}G\b\u000b\u0001\u0003\u000bM\u0013\u0007\u0016\u0014\u0014\u0014\u001a\rVl\u001a\u001e\u0012t\u0014\u001e\u0016$\u001c\u0017v( \u001c \u001f\b+!#+\u0012&53339,".length()];
            QB qb = new QB("anm/xdpnj5~|}skn|s\u0003\u0001{wsx\u0006\n}G\b\u000b\u0001\u0003\u000bM\u0013\u0007\u0016\u0014\u0014\u0014\u001a\rVl\u001a\u001e\u0012t\u0014\u001e\u0016$\u001c\u0017v( \u001c \u001f\b+!#+\u0012&53339,");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {coreGenericBridgeModelResponse};
            Method method = cls.getMethod(Wg.vd("eXjKannl^bWDiVYZ[Z-XZ^cZE&GOIUOH", (short) (C1607wl.Xd() ^ (1510753589 ^ 1510758377))), clsArr);
            try {
                method.setAccessible(true);
                channel.mo10484trySendJP2dKIU(new Pair(true, (WritableMap) method.invoke(utils, objArr)));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        private static final void invokeSuspend$lambda$1(Channel channel, CoreGenericModelResponse coreGenericModelResponse) throws Throwable {
            Utils utils = Utils.INSTANCE;
            Intrinsics.checkNotNull(coreGenericModelResponse);
            Class<?> cls = Class.forName(Qg.kd("\u0005\u0010\rL\u0002}\u0012\u0004\u0010\u0002|\u0005yuAvr\u0007x\u0005vqynjiwv3gronom,eagj^j%Ki]_e", (short) (FB.Xd() ^ ((1753170917 ^ 497653434) ^ 1977007095)), (short) (FB.Xd() ^ (C1499aX.Xd() ^ (682368686 ^ (-1798793174))))));
            Class<?>[] clsArr = {Class.forName(hg.Vd("gro/v`jf`)plk_UVbWd`YSMP[]O\u0017UVJJP\u0011TFSOMKO@\b\u001cGI;\u001c9A7C92\u001b<006\u001b-:6426'", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ 1951475959)), (short) (C1580rY.Xd() ^ ((57261286 ^ 1662952719) ^ (-1618426230)))))};
            Object[] objArr = {coreGenericModelResponse};
            short sXd = (short) (FB.Xd() ^ ((1193252185 ^ 1189783798) ^ 32841934));
            int[] iArr = new int["5(6\b35'\b%-#/%\u001e\u0007(\u001c\u001c\"\u0007\u0019&\" \u001e\"\u0013".length()];
            QB qb = new QB("5(6\b35'\b%-#/%\u001e\u0007(\u001c\u001c\"\u0007\u0019&\" \u001e\"\u0013");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                channel.mo10484trySendJP2dKIU(new Pair(true, (WritableMap) method.invoke(utils, objArr)));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        private static final void invokeSuspend$lambda$2(Channel channel, CoreErrorModelResponse coreErrorModelResponse) throws Throwable {
            Utils utils = Utils.INSTANCE;
            Intrinsics.checkNotNull(coreErrorModelResponse);
            Class<?> cls = Class.forName(C1561oA.yd("&1.m+';-1#\u001e&#\u001fj 4H:F@;C8,+98|1<9\u0010\u0011\u000fM\u000f\u000b\u0011\u0014\u007f\fFl\u0013\u0007\t\u000f", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (-1134232849)))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1580rY.Xd() ^ ((756929962 ^ 442019324) ^ (-927272365)));
            int[] iArr = new int["_lk-vbnlh3|z{qilzq\u0001~yuqv\u0004\b{E\u0006\t~\u0001\tK\u0011\u0005\u0014\u0012\u0012\u0012\u0018\u000bTj\u0018\u001c\u0010p\u001f \u001e\"}!\u0017\u0019!\b\u001c+)))/\"".length()];
            QB qb = new QB("_lk-vbnlh3|z{qilzq\u0001~yuqv\u0004\b{E\u0006\t~\u0001\tK\u0011\u0005\u0014\u0012\u0012\u0012\u0018\u000bTj\u0018\u001c\u0010p\u001f \u001e\"}!\u0017\u0019!\b\u001c+)))/\"");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {coreErrorModelResponse};
            Method method = cls.getMethod(Xg.qd("'\u001c,\u007f-1%\u00064537\u00136,.6\u001d1@>>>D7", (short) (FB.Xd() ^ (OY.Xd() ^ 69937845)), (short) (FB.Xd() ^ (C1580rY.Xd() ^ (1355208970 ^ (-1632622718))))), clsArr);
            try {
                method.setAccessible(true);
                channel.mo10484trySendJP2dKIU(new Pair(true, (WritableMap) method.invoke(utils, objArr)));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CoreGenericManager.this.new AnonymousClass2(this.$genericModel, this.$channel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            int iXd = C1633zX.Xd() ^ (1452350465 ^ (-583012091));
            Class<?> cls = Class.forName(Jg.Wd(")p]l\u0014?C\u0007\u00034\u0001x=\t\u001eC\u000f\u0005G#\u0007Q)o[:w`l\u0010p6\u007fcP\u000e7A.eE1vaZ^[Mn/>\u0016\\2\u0018`;\u000eiK\"nJl\u0004?!rn2\u0007(- Q@\u000e7s", (short) (OY.Xd() ^ (996386314 ^ 996395157)), (short) (OY.Xd() ^ iXd)));
            Class<?>[] clsArr = new Class[C1580rY.Xd() ^ (-831067165)];
            clsArr[0] = Class.forName(ZO.xd(". \u0013kjm\u0015k\u001a\u0001\u001dBT\u000fKn\u00043hd\u0011\u000e'i\u0011='1vv]=\u001c", (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849953441)), (short) (OY.Xd() ^ (1545909150 ^ 1545911112))));
            clsArr[1] = Class.forName(C1626yg.Ud("B\u001a4- 6&\u00188\u0001\u0006\u0011CT0{QNqlP\u001b\u000b\u000ba:fFEF", (short) (ZN.Xd() ^ (Od.Xd() ^ (1180049758 ^ 28039009))), (short) (ZN.Xd() ^ (1310283036 ^ 1310268928))));
            Object[] objArr = new Object[(2075395306 ^ 1157523502) ^ 1061842118];
            objArr[0] = coroutineScope;
            objArr[1] = continuation;
            Method method = cls.getMethod(Ig.wd("\u001ej\u0011-q7", (short) (ZN.Xd() ^ (1753468852 ^ 1753465738))), clsArr);
            try {
                method.setAccessible(true);
                return method.invoke(this, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            Class<?> cls = Class.forName(EO.Od("<\u0013^\bEn(K7>4_ \u001bsL\u0016\u0011La\u0013W\u000b\u0005 Ly2\u0016X\r&Ajp1\u0012of\u0006\u0006|?!#&\u001aU,g~Mj\u0001K\u0003\u0005\u0001=$X>p. G\u00040%\u0016\u0003[\u0015x\u007f3V8X", (short) (C1607wl.Xd() ^ ((411958681 ^ 1502120634) ^ 1090852373))));
            Class<?>[] clsArr = new Class[(361023119 ^ 1481832860) ^ 1305886481];
            short sXd = (short) (C1607wl.Xd() ^ (138311439 ^ 138311941));
            int[] iArr = new int["F<P:\u0006C7C;\u0001!3:41A".length()];
            QB qb = new QB("F<P:\u0006C7C;\u0001!3:41A");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            clsArr[1] = Class.forName(C1593ug.zd("8=C<:@\u00017DHFMMCIAP\f\"OOVLRZG[QXX", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951489812)), (short) (C1499aX.Xd() ^ ((1926118912 ^ 289188137) ^ (-1676845319)))));
            Object[] objArr = new Object[(970596051 ^ 1849419386) ^ 1474427051];
            objArr[0] = coroutineScope;
            objArr[1] = continuation;
            short sXd2 = (short) (C1499aX.Xd() ^ (763726747 ^ (-763738600)));
            int[] iArr2 = new int["-;-(:*".length()];
            QB qb2 = new QB("-;-(:*");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) ((Continuation) method.invoke(this, objArr));
                Unit unit = Unit.INSTANCE;
                Class<?> cls2 = Class.forName(C1561oA.Kd("jwv8om\u0004w\u0006yv\u0001wuCzx\u000f\u0003\u0011\u0005\u0002\f\u0003\u0001\u0002\u0012\u0013Q\u0007\u0018\u0010\f\u0010\u000f\u001eY\u0014\u0013\u001d\u0015#\u001b\u0016aw%)\u001d\u007f\u001f)!/'\"\r\"0$+*8j42,0>2<\u0010':>?=x\b", (short) (C1580rY.Xd() ^ (1281136063 ^ (-1281136690)))));
                Class<?>[] clsArr2 = new Class[1];
                short sXd3 = (short) (Od.Xd() ^ ((1502013599 ^ 974661578) ^ (-1671336931)));
                short sXd4 = (short) (Od.Xd() ^ ((1457473885 ^ 1709568195) ^ (-859495782)));
                int[] iArr3 = new int["^$c=@k\u000b\u000b6i9;\u0016\u0002**".length()];
                QB qb3 = new QB("^$c=@k\u000b\u000b6i9;\u0016\u0002**");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(((i4 * sXd4) ^ sXd3) + xuXd3.CK(iKK3));
                    i4++;
                }
                clsArr2[0] = Class.forName(new String(iArr3, 0, i4));
                Object[] objArr2 = {unit};
                Method method2 = cls2.getMethod(C1561oA.Xd("(.71.)\u0018;:8.8/", (short) (C1607wl.Xd() ^ (116908621 ^ 116891788))), clsArr2);
                try {
                    method2.setAccessible(true);
                    return method2.invoke(anonymousClass2, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException(Xg.qd("SR^_\u0014ie\u0017\u001fk_nqjc& cgiswk'/rx\u0002{xs60\t{\b|5y\u0007\u000b\t\u0010\u0010\u0006\f\u0004", (short) (OY.Xd() ^ (FB.Xd() ^ 1609513282)), (short) (OY.Xd() ^ ((1407672351 ^ 1029535915) ^ 1857685095))));
            }
            ResultKt.throwOnFailure(obj);
            try {
                CoreGenericImp coreGenericImp = CoreGenericManager.this.coreManager;
                if (coreGenericImp == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Wg.vd("}\u000b\u000b~k\u0001\u000b~yx\u0003", (short) (C1499aX.Xd() ^ ((1791192231 ^ 1269348742) ^ (-560699944)))));
                    coreGenericImp = null;
                }
                GenericModel genericModel = this.$genericModel;
                final Channel<Pair<Boolean, Object>> channel = this.$channel;
                LambdaSuccess<CoreGenericBridgeModelResponse> lambdaSuccess = new LambdaSuccess() { // from class: com.davivienda.daviviendaapp.bridges.generic.CoreGenericManager$liberenAWilli$2$$ExternalSyntheticLambda0
                    @Override // com.valid.vssh_android_core.model.LambdaSuccess
                    public final void lambdaSuccessResponse(Object obj2) throws Throwable {
                        CoreGenericManager.AnonymousClass2.m7090$r8$lambda$vuz8urjZ4m8ytVSm9rvcL6rPg(channel, (CoreGenericBridgeModelResponse) obj2);
                    }
                };
                final Channel<Pair<Boolean, Object>> channel2 = this.$channel;
                LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2 = new LambdaSuccess() { // from class: com.davivienda.daviviendaapp.bridges.generic.CoreGenericManager$liberenAWilli$2$$ExternalSyntheticLambda1
                    @Override // com.valid.vssh_android_core.model.LambdaSuccess
                    public final void lambdaSuccessResponse(Object obj2) throws Throwable {
                        CoreGenericManager.AnonymousClass2.m7089$r8$lambda$JzDZQtPPQE5UjzO6sPnjhtkhqc(channel2, (CoreGenericModelResponse) obj2);
                    }
                };
                final Channel<Pair<Boolean, Object>> channel3 = this.$channel;
                coreGenericImp.consumeGenericService(genericModel, lambdaSuccess, lambdaSuccess2, new LambdaError() { // from class: com.davivienda.daviviendaapp.bridges.generic.CoreGenericManager$liberenAWilli$2$$ExternalSyntheticLambda2
                    @Override // com.valid.vssh_android_core.model.LambdaError
                    public final void lambdaErrorResponse(Object obj2) throws Throwable {
                        CoreGenericManager.AnonymousClass2.$r8$lambda$HrC34NCF1hgWukrWD0qcpcZmn3c(channel3, (CoreErrorModelResponse) obj2);
                    }
                });
            } catch (Exception unused) {
                CoreGenericModelResponse coreGenericModelResponse = new CoreGenericModelResponse();
                coreGenericModelResponse.serviceName = Qg.kd("#ONJLx(FIH=5>6o\u0012@.?3i\n6+84-'a\u00032(\"$!tY", (short) (Od.Xd() ^ (1104099556 ^ (-1104108349))), (short) (Od.Xd() ^ ((843585630 ^ 824597268) ^ (-57561864)))) + this.$genericModel.endPoint;
                coreGenericModelResponse.message = hg.Vd("b\u000f\u000e\n\f8\u0007\u00055\u000b\u0007\u0006y0u}\u007f,x\u007fu|pvqi#kovna^pdigk", (short) (C1499aX.Xd() ^ ((677761287 ^ 1325595076) ^ (-1734814853))), (short) (C1499aX.Xd() ^ ((1987212322 ^ 1124378099) ^ (-896990452))));
                coreGenericModelResponse.statusCode = Boxing.boxInt((1261805051 ^ 256947605) ^ (-1147480175));
                Channel<Pair<Boolean, Object>> channel4 = this.$channel;
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                Utils utils = Utils.INSTANCE;
                short sXd = (short) (C1499aX.Xd() ^ (1730857914 ^ (-1730864241)));
                int[] iArr = new int["w\u0003\u007f?tp\u0005v\u0003towlh4ieykwidla]\\ji&Zebab`\u001fXTZ]Q]\u0018>\\PRX".length()];
                QB qb = new QB("w\u0003\u007f?tp\u0005v\u0003towlh4ieykwidla]\\ji&Zebab`\u001fXTZ]Q]\u0018>\\PRX");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Object[] objArr = {coreGenericModelResponse};
                Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Yd("A6F\u001aGK?\"AKCQID/RHJR9M\\ZZZ`S", (short) (C1499aX.Xd() ^ ((1188090934 ^ 1866081143) ^ (-703254929)))), Class.forName(C1561oA.yd(",94uC/755\u007fECH>25G>IGFB:?PTD\u000eRUGIU\u0018YM`^ZZdW\u001d3dhX;^h\\jfaHkegkRjyssw}l", (short) (OY.Xd() ^ (433818348 ^ 433824006)))));
                try {
                    method.setAccessible(true);
                    channel4.mo10484trySendJP2dKIU(new Pair<>(boolBoxBoolean, (WritableMap) method.invoke(utils, objArr)));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.davivienda.daviviendaapp.bridges.generic.CoreGenericManager$liberenAWilli$3, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!4i\bDRl|\u0004Oي8\u000bDB\rӬD \b\tvjg0TiX0hRX\u0010\u001az\\$\n&8ٜy"}, d2 = {"\n`]<a@F])\rS", "\u001aj^A_0G\u001d\u0004z~k\u0002", "", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Boolean, ? extends Object>>, Object> {
        final /* synthetic */ Channel<Pair<Boolean, Object>> $channel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Channel<Pair<Boolean, Object>> channel, Continuation<? super AnonymousClass3> continuation) {
            super(1850844204 ^ 1850844206, continuation);
            this.$channel = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$channel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends Boolean, ? extends Object>> continuation) throws Throwable {
            Class<?> cls = Class.forName(Jg.Wd("\r\u0018\u0013R\u0016\u0012$\u00168*#+.*s)z\u000f~\u000b\u000b\u0006\f\u0001\u0013\u0012\u001e\u001dg\u001b(\u001ennkv@vs\u0002\b\u0012\b~Xj\u0016\u001e_>[agqgf_p|l\u0002|\t?UQGIcUc5Xiihr,@", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (1633039780 ^ (-1390177991)))), (short) (C1633zX.Xd() ^ ((1001314706 ^ 977107152) ^ (-26469685)))));
            Class<?>[] clsArr = new Class[C1607wl.Xd() ^ (74762552 ^ 1781586656)];
            int iXd = C1499aX.Xd() ^ (698592319 ^ 1782108264);
            clsArr[0] = Class.forName(ZO.xd("Gld3p\u001fYSYK\r\u001e\u000e\t_\u001e~\",01i\u0011}\u000b<g\u0011p;_t\u0006", (short) (C1580rY.Xd() ^ (1962385741 ^ (-1962385112))), (short) (C1580rY.Xd() ^ iXd)));
            clsArr[1] = Class.forName(C1626yg.Ud("aM`pjj\u001fI\u0007Z!\u001e@Z]\u001dKU2\u0018\u001f3\u001f{t\u0004+{#\u0016", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (517536752 ^ (-1889336370)))), (short) (C1580rY.Xd() ^ (FB.Xd() ^ (512672883 ^ (-1096915294))))));
            Object[] objArr = new Object[650170134 ^ 650170132];
            objArr[0] = coroutineScope;
            objArr[1] = continuation;
            Method method = cls.getMethod(Ig.wd("(_W3d)", (short) (C1499aX.Xd() ^ (1768218345 ^ (-1768226518)))), clsArr);
            try {
                method.setAccessible(true);
                return method.invoke(this, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<Boolean, ? extends Object>> continuation) throws Throwable {
            Class<?> cls = Class.forName(EO.Od(",b\u0013wU/$_GJDo4;oDe\u0011<\u00063g\u0013\r4<m\u001e\u0012X5\f`KyWe\u0001\u0004xqX\u001f\u0011\u0007\u0006\nU\u0018_\u0007MV%K7\u001d\u0011IL<\u001eHm\u0010#[8]VnK\u0001l\u00043B A", (short) (OY.Xd() ^ (217403760 ^ 217394665))));
            Class<?>[] clsArr = new Class[OY.Xd() ^ 69929194];
            clsArr[0] = Class.forName(C1561oA.Qd("\u0006{\u0010yE\u0003v\u0003z@`rysp\u0001", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951484533)))));
            clsArr[1] = Class.forName(C1593ug.zd("\u001c!' \u001e$d\u001b(,*11'-%4o\u000633:06>+?5<<", (short) (C1607wl.Xd() ^ ((506500400 ^ 1944300855) ^ 1842574436)), (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (-1134252451)))));
            Object[] objArr = new Object[C1633zX.Xd() ^ (-1951491127)];
            objArr[0] = coroutineScope;
            objArr[1] = continuation;
            Method method = cls.getMethod(C1561oA.od(",:,'9)", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ (811621777 ^ 1579445924)))), clsArr);
            try {
                method.setAccessible(true);
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) ((Continuation) method.invoke(this, objArr));
                Object[] objArr2 = {Unit.INSTANCE};
                Method method2 = Class.forName(C1561oA.Kd("MZY\u001bRPfZh\\YcZX&][qesgdnecdtu4izrnrq\u0001<vu\u007fw\u0006}xDZ\b\f\u007fb\u0002\f\u0004\u0012\n\u0005o\u0005\u0013\u0007\u000e\r\u001bM\u0017\u0015\u000f\u0013!\u0015\u001fr\n\u001d!\" [k", (short) (C1633zX.Xd() ^ ((1437556907 ^ 1780983471) ^ (-1065930665))))).getMethod(C1561oA.Xd("%+4.+&\u0015875+5,", (short) (C1633zX.Xd() ^ (2102541313 ^ (-2102551156)))), Class.forName(Wg.Zd("\u0002xjS|yJV+..A(_;I", (short) (C1580rY.Xd() ^ ((1805002772 ^ 737288485) ^ (-1080324776))), (short) (C1580rY.Xd() ^ ((847944191 ^ 718985191) ^ (-407906751))))));
                try {
                    method2.setAccessible(true);
                    return method2.invoke(anonymousClass3, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.$channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException(Wg.vd("\u0006\u0005\r\u000eF\u001c\u0014EA\u000e}\r\u0014\r\u0002DR\u0016\u0016\u0018&*\u001aUQ\u0015\u0017 \u001e\u001b\u0012T\"ziun'gtljmmgma", (short) (FB.Xd() ^ (OY.Xd() ^ (1722642241 ^ 1652976399)))));
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreGenericManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, Qg.kd("\"\u0014\u000f\u0010 m\u0019\u0017\u001c\f\u001e\u0019", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (-69933052))), (short) (C1580rY.Xd() ^ ((1903366167 ^ 286151652) ^ (-1618828375)))));
    }

    public static /* synthetic */ void consumeGenericService$default(CoreGenericManager coreGenericManager, String str, int i2, String str2, boolean z2, boolean z3, boolean z4, boolean z5, ReadableMap readableMap, String str3, ReadableMap readableMap2, ReadableMap readableMap3, ReadableMap readableMap4, Callback callback, int i3, Object obj) throws Throwable {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            str = "";
        }
        if ((i3 & 2) != 0) {
            i2 = 10000;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            str2 = "";
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            z2 = true;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            z3 = false;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            z4 = true;
        }
        boolean z6 = (i3 & 64) == 0 ? z5 : true;
        String str4 = (-1) - (((-1) - i3) | ((-1) - 256)) == 0 ? str3 : "";
        Class<?> cls = Class.forName(hg.Vd(" +(g\u001d\u0019-\u001f+\u001d\u0018 \u0015\u0011\\\u0012\u000e\"\u0014 \u0012\r\u0015\n\u0006\u0005\u0013\u0012N\u0002\u0011\u0007\u0001\u0003\u007f\rF~{\u0004y\u0006{t>R}\u007fqRowmyohQdpbgdp", (short) (OY.Xd() ^ ((1092809269 ^ 884542189) ^ 1973151289)), (short) (OY.Xd() ^ (C1607wl.Xd() ^ (1092782702 ^ 795268318)))));
        Class<?>[] clsArr = new Class[C1633zX.Xd() ^ (-1951491130)];
        clsArr[0] = Class.forName(C1561oA.ud("cYmW#`T`X\u001eBb_UYQ", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (1910225071 ^ (-775213775))))));
        clsArr[1] = Integer.TYPE;
        clsArr[C1607wl.Xd() ^ 1849955288] = Class.forName(C1561oA.yd("{q\u0006o;xlxp6Zzwmqi", (short) (OY.Xd() ^ (1155488275 ^ 1155472004))));
        clsArr[Od.Xd() ^ 1207800918] = Boolean.TYPE;
        clsArr[ZN.Xd() ^ (547883421 ^ 321009513)] = Boolean.TYPE;
        clsArr[FB.Xd() ^ (1454332254 ^ 155203176)] = Boolean.TYPE;
        clsArr[Od.Xd() ^ 1207800915] = Boolean.TYPE;
        clsArr[ZN.Xd() ^ (61449692 ^ 807639851)] = Class.forName(C1561oA.Yd("@ML\u000eGCFIGUVS\u0017\\PMPb\u001dRc[W[Z$I]Z^\\^icLaq", (short) (ZN.Xd() ^ (FB.Xd() ^ 1609514285))));
        clsArr[1243503 ^ 1243495] = Class.forName(Xg.qd("\u0016\u000e$\u0010]\u001d\u0013!\u001bb\t+*\"(\"", (short) (C1499aX.Xd() ^ (702070122 ^ (-702066353))), (short) (C1499aX.Xd() ^ (Od.Xd() ^ (832374093 ^ (-1986055837))))));
        int i4 = 1501751516 ^ 1501751509;
        int iXd = ZN.Xd() ^ (1294654498 ^ 2124464455);
        int iXd2 = FB.Xd() ^ 1609526265;
        short sXd = (short) (C1607wl.Xd() ^ iXd);
        short sXd2 = (short) (C1607wl.Xd() ^ iXd2);
        int[] iArr = new int["\u0014\u001e\u001a\u001aO\b\nIER\u0010\n\u000bM\u007fy:K\u0003t\u000481spx\u001b,fg\"#kb\n\u001c(".length()];
        QB qb = new QB("\u0014\u001e\u001a\u001aO\b\nIER\u0010\n\u000bM\u007fy:K\u0003t\u000481spx\u001b,fg\"#kb\n\u001c(");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(xuXd.CK(iKK) - ((i5 * sXd2) ^ sXd));
            i5++;
        }
        clsArr[i4] = Class.forName(new String(iArr, 0, i5));
        int i6 = 670702334 ^ 670702324;
        int iXd3 = C1607wl.Xd() ^ 1849956111;
        short sXd3 = (short) (FB.Xd() ^ (1492938075 ^ 1492922674));
        short sXd4 = (short) (FB.Xd() ^ iXd3);
        int[] iArr2 = new int["%DF+q\rl<2nghx\u001cv!\u0001lC79\u0017dR9@KMX\u001bvU<&Zs\u001d".length()];
        QB qb2 = new QB("%DF+q\rl<2nghx\u001cv!\u0001lC79\u0017dR9@KMX\u001bvU<&Zs\u001d");
        int i7 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i7] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((i7 * sXd4) + sXd3)));
            i7++;
        }
        clsArr[i6] = Class.forName(new String(iArr2, 0, i7));
        clsArr[(251424190 ^ 1658265335) ^ 1814786882] = Class.forName(C1626yg.Ud("f_6lJRft\u000f@U BT Xz\b5|eNcY2fr\u0002\"L\u007f0p\u0015\rNc", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (-1849958021))), (short) (C1633zX.Xd() ^ ((335753790 ^ 1604345009) ^ (-1269002139)))));
        clsArr[Od.Xd() ^ (1230615625 ^ 245637136)] = Class.forName(Ig.wd("u-\u001b>\u00153\u001b\u000b=kg\f{@a\u0001*;*H\u001e>enmt%\u001f*Uq\u0016*Y", (short) (C1633zX.Xd() ^ ((971645758 ^ 424224035) ^ (-547571987)))));
        Object[] objArr = new Object[796632149 ^ 796632152];
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i2);
        objArr[Od.Xd() ^ (143079045 ^ 1333437138)] = str2;
        objArr[OY.Xd() ^ (1776860287 ^ 1841542292)] = Boolean.valueOf(z2);
        objArr[FB.Xd() ^ (1355761352 ^ 253766143)] = Boolean.valueOf(z3);
        objArr[1853672845 ^ 1853672840] = Boolean.valueOf(z4);
        objArr[771420830 ^ 771420824] = Boolean.valueOf(z6);
        objArr[1785196589 ^ 1785196586] = readableMap;
        objArr[(1587980677 ^ 584285884) ^ 2088097585] = str4;
        objArr[(132037585 ^ 1272011159) ^ 1276109391] = readableMap2;
        objArr[OY.Xd() ^ 69929186] = readableMap3;
        objArr[1519004425 ^ 1519004418] = readableMap4;
        objArr[C1633zX.Xd() ^ (-1951491129)] = callback;
        Method method = cls.getMethod(EO.Od("=\"dHc0:6\u0017\u0003qb(&\u0004~`d\u0012a&", (short) (Od.Xd() ^ (885945729 ^ (-885925813)))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(coreGenericManager, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final int getHttpMethodNumber(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == ((1897059886 ^ 1511690794) ^ 722032434)) {
            if (str.equals(C1561oA.od("pm{", (short) (ZN.Xd() ^ ((255115577 ^ 1946665675) ^ 2066945876))))) {
                return 0;
            }
        } else if (iHashCode == (C1499aX.Xd() ^ (-1134187005))) {
            if (str.equals(C1593ug.zd("]cc", (short) (OY.Xd() ^ (Od.Xd() ^ 1207798323)), (short) (OY.Xd() ^ (82878856 ^ 82897200))))) {
                return (1761328443 ^ 1039565306) ^ 1426930883;
            }
        } else if (iHashCode == (439030707 ^ 1842506264)) {
            if (str.equals(C1561oA.Qd("))/'5%", (short) (ZN.Xd() ^ (ZN.Xd() ^ 864699011))))) {
                return (302459462 ^ 1359958030) ^ 1124629067;
            }
        }
        return 1;
    }

    private final void initCore() throws Throwable {
        CoreHelper coreHelper = CoreHelper.INSTANCE;
        int iXd = ZN.Xd() ^ (-864702055);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("IVU\u0017NLbVdXU_VT\"YWmaoc`ja_`pq0fsrsvv7rpx}s\u0002>T\u0002\u0006y]{\u0004\t~\r", (short) (Od.Xd() ^ iXd))).getMethod(Wg.Zd("C~\u0012a\rMQ<L|\u0003e\u000eTD*C\u0012\u0005\u0015\bG", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (693191791 ^ 1560312175))), (short) (C1499aX.Xd() ^ (FB.Xd() ^ (463462382 ^ (-1148238551))))), new Class[0]);
        try {
            method.setAccessible(true);
            this.coreManager = (CoreGenericImp) method.invoke(coreHelper, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public final void consumeGenericService(String str, int i2, String str2, boolean z2, boolean z3, boolean z4, boolean z5, ReadableMap readableMap, String str3, ReadableMap readableMap2, ReadableMap readableMap3, ReadableMap readableMap4, Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(str, C1561oA.Xd("6/?4<2", (short) (Od.Xd() ^ ((136874490 ^ 1988468822) ^ (-2125288999)))));
        Intrinsics.checkNotNullParameter(str2, Wg.vd("1;2\u001f728?", (short) (FB.Xd() ^ (1806259930 ^ 1806263834))));
        Intrinsics.checkNotNullParameter(str3, Qg.kd("Q_W", (short) (Od.Xd() ^ (C1580rY.Xd() ^ 831076069)), (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951477263))));
        int iXd = ZN.Xd() ^ (-864691795);
        short sXd = (short) (C1580rY.Xd() ^ (796914806 ^ (-796914866)));
        short sXd2 = (short) (C1580rY.Xd() ^ iXd);
        int[] iArr = new int["\u000b\b\u0012\u0011\u0006\u0004\u0005\f".length()];
        QB qb = new QB("\u000b\b\u0012\u0011\u0006\u0004\u0005\f");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK) + sXd2);
            i3++;
        }
        Intrinsics.checkNotNullParameter(callback, new String(iArr, 0, i3));
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.ud("!,)h\u001e\u001a. ,\u001e\u0019!\u0016\u0012]\u0013\u000f#\u0015!\u0013\u000e\u0016\u000b\u0007\u0006\u0014\u0013O\u0003\u0012\b\u0002\u0004\u0001\u000eG\u007f|\u0005z\u0007|u?S~\u0001rSpxnzpiReqcheq", (short) (C1580rY.Xd() ^ ((1723975567 ^ 244146249) ^ (-1749857646))))).getDeclaredMethod(C1561oA.yd("\"& *w#%\u0017", (short) (FB.Xd() ^ (1916658124 ^ 1916655352))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, objArr);
            GenericModel genericModel = new GenericModel();
            Object[] objArr2 = {str};
            Method declaredMethod2 = Class.forName(C1561oA.Yd("+87x0.D8F:7A86\u0004;9OCQEBLCABRS\u0012GXPLPO^\u001aTS]Uc[V\"8ei]@_iaogbMbpdkjx", (short) (C1633zX.Xd() ^ ((1652484622 ^ 448711981) ^ (-2025859452))))).getDeclaredMethod(Jg.Wd("KO\u001c60v0S9\u000f@\u000e\u0010@%c&n:", (short) (C1633zX.Xd() ^ (971896861 ^ (-971871214))), (short) (C1633zX.Xd() ^ ((797077 ^ 1300712299) ^ (-1300973673)))), Class.forName(Xg.qd("\u0003z\u0011|J\n\u007f\u000e\bOu\u0018\u0017\u000f\u0015\u000f", (short) (OY.Xd() ^ (1032037881 ^ 1032032385)), (short) (OY.Xd() ^ ((1895912268 ^ 689218585) ^ 1477805757)))));
            try {
                declaredMethod2.setAccessible(true);
                genericModel.method = Integer.valueOf(((Integer) declaredMethod2.invoke(this, objArr2)).intValue());
                genericModel.endPoint = str2;
                genericModel.sslPinning = Boolean.valueOf(z2);
                genericModel.secureRequest = Boolean.valueOf(z3);
                genericModel.responseEncrypted = Boolean.valueOf(z4);
                genericModel.addSessionIdToRequest = Boolean.valueOf(z5);
                if (readableMap != null) {
                    genericModel.requestBody = readableMap.toHashMap();
                } else {
                    genericModel.requestBody = new HashMap();
                }
                genericModel.api = str3;
                if (readableMap2 != null) {
                    Utils utils = Utils.INSTANCE;
                    HashMap<String, Object> hashMap = readableMap2.toHashMap();
                    short sXd3 = (short) (OY.Xd() ^ ((2141115843 ^ 562166455) ^ 1579115837));
                    short sXd4 = (short) (OY.Xd() ^ (995773472 ^ 995778837));
                    int[] iArr2 = new int["\u000bpF\\_z7xvEI>lP:\fR}_\u001d^ \u0003GH^\t\u0006y{H\u0017a&-\u0016~7w]G,K\"lM\u0001[".length()];
                    QB qb2 = new QB("\u000bpF\\_z7xvEI>lP:\fR}_\u001d^ \u0003GH^\t\u0006y{H\u0017a&-\u0016~7w]G,K\"lM\u0001[");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd4) + sXd3)));
                        i4++;
                    }
                    Class<?> cls = Class.forName(new String(iArr2, 0, i4));
                    Class<?>[] clsArr = new Class[1];
                    short sXd5 = (short) (C1633zX.Xd() ^ (283969890 ^ (-283990144)));
                    short sXd6 = (short) (C1633zX.Xd() ^ ((1171495278 ^ 832606587) ^ (-1953722244)));
                    int[] iArr3 = new int["Ba\u001e8=S\u001fog0$\u0010\rA\u001ao\r".length()];
                    QB qb3 = new QB("Ba\u001e8=S\u001fog0$\u0010\rA\u001ao\r");
                    int i5 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i5] = xuXd3.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i5 * sXd6))) + xuXd3.CK(iKK3));
                        i5++;
                    }
                    clsArr[0] = Class.forName(new String(iArr3, 0, i5));
                    Object[] objArr3 = {hashMap};
                    Method method = cls.getMethod(Ig.wd("u?.b3gI&Viz{nrq\u0018\\", (short) (C1607wl.Xd() ^ ((484571259 ^ 182528013) ^ 369138022))), clsArr);
                    try {
                        method.setAccessible(true);
                        genericModel.headers = (Map) method.invoke(utils, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                if (readableMap3 != null) {
                    genericModel.additionalData = readableMap3.toHashMap();
                } else {
                    genericModel.additionalData = new HashMap();
                }
                if (readableMap4 != null) {
                    genericModel.principalData = readableMap4.toHashMap();
                } else {
                    genericModel.principalData = new HashMap();
                }
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(i2, genericModel, callback, null), (1984909345 ^ 1756758786) ^ 519656224, null);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return EO.Od("F\u0019Ph\u0004\u007fb#\f\u0004}\u0004g\u0001i\u000f2GO#T\u0010))O", (short) (ZN.Xd() ^ ((715655104 ^ 1033122907) ^ 389815290)));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object liberenAWilli(long r17, com.valid.vssh_android_core.model.GenericModel r19, kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, ? extends java.lang.Object>> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.davivienda.daviviendaapp.bridges.generic.CoreGenericManager.liberenAWilli(long, com.valid.vssh_android_core.model.GenericModel, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
