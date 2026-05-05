package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
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
/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007f\u0007lkA0ReP.XU0\u000e\u0002ڔd$\n#2NKY(}:\t}O˗knX\\SI\u001d\r.x\u00194\u0010UAc \u0018JB\u001eGya8CGj\r63(x6\u0001\u0006\u0013\f2*v\u0018'~QK$\u0012^AAF`\re\u0005H\u0013\\̇,Ә\"\\oޮ\u0007Zz`R/Q\u0007@ŀ\u0011Ϯc6\u0005ձ%HZ,\u001b|Җ\"7"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@25`\b\u001e3|\u001a8V\r\u0018x8'\u0017LjH\u0011T0N\t\u0014GX^,jarJ|\u001cY\u000e$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "@d`BX:MS&", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@25`\b\u001e3|\u001a8V\r\u0018x8'\u0017LjH\u0011T0N\t\u0014GX^,jarJi", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnBY\u0005*5i%2WL\u0005HA\"\u001ejEB\u0016m\u001dRv94LZ<\\`\u0002=!g\u001e~", "Ag^B_+\u001ac(\t^g=x\u00103d{7{", "", "5dc [6NZ\u0018Z\u000bm6`\u0012@a\u0007,z<\u0010\u0017", "u(I", "2hb=b:>@\u0019\u000b\u000b^:\f\t<", "", "=m0Ag(<V", "=m32g(<V", "CoS.g,+S%\u000fzl;|\u0016", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BringIntoViewRequesterNode extends Modifier.Node {
    public static final int $stable = 8;
    private BringIntoViewRequester requester;
    private final boolean shouldAutoInvalidate;

    public BringIntoViewRequesterNode(BringIntoViewRequester bringIntoViewRequester) {
        this.requester = bringIntoViewRequester;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateRequester(this.requester);
    }

    public final void updateRequester(BringIntoViewRequester bringIntoViewRequester) {
        disposeRequester();
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) bringIntoViewRequester).getModifiers().add(this);
        }
        this.requester = bringIntoViewRequester;
    }

    private final void disposeRequester() {
        BringIntoViewRequester bringIntoViewRequester = this.requester;
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            Intrinsics.checkNotNull(bringIntoViewRequester, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((BringIntoViewRequesterImpl) bringIntoViewRequester).getModifiers().remove(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeRequester();
    }
}
