package com.facebook.react.defaults;

import com.facebook.jni.HybridData;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.runtime.cxxreactpackage.CxxReactPackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r@4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<$a%\bّY`J}P\b\bNqr/s`\u000bS\u0013\u0014\u0016\u0011jZJe\u0003k\u0014'8RqO3{sk<p~D\n882:\n\u0005/ XKǘzzQRT\u0018>H\t:\u0001\u0016\u0014\u0017ܮ\u0016\u0012"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001\u0018\u0013Wv\u001dJ@\u00045Zy0>|\u0005>Z@ES>\u001d%oa!\u0003l(Pv4&LU,^N\u0002=i", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VZ\n:|!7Yl0Dj \u0016WBKr4\u0006\u0011q];\u0007p\u000bN}'IH],2", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", ">`R8T.>a", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VZ\n:|!7YS", "1wg\u001fX(<b\u0004zxd(~\t=", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006t8Hf}\u001c5|!*KI7m4gr{t&\u0007_*]a#ERJ.\\(", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$],C]JulavD]x^\u001c]\u0001s\nUR 8TF#\u000fu0\u0006IwVO\u0007", "7mXA;@;`\u001d}", "\u001ab^:\"-:Q\u0019{\u0005h2F\u000e8iI\u000b\u0010=\u000e\u001b\u0016&k\u001d8L", "\u0010tX9W,K", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DefaultTurboModuleManagerDelegate extends ReactPackageTurboModuleManagerDelegate {
    private static final Companion Companion = new Companion(null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLcz\u0004I\u0006>*6B\u0015\"4\u0012\u000e\u0007njO0LeN.ZS@\u000fs{:$c$\bCC٥\"}8\tWȞog|hb\u000bY\u000f\u000eǝ\u000f̓\\I\u0004w\u001e\u0015Ƥ6B}?{_}FQ`#Ȃ5*@,P\u007f\u0015\u0003**v\u0018%\u0006\fr\u001a\u001bH@\u001fí\u0003,[\u000f2-\u0016O0\u0010L`ʄR@Nqm@5)\u0013kHTMf@~]\rt\\U\u0010?},7X7c\"UW\u0011\u000ej[m\u0007o{K\u0013\u0001-7-Ys\u0006F\u0007\u000fZ'{|\u001b^\u000bGl\"a{\u001c8;^\u0012Oח\u00122}\u007f\f\u0013B\n\u001e\b-NT4*h\u0018\u000ea|!VnRXތNȸ~a>ЍԄ\u0004D"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001\u0018\u0013Wv\u001dJ@\u00045Zy0>|\u0005>Z@ES>\u001d%oa!\u0003l(Pv4&LU,^N\u0002=Rnj\u0012U*\r\u0012/", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VZ\n:|!7Yl0Dj \u0016WBKr4\u0006\u0011q];\u0007p\u000bN}'IH],\u001b/\u0003A\u001b\u0011Z\u001b$", "u(E", "1wg\u001fX(<b\u0004zxd(~\t\u001ar\n9\u007f?\u0001$%", "", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006t8Hf}\u001c5|!*KI7m4gr{t&\u0007_*]a#ERJ.\\(", "/cS\u0010k?+S\u0015|\nI(z\u000f+g\u007f", ">q^C\\+>`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "0tX9W", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001\u0018\u0013Wv\u001dJ@\u00045Zy0>|\u0005>Z@ES>\u001d%oa!\u0003l(Pv4&LU,^N\u0002=i", ">`R8T.>a", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VZ\n:|!7YS", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder extends ReactPackageTurboModuleManagerDelegate.Builder {
        private List<Function1<ReactApplicationContext, CxxReactPackage>> cxxReactPackageProviders = new ArrayList();

        public final Builder addCxxReactPackage(final Function0<? extends CxxReactPackage> provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.cxxReactPackageProviders.add(new Function1<ReactApplicationContext, CxxReactPackage>() { // from class: com.facebook.react.defaults.DefaultTurboModuleManagerDelegate$Builder$addCxxReactPackage$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final CxxReactPackage invoke(ReactApplicationContext reactApplicationContext) {
                    Intrinsics.checkNotNullParameter(reactApplicationContext, "<anonymous parameter 0>");
                    return provider.invoke();
                }
            });
            return this;
        }

        public final Builder addCxxReactPackage(Function1<? super ReactApplicationContext, ? extends CxxReactPackage> provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.cxxReactPackageProviders.add(provider);
            return this;
        }

        @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.Builder
        public /* bridge */ /* synthetic */ ReactPackageTurboModuleManagerDelegate build(ReactApplicationContext reactApplicationContext, List list) {
            return build(reactApplicationContext, (List<? extends ReactPackage>) list);
        }

        @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.Builder
        protected DefaultTurboModuleManagerDelegate build(ReactApplicationContext context, List<? extends ReactPackage> packages) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(packages, "packages");
            ArrayList arrayList = new ArrayList();
            Iterator<Function1<ReactApplicationContext, CxxReactPackage>> it = this.cxxReactPackageProviders.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().invoke(context));
            }
            return new DefaultTurboModuleManagerDelegate(context, packages, arrayList, null);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":0\u007f\u0007|jAӄJ͟IDɟ\u0004*=j<9*[ҸuCIUb\u00130\ngN\u0016i\u001fTh\u000e[\u0015\u0016\u0018\tjZN\u0004|$ܐ-̙Fu"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001\u0018\u0013Wv\u001dJ@\u00045Zy0>|\u0005>Z@ES>\u001d%oa!\u0003l(Pv4&LU,^N\u0002=Rod\u0016Y'\u0016\tcJy", "", "u(E", "7mXA;@;`\u001d}", "\u001ab^:\"-:Q\u0019{\u0005h2F\u000e8iI\u000b\u0010=\u000e\u001b\u0016&k\u001d8L", "1wg\u001fX(<b\u0004zxd(~\t=", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006t8Hf}\u001c5|!*KI7m4gr{t&\u0007_*]a#ERJ.\\(", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final HybridData initHybrid(List<? extends CxxReactPackage> list) {
            return DefaultTurboModuleManagerDelegate.initHybrid(list);
        }
    }

    static {
        DefaultSoLoader.Companion.maybeLoadSoLibrary();
    }

    private DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List<? extends ReactPackage> list, List<? extends CxxReactPackage> list2) {
        super(reactApplicationContext, list, Companion.initHybrid(list2));
    }

    public /* synthetic */ DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, list, list2);
    }

    @JvmStatic
    public static final native HybridData initHybrid(List<? extends CxxReactPackage> list);

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    protected HybridData initHybrid() {
        throw new UnsupportedOperationException("DefaultTurboModuleManagerDelegate.initHybrid() must never be called!");
    }
}
