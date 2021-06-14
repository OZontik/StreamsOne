package zozo.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> inputList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List <Integer> resultList = new ArrayList<>();

        for(int number : inputList ){
            if( number % 2 ==0 && number > 0){
                resultList.add(number);
            }

        }
        for (int y = 0; y < resultList.size() -1; y++ ){
            for (int i = 0; i < resultList.size()-1 - y; i++){
                if(resultList.get(i) > resultList.get(i + 1)){
                    int x = resultList.get(i);
                    resultList.set(i, resultList.get(i + 1));
                    resultList.set(i + 1, x);

                }
            }
        }


        System.out.println(resultList);
    }
}
