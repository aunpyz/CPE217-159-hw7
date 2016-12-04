/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw7;

/**
 *
 * @author patiw
 */
public class Heap {
    boolean isMinHeap; // true if minHeap, false if maxHeap
    int heapSize;
    Node[] arr;//Array as a complete binary tree
    int back;
    // For each node to be inserted into the heap, timeCounter will increase by 1
    int timeCounter;
    public Heap(boolean isMinHeap, int size){
        arr = new Node[size+1];
        heapSize = size;
        back = 1;
        this.isMinHeap = isMinHeap;
        timeCounter = 0;
    }
    public Node top(){
        return arr[1];
    }
    
    public void push(Node node){
        // time stamp
        node.timestamp = timeCounter++;
        int pFactor = back;
        arr[back++] = node;
        // Push new node at the end then sift (percolate) up

        //compare a price between its parent and itself
        //first condition is to prevent the errors
        while(pFactor > 1 && arr[pFactor].compare(arr[pFactor/2]))
        {
            //till the iterator reach to 1 or its parent's price is lesser
            swap(pFactor, pFactor/=2);
        }
    }
    public Node pop(){
        // 1. mark the root for return
        Node beReturned = arr[1];
        // 2. Replace the last node with the root
        if(back == 2)
        {
            //means that the market has 1 buyerQueue
            //must set  arr[1] to null
            arr[--back] = null;
        }
        else
        {
            arr[1] = arr[--back];
        }
        // 3. Sift (percolate) down
        int pFactor = 1;

        //prevent to execute if the heap has 1 node after popped
        while(pFactor <= back-1)
        {
            //run till the end
            int cFactor;

            //comparing its subnodes
            //the first condition is to prevent when we going down and the factor*2+1 or factor*2 is greater then back
            //it'll have either Exception or wrong comparing result
            if(pFactor*2+1 <= back-1 && arr[pFactor*2+1] != null)
            {
                //if it has right subnode; it is surely that if it has right subnode it'll have left subnode
                //from the definition of complete binary tree
                //and compare them both to see if the on has more priority, set the index as its
                cFactor = arr[pFactor*2].compare(arr[pFactor*2+1])?pFactor*2:pFactor*2+1;
            }
            else if(pFactor*2 <= back-1 && arr[pFactor*2] != null)
            {
                //comparing must be se to its left subnode if exists
                cFactor = pFactor*2;
            }
            else
                break;

            //comparing the set index with the node itself
            if(arr[cFactor].compare(arr[pFactor]))
            {
                swap(cFactor, pFactor);
                pFactor = cFactor;
            }
            else
                break;
        }
        return beReturned;
    }

    // Optional: If you do not know what this function does, you do not have to use it
    public void swap(int index1, int index2){
        Node temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Optional: If you do not know what this function does, you do not have to use it
    public void printArray(){
        System.out.print("[");
        for (int i=1; i<back; i++){
            System.out.print(arr[i].price);
            if (i<back-1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

}
