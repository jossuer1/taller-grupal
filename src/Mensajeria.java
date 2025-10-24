public class Mensajeria {
    public void enviarMensaje(String usuario) {
        System.out.println("Mensaje enviado a " + usuario);
    }

    public void enviarMensaje(String usuario, String mensaje) {
        System.out.println("Mensaje a " + usuario + ": " + mensaje);
    }
    public void enviarMensaje(String[] usuarios) {
        for (String u : usuarios) {
            System.out.println("Mensaje enviado a " + u);
        }
    }

    public static void main(String[] args) {
        Mensajeria m = new Mensajeria();
        m.enviarMensaje("Ana");
        m.enviarMensaje("Luis", "Hola");
        m.enviarMensaje(new String[]{"Pedro", "Marta"});
    }
}
