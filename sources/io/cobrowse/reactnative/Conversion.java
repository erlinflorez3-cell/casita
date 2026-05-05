package io.cobrowse.reactnative;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import io.cobrowse.Agent;
import io.cobrowse.Session;
import io.sentry.protocol.SentryThread;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
final class Conversion {

    /* JADX INFO: renamed from: io.cobrowse.reactnative.Conversion$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$cobrowse$Session$FullDeviceState;
        static final /* synthetic */ int[] $SwitchMap$io$cobrowse$Session$RemoteControlState;

        static {
            int[] iArr = new int[Session.FullDeviceState.values().length];
            $SwitchMap$io$cobrowse$Session$FullDeviceState = iArr;
            try {
                iArr[Session.FullDeviceState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$cobrowse$Session$FullDeviceState[Session.FullDeviceState.Requested.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$cobrowse$Session$FullDeviceState[Session.FullDeviceState.Rejected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$cobrowse$Session$FullDeviceState[Session.FullDeviceState.Off.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Session.RemoteControlState.values().length];
            $SwitchMap$io$cobrowse$Session$RemoteControlState = iArr2;
            try {
                iArr2[Session.RemoteControlState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$cobrowse$Session$RemoteControlState[Session.RemoteControlState.Requested.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$cobrowse$Session$RemoteControlState[Session.RemoteControlState.Rejected.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$cobrowse$Session$RemoteControlState[Session.RemoteControlState.Off.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    Conversion() {
    }

    static WritableMap convert(Session session) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (session == null) {
            return null;
        }
        writableMapCreateMap.putString("code", session.code());
        writableMapCreateMap.putString(SentryThread.JsonKeys.STATE, session.state());
        writableMapCreateMap.putString("id", session.id());
        writableMapCreateMap.putBoolean("full_device", session.fullDevice().booleanValue());
        writableMapCreateMap.putString("full_device_state", fullDeviceState(session.fullDeviceState()));
        writableMapCreateMap.putString("remote_control", remoteControl(session.remoteControl()));
        Agent agent = session.agent();
        if (agent != null) {
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString("name", agent.name);
            writableMapCreateMap2.putString("id", agent.id);
            writableMapCreateMap.putMap("agent", writableMapCreateMap2);
        }
        return writableMapCreateMap;
    }

    static String convert(Error error) {
        if (error == null) {
            return null;
        }
        return error.getMessage();
    }

    static Session.FullDeviceState fullDeviceState(String str) {
        str.hashCode();
        switch (str) {
            case "rejected":
                return Session.FullDeviceState.Rejected;
            case "on":
                return Session.FullDeviceState.On;
            case "off":
                return Session.FullDeviceState.Off;
            case "requested":
                return Session.FullDeviceState.Requested;
            default:
                return Session.FullDeviceState.Off;
        }
    }

    static String fullDeviceState(Session.FullDeviceState fullDeviceState) {
        int i2 = AnonymousClass1.$SwitchMap$io$cobrowse$Session$FullDeviceState[fullDeviceState.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? DebugKt.DEBUG_PROPERTY_VALUE_OFF : "rejected" : "requested" : "on";
    }

    static Session.RemoteControlState remoteControl(String str) {
        str.hashCode();
        switch (str) {
            case "rejected":
                return Session.RemoteControlState.Rejected;
            case "on":
                return Session.RemoteControlState.On;
            case "off":
                return Session.RemoteControlState.Off;
            case "requested":
                return Session.RemoteControlState.Requested;
            default:
                return Session.RemoteControlState.Off;
        }
    }

    static String remoteControl(Session.RemoteControlState remoteControlState) {
        int i2 = AnonymousClass1.$SwitchMap$io$cobrowse$Session$RemoteControlState[remoteControlState.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? DebugKt.DEBUG_PROPERTY_VALUE_OFF : "rejected" : "requested" : "on";
    }
}
