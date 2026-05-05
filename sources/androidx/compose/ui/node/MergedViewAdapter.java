package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: ViewInterop.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLcz\u0004I\u0006>*6B\u0005#4\u0012\u0006\rnj?1LeV.Zݷ2\u000f\u0002{<řc$\bCCU \u007f*\teNogtK`ŏYƤ6\u0016'ilLǤ|] \u000fzX}HKM\u001eGid\u0003A\u001d `.h}\u0013\u000e2*v\u001e=\u000f\fa\u001a!H@\u001fD\u0003\u0011[\u00102\u00124JP\u0005,i\u007fNdV3q\u0003[1\u0013\u0002B\u00158\u007f6\u0003ձ\u001bW|';u\u0012\"9EO5C+\u0004\r\u0015dsE\u0013A\u0002=KyU:qɥyɱ:X\u000e(]A]\"urTf5Un\u0017?+}o{T\u001c5\u0010z*\u001b\u0003\u0018^\u001b5IF3*h\u0018\u000eas!UĖT\bfۍ\u0018|g9%)PE9>3f\u007fg\u0012ϡ\u0011Ѽ\u007f\u000b\u0015̔;\u0003t(i\\\u05fed+"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9u<\u0004'5Xn$7\u007fq-INJkAs", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9~@v7\u0011Xy+Fm#\u0004", "u(E", "/cP=g,Ka", "", "5dc\u000eW(Ib\u0019\f\t", "u(;7T=:\u001d)\u000e~euc\r=tU", "7c", "", "5dc\u0016W", "u(8", "2hS\u0016a:>`(", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", ">`a2a;", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "2hS\"c+:b\u0019", "5dc", "\"", "4`RAb9R", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuzT\u00127LPEo31^fkA\u0012m:N@7K\u0016W6[R<.\u0018\u0012liM'\u0018\u0014YNy", "Eh[9<5LS&\u000e", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MergedViewAdapter implements ViewAdapter {
    public static final int $stable = 8;
    private final List<ViewAdapter> adapters = new ArrayList();
    private final int id;

    @Override // androidx.compose.ui.node.ViewAdapter
    public int getId() {
        return this.id;
    }

    public final List<ViewAdapter> getAdapters() {
        return this.adapters;
    }

    public final <T extends ViewAdapter> T get(int i2, Function0<? extends T> function0) {
        ViewAdapter viewAdapter;
        List<ViewAdapter> adapters = getAdapters();
        int size = adapters.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                viewAdapter = null;
                break;
            }
            viewAdapter = adapters.get(i3);
            if (viewAdapter.getId() == i2) {
                break;
            }
            i3++;
        }
        T t2 = viewAdapter instanceof ViewAdapter ? (T) viewAdapter : null;
        if (t2 != null) {
            return t2;
        }
        T tInvoke = function0.invoke();
        getAdapters().add(tInvoke);
        return tInvoke;
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void willInsert(View view, ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2).willInsert(view, viewGroup);
        }
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didInsert(View view, ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2).didInsert(view, viewGroup);
        }
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didUpdate(View view, ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2).didUpdate(view, viewGroup);
        }
    }
}
