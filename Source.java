class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

class Source {
    public static int sumList(Node<Integer> head) {
        int result=0;
        Node<Integer> test = head;
        while (test.next!=null)
        {
            result+=test.val;
            test=test.next;
        }
        result+=test.val;
        return result;
    }

    public static void main(String[] args) {
        Node<Integer> a = new Node<>(2);
        Node<Integer> b = new Node<>(8);
        Node<Integer> c = new Node<>(3);
        Node<Integer> d = new Node<>(-1);
        Node<Integer> e = new Node<>(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node<Integer> z = new Node<>(5);
        Node<Integer> y = new Node<>(3);
        Node<Integer> x = new Node<>(-3);
        Node<Integer> w = new Node<>(0);
        Node<Integer> v = new Node<>(8);

        z.next = y;
        y.next = x;
        x.next = w;
        w.next = v;

        // 2 -> 8 -> 3 -> -1 -> 7

        System.out.println("Sum of my list: ");
        System.out.println(Source.sumList(a));

        System.out.println("Sum of my list 2: ");
        System.out.println(Source.sumList(z));
    }
}
