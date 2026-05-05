package androidx.core.animation;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: Animator.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d̉=!4i\bDZc|İI\u0006F\u000b6B\u0015\"4\u0012}\u0007njG0LeN0ZS@\u000fs{:,sҷpQПm\u001a,!1O|g\u0018\u0010P^\u0019D'!&\nz;wUޯa\u001c\u00155RuE7]qC?\u0007yF\u000702P>(\u00071;0L\u001e}\u0013^[\u001d\"?npĐV\u0017S\b*\u0018\fB0\u0003$b\u000eSFJ|]h5Q\u0005\u001acT+m8\u0015h\u001dWd6;vҐ\"5F:E\u001b+W\u0013\tXae\bOsM\u0005\u0017-U-y\u0015]:f\t,0;`\u001dl!&ػ\t[f\u000f71Ug[R\u0014.\u001e\u007f\f\u000fL\u0004<\fUJtƭ ~Z\u001c=\rr\u0002Kx\u0002\rB0\u001cg6%1\u0018N;J+u\u007faޅ\u001dX=~\u0015\u0013$'\u0011p'az\u0013p\u0017+T&W_Sp^NN\u0018fU\t\u0014\u0002r\u0011X\u0004ΥK\n5~!4\u001d)G]?)Gp\u0012JTg%\u000b\u000fjk\u001a`VX\"\u001d\u0015_*7\f\u000bej\u0007y_ls<\"]+\u0003\u0007ą\f\u001d&_\bB') PUn\u0010o]_\u001a%]le[5\u008f\u0014oilCMQ\u0012\u000f\nR%\u0014o]h\u0007fuZn\u001ckl7P2ʮn\u001a}~TT\u0012\u0017BAw\"Z1A\u001bl\u0015v\tLD\bҘ\u000fw\u0006v!\u0017Ta/+iRt9 ^k\t\u000bw\nY;+`Ę1KW8),[&x6\u0003)-\u0004\u0004\u0002WgzMzn.&c\u000e8\u0016H8y/k\u0013? /4\u0010<]g\u0003va\\@'ϸ\u0001\u0004\u0015>x4m\fzr2f\u0011O_V'\"%d!%N۴\u0006\u0012\rT\u000e_c\u0003\u0016\u0004>wr3xJ]P\u0018\u00150.4/oݕ\u0001?3F7#\u001c{$1\u001bg\u0004n\u007f0\nb=,#g\u001c\\q*\bb\u007f\\Z;fI\n D$2{\u001b]X{\b\u0017p\tΌ\u0011=NDtv\\<]\r5\u0004\r\f<\u000f\u0001V\n@AqDҵ4ʧ.\t"}, d2 = {"/cS\u0019\\:MS\"~\b", "\u001a`]1e6BRbz\u0004b4x\u00183o\tqWI\u0005\u001f\u0013Vy\u001bzR.9ay/Az|2[R;t4+j", "\u001a`]1e6BRbz\u0004b4x\u00183o\tqWI\u0005\u001f\u0013Vy\u001b\u0012", "=m4;W", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "/mX:T;H`", "", "=mBAT9M", "=m2.a*>Z", "=mA2c,:b", "/cS\u001dT<LS\u007f\u0003\tm,\u0006\t<", "\u001a`]1e6BRbz\u0004b4x\u00183o\tqWI\u0005\u001f\u0013Vy\u001bzR.9ay/Az\u0001*]Q;R8,$hj9\u00149", "=mA2f<FS", "=m?.h:>", "2n>;6(GQ\u0019\u0006", "/bc6b5", "2n>;85=", "2n>;C(Na\u0019", "2n>;E,IS\u0015\u000e", "2n>;E,Lc!~", "2n>;F;:`(", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnimatorKt {
    public static final Animator.AnimatorPauseListener doOnResume(Animator animator, Function1<? super Animator, Unit> function1) {
        return addPauseListener$default(animator, function1, null, 2, null);
    }

    public static final Animator.AnimatorPauseListener doOnPause(Animator animator, Function1<? super Animator, Unit> function1) {
        return addPauseListener$default(animator, null, function1, 1, null);
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i2, Object obj) {
        if ((1 & i2) != 0) {
            function1 = new Function1<Animator, Unit>() { // from class: androidx.core.animation.AnimatorKt.addListener.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Animator animator2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Animator animator2) {
                    invoke2(animator2);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((2 & i2) != 0) {
            function12 = new Function1<Animator, Unit>() { // from class: androidx.core.animation.AnimatorKt.addListener.2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Animator animator2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Animator animator2) {
                    invoke2(animator2);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function13 = new Function1<Animator, Unit>() { // from class: androidx.core.animation.AnimatorKt.addListener.3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Animator animator2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Animator animator2) {
                    invoke2(animator2);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            function14 = new Function1<Animator, Unit>() { // from class: androidx.core.animation.AnimatorKt.addListener.4
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Animator animator2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Animator animator2) {
                    invoke2(animator2);
                    return Unit.INSTANCE;
                }
            };
        }
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(function14, function1, function13, function12);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static final Animator.AnimatorListener addListener(Animator animator, Function1<? super Animator, Unit> function1, Function1<? super Animator, Unit> function12, Function1<? super Animator, Unit> function13, Function1<? super Animator, Unit> function14) {
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(function14, function1, function13, function12);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, Function1 function1, Function1 function12, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            function1 = new Function1<Animator, Unit>() { // from class: androidx.core.animation.AnimatorKt.addPauseListener.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Animator animator2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Animator animator2) {
                    invoke2(animator2);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            function12 = new Function1<Animator, Unit>() { // from class: androidx.core.animation.AnimatorKt.addPauseListener.2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Animator animator2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Animator animator2) {
                    invoke2(animator2);
                    return Unit.INSTANCE;
                }
            };
        }
        return addPauseListener(animator, function1, function12);
    }

    public static final Animator.AnimatorPauseListener addPauseListener(Animator animator, final Function1<? super Animator, Unit> function1, final Function1<? super Animator, Unit> function12) {
        Animator.AnimatorPauseListener animatorPauseListener = new Animator.AnimatorPauseListener() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$listener$1
            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationPause(Animator animator2) {
                function12.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationResume(Animator animator2) {
                function1.invoke(animator2);
            }
        };
        animator.addPauseListener(animatorPauseListener);
        return animatorPauseListener;
    }

    public static final Animator.AnimatorListener doOnEnd(Animator animator, final Function1<? super Animator, Unit> function1) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                function1.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorListener doOnStart(Animator animator, final Function1<? super Animator, Unit> function1) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                function1.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorListener doOnCancel(Animator animator, final Function1<? super Animator, Unit> function1) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                function1.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorListener doOnRepeat(Animator animator, final Function1<? super Animator, Unit> function1) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                function1.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }
}
