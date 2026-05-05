package org.koin.compose.scope;

import androidx.compose.runtime.RememberObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.scope.Scope;
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
/* JADX INFO: loaded from: classes2.dex */
@KoinExperimentalAPI
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u000bnjG0LeN0XX@ş\u001c{b#\u001c7\u0002GIU2}P\n_Rui\u0007J\t\u000eß\u0013\u0006$|32W^\u0011]@\u0019xB8EAX\b=gj;JM&@.Py3\u000b`>\u0011\u0016\u0005\b[K:\u001cvTAI`\u000fe\u0005H\u0015ĂB&\tȦtiT;Vr.I=#\u001bipOϮc6\u0005ձ%HZ.\u001b~Җ\"9"}, d2 = {"\u001ana4\"2HW\"Hxh4\b\u0013=eI6yJ\f\u0017`%y\u0016G\u000139h\u0002*@S 2V19u?\u001e{r]8\u0007p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-!j$.ZT;x\n", "Ab^=X", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "9nX;", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041Q", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk}\u0004\u001flj\u000fJT", "5dc\u0018b0G", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//e2\u007fIV", "5dc V6IS", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\u000e&\u0006K\u0001`\u0005Ey\u0019<L", "1k^@X", "", "=m0/T5=]\"~y", "=m5<e.Hb(~\u0004", "=mA2`,FP\u0019\fz]", "9nX; *H[$\t\t^"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CompositionKoinScopeLoader implements RememberObserver {
    public static final int $stable = 8;
    private final Koin koin;
    private final Scope scope;

    public CompositionKoinScopeLoader(Scope scope, Koin koin) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(koin, "koin");
        this.scope = scope;
        this.koin = koin;
    }

    private final void close() {
        this.koin.getLogger().debug(this + " -> close scope id: '" + this.scope.getId() + '\'');
        this.scope.close();
    }

    public final Koin getKoin() {
        return this.koin;
    }

    public final Scope getScope() {
        return this.scope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        close();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        close();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
