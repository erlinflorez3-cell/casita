package com.facetec.sdk;

import com.dynatrace.android.agent.Global;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class gq {
    private final fc B;
    private final gi Code;
    private int V;
    private List<Proxy> Z;
    private List<InetSocketAddress> I = Collections.emptyList();
    private final List<gc> F = new ArrayList();

    public static final class Code {
        private int I = 0;
        private final List<gc> V;

        Code(List<gc> list) {
            this.V = list;
        }

        public final gc B() {
            if (!I()) {
                throw new NoSuchElementException();
            }
            List<gc> list = this.V;
            int i2 = this.I;
            this.I = i2 + 1;
            return list.get(i2);
        }

        public final List<gc> Code() {
            return new ArrayList(this.V);
        }

        public final boolean I() {
            return this.I < this.V.size();
        }
    }

    public gq(fc fcVar, gi giVar) {
        List<Proxy> listCode;
        this.Z = Collections.emptyList();
        this.B = fcVar;
        this.Code = giVar;
        fp fpVarZ = fcVar.Z();
        Proxy proxyD = fcVar.D();
        if (proxyD != null) {
            listCode = Collections.singletonList(proxyD);
        } else {
            List<Proxy> listSelect = fcVar.L().select(fpVarZ.B());
            listCode = (listSelect == null || listSelect.isEmpty()) ? gg.Code(Proxy.NO_PROXY) : gg.Code(listSelect);
        }
        this.Z = listCode;
        this.V = 0;
    }

    private void I(Proxy proxy) throws IOException {
        String strD;
        int iF;
        this.I = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strD = this.B.Z().D();
            iF = this.B.Z().F();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(new StringBuilder("Proxy.address() is not an InetSocketAddress: ").append(socketAddressAddress.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            InetAddress address = inetSocketAddress.getAddress();
            strD = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
            iF = inetSocketAddress.getPort();
        }
        if (iF <= 0 || iF > 65535) {
            throw new SocketException(new StringBuilder("No route to ").append(strD).append(Global.COLON).append(iF).append("; port is out of range").toString());
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.I.add(InetSocketAddress.createUnresolved(strD, iF));
            return;
        }
        List<InetAddress> listB = this.B.Code().B(strD);
        if (listB.isEmpty()) {
            throw new UnknownHostException(new StringBuilder().append(this.B.Code()).append(" returned no addresses for ").append(strD).toString());
        }
        int size = listB.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.I.add(new InetSocketAddress(listB.get(i2), iF));
        }
    }

    private boolean V() {
        return this.V < this.Z.size();
    }

    public final boolean B() {
        return V() || !this.F.isEmpty();
    }

    public final Code I() throws IOException {
        if (!B()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (V()) {
            if (!V()) {
                throw new SocketException(new StringBuilder("No route to ").append(this.B.Z().D()).append("; exhausted proxy configurations: ").append(this.Z).toString());
            }
            List<Proxy> list = this.Z;
            int i2 = this.V;
            this.V = i2 + 1;
            Proxy proxy = list.get(i2);
            I(proxy);
            int size = this.I.size();
            for (int i3 = 0; i3 < size; i3++) {
                gc gcVar = new gc(this.B, proxy, this.I.get(i3));
                if (this.Code.Code(gcVar)) {
                    this.F.add(gcVar);
                } else {
                    arrayList.add(gcVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.F);
            this.F.clear();
        }
        return new Code(arrayList);
    }

    public final void I(gc gcVar, IOException iOException) {
        if (gcVar.I().type() != Proxy.Type.DIRECT && this.B.L() != null) {
            this.B.L().connectFailed(this.B.Z().B(), gcVar.I().address(), iOException);
        }
        this.Code.Z(gcVar);
    }
}
