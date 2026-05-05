package com.facebook.imageformat;

import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4I\u0007\":\u001b\u007f\u0007ljA0RkP.XU0Ŧq\u0012éBkTqq:\u000e\u001a\u000e3Id^kunbZ9D\u001f\f$z\u0003._T'^ܫ\u00132Pr\b:[vU9\u000fu|ԓ!z+F\u0002\u001d\u00030)v\u0011=ڠD\u0014) 9Xphĥ=S\u000b\u001a \u0006V /\u001f\roT6Vnu<E\"1j\tľ&(A\u000bW%F\u00032=|o*CBM4C$\u001aϟ\b\u001bbM\u0010Wqk\u0013/Ҿ&sO\u0002fNX.\u0015[? \u001ekt>^\u001bP\u000f\rˏ/Uk֟h\u0010.{\t\u0001]K\u0012\u000e\u001e'v/ǉ\u001el\u0010ԄKvxYNUمbT"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%\u0004", "", "<`\\2", "", "4h[28?MS\"\r~h5", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "5dc\u0013\\3>3,\u000ezg:\u0001\u00138", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001bT4>", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0011n\\=T5B]\"", "\u0014na:T;\u001cV\u0019|\u0001^9", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ImageFormat {
    public static final Companion Companion = new Companion(null);
    public static final ImageFormat UNKNOWN = new ImageFormat("UNKNOWN", null);
    private final String fileExtension;
    private final String name;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\nB%s$ EqYpԊ$\u07beSNo˧ĚN]"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%l+MCv0'\u0019rj\u000f", "", "u(E", "#M:\u001bB\u001e'", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%\u0004", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\"B\u0012\u007fјnjG@L͜N\u0013hݷZ\u000f\u001az|:i(\nCiZJ\u00020\u000fgN\u0016n\u001fNh\u000b[\u000f4\u0017?\u000f|Ycxu\u0012=3\u0019ŊAݯQsU;fvD\bڼ6*"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%l.MHs0-rka7\rc9$", "", "6dP1X9,W.~", "", "5dc\u0015X(=S&l~s,", "u(8", "2dc2e4B\\\u0019_\u0005k4x\u0018", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%\u0004", "6dP1X9\u001bg(~\t", "", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface FormatChecker {
        ImageFormat determineFormat(byte[] bArr, int i2);

        int getHeaderSize();
    }

    public ImageFormat(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.fileExtension = str;
    }

    public static /* synthetic */ ImageFormat copy$default(ImageFormat imageFormat, String str, String str2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            str = imageFormat.name;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str2 = imageFormat.fileExtension;
        }
        return imageFormat.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.fileExtension;
    }

    public final ImageFormat copy(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ImageFormat(name, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageFormat)) {
            return false;
        }
        ImageFormat imageFormat = (ImageFormat) obj;
        return Intrinsics.areEqual(this.name, imageFormat.name) && Intrinsics.areEqual(this.fileExtension, imageFormat.fileExtension);
    }

    public final String getFileExtension() {
        return this.fileExtension;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.fileExtension;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return this.name;
    }
}
