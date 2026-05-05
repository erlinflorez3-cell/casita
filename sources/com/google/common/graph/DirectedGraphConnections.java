package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.ElementOrder;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
final class DirectedGraphConnections<N, V> implements GraphConnections<N, V> {
    private static final Object PRED = new Object();
    private final Map<N, Object> adjacentNodeValues;

    @CheckForNull
    private final List<NodeConnection<N>> orderedNodeConnections;
    private int predecessorCount;
    private int successorCount;

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$1 */
    class AnonymousClass1 extends AbstractSet<N> {

        /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$1$1 */
        class C01981 extends AbstractIterator<N> {
            final /* synthetic */ Iterator val$nodeConnections;
            final /* synthetic */ Set val$seenNodes;

            C01981(final AnonymousClass1 this$1, final Iterator val$nodeConnections, final Set val$seenNodes) {
                val$nodeConnections = val$nodeConnections;
                val$seenNodes = val$seenNodes;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            protected N computeNext() {
                while (val$nodeConnections.hasNext()) {
                    NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                    if (val$seenNodes.add(nodeConnection.node)) {
                        return nodeConnection.node;
                    }
                }
                return endOfData();
            }
        }

        AnonymousClass1() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return DirectedGraphConnections.this.adjacentNodeValues.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<N> iterator() {
            return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.1.1
                final /* synthetic */ Iterator val$nodeConnections;
                final /* synthetic */ Set val$seenNodes;

                C01981(AnonymousClass1 this, final Iterator val$nodeConnections, final Set val$seenNodes) {
                    val$nodeConnections = val$nodeConnections;
                    val$seenNodes = val$seenNodes;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                protected N computeNext() {
                    while (val$nodeConnections.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                        if (val$seenNodes.add(nodeConnection.node)) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return DirectedGraphConnections.this.adjacentNodeValues.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$2 */
    class AnonymousClass2 extends AbstractSet<N> {

        /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$2$1 */
        class AnonymousClass1 extends AbstractIterator<N> {
            final /* synthetic */ Iterator val$entries;

            AnonymousClass1(final AnonymousClass2 this$1, final Iterator val$entries) {
                val$entries = val$entries;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            protected N computeNext() {
                while (val$entries.hasNext()) {
                    Map.Entry entry = (Map.Entry) val$entries.next();
                    if (DirectedGraphConnections.isPredecessor(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return endOfData();
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$2$2 */
        class C01992 extends AbstractIterator<N> {
            final /* synthetic */ Iterator val$nodeConnections;

            C01992(final AnonymousClass2 this$1, final Iterator val$nodeConnections) {
                val$nodeConnections = val$nodeConnections;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            protected N computeNext() {
                while (val$nodeConnections.hasNext()) {
                    NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                    if (nodeConnection instanceof NodeConnection.Pred) {
                        return nodeConnection.node;
                    }
                }
                return endOfData();
            }
        }

        AnonymousClass2() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return DirectedGraphConnections.isPredecessor(DirectedGraphConnections.this.adjacentNodeValues.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<N> iterator() {
            return DirectedGraphConnections.this.orderedNodeConnections == null ? new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.1
                final /* synthetic */ Iterator val$entries;

                AnonymousClass1(AnonymousClass2 this, final Iterator val$entries) {
                    val$entries = val$entries;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                protected N computeNext() {
                    while (val$entries.hasNext()) {
                        Map.Entry entry = (Map.Entry) val$entries.next();
                        if (DirectedGraphConnections.isPredecessor(entry.getValue())) {
                            return (N) entry.getKey();
                        }
                    }
                    return endOfData();
                }
            } : new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.2
                final /* synthetic */ Iterator val$nodeConnections;

                C01992(AnonymousClass2 this, final Iterator val$nodeConnections) {
                    val$nodeConnections = val$nodeConnections;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                protected N computeNext() {
                    while (val$nodeConnections.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                        if (nodeConnection instanceof NodeConnection.Pred) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return DirectedGraphConnections.this.predecessorCount;
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$3 */
    class AnonymousClass3 extends AbstractSet<N> {

        /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$3$1 */
        class AnonymousClass1 extends AbstractIterator<N> {
            final /* synthetic */ Iterator val$entries;

            AnonymousClass1(final AnonymousClass3 this$1, final Iterator val$entries) {
                val$entries = val$entries;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            protected N computeNext() {
                while (val$entries.hasNext()) {
                    Map.Entry entry = (Map.Entry) val$entries.next();
                    if (DirectedGraphConnections.isSuccessor(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return endOfData();
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$3$2 */
        class AnonymousClass2 extends AbstractIterator<N> {
            final /* synthetic */ Iterator val$nodeConnections;

            AnonymousClass2(final AnonymousClass3 this$1, final Iterator val$nodeConnections) {
                val$nodeConnections = val$nodeConnections;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            protected N computeNext() {
                while (val$nodeConnections.hasNext()) {
                    NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                    if (nodeConnection instanceof NodeConnection.Succ) {
                        return nodeConnection.node;
                    }
                }
                return endOfData();
            }
        }

        AnonymousClass3() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return DirectedGraphConnections.isSuccessor(DirectedGraphConnections.this.adjacentNodeValues.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<N> iterator() {
            return DirectedGraphConnections.this.orderedNodeConnections == null ? new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.1
                final /* synthetic */ Iterator val$entries;

                AnonymousClass1(AnonymousClass3 this, final Iterator val$entries) {
                    val$entries = val$entries;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                protected N computeNext() {
                    while (val$entries.hasNext()) {
                        Map.Entry entry = (Map.Entry) val$entries.next();
                        if (DirectedGraphConnections.isSuccessor(entry.getValue())) {
                            return (N) entry.getKey();
                        }
                    }
                    return endOfData();
                }
            } : new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.2
                final /* synthetic */ Iterator val$nodeConnections;

                AnonymousClass2(AnonymousClass3 this, final Iterator val$nodeConnections) {
                    val$nodeConnections = val$nodeConnections;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                protected N computeNext() {
                    while (val$nodeConnections.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                        if (nodeConnection instanceof NodeConnection.Succ) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return DirectedGraphConnections.this.successorCount;
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$4 */
    class AnonymousClass4 extends AbstractIterator<EndpointPair<N>> {
        final /* synthetic */ AtomicBoolean val$alreadySeenSelfLoop;
        final /* synthetic */ Iterator val$resultWithDoubleSelfLoop;

        AnonymousClass4(final DirectedGraphConnections this$0, final Iterator val$resultWithDoubleSelfLoop, final AtomicBoolean val$alreadySeenSelfLoop) {
            val$resultWithDoubleSelfLoop = val$resultWithDoubleSelfLoop;
            val$alreadySeenSelfLoop = val$alreadySeenSelfLoop;
        }

        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        public EndpointPair<N> computeNext() {
            while (val$resultWithDoubleSelfLoop.hasNext()) {
                EndpointPair<N> endpointPair = (EndpointPair) val$resultWithDoubleSelfLoop.next();
                if (!endpointPair.nodeU().equals(endpointPair.nodeV()) || !val$alreadySeenSelfLoop.getAndSet(true)) {
                    return endpointPair;
                }
            }
            return endOfData();
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$5 */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            $SwitchMap$com$google$common$graph$ElementOrder$Type = iArr;
            try {
                iArr[ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$graph$ElementOrder$Type[ElementOrder.Type.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static abstract class NodeConnection<N> {
        final N node;

        static final class Pred<N> extends NodeConnection<N> {
            Pred(N node) {
                super(node);
            }

            public boolean equals(@CheckForNull Object that) {
                if (that instanceof Pred) {
                    return this.node.equals(((Pred) that).node);
                }
                return false;
            }

            public int hashCode() {
                return Pred.class.hashCode() + this.node.hashCode();
            }
        }

        static final class Succ<N> extends NodeConnection<N> {
            Succ(N node) {
                super(node);
            }

            public boolean equals(@CheckForNull Object that) {
                if (that instanceof Succ) {
                    return this.node.equals(((Succ) that).node);
                }
                return false;
            }

            public int hashCode() {
                return Succ.class.hashCode() + this.node.hashCode();
            }
        }

        NodeConnection(N n2) {
            this.node = (N) Preconditions.checkNotNull(n2);
        }
    }

    private static final class PredAndSucc {
        private final Object successorValue;

        PredAndSucc(Object successorValue) {
            this.successorValue = successorValue;
        }
    }

    private DirectedGraphConnections(Map<N, Object> adjacentNodeValues, @CheckForNull List<NodeConnection<N>> orderedNodeConnections, int predecessorCount, int successorCount) {
        this.adjacentNodeValues = (Map) Preconditions.checkNotNull(adjacentNodeValues);
        this.orderedNodeConnections = orderedNodeConnections;
        this.predecessorCount = Graphs.checkNonNegative(predecessorCount);
        this.successorCount = Graphs.checkNonNegative(successorCount);
        Preconditions.checkState(predecessorCount <= adjacentNodeValues.size() && successorCount <= adjacentNodeValues.size());
    }

    public static boolean isPredecessor(@CheckForNull Object value) {
        return value == PRED || (value instanceof PredAndSucc);
    }

    public static boolean isSuccessor(@CheckForNull Object value) {
        return (value == PRED || value == null) ? false : true;
    }

    static /* synthetic */ EndpointPair lambda$incidentEdgeIterator$2(Object obj, NodeConnection nodeConnection) {
        return nodeConnection instanceof NodeConnection.Succ ? EndpointPair.ordered(obj, nodeConnection.node) : EndpointPair.ordered(nodeConnection.node, obj);
    }

    static <N, V> DirectedGraphConnections<N, V> of(ElementOrder<N> incidentEdgeOrder) {
        ArrayList arrayList;
        int i2 = AnonymousClass5.$SwitchMap$com$google$common$graph$ElementOrder$Type[incidentEdgeOrder.type().ordinal()];
        if (i2 == 1) {
            arrayList = null;
        } else {
            if (i2 != 2) {
                throw new AssertionError(incidentEdgeOrder.type());
            }
            arrayList = new ArrayList();
        }
        return new DirectedGraphConnections<>(new HashMap(4, 1.0f), arrayList, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <N, V> DirectedGraphConnections<N, V> ofImmutable(N thisNode, Iterable<EndpointPair<N>> incidentEdges, Function<N, V> successorNodeToValueFn) {
        Preconditions.checkNotNull(thisNode);
        Preconditions.checkNotNull(successorNodeToValueFn);
        HashMap map = new HashMap();
        ImmutableList.Builder builder = ImmutableList.builder();
        int i2 = 0;
        int i3 = 0;
        for (EndpointPair<N> endpointPair : incidentEdges) {
            if (endpointPair.nodeU().equals(thisNode) && endpointPair.nodeV().equals(thisNode)) {
                map.put(thisNode, new PredAndSucc(successorNodeToValueFn.apply(thisNode)));
                builder.add(new NodeConnection.Pred(thisNode));
                builder.add(new NodeConnection.Succ(thisNode));
                i2++;
            } else if (endpointPair.nodeV().equals(thisNode)) {
                N nNodeU = endpointPair.nodeU();
                Object objPut = map.put(nNodeU, PRED);
                if (objPut != null) {
                    map.put(nNodeU, new PredAndSucc(objPut));
                }
                builder.add(new NodeConnection.Pred(nNodeU));
                i2++;
            } else {
                Preconditions.checkArgument(endpointPair.nodeU().equals(thisNode));
                N nNodeV = endpointPair.nodeV();
                V vApply = successorNodeToValueFn.apply(nNodeV);
                Object objPut2 = map.put(nNodeV, vApply);
                if (objPut2 != null) {
                    Preconditions.checkArgument(objPut2 == PRED);
                    map.put(nNodeV, new PredAndSucc(vApply));
                }
                builder.add(new NodeConnection.Succ(nNodeV));
            }
            i3++;
        }
        return new DirectedGraphConnections<>(map, builder.build(), i2, i3);
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N node, V unused) {
        Map<N, Object> map = this.adjacentNodeValues;
        Object obj = PRED;
        Object objPut = map.put(node, obj);
        if (objPut != null) {
            if (objPut instanceof PredAndSucc) {
                this.adjacentNodeValues.put(node, objPut);
                return;
            } else if (objPut == obj) {
                return;
            } else {
                this.adjacentNodeValues.put(node, new PredAndSucc(objPut));
            }
        }
        int i2 = this.predecessorCount + 1;
        this.predecessorCount = i2;
        Graphs.checkPositive(i2);
        List<NodeConnection<N>> list = this.orderedNodeConnections;
        if (list != null) {
            list.add(new NodeConnection.Pred(node));
        }
    }

    @Override // com.google.common.graph.GraphConnections
    @CheckForNull
    public V addSuccessor(N n2, V v2) {
        Object objPut = this.adjacentNodeValues.put(n2, v2);
        if (objPut == null) {
            objPut = null;
        } else if (objPut instanceof PredAndSucc) {
            this.adjacentNodeValues.put(n2, new PredAndSucc(v2));
            objPut = ((PredAndSucc) objPut).successorValue;
        } else if (objPut == PRED) {
            this.adjacentNodeValues.put(n2, new PredAndSucc(v2));
            objPut = null;
        }
        if (objPut == null) {
            int i2 = this.successorCount + 1;
            this.successorCount = i2;
            Graphs.checkPositive(i2);
            List<NodeConnection<N>> list = this.orderedNodeConnections;
            if (list != null) {
                list.add(new NodeConnection.Succ(n2));
            }
        }
        if (objPut == null) {
            return null;
        }
        return (V) objPut;
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> adjacentNodes() {
        return this.orderedNodeConnections == null ? Collections.unmodifiableSet(this.adjacentNodeValues.keySet()) : new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.1

            /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$1$1 */
            class C01981 extends AbstractIterator<N> {
                final /* synthetic */ Iterator val$nodeConnections;
                final /* synthetic */ Set val$seenNodes;

                C01981(AnonymousClass1 this, final Iterator val$nodeConnections, final Set val$seenNodes) {
                    val$nodeConnections = val$nodeConnections;
                    val$seenNodes = val$seenNodes;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                protected N computeNext() {
                    while (val$nodeConnections.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                        if (val$seenNodes.add(nodeConnection.node)) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            }

            AnonymousClass1() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return DirectedGraphConnections.this.adjacentNodeValues.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<N> iterator() {
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.1.1
                    final /* synthetic */ Iterator val$nodeConnections;
                    final /* synthetic */ Set val$seenNodes;

                    C01981(AnonymousClass1 this, final Iterator val$nodeConnections, final Set val$seenNodes) {
                        val$nodeConnections = val$nodeConnections;
                        val$seenNodes = val$seenNodes;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    protected N computeNext() {
                        while (val$nodeConnections.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                            if (val$seenNodes.add(nodeConnection.node)) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.adjacentNodeValues.size();
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public Iterator<EndpointPair<N>> incidentEdgeIterator(final N thisNode) {
        Preconditions.checkNotNull(thisNode);
        List<NodeConnection<N>> list = this.orderedNodeConnections;
        return new AbstractIterator<EndpointPair<N>>(this) { // from class: com.google.common.graph.DirectedGraphConnections.4
            final /* synthetic */ AtomicBoolean val$alreadySeenSelfLoop;
            final /* synthetic */ Iterator val$resultWithDoubleSelfLoop;

            AnonymousClass4(DirectedGraphConnections this, final Iterator val$resultWithDoubleSelfLoop, final AtomicBoolean val$alreadySeenSelfLoop) {
                val$resultWithDoubleSelfLoop = val$resultWithDoubleSelfLoop;
                val$alreadySeenSelfLoop = val$alreadySeenSelfLoop;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public EndpointPair<N> computeNext() {
                while (val$resultWithDoubleSelfLoop.hasNext()) {
                    EndpointPair<N> endpointPair = (EndpointPair) val$resultWithDoubleSelfLoop.next();
                    if (!endpointPair.nodeU().equals(endpointPair.nodeV()) || !val$alreadySeenSelfLoop.getAndSet(true)) {
                        return endpointPair;
                    }
                }
                return endOfData();
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> predecessors() {
        return new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.2

            /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$2$1 */
            class AnonymousClass1 extends AbstractIterator<N> {
                final /* synthetic */ Iterator val$entries;

                AnonymousClass1(AnonymousClass2 this, final Iterator val$entries) {
                    val$entries = val$entries;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                protected N computeNext() {
                    while (val$entries.hasNext()) {
                        Map.Entry entry = (Map.Entry) val$entries.next();
                        if (DirectedGraphConnections.isPredecessor(entry.getValue())) {
                            return (N) entry.getKey();
                        }
                    }
                    return endOfData();
                }
            }

            /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$2$2 */
            class C01992 extends AbstractIterator<N> {
                final /* synthetic */ Iterator val$nodeConnections;

                C01992(AnonymousClass2 this, final Iterator val$nodeConnections) {
                    val$nodeConnections = val$nodeConnections;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                protected N computeNext() {
                    while (val$nodeConnections.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                        if (nodeConnection instanceof NodeConnection.Pred) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            }

            AnonymousClass2() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return DirectedGraphConnections.isPredecessor(DirectedGraphConnections.this.adjacentNodeValues.get(obj));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<N> iterator() {
                return DirectedGraphConnections.this.orderedNodeConnections == null ? new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.1
                    final /* synthetic */ Iterator val$entries;

                    AnonymousClass1(AnonymousClass2 this, final Iterator val$entries) {
                        val$entries = val$entries;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    protected N computeNext() {
                        while (val$entries.hasNext()) {
                            Map.Entry entry = (Map.Entry) val$entries.next();
                            if (DirectedGraphConnections.isPredecessor(entry.getValue())) {
                                return (N) entry.getKey();
                            }
                        }
                        return endOfData();
                    }
                } : new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.2
                    final /* synthetic */ Iterator val$nodeConnections;

                    C01992(AnonymousClass2 this, final Iterator val$nodeConnections) {
                        val$nodeConnections = val$nodeConnections;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    protected N computeNext() {
                        while (val$nodeConnections.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                            if (nodeConnection instanceof NodeConnection.Pred) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.predecessorCount;
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N node) {
        Preconditions.checkNotNull(node);
        Object obj = this.adjacentNodeValues.get(node);
        if (obj == PRED) {
            this.adjacentNodeValues.remove(node);
        } else if (!(obj instanceof PredAndSucc)) {
            return;
        } else {
            this.adjacentNodeValues.put(node, ((PredAndSucc) obj).successorValue);
        }
        int i2 = this.predecessorCount - 1;
        this.predecessorCount = i2;
        Graphs.checkNonNegative(i2);
        List<NodeConnection<N>> list = this.orderedNodeConnections;
        if (list != null) {
            list.remove(new NodeConnection.Pred(node));
        }
    }

    @Override // com.google.common.graph.GraphConnections
    @CheckForNull
    public V removeSuccessor(Object obj) {
        Object obj2;
        Preconditions.checkNotNull(obj);
        Object obj3 = this.adjacentNodeValues.get(obj);
        if (obj3 == null || obj3 == (obj2 = PRED)) {
            obj3 = null;
        } else if (obj3 instanceof PredAndSucc) {
            this.adjacentNodeValues.put(obj, obj2);
            obj3 = ((PredAndSucc) obj3).successorValue;
        } else {
            this.adjacentNodeValues.remove(obj);
        }
        if (obj3 != null) {
            int i2 = this.successorCount - 1;
            this.successorCount = i2;
            Graphs.checkNonNegative(i2);
            List<NodeConnection<N>> list = this.orderedNodeConnections;
            if (list != null) {
                list.remove(new NodeConnection.Succ(obj));
            }
        }
        if (obj3 == null) {
            return null;
        }
        return (V) obj3;
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> successors() {
        return new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.3

            /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$3$1 */
            class AnonymousClass1 extends AbstractIterator<N> {
                final /* synthetic */ Iterator val$entries;

                AnonymousClass1(AnonymousClass3 this, final Iterator val$entries) {
                    val$entries = val$entries;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                protected N computeNext() {
                    while (val$entries.hasNext()) {
                        Map.Entry entry = (Map.Entry) val$entries.next();
                        if (DirectedGraphConnections.isSuccessor(entry.getValue())) {
                            return (N) entry.getKey();
                        }
                    }
                    return endOfData();
                }
            }

            /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$3$2 */
            class AnonymousClass2 extends AbstractIterator<N> {
                final /* synthetic */ Iterator val$nodeConnections;

                AnonymousClass2(AnonymousClass3 this, final Iterator val$nodeConnections) {
                    val$nodeConnections = val$nodeConnections;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                protected N computeNext() {
                    while (val$nodeConnections.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                        if (nodeConnection instanceof NodeConnection.Succ) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            }

            AnonymousClass3() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return DirectedGraphConnections.isSuccessor(DirectedGraphConnections.this.adjacentNodeValues.get(obj));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<N> iterator() {
                return DirectedGraphConnections.this.orderedNodeConnections == null ? new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.1
                    final /* synthetic */ Iterator val$entries;

                    AnonymousClass1(AnonymousClass3 this, final Iterator val$entries) {
                        val$entries = val$entries;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    protected N computeNext() {
                        while (val$entries.hasNext()) {
                            Map.Entry entry = (Map.Entry) val$entries.next();
                            if (DirectedGraphConnections.isSuccessor(entry.getValue())) {
                                return (N) entry.getKey();
                            }
                        }
                        return endOfData();
                    }
                } : new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.2
                    final /* synthetic */ Iterator val$nodeConnections;

                    AnonymousClass2(AnonymousClass3 this, final Iterator val$nodeConnections) {
                        val$nodeConnections = val$nodeConnections;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    protected N computeNext() {
                        while (val$nodeConnections.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                            if (nodeConnection instanceof NodeConnection.Succ) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.successorCount;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.GraphConnections
    @CheckForNull
    public V value(N n2) {
        Preconditions.checkNotNull(n2);
        V v2 = (V) this.adjacentNodeValues.get(n2);
        if (v2 == PRED) {
            return null;
        }
        return v2 instanceof PredAndSucc ? (V) ((PredAndSucc) v2).successorValue : v2;
    }
}
