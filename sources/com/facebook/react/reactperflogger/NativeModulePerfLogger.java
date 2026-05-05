package com.facebook.react.reactperflogger;

import com.facebook.jni.HybridData;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0007nj?0LeV:Zݷ2\u000fy\u0002<$a,wgQ٥J}P\b\u0010SmiĔNZ\u0019CW\f$|\u0003,wW?\u007fZ\u0015@G\b?aS6?\u0002v\u0003=\u001d `(h}\u0013\t2*v\u0019'~QU$\u0012^K7^\u001b#[\u00112\u00124DP\u0005,d\u007fNdQ\u001daH9;\u0003\u0018M\u0015K(F\u000bZ%F\u0003-=zo&C@e>E)a\r\u001fR\nJIc:S\u0013v?'YO$[D`\u0018\u0014C4\u007f\u0011k|>\\3\\'0oA]rcP<.(~\n\u0015T\u0004<\u000fWL<72f6\u0019y\u0019;iN`\u001a^p\u0006+eD\u001f=\u007fa4i\u001ft[y;GY} M#,4\u0019nOa\u0005\u0012n\u001d3T&ZaUNG`N8d\u0004\u0012L\u0007p\u0014B\u0004^M03\n\u0019F\u0017S@\f=1+\u0004\u0002vO.\u001bMvvf\u0002RvFRr$?B\t:cth\u0013uhT\u00077Wqdj\u0015\u0012 \u0013Nb(@/-(N}q\u001an[g\"%]q}}?}\u001cXQ^a7(Ҳ\u0012уV|\u001c̳Ld\u000b[tBΖ\u0010o"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0001\u0013\u0015Vz\u000eIw,?[\u007f D7~*\\GLk\u001c(\u0014xh9qc9O]1INN92", "", "u(E", ";Gh/e0=2\u0015\u000ev", "\u001ab^:\"-:Q\u0019{\u0005h2F\u000e8iI\u000b\u0010=\u000e\u001b\u0016&k\u001d8L", "5dc\u001a;@;`\u001d}YZ;xG+n\t2\u000b<\u0010\u001b!P}", "7mXA;@;`\u001d}", ";`h/X\u0013HO\u0018h\na,\nv9L\u0004%\t<\u000e\u001b\u0017U", "", ";nSB_,\u001c`\u0019z\n^\nx\u00072eb,\u000b", ";nSB_,'O!~", "", "7c", "", ";nSB_,\u001c`\u0019z\n^\n\u0007\u0012=t\r8yO` \u0016", ";nSB_,\u001c`\u0019z\n^\n\u0007\u0012=t\r8yOn&\u0013T~", ";nSB_,\u001c`\u0019z\n^\f\u0006\b", ";nSB_,\u001c`\u0019z\n^\rx\r6", ";nSB_,\u001c`\u0019z\n^\u001a|\u0018\u001fp_1z", ";nSB_,\u001c`\u0019z\n^\u001a|\u0018\u001fpm7wM\u0010", ";nSB_,\u001c`\u0019z\n^\u001a\f\u0005<t", ";nSB_,\u001dO(zXk,x\u0018/E\t'", ";nSB_,\u001dO(zXk,x\u0018/S\u000f$\tO", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class NativeModulePerfLogger {
    private final HybridData mHybridData;

    protected NativeModulePerfLogger() {
        maybeLoadOtherSoLibraries();
        this.mHybridData = initHybrid();
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    protected abstract HybridData initHybrid();

    protected final synchronized void maybeLoadOtherSoLibraries() {
    }

    public abstract void moduleCreateCacheHit(String str, int i2);

    public abstract void moduleCreateConstructEnd(String str, int i2);

    public abstract void moduleCreateConstructStart(String str, int i2);

    public abstract void moduleCreateEnd(String str, int i2);

    public abstract void moduleCreateFail(String str, int i2);

    public abstract void moduleCreateSetUpEnd(String str, int i2);

    public abstract void moduleCreateSetUpStart(String str, int i2);

    public abstract void moduleCreateStart(String str, int i2);

    public abstract void moduleDataCreateEnd(String str, int i2);

    public abstract void moduleDataCreateStart(String str, int i2);
}
