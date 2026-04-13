// class Student{

//     String name = "Nitish";
//     int roll_no = 121;
//     float CGPA = 9.9f;

//     public String toString(){

//         return "Hello, World !";
//     }
// }

class Employe{

    String eName = "employe";
    int id_no = 1234;
    double salary = 987654321;

    public String toString(){

        return "Name : " + eName + "\nid : " + id_no + "\nSalary : " + salary ;
    }

}

class Launch{

    public static void main(String[] args){
    
        var s = new Employe();
        var e =s;



        System.out.println(s);
        System.out.println(s.hashCode());
        System.out.println(s.getClass().toString());
        System.out.println(s.getClass().getName());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        var obj = s.getClass();

        System.out.println(obj.getClass());


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        e.eName = "someName";

        System.out.println(e);
        System.out.println(e.hashCode());
        System.out.println(e.getClass().toString());
        System.out.println(e.getClass().getName());





        // System.out.println(s.toString());
    }
}