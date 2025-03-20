package menuabstractfactory;

import menuabstractfactory.Restaurante;
import menuabstractfactory.fabricas.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Menú Vegetariano:");
        Restaurante menuVegetariano = new Restaurante(new MenuVegetarianoFactory());
        menuVegetariano.mostrarMenu();
        
        System.out.println("\nMenú Gourmet:");
        Restaurante menuGourmet = new Restaurante(new MenuGourmetFactory());
        menuGourmet.mostrarMenu();
        
        System.out.println("\nMenú Saludable:");
        Restaurante menuSaludable = new Restaurante(new MenuSaludableFactory());
        menuSaludable.mostrarMenu();
    }
}
