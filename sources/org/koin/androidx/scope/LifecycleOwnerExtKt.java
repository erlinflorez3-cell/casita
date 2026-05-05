package org.koin.androidx.scope;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.scope.Scope;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bDZc|\u0004G\u000fP'<Ȑ\u0017\"Z\u0011 \u0007\u0015jot\u001bͤJ¯V]:\u0011q|B&s&wFIY:\u001a0\u000egN\u0016f\u0017J\t\u000byS\\ǥz̶0Sezc\u0018\u001d4ZqE:[s]Un|N\u0005N1J8(\u00057^\u0001Ђ\u0012ͯ~M[\u000e\u00189NrRT\u0013W\u0013\u001eŰ\nI"}, d2 = {"1ta?X5MA\u0017\t\u0006^", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "5dc\u0010h9KS\"\u000eh\\6\b\tma\t1\u0006O|&\u001bQx\u001c", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u001fk\u0007 DCY\u001f", "5dc\u0010h9KS\"\u000eh\\6\b\t", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u001fk\u0007 DCY\u0015WP=5:(\u0019q+7\u0011p,\u0018\u0005%QWNuJP|H\u0014g", ":hU2V@<Z\u0019lxh7|", "5dc\u0019\\->Q-|\u0002^\u001az\u0013:e>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u0019\\->Q-|\u0002^\u001az\u0013:e", "Ab^=X", "5dc V6ISWz\u0004g6\f\u0005>i\n1\n", "5dc V6IS", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class LifecycleOwnerExtKt {
    public static final Scope getCurrentScope(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        throw new IllegalStateException("Don't use scope on a lifecycle component. Use ScopeActivity or ScopeFragment instead".toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001tdw$g](+\u000fY+5bu\f\u00189D[\u000fa\u0007KT|O{1kv`$K[o|>G\"", replaceWith = @ReplaceWith(expression = "lifecycleScope", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getCurrentScope$annotations(LifecycleOwner lifecycleOwner) {
    }

    public static final Scope getLifecycleScope(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        throw new IllegalStateException("Don't use scope on a lifecycle component. Use ScopeActivity or ScopeFragment instead".toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001tdw$g](+\u000fY+5bu\f\u00189D[\u000fa\u0007KT|O{1kv`$K[o|>G\"", replaceWith = @ReplaceWith(expression = "lifecycleScope", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getLifecycleScope$annotations(LifecycleOwner lifecycleOwner) {
    }

    public static final Scope getScope(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        throw new IllegalStateException("Don't use scope on a lifecycle component. Use ScopeActivity or ScopeFragment instead".toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001tdw$g](+\u000fY+5bu\f\u00189D[\u000fa\u0007KT|O{1kv`$K[o|>G\"", replaceWith = @ReplaceWith(expression = "lifecycleScope", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getScope$annotations(LifecycleOwner lifecycleOwner) {
    }
}
