import java.awt.EventQueue;


public class Menu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Pila pila=new Pila();
       PilaDos pd=new PilaDos();
       PilaTres pt=new PilaTres();
       TorreHanoi th=new TorreHanoi(null);
		
       pila.push(th.Opciones);
       pila.push(2);
       pila.push(3);
       pila.push(4);
       pila.push(5);
       pila.push(6);
       pila.pop();
       
       pd.push(pila.pop());
   
       pt.push(pd.pop());

	
       System.out.println(" "); 
       System.out.println(" "); 
       
       while(pt.empty()==false){ 
    	   System.out.println(pt.pop()); 
    	   }
       
       
   	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				TorreHanoi frame = new TorreHanoi(null);
				frame.setVisible(true);
				}
			catch (Exception e) {
				e.printStackTrace();
				}
			}
		});
	}

}
