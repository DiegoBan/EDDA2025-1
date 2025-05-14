public class binarySearchRecursive {

    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binarySearch(array, target, left, mid - 1);
        } else {
            return binarySearch(array, target, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 7;

        int result = binarySearch(array, target, 0, array.length - 1);

        if (result != -1) {
            System.out.println("Encontrado en el indice: " + result);
        } else {
            System.out.println("No se encuentra el target");
        }
    }
}