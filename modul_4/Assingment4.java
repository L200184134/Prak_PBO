package assingment4;
public class Assingment4 {
    int a = 1 ;
    int b = 2 ;
    int c = 8;
    void multiply(){
        c = a * b * c ; 
        System.out.println("The result of multiplying is "+c);
        System.out.println();
    }
    
    void Add(){
        int x ;
        x = a + b + c ;
        System.out.println("The result of adding is "+x);
        System.out.println();
    }
    
    void Minus (){
        int y ;
        if (a<b && a>c){
            y = a - b - c ; 
        }
        else if (b>a && b>c){
            y = b - a - c;
        }
        else {
            y = c - b - a ;
        }
        System.out.println("THe result of reducing is "+y);
        System.out.println();
    }
    
    
    void divided (){
        float k = (float)a/c ;
        float l = (float)a/b ;
        float i = (float)b/a ;
        float r = (float)b/c ;
        float e = (float)c/a ;
        float p = (float)c/b ;
        System.out.println("The result of dividing");
        System.out.println("a/c : "+k);
        System.out.println("a/b : "+l);
        System.out.println("b/a : "+i);
        System.out.println("b/c : "+r);
        System.out.println("c/a : "+e);
        System.out.println("c/b : "+p);
        System.out.println();
    }
    void Avarage(){
       float z = (float) (a+b+c)/3;
       System.out.println("The avarage of a,b,and c is "+String.format("%.2f",z));
    }
    public static void main (String[] args){
        Assingment4 A4 = new Assingment4 ();
        A4.multiply();
        A4.Add();
        A4.Minus();
        A4.divided();
        A4.Avarage();
    }
}
    

    