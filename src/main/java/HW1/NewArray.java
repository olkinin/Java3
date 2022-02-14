package HW1;

public class NewArray<T> {
    private T[] arr;

    public NewArray(T... arr) {
        this.arr = arr;
    }


    public T[] getArr() {
        return arr;
    }

    public void setArr(T... arr) {
        this.arr = arr;
    }

    public void changeElementArray(int j, int k) {
        String n = null;

        for (int i = 0; i < getArr().length; i++) {
            if (i == j) {
                n= (String)arr[i];
                arr[i] = arr[k];
            } else if (i == k) {
                arr[i] = (T) n;
            }
            System.out.println(arr[i]);
        }
    }

}
