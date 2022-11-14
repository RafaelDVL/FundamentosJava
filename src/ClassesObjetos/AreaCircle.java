package ClassesObjetos;

public class AreaCircle {

    double ratio;
    double pi;

    public AreaCircle(){

    }
    public AreaCircle(double radioInitial){
        pi = 3.14;
        ratio = radioInitial;
    }

    double area(){
        return ratio * Math.pow(ratio, 2);
    }
}
