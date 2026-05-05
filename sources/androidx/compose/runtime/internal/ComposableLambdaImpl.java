package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
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
/* JADX INFO: compiled from: ComposableLambda.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r+4ߚ\u007f\u0007tʑA0JhP.hS2şs{BCc$wCCU0}*\tUaog|Jb\u000bI\u0011\f\u0015\u000f̓\\I\u0004w\u001e/\u001f6PoW3{pM=nvN\u0005N52>\b\t\u0019\u001c@G>{ټGK\u001a\u0018xY~Hj\u000fc\u0004H\u00176B.\u00106\\\u0016^fLznR/Q\u00040ŀNo\u0003>\u000be\u000f\\SU\u0012'g,=X9K\u0014SX3\u000b`jW\u0003m\u0002m\tv8?+wt\u001e̓XHA#9g\u000fsqTa5Wn\u001e?-ebyU>.\u0006\u000e\u0014\u000fR\u0003<\u000bWL<<2f6\u001ecx\u0001dXP0_\tȬz*m%3\u00185A8Ik\u0002gI+f9\u0012\u0004;#S\u0007|4sV$_C \u0005}_EiBSG|\u000f\nA{\u0013\tb0:44U\u0011G{?/]½7$z1/\u0004\u0004^C\u0016{5fve\u0002T^?PsF=8\u001c$\\Zc3p\u0001Zf@)O2S5\u00038\u0019.q\u0010>7$>S\u007flwye]85_jEj\u0007k<X\u007fӫ3}\u001dq\u001eyT\r\u0013mA\u0013\u000bfxZU\"Y\u000b-R8V}(y\u0012C|\u0011C8M\u000646B0GaEN\u00113ZC\u0013\b\u000e_\u0019\u0016\rjK&\u0019hRy9\u0005^k\to\u0016\ty0\u000bq:-oR{Ӿ&\u001ewvB\u0015%\u001d}\"\u0005wmZYdn,t\u0004\u0001P\u001c(Li1S\u0012=\u0004Y8\u0010A]N\td\u007fRB-\t\u0012\u0012\u0011Qg\\l8p~Bxl`N\u0003\u001cR|l\n;\nz~(fv~Url\u000b\nNyv\u0011jTNf}Kȫ\u001em`}0\u00157CBU\"F}\"A-csh\u001e3*h\u001d9\rg\u001a+\u0012\u001b h_qJ=NH\b\u0004n(2\u0002\u001bD^i&\rr\u000fB#KJWc\u001f[hS\u0019F\u0016h\u001d+;u\u0007aH+\b\u007fJ-\u000e/$G\f#vCS!}Wu~\u0006K\u000b\f\u0011ؑ\nSe?|*\u001eS\u001f\u0005\\\u0013\u000f>\u0018\f\u001aL@ig5B\u00177L.R\u00079H\u0005o\u0014$\u0013\u0002\\^=\u001cbH\u0002Pn\u0010jw\u000b[x\u000bn[x#@\u007f-\u0014c$\u0007LI\u0007\u0004E\u00034\u00148\u000fk5\u000b1i}\u0004\u0017+9]l;1'\u0007\u0006;IkRa\u0002d\u0014w-{|\b\ff\u0019CܟB`\u000fG_)a\r/\r\u0010\u0006j\\v\u000f\u0014|Q|'Y\u0005\t\u0010&> \u000e9\u001e\u007fx}vENdveHJ\u0007%YA\t\"{\u0012KK3\u0014KE?_iB,,]aR\u0016\n6\u001fU\t%'jo&h \\I?Fw${\u001a\u000b)ON\t^P\u0003\r\"0\u001e5}\u0007c\u0006!mqk&1p+9}\u001eByi?Ɣc5̡mc\u0019\u001bhGU(s]V+\u001b?OD\u0012\u0007_j\u0017a3p\u0013\u0016\u0013C+O<\u0016vA\u0012eb\u0017u\u001cUi\"C1\u0002)\u00106`X,\u00147{\f\u0003XYX\u001bIme@z\b\u000bqr]\u001cv\u0003*zs:.D\u0003\rav\u0013)3twNj=Q1!q\fue7\nSd>#GQm g6\u0019~@v?\u0013jf\u0003\u0011BB7s0k:I^Tk\u001bmک$6Ѹ\u00024Y]:X\u0007Z\u0016>\u0017=lP\"T[H!kWAT1\u0013\u0017\u0014f\u000b \r'I\u0003Si$X\u0006-\u0007\u001bT\u00123\u00029\"<#)=%\b\u001dmei*ekZ>$\u0004{I-R\u0014\\\u001dyDKKDL~\u0006F\u000e#7&:\u0005$(0K?bBar?\u0005x\b\n4ENpZ\"uq)y\u0018I\u0002\u001a\nc\nfdE\t#1Dl:]p\u0015Veh(\ft\u0011S0O\u000f4*yٱ|XޝpN9atc.\u000bbl\u0019\u0002\u0016R4w5(Lp_8\u0019E\u0014jb\u0019o\u001eWm$P\u0014#\f2|aXn\u0015x\u001f.&y{v<j\u000feCx\nn\u0014Td<Y$\r\u001c\u0015\\MG\b\fbx\u0017)2uxqM o\u0014#3\u0010\n*6+u\u0005_Akp\u0007Bi9\u0019\tbZKd\u000b\n\u0006'Y\u0002C\u0017\u0016iY3w\\L8BZ\u001c\rsix\u0014R\b\\(\u001c@`4^\u0010rC\f\u0002L#Kq-e-3)۰[-ʕ*Ee\u0007Tk\"[}2\t\u001eS1\u0015!\u001d\u0002>b)\u0002 I@\u0012\u0007\u000bN\u0006\u0003{](\u0005wIO46E=Vcnldm\u001e\bE\r\"8):\u0005A)\u0013m!\u0001&$u\u0002z;\u0007/Vcq\u0013|A\u0019\u0014+z\u001aG$:k\u0005k\u000bAh*OSaV+\\u9M]\u0006\u0014,{n\u0015y\nSSH\u000e\u001bT0 \u0016\u0014Um2\u0007SrWl\u001c\b,N2\u001a\u001c3%\u0010\u0001x->&mc\u001cz$Xn\"q4\u001a1\u0015}\u0001\u0003|>\u0012?\u0003¨laːN\f)iFx\b\u000fuxG\u001et\u0005.=5voI\u0007\u000f^y\u0019*6r{SmAN:c8R\f*wP\u0014#\u0003c\u000e\u0014*bc<\u001b\u0006D~+\u0004lk#\nz\u001ce2\u001aj]7v`N4E\\=l\u0017\rZ\u0014\u001a\u0016\u001d.\u0005R\u0001V&%\u0001~\u0017%4\u0019o\\iM/.\u001b\u001bR\u0007`R\t\u0001|ut'Dz4$BH\nS\u0005C\nza\\\"UB|6+\u0014h&%=q ${L9N\u0018gAa<\\\u0010\u0007\bL\nE\u0010\u001b:)R\tE+\u0010dLJ`#iæ\u000f~ϝIt|\u0011'\u001fd:4%{\u001cD\u0006@\ne\fldGKhu\u0001[,]v8QW\u0002\u0017-]\rw\u001bjUZ\u0003\u000e]SSD77u\u0012G(uvZp\u001c(\u000epK\u0004<\u0012F1\u0019\u001bQ<2rh\u0005k%U\u0012\u0016K/%\u0016\u001b=\".SF3yxi\u0016:7uM=_`|\rZ\u0010VebD ,`Z|\rI\u00075Qr8.;[wnPEa\u0012\u0007{S8fvpX5\u0018\u0018.83~c>=y^\u007fMit\b\u0004(>+|^ q^Bwah1G[6\u000fzjZl%A5mt֭v;͢>#\u0010BG8\u001cqjIm\u0013H\u0005=sg\u0002i+$|ns)F|4&CG-*&&\u001e~#`dU\u0004\u0016XJ)\u000bHH^\u000e\"\u001b}N\u001b48FaEa\b1-\u000e^\rG5\u001339@\r.'\u0010qCu#A:E)uIr9\u0016*c=\u000bCP%\u007fJ8\u001e;m\u0012U\tAg\u000f}\u000e>a2Fr7R|s\fL\u0003q\u0001v\r\u0015\u007fwJ|\u0017yLDV\u0015VXI4z^Z&\n-t\u001d\u001c?7,:1:s`!j\u000b\u0016q\rQ\u0011\u0017\u00118|Dp@c;S\u00054\u0012\u0019\tQ^[\u0018LumF\u0013\u0010-ʺP\f٩]\u0003L\u0002~\u001e0K\t6QsD4;_xOpdF0=z\u0016:d:\u0012|V;.NaR!gAKy>\u0014/\u0013Vi#\t_L\u001f\t!rG1wd\r%:uAr\u0002x]U\u0003G[\u0007G\u001c-%ffg)Y~:\u001e[fkNU\u001b\u001b9\u0003\u000e\u000b\u0002K:\"blEW\u0004\u001c#BG/<~`\u0003@\f\u001bb\u0019%(p\bL0Xa}/F\u0018sm?Y\bcAfd\u0004Hm2\u0004tH5\u0012V);,3,\u0019KrVcrqimxr\f=6moUSdw\u0011|J7\"D\u0006\u0002ykdU0\u001c7Ua1`\u0003<TZ\f\u00150w\u0013\u0013ĒBZ݀1N,\u0018\u001dlew9x{jH\u0005_Z(,\u0013\u0017<{Q$O[U\\\u000bf#m~\u0017u\rU\u0015\u0018o\u001d +\u0015\u0001Rl\u0014\n\u0016,1@^\u0002i2\u0010\u0001\bYx&`\u0019HcbGD%\u00196BV6\n9T\u0018:,Qdz\\Msf5404z*#-\u001ft\u0001@f\u001cuHO:Kx\u0005fG\u000fxxm&~mg\u001c\u0019\u0010JEb^\r&]e\u00192b\u001fi\u0012\u0002\u0007\u00023`[OIo\u0007\u0006K\u001d\u000e<@]k5n3=\u001fEY\r.)UV&`\u00110N'\u001b*+CN+B-\u001bbU \r\u0013d,5\u000fe_|\u0002!ZJ\u0019ya!7@FmGc|sqi&%ǧ\fY34T!\u001aW\u000e\u001d*\u0003<\u0007d:a\u007f]x7^\u000b\"i\u007f\u0014VzE(B?:Y@gF\u001fv%QG\u0016N\u0004C\u0012\u0015hR\u0006}_]K˘y̡\\\u0014:ȱnRHx j\u0007eП\u007f^vĐ^-e6T\"`0;4~yf(g+9Ճ\rܜvYmѲ/;\u0001Cu\u0007\u0010qwE\u0015R[L\u0014-L\u0601\u0007ϑ]Ttγ;\u0005bGTd%E\u0003ƉNƬ$\f\u0014ØՂ<I"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u0012E\u0006%Bby'\u0001K 6XMIg1%\u0015O]A\u0004b(2~2N\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u0012E\u0006%Bby'\u0001K 6XMIg1%\u0015O]A\u0004b($", "9dh", "", "BqP0^,=", "", "0k^0^", "", "uHI\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016D\b", "-a[<V2", "5dc\u0018X@", "u(8", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u0011", "Ab^=X:", "", "7me<^,", "1", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\r", "1gP;Z,=", ">0", ">1", ">2", ">3", ">4", ">5", ">6", ">7", ">8", ">0\u001f", "1gP;Z,=\u001f", ">0 ", ">0!", ">0\"", ">0#", ">0$", ">0%", ">0&", ">0'", "BqP0^\u0019>O\u0018", "", "1n\\=b:>`", "BqP0^\u001eKW(~", "CoS.g,", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ComposableLambdaImpl implements ComposableLambda {
    public static final int $stable = 0;
    private Object _block;
    private final int key;
    private RecomposeScope scope;
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaImpl(int i2, boolean z2, Object obj) {
        this.key = i2;
        this.tracked = z2;
        this._block = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Composer composer, Integer num) {
        return invoke(composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Composer composer, Integer num) {
        return invoke(obj, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Composer composer, Integer num) {
        return invoke(obj, obj2, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function7
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function8
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function9
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function10
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function11
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function13
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, composer, num.intValue(), num2.intValue());
    }

    @Override // kotlin.jvm.functions.Function14
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, composer, num.intValue(), num2.intValue());
    }

    @Override // kotlin.jvm.functions.Function15
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, composer, num.intValue(), num2.intValue());
    }

    @Override // kotlin.jvm.functions.Function16
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, composer, num.intValue(), num2.intValue());
    }

    @Override // kotlin.jvm.functions.Function17
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, composer, num.intValue(), num2.intValue());
    }

    @Override // kotlin.jvm.functions.Function18
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, composer, num.intValue(), num2.intValue());
    }

    @Override // kotlin.jvm.functions.Function19
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, composer, num.intValue(), num2.intValue());
    }

    @Override // kotlin.jvm.functions.Function20
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, composer, num.intValue(), num2.intValue());
    }

    @Override // kotlin.jvm.functions.Function21
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, composer, num.intValue(), num2.intValue());
    }

    public final int getKey() {
        return this.key;
    }

    private final void trackWrite() {
        if (this.tracked) {
            RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            List<RecomposeScope> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.get(i2).invalidate();
                }
                list.clear();
            }
        }
    }

    private final void trackRead(Composer composer) {
        RecomposeScope recomposeScope;
        if (this.tracked && (recomposeScope = composer.getRecomposeScope()) != null) {
            composer.recordUsed(recomposeScope);
            if (ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
                this.scope = recomposeScope;
                return;
            }
            List<RecomposeScope> list = this.scopes;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.scopes = arrayList;
                arrayList.add(recomposeScope);
                return;
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (ComposableLambdaKt.replacableWith(list.get(i2), recomposeScope)) {
                    list.set(i2, recomposeScope);
                    return;
                }
            }
            list.add(recomposeScope);
        }
    }

    public final void update(Object obj) {
        if (Intrinsics.areEqual(this._block, obj)) {
            return;
        }
        boolean z2 = this._block == null;
        this._block = obj;
        if (z2) {
            return;
        }
        trackWrite();
    }

    public Object invoke(Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(0) : ComposableLambdaKt.sameBits(0);
        Object obj = this._block;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 2)).invoke(composerStartRestartGroup, Integer.valueOf((i2 + iDifferentBits) - (i2 & iDifferentBits)));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            scopeUpdateScopeEndRestartGroup.updateScope((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this, 2));
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(1) : ComposableLambdaKt.sameBits(1);
        Object obj2 = this._block;
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj2, 3)).invoke(obj, composerStartRestartGroup, Integer.valueOf(iDifferentBits | i2));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ComposableLambdaImpl.this.invoke(obj, composer2, RecomposeScopeImplKt.updateChangedFlags(i2) | 1);
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(2) : ComposableLambdaKt.sameBits(2);
        Object obj3 = this._block;
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function4) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj3, 4)).invoke(obj, obj2, composerStartRestartGroup, Integer.valueOf((iDifferentBits + i2) - (iDifferentBits & i2)));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2) | 1);
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(3) : ComposableLambdaKt.sameBits(3);
        Object obj4 = this._block;
        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function5) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj4, 5)).invoke(obj, obj2, obj3, composerStartRestartGroup, Integer.valueOf(iDifferentBits | i2));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, composer2, (-1) - (((-1) - RecomposeScopeImplKt.updateChangedFlags(i2)) & ((-1) - 1)));
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = (-1) - (((-1) - (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(4) : ComposableLambdaKt.sameBits(4))) & ((-1) - i2));
        Object obj5 = this._block;
        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function6) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj5, 6)).invoke(obj, obj2, obj3, obj4, composerStartRestartGroup, Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ComposableLambdaImpl composableLambdaImpl = ComposableLambdaImpl.this;
                    Object obj6 = obj;
                    Object obj7 = obj2;
                    Object obj8 = obj3;
                    Object obj9 = obj4;
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2);
                    composableLambdaImpl.invoke(obj6, obj7, obj8, obj9, composer2, (iUpdateChangedFlags + 1) - (iUpdateChangedFlags & 1));
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = (-1) - (((-1) - i2) & ((-1) - (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(5) : ComposableLambdaKt.sameBits(5))));
        Object obj6 = this._block;
        Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function7) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj6, 7)).invoke(obj, obj2, obj3, obj4, obj5, composerStartRestartGroup, Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, composer2, RecomposeScopeImplKt.updateChangedFlags(i2) | 1);
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(6) : ComposableLambdaKt.sameBits(6);
        Object obj7 = this._block;
        Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function8) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj7, 8)).invoke(obj, obj2, obj3, obj4, obj5, obj6, composerStartRestartGroup, Integer.valueOf((i2 + iDifferentBits) - (i2 & iDifferentBits)));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, composer2, RecomposeScopeImplKt.updateChangedFlags(i2) | 1);
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(7) : ComposableLambdaKt.sameBits(7);
        Object obj8 = this._block;
        Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function9) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj8, 9)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, composerStartRestartGroup, Integer.valueOf((i2 + iDifferentBits) - (i2 & iDifferentBits)));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, composer2, RecomposeScopeImplKt.updateChangedFlags(i2) | 1);
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = (-1) - (((-1) - i2) & ((-1) - (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(8) : ComposableLambdaKt.sameBits(8))));
        Object obj9 = this._block;
        Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function10) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj9, 10)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, composerStartRestartGroup, Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ComposableLambdaImpl composableLambdaImpl = ComposableLambdaImpl.this;
                    Object obj10 = obj;
                    Object obj11 = obj2;
                    Object obj12 = obj3;
                    Object obj13 = obj4;
                    Object obj14 = obj5;
                    Object obj15 = obj6;
                    Object obj16 = obj7;
                    Object obj17 = obj8;
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2);
                    composableLambdaImpl.invoke(obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, composer2, (iUpdateChangedFlags + 1) - (iUpdateChangedFlags & 1));
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(9) : ComposableLambdaKt.sameBits(9);
        Object obj10 = this._block;
        Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Function11<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function11) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj10, 11)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, composerStartRestartGroup, Integer.valueOf((i2 + iDifferentBits) - (i2 & iDifferentBits)));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, composer2, (-1) - (((-1) - RecomposeScopeImplKt.updateChangedFlags(i2)) & ((-1) - 1)));
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, Composer composer, final int i2, int i3) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(10) : ComposableLambdaKt.sameBits(10);
        Object obj11 = this._block;
        Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.Function13<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function13) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj11, 13)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, composerStartRestartGroup, Integer.valueOf(i2), Integer.valueOf(i3 | iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    ComposableLambdaImpl composableLambdaImpl = ComposableLambdaImpl.this;
                    Object obj12 = obj;
                    Object obj13 = obj2;
                    Object obj14 = obj3;
                    Object obj15 = obj4;
                    Object obj16 = obj5;
                    Object obj17 = obj6;
                    Object obj18 = obj7;
                    Object obj19 = obj8;
                    Object obj20 = obj9;
                    Object obj21 = obj10;
                    int i5 = i2;
                    composableLambdaImpl.invoke(obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, composer2, (i5 + 1) - (1 & i5), i5);
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, Composer composer, final int i2, final int i3) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(11) : ComposableLambdaKt.sameBits(11);
        Object obj12 = this._block;
        Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Function14<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function14) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj12, 14)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, composerStartRestartGroup, Integer.valueOf(i2), Integer.valueOf(i3 | iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.11
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, composer2, RecomposeScopeImplKt.updateChangedFlags(i2) | 1, RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, Composer composer, final int i2, final int i3) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(12) : ComposableLambdaKt.sameBits(12);
        Object obj13 = this._block;
        Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.Function15<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function15) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj13, 15)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, composerStartRestartGroup, Integer.valueOf(i2), Integer.valueOf(i3 | iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.12
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, composer2, (-1) - (((-1) - RecomposeScopeImplKt.updateChangedFlags(i2)) & ((-1) - 1)), RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, Composer composer, final int i2, final int i3) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(13) : ComposableLambdaKt.sameBits(13);
        Object obj14 = this._block;
        Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Function16<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function16) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj14, 16)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, composerStartRestartGroup, Integer.valueOf(i2), Integer.valueOf((i3 + iDifferentBits) - (i3 & iDifferentBits)));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.13
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, composer2, RecomposeScopeImplKt.updateChangedFlags(i2) | 1, RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, final Object obj14, Composer composer, final int i2, final int i3) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(14) : ComposableLambdaKt.sameBits(14))));
        Object obj15 = this._block;
        Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.Function17<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function17) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj15, 17)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, composerStartRestartGroup, Integer.valueOf(i2), Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.14
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    ComposableLambdaImpl composableLambdaImpl = ComposableLambdaImpl.this;
                    Object obj16 = obj;
                    Object obj17 = obj2;
                    Object obj18 = obj3;
                    Object obj19 = obj4;
                    Object obj20 = obj5;
                    Object obj21 = obj6;
                    Object obj22 = obj7;
                    Object obj23 = obj8;
                    Object obj24 = obj9;
                    Object obj25 = obj10;
                    Object obj26 = obj11;
                    Object obj27 = obj12;
                    Object obj28 = obj13;
                    Object obj29 = obj14;
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2);
                    composableLambdaImpl.invoke(obj16, obj17, obj18, obj19, obj20, obj21, obj22, obj23, obj24, obj25, obj26, obj27, obj28, obj29, composer2, (iUpdateChangedFlags + 1) - (iUpdateChangedFlags & 1), RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, final Object obj14, final Object obj15, Composer composer, final int i2, final int i3) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(15) : ComposableLambdaKt.sameBits(15);
        Object obj16 = this._block;
        Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Function18<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function18) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj16, 18)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, composerStartRestartGroup, Integer.valueOf(i2), Integer.valueOf((i3 + iDifferentBits) - (i3 & iDifferentBits)));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.15
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, composer2, RecomposeScopeImplKt.updateChangedFlags(i2) | 1, RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, final Object obj14, final Object obj15, final Object obj16, Composer composer, final int i2, final int i3) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(16) : ComposableLambdaKt.sameBits(16))));
        Object obj17 = this._block;
        Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type kotlin.Function19<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'p16')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function19) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj17, 19)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, composerStartRestartGroup, Integer.valueOf(i2), Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.16
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    ComposableLambdaImpl composableLambdaImpl = ComposableLambdaImpl.this;
                    Object obj18 = obj;
                    Object obj19 = obj2;
                    Object obj20 = obj3;
                    Object obj21 = obj4;
                    Object obj22 = obj5;
                    Object obj23 = obj6;
                    Object obj24 = obj7;
                    Object obj25 = obj8;
                    Object obj26 = obj9;
                    Object obj27 = obj10;
                    Object obj28 = obj11;
                    Object obj29 = obj12;
                    Object obj30 = obj13;
                    Object obj31 = obj14;
                    Object obj32 = obj15;
                    Object obj33 = obj16;
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2);
                    composableLambdaImpl.invoke(obj18, obj19, obj20, obj21, obj22, obj23, obj24, obj25, obj26, obj27, obj28, obj29, obj30, obj31, obj32, obj33, composer2, (iUpdateChangedFlags + 1) - (iUpdateChangedFlags & 1), RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, final Object obj14, final Object obj15, final Object obj16, final Object obj17, Composer composer, final int i2, final int i3) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(17) : ComposableLambdaKt.sameBits(17))));
        Object obj18 = this._block;
        Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Function20<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'p16')] kotlin.Any?, @[ParameterName(name = 'p17')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function20) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj18, 20)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, composerStartRestartGroup, Integer.valueOf(i2), Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.17
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, composer2, RecomposeScopeImplKt.updateChangedFlags(i2) | 1, RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, final Object obj14, final Object obj15, final Object obj16, final Object obj17, final Object obj18, Composer composer, final int i2, final int i3) {
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(18) : ComposableLambdaKt.sameBits(18))));
        Object obj19 = this._block;
        Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.Function21<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'p16')] kotlin.Any?, @[ParameterName(name = 'p17')] kotlin.Any?, @[ParameterName(name = 'p18')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function21) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj19, 21)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, composerStartRestartGroup, Integer.valueOf(i2), Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.18
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, composer2, RecomposeScopeImplKt.updateChangedFlags(i2) | 1, RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
        return objInvoke;
    }
}
