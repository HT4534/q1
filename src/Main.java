// java da quick sort uygulaması ayrıntılar  c uygulamasında anlatıldı  burada sadece hatalar ve farklı olan yerler
// not olarak yazıldı

public class Main {
    public static void main(String[] args) {
     QuickSort f1 =new QuickSort();
     int[] arr={5,3,4,6,8,1,2,9,7};
     f1.quickSort(arr,0,arr.length-1);
     f1.printArr(arr);
    }
}