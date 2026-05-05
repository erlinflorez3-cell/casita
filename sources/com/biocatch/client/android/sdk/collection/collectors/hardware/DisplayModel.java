package com.biocatch.client.android.sdk.collection.collectors.hardware;

import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.client.android.sdk.collection.StaticCollectionItem;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4C\u0007\":\u0017\u007f\u0007lrA0ZeP\u008cXݷ@ş\u001c{b#\u001cO\u0002GIU2}P\n_Rui\u0007J\t\fS\u0013\u0014\u0019\u0011jZJe|k\u0016'2ptO7[uU9\u000fyȥ\t @)\u0001\u007f\u0013\u00102*v =\u000f\u0014Z\u001a\u0012H@\u001f;ň\u0011S\r܅*\bD(\u000f'-v\\9`l\f;ǥ'\tqĩf)e:\u000bV]Ub)%v\u0010\u001fҋD==Ֆ=U\t\u0012`d\u0010\u0012MuU\u0005\u0017,ݳ/O{ɎNZ\u0006 #8 \u001ckx>\\3Vԃ\u0010-3Ւ{MV\u001c6\u0005ߧ\u007f\u001e"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011OJ9[dnJ\u0014[9\u0012\\6\u0014\u0001m).mD>t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003w]H\u000ba\nX}.GJ]0f[VL\u0014\u001a0", "1n[<e\u000b>^(\u0002", "", "EhSA[", "6dX4[;", "Fc_6", "", "Gc_6", "uH8\u00169\r\u0002D", "5dc\u0010b3H`w~\u0006m/", "u(8", "5dc\u0015X0@V(", "5dc$\\+MV", "5dc%W7B", "u(5", "5dc&W7B", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DisplayModel extends StaticCollectionItem {
    private final int colorDepth;
    private final int height;
    private final int width;
    private final float xdpi;
    private final float ydpi;

    public DisplayModel(int i2, int i3, int i4, float f2, float f3) {
        this.colorDepth = i2;
        this.width = i3;
        this.height = i4;
        this.xdpi = f2;
        this.ydpi = f3;
    }

    public final int getColorDepth() {
        return this.colorDepth;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final float getXdpi() {
        return this.xdpi;
    }

    public final float getYdpi() {
        return this.ydpi;
    }

    @Override // com.biocatch.android.commonsdk.backend.CollectionItem
    public JSONArray toJSONArray() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.colorDepth);
        jSONArray.put(this.width);
        jSONArray.put(this.height);
        jSONArray.put(-1);
        jSONArray.put(-1);
        jSONArray.put(this.xdpi);
        jSONArray.put(this.ydpi);
        return buildStatic(CollectorID.Display.getStaticFieldName(), jSONArray);
    }
}
