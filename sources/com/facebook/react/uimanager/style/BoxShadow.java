package com.facebook.react.uimanager.style;

import com.facebook.react.bridge.ReadableMap;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4B\u0007\":\u0018\u007f\u0007lkA0RnP.Xk2\u000fy\b<$a$w٘Akڼ\u001cF9O|f mn\u001bNS\u0013\u0014\u0016\u0011jZJe|k\u0014'2ppO;SpK<xvL\u0004N62@\u007f\u0005\u000f\u001fBJ&u)D[\u0014\u00180NvRT#L3\u001b\"\u000eD \u000f%tid5vtҺ>/1\f2I\\>w0+NSцUo\u0014\u0005y6+n8{֝&\u001c\u0011\u0015ksA\u0019> AKٙ(ݳ/I\u0002e~f\u000e.--e\f\fslٟ\u0006Ōd\f56\u0018qYk&*\u000ey*\u000e\u0003Ȑ\u000fΝ+H<8bt\u0016*Kv\tRnXHߐCȸ~aD(mPAHQ\u001b\u0015ϟ\u0012A\u001fNE{\u001d\rL$1t'[b\u0010x\u0015IU(Y7RN@`P Xkq4xh\u00028\tHI\u0016.*\u0012^\u001f+7i?;#\u0002\u0001vE\u0018~\u000b`vZ\u0002T^?Pv\\ֺ)Á\u0010ZR\u0003M|^sp,?ULZ\u0015\u001e \u00156[&;gڎ\u0011\u0017Vv\u000b\u0003M\f\u000ekěe\u007f`|\u000e&Wg\u0002yͧP4#oW\u000f\u0016U;\u0011\u0006ֽjJ[\fhh@$8Rx\u001bH\u000fRQ$\u0015H>  ٜ09!\\#W\u001b HN\u000b\u00170mv\u0017\u0017VI#1q˨x\u0011\tPj\u0003\bi~Y:\u000e11;Ai5G'Ɓ&n<ê;\t\u0005\u0007\u000e[8[UN\u0005\u0016$Vދ$\u001c\"ߙi1C(\u001d\u0013yE\u00103]N\td\u007fNɟ+\u0003\u0005y\u001dG\u00010m\u001ex{ރd\u0010"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77r8`1>g3('>", "", "=eU@X;1", "", "=eU@X;2", "1n[<e", "", "0kd?E(=W)\r", "Aoa2T+\u001dW'\u000evg*|", "7mb2g", "", "uE5\u0019](OOb\u0006vg.Fl8t\u007f*{MV}\u001cC\u0001\n\u0006}!>[G\u0001>w\u0012=#*@gE\u001a^o]B\t-\rU\u0001#V\"51Xcn\u0007\u001b\u000ec\u0010\u0018\b\u0017\u000f`A w\u001az\u0010", "5dc\u000f_<K@\u0015}~n:", "u(;7T=:\u001d z\u0004`u]\u00109a\u000f}", "\u001aiPCTuEO\"\u0001D?3\u0007\u0005>;", "5dc\u0010b3H`", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "5dc\u0016a:>b", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "5dc\u001cY-LS(q", "u(5", "5dc\u001cY-LS(r", "5dc c9>O\u0018]~l;x\u0012-e", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n_F", "uE5\u0019](OOb\u0006vg.Fl8t\u007f*{MV}\u001cC\u0001\n\u0006}!>[G\u0001>w\u0012=#*@gE\u001a^o]B\t-\rU\u0001#V\"51Xcn\u0007\u001b\u000ec\u0010\u0018\b\u0017\u000f`A w\u001az\u0006\u00066QK<d~\f\u0013\u0018?p:OV\fE\t^\u0006E1dOUayT\u000bSq>k\f)yfM('\u0010p#->", "3pd._:", "=sW2e", "6`b566=S", "BnBAe0GU", "", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class BoxShadow {
    public static final Companion Companion = new Companion(null);
    private final Float blurRadius;
    private final Integer color;
    private final Boolean inset;
    private final float offsetX;
    private final float offsetY;
    private final Float spreadDistance;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:SIV2\u007f8\b}P\u0018k|Mr\u000bq\u0013L\u001bѷn1"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77r8`1>g3(''?C\u000fn(Wz1P\"", "", "u(E", ">`a@X", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77r8`1>g3('>", "0ng [(=]+", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final BoxShadow parse(ReadableMap boxShadow) {
            Intrinsics.checkNotNullParameter(boxShadow, "boxShadow");
            if (boxShadow.hasKey("offsetX") && boxShadow.hasKey("offsetY")) {
                return new BoxShadow((float) boxShadow.getDouble("offsetX"), (float) boxShadow.getDouble("offsetY"), boxShadow.hasKey("color") ? Integer.valueOf(boxShadow.getInt("color")) : null, boxShadow.hasKey("blurRadius") ? Float.valueOf((float) boxShadow.getDouble("blurRadius")) : null, boxShadow.hasKey("spreadDistance") ? Float.valueOf((float) boxShadow.getDouble("spreadDistance")) : null, boxShadow.hasKey("inset") ? Boolean.valueOf(boxShadow.getBoolean("inset")) : null);
            }
            return null;
        }
    }

    public BoxShadow(float f2, float f3, Integer num, Float f4, Float f5, Boolean bool) {
        this.offsetX = f2;
        this.offsetY = f3;
        this.color = num;
        this.blurRadius = f4;
        this.spreadDistance = f5;
        this.inset = bool;
    }

    public /* synthetic */ BoxShadow(float f2, float f3, Integer num, Float f4, Float f5, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, (4 & i2) != 0 ? null : num, (i2 + 8) - (8 | i2) != 0 ? null : f4, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? null : f5, (-1) - (((-1) - i2) | ((-1) - 32)) == 0 ? bool : null);
    }

    public static /* synthetic */ BoxShadow copy$default(BoxShadow boxShadow, float f2, float f3, Integer num, Float f4, Float f5, Boolean bool, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = boxShadow.offsetX;
        }
        if ((2 & i2) != 0) {
            f3 = boxShadow.offsetY;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            num = boxShadow.color;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            f4 = boxShadow.blurRadius;
        }
        if ((i2 + 16) - (16 | i2) != 0) {
            f5 = boxShadow.spreadDistance;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            bool = boxShadow.inset;
        }
        return boxShadow.copy(f2, f3, num, f4, f5, bool);
    }

    @JvmStatic
    public static final BoxShadow parse(ReadableMap readableMap) {
        return Companion.parse(readableMap);
    }

    public final float component1() {
        return this.offsetX;
    }

    public final float component2() {
        return this.offsetY;
    }

    public final Integer component3() {
        return this.color;
    }

    public final Float component4() {
        return this.blurRadius;
    }

    public final Float component5() {
        return this.spreadDistance;
    }

    public final Boolean component6() {
        return this.inset;
    }

    public final BoxShadow copy(float f2, float f3, Integer num, Float f4, Float f5, Boolean bool) {
        return new BoxShadow(f2, f3, num, f4, f5, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxShadow)) {
            return false;
        }
        BoxShadow boxShadow = (BoxShadow) obj;
        return Float.compare(this.offsetX, boxShadow.offsetX) == 0 && Float.compare(this.offsetY, boxShadow.offsetY) == 0 && Intrinsics.areEqual(this.color, boxShadow.color) && Intrinsics.areEqual((Object) this.blurRadius, (Object) boxShadow.blurRadius) && Intrinsics.areEqual((Object) this.spreadDistance, (Object) boxShadow.spreadDistance) && Intrinsics.areEqual(this.inset, boxShadow.inset);
    }

    public final Float getBlurRadius() {
        return this.blurRadius;
    }

    public final Integer getColor() {
        return this.color;
    }

    public final Boolean getInset() {
        return this.inset;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final Float getSpreadDistance() {
        return this.spreadDistance;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.offsetX) * 31) + Float.hashCode(this.offsetY)) * 31;
        Integer num = this.color;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f2 = this.blurRadius;
        int iHashCode3 = (iHashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.spreadDistance;
        int iHashCode4 = (iHashCode3 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Boolean bool = this.inset;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "BoxShadow(offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", color=" + this.color + ", blurRadius=" + this.blurRadius + ", spreadDistance=" + this.spreadDistance + ", inset=" + this.inset + ")";
    }
}
