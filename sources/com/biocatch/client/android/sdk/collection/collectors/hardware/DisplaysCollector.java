package com.biocatch.client.android.sdk.collection.collectors.hardware;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.Display;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.OnDemandCollector;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.client.android.sdk.collection.collectors.hardware.DisplaysModel;
import com.biocatch.client.android.sdk.core.display.DisplaysService;
import com.biocatch.client.android.sdk.core.hash.HashService;
import java.util.ArrayList;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{:$c$\bCCU ~*\teNogtKb\u000bQ\u001b\u000e\u0016~k4Ikxe܈\u00172XoG\u074cUoS9ht<\u0005&݅8\u0600*\u000b\u0011\u001c:H>v)B\f/\"4NqRR;O\u0015\u001e \tV /\"lk\\;`l\f@?'\u0011pZNUg݁\u0001M\u001bO\u001d5\u001b\ry\u001eYWg9#=k\u00035k\"?KM\u007fW\u001dhUB[M\u0002oNX.-[+\u0018\u0013k\u000f>\\3Q' w=]mcP<3.ORȵ>Ǭ\u0012\n?J49(sX A\u0003\u000bSn_83\u0019Ȭ|ˋ:\u001b=\u00029;G,7]o>1Ne\u007f[ٿ ţ\u0005n)ż%\u001an\u001c3T&Y\b҈BףLN\u0012ԯ\u000e\u007f\u0012\u0003z\u0002X\u0017f\u001cV\u0092} 2\u001b=9aM16<\u000eVE\u007fv3b?\u05c8kʐL@*ÂfC8\u000e$Zrj[ߛRԜ\\,\u0019۳ɥX$"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011OJ9[dnJ\u0014[9\u0012\\6\u0014\u0001mO\u0002xK>\u001f\u0006;S\u000f\u0011", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p1U-,dN{<q\u001ca\u0015N)\u001c\u000ff\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011OJ9[dnJ\u0014[9\u0012\\6\u0014\u0001mO\fxC7&]", "6`b5F,Kd\u001d|z", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wP?In}\u0001\u0011vd'\u0007p=Rt'\u001d", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "2hb=_(Ra\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLGIv;\u001a)2@=\u0015n3J\u000b55L[=`Pr\u0013", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017F7y7gwdo<tc9_z%G\"5*fZ<:\u0018\u001cX\n])\u0010NUJ#{N;\u001eQ*S\nCr\n\u001a\u0015\u0014~hzKW\u0014I\n\"qP-rO#=\u0004PBId:q\bn!fC'$\u001f{'\u001fwZ;\u001eQ:\u000f|ZCdkQ\u0017vG\"A7WOD|_@sp\u001dU\u0004\u007f\u001c;fs1>+\u000eA*\u007fT\u0014On&\u0014Ev\u001f4&>+048\"=N-ssB\u000eq.+\u0004\u0017aB;\u001dd/qG\u0015P[!h5+^\u0005E]\r:]9s+T\nIW\u000e#v\u00071~iGCp\u0018q", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "@db<_=>2$\u0003", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&w\u001d", "2hb=_(R", "\u001a`]1e6BRb\u0010~^>Fg3s\u000b/wTV", "@db<_=>E\u001d\byh>j\rDe", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&l", "@t]\u0010b3ES\u0017\u000e~h5", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DisplaysCollector extends OnDemandCollector<DisplaysModel> {
    private final ConfigurationRepository configurationRepository;
    private final DisplaysService displaysService;
    private final HashService hashService;
    private final Utils utils;

    public DisplaysCollector(HashService hashService, ConfigurationRepository configurationRepository, Utils utils, DisplaysService displaysService) {
        Intrinsics.checkNotNullParameter(hashService, "hashService");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(displaysService, "displaysService");
        this.hashService = hashService;
        this.configurationRepository = configurationRepository;
        this.utils = utils;
        this.displaysService = displaysService;
    }

    private final PointF resolveDpi(Display display) {
        return this.utils.isVersionLessOrEqualTo(30) ? this.displaysService.resolveDpiLegacy(display) : this.displaysService.resolveDpiByDisplayContext(display);
    }

    private final Point resolveWindowSize(Display display) {
        return this.utils.isVersionLessOrEqualTo(30) ? this.displaysService.resolveWindowSizeLegacy(display) : this.displaysService.resolveWindowSizeByDisplayContext(display);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.Displays;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.enableDisplaysCollection;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "displays";
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.OnDemandCollector
    public DisplaysModel runCollection() {
        ArrayList arrayList = new ArrayList();
        int i2 = this.configurationRepository.getInt(ConfigurationFields.displaysNameTruncationLength);
        for (Display display : this.displaysService.getAvailableDisplays()) {
            Point pointResolveWindowSize = resolveWindowSize(display);
            PointF pointFResolveDpi = resolveDpi(display);
            HashService hashService = this.hashService;
            String name = display.getName();
            Intrinsics.checkNotNullExpressionValue(name, "display.name");
            arrayList.add(new DisplaysModel.DisplayModel(pointResolveWindowSize.x, pointResolveWindowSize.y, pointFResolveDpi.x, pointFResolveDpi.y, hashService.getTruncatedHash(name, i2)));
        }
        return new DisplaysModel(arrayList);
    }
}
