public class QuickSort {
    public int Partition(int[] arr,int low,int high){
        int pivot= arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i]; //swap : pivottan kucuk sayi i. indis ile yer değiştirdi
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp2=arr[i+1];  // swap : döngüden sonra pivotu i+1. indisteki sayı ile yer değitirildi
        arr[i+1]=arr[high];  //!! bu ifadeleri for döngüsünün içinde unutunca sıralama yanlış yapıldı..
        arr[high]=temp2;

        return (i+1);
    }

    public void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pi=Partition(arr,low,high);
            System.out.println(pi);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public void printArr(int[] arr){
        for(int i=0;i<arr.length;i++) System.out.print(arr[i] + " ");
    }
}
