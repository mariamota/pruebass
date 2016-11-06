public class Triangulo {
    
    double a;
	double b;
	double c;

	Triangulo(){
    }
    
    
	public void setA(double lado1){
        	a=lado1;
    	}
    
    public void setB(double lado2){
      		b=lado2;
    	}

 	public void setC(double lado3){
      		c=lado3;
    	}

   	public double getA(){
        	return a;
    	}
    
    public double getB(){
        	return b;
    	}

	public double getC(){
        	return c;
    	}

	public void areaTriangulo(){
	double s;
	double area;
		s = (a+b+c)/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("El area del triangulo es: "+ area);
	}
}


import javax.swing.JOptionPane;

public class areaTriangulo{
    
        public static void main(String[] args){
        
            double a = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado a:"));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado b:"));
            double c = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado c:"));


            Triangulo t = new Triangulo();
            t.setA(a);
            t.setB(b);
            t.setC(c);
            System.out.println("Has Introducido los siguientes datos:\n" + t.getA() + "\n" + t.getB() + "\n" + t.getC());
            t.areaTriangulo();
     }
}

