package Arrays2;
public class array {
    public static void main(String[] args){
        int[][] arr={
            {1,2,3},{4,5,6},{7,8,9}};

        rowwise(arr);
    }

    public static void rowwise(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=m-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
