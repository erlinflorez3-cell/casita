package com.swmansion.rnscreens;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.ReactViewGroup;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lmA0ReP\u008cZS8\u0018sڔ<$i*yCAX \u00038ޛ\u007fN\u0016f'IlKN\u001f\n$x\u0003,wVޯa\u0012\u001d4\u000b\u001eM<eokC\u0011xD\u001082PD*\t\u000f'BH>\u0005+GY\u001b*0n~jV\u001b]\u001d\u001a@\u0014n$\u000f/tg|D\u000f~.T=&\u001bkXMUc\u0007ŨYϘJ`/˙\u000fc$0N=U\u0017+Z\u0011\u000fҡ_R"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>7\b)Fm\u001f=?P7v?\u001e\">", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001f@v7~F}\u001c5|\u00072MU\u001dx>. >", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r}Av%.`R\u0011/%", "2d[2Z(MS", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>7\b)Fm\u001f=?P7v?\u001e\"'KBm_@X\u00076%HU3YNpCi", "5dc\u0011X3>U\u0015\u000ez\u001d9|\u0005-ty1wO\u0005(\u0017A}\fIv%>gw-7t\u0016*[C", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007}Av%.VR-x0) hnwpl\u0013J\u000b1W[,(cYo9\u0012\u00180", "Adc\u0011X3>U\u0015\u000ez\u001d9|\u0005-ty1wO\u0005(\u0017A}\fIv%>gw-7t\u0016*[C", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5b[*@|\u00167\\5Hg?)\u0015u #\u0010J(b\u00017V*J3cOn;\u001ag\u001e~", "=m;.l6Nb", "", "1gP;Z,=", "", ":dUA", "", "Bn_", "@hV5g", "0ncAb4", "\u001dm;.l6Nbvz\u0002e)x\u00075", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ScreenContentWrapper extends ReactViewGroup {
    private OnLayoutCallback delegate;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\r+4ߚ\u007f\u0007tpA0JgN\u0013hݷZ\u000f\u001az|Ri$\nCiVJ\u00020\u000bgN\u0016j\u001fNh\u000f[\u000f4\u001b)n:Omx\f\u0017?6PvW3{tm=n|N\u0005N7h\\ѯ\t\n"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>7\b)Fm\u001f=?P7v?\u001e\"'KBm_@X\u00076%HU3YNpCi", "", "=m2<a;>\\(p\bZ7\b\t<L{<\u0006P\u0010", "", "1gP;Z,=", "", ":dUA", "", "Bn_", "@hV5g", "0ncAb4", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface OnLayoutCallback {
        void onContentWrapperLayout(boolean z2, int i2, int i3, int i4, int i5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenContentWrapper(ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    public final OnLayoutCallback getDelegate$react_native_screens_release() {
        return this.delegate;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        OnLayoutCallback onLayoutCallback = this.delegate;
        if (onLayoutCallback != null) {
            onLayoutCallback.onContentWrapperLayout(z2, i2, i3, i4, i5);
        }
    }

    public final void setDelegate$react_native_screens_release(OnLayoutCallback onLayoutCallback) {
        this.delegate = onLayoutCallback;
    }
}
