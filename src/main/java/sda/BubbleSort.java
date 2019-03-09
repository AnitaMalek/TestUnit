package sda;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public List<Integer> sort(List<Integer> list) {
        Integer temp;
        Integer zmiana = 1;
        while (zmiana > 0) {
            zmiana = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i+1)) {
                    temp = list.get(i+1);
                    list.set(i+1, list.get(i));
                    list.set(i,temp);
                    zmiana++;
                }
            }
        }
        return list;
    }

    public List<Integer> getPrime(int x, int y){
        List<Integer> list = new ArrayList<>();

        for(int i = x; i<=y; i++){
            if(i==1) continue;
            boolean flag = true;
            for (int j=2; j<=i-1; j++){
                if(i%j==0){
                    flag = false;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        return list;
    }
}
