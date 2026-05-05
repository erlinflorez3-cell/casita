package com.biocatch.android.commonsdk.collection.collectors;

import com.biocatch.android.commonsdk.backend.CollectionItem;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.context.IContextIDCache;
import com.biocatch.android.commonsdk.di.SdkInjectorKt;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nj?1Le^.ZS0\u0012s{B+c$wDCU(\n*\tUOog|Sb\u000bI\u0011\u000e\u0016\u0007\u00074Ikxe܈\u00172PoG\u074cUoS9ht<\u0005&V8\u0600\u0018(1\u001aXGHu\u001e\u0004Në\u00160Np\u0003`\u001bi\u001d\"\"\bN /<rf|S\u000f\u0011&H=B\u001bipnWc>\u001ee\rtvm!Gq,,X7c\u0017{٬\u0005\u07baV_W\u0005EtK\t9750as\u0006</ă\u0016Ʀ/S%_x-j\r\"y\u001a0CO\u0012U\u0007P~À߃{Ɂ@\u000e\u0016\b-U<;2h\u000e\u0019A\u0001CeN_\u001a^p\u00101$\rВ'ő7/Q\u001dlboMi^E\u000f\u001d\rL7W\u0380#ƟX\u0012x\u0017!i\u0006g\u0002cNT`N8q\u0014оFͲf\b2ʶHI\u0006H\n+~)3Rs9Q9BɌ\u000bזk|\r\u009b\u0001UomVZ̷r:"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VU3\\P\u0002G!g", "", "u(E", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "1n]AX?M7w\\v\\/|", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_,WLJkG-^L?C\u0010r,a\u0006\u000b&*J*_RH", "5dc\u0010b5MS,\u000e^=\nx\u00072e", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w#.\u0017AEtC\u001e(w+\u001ddm5]v:V0-\nXPu=i", "1n]AX?M7w\\v\\/|G.e\u0007(}<\u0010\u0017", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "1ta?X5M3*~\u0004m\u0010{", "", "5dc\u0010h9KS\"\u000eZo,\u0006\u0018\u0013d", "u(9", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "7DgAX9GO \\\u0005e3|\u0007>o\r", "", "5dc\u00168?MS&\bve\n\u0007\u00106e}7\u0006M", "u(I", "7rBBc7H`(~y", "1n[9X*M", "", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "1n]3\\.N`\u0019", "", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "\u0011n\\=T5B]\"", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class Collector {
    public static final Companion Companion = new Companion(null);
    private static final AtomicLong eventSequence = new AtomicLong();
    private final boolean iExternalCollector;
    private final boolean isSupported = true;
    private final Lazy contextIDCache$delegate = LazyKt.lazy(new Function0<IContextIDCache>() { // from class: com.biocatch.android.commonsdk.collection.collectors.Collector$contextIDCache$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final IContextIDCache invoke() {
            return SdkInjectorKt.getCommonInjector().provideContextIDCache();
        }
    });

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:GIX2}P\r Zuh\u0007J\t\r\u001aƧ\bȀ|j4կǪ|b"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VU3\\P\u0002G!P8\u0018V6\t\u000e]K-D", "", "u(E", "3uT;g\u001a>_)~\u0004\\,", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5T 7O\u0019", "@db2g\fOS\"\u000eXh<\u0006\u0018/r", "", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void resetEventCounter() {
            Collector.eventSequence.set(0L);
        }
    }

    public abstract Collection<CollectionItem> collect();

    public void configure(ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
    }

    public abstract CollectorID getCollectorID();

    public abstract ConfigKeys getConfigKey();

    public final IContextIDCache getContextIDCache() {
        return (IContextIDCache) this.contextIDCache$delegate.getValue();
    }

    public final long getCurrentEventId() {
        return eventSequence.getAndAdd(1L);
    }

    public abstract String getFriendlyName();

    public boolean getIExternalCollector() {
        return this.iExternalCollector;
    }

    public boolean isSupported() {
        return this.isSupported;
    }
}
