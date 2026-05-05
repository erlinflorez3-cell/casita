package com.facebook.react.module.model;

import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\":\u001b\u007f\u0007luOӄbux.\u0001Rb\u000e{<q*p4uQ;m\u001a,#\u0019S\\i\u007fnx[\u001bG\u001d\t.x\u00190YY\u0007b*\u000f`F\u007fCAS\b=gd\u0005:\u0013'J\"f}\u0015\u0005(2`\u0010%~ŲO\f 9\u0001$JV\u001bW\u001d\u001a@\u0007N$\u000f)tg|7XpkFG#1mRR5lH|{\u0011VX5\u0014\u000faL/P;C\u001d=S1\u000bқ_?\u0011M:A\u0013k?'YM<[DZ\u0018\u0014C,\u0018\u0013kx>\\3U'\u0011o/]ccP<)@~\n\u0012T\u0004<\nwT<92f6\u0012\nςtՂDP\nމ\u0013\f\tlN\u0017S\u0001\nڂ;ӸjQiݢiZE\u0006\u001d\rL$W͜#ƟX\u000ehٽk`\u0006^IQnA\u001fݓ\fՒAm\f͏3\u00118\u000bHG.3ɨ\u00154\u001f¦O]?*/zRWRo\u000f\u0005\u000flרmXPؗ:p\u001c?8\u0018ɚ^U"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'NoWD\u0001$5`G\r7i\u0014=5M:{;\u001exqbC\\", "", "<`\\2", "", "1kP@f\u0015:[\u0019", "1`]\u001ci,K`\u001d}z>?\u0001\u0017>i\t*cJ\u007f'\u001eG", "", "<dT1f\f:U\u0019\f^g0\f", "6`b\u0010b5Lb\u0015\b\nl", "7r2Ek\u0014HR)\u0006z", "7rCBe)H;#}\u000be,", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok#B80`w\u000f", "-mP:X", "-b[.f:'O!~", "-bP;B=>`&\u0003y^\f\u0010\r=t\u00041}(\u000b\u0016'No", "-mT2W:\u001eO\u001b~\bB5\u0001\u0018", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok#B80/%", "u(I", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReactModuleInfo {
    public static final Companion Companion = new Companion(null);
    private final boolean _canOverrideExistingModule;
    private final String _className;
    private final String _name;
    private final boolean _needsEagerInit;
    private final boolean isCxxModule;
    private final boolean isTurboModule;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:UIV2}P\u000b\u007fVuj\u0007Nj\u000bI\u00104\u001a?o\u0082MZ"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'NoWD\u0001$5`G\r7i\u0014=5M:{;\u001exqbCEA6V\u0002#PPX52", "", "u(E", "1kP@f\u0010LB)\fwh\u0014\u0007\b?l\u007f", "", "1kPGm", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean classIsTurboModule(Class<?> clazz) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            return TurboModule.class.isAssignableFrom(clazz);
        }
    }

    public ReactModuleInfo(String _name, String _className, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(_name, "_name");
        Intrinsics.checkNotNullParameter(_className, "_className");
        this._name = _name;
        this._className = _className;
        this._canOverrideExistingModule = z2;
        this._needsEagerInit = z3;
        this.isCxxModule = z4;
        this.isTurboModule = z5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "8Y\u0001tcy\u0016Zl47~e!17jR\u0018nw|\u001e[\u0005M:*A\t6ovS0\u0002OkwEK\u001fA\u0006QX[\t.]II1}6!\u001bS\u0019E)Bs\u0004\u0002\u001b{<\u001dYFx")
    @InterfaceC1492Gx
    public ReactModuleInfo(String name, String className, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this(name, className, z2, z3, z5, z6);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(className, "className");
    }

    @JvmStatic
    public static final boolean classIsTurboModule(Class<?> cls) {
        return Companion.classIsTurboModule(cls);
    }

    public final boolean canOverrideExistingModule() {
        return this._canOverrideExistingModule;
    }

    public final String className() {
        return this._className;
    }

    @Deprecated(message = "7N\u0005H1}(\u0017`H:~S$0S`\f\u001d6Dz\u0011f\fX|*b\u00079k4\fvGT]z=R#FMQ_R96`MzrM8'\u0018LSL\u001c\ns\u0005\u0002\u001a\u0003K\u001dY\u0012\u000f\u001d1\u001a;V\u001fS")
    @InterfaceC1492Gx
    public final boolean hasConstants() {
        return true;
    }

    public final boolean isCxxModule() {
        return this.isCxxModule;
    }

    public final boolean isTurboModule() {
        return this.isTurboModule;
    }

    public final String name() {
        return this._name;
    }

    public final boolean needsEagerInit() {
        return this._needsEagerInit;
    }
}
