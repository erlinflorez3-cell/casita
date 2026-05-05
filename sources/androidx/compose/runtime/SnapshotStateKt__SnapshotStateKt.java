package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.reflect.KProperty;
import yg.InterfaceC1492Gx;

/* JADX INFO: Access modifiers changed from: package-private */
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
/* JADX INFO: compiled from: SnapshotState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d̉=!4i\bDJc|\u0004O\u00158\u000b4B\u0007\"B\u0012\u007f\u0007lkA0ZeP.XS2\u000f\u0002{<$a$yCQU\"}(\tWN}gvJ`\rK\u000f\u0014ǝ\u0001̓4Ikxe\u0012\u00152JoM3UoC9htD!(݅*8\b\u001f\tɝBZ\u001e͌\u0013I[\u000e\"0\u0007phQ-O\u000b܅ \u0006\u0005%\u0019Ijɡf<Xnm:u#1hbP-ڿ>|}\u001dTU?\u0015\u0007e$*P7{\u0015SU#\u0007\u0019[\u0006\bӭu=\u0013k?E9M\fcFZ\u0010\u0014[1_\u000fmrlc3V\u0001\u000e-˃]ikR\u0014'\u0006\u0002B\u0012TS\u001c\n?T>/*fN\u0014Cv\u0003S\u0007W0cb\u0002\u0001ʨD\u001dE\u00029*G\"\u0017yoC1bG\f\u000b\f./\u0011p1[\u001b\u0014p\u0017+T>X_Zn?hZ\u001a[MmJvr\u0004:\u0004vN.8B\u0016ѧ\u001b%EeQR/v\u001aNTi\u0007\u0005'h\u0002urJF̎|\u0016g.\u0017\u0019rD+\u0005\u001c\\ZX:\u001fe\"d\t\u000e\bY \u000b\u0007\u0003&ٚ\u0014N]x\u0002\n[n\"+?hGY5k<iY`9̐_c@e`\n,?\u0003bK]ڋFS\u001antZ0G`jVw\u001cFTۼ!2gw,6<1_\\CZ3$PW\u0015\u000buY\u0017'/\\A<\u001bm4t\u000f\u0002~u7טo֑M,\u000bz:gOlM\u0019TqBj:ê1\u0007'y\u0010IwL\u000eL\u001b\"&[\n6.\u001cOP]TC\u0017\rAJ\u0006=ERs\u0014j}\u00165\b\u0015yU;/ֲoŰnp:}\u0003d]r/(\u0007`\u0003#Nd.x\u0002H\u0001òqT3aNK\u0003\u0003 <|W\u00157->=\r\u007f$\r5sI7\u001f&wZ6Cf}kuЃ\bh/(zd\u00123\f(\u007fpaiB=HI \u0005N$4lIIvs&)ɠ\rV"}, d2 = {";tc.U3>A(z\n^\u0013\u0001\u0017>O\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0003w]H\u0007J0\\\u0006|", "\"", "3kT:X5Ma", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u0013 F|\u0018@u8~W\b(Bw$.\u0017PKtC\"\u001dh+G\u0010_7\\y1VZ\u0018\u001aeN}K\u0017\u001ci{]'\u001c\u0005@E2}\u001a", ";tc.U3>A(z\n^\u0014x\u0014\u0019f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0003w]H\u0007K(YL", "\u0019", "$", ">`X?f", "\u001aj^A_0G\u001d\u0004z~k\u0002", "uZ;8b;EW\"HeZ0\n^rL{1zM\u000b\u001b\u0016Z9\fF~0?g}iD}\u001f=QK;5B'\u0011so<\u0011r:\u0018d0CW\\/fa`L\u0010!ZuJ6b", ";tc.U3>A(z\n^\u0016}", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "D`[BX", ">n[6V@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/\u001f}%*\\GEt\u001f(\u001cl_M\\", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_;]LJo<\u001e^Vj5\u0012q/X\u0006\u000fW[J;`\\{(\u001e\u0019^\fb\u0001PkUJ#{N;\u001e\u001buG\fCs\u000b\u001a\u0016WBzyQZ\u0018GC|\u0006P%eMYM\tCPE8", "@d\\2`)>`\t\nyZ;|\b\u001dt{7{", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "<df#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_;]LJo<\u001e^FkA\u0012m:N\u0004|+\u00105(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8QG(\u00170Q\u0002\u0005V\u0010\b%\u000e\u000b", "5dc#T3NS", "BgX@B)C", "", ">q^=X9Mg", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[E", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*\u0006!DYS\u0007<i'*\u0017J7t6g~ef9\u0005r\u00025|1VSR5&_r>\u001b\u0012X\u001d\u0018\u0011w\u0012cL${SKtK\u0013N}LdJ\u0013\u0012\u001774Z?[\u0010E\tj", "Adc#T3NS", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW$\u000741V\u0005 %|\u0012=M\u0019\"p0/\u00112h5\u0010eu8s,GJ]\u0002CX|L\u001b\u0016cW[+\u000e\fY?38*\",\u00127I\u000fJ|Vr\u001b\nFf:IR\u0019IC~rF)fU/#j", "Bn<Bg(;Z\u0019l\nZ;|o3s\u000f", "", "Bn<Bg(;Z\u0019l\nZ;|p+p", "", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 5, mv = {1, 8, 0}, pn = "", xi = 48, xs = "4@5B>71Dy-85758)q46.3'*!i\r'\u0019')\u001d#'\u0005%\u0011#\u0013w ")
public final /* synthetic */ class SnapshotStateKt__SnapshotStateKt {
    public static /* synthetic */ MutableState mutableStateOf$default(Object obj, SnapshotMutationPolicy snapshotMutationPolicy, int i2, Object obj2) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return SnapshotStateKt.mutableStateOf(obj, snapshotMutationPolicy);
    }

    public static final <T> MutableState<T> mutableStateOf(T t2, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return ActualAndroid_androidKt.createSnapshotMutableState(t2, snapshotMutationPolicy);
    }

    public static final <T> T getValue(State<? extends T> state, Object obj, KProperty<?> kProperty) {
        return state.getValue();
    }

    public static final <T> void setValue(MutableState<T> mutableState, Object obj, KProperty<?> kProperty, T t2) {
        mutableState.setValue(t2);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return new SnapshotStateList<>();
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(ArraysKt.toList(tArr));
        return snapshotStateList;
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> collection) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return new SnapshotStateMap<>();
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(Pair<? extends K, ? extends V>... pairArr) {
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(MapsKt.toMap(pairArr));
        return snapshotStateMap;
    }

    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(MapsKt.toMap(iterable));
        return snapshotStateMap;
    }

    public static final <T> State<T> rememberUpdatedState(T t2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1058319986, "C(rememberUpdatedState)*309@10408L41:SnapshotState.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1058319986, i2, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:309)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 141205635, "CC(remember):SnapshotState.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = mutableStateOf$default(t2, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        mutableState.setValue(t2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mutableState;
    }
}
