package org.koin.core.scope;

import androidx.exifinterface.media.ExifInterface;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.MissingPropertyException;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.instance.InstanceContext;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.InstanceRegistry;
import org.koin.ext.KClassExtKt;
import org.koin.mp.KoinPlatformTimeTools;
import org.koin.mp.KoinPlatformTools;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: loaded from: classes2.dex */
@KoinDslMarker
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĩ\u0014D57\u001eq\u007fR܀kt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u0015rr9FDm߉6Ra3\u0017ӆ\u00044:[,qI;]\u001a\u0014\"\u0011Odgon`Z\u0013C\u0015\n\u001ex\u0001,QU\u000f]\u001a\u000fHBw?IMw=?n|6\u001b :\">|\r\u0001(*P\u0010|zKK\u001a08@v>Z\rc\u0005\"\u0012\fA(\u00014\\oNLHt]@?+\u0003\u007fBVϋg0\u0013M\u0015FZ)\u0015vo-3@=;\u001d%i\u0003\u000fRa?\u000b?\u007f<\rh-(1N\nɎf\\.\u0013}+.\r\u001e\u001c6`\u0013Rx\fU-_kYS&,&~d\r\u001b\t\u001e\f-H<32f6\u0015Cx\u0001[XP0g۰\u0004zo@_)\u000eaC9I\u0016\u001azIIf7*4=(12\u0007'kV\u001e`CÑ\u0003*\u0018ĸҨD=N\u0002R K\"\u001cp\u00111J\b6Ϛ\u000ed\u0012\u0010^\u001b3ms9iV\u001c\nNDu.\u001db~R\u0018TxP(n$oB\u0013\u001c`Th\u0015kVU\u0007e?\u007fLZ\r}\u0016M8\\&Cgؾ\u0016ʽShw&\u0016\u001d\u0018aGhMX5!.Y?ӔAj\u0002k\u001e\u001fjz$?Bc3\u0012\u0017HaCr^>!`J\u001b\"\u0006:\\\\\u001c\u0015B? 3J+_XE\u0017^\u0002|\u0003\b|ȤcZvQG\u0014Af\u001bij*)\u0003Vʔ~%\u0018\u0001Wi\u0015d2-GRcRV](hB4;\t\u0015r.I\u0018`MLzT\u000ec\f\"&\u001aghE<ANg+H\u0001\f\u0006ʆve_\u000fZf\t?\u0012\u000f\u0002\u001eNo\u000eξ~avirO\u0003\u0016R~dr1?|\u0002\u0010`t|wwZ\u0013i|a\u0001\u0013[LNf\u0014\u001b\u001eLdiq8{\u0014m\nڶ#ʯvҡڏ\u0019ak-8G\b'',\u0005g\u0014,*K\u001e\u0015qe8ծF~o}f\"RkIܰN3\u0014\u0016\u0007!:\u001d5XA+&\u0005jm\r5̎t<\\\u0015~\u0014s>#o\u00045\\\u0019r\u0013QC,`Y$W\u0003sisޮY\u0012;R\u001dG#\u007fAn\u0018\u001dkY\u001dWť\r0\u0014:`:O\u0003z\u0005j\u0012lu:\u0005 \rYS0;0|\u0006ʋmDG:P1SZ\u001eT~]\u0005\u00025hK`/a\u0019\u0001%2LzeE\u000bmT\u0013GqB\u0003c\u001d72\u0001N-&\u000e-ZS\u0018[Ϝ\\\u0001\u0019\u0007&\u0005WJN\u0006](4!\u0010\u0014>\u008e\u000bRX\u0017C9\u007f\u0010\u0010~6^\u0019\r|Pzu@h\u0003b(1\r9\u0015\u001cL\f\u001f\u000bGf\tn\u0011l5P\u000e6\"ZGӆJρ\u0006љƔgF)pNP;\u0007ajZ\\\u001c]YȌ\f=H U\u0003%%j\"&f8aΌ>\u0016\u007fa+%\u0017\\h Jcjzx˖<=^O022\u0017l$\u0004wODW/zRZK/.Ơglq<\u001e(\u00115IX\u0010ms\u0006=\u000f-Ӎ<H\u0001Zh\u0010\u0004$f[\u0018\u0014C*̢:\bptX_q8\tk}܀=3=<Be_4;\u001e\\$B\u0010\u0012{l*+:\u001d\u0003^l\u000fϞzwm\r\u0007jVc;\u05ca/ِ\u0001~V}Y]B\u0019\u000b$t1G\u0019e\u0011;\u001b\u0001\u000f\nـW[70z?I6b\u0013u(\u0005H\u001b<xs.,r\u000fx\u007fu\u0001EF\u0003\u0013J;_,{#\u001b4[GHB6C'\r?nC:6=;ZbԤWº@˒YM#\u000f\u001ew\u0017\u001dElgRk_/P!\u0015EƗ?!Pr_rQ.?w!Wtr=7{KU\u000e2kP~[8n\u000f\u0010\u0002yIK&\b\u0014X\u000e\u001a!4$4\r9~sp1,u[\u001f\u0017:ә\n܈)ޟ7H1\u001f\u0005x\"\u0011t\u0007&L|[\u0010cq\u000b\"r\\F:1r\u0006UM\u0017ݟ9\u001f-EBɞʷ\n)ArE\u001c]NX+w\"}3j;T\u0013\"\u0011\u0003oo\u0015\u0012G\u0007\u000fJ\b3\u009ab\u0019\u001bp{\tw\u0012N\u0011;\u000f4\u007f?\u0010x\u0004p\u001d\u001e(y0vHjXeOr\rP\u000fRuDA:Jn\u0018DGuBDJ\u0099\u0019\u0013A(<\fUsn}'\u001dW\u0011E\b+٠x|o[\u007f\u0010U;I\n\u001cL\t=s\u001a\u001dY1Kj,C9\u001b/<*n>H\u000e\t\u0018\u001c%|V F\tDV\u0005F/^\u0010g\\Y\\_\\e=\u05ee\u0014dܢ6bE@--9\u001don\u0001<S3\u00079\u001b\u0012W\u0018A\rN[Go;w\u001d1D|6\u0016\u0010UEsWw\u001bax%u\u001a\bLO4\u0005V\u0014nIgMX$(7(\f\u00124b\u0016ѕ\u0018hB_1ԕݜZ)V'*-tM\u0003\u001f\u000bv\u001c.:E\u0004\u0012&\f!d,5il\u001f:\u0005\u0080\u000bºSj\u0004ۑ6{t\u0004qMs2LտJқu\u0011kٔ0.|YtXl \u000eڴ\u0017ǿ\u0004Ê!2i҅X+6'ct\u0006lyfn$*jyD|\u0016\u0003ntDs@LH\u001b0\u0015e,0:Pr\u0011pvXC b\u001bCUL'\u0003O\u0005Wɠc\u008d\u0018CLԤ3i9S0r:Uc?UeV2x}\u0010\u0017\u0012\\a5Csj\u0001kѧJܯv\u0016t϶]2\n\t=C^\\F:;yGon(8/\\\f\u0013N\u0007S\u0001X,cʒh\u0003;  de]\u00184!\u00061@666XYsˬ`+6ߖ\u001e!\u0018g\n[=P\u0002\u0002KW V͇a$1Կ\u0002y&\u0013y6T\u007fXJgyr\u0013m.{ǿ5e%_Q\u0004\u001a\"Wͣf#}ܠJИN2*ҶQ\u001eD@bf\u001d\"[Mà\u00103\rw\u0014\\{iDukhLAkWӞ\u0003K5Ê\n\nQu{,նG\u0017Q\u0019@î|\u001ctc=ZM\u07fb\u000bY"}, d2 = {"\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "", "\u001ana4\"2HW\"H\u0003iuc\u0013-k{%\u0003@V", "Ab^=X\u0018NO \u0003{b,\n", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "7c", "", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roq\u001bL", "7rA<b;", "", "-j^6a", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041Q", "uK^?ZuD]\u001d\bD\\6\n\txq\u0010$\u0003D\u0002\u001b\u0017T9yLr,9Z\u0002 DC|3IT75;\u001a\u001ej+'\u0016p0Wx|<3X9^\u001cxG\u0018\u001b$\fX8\rN?K(w\u001az\u0010", "-bP9_):Q\u001f\r", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Rok8},2U{&\r", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "-b[<f,=", "5dc,^6B\\Wz\u0004g6\f\u0005>i\n1\n", "u(E", "5dc,^6B\\", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//e2\u007fIV", "-oP?T4>b\u0019\fhm(z\u000f\u0016o}$\u0003", "\u001aiPCTuEO\"\u0001DM/\n\t+df2y<\bl", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[N\u000eH\u0007%\u000b", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"H\u0003iuk\f<e{'bJ~\u0013\u001e\u001d", "5dc,c(KO!~\n^9j\u0018+c\u0006\u000f\u0006>|\u001eUCx\u0017F\u0006!D]\b)E", "5dc,c(KO!~\n^9j\u0018+c\u0006\u000f\u0006>|\u001e", "u(;7T=:\u001d z\u0004`uk\f<e{'bJ~\u0013\u001e\u001d", "-r^Be*>", "5dc,f6N`\u0017~9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "5dc,f6N`\u0017~", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc,f6N`\u0017~", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "1k^@X+", "5dc\u0010_6LS\u0018", "u(I", "5dc\u0016W", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ":h]8X+,Q#\nzl", ":nV4X9", "\u001ana4\"2HW\"Hxh9|R6o\u0002*{MJ}!Iq\u000eIL", "5dc\u0019b.@S&", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\u00072}B\u0001$`.y\u0010>v2\u000b", "5dc V6IS\u0005\u000fve0}\r/r", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\f8wG\u0005\u0018\u001bG|W(\u0007!<]~$7zk", "1k^@X", "", "1qT.g,", ":h]8f", "", "1qT.g,|Y#\u0003\u0004X*\u0007\u0016/", "2dR9T9>", "\"", "7mbAT5<S", "?tP9\\-BS&", "AdR<a+:`-m\u000fi,\u000b", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "/k[<j\u0016OS&\f~],", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bJ\u000e\u0019`My\u0012E@#?f}iC}\u00125QD?kAg\u0001x]@\u000bd0N\u0004|.QJ=X\u001c\u0003L\u0018\u0019$tR9\u001cZN\u0005\u0015", "4h]1<5(b\u001c~\bL*\u0007\u0014/", "1kPGm", ">`a.`,MS&\r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EL\u0016/QL?z8(\u001e>", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l.y\u001b>@+?]\u0007i5w#.\u0017OKg;\"\u0016laFPO<J}+HPN929xG#\u0019^\u0017\u00180\u001e\r#B4wBF#\u00125WK\u001cx\n\n%\u0012?s;\u0018\u001avLu&q\u000b0dO[)cDFE`9:", "5dc", "uK^?ZuD]\u001d\bD\\6\n\txq\u0010$\u0003D\u0002\u001b\u0017T9yLr,9Z\u0002 DC|4WRBo=g\u001ayi\u0003\bs5L\u0006+QU\\u=b{;#\u0016d\u0017\u0019\u0001Pk^=5j\u000e>\u001b\u0011.\u0013k8m\u0001\n%c", "5dc\u000e_3", "5dc\u0013e6FA#\u000f\b\\,", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l\u000bV\u00138\b!~`y)97\u007f+RC9z\n", "5dc\u0018b0G", "5dc\u001ce\u0015NZ ", "5dc\u001de6IS&\u000e\u000f", "9dh", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "2dU.h3MD\u0015\u0006\u000b^", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", "5dc\u001de6IS&\u000e\u000fH9e\u00196l", "5dc V6IS", "Ab^=X\u0010\u001d", "5dc b<KQ\u0019", "7mY2V;", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", ";nS2", "\u001aj^A_0G\u001d\u007fz\u0010r\u001b\u007f\u0016/a~\u0016wA\u0001&+/y\r<L", "7mY2V;(`\u0002\u000f\u0002e", "7r=<g\nE]'~y", ":h]8G6", "Ab^=X:", "", "uZ;<e.\bY#\u0003\u0004(*\u0007\u0016//\u000e&\u0006K\u0001`\u0005Ey\u0019<Lh&", "@dV6f;>`vz\u0002e)x\u00075", "1`[9U(<Y", "@db<_=>7\"\r\nZ5z\t", ">`a.`,MS&]z_", "uK^?ZuD]\u001d\bD\\6\n\txq\u0010$\u0003D\u0002\u001b\u0017T9yLr,9Z\u0002 DC|4WRBo=g\"hb@\u0007a;\u0018\\\u0005NH\\:29xG#\u0019^\u0017\u00180\u001e\r#B4wBF#\u00125WK\u001cx\n\n%\u0012?s;\u0018\u001avLu&q\u000b0dO[)cDFE`9:", "@db<_=>D\u0015\u0006\u000b^", "7mbAT5<Sv\t\u0004m,\u0010\u0018", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`+x\u001cKr.3Y[*@|\u0016A\\\u0019", "uK^?ZuD]\u001d\bD\\6\n\txq\u0010$\u0003D\u0002\u001b\u0017T9yLr,9Z\u0002 DC|4WRBo=g\"hb@\u0007a;\u0018\\\u0005NH\\:29|J\u0016[`\u0018R4V\u0003cN$8H@-\u0017(R\u007f;2d\u0015$\u001d1snB4\u001aP\t\u0015\tP~OLcn\u0001KJ\u000fg;lU`-e8I(\u001ez'dI`7\b\u000bW\u001b{\u001dO+NL\u0015\f4mEidH\u000fYRAt%.!", "Bga<j\u000b>T\u001d\b~m0\u0007\u0012\u0018o\u000f\t\u0006P\n\u0016", "", "BnBAe0GU", "Cm[6a2", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Scope {
    private final ArrayList<ScopeCallback> _callbacks;
    private boolean _closed;
    private final Koin _koin;
    private final ThreadLocal<ArrayDeque<ParametersHolder>> _parameterStackLocal;
    private Object _source;
    private final String id;
    private final boolean isRoot;
    private final ArrayList<Scope> linkedScopes;
    private final Qualifier scopeQualifier;

    /* JADX INFO: renamed from: org.koin.core.scope.Scope$declare$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\nNF\u0005Ӭ:\u0012\u000e\u0006-r˱4DkI"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class C14831 extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $allowOverride;
        final /* synthetic */ T $instance;
        final /* synthetic */ Qualifier $qualifier;
        final /* synthetic */ List<KClass<?>> $secondaryTypes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14831(T t2, Qualifier qualifier, List<? extends KClass<?>> list, boolean z2) {
            super(0);
            this.$instance = t2;
            this.$qualifier = qualifier;
            this.$secondaryTypes = list;
            this.$allowOverride = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            InstanceRegistry instanceRegistry = Scope.this.get_koin().getInstanceRegistry();
            final Object obj = this.$instance;
            Qualifier qualifier = this.$qualifier;
            List<KClass<?>> list = this.$secondaryTypes;
            boolean z2 = this.$allowOverride;
            Qualifier scopeQualifier = Scope.this.getScopeQualifier();
            String id = Scope.this.getId();
            Kind kind = Kind.Scoped;
            Intrinsics.needClassReification();
            Function2 function2 = new Function2<Scope, ParametersHolder, T>() { // from class: org.koin.core.scope.Scope$declare$1$invoke$$inlined$declareScopedInstance$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final T invoke(Scope _createDefinition, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(_createDefinition, "$this$_createDefinition");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return (T) obj;
                }
            };
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, function2, kind, list);
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier());
            InstanceFactory<?> instanceFactory = instanceRegistry.getInstances().get(strIndexKey);
            ScopedInstanceFactory scopedInstanceFactory = instanceFactory instanceof ScopedInstanceFactory ? (ScopedInstanceFactory) instanceFactory : null;
            if (scopedInstanceFactory != null) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                scopedInstanceFactory.refreshInstance(id, obj);
                return;
            }
            ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition);
            InstanceRegistry.saveMapping$default(instanceRegistry, z2, strIndexKey, scopedInstanceFactory2, false, 8, null);
            Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
            while (it.hasNext()) {
                InstanceRegistry.saveMapping$default(instanceRegistry, z2, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory2, false, 8, null);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.core.scope.Scope$inject$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<;!&i\u000eӵLcz\u0004OيH\u000btA\u001f*2ߚ\u0006\u0006|ia0re\u000f6ʂW,\u0015l\n6"}, d2 = {"\n`]<a@F])\rS", "\"", "", "7me<^,", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class C14841<T> extends Lambda implements Function0<T> {
        final /* synthetic */ Function0<ParametersHolder> $parameters;
        final /* synthetic */ Qualifier $qualifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14841(Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.$qualifier = qualifier;
            this.$parameters = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            Scope scope = Scope.this;
            Qualifier qualifier = this.$qualifier;
            Function0<ParametersHolder> function0 = this.$parameters;
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.core.scope.Scope$injectOrNull$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<;!&i\u000eӵLcz\u0004OيH\rDAE!L\u001a}јtiO/lev.\u0019[֖\u0013m\u000252]"}, d2 = {"\n`]<a@F])\rS", "\"", "", "7me<^,", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class C14851<T> extends Lambda implements Function0<T> {
        final /* synthetic */ Function0<ParametersHolder> $parameters;
        final /* synthetic */ Qualifier $qualifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14851(Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.$qualifier = qualifier;
            this.$parameters = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            Scope scope = Scope.this;
            Qualifier qualifier = this.$qualifier;
            Function0<ParametersHolder> function0 = this.$parameters;
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) scope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
        }
    }

    public Scope(Qualifier scopeQualifier, String id, boolean z2, Koin _koin) {
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this.scopeQualifier = scopeQualifier;
        this.id = id;
        this.isRoot = z2;
        this._koin = _koin;
        this.linkedScopes = new ArrayList<>();
        this._callbacks = new ArrayList<>();
        this._parameterStackLocal = new ThreadLocal<>();
    }

    public /* synthetic */ Scope(Qualifier qualifier, String str, boolean z2, Koin koin, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(qualifier, str, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? false : z2, koin);
    }

    public static /* synthetic */ void declare$default(Scope scope, Object obj, Qualifier qualifier, List secondaryTypes, boolean z2, int i2, Object obj2) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            qualifier = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            secondaryTypes = CollectionsKt.emptyList();
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            z2 = true;
        }
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        Intrinsics.needClassReification();
        koinPlatformTools.m10850synchronized(scope, scope.new C14831(obj, qualifier, secondaryTypes, z2));
    }

    private final <T> T findInOtherScope(KClass<?> kClass, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Iterator<Scope> it = this.linkedScopes.iterator();
        T t2 = null;
        while (it.hasNext() && (t2 = (T) it.next().getOrNull(kClass, qualifier, function0)) == null) {
        }
        return t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Scope scope, KClass kClass, Qualifier qualifier, Function0 function0, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            qualifier = null;
        }
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        return scope.get(kClass, qualifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Scope scope, Qualifier qualifier, Function0 function0, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            qualifier = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function0 = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    private final <T> T getFromSource(KClass<?> kClass) {
        T t2;
        if (!kClass.isInstance(this._source) || (t2 = (T) this._source) == null) {
            return null;
        }
        return t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Scope scope, KClass kClass, Qualifier qualifier, Function0 function0, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            qualifier = null;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function0 = null;
        }
        return scope.getOrNull(kClass, qualifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Scope scope, Qualifier qualifier, Function0 function0, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            qualifier = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function0 = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public static /* synthetic */ void get_koin$annotations() {
    }

    public static /* synthetic */ void get_parameterStackLocal$annotations() {
    }

    public static /* synthetic */ void get_source$annotations() {
    }

    public static /* synthetic */ Lazy inject$default(Scope scope, Qualifier qualifier, LazyThreadSafetyMode mode, Function0 function0, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            qualifier = null;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            mode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(mode, (Function0) scope.new C14841(qualifier, function0));
    }

    public static /* synthetic */ Lazy injectOrNull$default(Scope scope, Qualifier qualifier, LazyThreadSafetyMode mode, Function0 function0, int i2, Object obj) {
        if ((1 & i2) != 0) {
            qualifier = null;
        }
        if ((2 & i2) != 0) {
            mode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(mode, (Function0) scope.new C14851(qualifier, function0));
    }

    private final <T> T resolveInstance(Qualifier qualifier, KClass<?> kClass, Function0<? extends ParametersHolder> function0) throws ClosedScopeException {
        if (this._closed) {
            throw new ClosedScopeException("Scope '" + this.id + "' is closed");
        }
        ArrayDeque<ParametersHolder> arrayDeque = null;
        final ParametersHolder parametersHolderInvoke = function0 != null ? function0.invoke() : null;
        if (parametersHolderInvoke != null) {
            this._koin.getLogger().log(Level.DEBUG, new Function0<String>() { // from class: org.koin.core.scope.Scope.resolveInstance.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "| >> parameters " + parametersHolderInvoke + TokenParser.SP;
                }
            });
            arrayDeque = this._parameterStackLocal.get();
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque<>();
                this._parameterStackLocal.set(arrayDeque);
            }
            arrayDeque.addFirst(parametersHolderInvoke);
        }
        T t2 = (T) resolveValue(qualifier, kClass, new InstanceContext(this._koin.getLogger(), this, parametersHolderInvoke), function0);
        if (arrayDeque != null) {
            this._koin.getLogger().debug("| << parameters");
            arrayDeque.removeFirstOrNull();
        }
        return t2;
    }

    private final <T> T resolveValue(Qualifier qualifier, KClass<?> kClass, InstanceContext instanceContext, Function0<? extends ParametersHolder> function0) throws NoBeanDefFoundException {
        Object obj;
        ParametersHolder parametersHolderFirstOrNull;
        T t2 = (T) this._koin.getInstanceRegistry().resolveInstance$koin_core(qualifier, kClass, this.scopeQualifier, instanceContext);
        if (t2 == null) {
            this._koin.getLogger().debug("|- ? t:'" + KClassExtKt.getFullName(kClass) + "' - q:'" + qualifier + "' look in injected parameters");
            ArrayDeque<ParametersHolder> arrayDeque = this._parameterStackLocal.get();
            Object obj2 = null;
            t2 = (arrayDeque == null || (parametersHolderFirstOrNull = arrayDeque.firstOrNull()) == null) ? null : (T) parametersHolderFirstOrNull.getOrNull(kClass);
            if (t2 == null) {
                if (!this.isRoot) {
                    this._koin.getLogger().debug("|- ? t:'" + KClassExtKt.getFullName(kClass) + "' - q:'" + qualifier + "' look at scope source");
                    Object obj3 = this._source;
                    if (obj3 != null && kClass.isInstance(obj3) && qualifier == null && (obj = this._source) != null) {
                        obj2 = obj;
                    }
                }
                t2 = (T) obj2;
                if (t2 == null) {
                    this._koin.getLogger().debug("|- ? t:'" + KClassExtKt.getFullName(kClass) + "' - q:'" + qualifier + "' look in other scopes");
                    t2 = (T) findInOtherScope(kClass, qualifier, function0);
                    if (t2 == null) {
                        if (function0 != null) {
                            this._parameterStackLocal.remove();
                            this._koin.getLogger().debug("|- << parameters");
                        }
                        throwDefinitionNotFound(qualifier, kClass);
                        throw new KotlinNothingValueException();
                    }
                }
            }
        }
        return t2;
    }

    private final Void throwDefinitionNotFound(Qualifier qualifier, KClass<?> kClass) throws NoBeanDefFoundException {
        String str;
        if (qualifier == null || (str = " and qualifier '" + qualifier + '\'') == null) {
            str = "";
        }
        throw new NoBeanDefFoundException("No definition found for type '" + KClassExtKt.getFullName(kClass) + '\'' + str + ". Check your Modules configuration and add missing type and/or qualifier!");
    }

    public final void close() {
        KoinPlatformTools.INSTANCE.m10850synchronized(this, new Function0<Unit>() { // from class: org.koin.core.scope.Scope.close.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Scope.this.get_koin().getLogger().debug("|- (-) Scope - id:'" + Scope.this.getId() + '\'');
                ArrayList arrayList = Scope.this._callbacks;
                Scope scope = Scope.this;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ScopeCallback) it.next()).onScopeClose(scope);
                }
                Scope.this._callbacks.clear();
                Scope.this.set_source(null);
                Scope.this._closed = true;
                Scope.this.get_koin().getScopeRegistry().deleteScope$koin_core(Scope.this);
            }
        });
    }

    public final void create$koin_core(List<Scope> links) {
        Intrinsics.checkNotNullParameter(links, "links");
        this.linkedScopes.addAll(links);
    }

    public final /* synthetic */ <T> void declare(T t2, Qualifier qualifier, List<? extends KClass<?>> secondaryTypes, boolean z2) {
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        Intrinsics.needClassReification();
        koinPlatformTools.m10850synchronized(this, new C14831(t2, qualifier, secondaryTypes, z2));
    }

    public final <T> T get(KClass<?> clazz, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        String str;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this._koin.getLogger().isAt(Level.DEBUG)) {
            return (T) resolveInstance(qualifier, clazz, function0);
        }
        if (qualifier == null || (str = " with qualifier '" + qualifier + '\'') == null) {
            str = "";
        }
        this._koin.getLogger().display(Level.DEBUG, "|- '" + KClassExtKt.getFullName(clazz) + '\'' + str + TokenParser.SP + (this.isRoot ? "" : "- scope:'" + this.id) + "...");
        long timeInNanoSeconds = KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds();
        T t2 = (T) resolveInstance(qualifier, clazz, function0);
        this._koin.getLogger().display(Level.DEBUG, "|- '" + KClassExtKt.getFullName(clazz) + "' in " + ((KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds() - timeInNanoSeconds) / 1000000.0d) + " ms");
        return t2;
    }

    public final /* synthetic */ <T> T get(Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public final /* synthetic */ <T> List<T> getAll() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getAll(Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final <T> List<T> getAll(KClass<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        List<T> all$koin_core = this._koin.getInstanceRegistry().getAll$koin_core(clazz, new InstanceContext(this._koin.getLogger(), this, null, 4, null));
        ArrayList<Scope> arrayList = this.linkedScopes;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((Scope) it.next()).getAll(clazz));
        }
        return CollectionsKt.plus((Collection) all$koin_core, (Iterable) arrayList2);
    }

    public final boolean getClosed() {
        return this._closed;
    }

    public final String getId() {
        return this.id;
    }

    public final Koin getKoin() {
        return this._koin;
    }

    public final Logger getLogger() {
        return this._koin.getLogger();
    }

    public final <T> T getOrNull(KClass<?> clazz, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        T t2 = null;
        try {
            t2 = (T) get(clazz, qualifier, function0);
            return t2;
        } catch (ClosedScopeException unused) {
            this._koin.getLogger().debug("* Scope closed - no instance found for " + KClassExtKt.getFullName(clazz) + " on scope " + this);
            return t2;
        } catch (NoBeanDefFoundException unused2) {
            this._koin.getLogger().debug("* No instance found for type '" + KClassExtKt.getFullName(clazz) + "' on scope '" + this + '\'');
            return t2;
        }
    }

    public final /* synthetic */ <T> T getOrNull(Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public final <T> T getProperty(String key) throws MissingPropertyException {
        Intrinsics.checkNotNullParameter(key, "key");
        T t2 = (T) this._koin.getProperty(key);
        if (t2 != null) {
            return t2;
        }
        throw new MissingPropertyException("Property '" + key + "' not found");
    }

    public final <T> T getProperty(String key, T defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (T) this._koin.getProperty(key, defaultValue);
    }

    public final <T> T getPropertyOrNull(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this._koin.getProperty(key);
    }

    public final Scope getScope(String scopeID) {
        Intrinsics.checkNotNullParameter(scopeID, "scopeID");
        return getKoin().getScope(scopeID);
    }

    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    public final /* synthetic */ <T> T getSource() {
        T t2 = (T) get_source();
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t2;
    }

    public final Koin get_koin() {
        return this._koin;
    }

    public final ThreadLocal<ArrayDeque<ParametersHolder>> get_parameterStackLocal() {
        return this._parameterStackLocal;
    }

    public final Object get_source() {
        return this._source;
    }

    public final /* synthetic */ <T> Lazy<T> inject(Qualifier qualifier, LazyThreadSafetyMode mode, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(mode, (Function0) new C14841(qualifier, function0));
    }

    public final /* synthetic */ <T> Lazy<T> injectOrNull(Qualifier qualifier, LazyThreadSafetyMode mode, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(mode, (Function0) new C14851(qualifier, function0));
    }

    public final boolean isNotClosed() {
        return !getClosed();
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    public final void linkTo(Scope... scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        if (this.isRoot) {
            throw new IllegalStateException("Can't add scope link to a root scope".toString());
        }
        CollectionsKt.addAll(this.linkedScopes, scopes);
    }

    public final void registerCallback(ScopeCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this._callbacks.add(callback);
    }

    public final void set_source(Object obj) {
        this._source = obj;
    }

    public String toString() {
        return "['" + this.id + "']";
    }

    public final void unlink(Scope... scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        if (this.isRoot) {
            throw new IllegalStateException("Can't remove scope link to a root scope".toString());
        }
        CollectionsKt.removeAll(this.linkedScopes, scopes);
    }
}
