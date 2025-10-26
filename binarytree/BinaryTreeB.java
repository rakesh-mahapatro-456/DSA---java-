import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.HashMap;

public class BinaryTreeB {
    // Node class to represent each node in the tree
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // BinaryTree class to handle tree construction and traversals
    static class BinaryTree {
        static int idx = -1;

        // Method to build the tree using preorder traversal
        public Node buildTree(int nodes[]) {
            idx++;
            if ( nodes[0] >= nodes.length || nodes[idx] == -1) { // base case for null nodes
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);  // build left subtree
            newNode.right = buildTree(nodes); // build right subtree
            return newNode;
        }
    }

    // Pre-order traversal: Root -> Left -> Right
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // In-order traversal: Left -> Root -> Right
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


    //postorder traversal
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }


    //level-order traversal
    public static void levelOrder(Node root){
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data +" ");
                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }

    }

    // height of a tree
    public static int height(Node root){
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh)+1;
    }


    //count nodes
    public static int count(Node root){
        if (root == null) {
            return 0;
        }

        int lc = count(root.left);
        int rc = count(root.right);

        return lc+rc+1;
    }


    //sum of nodes
    public static int sum(Node root){
        if (root == null) {
            return 0;
        }

        int ls = sum(root.left);
        int rs = sum(root.right);

        return ls+rs+root.data;
    }


    //diameter of tree 
    // approach 1
    public static int diam1(Node root){
        if (root == null) {
            return 0;
        }

        int ld = diam1(root.left);
        int rd = diam1(root.right);
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(Math.max(ld, rd),lh+rh+1);
    }

    //approach 2

    // static class  Info {
    //     int diam;
    //     int ht;

    //     public Info(int diam,int ht){
    //         this.diam = diam;
    //         this.ht = ht;
    //     }
    // }

    // public static Info diameter(Node root){
    //     if (root == null) {
    //         return new Info(0, 0);
    //     }
    //     Info linfo = diameter(root.left);
    //     Info rinfo = diameter(root.right);

    //     int fdiam = Math.max(Math.max(linfo.diam, rinfo.diam),linfo.ht+rinfo.ht+1);
    //     int fht = Math.max(linfo.ht, rinfo.ht)+1;

    //     return new Info(fdiam, fht);

    // }



    //subtree in another tree
    public static boolean isIdentical(Node root,Node subRoot){
        if (root == null && subRoot == null) {
            return true;
        }
        else if (root == null || subRoot == null || root.data != subRoot.data) {
            return false;
        }


        if (!isIdentical(root.left, subRoot.left)) {
            return false;
        }

        if (!isIdentical(root.right, subRoot.right)) {
            return false;
        }


        return true ;
    }


    public static boolean isSubtree(Node root,Node subRoot){
        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }


    //top view of tree 
    static class  Info {
        Node node;
        int hd;

        public Info(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        if (root == null) {
            return;
        }

        //level-order traversal
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();

        int min =0,max= 0;

        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min,curr.hd-1);
                }


                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd+1));
                    min = Math.max(max,curr.hd+1);
                }
            }
        }

        for(int i=min;i<=max;i++){
            System.err.print(map.get(i).data);
        }
    }

    public static void printKth(Node root,int k){
         //level-order 
         if (root == null) {
            return;
        }

        int l = 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        l = 1;

        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }
                else{
                    q.add(null);
                    l++;
                }
            }
            else{
                if (l == k) {
                    System.out.print(curr.data +" ");
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }

    }


    public static void klevel(Node root,int level,int k){
        if (root == null) {
            return;
        }

        if (level == k) {
            System.out.print(root.data+" ");
            return;
        }

        klevel(root.left, level+1, k);
        klevel(root.right, level+1, k);
    }


    public static boolean getPath(Node root,ArrayList<Node> path,int n){
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundL = getPath(root.left, path, n);
        boolean foundR = getPath(root.right, path, n);

        if (foundR||foundL) {
            return true;
        }

        path.remove(path.size()-1);

        return false;
    }

    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node>path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root,path1,n1);
        getPath(root,path2,n2);

        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }


        //last equal nodes --> i-1
        Node lca = path1.get(i-1);


        return lca;
    }

    public static Node lca2(Node root,int n1,int n2){
        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node righrLca = lca2(root.right, n1, n2);

        if (righrLca == null) {
            return leftLca;
        }


        if (leftLca == null) {
            return righrLca;
        }


        return root;
        
    }

    public static int getdist(Node lca,int n){
        if (lca == null) {
            return -1;
        }

        if (lca.data == n) {
            return 0;
        }

       int leftdist =  getdist(lca.left, n);
       int rightdist = getdist(lca.right, n);

       if (leftdist == -1 && rightdist == 1) {
        return -1;
       }
       else if (leftdist == -1) {
        return rightdist+1;
       }
       else{
        return leftdist+1;
       }

    }


    public static int minDist(Node root,int n1,int n2){
        Node lca = lca2(root, n1, n2);

       int dist1 =  getdist(lca,n1);
       int dist2 = getdist(lca,n2);
       
       return dist1+dist2+1;

    }


    public static int kthAncestor(Node root,int n,int k){
        if (root == null) {
            return 0;
        }

        if (root.data == n) {
            return 0;
        }


        int ls = kthAncestor(root.left, n, k);
        int rs = kthAncestor(root.right, n, k);


        if (ls == -1 && rs == -1) {
            return -1;
        }


        int max = Math.max(ls, rs);

        if (max+1 == k) {
            System.out.println(root.data);
        }

        return max+1;
    }

    public static int sumTree(Node root){
        if (root == null) {
            return 0;
        }

        int lc = sumTree(root.left);
        int rc = sum(root.right);

        int data = root.data;
       
        int newleft = root.left == null ? 0:root.left.data;
        int newright = root.right == null ? 0:root.right.data;
        root.data = newleft+lc+newright+rc;

        return data;
    }


    public static void main(String[] args) {

        Node root = new Node(1);
        root. left = new Node (2);
        root. right = new Node(3);
        root. left. left = new Node(4);
        root. left. right = new Node (5);
        root. right. left = new Node(6);
        root. right. right = new Node(7);

       


    }
    
}
