package androidx.compose.runtime;

import com.drew.metadata.photoshop.PhotoshopDirectory;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: compiled from: ProduceState.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d̉=!4i\bDJd|\u0004Oي8\u000b4C\u0007\"B\u0012\u007f\u0007|jA0ZeP.`S2\u000f\u0002{<$a&yCId\"}(\ng;u˧\u0007Pj\rS\u000fL\u0016'iLK[ތk\u0012?6PpW3\u0014om?nvN\u000761P;*\u000b\u000f\u001eBJ&u)F{\u0012 5XrPQ;P5E \fVG\u0007\u001dlo^<Xnm:u#1qRV7e@~]\rt^U\u0016\u0007e.-V6c\u0018SZΫ\u000bRaJIDџA\u0005v3?\u000eW֕o<h\u0002$\u0015qO;\\\u0013(bӤ_`<+9P{K\u0017\u000eX}\t}%>\u001a\r4*x4;\u001e~\n$2#u\u0004k^\bvi\u0006yq>'+\u00105;9af\u007fiK!^=\f\u0007\u001d\u001eQ\u000b\u001d*kX\u001eb+\u001a\u0003z\u007f8ҨD=NYP^ǀq\u0004~o\u001a\u0003\u0012\u0382_\u0006?}!.]%eZY%'ǽ\u0010Htk\u0005\u0006xh\u001ai\u0003NN$\u0007\u0018M)7\u000f\u000bor\u000b\u0004wZW<\u0019]\"d\t\u000e\bY \u000b\u007fL)5\u0016^Qxi\u0019W\f\u001353v9om\u001a\u0011\u0006@ӷ75WnVf؏z\u0014MJzkf٨ZY\u001c\\l(h2vi0y\u0002ͩ\\\fC6Mr44r1Ip#W\u001b(RG\u0003\bo\\~\u000f-Wa4#k:s7\u0004\u0001\b~u\u007f O+\rh23QSE\u0019lUPpD\u00053\r\u000fu\u0010G\u0016VuU|\u001a\u0006W\u0012\u001fD\u001dgXȠA\u0013\u0015\no7ī1EZ\u0004} [ȼ?\u0001\r{\u001f;/.\u0016\u0007\u000br2ߌxJ\u007fX%#\u000f^9#8\u0010\u000e\u007fym\u0001Fs\\\u001baNK\u0003\u0003 <|@\r\r/$5\u0003\u007f\"+?[L7!&y*.Cd\fpܓ2yh\u001alyФ\b,q(̚fd"}, d2 = {">q^1h*>A(z\n^", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\"", "7mXA\\(ED\u0015\u0006\u000b^", "9dh}", "", "9dh~", "9dh\u007f", ">q^1h*>`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u0001$EW}\u000eFi%.;AEv4s", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPyUJA.\u000f0RK@y\tU\u0017\u001e>h\u007fF`\u0019UCu\u0006J'wJchF\u001d(Ak)q\u0016c\u001co\u00048.\u001c|#)h\u001a;\u001a\u0005b\u0015zRCEqO$\u0005F$KC?\n,k^;\u00021#J\u000fA\u0010<`\u007f5\u0003-MA:?s\tSga,mt$,2", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015bc\u001cfyAc\u001aKx(??3pQcmy\u0011NUk9h\u0014_f:DB/\u001e\u007f\u0019(>4qpw\\\u0010\u007f\\}fz\u0011\u0017\u0005@/H{[\u0010R\u007f^Kx/\u001f\u0015i\u0007\u000eAXJ", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WwbkUJ#{N;\u001e\u001buG\fCs\u000b\u001a\u0016WBzyQZ\u0018GCr\u007fI4rTYlO+\u0005,^3c\u0019i![M\u0004\"\u001ey$%vPw\u0017\f\\ vZy1UV\u0015\n8y", "9dh@", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u00044IEz;\"\u001e2fJ\u000f--^\u007f%VPX5j\u001cSM\u001d\u0010i\u0012X4YZ@=-mQA#\u0007?\u0013\u007fEp\f\u0016$\u000e~w\u0001Ke\u0014Oy^SK1sPg_\u0007\u001d%\tI&m\u000bl'`9Mm\u0012{!&r^.S\tc\u001a\u0002V\u0002g15(vG$\u0014", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0012iJ3rL7he6Q\rEv\u0001\u0019kqxQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bRr3s\u0010g\u001d&(I #qn", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 5, mv = {1, 8, 0}, pn = "", xi = 48, xs = "4@5B>71Dy-85758)q46.3'*!i\r'\u0019')\u001d#'\u0005%\u0011#\u0013w ")
final /* synthetic */ class SnapshotStateKt__ProduceStateKt {
    public static final <T> State<T> produceState(T t2, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 10454275, "C(produceState)80@2911L41,81@2978L74,81@2957L95:ProduceState.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10454275, i2, -1, "androidx.compose.runtime.produceState (ProduceState.kt:79)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2143000241, "CC(remember):ProduceState.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t2, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        Unit unit = Unit.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, 2143002418, "CC(remember):ProduceState.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(function2);
        SnapshotStateKt__ProduceStateKt$produceState$1$1 snapshotStateKt__ProduceStateKt$produceState$1$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || snapshotStateKt__ProduceStateKt$produceState$1$1RememberedValue == Composer.Companion.getEmpty()) {
            snapshotStateKt__ProduceStateKt$produceState$1$1RememberedValue = new SnapshotStateKt__ProduceStateKt$produceState$1$1(function2, mutableState, null);
            composer.updateRememberedValue(snapshotStateKt__ProduceStateKt$produceState$1$1RememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) snapshotStateKt__ProduceStateKt$produceState$1$1RememberedValue, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mutableState;
    }

    public static final <T> State<T> produceState(T t2, Object obj, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1928268701, "C(produceState)113@4223L41,114@4290L74,114@4269L95:ProduceState.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1928268701, i2, -1, "androidx.compose.runtime.produceState (ProduceState.kt:112)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2143042225, "CC(remember):ProduceState.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t2, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 2143044402, "CC(remember):ProduceState.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(function2);
        SnapshotStateKt__ProduceStateKt$produceState$2$1 snapshotStateKt__ProduceStateKt$produceState$2$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || snapshotStateKt__ProduceStateKt$produceState$2$1RememberedValue == Composer.Companion.getEmpty()) {
            snapshotStateKt__ProduceStateKt$produceState$2$1RememberedValue = new SnapshotStateKt__ProduceStateKt$produceState$2$1(function2, mutableState, null);
            composer.updateRememberedValue(snapshotStateKt__ProduceStateKt$produceState$2$1RememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.LaunchedEffect(obj, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) snapshotStateKt__ProduceStateKt$produceState$2$1RememberedValue, composer, (-1) - (((-1) - (i2 >> 3)) | ((-1) - 14)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mutableState;
    }

    public static final <T> State<T> produceState(T t2, Object obj, Object obj2, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1703169085, "C(produceState)147@5571L41,148@5644L74,148@5617L101:ProduceState.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1703169085, i2, -1, "androidx.compose.runtime.produceState (ProduceState.kt:146)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2143085361, "CC(remember):ProduceState.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t2, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 2143087730, "CC(remember):ProduceState.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(function2);
        SnapshotStateKt__ProduceStateKt$produceState$3$1 snapshotStateKt__ProduceStateKt$produceState$3$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || snapshotStateKt__ProduceStateKt$produceState$3$1RememberedValue == Composer.Companion.getEmpty()) {
            snapshotStateKt__ProduceStateKt$produceState$3$1RememberedValue = new SnapshotStateKt__ProduceStateKt$produceState$3$1(function2, mutableState, null);
            composer.updateRememberedValue(snapshotStateKt__ProduceStateKt$produceState$3$1RememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.LaunchedEffect(obj, obj2, (Function2) snapshotStateKt__ProduceStateKt$produceState$3$1RememberedValue, composer, (-1) - (((-1) - (i2 >> 3)) | ((-1) - 126)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mutableState;
    }

    public static final <T> State<T> produceState(T t2, Object obj, Object obj2, Object obj3, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1807205155, "C(produceState)182@6956L41,183@7035L74,183@7002L107:ProduceState.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1807205155, i2, -1, "androidx.compose.runtime.produceState (ProduceState.kt:181)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2143129681, "CC(remember):ProduceState.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t2, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 2143132242, "CC(remember):ProduceState.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(function2);
        SnapshotStateKt__ProduceStateKt$produceState$4$1 snapshotStateKt__ProduceStateKt$produceState$4$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || snapshotStateKt__ProduceStateKt$produceState$4$1RememberedValue == Composer.Companion.getEmpty()) {
            snapshotStateKt__ProduceStateKt$produceState$4$1RememberedValue = new SnapshotStateKt__ProduceStateKt$produceState$4$1(function2, mutableState, null);
            composer.updateRememberedValue(snapshotStateKt__ProduceStateKt$produceState$4$1RememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.LaunchedEffect(obj, obj2, obj3, (Function2) snapshotStateKt__ProduceStateKt$produceState$4$1RememberedValue, composer, (-1) - (((-1) - (i2 >> 3)) | ((-1) - PhotoshopDirectory.TAG_QUICK_MASK_INFORMATION)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mutableState;
    }

    public static final <T> State<T> produceState(T t2, Object[] objArr, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 490154582, "C(produceState)215@8286L41,217@8430L74,217@8402L102:ProduceState.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(490154582, i2, -1, "androidx.compose.runtime.produceState (ProduceState.kt:214)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2143172241, "CC(remember):ProduceState.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t2, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        ComposerKt.sourceInformationMarkerStart(composer, 2143176882, "CC(remember):ProduceState.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(function2);
        SnapshotStateKt__ProduceStateKt$produceState$5$1 snapshotStateKt__ProduceStateKt$produceState$5$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || snapshotStateKt__ProduceStateKt$produceState$5$1RememberedValue == Composer.Companion.getEmpty()) {
            snapshotStateKt__ProduceStateKt$produceState$5$1RememberedValue = new SnapshotStateKt__ProduceStateKt$produceState$5$1(function2, mutableState, null);
            composer.updateRememberedValue(snapshotStateKt__ProduceStateKt$produceState$5$1RememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.LaunchedEffect(objArrCopyOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) snapshotStateKt__ProduceStateKt$produceState$5$1RememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mutableState;
    }
}
