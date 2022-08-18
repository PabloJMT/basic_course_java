public class actualizacion_variables {
    public static void main(String[] args) {
        int salary = 1000; 

        //bono $200
        salary += 200;  // Asignacion con el metodo +=, ahorra lineas de codigo 
        System.out.println(salary);

        // pension: $50 descuento
        salary = salary - 50; 
        System.out.println(salary);

        //2 horas extra $30 c/u
        //comida: $45
        salary = salary + (30*2) - 45; 
        System.out.println(salary);

        // Actualizando cadenas de texto
        String employeeName = "JUAN PABLO"; 
        employeeName  = employeeName + " MEJIA TORRES"; 
        System.out.println("Mi nombre completo es: " + employeeName);


        
    }
}

// Metodos de estructura 

// +=   a+=b;

// -=   a-=b; 

// *=   a*=b; 

// /=   a/=b; 

// %=   a%=b; 

