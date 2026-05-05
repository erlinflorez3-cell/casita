package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: KeyMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d̉=!4i\bDJe|\u0004W\u00068\u000bDB\u0007\":\u001b\u007fј~\u0005G2\\ev-\u0003c8\u0012\u0004\bD&k$ HKW*}P\u000f}R.˧\u000f\\hŏ[\u000f4\u0015O̔.֒Y~e܈'4HoM4ޢsD"}, d2 = {"2dU.h3M9\u0019\u0013bZ7\b\r8g", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*\u0016INFo= j", "5dc\u0011X-:c \u000e`^@d\u0005:p\u00041}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7{.a+7v?\"\u001ej7", "1n\\:b5$S-fvi7\u0001\u00121", "Ag^?g*Nb\u0001\tyb-\u0001\t<", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\u0017~\u00167\\\u0019", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    public static final KeyMapping commonKeyMapping(final Function1<? super KeyEvent, Boolean> function1) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo1334mapZmokQxo(android.view.KeyEvent keyEvent) {
                if (function1.invoke(KeyEvent.m5226boximpl(keyEvent)).booleanValue() && KeyEvent_androidKt.m5249isShiftPressedZmokQxo(keyEvent)) {
                    if (Key.m4935equalsimpl0(KeyEvent_androidKt.m5243getKeyZmokQxo(keyEvent), MappedKeys.INSTANCE.m1388getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (function1.invoke(KeyEvent.m5226boximpl(keyEvent)).booleanValue()) {
                    long jM5243getKeyZmokQxo = KeyEvent_androidKt.m5243getKeyZmokQxo(keyEvent);
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo, MappedKeys.INSTANCE.m1368getCEK5gGoQ()) ? true : Key.m4935equalsimpl0(jM5243getKeyZmokQxo, MappedKeys.INSTANCE.m1378getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo, MappedKeys.INSTANCE.m1385getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo, MappedKeys.INSTANCE.m1386getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo, MappedKeys.INSTANCE.m1365getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo, MappedKeys.INSTANCE.m1387getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo, MappedKeys.INSTANCE.m1388getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m5247isCtrlPressedZmokQxo(keyEvent)) {
                    return null;
                }
                if (KeyEvent_androidKt.m5249isShiftPressedZmokQxo(keyEvent)) {
                    long jM5243getKeyZmokQxo2 = KeyEvent_androidKt.m5243getKeyZmokQxo(keyEvent);
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo2, MappedKeys.INSTANCE.m1373getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo2, MappedKeys.INSTANCE.m1374getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo2, MappedKeys.INSTANCE.m1375getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo2, MappedKeys.INSTANCE.m1372getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo2, MappedKeys.INSTANCE.m1382getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo2, MappedKeys.INSTANCE.m1381getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo2, MappedKeys.INSTANCE.m1380getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo2, MappedKeys.INSTANCE.m1379getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo2, MappedKeys.INSTANCE.m1378getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM5243getKeyZmokQxo3 = KeyEvent_androidKt.m5243getKeyZmokQxo(keyEvent);
                if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo3, MappedKeys.INSTANCE.m1373getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo3, MappedKeys.INSTANCE.m1374getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo3, MappedKeys.INSTANCE.m1375getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo3, MappedKeys.INSTANCE.m1372getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo3, MappedKeys.INSTANCE.m1382getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo3, MappedKeys.INSTANCE.m1381getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo3, MappedKeys.INSTANCE.m1380getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo3, MappedKeys.INSTANCE.m1379getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo3, MappedKeys.INSTANCE.m1376getEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo3, MappedKeys.INSTANCE.m1367getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo3, MappedKeys.INSTANCE.m1371getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo3, MappedKeys.INSTANCE.m1383getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo3, MappedKeys.INSTANCE.m1370getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo3, MappedKeys.INSTANCE.m1369getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo3, MappedKeys.INSTANCE.m1384getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m5247isCtrlPressedZmokQxo(((KeyEvent) obj).m5232unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo1334mapZmokQxo(android.view.KeyEvent keyEvent) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m5249isShiftPressedZmokQxo(keyEvent) && KeyEvent_androidKt.m5247isCtrlPressedZmokQxo(keyEvent)) {
                    long jM5243getKeyZmokQxo = KeyEvent_androidKt.m5243getKeyZmokQxo(keyEvent);
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo, MappedKeys.INSTANCE.m1373getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo, MappedKeys.INSTANCE.m1374getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo, MappedKeys.INSTANCE.m1375getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo, MappedKeys.INSTANCE.m1372getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m5247isCtrlPressedZmokQxo(keyEvent)) {
                    long jM5243getKeyZmokQxo2 = KeyEvent_androidKt.m5243getKeyZmokQxo(keyEvent);
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo2, MappedKeys.INSTANCE.m1373getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo2, MappedKeys.INSTANCE.m1374getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo2, MappedKeys.INSTANCE.m1375getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo2, MappedKeys.INSTANCE.m1372getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo2, MappedKeys.INSTANCE.m1377getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo2, MappedKeys.INSTANCE.m1371getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo2, MappedKeys.INSTANCE.m1367getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo2, MappedKeys.INSTANCE.m1366getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m5249isShiftPressedZmokQxo(keyEvent)) {
                    long jM5243getKeyZmokQxo3 = KeyEvent_androidKt.m5243getKeyZmokQxo(keyEvent);
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo3, MappedKeys.INSTANCE.m1380getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_LEFT;
                    } else if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo3, MappedKeys.INSTANCE.m1379getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                    }
                } else if (KeyEvent_androidKt.m5246isAltPressedZmokQxo(keyEvent)) {
                    long jM5243getKeyZmokQxo4 = KeyEvent_androidKt.m5243getKeyZmokQxo(keyEvent);
                    if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo4, MappedKeys.INSTANCE.m1367getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo4, MappedKeys.INSTANCE.m1371getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo1334mapZmokQxo(keyEvent) : keyCommand;
            }
        };
    }
}
