public class binarySearchIterative {
    
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;

        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("No se encuentra el target");
        } else {
            System.out.println("Encontrado en indice: " + result);
        }
    }
}