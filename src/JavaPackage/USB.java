package JavaPackage;

public class USB {
	
	public void connectdevice(Object obj)
	{
		if(obj instanceof Mouse)// instanceof operator is used when one reference variable is pointing two different objects
		{
			Mouse ref1=(Mouse) obj;
			ref1.click();
			ref1.scroll();
		}
		else 
		{
			Pendrive ref2=(Pendrive) obj;
			ref2.read();
			ref2.write();
		}
	}

	public static void main(String[] args) 
	{
		Object obj1=new Mouse();
		USB usb=new USB();
		usb.connectdevice(obj1);
		Object obj2=new Pendrive();
		usb.connectdevice(obj2);

	}

}
