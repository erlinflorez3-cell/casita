package org.koin.core.context;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.module.Module;
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
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјnjGNLe^.Zݷ2\u000fy\u0005<$a$yCQU\"}(\tWN}gvJp\u000bK\u000f\u001c\u0016\u0001j2J[]s܈?2pn\b9[oU9\u000fu|)h:0:\u0012\u0007\u0017\u0019XIV\u001bCaY\u000f*0ntj\\\u001bR\u001d \"\bN /%\u000bm~<NlkBG#1r\trow>\u007fe\rtXW\u0011\u0005k6+n>e\u001b+S\u0011\u000fj[m\f\u0006\u0016\u0006\u0013v2?+w\u007f\b:f\r,\u0015Y[S\u0002;Ij\u0010i`:3[hqYh#8y\u000b{;H\u0014\u0010\u0016'v2[)O\blCϢvSFaH\u0003\u000b\u0006\tsN\u0017S\u0004yO\u0002/tdy;GRg\u0006\u0013\u00126)\u0011p1[\u0003\u0015\u000f\u001bax@_?dX=vR:]Kw\u001cp\u0011\tp(ΫK\u0014"}, d2 = {"\u001ana4\"2HW\"Hxh9|R-o\t7{S\u0010`|Qs\u0017\u001a\u0001.DY\u0011/\r", "", "5dc", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041Q", "5dc\u001ce\u0015NZ ", ":nP1>6B\\\u0001\tyn3|\u0017", "", ";nSB_,L", "", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J~!F\u007f\u0015<L", "1qT.g,\u001eO\u001b~\bB5\u000b\u0018+n}(\n", "", ";nSB_,", "AsP?g\u0012HW\"", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041WK\f\u001e\u001bEk\u001d@\u0001.\u000b", "9nX;47IZ\u001d|vm0\u0007\u0012", "/o_\u0011X*EO&z\nb6\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ana4\"2HW\"Hyl3Fn9i\t\u0004\u0007K_\u0017\u0015Nk\u001b8\u0006)?bS", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "As^=>6B\\", "Cm[<T+$]\u001d\bbh+\r\u0010/s", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface KoinContext {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static /* synthetic */ void loadKoinModules$default(KoinContext koinContext, List list, boolean z2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadKoinModules");
            }
            if ((i2 + 2) - (i2 | 2) != 0) {
                z2 = false;
            }
            koinContext.loadKoinModules((List<Module>) list, z2);
        }

        public static /* synthetic */ void loadKoinModules$default(KoinContext koinContext, Module module, boolean z2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadKoinModules");
            }
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            koinContext.loadKoinModules(module, z2);
        }
    }

    Koin get();

    Koin getOrNull();

    void loadKoinModules(List<Module> list, boolean z2);

    void loadKoinModules(Module module, boolean z2);

    KoinApplication startKoin(Function1<? super KoinApplication, Unit> function1);

    KoinApplication startKoin(KoinApplication koinApplication);

    void stopKoin();

    void unloadKoinModules(List<Module> list);

    void unloadKoinModules(Module module);
}
