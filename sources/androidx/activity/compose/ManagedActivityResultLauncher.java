package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.State;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Deprecated;
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
/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0006DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007njO0LeN/ZS8\u000fs{:$c$\bCCU ~(\u000eeȞ\u0010itϺh\nk\u0011\f\u0015\u0007j\\Oezm\u0012U1pp\u007f`SڎMCnvN\u000b04280ڎ/\u001d:^\u001ez\u0013U[\u001a\"<PrJRC˟\u0015\u001c\"\u0006t\u001f/$\u000blߑ:Hzd\u0003?1\u000b\u0002L^)o03ձ\u001dFZ(;|(2s]E>-%\u0002\r7ViJ\u001b?(ܵ5n53CK\nVdeF(Ʀ/O\u001bk;,j\u0014i`:1qd4i^\u0012@\n\u000b\n\u001dH\u0014\u0010\u0016'~͓=\u001cv\bD2#x\u0002E'؟`۰\u0004ziاg7\u000e5C?+haaqϊ|:R˟\u000f̷'\u0001vďƥX\u001e"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qyJ\t\"!UoW$r.1[}\u001f\u0013k%2^GJ\u007f!\u001e#xhHm_<Wt*GY$", "\u0017", "\u001d", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9i:\u0006)F]\r4$m$>TR\"gD'\u0013kaF\\", ":`d;V/>`", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qyJ\t\"!UoW\u0018t49j\u0002/KZ\u0016<]JJR0.\u001efd9\u0014F6Uu'T\"", "1n]Ae(<b", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "uKP;W9HW\u0018\u0012DZ*\f\r@i\u000f<E>\u000b\u001f\"Q}\u000e\u0006R#D]\u000f$F\u0002\u0003.[SBz\u001b\u001a%q_<\u0007p\u000fX}&GY$\u0013X[qJ\u001e\u0016Y!\u0018)\u0017\rdK2n\u000eD/\u0011;M\n;2n\u001b\u0012\u001d5@43", "5dc\u0010b5M`\u0015|\n", ":`d;V/", "", "7m_Bg", "=oc6b5L", "\u001a`]1e6BR,Hxh9|R+p\u000bqW>\u0010\u001b(K~\"&\u000249c\u0007.\u0015w\u001e9IR\u0011", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?f}i3x!w)AJoE\"$|KD\u0016g6W\u0005\u0005QTY(k(6.", "Cma2Z0Lb\u0019\f", "/bc6i0Mg`|\u0005f7\u0007\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ManagedActivityResultLauncher<I, O> extends ActivityResultLauncher<I> {
    public static final int $stable = 8;
    private final State<ActivityResultContract<I, O>> contract;
    private final ActivityResultLauncherHolder<I> launcher;

    /* JADX WARN: Multi-variable type inference failed */
    public ManagedActivityResultLauncher(ActivityResultLauncherHolder<I> activityResultLauncherHolder, State<? extends ActivityResultContract<I, O>> state) {
        this.launcher = activityResultLauncherHolder;
        this.contract = state;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    @Deprecated(message = "\u0015K\u0003>\u0005\t'XlP7\t\u0010\u001e?\u000e]a\u001d6\u0012i [yGzvg4,gvPpGQ\u001cjR\u000608G\u0017cN~4DIPsA<\u0017\u001e-#V{yH\u000b\t\u0015\u0004P\u000eP\u0011\u0011i6")
    @InterfaceC1492Gx
    public void unregister() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void launch(I i2, ActivityOptionsCompat activityOptionsCompat) {
        this.launcher.launch(i2, activityOptionsCompat);
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public ActivityResultContract<I, ?> getContract() {
        return this.contract.getValue();
    }
}
