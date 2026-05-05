package com.biocatch.client.android.sdk.collection.collectors.hardware;

import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.exceptions.MissingStaticFieldNameException;
import com.biocatch.client.android.sdk.collection.StaticCollectionItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLш|\u0004O$8\u000bDB\u0007\"2\u0014\u007f\u0007|jA0JeN\u008chݷZ\u000f\u001azl#cd\u0003SEc\u001a\u0016(\u0019Q^g\u0016px[ŲG\u000f\u0014\u0019Ap:Omx\f\u0019UF\u0013\u0005M3euM;ptd\u0007N3ŕ<\u007f\rЏ2,N\u0014\u0005\u007fŸO\u0015"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011OJ9[dnJ\u0014[9\u0012\\6\u0014\u0001mO\fxC7&]", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003w]H\u000ba\nX}.GJ]0f[VL\u0014\u001a0", "2hb=_(Ra", "", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011OJ9[dnJ\u0014[9\u0012\\6\u0014\u0001mO\fxC7&F\u000bM\u0010Fo| }\u00184jw\u0018", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "5dc\u0011\\:IZ\u0015\u0013\t", "u(;7T=:\u001d)\u000e~euc\r=tU", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "\u0012hb=_(R;#}ze", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DisplaysModel extends StaticCollectionItem {
    private final List<DisplayModel> displays;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\":\u0017\u007f\u0007ljA0RqP.Xa2\u000fy\u0005<$a%yCQU\"}(\tUȟm}ñzZ9BO1&|x,aU'^\"\u0013@D\b?aN\u007fAGc\r63$B&F~\u001d\u0001H.X\u0014\u0005\u0001[K:\u0019ضDpHZUT\u0013+*\u0006l!Gɭ]0UDZ\u0005]h0iʌj\u000bU5rH|{\u0011\rĝ(U}o2C@e9[ȳTK\u000e`pW\u0003mx\u0004ޢio`9_\fWdݙ0\u001a\u001b+]\rurT]5Wf\f5-gcyQ>.}z\n\u0010T\u0004<\nWN4-(k \u000eax#YFP\u0010dZ\u007f)h|є$HD9P3f\u007fyk\u001f\\P\u0014\u0007#\u001dQ\u007f5Ŧ\\\u001d\u0015n/3T&RwӜ?\u0006L\\%q=\u001c 9i\u0010G\u001c0u\u0007uʜ\u0010~&39s9Q\"Ƞ\u0006NLϙ\u000f\u0007fqas#WN(\u0007\u0016e1Á\u0010`Lߟ\u001dmV_f8a\\*T\u001f}6\u0014ء`}Dƙ=\u0012T\\vs;\\k\r=/\u0015;֍rq\u0016ãQ`9C_r`p`{,?jfۖ\\lJͭ$\\b80Aʴn."}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011OJ9[dnJ\u0014[9\u0012\\6\u0014\u0001mO\fxC7&F\u000bM\u0010Fo| }\u00184jw\u0018", "", "EhSA[", "", "6dX4[;", "Fc_6", "", "Gc_6", "<`\\2", "", "uH8\u00139\u0013CO*zDe(\u0006\u000bxS\u000f5\u007fI\u0003lZ8", "5dc\u0015X0@V(", "u(8", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc$\\+MV", "5dc%W7B", "u(5", "5dc&W7B", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "Bn9 B\u0015", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "BnBAe0GU", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class DisplayModel {
        private final int height;
        private final String name;
        private final int width;
        private final float xdpi;
        private final float ydpi;

        public DisplayModel(int i2, int i3, float f2, float f3, String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.width = i2;
            this.height = i3;
            this.xdpi = f2;
            this.ydpi = f3;
            this.name = name;
        }

        public static /* synthetic */ DisplayModel copy$default(DisplayModel displayModel, int i2, int i3, float f2, float f3, String str, int i4, Object obj) {
            if ((i4 + 1) - (1 | i4) != 0) {
                i2 = displayModel.width;
            }
            if ((i4 + 2) - (2 | i4) != 0) {
                i3 = displayModel.height;
            }
            if ((4 & i4) != 0) {
                f2 = displayModel.xdpi;
            }
            if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
                f3 = displayModel.ydpi;
            }
            if ((i4 & 16) != 0) {
                str = displayModel.name;
            }
            return displayModel.copy(i2, i3, f2, f3, str);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        public final float component3() {
            return this.xdpi;
        }

        public final float component4() {
            return this.ydpi;
        }

        public final String component5() {
            return this.name;
        }

        public final DisplayModel copy(int i2, int i3, float f2, float f3, String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new DisplayModel(i2, i3, f2, f3, name);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisplayModel)) {
                return false;
            }
            DisplayModel displayModel = (DisplayModel) obj;
            return this.width == displayModel.width && this.height == displayModel.height && Intrinsics.areEqual((Object) Float.valueOf(this.xdpi), (Object) Float.valueOf(displayModel.xdpi)) && Intrinsics.areEqual((Object) Float.valueOf(this.ydpi), (Object) Float.valueOf(displayModel.ydpi)) && Intrinsics.areEqual(this.name, displayModel.name);
        }

        public final int getHeight() {
            return this.height;
        }

        public final String getName() {
            return this.name;
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

        public int hashCode() {
            return (((((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + Float.hashCode(this.xdpi)) * 31) + Float.hashCode(this.ydpi)) * 31) + this.name.hashCode();
        }

        public final JSONObject toJSON() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.width);
            jSONObject.put("height", this.height);
            jSONObject.put("xdpi", this.xdpi);
            jSONObject.put("ydpi", this.ydpi);
            jSONObject.put("name", this.name);
            jSONObject.put("isCaptured", "null");
            return jSONObject;
        }

        public String toString() {
            return "DisplayModel(width=" + this.width + ", height=" + this.height + ", xdpi=" + this.xdpi + ", ydpi=" + this.ydpi + ", name=" + this.name + ')';
        }
    }

    public DisplaysModel(List<DisplayModel> displays) {
        Intrinsics.checkNotNullParameter(displays, "displays");
        this.displays = displays;
    }

    public final List<DisplayModel> getDisplays() {
        return this.displays;
    }

    @Override // com.biocatch.android.commonsdk.backend.CollectionItem
    public JSONArray toJSONArray() throws MissingStaticFieldNameException {
        String staticFieldName = CollectorID.Displays.getStaticFieldName();
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.displays.iterator();
        while (it.hasNext()) {
            jSONArray.put(((DisplayModel) it.next()).toJSON());
        }
        Unit unit = Unit.INSTANCE;
        return buildStatic(staticFieldName, jSONArray);
    }
}
