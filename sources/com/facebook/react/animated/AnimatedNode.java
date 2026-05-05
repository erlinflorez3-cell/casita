package com.facebook.react.animated;

import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u0006&nj?0LeV.ZS0\u0012s{B0c$wFAy0Ԃ@\u001b\u007fN\u0016f'IlKFǇ\n\u0016\u0007jtUc\u007fu\u0012=:rsM<eokʠ)\u0003D\u000f82P@*\t\u000f%BH>͌AW\u0014\u001a <XphZ=Q\u0013%*\u0006lĨG2%m\\C`l\fHuGKmP]?_^\u000b\u0016\u0019Td?\r%iN/N@M\u0015SمK\r`lW\u0003my\u0004\u0019975,as\u00068\u000fÜRƃ\u0002˿\u0019ǁv&dӤ\"p\u001a*CO\u0012M\u0007ʫf»QԊ\u0019ʀ\b\u000e\u000eΩ\u0019F;\u001e~\u0010\u001e5\u0005r\u0002óf\u0001\rG6Э اmӝ\fĴ/9#Ƙ\"qI\u001ff7*\u0007C̔aЧEđgڍ\u0012`\u001dÑǁ{d"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0001>]\u0006\u001cFm\u0015\u0017WB;A", "", "u(E", "\u0010EB\u0010b3H`", "", "/bc6i,\"\\\u0017\t\u0003b5~q9d\u007f6", "1gX9W9>\\", "", "B`V", "/cS\u0010[0ER", "", "1gX9W", "=m0Ag(<V\u0019}ih\u0015\u0007\b/", ">`a2a;", "=m32g(<V\u0019}[k6\u0005q9d\u007f", ">qTAg@)`\u001d\b\n", "", ">qTAg@)`\u001d\b\nP0\f\f\rh\u0004/zM\u0001 ", "@d\\<i,\u001cV\u001d\u0006y", "CoS.g,", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class AnimatedNode {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_ANIMATED_NODE_CHILD_COUNT = 1;
    public static final int INITIAL_BFS_COLOR = 0;
    public int BFSColor;
    public int activeIncomingNodes;
    public List<AnimatedNode> children;
    public int tag = -1;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈ƪ6F"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0001>]\u0006\u001cFm\u0015\u0017WB;*\u0012(\u001ds]B\u000bm5$", "", "u(E", "\u0012D5\u000eH\u0013-Mtg^F\bkh\u000e_h\u0012Z zty+Vl6T\u000f%Bl", "", "\u0017M8!<\b%Mu_hX\nfo\u0019R", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void addChild(AnimatedNode child) {
        Intrinsics.checkNotNullParameter(child, "child");
        ArrayList arrayList = this.children;
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            this.children = arrayList;
        }
        arrayList.add(child);
        child.onAttachedToNode(this);
    }

    public void onAttachedToNode(AnimatedNode parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
    }

    public void onDetachedFromNode(AnimatedNode parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
    }

    public abstract String prettyPrint();

    public final String prettyPrintWithChildren() {
        List<AnimatedNode> list = this.children;
        String strJoinToString$default = list != null ? CollectionsKt.joinToString$default(list, Global.BLANK, null, null, 0, null, null, 62, null) : null;
        String str = strJoinToString$default;
        return prettyPrint() + ((str == null || StringsKt.isBlank(str)) ? "" : " children: " + strJoinToString$default);
    }

    public final void removeChild(AnimatedNode child) {
        Intrinsics.checkNotNullParameter(child, "child");
        List<AnimatedNode> list = this.children;
        if (list == null) {
            return;
        }
        child.onDetachedFromNode(this);
        list.remove(child);
    }

    public void update() {
    }
}
