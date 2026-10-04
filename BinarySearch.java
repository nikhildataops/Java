public class BinarySearch {
    public static int getLowerBound(int [] arr,int target){
        int s=0;
        int e=arr.length-1;
        int ans=-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>=target){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
    static int getUpperBound(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return ans;
    }
    static void main(String[] args) {
        int [] arr={10,20,30,30,30,30,30,40,50};
        int target=25;
        int ans=getUpperBound(arr,target);
        System.out.print(ans+" index ");
    }
}