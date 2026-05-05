package com.davivienda.daviviendaapp.bridges.cleafy;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.ZN;

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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLcz\u0004I\u0006>)6B\u0015\"4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yّQ٥J}P\b\u0010Q˗knXZSW\u001d\u0007.\tz8Y_\tc\u0018\u000eBD\u0006>aQ\u001e@gb=J\u0013%J(H{\u0015\u0001H0v\u0012'~QR$\u0012^H7N\u001b)[\u000e2 \u0016H0\t.\\mOFHr^h9Q\u0005\u001aF\\.w0+USZÿ+\u0018"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wKJ;g52^UJ\u0017\u000ec(O\u000b\u0012CJT(^RH", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VZ\n:|!7YS", "u(E", "1qT.g,#A\u0001\tyn3|\u0017", "", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!r61G{-;x%\u0016WBKr4s", "1qT.g,'O(\u0003\f^\u0014\u0007\b?l\u007f6", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}\bAl&5M\u0019", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "1qT.g,/W\u0019\u0011bZ5x\u000b/r\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u001fi\u001f*OCHA", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RNCleafyPackage implements ReactPackage {
    public final List<Class<? extends JavaScriptModule>> createJSModules() {
        return CollectionsKt.emptyList();
    }

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) throws Throwable {
        Intrinsics.checkNotNullParameter(reactApplicationContext, C1561oA.Qd("H:56F\u0014?=B2D?", (short) (ZN.Xd() ^ (1622000412 ^ 1621997081))));
        Object[] objArr = {reactApplicationContext};
        Constructor<?> constructor = Class.forName(C1593ug.zd("\u0014! a\u0019\u0017-!/# *!\u001fl$\"8,:.+5,*+;<z0A9598G\u00039C=:@T\n/,\"LFCI]2UK]UO", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (657824836 ^ (-1689169118)))), (short) (OY.Xd() ^ (1578726739 ^ 1578727615)))).getConstructor(Class.forName(C1561oA.od("/:7v.()*&21,m1#\u001e\u001f/g\u001b* \u001a\u001c\u0019`\u0004\u0016\u0011\u0012\"m\u001c\u001b\u0016\u0012\u000b\b\u001a\u000e\u0013\u0011d\u0010\u000e\u0013\u0003\u0015\u0010", (short) (Od.Xd() ^ (1994193481 ^ (-1994162833))))));
        try {
            constructor.setAccessible(true);
            return CollectionsKt.listOf(constructor.newInstance(objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, C1561oA.Kd("PDADV&SSZL`]", (short) (Od.Xd() ^ (ZN.Xd() ^ (1898422631 ^ (-1118670873))))));
        return CollectionsKt.emptyList();
    }
}
