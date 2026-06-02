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


        TreeNode<String> stringRoot = new TreeNode<>("hello");
    stringRoot.left = new TreeNode<>("hi");
    stringRoot.left.left = new TreeNode<>("yay");
    stringRoot.left.right = new TreeNode<>("hungry");

stringRoot.right = new TreeNode<>("ok",
                       new TreeNode<>("huh"),
                       new TreeNode<>("eat",
                       null,
                           new TreeNode<>("nhom")
                       )
                          );
   // preorder(root);
   //postOrder(StringRoot);
   //printGreaterThan(root,1 );
   System.out.println(countNodes(root));
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
