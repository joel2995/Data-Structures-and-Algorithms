

// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        HashSet<Integer>hh=new HashSet<>();
        ArrayList<Integer>ad=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            hh.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            hh.add(b[i]);
        }
        for(int it:hh){
            ad.add(it);
        }
        Collections.sort(ad);
        return ad;
    }
}