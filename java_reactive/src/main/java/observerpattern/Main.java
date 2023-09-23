package observerpattern;

public class Main {

    public static void main(String[] args) {
        String mensaje = "Hola, aprendiendo Observer uwu";

        MyProcessObservable miProceso = new MyProcessObservable(mensaje);

        miProceso.subscribe(mensajeRecibido -> {
            System.out.println(mensajeRecibido);
        });

        miProceso.enviarMensaje();

        otrosProcesos();
        System.out.println("Esperando que terminen procesos pendientes");
    }

    private static void otrosProcesos() {
        int a = 0;
        for (int i = 0; i < 100000; i++) {
            a += i;
        }
    }
}
