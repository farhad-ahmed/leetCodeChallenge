package easy.relativesortarray;

public class TestRelativeSortArray {

    public static void main(String[] args) {

        RelativeSortArrayV1 relativeSortArrayV1 = new RelativeSortArrayV1();
        int[]arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[]arr2 = {2,1,4,3,9,6};
        relativeSortArrayV1.relativeSortArray(arr1,arr2);
    }
}
