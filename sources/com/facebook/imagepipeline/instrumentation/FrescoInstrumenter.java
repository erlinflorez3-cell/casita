package com.facebook.imagepipeline.instrumentation;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001b\u007f\u0007ljA0ZeP.XS2\u000fy\b<řc$\u007fCCU }*\t]OogtO`ƖC%إFx\u0019+\u0002T\u000e\u001e\u0017\u00152Բs?AM8[Gf\r8\u001b\u001f`)h\u0002\u000b\u007f(2`\u0012\ryqR<\u0018>I\t<h\f{\u000f`\u0017NV.\f6\\\u0016ZfNzjR19\u0002\u0018A~+m>\u0015M;U\u001b,U\to.CBM4C$\u0004\t\u0015[sA\u0019> GKmoC9Z\fYLW.\u0013E1]\u001aut<[3P\u0011\u001254geaO<2>\u007fD\u001dJ\u0016&\u0006UT^3(s \u0010Is!R\u0007UJnP\u0013\u0013ad#U\u0006A?Q\u001d|P\u0010=_S\b\n\u0013\u000e6%\u0017mO]+טlڠ\u001fT\u007f\u0383\u0002`N@`N8]s3ձtf\u001a,\n3U\u0005¤\u007f'"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z.Ch\u000b0?m\u001f=IR?u=guuaG\u0005m\u0010W\u00056T\\V,earJi", "", "u(E", "7mbAT5<S", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z.Ch\u000b0?m\u001f=IR?u=guuaG\u0005m\u0010W\u00056T\\V,earJRuc\u001c]8\u001d\rYJ3nQ\r", "7rC?T*B\\\u001b", "", "u(I", "2dR<e(MS\u0006\u000f\u0004g(y\u0010/", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "@t];T)ES", "B`V", "", ";`a89(BZ)\fz", "", "BnZ2a", "Bg", "", "=m12Y6KS\u0007\u000fwf0\fz9r\u0006", "=m12Z0GE#\f\u0001", "=m4;W\u001eH`\u001f", ">q^C\\+>", "7mbAe<FS\"\u000ezk", "\u0017mbAe<FS\"\u000ezk", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FrescoInstrumenter {
    public static final FrescoInstrumenter INSTANCE = new FrescoInstrumenter();
    private static volatile Instrumenter instance = null;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4B\u0007\"B\u0012\u007f\u0007ljA0RqP\u008cZS8\u000fs{:$c$\u007fDCU \u007f(meȞ\u0018g\u001dI##Q\u0012\u001e\u0018\u000fiZM\u0006|k\u0017'2pso7[uU9\u000f{|)hH0@\u0012\u0005/#ZL\u001e\u0001\u0013Cy\u000bB4N{RR;YK>Z\u0016L-\u0019 rf|5xpk@G#1p\troy>\u000be\u000f\\SU\f'e,5X7c\u0014UY\u0011\rj]U\u0002mx\u0004)155:as\u0006?\t\u0004\"\u001fCO;\\9J-\u0015_`$'YP:׆Rˎ,{\u0013}\u0013<\u0012\u0010Σ+X"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z.Ch\u000b0?m\u001f=IR?u=guuaG\u0005m\u0010W\u00056T\\V,earJRuc\u001c]8\u001d\rYJ3nQ\r", "", "7rC?T*B\\\u001b", "", "u(I", "2dR<e(MS\u0006\u000f\u0004g(y\u0010/", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "@t];T)ES", "B`V", "", ";`a89(BZ)\fz", "", "BnZ2a", "Bg", "", "=m12Y6KS\u0007\u000fwf0\fz9r\u0006", "=m12Z0GE#\f\u0001", "=m4;W\u001eH`\u001f", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Instrumenter {
        Runnable decorateRunnable(Runnable runnable, String str);

        boolean isTracing();

        void markFailure(Object obj, Throwable th);

        Object onBeforeSubmitWork(String str);

        Object onBeginWork(Object obj, String str);

        void onEndWork(Object obj);
    }

    private FrescoInstrumenter() {
    }

    @JvmStatic
    public static final Runnable decorateRunnable(Runnable runnable, String str) {
        Instrumenter instrumenter = instance;
        if (instrumenter == null || runnable == null) {
            return runnable;
        }
        if (str == null) {
            str = "";
        }
        return instrumenter.decorateRunnable(runnable, str);
    }

    @JvmStatic
    public static final boolean isTracing() {
        Instrumenter instrumenter = instance;
        if (instrumenter == null) {
            return false;
        }
        return instrumenter.isTracing();
    }

    @JvmStatic
    public static final void markFailure(Object obj, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "th");
        Instrumenter instrumenter = instance;
        if (instrumenter == null || obj == null) {
            return;
        }
        instrumenter.markFailure(obj, th);
    }

    @JvmStatic
    public static final Object onBeforeSubmitWork(String str) {
        Instrumenter instrumenter = instance;
        if (instrumenter == null || str == null) {
            return null;
        }
        return instrumenter.onBeforeSubmitWork(str);
    }

    @JvmStatic
    public static final Object onBeginWork(Object obj, String str) {
        Instrumenter instrumenter = instance;
        if (instrumenter == null || obj == null) {
            return null;
        }
        return instrumenter.onBeginWork(obj, str);
    }

    @JvmStatic
    public static final void onEndWork(Object obj) {
        Instrumenter instrumenter = instance;
        if (instrumenter == null || obj == null) {
            return;
        }
        instrumenter.onEndWork(obj);
    }

    @JvmStatic
    public static final void provide(Instrumenter instrumenter) {
        instance = instrumenter;
    }
}
