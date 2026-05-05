package com.swmansion.rnscreens;

import com.facebook.react.module.annotations.ReactModule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u0012\r\u0011\n+\u001f\u001b%\u000b\u001a(\u001a\u0019!")
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176B\u0005\"2\u0017\u000eј\u0005mi0rd\u0001-U\u0014-Ƃo{B$$*\u007fDSUH\u007fh\u001dҐRk"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011W\u0018;r,#W\u000b 7v\u00072MU#g=\u001a\u0017hn\u000f", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>J\u0002 IU\u00127IE;x\n", "u(E", "5dc\u001bT4>", "", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ModalScreenViewManager extends ScreenViewManager {
    public static final Companion Companion = new Companion(null);
    public static final String REACT_CLASS = "RNSModalScreen";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011W\u0018;r,#W\u000b 7v\u00072MU#g=\u001a\u0017hnwdm4Yr0KVW\u0002", "", "u(E", " D0\u0010G&\u001c:tlh", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.swmansion.rnscreens.ScreenViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }
}
