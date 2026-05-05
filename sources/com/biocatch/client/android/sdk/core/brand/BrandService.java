package com.biocatch.client.android.sdk.core.brand;

import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.backend.BackendService;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.`S2\u000fq{<$i0yّA٥0ԂR\t}M(r~Nh\u000b[\u000f4\u0017ѱn,WWAa \u0016JB\u001eG{Y}FQ`#>5$@,Py3\fj6V\u0010\u000fzqLb۸2Ϯt:Z҈\u001e\u0011(\u0015\u001e>N\u0005tմiߑ:Htҗ\u000b;1\b\u0002B|-6ܡ~֔\u0011F\\܋̂zm"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wJP7t3gqu]B\u0006Q,[\b+EL$", "", "0`R8X5=A\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005H0\u001c\u001bhj8tc9_z%G\"", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i4i\u00144ML:5\u0011\u001a\u0013naB\u0006Q,[\b+EL$oM", "0qP;W\n:Q\u001c~", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wJP7t3gqu]B\u0006A(Ly'\u001d", "D`[6W\tKO\"}cZ4|u/g\u007f;", "\u001aj^A_0G\u001d(~\u000emui\t1e\u0013}", "@db2g", "", "Adc\u000fe(GR", "0qP;W\u0015:[\u0019", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class BrandService {
    private final BackendService backendService;
    private final BrandCache brandCache;
    private final Regex validBrandNameRegex;

    public BrandService(BackendService backendService) {
        Intrinsics.checkNotNullParameter(backendService, "backendService");
        this.backendService = backendService;
        this.validBrandNameRegex = new Regex("[A-Za-z0-9.\\-,_ ]+");
        this.brandCache = new BrandCache();
    }

    public final void reset() {
        this.brandCache.reset();
    }

    public final void setBrand(String brandName) {
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        if (brandName.length() == 0) {
            Log.Companion.getLogger().warning("Received an invalid empty brand name. Set brand operation failed.");
            throw new InvalidOperationException("Brand Name can not be empty");
        }
        if (brandName.length() > 200) {
            Log.Companion.getLogger().warning("Received brand name length greater than 200 characters. Set brand operation failed.");
            throw new InvalidOperationException("Brand name can't be greater than 200 characters");
        }
        if (this.validBrandNameRegex.matchEntire(brandName) == null) {
            Log.Companion.getLogger().warning("Received brand name with invalid characters. Set brand operation failed.");
            throw new InvalidOperationException("Brand name must contain only letters or digits");
        }
        try {
            this.brandCache.set(brandName);
            this.backendService.setBrand(brandName);
            Log logger = Log.Companion.getLogger();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("Set Brand to %s", Arrays.copyOf(new Object[]{brandName}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            logger.info(str);
        } catch (InvalidOperationException unused) {
            Log.Companion.getLogger().warning("Brand is already set and can not be changed in current session");
        }
    }
}
