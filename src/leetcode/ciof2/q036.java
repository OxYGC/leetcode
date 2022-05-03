package leetcode.ciof2;

/**
 * 二叉搜索树与双向链表
 * Description:
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向。
 * <p>
 * <p>
 * 为了让您更好地理解问题，以下面的二叉搜索树为例：
 * <p>
 * 我们希望将这个二叉搜索树转化为双向循环链表。链表中的每个节点都有一个前驱和后继指针。对于双向循环链表，第一个节点的前驱是最后一个节点，最后一个节点的后继是第一个节点。
 * <p>
 * 下图展示了上面的二叉搜索树转化成的链表。“head” 表示指向链表中有最小元素的节点。
 * <p>
 * 特别地，我们希望可以就地完成转换操作。当转化完成以后，树中节点的左指针需要指向前驱，树中节点的右指针需要指向后继。还需要返回链表中的第一个节点的指针。
 *
 * @Author: YangGC
 * DateTime: 05-03
 */
public class q036 {
    Node pre;
    Node head;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }


    void dfs(Node current) {
        if (current == null) {
            return;
        }
        dfs(current.left);
        if (pre != null) {
            pre.right = current;
        } else {
            head = current;
        }
        current.left = pre;
        pre = current;
        dfs(current.right);
    }

    private class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int x) {
            val = x;
        }

        public Node(int x, Node left, Node right) {
            val = x;
            left = left;
            right = right;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
