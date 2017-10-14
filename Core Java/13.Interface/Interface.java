/* Interface is a class
	It is the collection of a abstract methods.
	It has no implementation, only has the signature or just the definition of method without a body.
	*/
	
	interface animal		// interface class
	{
		void travel();		// by default abstract method
		void eats();		// by default abstract method
	}
	
	interface man extends animal	// interface extends interface
	{
		void walk();
		void run();
	}
	
	class mammal implements man
	{
		public void travel()		// we should write it as public because it was by default public in interface class
		{
			System.out.println("This is travel method");
		}
		public void eats()		// we should write it as public because it was by default public in interface class
		{
			System.out.println("This is Eats method");
		}
		public void walk()		// we should write it as public because it was by default public in interface class
		{
			System.out.println("This is walk method");
		}
		public void run()		// we should write it as public because it was by default public in interface class
		{
			System.out.println("This is run method");
		}
	}
	
	class Interface
	{
		public static void main(String args[])
		{
			mammal obj=new mammal();
			obj.travel();
			obj.eats();
			obj.walk();
			obj.run();
		}
	}