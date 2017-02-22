/*clase del triangulo que hereda de figura*/
public class Triangulo extends Figura{
    private float base;
    private float altura;
    
    public Triangulo(float b, float a){
        base=b;
        altura=a;
    }
    
    public void calculaArea(){
        area=base*altura/2;
    }
    
    public String dimeInfo(){
        return "Triangulo "+super.dimeInfo();
    }
}