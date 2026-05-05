package com.facebook.fresco.ui.common;

import com.facebook.fresco.ui.common.ControllerListener2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&˛\bDZc|\u0004G\u00068\u000b<a\u0007\"B\u0012\u007fјnjG0LeN/ZS8\u001bsڔ<$q$yCAU\"}0ޛWNmhvJh\fKƤ\u000e\u0016\u000fj4I[\u0004c&%˰`\u0011g5SڎK8\u0011zF\u000702h7(\u00059\u0019K\t\u0013ͯ~CY\rZBNuRR;S5$ \rV&\u0011 lg\u0005Ȥvp&c=+\u001bipTWc>\u0006e\rt^W#\u0005l6=P?E\u001b5U\u0013\u0007\t¹m\u0007OsM\u0005\u0017-U7\u0010֘]~h\u000e!-+}\u0013\u000ex4j\u001dSv\u000bU:\u0016w\u0014r\u001c8\u0010z*\u0013l\b\u001c\u0017?H\\7Jl\u0016 Kv\tRnc2dP\u0014\u0013cL\u0016S\u0015y?\u0002Btgy;GTg\u007f\u0013\u001e6#/xQab%x\u00171S.\u0383aWNU`P Xk\u0003J\u0005Ċ\u0006*\u0012I\u0010\u000e=\u0016).E+g_G49k0R\u000b{?\"n\u0004ki\u0001Np&|'O*7\u0016\u000bJr\u001c\u0004RjWbҊ\u00140Τ\u000b}\u0016/ht\u0006Y9%>T\u007flw{e]8/_lEm\u0007m$VgsyI\u001a\u0006\u001e\u007fjvBElf\u0013i~B\u0002\u0016\u000bb60JJ\u0001\u000f&\u000btT\u001a'JA\b\u001bbAw-%\u0019V\"6Bo\u0003Qqh\t(~\u00039T\rw+\r\u000f\u0011Rlp&Ο'M|\u0015n$EMa=),e$x43Ƚ5\u0003\"\u0003\u001eшNܤPl\u001e߯ʆ\u007fB"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~:\b-Ii#-QL=I>'$uk@\u000ec95z5VLW,i\u001fH", "\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~6y.7K 7\\PEr;\u001e\"OeG\u0016c5N\u0004s\u001d", "u(E", ":hbAX5>`'", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~7\b)Fz 5TCHR8,$hj9\u00140\u0002", "/cS\u0019\\:MS\"~\b", "", ":hbAX5>`", "4na\u0012T*A:\u001d\r\n^5|\u0016", ";dc5b+'O!~", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "=m4:c;R3*~\u0004m", "1`[9X9\u001c]\"\u000ezq;", "", "=m5.\\3N`\u0019", "7c", "Bga<j(;Z\u0019", "", "3wc?T:", "\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~7\b)Fz 5TCHR8,$hj9\u00140j.\n6TH\\\u0002", "=m56a(E7!z|^\u001a|\u0018", "7lP4X\u0010GT#", "3wc?T\u000b:b\u0015", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015KMC55\u001a\u0013h^C\u0011iuO\u0004'UJXulV<;\u001e\u001ab\u0018Wtj\u000fbP1xK>\u001f\u0015\u0013M\u0010Jh\n\f#ZsJ\u0004Qc\fUOXf", "=m8;g,K[\u0019}~Z;|l7a\u0002(\\<\u0005\u001e\u0017F", "=m8;g,K[\u0019}~Z;|l7a\u0002(i@\u0010", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq>", "=mA2_,:a\u0019", "=mBBU4Bb", "@d\\<i,\u001aZ e~l;|\u0012/r\u000e", "@d\\<i,%W'\u000ezg,\n", "\u0011n\\=T5B]\"", "Ch\u001c0b4F]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class ForwardingControllerListener2<I> extends BaseControllerListener2<I> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "FwdControllerListener2";
    private final List<ControllerListener2<I>> listeners = new ArrayList(2);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~:\b-Ii#-QL=I>'$uk@\u000ec95z5VLW,i\u001f1\u001b\u001e\u001ae\nW/\u0017\u000e/", "", "u(E", "\"@6", "", "Ch\u001c0b4F]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void forEachListener(String str, Function1<? super ControllerListener2<I>, Unit> function1) {
        int size = this.listeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                try {
                    function1.invoke(this.listeners.get(i2));
                } catch (Exception e2) {
                    String str2 = "InternalListener exception in " + str;
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final synchronized void addListener(ControllerListener2<I> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(listener);
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onEmptyEvent(Object obj) {
        int size = this.listeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                try {
                    this.listeners.get(i2).onEmptyEvent(obj);
                } catch (Exception e2) {
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onFailure(String id, Throwable th, ControllerListener2.Extras extras) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.listeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                try {
                    this.listeners.get(i2).onFailure(id, th, extras);
                } catch (Exception e2) {
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onFinalImageSet(String id, I i2, ControllerListener2.Extras extras) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.listeners.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                try {
                    this.listeners.get(i3).onFinalImageSet(id, i2, extras);
                } catch (Exception e2) {
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onIntermediateImageFailed(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.listeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                try {
                    this.listeners.get(i2).onIntermediateImageFailed(id);
                } catch (Exception e2) {
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onIntermediateImageSet(String id, I i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.listeners.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                try {
                    this.listeners.get(i3).onIntermediateImageSet(id, i2);
                } catch (Exception e2) {
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onRelease(String id, ControllerListener2.Extras extras) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.listeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                try {
                    this.listeners.get(i2).onRelease(id, extras);
                } catch (Exception e2) {
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onSubmit(String id, Object obj, ControllerListener2.Extras extras) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.listeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                try {
                    this.listeners.get(i2).onSubmit(id, obj, extras);
                } catch (Exception e2) {
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final synchronized void removeAllListeners() {
        this.listeners.clear();
    }

    public final synchronized void removeListener(ControllerListener2<I> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }
}
