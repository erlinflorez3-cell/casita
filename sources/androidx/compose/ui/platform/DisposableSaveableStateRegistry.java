package androidx.compose.ui.platform;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: DisposableSaveableStateRegistry.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\r\"4\u0012}\u0007njG9L͜P.`ݷ2\u000fq{<$i0yCAU\"}0+WNu\u0006vϺb\u000bY\u000f\u000e\u0016~j2կkތ\u000e\u0012=1\u0003\tO7[oU9\u000fsF\u000f.3:>\n\u0007\u0011\u001aXK>xټGK\u001a\u0016xO~?j\r{\u000bJ\u0016\u0014E8\u0001Ld.߅5\u0011}kCG%\u0019hpVWc>\u0007e\rt_m˰u*\"9LO5C(\u001c\u001e\u0015_sS\u0013A\u0002=3s71;Q\u0004[FZ\u0016\u0013C3}\u001c\f\u0001lد\u0004\u001a\u007f\u001a7CO\u0012\\\u0001\u00126\u0002\u0013{;G4\u001a\u00149`6=\u001ev\n$2#z\u0002B\u0017س]\u0013\u0012\tbN\u001d5\u0002C+g\u001e\u0015S8ݥ\u001b\u05ee;{\rټ̽'\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0014]\f+A{\u0012+TC)gE\u001e\u0011eh9tr(]v\u0014GNR:k_\u0007\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9sc.R\u00056T`$", "A`e2T)ES\u0007\u000evm,i\t1i\u000e7\tT", "=m36f7Ha\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJr65Uz'77\u0004*^C7h;\u001e\u0003w]H\u0007P,Pz5VYb\u0002CX|L\u001b\u0016cWS<\u0015NZQ-lS;)\u0011:\u0013bKq~\u001b\u001a\u0018>5F\u0006G", "1`]\u000fX\u001a:d\u0019}", "", "D`[BX", "", "1n]@h4>@\u0019\r\nh9|\b", "9dh", "", "2hb=b:>", ">da3b9FA\u0015\u0010z", "", "", "@dV6f;>`\u0004\f\u0005o0{\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9sc.R\u00056T`\r\fea\u007fQi", "D`[BX\u0017K]*\u0003y^9", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DisposableSaveableStateRegistry implements SaveableStateRegistry {
    public static final int $stable = 8;
    private final /* synthetic */ SaveableStateRegistry $$delegate_0;
    private final Function0<Unit> onDispose;

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        return this.$$delegate_0.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        return this.$$delegate_0.consumeRestored(str);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map<String, List<Object>> performSave() {
        return this.$$delegate_0.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(String str, Function0<? extends Object> function0) {
        return this.$$delegate_0.registerProvider(str, function0);
    }

    public DisposableSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry, Function0<Unit> function0) {
        this.onDispose = function0;
        this.$$delegate_0 = saveableStateRegistry;
    }

    public final void dispose() {
        this.onDispose.invoke();
    }
}
