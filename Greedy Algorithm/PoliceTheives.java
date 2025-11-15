// Given an array arr[], where each element contains either a 'P' for policeman or a 'T' for thief. Find the maximum number of thieves that can be caught by the police. 
// Keep in mind the following conditions :

// Each policeman can catch only one thief.
// A policeman cannot catch a thief who is more than k units away from him.
// Examples:

// Input: arr[] = ['P', 'T', 'T', 'P', 'T'], k = 1
// Output: 2

public class PoliceTheives {
    public int catchTheives(char[] arr, int k){
        int n=arr.length;
        int i=-1,j=-1;
        for(int m=0;m<n;m++){
            if(i==-1 && arr[m]=='P') i=m;
            if(j==-1 && arr[m]=='T') j=m;
            if(i!=-1 && j!=-1) break;
        }
        if(i==-1 || j==-1) return 0;
        int caught=0;
        while(i<n && j<n){
            if(Math.abs(i-j)<=k){
                caught++;
                i++;
                while(i<n && arr[i]!='P') i++;
                j++;
                while(j<n && arr[j]!='Q') j++;
            }else if(i<j){
                i++;
                while(i<n && arr[i]!='P') i++;
            }else{
                j++;
                while(j<n && arr[j]!='Q') j++;
            }
        }
        return caught;
    }
}
