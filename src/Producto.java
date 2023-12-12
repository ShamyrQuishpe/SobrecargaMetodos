import java.sql.SQLOutput;

public class Producto{
    public int precio;
    public String nomProducto;

    public int cantidad;

    public Producto() {
    }
    public Producto(int precio, String nomProducto){
        this.nomProducto=nomProducto;
        this.precio=precio;

    }

    public Producto(int precio, String nomProducto, int cantidad){
        this.nomProducto=nomProducto;
        this.precio=precio;
        this.cantidad=cantidad;

    }
    public void imprimir(){
        System.out.println("Producto: " + nomProducto);
        System.out.println("Precio: " + precio);
    }

    public void imprimir(int precio, String nomProducto, int cantidad){
            System.out.println("Producto: " + nomProducto);
            System.out.println("Precio: " + precio);
            System.out.println("Cantidad: " + cantidad);
    }
}