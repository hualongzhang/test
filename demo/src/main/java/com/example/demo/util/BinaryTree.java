package com.example.demo.util;

import java.util.LinkedList;
import java.util.Queue;



/**
 * @author zhanghualong
 * 二叉树相关操作
 */
public class BinaryTree {

	private TreeNode root;
	
    /**
     * 构造完全二叉树 int[]array 需要一个队列保存“下一个待构造的结点
     */
    public void createBuildTree(String[] array){
        Queue<TreeNode> queue = new LinkedList<>();
        root=new TreeNode(null,array[0],null);//根节点
        TreeNode currentNode=null;
        currentNode =root;
        int count=1;//已经构造成功的
        int next=0;
        while (count < array.length){
            if (next ==2){
                currentNode=queue.poll();
                next=0;
            }
            if(currentNode.getLeft() == null && count<array.length){
                currentNode.left =new TreeNode(null,array[count++],null);
                next++;
                queue.offer(currentNode.left);
            }
            if (currentNode.getRight() ==null && count <array.length){
                currentNode.right=new TreeNode(null,array[count++],null);
                next++;
                queue.offer(currentNode.right);
            }
        }
    }
    
    //层次遍历二叉树
    public void BFSOrder(TreeNode T) {
        if(T==null) return ;
        Queue<TreeNode> queue = new LinkedList<>();
        //队列小知识：使用offer和poll优于add和remove之处在于它们返回值可以判断成功与否，而不抛出异常
        queue.offer(T);              //算法1：根结点进入队列
        while(!queue.isEmpty())      //算法2：若队列非空，循环执行步骤 3-5，否则执行步骤6
        {
            T=queue.poll();          //算法3：将一个结点出队列，并访问该结点
            System.out.print(T.element);
            if(T.left!=null)       //算法4：若该结点的左子树为非空，则将该结点的左孩子结点入队列；
                queue.offer(T.left);
            if(T.right!=null)       //算法5：若该结点的左子树为非空，则将该结点的右孩子结点入队列；
                queue.offer(T.right);
        }
    }
    
	static class TreeNode{
        TreeNode left;
        String element;
        TreeNode right;

        public TreeNode(TreeNode left,String element,TreeNode right){
            this.left=left;
            this.element=element;
            this.right=right;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public String getElement() {
            return element;
        }

        public void setElement(String element) {
            this.element = element;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }
	
	
	
	public static void main(String[] args) {
		String[] array=new String[]{"1","2","3","4","5"};
		BinaryTree btree=new BinaryTree();
		btree.createBuildTree(array);
		System.out.println("二叉标准树构造完成"+btree.root.getElement());
		System.out.println("遍历二叉树");
		btree.BFSOrder(btree.root);
	}
    
}
