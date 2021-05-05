package project_1package;

public class product {
	int pcode;
    String pname;
    int price;
    
	public static void main(String[] args) {
	product obj1=new product();
	obj1.pcode=1001;
	obj1.pname="BMW";
	obj1.price=2500000;
	product obj2=new product();
	obj2.pcode=2012;
	obj2.pname="Benz";
	obj2.price=2000000;
	product obj3=new product();
	obj3.pcode=3211;
	obj3.pname="Hyundai";
	obj3.price=1500000;
	if(obj1.price<=obj2.price && obj1.price<=obj3.price)
	System.out.println(obj1.pname+" is cheaper than "+obj2.pname+" and "+obj3.pname);
	else if(obj2.price<=obj1.price && obj2.price<=obj3.price)
	System.out.println(obj2.pname+" is cheaper than "+obj1.pname+" and "+obj3.pname);
	else
		System.out.println(obj3.pname+" is cheaper than "+obj1.pname+" and "+obj2.pname);
		// TODO Auto-generated method stub

	}

}
