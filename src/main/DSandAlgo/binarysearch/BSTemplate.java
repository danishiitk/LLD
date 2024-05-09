package binarysearch;
//https://leetcode.com/problems/binary-search/solutions/423162/Binary-Search-101-The-Ultimate-Binary-Search-Handbook/
//My rule of thumb when it comes to binary search:
//1 - Include ALL possible answers when initialize lo & hi
//2 - Don't overflow the mid-calculation
//3 - Shrink boundary using a logic that will exclude mid
//4 - Avoid infinite loop by picking the correct mid and shrinking logic
//5 - Always think of the case when there are 2 elements left (in l-r range)
//We have to keep in mind that, the choice of mid and our shrinking logic has
// to work together in a way that every time, at least 1 element is excluded.
public class BSTemplate {
    public int search(int target, int[] arr){
        int l = 0; //Rule-1
        int r = arr.length-1; //Rule-1
        while(l<r){
            int mid = l+(r-l)/2;      //Rule-2, Rule-4, Rule-5, current mid(l+(r-l)/2 is left mid
            if(target>arr[mid])       //Rule-3, Rule-4
                l = mid+1;            //mid is excluded
            else
                r = mid;              //Rule-5
        }
        return arr[l] == target? l:-1;
    }
}
