package upm.etsisi.giwt41.vv.practica1;

public class BubbleSort {

    /**
     * This method the BubbleSort method. Returns the array in increasing order.
     *
     * @param array The array to be sorted
     * @param size The count of total number of elements in array
	 *
     */

    public static <T extends Comparable<T>> void BS(T array[], int size) {
        boolean swap;

        do {
            swap = false;
            for (int count = 0; count < size - 1; count++) {
                int comp = array[count].compareTo(array[count + 1]);
                if (comp > 0) {
                    T temp = array[count];
                    array[count] = array[count + 1];
                    array[count + 1] = temp;
                    swap = true;
                }
            }
        } while (swap);
    }
}
