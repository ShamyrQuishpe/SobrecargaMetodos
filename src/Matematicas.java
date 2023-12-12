public class Matematicas {
    int valor1;
    int valor2;
    int valor3;
    int resultado;
    double decimal1;
    double decimal2;

    double resultado2;

    public Matematicas() {
    }

    public Matematicas(int valor1, int valor2, int valor3, int resultado){
        this.valor1=valor1;
        this.valor2=valor2;
        this.valor3=valor3;
        this.resultado=resultado;
    }

    public Matematicas(double decimal1, double decimal2, double resultado2){
        this.decimal1=decimal1;
        this.decimal2=decimal2;
        this.resultado2=resultado2;
    }

    public void suma(int valor1, int valor2){
        resultado=valor1+valor2;
        System.out.println("La suma de " + valor1 + " + " + valor2 + " es: " + resultado);
    }

    public void suma(int valor1, int valor2, int valor3){
        resultado=valor1+valor2+valor3+5;
        System.out.println("La suma de " + valor1 + " + " + valor2 + " + 5 es: " + resultado);

    }

    public void suma(double decimal1, double decimal2){
        resultado2=decimal1+decimal2+2;
        System.out.println("La suma de " + decimal1 + " + " + decimal2 + " + 2 es: " + resultado2);

    }




}
