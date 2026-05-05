package org.koin.androidx.scope;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d̉=!4i\bDZc|\u0004G\u00078\u000bDB\u0007Ӭ4\u0012\u0006\u0010nj?0LeV\u008cZݷ2\u000f\u0002{<$a&\nUIX2}P\rwN\u0016g\u001fP`\u000bQ\u0014\u001e\u0016'pD_c\u007fu\u0012=6jom3}wC9n|N\u000761PA@\u0004\u001928R(|\u000bE[\f@4n{bR;M5 \u0018\u0006L%\u0019\u001e\u000bmf@Vxu<E\"1mjNU_H\u0019[\u001a^Tm\u001b\u0017i$ѨNEK\u0014MS1\u0006z[m\u0003\u0006уCݾl'5-i\te̬p\u0002*\u0014YN5]!&\u0013IŌd\u0010?-UdYR˔,\u0007"}, d2 = {"Ab^=X\b<b\u001d\u0010~m@", "\u001ana4\"2HW\"Hvg+\n\u00133d\u0013q\n>\u000b\"\u0017\u0011]\fF\u0002%\u0011W\r$Hq%B#", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "5dc V6ISt|\nb=\u0001\u0018C", "uKP;W9HW\u0018\u0012D_9x\u000b7e\t7E<\f\"`(|\n>~%>hSc\u001ew#0\u0017IEo=g\u0011q`F\u0011g+a@5EVY,&@pG\u001f\u00126\f]/\u001e\thUy", "1qT.g,\u001f`\u0015\u0001\u0003^5\fv-o\u000b(", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "CrT\u001dT9>\\(Zxm0\u000e\r>ym&\u0006K\u0001", "", "1qT.g,,Q#\nz", "And?V,", "", "4qP4`,Gb\u0007|\u0005i,", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "5dc V6IS\u0003\fcn3\u0004", "@d`B\\9>A\u0017\t\u0006^\bz\u00183v\u00047\u0010", "\"", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FragmentExtKt {
    public static final Scope createFragmentScope(Fragment fragment, boolean z2) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        if (!(fragment instanceof AndroidScopeComponent)) {
            throw new IllegalStateException("Fragment should implement AndroidScopeComponent".toString());
        }
        Fragment fragment2 = fragment;
        Scope scopeOrNull = ComponentCallbackExtKt.getKoin(fragment2).getScopeOrNull(KoinScopeComponentKt.getScopeId(fragment));
        if (scopeOrNull == null) {
            scopeOrNull = ComponentActivityExtKt.createScopeForCurrentLifecycle(fragment2, fragment);
        }
        if (z2) {
            FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Scope scopeOrNull2 = ComponentActivityExtKt.getScopeOrNull(fragmentActivityRequireActivity);
            if (scopeOrNull2 != null) {
                scopeOrNull.linkTo(scopeOrNull2);
            } else {
                scopeOrNull.getLogger().debug("Fragment '" + fragment + "' can't be linked to parent activity scope");
            }
        }
        return scopeOrNull;
    }

    public static /* synthetic */ Scope createFragmentScope$default(Fragment fragment, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = true;
        }
        return createFragmentScope(fragment, z2);
    }

    @Deprecated(message = "\u0018T\u0011HvxT@f[-\r^\u00168\u000e=<q")
    @InterfaceC1492Gx
    public static final Scope createScope(Fragment fragment, Object obj) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return ComponentCallbackExtKt.getKoin(fragment).createScope(KoinScopeComponentKt.getScopeId(fragment), KoinScopeComponentKt.getScopeName(fragment), obj);
    }

    public static /* synthetic */ Scope createScope$default(Fragment fragment, Object obj, int i2, Object obj2) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            obj = null;
        }
        return createScope(fragment, obj);
    }

    public static final Lazy<Scope> fragmentScope(final Fragment fragment, final boolean z2) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return LazyKt.lazy(new Function0<Scope>() { // from class: org.koin.androidx.scope.FragmentExtKt.fragmentScope.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Scope invoke() {
                return FragmentExtKt.createFragmentScope(fragment, z2);
            }
        });
    }

    public static /* synthetic */ Lazy fragmentScope$default(Fragment fragment, boolean z2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            z2 = true;
        }
        return fragmentScope(fragment, z2);
    }

    public static final ScopeActivity getScopeActivity(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        if (activity instanceof ScopeActivity) {
            return (ScopeActivity) activity;
        }
        return null;
    }

    public static final Scope getScopeOrNull(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return ComponentCallbackExtKt.getKoin(fragment).getScopeOrNull(KoinScopeComponentKt.getScopeId(fragment));
    }

    public static final /* synthetic */ <T extends ScopeActivity> T requireScopeActivity(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        T t2 = (T) activity;
        if (t2 != null) {
            return t2;
        }
        StringBuilder sb = new StringBuilder("can't get ScopeActivity for class ");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        throw new IllegalStateException(sb.append(Reflection.getOrCreateKotlinClass(ScopeActivity.class)).toString().toString());
    }
}
