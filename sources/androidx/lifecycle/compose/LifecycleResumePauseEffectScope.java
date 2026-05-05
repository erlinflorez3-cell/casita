package androidx.lifecycle.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
    	... 5 more
    */
/* JADX INFO: compiled from: LifecycleEffect.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0007\"B\u0012\u007fјnjO0LeV.ZS@\u000fsڔ:)qҕ\"CiTZ\t2\r]N\u007fg\u001dKҼ\u000fC\u001d\b^\u001bx1aU'cB&8D}FK^\u007f?I`#5\u0015\"B\"f\u00033\tʀ.H\u0016\u0001AŖQ\\$>@\t:\u0001\u000e$Ŀ\u001cŪ\nD(ҵ6^mQDLǶaE"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E>\u000b\u001f\"Q}\u000e\u0006])6Y{45t\u0016\u001bMQKs4\t\u0011xo9fd-Nt65JX7\\(", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", ":hU2V@<Z\u0019", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvz", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u000b\u001dn", "5dc\u0019\\->Q-|\u0002^", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J}\u001bHo\fPt,5/", "=m?.h:>=&]~l7\u0007\u0017/", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E>\u000b\u001f\"Q}\u000e\u0006])6Y{45t\u0016\u0019ISIk\u001e+sloD\u0011q,.w(GJ]\u0019\\`\u0003D#g", "=m?.h:>=&]~l7\u0007\u0017/E\u0001){>\u0010", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ":hU2V@<Z\u0019F\bn5\f\r7eG&\u0006H\f!%Gi\u001b<}%1g}"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LifecycleResumePauseEffectScope implements LifecycleOwner {
    public static final int $stable = 8;
    private final Lifecycle lifecycle;

    public LifecycleResumePauseEffectScope(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public final LifecyclePauseOrDisposeEffectResult onPauseOrDispose(final Function1<? super LifecycleOwner, Unit> function1) {
        return new LifecyclePauseOrDisposeEffectResult() { // from class: androidx.lifecycle.compose.LifecycleResumePauseEffectScope.onPauseOrDispose.1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                function1.invoke(this);
            }
        };
    }
}
