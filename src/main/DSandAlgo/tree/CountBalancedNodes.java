package tree;
class Node{
    int val;
    Node[] children;
    int i;
    Node(int val){
        this.val = val;
        children = new Node[100];
        i = 0;
    }
    void addChildren(Node child){
        children[i++] = child;
    }
}
//BalancedNode: Node whose children have equal no of nodes
public class CountBalancedNodes {
    int count = 0;
    public int countNoOfNodes(Node node){
        if(node == null)
            return 0;
        int sum = 1; //Stores the no of nodes in the given node including the current node, therefore initial = 1
        int lastChildCount = 0; //For comparing the size of the child nodes
        int curCount = 1; //whether the current node is balanced or node
        for(Node child: node.children){
            int curChildCount = countNoOfNodes(child);
            if(child != node.children[0]){
                if(curChildCount != lastChildCount)
                    curCount = 0;
            } else{
                lastChildCount = curChildCount;
            }
            sum+=curChildCount;
        }
        count+=curCount;
        return sum;
    }
}
