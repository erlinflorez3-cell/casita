package com.facebook.react.modules.debug.interfaces;

import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import kotlin.Deprecated;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4V\u0007\"B\u0012\u007f\u0007lkA0ReP\u008cZS8\u001bsڔ:\tqҕ\"CiTb\f0$gN\u0016\u0004\u001fNh([\u000f44?\u000f|_cxu\u0012=3\u0019ŊKݯQyU;ftD\u0007@4(;\b\tQ08M(v)D\"ï\u001eضDzRT\u0013R\u0013\u001c2\bD&\u000f\"-}\\=`l\f;\u0006ݱ\u000fݦFX?a6\u0004[\u000ffV-\u0015\u0005enAN@M\u0015STY\u07be^ÜC\rWsC\u000ev)G-O}e:)\u0016\" CO;^I͍hԇUj$)1ZqMp\u0010.\u0004\t\u007f]R\u0012\u001b\u001e'v/\u0004զrڿ\u0012=\rtYM^\u0004~D\u0006\to:g;\u000eBC9Ig(ŌGϭRA\u0014\u0007\u0013-1\u0003\u000f#ad\u001cde1b\ti1\u007fA\u0014˗Z̆]G\u0006\u0006vs\u0010,$2M\u0012=\u007faN%8O[g$W\u0010@l\u001bЁ\u0003ݶdxckX\\N7\u0007\u0018==\u0017\u000ezFj\u001byT%h:(e\u001c\u0003\u001fTݘ\u0015ء`{T#+)\\iǏhҔܗ]\u000e-1lV\bm±\u0012v߫b2"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006u%2i\u007fi;v%.ZD7i4,^GaJ\u0007j6Yv45L];`[tKi", "", "7r0;\\4:b\u001d\t\u0004?7\u000bg/b\u0010*[I|\u0014\u001eGn", "", "u(I", "Adc\u000ea0FO(\u0003\u0005g\r\b\u0017\u000ee|8} \n\u0013\u0014No\r", "uY\u0018#", "7r32i0<Sw~wn.\\\u0012+b\u0007(z", "Adc\u0011X=BQ\u0019]z[<~h8a|/{?", "7r49X4>\\(b\u0004l7|\u0007>o\r\b\u0005<}\u001e\u0017F", "Adc\u0012_,FS\"\u000e^g:\b\t-t\n5[I|\u0014\u001eGn", "7r5=f\u000b>P)\u0001Zg(y\u0010/d", "Adc\u0013c:\u001dS\u0016\u000f|>5x\u00066e~", "7r7<g\u0014HR)\u0006zK,\b\u0010+c\u007f0{I\u0010v Cl\u0015<u", "Adc\u0015b;&]\u0018\u000f\u0002^\u0019|\u00146a}(\u0004@\n&vPk\u000bCv$", "7r9 7,O;#}z>5x\u00066e~", "Adc\u0017F\u000b>d\u0001\ty^\f\u0006\u0005,l\u007f'", "7r9 @0GW\u001a\u0013Zg(y\u0010/d", "Adc\u0017F\u0014B\\\u001d\u007f\u000f>5x\u00066e~", "7rA2`6MS}lY^)\r\u000b\u000fn{%\u0003@\u007f", "Adc\u001fX4Hb\u0019ch=,y\u00191E\t$xG\u0001\u0016", "7rBAT9MA\u0015\u0007\u0006e0\u0006\u000b\u001ar\n)\u007fG\u0001$\u0001PS\u0017@\u0006", "7rBAT9MA\u0015\u0007\u0006e0\u0006\u000b\u001ar\n)\u007fG\u0001$\u0001PS\u0017@\u0006c1b\u0007*Fi%2WLI", "u(E", "Adc g(Kb\u0007z\u0003i3\u0001\u00121P\r2|D\b\u0017$1xqEz4", ">`R8T.>`v\t\u0004g,z\u00183o\t\u0016{O\u0010\u001b I}", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EK|\u0015\u001dCq\u000eIt/>b}\u001eFq 7\u0017.7i:\u001a\u0017hn\u0017\u0011l5Nt6KVW\u001a\\a\u0002A\u001d\u0014hc", "5dc\u001dT*DO\u001b~\b<6\u0006\u0012/c\u000f,\u0006In\u0017&Vs\u0017>\u0005", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\"\u0013Eu\n>v23c\u0007)7k%2WL\u0005V0\u001c\u001bdc9\u0014A6W\u007f'E[R6e@rL#\u0016c\u0010\\\u0001", "/cS\u001aX5N7(~\u0003", "", "Bhc9X", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface DeveloperSettings {
    @Deprecated(message = "\u000fK\u00036t\u000eTjYT8\u0007Y#3\u000el^\u0018-\u000et\u0011d6O\u0002*\\\u0004crwZkG_\u001c{NV.BL&[P9n\u0018<CnQs\u0018\u0015L HZ\u000e=\u000e~Kq<[]\u0003\tl8\r\u007f\b\u0019M:33)4g/)T0w\u0012%5q\u0012f|")
    @InterfaceC1492Gx
    static /* synthetic */ void isStartSamplingProfilerOnInit$annotations() {
    }

    void addMenuItem(String str);

    PackagerConnectionSettings getPackagerConnectionSettings();

    boolean isAnimationFpsDebugEnabled();

    boolean isDeviceDebugEnabled();

    boolean isElementInspectorEnabled();

    boolean isFpsDebugEnabled();

    boolean isHotModuleReplacementEnabled();

    boolean isJSDevModeEnabled();

    boolean isJSMinifyEnabled();

    boolean isRemoteJSDebugEnabled();

    boolean isStartSamplingProfilerOnInit();

    void setAnimationFpsDebugEnabled(boolean z2);

    void setDeviceDebugEnabled(boolean z2);

    void setElementInspectorEnabled(boolean z2);

    void setFpsDebugEnabled(boolean z2);

    void setHotModuleReplacementEnabled(boolean z2);

    void setJSDevModeEnabled(boolean z2);

    void setJSMinifyEnabled(boolean z2);

    void setRemoteJSDebugEnabled(boolean z2);

    void setStartSamplingProfilerOnInit(boolean z2);
}
