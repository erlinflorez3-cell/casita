package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: ComposedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\rӬ4\u0012}\bnjO0Le^.ZS8\u000fs{J$cҕyCQU\"}8\tWNmmvJh\u0014K\u000f\f\u0016\u0001j:O]ތc\u0013%˰rom2\u000ePM=ntN\u0005N32>\b\u0007\u0019\u001c@G>y\u000bIY\u0010*2VohU\u001dS\u0013\u001f*\bT\u001f/!l|\\<`}m<?#1qRP7_^\u0006{\u0014ТX'\u0013\u0001q89KOK%'c\u00035^kA\u0013? I3oҊ++O\u0001ɱ:X\u0006\u001eƦ/O\u001bk;7j\u001ai`:=[Uqbh\u0010>v)~Sɴ\u0004V\f5`F-H\u007fN\"\u0004\u0004\u0001SXP0_۰\u0004\u0001iا/'\u0006B9Ikw_cS\u001bd6*\bڟ\")\t͙9]Z\u001fn'ke\u0006UISV<vQ̆]CuՎ\td\b=\u0012B\u0018\u0011=\u0001)0-$e^ޠ''sȵ`Fm\u000b\u0013rĎW\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nf\u0017+GnkF~0?g}\u001f\u001fw\u00152NG;x\u0002s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n^!\u001fRy\u001c<u\r?X\u0002!;m#\u0004", "4p=.`,", "", "9dh}", "", "9dh~", "9dh\u007f", "7mb=X*M]&b\u0004_6", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "4`RAb9R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPyUJA.\u000f0RK@y\tU\u0017\u001e>h\u007fF`\u0019UCu\u0006J'wJchE\u001d(Kl9k\u0010hfaKBm\u0015\u0002\"\u0019wT8\u0013\n\u001dq\u0003[wvkQ\"H\u000eg/", "5dc\u0013d\u0015:[\u0019", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0018X@\n", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5dc\u0018X@\u000b", "5dc\u0018X@\f", "3pd._:", "", "=sW2e", "6`b566=S", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class KeyedComposedModifier3 extends ComposedModifier {
    private final String fqName;
    private final Object key1;
    private final Object key2;
    private final Object key3;

    public final String getFqName() {
        return this.fqName;
    }

    public final Object getKey1() {
        return this.key1;
    }

    public final Object getKey2() {
        return this.key2;
    }

    public final Object getKey3() {
        return this.key3;
    }

    public KeyedComposedModifier3(String str, Object obj, Object obj2, Object obj3, Function1<? super InspectorInfo, Unit> function1, Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> function3) {
        super(function1, function3);
        this.fqName = str;
        this.key1 = obj;
        this.key2 = obj2;
        this.key3 = obj3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof KeyedComposedModifier3) {
            KeyedComposedModifier3 keyedComposedModifier3 = (KeyedComposedModifier3) obj;
            if (Intrinsics.areEqual(this.fqName, keyedComposedModifier3.fqName) && Intrinsics.areEqual(this.key1, keyedComposedModifier3.key1) && Intrinsics.areEqual(this.key2, keyedComposedModifier3.key2) && Intrinsics.areEqual(this.key3, keyedComposedModifier3.key3)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.key2;
        int iHashCode3 = (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object obj3 = this.key3;
        return iHashCode3 + (obj3 != null ? obj3.hashCode() : 0);
    }
}
