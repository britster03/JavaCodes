class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //first we sort the arrays
        Arrays.sort(g);
        Arrays.sort(s);
        //we assign pointers to each array
        int i=0;
        int j=0;
        //we traverse through each array until its end
        while(i<g.length && j<s.length){
            //if we satisfy the greed of the particular child then we give cookie to it 
            //suppose here we have g=[1,2,3] , s=[1,1]
            //So here i=1 & j=1, it satisfies greed so we give it to him and move on
            //next i=2 but j=1, this does not satisfy greed so we will just increment 
            if(g[i]<=s[j]){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i;
    }
}