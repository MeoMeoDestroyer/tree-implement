public class TreeNode <T> {
public T data;
public TreeNode<T> left;  
public TreeNode<T> right;

public TreeNode (T data){
    this.data = data;
}

public TreeNode (T data, TreeNode<T> left){
    this.data = data;
    this.left = left;
}

public TreeNode (T data, TreeNode<T> right){
    this.data = data;
    this.right = right;
}
//TreeNode<Interger> myNode = new TreeNode<>(8, null, someOtherNode);
public TreeNode (T data, TreeNode<T> left, TreeNode<T> right) {
    this.data = data;
    this.right = right;
    this.left = left;
}
}

