package com.biocatch.client.android.sdk.collection.collectors.application;

import com.biocatch.android.commonsdk.backend.CollectionItem;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r)4\u0012}\u0007njG<LeN.ZS@\u000fsڔ<$iByCAc\"}8\tWȞm˧\u0005Ϻ\u000b\u000bq\u000eF_\tn:Imx\f\u0013\u001f6PqW3{rM=nxN\u0005N52<\b\n\u0019\u001aXN z\tJc\f@6PtHZ%M3#\"\u0010L*\u0019$li^6vr\fE?'\u0011uZNUb݁\u0001M\u001bS\u001d-\u001b\u0012y\u001eY\\}Ie4a\u000b\u001fR\nHƄCwEݛ\u0001)-9W\u0003(Ef\u0005,\u0015YUոax.ؘ\u001dSf\u001c5< rYP&(&{ԫ\u0011B\f\u05fa\u001e)N@;-7\u0017\u001c5\rr\u0002Cг\u0006dJȕ\u0013c<+3\u0015\u0004:G'~Q\u0010>ϭR=\u0004˜% )\u0017|6,c\u001cg-\u001b\u0003}Φ5WH׀`P\u0010pK~T\u0006p\fB\n@I\u0010/*\u0017\\\"É;aA\u05fa9m\b`R\u0001G\u0014nlki\u0001Kغ&t\u001eճB\u000b\u0012tRyʶom"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\n\r\u0016]?$JOB&\f*E\u0011?r\ns \r5qF", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "1n]AX?M7w", "", "3uT;g\u0010\u001d", "", "Bh\\2f;:[$", "/o_9\\*:b\u001d\t\u0004G(\u0005\t", "", ">`R8T.><\u0015\u0007z", "/o_9\\*:b\u001d\t\u0004B5\u000b\u0018+l\u0007$\u000bD\u000b \u0005Vk\u001d<", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u0007\u0018\u0010`E\"jS;)\u0011\u0010R\u0010Jd\b\u0013\u0012\u001d9ty0e\fVyj", ">da:\\:LW#\b\t", "", "4ha@g\u0010Ga(z\u0002e\u001b\u0001\u0011/", "uH9\u0017?1:d\u0015H\u0002Z5~R\u001dt\r,\u0005BV}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019\"i>&^eeC\u0005_;LypESR,ea<9\u001d\u0011g\u0018R*V\u0013XGmlN>&\b*X\u0006EqJ\n \u0015<jnQ`\u001dUC\u0011\u0001L0lDUn}QJ\u000f>5o\u0013c\u001bXI>.\u001dU\")wL5\u0011wb\u0015|[gvcV\u0019P\u001f):~W\u0010U~YC>\u000e#Y\u000bMvuI", "5dc\u000ec7EW\u0017z\nb6\u0006l8s\u000f$\u0003G|&\u001bQx{Kr45", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 5TC9z8(\u001e2_C\u000ej,L\u00061TZ\u0018(g]yA\u0012\u000ei\u0012X4V`dL+rB3.\f6ReDv\u0010\b\u001d\u00151ytL_}Vu$u\u0017", "5dc\u000ec7EW\u0017z\nb6\u0006q+m\u007f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010b5MS,\u000e^=", "u(8", "5dc\u0012i,Gb|]", "u(9", "5dc\u0013\\9Lb|\b\tm(\u0004\u0010\u001ei\b(", "5dc\u001dT*DO\u001b~cZ4|", "5dc\u001dX9FW'\r~h5\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc!\\4>a(z\u0003i", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DeviceApplicationModel extends CollectionItem {
    private final ApplicationInstallationState applicationInstallationState;
    private final String applicationName;
    private final int contextID;
    private final long eventID;
    private final long firstInstallTime;
    private final String packageName;
    private final List<String> permissions;
    private final long timestamp;

    public DeviceApplicationModel(int i2, long j2, long j3, String applicationName, String packageName, ApplicationInstallationState applicationInstallationState, List<String> permissions, long j4) {
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(applicationInstallationState, "applicationInstallationState");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.contextID = i2;
        this.eventID = j2;
        this.timestamp = j3;
        this.applicationName = applicationName;
        this.packageName = packageName;
        this.applicationInstallationState = applicationInstallationState;
        this.permissions = permissions;
        this.firstInstallTime = j4;
    }

    public final ApplicationInstallationState getApplicationInstallationState() {
        return this.applicationInstallationState;
    }

    public final String getApplicationName() {
        return this.applicationName;
    }

    public final int getContextID() {
        return this.contextID;
    }

    public final long getEventID() {
        return this.eventID;
    }

    public final long getFirstInstallTime() {
        return this.firstInstallTime;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final List<String> getPermissions() {
        return this.permissions;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.biocatch.android.commonsdk.backend.CollectionItem
    public JSONArray toJSONArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.contextID);
        jSONArray.put(this.eventID);
        jSONArray.put(this.timestamp);
        jSONArray.put(this.applicationName);
        jSONArray.put(this.packageName);
        jSONArray.put(this.applicationInstallationState.ordinal());
        jSONArray.put(new JSONArray((Collection) this.permissions));
        jSONArray.put(this.firstInstallTime);
        return jSONArray;
    }
}
