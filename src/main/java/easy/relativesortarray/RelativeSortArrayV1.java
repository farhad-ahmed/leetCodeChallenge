package easy.relativesortarray;

import java.util.*;

public class RelativeSortArrayV1 {

    public int[] relativeSortArray(int [] arr1, int [] arr2){

        int [] solution = new int[arr1.length];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        // populating the map with number and their frequency from arr1
        for(int i=0; i<arr1.length; i++){

            if(map.containsKey(arr1[i])){
                int count = map.get(arr1[i]);
                count++;
                map.put(arr1[i], count);
            }
            else{
                map.put(arr1[i],1);
            }
        }

        int index =0;

        for(int i =0; i<arr2.length; i++){
            int frequency = map.get(arr2[i]);
            for(int j =0; j<frequency; j++){
                solution[index]=arr2[i];
                index++;
            }
            map.remove(arr2[i]);
        }

        List<Integer> restOfValues= new ArrayList<>(map.keySet());
        restOfValues.sort(Comparator.naturalOrder());

        for(int key : restOfValues){
            int frequency = map.get(key);
            for(int j=0; j<frequency; j++){
                solution[index] = key;
                index++;
            }
        }
        return solution;
    }
}
