class Node
	{
		int val;
		Node left;
		Node right;
		public Node(int val)
			{
				this.val=val;
			}
	}
class BinarySearchTree
	{
		Node root;
		public void insert(int val)
			{
				Node newnode = new Node(val);
				if(root == null)
				{
					root=newnode;
				}
				else
				{
					Node temp = root;
					while(true)
						{
							if(temp.val > val)
								{
									if(temp.left == null)
										{
											temp.left=newnode;
											break;
										}
									temp = temp.left;
								}
							else 
								{
									if(temp.val < val)
										{
											if (temp.right == null)
												{
													temp.right=newnode;
													break;
												}
											temp = temp.right;
										}
									else
										{
											break;
										}
								}
						}
				}
			}
	}
class TreeDataStructure
	{
		public static void main(String args[])
			{
				BinarySearchTree bst = new BinarySearchTree();
				bst.insert(250);
				bst.insert(1000);
				bst.insert(50);
				bst.insert(1032);
				bst.insert()
				System.out.println(bst.root.right.val);
			}
	}
