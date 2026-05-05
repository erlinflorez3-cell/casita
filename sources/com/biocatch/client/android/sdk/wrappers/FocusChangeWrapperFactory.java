package com.biocatch.client.android.sdk.wrappers;

import android.view.View;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.collection.collectors.elements.FocusChange;
import com.biocatch.client.android.sdk.techicalServices.ReflectionUtils;
import java.lang.reflect.Field;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000fq{<$q$yCAV\"}0\u0015WNmgtϺpŏa\u001f6\u0016'idHe9h\"\u0013@B\b?aNڱA9nv~\u0019.5:8(\t1\u001e8M(v)I{\u0010 7XphZUe\u0013#*\u0006l$1\"jnf6vt\u000e@=-\u001bkXMUjv|\u0016\u001dT`?\u000f\r`L6p;C\u001a=S1\r\u0019[\b\u001bM~U\u0007~&U6ywe;p\u007fB\u001b[S\u001bk\u000b&\u000b\u0014\u0018`\\39O{K~\u000f~¾|ԫ\u0011<\f\u05faΣ+Y"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5\u0015(\u0013xo\u0017\n_5Pv\u0019THY7\\_S9\u0012!d\u001bb\u0001", "", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAv\u00172OSHgC\"\u001fq+\u0017\u0011l-Rx7TH]0f[_=\u001f\u001ch\u0012]5\u001a\u0019/\u0005\u0015", "1qT.g,", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5\u0015(\u0013xo\u0017\n_5Pv\u0019THY7\\_H", "=qX4\\5:Z\n\u0003zp", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "4nRBf\nAO\"\u0001z<3x\u0017=", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[;\u0018L;\u001bb\\=-pD\r", "1qT.g,\u001f]\u0017\u000f\t</x\u00121eq5wK\f\u0017$", "=qX4\\5:Z\u007f\u0003\tm,\u0006\t<", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feIa!\u0015W}k?r.7Yd$E|\u00167MP\u0011", "Bqh\u0014X;&O(~\bb(\u0004h.i\u000f\u0019\u007f@\u0013\u0001$Kq\u0012Er,\u001c]\f/7v\u0016;", "Bqh\u0014X;(\\y\txn:Z\f+n\u0002(bD\u000f&\u0017Po\u001b\u001d\u0004/=:\u0002 >lrB:C<r4\u001c$lkB", "4hT9W\u0015:[\u0019", "", "\u0011n\\=T5B]\"", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class FocusChangeWrapperFactory {
    public static final Companion Companion = new Companion(null);
    private static final String MATERIAL_EDIT_VIEW_INNER_FOCUS_CHANGE_LISTENER = "innerFocusChangeListener";
    private static final String MATERIAL_EDIT_VIEW_OUTER_FOCUS_CHANGE_LISTENER = "outerFocusChangeListener";
    private final ConfigurationRepository configurationRepository;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈ƪ6F"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5\u0015(\u0013xo\u0017\n_5Pv\u0019THY7\\_S9\u0012!d\u001bbij\u000faL wHA(]", "", "u(E", "\u001b@C\u0012E\u0010\u001a:\u0013^YB\u001bvy\u0013Eq\"_)iv\u0004APw\u001af\u0013/7`{ Ou(4')Z\u0014\u0007tU", "", "\u001b@C\u0012E\u0010\u001a:\u0013^YB\u001bvy\u0013Eq\"e0ov\u0004APw\u001af\u0013/7`{ Ou(4')Z\u0014\u0007tU", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FocusChangeWrapperFactory(ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.configurationRepository = configurationRepository;
    }

    private final FocusChangeWrapper createFocusChangeWrapper(FocusChange focusChange, View.OnFocusChangeListener onFocusChangeListener) {
        return new FocusChangeWrapper(focusChange, onFocusChangeListener);
    }

    private final View.OnFocusChangeListener tryGetMaterialEditViewOriginalListener(View view) {
        View.OnFocusChangeListener onFocusChangeListenerTryGetOnFocusChangeListenerFromFieldByReflection = tryGetOnFocusChangeListenerFromFieldByReflection(view, MATERIAL_EDIT_VIEW_INNER_FOCUS_CHANGE_LISTENER);
        View.OnFocusChangeListener onFocusChangeListenerTryGetOnFocusChangeListenerFromFieldByReflection2 = (onFocusChangeListenerTryGetOnFocusChangeListenerFromFieldByReflection == null || !Intrinsics.areEqual(onFocusChangeListenerTryGetOnFocusChangeListenerFromFieldByReflection, view.getOnFocusChangeListener())) ? null : tryGetOnFocusChangeListenerFromFieldByReflection(view, MATERIAL_EDIT_VIEW_OUTER_FOCUS_CHANGE_LISTENER);
        return onFocusChangeListenerTryGetOnFocusChangeListenerFromFieldByReflection2 == null ? view.getOnFocusChangeListener() : onFocusChangeListenerTryGetOnFocusChangeListenerFromFieldByReflection2;
    }

    private final View.OnFocusChangeListener tryGetOnFocusChangeListenerFromFieldByReflection(View view, String str) {
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        Field fieldFindField = reflectionUtils.findField(view.getClass(), str);
        if (fieldFindField == null) {
            return null;
        }
        try {
            reflectionUtils.makeAccessible(fieldFindField);
            return (View.OnFocusChangeListener) fieldFindField.get(view);
        } catch (Exception e2) {
            Log.Companion.getLogger().debug("Failed getting focus change listener.", e2);
            return null;
        }
    }

    public final FocusChangeWrapper create(View originalView, FocusChange focusChangeClass) {
        Intrinsics.checkNotNullParameter(originalView, "originalView");
        Intrinsics.checkNotNullParameter(focusChangeClass, "focusChangeClass");
        return createFocusChangeWrapper(focusChangeClass, this.configurationRepository.getBoolean(ConfigurationFields.isAppUsingRengwuxianLibraryCustomComponents) ? tryGetMaterialEditViewOriginalListener(originalView) : originalView.getOnFocusChangeListener());
    }
}
