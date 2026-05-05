package org.koin.core.module.dsl;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Callbacks;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.OptionDslMarker;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.qualifier.TypeQualifier;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b6B\r@4\u0012\u000e\u0007nj?1LeV:Zݷ2\u000f\u0002{<$q$yّCU0}*ޛWN}gvJp\u000bK\u000f\f\u0017\u0011\u0006:կmx\f\u0011/6HģM3cneApx<\u000402h8(\u0006Gɤ0`.\u0005|[K:\u0011XD\u0001:X\u000e{\u0006J \u0014A8\u000b.bwRFHr^h4Q\u0007\u0002N\\-w0+L5Jd'\u0013w\u0010\u001fCWE<-%\u0002\u0002'VaΪ\u0011?\b<-l7'1J\"X|ݠ\u0006,)9V%]!%\u0005\ta`\u0012(YP\u0014O^\u0016@w)\u0005%p\u0012\u0018\u001e'v-M\u001clڜ\u001c3\u001dxcB`\u0002%B.{\u0012R%/\u0018K;=+hg`\u0002\u0019^9\f\u0005;\u001dQ\fW'kV\u001e`[\u001b3\u0004iz_MUN^\fi=4\u0004\u001fp\",\n\u0382U\u007fW\u0002!0'%}[g1Q\u0017\bHRv\u000f*ppcobJP\"5\u0016e+\u0019\u000ejD\u0013\u0004\u0002O\u0003c\u0015\u0019]\u001ed\u0007D\b)\u001f;\b˶%%\u0016_g2w|ec\u001a'?f}Y\u001dy.Y?ӔA5yi cbvZ?jp5}tQk-jd8(BJz\u0010>{rO\u001c\u0015B? \u001bb7\u001a\u001fl\u0017X\u0003dB \rȤcZn!EԦ=˭\u0002ǭL1\u0017\u0014h^vבuxiC\rh23QSE\u0019lUPiD~3\u0007-r.RѨPGR}F\re\u00040\u001c*;a/\u0004\u0013=\u007f94\u0012-sK!p˛Q\u0012-\fۣy\u0014Ck4\u05308\u0019oރd~"}, d2 = {"0h]1", "", "\"", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9j<r.\u0014Y~$@q%2WL\u0011", "0h]1f", "1kP@f,L", "", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "1qT.g,=/(l\nZ9\f", "<`\\2W", "<`\\2", "", "=m29b:>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9wET,?g}}3t\u001d+IAAA", "=m>=g0H\\'", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9sFz.\u0014Y~$@q%2WL\u0011", "=oc6b5L", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J\u0016%N9l<w)>]\r$Av\u007f9\\GEtBs", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "Ehc5B7MW#\b\t", "\u0012dU6a0MW#\bdi;\u0001\u00138s", "9nX; *H`\u0019"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class OptionDSLKt {
    public static final /* synthetic */ <T> void bind(BeanDefinition<? extends T> beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        List<KClass<?>> secondaryTypes = beanDefinition.getSecondaryTypes();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        beanDefinition.setSecondaryTypes(CollectionsKt.plus((Collection<? extends KClass>) secondaryTypes, Reflection.getOrCreateKotlinClass(Object.class)));
    }

    public static final void binds(BeanDefinition<?> beanDefinition, List<? extends KClass<?>> classes) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        Intrinsics.checkNotNullParameter(classes, "classes");
        beanDefinition.setSecondaryTypes(CollectionsKt.plus((Collection) beanDefinition.getSecondaryTypes(), (Iterable) classes));
    }

    public static final void createdAtStart(BeanDefinition<?> beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        beanDefinition.set_createdAtStart(true);
    }

    public static final /* synthetic */ <T> void named(BeanDefinition<?> beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        beanDefinition.setQualifier(new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class)));
    }

    public static final void named(BeanDefinition<?> beanDefinition, String name) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        beanDefinition.setQualifier(new StringQualifier(name));
    }

    public static final <T> void onClose(BeanDefinition<T> beanDefinition, Function1<? super T, Unit> onClose) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        beanDefinition.setCallbacks(new Callbacks<>(onClose));
    }

    public static final <T> KoinDefinition<T> onOptions(KoinDefinition<T> koinDefinition, Function1<? super BeanDefinition<T>, Unit> function1) {
        Intrinsics.checkNotNullParameter(koinDefinition, "<this>");
        if (function1 != null) {
            BeanDefinition<T> beanDefinition = koinDefinition.getFactory().getBeanDefinition();
            Qualifier qualifier = beanDefinition.getQualifier();
            function1.invoke(beanDefinition);
            if (!Intrinsics.areEqual(beanDefinition.getQualifier(), qualifier)) {
                koinDefinition.getModule().indexPrimaryType(koinDefinition.getFactory());
            }
            if (!beanDefinition.getSecondaryTypes().isEmpty()) {
                koinDefinition.getModule().indexSecondaryTypes(koinDefinition.getFactory());
            }
            if (beanDefinition.get_createdAtStart() && (koinDefinition.getFactory() instanceof SingleInstanceFactory)) {
                koinDefinition.getModule().prepareForCreationAtStart((SingleInstanceFactory) koinDefinition.getFactory());
            }
        }
        return koinDefinition;
    }

    public static /* synthetic */ KoinDefinition onOptions$default(KoinDefinition koinDefinition, Function1 function1, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            function1 = null;
        }
        return onOptions(koinDefinition, function1);
    }

    @OptionDslMarker
    public static final <T> KoinDefinition<T> withOptions(KoinDefinition<T> koinDefinition, Function1<? super BeanDefinition<T>, Unit> options) {
        Intrinsics.checkNotNullParameter(koinDefinition, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        BeanDefinition<T> beanDefinition = koinDefinition.getFactory().getBeanDefinition();
        Qualifier qualifier = beanDefinition.getQualifier();
        options.invoke(beanDefinition);
        if (!Intrinsics.areEqual(beanDefinition.getQualifier(), qualifier)) {
            koinDefinition.getModule().indexPrimaryType(koinDefinition.getFactory());
        }
        if (!beanDefinition.getSecondaryTypes().isEmpty()) {
            koinDefinition.getModule().indexSecondaryTypes(koinDefinition.getFactory());
        }
        if (beanDefinition.get_createdAtStart() && (koinDefinition.getFactory() instanceof SingleInstanceFactory)) {
            koinDefinition.getModule().prepareForCreationAtStart((SingleInstanceFactory) koinDefinition.getFactory());
        }
        return koinDefinition;
    }
}
