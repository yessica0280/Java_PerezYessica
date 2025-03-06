package ejercicios;

/**
 *
 * @author Uniminuto Tibu
 */
public class Ejercicios {
    public static void main(String[] args) {
        // Principio de responsabilidad única: Establece que un módulo o función debe tener una
        // sola responsabilidad.
        // Beneficios:
        // El código es más fácil de enetnder, mantener y evolucionar.
        // El código es más flexible y adaptable a cambios futuros.
        // El código es más fácil de extender y realizar pruebas unitarias.
        
        // Principio abierto/cerrado: Establece que las entidades de software deben poder extenderse, pero no modificarse.
        // Ventajas:
        // Extensibilidad: Se pueden agregar nuevos tipos de descuentos sin tocar la lógica ya existente.
        // Mantenibilidad: Se reduce el riesgo de introducir errores.
        // Reutilización: La lógica de los descuentos es indispensables de la clase que los utiliza.
        
        // Principio de sustitución Liskov: Establece que las subclases pueden reemplazar a sus
        // superclases sin alterar el funcionamiento del programa.
        //Cómo aplicarlo:
        // Si en alguna parte del código se está usando una clase, y esta clase es extendida, se debe poder
        // utilizar cualquiera de las clases hijas y que el programa siga siendo válido.
        // Cuando se extiende una clase no se debe alterar el comportamiento de la padre.
        
        // Principio de segregación de interfaces: Establece que no se debe obligar a un cliente a 
        // depender de métodos que no utiliza.
        // Beneficios:
        // Optimiza las actualizaciones y el mantenimiento de las aplicaciones.
        // Reduce el riesgo asociado con la integración de nuevas funciones.
        // Acelera los ciclos de desarrollo.
        // Hace que el código esté más enfocado.
        // Evita la carga de implementar métodos inncesarios.
        
        // Principio de inversion de dependencias: Establece que los módulo de alto nivel
        // no deben depender de los de bajo nivel.
        // Cómo funciona:
        // La abstracción es un contrato que define cómo interactúan los componentes o módulos de la aplicación.
        // La abstracción no debe depender de los detalles.
        // Los detalles deben deneonder de las abstracciones.
    }
    
}
