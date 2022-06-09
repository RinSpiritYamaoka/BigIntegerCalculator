import javax.swing.JFrame;

public class FrameClass extends JFrame{
	PanelClass panelclass;
	
	public FrameClass()
	{
		this.setTitle("big Integer Calulator");
		this.setSize(700,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		panelclass= new PanelClass();
		this.add(panelclass);
		
		
		
		this.setVisible(true);
		
	}

}
