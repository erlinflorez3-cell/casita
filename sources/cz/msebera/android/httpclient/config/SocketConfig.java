package cz.msebera.android.httpclient.config;

import cz.msebera.android.httpclient.util.Args;

/* JADX INFO: loaded from: classes5.dex */
public class SocketConfig implements Cloneable {
    public static final SocketConfig DEFAULT = new Builder().build();
    private final int backlogSize;
    private final int rcvBufSize;
    private final int sndBufSize;
    private final boolean soKeepAlive;
    private final int soLinger;
    private final boolean soReuseAddress;
    private final int soTimeout;
    private final boolean tcpNoDelay;

    public static class Builder {
        private int backlogSize;
        private int rcvBufSize;
        private int sndBufSize;
        private boolean soKeepAlive;
        private boolean soReuseAddress;
        private int soTimeout;
        private int soLinger = -1;
        private boolean tcpNoDelay = true;

        Builder() {
        }

        public SocketConfig build() {
            return new SocketConfig(this.soTimeout, this.soReuseAddress, this.soLinger, this.soKeepAlive, this.tcpNoDelay, this.sndBufSize, this.rcvBufSize, this.backlogSize);
        }

        public Builder setBacklogSize(int i2) {
            this.backlogSize = i2;
            return this;
        }

        public Builder setRcvBufSize(int i2) {
            this.rcvBufSize = i2;
            return this;
        }

        public Builder setSndBufSize(int i2) {
            this.sndBufSize = i2;
            return this;
        }

        public Builder setSoKeepAlive(boolean z2) {
            this.soKeepAlive = z2;
            return this;
        }

        public Builder setSoLinger(int i2) {
            this.soLinger = i2;
            return this;
        }

        public Builder setSoReuseAddress(boolean z2) {
            this.soReuseAddress = z2;
            return this;
        }

        public Builder setSoTimeout(int i2) {
            this.soTimeout = i2;
            return this;
        }

        public Builder setTcpNoDelay(boolean z2) {
            this.tcpNoDelay = z2;
            return this;
        }
    }

    SocketConfig(int i2, boolean z2, int i3, boolean z3, boolean z4, int i4, int i5, int i6) {
        this.soTimeout = i2;
        this.soReuseAddress = z2;
        this.soLinger = i3;
        this.soKeepAlive = z3;
        this.tcpNoDelay = z4;
        this.sndBufSize = i4;
        this.rcvBufSize = i5;
        this.backlogSize = i6;
    }

    public static Builder copy(SocketConfig socketConfig) {
        Args.notNull(socketConfig, "Socket config");
        return new Builder().setSoTimeout(socketConfig.getSoTimeout()).setSoReuseAddress(socketConfig.isSoReuseAddress()).setSoLinger(socketConfig.getSoLinger()).setSoKeepAlive(socketConfig.isSoKeepAlive()).setTcpNoDelay(socketConfig.isTcpNoDelay()).setSndBufSize(socketConfig.getSndBufSize()).setRcvBufSize(socketConfig.getRcvBufSize()).setBacklogSize(socketConfig.getBacklogSize());
    }

    public static Builder custom() {
        return new Builder();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SocketConfig m8782clone() throws CloneNotSupportedException {
        return (SocketConfig) super.clone();
    }

    public int getBacklogSize() {
        return this.backlogSize;
    }

    public int getRcvBufSize() {
        return this.rcvBufSize;
    }

    public int getSndBufSize() {
        return this.sndBufSize;
    }

    public int getSoLinger() {
        return this.soLinger;
    }

    public int getSoTimeout() {
        return this.soTimeout;
    }

    public boolean isSoKeepAlive() {
        return this.soKeepAlive;
    }

    public boolean isSoReuseAddress() {
        return this.soReuseAddress;
    }

    public boolean isTcpNoDelay() {
        return this.tcpNoDelay;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[soTimeout=");
        sb.append(this.soTimeout).append(", soReuseAddress=").append(this.soReuseAddress).append(", soLinger=").append(this.soLinger).append(", soKeepAlive=").append(this.soKeepAlive).append(", tcpNoDelay=").append(this.tcpNoDelay).append(", sndBufSize=").append(this.sndBufSize).append(", rcvBufSize=").append(this.rcvBufSize).append(", backlogSize=").append(this.backlogSize).append("]");
        return sb.toString();
    }
}
