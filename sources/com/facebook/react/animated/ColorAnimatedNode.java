package com.facebook.react.animated;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.view.ColorUtil;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XS2\u000fy\u0002<$a'yCQU\"}(\fWNupvJ`\u000bK\u000f\u0014\u0016\u0001̓4Ic\u0005e\u0012\u00153HģU\u074ck\fm9\u000fsf\u0005N2Z7\u0016E\u001c*.V\u0011\u000fzqM\u001c\u0016>C\t:\u0001\u0011]\t(\u0017\u001e>N\u0007ɉ`g\\=\u0011|kQG#1\u0002rT5`H~c\ftVm!?g,DX7c/kgK\r`vW\u0003m\n\u0004\u00059353as\u0006?/ß Ʀ/O\u0015ƞC2j\u000fi`:0\u0002ՕoׂT\u000e0»K\u000b\u001bG\u001c\u000e40~rǉ\u001ej \u00109\u0001\u0001`\u0011d\u0010lZ\u0002\u0011`d&[@\nڂ;ӸjUy=\u001f^E\rU\u0019,5\u0019nOd+טlڠ\u001fT\u007f\u0383\u0002]N@`N8]\u0014Ъ\u0006Ͳf\u00022ʶ\u0001U\u000eB\u0014\u0013D\u0016S92ހ/\u074co\u0002Pֳ8\u0003\u0013t\u0001S\u0018g\u001fؚ.å\u001a72\u009e\\fRz\u001dk~]/\u008f\u001dܖ T\u000fâX\u001f.a\u0010<O+fʝQŹmjUΪܬ)L"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0003?`\b-\u0013v\u001a6IR;j\u001d(\u0014h7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0001>]\u0006\u001cFm\u0015\u0017WB;A", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0001>]\u0006\u001cFm\u0015\u0017WB;]8-\u0018Xl8\u0003r,Js.G*X5]Vt\u0013", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "<`c6i,\u001a\\\u001d\u0007vm,{q9d\u007f6c<\n\u0013\u0019G|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u000e1h\u000217I\u001f2U?Jk3\u0007\u001fgaGn_5Jx'T\"", "@dP0g\bI^ \u0003xZ;\u0001\u00138C\n1\u000b@\u0014&", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1Xy\u001d>m}*X\u0019\"i>&^i]7\u0007`6X|pTLJ*k\u001cnF\u0018\u001aV\u001dN*VmUP(\u007fD\u0013(\f4E\u0011;gi\u0016\u0015\u000eCRlKR\u0012G\u0007j\\?3p\u0010Z[wG>Ol0.\u0019_\u0019ZI\u0004!!u\u0018\u001dh\u001a\u001b\nwQ N]\u0005nkE\u0015\n<.GKeOTohKJj\u0010", "/M^1X\u0010=", "", "0M^1X\u0010=", "1n[<e", "5dc\u0010b3H`", "u(8", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0010b5MS,\u000e", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "5M^1X\u0010=", "<`c6i,\u001c] \t\b", "<`c6i,\u001c] \t\b:7\b\u00103e~", "", "@M^1X\u0010=", "=mD=W(MSv\t\u0004_0~", "", ">qTAg@)`\u001d\b\n", "", "Bqh\u000ec7Eg\u0002z\nb=|f9l\n5", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ColorAnimatedNode extends AnimatedNode implements AnimatedNodeWithUpdateableConfig {
    public static final Companion Companion = new Companion(null);
    private int aNodeId;
    private int bNodeId;
    private int gNodeId;
    private final NativeAnimatedNodesManager nativeAnimatedNodesManager;
    private ReadableMap nativeColor;
    private boolean nativeColorApplied;
    private int rNodeId;
    private final ReactApplicationContext reactApplicationContext;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:SIV2\u007f8\b}P\u0018k|Mr\u000bq\u0013L\u0016ѷn1"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0003?`\b-\u0013v\u001a6IR;j\u001d(\u0014h \u0017\u0011k7J\u007f+QU$", "", "u(E", "5dc\u0010b5MS,\u000e]^3\b\t<", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "<nS2", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0001>]\u0006\u001cFm\u0015\u0017WB;A", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Context getContextHelper(AnimatedNode animatedNode) {
            List<AnimatedNode> list = animatedNode.children;
            if (list == null) {
                return null;
            }
            Iterator<AnimatedNode> it = list.iterator();
            if (!it.hasNext()) {
                return null;
            }
            AnimatedNode next = it.next();
            if (!(next instanceof PropsAnimatedNode)) {
                return ColorAnimatedNode.Companion.getContextHelper(next);
            }
            View connectedView = ((PropsAnimatedNode) next).getConnectedView();
            if (connectedView != null) {
                return connectedView.getContext();
            }
            return null;
        }
    }

    public ColorAnimatedNode(ReadableMap config, NativeAnimatedNodesManager nativeAnimatedNodesManager, ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.reactApplicationContext = reactApplicationContext;
        onUpdateConfig(config);
    }

    private final Context getContext() {
        Activity currentActivity = this.reactApplicationContext.getCurrentActivity();
        return currentActivity != null ? currentActivity : Companion.getContextHelper(this);
    }

    private final void tryApplyNativeColor() {
        Context context;
        if (this.nativeColor == null || this.nativeColorApplied || (context = getContext()) == null) {
            return;
        }
        Integer color = ColorPropConverter.getColor(this.nativeColor, context);
        ValueAnimatedNode valueAnimatedNode = (ValueAnimatedNode) this.nativeAnimatedNodesManager.getNodeById(this.rNodeId);
        ValueAnimatedNode valueAnimatedNode2 = (ValueAnimatedNode) this.nativeAnimatedNodesManager.getNodeById(this.gNodeId);
        ValueAnimatedNode valueAnimatedNode3 = (ValueAnimatedNode) this.nativeAnimatedNodesManager.getNodeById(this.bNodeId);
        ValueAnimatedNode valueAnimatedNode4 = (ValueAnimatedNode) this.nativeAnimatedNodesManager.getNodeById(this.aNodeId);
        if (valueAnimatedNode != null) {
            Intrinsics.checkNotNull(color);
            valueAnimatedNode.nodeValue = Color.red(color.intValue());
        }
        if (valueAnimatedNode2 != null) {
            Intrinsics.checkNotNull(color);
            valueAnimatedNode2.nodeValue = Color.green(color.intValue());
        }
        if (valueAnimatedNode3 != null) {
            Intrinsics.checkNotNull(color);
            valueAnimatedNode3.nodeValue = Color.blue(color.intValue());
        }
        if (valueAnimatedNode4 != null) {
            Intrinsics.checkNotNull(color);
            valueAnimatedNode4.nodeValue = ((double) Color.alpha(color.intValue())) / 255.0d;
        }
        this.nativeColorApplied = true;
    }

    public final int getColor() {
        tryApplyNativeColor();
        ValueAnimatedNode valueAnimatedNode = (ValueAnimatedNode) this.nativeAnimatedNodesManager.getNodeById(this.rNodeId);
        ValueAnimatedNode valueAnimatedNode2 = (ValueAnimatedNode) this.nativeAnimatedNodesManager.getNodeById(this.gNodeId);
        ValueAnimatedNode valueAnimatedNode3 = (ValueAnimatedNode) this.nativeAnimatedNodesManager.getNodeById(this.bNodeId);
        ValueAnimatedNode valueAnimatedNode4 = (ValueAnimatedNode) this.nativeAnimatedNodesManager.getNodeById(this.aNodeId);
        return ColorUtil.normalize(valueAnimatedNode != null ? valueAnimatedNode.nodeValue : 0.0d, valueAnimatedNode2 != null ? valueAnimatedNode2.nodeValue : 0.0d, valueAnimatedNode3 != null ? valueAnimatedNode3.nodeValue : 0.0d, valueAnimatedNode4 != null ? valueAnimatedNode4.nodeValue : 0.0d);
    }

    @Override // com.facebook.react.animated.AnimatedNodeWithUpdateableConfig
    public void onUpdateConfig(ReadableMap readableMap) {
        if (readableMap == null) {
            this.rNodeId = 0;
            this.gNodeId = 0;
            this.bNodeId = 0;
            this.aNodeId = 0;
            this.nativeColor = null;
            this.nativeColorApplied = false;
            return;
        }
        this.rNodeId = readableMap.getInt("r");
        this.gNodeId = readableMap.getInt("g");
        this.bNodeId = readableMap.getInt("b");
        this.aNodeId = readableMap.getInt("a");
        this.nativeColor = readableMap.getMap("nativeColor");
        this.nativeColorApplied = false;
        tryApplyNativeColor();
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public String prettyPrint() {
        return "ColorAnimatedNode[" + this.tag + "]: r: " + this.rNodeId + "  g: " + this.gNodeId + " b: " + this.bNodeId + " a: " + this.aNodeId;
    }
}
