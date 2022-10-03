
public class linkedlist {
    node head, tail;
    int size;

    public linkedlist() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void delete(int info) {
        if (head.info == info) {
            head = head.next;
            return;
        } 
        node temp = head, prev = null;
        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.info != info) {
            prev = temp;
            temp = temp.next;
        }
        // If key was not present in linked list
        if (temp == null)
            return;
 
        // Unlink the node from linked list
        prev.next = temp.next;
    }

    public void add(int n) {
        this.size++;
        node nod = new node(n);
        if (head == null) {
            head = nod;
            tail = nod;
        } else {
            node newnode = head;
            while (newnode.next != null) {
                newnode = newnode.next;
            }
            newnode.next = nod;
            if (this.tail == null) {
                tail = nod;
            }
        }

    }

    public void delrear() {
        if (!isEmpty()) {
            if (head.next == null) {
                head = null;
            } else {

                // Find the second last node
                node second_last = head;
                while (second_last.next.next != null) {

                    second_last = second_last.next;
                }

                // Change next of second last
                second_last.next = null;
            }
        }

    }

    public void delfront() {
        if (head.next == null) {
            head = null;
        } else {
            node x = head;
            x = x.next;
            head = x;
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void addfront(int n) {
        node p = new node(n);
        p.next = head;
        head = p;

    }

    public void addtail(int n) {
        this.size++;
        node node = new node(n);
        this.tail = node;

    }

    public void showtail() {
        System.out.println(tail.info);
    }

    public void showhead() {
        System.out.println(head.info);
    }

    public void display() {
        if (head != null) {

            node contoh = head;
            while (contoh.next != null) {
                System.out.println(contoh.info);
                contoh = contoh.next;
            }
            if (contoh != null) {

                System.out.println(contoh.info);
            }
        }
    }

    public node getPosition(int x) {
        node yNode = head;
        node cek = null;
        if (head == null) {
            cek = null;
        } else {
            while (yNode.next != null) {
                if (yNode.info == x) {
                    cek = yNode;
                    break;
                }
                yNode = yNode.next;
                if (yNode.info != x) {
                    cek = null;
                } else {
                    cek = yNode;
                }
            }
        }
        return cek;
    }

    public boolean found(int x) {
        node yNode = head;
        boolean cek = true;
        if (head == null) {
            cek = false;
        } else {
            while (yNode.next != null) {
                if (yNode.info == x) {
                    cek = true;
                    break;
                }
                yNode = yNode.next;
                if (yNode.info != x) {
                    cek = false;
                } else {
                    cek = true;
                }
            }
        }
        return cek;
    }
}
