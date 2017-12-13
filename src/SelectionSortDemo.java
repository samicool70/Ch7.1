public class SelectionSortDemo {
    public static void main (String []args){
        int list []={1,5,2,4,6,9,8,3,7,10};
        for (int i=0;i<(list.length-1);i++){
            for (int j=i+1;j<list.length;j++){
                if (list[i]>list[j])
                    swap (list,i,j);
            }
        }
    }
    public static void swap(int[]list,int smallestIndex,int i){
        int temp=list[smallestIndex];
        list[smallestIndex]=list[i];
        list[i]=temp;
        for(int num:list){
            System.out.println(num);
        }
        System.out.println();
    }
}
