package jobsheetTree;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node(data);
        } else {
            Node current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                } else { // data is already exist
                    break;
                }
            }
        }
    }

    // add node with recursion method
    void addRecursive(Node current, int data) {
        if (isEmpty()) {
            root = new Node(data);
        } else {
            if (data < current.data) {
                if (current.left != null) {
                    addRecursive(current.left, data);
                } else {
                    current.left = new Node(data);
                }
            } else if (data > current.data) {
                if (current.right != null) {
                    addRecursive(current.right, data);
                } else {
                    current.right = new Node(data);
                }
            } else { // data is already exist
                return;
            }
        }
    }

    // display the smallest value and the largest value in the tree
    void displayMinMax() {
        if (!isEmpty()) {
            Node current = root;
            while (current.left != null) {
                current = current.left;
            }
            System.out.println("Smallest value: " + current.data);
            current = root;
            while (current.right != null) {
                current = current.right;
            }
            System.out.println("Largest value: " + current.data);
        } else {
            System.out.println("Tree is empty!");
        }
    }


    // display data in the leaf
    void displayLeaf(Node current) {
        if (current != null) {
            if (current.left == null && current.right == null) {
                System.out.print(current.data + " ");
            }
            displayLeaf(current.left);
            displayLeaf(current.right);
        }
    }

    // display the number of leaves in the tree
    int countLeaf(Node current) {
        if (current == null) {
            return 0;
        }
        if (current.left == null && current.right == null) {
            return 1;
        } else {
            return countLeaf(current.left) + countLeaf(current.right);
        }
    }

    boolean find(int data) {
        boolean hasil = false;
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                hasil = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }

    void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del) {
        Node successor = del.right;
        Node successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        // find node (current) that will be deleted
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // if node not found
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        }
        // if there is no child, simply delete it
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } // if node has 1 child (right)
        else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else {
                if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } // if node has 1 child (left)
        else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        } // if node has 2 children
        else {
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else {
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }
            successor.left = current.left;
        }
    }

}
