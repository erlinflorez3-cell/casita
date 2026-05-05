package com.facebook.imagepipeline.common;

import com.facebook.common.util.HashCodeUtil;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\":\u0017\u007f\u0007lkA0RnP.XT2\u000fy\b<$a$\bّYbJ}P\b\bMt(\u0018P_\u001bG\u001d\u0006.x\u0019-YY\u0007_*\u000f`C\u007fE9M}@Q`#:\u0015&8\"F~\u001d\u0001H.Н\u0014v\tI\u0014\u001d 7XphZ=S\u0013#*\bT\u001f/\u001d#ɸN~NzgR/Q\u00040V\u0017-m;\u0015M;R\u001b;]\u0005o C@e6K)*ΐ\tқ_?\u000bӊBK\u0013k?'YM*[\rݡ\u0002Џ\u0019+WՕ.\u00014a\u001dQ\u000f\u0010]/&ҲMח\u0012(\u007f\u07beL\u001bJ\u0004&\u0006UId1pǙ\nԧ7tzԟĜT\u0010"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z\u0016<QX;U?-\u0019rjG\\", "", "EhSA[", "", "6dX4[;", ";`g\u000f\\;FO$l~s,", "", "@nd;W\u001cI4&zxm0\u0007\u0012", "uH8\u00139o/", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ResizeOptions {
    public static final Companion Companion = new Companion(null);
    public static final float DEFAULT_ROUNDUP_FRACTION = 0.6666667f;
    public final int height;
    public final float maxBitmapSize;
    public final float roundUpFraction;
    public final int width;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106Ȑ\u0007\"B\u0012\u007fјnjG6LeN0Xݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018fuj\u0007Lp\nq\u00136\u001a\u0007oDI\u0004~\u000e\u0016\u001d9Zom9\u0014t\u0006In|N\u000761P<*\t\u000f#BH>|AH\u001c\u0018 1XphTc˦Wܨ\u0016\u0006FĨӞ\"f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z\u0016<QX;U?-\u0019rjGEA6V\u0002#PPX52", "", "u(E", "\u0012D5\u000eH\u0013-M\u0006hjG\u000bls)Fl\u0004Y/d\u0001\u007f", "", "4na\u0011\\4>\\'\u0003\u0005g:", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z\u0016<QX;U?-\u0019rjG\\", "EhSA[", "", "6dX4[;", "4na d<:`\u0019l~s,", "Ahi2", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ResizeOptions forDimensions(int i2, int i3) {
            if (i2 <= 0 || i3 <= 0) {
                return null;
            }
            return new ResizeOptions(i2, i3, 0.0f, 0.0f, 12, null);
        }

        @JvmStatic
        public final ResizeOptions forSquareSize(int i2) {
            if (i2 <= 0) {
                return null;
            }
            return new ResizeOptions(i2, i2, 0.0f, 0.0f, 12, null);
        }
    }

    public ResizeOptions(int i2, int i3) {
        this(i2, i3, 0.0f, 0.0f, 12, null);
    }

    public ResizeOptions(int i2, int i3, float f2) {
        this(i2, i3, f2, 0.0f, 8, null);
    }

    public ResizeOptions(int i2, int i3, float f2, float f3) {
        this.width = i2;
        this.height = i3;
        this.maxBitmapSize = f2;
        this.roundUpFraction = f3;
        if (i2 <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i3 <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public /* synthetic */ ResizeOptions(int i2, int i3, float f2, float f3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, (4 & i4) != 0 ? 2048.0f : f2, (i4 + 8) - (i4 | 8) != 0 ? 0.6666667f : f3);
    }

    @JvmStatic
    public static final ResizeOptions forDimensions(int i2, int i3) {
        return Companion.forDimensions(i2, i3);
    }

    @JvmStatic
    public static final ResizeOptions forSquareSize(int i2) {
        return Companion.forSquareSize(i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResizeOptions) {
            ResizeOptions resizeOptions = (ResizeOptions) obj;
            if (this.width == resizeOptions.width && this.height == resizeOptions.height) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return HashCodeUtil.hashCode(this.width, this.height);
    }

    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }
}
