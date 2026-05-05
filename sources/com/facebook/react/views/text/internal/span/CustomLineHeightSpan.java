package com.facebook.react.views.text.internal.span;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<G\u0007\"2\u0012\u007f\u0007tpA0JfP.`S2şs{B/c$wFCU0}*ޛeȞ\u0018g\u001dI\u000b\u000bq\u000fF!\tn:Jmx\f\u0014Ƥ6B}B{\u0006}EQ`#?5&@,P{\u001b\u007fH5x\u0014\u0005\u0007[K:\u0017`D~Gj\r{\nJ\u0016\u0014L8\u0001La\u0018RDW\u0005]h4S\u0007wRf'\u000eACa]Ub+%v\u0010#ҋD==Ֆ=U\t\r`bϓ\u0007Q"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001d<\n4~]\u0007/7z\u001f*T\rIv0'^FqG\u0016m45z0G/N0^U\u0002+\u001f\u000ecc", "\u001a`]1e6BRb\u000ezq;F\u0017>y\u0007(E'\u0005 \u0017*o\u0012>y4#dy)\r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001d<\n4~]\u0007/7z\u001f*T\rIv0'^Ua5\u0005r\u001aYr0\u001d", "6dX4[;", "", "uE\u0018#", ":h]2;,BU\u001c\u000e", "", "5dc\u0019\\5>6\u0019\u0003|a;", "u(8", "1g^<f,!S\u001d\u0001}m", "", "BdgA", "", "AsP?g", "3mS", "AoP;f;:`(\u0010", "D", "4l", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&U(y\u0017K^%Df\u0002\u001eEQ\u001f=#", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CustomLineHeightSpan implements LineHeightSpan, ReactSpan {
    private final int lineHeight;

    public CustomLineHeightSpan(float f2) {
        this.lineHeight = (int) Math.ceil(f2);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i2, int i3, int i4, int i5, Paint.FontMetricsInt fm) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        int i6 = fm.descent;
        int i7 = this.lineHeight;
        if (i6 > i7) {
            fm.descent = (int) Math.min(i7, fm.descent);
            fm.bottom = fm.descent;
            fm.ascent = 0;
            fm.top = fm.ascent;
            return;
        }
        if ((-fm.ascent) + fm.descent > this.lineHeight) {
            fm.bottom = fm.descent;
            fm.ascent = (-this.lineHeight) + fm.descent;
            fm.top = fm.ascent;
            return;
        }
        if ((-fm.ascent) + fm.bottom > this.lineHeight) {
            fm.top = fm.ascent;
            fm.bottom = fm.ascent + this.lineHeight;
            return;
        }
        if ((-fm.top) + fm.bottom > this.lineHeight) {
            fm.top = fm.bottom - this.lineHeight;
            return;
        }
        double d2 = (r2 - ((-fm.top) + fm.bottom)) / 2.0f;
        int iCeil = (int) (fm.top - ((float) Math.ceil(d2)));
        int iFloor = (int) (fm.bottom + ((float) Math.floor(d2)));
        fm.top = iCeil;
        fm.ascent = iCeil;
        fm.descent = iFloor;
        fm.bottom = iFloor;
    }

    public final int getLineHeight() {
        return this.lineHeight;
    }
}
