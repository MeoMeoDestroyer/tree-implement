import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Traversal {
  public static void main(String[] args) {

    TreeNode<Integer> root = new TreeNode<>(10);
    root.left = new TreeNode<>(9);
    root.left.left = new TreeNode<>(5);
    root.left.right = new TreeNode<>(2);

    root.right = new TreeNode<>(15);
    root.right.left = new TreeNode<>(-3);
    root.right.right = new TreeNode<>(5);
    root.right.right.right = new TreeNode<>(22);

    TreeNode<Integer> megaRoot = new TreeNode<Integer>(1);
    TreeNode<Integer> current = megaRoot;

    for(int i = 2; i < 100_001; i++) {
      current.right = new TreeNode<Integer>(i);
      current = current.right;
    }
    //  preorder(megaRoot);
    // preorderIterative(root);
    levelOrder(root);

      // TreeNode<String> stringRoot = new TreeNode<>("hello");
      //   stringRoot.left = new TreeNode<>("hi");
      //   stringRoot.left.left = new TreeNode<>("yay");
      //   stringRoot.left.right = new TreeNode<>("hungry");

      //   stringRoot.right = new TreeNode<>("ok",
      //               new TreeNode<>("huh"),
      //               new TreeNode<>("eat",
      //               null,
      //                   new TreeNode<>("nhom")
      //               )
      //                   );
   // preorder(root);
   //postOrder(StringRoot);
   //printGreaterThan(root,1 );
   // System.out.println(countNodes(root));
  }

  public static int countNodes(TreeNode<?> current){
    //if (current == null) return 0;
      // int leftCount = countNodes(current.left);
      // int rightCount = countNodes(current.right);
      //int totalCount = 1 + leftCount + rightCount;

    //bool?iftrue:else;
    // short 1 line
    // return current == null ? 0  : 1 + countNodes(current.left) + countNodes(current.right);
    return 1 + countNodes(current.left) + countNodes(current.right);
  }

  public static void printGreaterThan(TreeNode<Integer> current, int threshold) {
    if (current == null) return;
    if (current.data > threshold) {
      System.out.println(current.data);
      printGreaterThan(current.left, threshold);
      printGreaterThan(current.right, threshold);
    }
  }

    public static void preorderIterative(TreeNode<?> root) {
      Stack<TreeNode<?>> stack = new Stack<>();
      stack.push(root);

      while(!stack.isEmpty()) {
        TreeNode<?> current = stack.pop();
        if (current == null) continue;
        System.out.println(current.data);
        stack.push(current.right);
        stack.push(current.left);
        }
      }

    public static void levelOrder(TreeNode<?> root) {
      Queue<TreeNode<?>> queue = new LinkedList<>();
      queue.offer(root);
      while(!queue.isEmpty()) {
        TreeNode<?> current = queue.remove();
        if (current == null) continue;
        System.out.println(current.data);
        queue.offer(current.left);
        queue.offer(current.right);
      }
    }
  

  public static void preorder(TreeNode<?> current){
    if (current == null) return;
    System.out.println(current.data);

    preorder(current.left);
    preorder(current.right);
  }

  public static <E> void postOrder(TreeNode<E> current){
    if (current == null) return;
    postOrder(current.left);
    postOrder(current.right);
    E myData = current.data;
    System.out.println(current.data);
  }

  public static void inOrder(TreeNode<?> current){
    if (current == null) return;
    inOrder(current.left);
    System.out.println(current.data);
    inOrder(current.right);
  }
}
