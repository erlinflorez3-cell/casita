package androidx.compose.runtime.saveable;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: RememberSaveable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4\u0012\u0006јnʑA0ZeP\u008cZS8\u001bs{:$c$\u007fRCU }*\teNogtKb\u000bY\u000f\u000eǝ\u0001j:R]xc\u0013\u00172PoG3SrC9vҚ^\u0007&݅07*\u0005/\u001aZH>w;\u0007[\u001c 2X|JT\u001dM;܅\"\bN /\"\u000bj^<Vqu<E\"1oRR5fH|{\u0015VX5\u0016\u000faTѨPEC\u001f=]\u0013\rXZO\u0005Upk\t\u00172ݳ/I\u0002c~f\u000e'-+}!\u000ev4e\u001dQ\u000f\u0010m?\u0018\u0001Ye&*\u000ey2Ȟl\u0012\u001c\u0010?R>3 e\u0018\u0010Is!Wn[ؿbB\u000e\u0011*<%<\u00183YQaz\u001agI2f7*\u001dS2k\u0007|;sT<x[/\u001d}_Li@k`\u0015\n\"\u0007{ \tb0B4@U\u0002G\b!0'%mكI%1k0Lrj'\u000bnmkkhGn(\u001f\u001aE1!\f\tL\u0015\tyYlXbҊ}*b\u0011\u0016\u0012#&bvL#;\u000f|S\u0017tҷQ]\u00181\u007ftEf\u0007m$Vgl\n̓]Ӓ\u0014aZΘdWJl\u001dbvHY\u000bj^>!`L\u0019\u001bNӾP«\u0010\u0015:?\u007f+\u00058? t\u0015v\u000btՖMҴ\r_bӐ`\rb8<\u0005\u007f##\u000fWˉhʼsg\u0001̢|\u0015n$EMa7)&\fȨx6\r#5\u0003\"\u0003\u001eшXܤPl\u001e߯&\n.\u001f29\bǽ\u0014Т\u001bɒ-4\n-S\\Cy_^*/\u000b\u0001\n\u0011Qg\\k6|GݝbʧNO\\ϟȚz{"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\u0001\u001fo`9\u00149", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP)i>)\u0015>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-!j$.ZT;x\n", "A`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "", "@dV6f;Kg", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9sc.R\u00056T`$", "9dh", "", "D`[BX", "7m_Bg:", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJr65Uz'77\u0004*^CHA\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u007fM\u001d!^\u0016Nt\u001b\u0001jA kK7hu(Z\u00027e\b\f\u0004\u001d1yp/V\u0012K\b$\u0003U~OKUpu\u0011HAk,.yn*`C<yzv\u0015,d\u001a5\u0006\u0005UZ\\O~geVnp\u001f):~W\u0010Lk^>>\u0011\u001cP{u!\b\u001ce", "3mc?l", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9sc.R\u00056T`\r\fea\u007fQi", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "D`[BX\u0017K]*\u0003y^9", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "1`]\u000fX\u001a:d\u0019}", "", "5dc#T3NS|\u007f^g7\r\u0018=D\u0004'\u0005O^\u001a\u0013Pq\u000e", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "=m0/T5=]\"~y", "", "=m5<e.Hb(~\u0004", "=mA2`,FP\u0019\fz]", "@dV6f;>`", "CoS.g,", "@t]A\\4>\u001b'z\f^(y\u0010/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class SaveableHolder<T> implements SaverScope, RememberObserver {
    private SaveableStateRegistry.Entry entry;
    private Object[] inputs;
    private String key;
    private SaveableStateRegistry registry;
    private Saver<T, Object> saver;
    private T value;
    private final Function0<Object> valueProvider = new Function0<Object>(this) { // from class: androidx.compose.runtime.saveable.SaveableHolder$valueProvider$1
        final /* synthetic */ SaveableHolder<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Saver saver = ((SaveableHolder) this.this$0).saver;
            SaveableHolder<T> saveableHolder = this.this$0;
            SaveableHolder<T> saveableHolder2 = saveableHolder;
            Object obj = ((SaveableHolder) saveableHolder).value;
            if (obj != null) {
                return saver.save(saveableHolder2, obj);
            }
            throw new IllegalArgumentException("Value should be initialized".toString());
        }
    };

    public SaveableHolder(Saver<T, Object> saver, SaveableStateRegistry saveableStateRegistry, String str, T t2, Object[] objArr) {
        this.saver = saver;
        this.registry = saveableStateRegistry;
        this.key = str;
        this.value = t2;
        this.inputs = objArr;
    }

    public final void update(Saver<T, Object> saver, SaveableStateRegistry saveableStateRegistry, String str, T t2, Object[] objArr) {
        boolean z2;
        boolean z3 = true;
        if (this.registry != saveableStateRegistry) {
            this.registry = saveableStateRegistry;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!Intrinsics.areEqual(this.key, str)) {
            this.key = str;
        } else {
            z3 = z2;
        }
        this.saver = saver;
        this.value = t2;
        this.inputs = objArr;
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry == null || !z3) {
            return;
        }
        if (entry != null) {
            entry.unregister();
        }
        this.entry = null;
        register();
    }

    private final void register() {
        SaveableStateRegistry saveableStateRegistry = this.registry;
        if (this.entry != null) {
            throw new IllegalArgumentException(("entry(" + this.entry + ") is not null").toString());
        }
        if (saveableStateRegistry != null) {
            RememberSaveableKt.requireCanBeSaved(saveableStateRegistry, this.valueProvider.invoke());
            this.entry = saveableStateRegistry.registerProvider(this.key, this.valueProvider);
        }
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public boolean canBeSaved(Object obj) {
        SaveableStateRegistry saveableStateRegistry = this.registry;
        return saveableStateRegistry == null || saveableStateRegistry.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        register();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null) {
            entry.unregister();
        }
    }

    public final T getValueIfInputsDidntChange(Object[] objArr) {
        if (Arrays.equals(objArr, this.inputs)) {
            return this.value;
        }
        return null;
    }
}
