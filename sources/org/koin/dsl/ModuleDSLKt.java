package org.koin.dsl;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.module.Module;
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
@Metadata(bv = {}, d1 = {"Я&\u001d̉=!4i\bӵLc\u0003\rI\u00066\u000b6B\u0015\"4\u0012\u0006\u0007njO0Le^.ZS0\u000f\u00043Břs$ Bk[ }0\tgN\u0016h\u001fP`\u000bQ\u0011\u001e\u0016'k\\bc{u'\u001f4Rom2]qM9\u000fyd\t\t2\u0001>ѩ\t\u0001 1\u000f\u0015\u000f(Qŷ$\u0012^?!@X\r[\u00052\u00124?P\u001a,_\u007fcFJ|]h.3\u0005yB|,\u000e4eMkLù+\r|hd0haC\u001dEd\u0013\tb[m\u0002OsM\u0005\u0017,U/ʁwW<_0%%-_\r\fq6^\u0015Q\u000f\u0011U/յgKV\u0015߳{\u0004"}, d2 = {";nSB_,", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J~!F\u007f\u0015<L", "1qT.g,=/(l\nZ9\f", "", "=uT?e0=S", ";nSB_,\u001dS\u0017\u0006vk(\f\r9n", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001ana4\"2HW\"Hyl3Fp9d\u0010/{\u001f\u0001\u0015\u001eC|\nKz/>/", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u001bnSB_,\u001dS\u0017\u0006vk(\f\r9n", "9nX; *H`\u0019"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ModuleDSLKt {
    @KoinDslMarker
    public static final Module module(boolean z2, Function1<? super Module, Unit> moduleDeclaration) {
        Intrinsics.checkNotNullParameter(moduleDeclaration, "moduleDeclaration");
        Module module = new Module(z2);
        moduleDeclaration.invoke(module);
        return module;
    }

    @Deprecated(message = "iU\u0012:\u0004\u0007\u001e[]\u000eg\u000bQ'-[a`\u000e9Dq\u001f\u0012\u0005U\u0003*c\b)j(Mr[Zkz>\u0014]&?\u0017\u0016\u0013z.dWRTT9$\u001eP\u0018Ia6=\u00102v~@*,\u000e\fi+\u000b|\\\u0019N\t")
    @KoinDslMarker
    @InterfaceC1492Gx
    public static final Module module(boolean z2, boolean z3, Function1<? super Module, Unit> moduleDeclaration) {
        Intrinsics.checkNotNullParameter(moduleDeclaration, "moduleDeclaration");
        Module module = new Module(z2);
        moduleDeclaration.invoke(module);
        return module;
    }

    public static /* synthetic */ Module module$default(boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            z2 = false;
        }
        return module(z2, function1);
    }

    public static /* synthetic */ Module module$default(boolean z2, boolean z3, Function1 function1, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            z2 = false;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z3 = false;
        }
        return module(z2, z3, function1);
    }
}
