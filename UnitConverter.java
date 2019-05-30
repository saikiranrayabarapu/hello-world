import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math.*;
class UnitConverter implements ItemListener
{
	static JFrame f;
	static JButton b1;
	static JTextArea ta;
	static JTextField tf1;
	static Choice c1;
	static Choice c2;
	static JSpinner spinner2;
	
	public static void main(String[] args)
	{
		f=new JFrame();
		UnitConverter un=new UnitConverter();
		b1=new JButton("convert");
		ta=new JTextArea(400,400);
		tf1=new JTextField();
		c1=new Choice();
		c2=new Choice();
		JPanel p1=new JPanel();
		JLabel l1=new JLabel("Amount:");
		l1.setBounds(50,50,80,40);
		JLabel l2=new JLabel("From:");
		l2.setBounds(50,100,80,40);
		JLabel l3=new JLabel("To:");
		l3.setBounds(50,150,80,40);
		b1.setBounds(50,200,80,40);
		tf1.setBounds(140,200,80,40);
		
		//choice
		c1.setBounds(140,104,150,40);
		c1.add("Meter");
		c1.add("Kilometer");
		c1.add("Centimeter");
		c1.add("Millimeter");
		c1.add("Micrometer");
		c1.add("Nanometer");
		c1.add("Mile");
		c1.add("Yard");
		c1.add("Foot");
		c1.add("Inch");
		c1.add("LightYear");
		c1.addItemListener(un);
		
		
		c2.setBounds(140,154,150,40);
		c2.add("Meter");
		c2.add("Kilometer");
		c2.add("Centimeter");
		c2.add("Millimeter");
		c2.add("Micrometer");
		c2.add("Nanometer");
		c2.add("Mile");
		c2.add("Yard");
		c2.add("Foot");
		c2.add("Inch");
		c2.add("LightYear");
		c2.addItemListener(un);
	
		
		
		SpinnerModel value2=new SpinnerNumberModel(1,0,10000,0.1);
		spinner2 =new JSpinner(value2);
		spinner2.setBounds(140,50,80,40);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
			String selection1=c1.getSelectedItem();
			String selection2=c2.getSelectedItem();
			
			//Meter to any...
			if(selection1.equals("Meter")&& selection2.equals("Centimeter"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2*100));
			}
			if(selection1.equals("Meter")&& selection2.equals("Foot"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2*3.28));
			}
			if(selection1.equals("Meter")&& selection2.equals("Inch"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2*39.37));
			}
			if(selection1.equals("Meter")&& selection2.equals("Kilometer"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2*0.001));
			}
			if(selection1.equals("Meter")&& selection2.equals("Millimeter"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2*1000));
			}
			if(selection1.equals("Meter")&& selection2.equals("Micrometer"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2*Math.pow(10,6)));
			}
			if(selection1.equals("Meter")&& selection2.equals("Nanometer"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2*Math.pow(10,9)));
			}
			if(selection1.equals("Meter")&& selection2.equals("Mile"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2/1609.344));
			}
			if(selection1.equals("Meter")&& selection2.equals("Yard"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2/1.094));
			}
			if(selection1.equals("Meter")&& selection2.equals("LightYear"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2/9.461e+15));
			}
			
			//kilometer to any...
			
			if(selection1.equals("Kilometer")&& selection2.equals("Centimeter"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2*100));
			}
		}
		});
		
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(ta);
		p1.add(c1);
		p1.add(c2);
		p1.add(b1);
		p1.add(tf1);
		p1.add(spinner2);
		
		JPanel p2=new JPanel();
		JLabel t1=new JLabel("Amount:");
		t1.setBounds(50,50,80,40);
		JLabel t2=new JLabel("From:");
		t2.setBounds(50,100,80,40);
		JLabel t3=new JLabel("To:");
		t3.setBounds(50,150,80,40);
		p2.add(t1);
		p2.add(t2);
		p2.add(t3);
		p2.add(ta);
		
		JPanel p3=new JPanel();
		JLabel a1=new JLabel("Amount:");
		a1.setBounds(50,50,80,40);
		JLabel a2=new JLabel("From:");
		a2.setBounds(50,100,80,40);
		JLabel a3=new JLabel("To:");
		a3.setBounds(50,150,80,40);
		p3.add(a1);
		p3.add(a2);
		p3.add(a3);
		p3.add(ta);
		
		JPanel p4=new JPanel();
		JLabel v1=new JLabel("Amount:");
		v1.setBounds(50,50,80,40);
		JLabel v2=new JLabel("From:");
		v2.setBounds(50,100,80,40);
		JLabel v3=new JLabel("To:");
		v3.setBounds(50,150,80,40);
		p4.add(v1);
		p4.add(v2);
		p4.add(v3);
		p4.add(ta);
		
		JPanel p5=new JPanel();
		JLabel w1=new JLabel("Amount:");
		w1.setBounds(50,50,80,40);
		JLabel w2=new JLabel("From:");
		w2.setBounds(50,100,80,40);
		JLabel w3=new JLabel("To:");
		w3.setBounds(50,150,80,40);
		p5.add(w1);
		p5.add(w2);
		p5.add(w3);
		p5.add(ta);
		
		JPanel p6=new JPanel();
		JLabel h1=new JLabel("Amount:");
		h1.setBounds(50,50,80,40);
		JLabel h2=new JLabel("From:");
		h2.setBounds(50,100,80,40);
		JLabel h3=new JLabel("To:");
		h3.setBounds(50,150,80,40);
		p6.add(h1);
		p6.add(h2);
		p6.add(h3);
		p6.add(ta);
		
		
		
		
		
		
		JTabbedPane tp=new JTabbedPane();
		tp.setBounds(50,50,400,300);
		tp.add("Length",p1);
		tp.add("Temp",p2);
		tp.add("Area",p3);
		tp.add("Volume",p4);
		tp.add("Weigth",p5);
		tp.add("Time",p6);
		f.add(tp);
		p1.setLayout(null);
		p2.setLayout(null);
		p3.setLayout(null);
		p4.setLayout(null);
		p5.setLayout(null);
		p6.setLayout(null);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String selection1=c1.getSelectedItem();
			String selection2=c2.getSelectedItem();
			if(selection1.equals("Meter")&& selection2.equals("Centimeter"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2*100));
			}
			if(selection1.equals("Meter")&& selection2.equals("Foot"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2*3.28));
			}
			if(selection1.equals("Meter")&& selection2.equals("Inch"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2*39.37));
			}
			if(selection1.equals("Meter")&& selection2.equals("Kilometer"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2*0.001));
			}
			if(selection1.equals("Meter")&& selection2.equals("Millimeter"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2*1000));
			}
			if(selection1.equals("Meter")&& selection2.equals("Micrometer"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2*Math.pow(10,6)));
			}
			if(selection1.equals("Meter")&& selection2.equals("Nanometer"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2*Math.pow(10,9)));
			}
			if(selection1.equals("Meter")&& selection2.equals("Mile"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2/1609.344));
			}
			if(selection1.equals("Meter")&& selection2.equals("Yard"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2/1.094));
			}
			if(selection1.equals("Meter")&& selection2.equals("LightYear"))
			{
				double val2=(Double)spinner2.getValue();
				tf1.setText(String.valueOf(val2/9.461e+15));
			}
	}
}