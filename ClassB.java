public class ClassB  extends ClassA{
    ClassB(){
        System.out.println("Konstruktor B dijalankan ");
        var_a = "Var_a dari class B";
        var_b = "Var_a dari class B";
        var_c = "Var_a dari class B";
        var_d = "Var_a dari class B";
    }
    public static void main(String args[]){
        System.out.println("Objek A dibuat");
        ClassA aa= new ClassA();
        System.out.println("menampilkan nama variabel obyek aa");
        System.out.println(aa.var_a);
        System.out.println(aa.var_b);
        System.out.println(aa.var_c);
        System.out.println(aa.var_d);
        System.out.println("");
        
        System.out.println("Objek B dibuat");
        ClassB bb= new ClassB();
        System.out.println("menampilkan nama variabel obyek bb");
        System.out.println(bb.var_a);
        System.out.println(bb.var_b);
        System.out.println(bb.var_c);
        System.out.println(bb.var_d);
 }
}


//Praktikum_Inheritance_Piky