package Classes;

public class Main {

    public static void main(String[] args) {

        Reteta a = new Reteta("c","d");
        Reteta b = new Reteta("x","y");
        //System.out.println(a);
        Lista lista_retete = new Lista();
        lista_retete.AddRecipe(a);
        lista_retete.AddRecipe(b);
        //lista_retete.AddRecipe(a);
        Reteta c = new Reteta("","e");
        //lista_retete.AddRecipe(c);
        Reteta d = new Reteta("f","");
        //lista_retete.AddRecipe(d);
        System.out.println(lista_retete);
    }
}
