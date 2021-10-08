import java.applet.Applet;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Traffic_light<E> extends Applet implements ActionListener, ItemListener {
	
	Label L1;
	String str1;
	Checkbox Red,Yellow,Green;
	CheckboxGroup CB;
	
	public void init() {
		setSize(500,500);
		L1 = new Label("Traffic Lights");
		L1.setBounds(10, 20, 100, 20);
		add(L1);
		CB = new CheckboxGroup();
		Red = new Checkbox("Red", CB, false);
		add(Red);
		Red.addItemListener((ItemListener) this);
		Yellow = new Checkbox("Yellow", CB, false);
		add(Yellow);
		Yellow.addItemListener((ItemListener) this);
		Green = new Checkbox("Green", CB, false);
		add(Green);
		Yellow.addItemListener((ItemListener) this);
		
	}
	public void paint(Graphics g)
	{
		g.drawRoundRect(90, 40, 60, 180, 10, 10);
		g.drawOval(100, 60, 40, 40);
		g.drawOval(100, 110, 40, 40);
		g.drawOval(100, 160, 40, 40);
		if(CB.equals("Red")) {

			g.setColor(Color.RED);
			g.fillOval(100, 60, 40, 40);
		}
	}
	

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub

		

		ArrayList<E> = new ArrayList<E>;
		
		FileReader fw1;
		BufferedReader br;
		String str;
		int a;
		if(CB.equals(Green))
		  {
			try {
				fw1 = new FileReader("file.txt");
				br = new BufferedReader(fw1);
				try {
					while((str = br.readLine()) != null ) {
						a = Integer.parseInt(str);
						if(a % 2 == 0)
						{
							System.out.println(a);
						}
						
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		else if(CB.equals(Yellow))
		  {
			try {
				fw1 = new FileReader("file.txt");
				br = new BufferedReader(fw1);
				try {
					while((str = br.readLine()) != null ) {
						a = Integer.parseInt(str);
						if(a % 2 == 1)
						{
							System.out.println(a);
						}
						
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		else
		  {
			try {
				fw1 = new FileReader("file.txt");
				br = new BufferedReader(fw1);
				try {
					while((str = br.readLine()) != null ) {
						a = Integer.parseInt(str);
						
						System.out.println(a);
						
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		
	}


}
