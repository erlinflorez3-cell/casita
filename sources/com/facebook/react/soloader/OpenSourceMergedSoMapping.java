package com.facebook.react.soloader;

import com.facebook.soloader.ExternalSoMapping;
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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\":\u001e\u007fјnjG6LeNCX\u07be*%ӆ,4RZdvI;ڈ\u001e}0\t\u0018\\uh\u0007J\t\rs\u0013\u0014\u0019\u0011jZM\u001c\r&\u0019\u001d7Zom9\u0014ڕ[\u0002g\u0003=\u001d `(~э#I!8P(v)I\u0012Ï0xG~Cj\r{\u000b`Ŏ$\u0007'\u000f(tg|<\u000fǔ{\u000361\u000e\u0002B|-&ܥ\u001b\u0016\u0014T`?\r%gdѯ^\u007f<#2k\u00035X\"α!\bxK\u0013\u0001'U1\u0010֜u~_\u000e#-+}\u0013$ýD%\f_p$'YU*֦nV/\u0006\f\u0014\rj\nT\u0381E\u00115;,~\b<9;Ɉq\tW\u0010qZ\u007f)g|ДCH:9M3f\u007fg\u0002ϑl\u007f\u0003\u0013\"6#/tgƃrVg#1lw\u007f7\u0018̼[\u0011U\u0018pUm2v)̪HL7U\u0018G{?4]\u00adU$@1:\u0004\u0002vJ.Ͽ#)oa\u0004jHn(5ݲUr\u0017\u001au\\d3o\u0001XfH)MJXM\u0012ݚ\u0017="}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EN\u000b\u001e!Cn\u000eI@\u000f@Y\u0007\u000eA}#,M+;x6\u001e\u0014Vk!\u0003n7R\u007f)\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00179l\n$z@\u000e`vZ~\u000eI\u007f!<G\b\b3x!2VE\u0011", "u(E", "7me<^,#\\\u001dh\u0004e6x\b", "", ":hQ?T9R<\u0015\u0007z", "", ":hQ3T)KW\u0017\u0004\u0004b&\u000b\u0013", "", ":hQ5X9FS'xzq,z\u0019>o\r\"\nJ", ":hQ5X9FS'\u0003\u0004l;x\u0012-e\u00051\u007f:\u000f!", ":hQ5X9FS'\u000e\u0005h3\u0001\u00121_\u000e2", ":hQ7f*>f\u0019|\u000bm6\n\u0003=o", ":hQ7f*B\\'\u000evg*|\u0003=o", ":hQ7f*Kc\"\u000e~f,v\u00179", ":hQ7f*M]#\u0006~g.v\u00179", ":hQ7f0C\\\u001d\n\bh-\u0001\u0010/ry6\u0006", ":hQ7f0Ga$~xm6\n\u0003=o", ":hQ:T7;c\u001a\u007fzk1\u0006\r)s\n", ":hQ?X(<b\u0013}zo:\r\u0014:o\r7\u0001I\u0005\u0011%Q", ":hQ?X(<b\u0013\u007fzZ;\r\u0016/f\u0007$}N\u0006 \u001bA}\u0018", ":hQ?X(<b\u0013\bzp(\n\u00072d\u007f)wP\b&%A}\u0018", ":hQ?X(<b\"z\nb=|\u0003=o", ":hQ?X(<b\"z\nb=|\u00066o|\"\nJ", ":hQ?X(<b\"z\nb=|\u000e8iy6\u0006", ":hQ?a0Ga(z\u0004\\,v\u00179", ":hQAh9;]!\tyn3|\u000e=i\u00051\u007f:\u000f!", ":hQB\\4:\\\u0015\u0001zk1\u0006\r)s\n", ":hQFb.:M'\t", ";`_\u0019\\)'O!~", "7m_Bg", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class OpenSourceMergedSoMapping implements ExternalSoMapping {
    public static final OpenSourceMergedSoMapping INSTANCE = new OpenSourceMergedSoMapping();

    private OpenSourceMergedSoMapping() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.soloader.ExternalSoMapping
    public void invokeJniOnload(String libraryName) {
        Intrinsics.checkNotNullParameter(libraryName, "libraryName");
        switch (libraryName.hashCode()) {
            case -1793638007:
                if (libraryName.equals("mapbufferjni")) {
                    libmapbufferjni_so();
                    break;
                }
                break;
            case -1624070447:
                if (libraryName.equals("rninstance")) {
                    librninstance_so();
                    break;
                }
                break;
            case -1570429553:
                if (libraryName.equals("reactnativejni")) {
                    libreactnativejni_so();
                    break;
                }
                break;
            case -1454983728:
                if (libraryName.equals("jsctooling")) {
                    libjsctooling_so();
                    break;
                }
                break;
            case -1438915853:
                if (libraryName.equals("reactnativeblob")) {
                    libreactnativeblob_so();
                    break;
                }
                break;
            case -1382694412:
                if (libraryName.equals("react_featureflagsjni")) {
                    libreact_featureflagsjni_so();
                    break;
                }
                break;
            case -1033318826:
                if (libraryName.equals("reactnative")) {
                    libreactnative_so();
                    break;
                }
                break;
            case -616737073:
                if (libraryName.equals("jscinstance")) {
                    libjscinstance_so();
                    break;
                }
                break;
            case -579037304:
                if (libraryName.equals("react_newarchdefaults")) {
                    libreact_newarchdefaults_so();
                    break;
                }
                break;
            case -49345041:
                if (libraryName.equals("turbomodulejsijni")) {
                    libturbomodulejsijni_so();
                    break;
                }
                break;
            case 3714672:
                if (libraryName.equals("yoga")) {
                    libyoga_so();
                    break;
                }
                break;
            case 65536138:
                if (libraryName.equals("hermesinstancejni")) {
                    libhermesinstancejni_so();
                    break;
                }
                break;
            case 86183502:
                if (libraryName.equals("jsijniprofiler")) {
                    libjsijniprofiler_so();
                    break;
                }
                break;
            case 352552524:
                if (libraryName.equals("hermes_executor")) {
                    libhermes_executor_so();
                    break;
                }
                break;
            case 614482404:
                if (libraryName.equals("hermestooling")) {
                    libhermestooling_so();
                    break;
                }
                break;
            case 688235659:
                if (libraryName.equals("react_devsupportjni")) {
                    libreact_devsupportjni_so();
                    break;
                }
                break;
            case 716617324:
                if (libraryName.equals("uimanagerjni")) {
                    libuimanagerjni_so();
                    break;
                }
                break;
            case 871152397:
                if (libraryName.equals("jscexecutor")) {
                    libjscexecutor_so();
                    break;
                }
                break;
            case 1236065886:
                if (libraryName.equals("jscruntime")) {
                    libjscruntime_so();
                    break;
                }
                break;
            case 1590431694:
                if (libraryName.equals("jsinspector")) {
                    libjsinspector_so();
                    break;
                }
                break;
            case 2016911584:
                if (libraryName.equals("fabricjni")) {
                    libfabricjni_so();
                    break;
                }
                break;
        }
    }

    public final native int libfabricjni_so();

    public final native int libhermes_executor_so();

    public final native int libhermesinstancejni_so();

    public final native int libhermestooling_so();

    public final native int libjscexecutor_so();

    public final native int libjscinstance_so();

    public final native int libjscruntime_so();

    public final native int libjsctooling_so();

    public final native int libjsijniprofiler_so();

    public final native int libjsinspector_so();

    public final native int libmapbufferjni_so();

    public final native int libreact_devsupportjni_so();

    public final native int libreact_featureflagsjni_so();

    public final native int libreact_newarchdefaults_so();

    public final native int libreactnative_so();

    public final native int libreactnativeblob_so();

    public final native int libreactnativejni_so();

    public final native int librninstance_so();

    public final native int libturbomodulejsijni_so();

    public final native int libuimanagerjni_so();

    public final native int libyoga_so();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.soloader.ExternalSoMapping
    public String mapLibName(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        switch (input.hashCode()) {
            case -1793638007:
                if (input.equals("mapbufferjni")) {
                }
                break;
            case -1624070447:
                if (!input.equals("rninstance")) {
                }
                break;
            case -1570429553:
                if (!input.equals("reactnativejni")) {
                }
                break;
            case -1438915853:
                if (!input.equals("reactnativeblob")) {
                }
                break;
            case -1382694412:
                if (!input.equals("react_featureflagsjni")) {
                }
                break;
            case -616737073:
                if (!input.equals("jscinstance")) {
                }
                break;
            case -579037304:
                if (!input.equals("react_newarchdefaults")) {
                }
                break;
            case -49345041:
                if (!input.equals("turbomodulejsijni")) {
                }
                break;
            case 3714672:
                if (!input.equals("yoga")) {
                }
                break;
            case 65536138:
                if (!input.equals("hermesinstancejni")) {
                }
                break;
            case 86183502:
                if (!input.equals("jsijniprofiler")) {
                }
                break;
            case 352552524:
                if (!input.equals("hermes_executor")) {
                }
                break;
            case 688235659:
                if (!input.equals("react_devsupportjni")) {
                }
                break;
            case 716617324:
                if (!input.equals("uimanagerjni")) {
                }
                break;
            case 871152397:
                if (!input.equals("jscexecutor")) {
                }
                break;
            case 1236065886:
                if (!input.equals("jscruntime")) {
                }
                break;
            case 1590431694:
                if (!input.equals("jsinspector")) {
                }
                break;
            case 2016911584:
                if (!input.equals("fabricjni")) {
                }
                break;
        }
        return input;
    }
}
