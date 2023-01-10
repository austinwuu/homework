import java.util.*;
public class treeset{
    public static void main(String[] args){
        TreeSet<Integer> tset = new TreeSet<Integer>();
        for(int i=1;i<=10;i++){
            int ramdon=(int)(Math.random()*100)+1;
            if(tset.contains(ramdon)){
                i--;
            }else{
                tset.add(ramdon);
                System.out.printf("第%d個數字是:%d", i,ramdon);
                System.out.println();
            }
        }
        System.out.printf("物件內容個數為:%d", tset.size());
        System.out.println();
        System.out.printf("物件內元素的內容:%s",tset);
        System.out.println();
        System.out.printf("第一個元素為:",tset.first());
        System.out.println();
        System.out.printf("最後一個元素為:",tset.last());
        System.out.println();
        int n = tset.size(); 
        Integer arr[] = new Integer[n];
        arr=tset.toArray(arr);
        for(int j=0;j<tset.size();j++){
            if(arr[j]<=70&&arr[j]>=30){
                System.out.println(arr[j]);
            }
        }   
    }
}