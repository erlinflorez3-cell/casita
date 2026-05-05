package com.facebook.imagepipeline.listener;

import com.facebook.common.logging.FLog;
import com.facebook.imagepipeline.producers.ProducerContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
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
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u0016DLш|\u0004O&8é6B\r14\u0012}\u0007njGOL͜P.`S2\u000fq|<$i0yّCU0}*\tUNog\u0005Jb\u000bI\u0011\u000e\u0016\u0007\u000e4I[xe\u0012\u001d3JoE:UoKBht<\u00066݅@]*\u0005/\u0019bG57\u0012I_\u001c >@\tDb\u0011]\u00070\u00114=6\u007fL]ʄR6Vn\u001eW57\u0013}PN?i@\u0003S\fVV=\f%`L.`9K\u0014SRΫ\u000bRiCKK\u007fD\u001dhU/[M\u0002`NX.\u0013]N]\u0017urTd5Un\u0017?+}o{`\u001c5\u0010\u0007\f\u000fL\u0004<\u00057J>-Hn6\u001cyςx\u001c^^\u0011vB.\u0003\u0012:%5\u00183YJKj_sS\u0019|C,\t\u001b1;\u0001\u001d-\"hV\u0011#/lw\u007f9\u0002FKXf\fo<\u001c\u0015!h\u0010<\u001c2]~]\bA@%:OiI%1k0TTi\u0007\u0005\u000ftih\u0001^\u000767PEA!\f\tL\u0015\u000by`lZB\u0010{-\u0005\r\f\u001a+\"rvj-U\u0016\\g\u0001k\u0001L\f#UAtLq|{\u0010g9\r?ESs\u0010\u0010^\r\u0013mR)\u0019!\u0017Pm$Z\u000b0R8Vz(y\u0012C|\u001dC8M\u000446B0GhEZ\u00113ZO\r\u000boZ\u0017\u001c\u000fVC$1u:s7\u0017\u0017p9\u0006u\u0014a,+hR1OaM\u0019TfRlB\u000f;\u0007-\u007fF[0ZUh\u0005\u0016$],$$*QQ]NY#G?@\u001fEEzz\u0016U[\"?z+\u000b??vL\u007f\b\u0019\nrt3X]s/\"%f#'\u0016t\u0018y\u0010WA[,b\u0019{VI!\u000b\n@\\H\u0015\u0005M/k\u00158@\u000bVECU%F{\"?-a\fz 2\bt'&#q40q8\bb\u007f\u0001xO\u0001_g#V\"R\u00103FVz\u0010\bp\u001ad\u0011AZYd\u001fb~a[A\fk\u001f2\u001drf[h\u0012\u001e\u0004\u000bʠaͫwC\u0006жڔGK"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u000fWPMgA\u001d\u0019qc&\u0007o<N\u00056.P\\;\\[rJ`g", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u001bMOKkB-{loH\u0007l,[C|", ":hbAX5>`'m\u0005:+{", "", "uKY.i(\bc(\u0003\u0002(\u001a|\u0018\u0005)p", "", "uZ;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn<]\f/7v\u0016;\u00170;wD\u001e#wH=\u0015r,Wv4\u0014\"\u0012\u001d", "@d`BX:M:\u001d\r\n^5|\u0016=", "", "/cS\u001fX8NS'\u000eab:\f\t8e\r", "", "@d`BX:M:\u001d\r\n^5|\u0016", "4na\u0012T*A:\u001d\r\n^5|\u0016", ";dc5b+'O!~", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "=m??b+NQ\u0019\fZo,\u0006\u0018", ">q^1h*>`v\t\u0004m,\u0010\u0018", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u?C\u0010r,a\u0006|", ">q^1h*>`\u0002z\u0003^", ">q^1h*>`x\u0010zg;e\u00057e", "=m??b+NQ\u0019\f[b5\u0001\u00172W\u00047~\u001e| \u0015Gv\u00158\u0006)?b", "3wc?T\u0014:^", "", "=m??b+NQ\u0019\f[b5\u0001\u00172W\u00047~!|\u001b\u001eW|\u000e", "B", "", "=m??b+NQ\u0019\f[b5\u0001\u00172W\u00047~.\u0011\u0015\u0015G}\u001c", "=m??b+NQ\u0019\fhm(\n\u0018", "=mA2d<>a(\\vg*|\u00106a\u000f,\u0006I", "=mA2d<>a(_vb3\r\u0016/", "Bga<j(;Z\u0019", "=mA2d<>a(l\nZ9\f", "=mA2d<>a(l\u000b\\*|\u0017=", "=mD9g0FO(~ek6{\u0019-e\r\u0015{<~\u001a\u0017F", "AtR0X:LT)\u0006", "", "@d`B\\9>ax\u0012\nk(d\u0005:", "\u0011n\\=T5B]\"", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ForwardingRequestListener2 implements RequestListener2 {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ForwardingRequestListener2";
    private final List<RequestListener2> requestListeners;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u000fWPMgA\u001d\u0019qc&\u0007o<N\u00056.P\\;\\[rJ`P8\u0018V6\t\u000e]K-D", "", "u(E", "\"@6", "", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ForwardingRequestListener2(Set<? extends RequestListener2> set) {
        if (set == null) {
            this.requestListeners = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.requestListeners = arrayList;
        CollectionsKt.filterNotNullTo(set, arrayList);
    }

    public ForwardingRequestListener2(RequestListener2... listenersToAdd) {
        Intrinsics.checkNotNullParameter(listenersToAdd, "listenersToAdd");
        ArrayList arrayList = new ArrayList(listenersToAdd.length);
        this.requestListeners = arrayList;
        ArraysKt.filterNotNullTo(listenersToAdd, arrayList);
    }

    private final void forEachListener(String str, Function1<? super RequestListener2, Unit> function1) {
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                function1.invoke((RequestListener2) it.next());
            } catch (Exception e2) {
                FLog.e(TAG, "InternalListener exception in " + str, e2);
            }
        }
    }

    public final void addRequestListener(RequestListener2 requestListener) {
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        this.requestListeners.add(requestListener);
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerEvent(ProducerContext producerContext, String producerName, String producerEventName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(producerEventName, "producerEventName");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onProducerEvent(producerContext, producerName, producerEventName);
            } catch (Exception e2) {
                FLog.e(TAG, "InternalListener exception in onIntermediateChunkStart", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerFinishWithCancellation(ProducerContext producerContext, String str, Map<String, String> map) {
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onProducerFinishWithCancellation(producerContext, str, map);
            } catch (Exception e2) {
                FLog.e(TAG, "InternalListener exception in onProducerFinishWithCancellation", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerFinishWithFailure(ProducerContext producerContext, String str, Throwable th, Map<String, String> map) {
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onProducerFinishWithFailure(producerContext, str, th, map);
            } catch (Exception e2) {
                FLog.e(TAG, "InternalListener exception in onProducerFinishWithFailure", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerFinishWithSuccess(ProducerContext producerContext, String str, Map<String, String> map) {
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onProducerFinishWithSuccess(producerContext, str, map);
            } catch (Exception e2) {
                FLog.e(TAG, "InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerStart(ProducerContext producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onProducerStart(producerContext, producerName);
            } catch (Exception e2) {
                FLog.e(TAG, "InternalListener exception in onProducerStart", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestCancellation(ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onRequestCancellation(producerContext);
            } catch (Exception e2) {
                FLog.e(TAG, "InternalListener exception in onRequestCancellation", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestFailure(ProducerContext producerContext, Throwable throwable) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onRequestFailure(producerContext, throwable);
            } catch (Exception e2) {
                FLog.e(TAG, "InternalListener exception in onRequestFailure", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestStart(ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onRequestStart(producerContext);
            } catch (Exception e2) {
                FLog.e(TAG, "InternalListener exception in onRequestStart", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestSuccess(ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onRequestSuccess(producerContext);
            } catch (Exception e2) {
                FLog.e(TAG, "InternalListener exception in onRequestSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onUltimateProducerReached(ProducerContext producerContext, String producerName, boolean z2) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onUltimateProducerReached(producerContext, producerName, z2);
            } catch (Exception e2) {
                FLog.e(TAG, "InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public boolean requiresExtraMap(ProducerContext producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        List<RequestListener2> list = this.requestListeners;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((RequestListener2) it.next()).requiresExtraMap(producerContext, producerName)) {
                return true;
            }
        }
        return false;
    }
}
