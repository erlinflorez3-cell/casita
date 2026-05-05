package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
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
/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d̉=!,u\bӵLc\u000b\u0004I\u00066\u000b6B\r\"4ߚ\u007f\u0007|jA0ZeP.hS2\u000fq{<$iҕyCAY\"}0\u0018WNmhvJp\u000bK\u000f\u001c\u0016\u0001jBI]xc\u0016\u00172XoG3SpE9vt>ӌ(288\u0002\u0005\u0007\u001a2H&v\u0003CQ\f*TNsRR;Q5/ \u000bV1\u0011 lg|7Xnm:]*1oŌR'e8CRϘJT5\u0016\u000f\u0010,.X7c\u0019UY\u0011\u0011j]U\u0002m|m\u001av,?<Yug6\u0007\u0001$\u0017;O;d!,ػ\tQf\u0014m0յgK^\u001a@0\t~%<2\u00126-V8E\u001c|\u0007<>%xaMh\u0004tA.\u0006\u0012K%*\u0018D;;+f\u007fbK\u001b^7*\f;$ţ\u0005n'c\u001b\u0013\u05ce\u0019\u001bb\u0006is_CUH|\u000e\nC{\u000e\td\u0018)2;w\u0006=\t)0-$efi)/z\u001aJZf%\u0010\u0011}anjYP$~\u0016e+\u0019\u000ejD\u0013\f\u001aVԜ\\,\u0017UbYΘ\u0002\b!0t4J$=\u0010|S\u0019}x^u\u001455l6ip\u0002\r\u0006D\rEUSy\u000f\u0010]')MAz\u0016hhRS:[l*22vq>}ԞHN\u0012\u001bxDۇ 4:D1/#\\\u001b\u001epE-\u000fmd\u0001\u0012\u0015Sa/3o2\u0002!\u0003f[\u001fz\u0018~W;\u0015b8,o\\e>4j:\n:{3\t\u000fs.^wTWR|\u0018\u0006U*$D2IU??)\u000e-4`\u0018βILxm\u0018Rɟ+z\u000b\u0013'\u0004vB\u007f\b\u0019t\\fxTgV-!%i#)\u0016q\u0018{wE)R\u0014y\u0019pVjx\u0002i>^8+\u001c/&5\u0007\u007f$\r5[GU5&{$1+`\ft\u001eDԃf\u000f,|,\tНg\u0016}|i\u001c@OPI\b\u0003n(2v\u001bD^i&\u0013r.B\"KiGc\u0001XHM9F\u000en\u00172\u001drf[h\u0017\u001e\u0016D2o,\nB,\u001f\rYѼ\u0015MYo4rљ`\u000bX*\"W\nE\u0007\u0012JAPjes!:\u0016y\u001e5Q=x\u0004j\u0014RFL>\u001e\nq_\u001a+\u001e\u0010\u0018ge\u000e'4Rsim\u001e\\\tbfJ\u0015`sdOB\u0011\u0003\u001f54wc<3\u0004ܑX/i:GX\u009b\r\u001bxk\u0017\u001b3?\\Tg\u001fX}\u000f ]~IH\u00128\u0014GW\u0005{w\u001c>(~-BF\u001fgi!c\u00072t\n\u0004o|zʝ\u0016fXVh.Ή~|\u001cY\"(\u00197gr\u001ef]V\\|OI*\u0003'DW\u000b:\u001c*Kɴ1\u0006CMU_x5?{\u0006jk\u0002\u0016B8'2\u0018Q`e2~\n\f@\u0001\u0015\n7p(!\u0013~74?Px\u00011F\u0013FQ\u0012306\rxŸ{!FOq˒\f\u05ffOh\u00073\u0004xqߛm\u000b1e\bؿLӊ1P%ԔGY<\u0013pZh\u0012*ݳZӜ\u0004\u0014\u001dұ?B\u0016dA\u0010}b?ҷ>Ϫ_\r3Ԛ֝.\f"}, d2 = {"\u0012hb=b::P ~Z_-|\u0007>N\n\u0013wM|\u001fvT|\u0018I", "", "\u0017mc2e5:Zw\u0003\ti6\u000b\u0005,l\u007f\b|A\u0001\u0015&5m\u0018Gv", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l@\u00050?gy\u001d>mu/NC9z\"\u001c\u001fsa\u000f", "\u001a`d;V/>Rx\u007f{^*\fq9P{5wH`$$Q|", "\u0012hb=b::P ~Z_-|\u0007>", "", "3eU2V;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l@\u00050?gy\u001d>mu/NC9z!\u001e#xhH\\", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001pHJ", "9dh}", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0012iJ3rL7he6Q\rEv\u0001\u0019kqx[", "9dh~", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WvbkUJ#{N;\u001e\u001buG\fCs\u000b\u001a\u0016WBzyQZ\u0018GCr\u007fI4rTYlO+\u00056", "9dh\u007f", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015ac\u001cfyAc\u001aKx(??3pQcmy\u0011NUk9h\u0014_f:DB/\u001e\u007f\u0019(>4qz", "9dh@", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0007!&Ns\u0017\u0006{6=#~0@k%2WLI5\u0015.\u001efp=\u0011lw$]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNfQ-}H?\u001fQ\nS\nFr\u000f\f#c\u0019.a", "\u001a`d;V/>Rx\u007f{^*\f", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015bc\u001cfyAc\u001aKx(??3pQcmy\u0011NUk9h\u0014_f:DB/\u001e\u007f\u0019(>4qz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WwbkUJ#{N;\u001e\u001buG\fCs\u000b\u001a\u0016WBzyQZ\u0018GCr\u007fI4rTYlO+\u00056", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0012iJ3rL7he6Q\rEv\u0001\u0019kqx[", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0007!&Ns\u0017\u0006{6=#~0@k%2WLI5\u0015.\u001efp=\u0011lx$]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNfQ-}H?\u001fQ\nS\nFr\u000f\f#c\u0019.a", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001pHJ", "!hS28-?S\u0017\u000e", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001pHJ", "1qT.g,\u001c]!\n\u0005l0\f\r9n]2\tJ\u0011&\u001bPo{:\u000105", "1na<h;B\\\u0019\\\u0005g;|\u001c>", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "1n\\=b:>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\r", "@d\\2`)>`v\t\bh<\f\r8em&\u0006K\u0001", "5dc\u0010b5MS,\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l@\u0005!<`\b2\u0015w\u001e9WQ7h;\u001erdh@\u00159", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001ph\u001d(*xS>#\u0011?\u0013\u007fEu\u000b\u001c%\u0012>j~\f4\u001aT\u0004%\u0005E2h4Wi\u0005G\u0017", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class EffectsKt {
    private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";
    private static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();
    private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    public static final void SideEffect(Function0<Unit> function0, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288466761, i2, -1, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        composer.recordSideEffect(function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007O\u000fE\u0001\b\u0016YdL\r\u0001V\u001a/b\u001cY\u001e:\u0019(\u001cd\u0006\\wnS43tm\fsT\riwKK]yE\u0017o\u001392YZ<rCH\u0017\u001eZSX#wHAv\u0011u@*P=\u0010e'G\u0005L\u0015M\u000fJBApbuzg$s;\u0004~5T\u001f9\u007f\u001d!\u0010\u001eX\u0018%\"Rvf\t\u001beE@jb]>%]>q\u0006-eAW\t\u0019\u0017nt}\u001dZ`f\u001f2a\u007f>\u0003Y\u007f\u000b\u000411\n}|N\u001fb3Krq\u001fz'AmR\"uv_\u000e\u001d\u0007tN0\u001a-%fJ: \u0001D\\M4oP$nS/\u001b'v>l1at=s^9-7")
    @InterfaceC1492Gx
    public static final void DisposableEffect(Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> function1, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -904483903, "C(DisposableEffect):Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-904483903, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:119)");
        }
        throw new IllegalStateException(DisposableEffectNoParamError.toString());
    }

    public static final void DisposableEffect(Object obj, Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> function1, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1371986847, "C(DisposableEffect)P(1)156@6277L47:Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1371986847, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1176206231, "CC(remember):Effects.kt#9igjgp");
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new DisposableEffectImpl(function1);
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final void DisposableEffect(Object obj, Object obj2, Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> function1, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1429097729, "C(DisposableEffect)P(1,2)196@8163L53:Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1429097729, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1176266589, "CC(remember):Effects.kt#9igjgp");
        boolean z2 = (-1) - (((-1) - (composer.changed(obj) ? 1 : 0)) & ((-1) - (composer.changed(obj2) ? 1 : 0))) == 1;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new DisposableEffectImpl(function1);
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final void DisposableEffect(Object obj, Object obj2, Object obj3, Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> function1, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1239538271, "C(DisposableEffect)P(1,2,3)237@10087L59:Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1239538271, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:236)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1176328163, "CC(remember):Effects.kt#9igjgp");
        boolean z2 = (-1) - (((-1) - ((-1) - (((-1) - (composer.changed(obj) ? 1 : 0)) & ((-1) - (composer.changed(obj2) ? 1 : 0))) != 1 ? 0 : 1)) & ((-1) - (composer.changed(obj3) ? 1 : 0))) == 1;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new DisposableEffectImpl(function1);
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final void DisposableEffect(Object[] objArr, Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> function1, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1307627122, "C(DisposableEffect)P(1)277@11983L48:Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1307627122, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:276)");
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        ComposerKt.sourceInformationMarkerStart(composer, -568225417, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean zChanged = false;
        for (Object obj : objArrCopyOf) {
            zChanged |= composer.changed(obj);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(function1));
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u000fG\u0011Ct|\u001a[=M.\u007fS)k[q_\u001df\u0015z\u001bh\u007fJs*]\u0003)&w^$O\\nmx\r)8SX\u0016\\z4YU@yCF%K[\u001cE/68\u0007x\u0015}<[_\u0006\u0001\u001d+\f\u0001V$H\u000fZm77\u0013\u0004CX[Z|5\u0004%L\u0015*c!\u001b\u0010<fQ!-Bvi\u007f++SH_kPp3W>@..tFW\u0010\u0017\tEmz-W\u0017\\\u0010%'}L<W\f\tS3=\u0004vu\nrh=!zlKl\u001dmkOpwmgZ!K&J'^g  S<#\u00016NR'^__;N5\u0017jj;k1Y~8sg<\u0019)4\u00036D--\u0018O")
    @InterfaceC1492Gx
    public static final void LaunchedEffect(final Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-805415771);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LaunchedEffect):Effects.kt#9igjgp");
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-805415771, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:318)");
            }
            throw new IllegalStateException(LaunchedEffectNoParamError.toString());
        }
        composerStartRestartGroup.skipToGroupEnd();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.EffectsKt.LaunchedEffect.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    Function2<CoroutineScope, Continuation<? super Unit>, Object> function22 = function2;
                    int i4 = i2;
                    EffectsKt.LaunchedEffect(function22, composer2, RecomposeScopeImplKt.updateChangedFlags((i4 + 1) - (i4 & 1)));
                }
            });
        }
    }

    public static final void LaunchedEffect(Object obj, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1179185413, "C(LaunchedEffect)P(1)339@14347L58:Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1179185413, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2064965204, "CC(remember):Effects.kt#9igjgp");
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LaunchedEffectImpl(applyCoroutineContext, function2);
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final void LaunchedEffect(Object obj, Object obj2, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 590241125, "C(LaunchedEffect)P(1,2)362@15355L64:Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590241125, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2064997466, "CC(remember):Effects.kt#9igjgp");
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LaunchedEffectImpl(applyCoroutineContext, function2);
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final void LaunchedEffect(Object obj, Object obj2, Object obj3, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -54093371, "C(LaunchedEffect)P(1,2,3)386@16393L70:Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-54093371, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:384)");
        }
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2065030688, "CC(remember):Effects.kt#9igjgp");
        boolean z2 = (-1) - (((-1) - ((composer.changed(obj) ? 1 : 0) | (composer.changed(obj2) ? 1 : 0))) & ((-1) - (composer.changed(obj3) ? 1 : 0))) == 1;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LaunchedEffectImpl(applyCoroutineContext, function2);
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final void LaunchedEffect(Object[] objArr, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -139560008, "C(LaunchedEffect)P(1)412@17562L59:Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-139560008, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:410)");
        }
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        ComposerKt.sourceInformationMarkerStart(composer, -568225417, "CC(remember)P(1):Composables.kt#9igjgp");
        int i3 = 0;
        for (Object obj : objArrCopyOf) {
            boolean zChanged = composer.changed(obj);
            int i4 = (i3 + (zChanged ? 1 : 0)) - (i3 & (zChanged ? 1 : 0));
            i3 = 1;
            if (i4 != 1) {
                i3 = 0;
            }
        }
        Object objRememberedValue = composer.rememberedValue();
        if (i3 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, function2));
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final CoroutineScope createCompositionCoroutineScope(CoroutineContext coroutineContext, Composer composer) {
        if (coroutineContext.get(Job.Key) != null) {
            CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            completableJobJob$default.completeExceptionally(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return CoroutineScopeKt.CoroutineScope(completableJobJob$default);
        }
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        return CoroutineScopeKt.CoroutineScope(applyCoroutineContext.plus(JobKt.Job((Job) applyCoroutineContext.get(Job.Key))).plus(coroutineContext));
    }

    public static final CoroutineScope rememberCoroutineScope(Function0<? extends CoroutineContext> function0, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            function0 = new Function0<EmptyCoroutineContext>() { // from class: androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1
                @Override // kotlin.jvm.functions.Function0
                public final EmptyCoroutineContext invoke() {
                    return EmptyCoroutineContext.INSTANCE;
                }
            };
        }
        ComposerKt.sourceInformationMarkerStart(composer, -954367824, "CC(remember):Effects.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new CompositionScopedCoroutineScopeCanceller(createCompositionCoroutineScope(function0.invoke(), composer));
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd(composer);
        return coroutineScope;
    }
}
