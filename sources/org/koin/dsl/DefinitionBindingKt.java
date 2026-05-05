package org.koin.dsl;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Callbacks;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.OptionDslMarker;
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
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!4i\bӵLc\u0003İIي8\u000bDB\u0007\"2\u0012\u007f\u0007tyA0JfP.hS2\u000fy{<$q$yّS|(Ԃ:\u0011_Rmf~J!\u000bq\u000e&\u001e~̓:Ikw\u0006\u0012=3jwO7SnM9'td\u0004fݍ(P-\u0013Џ22X\u0014|ySKR\u0012^?\u0011@X҈[\u0005B\u00124?H\t.`mMFH3]h.S\rwDf-o2\rMSF\u0003*SȀc6UN;M\u00195S\t\b\u0001Zg\u0007OqC\u0006\u0017&W9Wxo@h\u0006$\u0019;O\u0013^!)\u000b\u000b\u0018Ө\u000eˏ/OqRhK6\u007f\u0013\u0002\u001d>\u0014\u000eL0v-M\u001clڜ\u001c<\u001dxcB`\u0002%K.y\u0012R%-\u0018K;=+hg`\u0002\"^9\f\u0005;)Q\u000bW'kV\u001e`[$3\u0004\u0018ŀS͞AU"}, d2 = {"0h]1", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9sFz.\u0014Y~$@q%2WL\u0011", "!", "", "1kPGm", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "0h]1f", "1kP@f,L", "", "uK^?ZuD]\u001d\bD\\6\n\txd\u007f)\u007fI\u0005&\u001bQxW\"\u0001)>8}!;v\u001a=QMDA*\u0005\u001brp@\u000blu[v(NLL;&8PD\u0010 hc\u0012\u0012\u0017\u0012[\u000b*xH@h\u00066V\u0002\u0005g\u0001\r\u001a\u00179ytL_Y-\u0004\u0019~ )iJbc\tKKN8", "=m29b:>", "\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9wET,?g}}3t\u001d+IAAA", "9nX; *H`\u0019"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DefinitionBindingKt {
    @OptionDslMarker
    public static final /* synthetic */ <S> KoinDefinition<? extends S> bind(KoinDefinition<? extends S> koinDefinition) {
        Intrinsics.checkNotNullParameter(koinDefinition, "<this>");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.LATITUDE_SOUTH);
        bind(koinDefinition, Reflection.getOrCreateKotlinClass(Object.class));
        return koinDefinition;
    }

    @OptionDslMarker
    public static final <S> KoinDefinition<? extends S> bind(KoinDefinition<? extends S> koinDefinition, KClass<S> clazz) {
        Intrinsics.checkNotNullParameter(koinDefinition, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        koinDefinition.getFactory().getBeanDefinition().setSecondaryTypes(CollectionsKt.plus((Collection<? extends KClass<S>>) koinDefinition.getFactory().getBeanDefinition().getSecondaryTypes(), clazz));
        koinDefinition.getModule().saveMapping(BeanDefinitionKt.indexKey(clazz, koinDefinition.getFactory().getBeanDefinition().getQualifier(), koinDefinition.getFactory().getBeanDefinition().getScopeQualifier()), koinDefinition.getFactory());
        return koinDefinition;
    }

    @OptionDslMarker
    public static final KoinDefinition<?> binds(KoinDefinition<?> koinDefinition, KClass<?>[] classes) {
        Intrinsics.checkNotNullParameter(koinDefinition, "<this>");
        Intrinsics.checkNotNullParameter(classes, "classes");
        BeanDefinition<?> beanDefinition = koinDefinition.getFactory().getBeanDefinition();
        beanDefinition.setSecondaryTypes(CollectionsKt.plus((Collection) beanDefinition.getSecondaryTypes(), (Object[]) classes));
        for (KClass<?> kClass : classes) {
            koinDefinition.getModule().saveMapping(BeanDefinitionKt.indexKey(kClass, koinDefinition.getFactory().getBeanDefinition().getQualifier(), koinDefinition.getFactory().getBeanDefinition().getScopeQualifier()), koinDefinition.getFactory());
        }
        return koinDefinition;
    }

    @OptionDslMarker
    public static final <T> KoinDefinition<T> onClose(KoinDefinition<T> koinDefinition, Function1<? super T, Unit> onClose) {
        Intrinsics.checkNotNullParameter(koinDefinition, "<this>");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        koinDefinition.getFactory().getBeanDefinition().setCallbacks(new Callbacks<>(onClose));
        return koinDefinition;
    }
}
