public class ej3 {
    public static class camion{
        String nombre;
        int capacidad;
        camion(String nombre, int capacidad){
            this.nombre = nombre;
            this.capacidad = capacidad;
        }
    }

    public static int binarySearch(camion[] array, int target, int left, int right){

        return -1;
    }

    public static void main(String[] args){
        camion[] array = {
            new camion("Mena", 10),
            new camion("Aceituno", 15),
            new camion("Vicente", 20),
            new camion("Dante", 30),
            new camion("Yerko", 45),
            new camion("Victor", 60)
        };
        int target = 45;

        int result = binarySearch(array, target, 0, array.length-1);

        if(result == -1){
            System.out.println("No se encuentra el target");
        }else{
            System.out.println("Target encontrado en indice: " + result);
        }
    }
}