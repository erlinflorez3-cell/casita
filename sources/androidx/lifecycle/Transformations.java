package androidx.lifecycle;

import androidx.arch.core.util.Function;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
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
/* JADX INFO: compiled from: Transformations.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d̉=!4i\bDJe|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?1\\\u0002V\u008cjY:\u0011{{z$\n#\u0012EA٥(}J\u000f_Pwg5J\t\n\n\u0014\u001eV\u0007kDOezm\u0012U4pn_5SڎK9\u0001v<\u0004.4J>\n\u0007\u0011\u001apH>u+]Y\u000f*FPwJWSMŋ\u001e\u0012\fC0\b.a.PɇLlc?]'InZ\u00055`H\u0003]\u000fVTm\u000f%`>-FʺC\u0015EU\t\u0006`]g\tOsM\u0005/'U*y\u0004e<p\f$\u0017;OS]\u0003(l\u0005\u0018b:.qT{\u0014^\u0016@}\u000b}\u001d<J\u00104&h03Կt\b.5zqaBx\bnD\u0010z(6E$0U9<3\u0005ahK\u001e\u00157߉\t\r$(\u0011}1hd\u0010p\u0015aV\u000eP_P͘AHT\u000f\bA4\t\t\u001f\u00102\u001c6W\u0002?{W0E$W]?\u05fa/k\"JJf\u0005\u0007\tnckbH\u0007\"\u001d\u0015g@\u0017\u0015rVt\u0007{P\u001bX<\u0019]\"d\t\u000e\bY\"\u000bvj(k\u0015˃Sr"}, d2 = {"2hbA\\5<b\t\b\nb3Z\f+n\u0002(z", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005(\u0017&k\u001d8L", "&", ";`_", "'", "BqP;f-H`!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u001e\u0010\u0003(\u0011\u000e\u0011\u001du\u000b3\t@\u000f%\tKv\r:r24gS", ";`_\u0013h5<b\u001d\t\u0004", "\u001a`]1e6BR,Hvk*\u007fR-o\r(EP\u0010\u001b\u001e\u0011P\u001eEt49c\u0007u", "AvXAV/&O$", "AvXAV/&O$_\u000bg*\f\r9n", ":hU2V@<Z\u0019F\u0002b=|\b+t{\"\t@\b\u0017\u0013Uo"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Transformations {
    public static final <X, Y> LiveData<Y> map(LiveData<X> liveData, Function1<X, Y> transform) {
        MediatorLiveData mediatorLiveData;
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (liveData.isInitialized()) {
            mediatorLiveData = new MediatorLiveData(transform.invoke(liveData.getValue()));
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1<X, Unit>() { // from class: androidx.lifecycle.Transformations.map.1
            final /* synthetic */ MediatorLiveData<Y> $result;
            final /* synthetic */ Function1<X, Y> $transform;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C08191(MediatorLiveData<Y> mediatorLiveData2, Function1<X, Y> transform2) {
                super(1);
                mediatorLiveData = mediatorLiveData2;
                function1 = transform2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke */
            public final void invoke2(X x2) {
                mediatorLiveData.setValue((Y) function1.invoke(x2));
            }
        }));
        return mediatorLiveData2;
    }

    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$map$1 */
    /* JADX INFO: compiled from: Transformations.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJg\u0003İY\u0006^\nND\u0005Ӭ:\u0012\u0018\tliG1tqV0j[H\u0012\u0014}J#\"$8C\u0002]۟\u0002$\u000fS\\l"}, d2 = {"\n`]<a@F])\rS", "", "&", "'", "F", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C08191<X> extends Lambda implements Function1<X, Unit> {
        final /* synthetic */ MediatorLiveData<Y> $result;
        final /* synthetic */ Function1<X, Y> $transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08191(MediatorLiveData<Y> mediatorLiveData2, Function1<X, Y> transform2) {
            super(1);
            mediatorLiveData = mediatorLiveData2;
            function1 = transform2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2(X x2) {
            mediatorLiveData.setValue((Y) function1.invoke(x2));
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$map$2 */
    /* JADX INFO: compiled from: Transformations.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJg\u0003İY\u0006^\nND\u0005Ӭ:\u0012\u0018\tliG1tqV0j[H\u0012\u0014}J#\"$8C\u0002]۟\u0002$\u000fS\\l"}, d2 = {"\n`]<a@F])\rS", "", "&", "'", "F", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass2<X> extends Lambda implements Function1<X, Unit> {
        final /* synthetic */ Function<X, Y> $mapFunction;
        final /* synthetic */ MediatorLiveData<Y> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MediatorLiveData<Y> mediatorLiveData, Function<X, Y> function) {
            super(1);
            mediatorLiveData = mediatorLiveData;
            function = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2(X x2) {
            mediatorLiveData.setValue((Y) function.apply(x2));
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001t|\u0004)caUg\u0001e#/be[\u0017:P(\u0015`\nZskR43l([yVQ]|>J]4L\u0015^\f|1jMzKSB\u0015 P#R.")
    @InterfaceC1492Gx
    public static final /* synthetic */ LiveData map(LiveData liveData, Function mapFunction) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(mapFunction, "mapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1<X, Unit>() { // from class: androidx.lifecycle.Transformations.map.2
            final /* synthetic */ Function<X, Y> $mapFunction;
            final /* synthetic */ MediatorLiveData<Y> $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(MediatorLiveData<Y> mediatorLiveData2, Function<X, Y> mapFunction2) {
                super(1);
                mediatorLiveData = mediatorLiveData2;
                function = mapFunction2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke */
            public final void invoke2(X x2) {
                mediatorLiveData.setValue((Y) function.apply(x2));
            }
        }));
        return mediatorLiveData2;
    }

    public static final <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, Function1<X, LiveData<Y>> transform) {
        MediatorLiveData mediatorLiveData;
        LiveData<Y> liveDataInvoke;
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (liveData.isInitialized() && (liveDataInvoke = transform.invoke(liveData.getValue())) != null && liveDataInvoke.isInitialized()) {
            mediatorLiveData = new MediatorLiveData(liveDataInvoke.getValue());
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1<X, Unit>() { // from class: androidx.lifecycle.Transformations.switchMap.1
            final /* synthetic */ Ref.ObjectRef<LiveData<Y>> $liveData;
            final /* synthetic */ MediatorLiveData<Y> $result;
            final /* synthetic */ Function1<X, LiveData<Y>> $transform;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C08201(Function1<X, LiveData<Y>> transform2, Ref.ObjectRef<LiveData<Y>> objectRef2, MediatorLiveData<Y> mediatorLiveData2) {
                super(1);
                function1 = transform2;
                objectRef = objectRef2;
                mediatorLiveData = mediatorLiveData2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.lifecycle.LiveData] */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke */
            public final void invoke2(X x2) {
                ?? r2 = (LiveData) function1.invoke(x2);
                if (objectRef.element != r2) {
                    if (objectRef.element != 0) {
                        MediatorLiveData<Y> mediatorLiveData2 = mediatorLiveData;
                        T t2 = objectRef.element;
                        Intrinsics.checkNotNull(t2);
                        mediatorLiveData2.removeSource((LiveData<S>) ((LiveData) t2));
                    }
                    objectRef.element = r2;
                    if (objectRef.element != 0) {
                        MediatorLiveData<Y> mediatorLiveData3 = mediatorLiveData;
                        T t3 = objectRef.element;
                        Intrinsics.checkNotNull(t3);
                        mediatorLiveData3.addSource((LiveData<S>) ((LiveData) t3), new Transformations$sam$androidx_lifecycle_Observer$0(new Function1<Y, Unit>() { // from class: androidx.lifecycle.Transformations.switchMap.1.1
                            final /* synthetic */ MediatorLiveData<Y> $result;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C01291(MediatorLiveData<Y> mediatorLiveData4) {
                                super(1);
                                mediatorLiveData = mediatorLiveData4;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                                invoke2(obj);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke */
                            public final void invoke2(Y y2) {
                                mediatorLiveData.setValue(y2);
                            }
                        }));
                    }
                }
            }

            /* JADX INFO: renamed from: androidx.lifecycle.Transformations$switchMap$1$1 */
            /* JADX INFO: compiled from: Transformations.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJg\u0003İY\u0006^\nND\u0005Ӭ:\u0012\u0018\tliG1tqV0j[H\u0012\u0014}J#\"%8D\u0002]۟\u0002$\u000fS\\l"}, d2 = {"\n`]<a@F])\rS", "", "&", "'", "G", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            static final class C01291<Y> extends Lambda implements Function1<Y, Unit> {
                final /* synthetic */ MediatorLiveData<Y> $result;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01291(MediatorLiveData<Y> mediatorLiveData4) {
                    super(1);
                    mediatorLiveData = mediatorLiveData4;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2(obj);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke */
                public final void invoke2(Y y2) {
                    mediatorLiveData.setValue(y2);
                }
            }
        }));
        return mediatorLiveData2;
    }

    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$switchMap$1 */
    /* JADX INFO: compiled from: Transformations.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJf\u0003İY\u0006^\nND\u0005Ӭ:\u0012\u0018\tliG1tiV0jSp\u000f2\u0004Č(]*tQ?"}, d2 = {"\n`]<a@F])\rS", "", "&", "'", "D`[BX", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C08201<X> extends Lambda implements Function1<X, Unit> {
        final /* synthetic */ Ref.ObjectRef<LiveData<Y>> $liveData;
        final /* synthetic */ MediatorLiveData<Y> $result;
        final /* synthetic */ Function1<X, LiveData<Y>> $transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08201(Function1<X, LiveData<Y>> transform2, Ref.ObjectRef<LiveData<Y>> objectRef2, MediatorLiveData<Y> mediatorLiveData2) {
            super(1);
            function1 = transform2;
            objectRef = objectRef2;
            mediatorLiveData = mediatorLiveData2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.lifecycle.LiveData] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2(X x2) {
            ?? r2 = (LiveData) function1.invoke(x2);
            if (objectRef.element != r2) {
                if (objectRef.element != 0) {
                    MediatorLiveData<Y> mediatorLiveData2 = mediatorLiveData;
                    T t2 = objectRef.element;
                    Intrinsics.checkNotNull(t2);
                    mediatorLiveData2.removeSource((LiveData<S>) ((LiveData) t2));
                }
                objectRef.element = r2;
                if (objectRef.element != 0) {
                    MediatorLiveData<Y> mediatorLiveData3 = mediatorLiveData;
                    T t3 = objectRef.element;
                    Intrinsics.checkNotNull(t3);
                    mediatorLiveData3.addSource((LiveData<S>) ((LiveData) t3), new Transformations$sam$androidx_lifecycle_Observer$0(new Function1<Y, Unit>() { // from class: androidx.lifecycle.Transformations.switchMap.1.1
                        final /* synthetic */ MediatorLiveData<Y> $result;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C01291(MediatorLiveData<Y> mediatorLiveData4) {
                            super(1);
                            mediatorLiveData = mediatorLiveData4;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                            invoke2(obj);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke */
                        public final void invoke2(Y y2) {
                            mediatorLiveData.setValue(y2);
                        }
                    }));
                }
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.Transformations$switchMap$1$1 */
        /* JADX INFO: compiled from: Transformations.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJg\u0003İY\u0006^\nND\u0005Ӭ:\u0012\u0018\tliG1tqV0j[H\u0012\u0014}J#\"%8D\u0002]۟\u0002$\u000fS\\l"}, d2 = {"\n`]<a@F])\rS", "", "&", "'", "G", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class C01291<Y> extends Lambda implements Function1<Y, Unit> {
            final /* synthetic */ MediatorLiveData<Y> $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01291(MediatorLiveData<Y> mediatorLiveData4) {
                super(1);
                mediatorLiveData = mediatorLiveData4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(Y y2) {
                mediatorLiveData.setValue(y2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$switchMap$2 */
    /* JADX INFO: compiled from: Transformations.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001d\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000e6B\r\"4\u0012}\b\u000fiˎ6L{߉^Xc,\u001fk2éRZl\u0005QAm\u001a,)9S\\o\u007fn\u0001ҙQWǇ\n\u0016\u0007s|icxu\u001a\u001f4Rou2cnk:7ҡBӯ$>*\u0600\u0012\u0007\u0007\u001c8K0x\u0001GY\u0011ܞ4J"}, d2 = {"/mS?b0=fb\u0006~_,z\u001d-l\u007fqjM| %Hy\u001bDr49c\u0007.u{(2\\A>S0)S5", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E*}%\u0017T\u0001\u000eIL", ":he27(MO", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005(\u0017&k\u001d8L", "5dc\u0019\\=>2\u0015\u000ev", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J}\u001bXol8\u0006!\u000b", "Adc\u0019\\=>2\u0015\u000ev", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b(GN\nKrzxJ", "=m25T5@S\u0018", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", ":hU2V@<Z\u0019F\u0002b=|\b+t{\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C08212<X> implements Observer<X> {
        final /* synthetic */ MediatorLiveData<Y> $result;
        final /* synthetic */ Function<X, LiveData<Y>> $switchMapFunction;
        private LiveData<Y> liveData;

        C08212(Function<X, LiveData<Y>> function, MediatorLiveData<Y> mediatorLiveData) {
            function = function;
            mediatorLiveData = mediatorLiveData;
        }

        public final LiveData<Y> getLiveData() {
            return this.liveData;
        }

        public final void setLiveData(LiveData<Y> liveData) {
            this.liveData = liveData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.lifecycle.Observer
        public void onChanged(X x2) {
            LiveData<Y> liveData = (LiveData) function.apply(x2);
            Object obj = this.liveData;
            if (obj == liveData) {
                return;
            }
            if (obj != null) {
                MediatorLiveData<Y> mediatorLiveData = mediatorLiveData;
                Intrinsics.checkNotNull(obj);
                mediatorLiveData.removeSource(obj);
            }
            this.liveData = liveData;
            if (liveData != 0) {
                MediatorLiveData<Y> mediatorLiveData2 = mediatorLiveData;
                Intrinsics.checkNotNull(liveData);
                final MediatorLiveData<Y> mediatorLiveData3 = mediatorLiveData;
                mediatorLiveData2.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1<Y, Unit>() { // from class: androidx.lifecycle.Transformations$switchMap$2$onChanged$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                        invoke2(obj2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Y y2) {
                        mediatorLiveData3.setValue(y2);
                    }
                }));
            }
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001t|\u0004)caUg\u0001e#/be[\u0017:P(\u0015`\nZskR43l([yVQ]|>J]4L\u0015^\f|1jMzKSB\u0015 P#R.")
    @InterfaceC1492Gx
    public static final /* synthetic */ LiveData switchMap(LiveData liveData, Function switchMapFunction) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(switchMapFunction, "switchMapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer<X>() { // from class: androidx.lifecycle.Transformations.switchMap.2
            final /* synthetic */ MediatorLiveData<Y> $result;
            final /* synthetic */ Function<X, LiveData<Y>> $switchMapFunction;
            private LiveData<Y> liveData;

            C08212(Function<X, LiveData<Y>> switchMapFunction2, MediatorLiveData<Y> mediatorLiveData2) {
                function = switchMapFunction2;
                mediatorLiveData = mediatorLiveData2;
            }

            public final LiveData<Y> getLiveData() {
                return this.liveData;
            }

            public final void setLiveData(LiveData<Y> liveData2) {
                this.liveData = liveData2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // androidx.lifecycle.Observer
            public void onChanged(X x2) {
                LiveData<Y> liveData2 = (LiveData) function.apply(x2);
                Object obj = this.liveData;
                if (obj == liveData2) {
                    return;
                }
                if (obj != null) {
                    MediatorLiveData<Y> mediatorLiveData2 = mediatorLiveData;
                    Intrinsics.checkNotNull(obj);
                    mediatorLiveData2.removeSource(obj);
                }
                this.liveData = liveData2;
                if (liveData2 != 0) {
                    MediatorLiveData<Y> mediatorLiveData22 = mediatorLiveData;
                    Intrinsics.checkNotNull(liveData2);
                    final MediatorLiveData<Y> mediatorLiveData3 = mediatorLiveData;
                    mediatorLiveData22.addSource(liveData2, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1<Y, Unit>() { // from class: androidx.lifecycle.Transformations$switchMap$2$onChanged$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                            invoke2(obj2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Y y2) {
                            mediatorLiveData3.setValue(y2);
                        }
                    }));
                }
            }
        });
        return mediatorLiveData2;
    }

    public static final <X> LiveData<X> distinctUntilChanged(LiveData<X> liveData) {
        MediatorLiveData mediatorLiveData;
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if (liveData.isInitialized()) {
            booleanRef.element = false;
            mediatorLiveData = new MediatorLiveData(liveData.getValue());
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1<X, Unit>() { // from class: androidx.lifecycle.Transformations.distinctUntilChanged.1
            final /* synthetic */ Ref.BooleanRef $firstTime;
            final /* synthetic */ MediatorLiveData<X> $outputLiveData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MediatorLiveData<X> mediatorLiveData2, Ref.BooleanRef booleanRef2) {
                super(1);
                mediatorLiveData = mediatorLiveData2;
                booleanRef = booleanRef2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(X x2) {
                X value = mediatorLiveData.getValue();
                if (booleanRef.element || ((value == null && x2 != null) || !(value == null || Intrinsics.areEqual(value, x2)))) {
                    booleanRef.element = false;
                    mediatorLiveData.setValue(x2);
                }
            }
        }));
        return mediatorLiveData2;
    }

    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$distinctUntilChanged$1 */
    /* JADX INFO: compiled from: Transformations.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJf\u0003İY\u0006^\nND\u0005Ӭ:\u0012(\u0013tkQ8bgp0hRp\u000f2{z,Ӯ(sI>c\u001e"}, d2 = {"\n`]<a@F])\rS", "", "&", "D`[BX", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1<X> extends Lambda implements Function1<X, Unit> {
        final /* synthetic */ Ref.BooleanRef $firstTime;
        final /* synthetic */ MediatorLiveData<X> $outputLiveData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MediatorLiveData<X> mediatorLiveData2, Ref.BooleanRef booleanRef2) {
            super(1);
            mediatorLiveData = mediatorLiveData2;
            booleanRef = booleanRef2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(X x2) {
            X value = mediatorLiveData.getValue();
            if (booleanRef.element || ((value == null && x2 != null) || !(value == null || Intrinsics.areEqual(value, x2)))) {
                booleanRef.element = false;
                mediatorLiveData.setValue(x2);
            }
        }
    }
}
