public class SortingAlgos {

    static void BubbleSort(int[] arr) {
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>=arr[j+1]){
                    int swap=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=swap;
                }

            }

        }

    }

    static void SelectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minInd=i;
            for (int j = i+1; j<n ; j++) {
                if(arr[j]<arr[minInd]){
                    minInd=j;

                }

            }
            int swap=arr[minInd];
            arr[minInd]=arr[i];
            arr[i]=swap;
        }

    }
    static void InsertionSort(int[] arr) {
        int n=arr.length;
        for (int i = 1; i <n ; i++) {
            int cur=i;
            int prev=i-1;
            int curVal=arr[i];
            while( prev>=0 && curVal<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;

            }
            arr[prev+1]=curVal;

        }


    }
    static void main(String[] args) {
        int [] arr={2,4,5,0,9};
        InsertionSort(arr);

        System.out.println("Printing the elements:");
        for(int value:arr){
            System.out.print(value+" ");
        }

    }

}