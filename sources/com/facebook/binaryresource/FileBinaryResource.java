package com.facebook.binaryresource;

import com.facebook.common.internal.Files;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{J$cҕyCIe\"Ԃ*\t]UogtJpŏa 6\u0016'idHf9j\u0018\u000fBF}?KM\u001e>˃dtD\u0007hC0=\u0012\u0005/ ZN\u001e}\u0013Ea\u000b@8\u0007\u0098:\u001b\u0013[\u000e2\u00124Hf\u0015fbuYNH\u001bi\u0001Ck\twOf'\u000e>CaULb6%v\u0010.qT\bD#%k\u00035SÜC\tGмU\u0007n*5/ʇwi"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u00063n{5\u0010M\u0001%!W|\f<@\u00069`}|;v\u0012;a0;y>.\"fa\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00063n{5\u0010M\u0001%!W|\f<@\u00029by-KZ\u0016<WSHi4s", "4h[2", "\u001aiPCTuB]b_~e,R", "uKY.i(\bW#H[b3|^rV", "5dc\u0013\\3>", "u(;7T=:\u001d\u001d\tD?0\u0004\t\u0005", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "=oT;F;KS\u0015\u0007", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "@dP1", "", "Ahi2", "", "\u0011n\\=T5B]\"", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FileBinaryResource implements BinaryResource {
    public static final Companion Companion = new Companion(null);
    private final File file;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lj?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004c(~:\t}P\u0018k|Mr\u000bq\u0013L\u001bA|:Nmzs\u0011=4ruM6eqS8\u000fx|\nڼ6("}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u00063n{5\u0010M\u0001%!W|\f<@\u00069`}|;v\u0012;a0;y>.\"fawdm4Yr0KVW\u0002", "", "u(E", "1qT.g,", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00063n{5\u0010M\u0001%!W|\f<@\u00069`}|;v\u0012;a0;y>.\"fa\u000f", "4h[2", "\u001aiPCTuB]b_~e,R", "1qT.g,(`\u0002\u000f\u0002e", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final FileBinaryResource create(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new FileBinaryResource(file, null);
        }

        @JvmStatic
        public final FileBinaryResource createOrNull(File file) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (file != null) {
                return new FileBinaryResource(file, defaultConstructorMarker);
            }
            return null;
        }
    }

    private FileBinaryResource(File file) {
        this.file = file;
    }

    public /* synthetic */ FileBinaryResource(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    @JvmStatic
    public static final FileBinaryResource create(File file) {
        return Companion.create(file);
    }

    @JvmStatic
    public static final FileBinaryResource createOrNull(File file) {
        return Companion.createOrNull(file);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof FileBinaryResource)) {
            return false;
        }
        return Intrinsics.areEqual(this.file, ((FileBinaryResource) obj).file);
    }

    public final File getFile() {
        return this.file;
    }

    public int hashCode() {
        return this.file.hashCode();
    }

    @Override // com.facebook.binaryresource.BinaryResource
    public InputStream openStream() throws IOException {
        return new FileInputStream(this.file);
    }

    @Override // com.facebook.binaryresource.BinaryResource
    public byte[] read() throws Throwable {
        byte[] byteArray = Files.toByteArray(this.file);
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(file)");
        return byteArray;
    }

    @Override // com.facebook.binaryresource.BinaryResource
    public long size() {
        return this.file.length();
    }
}
