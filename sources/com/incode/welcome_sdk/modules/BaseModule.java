package com.incode.welcome_sdk.modules;

import com.incode.welcome_sdk.modules.exceptions.InvalidModuleOrderException;
import com.incode.welcome_sdk.modules.exceptions.MissingModuleException;
import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10439b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10440c = 0;
    private final Modules name;

    public Modules getName() {
        int i2 = 2 % 2;
        int i3 = f10439b;
        int i4 = i3 + 71;
        f10440c = i4 % 128;
        int i5 = i4 % 2;
        Modules modules = this.name;
        int i6 = i3 + 125;
        f10440c = i6 % 128;
        int i7 = i6 % 2;
        return modules;
    }

    protected BaseModule(Modules modules) {
        this.name = modules;
    }

    public void verifyConfiguration(List<Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10440c + 29;
        f10439b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 16 / 0;
        }
    }

    protected void verifyAddAndProcessDataNotAfterApprove(List<Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10440c + 45;
        f10439b = i3 % 128;
        if (i3 % 2 != 0) {
            verifyNotAfter(list, Modules.CONFERENCE);
            verifyNotAfter(list, Modules.USER_APPROVAL);
            int i4 = f10440c + 121;
            f10439b = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        verifyNotAfter(list, Modules.CONFERENCE);
        verifyNotAfter(list, Modules.USER_APPROVAL);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        throw new com.incode.welcome_sdk.modules.exceptions.InvalidModuleOrderException(new java.lang.StringBuilder().append(getName()).append(" module can't be called together with ").append(r5).append(" module!").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r4.contains(r5) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        r1 = com.incode.welcome_sdk.modules.BaseModule.f10439b + 87;
        com.incode.welcome_sdk.modules.BaseModule.f10440c = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r4.contains(r5) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void verifyNotTogether(java.util.List<com.incode.welcome_sdk.modules.Modules> r4, com.incode.welcome_sdk.modules.Modules r5) throws com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.modules.BaseModule.f10440c
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.modules.BaseModule.f10439b = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L22
            boolean r1 = r4.contains(r5)
            r0 = 34
            int r0 = r0 / 0
            if (r1 != 0) goto L29
        L18:
            int r0 = com.incode.welcome_sdk.modules.BaseModule.f10439b
            int r1 = r0 + 87
            int r0 = r1 % 128
            com.incode.welcome_sdk.modules.BaseModule.f10440c = r0
            int r1 = r1 % r2
            return
        L22:
            boolean r0 = r4.contains(r5)
            if (r0 != 0) goto L29
            goto L18
        L29:
            com.incode.welcome_sdk.modules.exceptions.InvalidModuleOrderException r2 = new com.incode.welcome_sdk.modules.exceptions.InvalidModuleOrderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.incode.welcome_sdk.modules.Modules r0 = r3.getName()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r0 = " module can't be called together with "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r1 = r0.append(r5)
            java.lang.String r0 = " module!"
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.modules.BaseModule.verifyNotTogether(java.util.List, com.incode.welcome_sdk.modules.Modules):void");
    }

    protected void verifyNotAfter(List<Modules> list, Modules modules) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10439b + 105;
        f10440c = i3 % 128;
        int i4 = i3 % 2;
        if (list.contains(modules)) {
            int i5 = f10439b + 23;
            f10440c = i5 % 128;
            int i6 = i5 % 2;
            if (list.indexOf(modules) < list.indexOf(getName())) {
                throw new InvalidModuleOrderException(new StringBuilder().append(getName()).append(" module can't be called after ").append(modules).append(" module!").toString());
            }
        }
        int i7 = f10440c + 55;
        f10439b = i7 % 128;
        int i8 = i7 % 2;
    }

    protected void verifyIfAfter(List<Modules> list, Modules modules) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10439b + 33;
        f10440c = i3 % 128;
        if (i3 % 2 == 0) {
            if (!list.contains(modules)) {
                throw new MissingModuleException(new StringBuilder().append(getName()).append(" module can't be called if ").append(modules).append(" is not called!").toString());
            }
            if (list.indexOf(modules) > list.indexOf(getName())) {
                throw new InvalidModuleOrderException(new StringBuilder().append(getName()).append(" module can't be called before ").append(modules).append(" module!").toString());
            }
            int i4 = f10440c + 51;
            f10439b = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        list.contains(modules);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void verifyIfAfterEither(List<Modules> list, Modules modules, Modules modules2) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        if (!list.contains(modules)) {
            int i3 = f10439b + 93;
            f10440c = i3 % 128;
            int i4 = i3 % 2;
            if (!list.contains(modules2)) {
                throw new MissingModuleException(new StringBuilder().append(getName()).append(" module can't be called if ").append(modules).append(" or ").append(modules2).append(" is not called!").toString());
            }
        }
        if (list.contains(modules)) {
            int i5 = f10440c + 63;
            f10439b = i5 % 128;
            int i6 = i5 % 2;
            verifyIfAfter(list, modules);
        }
        if (list.contains(modules2)) {
            int i7 = f10439b + 73;
            f10440c = i7 % 128;
            if (i7 % 2 == 0) {
                verifyIfAfter(list, modules2);
            } else {
                verifyIfAfter(list, modules2);
                throw null;
            }
        }
    }
}
