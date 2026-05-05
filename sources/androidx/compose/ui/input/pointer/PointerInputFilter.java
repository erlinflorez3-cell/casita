package androidx.compose.ui.input.pointer;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
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
/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u0005'4\u0012\u000e\u0007nj?6Le^.ZS0\u0010s{B$c$wCCU0}*ޛWN}gvJ`\rI4\u001cǝ)jZH\u0016{ٕ\u0016\u000f@B8EAc\b=gw;ZMH@:Py3\u0018J.V)\u000fzqe<\u0016>[\t:\u0001)}\t(/\u001e>N\u0014d\u0001˚MȤՂp_@M1\":T\\(w0+OC\u001b+ܢ\u000fțe\"CB=8#)$\u001b\u0015Ws?1AHܶ\u0011ص+33ɞ\fY<^\u000e\u00185-U\u0014kzvv\u0013Zx\u000e=*}m\"ֵ\u001a߭{\u0007\u0004ȞT\u0006\u0014\u00115TN/ s\u0016\u001c\u0004\r\u0001bXP0`xTQʿ8а)\nC-?+tQy=\u001f_E\u007fU\",5\u0019nOn\u000bRؤ\u0014ÑȑvPśUDUJT\u001egRЪ\u0004yj\u00050˘Lu~7{\u0017Mϸ)W"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u001a\u000bj;N\u0004|", "", "u(E", "7mc2e*>^(h\u000bm\u0016}e9u\t'\n\u001e\u0004\u001b\u001eFO\u001f<\u007f4C", "", "5dc\u0016a;>`\u0017~\u0006m\u0016\r\u0018\u0019f\\2\fI\u007f%tJs\u0015;V65b\r.", "u(I", "7r0Ag(<V\u0019}", "7r0Ag(<V\u0019}9n0v\u0016/l\u007f$\n@", "Adc\u000eg;:Q\u001c~y\u001d<\u0001\u0003<e\u0007(wN\u0001", "uY\u0018#", ":`h<h;\u001c]#\fyb5x\u0018/s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "5dc\u0019T@Hc(\\\u0005h9{\r8a\u000f(\n~\u0011\u001b\u0011To\u0015<r35", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", "Adc\u0019T@Hc(\\\u0005h9{\r8a\u000f(\n~\u0011\u001b\u0011To\u0015<r35", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7|w", "AgP?X\u001eBb\u001cl~[3\u0001\u00121s", "5dc [(KS\u000b\u0003\na\u001a\u0001\u00066i\t*\n~|  Q~\nKz/>g", "5dc [(KS\u000b\u0003\na\u001a\u0001\u00066i\t*\n", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc \\A>\u001b\r{\u000ff\u0013I\u000b", "u(9", "=m2.a*>Z", "", "=m?<\\5MS&^\f^5\f", ">nX;g,K3*~\u0004m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", ">`b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp$\u0003q:$", "0nd;W:", "=m?<\\5MS&^\f^5\fP\u00120\u000b\u0015\fJt", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjH\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N]J/~S\u0001*\u00120R\u0011;uJv \u0012>ypO6!G\u0003$`=7v\u001c>#j", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class PointerInputFilter {
    public static final int $stable = 8;
    private boolean isAttached;
    private LayoutCoordinates layoutCoordinates;

    public static /* synthetic */ void getShareWithSiblings$annotations() {
    }

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    public boolean getShareWithSiblings() {
        return false;
    }

    public abstract void onCancel();

    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public abstract void mo5409onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2);

    public final LayoutCoordinates getLayoutCoordinates$ui_release() {
        return this.layoutCoordinates;
    }

    public final void setLayoutCoordinates$ui_release(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g */
    public final long m5408getSizeYbymL2g() {
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        return layoutCoordinates != null ? layoutCoordinates.mo5522getSizeYbymL2g() : IntSize.Companion.m6813getZeroYbymL2g();
    }

    public final boolean isAttached$ui_release() {
        return this.isAttached;
    }

    public final void setAttached$ui_release(boolean z2) {
        this.isAttached = z2;
    }
}
